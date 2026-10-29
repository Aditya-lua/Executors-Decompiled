package p020b0;

import android.hardware.camera2.params.DynamicRangeProfiles;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import p140g0.C5902k0;
import p140g0.C5931r1;
import p533x2.C12637g;

/* JADX INFO: renamed from: b0.f */
/* JADX INFO: loaded from: classes.dex */
public class C1180f implements C1179e.a {

    /* JADX INFO: renamed from: a */
    public final DynamicRangeProfiles f4923a;

    public C1180f(Object obj) {
        this.f4923a = (DynamicRangeProfiles) obj;
    }

    /* JADX INFO: renamed from: e */
    public static Set<C5902k0> m6550e(Set<Long> set) {
        if (set.isEmpty()) {
            return Collections.EMPTY_SET;
        }
        HashSet hashSet = new HashSet(set.size());
        Iterator<Long> it = set.iterator();
        while (it.hasNext()) {
            C5902k0 c5902k0M6551f = m6551f(it.next().longValue());
            if (c5902k0M6551f != null) {
                hashSet.add(c5902k0M6551f);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    /* JADX INFO: renamed from: f */
    public static C5902k0 m6551f(long j10) {
        C5902k0 c5902k0M6540b = C1177c.m6540b(j10);
        if (c5902k0M6540b == null) {
            C5931r1.m26572l("DynamicRangesCompatApi33Impl", "Dynamic range profile cannot be converted to a DynamicRange object: " + j10);
        }
        return c5902k0M6540b;
    }

    @Override // p020b0.C1179e.a
    /* JADX INFO: renamed from: a */
    public DynamicRangeProfiles mo6547a() {
        return this.f4923a;
    }

    /* JADX INFO: renamed from: b */
    public final Long m6552b(C5902k0 c5902k0) {
        return C1177c.m6539a(c5902k0, this.f4923a);
    }

    @Override // p020b0.C1179e.a
    /* JADX INFO: renamed from: c */
    public Set<C5902k0> mo6548c() {
        return m6550e(this.f4923a.getSupportedProfiles());
    }

    @Override // p020b0.C1179e.a
    /* JADX INFO: renamed from: d */
    public Set<C5902k0> mo6549d(C5902k0 c5902k0) {
        Long lM6552b = m6552b(c5902k0);
        C12637g.m47070b(lM6552b != null, "DynamicRange is not supported: " + c5902k0);
        return m6550e(this.f4923a.getProfileCaptureRequestConstraints(lM6552b.longValue()));
    }
}
