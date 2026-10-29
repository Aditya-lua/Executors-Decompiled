package p296n0;

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
import p140g0.C5902k0;
import p140g0.C5931r1;
import p424s0.C11146g;
import p480v0.C11992g;

/* JADX INFO: renamed from: n0.o3 */
/* JADX INFO: loaded from: classes.dex */
public final class C8802o3 {

    /* JADX INFO: renamed from: j */
    public static final List<Integer> f31988j = Arrays.asList(1, 5, 3);

    /* JADX INFO: renamed from: a */
    public final List<f> f31989a;

    /* JADX INFO: renamed from: b */
    public final f f31990b;

    /* JADX INFO: renamed from: c */
    public final List<CameraDevice.StateCallback> f31991c;

    /* JADX INFO: renamed from: d */
    public final List<CameraCaptureSession.StateCallback> f31992d;

    /* JADX INFO: renamed from: e */
    public final List<AbstractC8828u> f31993e;

    /* JADX INFO: renamed from: f */
    public final d f31994f;

    /* JADX INFO: renamed from: g */
    public final C8785l1 f31995g;

    /* JADX INFO: renamed from: h */
    public final int f31996h;

    /* JADX INFO: renamed from: i */
    public InputConfiguration f31997i;

    /* JADX INFO: renamed from: n0.o3$a */
    public static class a {

        /* JADX INFO: renamed from: f */
        public d f32003f;

        /* JADX INFO: renamed from: g */
        public InputConfiguration f32004g;

        /* JADX INFO: renamed from: i */
        public f f32006i;

        /* JADX INFO: renamed from: a */
        public final Set<f> f31998a = new LinkedHashSet();

        /* JADX INFO: renamed from: b */
        public final C8785l1.a f31999b = new C8785l1.a();

        /* JADX INFO: renamed from: c */
        public final List<CameraDevice.StateCallback> f32000c = new ArrayList();

        /* JADX INFO: renamed from: d */
        public final List<CameraCaptureSession.StateCallback> f32001d = new ArrayList();

        /* JADX INFO: renamed from: e */
        public final List<AbstractC8828u> f32002e = new ArrayList();

        /* JADX INFO: renamed from: h */
        public int f32005h = 0;
    }

    /* JADX INFO: renamed from: n0.o3$b */
    public static class b extends a {
        /* JADX INFO: renamed from: r */
        public static b m35312r(InterfaceC8771i4<?> interfaceC8771i4, Size size) {
            e eVarM35201F = interfaceC8771i4.m35201F(null);
            if (eVarM35201F != null) {
                b bVar = new b();
                eVarM35201F.mo35342a(size, interfaceC8771i4, bVar);
                return bVar;
            }
            throw new IllegalStateException("Implementation is missing option unpacker for " + interfaceC8771i4.m42045u(interfaceC8771i4.toString()));
        }

        /* JADX INFO: renamed from: A */
        public b m35313A(int i10) {
            this.f32005h = i10;
            return this;
        }

        /* JADX INFO: renamed from: B */
        public b m35314B(int i10) {
            this.f31999b.m35273v(i10);
            return this;
        }

        /* JADX INFO: renamed from: C */
        public b m35315C(int i10) {
            if (i10 != 0) {
                this.f31999b.m35275x(i10);
            }
            return this;
        }

        /* JADX INFO: renamed from: a */
        public b m35316a(Collection<AbstractC8828u> collection) {
            for (AbstractC8828u abstractC8828u : collection) {
                this.f31999b.m35256c(abstractC8828u);
                if (!this.f32002e.contains(abstractC8828u)) {
                    this.f32002e.add(abstractC8828u);
                }
            }
            return this;
        }

        /* JADX INFO: renamed from: b */
        public b m35317b(Collection<CameraDevice.StateCallback> collection) {
            Iterator<CameraDevice.StateCallback> it = collection.iterator();
            while (it.hasNext()) {
                m35321f(it.next());
            }
            return this;
        }

        /* JADX INFO: renamed from: c */
        public b m35318c(Collection<AbstractC8828u> collection) {
            this.f31999b.m35254a(collection);
            return this;
        }

        /* JADX INFO: renamed from: d */
        public b m35319d(List<CameraCaptureSession.StateCallback> list) {
            Iterator<CameraCaptureSession.StateCallback> it = list.iterator();
            while (it.hasNext()) {
                m35326k(it.next());
            }
            return this;
        }

        /* JADX INFO: renamed from: e */
        public b m35320e(AbstractC8828u abstractC8828u) {
            this.f31999b.m35256c(abstractC8828u);
            if (!this.f32002e.contains(abstractC8828u)) {
                this.f32002e.add(abstractC8828u);
            }
            return this;
        }

        /* JADX INFO: renamed from: f */
        public b m35321f(CameraDevice.StateCallback stateCallback) {
            if (this.f32000c.contains(stateCallback)) {
                return this;
            }
            this.f32000c.add(stateCallback);
            return this;
        }

        /* JADX INFO: renamed from: g */
        public b m35322g(InterfaceC8795n1 interfaceC8795n1) {
            this.f31999b.m35258e(interfaceC8795n1);
            return this;
        }

        /* JADX INFO: renamed from: h */
        public b m35323h(AbstractC8830u1 abstractC8830u1) {
            return m35324i(abstractC8830u1, C5902k0.f22550d);
        }

        /* JADX INFO: renamed from: i */
        public b m35324i(AbstractC8830u1 abstractC8830u1, C5902k0 c5902k0) {
            this.f31998a.add(f.m35343a(abstractC8830u1).mo35351b(c5902k0).mo35350a());
            return this;
        }

        /* JADX INFO: renamed from: j */
        public b m35325j(AbstractC8828u abstractC8828u) {
            this.f31999b.m35256c(abstractC8828u);
            return this;
        }

        /* JADX INFO: renamed from: k */
        public b m35326k(CameraCaptureSession.StateCallback stateCallback) {
            if (this.f32001d.contains(stateCallback)) {
                return this;
            }
            this.f32001d.add(stateCallback);
            return this;
        }

        /* JADX INFO: renamed from: l */
        public b m35327l(AbstractC8830u1 abstractC8830u1) {
            return m35328m(abstractC8830u1, C5902k0.f22550d);
        }

        /* JADX INFO: renamed from: m */
        public b m35328m(AbstractC8830u1 abstractC8830u1, C5902k0 c5902k0) {
            return m35329n(abstractC8830u1, c5902k0, null, -1);
        }

        /* JADX INFO: renamed from: n */
        public b m35329n(AbstractC8830u1 abstractC8830u1, C5902k0 c5902k0, String str, int i10) {
            this.f31998a.add(f.m35343a(abstractC8830u1).mo35353d(str).mo35351b(c5902k0).mo35352c(i10).mo35350a());
            this.f31999b.m35259f(abstractC8830u1);
            return this;
        }

        /* JADX INFO: renamed from: o */
        public b m35330o(String str, Object obj) {
            this.f31999b.m35260g(str, obj);
            return this;
        }

        /* JADX INFO: renamed from: p */
        public C8802o3 m35331p() {
            return new C8802o3(new ArrayList(this.f31998a), new ArrayList(this.f32000c), new ArrayList(this.f32001d), new ArrayList(this.f32002e), this.f31999b.m35261h(), this.f32003f, this.f32004g, this.f32005h, this.f32006i);
        }

        /* JADX INFO: renamed from: q */
        public b m35332q() {
            this.f31998a.clear();
            this.f31999b.m35262i();
            return this;
        }

        /* JADX INFO: renamed from: s */
        public List<AbstractC8828u> m35333s() {
            return Collections.unmodifiableList(this.f32002e);
        }

        /* JADX INFO: renamed from: t */
        public boolean m35334t(AbstractC8828u abstractC8828u) {
            return this.f31999b.m35266o(abstractC8828u) || this.f32002e.remove(abstractC8828u);
        }

        /* JADX INFO: renamed from: u */
        public b m35335u(d dVar) {
            this.f32003f = dVar;
            return this;
        }

        /* JADX INFO: renamed from: v */
        public b m35336v(Range<Integer> range) {
            this.f31999b.m35268q(range);
            return this;
        }

        /* JADX INFO: renamed from: w */
        public b m35337w(InterfaceC8795n1 interfaceC8795n1) {
            this.f31999b.m35270s(interfaceC8795n1);
            return this;
        }

        /* JADX INFO: renamed from: x */
        public b m35338x(InputConfiguration inputConfiguration) {
            this.f32004g = inputConfiguration;
            return this;
        }

        /* JADX INFO: renamed from: y */
        public b m35339y(AbstractC8830u1 abstractC8830u1) {
            this.f32006i = f.m35343a(abstractC8830u1).mo35350a();
            return this;
        }

        /* JADX INFO: renamed from: z */
        public b m35340z(int i10) {
            if (i10 != 0) {
                this.f31999b.m35272u(i10);
            }
            return this;
        }
    }

    /* JADX INFO: renamed from: n0.o3$c */
    public static final class c implements d {

        /* JADX INFO: renamed from: a */
        public final AtomicBoolean f32007a = new AtomicBoolean(false);

        /* JADX INFO: renamed from: b */
        public final d f32008b;

        public c(d dVar) {
            this.f32008b = dVar;
        }

        @Override // p296n0.C8802o3.d
        /* JADX INFO: renamed from: a */
        public void mo6644a(C8802o3 c8802o3, g gVar) {
            if (this.f32007a.get()) {
                return;
            }
            this.f32008b.mo6644a(c8802o3, gVar);
        }

        /* JADX INFO: renamed from: b */
        public void m35341b() {
            this.f32007a.set(true);
        }
    }

    /* JADX INFO: renamed from: n0.o3$d */
    public interface d {
        /* JADX INFO: renamed from: a */
        void mo6644a(C8802o3 c8802o3, g gVar);
    }

    /* JADX INFO: renamed from: n0.o3$e */
    public interface e {
        /* JADX INFO: renamed from: a */
        void mo35342a(Size size, InterfaceC8771i4<?> interfaceC8771i4, b bVar);
    }

    /* JADX INFO: renamed from: n0.o3$f */
    public static abstract class f {

        /* JADX INFO: renamed from: n0.o3$f$a */
        public static abstract class a {
            /* JADX INFO: renamed from: a */
            public abstract f mo35350a();

            /* JADX INFO: renamed from: b */
            public abstract a mo35351b(C5902k0 c5902k0);

            /* JADX INFO: renamed from: c */
            public abstract a mo35352c(int i10);

            /* JADX INFO: renamed from: d */
            public abstract a mo35353d(String str);

            /* JADX INFO: renamed from: e */
            public abstract a mo35354e(List<AbstractC8830u1> list);

            /* JADX INFO: renamed from: f */
            public abstract a mo35355f(int i10);
        }

        /* JADX INFO: renamed from: a */
        public static a m35343a(AbstractC8830u1 abstractC8830u1) {
            return new C8808q.b().m35372g(abstractC8830u1).mo35354e(Collections.EMPTY_LIST).mo35353d(null).mo35352c(-1).mo35355f(-1).mo35351b(C5902k0.f22550d);
        }

        /* JADX INFO: renamed from: b */
        public abstract C5902k0 mo35344b();

        /* JADX INFO: renamed from: c */
        public abstract int mo35345c();

        /* JADX INFO: renamed from: d */
        public abstract String mo35346d();

        /* JADX INFO: renamed from: e */
        public abstract List<AbstractC8830u1> mo35347e();

        /* JADX INFO: renamed from: f */
        public abstract AbstractC8830u1 mo35348f();

        /* JADX INFO: renamed from: g */
        public abstract int mo35349g();
    }

    /* JADX INFO: renamed from: n0.o3$g */
    public enum g {
        SESSION_ERROR_SURFACE_NEEDS_RESET,
        SESSION_ERROR_UNKNOWN
    }

    /* JADX INFO: renamed from: n0.o3$h */
    public static final class h extends a {

        /* JADX INFO: renamed from: j */
        public final C11992g f32012j = new C11992g();

        /* JADX INFO: renamed from: k */
        public boolean f32013k = true;

        /* JADX INFO: renamed from: l */
        public StringBuilder f32014l = new StringBuilder();

        /* JADX INFO: renamed from: m */
        public boolean f32015m = false;

        /* JADX INFO: renamed from: n */
        public List<d> f32016n = new ArrayList();

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m35357a(h hVar, C8802o3 c8802o3, g gVar) {
            Iterator<d> it = hVar.f32016n.iterator();
            while (it.hasNext()) {
                it.next().mo6644a(c8802o3, gVar);
            }
        }

        /* JADX INFO: renamed from: b */
        public void m35358b(C8802o3 c8802o3) {
            C8785l1 c8785l1M35306l = c8802o3.m35306l();
            if (c8785l1M35306l.m35248k() != -1) {
                this.f32015m = true;
                this.f31999b.m35273v(C8802o3.m35297f(c8785l1M35306l.m35248k(), this.f31999b.m35265n()));
            }
            m35364h(c8785l1M35306l.m35242e());
            m35365i(c8785l1M35306l.m35245h());
            m35366j(c8785l1M35306l.m35249l());
            this.f31999b.m35255b(c8802o3.m35306l().m35247j());
            this.f32000c.addAll(c8802o3.m35298c());
            this.f32001d.addAll(c8802o3.m35307m());
            this.f31999b.m35254a(c8802o3.m35305k());
            this.f32002e.addAll(c8802o3.m35309o());
            if (c8802o3.m35299d() != null) {
                this.f32016n.add(c8802o3.m35299d());
            }
            if (c8802o3.m35302h() != null) {
                this.f32004g = c8802o3.m35302h();
            }
            this.f31998a.addAll(c8802o3.m35303i());
            this.f31999b.m35264m().addAll(c8785l1M35306l.m35246i());
            if (!m35362f().containsAll(this.f31999b.m35264m())) {
                C5931r1.m26561a("ValidatingBuilder", "Invalid configuration due to capture request surfaces are not a subset of surfaces");
                this.f32013k = false;
                this.f32014l.append("Invalid configuration due to capture request surfaces are not a subset of surfaces");
            }
            if (c8802o3.m35308n() != this.f32005h && c8802o3.m35308n() != 0 && this.f32005h != 0) {
                C5931r1.m26561a("ValidatingBuilder", "Invalid configuration due to that two non-default session types are set");
                this.f32013k = false;
                this.f32014l.append("Invalid configuration due to that two non-default session types are set");
            } else if (c8802o3.m35308n() != 0) {
                this.f32005h = c8802o3.m35308n();
            }
            if (c8802o3.f31990b != null) {
                if (this.f32006i == c8802o3.f31990b || this.f32006i == null) {
                    this.f32006i = c8802o3.f31990b;
                } else {
                    C5931r1.m26561a("ValidatingBuilder", "Invalid configuration due to that two different postview output configs are set");
                    this.f32013k = false;
                    this.f32014l.append("Invalid configuration due to that two different postview output configs are set");
                }
            }
            this.f31999b.m35258e(c8785l1M35306l.m35244g());
        }

        /* JADX INFO: renamed from: c */
        public C8802o3 m35359c() {
            if (!this.f32013k) {
                throw new IllegalArgumentException("Unsupported session configuration combination");
            }
            ArrayList arrayList = new ArrayList(this.f31998a);
            this.f32012j.m44747c(arrayList);
            if (this.f32005h == 1) {
                new C11146g().m42001e(arrayList, this.f31999b);
            }
            return new C8802o3(arrayList, new ArrayList(this.f32000c), new ArrayList(this.f32001d), new ArrayList(this.f32002e), this.f31999b.m35261h(), !this.f32016n.isEmpty() ? new d() { // from class: n0.p3
                @Override // p296n0.C8802o3.d
                /* JADX INFO: renamed from: a */
                public final void mo6644a(C8802o3 c8802o3, C8802o3.g gVar) {
                    C8802o3.h.m35357a(this.f32034a, c8802o3, gVar);
                }
            } : null, this.f32004g, this.f32005h, this.f32006i);
        }

        /* JADX INFO: renamed from: d */
        public void m35360d() {
            this.f31998a.clear();
            this.f31999b.m35262i();
        }

        /* JADX INFO: renamed from: e */
        public String m35361e() {
            return !this.f32015m ? "Template is not set" : this.f32014l.toString();
        }

        /* JADX INFO: renamed from: f */
        public final List<AbstractC8830u1> m35362f() {
            ArrayList arrayList = new ArrayList();
            for (f fVar : this.f31998a) {
                arrayList.add(fVar.mo35348f());
                Iterator<AbstractC8830u1> it = fVar.mo35347e().iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next());
                }
            }
            return arrayList;
        }

        /* JADX INFO: renamed from: g */
        public boolean m35363g() {
            return this.f32015m && this.f32013k;
        }

        /* JADX INFO: renamed from: h */
        public final void m35364h(Range<Integer> range) {
            Range<Integer> range2 = AbstractC8827t3.f32104a;
            if (range.equals(range2)) {
                return;
            }
            if (this.f31999b.m35263l().equals(range2)) {
                this.f31999b.m35268q(range);
                return;
            }
            if (this.f31999b.m35263l().equals(range)) {
                return;
            }
            this.f32013k = false;
            String str = "Different ExpectedFrameRateRange values; current = " + this.f31999b.m35263l() + ", new = " + range;
            C5931r1.m26563c("ValidatingBuilder", str);
            this.f32014l.append(str);
        }

        /* JADX INFO: renamed from: i */
        public final void m35365i(int i10) {
            if (i10 != 0) {
                this.f31999b.m35272u(i10);
            }
        }

        /* JADX INFO: renamed from: j */
        public final void m35366j(int i10) {
            if (i10 != 0) {
                this.f31999b.m35275x(i10);
            }
        }
    }

    public C8802o3(List<f> list, List<CameraDevice.StateCallback> list2, List<CameraCaptureSession.StateCallback> list3, List<AbstractC8828u> list4, C8785l1 c8785l1, d dVar, InputConfiguration inputConfiguration, int i10, f fVar) {
        this.f31989a = list;
        this.f31991c = Collections.unmodifiableList(list2);
        this.f31992d = Collections.unmodifiableList(list3);
        this.f31993e = Collections.unmodifiableList(list4);
        this.f31994f = dVar;
        this.f31995g = c8785l1;
        this.f31997i = inputConfiguration;
        this.f31996h = i10;
        this.f31990b = fVar;
    }

    /* JADX INFO: renamed from: b */
    public static C8802o3 m35296b() {
        return new C8802o3(new ArrayList(), new ArrayList(0), new ArrayList(0), new ArrayList(0), new C8785l1.a().m35261h(), null, null, 0, null);
    }

    /* JADX INFO: renamed from: f */
    public static int m35297f(int i10, int i11) {
        List<Integer> list = f31988j;
        return list.indexOf(Integer.valueOf(i10)) >= list.indexOf(Integer.valueOf(i11)) ? i10 : i11;
    }

    /* JADX INFO: renamed from: c */
    public List<CameraDevice.StateCallback> m35298c() {
        return this.f31991c;
    }

    /* JADX INFO: renamed from: d */
    public d m35299d() {
        return this.f31994f;
    }

    /* JADX INFO: renamed from: e */
    public Range<Integer> m35300e() {
        return this.f31995g.m35242e();
    }

    /* JADX INFO: renamed from: g */
    public InterfaceC8795n1 m35301g() {
        return this.f31995g.m35244g();
    }

    /* JADX INFO: renamed from: h */
    public InputConfiguration m35302h() {
        return this.f31997i;
    }

    /* JADX INFO: renamed from: i */
    public List<f> m35303i() {
        return this.f31989a;
    }

    /* JADX INFO: renamed from: j */
    public f m35304j() {
        return this.f31990b;
    }

    /* JADX INFO: renamed from: k */
    public List<AbstractC8828u> m35305k() {
        return this.f31995g.m35240c();
    }

    /* JADX INFO: renamed from: l */
    public C8785l1 m35306l() {
        return this.f31995g;
    }

    /* JADX INFO: renamed from: m */
    public List<CameraCaptureSession.StateCallback> m35307m() {
        return this.f31992d;
    }

    /* JADX INFO: renamed from: n */
    public int m35308n() {
        return this.f31996h;
    }

    /* JADX INFO: renamed from: o */
    public List<AbstractC8828u> m35309o() {
        return this.f31993e;
    }

    /* JADX INFO: renamed from: p */
    public List<AbstractC8830u1> m35310p() {
        ArrayList arrayList = new ArrayList();
        for (f fVar : this.f31989a) {
            arrayList.add(fVar.mo35348f());
            Iterator<AbstractC8830u1> it = fVar.mo35347e().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: renamed from: q */
    public int m35311q() {
        return this.f31995g.m35248k();
    }
}
