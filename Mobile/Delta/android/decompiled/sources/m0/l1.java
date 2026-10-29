package m0;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import com.google.mlkit.vision.barcode.common.Barcode;
import g0.r1;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public abstract class l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f23619a = new v0.a().a();
    public final Map<Integer, Boolean> b = new HashMap();

    public interface a {
        void f(l1 l1Var);
    }

    public static /* synthetic */ void a(l1 l1Var, g0.h1 h1Var) {
        l1Var.j();
        if (!(l1Var.l() != null)) {
            throw new IllegalStateException("One and only one callback is allowed.");
        }
        g0.f1.g gVarL = l1Var.l();
        Objects.requireNonNull(gVarL);
        gVarL.e(h1Var);
    }

    public static /* synthetic */ void b(l1 l1Var, g0.f1.i iVar) {
        g0.f1.g gVarL = l1Var.l();
        Objects.requireNonNull(gVarL);
        Objects.requireNonNull(iVar);
        gVarL.d(iVar);
    }

    public static /* synthetic */ void c(l1 l1Var, androidx.camera.core.d dVar) {
        g0.f1.f fVarJ = l1Var.j();
        Objects.requireNonNull(fVarJ);
        Objects.requireNonNull(dVar);
        fVarJ.c(dVar);
    }

    public static /* synthetic */ void d(l1 l1Var, Bitmap bitmap) {
        if (l1Var.l() != null) {
            l1Var.l().b(bitmap);
        } else {
            l1Var.j();
        }
    }

    public static /* synthetic */ void e(l1 l1Var, int i10) {
        if (l1Var.l() != null) {
            l1Var.l().a(i10);
        } else {
            l1Var.j();
        }
    }

    public static l1 v(Executor executor, g0.f1.f fVar, g0.f1.g gVar, g0.f1.h hVar, g0.f1.h hVar2, Rect rect, Matrix matrix, int i10, int i11, int i12, boolean z10, List<n0.u> list) {
        x2.g.b((gVar == null) == (hVar == null), "onDiskCallback and outputFileOptions should be both null or both non-null.");
        x2.g.b(!(gVar == null), "One and only one on-disk or in-memory callback should be present.");
        j jVar = new j(executor, fVar, gVar, hVar, hVar2, rect, matrix, i10, i11, i12, z10, list);
        if (z10) {
            jVar.r();
        }
        return jVar;
    }

    public void A(final g0.f1.i iVar) {
        g().execute(new Runnable() { // from class: m0.j1
            @Override // java.lang.Runnable
            public final void run() {
                l1.b(this.f23616a, iVar);
            }
        });
    }

    public boolean f() {
        p0.z.b();
        int i10 = this.f23619a;
        if (i10 <= 0) {
            return false;
        }
        this.f23619a = i10 - 1;
        return true;
    }

    public abstract Executor g();

    public abstract int h();

    public abstract Rect i();

    public abstract g0.f1.f j();

    public abstract int k();

    public abstract g0.f1.g l();

    public abstract g0.f1.h m();

    public abstract int n();

    public abstract g0.f1.h o();

    public abstract Matrix p();

    public abstract List<n0.u> q();

    public void r() {
        Map<Integer, Boolean> map = this.b;
        Boolean bool = Boolean.FALSE;
        map.put(32, bool);
        this.b.put(Integer.valueOf(Barcode.FORMAT_QR_CODE), bool);
    }

    public boolean s() {
        Iterator<Map.Entry<Integer, Boolean>> it = this.b.entrySet().iterator();
        while (it.hasNext()) {
            if (!it.next().getValue().booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public abstract boolean t();

    public void u(int i10, boolean z10) {
        if (this.b.containsKey(Integer.valueOf(i10))) {
            this.b.put(Integer.valueOf(i10), Boolean.valueOf(z10));
        } else {
            r1.c("TakePictureRequest", "The format is not supported in simultaneous capture");
        }
    }

    public void w(final int i10) {
        g().execute(new Runnable() { // from class: m0.k1
            @Override // java.lang.Runnable
            public final void run() {
                l1.e(this.f23617a, i10);
            }
        });
    }

    public void x(final g0.h1 h1Var) {
        g().execute(new Runnable() { // from class: m0.g1
            @Override // java.lang.Runnable
            public final void run() {
                l1.a(this.f23597a, h1Var);
            }
        });
    }

    public void y(final Bitmap bitmap) {
        g().execute(new Runnable() { // from class: m0.i1
            @Override // java.lang.Runnable
            public final void run() {
                l1.d(this.f23602a, bitmap);
            }
        });
    }

    public void z(final androidx.camera.core.d dVar) {
        g().execute(new Runnable() { // from class: m0.h1
            @Override // java.lang.Runnable
            public final void run() {
                l1.c(this.f23599a, dVar);
            }
        });
    }
}
