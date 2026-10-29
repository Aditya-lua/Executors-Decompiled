package p115f1;

import android.util.Size;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p140g0.C5902k0;
import p140g0.C5931r1;
import p156h1.AbstractC6268i;
import p156h1.C6261b;
import p156h1.C6264e;
import p156h1.C6267h;
import p234k1.C7407c;
import p282m1.InterfaceC8389r1;
import p296n0.C8782k3;
import p296n0.C8850y1;
import p296n0.InterfaceC8799o0;
import p296n0.InterfaceC8855z1;
import p318o1.C9623c;
import p318o1.C9624d;
import p318o1.C9625e;
import p318o1.C9626f;
import p533x2.C12637g;

/* JADX INFO: renamed from: f1.d1 */
/* JADX INFO: loaded from: classes.dex */
public class C5248d1 implements InterfaceC5260h1 {

    /* JADX INFO: renamed from: b */
    public final InterfaceC8855z1 f20330b;

    /* JADX INFO: renamed from: c */
    public final boolean f20331c;

    /* JADX INFO: renamed from: d */
    public final int f20332d;

    /* JADX INFO: renamed from: e */
    public final Map<C5902k0, C5279o> f20333e = new HashMap();

    /* JADX INFO: renamed from: f */
    public final Map<C5902k0, C5279o> f20334f = new HashMap();

    public C5248d1(int i10, InterfaceC8799o0 interfaceC8799o0, int i11, InterfaceC8389r1.a aVar) {
        C12637g.m47070b(i10 == 0 || i10 == 1, "Not a supported video capabilities source: " + i10);
        int i12 = i11 == 2 ? 2 : 1;
        this.f20332d = i12;
        this.f20330b = m24273h(i10, interfaceC8799o0, aVar, i12);
        for (C5902k0 c5902k0 : interfaceC8799o0.mo35043c()) {
            C5279o c5279o = new C5279o(new C6264e(this.f20330b, c5902k0), this.f20332d);
            if (!c5279o.m24341g().isEmpty()) {
                this.f20333e.put(c5902k0, c5279o);
            }
        }
        this.f20331c = interfaceC8799o0.mo35052o();
    }

    /* JADX INFO: renamed from: h */
    public static InterfaceC8855z1 m24273h(int i10, InterfaceC8799o0 interfaceC8799o0, InterfaceC8389r1.a aVar, int i11) {
        InterfaceC8389r1.a aVar2;
        InterfaceC8855z1 interfaceC8855z1Mo35058x = interfaceC8799o0.mo35058x();
        if (i11 == 2) {
            return !interfaceC8799o0.mo35055s() ? InterfaceC8855z1.f32240a : interfaceC8855z1Mo35058x;
        }
        if (!C5279o.m24336b(interfaceC8855z1Mo35058x, i11)) {
            C5931r1.m26572l("RecorderVideoCapabilities", "Camera EncoderProfilesProvider doesn't contain any supported Quality.");
            interfaceC8855z1Mo35058x = new C9623c(interfaceC8799o0, Arrays.asList(C5306x.f20631c, C5306x.f20630b, C5306x.f20629a), aVar);
        }
        C8782k3 c8782k3M30692c = C7407c.m30692c();
        InterfaceC8855z1 c9624d = new C9624d(interfaceC8855z1Mo35058x, c8782k3M30692c, interfaceC8799o0, aVar);
        if (i10 == 1) {
            aVar2 = aVar;
            c9624d = new C6267h(c9624d, C5306x.m24593b(), Collections.singleton(C5902k0.f22550d), interfaceC8799o0.mo35050m(34), aVar2);
        } else {
            aVar2 = aVar;
        }
        InterfaceC8855z1 c9625e = new C9625e(c9624d, c8782k3M30692c);
        if (m24274i(interfaceC8799o0)) {
            c9625e = new C6261b(c9625e, aVar2);
        }
        return new C9626f(c9625e, interfaceC8799o0, c8782k3M30692c);
    }

    /* JADX INFO: renamed from: i */
    public static boolean m24274i(InterfaceC8799o0 interfaceC8799o0) {
        for (C5902k0 c5902k0 : interfaceC8799o0.mo35043c()) {
            Integer numValueOf = Integer.valueOf(c5902k0.m26517b());
            int iM26516a = c5902k0.m26516a();
            if (numValueOf.equals(3) && iM26516a == 10) {
                return true;
            }
        }
        return false;
    }

    @Override // p115f1.InterfaceC5260h1
    /* JADX INFO: renamed from: a */
    public C5306x mo24275a(Size size, C5902k0 c5902k0) {
        C5279o c5279oM24281g = m24281g(c5902k0);
        return c5279oM24281g == null ? C5306x.f20635g : c5279oM24281g.m24338d(size);
    }

    @Override // p115f1.InterfaceC5260h1
    /* JADX INFO: renamed from: b */
    public AbstractC6268i mo24276b(Size size, C5902k0 c5902k0) {
        C5279o c5279oM24281g = m24281g(c5902k0);
        if (c5279oM24281g == null) {
            return null;
        }
        return c5279oM24281g.m24337c(size);
    }

    @Override // p115f1.InterfaceC5260h1
    /* JADX INFO: renamed from: c */
    public Set<C5902k0> mo24277c() {
        return this.f20333e.keySet();
    }

    @Override // p115f1.InterfaceC5260h1
    /* JADX INFO: renamed from: d */
    public AbstractC6268i mo24278d(C5306x c5306x, C5902k0 c5902k0) {
        C5279o c5279oM24281g = m24281g(c5902k0);
        if (c5279oM24281g == null) {
            return null;
        }
        return c5279oM24281g.m24340f(c5306x);
    }

    @Override // p115f1.InterfaceC5260h1
    /* JADX INFO: renamed from: e */
    public List<C5306x> mo24279e(C5902k0 c5902k0) {
        C5279o c5279oM24281g = m24281g(c5902k0);
        return c5279oM24281g == null ? new ArrayList() : c5279oM24281g.m24341g();
    }

    /* JADX INFO: renamed from: f */
    public final C5279o m24280f(C5902k0 c5902k0) {
        if (C8850y1.m35546c(c5902k0, mo24277c())) {
            return new C5279o(new C6264e(this.f20330b, c5902k0), this.f20332d);
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public final C5279o m24281g(C5902k0 c5902k0) {
        if (c5902k0.m26519e()) {
            return this.f20333e.get(c5902k0);
        }
        if (this.f20334f.containsKey(c5902k0)) {
            return this.f20334f.get(c5902k0);
        }
        C5279o c5279oM24280f = m24280f(c5902k0);
        this.f20334f.put(c5902k0, c5279oM24280f);
        return c5279oM24280f;
    }
}
