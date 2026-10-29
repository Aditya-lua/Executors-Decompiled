package nh;

import android.content.Context;
import android.content.SharedPreferences;
import com.roblox.engine.jni.dev.DevBranchAndCommitInterface;
import sg.a1;
import th.h;

/* JADX INFO: loaded from: classes2.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f26281a;
    public static String b;

    public static String a(Context context) {
        if (f26281a == null) {
            f26281a = a1.U(context).getString("dev_branch", "");
        }
        return f26281a;
    }

    public static String b(Context context) {
        if (b == null) {
            b = a1.U(context).getString("dev_commit", "");
        }
        return b;
    }

    public static void c(Context context) {
        String strA = a(context);
        if (strA.isEmpty()) {
            return;
        }
        DevBranchAndCommitInterface.nativeSetDevBranchCommitAndTrigger(strA, b(context));
    }

    public static void d(Context context, String str, String str2) {
        boolean z10;
        boolean z11 = true;
        if (a(context).equals(str)) {
            z10 = false;
        } else {
            e(context, str);
            z10 = true;
        }
        if (b(context).equals(str2)) {
            z11 = z10;
        } else {
            f(context, str2);
        }
        if (z11 && h.a().L4()) {
            c(context);
        }
    }

    public static void e(Context context, String str) {
        if (str.equals(f26281a)) {
            return;
        }
        f26281a = str;
        SharedPreferences.Editor editorEdit = a1.U(context).edit();
        editorEdit.putString("dev_branch", str);
        editorEdit.apply();
    }

    public static void f(Context context, String str) {
        if (str.equals(b)) {
            return;
        }
        b = str;
        SharedPreferences.Editor editorEdit = a1.U(context).edit();
        editorEdit.putString("dev_commit", str);
        editorEdit.apply();
    }
}
