package p168hd;

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
import gd.C6088a;
import java.util.BitSet;
import p194ic.C6738b;
import p463uc.C11840a;
import p513wc.C12348c;
import p533x2.C12632b;
import p542xc.C12779a;

/* JADX INFO: renamed from: hd.g */
/* JADX INFO: loaded from: classes2.dex */
public class C6363g extends Drawable implements InterfaceC6370n {

    /* JADX INFO: renamed from: x */
    public static final String f24121x = "g";

    /* JADX INFO: renamed from: y */
    public static final Paint f24122y;

    /* JADX INFO: renamed from: a */
    public c f24123a;

    /* JADX INFO: renamed from: b */
    public final C6369m.g[] f24124b;

    /* JADX INFO: renamed from: c */
    public final C6369m.g[] f24125c;

    /* JADX INFO: renamed from: d */
    public final BitSet f24126d;

    /* JADX INFO: renamed from: e */
    public boolean f24127e;

    /* JADX INFO: renamed from: f */
    public final Matrix f24128f;

    /* JADX INFO: renamed from: g */
    public final Path f24129g;

    /* JADX INFO: renamed from: h */
    public final Path f24130h;

    /* JADX INFO: renamed from: i */
    public final RectF f24131i;

    /* JADX INFO: renamed from: j */
    public final RectF f24132j;

    /* JADX INFO: renamed from: k */
    public final Region f24133k;

    /* JADX INFO: renamed from: l */
    public final Region f24134l;

    /* JADX INFO: renamed from: m */
    public C6367k f24135m;

    /* JADX INFO: renamed from: n */
    public final Paint f24136n;

    /* JADX INFO: renamed from: o */
    public final Paint f24137o;

    /* JADX INFO: renamed from: p */
    public final C6088a f24138p;

    /* JADX INFO: renamed from: q */
    @NonNull
    public final C6368l.b f24139q;

    /* JADX INFO: renamed from: r */
    public final C6368l f24140r;

    /* JADX INFO: renamed from: s */
    public PorterDuffColorFilter f24141s;

    /* JADX INFO: renamed from: t */
    public PorterDuffColorFilter f24142t;

    /* JADX INFO: renamed from: u */
    public int f24143u;

    /* JADX INFO: renamed from: v */
    @NonNull
    public final RectF f24144v;

    /* JADX INFO: renamed from: w */
    public boolean f24145w;

    /* JADX INFO: renamed from: hd.g$a */
    public class a implements C6368l.b {
        public a() {
        }

        @Override // p168hd.C6368l.b
        /* JADX INFO: renamed from: a */
        public void mo27752a(@NonNull C6369m c6369m, Matrix matrix, int i10) {
            C6363g.this.f24126d.set(i10 + 4, c6369m.m27837e());
            C6363g.this.f24125c[i10] = c6369m.m27838f(matrix);
        }

        @Override // p168hd.C6368l.b
        /* JADX INFO: renamed from: b */
        public void mo27753b(@NonNull C6369m c6369m, Matrix matrix, int i10) {
            C6363g.this.f24126d.set(i10, c6369m.m27837e());
            C6363g.this.f24124b[i10] = c6369m.m27838f(matrix);
        }
    }

    /* JADX INFO: renamed from: hd.g$b */
    public class b implements C6367k.c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ float f24147a;

        public b(float f10) {
            this.f24147a = f10;
        }

        @Override // p168hd.C6367k.c
        @NonNull
        /* JADX INFO: renamed from: a */
        public InterfaceC6359c mo27754a(@NonNull InterfaceC6359c interfaceC6359c) {
            return interfaceC6359c instanceof C6365i ? interfaceC6359c : new C6358b(this.f24147a, interfaceC6359c);
        }
    }

    static {
        Paint paint = new Paint(1);
        f24122y = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C6363g() {
        this(new C6367k());
    }

    /* JADX INFO: renamed from: V */
    public static int m27688V(int i10, int i11) {
        return (i10 * (i11 + (i11 >>> 7))) >>> 8;
    }

    @NonNull
    /* JADX INFO: renamed from: m */
    public static C6363g m27693m(@NonNull Context context, float f10, ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(C11840a.m44227c(context, C6738b.f25908o, C6363g.class.getSimpleName()));
        }
        C6363g c6363g = new C6363g();
        c6363g.m27710Q(context);
        c6363g.m27719a0(colorStateList);
        c6363g.m27718Z(f10);
        return c6363g;
    }

    /* JADX INFO: renamed from: A */
    public int m27694A() {
        return this.f24143u;
    }

    /* JADX INFO: renamed from: B */
    public int m27695B() {
        c cVar = this.f24123a;
        return (int) (((double) cVar.f24167s) * Math.sin(Math.toRadians(cVar.f24168t)));
    }

    /* JADX INFO: renamed from: C */
    public int m27696C() {
        c cVar = this.f24123a;
        return (int) (((double) cVar.f24167s) * Math.cos(Math.toRadians(cVar.f24168t)));
    }

    /* JADX INFO: renamed from: D */
    public int m27697D() {
        return this.f24123a.f24166r;
    }

    @NonNull
    /* JADX INFO: renamed from: E */
    public C6367k m27698E() {
        return this.f24123a.f24149a;
    }

    /* JADX INFO: renamed from: F */
    public ColorStateList m27699F() {
        return this.f24123a.f24153e;
    }

    /* JADX INFO: renamed from: G */
    public final float m27700G() {
        if (m27709P()) {
            return this.f24137o.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: H */
    public float m27701H() {
        return this.f24123a.f24160l;
    }

    /* JADX INFO: renamed from: I */
    public ColorStateList m27702I() {
        return this.f24123a.f24155g;
    }

    /* JADX INFO: renamed from: J */
    public float m27703J() {
        return this.f24123a.f24149a.m27779r().mo27683a(m27746u());
    }

    /* JADX INFO: renamed from: K */
    public float m27704K() {
        return this.f24123a.f24149a.m27781t().mo27683a(m27746u());
    }

    /* JADX INFO: renamed from: L */
    public float m27705L() {
        return this.f24123a.f24164p;
    }

    /* JADX INFO: renamed from: M */
    public float m27706M() {
        return m27748w() + m27705L();
    }

    /* JADX INFO: renamed from: N */
    public final boolean m27707N() {
        c cVar = this.f24123a;
        int i10 = cVar.f24165q;
        if (i10 == 1 || cVar.f24166r <= 0) {
            return false;
        }
        return i10 == 2 || m27716X();
    }

    /* JADX INFO: renamed from: O */
    public final boolean m27708O() {
        Paint.Style style = this.f24123a.f24170v;
        return style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL;
    }

    /* JADX INFO: renamed from: P */
    public final boolean m27709P() {
        Paint.Style style = this.f24123a.f24170v;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f24137o.getStrokeWidth() > 0.0f;
    }

    /* JADX INFO: renamed from: Q */
    public void m27710Q(Context context) {
        this.f24123a.f24150b = new C12779a(context);
        m27738m0();
    }

    /* JADX INFO: renamed from: R */
    public final void m27711R() {
        super.invalidateSelf();
    }

    /* JADX INFO: renamed from: S */
    public boolean m27712S() {
        C12779a c12779a = this.f24123a.f24150b;
        return c12779a != null && c12779a.m47642d();
    }

    /* JADX INFO: renamed from: T */
    public boolean m27713T() {
        return this.f24123a.f24149a.m27782u(m27746u());
    }

    /* JADX INFO: renamed from: U */
    public final void m27714U(@NonNull Canvas canvas) {
        if (m27707N()) {
            canvas.save();
            m27715W(canvas);
            if (!this.f24145w) {
                m27739n(canvas);
                canvas.restore();
                return;
            }
            int iWidth = (int) (this.f24144v.width() - getBounds().width());
            int iHeight = (int) (this.f24144v.height() - getBounds().height());
            if (iWidth < 0 || iHeight < 0) {
                throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(((int) this.f24144v.width()) + (this.f24123a.f24166r * 2) + iWidth, ((int) this.f24144v.height()) + (this.f24123a.f24166r * 2) + iHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap);
            float f10 = (getBounds().left - this.f24123a.f24166r) - iWidth;
            float f11 = (getBounds().top - this.f24123a.f24166r) - iHeight;
            canvas2.translate(-f10, -f11);
            m27739n(canvas2);
            canvas.drawBitmap(bitmapCreateBitmap, f10, f11, (Paint) null);
            bitmapCreateBitmap.recycle();
            canvas.restore();
        }
    }

    /* JADX INFO: renamed from: W */
    public final void m27715W(@NonNull Canvas canvas) {
        canvas.translate(m27695B(), m27696C());
    }

    /* JADX INFO: renamed from: X */
    public boolean m27716X() {
        return (m27713T() || this.f24129g.isConvex() || Build.VERSION.SDK_INT >= 29) ? false : true;
    }

    /* JADX INFO: renamed from: Y */
    public void m27717Y(@NonNull InterfaceC6359c interfaceC6359c) {
        setShapeAppearanceModel(this.f24123a.f24149a.m27785x(interfaceC6359c));
    }

    /* JADX INFO: renamed from: Z */
    public void m27718Z(float f10) {
        c cVar = this.f24123a;
        if (cVar.f24163o != f10) {
            cVar.f24163o = f10;
            m27738m0();
        }
    }

    /* JADX INFO: renamed from: a0 */
    public void m27719a0(ColorStateList colorStateList) {
        c cVar = this.f24123a;
        if (cVar.f24152d != colorStateList) {
            cVar.f24152d = colorStateList;
            onStateChange(getState());
        }
    }

    /* JADX INFO: renamed from: b0 */
    public void m27720b0(float f10) {
        c cVar = this.f24123a;
        if (cVar.f24159k != f10) {
            cVar.f24159k = f10;
            this.f24127e = true;
            invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: c0 */
    public void m27721c0(int i10, int i11, int i12, int i13) {
        c cVar = this.f24123a;
        if (cVar.f24157i == null) {
            cVar.f24157i = new Rect();
        }
        this.f24123a.f24157i.set(i10, i11, i12, i13);
        invalidateSelf();
    }

    /* JADX INFO: renamed from: d0 */
    public void m27722d0(float f10) {
        c cVar = this.f24123a;
        if (cVar.f24162n != f10) {
            cVar.f24162n = f10;
            m27738m0();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        this.f24136n.setColorFilter(this.f24141s);
        int alpha = this.f24136n.getAlpha();
        this.f24136n.setAlpha(m27688V(alpha, this.f24123a.f24161m));
        this.f24137o.setColorFilter(this.f24142t);
        this.f24137o.setStrokeWidth(this.f24123a.f24160l);
        int alpha2 = this.f24137o.getAlpha();
        this.f24137o.setAlpha(m27688V(alpha2, this.f24123a.f24161m));
        if (this.f24127e) {
            m27730i();
            m27726g(m27746u(), this.f24129g);
            this.f24127e = false;
        }
        m27714U(canvas);
        if (m27708O()) {
            m27740o(canvas);
        }
        if (m27709P()) {
            mo27743r(canvas);
        }
        this.f24136n.setAlpha(alpha);
        this.f24137o.setAlpha(alpha2);
    }

    /* JADX INFO: renamed from: e0 */
    public void m27723e0(boolean z10) {
        this.f24145w = z10;
    }

    /* JADX INFO: renamed from: f */
    public final PorterDuffColorFilter m27724f(@NonNull Paint paint, boolean z10) {
        if (!z10) {
            return null;
        }
        int color = paint.getColor();
        int iM27736l = m27736l(color);
        this.f24143u = iM27736l;
        if (iM27736l != color) {
            return new PorterDuffColorFilter(iM27736l, PorterDuff.Mode.SRC_IN);
        }
        return null;
    }

    /* JADX INFO: renamed from: f0 */
    public void m27725f0(int i10) {
        this.f24138p.m26957d(i10);
        this.f24123a.f24169u = false;
        m27711R();
    }

    /* JADX INFO: renamed from: g */
    public final void m27726g(@NonNull RectF rectF, @NonNull Path path) {
        m27728h(rectF, path);
        if (this.f24123a.f24158j != 1.0f) {
            this.f24128f.reset();
            Matrix matrix = this.f24128f;
            float f10 = this.f24123a.f24158j;
            matrix.setScale(f10, f10, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.f24128f);
        }
        path.computeBounds(this.f24144v, true);
    }

    /* JADX INFO: renamed from: g0 */
    public void m27727g0(float f10, int i10) {
        m27733j0(f10);
        m27731i0(ColorStateList.valueOf(i10));
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f24123a.f24161m;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f24123a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(@NonNull Outline outline) {
        if (this.f24123a.f24165q == 2) {
            return;
        }
        if (m27713T()) {
            outline.setRoundRect(getBounds(), m27703J() * this.f24123a.f24159k);
        } else {
            m27726g(m27746u(), this.f24129g);
            C12348c.m46212k(outline, this.f24129g);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(@NonNull Rect rect) {
        Rect rect2 = this.f24123a.f24157i;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        this.f24133k.set(getBounds());
        m27726g(m27746u(), this.f24129g);
        this.f24134l.setPath(this.f24129g, this.f24133k);
        this.f24133k.op(this.f24134l, Region.Op.DIFFERENCE);
        return this.f24133k;
    }

    /* JADX INFO: renamed from: h */
    public final void m27728h(@NonNull RectF rectF, @NonNull Path path) {
        C6368l c6368l = this.f24140r;
        c cVar = this.f24123a;
        c6368l.m27824e(cVar.f24149a, cVar.f24159k, rectF, this.f24139q, path);
    }

    /* JADX INFO: renamed from: h0 */
    public void m27729h0(float f10, ColorStateList colorStateList) {
        m27733j0(f10);
        m27731i0(colorStateList);
    }

    /* JADX INFO: renamed from: i */
    public final void m27730i() {
        C6367k c6367kM27786y = m27698E().m27786y(new b(-m27700G()));
        this.f24135m = c6367kM27786y;
        this.f24140r.m27823d(c6367kM27786y, this.f24123a.f24159k, m27747v(), this.f24130h);
    }

    /* JADX INFO: renamed from: i0 */
    public void m27731i0(ColorStateList colorStateList) {
        c cVar = this.f24123a;
        if (cVar.f24153e != colorStateList) {
            cVar.f24153e = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        this.f24127e = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.f24123a.f24155g;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.f24123a.f24154f;
        if (colorStateList2 != null && colorStateList2.isStateful()) {
            return true;
        }
        ColorStateList colorStateList3 = this.f24123a.f24153e;
        if (colorStateList3 != null && colorStateList3.isStateful()) {
            return true;
        }
        ColorStateList colorStateList4 = this.f24123a.f24152d;
        return colorStateList4 != null && colorStateList4.isStateful();
    }

    @NonNull
    /* JADX INFO: renamed from: j */
    public final PorterDuffColorFilter m27732j(@NonNull ColorStateList colorStateList, @NonNull PorterDuff.Mode mode, boolean z10) {
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z10) {
            colorForState = m27736l(colorForState);
        }
        this.f24143u = colorForState;
        return new PorterDuffColorFilter(colorForState, mode);
    }

    /* JADX INFO: renamed from: j0 */
    public void m27733j0(float f10) {
        this.f24123a.f24160l = f10;
        invalidateSelf();
    }

    @NonNull
    /* JADX INFO: renamed from: k */
    public final PorterDuffColorFilter m27734k(ColorStateList colorStateList, PorterDuff.Mode mode, @NonNull Paint paint, boolean z10) {
        return (colorStateList == null || mode == null) ? m27724f(paint, z10) : m27732j(colorStateList, mode, z10);
    }

    /* JADX INFO: renamed from: k0 */
    public final boolean m27735k0(int[] iArr) {
        boolean z10;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.f24123a.f24152d == null || color2 == (colorForState2 = this.f24123a.f24152d.getColorForState(iArr, (color2 = this.f24136n.getColor())))) {
            z10 = false;
        } else {
            this.f24136n.setColor(colorForState2);
            z10 = true;
        }
        if (this.f24123a.f24153e == null || color == (colorForState = this.f24123a.f24153e.getColorForState(iArr, (color = this.f24137o.getColor())))) {
            return z10;
        }
        this.f24137o.setColor(colorForState);
        return true;
    }

    /* JADX INFO: renamed from: l */
    public int m27736l(int i10) {
        float fM27706M = m27706M() + m27751z();
        C12779a c12779a = this.f24123a.f24150b;
        return c12779a != null ? c12779a.m47641c(i10, fM27706M) : i10;
    }

    /* JADX INFO: renamed from: l0 */
    public final boolean m27737l0() {
        PorterDuffColorFilter porterDuffColorFilter = this.f24141s;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f24142t;
        c cVar = this.f24123a;
        this.f24141s = m27734k(cVar.f24155g, cVar.f24156h, this.f24136n, true);
        c cVar2 = this.f24123a;
        this.f24142t = m27734k(cVar2.f24154f, cVar2.f24156h, this.f24137o, false);
        c cVar3 = this.f24123a;
        if (cVar3.f24169u) {
            this.f24138p.m26957d(cVar3.f24155g.getColorForState(getState(), 0));
        }
        return (C12632b.m47060a(porterDuffColorFilter, this.f24141s) && C12632b.m47060a(porterDuffColorFilter2, this.f24142t)) ? false : true;
    }

    /* JADX INFO: renamed from: m0 */
    public final void m27738m0() {
        float fM27706M = m27706M();
        this.f24123a.f24166r = (int) Math.ceil(0.75f * fM27706M);
        this.f24123a.f24167s = (int) Math.ceil(fM27706M * 0.25f);
        m27737l0();
        m27711R();
    }

    @Override // android.graphics.drawable.Drawable
    @NonNull
    public Drawable mutate() {
        this.f24123a = new c(this.f24123a);
        return this;
    }

    /* JADX INFO: renamed from: n */
    public final void m27739n(@NonNull Canvas canvas) {
        if (this.f24126d.cardinality() > 0) {
            Log.w(f24121x, "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        if (this.f24123a.f24167s != 0) {
            canvas.drawPath(this.f24129g, this.f24138p.m26956c());
        }
        for (int i10 = 0; i10 < 4; i10++) {
            this.f24124b[i10].m27881b(this.f24138p, this.f24123a.f24166r, canvas);
            this.f24125c[i10].m27881b(this.f24138p, this.f24123a.f24166r, canvas);
        }
        if (this.f24145w) {
            int iM27695B = m27695B();
            int iM27696C = m27696C();
            canvas.translate(-iM27695B, -iM27696C);
            canvas.drawPath(this.f24129g, f24122y);
            canvas.translate(iM27695B, iM27696C);
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m27740o(@NonNull Canvas canvas) {
        m27742q(canvas, this.f24136n, this.f24129g, this.f24123a.f24149a, m27746u());
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.f24127e = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable, ad.C0141m.b
    public boolean onStateChange(int[] iArr) {
        boolean z10 = m27735k0(iArr) || m27737l0();
        if (z10) {
            invalidateSelf();
        }
        return z10;
    }

    /* JADX INFO: renamed from: p */
    public void m27741p(@NonNull Canvas canvas, @NonNull Paint paint, @NonNull Path path, @NonNull RectF rectF) {
        m27742q(canvas, paint, path, this.f24123a.f24149a, rectF);
    }

    /* JADX INFO: renamed from: q */
    public final void m27742q(@NonNull Canvas canvas, @NonNull Paint paint, @NonNull Path path, @NonNull C6367k c6367k, @NonNull RectF rectF) {
        if (!c6367k.m27782u(rectF)) {
            canvas.drawPath(path, paint);
        } else {
            float fMo27683a = c6367k.m27781t().mo27683a(rectF) * this.f24123a.f24159k;
            canvas.drawRoundRect(rectF, fMo27683a, fMo27683a, paint);
        }
    }

    /* JADX INFO: renamed from: r */
    public void mo27743r(@NonNull Canvas canvas) {
        m27742q(canvas, this.f24137o, this.f24130h, this.f24135m, m27747v());
    }

    /* JADX INFO: renamed from: s */
    public float m27744s() {
        return this.f24123a.f24149a.m27772j().mo27683a(m27746u());
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        c cVar = this.f24123a;
        if (cVar.f24161m != i10) {
            cVar.f24161m = i10;
            m27711R();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f24123a.f24151c = colorFilter;
        m27711R();
    }

    @Override // p168hd.InterfaceC6370n
    public void setShapeAppearanceModel(@NonNull C6367k c6367k) {
        this.f24123a.f24149a = c6367k;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i10) {
        setTintList(ColorStateList.valueOf(i10));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f24123a.f24155g = colorStateList;
        m27737l0();
        m27711R();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        c cVar = this.f24123a;
        if (cVar.f24156h != mode) {
            cVar.f24156h = mode;
            m27737l0();
            m27711R();
        }
    }

    /* JADX INFO: renamed from: t */
    public float m27745t() {
        return this.f24123a.f24149a.m27774l().mo27683a(m27746u());
    }

    @NonNull
    /* JADX INFO: renamed from: u */
    public RectF m27746u() {
        this.f24131i.set(getBounds());
        return this.f24131i;
    }

    @NonNull
    /* JADX INFO: renamed from: v */
    public final RectF m27747v() {
        this.f24132j.set(m27746u());
        float fM27700G = m27700G();
        this.f24132j.inset(fM27700G, fM27700G);
        return this.f24132j;
    }

    /* JADX INFO: renamed from: w */
    public float m27748w() {
        return this.f24123a.f24163o;
    }

    /* JADX INFO: renamed from: x */
    public ColorStateList m27749x() {
        return this.f24123a.f24152d;
    }

    /* JADX INFO: renamed from: y */
    public float m27750y() {
        return this.f24123a.f24159k;
    }

    /* JADX INFO: renamed from: z */
    public float m27751z() {
        return this.f24123a.f24162n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C6363g(@NonNull Context context, AttributeSet attributeSet, int i10, int i11) {
        this(C6367k.m27766e(context, attributeSet, i10, i11).m27806m());
    }

    public C6363g(@NonNull C6367k c6367k) {
        this(new c(c6367k, null));
    }

    public C6363g(@NonNull c cVar) {
        C6368l c6368l;
        this.f24124b = new C6369m.g[4];
        this.f24125c = new C6369m.g[4];
        this.f24126d = new BitSet(8);
        this.f24128f = new Matrix();
        this.f24129g = new Path();
        this.f24130h = new Path();
        this.f24131i = new RectF();
        this.f24132j = new RectF();
        this.f24133k = new Region();
        this.f24134l = new Region();
        Paint paint = new Paint(1);
        this.f24136n = paint;
        Paint paint2 = new Paint(1);
        this.f24137o = paint2;
        this.f24138p = new C6088a();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            c6368l = C6368l.m27819k();
        } else {
            c6368l = new C6368l();
        }
        this.f24140r = c6368l;
        this.f24144v = new RectF();
        this.f24145w = true;
        this.f24123a = cVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        m27737l0();
        m27735k0(getState());
        this.f24139q = new a();
    }

    /* JADX INFO: renamed from: hd.g$c */
    public static class c extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a */
        @NonNull
        public C6367k f24149a;

        /* JADX INFO: renamed from: b */
        public C12779a f24150b;

        /* JADX INFO: renamed from: c */
        public ColorFilter f24151c;

        /* JADX INFO: renamed from: d */
        public ColorStateList f24152d;

        /* JADX INFO: renamed from: e */
        public ColorStateList f24153e;

        /* JADX INFO: renamed from: f */
        public ColorStateList f24154f;

        /* JADX INFO: renamed from: g */
        public ColorStateList f24155g;

        /* JADX INFO: renamed from: h */
        public PorterDuff.Mode f24156h;

        /* JADX INFO: renamed from: i */
        public Rect f24157i;

        /* JADX INFO: renamed from: j */
        public float f24158j;

        /* JADX INFO: renamed from: k */
        public float f24159k;

        /* JADX INFO: renamed from: l */
        public float f24160l;

        /* JADX INFO: renamed from: m */
        public int f24161m;

        /* JADX INFO: renamed from: n */
        public float f24162n;

        /* JADX INFO: renamed from: o */
        public float f24163o;

        /* JADX INFO: renamed from: p */
        public float f24164p;

        /* JADX INFO: renamed from: q */
        public int f24165q;

        /* JADX INFO: renamed from: r */
        public int f24166r;

        /* JADX INFO: renamed from: s */
        public int f24167s;

        /* JADX INFO: renamed from: t */
        public int f24168t;

        /* JADX INFO: renamed from: u */
        public boolean f24169u;

        /* JADX INFO: renamed from: v */
        public Paint.Style f24170v;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public c(@NonNull C6367k c6367k, C12779a c12779a) {
            this.f24152d = null;
            this.f24153e = null;
            this.f24154f = null;
            this.f24155g = null;
            this.f24156h = PorterDuff.Mode.SRC_IN;
            this.f24157i = null;
            this.f24158j = 1.0f;
            this.f24159k = 1.0f;
            this.f24161m = 255;
            this.f24162n = 0.0f;
            this.f24163o = 0.0f;
            this.f24164p = 0.0f;
            this.f24165q = 0;
            this.f24166r = 0;
            this.f24167s = 0;
            this.f24168t = 0;
            this.f24169u = false;
            this.f24170v = Paint.Style.FILL_AND_STROKE;
            this.f24149a = c6367k;
            this.f24150b = c12779a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable() {
            C6363g c6363g = new C6363g(this);
            c6363g.f24127e = true;
            return c6363g;
        }

        public c(@NonNull c cVar) {
            this.f24152d = null;
            this.f24153e = null;
            this.f24154f = null;
            this.f24155g = null;
            this.f24156h = PorterDuff.Mode.SRC_IN;
            this.f24157i = null;
            this.f24158j = 1.0f;
            this.f24159k = 1.0f;
            this.f24161m = 255;
            this.f24162n = 0.0f;
            this.f24163o = 0.0f;
            this.f24164p = 0.0f;
            this.f24165q = 0;
            this.f24166r = 0;
            this.f24167s = 0;
            this.f24168t = 0;
            this.f24169u = false;
            this.f24170v = Paint.Style.FILL_AND_STROKE;
            this.f24149a = cVar.f24149a;
            this.f24150b = cVar.f24150b;
            this.f24160l = cVar.f24160l;
            this.f24151c = cVar.f24151c;
            this.f24152d = cVar.f24152d;
            this.f24153e = cVar.f24153e;
            this.f24156h = cVar.f24156h;
            this.f24155g = cVar.f24155g;
            this.f24161m = cVar.f24161m;
            this.f24158j = cVar.f24158j;
            this.f24167s = cVar.f24167s;
            this.f24165q = cVar.f24165q;
            this.f24169u = cVar.f24169u;
            this.f24159k = cVar.f24159k;
            this.f24162n = cVar.f24162n;
            this.f24163o = cVar.f24163o;
            this.f24164p = cVar.f24164p;
            this.f24166r = cVar.f24166r;
            this.f24168t = cVar.f24168t;
            this.f24154f = cVar.f24154f;
            this.f24170v = cVar.f24170v;
            if (cVar.f24157i != null) {
                this.f24157i = new Rect(cVar.f24157i);
            }
        }
    }
}
