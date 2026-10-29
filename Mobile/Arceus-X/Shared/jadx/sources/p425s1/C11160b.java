package p425s1;

import p140g0.C5931r1;
import p296n0.C8764h3;
import p296n0.C8770i3;
import p296n0.C8782k3;
import p296n0.InterfaceC8758g3;
import p366q0.C10417c;
import p533x2.InterfaceC12631a;

/* JADX INFO: renamed from: s1.b */
/* JADX INFO: loaded from: classes.dex */
public class C11160b {

    /* JADX INFO: renamed from: a */
    public static volatile C8782k3 f39403a;

    static {
        C8770i3.m35195b().m35197c(C10417c.m40081b(), new InterfaceC12631a() { // from class: s1.a
            @Override // p533x2.InterfaceC12631a
            public final void accept(Object obj) {
                C11160b.m42055a((C8764h3) obj);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m42055a(C8764h3 c8764h3) {
        f39403a = new C8782k3(C11161c.m42057a(c8764h3));
        C5931r1.m26561a("DeviceQuirks", "view DeviceQuirks = " + C8782k3.m35232d(f39403a));
    }

    /* JADX INFO: renamed from: b */
    public static <T extends InterfaceC8758g3> T m42056b(Class<T> cls) {
        return (T) f39403a.m35234b(cls);
    }
}
