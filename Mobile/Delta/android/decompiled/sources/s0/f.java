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
    public final n0.f f30959a;
    public final n0.f b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j4 f30960c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g0.s f30961d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final h0.a f30964g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public y2 f30965h;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final h0 f30969l;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public w2 f30973p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public b1.g f30974q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final i0 f30975r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final i0 f30976s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final m f30978u;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<w2> f30962e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List<w2> f30963f = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public List<g0.n> f30966i = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f30967j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Range<Integer> f30968k = t3.f25682a;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Object f30970m = new Object();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f30971n = true;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public n1 f30972o = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final v0.e f30977t = new v0.e();

    public static final class a extends Exception {
        public a(Throwable th2) {
            super(th2);
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public i4<?> f30979a;
        public i4<?> b;

        public b(i4<?> i4Var, i4<?> i4Var2) {
            this.f30979a = i4Var;
            this.b = i4Var2;
        }
    }

    public f(p0 p0Var, p0 p0Var2, n0.e eVar, n0.e eVar2, i0 i0Var, i0 i0Var2, h0.a aVar, m mVar, j4 j4Var) {
        this.f30969l = eVar.C();
        this.f30959a = new n0.f(p0Var, eVar);
        if (p0Var2 == null || eVar2 == null) {
            this.b = null;
        } else {
            this.b = new n0.f(p0Var2, eVar2);
        }
        this.f30975r = i0Var;
        this.f30976s = i0Var2;
        this.f30964g = aVar;
        this.f30960c = j4Var;
        this.f30961d = g0.s.b(eVar, eVar2);
        this.f30978u = mVar;
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
        synchronized (this.f30970m) {
            try {
                return this.f30964g.e() == 2 ? 1 : 0;
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

    public static /* synthetic */ void f(v2 v2Var) {
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
        if (!t3.f25682a.equals(range)) {
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
        synchronized (this.f30970m) {
            try {
                ArrayList arrayList = new ArrayList(collection);
                if (gVar != null) {
                    arrayList.add(gVar);
                    arrayList.removeAll(gVar.s0());
                }
                if (!V()) {
                    w2VarE = null;
                } else if (X(arrayList)) {
                    w2VarE = b0(this.f30973p) ? this.f30973p : F();
                } else if (W(arrayList)) {
                    w2VarE = Z(this.f30973p) ? this.f30973p : E();
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
        synchronized (this.f30970m) {
            try {
                if (!this.f30966i.isEmpty() && (T(collection) || S(collection))) {
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
                f.f(v2Var);
            }
        });
        return a2VarF;
    }

    public final b1.g G(Collection<w2> collection, boolean z10) {
        synchronized (this.f30970m) {
            try {
                Set<w2> setN = N(collection, z10);
                if (setN.size() >= 2 || (P() && U(setN))) {
                    b1.g gVar = this.f30974q;
                    if (gVar == null || !gVar.s0().equals(setN)) {
                        if (!d0(setN)) {
                            return null;
                        }
                        return new b1.g(this.f30959a, this.b, this.f30975r, this.f30976s, setN, this.f30960c);
                    }
                    this.f30974q.F0(setN);
                    b1.g gVar2 = this.f30974q;
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
        synchronized (this.f30970m) {
            try {
                if (this.f30971n) {
                    this.f30959a.j(new ArrayList(this.f30963f));
                    n0.f fVar = this.b;
                    if (fVar != null) {
                        fVar.j(new ArrayList(this.f30963f));
                    }
                    x();
                    this.f30971n = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public g0.s J() {
        return this.f30961d;
    }

    public final int M(boolean z10) {
        int iG;
        synchronized (this.f30970m) {
            try {
                Iterator<g0.n> it = this.f30966i.iterator();
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
        synchronized (this.f30970m) {
            arrayList = new ArrayList(this.f30962e);
        }
        return arrayList;
    }

    public final boolean P() {
        boolean z10;
        synchronized (this.f30970m) {
            z10 = this.f30969l.w(null) != null;
        }
        return z10;
    }

    public final boolean V() {
        boolean z10;
        synchronized (this.f30970m) {
            z10 = true;
            if (this.f30969l.v() != 1) {
                z10 = false;
            }
        }
        return z10;
    }

    @Override // g0.l
    public g0.m c() {
        return this.f30959a.c();
    }

    public final boolean c0() {
        return (P() || this.b != null || this.f30967j == 1) ? false : true;
    }

    @Override // g0.l
    public t d() {
        return this.f30959a.d();
    }

    public void f0(Collection<w2> collection) {
        synchronized (this.f30970m) {
            D(collection);
            LinkedHashSet linkedHashSet = new LinkedHashSet(this.f30962e);
            linkedHashSet.removeAll(collection);
            s(y(linkedHashSet, this.b != null, false));
        }
    }

    public void h(boolean z10) {
        this.f30959a.h(z10);
    }

    public final void h0() {
        synchronized (this.f30970m) {
            try {
                if (this.f30972o != null) {
                    this.f30959a.e().l(this.f30972o);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void i0(List<g0.n> list) {
        synchronized (this.f30970m) {
            this.f30966i = list;
        }
    }

    public void k0(Range<Integer> range) {
        synchronized (this.f30970m) {
            this.f30968k = range;
        }
    }

    public void l0(int i10) {
        synchronized (this.f30970m) {
            this.f30967j = i10;
        }
    }

    public void m0(y2 y2Var) {
        synchronized (this.f30970m) {
            this.f30965h = y2Var;
        }
    }

    public void n(Collection<w2> collection, ResolvedFeatureGroup resolvedFeatureGroup) {
        r1.a("CameraUseCaseAdapter", "addUseCases: appUseCasesToAdd = " + collection + ", featureGroup = " + resolvedFeatureGroup);
        synchronized (this.f30970m) {
            try {
                t();
                LinkedHashSet linkedHashSet = new LinkedHashSet(this.f30962e);
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
        return this.f30977t.a(this.f30959a.k().e(), collection);
    }

    public CalculatedUseCaseInfo o0(Collection<w2> collection, ResolvedFeatureGroup resolvedFeatureGroup, boolean z10) {
        CalculatedUseCaseInfo calculatedUseCaseInfoY;
        r1.a("CameraUseCaseAdapter", "simulateAddUseCases: appUseCasesToAdd = " + collection + ", featureGroup = " + resolvedFeatureGroup);
        synchronized (this.f30970m) {
            t();
            LinkedHashSet linkedHashSet = new LinkedHashSet(this.f30962e);
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
        synchronized (this.f30970m) {
            try {
                if (this.f30965h == null || collection.isEmpty()) {
                    map2 = map;
                } else {
                    map2 = map;
                    Map<w2, Rect> mapA = s.a(this.f30959a.k().h(), this.f30959a.k().i() == 0, this.f30965h.a(), this.f30959a.k().w(this.f30965h.c()), this.f30965h.d(), this.f30965h.b(), map2);
                    for (w2 w2Var : collection) {
                        w2Var.b0((Rect) x2.g.g(mapA.get(w2Var)));
                    }
                }
                for (w2 w2Var2 : collection) {
                    w2Var2.Z(B(this.f30959a.k().h(), ((t3) x2.g.g(map2.get(w2Var2))).f()));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void s(CalculatedUseCaseInfo calculatedUseCaseInfo) {
        q0(calculatedUseCaseInfo.getPrimaryStreamSpecResult().b(), calculatedUseCaseInfo.b());
        p0(this.f30966i, calculatedUseCaseInfo.b(), calculatedUseCaseInfo.a());
        Iterator<w2> it = calculatedUseCaseInfo.d().iterator();
        while (it.hasNext()) {
            it.next().c0(this.f30959a);
        }
        this.f30959a.j(calculatedUseCaseInfo.d());
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
                        if (this.f30971n) {
                            this.f30959a.f(w2Var2);
                            n0.f fVar3 = this.b;
                            if (fVar3 != null) {
                                Objects.requireNonNull(fVar3);
                                fVar3.f(w2Var2);
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
                n0.f fVar5 = this.f30959a;
                Objects.requireNonNull(fVar4);
                w2Var3.d(fVar5, fVar4, bVar.f30979a, bVar.b);
                w2Var3.e0((t3) x2.g.g(calculatedUseCaseInfo.getPrimaryStreamSpecResult().b().get(w2Var3)), ((StreamSpecQueryResult) x2.g.g(calculatedUseCaseInfo.getSecondaryStreamSpecResult())).b().get(w2Var3));
            } else {
                w2Var3.d(this.f30959a, null, bVar.f30979a, bVar.b);
                w2Var3.e0((t3) x2.g.g(calculatedUseCaseInfo.getPrimaryStreamSpecResult().b().get(w2Var3)), null);
            }
        }
        if (this.f30971n) {
            this.f30959a.i(calculatedUseCaseInfo.c());
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
        this.f30962e.clear();
        this.f30962e.addAll(calculatedUseCaseInfo.a());
        this.f30963f.clear();
        this.f30963f.addAll(calculatedUseCaseInfo.b());
        this.f30973p = calculatedUseCaseInfo.getPlaceholderForExtensions();
        this.f30974q = calculatedUseCaseInfo.getStreamSharing();
    }

    public final void t() {
        this.f30959a.o(this.f30969l);
        n0.f fVar = this.b;
        if (fVar != null) {
            fVar.o(this.f30969l);
        }
    }

    public void w() {
        synchronized (this.f30970m) {
            try {
                if (!this.f30971n) {
                    if (!this.f30963f.isEmpty()) {
                        this.f30959a.o(this.f30969l);
                        n0.f fVar = this.b;
                        if (fVar != null) {
                            fVar.o(this.f30969l);
                        }
                    }
                    this.f30959a.i(this.f30963f);
                    n0.f fVar2 = this.b;
                    if (fVar2 != null) {
                        fVar2.i(this.f30963f);
                    }
                    h0();
                    Iterator<w2> it = this.f30963f.iterator();
                    while (it.hasNext()) {
                        it.next().M();
                    }
                    this.f30971n = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void x() {
        synchronized (this.f30970m) {
            l0 l0VarE = this.f30959a.e();
            this.f30972o = l0VarE.j();
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
        arrayList.removeAll(this.f30963f);
        ArrayList arrayList2 = new ArrayList(collectionZ);
        arrayList2.retainAll(this.f30963f);
        ArrayList arrayList3 = new ArrayList(this.f30963f);
        arrayList3.removeAll(collectionZ);
        Map<w2, b> mapL = L(arrayList, this.f30969l.k(), this.f30960c, this.f30967j, this.f30968k);
        boolean zY = Y(arrayList, arrayList2);
        try {
            StreamSpecQueryResult lVarA2 = this.f30978u.a(K(), this.f30959a.k(), arrayList, arrayList2, this.f30969l, this.f30967j, this.f30968k, zY, z12);
            try {
                if (this.b != null) {
                    m mVar = this.f30978u;
                    int iK = K();
                    n0.f fVar = this.b;
                    Objects.requireNonNull(fVar);
                    z12 = z11;
                    lVarA = mVar.a(iK, fVar.k(), arrayList, arrayList2, this.f30969l, this.f30967j, this.f30968k, zY, z12);
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
