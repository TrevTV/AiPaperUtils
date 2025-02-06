package app.trev.settings

import android.os.Bundle
import android.app.Activity

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val intent = packageManager.getLaunchIntentForPackage("com.android.settings");
        startActivity(intent);

        finish();
    }
}