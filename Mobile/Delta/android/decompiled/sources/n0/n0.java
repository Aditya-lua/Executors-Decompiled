package n0;

import android.annotation.SuppressLint;
import android.content.Context;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public interface n0 extends r0 {

    public interface a {
        @SuppressLint({"LambdaLast"})
        n0 a(Context context, h1 h1Var, g0.v vVar, long j10, g0.g0 g0Var, s0.m mVar);
    }

    Object a();

    p0 b(String str);

    a3<List<g0.s>> c();

    Set<String> d();

    h0.a f();

    default void shutdown() {
    }
}
