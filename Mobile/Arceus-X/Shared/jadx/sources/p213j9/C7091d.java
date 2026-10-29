package p213j9;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.roblox.client.personasdk.BuildConfig;
import p235k2.C7425q;
import p462u9.C11818i;
import p511w9.C12327c;

/* JADX INFO: renamed from: j9.d */
/* JADX INFO: loaded from: classes.dex */
public class C7091d {

    /* JADX INFO: renamed from: a */
    public static final int f27704a = C7099h.f27712a;

    /* JADX INFO: renamed from: b */
    public static final C7091d f27705b = new C7091d();

    @NonNull
    /* JADX INFO: renamed from: f */
    public static C7091d m29876f() {
        return f27705b;
    }

    /* JADX INFO: renamed from: a */
    public int m29877a(@NonNull Context context) {
        return C7099h.m29887b(context);
    }

    /* JADX INFO: renamed from: b */
    public Intent mo29851b(Context context, int i10, String str) {
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3) {
                return null;
            }
            Uri uriFromParts = Uri.fromParts("package", "com.google.android.gms", null);
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(uriFromParts);
            return intent;
        }
        if (context != null && C11818i.m44184d(context)) {
            Intent intent2 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            intent2.setPackage("com.google.android.wearable.app");
            return intent2;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("gcore_");
        sb2.append(f27704a);
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
                sb2.append(C12327c.m46181a(context).m46178e(context.getPackageName(), 0).versionCode);
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

    /* JADX INFO: renamed from: c */
    public PendingIntent mo29852c(@NonNull Context context, int i10, int i11) {
        return m29878d(context, i10, i11, null);
    }

    /* JADX INFO: renamed from: d */
    public PendingIntent m29878d(@NonNull Context context, int i10, int i11, String str) {
        Intent intentMo29851b = mo29851b(context, i10, str);
        if (intentMo29851b == null) {
            return null;
        }
        return C7425q.m30910b(context, i11, intentMo29851b, 134217728, false);
    }

    @NonNull
    /* JADX INFO: renamed from: e */
    public String mo29853e(int i10) {
        return C7099h.m29888c(i10);
    }

    /* JADX INFO: renamed from: g */
    public int mo29854g(@NonNull Context context) {
        return mo29855h(context, f27704a);
    }

    /* JADX INFO: renamed from: h */
    public int mo29855h(@NonNull Context context, int i10) {
        int iM29891f = C7099h.m29891f(context, i10);
        if (C7099h.m29892g(context, iM29891f)) {
            return 18;
        }
        return iM29891f;
    }

    /* JADX INFO: renamed from: i */
    public boolean m29879i(@NonNull Context context, @NonNull String str) {
        return C7099h.m29896k(context, str);
    }

    /* JADX INFO: renamed from: j */
    public boolean mo29856j(int i10) {
        return C7099h.m29894i(i10);
    }

    /* JADX INFO: renamed from: k */
    public void m29880k(@NonNull Context context, int i10) throws C7095f, C7093e {
        C7099h.m29886a(context, i10);
    }
}
