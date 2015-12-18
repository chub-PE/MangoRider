package chub.mangorider;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.UUID;

/**
 * Created by chub on 12/18/2015.
 */
public class ManagerFragment extends Fragment
{

	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle b)
	{
		View v = inflater.inflate(R.layout.manager_fragment, parent, false);
		return v;
	}

	public static ManagerFragment newInstance()
	{
		//Bundle args = new Bundle();
		//args.putSerializable();
		ManagerFragment fragment = new ManagerFragment();
		//fragment.setArguments(args);
		return fragment;
	}
}
