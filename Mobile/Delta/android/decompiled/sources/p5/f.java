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
    public static final PorterDuff.Mode f28244k = PorterDuff.Mode.SRC_IN;
    public h b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public PorterDuffColorFilter f28245c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ColorFilter f28246d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f28247e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f28248f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Drawable.ConstantState f28249g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float[] f28250h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Matrix f28251i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Rect f28252j;

    public static class b extends AbstractC0494f {
        public b() {
        }

        private void f(TypedArray typedArray, XmlPullParser xmlPullParser) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.b = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.f28277a = androidx.core.graphics.e.d(string2);
            }
            this.f28278c = k.g(typedArray, xmlPullParser, "fillType", 2, 0);
        }

        @Override // p5.f.AbstractC0494f
        public boolean c() {
            return true;
        }

        public void e(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (k.h(xmlPullParser, "pathData")) {
                TypedArray typedArrayI = k.i(resources, theme, attributeSet, p5.a.f28219d);
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
        public int f28296a;
        public g b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ColorStateList f28297c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public PorterDuff.Mode f28298d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f28299e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Bitmap f28300f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public ColorStateList f28301g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public PorterDuff.Mode f28302h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f28303i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f28304j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f28305k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Paint f28306l;

        public h(h hVar) {
            this.f28297c = null;
            this.f28298d = f.f28244k;
            if (hVar != null) {
                this.f28296a = hVar.f28296a;
                g gVar = new g(hVar.b);
                this.b = gVar;
                if (hVar.b.f28284e != null) {
                    gVar.f28284e = new Paint(hVar.b.f28284e);
                }
                if (hVar.b.f28283d != null) {
                    this.b.f28283d = new Paint(hVar.b.f28283d);
                }
                this.f28297c = hVar.f28297c;
                this.f28298d = hVar.f28298d;
                this.f28299e = hVar.f28299e;
            }
        }

        public boolean a(int i10, int i11) {
            return i10 == this.f28300f.getWidth() && i11 == this.f28300f.getHeight();
        }

        public boolean b() {
            return !this.f28305k && this.f28301g == this.f28297c && this.f28302h == this.f28298d && this.f28304j == this.f28299e && this.f28303i == this.b.getRootAlpha();
        }

        public void c(int i10, int i11) {
            if (this.f28300f == null || !a(i10, i11)) {
                this.f28300f = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
                this.f28305k = true;
            }
        }

        public void d(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f28300f, (Rect) null, rect, e(colorFilter));
        }

        public Paint e(ColorFilter colorFilter) {
            if (!f() && colorFilter == null) {
                return null;
            }
            if (this.f28306l == null) {
                Paint paint = new Paint();
                this.f28306l = paint;
                paint.setFilterBitmap(true);
            }
            this.f28306l.setAlpha(this.b.getRootAlpha());
            this.f28306l.setColorFilter(colorFilter);
            return this.f28306l;
        }

        public boolean f() {
            return this.b.getRootAlpha() < 255;
        }

        public boolean g() {
            return this.b.f();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f28296a;
        }

        public boolean h(int[] iArr) {
            boolean zG = this.b.g(iArr);
            this.f28305k |= zG;
            return zG;
        }

        public void i() {
            this.f28301g = this.f28297c;
            this.f28302h = this.f28298d;
            this.f28303i = this.b.getRootAlpha();
            this.f28304j = this.f28299e;
            this.f28305k = false;
        }

        public void j(int i10, int i11) {
            this.f28300f.eraseColor(0);
            this.b.b(new Canvas(this.f28300f), i10, i11, null);
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
            this.f28297c = null;
            this.f28298d = f.f28244k;
            this.b = new g();
        }
    }

    public f() {
        this.f28248f = true;
        this.f28250h = new float[9];
        this.f28251i = new Matrix();
        this.f28252j = new Rect();
        this.b = new h();
    }

    public static int a(int i10, float f10) {
        return (i10 & 16777215) | (((int) (Color.alpha(i10) * f10)) << 24);
    }

    public static f b(@NonNull Resources resources, int i10, Resources.Theme theme) {
        f fVar = new f();
        fVar.f28243a = n2.h.e(resources, i10, theme);
        fVar.f28249g = new i(fVar.f28243a.getConstantState());
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
        return this.b.b.f28295p.get(str);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f28243a;
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
        arrayDeque.push(gVar.f28287h);
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
                        gVar.f28295p.put(cVar.getPathName(), cVar);
                    }
                    hVar.f28296a = cVar.f28279d | hVar.f28296a;
                    z10 = false;
                } else if ("clip-path".equals(name)) {
                    b bVar = new b();
                    bVar.e(resources, attributeSet, theme, xmlPullParser);
                    dVar.b.add(bVar);
                    if (bVar.getPathName() != null) {
                        gVar.f28295p.put(bVar.getPathName(), bVar);
                    }
                    hVar.f28296a = bVar.f28279d | hVar.f28296a;
                } else if ("group".equals(name)) {
                    d dVar2 = new d();
                    dVar2.c(resources, attributeSet, theme, xmlPullParser);
                    dVar.b.add(dVar2);
                    arrayDeque.push(dVar2);
                    if (dVar2.getGroupName() != null) {
                        gVar.f28295p.put(dVar2.getGroupName(), dVar2);
                    }
                    hVar.f28296a = dVar2.f28274k | hVar.f28296a;
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
        Drawable drawable = this.f28243a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.f28252j);
        if (this.f28252j.width() <= 0 || this.f28252j.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f28246d;
        if (colorFilter == null) {
            colorFilter = this.f28245c;
        }
        canvas.getMatrix(this.f28251i);
        this.f28251i.getValues(this.f28250h);
        float fAbs = Math.abs(this.f28250h[0]);
        float fAbs2 = Math.abs(this.f28250h[4]);
        float fAbs3 = Math.abs(this.f28250h[1]);
        float fAbs4 = Math.abs(this.f28250h[3]);
        if (fAbs3 != 0.0f || fAbs4 != 0.0f) {
            fAbs = 1.0f;
            fAbs2 = 1.0f;
        }
        int iWidth = (int) (this.f28252j.width() * fAbs);
        int iHeight = (int) (this.f28252j.height() * fAbs2);
        int iMin = Math.min(Barcode.FORMAT_PDF417, iWidth);
        int iMin2 = Math.min(Barcode.FORMAT_PDF417, iHeight);
        if (iMin <= 0 || iMin2 <= 0) {
            return;
        }
        int iSave = canvas.save();
        Rect rect = this.f28252j;
        canvas.translate(rect.left, rect.top);
        if (e()) {
            canvas.translate(this.f28252j.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        this.f28252j.offsetTo(0, 0);
        this.b.c(iMin, iMin2);
        if (!this.f28248f) {
            this.b.j(iMin, iMin2);
        } else if (!this.b.b()) {
            this.b.j(iMin, iMin2);
            this.b.i();
        }
        this.b.d(canvas, colorFilter, this.f28252j);
        canvas.restoreToCount(iSave);
    }

    public final boolean e() {
        return isAutoMirrored() && q2.a.f(this) == 1;
    }

    public void g(boolean z10) {
        this.f28248f = z10;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f28243a;
        return drawable != null ? q2.a.d(drawable) : this.b.b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f28243a;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.b.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f28243a;
        return drawable != null ? q2.a.e(drawable) : this.f28246d;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f28243a != null) {
            return new i(this.f28243a.getConstantState());
        }
        this.b.f28296a = getChangingConfigurations();
        return this.b;
    }

    @Override // p5.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f28243a;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.b.b.f28289j;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f28243a;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.b.b.f28288i;
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
        Drawable drawable = this.f28243a;
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
        hVar.f28298d = f(k.g(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList colorStateListC = k.c(typedArray, xmlPullParser, theme, "tint", 1);
        if (colorStateListC != null) {
            hVar.f28297c = colorStateListC;
        }
        hVar.f28299e = k.a(typedArray, xmlPullParser, "autoMirrored", 5, hVar.f28299e);
        gVar.f28290k = k.f(typedArray, xmlPullParser, "viewportWidth", 7, gVar.f28290k);
        float f10 = k.f(typedArray, xmlPullParser, "viewportHeight", 8, gVar.f28291l);
        gVar.f28291l = f10;
        if (gVar.f28290k <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f10 <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        gVar.f28288i = typedArray.getDimension(3, gVar.f28288i);
        float dimension = typedArray.getDimension(2, gVar.f28289j);
        gVar.f28289j = dimension;
        if (gVar.f28288i <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
        }
        if (dimension <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires height > 0");
        }
        gVar.setAlpha(k.f(typedArray, xmlPullParser, "alpha", 4, gVar.getAlpha()));
        String string = typedArray.getString(0);
        if (string != null) {
            gVar.f28293n = string;
            gVar.f28295p.put(string, gVar);
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
        Drawable drawable = this.f28243a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        Drawable drawable = this.f28243a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f28243a;
        return drawable != null ? q2.a.h(drawable) : this.b.f28299e;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.f28243a;
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
        ColorStateList colorStateList = this.b.f28297c;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // p5.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f28243a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f28247e && super.mutate() == this) {
            this.b = new h(this.b);
            this.f28247e = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f28243a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean z10;
        PorterDuff.Mode mode;
        Drawable drawable = this.f28243a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        h hVar = this.b;
        ColorStateList colorStateList = hVar.f28297c;
        if (colorStateList == null || (mode = hVar.f28298d) == null) {
            z10 = false;
        } else {
            this.f28245c = i(this.f28245c, colorStateList, mode);
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
        Drawable drawable = this.f28243a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j10);
        } else {
            super.scheduleSelf(runnable, j10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        Drawable drawable = this.f28243a;
        if (drawable != null) {
            drawable.setAlpha(i10);
        } else if (this.b.b.getRootAlpha() != i10) {
            this.b.b.setRootAlpha(i10);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z10) {
        Drawable drawable = this.f28243a;
        if (drawable != null) {
            q2.a.j(drawable, z10);
        } else {
            this.b.f28299e = z10;
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
        Drawable drawable = this.f28243a;
        if (drawable != null) {
            q2.a.n(drawable, i10);
        } else {
            setTintList(ColorStateList.valueOf(i10));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f28243a;
        if (drawable != null) {
            q2.a.o(drawable, colorStateList);
            return;
        }
        h hVar = this.b;
        if (hVar.f28297c != colorStateList) {
            hVar.f28297c = colorStateList;
            this.f28245c = i(this.f28245c, colorStateList, hVar.f28298d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f28243a;
        if (drawable != null) {
            q2.a.p(drawable, mode);
            return;
        }
        h hVar = this.b;
        if (hVar.f28298d != mode) {
            hVar.f28298d = mode;
            this.f28245c = i(this.f28245c, hVar.f28297c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        Drawable drawable = this.f28243a;
        return drawable != null ? drawable.setVisible(z10, z11) : super.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f28243a;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    public static class i extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Drawable.ConstantState f28307a;

        public i(Drawable.ConstantState constantState) {
            this.f28307a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f28307a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f28307a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            f fVar = new f();
            fVar.f28243a = (VectorDrawable) this.f28307a.newDrawable();
            return fVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            f fVar = new f();
            fVar.f28243a = (VectorDrawable) this.f28307a.newDrawable(resources);
            return fVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            f fVar = new f();
            fVar.f28243a = (VectorDrawable) this.f28307a.newDrawable(resources, theme);
            return fVar;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f28243a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f28246d = colorFilter;
            invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: p5.f$f, reason: collision with other inner class name */
    public static abstract class AbstractC0494f extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public androidx.core.graphics.e.b[] f28277a;
        public String b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f28278c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f28279d;

        public AbstractC0494f() {
            super();
            this.f28277a = null;
            this.f28278c = 0;
        }

        public boolean c() {
            return false;
        }

        public void d(Path path) {
            path.reset();
            androidx.core.graphics.e.b[] bVarArr = this.f28277a;
            if (bVarArr != null) {
                androidx.core.graphics.e.b.h(bVarArr, path);
            }
        }

        public androidx.core.graphics.e.b[] getPathData() {
            return this.f28277a;
        }

        public String getPathName() {
            return this.b;
        }

        public void setPathData(androidx.core.graphics.e.b[] bVarArr) {
            if (androidx.core.graphics.e.b(this.f28277a, bVarArr)) {
                androidx.core.graphics.e.k(this.f28277a, bVarArr);
            } else {
                this.f28277a = androidx.core.graphics.e.f(bVarArr);
            }
        }

        public AbstractC0494f(AbstractC0494f abstractC0494f) {
            super();
            this.f28277a = null;
            this.f28278c = 0;
            this.b = abstractC0494f.b;
            this.f28279d = abstractC0494f.f28279d;
            this.f28277a = androidx.core.graphics.e.f(abstractC0494f.f28277a);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.f28243a;
        if (drawable != null) {
            q2.a.g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        h hVar = this.b;
        hVar.b = new g();
        TypedArray typedArrayI = k.i(resources, theme, attributeSet, p5.a.f28217a);
        h(typedArrayI, xmlPullParser, theme);
        typedArrayI.recycle();
        hVar.f28296a = getChangingConfigurations();
        hVar.f28305k = true;
        d(resources, xmlPullParser, attributeSet, theme);
        this.f28245c = i(this.f28245c, hVar.f28297c, hVar.f28298d);
    }

    public f(@NonNull h hVar) {
        this.f28248f = true;
        this.f28250h = new float[9];
        this.f28251i = new Matrix();
        this.f28252j = new Rect();
        this.b = hVar;
        this.f28245c = i(this.f28245c, hVar.f28297c, hVar.f28298d);
    }

    public static class c extends AbstractC0494f {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int[] f28253e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public n2.d f28254f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f28255g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public n2.d f28256h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public float f28257i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public float f28258j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public float f28259k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public float f28260l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public float f28261m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public Paint.Cap f28262n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public Paint.Join f28263o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public float f28264p;

        public c() {
            this.f28255g = 0.0f;
            this.f28257i = 1.0f;
            this.f28258j = 1.0f;
            this.f28259k = 0.0f;
            this.f28260l = 1.0f;
            this.f28261m = 0.0f;
            this.f28262n = Paint.Cap.BUTT;
            this.f28263o = Paint.Join.MITER;
            this.f28264p = 4.0f;
        }

        @Override // p5.f.e
        public boolean a() {
            return this.f28256h.i() || this.f28254f.i();
        }

        @Override // p5.f.e
        public boolean b(int[] iArr) {
            return this.f28254f.j(iArr) | this.f28256h.j(iArr);
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
            TypedArray typedArrayI = k.i(resources, theme, attributeSet, p5.a.f28218c);
            h(typedArrayI, xmlPullParser, theme);
            typedArrayI.recycle();
        }

        public float getFillAlpha() {
            return this.f28258j;
        }

        public int getFillColor() {
            return this.f28256h.e();
        }

        public float getStrokeAlpha() {
            return this.f28257i;
        }

        public int getStrokeColor() {
            return this.f28254f.e();
        }

        public float getStrokeWidth() {
            return this.f28255g;
        }

        public float getTrimPathEnd() {
            return this.f28260l;
        }

        public float getTrimPathOffset() {
            return this.f28261m;
        }

        public float getTrimPathStart() {
            return this.f28259k;
        }

        public final void h(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
            this.f28253e = null;
            if (k.h(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.b = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.f28277a = androidx.core.graphics.e.d(string2);
                }
                this.f28256h = k.e(typedArray, xmlPullParser, theme, "fillColor", 1, 0);
                this.f28258j = k.f(typedArray, xmlPullParser, "fillAlpha", 12, this.f28258j);
                this.f28262n = e(k.g(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.f28262n);
                this.f28263o = f(k.g(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.f28263o);
                this.f28264p = k.f(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.f28264p);
                this.f28254f = k.e(typedArray, xmlPullParser, theme, "strokeColor", 3, 0);
                this.f28257i = k.f(typedArray, xmlPullParser, "strokeAlpha", 11, this.f28257i);
                this.f28255g = k.f(typedArray, xmlPullParser, "strokeWidth", 4, this.f28255g);
                this.f28260l = k.f(typedArray, xmlPullParser, "trimPathEnd", 6, this.f28260l);
                this.f28261m = k.f(typedArray, xmlPullParser, "trimPathOffset", 7, this.f28261m);
                this.f28259k = k.f(typedArray, xmlPullParser, "trimPathStart", 5, this.f28259k);
                this.f28278c = k.g(typedArray, xmlPullParser, "fillType", 13, this.f28278c);
            }
        }

        public void setFillAlpha(float f10) {
            this.f28258j = f10;
        }

        public void setFillColor(int i10) {
            this.f28256h.k(i10);
        }

        public void setStrokeAlpha(float f10) {
            this.f28257i = f10;
        }

        public void setStrokeColor(int i10) {
            this.f28254f.k(i10);
        }

        public void setStrokeWidth(float f10) {
            this.f28255g = f10;
        }

        public void setTrimPathEnd(float f10) {
            this.f28260l = f10;
        }

        public void setTrimPathOffset(float f10) {
            this.f28261m = f10;
        }

        public void setTrimPathStart(float f10) {
            this.f28259k = f10;
        }

        public c(c cVar) {
            super(cVar);
            this.f28255g = 0.0f;
            this.f28257i = 1.0f;
            this.f28258j = 1.0f;
            this.f28259k = 0.0f;
            this.f28260l = 1.0f;
            this.f28261m = 0.0f;
            this.f28262n = Paint.Cap.BUTT;
            this.f28263o = Paint.Join.MITER;
            this.f28264p = 4.0f;
            this.f28253e = cVar.f28253e;
            this.f28254f = cVar.f28254f;
            this.f28255g = cVar.f28255g;
            this.f28257i = cVar.f28257i;
            this.f28256h = cVar.f28256h;
            this.f28278c = cVar.f28278c;
            this.f28258j = cVar.f28258j;
            this.f28259k = cVar.f28259k;
            this.f28260l = cVar.f28260l;
            this.f28261m = cVar.f28261m;
            this.f28262n = cVar.f28262n;
            this.f28263o = cVar.f28263o;
            this.f28264p = cVar.f28264p;
        }
    }

    public static class g {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final Matrix f28280q = new Matrix();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Path f28281a;
        public final Path b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Matrix f28282c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Paint f28283d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Paint f28284e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public PathMeasure f28285f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f28286g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final d f28287h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public float f28288i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public float f28289j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public float f28290k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public float f28291l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f28292m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public String f28293n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public Boolean f28294o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final w1.a<String, Object> f28295p;

        public g() {
            this.f28282c = new Matrix();
            this.f28288i = 0.0f;
            this.f28289j = 0.0f;
            this.f28290k = 0.0f;
            this.f28291l = 0.0f;
            this.f28292m = 255;
            this.f28293n = null;
            this.f28294o = null;
            this.f28295p = new w1.a<>();
            this.f28287h = new d();
            this.f28281a = new Path();
            this.b = new Path();
        }

        public static float a(float f10, float f11, float f12, float f13) {
            return (f10 * f13) - (f11 * f12);
        }

        public void b(Canvas canvas, int i10, int i11, ColorFilter colorFilter) {
            c(this.f28287h, f28280q, canvas, i10, i11, colorFilter);
        }

        public final void c(d dVar, Matrix matrix, Canvas canvas, int i10, int i11, ColorFilter colorFilter) {
            d dVar2 = dVar;
            dVar2.f28265a.set(matrix);
            dVar2.f28265a.preConcat(dVar2.f28273j);
            canvas.save();
            int i12 = 0;
            while (i12 < dVar2.b.size()) {
                e eVar = dVar2.b.get(i12);
                if (eVar instanceof d) {
                    c((d) eVar, dVar2.f28265a, canvas, i10, i11, colorFilter);
                } else if (eVar instanceof AbstractC0494f) {
                    d(dVar2, (AbstractC0494f) eVar, canvas, i10, i11, colorFilter);
                }
                i12++;
                dVar2 = dVar;
            }
            canvas.restore();
        }

        public final void d(d dVar, AbstractC0494f abstractC0494f, Canvas canvas, int i10, int i11, ColorFilter colorFilter) {
            float f10 = i10 / this.f28290k;
            float f11 = i11 / this.f28291l;
            float fMin = Math.min(f10, f11);
            Matrix matrix = dVar.f28265a;
            this.f28282c.set(matrix);
            this.f28282c.postScale(f10, f11);
            float fE = e(matrix);
            if (fE == 0.0f) {
                return;
            }
            abstractC0494f.d(this.f28281a);
            Path path = this.f28281a;
            this.b.reset();
            if (abstractC0494f.c()) {
                this.b.setFillType(abstractC0494f.f28278c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                this.b.addPath(path, this.f28282c);
                canvas.clipPath(this.b);
                return;
            }
            c cVar = (c) abstractC0494f;
            float f12 = cVar.f28259k;
            if (f12 != 0.0f || cVar.f28260l != 1.0f) {
                float f13 = cVar.f28261m;
                float f14 = (f12 + f13) % 1.0f;
                float f15 = (cVar.f28260l + f13) % 1.0f;
                if (this.f28285f == null) {
                    this.f28285f = new PathMeasure();
                }
                this.f28285f.setPath(this.f28281a, false);
                float length = this.f28285f.getLength();
                float f16 = f14 * length;
                float f17 = f15 * length;
                path.reset();
                if (f16 > f17) {
                    this.f28285f.getSegment(f16, length, path, true);
                    this.f28285f.getSegment(0.0f, f17, path, true);
                } else {
                    this.f28285f.getSegment(f16, f17, path, true);
                }
                path.rLineTo(0.0f, 0.0f);
            }
            this.b.addPath(path, this.f28282c);
            if (cVar.f28256h.l()) {
                n2.d dVar2 = cVar.f28256h;
                if (this.f28284e == null) {
                    Paint paint = new Paint(1);
                    this.f28284e = paint;
                    paint.setStyle(Paint.Style.FILL);
                }
                Paint paint2 = this.f28284e;
                if (dVar2.h()) {
                    Shader shaderF = dVar2.f();
                    shaderF.setLocalMatrix(this.f28282c);
                    paint2.setShader(shaderF);
                    paint2.setAlpha(Math.round(cVar.f28258j * 255.0f));
                } else {
                    paint2.setShader(null);
                    paint2.setAlpha(255);
                    paint2.setColor(f.a(dVar2.e(), cVar.f28258j));
                }
                paint2.setColorFilter(colorFilter);
                this.b.setFillType(cVar.f28278c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                canvas.drawPath(this.b, paint2);
            }
            if (cVar.f28254f.l()) {
                n2.d dVar3 = cVar.f28254f;
                if (this.f28283d == null) {
                    Paint paint3 = new Paint(1);
                    this.f28283d = paint3;
                    paint3.setStyle(Paint.Style.STROKE);
                }
                Paint paint4 = this.f28283d;
                Paint.Join join = cVar.f28263o;
                if (join != null) {
                    paint4.setStrokeJoin(join);
                }
                Paint.Cap cap = cVar.f28262n;
                if (cap != null) {
                    paint4.setStrokeCap(cap);
                }
                paint4.setStrokeMiter(cVar.f28264p);
                if (dVar3.h()) {
                    Shader shaderF2 = dVar3.f();
                    shaderF2.setLocalMatrix(this.f28282c);
                    paint4.setShader(shaderF2);
                    paint4.setAlpha(Math.round(cVar.f28257i * 255.0f));
                } else {
                    paint4.setShader(null);
                    paint4.setAlpha(255);
                    paint4.setColor(f.a(dVar3.e(), cVar.f28257i));
                }
                paint4.setColorFilter(colorFilter);
                paint4.setStrokeWidth(cVar.f28255g * fMin * fE);
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
            if (this.f28294o == null) {
                this.f28294o = Boolean.valueOf(this.f28287h.a());
            }
            return this.f28294o.booleanValue();
        }

        public boolean g(int[] iArr) {
            return this.f28287h.b(iArr);
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public int getRootAlpha() {
            return this.f28292m;
        }

        public void setAlpha(float f10) {
            setRootAlpha((int) (f10 * 255.0f));
        }

        public void setRootAlpha(int i10) {
            this.f28292m = i10;
        }

        public g(g gVar) {
            this.f28282c = new Matrix();
            this.f28288i = 0.0f;
            this.f28289j = 0.0f;
            this.f28290k = 0.0f;
            this.f28291l = 0.0f;
            this.f28292m = 255;
            this.f28293n = null;
            this.f28294o = null;
            w1.a<String, Object> aVar = new w1.a<>();
            this.f28295p = aVar;
            this.f28287h = new d(gVar.f28287h, aVar);
            this.f28281a = new Path(gVar.f28281a);
            this.b = new Path(gVar.b);
            this.f28288i = gVar.f28288i;
            this.f28289j = gVar.f28289j;
            this.f28290k = gVar.f28290k;
            this.f28291l = gVar.f28291l;
            this.f28286g = gVar.f28286g;
            this.f28292m = gVar.f28292m;
            this.f28293n = gVar.f28293n;
            String str = gVar.f28293n;
            if (str != null) {
                aVar.put(str, this);
            }
            this.f28294o = gVar.f28294o;
        }
    }

    public static class d extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Matrix f28265a;
        public final ArrayList<e> b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f28266c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f28267d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f28268e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public float f28269f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f28270g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f28271h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public float f28272i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final Matrix f28273j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f28274k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int[] f28275l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public String f28276m;

        public d(d dVar, w1.a<String, Object> aVar) {
            AbstractC0494f bVar;
            super();
            this.f28265a = new Matrix();
            this.b = new ArrayList<>();
            this.f28266c = 0.0f;
            this.f28267d = 0.0f;
            this.f28268e = 0.0f;
            this.f28269f = 1.0f;
            this.f28270g = 1.0f;
            this.f28271h = 0.0f;
            this.f28272i = 0.0f;
            Matrix matrix = new Matrix();
            this.f28273j = matrix;
            this.f28276m = null;
            this.f28266c = dVar.f28266c;
            this.f28267d = dVar.f28267d;
            this.f28268e = dVar.f28268e;
            this.f28269f = dVar.f28269f;
            this.f28270g = dVar.f28270g;
            this.f28271h = dVar.f28271h;
            this.f28272i = dVar.f28272i;
            this.f28275l = dVar.f28275l;
            String str = dVar.f28276m;
            this.f28276m = str;
            this.f28274k = dVar.f28274k;
            if (str != null) {
                aVar.put(str, this);
            }
            matrix.set(dVar.f28273j);
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
            this.f28273j.reset();
            this.f28273j.postTranslate(-this.f28267d, -this.f28268e);
            this.f28273j.postScale(this.f28269f, this.f28270g);
            this.f28273j.postRotate(this.f28266c, 0.0f, 0.0f);
            this.f28273j.postTranslate(this.f28271h + this.f28267d, this.f28272i + this.f28268e);
        }

        public final void e(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f28275l = null;
            this.f28266c = k.f(typedArray, xmlPullParser, "rotation", 5, this.f28266c);
            this.f28267d = typedArray.getFloat(1, this.f28267d);
            this.f28268e = typedArray.getFloat(2, this.f28268e);
            this.f28269f = k.f(typedArray, xmlPullParser, "scaleX", 3, this.f28269f);
            this.f28270g = k.f(typedArray, xmlPullParser, "scaleY", 4, this.f28270g);
            this.f28271h = k.f(typedArray, xmlPullParser, "translateX", 6, this.f28271h);
            this.f28272i = k.f(typedArray, xmlPullParser, "translateY", 7, this.f28272i);
            String string = typedArray.getString(0);
            if (string != null) {
                this.f28276m = string;
            }
            d();
        }

        public String getGroupName() {
            return this.f28276m;
        }

        public Matrix getLocalMatrix() {
            return this.f28273j;
        }

        public float getPivotX() {
            return this.f28267d;
        }

        public float getPivotY() {
            return this.f28268e;
        }

        public float getRotation() {
            return this.f28266c;
        }

        public float getScaleX() {
            return this.f28269f;
        }

        public float getScaleY() {
            return this.f28270g;
        }

        public float getTranslateX() {
            return this.f28271h;
        }

        public float getTranslateY() {
            return this.f28272i;
        }

        public void setPivotX(float f10) {
            if (f10 != this.f28267d) {
                this.f28267d = f10;
                d();
            }
        }

        public void setPivotY(float f10) {
            if (f10 != this.f28268e) {
                this.f28268e = f10;
                d();
            }
        }

        public void setRotation(float f10) {
            if (f10 != this.f28266c) {
                this.f28266c = f10;
                d();
            }
        }

        public void setScaleX(float f10) {
            if (f10 != this.f28269f) {
                this.f28269f = f10;
                d();
            }
        }

        public void setScaleY(float f10) {
            if (f10 != this.f28270g) {
                this.f28270g = f10;
                d();
            }
        }

        public void setTranslateX(float f10) {
            if (f10 != this.f28271h) {
                this.f28271h = f10;
                d();
            }
        }

        public void setTranslateY(float f10) {
            if (f10 != this.f28272i) {
                this.f28272i = f10;
                d();
            }
        }

        public d() {
            super();
            this.f28265a = new Matrix();
            this.b = new ArrayList<>();
            this.f28266c = 0.0f;
            this.f28267d = 0.0f;
            this.f28268e = 0.0f;
            this.f28269f = 1.0f;
            this.f28270g = 1.0f;
            this.f28271h = 0.0f;
            this.f28272i = 0.0f;
            this.f28273j = new Matrix();
            this.f28276m = null;
        }
    }
}
