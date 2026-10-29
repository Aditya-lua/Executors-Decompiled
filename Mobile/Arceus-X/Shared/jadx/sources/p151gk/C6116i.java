package p151gk;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;
import sg.C11347q0;
import sg.C11356t0;

/* JADX INFO: renamed from: gk.i */
/* JADX INFO: loaded from: classes2.dex */
public class C6116i {
    /* JADX INFO: renamed from: a */
    public static void m27037a(Context context, String str) {
        if (context == null) {
            return;
        }
        C11356t0.m42554x("", str);
        Intent intent = new Intent("android.intent.action.SENDTO");
        intent.setData(Uri.parse(str));
        if (C6127t.m27085a(context, intent)) {
            context.startActivity(intent);
        } else {
            Toast.makeText(context, C11347q0.f39939T, 0).show();
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m27038b(Context context) {
        m27037a(context, "mailto:info@roblox.com");
    }
}
