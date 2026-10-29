package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import p092e3.ExecutorC4775n;
import p462u9.C11822m;
import sb.InterfaceC11256g;

/* JADX INFO: renamed from: com.google.firebase.messaging.m0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3009m0 {
    /* JADX INFO: renamed from: b */
    public static SharedPreferences m14617b(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return context.getSharedPreferences("com.google.firebase.messaging", 0);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m14618c(Context context) {
        return m14617b(context).getBoolean("proxy_notification_initialized", false);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m14619d(SharedPreferences sharedPreferences, boolean z10) {
        return sharedPreferences.contains("proxy_retention") && sharedPreferences.getBoolean("proxy_retention", false) == z10;
    }

    /* JADX INFO: renamed from: e */
    public static void m14620e(Context context, boolean z10) {
        SharedPreferences.Editor editorEdit = m14617b(context).edit();
        editorEdit.putBoolean("proxy_notification_initialized", z10);
        editorEdit.apply();
    }

    /* JADX INFO: renamed from: f */
    public static void m14621f(final Context context, C2980b0 c2980b0, final boolean z10) {
        if (C11822m.m44202i() && !m14619d(m14617b(context), z10)) {
            c2980b0.m14480j(z10).mo11892f(new ExecutorC4775n(), new InterfaceC11256g() { // from class: com.google.firebase.messaging.l0
                @Override // sb.InterfaceC11256g
                public final void onSuccess(Object obj) {
                    C3009m0.m14622g(context, z10);
                }
            });
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m14622g(Context context, boolean z10) {
        SharedPreferences.Editor editorEdit = m14617b(context).edit();
        editorEdit.putBoolean("proxy_retention", z10);
        editorEdit.apply();
    }
}
