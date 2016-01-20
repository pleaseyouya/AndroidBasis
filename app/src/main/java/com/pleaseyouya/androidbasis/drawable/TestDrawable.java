package com.pleaseyouya.androidbasis.drawable;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.pleaseyouya.androidbasis.R;

/**
 * Created by wangjinfa on 2016/1/20.
 */
public class TestDrawable extends AppCompatActivity implements View.OnClickListener {
    private BadgedFourThreeImageView badgedImageViewDog;
    private BadgedSquareImageView badgedImageViewPersonVideo;
    private BadgedSquareImageView badgedImageViewPersonGif;
    private BadgedImageView badgedImageViewPersonFullWidth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_drawable);
        badgedImageViewDog = (BadgedFourThreeImageView) findViewById(R.id.badge_dog);
        badgedImageViewPersonVideo = (BadgedSquareImageView) findViewById(R.id.badge_person_video);
        badgedImageViewPersonGif = (BadgedSquareImageView) findViewById(R.id.badge_person_gif);
        badgedImageViewPersonFullWidth = (BadgedImageView) findViewById(R.id.badge_person_full_width);

        badgedImageViewDog.showBadge(true);
        badgedImageViewDog.setBadgeText(getString(R.string.lab_gif));

        badgedImageViewPersonVideo.showBadge(true);

        badgedImageViewPersonGif.showBadge(true);
        badgedImageViewPersonGif.setBadgeText("JPG");
        badgedImageViewPersonGif.setBadgeColor(getResources().getColor(R.color.gray_50));
        badgedImageViewPersonGif.setOnClickListener(this);

        badgedImageViewPersonFullWidth.showBadge(true);
    }

    @Override
    public void onClick(View v) {
        if (badgedImageViewPersonGif.isBadgeVisible()) {
            badgedImageViewPersonGif.showBadge(false);
        } else {
            badgedImageViewPersonGif.showBadge(true);
        }
    }

}
