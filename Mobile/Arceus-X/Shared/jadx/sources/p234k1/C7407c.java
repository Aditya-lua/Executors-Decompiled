package p234k1;

import p140g0.C5931r1;
import p296n0.C8764h3;
import p296n0.C8770i3;
import p296n0.C8782k3;
import p296n0.InterfaceC8758g3;
import p366q0.C10417c;
import p533x2.InterfaceC12631a;

/* JADX INFO: renamed from: k1.c */
/* JADX INFO: loaded from: classes.dex */
public class C7407c {

    /* JADX INFO: renamed from: a */
    public static volatile C8782k3 f28511a;

    static {
        C8770i3.m35195b().m35197c(C10417c.m40081b(), new InterfaceC12631a() { // from class: k1.b
            @Override // p533x2.InterfaceC12631a
            public final void accept(Object obj) {
                C7407c.m30690a((C8764h3) obj);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m30690a(C8764h3 c8764h3) {
        f28511a = new C8782k3(C7408d.m30693a(c8764h3));
        C5931r1.m26561a("DeviceQuirks", "video DeviceQuirks = " + C8782k3.m35232d(f28511a));
    }

    /* JADX INFO: renamed from: b */
    public static <T extends InterfaceC8758g3> T m30691b(Class<T> cls) {
        return (T) f28511a.m35234b(cls);
    }

    /* JADX INFO: renamed from: c */
    public static C8782k3 m30692c() {
        return f28511a;
    }
}
