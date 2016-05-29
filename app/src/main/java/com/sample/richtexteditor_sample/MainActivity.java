package com.sample.richtexteditor_sample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.fiberlink.maas360.android.richtexteditor.RichEditText;
import com.fiberlink.maas360.android.richtexteditor.RichTextActions;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RichEditText richEditText = (RichEditText) findViewById(R.id.rich_edit_text);
        RichTextActions richTextActions = (RichTextActions) findViewById(R.id.rich_text_actions);

        richEditText.setRichTextActionsView(richTextActions);
        richEditText.setPreviewText(getString(R.string.color_picker_text_preview));
        richEditText.setHint(getString(R.string.hint));
    }
}
