package com.google.android.gms.internal.measurement;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Process;
import android.os.UserManager;
import android.util.Log;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.k8 */
/* JADX INFO: loaded from: classes.dex */
public final class C2156k8 {

    /* JADX INFO: renamed from: a */
    public static UserManager f8376a;

    /* JADX INFO: renamed from: b */
    public static volatile boolean f8377b = !m10318a();

    /* JADX INFO: renamed from: a */
    public static boolean m10318a() {
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m10319b(Context context) {
        return m10318a() && !m10321d(context);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m10320c(Context context) {
        return !m10318a() || m10321d(context);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0050 A[Catch: all -> 0x000f, TryCatch #1 {all -> 0x000f, blocks: (B:7:0x0009, B:9:0x000d, B:16:0x0017, B:18:0x001b, B:19:0x0025, B:32:0x0050, B:33:0x0052, B:22:0x002b, B:24:0x0031, B:28:0x003e, B:30:0x004c), top: B:39:0x0009, inners: #0 }] */
    @TargetApi(24)
    /* JADX INFO: renamed from: d */
    public static boolean m10321d(Context context) {
        if (f8377b) {
            return true;
        }
        synchronized (C2156k8.class) {
            try {
                if (f8377b) {
                    return true;
                }
                int i10 = 1;
                while (true) {
                    boolean z10 = false;
                    if (i10 <= 2) {
                        if (f8376a == null) {
                            f8376a = (UserManager) context.getSystemService(UserManager.class);
                        }
                        UserManager userManager = f8376a;
                        if (userManager == null) {
                            z10 = true;
                        } else {
                            try {
                                if (userManager.isUserUnlocked() || !userManager.isUserRunning(Process.myUserHandle())) {
                                    z10 = true;
                                }
                            } catch (NullPointerException e10) {
                                Log.w("DirectBootUtils", "Failed to check if user is unlocked.", e10);
                                f8376a = null;
                                i10++;
                            }
                        }
                        if (z10) {
                            f8377b = true;
                        }
                        return z10;
                    }
                    if (z10) {
                        f8376a = null;
                    }
                    if (z10) {
                        f8377b = true;
                    }
                    return z10;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
