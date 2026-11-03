package androidx.camera.core;

import android.media.ImageReader;
import android.util.LongSparseArray;
import android.view.Surface;
import g0.h2;
import g0.i1;
import g0.r1;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import n0.e0;
import n0.j2;
import n0.u;
import x2.g;

/* JADX INFO: loaded from: classes.dex */
public class e implements j2, b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f1215a;
    public u b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1216c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public j2.a f1217d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f1218e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final j2 f1219f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public j2.a f1220g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Executor f1221h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final LongSparseArray<i1> f1222i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final LongSparseArray<d> f1223j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f1224k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List<d> f1225l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List<d> f1226m;

    public class a extends u {
        public a() {
        }

        @Override // n0.u
        public void b(int i10, e0 e0Var) {
            super.b(i10, e0Var);
            e.this.q(e0Var);
        }
    }

    public e(int i10, int i11, int i12, int i13) {
        this(j(i10, i11, i12, i13));
    }

    public static /* synthetic */ void h(e eVar, j2.a aVar) {
        eVar.getClass();
        aVar.a(eVar);
    }

    public static /* synthetic */ void i(e eVar, j2 j2Var) {
        synchronized (eVar.f1215a) {
            eVar.f1216c++;
        }
        eVar.n(j2Var);
    }

    public static j2 j(int i10, int i11, int i12, int i13) {
        return new g0.c(ImageReader.newInstance(i10, i11, i12, i13));
    }

    @Override // androidx.camera.core.b.a
    public void a(d dVar) {
        synchronized (this.f1215a) {
            k(dVar);
        }
    }

    @Override // n0.j2
    public d b() {
        synchronized (this.f1215a) {
            try {
                if (this.f1225l.isEmpty()) {
                    return null;
                }
                if (this.f1224k >= this.f1225l.size()) {
                    throw new IllegalStateException("Maximum image number reached.");
                }
                ArrayList arrayList = new ArrayList();
                int i10 = 0;
                for (int i11 = 0; i11 < this.f1225l.size() - 1; i11++) {
                    if (!this.f1226m.contains(this.f1225l.get(i11))) {
                        arrayList.add(this.f1225l.get(i11));
                    }
                }
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((d) obj).close();
                }
                int size2 = this.f1225l.size();
                List<d> list = this.f1225l;
                this.f1224k = size2;
                d dVar = list.get(size2 - 1);
                this.f1226m.add(dVar);
                return dVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // n0.j2
    public int c() {
        int iC;
        synchronized (this.f1215a) {
            iC = this.f1219f.c();
        }
        return iC;
    }

    @Override // n0.j2
    public void close() {
        synchronized (this.f1215a) {
            try {
                if (this.f1218e) {
                    return;
                }
                ArrayList arrayList = new ArrayList(this.f1225l);
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((d) obj).close();
                }
                this.f1225l.clear();
                this.f1219f.close();
                this.f1218e = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // n0.j2
    public void d() {
        synchronized (this.f1215a) {
            this.f1219f.d();
            this.f1220g = null;
            this.f1221h = null;
            this.f1216c = 0;
        }
    }

    @Override // n0.j2
    public int e() {
        int iE;
        synchronized (this.f1215a) {
            iE = this.f1219f.e();
        }
        return iE;
    }

    @Override // n0.j2
    public void f(j2.a aVar, Executor executor) {
        synchronized (this.f1215a) {
            this.f1220g = (j2.a) g.g(aVar);
            this.f1221h = (Executor) g.g(executor);
            this.f1219f.f(this.f1217d, executor);
        }
    }

    @Override // n0.j2
    public d g() {
        synchronized (this.f1215a) {
            try {
                if (this.f1225l.isEmpty()) {
                    return null;
                }
                if (this.f1224k >= this.f1225l.size()) {
                    throw new IllegalStateException("Maximum image number reached.");
                }
                List<d> list = this.f1225l;
                int i10 = this.f1224k;
                this.f1224k = i10 + 1;
                d dVar = list.get(i10);
                this.f1226m.add(dVar);
                return dVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // n0.j2
    public int getHeight() {
        int height;
        synchronized (this.f1215a) {
            height = this.f1219f.getHeight();
        }
        return height;
    }

    @Override // n0.j2
    public Surface getSurface() {
        Surface surface;
        synchronized (this.f1215a) {
            surface = this.f1219f.getSurface();
        }
        return surface;
    }

    @Override // n0.j2
    public int getWidth() {
        int width;
        synchronized (this.f1215a) {
            width = this.f1219f.getWidth();
        }
        return width;
    }

    public final void k(d dVar) {
        synchronized (this.f1215a) {
            try {
                int iIndexOf = this.f1225l.indexOf(dVar);
                if (iIndexOf >= 0) {
                    this.f1225l.remove(iIndexOf);
                    int i10 = this.f1224k;
                    if (iIndexOf <= i10) {
                        this.f1224k = i10 - 1;
                    }
                }
                this.f1226m.remove(dVar);
                if (this.f1216c > 0) {
                    n(this.f1219f);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void l(h2 h2Var) {
        final j2.a aVar;
        Executor executor;
        synchronized (this.f1215a) {
            try {
                if (this.f1225l.size() < e()) {
                    h2Var.a(this);
                    this.f1225l.add(h2Var);
                    aVar = this.f1220g;
                    executor = this.f1221h;
                } else {
                    r1.a("TAG", "Maximum image number reached.");
                    h2Var.close();
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
                        androidx.camera.core.e.h(this.f18054a, aVar);
                    }
                });
            } else {
                aVar.a(this);
            }
        }
    }

    public u m() {
        return this.b;
    }

    public void n(j2 j2Var) {
        d dVarG;
        synchronized (this.f1215a) {
            try {
                if (this.f1218e) {
                    return;
                }
                int size = this.f1223j.size() + this.f1225l.size();
                if (size >= j2Var.e()) {
                    r1.a("MetadataImageReader", "Skip to acquire the next image because the acquired image count has reached the max images count.");
                    return;
                }
                do {
                    try {
                        dVarG = j2Var.g();
                        if (dVarG != null) {
                            this.f1216c--;
                            size++;
                            this.f1223j.put(dVarG.I2().getTimestamp(), dVarG);
                            o();
                        }
                    } catch (IllegalStateException e10) {
                        r1.b("MetadataImageReader", "Failed to acquire next image.", e10);
                        dVarG = null;
                    }
                    if (dVarG == null || this.f1216c <= 0) {
                        break;
                    }
                } while (size < j2Var.e());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void o() {
        synchronized (this.f1215a) {
            try {
                for (int size = this.f1222i.size() - 1; size >= 0; size--) {
                    i1 i1VarValueAt = this.f1222i.valueAt(size);
                    long timestamp = i1VarValueAt.getTimestamp();
                    d dVar = this.f1223j.get(timestamp);
                    if (dVar != null) {
                        this.f1223j.remove(timestamp);
                        this.f1222i.removeAt(size);
                        l(new h2(dVar, i1VarValueAt));
                    }
                }
                p();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void p() {
        synchronized (this.f1215a) {
            try {
                if (this.f1223j.size() != 0 && this.f1222i.size() != 0) {
                    long jKeyAt = this.f1223j.keyAt(0);
                    Long lValueOf = Long.valueOf(jKeyAt);
                    long jKeyAt2 = this.f1222i.keyAt(0);
                    g.a(!Long.valueOf(jKeyAt2).equals(lValueOf));
                    if (jKeyAt2 > jKeyAt) {
                        for (int size = this.f1223j.size() - 1; size >= 0; size--) {
                            if (this.f1223j.keyAt(size) < jKeyAt2) {
                                this.f1223j.valueAt(size).close();
                                this.f1223j.removeAt(size);
                            }
                        }
                    } else {
                        for (int size2 = this.f1222i.size() - 1; size2 >= 0; size2--) {
                            if (this.f1222i.keyAt(size2) < jKeyAt) {
                                this.f1222i.removeAt(size2);
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void q(e0 e0Var) {
        synchronized (this.f1215a) {
            try {
                if (this.f1218e) {
                    return;
                }
                this.f1222i.put(e0Var.getTimestamp(), new s0.c(e0Var));
                o();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public e(j2 j2Var) {
        this.f1215a = new Object();
        this.b = new a();
        this.f1216c = 0;
        this.f1217d = new j2.a() { // from class: g0.s1
            @Override // n0.j2.a
            public final void a(n0.j2 j2Var2) {
                androidx.camera.core.e.i(this.f18051a, j2Var2);
            }
        };
        this.f1218e = false;
        this.f1222i = new LongSparseArray<>();
        this.f1223j = new LongSparseArray<>();
        this.f1226m = new ArrayList();
        this.f1219f = j2Var;
        this.f1224k = 0;
        this.f1225l = new ArrayList(e());
    }
}
