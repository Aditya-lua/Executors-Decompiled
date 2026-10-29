package gd;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import androidx.annotation.NonNull;
import java.util.BitSet;

/* JADX INFO: loaded from: classes2.dex */
public class g extends Drawable implements n {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f18027x = "g";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final Paint f18028y;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f18029a;
    public final m.g[] b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m.g[] f18030c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final BitSet f18031d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f18032e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Matrix f18033f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Path f18034g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Path f18035h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final RectF f18036i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final RectF f18037j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Region f18038k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Region f18039l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public k f18040m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Paint f18041n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Paint f18042o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final fd.a f18043p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NonNull
    public final l.b f18044q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final l f18045r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public PorterDuffColorFilter f18046s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public PorterDuffColorFilter f18047t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f18048u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NonNull
    public final RectF f18049v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f18050w;

    public class a implements l.b {
        public a() {
        }

        @Override // gd.l.b
        public void a(@NonNull m mVar, Matrix matrix, int i10) {
            g.this.f18031d.set(i10, mVar.e());
            g.this.b[i10] = mVar.f(matrix);
        }

        @Override // gd.l.b
        public void b(@NonNull m mVar, Matrix matrix, int i10) {
            g.this.f18031d.set(i10 + 4, mVar.e());
            g.this.f18030c[i10] = mVar.f(matrix);
        }
    }

    public class b implements k.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ float f18052a;

        public b(float f10) {
            this.f18052a = f10;
        }

        @Override // gd.k.c
        @NonNull
        public gd.c a(@NonNull gd.c cVar) {
            return cVar instanceof i ? cVar : new gd.b(this.f18052a, cVar);
        }
    }

    static {
        Paint paint = new Paint(1);
        f18028y = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public g() {
        this(new k());
    }

    public static int V(int i10, int i11) {
        return (i10 * (i11 + (i11 >>> 7))) >>> 8;
    }

    @NonNull
    public static g m(@NonNull Context context, float f10, ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(tc.a.c(context, hc.b.f18790o, g.class.getSimpleName()));
        }
        g gVar = new g();
        gVar.Q(context);
        gVar.a0(colorStateList);
        gVar.Z(f10);
        return gVar;
    }

    public int A() {
        return this.f18048u;
    }

    public int B() {
        c cVar = this.f18029a;
        return (int) (((double) cVar.f18070s) * Math.sin(Math.toRadians(cVar.f18071t)));
    }

    public int C() {
        c cVar = this.f18029a;
        return (int) (((double) cVar.f18070s) * Math.cos(Math.toRadians(cVar.f18071t)));
    }

    public int D() {
        return this.f18029a.f18069r;
    }

    @NonNull
    public k E() {
        return this.f18029a.f18053a;
    }

    public ColorStateList F() {
        return this.f18029a.f18056e;
    }

    public final float G() {
        if (P()) {
            return this.f18042o.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    public float H() {
        return this.f18029a.f18063l;
    }

    public ColorStateList I() {
        return this.f18029a.f18058g;
    }

    public float J() {
        return this.f18029a.f18053a.r().a(u());
    }

    public float K() {
        return this.f18029a.f18053a.t().a(u());
    }

    public float L() {
        return this.f18029a.f18067p;
    }

    public float M() {
        return w() + L();
    }

    public final boolean N() {
        c cVar = this.f18029a;
        int i10 = cVar.f18068q;
        if (i10 == 1 || cVar.f18069r <= 0) {
            return false;
        }
        return i10 == 2 || X();
    }

    public final boolean O() {
        Paint.Style style = this.f18029a.f18073v;
        return style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL;
    }

    public final boolean P() {
        Paint.Style style = this.f18029a.f18073v;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f18042o.getStrokeWidth() > 0.0f;
    }

    public void Q(Context context) {
        this.f18029a.b = new wc.a(context);
        m0();
    }

    public final void R() {
        super.invalidateSelf();
    }

    public boolean S() {
        wc.a aVar = this.f18029a.b;
        return aVar != null && aVar.d();
    }

    public boolean T() {
        return this.f18029a.f18053a.u(u());
    }

    public final void U(@NonNull Canvas canvas) {
        if (N()) {
            canvas.save();
            W(canvas);
            if (!this.f18050w) {
                n(canvas);
                canvas.restore();
                return;
            }
            int iWidth = (int) (this.f18049v.width() - getBounds().width());
            int iHeight = (int) (this.f18049v.height() - getBounds().height());
            if (iWidth < 0 || iHeight < 0) {
                throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(((int) this.f18049v.width()) + (this.f18029a.f18069r * 2) + iWidth, ((int) this.f18049v.height()) + (this.f18029a.f18069r * 2) + iHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap);
            float f10 = (getBounds().left - this.f18029a.f18069r) - iWidth;
            float f11 = (getBounds().top - this.f18029a.f18069r) - iHeight;
            canvas2.translate(-f10, -f11);
            n(canvas2);
            canvas.drawBitmap(bitmapCreateBitmap, f10, f11, (Paint) null);
            bitmapCreateBitmap.recycle();
            canvas.restore();
        }
    }

    public final void W(@NonNull Canvas canvas) {
        canvas.translate(B(), C());
    }

    public boolean X() {
        return (T() || this.f18034g.isConvex() || Build.VERSION.SDK_INT >= 29) ? false : true;
    }

    public void Y(@NonNull gd.c cVar) {
        setShapeAppearanceModel(this.f18029a.f18053a.x(cVar));
    }

    public void Z(float f10) {
        c cVar = this.f18029a;
        if (cVar.f18066o != f10) {
            cVar.f18066o = f10;
            m0();
        }
    }

    public void a0(ColorStateList colorStateList) {
        c cVar = this.f18029a;
        if (cVar.f18055d != colorStateList) {
            cVar.f18055d = colorStateList;
            onStateChange(getState());
        }
    }

    public void b0(float f10) {
        c cVar = this.f18029a;
        if (cVar.f18062k != f10) {
            cVar.f18062k = f10;
            this.f18032e = true;
            invalidateSelf();
        }
    }

    public void c0(int i10, int i11, int i12, int i13) {
        c cVar = this.f18029a;
        if (cVar.f18060i == null) {
            cVar.f18060i = new Rect();
        }
        this.f18029a.f18060i.set(i10, i11, i12, i13);
        invalidateSelf();
    }

    public void d0(float f10) {
        c cVar = this.f18029a;
        if (cVar.f18065n != f10) {
            cVar.f18065n = f10;
            m0();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        this.f18041n.setColorFilter(this.f18046s);
        int alpha = this.f18041n.getAlpha();
        this.f18041n.setAlpha(V(alpha, this.f18029a.f18064m));
        this.f18042o.setColorFilter(this.f18047t);
        this.f18042o.setStrokeWidth(this.f18029a.f18063l);
        int alpha2 = this.f18042o.getAlpha();
        this.f18042o.setAlpha(V(alpha2, this.f18029a.f18064m));
        if (this.f18032e) {
            i();
            g(u(), this.f18034g);
            this.f18032e = false;
        }
        U(canvas);
        if (O()) {
            o(canvas);
        }
        if (P()) {
            r(canvas);
        }
        this.f18041n.setAlpha(alpha);
        this.f18042o.setAlpha(alpha2);
    }

    public void e0(boolean z10) {
        this.f18050w = z10;
    }

    public final PorterDuffColorFilter f(@NonNull Paint paint, boolean z10) {
        if (!z10) {
            return null;
        }
        int color = paint.getColor();
        int iL = l(color);
        this.f18048u = iL;
        if (iL != color) {
            return new PorterDuffColorFilter(iL, PorterDuff.Mode.SRC_IN);
        }
        return null;
    }

    public void f0(int i10) {
        this.f18043p.d(i10);
        this.f18029a.f18072u = false;
        R();
    }

    public final void g(@NonNull RectF rectF, @NonNull Path path) {
        h(rectF, path);
        if (this.f18029a.f18061j != 1.0f) {
            this.f18033f.reset();
            Matrix matrix = this.f18033f;
            float f10 = this.f18029a.f18061j;
            matrix.setScale(f10, f10, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.f18033f);
        }
        path.computeBounds(this.f18049v, true);
    }

    public void g0(float f10, int i10) {
        j0(f10);
        i0(ColorStateList.valueOf(i10));
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f18029a.f18064m;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f18029a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(@NonNull Outline outline) {
        if (this.f18029a.f18068q == 2) {
            return;
        }
        if (T()) {
            outline.setRoundRect(getBounds(), J() * this.f18029a.f18062k);
        } else {
            g(u(), this.f18034g);
            vc.c.k(outline, this.f18034g);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(@NonNull Rect rect) {
        Rect rect2 = this.f18029a.f18060i;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        this.f18038k.set(getBounds());
        g(u(), this.f18034g);
        this.f18039l.setPath(this.f18034g, this.f18038k);
        this.f18038k.op(this.f18039l, Region.Op.DIFFERENCE);
        return this.f18038k;
    }

    public final void h(@NonNull RectF rectF, @NonNull Path path) {
        l lVar = this.f18045r;
        c cVar = this.f18029a;
        lVar.e(cVar.f18053a, cVar.f18062k, rectF, this.f18044q, path);
    }

    public void h0(float f10, ColorStateList colorStateList) {
        j0(f10);
        i0(colorStateList);
    }

    public final void i() {
        k kVarY = E().y(new b(-G()));
        this.f18040m = kVarY;
        this.f18045r.d(kVarY, this.f18029a.f18062k, v(), this.f18035h);
    }

    public void i0(ColorStateList colorStateList) {
        c cVar = this.f18029a;
        if (cVar.f18056e != colorStateList) {
            cVar.f18056e = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        this.f18032e = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.f18029a.f18058g;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.f18029a.f18057f;
        if (colorStateList2 != null && colorStateList2.isStateful()) {
            return true;
        }
        ColorStateList colorStateList3 = this.f18029a.f18056e;
        if (colorStateList3 != null && colorStateList3.isStateful()) {
            return true;
        }
        ColorStateList colorStateList4 = this.f18029a.f18055d;
        return colorStateList4 != null && colorStateList4.isStateful();
    }

    @NonNull
    public final PorterDuffColorFilter j(@NonNull ColorStateList colorStateList, @NonNull PorterDuff.Mode mode, boolean z10) {
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z10) {
            colorForState = l(colorForState);
        }
        this.f18048u = colorForState;
        return new PorterDuffColorFilter(colorForState, mode);
    }

    public void j0(float f10) {
        this.f18029a.f18063l = f10;
        invalidateSelf();
    }

    @NonNull
    public final PorterDuffColorFilter k(ColorStateList colorStateList, PorterDuff.Mode mode, @NonNull Paint paint, boolean z10) {
        return (colorStateList == null || mode == null) ? f(paint, z10) : j(colorStateList, mode, z10);
    }

    public final boolean k0(int[] iArr) {
        boolean z10;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.f18029a.f18055d == null || color2 == (colorForState2 = this.f18029a.f18055d.getColorForState(iArr, (color2 = this.f18041n.getColor())))) {
            z10 = false;
        } else {
            this.f18041n.setColor(colorForState2);
            z10 = true;
        }
        if (this.f18029a.f18056e == null || color == (colorForState = this.f18029a.f18056e.getColorForState(iArr, (color = this.f18042o.getColor())))) {
            return z10;
        }
        this.f18042o.setColor(colorForState);
        return true;
    }

    public int l(int i10) {
        float fM = M() + z();
        wc.a aVar = this.f18029a.b;
        return aVar != null ? aVar.c(i10, fM) : i10;
    }

    public final boolean l0() {
        PorterDuffColorFilter porterDuffColorFilter = this.f18046s;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f18047t;
        c cVar = this.f18029a;
        this.f18046s = k(cVar.f18058g, cVar.f18059h, this.f18041n, true);
        c cVar2 = this.f18029a;
        this.f18047t = k(cVar2.f18057f, cVar2.f18059h, this.f18042o, false);
        c cVar3 = this.f18029a;
        if (cVar3.f18072u) {
            this.f18043p.d(cVar3.f18058g.getColorForState(getState(), 0));
        }
        return (x2.b.a(porterDuffColorFilter, this.f18046s) && x2.b.a(porterDuffColorFilter2, this.f18047t)) ? false : true;
    }

    public final void m0() {
        float fM = M();
        this.f18029a.f18069r = (int) Math.ceil(0.75f * fM);
        this.f18029a.f18070s = (int) Math.ceil(fM * 0.25f);
        l0();
        R();
    }

    @Override // android.graphics.drawable.Drawable
    @NonNull
    public Drawable mutate() {
        this.f18029a = new c(this.f18029a);
        return this;
    }

    public final void n(@NonNull Canvas canvas) {
        if (this.f18031d.cardinality() > 0) {
            Log.w(f18027x, "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        if (this.f18029a.f18070s != 0) {
            canvas.drawPath(this.f18034g, this.f18043p.c());
        }
        for (int i10 = 0; i10 < 4; i10++) {
            this.b[i10].b(this.f18043p, this.f18029a.f18069r, canvas);
            this.f18030c[i10].b(this.f18043p, this.f18029a.f18069r, canvas);
        }
        if (this.f18050w) {
            int iB = B();
            int iC = C();
            canvas.translate(-iB, -iC);
            canvas.drawPath(this.f18034g, f18028y);
            canvas.translate(iB, iC);
        }
    }

    public final void o(@NonNull Canvas canvas) {
        q(canvas, this.f18041n, this.f18034g, this.f18029a.f18053a, u());
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.f18032e = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable, zc.m.b
    public boolean onStateChange(int[] iArr) {
        boolean z10 = k0(iArr) || l0();
        if (z10) {
            invalidateSelf();
        }
        return z10;
    }

    public void p(@NonNull Canvas canvas, @NonNull Paint paint, @NonNull Path path, @NonNull RectF rectF) {
        q(canvas, paint, path, this.f18029a.f18053a, rectF);
    }

    public final void q(@NonNull Canvas canvas, @NonNull Paint paint, @NonNull Path path, @NonNull k kVar, @NonNull RectF rectF) {
        if (!kVar.u(rectF)) {
            canvas.drawPath(path, paint);
        } else {
            float fA = kVar.t().a(rectF) * this.f18029a.f18062k;
            canvas.drawRoundRect(rectF, fA, fA, paint);
        }
    }

    public void r(@NonNull Canvas canvas) {
        q(canvas, this.f18042o, this.f18035h, this.f18040m, v());
    }

    public float s() {
        return this.f18029a.f18053a.j().a(u());
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        c cVar = this.f18029a;
        if (cVar.f18064m != i10) {
            cVar.f18064m = i10;
            R();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f18029a.f18054c = colorFilter;
        R();
    }

    @Override // gd.n
    public void setShapeAppearanceModel(@NonNull k kVar) {
        this.f18029a.f18053a = kVar;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i10) {
        setTintList(ColorStateList.valueOf(i10));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f18029a.f18058g = colorStateList;
        l0();
        R();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        c cVar = this.f18029a;
        if (cVar.f18059h != mode) {
            cVar.f18059h = mode;
            l0();
            R();
        }
    }

    public float t() {
        return this.f18029a.f18053a.l().a(u());
    }

    @NonNull
    public RectF u() {
        this.f18036i.set(getBounds());
        return this.f18036i;
    }

    @NonNull
    public final RectF v() {
        this.f18037j.set(u());
        float fG = G();
        this.f18037j.inset(fG, fG);
        return this.f18037j;
    }

    public float w() {
        return this.f18029a.f18066o;
    }

    public ColorStateList x() {
        return this.f18029a.f18055d;
    }

    public float y() {
        return this.f18029a.f18062k;
    }

    public float z() {
        return this.f18029a.f18065n;
    }

    public g(@NonNull Context context, AttributeSet attributeSet, int i10, int i11) {
        this(k.e(context, attributeSet, i10, i11).m());
    }

    public g(@NonNull k kVar) {
        this(new c(kVar, null));
    }

    public g(@NonNull c cVar) {
        l lVar;
        this.b = new m.g[4];
        this.f18030c = new m.g[4];
        this.f18031d = new BitSet(8);
        this.f18033f = new Matrix();
        this.f18034g = new Path();
        this.f18035h = new Path();
        this.f18036i = new RectF();
        this.f18037j = new RectF();
        this.f18038k = new Region();
        this.f18039l = new Region();
        Paint paint = new Paint(1);
        this.f18041n = paint;
        Paint paint2 = new Paint(1);
        this.f18042o = paint2;
        this.f18043p = new fd.a();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            lVar = l.k();
        } else {
            lVar = new l();
        }
        this.f18045r = lVar;
        this.f18049v = new RectF();
        this.f18050w = true;
        this.f18029a = cVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        l0();
        k0(getState());
        this.f18044q = new a();
    }

    public static class c extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        public k f18053a;
        public wc.a b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ColorFilter f18054c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public ColorStateList f18055d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public ColorStateList f18056e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public ColorStateList f18057f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public ColorStateList f18058g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public PorterDuff.Mode f18059h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public Rect f18060i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public float f18061j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public float f18062k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public float f18063l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f18064m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public float f18065n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public float f18066o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public float f18067p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f18068q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f18069r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f18070s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f18071t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public boolean f18072u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Paint.Style f18073v;

        public c(@NonNull k kVar, wc.a aVar) {
            this.f18055d = null;
            this.f18056e = null;
            this.f18057f = null;
            this.f18058g = null;
            this.f18059h = PorterDuff.Mode.SRC_IN;
            this.f18060i = null;
            this.f18061j = 1.0f;
            this.f18062k = 1.0f;
            this.f18064m = 255;
            this.f18065n = 0.0f;
            this.f18066o = 0.0f;
            this.f18067p = 0.0f;
            this.f18068q = 0;
            this.f18069r = 0;
            this.f18070s = 0;
            this.f18071t = 0;
            this.f18072u = false;
            this.f18073v = Paint.Style.FILL_AND_STROKE;
            this.f18053a = kVar;
            this.b = aVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable() {
            g gVar = new g(this);
            gVar.f18032e = true;
            return gVar;
        }

        public c(@NonNull c cVar) {
            this.f18055d = null;
            this.f18056e = null;
            this.f18057f = null;
            this.f18058g = null;
            this.f18059h = PorterDuff.Mode.SRC_IN;
            this.f18060i = null;
            this.f18061j = 1.0f;
            this.f18062k = 1.0f;
            this.f18064m = 255;
            this.f18065n = 0.0f;
            this.f18066o = 0.0f;
            this.f18067p = 0.0f;
            this.f18068q = 0;
            this.f18069r = 0;
            this.f18070s = 0;
            this.f18071t = 0;
            this.f18072u = false;
            this.f18073v = Paint.Style.FILL_AND_STROKE;
            this.f18053a = cVar.f18053a;
            this.b = cVar.b;
            this.f18063l = cVar.f18063l;
            this.f18054c = cVar.f18054c;
            this.f18055d = cVar.f18055d;
            this.f18056e = cVar.f18056e;
            this.f18059h = cVar.f18059h;
            this.f18058g = cVar.f18058g;
            this.f18064m = cVar.f18064m;
            this.f18061j = cVar.f18061j;
            this.f18070s = cVar.f18070s;
            this.f18068q = cVar.f18068q;
            this.f18072u = cVar.f18072u;
            this.f18062k = cVar.f18062k;
            this.f18065n = cVar.f18065n;
            this.f18066o = cVar.f18066o;
            this.f18067p = cVar.f18067p;
            this.f18069r = cVar.f18069r;
            this.f18071t = cVar.f18071t;
            this.f18057f = cVar.f18057f;
            this.f18073v = cVar.f18073v;
            if (cVar.f18060i != null) {
                this.f18060i = new Rect(cVar.f18060i);
            }
        }
    }
}
