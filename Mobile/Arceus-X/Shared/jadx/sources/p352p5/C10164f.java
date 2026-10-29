package p352p5;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.core.graphics.C0552e;
import androidx.core.view.ViewCompat;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p298n2.C8866d;
import p298n2.C8870h;
import p298n2.C8873k;
import p368q2.C10425a;
import p504w1.C12277a;

/* JADX INFO: renamed from: p5.f */
/* JADX INFO: loaded from: classes.dex */
public class C10164f extends AbstractC10163e {

    /* JADX INFO: renamed from: k */
    public static final PorterDuff.Mode f36565k = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: b */
    public h f36566b;

    /* JADX INFO: renamed from: c */
    public PorterDuffColorFilter f36567c;

    /* JADX INFO: renamed from: d */
    public ColorFilter f36568d;

    /* JADX INFO: renamed from: e */
    public boolean f36569e;

    /* JADX INFO: renamed from: f */
    public boolean f36570f;

    /* JADX INFO: renamed from: g */
    public Drawable.ConstantState f36571g;

    /* JADX INFO: renamed from: h */
    public final float[] f36572h;

    /* JADX INFO: renamed from: i */
    public final Matrix f36573i;

    /* JADX INFO: renamed from: j */
    public final Rect f36574j;

    /* JADX INFO: renamed from: p5.f$b */
    public static class b extends f {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public b() {
        }

        /* JADX INFO: renamed from: f */
        private void m39128f(TypedArray typedArray, XmlPullParser xmlPullParser) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.f36601b = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.f36600a = C0552e.m2714d(string2);
            }
            this.f36602c = C8873k.m35691g(typedArray, xmlPullParser, "fillType", 2, 0);
        }

        @Override // p352p5.C10164f.f
        /* JADX INFO: renamed from: c */
        public boolean mo39129c() {
            return true;
        }

        /* JADX INFO: renamed from: e */
        public void m39130e(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (C8873k.m35692h(xmlPullParser, "pathData")) {
                TypedArray typedArrayM35693i = C8873k.m35693i(resources, theme, attributeSet, C10159a.f36538d);
                m39128f(typedArrayM35693i, xmlPullParser);
                typedArrayM35693i.recycle();
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public b(b bVar) {
            super(bVar);
        }
    }

    /* JADX INFO: renamed from: p5.f$e */
    public static abstract class e {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public e() {
        }

        /* JADX INFO: renamed from: a */
        public boolean mo39131a() {
            return false;
        }

        /* JADX INFO: renamed from: b */
        public boolean mo39132b(int[] iArr) {
            return false;
        }
    }

    /* JADX INFO: renamed from: p5.f$h */
    public static class h extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a */
        public int f36621a;

        /* JADX INFO: renamed from: b */
        public g f36622b;

        /* JADX INFO: renamed from: c */
        public ColorStateList f36623c;

        /* JADX INFO: renamed from: d */
        public PorterDuff.Mode f36624d;

        /* JADX INFO: renamed from: e */
        public boolean f36625e;

        /* JADX INFO: renamed from: f */
        public Bitmap f36626f;

        /* JADX INFO: renamed from: g */
        public ColorStateList f36627g;

        /* JADX INFO: renamed from: h */
        public PorterDuff.Mode f36628h;

        /* JADX INFO: renamed from: i */
        public int f36629i;

        /* JADX INFO: renamed from: j */
        public boolean f36630j;

        /* JADX INFO: renamed from: k */
        public boolean f36631k;

        /* JADX INFO: renamed from: l */
        public Paint f36632l;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public h(h hVar) {
            this.f36623c = null;
            this.f36624d = C10164f.f36565k;
            if (hVar != null) {
                this.f36621a = hVar.f36621a;
                g gVar = new g(hVar.f36622b);
                this.f36622b = gVar;
                if (hVar.f36622b.f36609e != null) {
                    gVar.f36609e = new Paint(hVar.f36622b.f36609e);
                }
                if (hVar.f36622b.f36608d != null) {
                    this.f36622b.f36608d = new Paint(hVar.f36622b.f36608d);
                }
                this.f36623c = hVar.f36623c;
                this.f36624d = hVar.f36624d;
                this.f36625e = hVar.f36625e;
            }
        }

        /* JADX INFO: renamed from: a */
        public boolean m39148a(int i10, int i11) {
            return i10 == this.f36626f.getWidth() && i11 == this.f36626f.getHeight();
        }

        /* JADX INFO: renamed from: b */
        public boolean m39149b() {
            return !this.f36631k && this.f36627g == this.f36623c && this.f36628h == this.f36624d && this.f36630j == this.f36625e && this.f36629i == this.f36622b.getRootAlpha();
        }

        /* JADX INFO: renamed from: c */
        public void m39150c(int i10, int i11) {
            if (this.f36626f == null || !m39148a(i10, i11)) {
                this.f36626f = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
                this.f36631k = true;
            }
        }

        /* JADX INFO: renamed from: d */
        public void m39151d(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f36626f, (Rect) null, rect, m39152e(colorFilter));
        }

        /* JADX INFO: renamed from: e */
        public Paint m39152e(ColorFilter colorFilter) {
            if (!m39153f() && colorFilter == null) {
                return null;
            }
            if (this.f36632l == null) {
                Paint paint = new Paint();
                this.f36632l = paint;
                paint.setFilterBitmap(true);
            }
            this.f36632l.setAlpha(this.f36622b.getRootAlpha());
            this.f36632l.setColorFilter(colorFilter);
            return this.f36632l;
        }

        /* JADX INFO: renamed from: f */
        public boolean m39153f() {
            return this.f36622b.getRootAlpha() < 255;
        }

        /* JADX INFO: renamed from: g */
        public boolean m39154g() {
            return this.f36622b.m39146f();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f36621a;
        }

        /* JADX INFO: renamed from: h */
        public boolean m39155h(int[] iArr) {
            boolean zM39147g = this.f36622b.m39147g(iArr);
            this.f36631k |= zM39147g;
            return zM39147g;
        }

        /* JADX INFO: renamed from: i */
        public void m39156i() {
            this.f36627g = this.f36623c;
            this.f36628h = this.f36624d;
            this.f36629i = this.f36622b.getRootAlpha();
            this.f36630j = this.f36625e;
            this.f36631k = false;
        }

        /* JADX INFO: renamed from: j */
        public void m39157j(int i10, int i11) {
            this.f36626f.eraseColor(0);
            this.f36622b.m39142b(new Canvas(this.f36626f), i10, i11, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable() {
            return new C10164f(this);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable(Resources resources) {
            return new C10164f(this);
        }

        public h() {
            this.f36623c = null;
            this.f36624d = C10164f.f36565k;
            this.f36622b = new g();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C10164f() {
        this.f36570f = true;
        this.f36572h = new float[9];
        this.f36573i = new Matrix();
        this.f36574j = new Rect();
        this.f36566b = new h();
    }

    /* JADX INFO: renamed from: a */
    public static int m39119a(int i10, float f10) {
        return (i10 & ViewCompat.MEASURED_SIZE_MASK) | (((int) (Color.alpha(i10) * f10)) << 24);
    }

    /* JADX INFO: renamed from: b */
    public static C10164f m39120b(@NonNull Resources resources, int i10, Resources.Theme theme) {
        C10164f c10164f = new C10164f();
        c10164f.f36564a = C8870h.m35662e(resources, i10, theme);
        c10164f.f36571g = new i(c10164f.f36564a.getConstantState());
        return c10164f;
    }

    /* JADX INFO: renamed from: f */
    public static PorterDuff.Mode m39121f(int i10, PorterDuff.Mode mode) {
        if (i10 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i10 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i10 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i10) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    @Override // p352p5.AbstractC10163e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    /* JADX INFO: renamed from: c */
    public Object m39122c(String str) {
        return this.f36566b.f36622b.f36620p.get(str);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f36564a;
        if (drawable == null) {
            return false;
        }
        C10425a.m40105b(drawable);
        return false;
    }

    @Override // p352p5.AbstractC10163e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    /* JADX INFO: renamed from: d */
    public final void m39123d(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        h hVar = this.f36566b;
        g gVar = hVar.f36622b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(gVar.f36612h);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z10 = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                d dVar = (d) arrayDeque.peek();
                if ("path".equals(name)) {
                    c cVar = new c();
                    cVar.m39135g(resources, attributeSet, theme, xmlPullParser);
                    dVar.f36588b.add(cVar);
                    if (cVar.getPathName() != null) {
                        gVar.f36620p.put(cVar.getPathName(), cVar);
                    }
                    hVar.f36621a = cVar.f36603d | hVar.f36621a;
                    z10 = false;
                } else if ("clip-path".equals(name)) {
                    b bVar = new b();
                    bVar.m39130e(resources, attributeSet, theme, xmlPullParser);
                    dVar.f36588b.add(bVar);
                    if (bVar.getPathName() != null) {
                        gVar.f36620p.put(bVar.getPathName(), bVar);
                    }
                    hVar.f36621a = bVar.f36603d | hVar.f36621a;
                } else if ("group".equals(name)) {
                    d dVar2 = new d();
                    dVar2.m39137c(resources, attributeSet, theme, xmlPullParser);
                    dVar.f36588b.add(dVar2);
                    arrayDeque.push(dVar2);
                    if (dVar2.getGroupName() != null) {
                        gVar.f36620p.put(dVar2.getGroupName(), dVar2);
                    }
                    hVar.f36621a = dVar2.f36597k | hVar.f36621a;
                }
            } else if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                arrayDeque.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (z10) {
            throw new XmlPullParserException("no path defined");
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f36564a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.f36574j);
        if (this.f36574j.width() <= 0 || this.f36574j.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f36568d;
        if (colorFilter == null) {
            colorFilter = this.f36567c;
        }
        canvas.getMatrix(this.f36573i);
        this.f36573i.getValues(this.f36572h);
        float fAbs = Math.abs(this.f36572h[0]);
        float fAbs2 = Math.abs(this.f36572h[4]);
        float fAbs3 = Math.abs(this.f36572h[1]);
        float fAbs4 = Math.abs(this.f36572h[3]);
        if (fAbs3 != 0.0f || fAbs4 != 0.0f) {
            fAbs = 1.0f;
            fAbs2 = 1.0f;
        }
        int iWidth = (int) (this.f36574j.width() * fAbs);
        int iHeight = (int) (this.f36574j.height() * fAbs2);
        int iMin = Math.min(2048, iWidth);
        int iMin2 = Math.min(2048, iHeight);
        if (iMin <= 0 || iMin2 <= 0) {
            return;
        }
        int iSave = canvas.save();
        Rect rect = this.f36574j;
        canvas.translate(rect.left, rect.top);
        if (m39124e()) {
            canvas.translate(this.f36574j.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        this.f36574j.offsetTo(0, 0);
        this.f36566b.m39150c(iMin, iMin2);
        if (!this.f36570f) {
            this.f36566b.m39157j(iMin, iMin2);
        } else if (!this.f36566b.m39149b()) {
            this.f36566b.m39157j(iMin, iMin2);
            this.f36566b.m39156i();
        }
        this.f36566b.m39151d(canvas, colorFilter, this.f36574j);
        canvas.restoreToCount(iSave);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m39124e() {
        return isAutoMirrored() && C10425a.m40109f(this) == 1;
    }

    /* JADX INFO: renamed from: g */
    public void m39125g(boolean z10) {
        this.f36570f = z10;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f36564a;
        return drawable != null ? C10425a.m40107d(drawable) : this.f36566b.f36622b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f36564a;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f36566b.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f36564a;
        return drawable != null ? C10425a.m40108e(drawable) : this.f36568d;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f36564a != null) {
            return new i(this.f36564a.getConstantState());
        }
        this.f36566b.f36621a = getChangingConfigurations();
        return this.f36566b;
    }

    @Override // p352p5.AbstractC10163e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f36564a;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f36566b.f36622b.f36614j;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f36564a;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f36566b.f36622b.f36613i;
    }

    @Override // p352p5.AbstractC10163e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // p352p5.AbstractC10163e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f36564a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // p352p5.AbstractC10163e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // p352p5.AbstractC10163e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // p352p5.AbstractC10163e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    /* JADX INFO: renamed from: h */
    public final void m39126h(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) throws XmlPullParserException {
        h hVar = this.f36566b;
        g gVar = hVar.f36622b;
        hVar.f36624d = m39121f(C8873k.m35691g(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList colorStateListM35687c = C8873k.m35687c(typedArray, xmlPullParser, theme, "tint", 1);
        if (colorStateListM35687c != null) {
            hVar.f36623c = colorStateListM35687c;
        }
        hVar.f36625e = C8873k.m35685a(typedArray, xmlPullParser, "autoMirrored", 5, hVar.f36625e);
        gVar.f36615k = C8873k.m35690f(typedArray, xmlPullParser, "viewportWidth", 7, gVar.f36615k);
        float fM35690f = C8873k.m35690f(typedArray, xmlPullParser, "viewportHeight", 8, gVar.f36616l);
        gVar.f36616l = fM35690f;
        if (gVar.f36615k <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (fM35690f <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        gVar.f36613i = typedArray.getDimension(3, gVar.f36613i);
        float dimension = typedArray.getDimension(2, gVar.f36614j);
        gVar.f36614j = dimension;
        if (gVar.f36613i <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
        }
        if (dimension <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires height > 0");
        }
        gVar.setAlpha(C8873k.m35690f(typedArray, xmlPullParser, "alpha", 4, gVar.getAlpha()));
        String string = typedArray.getString(0);
        if (string != null) {
            gVar.f36618n = string;
            gVar.f36620p.put(string, gVar);
        }
    }

    /* JADX INFO: renamed from: i */
    public PorterDuffColorFilter m39127i(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f36564a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        Drawable drawable = this.f36564a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f36564a;
        return drawable != null ? C10425a.m40111h(drawable) : this.f36566b.f36625e;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.f36564a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        h hVar = this.f36566b;
        if (hVar == null) {
            return false;
        }
        if (hVar.m39154g()) {
            return true;
        }
        ColorStateList colorStateList = this.f36566b.f36623c;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // p352p5.AbstractC10163e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f36564a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f36569e && super.mutate() == this) {
            this.f36566b = new h(this.f36566b);
            this.f36569e = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f36564a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean z10;
        PorterDuff.Mode mode;
        Drawable drawable = this.f36564a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        h hVar = this.f36566b;
        ColorStateList colorStateList = hVar.f36623c;
        if (colorStateList == null || (mode = hVar.f36624d) == null) {
            z10 = false;
        } else {
            this.f36567c = m39127i(this.f36567c, colorStateList, mode);
            invalidateSelf();
            z10 = true;
        }
        if (!hVar.m39154g() || !hVar.m39155h(iArr)) {
            return z10;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(Runnable runnable, long j10) {
        Drawable drawable = this.f36564a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j10);
        } else {
            super.scheduleSelf(runnable, j10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        Drawable drawable = this.f36564a;
        if (drawable != null) {
            drawable.setAlpha(i10);
        } else if (this.f36566b.f36622b.getRootAlpha() != i10) {
            this.f36566b.f36622b.setRootAlpha(i10);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z10) {
        Drawable drawable = this.f36564a;
        if (drawable != null) {
            C10425a.m40113j(drawable, z10);
        } else {
            this.f36566b.f36625e = z10;
        }
    }

    @Override // p352p5.AbstractC10163e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i10) {
        super.setChangingConfigurations(i10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p352p5.AbstractC10163e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i10, PorterDuff.Mode mode) {
        super.setColorFilter(i10, mode);
    }

    @Override // p352p5.AbstractC10163e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z10) {
        super.setFilterBitmap(z10);
    }

    @Override // p352p5.AbstractC10163e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f10, float f11) {
        super.setHotspot(f10, f11);
    }

    @Override // p352p5.AbstractC10163e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i10, int i11, int i12, int i13) {
        super.setHotspotBounds(i10, i11, i12, i13);
    }

    @Override // p352p5.AbstractC10163e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i10) {
        Drawable drawable = this.f36564a;
        if (drawable != null) {
            C10425a.m40117n(drawable, i10);
        } else {
            setTintList(ColorStateList.valueOf(i10));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f36564a;
        if (drawable != null) {
            C10425a.m40118o(drawable, colorStateList);
            return;
        }
        h hVar = this.f36566b;
        if (hVar.f36623c != colorStateList) {
            hVar.f36623c = colorStateList;
            this.f36567c = m39127i(this.f36567c, colorStateList, hVar.f36624d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f36564a;
        if (drawable != null) {
            C10425a.m40119p(drawable, mode);
            return;
        }
        h hVar = this.f36566b;
        if (hVar.f36624d != mode) {
            hVar.f36624d = mode;
            this.f36567c = m39127i(this.f36567c, hVar.f36623c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        Drawable drawable = this.f36564a;
        return drawable != null ? drawable.setVisible(z10, z11) : super.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f36564a;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    /* JADX INFO: renamed from: p5.f$i */
    public static class i extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a */
        public final Drawable.ConstantState f36633a;

        public i(Drawable.ConstantState constantState) {
            this.f36633a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f36633a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f36633a.getChangingConfigurations();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            C10164f c10164f = new C10164f();
            c10164f.f36564a = (VectorDrawable) this.f36633a.newDrawable();
            return c10164f;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            C10164f c10164f = new C10164f();
            c10164f.f36564a = (VectorDrawable) this.f36633a.newDrawable(resources);
            return c10164f;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            C10164f c10164f = new C10164f();
            c10164f.f36564a = (VectorDrawable) this.f36633a.newDrawable(resources, theme);
            return c10164f;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f36564a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f36568d = colorFilter;
            invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: p5.f$f */
    public static abstract class f extends e {

        /* JADX INFO: renamed from: a */
        public C0552e.b[] f36600a;

        /* JADX INFO: renamed from: b */
        public String f36601b;

        /* JADX INFO: renamed from: c */
        public int f36602c;

        /* JADX INFO: renamed from: d */
        public int f36603d;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public f() {
            super();
            this.f36600a = null;
            this.f36602c = 0;
        }

        /* JADX INFO: renamed from: c */
        public boolean mo39129c() {
            return false;
        }

        /* JADX INFO: renamed from: d */
        public void m39140d(Path path) {
            path.reset();
            C0552e.b[] bVarArr = this.f36600a;
            if (bVarArr != null) {
                C0552e.b.m2729h(bVarArr, path);
            }
        }

        public C0552e.b[] getPathData() {
            return this.f36600a;
        }

        public String getPathName() {
            return this.f36601b;
        }

        public void setPathData(C0552e.b[] bVarArr) {
            if (C0552e.m2712b(this.f36600a, bVarArr)) {
                C0552e.m2721k(this.f36600a, bVarArr);
            } else {
                this.f36600a = C0552e.m2716f(bVarArr);
            }
        }

        public f(f fVar) {
            super();
            this.f36600a = null;
            this.f36602c = 0;
            this.f36601b = fVar.f36601b;
            this.f36603d = fVar.f36603d;
            this.f36600a = C0552e.m2716f(fVar.f36600a);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.f36564a;
        if (drawable != null) {
            C10425a.m40110g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        h hVar = this.f36566b;
        hVar.f36622b = new g();
        TypedArray typedArrayM35693i = C8873k.m35693i(resources, theme, attributeSet, C10159a.f36535a);
        m39126h(typedArrayM35693i, xmlPullParser, theme);
        typedArrayM35693i.recycle();
        hVar.f36621a = getChangingConfigurations();
        hVar.f36631k = true;
        m39123d(resources, xmlPullParser, attributeSet, theme);
        this.f36567c = m39127i(this.f36567c, hVar.f36623c, hVar.f36624d);
    }

    public C10164f(@NonNull h hVar) {
        this.f36570f = true;
        this.f36572h = new float[9];
        this.f36573i = new Matrix();
        this.f36574j = new Rect();
        this.f36566b = hVar;
        this.f36567c = m39127i(this.f36567c, hVar.f36623c, hVar.f36624d);
    }

    /* JADX INFO: renamed from: p5.f$c */
    public static class c extends f {

        /* JADX INFO: renamed from: e */
        public int[] f36575e;

        /* JADX INFO: renamed from: f */
        public C8866d f36576f;

        /* JADX INFO: renamed from: g */
        public float f36577g;

        /* JADX INFO: renamed from: h */
        public C8866d f36578h;

        /* JADX INFO: renamed from: i */
        public float f36579i;

        /* JADX INFO: renamed from: j */
        public float f36580j;

        /* JADX INFO: renamed from: k */
        public float f36581k;

        /* JADX INFO: renamed from: l */
        public float f36582l;

        /* JADX INFO: renamed from: m */
        public float f36583m;

        /* JADX INFO: renamed from: n */
        public Paint.Cap f36584n;

        /* JADX INFO: renamed from: o */
        public Paint.Join f36585o;

        /* JADX INFO: renamed from: p */
        public float f36586p;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public c() {
            this.f36577g = 0.0f;
            this.f36579i = 1.0f;
            this.f36580j = 1.0f;
            this.f36581k = 0.0f;
            this.f36582l = 1.0f;
            this.f36583m = 0.0f;
            this.f36584n = Paint.Cap.BUTT;
            this.f36585o = Paint.Join.MITER;
            this.f36586p = 4.0f;
        }

        @Override // p352p5.C10164f.e
        /* JADX INFO: renamed from: a */
        public boolean mo39131a() {
            return this.f36578h.m35626i() || this.f36576f.m35626i();
        }

        @Override // p352p5.C10164f.e
        /* JADX INFO: renamed from: b */
        public boolean mo39132b(int[] iArr) {
            return this.f36576f.m35627j(iArr) | this.f36578h.m35627j(iArr);
        }

        /* JADX INFO: renamed from: e */
        public final Paint.Cap m39133e(int i10, Paint.Cap cap) {
            if (i10 == 0) {
                return Paint.Cap.BUTT;
            }
            if (i10 != 1) {
                return i10 != 2 ? cap : Paint.Cap.SQUARE;
            }
            return Paint.Cap.ROUND;
        }

        /* JADX INFO: renamed from: f */
        public final Paint.Join m39134f(int i10, Paint.Join join) {
            if (i10 == 0) {
                return Paint.Join.MITER;
            }
            if (i10 != 1) {
                return i10 != 2 ? join : Paint.Join.BEVEL;
            }
            return Paint.Join.ROUND;
        }

        /* JADX INFO: renamed from: g */
        public void m39135g(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray typedArrayM35693i = C8873k.m35693i(resources, theme, attributeSet, C10159a.f36537c);
            m39136h(typedArrayM35693i, xmlPullParser, theme);
            typedArrayM35693i.recycle();
        }

        public float getFillAlpha() {
            return this.f36580j;
        }

        public int getFillColor() {
            return this.f36578h.m35623e();
        }

        public float getStrokeAlpha() {
            return this.f36579i;
        }

        public int getStrokeColor() {
            return this.f36576f.m35623e();
        }

        public float getStrokeWidth() {
            return this.f36577g;
        }

        public float getTrimPathEnd() {
            return this.f36582l;
        }

        public float getTrimPathOffset() {
            return this.f36583m;
        }

        public float getTrimPathStart() {
            return this.f36581k;
        }

        /* JADX INFO: renamed from: h */
        public final void m39136h(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
            this.f36575e = null;
            if (C8873k.m35692h(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.f36601b = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.f36600a = C0552e.m2714d(string2);
                }
                this.f36578h = C8873k.m35689e(typedArray, xmlPullParser, theme, "fillColor", 1, 0);
                this.f36580j = C8873k.m35690f(typedArray, xmlPullParser, "fillAlpha", 12, this.f36580j);
                this.f36584n = m39133e(C8873k.m35691g(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.f36584n);
                this.f36585o = m39134f(C8873k.m35691g(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.f36585o);
                this.f36586p = C8873k.m35690f(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.f36586p);
                this.f36576f = C8873k.m35689e(typedArray, xmlPullParser, theme, "strokeColor", 3, 0);
                this.f36579i = C8873k.m35690f(typedArray, xmlPullParser, "strokeAlpha", 11, this.f36579i);
                this.f36577g = C8873k.m35690f(typedArray, xmlPullParser, "strokeWidth", 4, this.f36577g);
                this.f36582l = C8873k.m35690f(typedArray, xmlPullParser, "trimPathEnd", 6, this.f36582l);
                this.f36583m = C8873k.m35690f(typedArray, xmlPullParser, "trimPathOffset", 7, this.f36583m);
                this.f36581k = C8873k.m35690f(typedArray, xmlPullParser, "trimPathStart", 5, this.f36581k);
                this.f36602c = C8873k.m35691g(typedArray, xmlPullParser, "fillType", 13, this.f36602c);
            }
        }

        public void setFillAlpha(float f10) {
            this.f36580j = f10;
        }

        public void setFillColor(int i10) {
            this.f36578h.m35628k(i10);
        }

        public void setStrokeAlpha(float f10) {
            this.f36579i = f10;
        }

        public void setStrokeColor(int i10) {
            this.f36576f.m35628k(i10);
        }

        public void setStrokeWidth(float f10) {
            this.f36577g = f10;
        }

        public void setTrimPathEnd(float f10) {
            this.f36582l = f10;
        }

        public void setTrimPathOffset(float f10) {
            this.f36583m = f10;
        }

        public void setTrimPathStart(float f10) {
            this.f36581k = f10;
        }

        public c(c cVar) {
            super(cVar);
            this.f36577g = 0.0f;
            this.f36579i = 1.0f;
            this.f36580j = 1.0f;
            this.f36581k = 0.0f;
            this.f36582l = 1.0f;
            this.f36583m = 0.0f;
            this.f36584n = Paint.Cap.BUTT;
            this.f36585o = Paint.Join.MITER;
            this.f36586p = 4.0f;
            this.f36575e = cVar.f36575e;
            this.f36576f = cVar.f36576f;
            this.f36577g = cVar.f36577g;
            this.f36579i = cVar.f36579i;
            this.f36578h = cVar.f36578h;
            this.f36602c = cVar.f36602c;
            this.f36580j = cVar.f36580j;
            this.f36581k = cVar.f36581k;
            this.f36582l = cVar.f36582l;
            this.f36583m = cVar.f36583m;
            this.f36584n = cVar.f36584n;
            this.f36585o = cVar.f36585o;
            this.f36586p = cVar.f36586p;
        }
    }

    /* JADX INFO: renamed from: p5.f$g */
    public static class g {

        /* JADX INFO: renamed from: q */
        public static final Matrix f36604q = new Matrix();

        /* JADX INFO: renamed from: a */
        public final Path f36605a;

        /* JADX INFO: renamed from: b */
        public final Path f36606b;

        /* JADX INFO: renamed from: c */
        public final Matrix f36607c;

        /* JADX INFO: renamed from: d */
        public Paint f36608d;

        /* JADX INFO: renamed from: e */
        public Paint f36609e;

        /* JADX INFO: renamed from: f */
        public PathMeasure f36610f;

        /* JADX INFO: renamed from: g */
        public int f36611g;

        /* JADX INFO: renamed from: h */
        public final d f36612h;

        /* JADX INFO: renamed from: i */
        public float f36613i;

        /* JADX INFO: renamed from: j */
        public float f36614j;

        /* JADX INFO: renamed from: k */
        public float f36615k;

        /* JADX INFO: renamed from: l */
        public float f36616l;

        /* JADX INFO: renamed from: m */
        public int f36617m;

        /* JADX INFO: renamed from: n */
        public String f36618n;

        /* JADX INFO: renamed from: o */
        public Boolean f36619o;

        /* JADX INFO: renamed from: p */
        public final C12277a<String, Object> f36620p;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public g() {
            this.f36607c = new Matrix();
            this.f36613i = 0.0f;
            this.f36614j = 0.0f;
            this.f36615k = 0.0f;
            this.f36616l = 0.0f;
            this.f36617m = 255;
            this.f36618n = null;
            this.f36619o = null;
            this.f36620p = new C12277a<>();
            this.f36612h = new d();
            this.f36605a = new Path();
            this.f36606b = new Path();
        }

        /* JADX INFO: renamed from: a */
        public static float m39141a(float f10, float f11, float f12, float f13) {
            return (f10 * f13) - (f11 * f12);
        }

        /* JADX INFO: renamed from: b */
        public void m39142b(Canvas canvas, int i10, int i11, ColorFilter colorFilter) {
            m39143c(this.f36612h, f36604q, canvas, i10, i11, colorFilter);
        }

        /* JADX INFO: renamed from: c */
        public final void m39143c(d dVar, Matrix matrix, Canvas canvas, int i10, int i11, ColorFilter colorFilter) {
            d dVar2 = dVar;
            dVar2.f36587a.set(matrix);
            dVar2.f36587a.preConcat(dVar2.f36596j);
            canvas.save();
            int i12 = 0;
            while (i12 < dVar2.f36588b.size()) {
                e eVar = dVar2.f36588b.get(i12);
                if (eVar instanceof d) {
                    m39143c((d) eVar, dVar2.f36587a, canvas, i10, i11, colorFilter);
                } else if (eVar instanceof f) {
                    m39144d(dVar2, (f) eVar, canvas, i10, i11, colorFilter);
                }
                i12++;
                dVar2 = dVar;
            }
            canvas.restore();
        }

        /* JADX INFO: renamed from: d */
        public final void m39144d(d dVar, f fVar, Canvas canvas, int i10, int i11, ColorFilter colorFilter) {
            float f10 = i10 / this.f36615k;
            float f11 = i11 / this.f36616l;
            float fMin = Math.min(f10, f11);
            Matrix matrix = dVar.f36587a;
            this.f36607c.set(matrix);
            this.f36607c.postScale(f10, f11);
            float fM39145e = m39145e(matrix);
            if (fM39145e == 0.0f) {
                return;
            }
            fVar.m39140d(this.f36605a);
            Path path = this.f36605a;
            this.f36606b.reset();
            if (fVar.mo39129c()) {
                this.f36606b.setFillType(fVar.f36602c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                this.f36606b.addPath(path, this.f36607c);
                canvas.clipPath(this.f36606b);
                return;
            }
            c cVar = (c) fVar;
            float f12 = cVar.f36581k;
            if (f12 != 0.0f || cVar.f36582l != 1.0f) {
                float f13 = cVar.f36583m;
                float f14 = (f12 + f13) % 1.0f;
                float f15 = (cVar.f36582l + f13) % 1.0f;
                if (this.f36610f == null) {
                    this.f36610f = new PathMeasure();
                }
                this.f36610f.setPath(this.f36605a, false);
                float length = this.f36610f.getLength();
                float f16 = f14 * length;
                float f17 = f15 * length;
                path.reset();
                if (f16 > f17) {
                    this.f36610f.getSegment(f16, length, path, true);
                    this.f36610f.getSegment(0.0f, f17, path, true);
                } else {
                    this.f36610f.getSegment(f16, f17, path, true);
                }
                path.rLineTo(0.0f, 0.0f);
            }
            this.f36606b.addPath(path, this.f36607c);
            if (cVar.f36578h.m35629l()) {
                C8866d c8866d = cVar.f36578h;
                if (this.f36609e == null) {
                    Paint paint = new Paint(1);
                    this.f36609e = paint;
                    paint.setStyle(Paint.Style.FILL);
                }
                Paint paint2 = this.f36609e;
                if (c8866d.m35625h()) {
                    Shader shaderM35624f = c8866d.m35624f();
                    shaderM35624f.setLocalMatrix(this.f36607c);
                    paint2.setShader(shaderM35624f);
                    paint2.setAlpha(Math.round(cVar.f36580j * 255.0f));
                } else {
                    paint2.setShader(null);
                    paint2.setAlpha(255);
                    paint2.setColor(C10164f.m39119a(c8866d.m35623e(), cVar.f36580j));
                }
                paint2.setColorFilter(colorFilter);
                this.f36606b.setFillType(cVar.f36602c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                canvas.drawPath(this.f36606b, paint2);
            }
            if (cVar.f36576f.m35629l()) {
                C8866d c8866d2 = cVar.f36576f;
                if (this.f36608d == null) {
                    Paint paint3 = new Paint(1);
                    this.f36608d = paint3;
                    paint3.setStyle(Paint.Style.STROKE);
                }
                Paint paint4 = this.f36608d;
                Paint.Join join = cVar.f36585o;
                if (join != null) {
                    paint4.setStrokeJoin(join);
                }
                Paint.Cap cap = cVar.f36584n;
                if (cap != null) {
                    paint4.setStrokeCap(cap);
                }
                paint4.setStrokeMiter(cVar.f36586p);
                if (c8866d2.m35625h()) {
                    Shader shaderM35624f2 = c8866d2.m35624f();
                    shaderM35624f2.setLocalMatrix(this.f36607c);
                    paint4.setShader(shaderM35624f2);
                    paint4.setAlpha(Math.round(cVar.f36579i * 255.0f));
                } else {
                    paint4.setShader(null);
                    paint4.setAlpha(255);
                    paint4.setColor(C10164f.m39119a(c8866d2.m35623e(), cVar.f36579i));
                }
                paint4.setColorFilter(colorFilter);
                paint4.setStrokeWidth(cVar.f36577g * fMin * fM39145e);
                canvas.drawPath(this.f36606b, paint4);
            }
        }

        /* JADX INFO: renamed from: e */
        public final float m39145e(Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float fHypot = (float) Math.hypot(fArr[0], fArr[1]);
            float fHypot2 = (float) Math.hypot(fArr[2], fArr[3]);
            float fM39141a = m39141a(fArr[0], fArr[1], fArr[2], fArr[3]);
            float fMax = Math.max(fHypot, fHypot2);
            if (fMax > 0.0f) {
                return Math.abs(fM39141a) / fMax;
            }
            return 0.0f;
        }

        /* JADX INFO: renamed from: f */
        public boolean m39146f() {
            if (this.f36619o == null) {
                this.f36619o = Boolean.valueOf(this.f36612h.mo39131a());
            }
            return this.f36619o.booleanValue();
        }

        /* JADX INFO: renamed from: g */
        public boolean m39147g(int[] iArr) {
            return this.f36612h.mo39132b(iArr);
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public int getRootAlpha() {
            return this.f36617m;
        }

        public void setAlpha(float f10) {
            setRootAlpha((int) (f10 * 255.0f));
        }

        public void setRootAlpha(int i10) {
            this.f36617m = i10;
        }

        public g(g gVar) {
            this.f36607c = new Matrix();
            this.f36613i = 0.0f;
            this.f36614j = 0.0f;
            this.f36615k = 0.0f;
            this.f36616l = 0.0f;
            this.f36617m = 255;
            this.f36618n = null;
            this.f36619o = null;
            C12277a<String, Object> c12277a = new C12277a<>();
            this.f36620p = c12277a;
            this.f36612h = new d(gVar.f36612h, c12277a);
            this.f36605a = new Path(gVar.f36605a);
            this.f36606b = new Path(gVar.f36606b);
            this.f36613i = gVar.f36613i;
            this.f36614j = gVar.f36614j;
            this.f36615k = gVar.f36615k;
            this.f36616l = gVar.f36616l;
            this.f36611g = gVar.f36611g;
            this.f36617m = gVar.f36617m;
            this.f36618n = gVar.f36618n;
            String str = gVar.f36618n;
            if (str != null) {
                c12277a.put(str, this);
            }
            this.f36619o = gVar.f36619o;
        }
    }

    /* JADX INFO: renamed from: p5.f$d */
    public static class d extends e {

        /* JADX INFO: renamed from: a */
        public final Matrix f36587a;

        /* JADX INFO: renamed from: b */
        public final ArrayList<e> f36588b;

        /* JADX INFO: renamed from: c */
        public float f36589c;

        /* JADX INFO: renamed from: d */
        public float f36590d;

        /* JADX INFO: renamed from: e */
        public float f36591e;

        /* JADX INFO: renamed from: f */
        public float f36592f;

        /* JADX INFO: renamed from: g */
        public float f36593g;

        /* JADX INFO: renamed from: h */
        public float f36594h;

        /* JADX INFO: renamed from: i */
        public float f36595i;

        /* JADX INFO: renamed from: j */
        public final Matrix f36596j;

        /* JADX INFO: renamed from: k */
        public int f36597k;

        /* JADX INFO: renamed from: l */
        public int[] f36598l;

        /* JADX INFO: renamed from: m */
        public String f36599m;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public d(d dVar, C12277a<String, Object> c12277a) {
            f bVar;
            super();
            this.f36587a = new Matrix();
            this.f36588b = new ArrayList<>();
            this.f36589c = 0.0f;
            this.f36590d = 0.0f;
            this.f36591e = 0.0f;
            this.f36592f = 1.0f;
            this.f36593g = 1.0f;
            this.f36594h = 0.0f;
            this.f36595i = 0.0f;
            Matrix matrix = new Matrix();
            this.f36596j = matrix;
            this.f36599m = null;
            this.f36589c = dVar.f36589c;
            this.f36590d = dVar.f36590d;
            this.f36591e = dVar.f36591e;
            this.f36592f = dVar.f36592f;
            this.f36593g = dVar.f36593g;
            this.f36594h = dVar.f36594h;
            this.f36595i = dVar.f36595i;
            this.f36598l = dVar.f36598l;
            String str = dVar.f36599m;
            this.f36599m = str;
            this.f36597k = dVar.f36597k;
            if (str != null) {
                c12277a.put(str, this);
            }
            matrix.set(dVar.f36596j);
            ArrayList<e> arrayList = dVar.f36588b;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                e eVar = arrayList.get(i10);
                if (eVar instanceof d) {
                    this.f36588b.add(new d((d) eVar, c12277a));
                } else {
                    if (eVar instanceof c) {
                        bVar = new c((c) eVar);
                    } else {
                        if (!(eVar instanceof b)) {
                            throw new IllegalStateException("Unknown object in the tree!");
                        }
                        bVar = new b((b) eVar);
                    }
                    this.f36588b.add(bVar);
                    String str2 = bVar.f36601b;
                    if (str2 != null) {
                        c12277a.put(str2, bVar);
                    }
                }
            }
        }

        @Override // p352p5.C10164f.e
        /* JADX INFO: renamed from: a */
        public boolean mo39131a() {
            for (int i10 = 0; i10 < this.f36588b.size(); i10++) {
                if (this.f36588b.get(i10).mo39131a()) {
                    return true;
                }
            }
            return false;
        }

        @Override // p352p5.C10164f.e
        /* JADX INFO: renamed from: b */
        public boolean mo39132b(int[] iArr) {
            boolean zMo39132b = false;
            for (int i10 = 0; i10 < this.f36588b.size(); i10++) {
                zMo39132b |= this.f36588b.get(i10).mo39132b(iArr);
            }
            return zMo39132b;
        }

        /* JADX INFO: renamed from: c */
        public void m39137c(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray typedArrayM35693i = C8873k.m35693i(resources, theme, attributeSet, C10159a.f36536b);
            m39139e(typedArrayM35693i, xmlPullParser);
            typedArrayM35693i.recycle();
        }

        /* JADX INFO: renamed from: d */
        public final void m39138d() {
            this.f36596j.reset();
            this.f36596j.postTranslate(-this.f36590d, -this.f36591e);
            this.f36596j.postScale(this.f36592f, this.f36593g);
            this.f36596j.postRotate(this.f36589c, 0.0f, 0.0f);
            this.f36596j.postTranslate(this.f36594h + this.f36590d, this.f36595i + this.f36591e);
        }

        /* JADX INFO: renamed from: e */
        public final void m39139e(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f36598l = null;
            this.f36589c = C8873k.m35690f(typedArray, xmlPullParser, "rotation", 5, this.f36589c);
            this.f36590d = typedArray.getFloat(1, this.f36590d);
            this.f36591e = typedArray.getFloat(2, this.f36591e);
            this.f36592f = C8873k.m35690f(typedArray, xmlPullParser, "scaleX", 3, this.f36592f);
            this.f36593g = C8873k.m35690f(typedArray, xmlPullParser, "scaleY", 4, this.f36593g);
            this.f36594h = C8873k.m35690f(typedArray, xmlPullParser, "translateX", 6, this.f36594h);
            this.f36595i = C8873k.m35690f(typedArray, xmlPullParser, "translateY", 7, this.f36595i);
            String string = typedArray.getString(0);
            if (string != null) {
                this.f36599m = string;
            }
            m39138d();
        }

        public String getGroupName() {
            return this.f36599m;
        }

        public Matrix getLocalMatrix() {
            return this.f36596j;
        }

        public float getPivotX() {
            return this.f36590d;
        }

        public float getPivotY() {
            return this.f36591e;
        }

        public float getRotation() {
            return this.f36589c;
        }

        public float getScaleX() {
            return this.f36592f;
        }

        public float getScaleY() {
            return this.f36593g;
        }

        public float getTranslateX() {
            return this.f36594h;
        }

        public float getTranslateY() {
            return this.f36595i;
        }

        public void setPivotX(float f10) {
            if (f10 != this.f36590d) {
                this.f36590d = f10;
                m39138d();
            }
        }

        public void setPivotY(float f10) {
            if (f10 != this.f36591e) {
                this.f36591e = f10;
                m39138d();
            }
        }

        public void setRotation(float f10) {
            if (f10 != this.f36589c) {
                this.f36589c = f10;
                m39138d();
            }
        }

        public void setScaleX(float f10) {
            if (f10 != this.f36592f) {
                this.f36592f = f10;
                m39138d();
            }
        }

        public void setScaleY(float f10) {
            if (f10 != this.f36593g) {
                this.f36593g = f10;
                m39138d();
            }
        }

        public void setTranslateX(float f10) {
            if (f10 != this.f36594h) {
                this.f36594h = f10;
                m39138d();
            }
        }

        public void setTranslateY(float f10) {
            if (f10 != this.f36595i) {
                this.f36595i = f10;
                m39138d();
            }
        }

        public d() {
            super();
            this.f36587a = new Matrix();
            this.f36588b = new ArrayList<>();
            this.f36589c = 0.0f;
            this.f36590d = 0.0f;
            this.f36591e = 0.0f;
            this.f36592f = 1.0f;
            this.f36593g = 1.0f;
            this.f36594h = 0.0f;
            this.f36595i = 0.0f;
            this.f36596j = new Matrix();
            this.f36599m = null;
        }
    }
}
