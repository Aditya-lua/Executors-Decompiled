package p562y0;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import p140g0.C5931r1;
import p140g0.InterfaceC5900j2;
import p296n0.InterfaceC8804p0;
import p347p0.C10085a0;
import p347p0.C10110z;
import p366q0.C10417c;
import p397r0.C10773n;
import p397r0.InterfaceC10762c;
import p531x0.C12602n0;
import p531x0.C12626z0;
import p531x0.InterfaceC12610r0;
import p533x2.C12637g;
import p590z0.AbstractC13677f;

/* JADX INFO: renamed from: y0.r */
/* JADX INFO: loaded from: classes.dex */
public class C12994r {

    /* JADX INFO: renamed from: a */
    public final InterfaceC12610r0 f45988a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC8804p0 f45989b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC8804p0 f45990c;

    /* JADX INFO: renamed from: d */
    public c f45991d;

    /* JADX INFO: renamed from: e */
    public b f45992e;

    /* JADX INFO: renamed from: y0.r$a */
    public class a implements InterfaceC10762c<InterfaceC5900j2> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C12602n0 f45993a;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public a(C12602n0 c12602n0) {
            this.f45993a = c12602n0;
        }

        /* JADX DEBUG: Method merged with bridge method: onSuccess(Ljava/lang/Object;)V */
        @Override // p397r0.InterfaceC10762c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(InterfaceC5900j2 interfaceC5900j2) {
            C12637g.m47075g(interfaceC5900j2);
            C12994r.this.f45988a.mo26521d(interfaceC5900j2);
        }

        @Override // p397r0.InterfaceC10762c
        public void onFailure(Throwable th2) {
            if (this.f45993a.m46962t() == 2 && (th2 instanceof CancellationException)) {
                C5931r1.m26561a("DualSurfaceProcessorNode", "Downstream VideoCapture failed to provide Surface.");
                return;
            }
            C5931r1.m26573m("DualSurfaceProcessorNode", "Downstream node failed to provide Surface. Target: " + C12626z0.m47043b(this.f45993a.m46962t()), th2);
        }
    }

    /* JADX INFO: renamed from: y0.r$b */
    public static abstract class b {
        /* JADX INFO: renamed from: d */
        public static b m48285d(C12602n0 c12602n0, C12602n0 c12602n1, List<AbstractC12980d> list) {
            return new C12978b(c12602n0, c12602n1, list);
        }

        /* JADX INFO: renamed from: a */
        public abstract List<AbstractC12980d> mo48254a();

        /* JADX INFO: renamed from: b */
        public abstract C12602n0 mo48255b();

        /* JADX INFO: renamed from: c */
        public abstract C12602n0 mo48256c();
    }

    /* JADX INFO: renamed from: y0.r$c */
    public static class c extends HashMap<AbstractC12980d, C12602n0> {
    }

    public C12994r(InterfaceC8804p0 interfaceC8804p0, InterfaceC8804p0 interfaceC8804p1, InterfaceC12610r0 interfaceC12610r0) {
        this.f45989b = interfaceC8804p0;
        this.f45990c = interfaceC8804p1;
        this.f45988a = interfaceC12610r0;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m48276a(C12994r c12994r) {
        c cVar = c12994r.f45991d;
        if (cVar != null) {
            Iterator<C12602n0> it = cVar.values().iterator();
            while (it.hasNext()) {
                it.next().m46951i();
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m48278c(InterfaceC8804p0 interfaceC8804p0, InterfaceC8804p0 interfaceC8804p1, C12602n0 c12602n0, C12602n0 c12602n1, Map.Entry<AbstractC12980d, C12602n0> entry) {
        C12602n0 value = entry.getValue();
        C5931r1.m26561a("DualSurfaceProcessorNode", "     -> outputEdge = " + value);
        Size sizeMo35395f = c12602n0.m46961s().mo35395f();
        Rect rectMo49855a = entry.getKey().mo48252a().mo49855a();
        if (!c12602n0.m46963u()) {
            interfaceC8804p0 = null;
        }
        InterfaceC5900j2.a aVarM26507f = InterfaceC5900j2.a.m26507f(sizeMo35395f, rectMo49855a, interfaceC8804p0, entry.getKey().mo48252a().mo49857c(), entry.getKey().mo48252a().mo49861g());
        Size sizeMo35395f2 = c12602n1.m46961s().mo35395f();
        Rect rectMo49855a2 = entry.getKey().mo48253b().mo49855a();
        if (!c12602n1.m46963u()) {
            interfaceC8804p1 = null;
        }
        C10773n.m40987j(value.m46952j(entry.getKey().mo48252a().mo49856b(), aVarM26507f, InterfaceC5900j2.a.m26507f(sizeMo35395f2, rectMo49855a2, interfaceC8804p1, entry.getKey().mo48253b().mo49857c(), entry.getKey().mo48253b().mo49861g())), new a(value), C10417c.m40084e());
    }

    /* JADX INFO: renamed from: d */
    public void m48279d() {
        this.f45988a.mo46980a();
        C10110z.m39011e(new Runnable() { // from class: y0.p
            @Override // java.lang.Runnable
            public final void run() {
                C12994r.m48276a(this.f45981a);
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public final void m48280e(InterfaceC8804p0 interfaceC8804p0, InterfaceC8804p0 interfaceC8804p1, C12602n0 c12602n0, C12602n0 c12602n1, Map<AbstractC12980d, C12602n0> map) {
        for (final Map.Entry<AbstractC12980d, C12602n0> entry : map.entrySet()) {
            final InterfaceC8804p0 interfaceC8804p2 = interfaceC8804p0;
            final InterfaceC8804p0 interfaceC8804p3 = interfaceC8804p1;
            final C12602n0 c12602n2 = c12602n0;
            final C12602n0 c12602n3 = c12602n1;
            m48278c(interfaceC8804p2, interfaceC8804p3, c12602n2, c12602n3, entry);
            entry.getValue().m46947e(new Runnable() { // from class: y0.q
                @Override // java.lang.Runnable
                public final void run() {
                    this.f45982a.m48278c(interfaceC8804p2, interfaceC8804p3, c12602n2, c12602n3, entry);
                }
            });
            interfaceC8804p0 = interfaceC8804p2;
            interfaceC8804p1 = interfaceC8804p3;
            c12602n0 = c12602n2;
            c12602n1 = c12602n3;
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m48281f(InterfaceC8804p0 interfaceC8804p0, C12602n0 c12602n0, boolean z10) {
        this.f45988a.mo26520b(c12602n0.m46954l(interfaceC8804p0, z10));
    }

    /* JADX INFO: renamed from: g */
    public c m48282g(b bVar) {
        C10110z.m39008b();
        C5931r1.m26561a("DualSurfaceProcessorNode", "DualSurfaceProcessorNode Transform Processor = " + this.f45988a + "\n   primary input = " + bVar.mo48255b() + "\n   secondary input = " + bVar.mo48256c());
        Iterator<AbstractC12980d> it = bVar.mo48254a().iterator();
        while (it.hasNext()) {
            C5931r1.m26561a("SurfaceProcessorNode", "   outputConfig = " + it.next());
        }
        this.f45992e = bVar;
        this.f45991d = new c();
        C12602n0 c12602n0Mo48255b = this.f45992e.mo48255b();
        C12602n0 c12602n0Mo48256c = this.f45992e.mo48256c();
        for (AbstractC12980d abstractC12980d : this.f45992e.mo48254a()) {
            this.f45991d.put(abstractC12980d, m48283h(c12602n0Mo48255b, abstractC12980d.mo48252a()));
        }
        m48281f(this.f45989b, c12602n0Mo48255b, true);
        m48281f(this.f45990c, c12602n0Mo48256c, false);
        m48280e(this.f45989b, this.f45990c, c12602n0Mo48255b, c12602n0Mo48256c, this.f45991d);
        return this.f45991d;
    }

    /* JADX INFO: renamed from: h */
    public final C12602n0 m48283h(C12602n0 c12602n0, AbstractC13677f abstractC13677f) {
        Rect rectMo49855a = abstractC13677f.mo49855a();
        int iMo49857c = abstractC13677f.mo49857c();
        boolean zMo49861g = abstractC13677f.mo49861g();
        Matrix matrix = new Matrix(c12602n0.m46960r());
        matrix.postConcat(C10085a0.m38877e(new RectF(rectMo49855a), C10085a0.m38892t(abstractC13677f.mo49858d()), iMo49857c, zMo49861g));
        C12637g.m47069a(C10085a0.m38882j(C10085a0.m38878f(rectMo49855a, iMo49857c), abstractC13677f.mo49858d()));
        Rect rectM38890r = C10085a0.m38890r(abstractC13677f.mo49858d());
        return new C12602n0(abstractC13677f.mo49859e(), abstractC13677f.mo49856b(), c12602n0.m46961s().mo35398i().mo35404f(abstractC13677f.mo49858d()).mo35399a(), matrix, false, rectM38890r, c12602n0.m46959q() - iMo49857c, -1, c12602n0.m46965w() != zMo49861g);
    }
}
