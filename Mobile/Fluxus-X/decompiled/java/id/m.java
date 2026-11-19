package id;

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
    public float f19466a;

    @Deprecated
    public float b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public float f19467c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    public float f19468d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated
    public float f19469e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Deprecated
    public float f19470f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List<f> f19471g = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List<g> f19472h = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f19473i;

    public class a extends g {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ List f19474c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Matrix f19475d;

        public a(List list, Matrix matrix) {
            this.f19474c = list;
            this.f19475d = matrix;
        }

        @Override // id.m.g
        public void a(Matrix matrix, hd.a aVar, int i10, Canvas canvas) {
            Iterator it = this.f19474c.iterator();
            while (it.hasNext()) {
                ((g) it.next()).a(this.f19475d, aVar, i10, canvas);
            }
        }
    }

    public static class b extends g {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final d f19477c;

        public b(d dVar) {
            this.f19477c = dVar;
        }

        @Override // id.m.g
        public void a(Matrix matrix, @NonNull hd.a aVar, int i10, @NonNull Canvas canvas) {
            aVar.a(canvas, matrix, new RectF(this.f19477c.k(), this.f19477c.o(), this.f19477c.l(), this.f19477c.j()), i10, this.f19477c.m(), this.f19477c.n());
        }
    }

    public static class c extends g {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final e f19478c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f19479d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final float f19480e;

        public c(e eVar, float f10, float f11) {
            this.f19478c = eVar;
            this.f19479d = f10;
            this.f19480e = f11;
        }

        @Override // id.m.g
        public void a(Matrix matrix, @NonNull hd.a aVar, int i10, @NonNull Canvas canvas) {
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(this.f19478c.f19487c - this.f19480e, this.f19478c.b - this.f19479d), 0.0f);
            this.f19489a.set(matrix);
            this.f19489a.preTranslate(this.f19479d, this.f19480e);
            this.f19489a.preRotate(c());
            aVar.b(canvas, this.f19489a, rectF, i10);
        }

        public float c() {
            return (float) Math.toDegrees(Math.atan((this.f19478c.f19487c - this.f19480e) / (this.f19478c.b - this.f19479d)));
        }
    }

    public static class d extends f {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final RectF f19481h = new RectF();

        @Deprecated
        public float b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Deprecated
        public float f19482c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Deprecated
        public float f19483d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Deprecated
        public float f19484e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Deprecated
        public float f19485f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Deprecated
        public float f19486g;

        public d(float f10, float f11, float f12, float f13) {
            q(f10);
            u(f11);
            r(f12);
            p(f13);
        }

        @Override // id.m.f
        public void a(@NonNull Matrix matrix, @NonNull Path path) {
            Matrix matrix2 = this.f19488a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = f19481h;
            rectF.set(k(), o(), l(), j());
            path.arcTo(rectF, m(), n(), false);
            path.transform(matrix);
        }

        public final float j() {
            return this.f19484e;
        }

        public final float k() {
            return this.b;
        }

        public final float l() {
            return this.f19483d;
        }

        public final float m() {
            return this.f19485f;
        }

        public final float n() {
            return this.f19486g;
        }

        public final float o() {
            return this.f19482c;
        }

        public final void p(float f10) {
            this.f19484e = f10;
        }

        public final void q(float f10) {
            this.b = f10;
        }

        public final void r(float f10) {
            this.f19483d = f10;
        }

        public final void s(float f10) {
            this.f19485f = f10;
        }

        public final void t(float f10) {
            this.f19486g = f10;
        }

        public final void u(float f10) {
            this.f19482c = f10;
        }
    }

    public static class e extends f {
        public float b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f19487c;

        @Override // id.m.f
        public void a(@NonNull Matrix matrix, @NonNull Path path) {
            Matrix matrix2 = this.f19488a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.b, this.f19487c);
            path.transform(matrix);
        }
    }

    public static abstract class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Matrix f19488a = new Matrix();

        public abstract void a(Matrix matrix, Path path);
    }

    public static abstract class g {
        public static final Matrix b = new Matrix();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Matrix f19489a = new Matrix();

        public abstract void a(Matrix matrix, hd.a aVar, int i10, Canvas canvas);

        public final void b(hd.a aVar, int i10, Canvas canvas) {
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
        this.f19471g.add(dVar);
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
        this.f19472h.add(new b(dVar));
        p(f10);
    }

    public final void c(g gVar, float f10, float f11) {
        b(f10);
        this.f19472h.add(gVar);
        p(f11);
    }

    public void d(Matrix matrix, Path path) {
        int size = this.f19471g.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f19471g.get(i10).a(matrix, path);
        }
    }

    public boolean e() {
        return this.f19473i;
    }

    @NonNull
    public g f(Matrix matrix) {
        b(h());
        return new a(new ArrayList(this.f19472h), new Matrix(matrix));
    }

    public final float g() {
        return this.f19469e;
    }

    public final float h() {
        return this.f19470f;
    }

    public float i() {
        return this.f19467c;
    }

    public float j() {
        return this.f19468d;
    }

    public float k() {
        return this.f19466a;
    }

    public float l() {
        return this.b;
    }

    public void m(float f10, float f11) {
        e eVar = new e();
        eVar.b = f10;
        eVar.f19487c = f11;
        this.f19471g.add(eVar);
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
        this.f19471g.clear();
        this.f19472h.clear();
        this.f19473i = false;
    }

    public final void p(float f10) {
        this.f19469e = f10;
    }

    public final void q(float f10) {
        this.f19470f = f10;
    }

    public final void r(float f10) {
        this.f19467c = f10;
    }

    public final void s(float f10) {
        this.f19468d = f10;
    }

    public final void t(float f10) {
        this.f19466a = f10;
    }

    public final void u(float f10) {
        this.b = f10;
    }
}
