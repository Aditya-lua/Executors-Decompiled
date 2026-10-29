package g0;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.location.Location;
import android.net.Uri;
import android.os.Looper;
import android.util.Log;
import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.internal.compat.quirk.SoftwareJpegEncodingPreferredQuirk;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.io.File;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import k0.ImageFormatFeature;
import n0.c3;
import n0.i4;
import n0.j4;
import n0.o3;
import n0.q3;
import n0.t3;
import n0.u3;

/* JADX INFO: loaded from: classes.dex */
public final class f1 extends w2 {
    public static final c E = new c();
    public static final v0.b F = new v0.b();
    public m0.d0 A;
    public m0.b1 B;
    public o3.c C;
    public final m0.c0 D;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final n0.j2.a f17397s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f17398t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final AtomicReference<Integer> f17399u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f17400v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f17401w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Rational f17402x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public s0.k f17403y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public o3.b f17404z;

    public class a implements m0.c0 {
        public a() {
        }

        @Override // m0.c0
        public me.x<Void> a(List<n0.l1> list) {
            return f1.this.S0(list);
        }

        @Override // m0.c0
        public void b() {
            f1.this.K0();
        }

        @Override // m0.c0
        public void c() {
            f1.this.W0();
        }
    }

    public static final class b implements i4.b<f1, n0.g2, b>, n0.i2.a<b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final n0.x2 f17406a;

        public b() {
            this(n0.x2.k0());
        }

        public static b g(n0.n1 n1Var) {
            return new b(n0.x2.l0(n1Var));
        }

        @Override // g0.l0
        public n0.w2 a() {
            return this.f17406a;
        }

        public f1 f() {
            Integer numValueOf = Integer.valueOf(Barcode.FORMAT_QR_CODE);
            Integer num = (Integer) a().h(n0.g2.T, null);
            if (num != null) {
                a().G(n0.h2.f24670j, num);
            } else if (f1.E0(a())) {
                a().G(n0.h2.f24670j, 32);
            } else if (f1.F0(a())) {
                a().G(n0.h2.f24670j, 32);
                a().G(n0.h2.f24671k, numValueOf);
            } else if (f1.G0(a())) {
                a().G(n0.h2.f24670j, 4101);
                a().G(n0.h2.f24672l, k0.f17469c);
            } else {
                a().G(n0.h2.f24670j, numValueOf);
            }
            n0.g2 g2VarE = e();
            n0.i2.Y(g2VarE);
            f1 f1Var = new f1(g2VarE);
            Size size = (Size) a().h(n0.i2.f24688q, null);
            if (size != null) {
                f1Var.M0(new Rational(size.getWidth(), size.getHeight()));
            }
            x2.g.h((Executor) a().h(s0.i.L, q0.c.d()), "The IO executor can't be null");
            n0.w2 w2VarA = a();
            n0.n1.a<Integer> aVar = n0.g2.R;
            if (w2VarA.a(aVar)) {
                Integer num2 = (Integer) a().e(aVar);
                if (num2 == null || !(num2.intValue() == 0 || num2.intValue() == 1 || num2.intValue() == 3 || num2.intValue() == 2)) {
                    throw new IllegalArgumentException("The flash mode is not allowed to set: " + num2);
                }
                if (num2.intValue() == 3 && a().h(n0.g2.f24651a0, null) == null) {
                    throw new IllegalArgumentException("A ScreenFlash instance is required for FLASH_MODE_SCREEN but was not found. If value from PreviewView.getScreenFlash() is set to ImageCapture.setScreenFlash(), ensure PreviewView.setScreenFlashWindow() is invoked first.");
                }
            }
            return f1Var;
        }

        @Override // n0.i4.b
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public n0.g2 e() {
            return new n0.g2(c3.j0(this.f17406a));
        }

        public b i(int i10) {
            a().G(n0.g2.Q, Integer.valueOf(i10));
            return this;
        }

        public b j(j4.b bVar) {
            a().G(i4.G, bVar);
            return this;
        }

        public b k(k0 k0Var) {
            a().G(n0.h2.f24672l, k0Var);
            return this;
        }

        public b l(Executor executor) {
            a().G(s0.i.L, executor);
            return this;
        }

        public b m(int i10) {
            a().G(n0.g2.U, Integer.valueOf(i10));
            return this;
        }

        @Override // n0.i2.a
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public b b(a1.c cVar) {
            a().G(n0.i2.f24692u, cVar);
            return this;
        }

        public b o(u3 u3Var) {
            a().G(i4.K, u3Var);
            return this;
        }

        public b p(int i10) {
            a().G(i4.A, Integer.valueOf(i10));
            return this;
        }

        @Deprecated
        public b q(int i10) {
            if (i10 == -1) {
                i10 = 0;
            }
            a().G(n0.i2.f24684m, Integer.valueOf(i10));
            return this;
        }

        public b r(Class<f1> cls) {
            a().G(s0.q.N, cls);
            if (a().h(s0.q.M, null) == null) {
                s(cls.getCanonicalName() + "-" + UUID.randomUUID());
            }
            return this;
        }

        public b s(String str) {
            a().G(s0.q.M, str);
            return this;
        }

        @Override // n0.i2.a
        @Deprecated
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public b d(Size size) {
            a().G(n0.i2.f24688q, size);
            return this;
        }

        @Override // n0.i2.a
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public b c(int i10) {
            a().G(n0.i2.f24685n, Integer.valueOf(i10));
            return this;
        }

        public b(n0.x2 x2Var) {
            this.f17406a = x2Var;
            Class cls = (Class) x2Var.h(s0.q.N, null);
            if (cls == null || cls.equals(f1.class)) {
                j(j4.b.IMAGE_CAPTURE);
                r(f1.class);
                return;
            }
            throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final u3 f17407a;
        public static final a1.c b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final n0.g2 f17408c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final k0 f17409d;

        static {
            u3 u3Var = u3.STILL_CAPTURE;
            f17407a = u3Var;
            a1.c cVarA = new a1.c.a().d(a1.a.f68c).f(a1.d.f77c).a();
            b = cVarA;
            k0 k0Var = k0.f17470d;
            f17409d = k0Var;
            f17408c = new b().p(4).o(u3Var).q(0).b(cVarA).m(0).k(k0Var).e();
        }

        public n0.g2 a() {
            return f17408c;
        }
    }

    public static class d implements g1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final t f17410a;

        public d(t tVar) {
            this.f17410a = tVar;
        }

        @Override // g0.g1
        public Set<Integer> a() {
            Set<Integer> setB = b();
            if (setB != null) {
                return setB;
            }
            HashSet hashSet = new HashSet();
            hashSet.add(0);
            if (d()) {
                hashSet.add(1);
            }
            if (c()) {
                hashSet.add(2);
                hashSet.add(3);
            }
            return hashSet;
        }

        public final Set<Integer> b() {
            t tVar = this.f17410a;
            HashSet hashSet = null;
            if (!(tVar instanceof n0.e)) {
                return null;
            }
            n0.n1 n1VarA = ((n0.e) tVar).C().k().a(j4.b.IMAGE_CAPTURE, 1);
            if (n1VarA != null) {
                n0.n1.a<List<Pair<Integer, Size[]>>> aVar = n0.i2.f24691t;
                if (n1VarA.a(aVar)) {
                    hashSet = new HashSet();
                    hashSet.add(0);
                    Iterator it = ((List) n1VarA.e(aVar)).iterator();
                    while (it.hasNext()) {
                        if (((Integer) ((Pair) it.next()).first).intValue() == 4101) {
                            hashSet.add(1);
                            break;
                        }
                    }
                }
            }
            return hashSet;
        }

        public final boolean c() {
            t tVar = this.f17410a;
            if (!(tVar instanceof n0.o0)) {
                return false;
            }
            n0.o0 o0Var = (n0.o0) tVar;
            if (o0Var.n().contains(3)) {
                return o0Var.a().contains(32);
            }
            return false;
        }

        public final boolean d() {
            t tVar = this.f17410a;
            if (tVar instanceof n0.o0) {
                return ((n0.o0) tVar).a().contains(4101);
            }
            return false;
        }
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f17411a;
        public boolean b = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f17412c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Location f17413d;

        public Location a() {
            return this.f17413d;
        }

        public boolean b() {
            return this.f17411a;
        }

        public boolean c() {
            return this.f17412c;
        }

        public String toString() {
            return "Metadata{mIsReversedHorizontal=" + this.f17411a + ", mIsReversedVertical=" + this.f17412c + ", mLocation=" + this.f17413d + "}";
        }
    }

    public static abstract class f {
        public abstract void a(int i10);

        public abstract void b();

        public abstract void c(androidx.camera.core.d dVar);

        public abstract void d(h1 h1Var);

        public abstract void e(Bitmap bitmap);
    }

    public interface g {
        default void a(int i10) {
        }

        default void b(Bitmap bitmap) {
        }

        default void c() {
        }

        void d(i iVar);

        void e(h1 h1Var);
    }

    public static final class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final File f17414a;
        public final ContentResolver b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Uri f17415c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final ContentValues f17416d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final OutputStream f17417e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final e f17418f;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public File f17419a;
            public ContentResolver b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public Uri f17420c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public ContentValues f17421d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public OutputStream f17422e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public e f17423f;

            public a(File file) {
                this.f17419a = file;
            }

            public h a() {
                return new h(this.f17419a, this.b, this.f17420c, this.f17421d, this.f17422e, this.f17423f);
            }
        }

        public h(File file, ContentResolver contentResolver, Uri uri, ContentValues contentValues, OutputStream outputStream, e eVar) {
            this.f17414a = file;
            this.b = contentResolver;
            this.f17415c = uri;
            this.f17416d = contentValues;
            this.f17417e = outputStream;
            this.f17418f = eVar == null ? new e() : eVar;
        }

        public ContentResolver a() {
            return this.b;
        }

        public ContentValues b() {
            return this.f17416d;
        }

        public File c() {
            return this.f17414a;
        }

        public e d() {
            return this.f17418f;
        }

        public OutputStream e() {
            return this.f17417e;
        }

        public Uri f() {
            return this.f17415c;
        }

        public String toString() {
            return "OutputFileOptions{mFile=" + this.f17414a + ", mContentResolver=" + this.b + ", mSaveCollection=" + this.f17415c + ", mContentValues=" + this.f17416d + ", mOutputStream=" + this.f17417e + ", mMetadata=" + this.f17418f + "}";
        }
    }

    public static class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f17424a;
        public final int b;

        public i(Uri uri, int i10) {
            this.f17424a = uri;
            this.b = i10;
        }
    }

    public interface j {
        void a(long j10, k kVar);

        void clear();
    }

    public interface k {
        void a();
    }

    public f1(n0.g2 g2Var) {
        super(g2Var);
        this.f17397s = new n0.j2.a() { // from class: g0.d1
            @Override // n0.j2.a
            public final void a(n0.j2 j2Var) {
                f1.h0(j2Var);
            }
        };
        this.f17399u = new AtomicReference<>(null);
        this.f17401w = -1;
        this.f17402x = null;
        this.D = new a();
        n0.g2 g2Var2 = (n0.g2) l();
        if (g2Var2.a(n0.g2.Q)) {
            this.f17398t = g2Var2.i0();
        } else {
            this.f17398t = 1;
        }
        this.f17400v = g2Var2.k0(0);
        this.f17403y = s0.k.g(g2Var2.o0());
    }

    public static boolean D0(List<Pair<Integer, Size[]>> list, int i10) {
        if (list == null) {
            return false;
        }
        Iterator<Pair<Integer, Size[]>> it = list.iterator();
        while (it.hasNext()) {
            if (((Integer) it.next().first).equals(Integer.valueOf(i10))) {
                return true;
            }
        }
        return false;
    }

    public static boolean E0(n0.w2 w2Var) {
        return Objects.equals(w2Var.h(n0.g2.U, null), 2);
    }

    public static boolean F0(n0.w2 w2Var) {
        return Objects.equals(w2Var.h(n0.g2.U, null), 3);
    }

    public static boolean G0(n0.w2 w2Var) {
        return Objects.equals(w2Var.h(n0.g2.U, null), 1);
    }

    public static /* synthetic */ void g0(f1 f1Var, o3 o3Var, o3.g gVar) {
        if (f1Var.i() == null) {
            return;
        }
        f1Var.B.pause();
        f1Var.r0(true);
        o3.b bVarS0 = f1Var.s0(f1Var.k(), (n0.g2) f1Var.l(), (t3) x2.g.g(f1Var.g()));
        f1Var.f17404z = bVarS0;
        f1Var.d0(o0.a(new Object[]{bVarS0.p()}));
        f1Var.L();
        f1Var.B.e();
    }

    public static /* synthetic */ void h0(n0.j2 j2Var) {
        try {
            androidx.camera.core.d dVarB = j2Var.b();
            try {
                Log.d("ImageCapture", "Discarding ImageProxy which was inadvertently acquired: " + dVarB);
                if (dVarB != null) {
                    dVarB.close();
                }
            } catch (Throwable th2) {
                if (dVarB != null) {
                    try {
                        dVarB.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        } catch (IllegalStateException e10) {
            Log.e("ImageCapture", "Failed to acquire latest image.", e10);
        }
    }

    public static /* synthetic */ Void i0(List list) {
        return null;
    }

    private void q0() {
        r0(false);
    }

    public static g1 x0(t tVar) {
        return new d(tVar);
    }

    public final q3 A0() {
        return i().f().w(null);
    }

    @Override // g0.w2
    public Set<Integer> B() {
        HashSet hashSet = new HashSet();
        hashSet.add(4);
        return hashSet;
    }

    public final Rect B0() {
        Rect rectE = E();
        Size sizeH = h();
        Objects.requireNonNull(sizeH);
        if (rectE != null) {
            return rectE;
        }
        if (!w0.b.i(this.f17402x)) {
            return new Rect(0, 0, sizeH.getWidth(), sizeH.getHeight());
        }
        n0.p0 p0VarI = i();
        Objects.requireNonNull(p0VarI);
        int iT = t(p0VarI);
        Rational rational = new Rational(this.f17402x.getDenominator(), this.f17402x.getNumerator());
        if (!p0.a0.i(iT)) {
            rational = this.f17402x;
        }
        Rect rectA = w0.b.a(sizeH, rational);
        Objects.requireNonNull(rectA);
        return rectA;
    }

    public int C0() {
        return C();
    }

    @Override // g0.w2
    public i4.b<?, ?, ?> D(n0.n1 n1Var) {
        return b.g(n1Var);
    }

    public boolean H0() {
        return ((Boolean) l().h(n0.g2.f24653c0, Boolean.FALSE)).booleanValue();
    }

    public final boolean I0(Map<Integer, List<Size>> map, int i10) {
        return map.containsKey(Integer.valueOf(i10)) && !map.get(Integer.valueOf(i10)).isEmpty();
    }

    public final boolean J0() {
        return (i() == null || i().f().w(null) == null) ? false : true;
    }

    public void K0() {
        synchronized (this.f17399u) {
            try {
                if (this.f17399u.get() != null) {
                    return;
                }
                this.f17399u.set(Integer.valueOf(w0()));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void L0(Executor executor, f fVar, g gVar) {
        h1 h1Var = new h1(4, "Not bound to a valid Camera [" + this + "]", null);
        if (gVar == null) {
            throw new IllegalArgumentException("Must have either in-memory or on-disk callback.");
        }
        gVar.e(h1Var);
    }

    public void M0(Rational rational) {
        this.f17402x = rational;
    }

    public void N0(int i10) {
        r1.a("ImageCapture", "setFlashMode: flashMode = " + i10);
        if (i10 != 0 && i10 != 1 && i10 != 2) {
            if (i10 != 3) {
                throw new IllegalArgumentException("Invalid flash mode: " + i10);
            }
            if (this.f17403y.getScreenFlash() == null) {
                throw new IllegalArgumentException("A ScreenFlash instance is required for FLASH_MODE_SCREEN but was not found. If value from PreviewView.getScreenFlash() is set to ImageCapture.setScreenFlash(), ensure PreviewView.setScreenFlashWindow() is invoked first.");
            }
            if (i() != null && u0() != 0) {
                throw new IllegalArgumentException("Not a front camera despite setting FLASH_MODE_SCREEN");
            }
        }
        synchronized (this.f17399u) {
            this.f17401w = i10;
            V0();
        }
    }

    @Override // g0.w2
    public void O() {
        x2.g.h(i(), "Attached camera cannot be null");
        if (w0() == 3 && u0() != 0) {
            throw new IllegalArgumentException("Not a front camera despite setting FLASH_MODE_SCREEN in ImageCapture");
        }
    }

    public void O0(j jVar) {
        this.f17403y = s0.k.g(jVar);
        P0();
    }

    @Override // g0.w2
    public void P() {
        r1.a("ImageCapture", "onCameraControlReady");
        V0();
        P0();
    }

    public final void P0() {
        Q0(this.f17403y);
    }

    @Override // g0.w2
    public i4<?> Q(n0.o0 o0Var, i4.b<?, ?, ?> bVar) {
        Integer numValueOf = Integer.valueOf(Barcode.FORMAT_QR_CODE);
        o0(bVar);
        if (o0Var.l().a(SoftwareJpegEncodingPreferredQuirk.class)) {
            Boolean bool = Boolean.FALSE;
            n0.w2 w2VarA = bVar.a();
            n0.n1.a<Boolean> aVar = n0.g2.X;
            Boolean bool2 = Boolean.TRUE;
            if (bool.equals(w2VarA.h(aVar, bool2))) {
                r1.l("ImageCapture", "Device quirk suggests software JPEG encoder, but it has been explicitly disabled.");
            } else {
                r1.e("ImageCapture", "Requesting software JPEG due to device quirk.");
                bVar.a().G(aVar, bool2);
            }
        }
        boolean zT0 = t0(bVar.a());
        Integer num = (Integer) bVar.a().h(n0.g2.T, null);
        if (num != null) {
            x2.g.b(!J0() || num.intValue() == 256, "Cannot set non-JPEG buffer format with Extensions enabled.");
            bVar.a().G(n0.h2.f24670j, Integer.valueOf(zT0 ? 35 : num.intValue()));
        } else if (E0(bVar.a())) {
            bVar.a().G(n0.h2.f24670j, 32);
        } else if (F0(bVar.a())) {
            bVar.a().G(n0.h2.f24670j, 32);
            bVar.a().G(n0.h2.f24671k, numValueOf);
        } else if (G0(bVar.a())) {
            bVar.a().G(n0.h2.f24670j, 4101);
            bVar.a().G(n0.h2.f24672l, k0.f17469c);
        } else if (zT0) {
            bVar.a().G(n0.h2.f24670j, 35);
        } else {
            List list = (List) bVar.a().h(n0.i2.f24691t, null);
            if (list == null || D0(list, Barcode.FORMAT_QR_CODE)) {
                bVar.a().G(n0.h2.f24670j, numValueOf);
            } else if (D0(list, 35)) {
                bVar.a().G(n0.h2.f24670j, 35);
            }
        }
        return bVar.e();
    }

    public final void Q0(j jVar) {
        j().h(jVar);
    }

    public void R0(int i10) {
        int iC0 = C0();
        if (!a0(i10) || this.f17402x == null) {
            return;
        }
        this.f17402x = w0.b.g(Math.abs(p0.c.b(i10) - p0.c.b(iC0)), this.f17402x);
    }

    @Override // g0.w2
    public void S() {
        k0();
    }

    public me.x<Void> S0(List<n0.l1> list) {
        p0.z.b();
        return r0.n.x(j().f(list, this.f17398t, this.f17400v), new t.a() { // from class: g0.c1
            @Override // t.a
            public final Object apply(Object obj) {
                return f1.i0((List) obj);
            }
        }, q0.c.b());
    }

    @Override // g0.w2
    public t3 T(n0.n1 n1Var) {
        this.f17404z.g(n1Var);
        d0(o0.a(new Object[]{this.f17404z.p()}));
        return g().i().d(n1Var).a();
    }

    public void T0(final h hVar, final Executor executor, final g gVar) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            q0.c.e().execute(new Runnable() { // from class: g0.e1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f17368a.T0(hVar, executor, gVar);
                }
            });
        } else {
            U0(executor, null, gVar, hVar, null);
        }
    }

    @Override // g0.w2
    public t3 U(t3 t3Var, t3 t3Var2) {
        r1.a("ImageCapture", "onSuggestedStreamSpecUpdated: primaryStreamSpec = " + t3Var + ", secondaryStreamSpec " + t3Var2);
        o3.b bVarS0 = s0(k(), (n0.g2) l(), t3Var);
        this.f17404z = bVarS0;
        d0(o0.a(new Object[]{bVarS0.p()}));
        J();
        return t3Var;
    }

    public final void U0(Executor executor, f fVar, g gVar, h hVar, h hVar2) {
        p0.z.b();
        if (w0() == 3 && this.f17403y.getScreenFlash() == null) {
            throw new IllegalArgumentException("A ScreenFlash instance is required for FLASH_MODE_SCREEN but was not found. If value from PreviewView.getScreenFlash() is set to ImageCapture.setScreenFlash(), ensure PreviewView.setScreenFlashWindow() is invoked first.");
        }
        Log.d("ImageCapture", "takePictureInternal");
        n0.p0 p0VarI = i();
        if (p0VarI == null || !G()) {
            L0(executor, fVar, gVar);
            return;
        }
        boolean z10 = l().Z() != 0;
        if (z10 && hVar2 == null) {
            throw new IllegalArgumentException("Simultaneous capture RAW and JPEG needs two output file options");
        }
        if (!z10 && hVar2 != null) {
            throw new IllegalArgumentException("Non simultaneous capture cannot have two output file options");
        }
        m0.b1 b1Var = this.B;
        Objects.requireNonNull(b1Var);
        b1Var.b(m0.l1.v(executor, fVar, gVar, hVar, hVar2, B0(), y(), t(p0VarI), y0(), v0(), z10, this.f17404z.s()));
    }

    @Override // g0.w2
    public void V() {
        k0();
        q0();
        Q0(null);
    }

    public final void V0() {
        synchronized (this.f17399u) {
            try {
                if (this.f17399u.get() != null) {
                    return;
                }
                j().i(w0());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void W0() {
        synchronized (this.f17399u) {
            try {
                Integer andSet = this.f17399u.getAndSet(null);
                if (andSet == null) {
                    return;
                }
                if (andSet.intValue() != w0()) {
                    V0();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void k0() {
        this.f17403y.f();
        m0.b1 b1Var = this.B;
        if (b1Var != null) {
            b1Var.c();
        }
    }

    @Override // g0.w2
    public i4<?> m(boolean z10, j4 j4Var) {
        c cVar = E;
        n0.n1 n1VarA = j4Var.a(cVar.a().X(), v0());
        if (z10) {
            n1VarA = n0.n1.L(n1VarA, cVar.a());
        }
        if (n1VarA == null) {
            return null;
        }
        return D(n1VarA).e();
    }

    public final void o0(i4.b<?, ?, ?> bVar) {
        Set<i0.b> setO = o();
        if (setO != null) {
            int iF = 0;
            for (i0.b bVar2 : setO) {
                if (bVar2 instanceof ImageFormatFeature) {
                    iF = ((ImageFormatFeature) bVar2).getImageCaptureOutputFormat();
                }
            }
            bVar.a().G(n0.g2.U, Integer.valueOf(iF));
        }
    }

    public final m0.k0 p0(int i10, Size size) {
        q3 q3VarA0 = A0();
        if (q3VarA0 == null) {
            return null;
        }
        Map<Integer, List<Size>> mapF = q3VarA0.f(size);
        ArrayList arrayList = new ArrayList();
        if (I0(mapF, 35)) {
            arrayList.add(35);
        }
        if (I0(mapF, Barcode.FORMAT_QR_CODE)) {
            arrayList.add(Integer.valueOf(Barcode.FORMAT_QR_CODE));
        }
        if (I0(mapF, 4101)) {
            arrayList.add(4101);
        }
        int iA = !arrayList.isEmpty() ? i().f().I().a(i10, arrayList) : 0;
        if (iA == 0) {
            return null;
        }
        List<Size> list = mapF.get(Integer.valueOf(iA));
        a1.c cVar = (a1.c) l().h(n0.g2.f24652b0, null);
        if (cVar == null) {
            return m0.k0.a((Size) Collections.max(list, new p0.e()), iA);
        }
        Collections.sort(list, new p0.e(true));
        n0.p0 p0VarI = i();
        Rect rectH = p0VarI.k().h();
        n0.o0 o0VarK = p0VarI.k();
        List<Size> listP = s0.o.p(cVar, list, null, C0(), new Rational(rectH.width(), rectH.height()), o0VarK.d(), o0VarK.i());
        if (listP.isEmpty()) {
            throw new IllegalArgumentException("The postview ResolutionSelector cannot select a valid size for the postview.");
        }
        return m0.k0.a(listP.get(0), iA);
    }

    public final void r0(boolean z10) {
        m0.b1 b1Var;
        Log.d("ImageCapture", "clearPipeline");
        p0.z.b();
        o3.c cVar = this.C;
        if (cVar != null) {
            cVar.b();
            this.C = null;
        }
        m0.d0 d0Var = this.A;
        if (d0Var != null) {
            d0Var.a();
            this.A = null;
        }
        if (!z10 && (b1Var = this.B) != null) {
            b1Var.c();
            this.B = null;
        }
        j().b();
    }

    public final o3.b s0(String str, n0.g2 g2Var, t3 t3Var) {
        p0.z.b();
        Log.d("ImageCapture", String.format("createPipeline(cameraId: %s, streamSpec: %s)", str, t3Var));
        Size sizeF = t3Var.f();
        n0.p0 p0VarI = i();
        Objects.requireNonNull(p0VarI);
        boolean z10 = !p0VarI.q();
        if (this.A != null) {
            x2.g.i(z10);
            this.A.a();
        }
        Set<Integer> setA = x0(i().d()).a();
        x2.g.b(setA.contains(Integer.valueOf(z0())), "The specified output format (" + z0() + ") is not supported by current configuration. Supported output formats: " + setA);
        CameraCharacteristics cameraCharacteristics = null;
        m0.k0 k0VarP0 = H0() ? p0(g2Var.p(), sizeF) : null;
        if (i() != null) {
            try {
                Object objK = i().k().k();
                if (objK instanceof CameraCharacteristics) {
                    cameraCharacteristics = (CameraCharacteristics) objK;
                }
            } catch (Exception e10) {
                Log.e("ImageCapture", "getCameraCharacteristics failed", e10);
            }
        }
        this.A = new m0.d0(g2Var, sizeF, cameraCharacteristics, n(), z10, k0VarP0);
        if (this.B == null) {
            this.B = l().r().a(this.D);
        }
        this.B.d(this.A);
        o3.b bVarF = this.A.f(t3Var.f());
        bVarF.A(t3Var.g());
        if (v0() == 2 && !t3Var.h()) {
            j().a(bVarF);
        }
        if (t3Var.d() != null) {
            bVarF.g(t3Var.d());
        }
        o3.c cVar = this.C;
        if (cVar != null) {
            cVar.b();
        }
        o3.c cVar2 = new o3.c(new o3.d() { // from class: g0.b1
            @Override // n0.o3.d
            public final void a(o3 o3Var, o3.g gVar) {
                f1.g0(this.f17347a, o3Var, gVar);
            }
        });
        this.C = cVar2;
        bVarF.u(cVar2);
        return bVarF;
    }

    public boolean t0(n0.w2 w2Var) {
        boolean z10;
        Boolean bool = Boolean.TRUE;
        n0.n1.a<Boolean> aVar = n0.g2.X;
        Boolean bool2 = Boolean.FALSE;
        boolean z11 = false;
        if (bool.equals(w2Var.h(aVar, bool2))) {
            if (J0()) {
                r1.l("ImageCapture", "Software JPEG cannot be used with Extensions.");
                z10 = false;
            } else {
                z10 = true;
            }
            Integer num = (Integer) w2Var.h(n0.g2.T, null);
            if (num == null || num.intValue() == 256) {
                z11 = z10;
            } else {
                r1.l("ImageCapture", "Software JPEG cannot be used with non-JPEG output buffer format.");
            }
            if (!z11) {
                r1.l("ImageCapture", "Unable to support software JPEG. Disabling.");
                w2Var.G(aVar, bool2);
            }
        }
        return z11;
    }

    public String toString() {
        return "ImageCapture:" + r();
    }

    public final int u0() {
        n0.p0 p0VarI = i();
        if (p0VarI != null) {
            return p0VarI.d().i();
        }
        return -1;
    }

    public int v0() {
        return this.f17398t;
    }

    public int w0() {
        int iJ0;
        synchronized (this.f17399u) {
            iJ0 = this.f17401w;
            if (iJ0 == -1) {
                iJ0 = ((n0.g2) l()).j0(2);
            }
        }
        return iJ0;
    }

    public final int y0() {
        n0.g2 g2Var = (n0.g2) l();
        if (g2Var.a(n0.g2.Z)) {
            return g2Var.n0();
        }
        int i10 = this.f17398t;
        if (i10 == 0) {
            return 100;
        }
        if (i10 == 1 || i10 == 2) {
            return 95;
        }
        throw new IllegalStateException("CaptureMode " + this.f17398t + " is invalid");
    }

    public int z0() {
        return ((Integer) x2.g.g((Integer) l().h(n0.g2.U, 0))).intValue();
    }
}
