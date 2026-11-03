package zc;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.core.graphics.c;
import hd.k;
import hd.l;

/* JADX INFO: loaded from: classes2.dex */
public class a extends Drawable {

    @NonNull
    public final Paint b;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f38058h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f38059i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f38060j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f38061k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f38062l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f38063m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public k f38065o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ColorStateList f38066p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f38052a = l.k();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Path f38053c = new Path();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f38054d = new Rect();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final RectF f38055e = new RectF();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final RectF f38056f = new RectF();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b f38057g = new b();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f38064n = true;

    public class b extends Drawable.ConstantState {
        public b() {
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable() {
            return a.this;
        }
    }

    public a(k kVar) {
        this.f38065o = kVar;
        Paint paint = new Paint(1);
        this.b = paint;
        paint.setStyle(Paint.Style.STROKE);
    }

    @NonNull
    public final Shader a() {
        Rect rect = this.f38054d;
        copyBounds(rect);
        float fHeight = this.f38058h / rect.height();
        return new LinearGradient(0.0f, rect.top, 0.0f, rect.bottom, new int[]{c.h(this.f38059i, this.f38063m), c.h(this.f38060j, this.f38063m), c.h(c.l(this.f38060j, 0), this.f38063m), c.h(c.l(this.f38062l, 0), this.f38063m), c.h(this.f38062l, this.f38063m), c.h(this.f38061k, this.f38063m)}, new float[]{0.0f, fHeight, 0.5f, 0.5f, 1.0f - fHeight, 1.0f}, Shader.TileMode.CLAMP);
    }

    @NonNull
    public RectF b() {
        this.f38056f.set(getBounds());
        return this.f38056f;
    }

    public void c(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f38063m = colorStateList.getColorForState(getState(), this.f38063m);
        }
        this.f38066p = colorStateList;
        this.f38064n = true;
        invalidateSelf();
    }

    public void d(float f10) {
        if (this.f38058h != f10) {
            this.f38058h = f10;
            this.b.setStrokeWidth(f10 * 1.3333f);
            this.f38064n = true;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        if (this.f38064n) {
            this.b.setShader(a());
            this.f38064n = false;
        }
        float strokeWidth = this.b.getStrokeWidth() / 2.0f;
        copyBounds(this.f38054d);
        this.f38055e.set(this.f38054d);
        float fMin = Math.min(this.f38065o.r().a(b()), this.f38055e.width() / 2.0f);
        if (this.f38065o.u(b())) {
            this.f38055e.inset(strokeWidth, strokeWidth);
            canvas.drawRoundRect(this.f38055e, fMin, fMin, this.b);
        }
    }

    public void e(int i10, int i11, int i12, int i13) {
        this.f38059i = i10;
        this.f38060j = i11;
        this.f38061k = i12;
        this.f38062l = i13;
    }

    public void f(k kVar) {
        this.f38065o = kVar;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f38057g;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f38058h > 0.0f ? -3 : -2;
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(@NonNull Outline outline) {
        if (this.f38065o.u(b())) {
            outline.setRoundRect(getBounds(), this.f38065o.r().a(b()));
        } else {
            copyBounds(this.f38054d);
            this.f38055e.set(this.f38054d);
            this.f38052a.d(this.f38065o, 1.0f, this.f38055e, this.f38053c);
            wc.c.k(outline, this.f38053c);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(@NonNull Rect rect) {
        if (!this.f38065o.u(b())) {
            return true;
        }
        int iRound = Math.round(this.f38058h);
        rect.set(iRound, iRound, iRound, iRound);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = this.f38066p;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.f38064n = true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        int colorForState;
        ColorStateList colorStateList = this.f38066p;
        if (colorStateList != null && (colorForState = colorStateList.getColorForState(iArr, this.f38063m)) != this.f38063m) {
            this.f38064n = true;
            this.f38063m = colorForState;
        }
        if (this.f38064n) {
            invalidateSelf();
        }
        return this.f38064n;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.b.setAlpha(i10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.b.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
