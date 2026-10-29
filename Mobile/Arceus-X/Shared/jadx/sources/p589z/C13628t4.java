package p589z;

import android.graphics.SurfaceTexture;
import android.util.Size;
import android.view.Surface;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;
import p001a0.C0008c0;
import p063d0.C4392w;
import p140g0.AbstractC5952w2;
import p140g0.C5931r1;
import p296n0.AbstractC8830u1;
import p296n0.C8781k2;
import p296n0.C8802o3;
import p296n0.C8846x2;
import p296n0.InterfaceC8763h2;
import p296n0.InterfaceC8771i4;
import p296n0.InterfaceC8777j4;
import p296n0.InterfaceC8795n1;
import p366q0.C10417c;
import p397r0.C10773n;
import p397r0.InterfaceC10762c;
import p424s0.InterfaceC11156q;

/* JADX INFO: renamed from: z.t4 */
/* JADX INFO: loaded from: classes.dex */
public class C13628t4 {

    /* JADX INFO: renamed from: a */
    public AbstractC8830u1 f47684a;

    /* JADX INFO: renamed from: b */
    public C8802o3 f47685b;

    /* JADX INFO: renamed from: d */
    public final Size f47687d;

    /* JADX INFO: renamed from: f */
    public final c f47689f;

    /* JADX INFO: renamed from: e */
    public final C4392w f47688e = new C4392w();

    /* JADX INFO: renamed from: g */
    public C8802o3.c f47690g = null;

    /* JADX INFO: renamed from: c */
    public final b f47686c = new b();

    /* JADX INFO: renamed from: z.t4$a */
    public class a implements InterfaceC10762c<Void> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Surface f47691a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ SurfaceTexture f47692b;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public a(Surface surface, SurfaceTexture surfaceTexture) {
            this.f47691a = surface;
            this.f47692b = surfaceTexture;
        }

        /* JADX DEBUG: Method merged with bridge method: onSuccess(Ljava/lang/Object;)V */
        @Override // p397r0.InterfaceC10762c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r8) {
            this.f47691a.release();
            this.f47692b.release();
        }

        @Override // p397r0.InterfaceC10762c
        public void onFailure(Throwable th2) {
            throw new IllegalStateException("Future should never fail. Did it get completed by GC?", th2);
        }
    }

    /* JADX INFO: renamed from: z.t4$b */
    public static class b implements InterfaceC8771i4<AbstractC5952w2> {

        /* JADX INFO: renamed from: P */
        public final InterfaceC8795n1 f47694P;

        public b() {
            C8846x2 c8846x2M35505k0 = C8846x2.m35505k0();
            c8846x2M35505k0.mo35473G(InterfaceC8771i4.f31909y, new C13619s2());
            c8846x2M35505k0.mo35473G(InterfaceC8763h2.f31863j, 34);
            m49621h0(c8846x2M35505k0);
            this.f47694P = c8846x2M35505k0;
        }

        @Override // p296n0.InterfaceC8771i4
        /* JADX INFO: renamed from: X */
        public InterfaceC8777j4.b mo35207X() {
            return InterfaceC8777j4.b.METERING_REPEATING;
        }

        /* JADX INFO: renamed from: h0 */
        public final void m49621h0(C8846x2 c8846x2) {
            c8846x2.mo35473G(InterfaceC11156q.f39401N, C13628t4.class);
            c8846x2.mo35473G(InterfaceC11156q.f39400M, C13628t4.class.getCanonicalName() + "-" + UUID.randomUUID());
        }

        @Override // p296n0.InterfaceC8787l3
        /* JADX INFO: renamed from: n */
        public InterfaceC8795n1 mo6691n() {
            return this.f47694P;
        }
    }

    /* JADX INFO: renamed from: z.t4$c */
    public interface c {
        /* JADX INFO: renamed from: a */
        void mo49498a();
    }

    public C13628t4(C0008c0 c0008c0, C13606q3 c13606q3, c cVar) {
        this.f47689f = cVar;
        Size sizeM49617g = m49617g(c0008c0, c13606q3);
        this.f47687d = sizeM49617g;
        C5931r1.m26561a("MeteringRepeating", "MeteringSession SurfaceTexture size: " + sizeM49617g);
        this.f47685b = m49614d();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m49611a(C13628t4 c13628t4, C8802o3 c8802o3, C8802o3.g gVar) {
        c13628t4.f47685b = c13628t4.m49614d();
        c cVar = c13628t4.f47689f;
        if (cVar != null) {
            cVar.mo49498a();
        }
    }

    /* JADX INFO: renamed from: c */
    public void m49613c() {
        C5931r1.m26561a("MeteringRepeating", "MeteringRepeating clear!");
        AbstractC8830u1 abstractC8830u1 = this.f47684a;
        if (abstractC8830u1 != null) {
            abstractC8830u1.mo35430d();
        }
        this.f47684a = null;
    }

    /* JADX INFO: renamed from: d */
    public C8802o3 m49614d() {
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(this.f47687d.getWidth(), this.f47687d.getHeight());
        Surface surface = new Surface(surfaceTexture);
        C8802o3.b bVarM35312r = C8802o3.b.m35312r(this.f47686c, this.f47687d);
        bVarM35312r.m35314B(1);
        C8781k2 c8781k2 = new C8781k2(surface);
        this.f47684a = c8781k2;
        C10773n.m40987j(c8781k2.m35437k(), new a(surface, surfaceTexture), C10417c.m40081b());
        bVarM35312r.m35327l(this.f47684a);
        C8802o3.c cVar = this.f47690g;
        if (cVar != null) {
            cVar.m35341b();
        }
        C8802o3.c cVar2 = new C8802o3.c(new C8802o3.d() { // from class: z.r4
            @Override // p296n0.C8802o3.d
            /* JADX INFO: renamed from: a */
            public final void mo6644a(C8802o3 c8802o3, C8802o3.g gVar) {
                C13628t4.m49611a(this.f47650a, c8802o3, gVar);
            }
        });
        this.f47690g = cVar2;
        bVarM35312r.m35335u(cVar2);
        return bVarM35312r.m35331p();
    }

    /* JADX INFO: renamed from: e */
    public Size m49615e() {
        return this.f47687d;
    }

    /* JADX INFO: renamed from: f */
    public String m49616f() {
        return "MeteringRepeating";
    }

    /* JADX INFO: renamed from: g */
    public final Size m49617g(C0008c0 c0008c0, C13606q3 c13606q3) {
        Size[] sizeArrM95g = c0008c0.m13e().m95g(34);
        if (sizeArrM95g == null) {
            C5931r1.m26563c("MeteringRepeating", "Can not get output size list.");
            return new Size(0, 0);
        }
        Size[] sizeArrM22064a = this.f47688e.m22064a(sizeArrM95g);
        List listAsList = Arrays.asList(sizeArrM22064a);
        Collections.sort(listAsList, new Comparator() { // from class: z.s4
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                Size size = (Size) obj;
                Size size2 = (Size) obj2;
                return Long.signum((((long) size.getWidth()) * ((long) size.getHeight())) - (((long) size2.getWidth()) * ((long) size2.getHeight())));
            }
        });
        Size sizeM49579f = c13606q3.m49579f();
        long jMin = Math.min(((long) sizeM49579f.getWidth()) * ((long) sizeM49579f.getHeight()), 307200L);
        int length = sizeArrM22064a.length;
        Size size = null;
        int i10 = 0;
        while (i10 < length) {
            Size size2 = sizeArrM22064a[i10];
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

    /* JADX INFO: renamed from: h */
    public C8802o3 m49618h() {
        return this.f47685b;
    }

    /* JADX INFO: renamed from: i */
    public InterfaceC8771i4<?> m49619i() {
        return this.f47686c;
    }
}
