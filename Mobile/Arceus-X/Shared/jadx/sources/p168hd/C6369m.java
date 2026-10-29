package p168hd;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.annotation.NonNull;
import gd.C6088a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: hd.m */
/* JADX INFO: loaded from: classes2.dex */
public class C6369m {

    /* JADX INFO: renamed from: a */
    @Deprecated
    public float f24216a;

    /* JADX INFO: renamed from: b */
    @Deprecated
    public float f24217b;

    /* JADX INFO: renamed from: c */
    @Deprecated
    public float f24218c;

    /* JADX INFO: renamed from: d */
    @Deprecated
    public float f24219d;

    /* JADX INFO: renamed from: e */
    @Deprecated
    public float f24220e;

    /* JADX INFO: renamed from: f */
    @Deprecated
    public float f24221f;

    /* JADX INFO: renamed from: g */
    public final List<f> f24222g = new ArrayList();

    /* JADX INFO: renamed from: h */
    public final List<g> f24223h = new ArrayList();

    /* JADX INFO: renamed from: i */
    public boolean f24224i;

    /* JADX INFO: renamed from: hd.m$a */
    public class a extends g {

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ List f24225c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ Matrix f24226d;

        public a(List list, Matrix matrix) {
            this.f24225c = list;
            this.f24226d = matrix;
        }

        @Override // p168hd.C6369m.g
        /* JADX INFO: renamed from: a */
        public void mo27854a(Matrix matrix, C6088a c6088a, int i10, Canvas canvas) {
            Iterator it = this.f24225c.iterator();
            while (it.hasNext()) {
                ((g) it.next()).mo27854a(this.f24226d, c6088a, i10, canvas);
            }
        }
    }

    /* JADX INFO: renamed from: hd.m$b */
    public static class b extends g {

        /* JADX INFO: renamed from: c */
        public final d f24228c;

        public b(d dVar) {
            this.f24228c = dVar;
        }

        @Override // p168hd.C6369m.g
        /* JADX INFO: renamed from: a */
        public void mo27854a(Matrix matrix, @NonNull C6088a c6088a, int i10, @NonNull Canvas canvas) {
            c6088a.m26954a(canvas, matrix, new RectF(this.f24228c.m27866k(), this.f24228c.m27870o(), this.f24228c.m27867l(), this.f24228c.m27865j()), i10, this.f24228c.m27868m(), this.f24228c.m27869n());
        }
    }

    /* JADX INFO: renamed from: hd.m$c */
    public static class c extends g {

        /* JADX INFO: renamed from: c */
        public final e f24229c;

        /* JADX INFO: renamed from: d */
        public final float f24230d;

        /* JADX INFO: renamed from: e */
        public final float f24231e;

        public c(e eVar, float f10, float f11) {
            this.f24229c = eVar;
            this.f24230d = f10;
            this.f24231e = f11;
        }

        @Override // p168hd.C6369m.g
        /* JADX INFO: renamed from: a */
        public void mo27854a(Matrix matrix, @NonNull C6088a c6088a, int i10, @NonNull Canvas canvas) {
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(this.f24229c.f24240c - this.f24231e, this.f24229c.f24239b - this.f24230d), 0.0f);
            this.f24243a.set(matrix);
            this.f24243a.preTranslate(this.f24230d, this.f24231e);
            this.f24243a.preRotate(m27855c());
            c6088a.m26955b(canvas, this.f24243a, rectF, i10);
        }

        /* JADX INFO: renamed from: c */
        public float m27855c() {
            return (float) Math.toDegrees(Math.atan((this.f24229c.f24240c - this.f24231e) / (this.f24229c.f24239b - this.f24230d)));
        }
    }

    /* JADX INFO: renamed from: hd.m$d */
    public static class d extends f {

        /* JADX INFO: renamed from: h */
        public static final RectF f24232h = new RectF();

        /* JADX INFO: renamed from: b */
        @Deprecated
        public float f24233b;

        /* JADX INFO: renamed from: c */
        @Deprecated
        public float f24234c;

        /* JADX INFO: renamed from: d */
        @Deprecated
        public float f24235d;

        /* JADX INFO: renamed from: e */
        @Deprecated
        public float f24236e;

        /* JADX INFO: renamed from: f */
        @Deprecated
        public float f24237f;

        /* JADX INFO: renamed from: g */
        @Deprecated
        public float f24238g;

        public d(float f10, float f11, float f12, float f13) {
            m27872q(f10);
            m27876u(f11);
            m27873r(f12);
            m27871p(f13);
        }

        @Override // p168hd.C6369m.f
        /* JADX INFO: renamed from: a */
        public void mo27864a(@NonNull Matrix matrix, @NonNull Path path) {
            Matrix matrix2 = this.f24241a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = f24232h;
            rectF.set(m27866k(), m27870o(), m27867l(), m27865j());
            path.arcTo(rectF, m27868m(), m27869n(), false);
            path.transform(matrix);
        }

        /* JADX INFO: renamed from: j */
        public final float m27865j() {
            return this.f24236e;
        }

        /* JADX INFO: renamed from: k */
        public final float m27866k() {
            return this.f24233b;
        }

        /* JADX INFO: renamed from: l */
        public final float m27867l() {
            return this.f24235d;
        }

        /* JADX INFO: renamed from: m */
        public final float m27868m() {
            return this.f24237f;
        }

        /* JADX INFO: renamed from: n */
        public final float m27869n() {
            return this.f24238g;
        }

        /* JADX INFO: renamed from: o */
        public final float m27870o() {
            return this.f24234c;
        }

        /* JADX INFO: renamed from: p */
        public final void m27871p(float f10) {
            this.f24236e = f10;
        }

        /* JADX INFO: renamed from: q */
        public final void m27872q(float f10) {
            this.f24233b = f10;
        }

        /* JADX INFO: renamed from: r */
        public final void m27873r(float f10) {
            this.f24235d = f10;
        }

        /* JADX INFO: renamed from: s */
        public final void m27874s(float f10) {
            this.f24237f = f10;
        }

        /* JADX INFO: renamed from: t */
        public final void m27875t(float f10) {
            this.f24238g = f10;
        }

        /* JADX INFO: renamed from: u */
        public final void m27876u(float f10) {
            this.f24234c = f10;
        }
    }

    /* JADX INFO: renamed from: hd.m$e */
    public static class e extends f {

        /* JADX INFO: renamed from: b */
        public float f24239b;

        /* JADX INFO: renamed from: c */
        public float f24240c;

        @Override // p168hd.C6369m.f
        /* JADX INFO: renamed from: a */
        public void mo27864a(@NonNull Matrix matrix, @NonNull Path path) {
            Matrix matrix2 = this.f24241a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f24239b, this.f24240c);
            path.transform(matrix);
        }
    }

    /* JADX INFO: renamed from: hd.m$f */
    public static abstract class f {

        /* JADX INFO: renamed from: a */
        public final Matrix f24241a = new Matrix();

        /* JADX INFO: renamed from: a */
        public abstract void mo27864a(Matrix matrix, Path path);
    }

    /* JADX INFO: renamed from: hd.m$g */
    public static abstract class g {

        /* JADX INFO: renamed from: b */
        public static final Matrix f24242b = new Matrix();

        /* JADX INFO: renamed from: a */
        public final Matrix f24243a = new Matrix();

        /* JADX INFO: renamed from: a */
        public abstract void mo27854a(Matrix matrix, C6088a c6088a, int i10, Canvas canvas);

        /* JADX INFO: renamed from: b */
        public final void m27881b(C6088a c6088a, int i10, Canvas canvas) {
            mo27854a(f24242b, c6088a, i10, canvas);
        }
    }

    public C6369m() {
        m27846n(0.0f, 0.0f);
    }

    /* JADX INFO: renamed from: a */
    public void m27833a(float f10, float f11, float f12, float f13, float f14, float f15) {
        d dVar = new d(f10, f11, f12, f13);
        dVar.m27874s(f14);
        dVar.m27875t(f15);
        this.f24222g.add(dVar);
        b bVar = new b(dVar);
        float f16 = f14 + f15;
        boolean z10 = f15 < 0.0f;
        if (z10) {
            f14 = (f14 + 180.0f) % 360.0f;
        }
        m27835c(bVar, f14, z10 ? (180.0f + f16) % 360.0f : f16);
        double d10 = f16;
        m27850r(((f10 + f12) * 0.5f) + (((f12 - f10) / 2.0f) * ((float) Math.cos(Math.toRadians(d10)))));
        m27851s(((f11 + f13) * 0.5f) + (((f13 - f11) / 2.0f) * ((float) Math.sin(Math.toRadians(d10)))));
    }

    /* JADX INFO: renamed from: b */
    public final void m27834b(float f10) {
        if (m27839g() == f10) {
            return;
        }
        float fM27839g = ((f10 - m27839g()) + 360.0f) % 360.0f;
        if (fM27839g > 180.0f) {
            return;
        }
        d dVar = new d(m27841i(), m27842j(), m27841i(), m27842j());
        dVar.m27874s(m27839g());
        dVar.m27875t(fM27839g);
        this.f24223h.add(new b(dVar));
        m27848p(f10);
    }

    /* JADX INFO: renamed from: c */
    public final void m27835c(g gVar, float f10, float f11) {
        m27834b(f10);
        this.f24223h.add(gVar);
        m27848p(f11);
    }

    /* JADX INFO: renamed from: d */
    public void m27836d(Matrix matrix, Path path) {
        int size = this.f24222g.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f24222g.get(i10).mo27864a(matrix, path);
        }
    }

    /* JADX INFO: renamed from: e */
    public boolean m27837e() {
        return this.f24224i;
    }

    @NonNull
    /* JADX INFO: renamed from: f */
    public g m27838f(Matrix matrix) {
        m27834b(m27840h());
        return new a(new ArrayList(this.f24223h), new Matrix(matrix));
    }

    /* JADX INFO: renamed from: g */
    public final float m27839g() {
        return this.f24220e;
    }

    /* JADX INFO: renamed from: h */
    public final float m27840h() {
        return this.f24221f;
    }

    /* JADX INFO: renamed from: i */
    public float m27841i() {
        return this.f24218c;
    }

    /* JADX INFO: renamed from: j */
    public float m27842j() {
        return this.f24219d;
    }

    /* JADX INFO: renamed from: k */
    public float m27843k() {
        return this.f24216a;
    }

    /* JADX INFO: renamed from: l */
    public float m27844l() {
        return this.f24217b;
    }

    /* JADX INFO: renamed from: m */
    public void m27845m(float f10, float f11) {
        e eVar = new e();
        eVar.f24239b = f10;
        eVar.f24240c = f11;
        this.f24222g.add(eVar);
        c cVar = new c(eVar, m27841i(), m27842j());
        m27835c(cVar, cVar.m27855c() + 270.0f, cVar.m27855c() + 270.0f);
        m27850r(f10);
        m27851s(f11);
    }

    /* JADX INFO: renamed from: n */
    public void m27846n(float f10, float f11) {
        m27847o(f10, f11, 270.0f, 0.0f);
    }

    /* JADX INFO: renamed from: o */
    public void m27847o(float f10, float f11, float f12, float f13) {
        m27852t(f10);
        m27853u(f11);
        m27850r(f10);
        m27851s(f11);
        m27848p(f12);
        m27849q((f12 + f13) % 360.0f);
        this.f24222g.clear();
        this.f24223h.clear();
        this.f24224i = false;
    }

    /* JADX INFO: renamed from: p */
    public final void m27848p(float f10) {
        this.f24220e = f10;
    }

    /* JADX INFO: renamed from: q */
    public final void m27849q(float f10) {
        this.f24221f = f10;
    }

    /* JADX INFO: renamed from: r */
    public final void m27850r(float f10) {
        this.f24218c = f10;
    }

    /* JADX INFO: renamed from: s */
    public final void m27851s(float f10) {
        this.f24219d = f10;
    }

    /* JADX INFO: renamed from: t */
    public final void m27852t(float f10) {
        this.f24216a = f10;
    }

    /* JADX INFO: renamed from: u */
    public final void m27853u(float f10) {
        this.f24217b = f10;
    }
}
