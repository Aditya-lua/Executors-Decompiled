package p589z;

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
import p001a0.C0008c0;
import p020b0.C1177c;
import p020b0.C1179e;
import p140g0.C5902k0;
import p140g0.C5931r1;
import p296n0.AbstractC8754g;
import p296n0.InterfaceC8771i4;
import p533x2.C12637g;

/* JADX INFO: renamed from: z.r3 */
/* JADX INFO: loaded from: classes.dex */
public final class C13613r3 {

    /* JADX INFO: renamed from: a */
    public final C0008c0 f47647a;

    /* JADX INFO: renamed from: b */
    public final C1179e f47648b;

    /* JADX INFO: renamed from: c */
    public final boolean f47649c;

    /* JADX INFO: renamed from: z.r3$a */
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static C5902k0 m49599a(C0008c0 c0008c0) {
            Long l10 = (Long) c0008c0.m9a(CameraCharacteristics.REQUEST_RECOMMENDED_TEN_BIT_DYNAMIC_RANGE_PROFILE);
            if (l10 != null) {
                return C1177c.m6540b(l10.longValue());
            }
            return null;
        }
    }

    public C13613r3(C0008c0 c0008c0) {
        this.f47647a = c0008c0;
        this.f47648b = C1179e.m6542a(c0008c0);
        int[] iArr = (int[]) c0008c0.m9a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        boolean z10 = false;
        if (iArr != null) {
            for (int i10 : iArr) {
                if (i10 == 18) {
                    z10 = true;
                    break;
                }
            }
        }
        this.f47649c = z10;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m49589a(C5902k0 c5902k0, C5902k0 c5902k1) {
        C12637g.m47078j(c5902k1.m26519e(), "Fully specified range is not actually fully specified.");
        if (c5902k0.m26517b() == 2 && c5902k1.m26517b() == 1) {
            return false;
        }
        if (c5902k0.m26517b() == 2 || c5902k0.m26517b() == 0 || c5902k0.m26517b() == c5902k1.m26517b()) {
            return c5902k0.m26516a() == 0 || c5902k0.m26516a() == c5902k1.m26516a();
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m49590b(C5902k0 c5902k0, C5902k0 c5902k1, Set<C5902k0> set) {
        if (set.contains(c5902k1)) {
            return m49589a(c5902k0, c5902k1);
        }
        C5931r1.m26561a("DynamicRangeResolver", String.format("Candidate Dynamic range is not within constraints.\nDynamic range to resolve:\n  %s\nCandidate dynamic range:\n  %s", c5902k0, c5902k1));
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static C5902k0 m49591c(C5902k0 c5902k0, Collection<C5902k0> collection, Set<C5902k0> set) {
        if (c5902k0.m26517b() == 1) {
            return null;
        }
        for (C5902k0 c5902k1 : collection) {
            C12637g.m47076h(c5902k1, "Fully specified DynamicRange cannot be null.");
            int iM26517b = c5902k1.m26517b();
            C12637g.m47078j(c5902k1.m26519e(), "Fully specified DynamicRange must have fully defined encoding.");
            if (iM26517b != 1 && m49590b(c5902k0, c5902k1, set)) {
                return c5902k1;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m49592e(C5902k0 c5902k0) {
        return Objects.equals(c5902k0, C5902k0.f22549c);
    }

    /* JADX INFO: renamed from: f */
    public static boolean m49593f(C5902k0 c5902k0) {
        if (c5902k0.m26517b() == 2) {
            return true;
        }
        if (c5902k0.m26517b() == 0 || c5902k0.m26516a() != 0) {
            return c5902k0.m26517b() == 0 && c5902k0.m26516a() != 0;
        }
        return true;
    }

    /* JADX INFO: renamed from: j */
    public static void m49594j(Set<C5902k0> set, C5902k0 c5902k0, C1179e c1179e) {
        C12637g.m47078j(!set.isEmpty(), "Cannot update already-empty constraints.");
        Set<C5902k0> setM6544b = c1179e.m6544b(c5902k0);
        if (setM6544b.isEmpty()) {
            return;
        }
        HashSet hashSet = new HashSet(set);
        set.retainAll(setM6544b);
        if (set.isEmpty()) {
            throw new IllegalArgumentException(String.format("Constraints of dynamic range cannot be combined with existing constraints.\nDynamic range:\n  %s\nConstraints:\n  %s\nExisting constraints:\n  %s", c5902k0, TextUtils.join("\n  ", setM6544b), TextUtils.join("\n  ", hashSet)));
        }
    }

    /* JADX INFO: renamed from: d */
    public boolean m49595d() {
        return this.f47649c;
    }

    /* JADX INFO: renamed from: g */
    public Map<InterfaceC8771i4<?>, C5902k0> m49596g(List<AbstractC8754g> list, List<InterfaceC8771i4<?>> list2, List<Integer> list3) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<AbstractC8754g> it = list.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(it.next().mo35096c());
        }
        Set<C5902k0> setM6545c = this.f47648b.m6545c();
        HashSet hashSet = new HashSet(setM6545c);
        Iterator<C5902k0> it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            m49594j(hashSet, it2.next(), this.f47648b);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator<Integer> it3 = list3.iterator();
        while (it3.hasNext()) {
            InterfaceC8771i4<?> interfaceC8771i4 = list2.get(it3.next().intValue());
            C5902k0 c5902k0M35143M = interfaceC8771i4.m35143M();
            if (m49592e(c5902k0M35143M)) {
                arrayList3.add(interfaceC8771i4);
            } else if (m49593f(c5902k0M35143M)) {
                arrayList2.add(interfaceC8771i4);
            } else {
                arrayList.add(interfaceC8771i4);
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
            InterfaceC8771i4<?> interfaceC8771i5 = (InterfaceC8771i4) obj;
            C5902k0 c5902k0M49598i = m49598i(setM6545c, linkedHashSet, linkedHashSet2, interfaceC8771i5, hashSet);
            map.put(interfaceC8771i5, c5902k0M49598i);
            if (!linkedHashSet.contains(c5902k0M49598i)) {
                linkedHashSet2.add(c5902k0M49598i);
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: h */
    public final C5902k0 m49597h(C5902k0 c5902k0, Set<C5902k0> set, Set<C5902k0> set2, Set<C5902k0> set3, String str) {
        C5902k0 c5902k0M49599a;
        if (c5902k0.m26519e()) {
            if (set.contains(c5902k0)) {
                return c5902k0;
            }
            return null;
        }
        int iM26517b = c5902k0.m26517b();
        int iM26516a = c5902k0.m26516a();
        if (iM26517b == 1 && iM26516a == 0) {
            C5902k0 c5902k1 = C5902k0.f22550d;
            if (set.contains(c5902k1)) {
                return c5902k1;
            }
            return null;
        }
        C5902k0 c5902k0M49591c = m49591c(c5902k0, set2, set);
        if (c5902k0M49591c != null) {
            C5931r1.m26561a("DynamicRangeResolver", String.format("Resolved dynamic range for use case %s from existing attached surface.\n%s\n->\n%s", str, c5902k0, c5902k0M49591c));
            return c5902k0M49591c;
        }
        C5902k0 c5902k0M49591c2 = m49591c(c5902k0, set3, set);
        if (c5902k0M49591c2 != null) {
            C5931r1.m26561a("DynamicRangeResolver", String.format("Resolved dynamic range for use case %s from concurrently bound use case.\n%s\n->\n%s", str, c5902k0, c5902k0M49591c2));
            return c5902k0M49591c2;
        }
        C5902k0 c5902k2 = C5902k0.f22550d;
        if (m49590b(c5902k0, c5902k2, set)) {
            C5931r1.m26561a("DynamicRangeResolver", String.format("Resolved dynamic range for use case %s to no compatible HDR dynamic ranges.\n%s\n->\n%s", str, c5902k0, c5902k2));
            return c5902k2;
        }
        if (iM26517b == 2 && (iM26516a == 10 || iM26516a == 0)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            if (Build.VERSION.SDK_INT >= 33) {
                c5902k0M49599a = a.m49599a(this.f47647a);
                if (c5902k0M49599a != null) {
                    linkedHashSet.add(c5902k0M49599a);
                }
            } else {
                c5902k0M49599a = null;
            }
            linkedHashSet.add(C5902k0.f22552f);
            C5902k0 c5902k0M49591c3 = m49591c(c5902k0, linkedHashSet, set);
            if (c5902k0M49591c3 != null) {
                C5931r1.m26561a("DynamicRangeResolver", String.format("Resolved dynamic range for use case %s from %s 10-bit supported dynamic range.\n%s\n->\n%s", str, c5902k0M49591c3.equals(c5902k0M49599a) ? "recommended" : "required", c5902k0, c5902k0M49591c3));
                return c5902k0M49591c3;
            }
        }
        for (C5902k0 c5902k3 : set) {
            C12637g.m47078j(c5902k3.m26519e(), "Candidate dynamic range must be fully specified.");
            if (!c5902k3.equals(C5902k0.f22550d) && m49589a(c5902k0, c5902k3)) {
                C5931r1.m26561a("DynamicRangeResolver", String.format("Resolved dynamic range for use case %s from validated dynamic range constraints or supported HDR dynamic ranges.\n%s\n->\n%s", str, c5902k0, c5902k3));
                return c5902k3;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public final C5902k0 m49598i(Set<C5902k0> set, Set<C5902k0> set2, Set<C5902k0> set3, InterfaceC8771i4<?> interfaceC8771i4, Set<C5902k0> set4) {
        C5902k0 c5902k0M35143M = interfaceC8771i4.m35143M();
        C5902k0 c5902k0M49597h = m49597h(c5902k0M35143M, set4, set2, set3, interfaceC8771i4.m42044a0());
        if (c5902k0M49597h == null) {
            throw new IllegalArgumentException(String.format("Unable to resolve supported dynamic range. The dynamic range may not be supported on the device or may not be allowed concurrently with other attached use cases.\nUse case:\n  %s\nRequested dynamic range:\n  %s\nSupported dynamic ranges:\n  %s\nConstrained set of concurrent dynamic ranges:\n  %s", interfaceC8771i4.m42044a0(), c5902k0M35143M, TextUtils.join("\n  ", set), TextUtils.join("\n  ", set4)));
        }
        m49594j(set4, c5902k0M49597h, this.f47648b);
        return c5902k0M49597h;
    }
}
