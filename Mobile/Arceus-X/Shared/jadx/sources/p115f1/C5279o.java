package p115f1;

import android.util.Size;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import p140g0.C5931r1;
import p156h1.AbstractC6268i;
import p296n0.InterfaceC8721a2;
import p296n0.InterfaceC8855z1;
import p347p0.C10089e;
import p503w0.C12274d;
import p533x2.C12637g;

/* JADX INFO: renamed from: f1.o */
/* JADX INFO: loaded from: classes.dex */
public class C5279o {

    /* JADX INFO: renamed from: a */
    public final Map<C5306x, AbstractC6268i> f20417a = new LinkedHashMap();

    /* JADX INFO: renamed from: b */
    public final TreeMap<Size, C5306x> f20418b = new TreeMap<>(new C10089e());

    /* JADX INFO: renamed from: c */
    public final AbstractC6268i f20419c;

    /* JADX INFO: renamed from: d */
    public final AbstractC6268i f20420d;

    public C5279o(InterfaceC8855z1 interfaceC8855z1, int i10) {
        for (C5306x c5306x : C5306x.m24593b()) {
            InterfaceC8721a2 interfaceC8721a2M24339e = m24339e(c5306x, interfaceC8855z1, i10);
            if (interfaceC8721a2M24339e != null) {
                C5931r1.m26561a("CapabilitiesByQuality", "profiles = " + interfaceC8721a2M24339e);
                AbstractC6268i abstractC6268iM24342h = m24342h(interfaceC8721a2M24339e);
                if (abstractC6268iM24342h == null) {
                    C5931r1.m26572l("CapabilitiesByQuality", "EncoderProfiles of quality " + c5306x + " has no video validated profiles.");
                } else {
                    this.f20418b.put(abstractC6268iM24342h.mo27494k().m34997k(), c5306x);
                    this.f20417a.put(c5306x, abstractC6268iM24342h);
                }
            }
        }
        if (this.f20417a.isEmpty()) {
            C5931r1.m26563c("CapabilitiesByQuality", "No supported EncoderProfiles");
            this.f20420d = null;
            this.f20419c = null;
        } else {
            ArrayDeque arrayDeque = new ArrayDeque(this.f20417a.values());
            this.f20419c = (AbstractC6268i) arrayDeque.peekFirst();
            this.f20420d = (AbstractC6268i) arrayDeque.peekLast();
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m24335a(C5306x c5306x) {
        C12637g.m47070b(C5306x.m24592a(c5306x), "Unknown quality: " + c5306x);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m24336b(InterfaceC8855z1 interfaceC8855z1, int i10) {
        return !new C5279o(interfaceC8855z1, i10).m24341g().isEmpty();
    }

    /* JADX INFO: renamed from: c */
    public AbstractC6268i m24337c(Size size) {
        C5306x c5306xM24338d = m24338d(size);
        C5931r1.m26561a("CapabilitiesByQuality", "Using supported quality of " + c5306xM24338d + " for size " + size);
        if (c5306xM24338d == C5306x.f20635g) {
            return null;
        }
        AbstractC6268i abstractC6268iM24340f = m24340f(c5306xM24338d);
        if (abstractC6268iM24340f != null) {
            return abstractC6268iM24340f;
        }
        throw new AssertionError("Camera advertised available quality but did not produce EncoderProfiles for advertised quality.");
    }

    /* JADX INFO: renamed from: d */
    public C5306x m24338d(Size size) {
        C5306x c5306x = (C5306x) C12274d.m45569a(size, this.f20418b);
        return c5306x != null ? c5306x : C5306x.f20635g;
    }

    /* JADX INFO: renamed from: e */
    public final InterfaceC8721a2 m24339e(C5306x c5306x, InterfaceC8855z1 interfaceC8855z1, int i10) {
        C12637g.m47078j(c5306x instanceof C5306x.b, "Currently only support ConstantQuality");
        return interfaceC8855z1.mo27504b(((C5306x.b) c5306x).m24595e(i10));
    }

    /* JADX INFO: renamed from: f */
    public AbstractC6268i m24340f(C5306x c5306x) {
        m24335a(c5306x);
        if (c5306x == C5306x.f20634f) {
            return this.f20419c;
        }
        return c5306x == C5306x.f20633e ? this.f20420d : this.f20417a.get(c5306x);
    }

    /* JADX INFO: renamed from: g */
    public List<C5306x> m24341g() {
        return new ArrayList(this.f20417a.keySet());
    }

    /* JADX INFO: renamed from: h */
    public final AbstractC6268i m24342h(InterfaceC8721a2 interfaceC8721a2) {
        if (interfaceC8721a2.mo27490b().isEmpty()) {
            return null;
        }
        return AbstractC6268i.m27526i(interfaceC8721a2);
    }
}
