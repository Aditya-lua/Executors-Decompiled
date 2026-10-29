package p222jj;

import android.content.Context;
import android.content.SharedPreferences;
import p151gk.C6133z;

/* JADX INFO: renamed from: jj.x */
/* JADX INFO: loaded from: classes2.dex */
public class C7199x {
    /* JADX INFO: renamed from: a */
    public String m30120a(Context context, String str) {
        return m30122c(context).getString(str, null);
    }

    /* JADX INFO: renamed from: b */
    public boolean m30121b(Context context, String str) {
        return m30122c(context).getBoolean(str, false);
    }

    /* JADX INFO: renamed from: c */
    public final SharedPreferences m30122c(Context context) {
        return C6133z.m27104a(context, "NotificationPreferences");
    }

    /* JADX INFO: renamed from: d */
    public final SharedPreferences.Editor m30123d(Context context) {
        return m30122c(context).edit();
    }

    /* JADX INFO: renamed from: e */
    public boolean m30124e(Context context, String str) {
        return m30122c(context).contains(str);
    }

    /* JADX INFO: renamed from: f */
    public void m30125f(Context context, String str, boolean z10) {
        SharedPreferences.Editor editorM30123d = m30123d(context);
        editorM30123d.putBoolean(str, z10);
        editorM30123d.commit();
    }

    /* JADX INFO: renamed from: g */
    public void m30126g(Context context, String str, String str2) {
        SharedPreferences.Editor editorM30123d = m30123d(context);
        editorM30123d.putString(str, str2);
        editorM30123d.commit();
    }
}
