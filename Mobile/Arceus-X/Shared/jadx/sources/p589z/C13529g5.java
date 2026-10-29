package p589z;

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
import kotlin.jvm.functions.Function0;
import p001a0.C0008c0;
import p001a0.C0013f;
import p001a0.C0034p0;
import p001a0.C0044u0;
import p063d0.C4375f;
import p063d0.C4389t;
import p063d0.C4393x;
import p140g0.C5902k0;
import p140g0.C5931r1;
import p140g0.C5953x;
import p204j0.InterfaceC7011a;
import p229jt.C7337e0;
import p233k0.FpsRangeFeature;
import p296n0.AbstractC8754g;
import p296n0.AbstractC8827t3;
import p296n0.AbstractC8830u1;
import p296n0.AbstractC8847x3;
import p296n0.C8802o3;
import p296n0.C8809q0;
import p296n0.C8837v3;
import p296n0.EnumC8832u3;
import p296n0.InterfaceC8771i4;
import p296n0.SurfaceConfig;
import p296n0.SurfaceStreamSpecQueryResult;
import p347p0.C10084a;
import p347p0.C10089e;
import p503w0.C12274d;
import p533x2.C12637g;

/* JADX INFO: renamed from: z.g5 */
/* JADX INFO: loaded from: classes.dex */
public final class C13529g5 {

    /* JADX INFO: renamed from: B */
    public final C13613r3 f47354B;

    /* JADX INFO: renamed from: C */
    public final C13576m4 f47355C;

    /* JADX INFO: renamed from: D */
    public final InterfaceC7011a f47356D;

    /* JADX INFO: renamed from: k */
    public final String f47367k;

    /* JADX INFO: renamed from: l */
    public final InterfaceC13523g f47368l;

    /* JADX INFO: renamed from: m */
    public final C0008c0 f47369m;

    /* JADX INFO: renamed from: n */
    public final C4375f f47370n;

    /* JADX INFO: renamed from: o */
    public final int f47371o;

    /* JADX INFO: renamed from: p */
    public boolean f47372p;

    /* JADX INFO: renamed from: q */
    public boolean f47373q;

    /* JADX INFO: renamed from: r */
    public final boolean f47374r;

    /* JADX INFO: renamed from: s */
    public final boolean f47375s;

    /* JADX INFO: renamed from: t */
    public boolean f47376t;

    /* JADX INFO: renamed from: u */
    public boolean f47377u;

    /* JADX INFO: renamed from: v */
    public final boolean f47378v;

    /* JADX INFO: renamed from: w */
    public AbstractC8847x3 f47379w;

    /* JADX INFO: renamed from: y */
    public final C13606q3 f47381y;

    /* JADX INFO: renamed from: a */
    public final List<C8837v3> f47357a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public final List<C8837v3> f47358b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public final List<C8837v3> f47359c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public final List<C8837v3> f47360d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public final List<C8837v3> f47361e = new ArrayList();

    /* JADX INFO: renamed from: f */
    public final List<C8837v3> f47362f = new ArrayList();

    /* JADX INFO: renamed from: g */
    public final Map<d, List<C8837v3>> f47363g = new HashMap();

    /* JADX INFO: renamed from: h */
    public final List<C8837v3> f47364h = new ArrayList();

    /* JADX INFO: renamed from: i */
    public final List<C8837v3> f47365i = new ArrayList();

    /* JADX INFO: renamed from: j */
    public final List<C8837v3> f47366j = new ArrayList();

    /* JADX INFO: renamed from: x */
    public List<Integer> f47380x = new ArrayList();

    /* JADX INFO: renamed from: z */
    public final C4393x f47382z = new C4393x();

    /* JADX INFO: renamed from: A */
    public final C4389t f47353A = new C4389t();

    /* JADX INFO: renamed from: z.g5$a */
    public static class a {
        /* JADX INFO: renamed from: a */
        public static Size[] m49344a(StreamConfigurationMap streamConfigurationMap, int i10) {
            return streamConfigurationMap.getHighResolutionOutputSizes(i10);
        }
    }

    /* JADX INFO: renamed from: z.g5$b */
    public static abstract class b {
        /* JADX INFO: renamed from: f */
        public static b m49345f(List<Size> list, List<Size> list2, int i10, int i11, int i12) {
            return new C13507e(list, list2, i10, i11, i12);
        }

        /* JADX INFO: renamed from: a */
        public abstract List<Size> mo49215a();

        /* JADX INFO: renamed from: b */
        public abstract List<Size> mo49216b();

        /* JADX INFO: renamed from: c */
        public abstract int mo49217c();

        /* JADX INFO: renamed from: d */
        public abstract int mo49218d();

        /* JADX INFO: renamed from: e */
        public abstract int mo49219e();
    }

    /* JADX INFO: renamed from: z.g5$c */
    public enum c {
        WITHOUT_FEATURE_COMBO,
        WITH_FEATURE_COMBO,
        WITHOUT_FEATURE_COMBO_FIRST_AND_THEN_WITH_IT
    }

    /* JADX INFO: renamed from: z.g5$d */
    public static abstract class d {
        /* JADX INFO: renamed from: j */
        public static d m49347j(int i10, boolean z10, int i11, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, Range<Integer> range, boolean z16) {
            return new C13515f(i10, z10, i11, z11, z12, z13, z14, z15, range, z16);
        }

        /* JADX INFO: renamed from: a */
        public abstract int mo49221a();

        /* JADX INFO: renamed from: b */
        public abstract int mo49222b();

        /* JADX INFO: renamed from: c */
        public abstract Range<Integer> mo49223c();

        /* JADX INFO: renamed from: d */
        public abstract boolean mo49224d();

        /* JADX INFO: renamed from: e */
        public abstract boolean mo49225e();

        /* JADX INFO: renamed from: f */
        public abstract boolean mo49226f();

        /* JADX INFO: renamed from: g */
        public abstract boolean mo49227g();

        /* JADX INFO: renamed from: h */
        public abstract boolean mo49228h();

        /* JADX INFO: renamed from: i */
        public abstract boolean mo49229i();

        /* JADX INFO: renamed from: k */
        public abstract boolean mo49230k();
    }

    public C13529g5(Context context, String str, C0034p0 c0034p0, InterfaceC13523g interfaceC13523g, InterfaceC7011a interfaceC7011a) throws C5953x {
        this.f47372p = false;
        this.f47373q = false;
        this.f47376t = false;
        this.f47377u = false;
        String str2 = (String) C12637g.m47075g(str);
        this.f47367k = str2;
        this.f47368l = (InterfaceC13523g) C12637g.m47075g(interfaceC13523g);
        this.f47370n = new C4375f();
        this.f47381y = C13606q3.m49574c(context);
        try {
            C0008c0 c0008c0M64c = c0034p0.m64c(str2);
            this.f47369m = c0008c0M64c;
            Integer num = (Integer) c0008c0M64c.m9a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
            this.f47371o = num != null ? num.intValue() : 2;
            int[] iArr = (int[]) c0008c0M64c.m9a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
            if (iArr != null) {
                for (int i10 : iArr) {
                    if (i10 == 3) {
                        this.f47372p = true;
                    } else if (i10 == 6) {
                        this.f47373q = true;
                    } else if (Build.VERSION.SDK_INT >= 31 && i10 == 16) {
                        this.f47376t = true;
                    } else if (i10 == 1) {
                        this.f47377u = true;
                    }
                }
            }
            C13613r3 c13613r3 = new C13613r3(this.f47369m);
            this.f47354B = c13613r3;
            this.f47355C = new C13576m4(this.f47369m);
            m49334q();
            if (this.f47376t) {
                m49337t();
            }
            boolean zHasSystemFeature = context.getPackageManager().hasSystemFeature("android.hardware.camera.concurrent");
            this.f47374r = zHasSystemFeature;
            if (zHasSystemFeature) {
                m49329l();
            }
            if (c13613r3.m49595d()) {
                m49328k();
            }
            boolean zM49194h = C13497c5.m49194h(this.f47369m);
            this.f47375s = zM49194h;
            if (zM49194h) {
                m49333p();
            }
            boolean zM49814a = C13664y5.m49814a(this.f47369m);
            this.f47378v = zM49814a;
            if (zM49814a) {
                m49332o();
            }
            m49335r();
            m49321d();
            this.f47356D = interfaceC7011a;
        } catch (C0013f e10) {
            throw C13479a3.m49169a(e10);
        }
    }

    /* JADX INFO: renamed from: D */
    public static Size[] m49288D(StreamConfigurationMap streamConfigurationMap, int i10, Rational rational) {
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
            if (C10084a.m38864a(size, rational)) {
                arrayList.add(size);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return (Size[]) arrayList.toArray(new Size[0]);
    }

    /* JADX INFO: renamed from: E */
    public static int m49289E(Range<Integer> range, Range<Integer> range2) {
        C12637g.m47078j((range.contains((Integer) range2.getUpper()) || range.contains((Integer) range2.getLower())) ? false : true, "Ranges must not intersect");
        return ((Integer) range.getLower()).intValue() > ((Integer) range2.getUpper()).intValue() ? ((Integer) range.getLower()).intValue() - ((Integer) range2.getUpper()).intValue() : ((Integer) range2.getLower()).intValue() - ((Integer) range.getUpper()).intValue();
    }

    /* JADX INFO: renamed from: F */
    public static int m49290F(Range<Integer> range) {
        return (((Integer) range.getUpper()).intValue() - ((Integer) range.getLower()).intValue()) + 1;
    }

    /* JADX INFO: renamed from: J */
    public static int m49291J(Map<InterfaceC8771i4<?>, C5902k0> map) {
        Iterator<C5902k0> it = map.values().iterator();
        while (it.hasNext()) {
            if (it.next().m26516a() == 10) {
                return 10;
            }
        }
        return 8;
    }

    /* JADX INFO: renamed from: R */
    public static List<Integer> m49292R(List<InterfaceC8771i4<?>> list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator<InterfaceC8771i4<?>> it = list.iterator();
        while (it.hasNext()) {
            int iM35199B = it.next().m35199B(0);
            if (!arrayList2.contains(Integer.valueOf(iM35199B))) {
                arrayList2.add(Integer.valueOf(iM35199B));
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
            for (InterfaceC8771i4<?> interfaceC8771i4 : list) {
                if (iIntValue == interfaceC8771i4.m35199B(0)) {
                    arrayList.add(Integer.valueOf(list.indexOf(interfaceC8771i4)));
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: S */
    public static boolean m49293S(int i10, Range<Integer> range, int i11) {
        return AbstractC8827t3.f32104a.equals(range) || i11 >= i10 || i11 >= ((Integer) range.getUpper()).intValue();
    }

    /* JADX INFO: renamed from: U */
    public static boolean m49294U(List<AbstractC8754g> list, Map<InterfaceC8771i4<?>, List<Size>> map) {
        Iterator<AbstractC8754g> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().mo35097d() == 4101) {
                return true;
            }
        }
        Iterator<InterfaceC8771i4<?>> it2 = map.keySet().iterator();
        while (it2.hasNext()) {
            if (it2.next().mo26767p() == 4101) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public static Range<Integer> m49297f(Range<Integer> range, Range<Integer> range2, Range<Integer> range3) {
        double dM49290F = m49290F(range2.intersect(range));
        double dM49290F2 = m49290F(range3.intersect(range));
        double dM49290F3 = dM49290F2 / ((double) m49290F(range3));
        double dM49290F4 = dM49290F / ((double) m49290F(range2));
        return (dM49290F2 <= dM49290F ? dM49290F2 != dM49290F ? dM49290F4 >= 0.5d || dM49290F3 <= dM49290F4 : dM49290F3 <= dM49290F4 && (dM49290F3 != dM49290F4 || ((Integer) range3.getLower()).intValue() <= ((Integer) range2.getLower()).intValue()) : dM49290F3 < 0.5d && dM49290F3 < dM49290F4) ? range2 : range3;
    }

    /* JADX INFO: renamed from: A */
    public final Size m49298A(StreamConfigurationMap streamConfigurationMap, int i10, boolean z10, Rational rational) {
        Size[] sizeArrM49344a;
        Size[] sizeArrM49288D = m49288D(streamConfigurationMap, i10, rational);
        if (sizeArrM49288D == null || sizeArrM49288D.length == 0) {
            return null;
        }
        C10089e c10089e = new C10089e();
        Size size = (Size) Collections.max(Arrays.asList(sizeArrM49288D), c10089e);
        Size size2 = C12274d.f43480a;
        if (z10 && (sizeArrM49344a = a.m49344a(streamConfigurationMap, i10)) != null && sizeArrM49344a.length > 0) {
            size2 = (Size) Collections.max(Arrays.asList(sizeArrM49344a), c10089e);
        }
        return (Size) Collections.max(Arrays.asList(size, size2), c10089e);
    }

    /* JADX INFO: renamed from: B */
    public final int m49299B(List<AbstractC8754g> list, boolean z10) {
        int iM49308O = Integer.MAX_VALUE;
        for (AbstractC8754g abstractC8754g : list) {
            iM49308O = m49308O(iM49308O, abstractC8754g.mo35097d(), abstractC8754g.mo35100g(), z10);
        }
        return iM49308O;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: C */
    public List<SurfaceConfig> m49300C(d dVar, List<SurfaceConfig> list, Map<Integer, AbstractC8754g> map, Map<Integer, InterfaceC8771i4<?>> map2) {
        if (!C13497c5.m49198n(dVar)) {
            return null;
        }
        Iterator<C8837v3> it = this.f47366j.iterator();
        while (it.hasNext()) {
            final List<SurfaceConfig> listM35469d = it.next().m35469d(list);
            if (listM35469d != null) {
                boolean zM49190a = C13497c5.m49190a(map, map2, listM35469d);
                C7337e0 c7337e0 = new C7337e0(new Function0() { // from class: z.e5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Boolean.valueOf(C13497c5.m49191c(this.f47274a.f47369m, listM35469d));
                    }
                });
                if (zM49190a && ((Boolean) c7337e0.getValue()).booleanValue()) {
                    return listM35469d;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: G */
    public final Size m49301G() {
        try {
            Size sizeM49302H = m49302H(Integer.parseInt(this.f47367k));
            if (sizeM49302H != null) {
                return sizeM49302H;
            }
        } catch (NumberFormatException unused) {
        }
        Size sizeM49303I = m49303I();
        return sizeM49303I != null ? sizeM49303I : C12274d.f43483d;
    }

    /* JADX INFO: renamed from: H */
    public final Size m49302H(int i10) {
        CamcorderProfile camcorderProfileMo49232a;
        int[] iArr = {1, 13, 10, 8, 12, 6, 5, 4};
        for (int i11 = 0; i11 < 8; i11++) {
            int i12 = iArr[i11];
            if (this.f47368l.mo49233b(i10, i12) && (camcorderProfileMo49232a = this.f47368l.mo49232a(i10, i12)) != null) {
                return new Size(camcorderProfileMo49232a.videoFrameWidth, camcorderProfileMo49232a.videoFrameHeight);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: I */
    public final Size m49303I() {
        Size[] outputSizes;
        try {
            outputSizes = this.f47369m.m13e().m96h().getOutputSizes(MediaRecorder.class);
        } catch (Throwable unused) {
            outputSizes = null;
        }
        if (outputSizes == null) {
            return null;
        }
        Arrays.sort(outputSizes, new C10089e(true));
        for (Size size : outputSizes) {
            int width = size.getWidth();
            Size size2 = C12274d.f43485f;
            if (width <= size2.getWidth() && size.getHeight() <= size2.getHeight()) {
                return size;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: K */
    public SurfaceStreamSpecQueryResult m49304K(int i10, List<AbstractC8754g> list, Map<InterfaceC8771i4<?>, List<Size>> map, boolean z10, boolean z11, boolean z12, boolean z13) {
        boolean zM49311T;
        Range<Integer> rangeM49307N;
        m49314X();
        boolean zM49509l = C13576m4.m49509l(list, map.keySet());
        Map<InterfaceC8771i4<?>, List<Size>> mapM49513d = zM49509l ? this.f47355C.m49513d(map) : map;
        ArrayList arrayList = new ArrayList(mapM49513d.keySet());
        List<Integer> listM49292R = m49292R(arrayList);
        Map<InterfaceC8771i4<?>, C5902k0> mapM49596g = this.f47354B.m49596g(list, arrayList, listM49292R);
        C5931r1.m26561a("SupportedSurfaceCombination", "resolvedDynamicRanges = " + mapM49596g);
        boolean zM49294U = m49294U(list, mapM49513d);
        if (z13) {
            rangeM49307N = AbstractC8827t3.f32104a;
            zM49311T = false;
        } else {
            zM49311T = m49311T(list, arrayList);
            rangeM49307N = m49307N(list, arrayList, listM49292R, zM49311T);
        }
        Range<Integer> range = rangeM49307N;
        boolean z14 = zM49311T;
        C5931r1.m26561a("SupportedSurfaceCombination", "getSuggestedStreamSpecifications: isPreviewStabilizationOn = " + z10 + ", mIsPreviewStabilizationSupported = " + this.f47378v + ", isFeatureComboInvocation = " + z12);
        if (z10 && !this.f47378v && z12) {
            throw new IllegalArgumentException("Preview stabilization is not supported by the camera.");
        }
        return m49315Y(m49340w(mapM49596g.values(), range, z10, zM49294U, z12), m49325h(i10, z11, mapM49596g, z10, zM49294U, zM49509l, z12, false, range, z14), list, mapM49513d, arrayList, listM49292R, mapM49596g, z13);
    }

    /* JADX INFO: renamed from: L */
    public final List<C8837v3> m49305L(d dVar) {
        if (this.f47363g.containsKey(dVar)) {
            return this.f47363g.get(dVar);
        }
        List<C8837v3> arrayList = new ArrayList<>();
        if (dVar.mo49230k()) {
            if (this.f47362f.isEmpty()) {
                m49330m();
            }
            arrayList.addAll(this.f47362f);
        } else if (dVar.mo49229i()) {
            if (this.f47365i.isEmpty()) {
                m49336s();
            }
            if (dVar.mo49221a() == 0) {
                arrayList.addAll(this.f47365i);
            }
        } else if (dVar.mo49226f()) {
            if (this.f47361e.isEmpty()) {
                m49331n();
            }
            arrayList.addAll(this.f47361e);
        } else if (dVar.mo49222b() == 8) {
            int iMo49221a = dVar.mo49221a();
            if (iMo49221a == 1) {
                arrayList = this.f47359c;
            } else if (iMo49221a != 2) {
                arrayList.addAll(dVar.mo49227g() ? this.f47360d : this.f47357a);
            } else {
                arrayList.addAll(this.f47358b);
                arrayList.addAll(this.f47357a);
            }
        } else if (dVar.mo49222b() == 10 && dVar.mo49221a() == 0) {
            arrayList.addAll(this.f47364h);
        }
        this.f47363g.put(dVar, arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: M */
    public final Pair<List<SurfaceConfig>, Integer> m49306M(d dVar, List<AbstractC8754g> list, List<Size> list2, List<InterfaceC8771i4<?>> list3, List<Integer> list4, int i10, Map<Integer, AbstractC8754g> map, Map<Integer, InterfaceC8771i4<?>> map2) {
        ArrayList arrayList = new ArrayList();
        for (AbstractC8754g abstractC8754g : list) {
            arrayList.add(abstractC8754g.mo35101h());
            if (map != null) {
                map.put(Integer.valueOf(arrayList.size() - 1), abstractC8754g);
            }
        }
        for (int i11 = 0; i11 < list2.size(); i11++) {
            Size size = list2.get(i11);
            InterfaceC8771i4<?> interfaceC8771i4 = list3.get(list4.get(i11).intValue());
            int iMo26767p = interfaceC8771i4.mo26767p();
            arrayList.add(SurfaceConfig.m35480l(iMo26767p, size, m49309P(iMo26767p), dVar.mo49221a(), dVar.mo49230k() ? SurfaceConfig.c.FEATURE_COMBINATION_TABLE : SurfaceConfig.c.CAPTURE_SESSION_TABLES, interfaceC8771i4.m35206W()));
            if (map2 != null) {
                map2.put(Integer.valueOf(arrayList.size() - 1), interfaceC8771i4);
            }
            i10 = m49308O(i10, interfaceC8771i4.mo26767p(), size, dVar.mo49226f());
        }
        return new Pair<>(arrayList, Integer.valueOf(i10));
    }

    /* JADX INFO: renamed from: N */
    public final Range<Integer> m49307N(List<AbstractC8754g> list, List<InterfaceC8771i4<?>> list2, List<Integer> list3, boolean z10) {
        Range<Integer> rangeM49310Q = AbstractC8827t3.f32104a;
        Iterator<AbstractC8754g> it = list.iterator();
        while (it.hasNext()) {
            rangeM49310Q = m49310Q(it.next().mo35102i(), rangeM49310Q, z10);
        }
        Iterator<Integer> it2 = list3.iterator();
        while (it2.hasNext()) {
            Range<Integer> rangeM35215z = list2.get(it2.next().intValue()).m35215z(AbstractC8827t3.f32104a);
            Objects.requireNonNull(rangeM35215z);
            rangeM49310Q = m49310Q(rangeM35215z, rangeM49310Q, z10);
        }
        return rangeM49310Q;
    }

    /* JADX INFO: renamed from: O */
    public final int m49308O(int i10, int i11, Size size, boolean z10) {
        return Math.min(i10, m49342y(i11, size, z10));
    }

    /* JADX INFO: renamed from: P */
    public AbstractC8847x3 m49309P(int i10) {
        if (!this.f47380x.contains(Integer.valueOf(i10))) {
            m49320c0(this.f47379w.mo35422n(), C12274d.f43484e, i10);
            m49320c0(this.f47379w.mo35421l(), C12274d.f43486g, i10);
            m49318b0(this.f47379w.mo35418h(), i10, null);
            m49318b0(this.f47379w.mo35417f(), i10, C10084a.f36314a);
            m49318b0(this.f47379w.mo35416d(), i10, C10084a.f36316c);
            m49322d0(this.f47379w.mo35423p(), i10);
            this.f47380x.add(Integer.valueOf(i10));
        }
        return this.f47379w;
    }

    /* JADX DEBUG: Type inference failed for r3v1. Raw type applied. Possible types: android.util.Range<T extends java.lang.Comparable<? super T>>, android.util.Range<java.lang.Integer> */
    /* JADX INFO: renamed from: Q */
    public final Range<Integer> m49310Q(Range<Integer> range, Range<Integer> range2, boolean z10) {
        Range<Integer> range3 = AbstractC8827t3.f32104a;
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
            C12637g.m47078j(range == range2, "All targetFrameRate should be the same if strict fps is required");
            return range;
        }
        try {
            return range2.intersect(range);
        } catch (IllegalArgumentException unused) {
            return range2;
        }
    }

    /* JADX INFO: renamed from: T */
    public final boolean m49311T(List<AbstractC8754g> list, List<InterfaceC8771i4<?>> list2) {
        Iterator<AbstractC8754g> it = list.iterator();
        Boolean boolValueOf = null;
        while (it.hasNext()) {
            boolValueOf = Boolean.valueOf(m49339v(it.next().mo35103j(), boolValueOf));
        }
        Iterator<InterfaceC8771i4<?>> it2 = list2.iterator();
        while (it2.hasNext()) {
            boolValueOf = Boolean.valueOf(m49339v(it2.next().m35202H(), boolValueOf));
        }
        if (boolValueOf != null) {
            return boolValueOf.booleanValue();
        }
        return false;
    }

    /* JADX INFO: renamed from: V */
    public final boolean m49312V(d dVar, List<AbstractC8754g> list, Map<InterfaceC8771i4<?>, List<Size>> map) {
        ArrayList arrayList = new ArrayList();
        Iterator<AbstractC8754g> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().mo35101h());
        }
        C10089e c10089e = new C10089e();
        for (InterfaceC8771i4<?> interfaceC8771i4 : map.keySet()) {
            List<Size> list2 = map.get(interfaceC8771i4);
            C12637g.m47070b((list2 == null || list2.isEmpty()) ? false : true, "No available output size is found for " + interfaceC8771i4 + ".");
            Size size = (Size) Collections.min(list2, c10089e);
            int iMo26767p = interfaceC8771i4.mo26767p();
            arrayList.add(SurfaceConfig.m35480l(iMo26767p, size, m49309P(iMo26767p), dVar.mo49221a(), SurfaceConfig.c.CAPTURE_SESSION_TABLES, interfaceC8771i4.m35206W()));
        }
        Map<SurfaceConfig, C5902k0> map2 = Collections.EMPTY_MAP;
        List<InterfaceC8771i4<?>> list3 = Collections.EMPTY_LIST;
        return m49323e(dVar, arrayList, map2, list3, list3);
    }

    /* JADX INFO: renamed from: W */
    public final void m49313W(d dVar, Range<Integer> range, Size size, int i10, EnumC8832u3 enumC8832u3, boolean z10, Map<SurfaceConfig.b, Set<Integer>> map, List<Size> list) {
        SurfaceConfig.b configSize = SurfaceConfig.m35480l(i10, size, m49309P(i10), dVar.mo49221a(), dVar.mo49230k() ? SurfaceConfig.c.FEATURE_COMBINATION_TABLE : SurfaceConfig.c.CAPTURE_SESSION_TABLES, enumC8832u3).getConfigSize();
        Range<Integer> range2 = AbstractC8827t3.f32104a;
        int iM49342y = (!range2.equals(range) || z10) ? m49342y(i10, size, dVar.mo49226f()) : Integer.MAX_VALUE;
        if (dVar.mo49225e()) {
            if (configSize == SurfaceConfig.b.f32175q) {
                return;
            }
            if (!range2.equals(range) && iM49342y < ((Integer) range.getUpper()).intValue()) {
                return;
            }
        }
        Set<Integer> hashSet = map.get(configSize);
        if (hashSet == null) {
            hashSet = new HashSet<>();
            map.put(configSize, hashSet);
        }
        if (hashSet.contains(Integer.valueOf(iM49342y))) {
            return;
        }
        list.add(size);
        hashSet.add(Integer.valueOf(iM49342y));
    }

    /* JADX INFO: renamed from: X */
    public final void m49314X() {
        this.f47381y.m49580g();
        if (this.f47379w == null) {
            m49335r();
        } else {
            this.f47379w = AbstractC8847x3.m35508a(this.f47379w.mo35415b(), this.f47379w.mo35422n(), this.f47381y.m49579f(), this.f47379w.mo35421l(), this.f47379w.mo35420j(), this.f47379w.mo35418h(), this.f47379w.mo35417f(), this.f47379w.mo35416d(), this.f47379w.mo35423p());
        }
    }

    /* JADX INFO: renamed from: Y */
    public final SurfaceStreamSpecQueryResult m49315Y(c cVar, d dVar, List<AbstractC8754g> list, Map<InterfaceC8771i4<?>, List<Size>> map, List<InterfaceC8771i4<?>> list2, List<Integer> list3, Map<InterfaceC8771i4<?>, C5902k0> map2, boolean z10) {
        C5931r1.m26561a("SupportedSurfaceCombination", "resolveSpecsByCheckingMethod: checkingMethod = " + cVar);
        int iOrdinal = cVar.ordinal();
        if (iOrdinal == 1) {
            return m49316Z(m49325h(dVar.mo49221a(), dVar.mo49224d(), map2, dVar.mo49227g(), dVar.mo49229i(), dVar.mo49226f(), dVar.mo49225e(), true, dVar.mo49223c(), dVar.mo49228h()), list, map, list2, list3, map2, z10);
        }
        if (iOrdinal != 2) {
            return m49316Z(dVar, list, map, list2, list3, map2, z10);
        }
        try {
            return m49316Z(dVar, list, map, list2, list3, map2, z10);
        } catch (IllegalArgumentException e10) {
            C5931r1.m26562b("SupportedSurfaceCombination", "Failed to find a supported combination without feature combo, trying again with feature combo", e10);
            return m49316Z(m49325h(dVar.mo49221a(), dVar.mo49224d(), map2, dVar.mo49227g(), dVar.mo49229i(), dVar.mo49226f(), dVar.mo49225e(), true, dVar.mo49223c(), dVar.mo49228h()), list, map, list2, list3, map2, z10);
        }
    }

    /* JADX INFO: renamed from: Z */
    public final SurfaceStreamSpecQueryResult m49316Z(d dVar, List<AbstractC8754g> list, Map<InterfaceC8771i4<?>, List<Size>> map, List<InterfaceC8771i4<?>> list2, List<Integer> list3, Map<InterfaceC8771i4<?>, C5902k0> map2, boolean z10) {
        HashMap map3;
        HashMap map4;
        int i10;
        List<AbstractC8754g> list4 = list;
        List<InterfaceC8771i4<?>> list5 = list2;
        C5931r1.m26561a("SupportedSurfaceCombination", "resolveSpecsBySettings: featureSettings = " + dVar);
        if (!dVar.mo49230k() && !m49312V(dVar, list, map)) {
            throw new IllegalArgumentException("No supported surface combination is found for camera device - Id : " + this.f47367k + ".  May be attempting to bind too many use cases. Existing surfaces: " + list4 + ". New configs: " + list5 + ". GroupableFeature settings: " + dVar);
        }
        Map<InterfaceC8771i4<?>, List<Size>> mapM49326i = m49326i(map, dVar, z10);
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it = list3.iterator();
        while (it.hasNext()) {
            InterfaceC8771i4<?> interfaceC8771i4 = list5.get(it.next().intValue());
            List<Size> list6 = mapM49326i.get(interfaceC8771i4);
            if (list6 == null) {
                list6 = Collections.EMPTY_LIST;
            }
            arrayList.add(m49319c(list6, interfaceC8771i4.mo26767p()));
        }
        List<List<Size>> listM49519j = dVar.mo49226f() ? this.f47355C.m49519j(arrayList) : m49338u(arrayList);
        HashMap map5 = new HashMap();
        HashMap map6 = new HashMap();
        HashMap map7 = new HashMap();
        HashMap map8 = new HashMap();
        boolean zM49192d = C13497c5.m49192d(list4, list5);
        int iM49299B = m49299B(list4, dVar.mo49226f());
        List<SurfaceConfig> listM49300C = null;
        if (!this.f47375s || zM49192d) {
            map3 = map7;
            map4 = map8;
            i10 = iM49299B;
        } else {
            Iterator<List<Size>> it2 = listM49519j.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    map3 = map7;
                    map4 = map8;
                    i10 = iM49299B;
                    break;
                }
                Pair<List<SurfaceConfig>, Integer> pairM49306M = m49306M(dVar, list4, it2.next(), list5, list3, iM49299B, map7, map8);
                map3 = map7;
                map4 = map8;
                i10 = iM49299B;
                listM49300C = m49300C(dVar, (List) pairM49306M.first, map3, map4);
                if (listM49300C != null) {
                    break;
                }
                map3.clear();
                map4.clear();
                list5 = list2;
                map7 = map3;
                iM49299B = i10;
                list4 = list;
                map8 = map4;
            }
            C5931r1.m26561a("SupportedSurfaceCombination", "orderedSurfaceConfigListForStreamUseCase = " + listM49300C);
        }
        List<SurfaceConfig> list7 = listM49300C;
        HashMap map9 = map3;
        HashMap map10 = map4;
        b bVarM49327j = m49327j(dVar, list, list2, list3, listM49519j, list7, map2, i10, z10);
        C5931r1.m26561a("SupportedSurfaceCombination", "resolveSpecsBySettings: bestSizesAndFps = " + bVarM49327j);
        List<Size> listMo49215a = bVarM49327j.mo49215a();
        int iMo49218d = bVarM49327j.mo49218d();
        List<Size> listMo49216b = bVarM49327j.mo49216b();
        int iMo49219e = bVarM49327j.mo49219e();
        int iMo49217c = bVarM49327j.mo49217c();
        if (listMo49215a == null) {
            throw new IllegalArgumentException("No supported surface combination is found for camera device - Id : " + this.f47367k + " and Hardware level: " + this.f47371o + ". May be the specified resolution is too large and not supported. Existing surfaces: " + list + " New configs: " + list2);
        }
        Range<Integer> rangeM49341x = AbstractC8827t3.f32104a;
        if (rangeM49341x.equals(dVar.mo49223c())) {
            iMo49217c = iMo49217c;
            if (dVar.mo49226f()) {
                rangeM49341x = m49341x(C13576m4.f47526f, iMo49218d, this.f47355C.m49515f(listMo49215a));
            }
        } else {
            Range<Integer>[] rangeArrM49515f = dVar.mo49226f() ? this.f47355C.m49515f(listMo49215a) : (Range[]) this.f47369m.m9a(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
            Range<Integer> rangeM49341x2 = m49341x(dVar.mo49223c(), iMo49218d, rangeArrM49515f);
            if (dVar.mo49225e() || dVar.mo49228h()) {
                C12637g.m47070b(rangeM49341x2.equals(dVar.mo49223c()), "Target FPS range " + dVar.mo49223c() + " is not supported. Max FPS supported by the calculated best combination: " + iMo49218d + ". Calculated best FPS range for device: " + rangeM49341x2 + ". Device supported FPS ranges: " + Arrays.toString(rangeArrM49515f));
            }
            rangeM49341x = rangeM49341x2;
        }
        Iterator<InterfaceC8771i4<?>> it3 = list2.iterator();
        while (it3.hasNext()) {
            InterfaceC8771i4<?> next = it3.next();
            Iterator<InterfaceC8771i4<?>> it4 = it3;
            AbstractC8827t3.a aVarMo35406h = AbstractC8827t3.m35424a(listMo49215a.get(list3.indexOf(Integer.valueOf(list2.indexOf(next))))).mo35405g(dVar.mo49226f() ? 1 : 0).mo35400b((C5902k0) C12637g.m47075g(map2.get(next))).mo35402d(C13497c5.m49193e(next)).mo35406h(dVar.mo49224d());
            if (!AbstractC8827t3.f32104a.equals(rangeM49341x)) {
                aVarMo35406h.mo35401c(rangeM49341x);
            }
            map6.put(next, aVarMo35406h.mo35399a());
            it3 = it4;
        }
        if (list7 != null && iMo49218d == iMo49219e && listMo49215a.size() == listMo49216b.size()) {
            for (int i11 = 0; i11 < listMo49215a.size(); i11++) {
                if (listMo49215a.get(i11).equals(listMo49216b.get(i11))) {
                }
            }
            if (!C13497c5.m49195k(this.f47369m, list, map6, map5)) {
                C13497c5.m49196l(map6, map5, map9, map10, list7);
            }
        }
        return new SurfaceStreamSpecQueryResult(map6, map5, iMo49217c);
    }

    /* JADX INFO: renamed from: a0 */
    public SurfaceConfig m49317a0(int i10, int i11, Size size, EnumC8832u3 enumC8832u3) {
        return SurfaceConfig.m35480l(i11, size, m49309P(i11), i10, SurfaceConfig.c.CAPTURE_SESSION_TABLES, enumC8832u3);
    }

    /* JADX INFO: renamed from: b0 */
    public final void m49318b0(Map<Integer, Size> map, int i10, Rational rational) {
        Size sizeM49298A = m49298A(this.f47369m.m13e().m96h(), i10, true, rational);
        if (sizeM49298A != null) {
            map.put(Integer.valueOf(i10), sizeM49298A);
        }
    }

    /* JADX INFO: renamed from: c */
    public List<Size> m49319c(List<Size> list, int i10) {
        Rational rational;
        int iM22065a = this.f47382z.m22065a(this.f47367k, this.f47369m);
        if (iM22065a == 0) {
            rational = C10084a.f36314a;
        } else if (iM22065a != 1) {
            rational = null;
            if (iM22065a == 2) {
                Size sizeM35511g = m49309P(256).m35511g(256);
                if (sizeM35511g != null) {
                    rational = new Rational(sizeM35511g.getWidth(), sizeM35511g.getHeight());
                }
            } else if (iM22065a != 3) {
                throw new AssertionError("Undefined targetAspectRatio: " + iM22065a);
            }
        } else {
            rational = C10084a.f36316c;
        }
        if (rational != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (Size size : list) {
                if (C10084a.m38864a(size, rational)) {
                    arrayList.add(size);
                } else {
                    arrayList2.add(size);
                }
            }
            arrayList2.addAll(0, arrayList);
            list = arrayList2;
        }
        return this.f47353A.m22061a(SurfaceConfig.m35478f(i10), list);
    }

    /* JADX INFO: renamed from: c0 */
    public final void m49320c0(Map<Integer, Size> map, Size size, int i10) {
        if (this.f47374r) {
            Size sizeM49298A = m49298A(this.f47369m.m13e().m96h(), i10, false, null);
            Integer numValueOf = Integer.valueOf(i10);
            if (sizeM49298A != null) {
                size = (Size) Collections.min(Arrays.asList(size, sizeM49298A), new C10089e());
            }
            map.put(numValueOf, size);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m49321d() {
    }

    /* JADX INFO: renamed from: d0 */
    public final void m49322d0(Map<Integer, Size> map, int i10) {
        StreamConfigurationMap streamConfigurationMap;
        if (Build.VERSION.SDK_INT < 31 || !this.f47376t || (streamConfigurationMap = (StreamConfigurationMap) this.f47369m.m9a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP_MAXIMUM_RESOLUTION)) == null) {
            return;
        }
        map.put(Integer.valueOf(i10), m49298A(streamConfigurationMap, i10, true, null));
    }

    /* JADX INFO: renamed from: e */
    public boolean m49323e(d dVar, List<SurfaceConfig> list, Map<SurfaceConfig, C5902k0> map, List<InterfaceC8771i4<?>> list2, List<Integer> list3) {
        Iterator<C8837v3> it = m49305L(dVar).iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            z10 = it.next().m35469d(list) != null;
            if (z10) {
                break;
            }
        }
        if (!z10 || !dVar.mo49230k()) {
            return z10;
        }
        C8802o3 c8802o3M49324g = m49324g(dVar, list, map, list2, list3);
        boolean zMo29674b = this.f47356D.mo29674b(c8802o3M49324g);
        Iterator<AbstractC8830u1> it2 = c8802o3M49324g.m35310p().iterator();
        while (it2.hasNext()) {
            it2.next().mo35430d();
        }
        return zMo29674b;
    }

    /* JADX INFO: renamed from: g */
    public final C8802o3 m49324g(d dVar, List<SurfaceConfig> list, Map<SurfaceConfig, C5902k0> map, List<InterfaceC8771i4<?>> list2, List<Integer> list3) {
        Range<Integer> rangeMo49223c = dVar.mo49223c();
        C8802o3.h hVar = new C8802o3.h();
        for (int i10 = 0; i10 < list.size(); i10++) {
            SurfaceConfig surfaceConfig = list.get(i10);
            Size sizeM35483h = surfaceConfig.m35483h(m49309P(surfaceConfig.getImageFormat()));
            InterfaceC8771i4<?> interfaceC8771i4 = list2.get(list3.get(i10).intValue());
            C5902k0 c5902k0 = map.get(surfaceConfig);
            Objects.requireNonNull(c5902k0);
            C8802o3.b bVarM29673a = InterfaceC7011a.m29673a(interfaceC8771i4, sizeM35483h, c5902k0);
            bVarM29673a.m35336v(AbstractC8827t3.f32104a.equals(rangeMo49223c) ? FpsRangeFeature.f28495k : rangeMo49223c);
            if (dVar.mo49227g()) {
                bVarM29673a.m35340z(2);
            }
            hVar.m35358b(bVarM29673a.m35331p());
            C12637g.m47078j(hVar.m35363g(), "Cannot create a combined SessionConfig for feature combo after adding " + interfaceC8771i4 + " with " + surfaceConfig + " due to [" + hVar.m35361e() + "]; surfaceConfigList = " + list + ", featureSettings = " + dVar + ", newUseCaseConfigs = " + list2);
        }
        return hVar.m35359c();
    }

    /* JADX INFO: renamed from: h */
    public final d m49325h(int i10, boolean z10, Map<InterfaceC8771i4<?>, C5902k0> map, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, Range<Integer> range, boolean z16) {
        int iM49291J = m49291J(map);
        if (i10 != 0 && z12) {
            throw new IllegalArgumentException(String.format("Camera device id is %s. Ultra HDR is not currently supported in %s camera mode.", this.f47367k, C8809q0.m35373a(i10)));
        }
        if (i10 != 0 && iM49291J == 10) {
            throw new IllegalArgumentException(String.format("Camera device id is %s. 10 bit dynamic range is not currently supported in %s camera mode.", this.f47367k, C8809q0.m35373a(i10)));
        }
        if (i10 != 0 && z14) {
            throw new IllegalArgumentException(String.format("Camera device id is %s. Feature combination query is not currently supported in %s camera mode.", this.f47367k, C8809q0.m35373a(i10)));
        }
        if (z13 && z14) {
            throw new IllegalArgumentException("High-speed session is not supported with feature combination");
        }
        if (z13 && !this.f47355C.m49521m()) {
            throw new IllegalArgumentException("High-speed session is not supported on this device.");
        }
        if (z14 && range == AbstractC8827t3.f32104a && z15) {
            range = FpsRangeFeature.f28495k;
        }
        return d.m49347j(i10, z10, iM49291J, z11, z12, z13, z14, z15, range, z16);
    }

    /* JADX INFO: renamed from: i */
    public Map<InterfaceC8771i4<?>, List<Size>> m49326i(Map<InterfaceC8771i4<?>, List<Size>> map, d dVar, boolean z10) {
        HashMap map2 = new HashMap();
        for (InterfaceC8771i4<?> interfaceC8771i4 : map.keySet()) {
            ArrayList arrayList = new ArrayList();
            HashMap map3 = new HashMap();
            List<Size> list = map.get(interfaceC8771i4);
            Objects.requireNonNull(list);
            Iterator<Size> it = list.iterator();
            while (it.hasNext()) {
                m49313W(dVar, dVar.mo49223c(), it.next(), interfaceC8771i4.mo26767p(), interfaceC8771i4.m35206W(), z10, map3, arrayList);
            }
            map2.put(interfaceC8771i4, arrayList);
        }
        return map2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v8, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v6, resolved type: T */
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
    /* JADX INFO: renamed from: j */
    public final b m49327j(final d dVar, List<AbstractC8754g> list, final List<InterfaceC8771i4<?>> list2, final List<Integer> list3, List<List<Size>> list4, List<SurfaceConfig> list5, Map<InterfaceC8771i4<?>, C5902k0> map, int i10, boolean z10) {
        d dVar2;
        Range<Integer> rangeMo49223c = dVar.mo49223c();
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
            Pair<List<SurfaceConfig>, Integer> pairM49306M = m49306M(dVar, list, next, list2, list3, i10, map2, map3);
            final List<SurfaceConfig> list8 = (List) pairM49306M.first;
            int iIntValue = ((Integer) pairM49306M.second).intValue();
            boolean zM49293S = m49293S(i10, rangeMo49223c, iIntValue);
            final HashMap map4 = new HashMap();
            Iterator<List<Size>> it2 = it;
            int i14 = 0;
            while (i14 < list8.size()) {
                SurfaceConfig surfaceConfig = list8.get(i14);
                C5902k0 c5902k0Mo35096c = C5902k0.f22549c;
                int i15 = i14;
                if (map2.containsKey(Integer.valueOf(i15))) {
                    AbstractC8754g abstractC8754g = map2.get(Integer.valueOf(i15));
                    Objects.requireNonNull(abstractC8754g);
                    c5902k0Mo35096c = abstractC8754g.mo35096c();
                } else {
                    if (map3.containsKey(Integer.valueOf(i15))) {
                        InterfaceC8771i4<?> interfaceC8771i4 = map3.get(Integer.valueOf(i15));
                        Objects.requireNonNull(interfaceC8771i4);
                        c5902k0Mo35096c = map.get(interfaceC8771i4);
                    }
                    map4.put(surfaceConfig, c5902k0Mo35096c);
                    i14 = i15 + 1;
                }
                map4.put(surfaceConfig, c5902k0Mo35096c);
                i14 = i15 + 1;
            }
            C7337e0 c7337e0 = new C7337e0(new Function0() { // from class: z.f5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Boolean.valueOf(this.f47291a.m49323e(dVar, list8, map4, list2, list3));
                }
            });
            if (z10 && ((Boolean) c7337e0.getValue()).booleanValue() && (i11 == Integer.MAX_VALUE || i11 < iIntValue)) {
                i11 = iIntValue;
            }
            if (!z11 && ((Boolean) c7337e0.getValue()).booleanValue()) {
                if (i12 == Integer.MAX_VALUE || i12 < iIntValue) {
                    i12 = iIntValue;
                    list6 = next;
                }
                if (!zM49293S) {
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
                    if (m49300C(dVar2, list8, map2, map3) != null) {
                        if (i13 == Integer.MAX_VALUE || i13 < iIntValue) {
                            i13 = iIntValue;
                            list7 = next;
                        }
                        if (!zM49293S) {
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
        return (!dVar2.mo49225e() || AbstractC8827t3.f32104a.equals(rangeMo49223c) || (i12 != Integer.MAX_VALUE && i12 >= ((Integer) rangeMo49223c.getUpper()).intValue())) ? b.m49345f(list6, list7, i12, i13, i11) : b.m49345f(null, null, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
    }

    /* JADX INFO: renamed from: k */
    public final void m49328k() {
        this.f47364h.addAll(C13544i4.m49440e());
    }

    /* JADX INFO: renamed from: l */
    public final void m49329l() {
        this.f47359c.addAll(C13544i4.m49442g());
    }

    /* JADX INFO: renamed from: m */
    public final void m49330m() {
        this.f47362f.addAll(C13544i4.m49438c());
    }

    /* JADX INFO: renamed from: n */
    public final void m49331n() {
        if (this.f47355C.m49521m()) {
            this.f47361e.clear();
            Size sizeM49518i = this.f47355C.m49518i();
            if (sizeM49518i != null) {
                this.f47361e.addAll(C13544i4.m49437b(sizeM49518i, m49309P(34)));
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m49332o() {
        if (Build.VERSION.SDK_INT >= 33) {
            this.f47360d.addAll(C13544i4.m49447l());
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m49333p() {
        if (Build.VERSION.SDK_INT >= 33) {
            this.f47366j.addAll(C13544i4.m49449n());
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m49334q() {
        this.f47357a.addAll(C13544i4.m49439d(this.f47371o, this.f47372p, this.f47373q));
        this.f47357a.addAll(this.f47370n.m22030a(this.f47367k));
    }

    /* JADX INFO: renamed from: r */
    public final void m49335r() {
        this.f47379w = AbstractC8847x3.m35508a(C12274d.f43482c, new HashMap(), this.f47381y.m49579f(), new HashMap(), m49301G(), new HashMap(), new HashMap(), new HashMap(), new HashMap());
    }

    /* JADX INFO: renamed from: s */
    public final void m49336s() {
        this.f47365i.addAll(C13544i4.m49450o());
    }

    /* JADX INFO: renamed from: t */
    public final void m49337t() {
        this.f47358b.addAll(C13544i4.m49451p());
    }

    /* JADX INFO: renamed from: u */
    public final List<List<Size>> m49338u(List<List<Size>> list) {
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

    /* JADX INFO: renamed from: v */
    public final boolean m49339v(boolean z10, Boolean bool) {
        if (bool == null || bool.booleanValue() == z10) {
            return z10;
        }
        throw new IllegalStateException("All isStrictFpsRequired should be the same");
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:10:0x001d */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:12:0x0021 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v12, resolved type: int */
    /* JADX DEBUG: Multi-variable search result rejected for r1v13, resolved type: int */
    /* JADX DEBUG: Multi-variable search result rejected for r1v14, resolved type: int */
    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: int */
    /* JADX DEBUG: Multi-variable search result rejected for r1v3, resolved type: int */
    /* JADX DEBUG: Multi-variable search result rejected for r1v4, resolved type: int */
    /* JADX DEBUG: Multi-variable search result rejected for r1v8, resolved type: int */
    /* JADX DEBUG: Multi-variable search result rejected for r1v9, resolved type: int */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean, int] */
    /* JADX INFO: renamed from: w */
    public final c m49340w(Collection<C5902k0> collection, Range<Integer> range, boolean z10, boolean z11, boolean z12) {
        int i10;
        if (!z12) {
            return c.WITHOUT_FEATURE_COMBO;
        }
        ?? Contains = collection.contains(C5902k0.f22552f);
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

    /* JADX INFO: renamed from: x */
    public final Range<Integer> m49341x(Range<Integer> range, int i10, Range<Integer>[] rangeArr) {
        Range<Integer> rangeM49297f = AbstractC8827t3.f32104a;
        if (rangeM49297f.equals(range) || rangeArr == null) {
            return rangeM49297f;
        }
        Range<T> range2 = new Range<>(Integer.valueOf(Math.min(((Integer) range.getLower()).intValue(), i10)), Integer.valueOf(Math.min(((Integer) range.getUpper()).intValue(), i10)));
        int iM49290F = 0;
        for (Range<Integer> range3 : rangeArr) {
            Objects.requireNonNull(range3);
            if (i10 >= ((Integer) range3.getLower()).intValue()) {
                if (rangeM49297f.equals(AbstractC8827t3.f32104a)) {
                    rangeM49297f = range3;
                }
                if (range3.equals(range2)) {
                    return range3;
                }
                try {
                    int iM49290F2 = m49290F(range3.intersect(range2));
                    if (iM49290F == 0) {
                        iM49290F = iM49290F2;
                    } else {
                        if (iM49290F2 >= iM49290F) {
                            rangeM49297f = m49297f(range2, rangeM49297f, range3);
                            iM49290F = m49290F(range2.intersect(rangeM49297f));
                        }
                        range3 = rangeM49297f;
                    }
                } catch (IllegalArgumentException unused) {
                    if (iM49290F != 0 || (m49289E(range3, range2) >= m49289E(rangeM49297f, range2) && (m49289E(range3, range2) != m49289E(rangeM49297f, range2) || (((Integer) range3.getLower()).intValue() <= ((Integer) rangeM49297f.getUpper()).intValue() && m49290F(range3) >= m49290F(rangeM49297f))))) {
                    }
                }
                rangeM49297f = range3;
            }
        }
        return rangeM49297f;
    }

    /* JADX INFO: renamed from: y */
    public final int m49342y(int i10, Size size, boolean z10) {
        C12637g.m47077i(!z10 || i10 == 34);
        return z10 ? this.f47355C.m49517h(size) : m49343z(this.f47369m, i10, size);
    }

    /* JADX INFO: renamed from: z */
    public final int m49343z(C0008c0 c0008c0, int i10, Size size) {
        C0044u0 c0044u0M13e = c0008c0.m13e();
        Objects.requireNonNull(c0044u0M13e);
        long jM94f = c0044u0M13e.m94f(i10, size);
        if (jM94f > 0) {
            return (int) (1.0E9d / jM94f);
        }
        if (!this.f47377u) {
            return Integer.MAX_VALUE;
        }
        C5931r1.m26572l("SupportedSurfaceCombination", "minFrameDuration: " + jM94f + " is invalid for imageFormat = " + i10 + ", size = " + size);
        return 0;
    }
}
