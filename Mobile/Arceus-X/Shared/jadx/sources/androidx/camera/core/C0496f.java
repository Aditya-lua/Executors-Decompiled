package androidx.camera.core;

import android.view.Surface;
import androidx.camera.core.C0496f;
import androidx.camera.core.InterfaceC0494d;
import java.util.concurrent.Executor;
import p140g0.C5896i2;
import p296n0.InterfaceC8775j2;

/* JADX INFO: renamed from: androidx.camera.core.f */
/* JADX INFO: loaded from: classes.dex */
public class C0496f implements InterfaceC8775j2 {

    /* JADX INFO: renamed from: d */
    public final InterfaceC8775j2 f1807d;

    /* JADX INFO: renamed from: e */
    public final Surface f1808e;

    /* JADX INFO: renamed from: f */
    public AbstractC0492b.a f1809f;

    /* JADX INFO: renamed from: a */
    public final Object f1804a = new Object();

    /* JADX INFO: renamed from: b */
    public int f1805b = 0;

    /* JADX INFO: renamed from: c */
    public boolean f1806c = false;

    /* JADX INFO: renamed from: g */
    public final AbstractC0492b.a f1810g = new AbstractC0492b.a() { // from class: g0.e2
        @Override // androidx.camera.core.AbstractC0492b.a
        /* JADX INFO: renamed from: a */
        public final void mo2197a(InterfaceC0494d interfaceC0494d) {
            C0496f.m2223h(this.f22416a, interfaceC0494d);
        }
    };

    public C0496f(InterfaceC8775j2 interfaceC8775j2) {
        this.f1807d = interfaceC8775j2;
        this.f1808e = interfaceC8775j2.getSurface();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m2222a(C0496f c0496f, InterfaceC8775j2.a aVar, InterfaceC8775j2 interfaceC8775j2) {
        c0496f.getClass();
        aVar.mo26326a(c0496f);
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m2223h(C0496f c0496f, InterfaceC0494d interfaceC0494d) {
        AbstractC0492b.a aVar;
        synchronized (c0496f.f1804a) {
            try {
                int i10 = c0496f.f1805b - 1;
                c0496f.f1805b = i10;
                if (c0496f.f1806c && i10 == 0) {
                    c0496f.close();
                }
                aVar = c0496f.f1809f;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (aVar != null) {
            aVar.mo2197a(interfaceC0494d);
        }
    }

    @Override // p296n0.InterfaceC8775j2
    /* JADX INFO: renamed from: b */
    public InterfaceC0494d mo2208b() {
        InterfaceC0494d interfaceC0494dM2227l;
        synchronized (this.f1804a) {
            interfaceC0494dM2227l = m2227l(this.f1807d.mo2208b());
        }
        return interfaceC0494dM2227l;
    }

    @Override // p296n0.InterfaceC8775j2
    /* JADX INFO: renamed from: c */
    public int mo2209c() {
        int iMo2209c;
        synchronized (this.f1804a) {
            iMo2209c = this.f1807d.mo2209c();
        }
        return iMo2209c;
    }

    @Override // p296n0.InterfaceC8775j2
    public void close() {
        synchronized (this.f1804a) {
            try {
                Surface surface = this.f1808e;
                if (surface != null) {
                    surface.release();
                }
                this.f1807d.close();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p296n0.InterfaceC8775j2
    /* JADX INFO: renamed from: d */
    public void mo2210d() {
        synchronized (this.f1804a) {
            this.f1807d.mo2210d();
        }
    }

    @Override // p296n0.InterfaceC8775j2
    /* JADX INFO: renamed from: e */
    public int mo2211e() {
        int iMo2211e;
        synchronized (this.f1804a) {
            iMo2211e = this.f1807d.mo2211e();
        }
        return iMo2211e;
    }

    @Override // p296n0.InterfaceC8775j2
    /* JADX INFO: renamed from: f */
    public void mo2212f(final InterfaceC8775j2.a aVar, Executor executor) {
        synchronized (this.f1804a) {
            this.f1807d.mo2212f(new InterfaceC8775j2.a() { // from class: g0.d2
                @Override // p296n0.InterfaceC8775j2.a
                /* JADX INFO: renamed from: a */
                public final void mo26326a(InterfaceC8775j2 interfaceC8775j2) {
                    C0496f.m2222a(this.f22402a, aVar, interfaceC8775j2);
                }
            }, executor);
        }
    }

    @Override // p296n0.InterfaceC8775j2
    /* JADX INFO: renamed from: g */
    public InterfaceC0494d mo2213g() {
        InterfaceC0494d interfaceC0494dM2227l;
        synchronized (this.f1804a) {
            interfaceC0494dM2227l = m2227l(this.f1807d.mo2213g());
        }
        return interfaceC0494dM2227l;
    }

    @Override // p296n0.InterfaceC8775j2
    public int getHeight() {
        int height;
        synchronized (this.f1804a) {
            height = this.f1807d.getHeight();
        }
        return height;
    }

    @Override // p296n0.InterfaceC8775j2
    public Surface getSurface() {
        Surface surface;
        synchronized (this.f1804a) {
            surface = this.f1807d.getSurface();
        }
        return surface;
    }

    @Override // p296n0.InterfaceC8775j2
    public int getWidth() {
        int width;
        synchronized (this.f1804a) {
            width = this.f1807d.getWidth();
        }
        return width;
    }

    /* JADX INFO: renamed from: i */
    public int m2224i() {
        int iMo2211e;
        synchronized (this.f1804a) {
            iMo2211e = this.f1807d.mo2211e() - this.f1805b;
        }
        return iMo2211e;
    }

    /* JADX INFO: renamed from: j */
    public void m2225j() {
        synchronized (this.f1804a) {
            try {
                this.f1806c = true;
                this.f1807d.mo2210d();
                if (this.f1805b == 0) {
                    close();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public void m2226k(AbstractC0492b.a aVar) {
        synchronized (this.f1804a) {
            this.f1809f = aVar;
        }
    }

    /* JADX INFO: renamed from: l */
    public final InterfaceC0494d m2227l(InterfaceC0494d interfaceC0494d) {
        if (interfaceC0494d == null) {
            return null;
        }
        this.f1805b++;
        C5896i2 c5896i2 = new C5896i2(interfaceC0494d);
        c5896i2.m2195a(this.f1810g);
        return c5896i2;
    }
}
