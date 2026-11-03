package androidx.core.google.shortcuts;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import p2.a;
import pe.p;
import pe.w;

/* JADX INFO: loaded from: classes.dex */
public class TrampolineActivity extends Activity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile p f1600a;

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (f1600a == null) {
            f1600a = a.c(this);
        }
        if (f1600a != null) {
            Intent intent = getIntent();
            String stringExtra = intent.getStringExtra("shortcutUrl");
            String stringExtra2 = intent.getStringExtra("shortcutTag");
            if (stringExtra != null && stringExtra2 != null) {
                try {
                    ((w) f1600a.p(w.class)).a(Base64.decode(stringExtra2, 0), stringExtra.getBytes(Charset.forName("UTF-8")));
                    startActivity(Intent.parseUri(stringExtra, 1));
                } catch (URISyntaxException | GeneralSecurityException e10) {
                    Log.w("TrampolineActivity", "failed to open shortcut url", e10);
                }
            }
        }
        finish();
    }
}
