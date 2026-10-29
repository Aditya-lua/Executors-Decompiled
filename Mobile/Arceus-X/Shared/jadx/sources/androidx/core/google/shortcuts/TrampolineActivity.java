package androidx.core.google.shortcuts;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import p349p2.C10153a;
import pe.C10235p;
import pe.InterfaceC10242w;

/* JADX INFO: loaded from: classes.dex */
public class TrampolineActivity extends Activity {

    /* JADX INFO: renamed from: a */
    public static volatile C10235p f2279a;

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (f2279a == null) {
            f2279a = C10153a.m39093c(this);
        }
        if (f2279a != null) {
            Intent intent = getIntent();
            String stringExtra = intent.getStringExtra("shortcutUrl");
            String stringExtra2 = intent.getStringExtra("shortcutTag");
            if (stringExtra != null && stringExtra2 != null) {
                try {
                    ((InterfaceC10242w) f2279a.m39368p(InterfaceC10242w.class)).mo22722a(Base64.decode(stringExtra2, 0), stringExtra.getBytes(Charset.forName("UTF-8")));
                    startActivity(Intent.parseUri(stringExtra, 1));
                } catch (URISyntaxException | GeneralSecurityException e10) {
                    Log.w("TrampolineActivity", "failed to open shortcut url", e10);
                }
            }
        }
        finish();
    }
}
