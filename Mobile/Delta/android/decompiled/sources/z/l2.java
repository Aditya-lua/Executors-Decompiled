package z;

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
import n0.SurfaceConfig;
import n0.SurfaceStreamSpecQueryResult;

/* JADX INFO: loaded from: classes.dex */
public final class l2 implements n0.m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f36679a;
    public final Map<String, g5> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f36680c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a0.p0 f36681d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f36682e;

    public class a implements g {
        @Override // z.g
        public CamcorderProfile a(int i10, int i11) {
            return CamcorderProfile.get(i10, i11);
        }

        @Override // z.g
        public boolean b(int i10, int i11) {
            return CamcorderProfile.hasProfile(i10, i11);
        }
    }

    public l2(Context context, Object obj, Set<String> set) {
        this(context, new a(), obj, set);
    }

    @Override // n0.m0
    public SurfaceConfig b(int i10, String str, int i11, Size size, n0.u3 u3Var) {
        g5 g5Var = this.b.get(str);
        x2.g.b(g5Var != null, "No such camera id in supported combination list: " + str);
        return g5Var.a0(i10, i11, size, u3Var);
    }

    @Override // n0.l2
    public void f(List<String> list) throws n0.i1 {
        HashSet<String> hashSet;
        HashMap map = new HashMap();
        synchronized (this.f36679a) {
            hashSet = new HashSet(list);
            hashSet.removeAll(this.b.keySet());
        }
        try {
            for (String str : hashSet) {
                map.put(str, i(str));
            }
            synchronized (this.f36679a) {
                try {
                    HashMap map2 = new HashMap();
                    for (String str2 : list) {
                        if (this.b.containsKey(str2)) {
                            map2.put(str2, this.b.get(str2));
                        } else {
                            map2.put(str2, (g5) map.get(str2));
                        }
                    }
                    this.b.clear();
                    this.b.putAll(map2);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (g0.x | RuntimeException e10) {
            throw new n0.i1("Failed to create SupportedSurfaceCombination", e10);
        }
    }

    @Override // n0.m0
    public SurfaceStreamSpecQueryResult g(int i10, String str, List<n0.g> list, Map<n0.i4<?>, List<Size>> map, boolean z10, boolean z11, boolean z12, boolean z13) {
        x2.g.b(!map.isEmpty(), "No new use cases to be bound.");
        g5 g5Var = this.b.get(str);
        x2.g.b(g5Var != null, "No such camera id in supported combination list: " + str);
        return g5Var.K(i10, list, map, z10, z11, z12, z13);
    }

    public final g5 i(String str) {
        j0.a mVar = j0.a.b;
        if (Build.VERSION.SDK_INT >= 35) {
            mVar = new y.m(this.f36682e, str, this.f36681d);
        }
        return new g5(this.f36682e, str, this.f36681d, this.f36680c, mVar);
    }

    public l2(Context context, g gVar, Object obj, Set<String> set) throws g0.x {
        this.f36679a = new Object();
        this.b = new HashMap();
        x2.g.g(gVar);
        this.f36680c = gVar;
        this.f36682e = context;
        if (obj instanceof a0.p0) {
            this.f36681d = (a0.p0) obj;
        } else {
            this.f36681d = a0.p0.a(context);
        }
        try {
            f(new ArrayList(set));
        } catch (n0.i1 e10) {
            if (!(e10.getCause() instanceof g0.x)) {
                throw new g0.x(3, e10);
            }
            throw ((g0.x) e10.getCause());
        }
    }
}
