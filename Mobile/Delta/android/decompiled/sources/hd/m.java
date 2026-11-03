package hd;

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
    public float f19369a;

    @Deprecated
    public float b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public float f19370c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    public float f19371d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated
    public float f19372e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Deprecated
    public float f19373f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List<f> f19374g = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List<g> f19375h = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f19376i;

    public class a extends g {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ List f19377c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Matrix f19378d;

        public a(List list, Matrix matrix) {
            this.f19377c = list;
            this.f19378d = matrix;
        }

        @Override // hd.m.g
        public void a(Matrix matrix, gd.a aVar, int i10, Canvas canvas) {
            Iterator it = this.f19377c.iterator();
            while (it.hasNext()) {
                ((g) it.next()).a(this.f19378d, aVar, i10, canvas);
            }
        }
    }

    public static class b extends g {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final d f19380c;

        public b(d dVar) {
            this.f19380c = dVar;
        }

        @Override // hd.m.g
        public void a(Matrix matrix, @NonNull gd.a aVar, int i10, @NonNull Canvas canvas) {
            aVar.a(canvas, matrix, new RectF(this.f19380c.k(), this.f19380c.o(), this.f19380c.l(), this.f19380c.j()), i10, this.f19380c.m(), this.f19380c.n());
        }
    }

    public static class c extends g {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final e f19381c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f19382d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final float f19383e;

        public c(e eVar, float f10, float f11) {
            this.f19381c = eVar;
            this.f19382d = f10;
            this.f19383e = f11;
        }

        @Override // hd.m.g
        public void a(Matrix matrix, @NonNull gd.a aVar, int i10, @NonNull Canvas canvas) {
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(this.f19381c.f19390c - this.f19383e, this.f19381c.b - this.f19382d), 0.0f);
            this.f19392a.set(matrix);
            this.f19392a.preTranslate(this.f19382d, this.f19383e);
            this.f19392a.preRotate(c());
            aVar.b(canvas, this.f19392a, rectF, i10);
        }

        public float c() {
            return (float) Math.toDegrees(Math.atan((this.f19381c.f19390c - this.f19383e) / (this.f19381c.b - this.f19382d)));
        }
    }

    public static class d extends f {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final RectF f19384h = new RectF();

        @Deprecated
        public float b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Deprecated
        public float f19385c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Deprecated
        public float f19386d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Deprecated
        public float f19387e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Deprecated
        public float f19388f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Deprecated
        public float f19389g;

        public d(float f10, float f11, float f12, float f13) {
            q(f10);
            u(f11);
            r(f12);
            p(f13);
        }

        @Override // hd.m.f
        public void a(@NonNull Matrix matrix, @NonNull Path path) {
            Matrix matrix2 = this.f19391a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = f19384h;
            rectF.set(k(), o(), l(), j());
            path.arcTo(rectF, m(), n(), false);
            path.transform(matrix);
        }

        public final float j() {
            return this.f19387e;
        }

        public final float k() {
            return this.b;
        }

        public final float l() {
            return this.f19386d;
        }

        public final float m() {
            return this.f19388f;
        }

        public final float n() {
            return this.f19389g;
        }

        public final float o() {
            return this.f19385c;
        }

        public final void p(float f10) {
            this.f19387e = f10;
        }

        public final void q(float f10) {
            this.b = f10;
        }

        public final void r(float f10) {
            this.f19386d = f10;
        }

        public final void s(float f10) {
            this.f19388f = f10;
        }

        public final void t(float f10) {
            this.f19389g = f10;
        }

        public final void u(float f10) {
            this.f19385c = f10;
        }
    }

    public static class e extends f {
        public float b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f19390c;

        @Override // hd.m.f
        public void a(@NonNull Matrix matrix, @NonNull Path path) {
            Matrix matrix2 = this.f19391a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.b, this.f19390c);
            path.transform(matrix);
        }
    }

    public static abstract class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Matrix f19391a = new Matrix();

        public abstract void a(Matrix matrix, Path path);
    }

    public static abstract class g {
        public static final Matrix b = new Matrix();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Matrix f19392a = new Matrix();

        public abstract void a(Matrix matrix, gd.a aVar, int i10, Canvas canvas);

        public final void b(gd.a aVar, int i10, Canvas canvas) {
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
        this.f19374g.add(dVar);
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
        this.f19375h.add(new b(dVar));
        p(f10);
    }

    public final void c(g gVar, float f10, float f11) {
        b(f10);
        this.f19375h.add(gVar);
        p(f11);
    }

    public void d(Matrix matrix, Path path) {
        int size = this.f19374g.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f19374g.get(i10).a(matrix, path);
        }
    }

    public boolean e() {
        return this.f19376i;
    }

    @NonNull
    public g f(Matrix matrix) {
        b(h());
        return new a(new ArrayList(this.f19375h), new Matrix(matrix));
    }

    public final float g() {
        return this.f19372e;
    }

    public final float h() {
        return this.f19373f;
    }

    public float i() {
        return this.f19370c;
    }

    public float j() {
        return this.f19371d;
    }

    public float k() {
        return this.f19369a;
    }

    public float l() {
        return this.b;
    }

    public void m(float f10, float f11) {
        e eVar = new e();
        eVar.b = f10;
        eVar.f19390c = f11;
        this.f19374g.add(eVar);
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
        this.f19374g.clear();
        this.f19375h.clear();
        this.f19376i = false;
    }

    public final void p(float f10) {
        this.f19372e = f10;
    }

    public final void q(float f10) {
        this.f19373f = f10;
    }

    public final void r(float f10) {
        this.f19370c = f10;
    }

    public final void s(float f10) {
        this.f19371d = f10;
    }

    public final void t(float f10) {
        this.f19369a = f10;
    }

    public final void u(float f10) {
        this.b = f10;
    }
}
