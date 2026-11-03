package androidx.camera.core;

import android.view.Surface;
import g0.i2;
import java.util.concurrent.Executor;
import n0.j2;

/* JADX INFO: loaded from: classes.dex */
public class f implements j2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j2 f1230d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Surface f1231e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public b.a f1232f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f1228a = new Object();
    public int b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f1229c = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b.a f1233g = new b.a() { // from class: g0.e2
        @Override // androidx.camera.core.b.a
        public final void a(androidx.camera.core.d dVar) {
            androidx.camera.core.f.h(this.f17910a, dVar);
        }
    };

    public f(j2 j2Var) {
        this.f1230d = j2Var;
        this.f1231e = j2Var.getSurface();
    }

    public static /* synthetic */ void a(f fVar, j2.a aVar, j2 j2Var) {
        fVar.getClass();
        aVar.a(fVar);
    }

    public static /* synthetic */ void h(f fVar, d dVar) {
        b.a aVar;
        synchronized (fVar.f1228a) {
            try {
                int i10 = fVar.b - 1;
                fVar.b = i10;
                if (fVar.f1229c && i10 == 0) {
                    fVar.close();
                }
                aVar = fVar.f1232f;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (aVar != null) {
            aVar.a(dVar);
        }
    }

    @Override // n0.j2
    public d b() {
        d dVarL;
        synchronized (this.f1228a) {
            dVarL = l(this.f1230d.b());
        }
        return dVarL;
    }

    @Override // n0.j2
    public int c() {
        int iC;
        synchronized (this.f1228a) {
            iC = this.f1230d.c();
        }
        return iC;
    }

    @Override // n0.j2
    public void close() {
        synchronized (this.f1228a) {
            try {
                Surface surface = this.f1231e;
                if (surface != null) {
                    surface.release();
                }
                this.f1230d.close();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // n0.j2
    public void d() {
        synchronized (this.f1228a) {
            this.f1230d.d();
        }
    }

    @Override // n0.j2
    public int e() {
        int iE;
        synchronized (this.f1228a) {
            iE = this.f1230d.e();
        }
        return iE;
    }

    @Override // n0.j2
    public void f(final j2.a aVar, Executor executor) {
        synchronized (this.f1228a) {
            this.f1230d.f(new j2.a() { // from class: g0.d2
                @Override // n0.j2.a
                public final void a(n0.j2 j2Var) {
                    androidx.camera.core.f.a(this.f17900a, aVar, j2Var);
                }
            }, executor);
        }
    }

    @Override // n0.j2
    public d g() {
        d dVarL;
        synchronized (this.f1228a) {
            dVarL = l(this.f1230d.g());
        }
        return dVarL;
    }

    @Override // n0.j2
    public int getHeight() {
        int height;
        synchronized (this.f1228a) {
            height = this.f1230d.getHeight();
        }
        return height;
    }

    @Override // n0.j2
    public Surface getSurface() {
        Surface surface;
        synchronized (this.f1228a) {
            surface = this.f1230d.getSurface();
        }
        return surface;
    }

    @Override // n0.j2
    public int getWidth() {
        int width;
        synchronized (this.f1228a) {
            width = this.f1230d.getWidth();
        }
        return width;
    }

    public int i() {
        int iE;
        synchronized (this.f1228a) {
            iE = this.f1230d.e() - this.b;
        }
        return iE;
    }

    public void j() {
        synchronized (this.f1228a) {
            try {
                this.f1229c = true;
                this.f1230d.d();
                if (this.b == 0) {
                    close();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void k(b.a aVar) {
        synchronized (this.f1228a) {
            this.f1232f = aVar;
        }
    }

    public final d l(d dVar) {
        if (dVar == null) {
            return null;
        }
        this.b++;
        i2 i2Var = new i2(dVar);
        i2Var.a(this.f1233g);
        return i2Var;
    }
}
