package f1;

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

/* JADX INFO: loaded from: classes.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<x> f15802a;
    public final p b;

    public a0(List<x> list, p pVar) {
        x2.g.b((list.isEmpty() && pVar == p.f15905a) ? false : true, "No preferred quality and fallback strategy.");
        this.f15802a = Collections.unmodifiableList(new ArrayList(list));
        this.b = pVar;
    }

    public static void b(x xVar) {
        x2.g.b(x.a(xVar), "Invalid quality: " + xVar);
    }

    public static void c(List<x> list) {
        for (x xVar : list) {
            x2.g.b(x.a(xVar), "qualities contain invalid quality: " + xVar);
        }
    }

    public static a0 d(x xVar, p pVar) {
        x2.g.h(xVar, "quality cannot be null");
        x2.g.h(pVar, "fallbackStrategy cannot be null");
        b(xVar);
        return new a0(Collections.singletonList(xVar), pVar);
    }

    public static a0 e(List<x> list, p pVar) {
        x2.g.h(list, "qualities cannot be null");
        x2.g.h(pVar, "fallbackStrategy cannot be null");
        x2.g.b(!list.isEmpty(), "qualities cannot be empty");
        c(list);
        return new a0(list, pVar);
    }

    public static Size g(h1.i iVar) {
        return iVar.k().k();
    }

    public static Map<x, Size> h(h1 h1Var, g0.k0 k0Var) {
        HashMap map = new HashMap();
        for (x xVar : h1Var.e(k0Var)) {
            h1.i iVarD = h1Var.d(xVar, k0Var);
            Objects.requireNonNull(iVarD);
            map.put(xVar, g(iVarD));
        }
        return map;
    }

    public final void a(List<x> list, Set<x> set) {
        if (list.isEmpty() || set.containsAll(list)) {
            return;
        }
        g0.r1.a("QualitySelector", "Select quality by fallbackStrategy = " + this.b);
        p pVar = this.b;
        if (pVar == p.f15905a) {
            return;
        }
        x2.g.j(pVar instanceof p.b, "Currently only support type RuleStrategy");
        p.b bVar = (p.b) this.b;
        List<x> listB = x.b();
        x xVarC = bVar.c() == x.f16054f ? listB.get(0) : bVar.c() == x.f16053e ? listB.get(listB.size() - 1) : bVar.c();
        x2.g.i(listB.indexOf(xVarC) != -1);
        ArrayList arrayList = new ArrayList();
        for (int i10 = r4 - 1; i10 >= 0; i10--) {
            x xVar = listB.get(i10);
            if (list.contains(xVar)) {
                arrayList.add(xVar);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i11 = r4 + 1; i11 < listB.size(); i11++) {
            x xVar2 = listB.get(i11);
            if (list.contains(xVar2)) {
                arrayList2.add(xVar2);
            }
        }
        g0.r1.a("QualitySelector", "sizeSortedQualities = " + listB + ", fallback quality = " + xVarC + ", largerQualities = " + arrayList + ", smallerQualities = " + arrayList2);
        int iD = bVar.d();
        if (iD != 0) {
            if (iD == 1) {
                set.addAll(arrayList);
                set.addAll(arrayList2);
                return;
            }
            if (iD == 2) {
                set.addAll(arrayList);
                return;
            }
            if (iD != 3) {
                if (iD == 4) {
                    set.addAll(arrayList2);
                    return;
                }
                throw new AssertionError("Unhandled fallback strategy: " + this.b);
            }
            set.addAll(arrayList2);
            set.addAll(arrayList);
        }
    }

    @SuppressLint({"UsesNonDefaultVisibleForTesting"})
    public List<x> f(List<x> list) {
        if (list.isEmpty()) {
            g0.r1.l("QualitySelector", "No supported quality on the device.");
            return new ArrayList();
        }
        g0.r1.a("QualitySelector", "supportedQualities = " + list);
        Set<x> linkedHashSet = new LinkedHashSet<>();
        for (x xVar : this.f15802a) {
            if (xVar == x.f16054f) {
                linkedHashSet.addAll(list);
                break;
            }
            if (xVar == x.f16053e) {
                ArrayList arrayList = new ArrayList(list);
                Collections.reverse(arrayList);
                linkedHashSet.addAll(arrayList);
                break;
            }
            if (list.contains(xVar)) {
                linkedHashSet.add(xVar);
            } else {
                g0.r1.l("QualitySelector", "quality is not supported and will be ignored: " + xVar);
            }
        }
        a(list, linkedHashSet);
        return new ArrayList(linkedHashSet);
    }

    public String toString() {
        return "QualitySelector{preferredQualities=" + this.f15802a + ", fallbackStrategy=" + this.b + "}";
    }
}
