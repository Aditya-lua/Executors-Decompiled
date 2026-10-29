package n0;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.InputConfiguration;
import android.util.Range;
import android.util.Size;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class o3 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final List<Integer> f24765j = Arrays.asList(1, 5, 3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<f> f24766a;
    public final f b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<CameraDevice.StateCallback> f24767c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<CameraCaptureSession.StateCallback> f24768d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<u> f24769e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d f24770f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l1 f24771g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f24772h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public InputConfiguration f24773i;

    public static class a {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public d f24778f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public InputConfiguration f24779g;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public f f24781i;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Set<f> f24774a = new LinkedHashSet();
        public final l1.a b = new l1.a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List<CameraDevice.StateCallback> f24775c = new ArrayList();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List<CameraCaptureSession.StateCallback> f24776d = new ArrayList();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final List<u> f24777e = new ArrayList();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f24780h = 0;
    }

    public static class b extends a {
        public static b r(i4<?> i4Var, Size size) {
            e eVarF = i4Var.F(null);
            if (eVarF != null) {
                b bVar = new b();
                eVarF.a(size, i4Var, bVar);
                return bVar;
            }
            throw new IllegalStateException("Implementation is missing option unpacker for " + i4Var.u(i4Var.toString()));
        }

        public b A(int i10) {
            this.f24780h = i10;
            return this;
        }

        public b B(int i10) {
            this.b.v(i10);
            return this;
        }

        public b C(int i10) {
            if (i10 != 0) {
                this.b.x(i10);
            }
            return this;
        }

        public b a(Collection<u> collection) {
            for (u uVar : collection) {
                this.b.c(uVar);
                if (!this.f24777e.contains(uVar)) {
                    this.f24777e.add(uVar);
                }
            }
            return this;
        }

        public b b(Collection<CameraDevice.StateCallback> collection) {
            Iterator<CameraDevice.StateCallback> it = collection.iterator();
            while (it.hasNext()) {
                f(it.next());
            }
            return this;
        }

        public b c(Collection<u> collection) {
            this.b.a(collection);
            return this;
        }

        public b d(List<CameraCaptureSession.StateCallback> list) {
            Iterator<CameraCaptureSession.StateCallback> it = list.iterator();
            while (it.hasNext()) {
                k(it.next());
            }
            return this;
        }

        public b e(u uVar) {
            this.b.c(uVar);
            if (!this.f24777e.contains(uVar)) {
                this.f24777e.add(uVar);
            }
            return this;
        }

        public b f(CameraDevice.StateCallback stateCallback) {
            if (this.f24775c.contains(stateCallback)) {
                return this;
            }
            this.f24775c.add(stateCallback);
            return this;
        }

        public b g(n1 n1Var) {
            this.b.e(n1Var);
            return this;
        }

        public b h(u1 u1Var) {
            return i(u1Var, g0.k0.f17470d);
        }

        public b i(u1 u1Var, g0.k0 k0Var) {
            this.f24774a.add(f.a(u1Var).b(k0Var).a());
            return this;
        }

        public b j(u uVar) {
            this.b.c(uVar);
            return this;
        }

        public b k(CameraCaptureSession.StateCallback stateCallback) {
            if (this.f24776d.contains(stateCallback)) {
                return this;
            }
            this.f24776d.add(stateCallback);
            return this;
        }

        public b l(u1 u1Var) {
            return m(u1Var, g0.k0.f17470d);
        }

        public b m(u1 u1Var, g0.k0 k0Var) {
            return n(u1Var, k0Var, null, -1);
        }

        public b n(u1 u1Var, g0.k0 k0Var, String str, int i10) {
            this.f24774a.add(f.a(u1Var).d(str).b(k0Var).c(i10).a());
            this.b.f(u1Var);
            return this;
        }

        public b o(String str, Object obj) {
            this.b.g(str, obj);
            return this;
        }

        public o3 p() {
            return new o3(new ArrayList(this.f24774a), new ArrayList(this.f24775c), new ArrayList(this.f24776d), new ArrayList(this.f24777e), this.b.h(), this.f24778f, this.f24779g, this.f24780h, this.f24781i);
        }

        public b q() {
            this.f24774a.clear();
            this.b.i();
            return this;
        }

        public List<u> s() {
            return Collections.unmodifiableList(this.f24777e);
        }

        public boolean t(u uVar) {
            return this.b.o(uVar) || this.f24777e.remove(uVar);
        }

        public b u(d dVar) {
            this.f24778f = dVar;
            return this;
        }

        public b v(Range<Integer> range) {
            this.b.q(range);
            return this;
        }

        public b w(n1 n1Var) {
            this.b.s(n1Var);
            return this;
        }

        public b x(InputConfiguration inputConfiguration) {
            this.f24779g = inputConfiguration;
            return this;
        }

        public b y(u1 u1Var) {
            this.f24781i = f.a(u1Var).a();
            return this;
        }

        public b z(int i10) {
            if (i10 != 0) {
                this.b.u(i10);
            }
            return this;
        }
    }

    public static final class c implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AtomicBoolean f24782a = new AtomicBoolean(false);
        public final d b;

        public c(d dVar) {
            this.b = dVar;
        }

        @Override // n0.o3.d
        public void a(o3 o3Var, g gVar) {
            if (this.f24782a.get()) {
                return;
            }
            this.b.a(o3Var, gVar);
        }

        public void b() {
            this.f24782a.set(true);
        }
    }

    public interface d {
        void a(o3 o3Var, g gVar);
    }

    public interface e {
        void a(Size size, i4<?> i4Var, b bVar);
    }

    public static abstract class f {

        public static abstract class a {
            public abstract f a();

            public abstract a b(g0.k0 k0Var);

            public abstract a c(int i10);

            public abstract a d(String str);

            public abstract a e(List<u1> list);

            public abstract a f(int i10);
        }

        public static a a(u1 u1Var) {
            return new q.b().g(u1Var).e(Collections.EMPTY_LIST).d(null).c(-1).f(-1).b(g0.k0.f17470d);
        }

        public abstract g0.k0 b();

        public abstract int c();

        public abstract String d();

        public abstract List<u1> e();

        public abstract u1 f();

        public abstract int g();
    }

    public enum g {
        SESSION_ERROR_SURFACE_NEEDS_RESET,
        SESSION_ERROR_UNKNOWN
    }

    public static final class h extends a {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final v0.g f24785j = new v0.g();

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f24786k = true;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public StringBuilder f24787l = new StringBuilder();

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public boolean f24788m = false;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public List<d> f24789n = new ArrayList();

        public static /* synthetic */ void a(h hVar, o3 o3Var, g gVar) {
            Iterator<d> it = hVar.f24789n.iterator();
            while (it.hasNext()) {
                it.next().a(o3Var, gVar);
            }
        }

        public void b(o3 o3Var) {
            l1 l1VarL = o3Var.l();
            if (l1VarL.k() != -1) {
                this.f24788m = true;
                this.b.v(o3.f(l1VarL.k(), this.b.n()));
            }
            h(l1VarL.e());
            i(l1VarL.h());
            j(l1VarL.l());
            this.b.b(o3Var.l().j());
            this.f24775c.addAll(o3Var.c());
            this.f24776d.addAll(o3Var.m());
            this.b.a(o3Var.k());
            this.f24777e.addAll(o3Var.o());
            if (o3Var.d() != null) {
                this.f24789n.add(o3Var.d());
            }
            if (o3Var.h() != null) {
                this.f24779g = o3Var.h();
            }
            this.f24774a.addAll(o3Var.i());
            this.b.m().addAll(l1VarL.i());
            if (!f().containsAll(this.b.m())) {
                g0.r1.a("ValidatingBuilder", "Invalid configuration due to capture request surfaces are not a subset of surfaces");
                this.f24786k = false;
                this.f24787l.append("Invalid configuration due to capture request surfaces are not a subset of surfaces");
            }
            if (o3Var.n() != this.f24780h && o3Var.n() != 0 && this.f24780h != 0) {
                g0.r1.a("ValidatingBuilder", "Invalid configuration due to that two non-default session types are set");
                this.f24786k = false;
                this.f24787l.append("Invalid configuration due to that two non-default session types are set");
            } else if (o3Var.n() != 0) {
                this.f24780h = o3Var.n();
            }
            if (o3Var.b != null) {
                if (this.f24781i == o3Var.b || this.f24781i == null) {
                    this.f24781i = o3Var.b;
                } else {
                    g0.r1.a("ValidatingBuilder", "Invalid configuration due to that two different postview output configs are set");
                    this.f24786k = false;
                    this.f24787l.append("Invalid configuration due to that two different postview output configs are set");
                }
            }
            this.b.e(l1VarL.g());
        }

        public o3 c() {
            if (!this.f24786k) {
                throw new IllegalArgumentException("Unsupported session configuration combination");
            }
            ArrayList arrayList = new ArrayList(this.f24774a);
            this.f24785j.c(arrayList);
            if (this.f24780h == 1) {
                new s0.g().e(arrayList, this.b);
            }
            return new o3(arrayList, new ArrayList(this.f24775c), new ArrayList(this.f24776d), new ArrayList(this.f24777e), this.b.h(), !this.f24789n.isEmpty() ? new d() { // from class: n0.p3
                @Override // n0.o3.d
                public final void a(o3 o3Var, o3.g gVar) {
                    o3.h.a(this.f24804a, o3Var, gVar);
                }
            } : null, this.f24779g, this.f24780h, this.f24781i);
        }

        public void d() {
            this.f24774a.clear();
            this.b.i();
        }

        public String e() {
            return !this.f24788m ? "Template is not set" : this.f24787l.toString();
        }

        public final List<u1> f() {
            ArrayList arrayList = new ArrayList();
            for (f fVar : this.f24774a) {
                arrayList.add(fVar.f());
                Iterator<u1> it = fVar.e().iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next());
                }
            }
            return arrayList;
        }

        public boolean g() {
            return this.f24788m && this.f24786k;
        }

        public final void h(Range<Integer> range) {
            Range<Integer> range2 = t3.f24861a;
            if (range.equals(range2)) {
                return;
            }
            if (this.b.l().equals(range2)) {
                this.b.q(range);
                return;
            }
            if (this.b.l().equals(range)) {
                return;
            }
            this.f24786k = false;
            String str = "Different ExpectedFrameRateRange values; current = " + this.b.l() + ", new = " + range;
            g0.r1.c("ValidatingBuilder", str);
            this.f24787l.append(str);
        }

        public final void i(int i10) {
            if (i10 != 0) {
                this.b.u(i10);
            }
        }

        public final void j(int i10) {
            if (i10 != 0) {
                this.b.x(i10);
            }
        }
    }

    public o3(List<f> list, List<CameraDevice.StateCallback> list2, List<CameraCaptureSession.StateCallback> list3, List<u> list4, l1 l1Var, d dVar, InputConfiguration inputConfiguration, int i10, f fVar) {
        this.f24766a = list;
        this.f24767c = Collections.unmodifiableList(list2);
        this.f24768d = Collections.unmodifiableList(list3);
        this.f24769e = Collections.unmodifiableList(list4);
        this.f24770f = dVar;
        this.f24771g = l1Var;
        this.f24773i = inputConfiguration;
        this.f24772h = i10;
        this.b = fVar;
    }

    public static o3 b() {
        return new o3(new ArrayList(), new ArrayList(0), new ArrayList(0), new ArrayList(0), new l1.a().h(), null, null, 0, null);
    }

    public static int f(int i10, int i11) {
        List<Integer> list = f24765j;
        return list.indexOf(Integer.valueOf(i10)) >= list.indexOf(Integer.valueOf(i11)) ? i10 : i11;
    }

    public List<CameraDevice.StateCallback> c() {
        return this.f24767c;
    }

    public d d() {
        return this.f24770f;
    }

    public Range<Integer> e() {
        return this.f24771g.e();
    }

    public n1 g() {
        return this.f24771g.g();
    }

    public InputConfiguration h() {
        return this.f24773i;
    }

    public List<f> i() {
        return this.f24766a;
    }

    public f j() {
        return this.b;
    }

    public List<u> k() {
        return this.f24771g.c();
    }

    public l1 l() {
        return this.f24771g;
    }

    public List<CameraCaptureSession.StateCallback> m() {
        return this.f24768d;
    }

    public int n() {
        return this.f24772h;
    }

    public List<u> o() {
        return this.f24769e;
    }

    public List<u1> p() {
        ArrayList arrayList = new ArrayList();
        for (f fVar : this.f24766a) {
            arrayList.add(fVar.f());
            Iterator<u1> it = fVar.e().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public int q() {
        return this.f24771g.k();
    }
}
