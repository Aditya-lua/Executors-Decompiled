package s1;

import g0.r1;
import n0.g3;
import n0.h3;
import n0.i3;
import n0.k3;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile k3 f30451a;

    static {
        i3.b().c(q0.c.b(), new x2.a() { // from class: s1.a
            @Override // x2.a
            public final void accept(Object obj) {
                b.a((h3) obj);
            }
        });
    }

    public static /* synthetic */ void a(h3 h3Var) {
        f30451a = new k3(c.a(h3Var));
        r1.a("DeviceQuirks", "view DeviceQuirks = " + k3.d(f30451a));
    }

    public static <T extends g3> T b(Class<T> cls) {
        return (T) f30451a.b(cls);
    }
}
