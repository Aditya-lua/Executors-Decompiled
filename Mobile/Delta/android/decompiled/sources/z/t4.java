package z;

import android.graphics.SurfaceTexture;
import android.util.Size;
import android.view.Surface;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public class t4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public n0.u1 f36823a;
    public n0.o3 b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Size f36825d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c f36827f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d0.w f36826e = new d0.w();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public n0.o3.c f36828g = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f36824c = new b();

    public class a implements r0.c<Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Surface f36829a;
        public final /* synthetic */ SurfaceTexture b;

        public a(Surface surface, SurfaceTexture surfaceTexture) {
            this.f36829a = surface;
            this.b = surfaceTexture;
        }

        @Override // r0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r8) {
            this.f36829a.release();
            this.b.release();
        }

        @Override // r0.c
        public void onFailure(Throwable th2) {
            throw new IllegalStateException("Future should never fail. Did it get completed by GC?", th2);
        }
    }

    public static class b implements n0.i4<g0.w2> {
        public final n0.n1 P;

        public b() {
            n0.x2 x2VarK0 = n0.x2.k0();
            x2VarK0.G(n0.i4.f24699y, new s2());
            x2VarK0.G(n0.h2.f24670j, 34);
            h0(x2VarK0);
            this.P = x2VarK0;
        }

        @Override // n0.i4
        public n0.j4.b X() {
            return n0.j4.b.METERING_REPEATING;
        }

        public final void h0(n0.x2 x2Var) {
            x2Var.G(s0.q.N, t4.class);
            x2Var.G(s0.q.M, t4.class.getCanonicalName() + "-" + UUID.randomUUID());
        }

        @Override // n0.l3
        public n0.n1 n() {
            return this.P;
        }
    }

    public interface c {
        void a();
    }

    public t4(a0.c0 c0Var, q3 q3Var, c cVar) {
        this.f36827f = cVar;
        Size sizeG = g(c0Var, q3Var);
        this.f36825d = sizeG;
        g0.r1.a("MeteringRepeating", "MeteringSession SurfaceTexture size: " + sizeG);
        this.b = d();
    }

    public static /* synthetic */ void a(t4 t4Var, n0.o3 o3Var, n0.o3.g gVar) {
        t4Var.b = t4Var.d();
        c cVar = t4Var.f36827f;
        if (cVar != null) {
            cVar.a();
        }
    }

    public void c() {
        g0.r1.a("MeteringRepeating", "MeteringRepeating clear!");
        n0.u1 u1Var = this.f36823a;
        if (u1Var != null) {
            u1Var.d();
        }
        this.f36823a = null;
    }

    public n0.o3 d() {
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(this.f36825d.getWidth(), this.f36825d.getHeight());
        Surface surface = new Surface(surfaceTexture);
        n0.o3.b bVarR = n0.o3.b.r(this.f36824c, this.f36825d);
        bVarR.B(1);
        n0.k2 k2Var = new n0.k2(surface);
        this.f36823a = k2Var;
        r0.n.j(k2Var.k(), new a(surface, surfaceTexture), q0.c.b());
        bVarR.l(this.f36823a);
        n0.o3.c cVar = this.f36828g;
        if (cVar != null) {
            cVar.b();
        }
        n0.o3.c cVar2 = new n0.o3.c(new n0.o3.d() { // from class: z.r4
            @Override // n0.o3.d
            public final void a(n0.o3 o3Var, n0.o3.g gVar) {
                t4.a(this.f36795a, o3Var, gVar);
            }
        });
        this.f36828g = cVar2;
        bVarR.u(cVar2);
        return bVarR.p();
    }

    public Size e() {
        return this.f36825d;
    }

    public String f() {
        return "MeteringRepeating";
    }

    public final Size g(a0.c0 c0Var, q3 q3Var) {
        Size[] sizeArrG = c0Var.e().g(34);
        if (sizeArrG == null) {
            g0.r1.c("MeteringRepeating", "Can not get output size list.");
            return new Size(0, 0);
        }
        Size[] sizeArrA = this.f36826e.a(sizeArrG);
        List listAsList = Arrays.asList(sizeArrA);
        Collections.sort(listAsList, new Comparator() { // from class: z.s4
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                Size size = (Size) obj;
                Size size2 = (Size) obj2;
                return Long.signum((((long) size.getWidth()) * ((long) size.getHeight())) - (((long) size2.getWidth()) * ((long) size2.getHeight())));
            }
        });
        Size sizeF = q3Var.f();
        long jMin = Math.min(((long) sizeF.getWidth()) * ((long) sizeF.getHeight()), 307200L);
        int length = sizeArrA.length;
        Size size = null;
        int i10 = 0;
        while (i10 < length) {
            Size size2 = sizeArrA[i10];
            long width = ((long) size2.getWidth()) * ((long) size2.getHeight());
            if (width == jMin) {
                return size2;
            }
            if (width > jMin) {
                if (size == null) {
                    break;
                }
                return size;
            }
            i10++;
            size = size2;
        }
        return (Size) listAsList.get(0);
    }

    public n0.o3 h() {
        return this.b;
    }

    public n0.i4<?> i() {
        return this.f36824c;
    }
}
