package hd;

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
    public static final String f19281x = "g";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final Paint f19282y;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f19283a;
    public final m.g[] b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m.g[] f19284c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final BitSet f19285d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f19286e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Matrix f19287f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Path f19288g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Path f19289h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final RectF f19290i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final RectF f19291j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Region f19292k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Region f19293l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public k f19294m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Paint f19295n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Paint f19296o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final gd.a f19297p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NonNull
    public final l.b f19298q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final l f19299r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public PorterDuffColorFilter f19300s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public PorterDuffColorFilter f19301t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f19302u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NonNull
    public final RectF f19303v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f19304w;

    public class a implements l.b {
        public a() {
        }

        @Override // hd.l.b
        public void a(@NonNull m mVar, Matrix matrix, int i10) {
            g.this.f19285d.set(i10 + 4, mVar.e());
            g.this.f19284c[i10] = mVar.f(matrix);
        }

        @Override // hd.l.b
        public void b(@NonNull m mVar, Matrix matrix, int i10) {
            g.this.f19285d.set(i10, mVar.e());
            g.this.b[i10] = mVar.f(matrix);
        }
    }

    public class b implements k.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ float f19306a;

        public b(float f10) {
            this.f19306a = f10;
        }

        @Override // hd.k.c
        @NonNull
        public hd.c a(@NonNull hd.c cVar) {
            return cVar instanceof i ? cVar : new hd.b(this.f19306a, cVar);
        }
    }

    static {
        Paint paint = new Paint(1);
        f19282y = paint;
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
            colorStateList = ColorStateList.valueOf(uc.a.c(context, ic.b.f20612o, g.class.getSimpleName()));
        }
        g gVar = new g();
        gVar.Q(context);
        gVar.a0(colorStateList);
        gVar.Z(f10);
        return gVar;
    }

    public int A() {
        return this.f19302u;
    }

    public int B() {
        c cVar = this.f19283a;
        return (int) (((double) cVar.f19324s) * Math.sin(Math.toRadians(cVar.f19325t)));
    }

    public int C() {
        c cVar = this.f19283a;
        return (int) (((double) cVar.f19324s) * Math.cos(Math.toRadians(cVar.f19325t)));
    }

    public int D() {
        return this.f19283a.f19323r;
    }

    @NonNull
    public k E() {
        return this.f19283a.f19307a;
    }

    public ColorStateList F() {
        return this.f19283a.f19310e;
    }

    public final float G() {
        if (P()) {
            return this.f19296o.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    public float H() {
        return this.f19283a.f19317l;
    }

    public ColorStateList I() {
        return this.f19283a.f19312g;
    }

    public float J() {
        return this.f19283a.f19307a.r().a(u());
    }

    public float K() {
        return this.f19283a.f19307a.t().a(u());
    }

    public float L() {
        return this.f19283a.f19321p;
    }

    public float M() {
        return w() + L();
    }

    public final boolean N() {
        c cVar = this.f19283a;
        int i10 = cVar.f19322q;
        if (i10 == 1 || cVar.f19323r <= 0) {
            return false;
        }
        return i10 == 2 || X();
    }

    public final boolean O() {
        Paint.Style style = this.f19283a.f19327v;
        return style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL;
    }

    public final boolean P() {
        Paint.Style style = this.f19283a.f19327v;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f19296o.getStrokeWidth() > 0.0f;
    }

    public void Q(Context context) {
        this.f19283a.b = new xc.a(context);
        m0();
    }

    public final void R() {
        super.invalidateSelf();
    }

    public boolean S() {
        xc.a aVar = this.f19283a.b;
        return aVar != null && aVar.d();
    }

    public boolean T() {
        return this.f19283a.f19307a.u(u());
    }

    public final void U(@NonNull Canvas canvas) {
        if (N()) {
            canvas.save();
            W(canvas);
            if (!this.f19304w) {
                n(canvas);
                canvas.restore();
                return;
            }
            int iWidth = (int) (this.f19303v.width() - getBounds().width());
            int iHeight = (int) (this.f19303v.height() - getBounds().height());
            if (iWidth < 0 || iHeight < 0) {
                throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(((int) this.f19303v.width()) + (this.f19283a.f19323r * 2) + iWidth, ((int) this.f19303v.height()) + (this.f19283a.f19323r * 2) + iHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap);
            float f10 = (getBounds().left - this.f19283a.f19323r) - iWidth;
            float f11 = (getBounds().top - this.f19283a.f19323r) - iHeight;
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
        return (T() || this.f19288g.isConvex() || Build.VERSION.SDK_INT >= 29) ? false : true;
    }

    public void Y(@NonNull hd.c cVar) {
        setShapeAppearanceModel(this.f19283a.f19307a.x(cVar));
    }

    public void Z(float f10) {
        c cVar = this.f19283a;
        if (cVar.f19320o != f10) {
            cVar.f19320o = f10;
            m0();
        }
    }

    public void a0(ColorStateList colorStateList) {
        c cVar = this.f19283a;
        if (cVar.f19309d != colorStateList) {
            cVar.f19309d = colorStateList;
            onStateChange(getState());
        }
    }

    public void b0(float f10) {
        c cVar = this.f19283a;
        if (cVar.f19316k != f10) {
            cVar.f19316k = f10;
            this.f19286e = true;
            invalidateSelf();
        }
    }

    public void c0(int i10, int i11, int i12, int i13) {
        c cVar = this.f19283a;
        if (cVar.f19314i == null) {
            cVar.f19314i = new Rect();
        }
        this.f19283a.f19314i.set(i10, i11, i12, i13);
        invalidateSelf();
    }

    public void d0(float f10) {
        c cVar = this.f19283a;
        if (cVar.f19319n != f10) {
            cVar.f19319n = f10;
            m0();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        this.f19295n.setColorFilter(this.f19300s);
        int alpha = this.f19295n.getAlpha();
        this.f19295n.setAlpha(V(alpha, this.f19283a.f19318m));
        this.f19296o.setColorFilter(this.f19301t);
        this.f19296o.setStrokeWidth(this.f19283a.f19317l);
        int alpha2 = this.f19296o.getAlpha();
        this.f19296o.setAlpha(V(alpha2, this.f19283a.f19318m));
        if (this.f19286e) {
            i();
            g(u(), this.f19288g);
            this.f19286e = false;
        }
        U(canvas);
        if (O()) {
            o(canvas);
        }
        if (P()) {
            r(canvas);
        }
        this.f19295n.setAlpha(alpha);
        this.f19296o.setAlpha(alpha2);
    }

    public void e0(boolean z10) {
        this.f19304w = z10;
    }

    public final PorterDuffColorFilter f(@NonNull Paint paint, boolean z10) {
        if (!z10) {
            return null;
        }
        int color = paint.getColor();
        int iL = l(color);
        this.f19302u = iL;
        if (iL != color) {
            return new PorterDuffColorFilter(iL, PorterDuff.Mode.SRC_IN);
        }
        return null;
    }

    public void f0(int i10) {
        this.f19297p.d(i10);
        this.f19283a.f19326u = false;
        R();
    }

    public final void g(@NonNull RectF rectF, @NonNull Path path) {
        h(rectF, path);
        if (this.f19283a.f19315j != 1.0f) {
            this.f19287f.reset();
            Matrix matrix = this.f19287f;
            float f10 = this.f19283a.f19315j;
            matrix.setScale(f10, f10, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.f19287f);
        }
        path.computeBounds(this.f19303v, true);
    }

    public void g0(float f10, int i10) {
        j0(f10);
        i0(ColorStateList.valueOf(i10));
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f19283a.f19318m;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f19283a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(@NonNull Outline outline) {
        if (this.f19283a.f19322q == 2) {
            return;
        }
        if (T()) {
            outline.setRoundRect(getBounds(), J() * this.f19283a.f19316k);
        } else {
            g(u(), this.f19288g);
            wc.c.k(outline, this.f19288g);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(@NonNull Rect rect) {
        Rect rect2 = this.f19283a.f19314i;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        this.f19292k.set(getBounds());
        g(u(), this.f19288g);
        this.f19293l.setPath(this.f19288g, this.f19292k);
        this.f19292k.op(this.f19293l, Region.Op.DIFFERENCE);
        return this.f19292k;
    }

    public final void h(@NonNull RectF rectF, @NonNull Path path) {
        l lVar = this.f19299r;
        c cVar = this.f19283a;
        lVar.e(cVar.f19307a, cVar.f19316k, rectF, this.f19298q, path);
    }

    public void h0(float f10, ColorStateList colorStateList) {
        j0(f10);
        i0(colorStateList);
    }

    public final void i() {
        k kVarY = E().y(new b(-G()));
        this.f19294m = kVarY;
        this.f19299r.d(kVarY, this.f19283a.f19316k, v(), this.f19289h);
    }

    public void i0(ColorStateList colorStateList) {
        c cVar = this.f19283a;
        if (cVar.f19310e != colorStateList) {
            cVar.f19310e = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        this.f19286e = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.f19283a.f19312g;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.f19283a.f19311f;
        if (colorStateList2 != null && colorStateList2.isStateful()) {
            return true;
        }
        ColorStateList colorStateList3 = this.f19283a.f19310e;
        if (colorStateList3 != null && colorStateList3.isStateful()) {
            return true;
        }
        ColorStateList colorStateList4 = this.f19283a.f19309d;
        return colorStateList4 != null && colorStateList4.isStateful();
    }

    @NonNull
    public final PorterDuffColorFilter j(@NonNull ColorStateList colorStateList, @NonNull PorterDuff.Mode mode, boolean z10) {
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z10) {
            colorForState = l(colorForState);
        }
        this.f19302u = colorForState;
        return new PorterDuffColorFilter(colorForState, mode);
    }

    public void j0(float f10) {
        this.f19283a.f19317l = f10;
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
        if (this.f19283a.f19309d == null || color2 == (colorForState2 = this.f19283a.f19309d.getColorForState(iArr, (color2 = this.f19295n.getColor())))) {
            z10 = false;
        } else {
            this.f19295n.setColor(colorForState2);
            z10 = true;
        }
        if (this.f19283a.f19310e == null || color == (colorForState = this.f19283a.f19310e.getColorForState(iArr, (color = this.f19296o.getColor())))) {
            return z10;
        }
        this.f19296o.setColor(colorForState);
        return true;
    }

    public int l(int i10) {
        float fM = M() + z();
        xc.a aVar = this.f19283a.b;
        return aVar != null ? aVar.c(i10, fM) : i10;
    }

    public final boolean l0() {
        PorterDuffColorFilter porterDuffColorFilter = this.f19300s;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f19301t;
        c cVar = this.f19283a;
        this.f19300s = k(cVar.f19312g, cVar.f19313h, this.f19295n, true);
        c cVar2 = this.f19283a;
        this.f19301t = k(cVar2.f19311f, cVar2.f19313h, this.f19296o, false);
        c cVar3 = this.f19283a;
        if (cVar3.f19326u) {
            this.f19297p.d(cVar3.f19312g.getColorForState(getState(), 0));
        }
        return (x2.b.a(porterDuffColorFilter, this.f19300s) && x2.b.a(porterDuffColorFilter2, this.f19301t)) ? false : true;
    }

    public final void m0() {
        float fM = M();
        this.f19283a.f19323r = (int) Math.ceil(0.75f * fM);
        this.f19283a.f19324s = (int) Math.ceil(fM * 0.25f);
        l0();
        R();
    }

    @Override // android.graphics.drawable.Drawable
    @NonNull
    public Drawable mutate() {
        this.f19283a = new c(this.f19283a);
        return this;
    }

    public final void n(@NonNull Canvas canvas) {
        if (this.f19285d.cardinality() > 0) {
            Log.w(f19281x, "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        if (this.f19283a.f19324s != 0) {
            canvas.drawPath(this.f19288g, this.f19297p.c());
        }
        for (int i10 = 0; i10 < 4; i10++) {
            this.b[i10].b(this.f19297p, this.f19283a.f19323r, canvas);
            this.f19284c[i10].b(this.f19297p, this.f19283a.f19323r, canvas);
        }
        if (this.f19304w) {
            int iB = B();
            int iC = C();
            canvas.translate(-iB, -iC);
            canvas.drawPath(this.f19288g, f19282y);
            canvas.translate(iB, iC);
        }
    }

    public final void o(@NonNull Canvas canvas) {
        q(canvas, this.f19295n, this.f19288g, this.f19283a.f19307a, u());
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.f19286e = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable, ad.m.b
    public boolean onStateChange(int[] iArr) {
        boolean z10 = k0(iArr) || l0();
        if (z10) {
            invalidateSelf();
        }
        return z10;
    }

    public void p(@NonNull Canvas canvas, @NonNull Paint paint, @NonNull Path path, @NonNull RectF rectF) {
        q(canvas, paint, path, this.f19283a.f19307a, rectF);
    }

    public final void q(@NonNull Canvas canvas, @NonNull Paint paint, @NonNull Path path, @NonNull k kVar, @NonNull RectF rectF) {
        if (!kVar.u(rectF)) {
            canvas.drawPath(path, paint);
        } else {
            float fA = kVar.t().a(rectF) * this.f19283a.f19316k;
            canvas.drawRoundRect(rectF, fA, fA, paint);
        }
    }

    public void r(@NonNull Canvas canvas) {
        q(canvas, this.f19296o, this.f19289h, this.f19294m, v());
    }

    public float s() {
        return this.f19283a.f19307a.j().a(u());
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        c cVar = this.f19283a;
        if (cVar.f19318m != i10) {
            cVar.f19318m = i10;
            R();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f19283a.f19308c = colorFilter;
        R();
    }

    @Override // hd.n
    public void setShapeAppearanceModel(@NonNull k kVar) {
        this.f19283a.f19307a = kVar;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i10) {
        setTintList(ColorStateList.valueOf(i10));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f19283a.f19312g = colorStateList;
        l0();
        R();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        c cVar = this.f19283a;
        if (cVar.f19313h != mode) {
            cVar.f19313h = mode;
            l0();
            R();
        }
    }

    public float t() {
        return this.f19283a.f19307a.l().a(u());
    }

    @NonNull
    public RectF u() {
        this.f19290i.set(getBounds());
        return this.f19290i;
    }

    @NonNull
    public final RectF v() {
        this.f19291j.set(u());
        float fG = G();
        this.f19291j.inset(fG, fG);
        return this.f19291j;
    }

    public float w() {
        return this.f19283a.f19320o;
    }

    public ColorStateList x() {
        return this.f19283a.f19309d;
    }

    public float y() {
        return this.f19283a.f19316k;
    }

    public float z() {
        return this.f19283a.f19319n;
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
        this.f19284c = new m.g[4];
        this.f19285d = new BitSet(8);
        this.f19287f = new Matrix();
        this.f19288g = new Path();
        this.f19289h = new Path();
        this.f19290i = new RectF();
        this.f19291j = new RectF();
        this.f19292k = new Region();
        this.f19293l = new Region();
        Paint paint = new Paint(1);
        this.f19295n = paint;
        Paint paint2 = new Paint(1);
        this.f19296o = paint2;
        this.f19297p = new gd.a();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            lVar = l.k();
        } else {
            lVar = new l();
        }
        this.f19299r = lVar;
        this.f19303v = new RectF();
        this.f19304w = true;
        this.f19283a = cVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        l0();
        k0(getState());
        this.f19298q = new a();
    }

    public static class c extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        public k f19307a;
        public xc.a b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ColorFilter f19308c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public ColorStateList f19309d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public ColorStateList f19310e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public ColorStateList f19311f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public ColorStateList f19312g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public PorterDuff.Mode f19313h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public Rect f19314i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public float f19315j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public float f19316k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public float f19317l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f19318m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public float f19319n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public float f19320o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public float f19321p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f19322q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f19323r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f19324s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f19325t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public boolean f19326u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Paint.Style f19327v;

        public c(@NonNull k kVar, xc.a aVar) {
            this.f19309d = null;
            this.f19310e = null;
            this.f19311f = null;
            this.f19312g = null;
            this.f19313h = PorterDuff.Mode.SRC_IN;
            this.f19314i = null;
            this.f19315j = 1.0f;
            this.f19316k = 1.0f;
            this.f19318m = 255;
            this.f19319n = 0.0f;
            this.f19320o = 0.0f;
            this.f19321p = 0.0f;
            this.f19322q = 0;
            this.f19323r = 0;
            this.f19324s = 0;
            this.f19325t = 0;
            this.f19326u = false;
            this.f19327v = Paint.Style.FILL_AND_STROKE;
            this.f19307a = kVar;
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
            gVar.f19286e = true;
            return gVar;
        }

        public c(@NonNull c cVar) {
            this.f19309d = null;
            this.f19310e = null;
            this.f19311f = null;
            this.f19312g = null;
            this.f19313h = PorterDuff.Mode.SRC_IN;
            this.f19314i = null;
            this.f19315j = 1.0f;
            this.f19316k = 1.0f;
            this.f19318m = 255;
            this.f19319n = 0.0f;
            this.f19320o = 0.0f;
            this.f19321p = 0.0f;
            this.f19322q = 0;
            this.f19323r = 0;
            this.f19324s = 0;
            this.f19325t = 0;
            this.f19326u = false;
            this.f19327v = Paint.Style.FILL_AND_STROKE;
            this.f19307a = cVar.f19307a;
            this.b = cVar.b;
            this.f19317l = cVar.f19317l;
            this.f19308c = cVar.f19308c;
            this.f19309d = cVar.f19309d;
            this.f19310e = cVar.f19310e;
            this.f19313h = cVar.f19313h;
            this.f19312g = cVar.f19312g;
            this.f19318m = cVar.f19318m;
            this.f19315j = cVar.f19315j;
            this.f19324s = cVar.f19324s;
            this.f19322q = cVar.f19322q;
            this.f19326u = cVar.f19326u;
            this.f19316k = cVar.f19316k;
            this.f19319n = cVar.f19319n;
            this.f19320o = cVar.f19320o;
            this.f19321p = cVar.f19321p;
            this.f19323r = cVar.f19323r;
            this.f19325t = cVar.f19325t;
            this.f19311f = cVar.f19311f;
            this.f19327v = cVar.f19327v;
            if (cVar.f19314i != null) {
                this.f19314i = new Rect(cVar.f19314i);
            }
        }
    }
}
