package androidx.camera.core;

import android.graphics.Rect;
import android.media.Image;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import p140g0.InterfaceC5895i1;

/* JADX INFO: renamed from: androidx.camera.core.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0492b implements InterfaceC0494d {

    /* JADX INFO: renamed from: b */
    public final InterfaceC0494d f1781b;

    /* JADX INFO: renamed from: a */
    public final Object f1780a = new Object();

    /* JADX INFO: renamed from: c */
    public final Set<a> f1782c = new HashSet();

    /* JADX INFO: renamed from: androidx.camera.core.b$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo2197a(InterfaceC0494d interfaceC0494d);
    }

    public AbstractC0492b(InterfaceC0494d interfaceC0494d) {
        this.f1781b = interfaceC0494d;
    }

    @Override // androidx.camera.core.InterfaceC0494d
    /* JADX INFO: renamed from: H1 */
    public InterfaceC0494d.a[] mo2186H1() {
        return this.f1781b.mo2186H1();
    }

    @Override // androidx.camera.core.InterfaceC0494d
    /* JADX INFO: renamed from: H2 */
    public InterfaceC5895i1 mo2192H2() {
        return this.f1781b.mo2192H2();
    }

    @Override // androidx.camera.core.InterfaceC0494d
    /* JADX INFO: renamed from: M0 */
    public void mo2193M0(Rect rect) {
        this.f1781b.mo2193M0(rect);
    }

    /* JADX INFO: renamed from: a */
    public void m2195a(a aVar) {
        synchronized (this.f1780a) {
            this.f1782c.add(aVar);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m2196b() {
        HashSet hashSet;
        synchronized (this.f1780a) {
            hashSet = new HashSet(this.f1782c);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((a) it.next()).mo2197a(this);
        }
    }

    @Override // androidx.camera.core.InterfaceC0494d, java.lang.AutoCloseable
    public void close() {
        this.f1781b.close();
        m2196b();
    }

    @Override // androidx.camera.core.InterfaceC0494d
    public int getFormat() {
        return this.f1781b.getFormat();
    }

    @Override // androidx.camera.core.InterfaceC0494d
    public int getHeight() {
        return this.f1781b.getHeight();
    }

    @Override // androidx.camera.core.InterfaceC0494d
    public int getWidth() {
        return this.f1781b.getWidth();
    }

    @Override // androidx.camera.core.InterfaceC0494d
    /* JADX INFO: renamed from: p */
    public Image mo2194p() {
        return this.f1781b.mo2194p();
    }
}
