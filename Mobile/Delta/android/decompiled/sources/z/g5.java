package z;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.CamcorderProfile;
import android.media.MediaRecorder;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import k0.FpsRangeFeature;
import kotlin.jvm.functions.Function0;
import n0.SurfaceConfig;
import n0.SurfaceStreamSpecQueryResult;

/* JADX INFO: loaded from: classes.dex */
public final class g5 {
    public final r3 B;
    public final m4 C;
    public final j0.a D;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f36561k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final g f36562l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final a0.c0 f36563m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final d0.f f36564n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f36565o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f36566p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f36567q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f36568r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f36569s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f36570t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f36571u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f36572v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public n0.x3 f36573w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final q3 f36575y;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<n0.v3> f36552a = new ArrayList();
    public final List<n0.v3> b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<n0.v3> f36553c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<n0.v3> f36554d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<n0.v3> f36555e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List<n0.v3> f36556f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Map<d, List<n0.v3>> f36557g = new HashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List<n0.v3> f36558h = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List<n0.v3> f36559i = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List<n0.v3> f36560j = new ArrayList();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public List<Integer> f36574x = new ArrayList();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final d0.x f36576z = new d0.x();
    public final d0.t A = new d0.t();

    public static class a {
        public static Size[] a(StreamConfigurationMap streamConfigurationMap, int i10) {
            return streamConfigurationMap.getHighResolutionOutputSizes(i10);
        }
    }

    public static abstract class b {
        public static b f(List<Size> list, List<Size> list2, int i10, int i11, int i12) {
            return new e(list, list2, i10, i11, i12);
        }

        public abstract List<Size> a();

        public abstract List<Size> b();

        public abstract int c();

        public abstract int d();

        public abstract int e();
    }

    public enum c {
        WITHOUT_FEATURE_COMBO,
        WITH_FEATURE_COMBO,
        WITHOUT_FEATURE_COMBO_FIRST_AND_THEN_WITH_IT
    }

    public static abstract class d {
        public static d j(int i10, boolean z10, int i11, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, Range<Integer> range, boolean z16) {
            return new f(i10, z10, i11, z11, z12, z13, z14, z15, range, z16);
        }

        public abstract int a();

        public abstract int b();

        public abstract Range<Integer> c();

        public abstract boolean d();

        public abstract boolean e();

        public abstract boolean f();

        public abstract boolean g();

        public abstract boolean h();

        public abstract boolean i();

        public abstract boolean k();
    }

    public g5(Context context, String str, a0.p0 p0Var, g gVar, j0.a aVar) throws g0.x {
        this.f36566p = false;
        this.f36567q = false;
        this.f36570t = false;
        this.f36571u = false;
        String str2 = (String) x2.g.g(str);
        this.f36561k = str2;
        this.f36562l = (g) x2.g.g(gVar);
        this.f36564n = new d0.f();
        this.f36575y = q3.c(context);
        try {
            a0.c0 c0VarC = p0Var.c(str2);
            this.f36563m = c0VarC;
            Integer num = (Integer) c0VarC.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
            this.f36565o = num != null ? num.intValue() : 2;
            int[] iArr = (int[]) c0VarC.a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
            if (iArr != null) {
                for (int i10 : iArr) {
                    if (i10 == 3) {
                        this.f36566p = true;
                    } else if (i10 == 6) {
                        this.f36567q = true;
                    } else if (Build.VERSION.SDK_INT >= 31 && i10 == 16) {
                        this.f36570t = true;
                    } else if (i10 == 1) {
                        this.f36571u = true;
                    }
                }
            }
            r3 r3Var = new r3(this.f36563m);
            this.B = r3Var;
            this.C = new m4(this.f36563m);
            q();
            if (this.f36570t) {
                t();
            }
            boolean zHasSystemFeature = context.getPackageManager().hasSystemFeature("android.hardware.camera.concurrent");
            this.f36568r = zHasSystemFeature;
            if (zHasSystemFeature) {
                l();
            }
            if (r3Var.d()) {
                k();
            }
            boolean zH = c5.h(this.f36563m);
            this.f36569s = zH;
            if (zH) {
                p();
            }
            boolean zA = y5.a(this.f36563m);
            this.f36572v = zA;
            if (zA) {
                o();
            }
            r();
            d();
            this.D = aVar;
        } catch (a0.f e10) {
            throw a3.a(e10);
        }
    }

    public static Size[] D(StreamConfigurationMap streamConfigurationMap, int i10, Rational rational) {
        Size[] outputSizes;
        try {
            outputSizes = i10 == 34 ? streamConfigurationMap.getOutputSizes(SurfaceTexture.class) : streamConfigurationMap.getOutputSizes(i10);
        } catch (Throwable unused) {
            outputSizes = null;
        }
        if (outputSizes == null || outputSizes.length == 0) {
            return null;
        }
        if (rational == null) {
            return outputSizes;
        }
        ArrayList arrayList = new ArrayList();
        for (Size size : outputSizes) {
            if (p0.a.a(size, rational)) {
                arrayList.add(size);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return (Size[]) arrayList.toArray(new Size[0]);
    }

    public static int E(Range<Integer> range, Range<Integer> range2) {
        x2.g.j((range.contains((Integer) range2.getUpper()) || range.contains((Integer) range2.getLower())) ? false : true, "Ranges must not intersect");
        return ((Integer) range.getLower()).intValue() > ((Integer) range2.getUpper()).intValue() ? ((Integer) range.getLower()).intValue() - ((Integer) range2.getUpper()).intValue() : ((Integer) range2.getLower()).intValue() - ((Integer) range.getUpper()).intValue();
    }

    public static int F(Range<Integer> range) {
        return (((Integer) range.getUpper()).intValue() - ((Integer) range.getLower()).intValue()) + 1;
    }

    public static int J(Map<n0.i4<?>, g0.k0> map) {
        Iterator<g0.k0> it = map.values().iterator();
        while (it.hasNext()) {
            if (it.next().a() == 10) {
                return 10;
            }
        }
        return 8;
    }

    public static List<Integer> R(List<n0.i4<?>> list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator<n0.i4<?>> it = list.iterator();
        while (it.hasNext()) {
            int iB = it.next().B(0);
            if (!arrayList2.contains(Integer.valueOf(iB))) {
                arrayList2.add(Integer.valueOf(iB));
            }
        }
        Collections.sort(arrayList2);
        Collections.reverse(arrayList2);
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            int iIntValue = ((Integer) obj).intValue();
            for (n0.i4<?> i4Var : list) {
                if (iIntValue == i4Var.B(0)) {
                    arrayList.add(Integer.valueOf(list.indexOf(i4Var)));
                }
            }
        }
        return arrayList;
    }

    public static boolean S(int i10, Range<Integer> range, int i11) {
        return n0.t3.f24861a.equals(range) || i11 >= i10 || i11 >= ((Integer) range.getUpper()).intValue();
    }

    public static boolean U(List<n0.g> list, Map<n0.i4<?>, List<Size>> map) {
        Iterator<n0.g> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().d() == 4101) {
                return true;
            }
        }
        Iterator<n0.i4<?>> it2 = map.keySet().iterator();
        while (it2.hasNext()) {
            if (it2.next().p() == 4101) {
                return true;
            }
        }
        return false;
    }

    public static Range<Integer> f(Range<Integer> range, Range<Integer> range2, Range<Integer> range3) {
        double dF = F(range2.intersect(range));
        double dF2 = F(range3.intersect(range));
        double dF3 = dF2 / ((double) F(range3));
        double dF4 = dF / ((double) F(range2));
        return (dF2 <= dF ? dF2 != dF ? dF4 >= 0.5d || dF3 <= dF4 : dF3 <= dF4 && (dF3 != dF4 || ((Integer) range3.getLower()).intValue() <= ((Integer) range2.getLower()).intValue()) : dF3 < 0.5d && dF3 < dF4) ? range2 : range3;
    }

    public final Size A(StreamConfigurationMap streamConfigurationMap, int i10, boolean z10, Rational rational) {
        Size[] sizeArrA;
        Size[] sizeArrD = D(streamConfigurationMap, i10, rational);
        if (sizeArrD == null || sizeArrD.length == 0) {
            return null;
        }
        p0.e eVar = new p0.e();
        Size size = (Size) Collections.max(Arrays.asList(sizeArrD), eVar);
        Size size2 = w0.d.f33583a;
        if (z10 && (sizeArrA = a.a(streamConfigurationMap, i10)) != null && sizeArrA.length > 0) {
            size2 = (Size) Collections.max(Arrays.asList(sizeArrA), eVar);
        }
        return (Size) Collections.max(Arrays.asList(size, size2), eVar);
    }

    public final int B(List<n0.g> list, boolean z10) {
        int iO = Integer.MAX_VALUE;
        for (n0.g gVar : list) {
            iO = O(iO, gVar.d(), gVar.g(), z10);
        }
        return iO;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public List<SurfaceConfig> C(d dVar, List<SurfaceConfig> list, Map<Integer, n0.g> map, Map<Integer, n0.i4<?>> map2) {
        if (!c5.n(dVar)) {
            return null;
        }
        Iterator<n0.v3> it = this.f36560j.iterator();
        while (it.hasNext()) {
            final List<SurfaceConfig> listD = it.next().d(list);
            if (listD != null) {
                boolean zA = c5.a(map, map2, listD);
                jt.e0 e0Var = new jt.e0(new Function0() { // from class: z.e5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Boolean.valueOf(c5.c(this.f36489a.f36563m, listD));
                    }
                });
                if (zA && ((Boolean) e0Var.getValue()).booleanValue()) {
                    return listD;
                }
            }
        }
        return null;
    }

    public final Size G() {
        try {
            Size sizeH = H(Integer.parseInt(this.f36561k));
            if (sizeH != null) {
                return sizeH;
            }
        } catch (NumberFormatException unused) {
        }
        Size sizeI = I();
        return sizeI != null ? sizeI : w0.d.f33585d;
    }

    public final Size H(int i10) {
        CamcorderProfile camcorderProfileA;
        int[] iArr = {1, 13, 10, 8, 12, 6, 5, 4};
        for (int i11 = 0; i11 < 8; i11++) {
            int i12 = iArr[i11];
            if (this.f36562l.b(i10, i12) && (camcorderProfileA = this.f36562l.a(i10, i12)) != null) {
                return new Size(camcorderProfileA.videoFrameWidth, camcorderProfileA.videoFrameHeight);
            }
        }
        return null;
    }

    public final Size I() {
        Size[] outputSizes;
        try {
            outputSizes = this.f36563m.e().h().getOutputSizes(MediaRecorder.class);
        } catch (Throwable unused) {
            outputSizes = null;
        }
        if (outputSizes == null) {
            return null;
        }
        Arrays.sort(outputSizes, new p0.e(true));
        for (Size size : outputSizes) {
            int width = size.getWidth();
            Size size2 = w0.d.f33587f;
            if (width <= size2.getWidth() && size.getHeight() <= size2.getHeight()) {
                return size;
            }
        }
        return null;
    }

    public SurfaceStreamSpecQueryResult K(int i10, List<n0.g> list, Map<n0.i4<?>, List<Size>> map, boolean z10, boolean z11, boolean z12, boolean z13) {
        boolean zT;
        Range<Integer> rangeN;
        X();
        boolean zL = m4.l(list, map.keySet());
        Map<n0.i4<?>, List<Size>> mapD = zL ? this.C.d(map) : map;
        ArrayList arrayList = new ArrayList(mapD.keySet());
        List<Integer> listR = R(arrayList);
        Map<n0.i4<?>, g0.k0> mapG = this.B.g(list, arrayList, listR);
        g0.r1.a("SupportedSurfaceCombination", "resolvedDynamicRanges = " + mapG);
        boolean zU = U(list, mapD);
        if (z13) {
            rangeN = n0.t3.f24861a;
            zT = false;
        } else {
            zT = T(list, arrayList);
            rangeN = N(list, arrayList, listR, zT);
        }
        Range<Integer> range = rangeN;
        boolean z14 = zT;
        g0.r1.a("SupportedSurfaceCombination", "getSuggestedStreamSpecifications: isPreviewStabilizationOn = " + z10 + ", mIsPreviewStabilizationSupported = " + this.f36572v + ", isFeatureComboInvocation = " + z12);
        if (z10 && !this.f36572v && z12) {
            throw new IllegalArgumentException("Preview stabilization is not supported by the camera.");
        }
        return Y(w(mapG.values(), range, z10, zU, z12), h(i10, z11, mapG, z10, zU, zL, z12, false, range, z14), list, mapD, arrayList, listR, mapG, z13);
    }

    public final List<n0.v3> L(d dVar) {
        if (this.f36557g.containsKey(dVar)) {
            return this.f36557g.get(dVar);
        }
        List<n0.v3> arrayList = new ArrayList<>();
        if (dVar.k()) {
            if (this.f36556f.isEmpty()) {
                m();
            }
            arrayList.addAll(this.f36556f);
        } else if (dVar.i()) {
            if (this.f36559i.isEmpty()) {
                s();
            }
            if (dVar.a() == 0) {
                arrayList.addAll(this.f36559i);
            }
        } else if (dVar.f()) {
            if (this.f36555e.isEmpty()) {
                n();
            }
            arrayList.addAll(this.f36555e);
        } else if (dVar.b() == 8) {
            int iA = dVar.a();
            if (iA == 1) {
                arrayList = this.f36553c;
            } else if (iA != 2) {
                arrayList.addAll(dVar.g() ? this.f36554d : this.f36552a);
            } else {
                arrayList.addAll(this.b);
                arrayList.addAll(this.f36552a);
            }
        } else if (dVar.b() == 10 && dVar.a() == 0) {
            arrayList.addAll(this.f36558h);
        }
        this.f36557g.put(dVar, arrayList);
        return arrayList;
    }

    public final Pair<List<SurfaceConfig>, Integer> M(d dVar, List<n0.g> list, List<Size> list2, List<n0.i4<?>> list3, List<Integer> list4, int i10, Map<Integer, n0.g> map, Map<Integer, n0.i4<?>> map2) {
        ArrayList arrayList = new ArrayList();
        for (n0.g gVar : list) {
            arrayList.add(gVar.h());
            if (map != null) {
                map.put(Integer.valueOf(arrayList.size() - 1), gVar);
            }
        }
        for (int i11 = 0; i11 < list2.size(); i11++) {
            Size size = list2.get(i11);
            n0.i4<?> i4Var = list3.get(list4.get(i11).intValue());
            int iP = i4Var.p();
            arrayList.add(SurfaceConfig.l(iP, size, P(iP), dVar.a(), dVar.k() ? SurfaceConfig.c.FEATURE_COMBINATION_TABLE : SurfaceConfig.c.CAPTURE_SESSION_TABLES, i4Var.W()));
            if (map2 != null) {
                map2.put(Integer.valueOf(arrayList.size() - 1), i4Var);
            }
            i10 = O(i10, i4Var.p(), size, dVar.f());
        }
        return new Pair<>(arrayList, Integer.valueOf(i10));
    }

    public final Range<Integer> N(List<n0.g> list, List<n0.i4<?>> list2, List<Integer> list3, boolean z10) {
        Range<Integer> rangeQ = n0.t3.f24861a;
        Iterator<n0.g> it = list.iterator();
        while (it.hasNext()) {
            rangeQ = Q(it.next().i(), rangeQ, z10);
        }
        Iterator<Integer> it2 = list3.iterator();
        while (it2.hasNext()) {
            Range<Integer> rangeZ = list2.get(it2.next().intValue()).z(n0.t3.f24861a);
            Objects.requireNonNull(rangeZ);
            rangeQ = Q(rangeZ, rangeQ, z10);
        }
        return rangeQ;
    }

    public final int O(int i10, int i11, Size size, boolean z10) {
        return Math.min(i10, y(i11, size, z10));
    }

    public n0.x3 P(int i10) {
        if (!this.f36574x.contains(Integer.valueOf(i10))) {
            c0(this.f36573w.n(), w0.d.f33586e, i10);
            c0(this.f36573w.l(), w0.d.f33588g, i10);
            b0(this.f36573w.h(), i10, null);
            b0(this.f36573w.f(), i10, p0.a.f28051a);
            b0(this.f36573w.d(), i10, p0.a.f28052c);
            d0(this.f36573w.p(), i10);
            this.f36574x.add(Integer.valueOf(i10));
        }
        return this.f36573w;
    }

    public final Range<Integer> Q(Range<Integer> range, Range<Integer> range2, boolean z10) {
        Range<Integer> range3 = n0.t3.f24861a;
        if (range3.equals(range2) && range3.equals(range)) {
            return range3;
        }
        if (range3.equals(range2)) {
            return range;
        }
        if (range3.equals(range)) {
            return range2;
        }
        if (z10) {
            x2.g.j(range == range2, "All targetFrameRate should be the same if strict fps is required");
            return range;
        }
        try {
            return range2.intersect(range);
        } catch (IllegalArgumentException unused) {
            return range2;
        }
    }

    public final boolean T(List<n0.g> list, List<n0.i4<?>> list2) {
        Iterator<n0.g> it = list.iterator();
        Boolean boolValueOf = null;
        while (it.hasNext()) {
            boolValueOf = Boolean.valueOf(v(it.next().j(), boolValueOf));
        }
        Iterator<n0.i4<?>> it2 = list2.iterator();
        while (it2.hasNext()) {
            boolValueOf = Boolean.valueOf(v(it2.next().H(), boolValueOf));
        }
        if (boolValueOf != null) {
            return boolValueOf.booleanValue();
        }
        return false;
    }

    public final boolean V(d dVar, List<n0.g> list, Map<n0.i4<?>, List<Size>> map) {
        ArrayList arrayList = new ArrayList();
        Iterator<n0.g> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().h());
        }
        p0.e eVar = new p0.e();
        for (n0.i4<?> i4Var : map.keySet()) {
            List<Size> list2 = map.get(i4Var);
            x2.g.b((list2 == null || list2.isEmpty()) ? false : true, "No available output size is found for " + i4Var + ".");
            Size size = (Size) Collections.min(list2, eVar);
            int iP = i4Var.p();
            arrayList.add(SurfaceConfig.l(iP, size, P(iP), dVar.a(), SurfaceConfig.c.CAPTURE_SESSION_TABLES, i4Var.W()));
        }
        Map<SurfaceConfig, g0.k0> map2 = Collections.EMPTY_MAP;
        List<n0.i4<?>> list3 = Collections.EMPTY_LIST;
        return e(dVar, arrayList, map2, list3, list3);
    }

    public final void W(d dVar, Range<Integer> range, Size size, int i10, n0.u3 u3Var, boolean z10, Map<SurfaceConfig.b, Set<Integer>> map, List<Size> list) {
        SurfaceConfig.b configSize = SurfaceConfig.l(i10, size, P(i10), dVar.a(), dVar.k() ? SurfaceConfig.c.FEATURE_COMBINATION_TABLE : SurfaceConfig.c.CAPTURE_SESSION_TABLES, u3Var).getConfigSize();
        Range<Integer> range2 = n0.t3.f24861a;
        int iY = (!range2.equals(range) || z10) ? y(i10, size, dVar.f()) : Integer.MAX_VALUE;
        if (dVar.e()) {
            if (configSize == SurfaceConfig.b.f24922q) {
                return;
            }
            if (!range2.equals(range) && iY < ((Integer) range.getUpper()).intValue()) {
                return;
            }
        }
        Set<Integer> hashSet = map.get(configSize);
        if (hashSet == null) {
            hashSet = new HashSet<>();
            map.put(configSize, hashSet);
        }
        if (hashSet.contains(Integer.valueOf(iY))) {
            return;
        }
        list.add(size);
        hashSet.add(Integer.valueOf(iY));
    }

    public final void X() {
        this.f36575y.g();
        if (this.f36573w == null) {
            r();
        } else {
            this.f36573w = n0.x3.a(this.f36573w.b(), this.f36573w.n(), this.f36575y.f(), this.f36573w.l(), this.f36573w.j(), this.f36573w.h(), this.f36573w.f(), this.f36573w.d(), this.f36573w.p());
        }
    }

    public final SurfaceStreamSpecQueryResult Y(c cVar, d dVar, List<n0.g> list, Map<n0.i4<?>, List<Size>> map, List<n0.i4<?>> list2, List<Integer> list3, Map<n0.i4<?>, g0.k0> map2, boolean z10) {
        g0.r1.a("SupportedSurfaceCombination", "resolveSpecsByCheckingMethod: checkingMethod = " + cVar);
        int iOrdinal = cVar.ordinal();
        if (iOrdinal == 1) {
            return Z(h(dVar.a(), dVar.d(), map2, dVar.g(), dVar.i(), dVar.f(), dVar.e(), true, dVar.c(), dVar.h()), list, map, list2, list3, map2, z10);
        }
        if (iOrdinal != 2) {
            return Z(dVar, list, map, list2, list3, map2, z10);
        }
        try {
            return Z(dVar, list, map, list2, list3, map2, z10);
        } catch (IllegalArgumentException e10) {
            g0.r1.b("SupportedSurfaceCombination", "Failed to find a supported combination without feature combo, trying again with feature combo", e10);
            return Z(h(dVar.a(), dVar.d(), map2, dVar.g(), dVar.i(), dVar.f(), dVar.e(), true, dVar.c(), dVar.h()), list, map, list2, list3, map2, z10);
        }
    }

    public final SurfaceStreamSpecQueryResult Z(d dVar, List<n0.g> list, Map<n0.i4<?>, List<Size>> map, List<n0.i4<?>> list2, List<Integer> list3, Map<n0.i4<?>, g0.k0> map2, boolean z10) {
        HashMap map3;
        HashMap map4;
        int i10;
        List<n0.g> list4 = list;
        List<n0.i4<?>> list5 = list2;
        g0.r1.a("SupportedSurfaceCombination", "resolveSpecsBySettings: featureSettings = " + dVar);
        if (!dVar.k() && !V(dVar, list, map)) {
            throw new IllegalArgumentException("No supported surface combination is found for camera device - Id : " + this.f36561k + ".  May be attempting to bind too many use cases. Existing surfaces: " + list4 + ". New configs: " + list5 + ". GroupableFeature settings: " + dVar);
        }
        Map<n0.i4<?>, List<Size>> mapI = i(map, dVar, z10);
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it = list3.iterator();
        while (it.hasNext()) {
            n0.i4<?> i4Var = list5.get(it.next().intValue());
            List<Size> list6 = mapI.get(i4Var);
            if (list6 == null) {
                list6 = Collections.EMPTY_LIST;
            }
            arrayList.add(c(list6, i4Var.p()));
        }
        List<List<Size>> listJ = dVar.f() ? this.C.j(arrayList) : u(arrayList);
        HashMap map5 = new HashMap();
        HashMap map6 = new HashMap();
        HashMap map7 = new HashMap();
        HashMap map8 = new HashMap();
        boolean zD = c5.d(list4, list5);
        int iB = B(list4, dVar.f());
        List<SurfaceConfig> listC = null;
        if (!this.f36569s || zD) {
            map3 = map7;
            map4 = map8;
            i10 = iB;
        } else {
            Iterator<List<Size>> it2 = listJ.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    map3 = map7;
                    map4 = map8;
                    i10 = iB;
                    break;
                }
                Pair<List<SurfaceConfig>, Integer> pairM = M(dVar, list4, it2.next(), list5, list3, iB, map7, map8);
                map3 = map7;
                map4 = map8;
                i10 = iB;
                listC = C(dVar, (List) pairM.first, map3, map4);
                if (listC != null) {
                    break;
                }
                map3.clear();
                map4.clear();
                list5 = list2;
                map7 = map3;
                iB = i10;
                list4 = list;
                map8 = map4;
            }
            g0.r1.a("SupportedSurfaceCombination", "orderedSurfaceConfigListForStreamUseCase = " + listC);
        }
        List<SurfaceConfig> list7 = listC;
        HashMap map9 = map3;
        HashMap map10 = map4;
        b bVarJ = j(dVar, list, list2, list3, listJ, list7, map2, i10, z10);
        g0.r1.a("SupportedSurfaceCombination", "resolveSpecsBySettings: bestSizesAndFps = " + bVarJ);
        List<Size> listA = bVarJ.a();
        int iD = bVarJ.d();
        List<Size> listB = bVarJ.b();
        int iE = bVarJ.e();
        int iC = bVarJ.c();
        if (listA == null) {
            throw new IllegalArgumentException("No supported surface combination is found for camera device - Id : " + this.f36561k + " and Hardware level: " + this.f36565o + ". May be the specified resolution is too large and not supported. Existing surfaces: " + list + " New configs: " + list2);
        }
        Range<Integer> rangeX = n0.t3.f24861a;
        if (rangeX.equals(dVar.c())) {
            iC = iC;
            if (dVar.f()) {
                rangeX = x(m4.f36695f, iD, this.C.f(listA));
            }
        } else {
            Range<Integer>[] rangeArrF = dVar.f() ? this.C.f(listA) : (Range[]) this.f36563m.a(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
            Range<Integer> rangeX2 = x(dVar.c(), iD, rangeArrF);
            if (dVar.e() || dVar.h()) {
                x2.g.b(rangeX2.equals(dVar.c()), "Target FPS range " + dVar.c() + " is not supported. Max FPS supported by the calculated best combination: " + iD + ". Calculated best FPS range for device: " + rangeX2 + ". Device supported FPS ranges: " + Arrays.toString(rangeArrF));
            }
            rangeX = rangeX2;
        }
        Iterator<n0.i4<?>> it3 = list2.iterator();
        while (it3.hasNext()) {
            n0.i4<?> next = it3.next();
            Iterator<n0.i4<?>> it4 = it3;
            n0.t3.a aVarH = n0.t3.a(listA.get(list3.indexOf(Integer.valueOf(list2.indexOf(next))))).g(dVar.f() ? 1 : 0).b((g0.k0) x2.g.g(map2.get(next))).d(c5.e(next)).h(dVar.d());
            if (!n0.t3.f24861a.equals(rangeX)) {
                aVarH.c(rangeX);
            }
            map6.put(next, aVarH.a());
            it3 = it4;
        }
        if (list7 != null && iD == iE && listA.size() == listB.size()) {
            for (int i11 = 0; i11 < listA.size(); i11++) {
                if (listA.get(i11).equals(listB.get(i11))) {
                }
            }
            if (!c5.k(this.f36563m, list, map6, map5)) {
                c5.l(map6, map5, map9, map10, list7);
            }
        }
        return new SurfaceStreamSpecQueryResult(map6, map5, iC);
    }

    public SurfaceConfig a0(int i10, int i11, Size size, n0.u3 u3Var) {
        return SurfaceConfig.l(i11, size, P(i11), i10, SurfaceConfig.c.CAPTURE_SESSION_TABLES, u3Var);
    }

    public final void b0(Map<Integer, Size> map, int i10, Rational rational) {
        Size sizeA = A(this.f36563m.e().h(), i10, true, rational);
        if (sizeA != null) {
            map.put(Integer.valueOf(i10), sizeA);
        }
    }

    public List<Size> c(List<Size> list, int i10) {
        Rational rational;
        int iA = this.f36576z.a(this.f36561k, this.f36563m);
        if (iA == 0) {
            rational = p0.a.f28051a;
        } else if (iA != 1) {
            rational = null;
            if (iA == 2) {
                Size sizeG = P(Barcode.FORMAT_QR_CODE).g(Barcode.FORMAT_QR_CODE);
                if (sizeG != null) {
                    rational = new Rational(sizeG.getWidth(), sizeG.getHeight());
                }
            } else if (iA != 3) {
                throw new AssertionError("Undefined targetAspectRatio: " + iA);
            }
        } else {
            rational = p0.a.f28052c;
        }
        if (rational != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (Size size : list) {
                if (p0.a.a(size, rational)) {
                    arrayList.add(size);
                } else {
                    arrayList2.add(size);
                }
            }
            arrayList2.addAll(0, arrayList);
            list = arrayList2;
        }
        return this.A.a(SurfaceConfig.f(i10), list);
    }

    public final void c0(Map<Integer, Size> map, Size size, int i10) {
        if (this.f36568r) {
            Size sizeA = A(this.f36563m.e().h(), i10, false, null);
            Integer numValueOf = Integer.valueOf(i10);
            if (sizeA != null) {
                size = (Size) Collections.min(Arrays.asList(size, sizeA), new p0.e());
            }
            map.put(numValueOf, size);
        }
    }

    public final void d() {
    }

    public final void d0(Map<Integer, Size> map, int i10) {
        StreamConfigurationMap streamConfigurationMap;
        if (Build.VERSION.SDK_INT < 31 || !this.f36570t || (streamConfigurationMap = (StreamConfigurationMap) this.f36563m.a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP_MAXIMUM_RESOLUTION)) == null) {
            return;
        }
        map.put(Integer.valueOf(i10), A(streamConfigurationMap, i10, true, null));
    }

    public boolean e(d dVar, List<SurfaceConfig> list, Map<SurfaceConfig, g0.k0> map, List<n0.i4<?>> list2, List<Integer> list3) {
        Iterator<n0.v3> it = L(dVar).iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            z10 = it.next().d(list) != null;
            if (z10) {
                break;
            }
        }
        if (!z10 || !dVar.k()) {
            return z10;
        }
        n0.o3 o3VarG = g(dVar, list, map, list2, list3);
        boolean zB = this.D.b(o3VarG);
        Iterator<n0.u1> it2 = o3VarG.p().iterator();
        while (it2.hasNext()) {
            it2.next().d();
        }
        return zB;
    }

    public final n0.o3 g(d dVar, List<SurfaceConfig> list, Map<SurfaceConfig, g0.k0> map, List<n0.i4<?>> list2, List<Integer> list3) {
        Range<Integer> rangeC = dVar.c();
        n0.o3.h hVar = new n0.o3.h();
        for (int i10 = 0; i10 < list.size(); i10++) {
            SurfaceConfig surfaceConfig = list.get(i10);
            Size sizeH = surfaceConfig.h(P(surfaceConfig.getImageFormat()));
            n0.i4<?> i4Var = list2.get(list3.get(i10).intValue());
            g0.k0 k0Var = map.get(surfaceConfig);
            Objects.requireNonNull(k0Var);
            n0.o3.b bVarA = j0.a.a(i4Var, sizeH, k0Var);
            bVarA.v(n0.t3.f24861a.equals(rangeC) ? FpsRangeFeature.f22002k : rangeC);
            if (dVar.g()) {
                bVarA.z(2);
            }
            hVar.b(bVarA.p());
            x2.g.j(hVar.g(), "Cannot create a combined SessionConfig for feature combo after adding " + i4Var + " with " + surfaceConfig + " due to [" + hVar.e() + "]; surfaceConfigList = " + list + ", featureSettings = " + dVar + ", newUseCaseConfigs = " + list2);
        }
        return hVar.c();
    }

    public final d h(int i10, boolean z10, Map<n0.i4<?>, g0.k0> map, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, Range<Integer> range, boolean z16) {
        int iJ = J(map);
        if (i10 != 0 && z12) {
            throw new IllegalArgumentException(String.format("Camera device id is %s. Ultra HDR is not currently supported in %s camera mode.", this.f36561k, n0.q0.a(i10)));
        }
        if (i10 != 0 && iJ == 10) {
            throw new IllegalArgumentException(String.format("Camera device id is %s. 10 bit dynamic range is not currently supported in %s camera mode.", this.f36561k, n0.q0.a(i10)));
        }
        if (i10 != 0 && z14) {
            throw new IllegalArgumentException(String.format("Camera device id is %s. Feature combination query is not currently supported in %s camera mode.", this.f36561k, n0.q0.a(i10)));
        }
        if (z13 && z14) {
            throw new IllegalArgumentException("High-speed session is not supported with feature combination");
        }
        if (z13 && !this.C.m()) {
            throw new IllegalArgumentException("High-speed session is not supported on this device.");
        }
        if (z14 && range == n0.t3.f24861a && z15) {
            range = FpsRangeFeature.f22002k;
        }
        return d.j(i10, z10, iJ, z11, z12, z13, z14, z15, range, z16);
    }

    public Map<n0.i4<?>, List<Size>> i(Map<n0.i4<?>, List<Size>> map, d dVar, boolean z10) {
        HashMap map2 = new HashMap();
        for (n0.i4<?> i4Var : map.keySet()) {
            ArrayList arrayList = new ArrayList();
            HashMap map3 = new HashMap();
            List<Size> list = map.get(i4Var);
            Objects.requireNonNull(list);
            Iterator<Size> it = list.iterator();
            while (it.hasNext()) {
                W(dVar, dVar.c(), it.next(), i4Var.p(), i4Var.W(), z10, map3, arrayList);
            }
            map2.put(i4Var, arrayList);
        }
        return map2;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0112 A[PHI: r6 r7 r10
      0x0112: PHI (r6v2 boolean) = (r6v1 boolean), (r6v1 boolean), (r6v1 boolean), (r6v3 boolean) binds: [B:27:0x00e7, B:29:0x00f3, B:35:0x0100, B:39:0x010e] A[DONT_GENERATE, DONT_INLINE]
      0x0112: PHI (r7v3 int) = (r7v1 int), (r7v1 int), (r7v5 int), (r7v6 int) binds: [B:27:0x00e7, B:29:0x00f3, B:35:0x0100, B:39:0x010e] A[DONT_GENERATE, DONT_INLINE]
      0x0112: PHI (r10v3 java.util.List<android.util.Size>) = 
      (r10v1 java.util.List<android.util.Size>)
      (r10v1 java.util.List<android.util.Size>)
      (r10v5 java.util.List<android.util.Size>)
      (r10v6 java.util.List<android.util.Size>)
     binds: [B:27:0x00e7, B:29:0x00f3, B:35:0x0100, B:39:0x010e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:41:0x0114 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:54:0x013a  */
    /* JADX WARN: Multi-variable type inference failed */
    public final b j(final d dVar, List<n0.g> list, final List<n0.i4<?>> list2, final List<Integer> list3, List<List<Size>> list4, List<SurfaceConfig> list5, Map<n0.i4<?>, g0.k0> map, int i10, boolean z10) {
        d dVar2;
        Range<Integer> rangeC = dVar.c();
        Iterator<List<Size>> it = list4.iterator();
        int i11 = Integer.MAX_VALUE;
        boolean z11 = false;
        int i12 = Integer.MAX_VALUE;
        boolean z12 = false;
        int i13 = Integer.MAX_VALUE;
        List<Size> list6 = null;
        List<Size> list7 = null;
        while (true) {
            if (!it.hasNext()) {
                dVar2 = dVar;
                break;
            }
            List<Size> next = it.next();
            HashMap map2 = new HashMap();
            HashMap map3 = new HashMap();
            Pair<List<SurfaceConfig>, Integer> pairM = M(dVar, list, next, list2, list3, i10, map2, map3);
            final List<SurfaceConfig> list8 = (List) pairM.first;
            int iIntValue = ((Integer) pairM.second).intValue();
            boolean zS = S(i10, rangeC, iIntValue);
            final HashMap map4 = new HashMap();
            Iterator<List<Size>> it2 = it;
            int i14 = 0;
            while (i14 < list8.size()) {
                SurfaceConfig surfaceConfig = list8.get(i14);
                g0.k0 k0VarC = g0.k0.f17469c;
                int i15 = i14;
                if (map2.containsKey(Integer.valueOf(i15))) {
                    n0.g gVar = map2.get(Integer.valueOf(i15));
                    Objects.requireNonNull(gVar);
                    k0VarC = gVar.c();
                } else {
                    if (map3.containsKey(Integer.valueOf(i15))) {
                        n0.i4<?> i4Var = map3.get(Integer.valueOf(i15));
                        Objects.requireNonNull(i4Var);
                        k0VarC = map.get(i4Var);
                    }
                    map4.put(surfaceConfig, k0VarC);
                    i14 = i15 + 1;
                }
                map4.put(surfaceConfig, k0VarC);
                i14 = i15 + 1;
            }
            jt.e0 e0Var = new jt.e0(new Function0() { // from class: z.f5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Boolean.valueOf(this.f36503a.e(dVar, list8, map4, list2, list3));
                }
            });
            if (z10 && ((Boolean) e0Var.getValue()).booleanValue() && (i11 == Integer.MAX_VALUE || i11 < iIntValue)) {
                i11 = iIntValue;
            }
            if (!z11 && ((Boolean) e0Var.getValue()).booleanValue()) {
                if (i12 == Integer.MAX_VALUE || i12 < iIntValue) {
                    i12 = iIntValue;
                    list6 = next;
                }
                if (!zS) {
                    if (list5 == null) {
                    }
                    it = it2;
                } else {
                    if (z12 && !z10) {
                        dVar2 = dVar;
                        i12 = iIntValue;
                        list6 = next;
                        break;
                    }
                    z11 = true;
                    i12 = iIntValue;
                    list6 = next;
                    if (list5 == null) {
                    }
                    it = it2;
                }
            } else {
                if (list5 == null && !z12) {
                    dVar2 = dVar;
                    if (C(dVar2, list8, map2, map3) != null) {
                        if (i13 == Integer.MAX_VALUE || i13 < iIntValue) {
                            i13 = iIntValue;
                            list7 = next;
                        }
                        if (!zS) {
                            continue;
                        } else {
                            if (z11 && !z10) {
                                i13 = iIntValue;
                                list7 = next;
                                break;
                            }
                            z12 = true;
                            i13 = iIntValue;
                            list7 = next;
                        }
                    } else {
                        continue;
                    }
                }
                it = it2;
            }
        }
        return (!dVar2.e() || n0.t3.f24861a.equals(rangeC) || (i12 != Integer.MAX_VALUE && i12 >= ((Integer) rangeC.getUpper()).intValue())) ? b.f(list6, list7, i12, i13, i11) : b.f(null, null, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
    }

    public final void k() {
        this.f36558h.addAll(i4.e());
    }

    public final void l() {
        this.f36553c.addAll(i4.g());
    }

    public final void m() {
        this.f36556f.addAll(i4.c());
    }

    public final void n() {
        if (this.C.m()) {
            this.f36555e.clear();
            Size sizeI = this.C.i();
            if (sizeI != null) {
                this.f36555e.addAll(i4.b(sizeI, P(34)));
            }
        }
    }

    public final void o() {
        if (Build.VERSION.SDK_INT >= 33) {
            this.f36554d.addAll(i4.l());
        }
    }

    public final void p() {
        if (Build.VERSION.SDK_INT >= 33) {
            this.f36560j.addAll(i4.n());
        }
    }

    public final void q() {
        this.f36552a.addAll(i4.d(this.f36565o, this.f36566p, this.f36567q));
        this.f36552a.addAll(this.f36564n.a(this.f36561k));
    }

    public final void r() {
        this.f36573w = n0.x3.a(w0.d.f33584c, new HashMap(), this.f36575y.f(), new HashMap(), G(), new HashMap(), new HashMap(), new HashMap(), new HashMap());
    }

    public final void s() {
        this.f36559i.addAll(i4.o());
    }

    public final void t() {
        this.b.addAll(i4.p());
    }

    public final List<List<Size>> u(List<List<Size>> list) {
        Iterator<List<Size>> it = list.iterator();
        int size = 1;
        while (it.hasNext()) {
            size *= it.next().size();
        }
        if (size == 0) {
            throw new IllegalArgumentException("Failed to find supported resolutions.");
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(new ArrayList());
        }
        int size2 = size / list.get(0).size();
        int i11 = size;
        for (int i12 = 0; i12 < list.size(); i12++) {
            List<Size> list2 = list.get(i12);
            for (int i13 = 0; i13 < size; i13++) {
                ((List) arrayList.get(i13)).add(list2.get((i13 % i11) / size2));
            }
            if (i12 < list.size() - 1) {
                i11 = size2;
                size2 /= list.get(i12 + 1).size();
            }
        }
        return arrayList;
    }

    public final boolean v(boolean z10, Boolean bool) {
        if (bool == null || bool.booleanValue() == z10) {
            return z10;
        }
        throw new IllegalStateException("All isStrictFpsRequired should be the same");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean, int] */
    public final c w(Collection<g0.k0> collection, Range<Integer> range, boolean z10, boolean z11, boolean z12) {
        int i10;
        if (!z12) {
            return c.WITHOUT_FEATURE_COMBO;
        }
        ?? Contains = collection.contains(g0.k0.f17472f);
        if (range != null && ((Integer) range.getUpper()).intValue() == 60) {
            i10 = Contains;
            i10 = Contains;
            i10 = Contains + 1;
        }
        if (z10) {
            i10++;
        }
        if (z11) {
            i10++;
        }
        if (i10 > 1) {
            return c.WITH_FEATURE_COMBO;
        }
        return i10 == 1 ? c.WITHOUT_FEATURE_COMBO_FIRST_AND_THEN_WITH_IT : c.WITHOUT_FEATURE_COMBO;
    }

    public final Range<Integer> x(Range<Integer> range, int i10, Range<Integer>[] rangeArr) {
        Range<Integer> rangeF = n0.t3.f24861a;
        if (rangeF.equals(range) || rangeArr == null) {
            return rangeF;
        }
        Range<T> range2 = new Range<>(Integer.valueOf(Math.min(((Integer) range.getLower()).intValue(), i10)), Integer.valueOf(Math.min(((Integer) range.getUpper()).intValue(), i10)));
        int iF = 0;
        for (Range<Integer> range3 : rangeArr) {
            Objects.requireNonNull(range3);
            if (i10 >= ((Integer) range3.getLower()).intValue()) {
                if (rangeF.equals(n0.t3.f24861a)) {
                    rangeF = range3;
                }
                if (range3.equals(range2)) {
                    return range3;
                }
                try {
                    int iF2 = F(range3.intersect(range2));
                    if (iF == 0) {
                        iF = iF2;
                    } else {
                        if (iF2 >= iF) {
                            rangeF = f(range2, rangeF, range3);
                            iF = F(range2.intersect(rangeF));
                        }
                        range3 = rangeF;
                    }
                } catch (IllegalArgumentException unused) {
                    if (iF != 0 || (E(range3, range2) >= E(rangeF, range2) && (E(range3, range2) != E(rangeF, range2) || (((Integer) range3.getLower()).intValue() <= ((Integer) rangeF.getUpper()).intValue() && F(range3) >= F(rangeF))))) {
                    }
                }
                rangeF = range3;
            }
        }
        return rangeF;
    }

    public final int y(int i10, Size size, boolean z10) {
        x2.g.i(!z10 || i10 == 34);
        return z10 ? this.C.h(size) : z(this.f36563m, i10, size);
    }

    public final int z(a0.c0 c0Var, int i10, Size size) {
        a0.u0 u0VarE = c0Var.e();
        Objects.requireNonNull(u0VarE);
        long jF = u0VarE.f(i10, size);
        if (jF > 0) {
            return (int) (1.0E9d / jF);
        }
        if (!this.f36571u) {
            return Integer.MAX_VALUE;
        }
        g0.r1.l("SupportedSurfaceCombination", "minFrameDuration: " + jF + " is invalid for imageFormat = " + i10 + ", size = " + size);
        return 0;
    }
}
