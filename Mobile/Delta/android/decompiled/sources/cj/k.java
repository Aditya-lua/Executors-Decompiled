package cj;

import android.app.Activity;
import android.net.Uri;
import androidx.annotation.NonNull;
import uh.s0;

/* JADX INFO: loaded from: classes2.dex */
public interface k {
    boolean a(String str, long j10, String str2, String str3, Activity activity);

    boolean b(String str, String str2, Activity activity, o oVar, boolean z10, String str3);

    String c(String str);

    boolean d(String str, String str2, Activity activity, o oVar, boolean z10);

    default void e(String str, Uri uri, String str2, @NonNull e4.q qVar, o oVar, Runnable runnable) {
    }

    boolean f(String str, long j10, String str2, Activity activity, String str3);

    boolean g(String str, long j10, long j11);

    boolean h(long j10, String str, String str2, Activity activity, boolean z10, o oVar);

    boolean i(String str);

    default void j(s0 s0Var) {
    }

    void k(boolean z10);

    boolean l(String str);

    void m(int i10);

    boolean n(String str, String str2, Activity activity, long j10, o oVar);
}
