package p5;

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
import com.google.mlkit.vision.barcode.common.Barcode;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import n2.k;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class f extends p5.e {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final PorterDuff.Mode f28463k = PorterDuff.Mode.SRC_IN;
    public h b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public PorterDuffColorFilter f28464c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ColorFilter f28465d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f28466e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f28467f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Drawable.ConstantState f28468g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float[] f28469h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Matrix f28470i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Rect f28471j;

    public static class b extends AbstractC0500f {
        public b() {
        }

        private void f(TypedArray typedArray, XmlPullParser xmlPullParser) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.b = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.f28496a = androidx.core.graphics.e.d(string2);
            }
            this.f28497c = k.g(typedArray, xmlPullParser, "fillType", 2, 0);
        }

        @Override // p5.f.AbstractC0500f
        public boolean c() {
            return true;
        }

        public void e(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (k.h(xmlPullParser, "pathData")) {
                TypedArray typedArrayI = k.i(resources, theme, attributeSet, p5.a.f28438d);
                f(typedArrayI, xmlPullParser);
                typedArrayI.recycle();
            }
        }

        public b(b bVar) {
            super(bVar);
        }
    }

    public static abstract class e {
        public e() {
        }

        public boolean a() {
            return false;
        }

        public boolean b(int[] iArr) {
            return false;
        }
    }

    public static class h extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f28515a;
        public g b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ColorStateList f28516c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public PorterDuff.Mode f28517d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f28518e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Bitmap f28519f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public ColorStateList f28520g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public PorterDuff.Mode f28521h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f28522i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f28523j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f28524k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Paint f28525l;

        public h(h hVar) {
            this.f28516c = null;
            this.f28517d = f.f28463k;
            if (hVar != null) {
                this.f28515a = hVar.f28515a;
                g gVar = new g(hVar.b);
                this.b = gVar;
                if (hVar.b.f28503e != null) {
                    gVar.f28503e = new Paint(hVar.b.f28503e);
                }
                if (hVar.b.f28502d != null) {
                    this.b.f28502d = new Paint(hVar.b.f28502d);
                }
                this.f28516c = hVar.f28516c;
                this.f28517d = hVar.f28517d;
                this.f28518e = hVar.f28518e;
            }
        }

        public boolean a(int i10, int i11) {
            return i10 == this.f28519f.getWidth() && i11 == this.f28519f.getHeight();
        }

        public boolean b() {
            return !this.f28524k && this.f28520g == this.f28516c && this.f28521h == this.f28517d && this.f28523j == this.f28518e && this.f28522i == this.b.getRootAlpha();
        }

        public void c(int i10, int i11) {
            if (this.f28519f == null || !a(i10, i11)) {
                this.f28519f = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
                this.f28524k = true;
            }
        }

        public void d(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f28519f, (Rect) null, rect, e(colorFilter));
        }

        public Paint e(ColorFilter colorFilter) {
            if (!f() && colorFilter == null) {
                return null;
            }
            if (this.f28525l == null) {
                Paint paint = new Paint();
                this.f28525l = paint;
                paint.setFilterBitmap(true);
            }
            this.f28525l.setAlpha(this.b.getRootAlpha());
            this.f28525l.setColorFilter(colorFilter);
            return this.f28525l;
        }

        public boolean f() {
            return this.b.getRootAlpha() < 255;
        }

        public boolean g() {
            return this.b.f();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f28515a;
        }

        public boolean h(int[] iArr) {
            boolean zG = this.b.g(iArr);
            this.f28524k |= zG;
            return zG;
        }

        public void i() {
            this.f28520g = this.f28516c;
            this.f28521h = this.f28517d;
            this.f28522i = this.b.getRootAlpha();
            this.f28523j = this.f28518e;
            this.f28524k = false;
        }

        public void j(int i10, int i11) {
            this.f28519f.eraseColor(0);
            this.b.b(new Canvas(this.f28519f), i10, i11, null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable() {
            return new f(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable(Resources resources) {
            return new f(this);
        }

        public h() {
            this.f28516c = null;
            this.f28517d = f.f28463k;
            this.b = new g();
        }
    }

    public f() {
        this.f28467f = true;
        this.f28469h = new float[9];
        this.f28470i = new Matrix();
        this.f28471j = new Rect();
        this.b = new h();
    }

    public static int a(int i10, float f10) {
        return (i10 & 16777215) | (((int) (Color.alpha(i10) * f10)) << 24);
    }

    public static f b(@NonNull Resources resources, int i10, Resources.Theme theme) {
        f fVar = new f();
        fVar.f28462a = n2.h.e(resources, i10, theme);
        fVar.f28468g = new i(fVar.f28462a.getConstantState());
        return fVar;
    }

    public static PorterDuff.Mode f(int i10, PorterDuff.Mode mode) {
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

    @Override // p5.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    public Object c(String str) {
        return this.b.b.f28514p.get(str);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f28462a;
        if (drawable == null) {
            return false;
        }
        q2.a.b(drawable);
        return false;
    }

    @Override // p5.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    public final void d(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        h hVar = this.b;
        g gVar = hVar.b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(gVar.f28506h);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z10 = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                d dVar = (d) arrayDeque.peek();
                if ("path".equals(name)) {
                    c cVar = new c();
                    cVar.g(resources, attributeSet, theme, xmlPullParser);
                    dVar.b.add(cVar);
                    if (cVar.getPathName() != null) {
                        gVar.f28514p.put(cVar.getPathName(), cVar);
                    }
                    hVar.f28515a = cVar.f28498d | hVar.f28515a;
                    z10 = false;
                } else if ("clip-path".equals(name)) {
                    b bVar = new b();
                    bVar.e(resources, attributeSet, theme, xmlPullParser);
                    dVar.b.add(bVar);
                    if (bVar.getPathName() != null) {
                        gVar.f28514p.put(bVar.getPathName(), bVar);
                    }
                    hVar.f28515a = bVar.f28498d | hVar.f28515a;
                } else if ("group".equals(name)) {
                    d dVar2 = new d();
                    dVar2.c(resources, attributeSet, theme, xmlPullParser);
                    dVar.b.add(dVar2);
                    arrayDeque.push(dVar2);
                    if (dVar2.getGroupName() != null) {
                        gVar.f28514p.put(dVar2.getGroupName(), dVar2);
                    }
                    hVar.f28515a = dVar2.f28493k | hVar.f28515a;
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
        Drawable drawable = this.f28462a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.f28471j);
        if (this.f28471j.width() <= 0 || this.f28471j.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f28465d;
        if (colorFilter == null) {
            colorFilter = this.f28464c;
        }
        canvas.getMatrix(this.f28470i);
        this.f28470i.getValues(this.f28469h);
        float fAbs = Math.abs(this.f28469h[0]);
        float fAbs2 = Math.abs(this.f28469h[4]);
        float fAbs3 = Math.abs(this.f28469h[1]);
        float fAbs4 = Math.abs(this.f28469h[3]);
        if (fAbs3 != 0.0f || fAbs4 != 0.0f) {
            fAbs = 1.0f;
            fAbs2 = 1.0f;
        }
        int iWidth = (int) (this.f28471j.width() * fAbs);
        int iHeight = (int) (this.f28471j.height() * fAbs2);
        int iMin = Math.min(Barcode.FORMAT_PDF417, iWidth);
        int iMin2 = Math.min(Barcode.FORMAT_PDF417, iHeight);
        if (iMin <= 0 || iMin2 <= 0) {
            return;
        }
        int iSave = canvas.save();
        Rect rect = this.f28471j;
        canvas.translate(rect.left, rect.top);
        if (e()) {
            canvas.translate(this.f28471j.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        this.f28471j.offsetTo(0, 0);
        this.b.c(iMin, iMin2);
        if (!this.f28467f) {
            this.b.j(iMin, iMin2);
        } else if (!this.b.b()) {
            this.b.j(iMin, iMin2);
            this.b.i();
        }
        this.b.d(canvas, colorFilter, this.f28471j);
        canvas.restoreToCount(iSave);
    }

    public final boolean e() {
        return isAutoMirrored() && q2.a.f(this) == 1;
    }

    public void g(boolean z10) {
        this.f28467f = z10;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f28462a;
        return drawable != null ? q2.a.d(drawable) : this.b.b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f28462a;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.b.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f28462a;
        return drawable != null ? q2.a.e(drawable) : this.f28465d;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f28462a != null) {
            return new i(this.f28462a.getConstantState());
        }
        this.b.f28515a = getChangingConfigurations();
        return this.b;
    }

    @Override // p5.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f28462a;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.b.b.f28508j;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f28462a;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.b.b.f28507i;
    }

    @Override // p5.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // p5.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f28462a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // p5.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // p5.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // p5.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    public final void h(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) throws XmlPullParserException {
        h hVar = this.b;
        g gVar = hVar.b;
        hVar.f28517d = f(k.g(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList colorStateListC = k.c(typedArray, xmlPullParser, theme, "tint", 1);
        if (colorStateListC != null) {
            hVar.f28516c = colorStateListC;
        }
        hVar.f28518e = k.a(typedArray, xmlPullParser, "autoMirrored", 5, hVar.f28518e);
        gVar.f28509k = k.f(typedArray, xmlPullParser, "viewportWidth", 7, gVar.f28509k);
        float f10 = k.f(typedArray, xmlPullParser, "viewportHeight", 8, gVar.f28510l);
        gVar.f28510l = f10;
        if (gVar.f28509k <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f10 <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        gVar.f28507i = typedArray.getDimension(3, gVar.f28507i);
        float dimension = typedArray.getDimension(2, gVar.f28508j);
        gVar.f28508j = dimension;
        if (gVar.f28507i <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
        }
        if (dimension <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires height > 0");
        }
        gVar.setAlpha(k.f(typedArray, xmlPullParser, "alpha", 4, gVar.getAlpha()));
        String string = typedArray.getString(0);
        if (string != null) {
            gVar.f28512n = string;
            gVar.f28514p.put(string, gVar);
        }
    }

    public PorterDuffColorFilter i(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f28462a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        Drawable drawable = this.f28462a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f28462a;
        return drawable != null ? q2.a.h(drawable) : this.b.f28518e;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.f28462a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        h hVar = this.b;
        if (hVar == null) {
            return false;
        }
        if (hVar.g()) {
            return true;
        }
        ColorStateList colorStateList = this.b.f28516c;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // p5.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f28462a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f28466e && super.mutate() == this) {
            this.b = new h(this.b);
            this.f28466e = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f28462a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean z10;
        PorterDuff.Mode mode;
        Drawable drawable = this.f28462a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        h hVar = this.b;
        ColorStateList colorStateList = hVar.f28516c;
        if (colorStateList == null || (mode = hVar.f28517d) == null) {
            z10 = false;
        } else {
            this.f28464c = i(this.f28464c, colorStateList, mode);
            invalidateSelf();
            z10 = true;
        }
        if (!hVar.g() || !hVar.h(iArr)) {
            return z10;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(Runnable runnable, long j10) {
        Drawable drawable = this.f28462a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j10);
        } else {
            super.scheduleSelf(runnable, j10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        Drawable drawable = this.f28462a;
        if (drawable != null) {
            drawable.setAlpha(i10);
        } else if (this.b.b.getRootAlpha() != i10) {
            this.b.b.setRootAlpha(i10);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z10) {
        Drawable drawable = this.f28462a;
        if (drawable != null) {
            q2.a.j(drawable, z10);
        } else {
            this.b.f28518e = z10;
        }
    }

    @Override // p5.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i10) {
        super.setChangingConfigurations(i10);
    }

    @Override // p5.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i10, PorterDuff.Mode mode) {
        super.setColorFilter(i10, mode);
    }

    @Override // p5.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z10) {
        super.setFilterBitmap(z10);
    }

    @Override // p5.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f10, float f11) {
        super.setHotspot(f10, f11);
    }

    @Override // p5.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i10, int i11, int i12, int i13) {
        super.setHotspotBounds(i10, i11, i12, i13);
    }

    @Override // p5.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i10) {
        Drawable drawable = this.f28462a;
        if (drawable != null) {
            q2.a.n(drawable, i10);
        } else {
            setTintList(ColorStateList.valueOf(i10));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f28462a;
        if (drawable != null) {
            q2.a.o(drawable, colorStateList);
            return;
        }
        h hVar = this.b;
        if (hVar.f28516c != colorStateList) {
            hVar.f28516c = colorStateList;
            this.f28464c = i(this.f28464c, colorStateList, hVar.f28517d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f28462a;
        if (drawable != null) {
            q2.a.p(drawable, mode);
            return;
        }
        h hVar = this.b;
        if (hVar.f28517d != mode) {
            hVar.f28517d = mode;
            this.f28464c = i(this.f28464c, hVar.f28516c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        Drawable drawable = this.f28462a;
        return drawable != null ? drawable.setVisible(z10, z11) : super.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f28462a;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    public static class i extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Drawable.ConstantState f28526a;

        public i(Drawable.ConstantState constantState) {
            this.f28526a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f28526a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f28526a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            f fVar = new f();
            fVar.f28462a = (VectorDrawable) this.f28526a.newDrawable();
            return fVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            f fVar = new f();
            fVar.f28462a = (VectorDrawable) this.f28526a.newDrawable(resources);
            return fVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            f fVar = new f();
            fVar.f28462a = (VectorDrawable) this.f28526a.newDrawable(resources, theme);
            return fVar;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f28462a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f28465d = colorFilter;
            invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: p5.f$f, reason: collision with other inner class name */
    public static abstract class AbstractC0500f extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public androidx.core.graphics.e.b[] f28496a;
        public String b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f28497c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f28498d;

        public AbstractC0500f() {
            super();
            this.f28496a = null;
            this.f28497c = 0;
        }

        public boolean c() {
            return false;
        }

        public void d(Path path) {
            path.reset();
            androidx.core.graphics.e.b[] bVarArr = this.f28496a;
            if (bVarArr != null) {
                androidx.core.graphics.e.b.h(bVarArr, path);
            }
        }

        public androidx.core.graphics.e.b[] getPathData() {
            return this.f28496a;
        }

        public String getPathName() {
            return this.b;
        }

        public void setPathData(androidx.core.graphics.e.b[] bVarArr) {
            if (androidx.core.graphics.e.b(this.f28496a, bVarArr)) {
                androidx.core.graphics.e.k(this.f28496a, bVarArr);
            } else {
                this.f28496a = androidx.core.graphics.e.f(bVarArr);
            }
        }

        public AbstractC0500f(AbstractC0500f abstractC0500f) {
            super();
            this.f28496a = null;
            this.f28497c = 0;
            this.b = abstractC0500f.b;
            this.f28498d = abstractC0500f.f28498d;
            this.f28496a = androidx.core.graphics.e.f(abstractC0500f.f28496a);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.f28462a;
        if (drawable != null) {
            q2.a.g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        h hVar = this.b;
        hVar.b = new g();
        TypedArray typedArrayI = k.i(resources, theme, attributeSet, p5.a.f28436a);
        h(typedArrayI, xmlPullParser, theme);
        typedArrayI.recycle();
        hVar.f28515a = getChangingConfigurations();
        hVar.f28524k = true;
        d(resources, xmlPullParser, attributeSet, theme);
        this.f28464c = i(this.f28464c, hVar.f28516c, hVar.f28517d);
    }

    public f(@NonNull h hVar) {
        this.f28467f = true;
        this.f28469h = new float[9];
        this.f28470i = new Matrix();
        this.f28471j = new Rect();
        this.b = hVar;
        this.f28464c = i(this.f28464c, hVar.f28516c, hVar.f28517d);
    }

    public static class c extends AbstractC0500f {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int[] f28472e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public n2.d f28473f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f28474g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public n2.d f28475h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public float f28476i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public float f28477j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public float f28478k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public float f28479l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public float f28480m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public Paint.Cap f28481n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public Paint.Join f28482o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public float f28483p;

        public c() {
            this.f28474g = 0.0f;
            this.f28476i = 1.0f;
            this.f28477j = 1.0f;
            this.f28478k = 0.0f;
            this.f28479l = 1.0f;
            this.f28480m = 0.0f;
            this.f28481n = Paint.Cap.BUTT;
            this.f28482o = Paint.Join.MITER;
            this.f28483p = 4.0f;
        }

        @Override // p5.f.e
        public boolean a() {
            return this.f28475h.i() || this.f28473f.i();
        }

        @Override // p5.f.e
        public boolean b(int[] iArr) {
            return this.f28473f.j(iArr) | this.f28475h.j(iArr);
        }

        public final Paint.Cap e(int i10, Paint.Cap cap) {
            if (i10 == 0) {
                return Paint.Cap.BUTT;
            }
            if (i10 != 1) {
                return i10 != 2 ? cap : Paint.Cap.SQUARE;
            }
            return Paint.Cap.ROUND;
        }

        public final Paint.Join f(int i10, Paint.Join join) {
            if (i10 == 0) {
                return Paint.Join.MITER;
            }
            if (i10 != 1) {
                return i10 != 2 ? join : Paint.Join.BEVEL;
            }
            return Paint.Join.ROUND;
        }

        public void g(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray typedArrayI = k.i(resources, theme, attributeSet, p5.a.f28437c);
            h(typedArrayI, xmlPullParser, theme);
            typedArrayI.recycle();
        }

        public float getFillAlpha() {
            return this.f28477j;
        }

        public int getFillColor() {
            return this.f28475h.e();
        }

        public float getStrokeAlpha() {
            return this.f28476i;
        }

        public int getStrokeColor() {
            return this.f28473f.e();
        }

        public float getStrokeWidth() {
            return this.f28474g;
        }

        public float getTrimPathEnd() {
            return this.f28479l;
        }

        public float getTrimPathOffset() {
            return this.f28480m;
        }

        public float getTrimPathStart() {
            return this.f28478k;
        }

        public final void h(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
            this.f28472e = null;
            if (k.h(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.b = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.f28496a = androidx.core.graphics.e.d(string2);
                }
                this.f28475h = k.e(typedArray, xmlPullParser, theme, "fillColor", 1, 0);
                this.f28477j = k.f(typedArray, xmlPullParser, "fillAlpha", 12, this.f28477j);
                this.f28481n = e(k.g(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.f28481n);
                this.f28482o = f(k.g(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.f28482o);
                this.f28483p = k.f(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.f28483p);
                this.f28473f = k.e(typedArray, xmlPullParser, theme, "strokeColor", 3, 0);
                this.f28476i = k.f(typedArray, xmlPullParser, "strokeAlpha", 11, this.f28476i);
                this.f28474g = k.f(typedArray, xmlPullParser, "strokeWidth", 4, this.f28474g);
                this.f28479l = k.f(typedArray, xmlPullParser, "trimPathEnd", 6, this.f28479l);
                this.f28480m = k.f(typedArray, xmlPullParser, "trimPathOffset", 7, this.f28480m);
                this.f28478k = k.f(typedArray, xmlPullParser, "trimPathStart", 5, this.f28478k);
                this.f28497c = k.g(typedArray, xmlPullParser, "fillType", 13, this.f28497c);
            }
        }

        public void setFillAlpha(float f10) {
            this.f28477j = f10;
        }

        public void setFillColor(int i10) {
            this.f28475h.k(i10);
        }

        public void setStrokeAlpha(float f10) {
            this.f28476i = f10;
        }

        public void setStrokeColor(int i10) {
            this.f28473f.k(i10);
        }

        public void setStrokeWidth(float f10) {
            this.f28474g = f10;
        }

        public void setTrimPathEnd(float f10) {
            this.f28479l = f10;
        }

        public void setTrimPathOffset(float f10) {
            this.f28480m = f10;
        }

        public void setTrimPathStart(float f10) {
            this.f28478k = f10;
        }

        public c(c cVar) {
            super(cVar);
            this.f28474g = 0.0f;
            this.f28476i = 1.0f;
            this.f28477j = 1.0f;
            this.f28478k = 0.0f;
            this.f28479l = 1.0f;
            this.f28480m = 0.0f;
            this.f28481n = Paint.Cap.BUTT;
            this.f28482o = Paint.Join.MITER;
            this.f28483p = 4.0f;
            this.f28472e = cVar.f28472e;
            this.f28473f = cVar.f28473f;
            this.f28474g = cVar.f28474g;
            this.f28476i = cVar.f28476i;
            this.f28475h = cVar.f28475h;
            this.f28497c = cVar.f28497c;
            this.f28477j = cVar.f28477j;
            this.f28478k = cVar.f28478k;
            this.f28479l = cVar.f28479l;
            this.f28480m = cVar.f28480m;
            this.f28481n = cVar.f28481n;
            this.f28482o = cVar.f28482o;
            this.f28483p = cVar.f28483p;
        }
    }

    public static class g {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final Matrix f28499q = new Matrix();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Path f28500a;
        public final Path b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Matrix f28501c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Paint f28502d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Paint f28503e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public PathMeasure f28504f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f28505g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final d f28506h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public float f28507i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public float f28508j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public float f28509k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public float f28510l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f28511m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public String f28512n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public Boolean f28513o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final w1.a<String, Object> f28514p;

        public g() {
            this.f28501c = new Matrix();
            this.f28507i = 0.0f;
            this.f28508j = 0.0f;
            this.f28509k = 0.0f;
            this.f28510l = 0.0f;
            this.f28511m = 255;
            this.f28512n = null;
            this.f28513o = null;
            this.f28514p = new w1.a<>();
            this.f28506h = new d();
            this.f28500a = new Path();
            this.b = new Path();
        }

        public static float a(float f10, float f11, float f12, float f13) {
            return (f10 * f13) - (f11 * f12);
        }

        public void b(Canvas canvas, int i10, int i11, ColorFilter colorFilter) {
            c(this.f28506h, f28499q, canvas, i10, i11, colorFilter);
        }

        public final void c(d dVar, Matrix matrix, Canvas canvas, int i10, int i11, ColorFilter colorFilter) {
            d dVar2 = dVar;
            dVar2.f28484a.set(matrix);
            dVar2.f28484a.preConcat(dVar2.f28492j);
            canvas.save();
            int i12 = 0;
            while (i12 < dVar2.b.size()) {
                e eVar = dVar2.b.get(i12);
                if (eVar instanceof d) {
                    c((d) eVar, dVar2.f28484a, canvas, i10, i11, colorFilter);
                } else if (eVar instanceof AbstractC0500f) {
                    d(dVar2, (AbstractC0500f) eVar, canvas, i10, i11, colorFilter);
                }
                i12++;
                dVar2 = dVar;
            }
            canvas.restore();
        }

        public final void d(d dVar, AbstractC0500f abstractC0500f, Canvas canvas, int i10, int i11, ColorFilter colorFilter) {
            float f10 = i10 / this.f28509k;
            float f11 = i11 / this.f28510l;
            float fMin = Math.min(f10, f11);
            Matrix matrix = dVar.f28484a;
            this.f28501c.set(matrix);
            this.f28501c.postScale(f10, f11);
            float fE = e(matrix);
            if (fE == 0.0f) {
                return;
            }
            abstractC0500f.d(this.f28500a);
            Path path = this.f28500a;
            this.b.reset();
            if (abstractC0500f.c()) {
                this.b.setFillType(abstractC0500f.f28497c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                this.b.addPath(path, this.f28501c);
                canvas.clipPath(this.b);
                return;
            }
            c cVar = (c) abstractC0500f;
            float f12 = cVar.f28478k;
            if (f12 != 0.0f || cVar.f28479l != 1.0f) {
                float f13 = cVar.f28480m;
                float f14 = (f12 + f13) % 1.0f;
                float f15 = (cVar.f28479l + f13) % 1.0f;
                if (this.f28504f == null) {
                    this.f28504f = new PathMeasure();
                }
                this.f28504f.setPath(this.f28500a, false);
                float length = this.f28504f.getLength();
                float f16 = f14 * length;
                float f17 = f15 * length;
                path.reset();
                if (f16 > f17) {
                    this.f28504f.getSegment(f16, length, path, true);
                    this.f28504f.getSegment(0.0f, f17, path, true);
                } else {
                    this.f28504f.getSegment(f16, f17, path, true);
                }
                path.rLineTo(0.0f, 0.0f);
            }
            this.b.addPath(path, this.f28501c);
            if (cVar.f28475h.l()) {
                n2.d dVar2 = cVar.f28475h;
                if (this.f28503e == null) {
                    Paint paint = new Paint(1);
                    this.f28503e = paint;
                    paint.setStyle(Paint.Style.FILL);
                }
                Paint paint2 = this.f28503e;
                if (dVar2.h()) {
                    Shader shaderF = dVar2.f();
                    shaderF.setLocalMatrix(this.f28501c);
                    paint2.setShader(shaderF);
                    paint2.setAlpha(Math.round(cVar.f28477j * 255.0f));
                } else {
                    paint2.setShader(null);
                    paint2.setAlpha(255);
                    paint2.setColor(f.a(dVar2.e(), cVar.f28477j));
                }
                paint2.setColorFilter(colorFilter);
                this.b.setFillType(cVar.f28497c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                canvas.drawPath(this.b, paint2);
            }
            if (cVar.f28473f.l()) {
                n2.d dVar3 = cVar.f28473f;
                if (this.f28502d == null) {
                    Paint paint3 = new Paint(1);
                    this.f28502d = paint3;
                    paint3.setStyle(Paint.Style.STROKE);
                }
                Paint paint4 = this.f28502d;
                Paint.Join join = cVar.f28482o;
                if (join != null) {
                    paint4.setStrokeJoin(join);
                }
                Paint.Cap cap = cVar.f28481n;
                if (cap != null) {
                    paint4.setStrokeCap(cap);
                }
                paint4.setStrokeMiter(cVar.f28483p);
                if (dVar3.h()) {
                    Shader shaderF2 = dVar3.f();
                    shaderF2.setLocalMatrix(this.f28501c);
                    paint4.setShader(shaderF2);
                    paint4.setAlpha(Math.round(cVar.f28476i * 255.0f));
                } else {
                    paint4.setShader(null);
                    paint4.setAlpha(255);
                    paint4.setColor(f.a(dVar3.e(), cVar.f28476i));
                }
                paint4.setColorFilter(colorFilter);
                paint4.setStrokeWidth(cVar.f28474g * fMin * fE);
                canvas.drawPath(this.b, paint4);
            }
        }

        public final float e(Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float fHypot = (float) Math.hypot(fArr[0], fArr[1]);
            float fHypot2 = (float) Math.hypot(fArr[2], fArr[3]);
            float fA = a(fArr[0], fArr[1], fArr[2], fArr[3]);
            float fMax = Math.max(fHypot, fHypot2);
            if (fMax > 0.0f) {
                return Math.abs(fA) / fMax;
            }
            return 0.0f;
        }

        public boolean f() {
            if (this.f28513o == null) {
                this.f28513o = Boolean.valueOf(this.f28506h.a());
            }
            return this.f28513o.booleanValue();
        }

        public boolean g(int[] iArr) {
            return this.f28506h.b(iArr);
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public int getRootAlpha() {
            return this.f28511m;
        }

        public void setAlpha(float f10) {
            setRootAlpha((int) (f10 * 255.0f));
        }

        public void setRootAlpha(int i10) {
            this.f28511m = i10;
        }

        public g(g gVar) {
            this.f28501c = new Matrix();
            this.f28507i = 0.0f;
            this.f28508j = 0.0f;
            this.f28509k = 0.0f;
            this.f28510l = 0.0f;
            this.f28511m = 255;
            this.f28512n = null;
            this.f28513o = null;
            w1.a<String, Object> aVar = new w1.a<>();
            this.f28514p = aVar;
            this.f28506h = new d(gVar.f28506h, aVar);
            this.f28500a = new Path(gVar.f28500a);
            this.b = new Path(gVar.b);
            this.f28507i = gVar.f28507i;
            this.f28508j = gVar.f28508j;
            this.f28509k = gVar.f28509k;
            this.f28510l = gVar.f28510l;
            this.f28505g = gVar.f28505g;
            this.f28511m = gVar.f28511m;
            this.f28512n = gVar.f28512n;
            String str = gVar.f28512n;
            if (str != null) {
                aVar.put(str, this);
            }
            this.f28513o = gVar.f28513o;
        }
    }

    public static class d extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Matrix f28484a;
        public final ArrayList<e> b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f28485c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f28486d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f28487e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public float f28488f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f28489g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f28490h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public float f28491i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final Matrix f28492j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f28493k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int[] f28494l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public String f28495m;

        public d(d dVar, w1.a<String, Object> aVar) {
            AbstractC0500f bVar;
            super();
            this.f28484a = new Matrix();
            this.b = new ArrayList<>();
            this.f28485c = 0.0f;
            this.f28486d = 0.0f;
            this.f28487e = 0.0f;
            this.f28488f = 1.0f;
            this.f28489g = 1.0f;
            this.f28490h = 0.0f;
            this.f28491i = 0.0f;
            Matrix matrix = new Matrix();
            this.f28492j = matrix;
            this.f28495m = null;
            this.f28485c = dVar.f28485c;
            this.f28486d = dVar.f28486d;
            this.f28487e = dVar.f28487e;
            this.f28488f = dVar.f28488f;
            this.f28489g = dVar.f28489g;
            this.f28490h = dVar.f28490h;
            this.f28491i = dVar.f28491i;
            this.f28494l = dVar.f28494l;
            String str = dVar.f28495m;
            this.f28495m = str;
            this.f28493k = dVar.f28493k;
            if (str != null) {
                aVar.put(str, this);
            }
            matrix.set(dVar.f28492j);
            ArrayList<e> arrayList = dVar.b;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                e eVar = arrayList.get(i10);
                if (eVar instanceof d) {
                    this.b.add(new d((d) eVar, aVar));
                } else {
                    if (eVar instanceof c) {
                        bVar = new c((c) eVar);
                    } else {
                        if (!(eVar instanceof b)) {
                            throw new IllegalStateException("Unknown object in the tree!");
                        }
                        bVar = new b((b) eVar);
                    }
                    this.b.add(bVar);
                    String str2 = bVar.b;
                    if (str2 != null) {
                        aVar.put(str2, bVar);
                    }
                }
            }
        }

        @Override // p5.f.e
        public boolean a() {
            for (int i10 = 0; i10 < this.b.size(); i10++) {
                if (this.b.get(i10).a()) {
                    return true;
                }
            }
            return false;
        }

        @Override // p5.f.e
        public boolean b(int[] iArr) {
            boolean zB = false;
            for (int i10 = 0; i10 < this.b.size(); i10++) {
                zB |= this.b.get(i10).b(iArr);
            }
            return zB;
        }

        public void c(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray typedArrayI = k.i(resources, theme, attributeSet, p5.a.b);
            e(typedArrayI, xmlPullParser);
            typedArrayI.recycle();
        }

        public final void d() {
            this.f28492j.reset();
            this.f28492j.postTranslate(-this.f28486d, -this.f28487e);
            this.f28492j.postScale(this.f28488f, this.f28489g);
            this.f28492j.postRotate(this.f28485c, 0.0f, 0.0f);
            this.f28492j.postTranslate(this.f28490h + this.f28486d, this.f28491i + this.f28487e);
        }

        public final void e(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f28494l = null;
            this.f28485c = k.f(typedArray, xmlPullParser, "rotation", 5, this.f28485c);
            this.f28486d = typedArray.getFloat(1, this.f28486d);
            this.f28487e = typedArray.getFloat(2, this.f28487e);
            this.f28488f = k.f(typedArray, xmlPullParser, "scaleX", 3, this.f28488f);
            this.f28489g = k.f(typedArray, xmlPullParser, "scaleY", 4, this.f28489g);
            this.f28490h = k.f(typedArray, xmlPullParser, "translateX", 6, this.f28490h);
            this.f28491i = k.f(typedArray, xmlPullParser, "translateY", 7, this.f28491i);
            String string = typedArray.getString(0);
            if (string != null) {
                this.f28495m = string;
            }
            d();
        }

        public String getGroupName() {
            return this.f28495m;
        }

        public Matrix getLocalMatrix() {
            return this.f28492j;
        }

        public float getPivotX() {
            return this.f28486d;
        }

        public float getPivotY() {
            return this.f28487e;
        }

        public float getRotation() {
            return this.f28485c;
        }

        public float getScaleX() {
            return this.f28488f;
        }

        public float getScaleY() {
            return this.f28489g;
        }

        public float getTranslateX() {
            return this.f28490h;
        }

        public float getTranslateY() {
            return this.f28491i;
        }

        public void setPivotX(float f10) {
            if (f10 != this.f28486d) {
                this.f28486d = f10;
                d();
            }
        }

        public void setPivotY(float f10) {
            if (f10 != this.f28487e) {
                this.f28487e = f10;
                d();
            }
        }

        public void setRotation(float f10) {
            if (f10 != this.f28485c) {
                this.f28485c = f10;
                d();
            }
        }

        public void setScaleX(float f10) {
            if (f10 != this.f28488f) {
                this.f28488f = f10;
                d();
            }
        }

        public void setScaleY(float f10) {
            if (f10 != this.f28489g) {
                this.f28489g = f10;
                d();
            }
        }

        public void setTranslateX(float f10) {
            if (f10 != this.f28490h) {
                this.f28490h = f10;
                d();
            }
        }

        public void setTranslateY(float f10) {
            if (f10 != this.f28491i) {
                this.f28491i = f10;
                d();
            }
        }

        public d() {
            super();
            this.f28484a = new Matrix();
            this.b = new ArrayList<>();
            this.f28485c = 0.0f;
            this.f28486d = 0.0f;
            this.f28487e = 0.0f;
            this.f28488f = 1.0f;
            this.f28489g = 1.0f;
            this.f28490h = 0.0f;
            this.f28491i = 0.0f;
            this.f28492j = new Matrix();
            this.f28495m = null;
        }
    }
}
