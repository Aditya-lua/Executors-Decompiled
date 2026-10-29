package p115f1;

import android.annotation.SuppressLint;
import android.util.Size;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p140g0.C5902k0;
import p140g0.C5931r1;
import p156h1.AbstractC6268i;
import p533x2.C12637g;

/* JADX INFO: renamed from: f1.a0 */
/* JADX INFO: loaded from: classes.dex */
public final class C5235a0 {

    /* JADX INFO: renamed from: a */
    public final List<C5306x> f20290a;

    /* JADX INFO: renamed from: b */
    public final C5282p f20291b;

    public C5235a0(List<C5306x> list, C5282p c5282p) {
        C12637g.m47070b((list.isEmpty() && c5282p == C5282p.f20423a) ? false : true, "No preferred quality and fallback strategy.");
        this.f20290a = Collections.unmodifiableList(new ArrayList(list));
        this.f20291b = c5282p;
    }

    /* JADX INFO: renamed from: b */
    public static void m24229b(C5306x c5306x) {
        C12637g.m47070b(C5306x.m24592a(c5306x), "Invalid quality: " + c5306x);
    }

    /* JADX INFO: renamed from: c */
    public static void m24230c(List<C5306x> list) {
        for (C5306x c5306x : list) {
            C12637g.m47070b(C5306x.m24592a(c5306x), "qualities contain invalid quality: " + c5306x);
        }
    }

    /* JADX INFO: renamed from: d */
    public static C5235a0 m24231d(C5306x c5306x, C5282p c5282p) {
        C12637g.m47076h(c5306x, "quality cannot be null");
        C12637g.m47076h(c5282p, "fallbackStrategy cannot be null");
        m24229b(c5306x);
        return new C5235a0(Collections.singletonList(c5306x), c5282p);
    }

    /* JADX INFO: renamed from: e */
    public static C5235a0 m24232e(List<C5306x> list, C5282p c5282p) {
        C12637g.m47076h(list, "qualities cannot be null");
        C12637g.m47076h(c5282p, "fallbackStrategy cannot be null");
        C12637g.m47070b(!list.isEmpty(), "qualities cannot be empty");
        m24230c(list);
        return new C5235a0(list, c5282p);
    }

    /* JADX INFO: renamed from: g */
    public static Size m24233g(AbstractC6268i abstractC6268i) {
        return abstractC6268i.mo27494k().m34997k();
    }

    /* JADX INFO: renamed from: h */
    public static Map<C5306x, Size> m24234h(InterfaceC5260h1 interfaceC5260h1, C5902k0 c5902k0) {
        HashMap map = new HashMap();
        for (C5306x c5306x : interfaceC5260h1.mo24279e(c5902k0)) {
            AbstractC6268i abstractC6268iMo24278d = interfaceC5260h1.mo24278d(c5306x, c5902k0);
            Objects.requireNonNull(abstractC6268iMo24278d);
            map.put(c5306x, m24233g(abstractC6268iMo24278d));
        }
        return map;
    }

    /* JADX INFO: renamed from: a */
    public final void m24235a(List<C5306x> list, Set<C5306x> set) {
        if (list.isEmpty() || set.containsAll(list)) {
            return;
        }
        C5931r1.m26561a("QualitySelector", "Select quality by fallbackStrategy = " + this.f20291b);
        C5282p c5282p = this.f20291b;
        if (c5282p == C5282p.f20423a) {
            return;
        }
        C12637g.m47078j(c5282p instanceof C5282p.b, "Currently only support type RuleStrategy");
        C5282p.b bVar = (C5282p.b) this.f20291b;
        List<C5306x> listM24593b = C5306x.m24593b();
        C5306x c5306xMo24282c = bVar.mo24282c() == C5306x.f20634f ? listM24593b.get(0) : bVar.mo24282c() == C5306x.f20633e ? listM24593b.get(listM24593b.size() - 1) : bVar.mo24282c();
        C12637g.m47077i(listM24593b.indexOf(c5306xMo24282c) != -1);
        ArrayList arrayList = new ArrayList();
        for (int i10 = r4 - 1; i10 >= 0; i10--) {
            C5306x c5306x = listM24593b.get(i10);
            if (list.contains(c5306x)) {
                arrayList.add(c5306x);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i11 = r4 + 1; i11 < listM24593b.size(); i11++) {
            C5306x c5306x2 = listM24593b.get(i11);
            if (list.contains(c5306x2)) {
                arrayList2.add(c5306x2);
            }
        }
        C5931r1.m26561a("QualitySelector", "sizeSortedQualities = " + listM24593b + ", fallback quality = " + c5306xMo24282c + ", largerQualities = " + arrayList + ", smallerQualities = " + arrayList2);
        int iMo24283d = bVar.mo24283d();
        if (iMo24283d != 0) {
            if (iMo24283d == 1) {
                set.addAll(arrayList);
                set.addAll(arrayList2);
                return;
            }
            if (iMo24283d == 2) {
                set.addAll(arrayList);
                return;
            }
            if (iMo24283d != 3) {
                if (iMo24283d == 4) {
                    set.addAll(arrayList2);
                    return;
                }
                throw new AssertionError("Unhandled fallback strategy: " + this.f20291b);
            }
            set.addAll(arrayList2);
            set.addAll(arrayList);
        }
    }

    @SuppressLint({"UsesNonDefaultVisibleForTesting"})
    /* JADX INFO: renamed from: f */
    public List<C5306x> m24236f(List<C5306x> list) {
        if (list.isEmpty()) {
            C5931r1.m26572l("QualitySelector", "No supported quality on the device.");
            return new ArrayList();
        }
        C5931r1.m26561a("QualitySelector", "supportedQualities = " + list);
        Set<C5306x> linkedHashSet = new LinkedHashSet<>();
        for (C5306x c5306x : this.f20290a) {
            if (c5306x == C5306x.f20634f) {
                linkedHashSet.addAll(list);
                break;
            }
            if (c5306x == C5306x.f20633e) {
                ArrayList arrayList = new ArrayList(list);
                Collections.reverse(arrayList);
                linkedHashSet.addAll(arrayList);
                break;
            }
            if (list.contains(c5306x)) {
                linkedHashSet.add(c5306x);
            } else {
                C5931r1.m26572l("QualitySelector", "quality is not supported and will be ignored: " + c5306x);
            }
        }
        m24235a(list, linkedHashSet);
        return new ArrayList(linkedHashSet);
    }

    public String toString() {
        return "QualitySelector{preferredQualities=" + this.f20290a + ", fallbackStrategy=" + this.f20291b + "}";
    }
}
