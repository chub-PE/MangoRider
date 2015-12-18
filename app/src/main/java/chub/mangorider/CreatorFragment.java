package chub.mangorider;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by chub on 12/18/2015.
 */
public class CreatorFragment extends Fragment
{

	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle b)
	{
		View v = inflater.inflate(R.layout.creator_fragment, parent, false);
		return v;
	}


	public static CreatorFragment newInstance()
	{
		//Bundle args = new Bundle();
		//args.putSerializable();
		CreatorFragment fragment = new CreatorFragment();
		//fragment.setArguments(args);
		return fragment;
	}
}
