package id;

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
    public static final String f19378x = "g";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final Paint f19379y;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f19380a;
    public final m.g[] b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m.g[] f19381c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final BitSet f19382d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f19383e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Matrix f19384f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Path f19385g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Path f19386h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final RectF f19387i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final RectF f19388j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Region f19389k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Region f19390l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public k f19391m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Paint f19392n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Paint f19393o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final hd.a f19394p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NonNull
    public final l.b f19395q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final l f19396r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public PorterDuffColorFilter f19397s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public PorterDuffColorFilter f19398t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f19399u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NonNull
    public final RectF f19400v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f19401w;

    public class a implements l.b {
        public a() {
        }

        @Override // id.l.b
        public void a(@NonNull m mVar, Matrix matrix, int i10) {
            g.this.f19382d.set(i10 + 4, mVar.e());
            g.this.f19381c[i10] = mVar.f(matrix);
        }

        @Override // id.l.b
        public void b(@NonNull m mVar, Matrix matrix, int i10) {
            g.this.f19382d.set(i10, mVar.e());
            g.this.b[i10] = mVar.f(matrix);
        }
    }

    public class b implements k.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ float f19403a;

        public b(float f10) {
            this.f19403a = f10;
        }

        @Override // id.k.c
        @NonNull
        public id.c a(@NonNull id.c cVar) {
            return cVar instanceof i ? cVar : new id.b(this.f19403a, cVar);
        }
    }

    static {
        Paint paint = new Paint(1);
        f19379y = paint;
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
            colorStateList = ColorStateList.valueOf(vc.a.c(context, jc.b.f20300o, g.class.getSimpleName()));
        }
        g gVar = new g();
        gVar.Q(context);
        gVar.a0(colorStateList);
        gVar.Z(f10);
        return gVar;
    }

    public int A() {
        return this.f19399u;
    }

    public int B() {
        c cVar = this.f19380a;
        return (int) (((double) cVar.f19421s) * Math.sin(Math.toRadians(cVar.f19422t)));
    }

    public int C() {
        c cVar = this.f19380a;
        return (int) (((double) cVar.f19421s) * Math.cos(Math.toRadians(cVar.f19422t)));
    }

    public int D() {
        return this.f19380a.f19420r;
    }

    @NonNull
    public k E() {
        return this.f19380a.f19404a;
    }

    public ColorStateList F() {
        return this.f19380a.f19407e;
    }

    public final float G() {
        if (P()) {
            return this.f19393o.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    public float H() {
        return this.f19380a.f19414l;
    }

    public ColorStateList I() {
        return this.f19380a.f19409g;
    }

    public float J() {
        return this.f19380a.f19404a.r().a(u());
    }

    public float K() {
        return this.f19380a.f19404a.t().a(u());
    }

    public float L() {
        return this.f19380a.f19418p;
    }

    public float M() {
        return w() + L();
    }

    public final boolean N() {
        c cVar = this.f19380a;
        int i10 = cVar.f19419q;
        if (i10 == 1 || cVar.f19420r <= 0) {
            return false;
        }
        return i10 == 2 || X();
    }

    public final boolean O() {
        Paint.Style style = this.f19380a.f19424v;
        return style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL;
    }

    public final boolean P() {
        Paint.Style style = this.f19380a.f19424v;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f19393o.getStrokeWidth() > 0.0f;
    }

    public void Q(Context context) {
        this.f19380a.b = new yc.a(context);
        m0();
    }

    public final void R() {
        super.invalidateSelf();
    }

    public boolean S() {
        yc.a aVar = this.f19380a.b;
        return aVar != null && aVar.d();
    }

    public boolean T() {
        return this.f19380a.f19404a.u(u());
    }

    public final void U(@NonNull Canvas canvas) {
        if (N()) {
            canvas.save();
            W(canvas);
            if (!this.f19401w) {
                n(canvas);
                canvas.restore();
                return;
            }
            int iWidth = (int) (this.f19400v.width() - getBounds().width());
            int iHeight = (int) (this.f19400v.height() - getBounds().height());
            if (iWidth < 0 || iHeight < 0) {
                throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(((int) this.f19400v.width()) + (this.f19380a.f19420r * 2) + iWidth, ((int) this.f19400v.height()) + (this.f19380a.f19420r * 2) + iHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap);
            float f10 = (getBounds().left - this.f19380a.f19420r) - iWidth;
            float f11 = (getBounds().top - this.f19380a.f19420r) - iHeight;
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
        return (T() || this.f19385g.isConvex() || Build.VERSION.SDK_INT >= 29) ? false : true;
    }

    public void Y(@NonNull id.c cVar) {
        setShapeAppearanceModel(this.f19380a.f19404a.x(cVar));
    }

    public void Z(float f10) {
        c cVar = this.f19380a;
        if (cVar.f19417o != f10) {
            cVar.f19417o = f10;
            m0();
        }
    }

    public void a0(ColorStateList colorStateList) {
        c cVar = this.f19380a;
        if (cVar.f19406d != colorStateList) {
            cVar.f19406d = colorStateList;
            onStateChange(getState());
        }
    }

    public void b0(float f10) {
        c cVar = this.f19380a;
        if (cVar.f19413k != f10) {
            cVar.f19413k = f10;
            this.f19383e = true;
            invalidateSelf();
        }
    }

    public void c0(int i10, int i11, int i12, int i13) {
        c cVar = this.f19380a;
        if (cVar.f19411i == null) {
            cVar.f19411i = new Rect();
        }
        this.f19380a.f19411i.set(i10, i11, i12, i13);
        invalidateSelf();
    }

    public void d0(float f10) {
        c cVar = this.f19380a;
        if (cVar.f19416n != f10) {
            cVar.f19416n = f10;
            m0();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        this.f19392n.setColorFilter(this.f19397s);
        int alpha = this.f19392n.getAlpha();
        this.f19392n.setAlpha(V(alpha, this.f19380a.f19415m));
        this.f19393o.setColorFilter(this.f19398t);
        this.f19393o.setStrokeWidth(this.f19380a.f19414l);
        int alpha2 = this.f19393o.getAlpha();
        this.f19393o.setAlpha(V(alpha2, this.f19380a.f19415m));
        if (this.f19383e) {
            i();
            g(u(), this.f19385g);
            this.f19383e = false;
        }
        U(canvas);
        if (O()) {
            o(canvas);
        }
        if (P()) {
            r(canvas);
        }
        this.f19392n.setAlpha(alpha);
        this.f19393o.setAlpha(alpha2);
    }

    public void e0(boolean z10) {
        this.f19401w = z10;
    }

    public final PorterDuffColorFilter f(@NonNull Paint paint, boolean z10) {
        if (!z10) {
            return null;
        }
        int color = paint.getColor();
        int iL = l(color);
        this.f19399u = iL;
        if (iL != color) {
            return new PorterDuffColorFilter(iL, PorterDuff.Mode.SRC_IN);
        }
        return null;
    }

    public void f0(int i10) {
        this.f19394p.d(i10);
        this.f19380a.f19423u = false;
        R();
    }

    public final void g(@NonNull RectF rectF, @NonNull Path path) {
        h(rectF, path);
        if (this.f19380a.f19412j != 1.0f) {
            this.f19384f.reset();
            Matrix matrix = this.f19384f;
            float f10 = this.f19380a.f19412j;
            matrix.setScale(f10, f10, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.f19384f);
        }
        path.computeBounds(this.f19400v, true);
    }

    public void g0(float f10, int i10) {
        j0(f10);
        i0(ColorStateList.valueOf(i10));
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f19380a.f19415m;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f19380a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(@NonNull Outline outline) {
        if (this.f19380a.f19419q == 2) {
            return;
        }
        if (T()) {
            outline.setRoundRect(getBounds(), J() * this.f19380a.f19413k);
        } else {
            g(u(), this.f19385g);
            xc.c.k(outline, this.f19385g);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(@NonNull Rect rect) {
        Rect rect2 = this.f19380a.f19411i;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        this.f19389k.set(getBounds());
        g(u(), this.f19385g);
        this.f19390l.setPath(this.f19385g, this.f19389k);
        this.f19389k.op(this.f19390l, Region.Op.DIFFERENCE);
        return this.f19389k;
    }

    public final void h(@NonNull RectF rectF, @NonNull Path path) {
        l lVar = this.f19396r;
        c cVar = this.f19380a;
        lVar.e(cVar.f19404a, cVar.f19413k, rectF, this.f19395q, path);
    }

    public void h0(float f10, ColorStateList colorStateList) {
        j0(f10);
        i0(colorStateList);
    }

    public final void i() {
        k kVarY = E().y(new b(-G()));
        this.f19391m = kVarY;
        this.f19396r.d(kVarY, this.f19380a.f19413k, v(), this.f19386h);
    }

    public void i0(ColorStateList colorStateList) {
        c cVar = this.f19380a;
        if (cVar.f19407e != colorStateList) {
            cVar.f19407e = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        this.f19383e = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.f19380a.f19409g;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.f19380a.f19408f;
        if (colorStateList2 != null && colorStateList2.isStateful()) {
            return true;
        }
        ColorStateList colorStateList3 = this.f19380a.f19407e;
        if (colorStateList3 != null && colorStateList3.isStateful()) {
            return true;
        }
        ColorStateList colorStateList4 = this.f19380a.f19406d;
        return colorStateList4 != null && colorStateList4.isStateful();
    }

    @NonNull
    public final PorterDuffColorFilter j(@NonNull ColorStateList colorStateList, @NonNull PorterDuff.Mode mode, boolean z10) {
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z10) {
            colorForState = l(colorForState);
        }
        this.f19399u = colorForState;
        return new PorterDuffColorFilter(colorForState, mode);
    }

    public void j0(float f10) {
        this.f19380a.f19414l = f10;
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
        if (this.f19380a.f19406d == null || color2 == (colorForState2 = this.f19380a.f19406d.getColorForState(iArr, (color2 = this.f19392n.getColor())))) {
            z10 = false;
        } else {
            this.f19392n.setColor(colorForState2);
            z10 = true;
        }
        if (this.f19380a.f19407e == null || color == (colorForState = this.f19380a.f19407e.getColorForState(iArr, (color = this.f19393o.getColor())))) {
            return z10;
        }
        this.f19393o.setColor(colorForState);
        return true;
    }

    public int l(int i10) {
        float fM = M() + z();
        yc.a aVar = this.f19380a.b;
        return aVar != null ? aVar.c(i10, fM) : i10;
    }

    public final boolean l0() {
        PorterDuffColorFilter porterDuffColorFilter = this.f19397s;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f19398t;
        c cVar = this.f19380a;
        this.f19397s = k(cVar.f19409g, cVar.f19410h, this.f19392n, true);
        c cVar2 = this.f19380a;
        this.f19398t = k(cVar2.f19408f, cVar2.f19410h, this.f19393o, false);
        c cVar3 = this.f19380a;
        if (cVar3.f19423u) {
            this.f19394p.d(cVar3.f19409g.getColorForState(getState(), 0));
        }
        return (x2.b.a(porterDuffColorFilter, this.f19397s) && x2.b.a(porterDuffColorFilter2, this.f19398t)) ? false : true;
    }

    public final void m0() {
        float fM = M();
        this.f19380a.f19420r = (int) Math.ceil(0.75f * fM);
        this.f19380a.f19421s = (int) Math.ceil(fM * 0.25f);
        l0();
        R();
    }

    @Override // android.graphics.drawable.Drawable
    @NonNull
    public Drawable mutate() {
        this.f19380a = new c(this.f19380a);
        return this;
    }

    public final void n(@NonNull Canvas canvas) {
        if (this.f19382d.cardinality() > 0) {
            Log.w(f19378x, "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        if (this.f19380a.f19421s != 0) {
            canvas.drawPath(this.f19385g, this.f19394p.c());
        }
        for (int i10 = 0; i10 < 4; i10++) {
            this.b[i10].b(this.f19394p, this.f19380a.f19420r, canvas);
            this.f19381c[i10].b(this.f19394p, this.f19380a.f19420r, canvas);
        }
        if (this.f19401w) {
            int iB = B();
            int iC = C();
            canvas.translate(-iB, -iC);
            canvas.drawPath(this.f19385g, f19379y);
            canvas.translate(iB, iC);
        }
    }

    public final void o(@NonNull Canvas canvas) {
        q(canvas, this.f19392n, this.f19385g, this.f19380a.f19404a, u());
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.f19383e = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable, bd.m.b
    public boolean onStateChange(int[] iArr) {
        boolean z10 = k0(iArr) || l0();
        if (z10) {
            invalidateSelf();
        }
        return z10;
    }

    public void p(@NonNull Canvas canvas, @NonNull Paint paint, @NonNull Path path, @NonNull RectF rectF) {
        q(canvas, paint, path, this.f19380a.f19404a, rectF);
    }

    public final void q(@NonNull Canvas canvas, @NonNull Paint paint, @NonNull Path path, @NonNull k kVar, @NonNull RectF rectF) {
        if (!kVar.u(rectF)) {
            canvas.drawPath(path, paint);
        } else {
            float fA = kVar.t().a(rectF) * this.f19380a.f19413k;
            canvas.drawRoundRect(rectF, fA, fA, paint);
        }
    }

    public void r(@NonNull Canvas canvas) {
        q(canvas, this.f19393o, this.f19386h, this.f19391m, v());
    }

    public float s() {
        return this.f19380a.f19404a.j().a(u());
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        c cVar = this.f19380a;
        if (cVar.f19415m != i10) {
            cVar.f19415m = i10;
            R();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f19380a.f19405c = colorFilter;
        R();
    }

    @Override // id.n
    public void setShapeAppearanceModel(@NonNull k kVar) {
        this.f19380a.f19404a = kVar;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i10) {
        setTintList(ColorStateList.valueOf(i10));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f19380a.f19409g = colorStateList;
        l0();
        R();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        c cVar = this.f19380a;
        if (cVar.f19410h != mode) {
            cVar.f19410h = mode;
            l0();
            R();
        }
    }

    public float t() {
        return this.f19380a.f19404a.l().a(u());
    }

    @NonNull
    public RectF u() {
        this.f19387i.set(getBounds());
        return this.f19387i;
    }

    @NonNull
    public final RectF v() {
        this.f19388j.set(u());
        float fG = G();
        this.f19388j.inset(fG, fG);
        return this.f19388j;
    }

    public float w() {
        return this.f19380a.f19417o;
    }

    public ColorStateList x() {
        return this.f19380a.f19406d;
    }

    public float y() {
        return this.f19380a.f19413k;
    }

    public float z() {
        return this.f19380a.f19416n;
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
        this.f19381c = new m.g[4];
        this.f19382d = new BitSet(8);
        this.f19384f = new Matrix();
        this.f19385g = new Path();
        this.f19386h = new Path();
        this.f19387i = new RectF();
        this.f19388j = new RectF();
        this.f19389k = new Region();
        this.f19390l = new Region();
        Paint paint = new Paint(1);
        this.f19392n = paint;
        Paint paint2 = new Paint(1);
        this.f19393o = paint2;
        this.f19394p = new hd.a();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            lVar = l.k();
        } else {
            lVar = new l();
        }
        this.f19396r = lVar;
        this.f19400v = new RectF();
        this.f19401w = true;
        this.f19380a = cVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        l0();
        k0(getState());
        this.f19395q = new a();
    }

    public static class c extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        public k f19404a;
        public yc.a b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ColorFilter f19405c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public ColorStateList f19406d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public ColorStateList f19407e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public ColorStateList f19408f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public ColorStateList f19409g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public PorterDuff.Mode f19410h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public Rect f19411i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public float f19412j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public float f19413k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public float f19414l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f19415m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public float f19416n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public float f19417o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public float f19418p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f19419q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f19420r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f19421s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f19422t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public boolean f19423u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Paint.Style f19424v;

        public c(@NonNull k kVar, yc.a aVar) {
            this.f19406d = null;
            this.f19407e = null;
            this.f19408f = null;
            this.f19409g = null;
            this.f19410h = PorterDuff.Mode.SRC_IN;
            this.f19411i = null;
            this.f19412j = 1.0f;
            this.f19413k = 1.0f;
            this.f19415m = 255;
            this.f19416n = 0.0f;
            this.f19417o = 0.0f;
            this.f19418p = 0.0f;
            this.f19419q = 0;
            this.f19420r = 0;
            this.f19421s = 0;
            this.f19422t = 0;
            this.f19423u = false;
            this.f19424v = Paint.Style.FILL_AND_STROKE;
            this.f19404a = kVar;
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
            gVar.f19383e = true;
            return gVar;
        }

        public c(@NonNull c cVar) {
            this.f19406d = null;
            this.f19407e = null;
            this.f19408f = null;
            this.f19409g = null;
            this.f19410h = PorterDuff.Mode.SRC_IN;
            this.f19411i = null;
            this.f19412j = 1.0f;
            this.f19413k = 1.0f;
            this.f19415m = 255;
            this.f19416n = 0.0f;
            this.f19417o = 0.0f;
            this.f19418p = 0.0f;
            this.f19419q = 0;
            this.f19420r = 0;
            this.f19421s = 0;
            this.f19422t = 0;
            this.f19423u = false;
            this.f19424v = Paint.Style.FILL_AND_STROKE;
            this.f19404a = cVar.f19404a;
            this.b = cVar.b;
            this.f19414l = cVar.f19414l;
            this.f19405c = cVar.f19405c;
            this.f19406d = cVar.f19406d;
            this.f19407e = cVar.f19407e;
            this.f19410h = cVar.f19410h;
            this.f19409g = cVar.f19409g;
            this.f19415m = cVar.f19415m;
            this.f19412j = cVar.f19412j;
            this.f19421s = cVar.f19421s;
            this.f19419q = cVar.f19419q;
            this.f19423u = cVar.f19423u;
            this.f19413k = cVar.f19413k;
            this.f19416n = cVar.f19416n;
            this.f19417o = cVar.f19417o;
            this.f19418p = cVar.f19418p;
            this.f19420r = cVar.f19420r;
            this.f19422t = cVar.f19422t;
            this.f19408f = cVar.f19408f;
            this.f19424v = cVar.f19424v;
            if (cVar.f19411i != null) {
                this.f19411i = new Rect(cVar.f19411i);
            }
        }
    }
}
