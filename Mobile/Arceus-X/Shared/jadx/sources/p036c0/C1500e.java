package p036c0;

import p140g0.C5931r1;
import p296n0.C8764h3;
import p296n0.C8770i3;
import p296n0.C8782k3;
import p296n0.InterfaceC8758g3;
import p366q0.C10417c;
import p533x2.InterfaceC12631a;

/* JADX INFO: renamed from: c0.e */
/* JADX INFO: loaded from: classes.dex */
public class C1500e {

    /* JADX INFO: renamed from: a */
    public static volatile C8782k3 f5777a;

    static {
        C8770i3.m35195b().m35197c(C10417c.m40081b(), new InterfaceC12631a() { // from class: c0.d
            @Override // p533x2.InterfaceC12631a
            public final void accept(Object obj) {
                C1500e.m7652a((C8764h3) obj);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m7652a(C8764h3 c8764h3) {
        f5777a = new C8782k3(C1501f.m7655a(c8764h3));
        C5931r1.m26561a("DeviceQuirks", "camera2 DeviceQuirks = " + C8782k3.m35232d(f5777a));
    }

    /* JADX INFO: renamed from: b */
    public static <T extends InterfaceC8758g3> T m7653b(Class<T> cls) {
        return (T) f5777a.m35234b(cls);
    }

    /* JADX INFO: renamed from: c */
    public static C8782k3 m7654c() {
        return f5777a;
    }
}
