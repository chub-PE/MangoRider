package chub.mangorider;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;

/**
 * Created by chub on 12/18/2015.
 */
public class ContentPager extends FragmentActivity
{

	private ViewPager _viewPager;

	@Override
	public void onCreate(Bundle b)
	{
		super.onCreate(b);
		_viewPager = (ViewPager) findViewById(R.id.pager);
		setContentView(_viewPager);

		FragmentManager fm = getSupportFragmentManager();
		_viewPager.setAdapter(new FragmentPagerAdapter(fm)
		{
			@Override
			public int getCount()
			{
				return 2;
			}

			@Override
			public Fragment getItem(int pos)
			{
				switch (pos)
				{
					case 0 : return HistoryFragment.newInstance();
					case 1 : return ManagerFragment.newInstance();
					case 2 : return CreatorFragment.newInstance();
					default : throw new RuntimeException("what the hell man");
				}
			}
		});

	}



}
