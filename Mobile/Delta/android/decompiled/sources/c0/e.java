package c0;

import g0.r1;
import n0.g3;
import n0.h3;
import n0.i3;
import n0.k3;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile k3 f4314a;

    static {
        i3.b().c(q0.c.b(), new x2.a() { // from class: c0.d
            @Override // x2.a
            public final void accept(Object obj) {
                e.a((h3) obj);
            }
        });
    }

    public static /* synthetic */ void a(h3 h3Var) {
        f4314a = new k3(f.a(h3Var));
        r1.a("DeviceQuirks", "camera2 DeviceQuirks = " + k3.d(f4314a));
    }

    public static <T extends g3> T b(Class<T> cls) {
        return (T) f4314a.b(cls);
    }

    public static k3 c() {
        return f4314a;
    }
}
