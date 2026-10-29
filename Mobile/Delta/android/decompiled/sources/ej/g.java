package ej;

import android.app.Activity;
import android.net.Uri;
import androidx.annotation.NonNull;
import e4.q;
import wh.r0;

/* JADX INFO: loaded from: classes2.dex */
public interface g {
    boolean a(String str, long j10, String str2, String str3, Activity activity);

    default void b(r0 r0Var) {
    }

    String c(String str);

    boolean d(long j10, String str, String str2, Activity activity, boolean z10, j jVar);

    default void e(String str, Uri uri, String str2, @NonNull q qVar, j jVar, Runnable runnable) {
    }

    boolean f(String str, long j10, String str2, Activity activity, String str3);

    boolean g(String str, long j10, long j11);

    boolean h(String str, String str2, Activity activity, j jVar, boolean z10, String str3);

    boolean i(String str, String str2, Activity activity, j jVar, boolean z10);

    boolean j(String str);

    void k(boolean z10);

    boolean l(String str);

    void m(int i10);

    boolean n(String str, String str2, Activity activity, long j10, j jVar);
}
