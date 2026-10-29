package p308nh;

import android.content.Context;
import android.content.SharedPreferences;
import com.roblox.engine.jni.dev.DevBranchAndCommitInterface;
import sg.C11295a1;
import th.C11659h;

/* JADX INFO: renamed from: nh.c */
/* JADX INFO: loaded from: classes2.dex */
public class C9477c {

    /* JADX INFO: renamed from: a */
    public static String f34088a;

    /* JADX INFO: renamed from: b */
    public static String f34089b;

    /* JADX INFO: renamed from: a */
    public static String m37334a(Context context) {
        if (f34088a == null) {
            f34088a = C11295a1.m42422U(context).getString("dev_branch", "");
        }
        return f34088a;
    }

    /* JADX INFO: renamed from: b */
    public static String m37335b(Context context) {
        if (f34089b == null) {
            f34089b = C11295a1.m42422U(context).getString("dev_commit", "");
        }
        return f34089b;
    }

    /* JADX INFO: renamed from: c */
    public static void m37336c(Context context) {
        String strM37334a = m37334a(context);
        if (strM37334a.isEmpty()) {
            return;
        }
        DevBranchAndCommitInterface.nativeSetDevBranchCommitAndTrigger(strM37334a, m37335b(context));
    }

    /* JADX INFO: renamed from: d */
    public static void m37337d(Context context, String str, String str2) {
        boolean z10;
        boolean z11 = true;
        if (m37334a(context).equals(str)) {
            z10 = false;
        } else {
            m37338e(context, str);
            z10 = true;
        }
        if (m37335b(context).equals(str2)) {
            z11 = z10;
        } else {
            m37339f(context, str2);
        }
        if (z11 && C11659h.m43403a().mo43526R4()) {
            m37336c(context);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m37338e(Context context, String str) {
        if (str.equals(f34088a)) {
            return;
        }
        f34088a = str;
        SharedPreferences.Editor editorEdit = C11295a1.m42422U(context).edit();
        editorEdit.putString("dev_branch", str);
        editorEdit.apply();
    }

    /* JADX INFO: renamed from: f */
    public static void m37339f(Context context, String str) {
        if (str.equals(f34089b)) {
            return;
        }
        f34089b = str;
        SharedPreferences.Editor editorEdit = C11295a1.m42422U(context).edit();
        editorEdit.putString("dev_commit", str);
        editorEdit.apply();
    }
}
