package p589z;

import android.content.Context;
import android.media.CamcorderProfile;
import android.os.Build;
import android.util.Size;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p001a0.C0034p0;
import p140g0.C5953x;
import p204j0.InterfaceC7011a;
import p296n0.AbstractC8754g;
import p296n0.C8768i1;
import p296n0.EnumC8832u3;
import p296n0.InterfaceC8771i4;
import p296n0.InterfaceC8789m0;
import p296n0.SurfaceConfig;
import p296n0.SurfaceStreamSpecQueryResult;
import p533x2.C12637g;
import p561y.C12976m;

/* JADX INFO: renamed from: z.l2 */
/* JADX INFO: loaded from: classes.dex */
public final class C13566l2 implements InterfaceC8789m0 {

    /* JADX INFO: renamed from: a */
    public final Object f47506a;

    /* JADX INFO: renamed from: b */
    public final Map<String, C13529g5> f47507b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC13523g f47508c;

    /* JADX INFO: renamed from: d */
    public final C0034p0 f47509d;

    /* JADX INFO: renamed from: e */
    public final Context f47510e;

    /* JADX INFO: renamed from: z.l2$a */
    public class a implements InterfaceC13523g {
        @Override // p589z.InterfaceC13523g
        /* JADX INFO: renamed from: a */
        public CamcorderProfile mo49232a(int i10, int i11) {
            return CamcorderProfile.get(i10, i11);
        }

        @Override // p589z.InterfaceC13523g
        /* JADX INFO: renamed from: b */
        public boolean mo49233b(int i10, int i11) {
            return CamcorderProfile.hasProfile(i10, i11);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C13566l2(Context context, Object obj, Set<String> set) {
        this(context, new a(), obj, set);
    }

    @Override // p296n0.InterfaceC8789m0
    /* JADX INFO: renamed from: b */
    public SurfaceConfig mo35277b(int i10, String str, int i11, Size size, EnumC8832u3 enumC8832u3) {
        C13529g5 c13529g5 = this.f47507b.get(str);
        C12637g.m47070b(c13529g5 != null, "No such camera id in supported combination list: " + str);
        return c13529g5.m49317a0(i10, i11, size, enumC8832u3);
    }

    @Override // p296n0.InterfaceC8786l2
    /* JADX INFO: renamed from: f */
    public void mo23117f(List<String> list) throws C8768i1 {
        HashSet<String> hashSet;
        HashMap map = new HashMap();
        synchronized (this.f47506a) {
            hashSet = new HashSet(list);
            hashSet.removeAll(this.f47507b.keySet());
        }
        try {
            for (String str : hashSet) {
                map.put(str, m49499i(str));
            }
            synchronized (this.f47506a) {
                try {
                    HashMap map2 = new HashMap();
                    for (String str2 : list) {
                        if (this.f47507b.containsKey(str2)) {
                            map2.put(str2, this.f47507b.get(str2));
                        } else {
                            map2.put(str2, (C13529g5) map.get(str2));
                        }
                    }
                    this.f47507b.clear();
                    this.f47507b.putAll(map2);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (C5953x | RuntimeException e10) {
            throw new C8768i1("Failed to create SupportedSurfaceCombination", e10);
        }
    }

    @Override // p296n0.InterfaceC8789m0
    /* JADX INFO: renamed from: g */
    public SurfaceStreamSpecQueryResult mo35278g(int i10, String str, List<AbstractC8754g> list, Map<InterfaceC8771i4<?>, List<Size>> map, boolean z10, boolean z11, boolean z12, boolean z13) {
        C12637g.m47070b(!map.isEmpty(), "No new use cases to be bound.");
        C13529g5 c13529g5 = this.f47507b.get(str);
        C12637g.m47070b(c13529g5 != null, "No such camera id in supported combination list: " + str);
        return c13529g5.m49304K(i10, list, map, z10, z11, z12, z13);
    }

    /* JADX INFO: renamed from: i */
    public final C13529g5 m49499i(String str) {
        InterfaceC7011a c12976m = InterfaceC7011a.f27455b;
        if (Build.VERSION.SDK_INT >= 35) {
            c12976m = new C12976m(this.f47510e, str, this.f47509d);
        }
        return new C13529g5(this.f47510e, str, this.f47509d, this.f47508c, c12976m);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C13566l2(Context context, InterfaceC13523g interfaceC13523g, Object obj, Set<String> set) throws C5953x {
        this.f47506a = new Object();
        this.f47507b = new HashMap();
        C12637g.m47075g(interfaceC13523g);
        this.f47508c = interfaceC13523g;
        this.f47510e = context;
        if (obj instanceof C0034p0) {
            this.f47509d = (C0034p0) obj;
        } else {
            this.f47509d = C0034p0.m62a(context);
        }
        try {
            mo23117f(new ArrayList(set));
        } catch (C8768i1 e10) {
            if (!(e10.getCause() instanceof C5953x)) {
                throw new C5953x(3, e10);
            }
            throw ((C5953x) e10.getCause());
        }
    }
}
