package com.grouprx.ui;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.webkit.WebView.FindListener;
import android.widget.Button;

import com.grouprx.util.MyFragment;
import com.nationaldrugcard.fluffygrouprx.R;

public class PetFundrasingFragment extends MyFragment {
	
	private Button visitFluffyButton;
	
	@SuppressLint("InflateParams")
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_petfundraising, null);
		
		isMainLevel = false;
		
		visitFluffyButton = (Button) view.findViewById(R.id.visitFluffyButton);
				visitFluffyButton.setOnClickListener(new OnClickListener() {
					
					@Override
					public void onClick(View arg0) {
						String url = "http://www.grouprxapp.com/fluffyrxapp";
						Intent i = new Intent(Intent.ACTION_VIEW);
						i.setData(Uri.parse(url));
						startActivity(i);
						
					}
				});
		
		return view;
	}

	@Override
	public int getTitle() {
		// TODO Auto-generated method stub
		return R.string.pet_fundraising_platform;
	}

}
