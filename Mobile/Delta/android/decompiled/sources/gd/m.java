package gd;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Deprecated
    public float f18115a;

    @Deprecated
    public float b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public float f18116c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    public float f18117d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated
    public float f18118e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Deprecated
    public float f18119f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List<f> f18120g = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List<g> f18121h = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f18122i;

    public class a extends g {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ List f18123c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Matrix f18124d;

        public a(List list, Matrix matrix) {
            this.f18123c = list;
            this.f18124d = matrix;
        }

        @Override // gd.m.g
        public void a(Matrix matrix, fd.a aVar, int i10, Canvas canvas) {
            Iterator it = this.f18123c.iterator();
            while (it.hasNext()) {
                ((g) it.next()).a(this.f18124d, aVar, i10, canvas);
            }
        }
    }

    public static class b extends g {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final d f18126c;

        public b(d dVar) {
            this.f18126c = dVar;
        }

        @Override // gd.m.g
        public void a(Matrix matrix, @NonNull fd.a aVar, int i10, @NonNull Canvas canvas) {
            aVar.a(canvas, matrix, new RectF(this.f18126c.k(), this.f18126c.o(), this.f18126c.l(), this.f18126c.j()), i10, this.f18126c.m(), this.f18126c.n());
        }
    }

    public static class c extends g {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final e f18127c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f18128d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final float f18129e;

        public c(e eVar, float f10, float f11) {
            this.f18127c = eVar;
            this.f18128d = f10;
            this.f18129e = f11;
        }

        @Override // gd.m.g
        public void a(Matrix matrix, @NonNull fd.a aVar, int i10, @NonNull Canvas canvas) {
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(this.f18127c.f18136c - this.f18129e, this.f18127c.b - this.f18128d), 0.0f);
            this.f18138a.set(matrix);
            this.f18138a.preTranslate(this.f18128d, this.f18129e);
            this.f18138a.preRotate(c());
            aVar.b(canvas, this.f18138a, rectF, i10);
        }

        public float c() {
            return (float) Math.toDegrees(Math.atan((this.f18127c.f18136c - this.f18129e) / (this.f18127c.b - this.f18128d)));
        }
    }

    public static class d extends f {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final RectF f18130h = new RectF();

        @Deprecated
        public float b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Deprecated
        public float f18131c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Deprecated
        public float f18132d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Deprecated
        public float f18133e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Deprecated
        public float f18134f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Deprecated
        public float f18135g;

        public d(float f10, float f11, float f12, float f13) {
            q(f10);
            u(f11);
            r(f12);
            p(f13);
        }

        @Override // gd.m.f
        public void a(@NonNull Matrix matrix, @NonNull Path path) {
            Matrix matrix2 = this.f18137a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = f18130h;
            rectF.set(k(), o(), l(), j());
            path.arcTo(rectF, m(), n(), false);
            path.transform(matrix);
        }

        public final float j() {
            return this.f18133e;
        }

        public final float k() {
            return this.b;
        }

        public final float l() {
            return this.f18132d;
        }

        public final float m() {
            return this.f18134f;
        }

        public final float n() {
            return this.f18135g;
        }

        public final float o() {
            return this.f18131c;
        }

        public final void p(float f10) {
            this.f18133e = f10;
        }

        public final void q(float f10) {
            this.b = f10;
        }

        public final void r(float f10) {
            this.f18132d = f10;
        }

        public final void s(float f10) {
            this.f18134f = f10;
        }

        public final void t(float f10) {
            this.f18135g = f10;
        }

        public final void u(float f10) {
            this.f18131c = f10;
        }
    }

    public static class e extends f {
        public float b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f18136c;

        @Override // gd.m.f
        public void a(@NonNull Matrix matrix, @NonNull Path path) {
            Matrix matrix2 = this.f18137a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.b, this.f18136c);
            path.transform(matrix);
        }
    }

    public static abstract class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Matrix f18137a = new Matrix();

        public abstract void a(Matrix matrix, Path path);
    }

    public static abstract class g {
        public static final Matrix b = new Matrix();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Matrix f18138a = new Matrix();

        public abstract void a(Matrix matrix, fd.a aVar, int i10, Canvas canvas);

        public final void b(fd.a aVar, int i10, Canvas canvas) {
            a(b, aVar, i10, canvas);
        }
    }

    public m() {
        n(0.0f, 0.0f);
    }

    public void a(float f10, float f11, float f12, float f13, float f14, float f15) {
        d dVar = new d(f10, f11, f12, f13);
        dVar.s(f14);
        dVar.t(f15);
        this.f18120g.add(dVar);
        b bVar = new b(dVar);
        float f16 = f14 + f15;
        boolean z10 = f15 < 0.0f;
        if (z10) {
            f14 = (f14 + 180.0f) % 360.0f;
        }
        c(bVar, f14, z10 ? (180.0f + f16) % 360.0f : f16);
        double d10 = f16;
        r(((f10 + f12) * 0.5f) + (((f12 - f10) / 2.0f) * ((float) Math.cos(Math.toRadians(d10)))));
        s(((f11 + f13) * 0.5f) + (((f13 - f11) / 2.0f) * ((float) Math.sin(Math.toRadians(d10)))));
    }

    public final void b(float f10) {
        if (g() == f10) {
            return;
        }
        float fG = ((f10 - g()) + 360.0f) % 360.0f;
        if (fG > 180.0f) {
            return;
        }
        d dVar = new d(i(), j(), i(), j());
        dVar.s(g());
        dVar.t(fG);
        this.f18121h.add(new b(dVar));
        p(f10);
    }

    public final void c(g gVar, float f10, float f11) {
        b(f10);
        this.f18121h.add(gVar);
        p(f11);
    }

    public void d(Matrix matrix, Path path) {
        int size = this.f18120g.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f18120g.get(i10).a(matrix, path);
        }
    }

    public boolean e() {
        return this.f18122i;
    }

    @NonNull
    public g f(Matrix matrix) {
        b(h());
        return new a(new ArrayList(this.f18121h), new Matrix(matrix));
    }

    public final float g() {
        return this.f18118e;
    }

    public final float h() {
        return this.f18119f;
    }

    public float i() {
        return this.f18116c;
    }

    public float j() {
        return this.f18117d;
    }

    public float k() {
        return this.f18115a;
    }

    public float l() {
        return this.b;
    }

    public void m(float f10, float f11) {
        e eVar = new e();
        eVar.b = f10;
        eVar.f18136c = f11;
        this.f18120g.add(eVar);
        c cVar = new c(eVar, i(), j());
        c(cVar, cVar.c() + 270.0f, cVar.c() + 270.0f);
        r(f10);
        s(f11);
    }

    public void n(float f10, float f11) {
        o(f10, f11, 270.0f, 0.0f);
    }

    public void o(float f10, float f11, float f12, float f13) {
        t(f10);
        u(f11);
        r(f10);
        s(f11);
        p(f12);
        q((f12 + f13) % 360.0f);
        this.f18120g.clear();
        this.f18121h.clear();
        this.f18122i = false;
    }

    public final void p(float f10) {
        this.f18118e = f10;
    }

    public final void q(float f10) {
        this.f18119f = f10;
    }

    public final void r(float f10) {
        this.f18116c = f10;
    }

    public final void s(float f10) {
        this.f18117d = f10;
    }

    public final void t(float f10) {
        this.f18115a = f10;
    }

    public final void u(float f10) {
        this.b = f10;
    }
}
