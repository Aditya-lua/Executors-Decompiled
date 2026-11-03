package ek;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;
import rg.q0;
import rg.t0;

/* JADX INFO: loaded from: classes2.dex */
public class i {
    public static void a(Context context, String str) {
        if (context == null) {
            return;
        }
        t0.x("", str);
        Intent intent = new Intent("android.intent.action.SENDTO");
        intent.setData(Uri.parse(str));
        if (t.a(context, intent)) {
            context.startActivity(intent);
        } else {
            Toast.makeText(context, q0.T, 0).show();
        }
    }

    public static void b(Context context) {
        a(context, "mailto:info@roblox.com");
    }
}
