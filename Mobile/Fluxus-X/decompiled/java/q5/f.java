package q5;

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
public class f extends q5.e {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final PorterDuff.Mode f29804k = PorterDuff.Mode.SRC_IN;
    public h b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public PorterDuffColorFilter f29805c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ColorFilter f29806d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f29807e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f29808f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Drawable.ConstantState f29809g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float[] f29810h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Matrix f29811i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Rect f29812j;

    public static class b extends AbstractC0583f {
        public b() {
        }

        private void f(TypedArray typedArray, XmlPullParser xmlPullParser) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.b = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.f29837a = androidx.core.graphics.e.d(string2);
            }
            this.f29838c = k.g(typedArray, xmlPullParser, "fillType", 2, 0);
        }

        @Override // q5.f.AbstractC0583f
        public boolean c() {
            return true;
        }

        public void e(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (k.h(xmlPullParser, "pathData")) {
                TypedArray typedArrayI = k.i(resources, theme, attributeSet, q5.a.f29779d);
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
        public int f29856a;
        public g b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ColorStateList f29857c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public PorterDuff.Mode f29858d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f29859e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Bitmap f29860f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public ColorStateList f29861g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public PorterDuff.Mode f29862h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f29863i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f29864j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f29865k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Paint f29866l;

        public h(h hVar) {
            this.f29857c = null;
            this.f29858d = f.f29804k;
            if (hVar != null) {
                this.f29856a = hVar.f29856a;
                g gVar = new g(hVar.b);
                this.b = gVar;
                if (hVar.b.f29844e != null) {
                    gVar.f29844e = new Paint(hVar.b.f29844e);
                }
                if (hVar.b.f29843d != null) {
                    this.b.f29843d = new Paint(hVar.b.f29843d);
                }
                this.f29857c = hVar.f29857c;
                this.f29858d = hVar.f29858d;
                this.f29859e = hVar.f29859e;
            }
        }

        public boolean a(int i10, int i11) {
            return i10 == this.f29860f.getWidth() && i11 == this.f29860f.getHeight();
        }

        public boolean b() {
            return !this.f29865k && this.f29861g == this.f29857c && this.f29862h == this.f29858d && this.f29864j == this.f29859e && this.f29863i == this.b.getRootAlpha();
        }

        public void c(int i10, int i11) {
            if (this.f29860f == null || !a(i10, i11)) {
                this.f29860f = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
                this.f29865k = true;
            }
        }

        public void d(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f29860f, (Rect) null, rect, e(colorFilter));
        }

        public Paint e(ColorFilter colorFilter) {
            if (!f() && colorFilter == null) {
                return null;
            }
            if (this.f29866l == null) {
                Paint paint = new Paint();
                this.f29866l = paint;
                paint.setFilterBitmap(true);
            }
            this.f29866l.setAlpha(this.b.getRootAlpha());
            this.f29866l.setColorFilter(colorFilter);
            return this.f29866l;
        }

        public boolean f() {
            return this.b.getRootAlpha() < 255;
        }

        public boolean g() {
            return this.b.f();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f29856a;
        }

        public boolean h(int[] iArr) {
            boolean zG = this.b.g(iArr);
            this.f29865k |= zG;
            return zG;
        }

        public void i() {
            this.f29861g = this.f29857c;
            this.f29862h = this.f29858d;
            this.f29863i = this.b.getRootAlpha();
            this.f29864j = this.f29859e;
            this.f29865k = false;
        }

        public void j(int i10, int i11) {
            this.f29860f.eraseColor(0);
            this.b.b(new Canvas(this.f29860f), i10, i11, null);
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
            this.f29857c = null;
            this.f29858d = f.f29804k;
            this.b = new g();
        }
    }

    public f() {
        this.f29808f = true;
        this.f29810h = new float[9];
        this.f29811i = new Matrix();
        this.f29812j = new Rect();
        this.b = new h();
    }

    public static int a(int i10, float f10) {
        return (i10 & 16777215) | (((int) (Color.alpha(i10) * f10)) << 24);
    }

    public static f b(@NonNull Resources resources, int i10, Resources.Theme theme) {
        f fVar = new f();
        fVar.f29803a = n2.h.e(resources, i10, theme);
        fVar.f29809g = new i(fVar.f29803a.getConstantState());
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

    @Override // q5.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    public Object c(String str) {
        return this.b.b.f29855p.get(str);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f29803a;
        if (drawable == null) {
            return false;
        }
        q2.a.b(drawable);
        return false;
    }

    @Override // q5.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    public final void d(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        h hVar = this.b;
        g gVar = hVar.b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(gVar.f29847h);
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
                        gVar.f29855p.put(cVar.getPathName(), cVar);
                    }
                    hVar.f29856a = cVar.f29839d | hVar.f29856a;
                    z10 = false;
                } else if ("clip-path".equals(name)) {
                    b bVar = new b();
                    bVar.e(resources, attributeSet, theme, xmlPullParser);
                    dVar.b.add(bVar);
                    if (bVar.getPathName() != null) {
                        gVar.f29855p.put(bVar.getPathName(), bVar);
                    }
                    hVar.f29856a = bVar.f29839d | hVar.f29856a;
                } else if ("group".equals(name)) {
                    d dVar2 = new d();
                    dVar2.c(resources, attributeSet, theme, xmlPullParser);
                    dVar.b.add(dVar2);
                    arrayDeque.push(dVar2);
                    if (dVar2.getGroupName() != null) {
                        gVar.f29855p.put(dVar2.getGroupName(), dVar2);
                    }
                    hVar.f29856a = dVar2.f29834k | hVar.f29856a;
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
        Drawable drawable = this.f29803a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.f29812j);
        if (this.f29812j.width() <= 0 || this.f29812j.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f29806d;
        if (colorFilter == null) {
            colorFilter = this.f29805c;
        }
        canvas.getMatrix(this.f29811i);
        this.f29811i.getValues(this.f29810h);
        float fAbs = Math.abs(this.f29810h[0]);
        float fAbs2 = Math.abs(this.f29810h[4]);
        float fAbs3 = Math.abs(this.f29810h[1]);
        float fAbs4 = Math.abs(this.f29810h[3]);
        if (fAbs3 != 0.0f || fAbs4 != 0.0f) {
            fAbs = 1.0f;
            fAbs2 = 1.0f;
        }
        int iWidth = (int) (this.f29812j.width() * fAbs);
        int iHeight = (int) (this.f29812j.height() * fAbs2);
        int iMin = Math.min(Barcode.FORMAT_PDF417, iWidth);
        int iMin2 = Math.min(Barcode.FORMAT_PDF417, iHeight);
        if (iMin <= 0 || iMin2 <= 0) {
            return;
        }
        int iSave = canvas.save();
        Rect rect = this.f29812j;
        canvas.translate(rect.left, rect.top);
        if (e()) {
            canvas.translate(this.f29812j.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        this.f29812j.offsetTo(0, 0);
        this.b.c(iMin, iMin2);
        if (!this.f29808f) {
            this.b.j(iMin, iMin2);
        } else if (!this.b.b()) {
            this.b.j(iMin, iMin2);
            this.b.i();
        }
        this.b.d(canvas, colorFilter, this.f29812j);
        canvas.restoreToCount(iSave);
    }

    public final boolean e() {
        return isAutoMirrored() && q2.a.f(this) == 1;
    }

    public void g(boolean z10) {
        this.f29808f = z10;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f29803a;
        return drawable != null ? q2.a.d(drawable) : this.b.b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f29803a;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.b.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f29803a;
        return drawable != null ? q2.a.e(drawable) : this.f29806d;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f29803a != null) {
            return new i(this.f29803a.getConstantState());
        }
        this.b.f29856a = getChangingConfigurations();
        return this.b;
    }

    @Override // q5.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f29803a;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.b.b.f29849j;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f29803a;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.b.b.f29848i;
    }

    @Override // q5.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // q5.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f29803a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // q5.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // q5.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // q5.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    public final void h(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) throws XmlPullParserException {
        h hVar = this.b;
        g gVar = hVar.b;
        hVar.f29858d = f(k.g(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList colorStateListC = k.c(typedArray, xmlPullParser, theme, "tint", 1);
        if (colorStateListC != null) {
            hVar.f29857c = colorStateListC;
        }
        hVar.f29859e = k.a(typedArray, xmlPullParser, "autoMirrored", 5, hVar.f29859e);
        gVar.f29850k = k.f(typedArray, xmlPullParser, "viewportWidth", 7, gVar.f29850k);
        float f10 = k.f(typedArray, xmlPullParser, "viewportHeight", 8, gVar.f29851l);
        gVar.f29851l = f10;
        if (gVar.f29850k <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f10 <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        gVar.f29848i = typedArray.getDimension(3, gVar.f29848i);
        float dimension = typedArray.getDimension(2, gVar.f29849j);
        gVar.f29849j = dimension;
        if (gVar.f29848i <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
        }
        if (dimension <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires height > 0");
        }
        gVar.setAlpha(k.f(typedArray, xmlPullParser, "alpha", 4, gVar.getAlpha()));
        String string = typedArray.getString(0);
        if (string != null) {
            gVar.f29853n = string;
            gVar.f29855p.put(string, gVar);
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
        Drawable drawable = this.f29803a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        Drawable drawable = this.f29803a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f29803a;
        return drawable != null ? q2.a.h(drawable) : this.b.f29859e;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.f29803a;
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
        ColorStateList colorStateList = this.b.f29857c;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // q5.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f29803a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f29807e && super.mutate() == this) {
            this.b = new h(this.b);
            this.f29807e = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f29803a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean z10;
        PorterDuff.Mode mode;
        Drawable drawable = this.f29803a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        h hVar = this.b;
        ColorStateList colorStateList = hVar.f29857c;
        if (colorStateList == null || (mode = hVar.f29858d) == null) {
            z10 = false;
        } else {
            this.f29805c = i(this.f29805c, colorStateList, mode);
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
        Drawable drawable = this.f29803a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j10);
        } else {
            super.scheduleSelf(runnable, j10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        Drawable drawable = this.f29803a;
        if (drawable != null) {
            drawable.setAlpha(i10);
        } else if (this.b.b.getRootAlpha() != i10) {
            this.b.b.setRootAlpha(i10);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z10) {
        Drawable drawable = this.f29803a;
        if (drawable != null) {
            q2.a.j(drawable, z10);
        } else {
            this.b.f29859e = z10;
        }
    }

    @Override // q5.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i10) {
        super.setChangingConfigurations(i10);
    }

    @Override // q5.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i10, PorterDuff.Mode mode) {
        super.setColorFilter(i10, mode);
    }

    @Override // q5.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z10) {
        super.setFilterBitmap(z10);
    }

    @Override // q5.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f10, float f11) {
        super.setHotspot(f10, f11);
    }

    @Override // q5.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i10, int i11, int i12, int i13) {
        super.setHotspotBounds(i10, i11, i12, i13);
    }

    @Override // q5.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i10) {
        Drawable drawable = this.f29803a;
        if (drawable != null) {
            q2.a.n(drawable, i10);
        } else {
            setTintList(ColorStateList.valueOf(i10));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f29803a;
        if (drawable != null) {
            q2.a.o(drawable, colorStateList);
            return;
        }
        h hVar = this.b;
        if (hVar.f29857c != colorStateList) {
            hVar.f29857c = colorStateList;
            this.f29805c = i(this.f29805c, colorStateList, hVar.f29858d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f29803a;
        if (drawable != null) {
            q2.a.p(drawable, mode);
            return;
        }
        h hVar = this.b;
        if (hVar.f29858d != mode) {
            hVar.f29858d = mode;
            this.f29805c = i(this.f29805c, hVar.f29857c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        Drawable drawable = this.f29803a;
        return drawable != null ? drawable.setVisible(z10, z11) : super.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f29803a;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    public static class i extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Drawable.ConstantState f29867a;

        public i(Drawable.ConstantState constantState) {
            this.f29867a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f29867a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f29867a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            f fVar = new f();
            fVar.f29803a = (VectorDrawable) this.f29867a.newDrawable();
            return fVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            f fVar = new f();
            fVar.f29803a = (VectorDrawable) this.f29867a.newDrawable(resources);
            return fVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            f fVar = new f();
            fVar.f29803a = (VectorDrawable) this.f29867a.newDrawable(resources, theme);
            return fVar;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f29803a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f29806d = colorFilter;
            invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: q5.f$f, reason: collision with other inner class name */
    public static abstract class AbstractC0583f extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public androidx.core.graphics.e.b[] f29837a;
        public String b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f29838c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f29839d;

        public AbstractC0583f() {
            super();
            this.f29837a = null;
            this.f29838c = 0;
        }

        public boolean c() {
            return false;
        }

        public void d(Path path) {
            path.reset();
            androidx.core.graphics.e.b[] bVarArr = this.f29837a;
            if (bVarArr != null) {
                androidx.core.graphics.e.b.h(bVarArr, path);
            }
        }

        public androidx.core.graphics.e.b[] getPathData() {
            return this.f29837a;
        }

        public String getPathName() {
            return this.b;
        }

        public void setPathData(androidx.core.graphics.e.b[] bVarArr) {
            if (androidx.core.graphics.e.b(this.f29837a, bVarArr)) {
                androidx.core.graphics.e.k(this.f29837a, bVarArr);
            } else {
                this.f29837a = androidx.core.graphics.e.f(bVarArr);
            }
        }

        public AbstractC0583f(AbstractC0583f abstractC0583f) {
            super();
            this.f29837a = null;
            this.f29838c = 0;
            this.b = abstractC0583f.b;
            this.f29839d = abstractC0583f.f29839d;
            this.f29837a = androidx.core.graphics.e.f(abstractC0583f.f29837a);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.f29803a;
        if (drawable != null) {
            q2.a.g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        h hVar = this.b;
        hVar.b = new g();
        TypedArray typedArrayI = k.i(resources, theme, attributeSet, q5.a.f29777a);
        h(typedArrayI, xmlPullParser, theme);
        typedArrayI.recycle();
        hVar.f29856a = getChangingConfigurations();
        hVar.f29865k = true;
        d(resources, xmlPullParser, attributeSet, theme);
        this.f29805c = i(this.f29805c, hVar.f29857c, hVar.f29858d);
    }

    public f(@NonNull h hVar) {
        this.f29808f = true;
        this.f29810h = new float[9];
        this.f29811i = new Matrix();
        this.f29812j = new Rect();
        this.b = hVar;
        this.f29805c = i(this.f29805c, hVar.f29857c, hVar.f29858d);
    }

    public static class c extends AbstractC0583f {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int[] f29813e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public n2.d f29814f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f29815g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public n2.d f29816h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public float f29817i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public float f29818j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public float f29819k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public float f29820l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public float f29821m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public Paint.Cap f29822n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public Paint.Join f29823o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public float f29824p;

        public c() {
            this.f29815g = 0.0f;
            this.f29817i = 1.0f;
            this.f29818j = 1.0f;
            this.f29819k = 0.0f;
            this.f29820l = 1.0f;
            this.f29821m = 0.0f;
            this.f29822n = Paint.Cap.BUTT;
            this.f29823o = Paint.Join.MITER;
            this.f29824p = 4.0f;
        }

        @Override // q5.f.e
        public boolean a() {
            return this.f29816h.i() || this.f29814f.i();
        }

        @Override // q5.f.e
        public boolean b(int[] iArr) {
            return this.f29814f.j(iArr) | this.f29816h.j(iArr);
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
            TypedArray typedArrayI = k.i(resources, theme, attributeSet, q5.a.f29778c);
            h(typedArrayI, xmlPullParser, theme);
            typedArrayI.recycle();
        }

        public float getFillAlpha() {
            return this.f29818j;
        }

        public int getFillColor() {
            return this.f29816h.e();
        }

        public float getStrokeAlpha() {
            return this.f29817i;
        }

        public int getStrokeColor() {
            return this.f29814f.e();
        }

        public float getStrokeWidth() {
            return this.f29815g;
        }

        public float getTrimPathEnd() {
            return this.f29820l;
        }

        public float getTrimPathOffset() {
            return this.f29821m;
        }

        public float getTrimPathStart() {
            return this.f29819k;
        }

        public final void h(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
            this.f29813e = null;
            if (k.h(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.b = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.f29837a = androidx.core.graphics.e.d(string2);
                }
                this.f29816h = k.e(typedArray, xmlPullParser, theme, "fillColor", 1, 0);
                this.f29818j = k.f(typedArray, xmlPullParser, "fillAlpha", 12, this.f29818j);
                this.f29822n = e(k.g(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.f29822n);
                this.f29823o = f(k.g(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.f29823o);
                this.f29824p = k.f(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.f29824p);
                this.f29814f = k.e(typedArray, xmlPullParser, theme, "strokeColor", 3, 0);
                this.f29817i = k.f(typedArray, xmlPullParser, "strokeAlpha", 11, this.f29817i);
                this.f29815g = k.f(typedArray, xmlPullParser, "strokeWidth", 4, this.f29815g);
                this.f29820l = k.f(typedArray, xmlPullParser, "trimPathEnd", 6, this.f29820l);
                this.f29821m = k.f(typedArray, xmlPullParser, "trimPathOffset", 7, this.f29821m);
                this.f29819k = k.f(typedArray, xmlPullParser, "trimPathStart", 5, this.f29819k);
                this.f29838c = k.g(typedArray, xmlPullParser, "fillType", 13, this.f29838c);
            }
        }

        public void setFillAlpha(float f10) {
            this.f29818j = f10;
        }

        public void setFillColor(int i10) {
            this.f29816h.k(i10);
        }

        public void setStrokeAlpha(float f10) {
            this.f29817i = f10;
        }

        public void setStrokeColor(int i10) {
            this.f29814f.k(i10);
        }

        public void setStrokeWidth(float f10) {
            this.f29815g = f10;
        }

        public void setTrimPathEnd(float f10) {
            this.f29820l = f10;
        }

        public void setTrimPathOffset(float f10) {
            this.f29821m = f10;
        }

        public void setTrimPathStart(float f10) {
            this.f29819k = f10;
        }

        public c(c cVar) {
            super(cVar);
            this.f29815g = 0.0f;
            this.f29817i = 1.0f;
            this.f29818j = 1.0f;
            this.f29819k = 0.0f;
            this.f29820l = 1.0f;
            this.f29821m = 0.0f;
            this.f29822n = Paint.Cap.BUTT;
            this.f29823o = Paint.Join.MITER;
            this.f29824p = 4.0f;
            this.f29813e = cVar.f29813e;
            this.f29814f = cVar.f29814f;
            this.f29815g = cVar.f29815g;
            this.f29817i = cVar.f29817i;
            this.f29816h = cVar.f29816h;
            this.f29838c = cVar.f29838c;
            this.f29818j = cVar.f29818j;
            this.f29819k = cVar.f29819k;
            this.f29820l = cVar.f29820l;
            this.f29821m = cVar.f29821m;
            this.f29822n = cVar.f29822n;
            this.f29823o = cVar.f29823o;
            this.f29824p = cVar.f29824p;
        }
    }

    public static class g {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final Matrix f29840q = new Matrix();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Path f29841a;
        public final Path b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Matrix f29842c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Paint f29843d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Paint f29844e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public PathMeasure f29845f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f29846g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final d f29847h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public float f29848i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public float f29849j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public float f29850k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public float f29851l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f29852m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public String f29853n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public Boolean f29854o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final w1.a<String, Object> f29855p;

        public g() {
            this.f29842c = new Matrix();
            this.f29848i = 0.0f;
            this.f29849j = 0.0f;
            this.f29850k = 0.0f;
            this.f29851l = 0.0f;
            this.f29852m = 255;
            this.f29853n = null;
            this.f29854o = null;
            this.f29855p = new w1.a<>();
            this.f29847h = new d();
            this.f29841a = new Path();
            this.b = new Path();
        }

        public static float a(float f10, float f11, float f12, float f13) {
            return (f10 * f13) - (f11 * f12);
        }

        public void b(Canvas canvas, int i10, int i11, ColorFilter colorFilter) {
            c(this.f29847h, f29840q, canvas, i10, i11, colorFilter);
        }

        public final void c(d dVar, Matrix matrix, Canvas canvas, int i10, int i11, ColorFilter colorFilter) {
            d dVar2 = dVar;
            dVar2.f29825a.set(matrix);
            dVar2.f29825a.preConcat(dVar2.f29833j);
            canvas.save();
            int i12 = 0;
            while (i12 < dVar2.b.size()) {
                e eVar = dVar2.b.get(i12);
                if (eVar instanceof d) {
                    c((d) eVar, dVar2.f29825a, canvas, i10, i11, colorFilter);
                } else if (eVar instanceof AbstractC0583f) {
                    d(dVar2, (AbstractC0583f) eVar, canvas, i10, i11, colorFilter);
                }
                i12++;
                dVar2 = dVar;
            }
            canvas.restore();
        }

        public final void d(d dVar, AbstractC0583f abstractC0583f, Canvas canvas, int i10, int i11, ColorFilter colorFilter) {
            float f10 = i10 / this.f29850k;
            float f11 = i11 / this.f29851l;
            float fMin = Math.min(f10, f11);
            Matrix matrix = dVar.f29825a;
            this.f29842c.set(matrix);
            this.f29842c.postScale(f10, f11);
            float fE = e(matrix);
            if (fE == 0.0f) {
                return;
            }
            abstractC0583f.d(this.f29841a);
            Path path = this.f29841a;
            this.b.reset();
            if (abstractC0583f.c()) {
                this.b.setFillType(abstractC0583f.f29838c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                this.b.addPath(path, this.f29842c);
                canvas.clipPath(this.b);
                return;
            }
            c cVar = (c) abstractC0583f;
            float f12 = cVar.f29819k;
            if (f12 != 0.0f || cVar.f29820l != 1.0f) {
                float f13 = cVar.f29821m;
                float f14 = (f12 + f13) % 1.0f;
                float f15 = (cVar.f29820l + f13) % 1.0f;
                if (this.f29845f == null) {
                    this.f29845f = new PathMeasure();
                }
                this.f29845f.setPath(this.f29841a, false);
                float length = this.f29845f.getLength();
                float f16 = f14 * length;
                float f17 = f15 * length;
                path.reset();
                if (f16 > f17) {
                    this.f29845f.getSegment(f16, length, path, true);
                    this.f29845f.getSegment(0.0f, f17, path, true);
                } else {
                    this.f29845f.getSegment(f16, f17, path, true);
                }
                path.rLineTo(0.0f, 0.0f);
            }
            this.b.addPath(path, this.f29842c);
            if (cVar.f29816h.l()) {
                n2.d dVar2 = cVar.f29816h;
                if (this.f29844e == null) {
                    Paint paint = new Paint(1);
                    this.f29844e = paint;
                    paint.setStyle(Paint.Style.FILL);
                }
                Paint paint2 = this.f29844e;
                if (dVar2.h()) {
                    Shader shaderF = dVar2.f();
                    shaderF.setLocalMatrix(this.f29842c);
                    paint2.setShader(shaderF);
                    paint2.setAlpha(Math.round(cVar.f29818j * 255.0f));
                } else {
                    paint2.setShader(null);
                    paint2.setAlpha(255);
                    paint2.setColor(f.a(dVar2.e(), cVar.f29818j));
                }
                paint2.setColorFilter(colorFilter);
                this.b.setFillType(cVar.f29838c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                canvas.drawPath(this.b, paint2);
            }
            if (cVar.f29814f.l()) {
                n2.d dVar3 = cVar.f29814f;
                if (this.f29843d == null) {
                    Paint paint3 = new Paint(1);
                    this.f29843d = paint3;
                    paint3.setStyle(Paint.Style.STROKE);
                }
                Paint paint4 = this.f29843d;
                Paint.Join join = cVar.f29823o;
                if (join != null) {
                    paint4.setStrokeJoin(join);
                }
                Paint.Cap cap = cVar.f29822n;
                if (cap != null) {
                    paint4.setStrokeCap(cap);
                }
                paint4.setStrokeMiter(cVar.f29824p);
                if (dVar3.h()) {
                    Shader shaderF2 = dVar3.f();
                    shaderF2.setLocalMatrix(this.f29842c);
                    paint4.setShader(shaderF2);
                    paint4.setAlpha(Math.round(cVar.f29817i * 255.0f));
                } else {
                    paint4.setShader(null);
                    paint4.setAlpha(255);
                    paint4.setColor(f.a(dVar3.e(), cVar.f29817i));
                }
                paint4.setColorFilter(colorFilter);
                paint4.setStrokeWidth(cVar.f29815g * fMin * fE);
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
            if (this.f29854o == null) {
                this.f29854o = Boolean.valueOf(this.f29847h.a());
            }
            return this.f29854o.booleanValue();
        }

        public boolean g(int[] iArr) {
            return this.f29847h.b(iArr);
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public int getRootAlpha() {
            return this.f29852m;
        }

        public void setAlpha(float f10) {
            setRootAlpha((int) (f10 * 255.0f));
        }

        public void setRootAlpha(int i10) {
            this.f29852m = i10;
        }

        public g(g gVar) {
            this.f29842c = new Matrix();
            this.f29848i = 0.0f;
            this.f29849j = 0.0f;
            this.f29850k = 0.0f;
            this.f29851l = 0.0f;
            this.f29852m = 255;
            this.f29853n = null;
            this.f29854o = null;
            w1.a<String, Object> aVar = new w1.a<>();
            this.f29855p = aVar;
            this.f29847h = new d(gVar.f29847h, aVar);
            this.f29841a = new Path(gVar.f29841a);
            this.b = new Path(gVar.b);
            this.f29848i = gVar.f29848i;
            this.f29849j = gVar.f29849j;
            this.f29850k = gVar.f29850k;
            this.f29851l = gVar.f29851l;
            this.f29846g = gVar.f29846g;
            this.f29852m = gVar.f29852m;
            this.f29853n = gVar.f29853n;
            String str = gVar.f29853n;
            if (str != null) {
                aVar.put(str, this);
            }
            this.f29854o = gVar.f29854o;
        }
    }

    public static class d extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Matrix f29825a;
        public final ArrayList<e> b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f29826c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f29827d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f29828e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public float f29829f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f29830g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f29831h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public float f29832i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final Matrix f29833j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f29834k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int[] f29835l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public String f29836m;

        public d(d dVar, w1.a<String, Object> aVar) {
            AbstractC0583f bVar;
            super();
            this.f29825a = new Matrix();
            this.b = new ArrayList<>();
            this.f29826c = 0.0f;
            this.f29827d = 0.0f;
            this.f29828e = 0.0f;
            this.f29829f = 1.0f;
            this.f29830g = 1.0f;
            this.f29831h = 0.0f;
            this.f29832i = 0.0f;
            Matrix matrix = new Matrix();
            this.f29833j = matrix;
            this.f29836m = null;
            this.f29826c = dVar.f29826c;
            this.f29827d = dVar.f29827d;
            this.f29828e = dVar.f29828e;
            this.f29829f = dVar.f29829f;
            this.f29830g = dVar.f29830g;
            this.f29831h = dVar.f29831h;
            this.f29832i = dVar.f29832i;
            this.f29835l = dVar.f29835l;
            String str = dVar.f29836m;
            this.f29836m = str;
            this.f29834k = dVar.f29834k;
            if (str != null) {
                aVar.put(str, this);
            }
            matrix.set(dVar.f29833j);
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

        @Override // q5.f.e
        public boolean a() {
            for (int i10 = 0; i10 < this.b.size(); i10++) {
                if (this.b.get(i10).a()) {
                    return true;
                }
            }
            return false;
        }

        @Override // q5.f.e
        public boolean b(int[] iArr) {
            boolean zB = false;
            for (int i10 = 0; i10 < this.b.size(); i10++) {
                zB |= this.b.get(i10).b(iArr);
            }
            return zB;
        }

        public void c(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray typedArrayI = k.i(resources, theme, attributeSet, q5.a.b);
            e(typedArrayI, xmlPullParser);
            typedArrayI.recycle();
        }

        public final void d() {
            this.f29833j.reset();
            this.f29833j.postTranslate(-this.f29827d, -this.f29828e);
            this.f29833j.postScale(this.f29829f, this.f29830g);
            this.f29833j.postRotate(this.f29826c, 0.0f, 0.0f);
            this.f29833j.postTranslate(this.f29831h + this.f29827d, this.f29832i + this.f29828e);
        }

        public final void e(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f29835l = null;
            this.f29826c = k.f(typedArray, xmlPullParser, "rotation", 5, this.f29826c);
            this.f29827d = typedArray.getFloat(1, this.f29827d);
            this.f29828e = typedArray.getFloat(2, this.f29828e);
            this.f29829f = k.f(typedArray, xmlPullParser, "scaleX", 3, this.f29829f);
            this.f29830g = k.f(typedArray, xmlPullParser, "scaleY", 4, this.f29830g);
            this.f29831h = k.f(typedArray, xmlPullParser, "translateX", 6, this.f29831h);
            this.f29832i = k.f(typedArray, xmlPullParser, "translateY", 7, this.f29832i);
            String string = typedArray.getString(0);
            if (string != null) {
                this.f29836m = string;
            }
            d();
        }

        public String getGroupName() {
            return this.f29836m;
        }

        public Matrix getLocalMatrix() {
            return this.f29833j;
        }

        public float getPivotX() {
            return this.f29827d;
        }

        public float getPivotY() {
            return this.f29828e;
        }

        public float getRotation() {
            return this.f29826c;
        }

        public float getScaleX() {
            return this.f29829f;
        }

        public float getScaleY() {
            return this.f29830g;
        }

        public float getTranslateX() {
            return this.f29831h;
        }

        public float getTranslateY() {
            return this.f29832i;
        }

        public void setPivotX(float f10) {
            if (f10 != this.f29827d) {
                this.f29827d = f10;
                d();
            }
        }

        public void setPivotY(float f10) {
            if (f10 != this.f29828e) {
                this.f29828e = f10;
                d();
            }
        }

        public void setRotation(float f10) {
            if (f10 != this.f29826c) {
                this.f29826c = f10;
                d();
            }
        }

        public void setScaleX(float f10) {
            if (f10 != this.f29829f) {
                this.f29829f = f10;
                d();
            }
        }

        public void setScaleY(float f10) {
            if (f10 != this.f29830g) {
                this.f29830g = f10;
                d();
            }
        }

        public void setTranslateX(float f10) {
            if (f10 != this.f29831h) {
                this.f29831h = f10;
                d();
            }
        }

        public void setTranslateY(float f10) {
            if (f10 != this.f29832i) {
                this.f29832i = f10;
                d();
            }
        }

        public d() {
            super();
            this.f29825a = new Matrix();
            this.b = new ArrayList<>();
            this.f29826c = 0.0f;
            this.f29827d = 0.0f;
            this.f29828e = 0.0f;
            this.f29829f = 1.0f;
            this.f29830g = 1.0f;
            this.f29831h = 0.0f;
            this.f29832i = 0.0f;
            this.f29833j = new Matrix();
            this.f29836m = null;
        }
    }
}
