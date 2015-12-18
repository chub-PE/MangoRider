package chub.mangorider;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class SplashScreenActivity extends Activity
{

	@Override
	protected void onCreate(Bundle b)
	{
		super.onCreate(b);
		setContentView(R.layout.splash_screen_view);

		Thread timerThread = new Thread()
		{
			public void run()
			{
				try
				{
					sleep(3000);
				}
				catch (InterruptedException e)
				{
					e.printStackTrace();
				}
				finally
				{
					Intent intent = new Intent(SplashScreenActivity.this, MainActivity.class);
					startActivity(intent);
				}
			}
		};
		timerThread.start();
	}

	@Override
	protected void onPause()
	{
		super.onPause();
		finish();
	}
}