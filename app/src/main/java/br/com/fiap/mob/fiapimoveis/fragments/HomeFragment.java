package br.com.fiap.mob.fiapimoveis.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import br.com.fiap.mob.fiapimoveis.R;

/**
 * Created by Mauricio on 12/09/2015.
 */
public class HomeFragment  extends Fragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.home_fragment,container,false);


        TabLayout tabLayout = (TabLayout) v.findViewById(R.id.tab_layout);
        ViewPager viewPager = (ViewPager) v.findViewById(R.id.pager);

       // getActivity().setSupportActionBar(toolbar);

        viewPager.setAdapter(new SectionPagerAdapter(getActivity().getSupportFragmentManager()));
        tabLayout.setupWithViewPager(viewPager);

        return v;

    }

    public class SectionPagerAdapter extends FragmentPagerAdapter {

        public SectionPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    return new ListaImoveisFragment();
                case 1:
                default:
                  return new MapaFragment();
            }
        }

        @Override
        public int getCount() {
            return 2;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "Lista Imoveis";
                case 1:
                default:
                    return "Mapa Imoveis";
            }
        }
    }

}
