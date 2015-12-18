package chub.mangorider;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by chub on 12/18/2015.
 */
public class HistoryFragment extends Fragment
{

	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle b)
	{
		View v = inflater.inflate(R.layout.history_fragment, parent, false);
		return v;
	}

	public static HistoryFragment newInstance()
	{
		//Bundle args = new Bundle();
		//args.putSerializable();
		HistoryFragment fragment = new HistoryFragment();
		//fragment.setArguments(args);
		return fragment;
	}
}
