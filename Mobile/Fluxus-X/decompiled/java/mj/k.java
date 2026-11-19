package mj;

import android.app.Activity;
import android.net.Uri;
import androidx.annotation.NonNull;
import ei.s0;
import f4.v;

/* JADX INFO: loaded from: classes2.dex */
public interface k {
    boolean a(String str, long j10, String str2, String str3, Activity activity);

    boolean b(String str, String str2, Activity activity, long j10, o oVar);

    default void c(String str, Uri uri, String str2, @NonNull v vVar, o oVar, Runnable runnable) {
    }

    boolean d(long j10, String str, String str2, Activity activity, boolean z10, o oVar);

    String e(String str);

    boolean f(String str, String str2, Activity activity, o oVar, boolean z10);

    boolean g(String str, long j10, String str2, Activity activity, String str3);

    boolean h(String str, long j10, long j11);

    boolean i(String str);

    default void j(s0 s0Var) {
    }

    void k(boolean z10);

    boolean l(String str, String str2, Activity activity, o oVar, boolean z10, String str3);

    boolean m(String str);

    void n(int i10);
}
