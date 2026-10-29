package androidx.camera.core;

import android.media.ImageReader;
import android.util.LongSparseArray;
import android.view.Surface;
import androidx.camera.core.C0495e;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import p140g0.C5869c;
import p140g0.C5892h2;
import p140g0.C5931r1;
import p140g0.InterfaceC5895i1;
import p296n0.AbstractC8828u;
import p296n0.InterfaceC8743e0;
import p296n0.InterfaceC8775j2;
import p424s0.C11142c;
import p533x2.C12637g;

/* JADX INFO: renamed from: androidx.camera.core.e */
/* JADX INFO: loaded from: classes.dex */
public class C0495e implements InterfaceC8775j2, AbstractC0492b.a {

    /* JADX INFO: renamed from: a */
    public final Object f1790a;

    /* JADX INFO: renamed from: b */
    public AbstractC8828u f1791b;

    /* JADX INFO: renamed from: c */
    public int f1792c;

    /* JADX INFO: renamed from: d */
    public InterfaceC8775j2.a f1793d;

    /* JADX INFO: renamed from: e */
    public boolean f1794e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC8775j2 f1795f;

    /* JADX INFO: renamed from: g */
    public InterfaceC8775j2.a f1796g;

    /* JADX INFO: renamed from: h */
    public Executor f1797h;

    /* JADX INFO: renamed from: i */
    public final LongSparseArray<InterfaceC5895i1> f1798i;

    /* JADX INFO: renamed from: j */
    public final LongSparseArray<InterfaceC0494d> f1799j;

    /* JADX INFO: renamed from: k */
    public int f1800k;

    /* JADX INFO: renamed from: l */
    public final List<InterfaceC0494d> f1801l;

    /* JADX INFO: renamed from: m */
    public final List<InterfaceC0494d> f1802m;

    /* JADX INFO: renamed from: androidx.camera.core.e$a */
    public class a extends AbstractC8828u {
        public a() {
        }

        @Override // p296n0.AbstractC8828u
        /* JADX INFO: renamed from: b */
        public void mo2221b(int i10, InterfaceC8743e0 interfaceC8743e0) {
            super.mo2221b(i10, interfaceC8743e0);
            C0495e.this.m2220q(interfaceC8743e0);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0495e(int i10, int i11, int i12, int i13) {
        this(m2207j(i10, i11, i12, i13));
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m2205h(C0495e c0495e, InterfaceC8775j2.a aVar) {
        c0495e.getClass();
        aVar.mo26326a(c0495e);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m2206i(C0495e c0495e, InterfaceC8775j2 interfaceC8775j2) {
        synchronized (c0495e.f1790a) {
            c0495e.f1792c++;
        }
        c0495e.m2217n(interfaceC8775j2);
    }

    /* JADX INFO: renamed from: j */
    public static InterfaceC8775j2 m2207j(int i10, int i11, int i12, int i13) {
        return new C5869c(ImageReader.newInstance(i10, i11, i12, i13));
    }

    @Override // androidx.camera.core.AbstractC0492b.a
    /* JADX INFO: renamed from: a */
    public void mo2197a(InterfaceC0494d interfaceC0494d) {
        synchronized (this.f1790a) {
            m2214k(interfaceC0494d);
        }
    }

    @Override // p296n0.InterfaceC8775j2
    /* JADX INFO: renamed from: b */
    public InterfaceC0494d mo2208b() {
        synchronized (this.f1790a) {
            try {
                if (this.f1801l.isEmpty()) {
                    return null;
                }
                if (this.f1800k >= this.f1801l.size()) {
                    throw new IllegalStateException("Maximum image number reached.");
                }
                ArrayList arrayList = new ArrayList();
                int i10 = 0;
                for (int i11 = 0; i11 < this.f1801l.size() - 1; i11++) {
                    if (!this.f1802m.contains(this.f1801l.get(i11))) {
                        arrayList.add(this.f1801l.get(i11));
                    }
                }
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((InterfaceC0494d) obj).close();
                }
                int size2 = this.f1801l.size();
                List<InterfaceC0494d> list = this.f1801l;
                this.f1800k = size2;
                InterfaceC0494d interfaceC0494d = list.get(size2 - 1);
                this.f1802m.add(interfaceC0494d);
                return interfaceC0494d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p296n0.InterfaceC8775j2
    /* JADX INFO: renamed from: c */
    public int mo2209c() {
        int iMo2209c;
        synchronized (this.f1790a) {
            iMo2209c = this.f1795f.mo2209c();
        }
        return iMo2209c;
    }

    @Override // p296n0.InterfaceC8775j2
    public void close() {
        synchronized (this.f1790a) {
            try {
                if (this.f1794e) {
                    return;
                }
                ArrayList arrayList = new ArrayList(this.f1801l);
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((InterfaceC0494d) obj).close();
                }
                this.f1801l.clear();
                this.f1795f.close();
                this.f1794e = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p296n0.InterfaceC8775j2
    /* JADX INFO: renamed from: d */
    public void mo2210d() {
        synchronized (this.f1790a) {
            this.f1795f.mo2210d();
            this.f1796g = null;
            this.f1797h = null;
            this.f1792c = 0;
        }
    }

    @Override // p296n0.InterfaceC8775j2
    /* JADX INFO: renamed from: e */
    public int mo2211e() {
        int iMo2211e;
        synchronized (this.f1790a) {
            iMo2211e = this.f1795f.mo2211e();
        }
        return iMo2211e;
    }

    @Override // p296n0.InterfaceC8775j2
    /* JADX INFO: renamed from: f */
    public void mo2212f(InterfaceC8775j2.a aVar, Executor executor) {
        synchronized (this.f1790a) {
            this.f1796g = (InterfaceC8775j2.a) C12637g.m47075g(aVar);
            this.f1797h = (Executor) C12637g.m47075g(executor);
            this.f1795f.mo2212f(this.f1793d, executor);
        }
    }

    @Override // p296n0.InterfaceC8775j2
    /* JADX INFO: renamed from: g */
    public InterfaceC0494d mo2213g() {
        synchronized (this.f1790a) {
            try {
                if (this.f1801l.isEmpty()) {
                    return null;
                }
                if (this.f1800k >= this.f1801l.size()) {
                    throw new IllegalStateException("Maximum image number reached.");
                }
                List<InterfaceC0494d> list = this.f1801l;
                int i10 = this.f1800k;
                this.f1800k = i10 + 1;
                InterfaceC0494d interfaceC0494d = list.get(i10);
                this.f1802m.add(interfaceC0494d);
                return interfaceC0494d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p296n0.InterfaceC8775j2
    public int getHeight() {
        int height;
        synchronized (this.f1790a) {
            height = this.f1795f.getHeight();
        }
        return height;
    }

    @Override // p296n0.InterfaceC8775j2
    public Surface getSurface() {
        Surface surface;
        synchronized (this.f1790a) {
            surface = this.f1795f.getSurface();
        }
        return surface;
    }

    @Override // p296n0.InterfaceC8775j2
    public int getWidth() {
        int width;
        synchronized (this.f1790a) {
            width = this.f1795f.getWidth();
        }
        return width;
    }

    /* JADX INFO: renamed from: k */
    public final void m2214k(InterfaceC0494d interfaceC0494d) {
        synchronized (this.f1790a) {
            try {
                int iIndexOf = this.f1801l.indexOf(interfaceC0494d);
                if (iIndexOf >= 0) {
                    this.f1801l.remove(iIndexOf);
                    int i10 = this.f1800k;
                    if (iIndexOf <= i10) {
                        this.f1800k = i10 - 1;
                    }
                }
                this.f1802m.remove(interfaceC0494d);
                if (this.f1792c > 0) {
                    m2217n(this.f1795f);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m2215l(C5892h2 c5892h2) {
        final InterfaceC8775j2.a aVar;
        Executor executor;
        synchronized (this.f1790a) {
            try {
                if (this.f1801l.size() < mo2211e()) {
                    c5892h2.m2195a(this);
                    this.f1801l.add(c5892h2);
                    aVar = this.f1796g;
                    executor = this.f1797h;
                } else {
                    C5931r1.m26561a("TAG", "Maximum image number reached.");
                    c5892h2.close();
                    aVar = null;
                    executor = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (aVar != null) {
            if (executor != null) {
                executor.execute(new Runnable() { // from class: g0.t1
                    @Override // java.lang.Runnable
                    public final void run() {
                        C0495e.m2205h(this.f22611a, aVar);
                    }
                });
            } else {
                aVar.mo26326a(this);
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public AbstractC8828u m2216m() {
        return this.f1791b;
    }

    /* JADX INFO: renamed from: n */
    public void m2217n(InterfaceC8775j2 interfaceC8775j2) {
        InterfaceC0494d interfaceC0494dMo2213g;
        synchronized (this.f1790a) {
            try {
                if (this.f1794e) {
                    return;
                }
                int size = this.f1799j.size() + this.f1801l.size();
                if (size >= interfaceC8775j2.mo2211e()) {
                    C5931r1.m26561a("MetadataImageReader", "Skip to acquire the next image because the acquired image count has reached the max images count.");
                    return;
                }
                do {
                    try {
                        interfaceC0494dMo2213g = interfaceC8775j2.mo2213g();
                        if (interfaceC0494dMo2213g != null) {
                            this.f1792c--;
                            size++;
                            this.f1799j.put(interfaceC0494dMo2213g.mo2192H2().getTimestamp(), interfaceC0494dMo2213g);
                            m2218o();
                        }
                    } catch (IllegalStateException e10) {
                        C5931r1.m26562b("MetadataImageReader", "Failed to acquire next image.", e10);
                        interfaceC0494dMo2213g = null;
                    }
                    if (interfaceC0494dMo2213g == null || this.f1792c <= 0) {
                        break;
                    }
                } while (size < interfaceC8775j2.mo2211e());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m2218o() {
        synchronized (this.f1790a) {
            try {
                for (int size = this.f1798i.size() - 1; size >= 0; size--) {
                    InterfaceC5895i1 interfaceC5895i1ValueAt = this.f1798i.valueAt(size);
                    long timestamp = interfaceC5895i1ValueAt.getTimestamp();
                    InterfaceC0494d interfaceC0494d = this.f1799j.get(timestamp);
                    if (interfaceC0494d != null) {
                        this.f1799j.remove(timestamp);
                        this.f1798i.removeAt(size);
                        m2215l(new C5892h2(interfaceC0494d, interfaceC5895i1ValueAt));
                    }
                }
                m2219p();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m2219p() {
        synchronized (this.f1790a) {
            try {
                if (this.f1799j.size() != 0 && this.f1798i.size() != 0) {
                    long jKeyAt = this.f1799j.keyAt(0);
                    Long lValueOf = Long.valueOf(jKeyAt);
                    long jKeyAt2 = this.f1798i.keyAt(0);
                    C12637g.m47069a(!Long.valueOf(jKeyAt2).equals(lValueOf));
                    if (jKeyAt2 > jKeyAt) {
                        for (int size = this.f1799j.size() - 1; size >= 0; size--) {
                            if (this.f1799j.keyAt(size) < jKeyAt2) {
                                this.f1799j.valueAt(size).close();
                                this.f1799j.removeAt(size);
                            }
                        }
                    } else {
                        for (int size2 = this.f1798i.size() - 1; size2 >= 0; size2--) {
                            if (this.f1798i.keyAt(size2) < jKeyAt) {
                                this.f1798i.removeAt(size2);
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public void m2220q(InterfaceC8743e0 interfaceC8743e0) {
        synchronized (this.f1790a) {
            try {
                if (this.f1794e) {
                    return;
                }
                this.f1798i.put(interfaceC8743e0.getTimestamp(), new C11142c(interfaceC8743e0));
                m2218o();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C0495e(InterfaceC8775j2 interfaceC8775j2) {
        this.f1790a = new Object();
        this.f1791b = new a();
        this.f1792c = 0;
        this.f1793d = new InterfaceC8775j2.a() { // from class: g0.s1
            @Override // p296n0.InterfaceC8775j2.a
            /* JADX INFO: renamed from: a */
            public final void mo26326a(InterfaceC8775j2 interfaceC8775j3) {
                C0495e.m2206i(this.f22607a, interfaceC8775j3);
            }
        };
        this.f1794e = false;
        this.f1798i = new LongSparseArray<>();
        this.f1799j = new LongSparseArray<>();
        this.f1802m = new ArrayList();
        this.f1795f = interfaceC8775j2;
        this.f1800k = 0;
        this.f1801l = new ArrayList(mo2211e());
    }
}
