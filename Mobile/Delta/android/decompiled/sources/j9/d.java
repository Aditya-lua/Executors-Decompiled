package j9;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.roblox.client.personasdk.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f21184a = h.f21189a;
    public static final d b = new d();

    @NonNull
    public static d f() {
        return b;
    }

    public int a(@NonNull Context context) {
        return h.b(context);
    }

    public Intent b(Context context, int i10, String str) {
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3) {
                return null;
            }
            Uri uriFromParts = Uri.fromParts("package", "com.google.android.gms", null);
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(uriFromParts);
            return intent;
        }
        if (context != null && u9.i.d(context)) {
            Intent intent2 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            intent2.setPackage("com.google.android.wearable.app");
            return intent2;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("gcore_");
        sb2.append(f21184a);
        sb2.append("-");
        if (!TextUtils.isEmpty(str)) {
            sb2.append(str);
        }
        sb2.append("-");
        if (context != null) {
            sb2.append(context.getPackageName());
        }
        sb2.append("-");
        if (context != null) {
            try {
                sb2.append(w9.c.a(context).e(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        String string = sb2.toString();
        Intent intent3 = new Intent("android.intent.action.VIEW");
        Uri.Builder builderAppendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.gms");
        if (!TextUtils.isEmpty(string)) {
            builderAppendQueryParameter.appendQueryParameter("pcampaignid", string);
        }
        intent3.setData(builderAppendQueryParameter.build());
        intent3.setPackage(BuildConfig.STORE_PACKAGE);
        intent3.addFlags(524288);
        return intent3;
    }

    public PendingIntent c(@NonNull Context context, int i10, int i11) {
        return d(context, i10, i11, null);
    }

    public PendingIntent d(@NonNull Context context, int i10, int i11, String str) {
        Intent intentB = b(context, i10, str);
        if (intentB == null) {
            return null;
        }
        return k2.q.b(context, i11, intentB, 134217728, false);
    }

    @NonNull
    public String e(int i10) {
        return h.c(i10);
    }

    public int g(@NonNull Context context) {
        return h(context, f21184a);
    }

    public int h(@NonNull Context context, int i10) {
        int iF = h.f(context, i10);
        if (h.g(context, iF)) {
            return 18;
        }
        return iF;
    }

    public boolean i(@NonNull Context context, @NonNull String str) {
        return h.k(context, str);
    }

    public boolean j(int i10) {
        return h.i(i10);
    }

    public void k(@NonNull Context context, int i10) throws f, e {
        h.a(context, i10);
    }
}
