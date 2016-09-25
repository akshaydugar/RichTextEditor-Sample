package com.sample.richtexteditor_sample;

import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

import com.fiberlink.maas360.android.richtexteditor.RichEditText;
import com.fiberlink.maas360.android.richtexteditor.RichTextActions;

public class MainActivity extends AppCompatActivity
{
    RichEditText mRichEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRichEditText = (RichEditText) findViewById(R.id.rich_edit_text);
        RichTextActions richTextActions = (RichTextActions) findViewById(R.id.rich_text_actions);

        mRichEditText.setRichTextActionsView(richTextActions);
        mRichEditText.setPreviewText(getString(R.string.color_picker_text_preview));
        mRichEditText.setHint(getString(R.string.hint));

        if (savedInstanceState != null) {
            mRichEditText.restoreState(savedInstanceState);
        }

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            if (0 != (getApplication().getApplicationInfo().flags &= ApplicationInfo.FLAG_DEBUGGABLE)) {
                WebView.setWebContentsDebuggingEnabled(true);
            }
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState)
    {
        if (mRichEditText != null) {
            mRichEditText.saveState(outState);
        }
    }
}
