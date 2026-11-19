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
    public final Object f1177a;
    public u b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1178c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public j2.a f1179d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f1180e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final j2 f1181f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public j2.a f1182g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Executor f1183h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final LongSparseArray<i1> f1184i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final LongSparseArray<d> f1185j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f1186k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List<d> f1187l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List<d> f1188m;

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
        synchronized (eVar.f1177a) {
            eVar.f1178c++;
        }
        eVar.n(j2Var);
    }

    public static j2 j(int i10, int i11, int i12, int i13) {
        return new g0.c(ImageReader.newInstance(i10, i11, i12, i13));
    }

    @Override // androidx.camera.core.b.a
    public void a(d dVar) {
        synchronized (this.f1177a) {
            k(dVar);
        }
    }

    @Override // n0.j2
    public d b() {
        synchronized (this.f1177a) {
            try {
                if (this.f1187l.isEmpty()) {
                    return null;
                }
                if (this.f1186k >= this.f1187l.size()) {
                    throw new IllegalStateException("Maximum image number reached.");
                }
                ArrayList arrayList = new ArrayList();
                int i10 = 0;
                for (int i11 = 0; i11 < this.f1187l.size() - 1; i11++) {
                    if (!this.f1188m.contains(this.f1187l.get(i11))) {
                        arrayList.add(this.f1187l.get(i11));
                    }
                }
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((d) obj).close();
                }
                int size2 = this.f1187l.size();
                List<d> list = this.f1187l;
                this.f1186k = size2;
                d dVar = list.get(size2 - 1);
                this.f1188m.add(dVar);
                return dVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // n0.j2
    public int c() {
        int iC;
        synchronized (this.f1177a) {
            iC = this.f1181f.c();
        }
        return iC;
    }

    @Override // n0.j2
    public void close() {
        synchronized (this.f1177a) {
            try {
                if (this.f1180e) {
                    return;
                }
                ArrayList arrayList = new ArrayList(this.f1187l);
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((d) obj).close();
                }
                this.f1187l.clear();
                this.f1181f.close();
                this.f1180e = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // n0.j2
    public void d() {
        synchronized (this.f1177a) {
            this.f1181f.d();
            this.f1182g = null;
            this.f1183h = null;
            this.f1178c = 0;
        }
    }

    @Override // n0.j2
    public int e() {
        int iE;
        synchronized (this.f1177a) {
            iE = this.f1181f.e();
        }
        return iE;
    }

    @Override // n0.j2
    public void f(j2.a aVar, Executor executor) {
        synchronized (this.f1177a) {
            this.f1182g = (j2.a) g.g(aVar);
            this.f1183h = (Executor) g.g(executor);
            this.f1181f.f(this.f1179d, executor);
        }
    }

    @Override // n0.j2
    public d g() {
        synchronized (this.f1177a) {
            try {
                if (this.f1187l.isEmpty()) {
                    return null;
                }
                if (this.f1186k >= this.f1187l.size()) {
                    throw new IllegalStateException("Maximum image number reached.");
                }
                List<d> list = this.f1187l;
                int i10 = this.f1186k;
                this.f1186k = i10 + 1;
                d dVar = list.get(i10);
                this.f1188m.add(dVar);
                return dVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // n0.j2
    public int getHeight() {
        int height;
        synchronized (this.f1177a) {
            height = this.f1181f.getHeight();
        }
        return height;
    }

    @Override // n0.j2
    public Surface getSurface() {
        Surface surface;
        synchronized (this.f1177a) {
            surface = this.f1181f.getSurface();
        }
        return surface;
    }

    @Override // n0.j2
    public int getWidth() {
        int width;
        synchronized (this.f1177a) {
            width = this.f1181f.getWidth();
        }
        return width;
    }

    public final void k(d dVar) {
        synchronized (this.f1177a) {
            try {
                int iIndexOf = this.f1187l.indexOf(dVar);
                if (iIndexOf >= 0) {
                    this.f1187l.remove(iIndexOf);
                    int i10 = this.f1186k;
                    if (iIndexOf <= i10) {
                        this.f1186k = i10 - 1;
                    }
                }
                this.f1188m.remove(dVar);
                if (this.f1178c > 0) {
                    n(this.f1181f);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void l(h2 h2Var) {
        final j2.a aVar;
        Executor executor;
        synchronized (this.f1177a) {
            try {
                if (this.f1187l.size() < e()) {
                    h2Var.a(this);
                    this.f1187l.add(h2Var);
                    aVar = this.f1182g;
                    executor = this.f1183h;
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
                        androidx.camera.core.e.h(this.f16912a, aVar);
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
        synchronized (this.f1177a) {
            try {
                if (this.f1180e) {
                    return;
                }
                int size = this.f1185j.size() + this.f1187l.size();
                if (size >= j2Var.e()) {
                    r1.a("MetadataImageReader", "Skip to acquire the next image because the acquired image count has reached the max images count.");
                    return;
                }
                do {
                    try {
                        dVarG = j2Var.g();
                        if (dVarG != null) {
                            this.f1178c--;
                            size++;
                            this.f1185j.put(dVarG.L2().getTimestamp(), dVarG);
                            o();
                        }
                    } catch (IllegalStateException e10) {
                        r1.b("MetadataImageReader", "Failed to acquire next image.", e10);
                        dVarG = null;
                    }
                    if (dVarG == null || this.f1178c <= 0) {
                        break;
                    }
                } while (size < j2Var.e());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void o() {
        synchronized (this.f1177a) {
            try {
                for (int size = this.f1184i.size() - 1; size >= 0; size--) {
                    i1 i1VarValueAt = this.f1184i.valueAt(size);
                    long timestamp = i1VarValueAt.getTimestamp();
                    d dVar = this.f1185j.get(timestamp);
                    if (dVar != null) {
                        this.f1185j.remove(timestamp);
                        this.f1184i.removeAt(size);
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
        synchronized (this.f1177a) {
            try {
                if (this.f1185j.size() != 0 && this.f1184i.size() != 0) {
                    long jKeyAt = this.f1185j.keyAt(0);
                    Long lValueOf = Long.valueOf(jKeyAt);
                    long jKeyAt2 = this.f1184i.keyAt(0);
                    g.a(!Long.valueOf(jKeyAt2).equals(lValueOf));
                    if (jKeyAt2 > jKeyAt) {
                        for (int size = this.f1185j.size() - 1; size >= 0; size--) {
                            if (this.f1185j.keyAt(size) < jKeyAt2) {
                                this.f1185j.valueAt(size).close();
                                this.f1185j.removeAt(size);
                            }
                        }
                    } else {
                        for (int size2 = this.f1184i.size() - 1; size2 >= 0; size2--) {
                            if (this.f1184i.keyAt(size2) < jKeyAt) {
                                this.f1184i.removeAt(size2);
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
        synchronized (this.f1177a) {
            try {
                if (this.f1180e) {
                    return;
                }
                this.f1184i.put(e0Var.getTimestamp(), new s0.c(e0Var));
                o();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public e(j2 j2Var) {
        this.f1177a = new Object();
        this.b = new a();
        this.f1178c = 0;
        this.f1179d = new j2.a() { // from class: g0.s1
            @Override // n0.j2.a
            public final void a(n0.j2 j2Var2) {
                androidx.camera.core.e.i(this.f16909a, j2Var2);
            }
        };
        this.f1180e = false;
        this.f1184i = new LongSparseArray<>();
        this.f1185j = new LongSparseArray<>();
        this.f1188m = new ArrayList();
        this.f1181f = j2Var;
        this.f1186k = 0;
        this.f1187l = new ArrayList(e());
    }
}
