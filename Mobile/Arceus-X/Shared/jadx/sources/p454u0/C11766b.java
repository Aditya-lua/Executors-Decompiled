package p454u0;

import p140g0.C5931r1;
import p296n0.C8764h3;
import p296n0.C8770i3;
import p296n0.C8782k3;
import p296n0.InterfaceC8758g3;
import p366q0.C10417c;
import p533x2.InterfaceC12631a;

/* JADX INFO: renamed from: u0.b */
/* JADX INFO: loaded from: classes.dex */
public class C11766b {

    /* JADX INFO: renamed from: a */
    public static volatile C8782k3 f41470a;

    static {
        C8770i3.m35195b().m35197c(C10417c.m40081b(), new InterfaceC12631a() { // from class: u0.a
            @Override // p533x2.InterfaceC12631a
            public final void accept(Object obj) {
                C11766b.m44045a((C8764h3) obj);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m44045a(C8764h3 c8764h3) {
        f41470a = new C8782k3(C11767c.m44048a(c8764h3));
        C5931r1.m26561a("DeviceQuirks", "core DeviceQuirks = " + C8782k3.m35232d(f41470a));
    }

    /* JADX INFO: renamed from: b */
    public static <T extends InterfaceC8758g3> T m44046b(Class<T> cls) {
        return (T) f41470a.m35234b(cls);
    }

    /* JADX INFO: renamed from: c */
    public static C8782k3 m44047c() {
        return f41470a;
    }
}
