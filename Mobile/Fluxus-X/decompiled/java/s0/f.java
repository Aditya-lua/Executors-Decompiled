package s0;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.util.Log;
import android.util.Range;
import android.util.Size;
import android.view.Surface;
import g0.a2;
import g0.f1;
import g0.i0;
import g0.k0;
import g0.r1;
import g0.t;
import g0.v2;
import g0.w2;
import g0.y2;
import j0.ResolvedFeatureGroup;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import n0.g2;
import n0.h0;
import n0.i4;
import n0.j4;
import n0.l0;
import n0.n1;
import n0.o3;
import n0.p0;
import n0.t3;
import n0.x2;
import x0.z0;

/* JADX INFO: loaded from: classes.dex */
public final class f implements g0.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0.f f31121a;
    public final n0.f b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j4 f31122c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g0.s f31123d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final h0.a f31126g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public y2 f31127h;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final h0 f31131l;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public w2 f31135p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public b1.g f31136q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final i0 f31137r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final i0 f31138s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final m f31140u;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<w2> f31124e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List<w2> f31125f = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public List<g0.n> f31128i = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f31129j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Range<Integer> f31130k = t3.f25159a;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Object f31132m = new Object();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f31133n = true;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public n1 f31134o = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final v0.e f31139t = new v0.e();

    public static final class a extends Exception {
        public a(Throwable th2) {
            super(th2);
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public i4<?> f31141a;
        public i4<?> b;

        public b(i4<?> i4Var, i4<?> i4Var2) {
            this.f31141a = i4Var;
            this.b = i4Var2;
        }
    }

    public f(p0 p0Var, p0 p0Var2, n0.e eVar, n0.e eVar2, i0 i0Var, i0 i0Var2, h0.a aVar, m mVar, j4 j4Var) {
        this.f31131l = eVar.C();
        this.f31121a = new n0.f(p0Var, eVar);
        if (p0Var2 == null || eVar2 == null) {
            this.b = null;
        } else {
            this.b = new n0.f(p0Var2, eVar2);
        }
        this.f31137r = i0Var;
        this.f31138s = i0Var2;
        this.f31126g = aVar;
        this.f31122c = j4Var;
        this.f31123d = g0.s.b(eVar, eVar2);
        this.f31140u = mVar;
    }

    public static Matrix B(Rect rect, Size size) {
        x2.g.b(rect.width() > 0 && rect.height() > 0, "Cannot compute viewport crop rects zero sized sensor rect.");
        RectF rectF = new RectF(rect);
        Matrix matrix = new Matrix();
        matrix.setRectToRect(new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight()), rectF, Matrix.ScaleToFit.CENTER);
        matrix.invert(matrix);
        return matrix;
    }

    public static void D(Collection<w2> collection) {
        Iterator<w2> it = collection.iterator();
        while (it.hasNext()) {
            it.next().Y(null);
        }
    }

    public static i4<?> I(j4 j4Var, b1.g gVar) {
        i4<?> i4VarM = new a2.a().f().m(false, j4Var);
        if (i4VarM == null) {
            return null;
        }
        x2 x2VarL0 = x2.l0(i4VarM);
        x2VarL0.m0(q.N);
        return gVar.D(x2VarL0).e();
    }

    private int K() {
        synchronized (this.f31132m) {
            try {
                return this.f31126g.e() == 2 ? 1 : 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static Map<w2, b> L(Collection<w2> collection, j4 j4Var, j4 j4Var2, int i10, Range<Integer> range) {
        HashMap map = new HashMap();
        for (w2 w2Var : collection) {
            map.put(w2Var, new b(b1.g.A0(w2Var) ? I(j4Var, (b1.g) w2Var) : w2Var.m(false, j4Var), v(w2Var, w2Var.m(true, j4Var2), i10, range)));
        }
        return map;
    }

    public static boolean Q(t3 t3Var, o3 o3Var) {
        n1 n1VarD = t3Var.d();
        n1 n1VarG = o3Var.g();
        Objects.requireNonNull(n1VarD);
        if (n1VarD.b().size() != o3Var.g().b().size()) {
            return true;
        }
        for (n1.a<?> aVar : n1VarD.b()) {
            if (!n1VarG.a(aVar) || !Objects.equals(n1VarG.e(aVar), n1VarD.e(aVar))) {
                return true;
            }
        }
        return false;
    }

    public static boolean R(Collection<w2> collection) {
        Iterator<w2> it = collection.iterator();
        while (it.hasNext()) {
            if (a0(it.next().l().M())) {
                return true;
            }
        }
        return false;
    }

    public static boolean S(Collection<w2> collection) {
        for (w2 w2Var : collection) {
            if (Z(w2Var)) {
                i4<?> i4VarL = w2Var.l();
                n1.a<?> aVar = g2.U;
                if (i4VarL.a(aVar) && ((Integer) x2.g.g((Integer) i4VarL.e(aVar))).intValue() == 2) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean T(Collection<w2> collection) {
        for (w2 w2Var : collection) {
            if (Z(w2Var)) {
                i4<?> i4VarL = w2Var.l();
                n1.a<?> aVar = g2.U;
                if (i4VarL.a(aVar) && ((Integer) x2.g.g((Integer) i4VarL.e(aVar))).intValue() == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean U(Collection<w2> collection) {
        Iterator<w2> it = collection.iterator();
        while (it.hasNext()) {
            if (e0(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean W(Collection<w2> collection) {
        boolean z10 = false;
        boolean z11 = false;
        for (w2 w2Var : collection) {
            if (b0(w2Var) || b1.g.A0(w2Var)) {
                z10 = true;
            } else if (Z(w2Var)) {
                z11 = true;
            }
        }
        return z10 && !z11;
    }

    public static boolean X(Collection<w2> collection) {
        boolean z10 = false;
        boolean z11 = false;
        for (w2 w2Var : collection) {
            if (b0(w2Var) || b1.g.A0(w2Var)) {
                z11 = true;
            } else if (Z(w2Var)) {
                z10 = true;
            }
        }
        return z10 && !z11;
    }

    @SafeVarargs
    public static boolean Y(List<w2>... listArr) {
        boolean z10 = false;
        for (List<w2> list : listArr) {
            Iterator<w2> it = list.iterator();
            while (it.hasNext()) {
                if (it.next().o() != null) {
                    z10 = true;
                    break;
                }
            }
            if (z10) {
                return z10;
            }
        }
        return z10;
    }

    public static boolean Z(w2 w2Var) {
        return w2Var instanceof f1;
    }

    public static boolean a0(k0 k0Var) {
        return (k0Var.a() == 10) || (k0Var.b() != 1 && k0Var.b() != 0);
    }

    public static boolean b0(w2 w2Var) {
        return w2Var instanceof a2;
    }

    public static boolean d0(Collection<w2> collection) {
        int[] iArr = {1, 2, 4};
        HashSet hashSet = new HashSet();
        for (w2 w2Var : collection) {
            for (int i10 = 0; i10 < 3; i10++) {
                int i11 = iArr[i10];
                if (w2Var.F(i11)) {
                    if (hashSet.contains(Integer.valueOf(i11))) {
                        return false;
                    }
                    hashSet.add(Integer.valueOf(i11));
                }
            }
        }
        return true;
    }

    public static boolean e0(w2 w2Var) {
        if (w2Var != null) {
            if (w2Var.l().a(i4.G)) {
                return w2Var.l().X() == j4.b.VIDEO_CAPTURE;
            }
            Log.e("CameraUseCaseAdapter", w2Var + " UseCase does not have capture type.");
        }
        return false;
    }

    public static /* synthetic */ void g(v2 v2Var) {
        final SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(v2Var.q().getWidth(), v2Var.q().getHeight());
        surfaceTexture.detachFromGLContext();
        final Surface surface = new Surface(surfaceTexture);
        v2Var.w(surface, q0.c.b(), new x2.a() { // from class: s0.d
            @Override // x2.a
            public final void accept(Object obj) {
                f.m(surface, surfaceTexture, (v2.g) obj);
            }
        });
    }

    public static void g0(Map<w2, Set<i0.b>> map) {
        for (Map.Entry<w2, Set<i0.b>> entry : map.entrySet()) {
            entry.getKey().Y(entry.getValue());
        }
    }

    public static List<g0.n> j0(List<g0.n> list, Collection<w2> collection) {
        ArrayList arrayList = new ArrayList(list);
        for (w2 w2Var : collection) {
            w2Var.X(null);
            for (g0.n nVar : list) {
                if (w2Var.F(nVar.g())) {
                    x2.g.j(w2Var.n() == null, w2Var + " already has effect" + w2Var.n());
                    w2Var.X(nVar);
                    arrayList.remove(nVar);
                }
            }
        }
        return arrayList;
    }

    public static /* synthetic */ void m(Surface surface, SurfaceTexture surfaceTexture, v2.g gVar) {
        surface.release();
        surfaceTexture.release();
    }

    public static void p0(List<g0.n> list, Collection<w2> collection, Collection<w2> collection2) {
        List<g0.n> listJ0 = j0(list, collection);
        ArrayList arrayList = new ArrayList(collection2);
        arrayList.removeAll(collection);
        List<g0.n> listJ1 = j0(listJ0, arrayList);
        if (listJ1.isEmpty()) {
            return;
        }
        r1.l("CameraUseCaseAdapter", "Unused effects: " + listJ1);
    }

    public static Map<w2, Set<i0.b>> u(Collection<w2> collection, ResolvedFeatureGroup resolvedFeatureGroup) {
        HashMap map = new HashMap();
        for (w2 w2Var : collection) {
            map.put(w2Var, w2Var.o());
            w2Var.Y(resolvedFeatureGroup != null ? resolvedFeatureGroup.a() : null);
        }
        return map;
    }

    public static i4<?> v(w2 w2Var, i4<?> i4Var, int i10, Range<Integer> range) {
        x2 x2VarL0 = i4Var != null ? x2.l0(i4Var) : x2.k0();
        x2VarL0.G(i4.B, Integer.valueOf(i10));
        if (!t3.f25159a.equals(range)) {
            x2VarL0.D(i4.C, n1.c.HIGH_PRIORITY_REQUIRED, range);
            x2VarL0.G(i4.D, Boolean.TRUE);
        }
        return w2Var.D(x2VarL0).e();
    }

    public static Collection<w2> z(Collection<w2> collection, w2 w2Var, b1.g gVar) {
        ArrayList arrayList = new ArrayList(collection);
        if (w2Var != null) {
            arrayList.add(w2Var);
        }
        if (gVar != null) {
            arrayList.add(gVar);
            arrayList.removeAll(gVar.s0());
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0049  */
    public final w2 A(Collection<w2> collection, b1.g gVar) {
        w2 w2VarE;
        synchronized (this.f31132m) {
            try {
                ArrayList arrayList = new ArrayList(collection);
                if (gVar != null) {
                    arrayList.add(gVar);
                    arrayList.removeAll(gVar.s0());
                }
                if (!V()) {
                    w2VarE = null;
                } else if (X(arrayList)) {
                    w2VarE = b0(this.f31135p) ? this.f31135p : F();
                } else if (W(arrayList)) {
                    w2VarE = Z(this.f31135p) ? this.f31135p : E();
                } else {
                    w2VarE = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return w2VarE;
    }

    public final void C(Collection<w2> collection) {
        if (P()) {
            if (R(collection)) {
                throw new IllegalArgumentException("Extensions are only supported for use with standard dynamic range.");
            }
            if (S(collection)) {
                throw new IllegalArgumentException("Extensions are not supported for use with Raw image capture.");
            }
        }
        synchronized (this.f31132m) {
            try {
                if (!this.f31128i.isEmpty() && (T(collection) || S(collection))) {
                    throw new IllegalArgumentException("Ultra HDR image and Raw capture does not support for use with CameraEffect.");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final f1 E() {
        return new f1.b().s("ImageCapture-Extra").f();
    }

    public final a2 F() {
        a2 a2VarF = new a2.a().p("Preview-Extra").f();
        a2VarF.q0(new a2.c() { // from class: s0.e
            @Override // g0.a2.c
            public final void a(v2 v2Var) {
                f.g(v2Var);
            }
        });
        return a2VarF;
    }

    public final b1.g G(Collection<w2> collection, boolean z10) {
        synchronized (this.f31132m) {
            try {
                Set<w2> setN = N(collection, z10);
                if (setN.size() >= 2 || (P() && U(setN))) {
                    b1.g gVar = this.f31136q;
                    if (gVar == null || !gVar.s0().equals(setN)) {
                        if (!d0(setN)) {
                            return null;
                        }
                        return new b1.g(this.f31121a, this.b, this.f31137r, this.f31138s, setN, this.f31122c);
                    }
                    this.f31136q.F0(setN);
                    b1.g gVar2 = this.f31136q;
                    Objects.requireNonNull(gVar2);
                    return gVar2;
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void H() {
        synchronized (this.f31132m) {
            try {
                if (this.f31133n) {
                    this.f31121a.j(new ArrayList(this.f31125f));
                    n0.f fVar = this.b;
                    if (fVar != null) {
                        fVar.j(new ArrayList(this.f31125f));
                    }
                    x();
                    this.f31133n = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public g0.s J() {
        return this.f31123d;
    }

    public final int M(boolean z10) {
        int iG;
        synchronized (this.f31132m) {
            try {
                Iterator<g0.n> it = this.f31128i.iterator();
                g0.n nVar = null;
                while (true) {
                    iG = 0;
                    if (!it.hasNext()) {
                        break;
                    }
                    g0.n next = it.next();
                    if (z0.d(next.g()) > 1) {
                        x2.g.j(nVar == null, "Can only have one sharing effect.");
                        nVar = next;
                    }
                }
                if (nVar != null) {
                    iG = nVar.g();
                }
                if (z10) {
                    iG |= 3;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iG;
    }

    public final Set<w2> N(Collection<w2> collection, boolean z10) {
        HashSet hashSet = new HashSet();
        int iM = M(z10);
        for (w2 w2Var : collection) {
            x2.g.b(!b1.g.A0(w2Var), "Only support one level of sharing for now.");
            if (w2Var.F(iM)) {
                hashSet.add(w2Var);
            }
        }
        return hashSet;
    }

    public List<w2> O() {
        ArrayList arrayList;
        synchronized (this.f31132m) {
            arrayList = new ArrayList(this.f31124e);
        }
        return arrayList;
    }

    public final boolean P() {
        boolean z10;
        synchronized (this.f31132m) {
            z10 = this.f31131l.w(null) != null;
        }
        return z10;
    }

    public final boolean V() {
        boolean z10;
        synchronized (this.f31132m) {
            z10 = true;
            if (this.f31131l.v() != 1) {
                z10 = false;
            }
        }
        return z10;
    }

    @Override // g0.l
    public g0.m c() {
        return this.f31121a.c();
    }

    public final boolean c0() {
        return (P() || this.b != null || this.f31129j == 1) ? false : true;
    }

    @Override // g0.l
    public t d() {
        return this.f31121a.d();
    }

    public void f0(Collection<w2> collection) {
        synchronized (this.f31132m) {
            D(collection);
            LinkedHashSet linkedHashSet = new LinkedHashSet(this.f31124e);
            linkedHashSet.removeAll(collection);
            s(y(linkedHashSet, this.b != null, false));
        }
    }

    public void h(boolean z10) {
        this.f31121a.h(z10);
    }

    public final void h0() {
        synchronized (this.f31132m) {
            try {
                if (this.f31134o != null) {
                    this.f31121a.e().l(this.f31134o);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void i0(List<g0.n> list) {
        synchronized (this.f31132m) {
            this.f31128i = list;
        }
    }

    public void k0(Range<Integer> range) {
        synchronized (this.f31132m) {
            this.f31130k = range;
        }
    }

    public void l0(int i10) {
        synchronized (this.f31132m) {
            this.f31129j = i10;
        }
    }

    public void m0(y2 y2Var) {
        synchronized (this.f31132m) {
            this.f31127h = y2Var;
        }
    }

    public void n(Collection<w2> collection, ResolvedFeatureGroup resolvedFeatureGroup) {
        r1.a("CameraUseCaseAdapter", "addUseCases: appUseCasesToAdd = " + collection + ", featureGroup = " + resolvedFeatureGroup);
        synchronized (this.f31132m) {
            try {
                t();
                LinkedHashSet linkedHashSet = new LinkedHashSet(this.f31124e);
                linkedHashSet.addAll(collection);
                Map<w2, Set<i0.b>> mapU = u(linkedHashSet, resolvedFeatureGroup);
                try {
                    s(y(linkedHashSet, this.b != null, false));
                } catch (IllegalArgumentException e10) {
                    g0(mapU);
                    throw new a(e10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean n0(Collection<w2> collection) {
        if (P() && U(collection)) {
            return true;
        }
        return this.f31139t.a(this.f31121a.k().e(), collection);
    }

    public CalculatedUseCaseInfo o0(Collection<w2> collection, ResolvedFeatureGroup resolvedFeatureGroup, boolean z10) {
        CalculatedUseCaseInfo calculatedUseCaseInfoY;
        r1.a("CameraUseCaseAdapter", "simulateAddUseCases: appUseCasesToAdd = " + collection + ", featureGroup = " + resolvedFeatureGroup);
        synchronized (this.f31132m) {
            t();
            LinkedHashSet linkedHashSet = new LinkedHashSet(this.f31124e);
            linkedHashSet.addAll(collection);
            Map<w2, Set<i0.b>> mapU = u(linkedHashSet, resolvedFeatureGroup);
            try {
                try {
                    calculatedUseCaseInfoY = y(linkedHashSet, this.b != null, z10);
                    g0(mapU);
                } catch (IllegalArgumentException e10) {
                    throw new a(e10);
                }
            } catch (Throwable th2) {
                g0(mapU);
                throw th2;
            }
        }
        return calculatedUseCaseInfoY;
    }

    public final void q0(Map<w2, t3> map, Collection<w2> collection) {
        Map<w2, t3> map2;
        synchronized (this.f31132m) {
            try {
                if (this.f31127h == null || collection.isEmpty()) {
                    map2 = map;
                } else {
                    map2 = map;
                    Map<w2, Rect> mapA = s.a(this.f31121a.k().h(), this.f31121a.k().i() == 0, this.f31127h.a(), this.f31121a.k().w(this.f31127h.c()), this.f31127h.d(), this.f31127h.b(), map2);
                    for (w2 w2Var : collection) {
                        w2Var.b0((Rect) x2.g.g(mapA.get(w2Var)));
                    }
                }
                for (w2 w2Var2 : collection) {
                    w2Var2.Z(B(this.f31121a.k().h(), ((t3) x2.g.g(map2.get(w2Var2))).f()));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void s(CalculatedUseCaseInfo calculatedUseCaseInfo) {
        q0(calculatedUseCaseInfo.getPrimaryStreamSpecResult().b(), calculatedUseCaseInfo.b());
        p0(this.f31128i, calculatedUseCaseInfo.b(), calculatedUseCaseInfo.a());
        Iterator<w2> it = calculatedUseCaseInfo.d().iterator();
        while (it.hasNext()) {
            it.next().c0(this.f31121a);
        }
        this.f31121a.j(calculatedUseCaseInfo.d());
        if (this.b != null) {
            for (w2 w2Var : calculatedUseCaseInfo.d()) {
                n0.f fVar = this.b;
                Objects.requireNonNull(fVar);
                w2Var.c0(fVar);
            }
            n0.f fVar2 = this.b;
            Objects.requireNonNull(fVar2);
            fVar2.j(calculatedUseCaseInfo.d());
        }
        if (calculatedUseCaseInfo.d().isEmpty()) {
            for (w2 w2Var2 : calculatedUseCaseInfo.e()) {
                Map<w2, t3> mapB = calculatedUseCaseInfo.getPrimaryStreamSpecResult().b();
                if (mapB.containsKey(w2Var2)) {
                    t3 t3Var = mapB.get(w2Var2);
                    Objects.requireNonNull(t3Var);
                    n1 n1VarD = t3Var.d();
                    if (n1VarD != null && Q(t3Var, w2Var2.z())) {
                        w2Var2.f0(n1VarD);
                        if (this.f31133n) {
                            this.f31121a.g(w2Var2);
                            n0.f fVar3 = this.b;
                            if (fVar3 != null) {
                                Objects.requireNonNull(fVar3);
                                fVar3.g(w2Var2);
                            }
                        }
                    }
                }
            }
        }
        for (w2 w2Var3 : calculatedUseCaseInfo.c()) {
            b bVar = calculatedUseCaseInfo.j().get(w2Var3);
            Objects.requireNonNull(bVar);
            n0.f fVar4 = this.b;
            if (fVar4 != null) {
                n0.f fVar5 = this.f31121a;
                Objects.requireNonNull(fVar4);
                w2Var3.d(fVar5, fVar4, bVar.f31141a, bVar.b);
                w2Var3.e0((t3) x2.g.g(calculatedUseCaseInfo.getPrimaryStreamSpecResult().b().get(w2Var3)), ((StreamSpecQueryResult) x2.g.g(calculatedUseCaseInfo.getSecondaryStreamSpecResult())).b().get(w2Var3));
            } else {
                w2Var3.d(this.f31121a, null, bVar.f31141a, bVar.b);
                w2Var3.e0((t3) x2.g.g(calculatedUseCaseInfo.getPrimaryStreamSpecResult().b().get(w2Var3)), null);
            }
        }
        if (this.f31133n) {
            this.f31121a.i(calculatedUseCaseInfo.c());
            n0.f fVar6 = this.b;
            if (fVar6 != null) {
                Objects.requireNonNull(fVar6);
                fVar6.i(calculatedUseCaseInfo.c());
            }
        }
        Iterator<w2> it2 = calculatedUseCaseInfo.c().iterator();
        while (it2.hasNext()) {
            it2.next().M();
        }
        this.f31124e.clear();
        this.f31124e.addAll(calculatedUseCaseInfo.a());
        this.f31125f.clear();
        this.f31125f.addAll(calculatedUseCaseInfo.b());
        this.f31135p = calculatedUseCaseInfo.getPlaceholderForExtensions();
        this.f31136q = calculatedUseCaseInfo.getStreamSharing();
    }

    public final void t() {
        this.f31121a.o(this.f31131l);
        n0.f fVar = this.b;
        if (fVar != null) {
            fVar.o(this.f31131l);
        }
    }

    public void w() {
        synchronized (this.f31132m) {
            try {
                if (!this.f31133n) {
                    if (!this.f31125f.isEmpty()) {
                        this.f31121a.o(this.f31131l);
                        n0.f fVar = this.b;
                        if (fVar != null) {
                            fVar.o(this.f31131l);
                        }
                    }
                    this.f31121a.i(this.f31125f);
                    n0.f fVar2 = this.b;
                    if (fVar2 != null) {
                        fVar2.i(this.f31125f);
                    }
                    h0();
                    Iterator<w2> it = this.f31125f.iterator();
                    while (it.hasNext()) {
                        it.next().M();
                    }
                    this.f31133n = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void x() {
        synchronized (this.f31132m) {
            l0 l0VarE = this.f31121a.e();
            this.f31134o = l0VarE.j();
            l0VarE.n();
        }
    }

    public final CalculatedUseCaseInfo y(Collection<w2> collection, boolean z10, boolean z11) {
        StreamSpecQueryResult lVarA;
        boolean z12 = z11;
        C(collection);
        if (!z10 && n0(collection)) {
            return y(collection, true, z12);
        }
        b1.g gVarG = G(collection, z10);
        w2 w2VarA = A(collection, gVarG);
        Collection<w2> collectionZ = z(collection, w2VarA, gVarG);
        ArrayList arrayList = new ArrayList(collectionZ);
        arrayList.removeAll(this.f31125f);
        ArrayList arrayList2 = new ArrayList(collectionZ);
        arrayList2.retainAll(this.f31125f);
        ArrayList arrayList3 = new ArrayList(this.f31125f);
        arrayList3.removeAll(collectionZ);
        Map<w2, b> mapL = L(arrayList, this.f31131l.k(), this.f31122c, this.f31129j, this.f31130k);
        boolean zY = Y(arrayList, arrayList2);
        try {
            StreamSpecQueryResult lVarA2 = this.f31140u.a(K(), this.f31121a.k(), arrayList, arrayList2, this.f31131l, this.f31129j, this.f31130k, zY, z12);
            try {
                if (this.b != null) {
                    m mVar = this.f31140u;
                    int iK = K();
                    n0.f fVar = this.b;
                    Objects.requireNonNull(fVar);
                    z12 = z11;
                    lVarA = mVar.a(iK, fVar.k(), arrayList, arrayList2, this.f31131l, this.f31129j, this.f31130k, zY, z12);
                } else {
                    lVarA = null;
                }
                return new CalculatedUseCaseInfo(collection, collectionZ, arrayList, arrayList2, arrayList3, gVarG, w2VarA, mapL, lVarA2, lVarA);
            } catch (IllegalArgumentException e10) {
                e = e10;
                z12 = z11;
                if (z10 || !c0()) {
                    throw e;
                }
                return y(collection, true, z12);
            }
        } catch (IllegalArgumentException e11) {
            e = e11;
        }
    }
}
