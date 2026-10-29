package jj;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes2.dex */
public class x {
    public String a(Context context, String str) {
        return c(context).getString(str, null);
    }

    public boolean b(Context context, String str) {
        return c(context).getBoolean(str, false);
    }

    public final SharedPreferences c(Context context) {
        return gk.y.a(context, "NotificationPreferences");
    }

    public final SharedPreferences.Editor d(Context context) {
        return c(context).edit();
    }

    public boolean e(Context context, String str) {
        return c(context).contains(str);
    }

    public void f(Context context, String str, boolean z10) {
        SharedPreferences.Editor editorD = d(context);
        editorD.putBoolean(str, z10);
        editorD.commit();
    }

    public void g(Context context, String str, String str2) {
        SharedPreferences.Editor editorD = d(context);
        editorD.putString(str, str2);
        editorD.commit();
    }
}
