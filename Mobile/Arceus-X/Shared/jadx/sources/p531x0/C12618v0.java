package p531x0;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import p140g0.C5931r1;
import p140g0.C5948v2;
import p140g0.InterfaceC5900j2;
import p296n0.InterfaceC8804p0;
import p347p0.C10085a0;
import p347p0.C10110z;
import p366q0.C10417c;
import p397r0.C10773n;
import p397r0.InterfaceC10762c;
import p533x2.C12637g;
import p533x2.InterfaceC12631a;
import p590z0.AbstractC13677f;

/* JADX INFO: renamed from: x0.v0 */
/* JADX INFO: loaded from: classes.dex */
public class C12618v0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC12610r0 f44917a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC8804p0 f44918b;

    /* JADX INFO: renamed from: c */
    public c f44919c;

    /* JADX INFO: renamed from: d */
    public b f44920d;

    /* JADX INFO: renamed from: x0.v0$a */
    public class a implements InterfaceC10762c<InterfaceC5900j2> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C12602n0 f44921a;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public a(C12602n0 c12602n0) {
            this.f44921a = c12602n0;
        }

        /* JADX DEBUG: Method merged with bridge method: onSuccess(Ljava/lang/Object;)V */
        @Override // p397r0.InterfaceC10762c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(InterfaceC5900j2 interfaceC5900j2) {
            C12637g.m47075g(interfaceC5900j2);
            C12618v0.this.f44917a.mo26521d(interfaceC5900j2);
        }

        @Override // p397r0.InterfaceC10762c
        public void onFailure(Throwable th2) {
            if (this.f44921a.m46962t() == 2 && (th2 instanceof CancellationException)) {
                C5931r1.m26561a("SurfaceProcessorNode", "Downstream VideoCapture failed to provide Surface.");
                return;
            }
            C5931r1.m26573m("SurfaceProcessorNode", "Downstream node failed to provide Surface. Target: " + C12626z0.m47043b(this.f44921a.m46962t()), th2);
        }
    }

    /* JADX INFO: renamed from: x0.v0$b */
    public static abstract class b {
        /* JADX INFO: renamed from: c */
        public static b m47017c(C12602n0 c12602n0, List<AbstractC13677f> list) {
            return new C12579c(c12602n0, list);
        }

        /* JADX INFO: renamed from: a */
        public abstract List<AbstractC13677f> mo46940a();

        /* JADX INFO: renamed from: b */
        public abstract C12602n0 mo46941b();
    }

    /* JADX INFO: renamed from: x0.v0$c */
    public static class c extends HashMap<AbstractC13677f, C12602n0> {
    }

    public C12618v0(InterfaceC8804p0 interfaceC8804p0, InterfaceC12610r0 interfaceC12610r0) {
        this.f44918b = interfaceC8804p0;
        this.f44917a = interfaceC12610r0;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m47006b(Map map, C5948v2.h hVar) {
        for (Map.Entry entry : map.entrySet()) {
            int iMo26510b = hVar.mo26510b() - ((AbstractC13677f) entry.getKey()).mo49857c();
            if (((AbstractC13677f) entry.getKey()).mo49861g()) {
                iMo26510b = -iMo26510b;
            }
            ((C12602n0) entry.getValue()).m46968z(C10085a0.m38895w(iMo26510b), -1);
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m47007c(C12618v0 c12618v0) {
        c cVar = c12618v0.f44919c;
        if (cVar != null) {
            Iterator<C12602n0> it = cVar.values().iterator();
            while (it.hasNext()) {
                it.next().m46951i();
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m47008d(C12602n0 c12602n0, Map.Entry<AbstractC13677f, C12602n0> entry) {
        C12602n0 value = entry.getValue();
        C5931r1.m26561a("SurfaceProcessorNode", "     -> outputEdge = " + value);
        C10773n.m40987j(value.m46952j(entry.getKey().mo49856b(), InterfaceC5900j2.a.m26507f(c12602n0.m46961s().mo35395f(), entry.getKey().mo49855a(), c12602n0.m46963u() ? this.f44918b : null, entry.getKey().mo49857c(), entry.getKey().mo49861g()), null), new a(value), C10417c.m40084e());
    }

    /* JADX INFO: renamed from: e */
    public InterfaceC12610r0 m47009e() {
        return this.f44917a;
    }

    /* JADX INFO: renamed from: f */
    public void m47010f() {
        this.f44917a.mo46980a();
        C10110z.m39011e(new Runnable() { // from class: x0.u0
            @Override // java.lang.Runnable
            public final void run() {
                C12618v0.m47007c(this.f44914a);
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public final void m47011g(final C12602n0 c12602n0, Map<AbstractC13677f, C12602n0> map) {
        for (final Map.Entry<AbstractC13677f, C12602n0> entry : map.entrySet()) {
            m47008d(c12602n0, entry);
            entry.getValue().m46947e(new Runnable() { // from class: x0.s0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f44897a.m47008d(c12602n0, entry);
                }
            });
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m47012h(C12602n0 c12602n0) {
        this.f44917a.mo26520b(c12602n0.m46953k(this.f44918b));
    }

    /* JADX INFO: renamed from: i */
    public void m47013i(C12602n0 c12602n0, final Map<AbstractC13677f, C12602n0> map) {
        c12602n0.m46948f(new InterfaceC12631a() { // from class: x0.t0
            @Override // p533x2.InterfaceC12631a
            public final void accept(Object obj) {
                C12618v0.m47006b(map, (C5948v2.h) obj);
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public c m47014j(b bVar) {
        C10110z.m39008b();
        C5931r1.m26561a("SurfaceProcessorNode", "SurfaceProcessorNode Transform (Processor=" + this.f44917a + "\n   inputEdge = " + bVar.mo46941b());
        Iterator<AbstractC13677f> it = bVar.mo46940a().iterator();
        while (it.hasNext()) {
            C5931r1.m26561a("SurfaceProcessorNode", "   outputConfig = " + it.next());
        }
        this.f44920d = bVar;
        this.f44919c = new c();
        C12602n0 c12602n0Mo46941b = bVar.mo46941b();
        for (AbstractC13677f abstractC13677f : bVar.mo46940a()) {
            this.f44919c.put(abstractC13677f, m47015k(c12602n0Mo46941b, abstractC13677f));
        }
        m47012h(c12602n0Mo46941b);
        m47011g(c12602n0Mo46941b, this.f44919c);
        m47013i(c12602n0Mo46941b, this.f44919c);
        return this.f44919c;
    }

    /* JADX INFO: renamed from: k */
    public final C12602n0 m47015k(C12602n0 c12602n0, AbstractC13677f abstractC13677f) {
        Rect rectM38890r;
        Rect rectMo49855a = abstractC13677f.mo49855a();
        int iMo49857c = abstractC13677f.mo49857c();
        boolean zMo49861g = abstractC13677f.mo49861g();
        Matrix matrix = new Matrix(c12602n0.m46960r());
        Matrix matrixM38877e = C10085a0.m38877e(new RectF(rectMo49855a), C10085a0.m38892t(abstractC13677f.mo49858d()), iMo49857c, zMo49861g);
        matrix.postConcat(matrixM38877e);
        C12637g.m47069a(C10085a0.m38882j(C10085a0.m38878f(rectMo49855a, iMo49857c), abstractC13677f.mo49858d()));
        if (abstractC13677f.mo49862k()) {
            C12637g.m47070b(abstractC13677f.mo49855a().contains(c12602n0.m46956n()), String.format("Output crop rect %s must contain input crop rect %s", abstractC13677f.mo49855a(), c12602n0.m46956n()));
            rectM38890r = new Rect();
            RectF rectF = new RectF(c12602n0.m46956n());
            matrixM38877e.mapRect(rectF);
            rectF.round(rectM38890r);
        } else {
            rectM38890r = C10085a0.m38890r(abstractC13677f.mo49858d());
        }
        Rect rect = rectM38890r;
        return new C12602n0(abstractC13677f.mo49859e(), abstractC13677f.mo49856b(), c12602n0.m46961s().mo35398i().mo35404f(abstractC13677f.mo49858d()).mo35399a(), matrix, false, rect, c12602n0.m46959q() - iMo49857c, -1, c12602n0.m46965w() != zMo49861g);
    }
}
