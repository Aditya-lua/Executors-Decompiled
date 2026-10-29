package gd;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m[] f18099a = new m[4];
    public final Matrix[] b = new Matrix[4];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Matrix[] f18100c = new Matrix[4];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final PointF f18101d = new PointF();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Path f18102e = new Path();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Path f18103f = new Path();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final m f18104g = new m();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float[] f18105h = new float[2];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float[] f18106i = new float[2];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Path f18107j = new Path();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Path f18108k = new Path();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f18109l = true;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final l f18110a = new l();
    }

    public interface b {
        void a(m mVar, Matrix matrix, int i10);

        void b(m mVar, Matrix matrix, int i10);
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        public final k f18111a;

        @NonNull
        public final Path b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NonNull
        public final RectF f18112c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final b f18113d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final float f18114e;

        public c(@NonNull k kVar, float f10, RectF rectF, b bVar, Path path) {
            this.f18113d = bVar;
            this.f18111a = kVar;
            this.f18114e = f10;
            this.f18112c = rectF;
            this.b = path;
        }
    }

    public l() {
        for (int i10 = 0; i10 < 4; i10++) {
            this.f18099a[i10] = new m();
            this.b[i10] = new Matrix();
            this.f18100c[i10] = new Matrix();
        }
    }

    @NonNull
    public static l k() {
        return a.f18110a;
    }

    public final float a(int i10) {
        return ((i10 + 1) % 4) * 90;
    }

    public final void b(@NonNull c cVar, int i10) {
        this.f18105h[0] = this.f18099a[i10].k();
        this.f18105h[1] = this.f18099a[i10].l();
        this.b[i10].mapPoints(this.f18105h);
        if (i10 == 0) {
            Path path = cVar.b;
            float[] fArr = this.f18105h;
            path.moveTo(fArr[0], fArr[1]);
        } else {
            Path path2 = cVar.b;
            float[] fArr2 = this.f18105h;
            path2.lineTo(fArr2[0], fArr2[1]);
        }
        this.f18099a[i10].d(this.b[i10], cVar.b);
        b bVar = cVar.f18113d;
        if (bVar != null) {
            bVar.a(this.f18099a[i10], this.b[i10], i10);
        }
    }

    public final void c(@NonNull c cVar, int i10) {
        int i11 = (i10 + 1) % 4;
        this.f18105h[0] = this.f18099a[i10].i();
        this.f18105h[1] = this.f18099a[i10].j();
        this.b[i10].mapPoints(this.f18105h);
        this.f18106i[0] = this.f18099a[i11].k();
        this.f18106i[1] = this.f18099a[i11].l();
        this.b[i11].mapPoints(this.f18106i);
        float[] fArr = this.f18105h;
        float f10 = fArr[0];
        float[] fArr2 = this.f18106i;
        float fMax = Math.max(((float) Math.hypot(f10 - fArr2[0], fArr[1] - fArr2[1])) - 0.001f, 0.0f);
        float fI = i(cVar.f18112c, i10);
        this.f18104g.n(0.0f, 0.0f);
        f fVarJ = j(i10, cVar.f18111a);
        fVarJ.b(fMax, fI, cVar.f18114e, this.f18104g);
        this.f18107j.reset();
        this.f18104g.d(this.f18100c[i10], this.f18107j);
        if (this.f18109l && (fVarJ.a() || l(this.f18107j, i10) || l(this.f18107j, i11))) {
            Path path = this.f18107j;
            path.op(path, this.f18103f, Path.Op.DIFFERENCE);
            this.f18105h[0] = this.f18104g.k();
            this.f18105h[1] = this.f18104g.l();
            this.f18100c[i10].mapPoints(this.f18105h);
            Path path2 = this.f18102e;
            float[] fArr3 = this.f18105h;
            path2.moveTo(fArr3[0], fArr3[1]);
            this.f18104g.d(this.f18100c[i10], this.f18102e);
        } else {
            this.f18104g.d(this.f18100c[i10], cVar.b);
        }
        b bVar = cVar.f18113d;
        if (bVar != null) {
            bVar.b(this.f18104g, this.f18100c[i10], i10);
        }
    }

    public void d(k kVar, float f10, RectF rectF, @NonNull Path path) {
        e(kVar, f10, rectF, null, path);
    }

    public void e(k kVar, float f10, RectF rectF, b bVar, @NonNull Path path) {
        path.rewind();
        this.f18102e.rewind();
        this.f18103f.rewind();
        this.f18103f.addRect(rectF, Path.Direction.CW);
        c cVar = new c(kVar, f10, rectF, bVar, path);
        for (int i10 = 0; i10 < 4; i10++) {
            m(cVar, i10);
            n(i10);
        }
        for (int i11 = 0; i11 < 4; i11++) {
            b(cVar, i11);
            c(cVar, i11);
        }
        path.close();
        this.f18102e.close();
        if (this.f18102e.isEmpty()) {
            return;
        }
        path.op(this.f18102e, Path.Op.UNION);
    }

    public final void f(int i10, @NonNull RectF rectF, @NonNull PointF pointF) {
        if (i10 == 1) {
            pointF.set(rectF.right, rectF.bottom);
            return;
        }
        if (i10 == 2) {
            pointF.set(rectF.left, rectF.bottom);
        } else if (i10 != 3) {
            pointF.set(rectF.right, rectF.top);
        } else {
            pointF.set(rectF.left, rectF.top);
        }
    }

    public final gd.c g(int i10, @NonNull k kVar) {
        if (i10 == 1) {
            return kVar.l();
        }
        if (i10 != 2) {
            return i10 != 3 ? kVar.t() : kVar.r();
        }
        return kVar.j();
    }

    public final d h(int i10, @NonNull k kVar) {
        if (i10 == 1) {
            return kVar.k();
        }
        if (i10 != 2) {
            return i10 != 3 ? kVar.s() : kVar.q();
        }
        return kVar.i();
    }

    public final float i(@NonNull RectF rectF, int i10) {
        float[] fArr = this.f18105h;
        m mVar = this.f18099a[i10];
        fArr[0] = mVar.f18116c;
        fArr[1] = mVar.f18117d;
        this.b[i10].mapPoints(fArr);
        return (i10 == 1 || i10 == 3) ? Math.abs(rectF.centerX() - this.f18105h[0]) : Math.abs(rectF.centerY() - this.f18105h[1]);
    }

    public final f j(int i10, @NonNull k kVar) {
        if (i10 == 1) {
            return kVar.h();
        }
        if (i10 != 2) {
            return i10 != 3 ? kVar.o() : kVar.p();
        }
        return kVar.n();
    }

    public final boolean l(Path path, int i10) {
        this.f18108k.reset();
        this.f18099a[i10].d(this.b[i10], this.f18108k);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        this.f18108k.computeBounds(rectF, true);
        path.op(this.f18108k, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        return !rectF.isEmpty() || (rectF.width() > 1.0f && rectF.height() > 1.0f);
    }

    public final void m(@NonNull c cVar, int i10) {
        h(i10, cVar.f18111a).b(this.f18099a[i10], 90.0f, cVar.f18114e, cVar.f18112c, g(i10, cVar.f18111a));
        float fA = a(i10);
        this.b[i10].reset();
        f(i10, cVar.f18112c, this.f18101d);
        Matrix matrix = this.b[i10];
        PointF pointF = this.f18101d;
        matrix.setTranslate(pointF.x, pointF.y);
        this.b[i10].preRotate(fA);
    }

    public final void n(int i10) {
        this.f18105h[0] = this.f18099a[i10].i();
        this.f18105h[1] = this.f18099a[i10].j();
        this.b[i10].mapPoints(this.f18105h);
        float fA = a(i10);
        this.f18100c[i10].reset();
        Matrix matrix = this.f18100c[i10];
        float[] fArr = this.f18105h;
        matrix.setTranslate(fArr[0], fArr[1]);
        this.f18100c[i10].preRotate(fA);
    }
}
