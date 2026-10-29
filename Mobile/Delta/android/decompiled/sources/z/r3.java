package z;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class r3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0.c0 f36793a;
    public final b0.e b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f36794c;

    public static final class a {
        public static g0.k0 a(a0.c0 c0Var) {
            Long l10 = (Long) c0Var.a(CameraCharacteristics.REQUEST_RECOMMENDED_TEN_BIT_DYNAMIC_RANGE_PROFILE);
            if (l10 != null) {
                return b0.c.b(l10.longValue());
            }
            return null;
        }
    }

    public r3(a0.c0 c0Var) {
        this.f36793a = c0Var;
        this.b = b0.e.a(c0Var);
        int[] iArr = (int[]) c0Var.a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        boolean z10 = false;
        if (iArr != null) {
            for (int i10 : iArr) {
                if (i10 == 18) {
                    z10 = true;
                    break;
                }
            }
        }
        this.f36794c = z10;
    }

    public static boolean a(g0.k0 k0Var, g0.k0 k0Var2) {
        x2.g.j(k0Var2.e(), "Fully specified range is not actually fully specified.");
        if (k0Var.b() == 2 && k0Var2.b() == 1) {
            return false;
        }
        if (k0Var.b() == 2 || k0Var.b() == 0 || k0Var.b() == k0Var2.b()) {
            return k0Var.a() == 0 || k0Var.a() == k0Var2.a();
        }
        return false;
    }

    public static boolean b(g0.k0 k0Var, g0.k0 k0Var2, Set<g0.k0> set) {
        if (set.contains(k0Var2)) {
            return a(k0Var, k0Var2);
        }
        g0.r1.a("DynamicRangeResolver", String.format("Candidate Dynamic range is not within constraints.\nDynamic range to resolve:\n  %s\nCandidate dynamic range:\n  %s", k0Var, k0Var2));
        return false;
    }

    public static g0.k0 c(g0.k0 k0Var, Collection<g0.k0> collection, Set<g0.k0> set) {
        if (k0Var.b() == 1) {
            return null;
        }
        for (g0.k0 k0Var2 : collection) {
            x2.g.h(k0Var2, "Fully specified DynamicRange cannot be null.");
            int iB = k0Var2.b();
            x2.g.j(k0Var2.e(), "Fully specified DynamicRange must have fully defined encoding.");
            if (iB != 1 && b(k0Var, k0Var2, set)) {
                return k0Var2;
            }
        }
        return null;
    }

    public static boolean e(g0.k0 k0Var) {
        return Objects.equals(k0Var, g0.k0.f17469c);
    }

    public static boolean f(g0.k0 k0Var) {
        if (k0Var.b() == 2) {
            return true;
        }
        if (k0Var.b() == 0 || k0Var.a() != 0) {
            return k0Var.b() == 0 && k0Var.a() != 0;
        }
        return true;
    }

    public static void j(Set<g0.k0> set, g0.k0 k0Var, b0.e eVar) {
        x2.g.j(!set.isEmpty(), "Cannot update already-empty constraints.");
        Set<g0.k0> setB = eVar.b(k0Var);
        if (setB.isEmpty()) {
            return;
        }
        HashSet hashSet = new HashSet(set);
        set.retainAll(setB);
        if (set.isEmpty()) {
            throw new IllegalArgumentException(String.format("Constraints of dynamic range cannot be combined with existing constraints.\nDynamic range:\n  %s\nConstraints:\n  %s\nExisting constraints:\n  %s", k0Var, TextUtils.join("\n  ", setB), TextUtils.join("\n  ", hashSet)));
        }
    }

    public boolean d() {
        return this.f36794c;
    }

    public Map<n0.i4<?>, g0.k0> g(List<n0.g> list, List<n0.i4<?>> list2, List<Integer> list3) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<n0.g> it = list.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(it.next().c());
        }
        Set<g0.k0> setC = this.b.c();
        HashSet hashSet = new HashSet(setC);
        Iterator<g0.k0> it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            j(hashSet, it2.next(), this.b);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator<Integer> it3 = list3.iterator();
        while (it3.hasNext()) {
            n0.i4<?> i4Var = list2.get(it3.next().intValue());
            g0.k0 k0VarM = i4Var.M();
            if (e(k0VarM)) {
                arrayList3.add(i4Var);
            } else if (f(k0VarM)) {
                arrayList2.add(i4Var);
            } else {
                arrayList.add(i4Var);
            }
        }
        HashMap map = new HashMap();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        ArrayList arrayList4 = new ArrayList();
        arrayList4.addAll(arrayList);
        arrayList4.addAll(arrayList2);
        arrayList4.addAll(arrayList3);
        int size = arrayList4.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList4.get(i10);
            i10++;
            n0.i4<?> i4Var2 = (n0.i4) obj;
            g0.k0 k0VarI = i(setC, linkedHashSet, linkedHashSet2, i4Var2, hashSet);
            map.put(i4Var2, k0VarI);
            if (!linkedHashSet.contains(k0VarI)) {
                linkedHashSet2.add(k0VarI);
            }
        }
        return map;
    }

    public final g0.k0 h(g0.k0 k0Var, Set<g0.k0> set, Set<g0.k0> set2, Set<g0.k0> set3, String str) {
        g0.k0 k0VarA;
        if (k0Var.e()) {
            if (set.contains(k0Var)) {
                return k0Var;
            }
            return null;
        }
        int iB = k0Var.b();
        int iA = k0Var.a();
        if (iB == 1 && iA == 0) {
            g0.k0 k0Var2 = g0.k0.f17470d;
            if (set.contains(k0Var2)) {
                return k0Var2;
            }
            return null;
        }
        g0.k0 k0VarC = c(k0Var, set2, set);
        if (k0VarC != null) {
            g0.r1.a("DynamicRangeResolver", String.format("Resolved dynamic range for use case %s from existing attached surface.\n%s\n->\n%s", str, k0Var, k0VarC));
            return k0VarC;
        }
        g0.k0 k0VarC2 = c(k0Var, set3, set);
        if (k0VarC2 != null) {
            g0.r1.a("DynamicRangeResolver", String.format("Resolved dynamic range for use case %s from concurrently bound use case.\n%s\n->\n%s", str, k0Var, k0VarC2));
            return k0VarC2;
        }
        g0.k0 k0Var3 = g0.k0.f17470d;
        if (b(k0Var, k0Var3, set)) {
            g0.r1.a("DynamicRangeResolver", String.format("Resolved dynamic range for use case %s to no compatible HDR dynamic ranges.\n%s\n->\n%s", str, k0Var, k0Var3));
            return k0Var3;
        }
        if (iB == 2 && (iA == 10 || iA == 0)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            if (Build.VERSION.SDK_INT >= 33) {
                k0VarA = a.a(this.f36793a);
                if (k0VarA != null) {
                    linkedHashSet.add(k0VarA);
                }
            } else {
                k0VarA = null;
            }
            linkedHashSet.add(g0.k0.f17472f);
            g0.k0 k0VarC3 = c(k0Var, linkedHashSet, set);
            if (k0VarC3 != null) {
                g0.r1.a("DynamicRangeResolver", String.format("Resolved dynamic range for use case %s from %s 10-bit supported dynamic range.\n%s\n->\n%s", str, k0VarC3.equals(k0VarA) ? "recommended" : "required", k0Var, k0VarC3));
                return k0VarC3;
            }
        }
        for (g0.k0 k0Var4 : set) {
            x2.g.j(k0Var4.e(), "Candidate dynamic range must be fully specified.");
            if (!k0Var4.equals(g0.k0.f17470d) && a(k0Var, k0Var4)) {
                g0.r1.a("DynamicRangeResolver", String.format("Resolved dynamic range for use case %s from validated dynamic range constraints or supported HDR dynamic ranges.\n%s\n->\n%s", str, k0Var, k0Var4));
                return k0Var4;
            }
        }
        return null;
    }

    public final g0.k0 i(Set<g0.k0> set, Set<g0.k0> set2, Set<g0.k0> set3, n0.i4<?> i4Var, Set<g0.k0> set4) {
        g0.k0 k0VarM = i4Var.M();
        g0.k0 k0VarH = h(k0VarM, set4, set2, set3, i4Var.a0());
        if (k0VarH == null) {
            throw new IllegalArgumentException(String.format("Unable to resolve supported dynamic range. The dynamic range may not be supported on the device or may not be allowed concurrently with other attached use cases.\nUse case:\n  %s\nRequested dynamic range:\n  %s\nSupported dynamic ranges:\n  %s\nConstrained set of concurrent dynamic ranges:\n  %s", i4Var.a0(), k0VarM, TextUtils.join("\n  ", set), TextUtils.join("\n  ", set4)));
        }
        j(set4, k0VarH, this.b);
        return k0VarH;
    }
}
