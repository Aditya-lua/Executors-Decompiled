package androidx.core.google.shortcuts;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import oe.p;
import oe.w;
import p2.a;

/* JADX INFO: loaded from: classes.dex */
public class TrampolineActivity extends Activity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile p f1755a;

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (f1755a == null) {
            f1755a = a.c(this);
        }
        if (f1755a != null) {
            Intent intent = getIntent();
            String stringExtra = intent.getStringExtra("shortcutUrl");
            String stringExtra2 = intent.getStringExtra("shortcutTag");
            if (stringExtra != null && stringExtra2 != null) {
                try {
                    ((w) f1755a.p(w.class)).a(Base64.decode(stringExtra2, 0), stringExtra.getBytes(Charset.forName("UTF-8")));
                    startActivity(Intent.parseUri(stringExtra, 1));
                } catch (URISyntaxException | GeneralSecurityException e10) {
                    Log.w("TrampolineActivity", "failed to open shortcut url", e10);
                }
            }
        }
        finish();
    }
}
