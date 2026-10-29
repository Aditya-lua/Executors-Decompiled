package p296n0;

import android.annotation.SuppressLint;
import android.content.Context;
import java.util.List;
import java.util.Set;
import p140g0.C5886g0;
import p140g0.C5933s;
import p140g0.C5945v;
import p155h0.InterfaceC6259a;
import p424s0.InterfaceC11152m;

/* JADX INFO: renamed from: n0.n0 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC8794n0 extends InterfaceC8814r0 {

    /* JADX INFO: renamed from: n0.n0$a */
    public interface a {
        @SuppressLint({"LambdaLast"})
        /* JADX INFO: renamed from: a */
        InterfaceC8794n0 mo35287a(Context context, AbstractC8762h1 abstractC8762h1, C5945v c5945v, long j10, C5886g0 c5886g0, InterfaceC11152m interfaceC11152m);
    }

    /* JADX INFO: renamed from: a */
    Object mo35282a();

    /* JADX INFO: renamed from: b */
    InterfaceC8804p0 mo35283b(String str);

    /* JADX INFO: renamed from: c */
    InterfaceC8722a3<List<C5933s>> mo35284c();

    /* JADX INFO: renamed from: d */
    Set<String> mo35285d();

    /* JADX INFO: renamed from: f */
    InterfaceC6259a mo35286f();

    default void shutdown() {
    }
}
