package p168hd;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: hd.l */
/* JADX INFO: loaded from: classes2.dex */
public class C6368l {

    /* JADX INFO: renamed from: a */
    public final C6369m[] f24198a = new C6369m[4];

    /* JADX INFO: renamed from: b */
    public final Matrix[] f24199b = new Matrix[4];

    /* JADX INFO: renamed from: c */
    public final Matrix[] f24200c = new Matrix[4];

    /* JADX INFO: renamed from: d */
    public final PointF f24201d = new PointF();

    /* JADX INFO: renamed from: e */
    public final Path f24202e = new Path();

    /* JADX INFO: renamed from: f */
    public final Path f24203f = new Path();

    /* JADX INFO: renamed from: g */
    public final C6369m f24204g = new C6369m();

    /* JADX INFO: renamed from: h */
    public final float[] f24205h = new float[2];

    /* JADX INFO: renamed from: i */
    public final float[] f24206i = new float[2];

    /* JADX INFO: renamed from: j */
    public final Path f24207j = new Path();

    /* JADX INFO: renamed from: k */
    public final Path f24208k = new Path();

    /* JADX INFO: renamed from: l */
    public boolean f24209l = true;

    /* JADX INFO: renamed from: hd.l$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public static final C6368l f24210a = new C6368l();
    }

    /* JADX INFO: renamed from: hd.l$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo27752a(C6369m c6369m, Matrix matrix, int i10);

        /* JADX INFO: renamed from: b */
        void mo27753b(C6369m c6369m, Matrix matrix, int i10);
    }

    /* JADX INFO: renamed from: hd.l$c */
    public static final class c {

        /* JADX INFO: renamed from: a */
        @NonNull
        public final C6367k f24211a;

        /* JADX INFO: renamed from: b */
        @NonNull
        public final Path f24212b;

        /* JADX INFO: renamed from: c */
        @NonNull
        public final RectF f24213c;

        /* JADX INFO: renamed from: d */
        public final b f24214d;

        /* JADX INFO: renamed from: e */
        public final float f24215e;

        public c(@NonNull C6367k c6367k, float f10, RectF rectF, b bVar, Path path) {
            this.f24214d = bVar;
            this.f24211a = c6367k;
            this.f24215e = f10;
            this.f24213c = rectF;
            this.f24212b = path;
        }
    }

    public C6368l() {
        for (int i10 = 0; i10 < 4; i10++) {
            this.f24198a[i10] = new C6369m();
            this.f24199b[i10] = new Matrix();
            this.f24200c[i10] = new Matrix();
        }
    }

    @NonNull
    /* JADX INFO: renamed from: k */
    public static C6368l m27819k() {
        return a.f24210a;
    }

    /* JADX INFO: renamed from: a */
    public final float m27820a(int i10) {
        return ((i10 + 1) % 4) * 90;
    }

    /* JADX INFO: renamed from: b */
    public final void m27821b(@NonNull c cVar, int i10) {
        this.f24205h[0] = this.f24198a[i10].m27843k();
        this.f24205h[1] = this.f24198a[i10].m27844l();
        this.f24199b[i10].mapPoints(this.f24205h);
        if (i10 == 0) {
            Path path = cVar.f24212b;
            float[] fArr = this.f24205h;
            path.moveTo(fArr[0], fArr[1]);
        } else {
            Path path2 = cVar.f24212b;
            float[] fArr2 = this.f24205h;
            path2.lineTo(fArr2[0], fArr2[1]);
        }
        this.f24198a[i10].m27836d(this.f24199b[i10], cVar.f24212b);
        b bVar = cVar.f24214d;
        if (bVar != null) {
            bVar.mo27753b(this.f24198a[i10], this.f24199b[i10], i10);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m27822c(@NonNull c cVar, int i10) {
        int i11 = (i10 + 1) % 4;
        this.f24205h[0] = this.f24198a[i10].m27841i();
        this.f24205h[1] = this.f24198a[i10].m27842j();
        this.f24199b[i10].mapPoints(this.f24205h);
        this.f24206i[0] = this.f24198a[i11].m27843k();
        this.f24206i[1] = this.f24198a[i11].m27844l();
        this.f24199b[i11].mapPoints(this.f24206i);
        float[] fArr = this.f24205h;
        float f10 = fArr[0];
        float[] fArr2 = this.f24206i;
        float fMax = Math.max(((float) Math.hypot(f10 - fArr2[0], fArr[1] - fArr2[1])) - 0.001f, 0.0f);
        float fM27828i = m27828i(cVar.f24213c, i10);
        this.f24204g.m27846n(0.0f, 0.0f);
        C6362f c6362fM27829j = m27829j(i10, cVar.f24211a);
        c6362fM27829j.mo27687b(fMax, fM27828i, cVar.f24215e, this.f24204g);
        this.f24207j.reset();
        this.f24204g.m27836d(this.f24200c[i10], this.f24207j);
        if (this.f24209l && (c6362fM27829j.m27686a() || m27830l(this.f24207j, i10) || m27830l(this.f24207j, i11))) {
            Path path = this.f24207j;
            path.op(path, this.f24203f, Path.Op.DIFFERENCE);
            this.f24205h[0] = this.f24204g.m27843k();
            this.f24205h[1] = this.f24204g.m27844l();
            this.f24200c[i10].mapPoints(this.f24205h);
            Path path2 = this.f24202e;
            float[] fArr3 = this.f24205h;
            path2.moveTo(fArr3[0], fArr3[1]);
            this.f24204g.m27836d(this.f24200c[i10], this.f24202e);
        } else {
            this.f24204g.m27836d(this.f24200c[i10], cVar.f24212b);
        }
        b bVar = cVar.f24214d;
        if (bVar != null) {
            bVar.mo27752a(this.f24204g, this.f24200c[i10], i10);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m27823d(C6367k c6367k, float f10, RectF rectF, @NonNull Path path) {
        m27824e(c6367k, f10, rectF, null, path);
    }

    /* JADX INFO: renamed from: e */
    public void m27824e(C6367k c6367k, float f10, RectF rectF, b bVar, @NonNull Path path) {
        path.rewind();
        this.f24202e.rewind();
        this.f24203f.rewind();
        this.f24203f.addRect(rectF, Path.Direction.CW);
        c cVar = new c(c6367k, f10, rectF, bVar, path);
        for (int i10 = 0; i10 < 4; i10++) {
            m27831m(cVar, i10);
            m27832n(i10);
        }
        for (int i11 = 0; i11 < 4; i11++) {
            m27821b(cVar, i11);
            m27822c(cVar, i11);
        }
        path.close();
        this.f24202e.close();
        if (this.f24202e.isEmpty()) {
            return;
        }
        path.op(this.f24202e, Path.Op.UNION);
    }

    /* JADX INFO: renamed from: f */
    public final void m27825f(int i10, @NonNull RectF rectF, @NonNull PointF pointF) {
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

    /* JADX INFO: renamed from: g */
    public final InterfaceC6359c m27826g(int i10, @NonNull C6367k c6367k) {
        if (i10 == 1) {
            return c6367k.m27774l();
        }
        if (i10 != 2) {
            return i10 != 3 ? c6367k.m27781t() : c6367k.m27779r();
        }
        return c6367k.m27772j();
    }

    /* JADX INFO: renamed from: h */
    public final C6360d m27827h(int i10, @NonNull C6367k c6367k) {
        if (i10 == 1) {
            return c6367k.m27773k();
        }
        if (i10 != 2) {
            return i10 != 3 ? c6367k.m27780s() : c6367k.m27778q();
        }
        return c6367k.m27771i();
    }

    /* JADX INFO: renamed from: i */
    public final float m27828i(@NonNull RectF rectF, int i10) {
        float[] fArr = this.f24205h;
        C6369m c6369m = this.f24198a[i10];
        fArr[0] = c6369m.f24218c;
        fArr[1] = c6369m.f24219d;
        this.f24199b[i10].mapPoints(fArr);
        return (i10 == 1 || i10 == 3) ? Math.abs(rectF.centerX() - this.f24205h[0]) : Math.abs(rectF.centerY() - this.f24205h[1]);
    }

    /* JADX INFO: renamed from: j */
    public final C6362f m27829j(int i10, @NonNull C6367k c6367k) {
        if (i10 == 1) {
            return c6367k.m27770h();
        }
        if (i10 != 2) {
            return i10 != 3 ? c6367k.m27776o() : c6367k.m27777p();
        }
        return c6367k.m27775n();
    }

    /* JADX INFO: renamed from: l */
    public final boolean m27830l(Path path, int i10) {
        this.f24208k.reset();
        this.f24198a[i10].m27836d(this.f24199b[i10], this.f24208k);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        this.f24208k.computeBounds(rectF, true);
        path.op(this.f24208k, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        return !rectF.isEmpty() || (rectF.width() > 1.0f && rectF.height() > 1.0f);
    }

    /* JADX INFO: renamed from: m */
    public final void m27831m(@NonNull c cVar, int i10) {
        m27827h(i10, cVar.f24211a).m27685b(this.f24198a[i10], 90.0f, cVar.f24215e, cVar.f24213c, m27826g(i10, cVar.f24211a));
        float fM27820a = m27820a(i10);
        this.f24199b[i10].reset();
        m27825f(i10, cVar.f24213c, this.f24201d);
        Matrix matrix = this.f24199b[i10];
        PointF pointF = this.f24201d;
        matrix.setTranslate(pointF.x, pointF.y);
        this.f24199b[i10].preRotate(fM27820a);
    }

    /* JADX INFO: renamed from: n */
    public final void m27832n(int i10) {
        this.f24205h[0] = this.f24198a[i10].m27841i();
        this.f24205h[1] = this.f24198a[i10].m27842j();
        this.f24199b[i10].mapPoints(this.f24205h);
        float fM27820a = m27820a(i10);
        this.f24200c[i10].reset();
        Matrix matrix = this.f24200c[i10];
        float[] fArr = this.f24205h;
        matrix.setTranslate(fArr[0], fArr[1]);
        this.f24200c[i10].preRotate(fM27820a);
    }
}
