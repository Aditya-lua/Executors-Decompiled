package yc;

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
import gd.k;
import gd.l;

/* JADX INFO: loaded from: classes2.dex */
public class a extends Drawable {

    @NonNull
    public final Paint b;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f35819h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f35820i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f35821j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f35822k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f35823l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f35824m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public k f35826o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ColorStateList f35827p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f35813a = l.k();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Path f35814c = new Path();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f35815d = new Rect();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final RectF f35816e = new RectF();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final RectF f35817f = new RectF();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b f35818g = new b();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f35825n = true;

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
        this.f35826o = kVar;
        Paint paint = new Paint(1);
        this.b = paint;
        paint.setStyle(Paint.Style.STROKE);
    }

    @NonNull
    public final Shader a() {
        Rect rect = this.f35815d;
        copyBounds(rect);
        float fHeight = this.f35819h / rect.height();
        return new LinearGradient(0.0f, rect.top, 0.0f, rect.bottom, new int[]{c.h(this.f35820i, this.f35824m), c.h(this.f35821j, this.f35824m), c.h(c.l(this.f35821j, 0), this.f35824m), c.h(c.l(this.f35823l, 0), this.f35824m), c.h(this.f35823l, this.f35824m), c.h(this.f35822k, this.f35824m)}, new float[]{0.0f, fHeight, 0.5f, 0.5f, 1.0f - fHeight, 1.0f}, Shader.TileMode.CLAMP);
    }

    @NonNull
    public RectF b() {
        this.f35817f.set(getBounds());
        return this.f35817f;
    }

    public void c(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f35824m = colorStateList.getColorForState(getState(), this.f35824m);
        }
        this.f35827p = colorStateList;
        this.f35825n = true;
        invalidateSelf();
    }

    public void d(float f10) {
        if (this.f35819h != f10) {
            this.f35819h = f10;
            this.b.setStrokeWidth(f10 * 1.3333f);
            this.f35825n = true;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        if (this.f35825n) {
            this.b.setShader(a());
            this.f35825n = false;
        }
        float strokeWidth = this.b.getStrokeWidth() / 2.0f;
        copyBounds(this.f35815d);
        this.f35816e.set(this.f35815d);
        float fMin = Math.min(this.f35826o.r().a(b()), this.f35816e.width() / 2.0f);
        if (this.f35826o.u(b())) {
            this.f35816e.inset(strokeWidth, strokeWidth);
            canvas.drawRoundRect(this.f35816e, fMin, fMin, this.b);
        }
    }

    public void e(int i10, int i11, int i12, int i13) {
        this.f35820i = i10;
        this.f35821j = i11;
        this.f35822k = i12;
        this.f35823l = i13;
    }

    public void f(k kVar) {
        this.f35826o = kVar;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f35818g;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f35819h > 0.0f ? -3 : -2;
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(@NonNull Outline outline) {
        if (this.f35826o.u(b())) {
            outline.setRoundRect(getBounds(), this.f35826o.r().a(b()));
        } else {
            copyBounds(this.f35815d);
            this.f35816e.set(this.f35815d);
            this.f35813a.d(this.f35826o, 1.0f, this.f35816e, this.f35814c);
            vc.c.k(outline, this.f35814c);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(@NonNull Rect rect) {
        if (!this.f35826o.u(b())) {
            return true;
        }
        int iRound = Math.round(this.f35819h);
        rect.set(iRound, iRound, iRound, iRound);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = this.f35827p;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.f35825n = true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        int colorForState;
        ColorStateList colorStateList = this.f35827p;
        if (colorStateList != null && (colorForState = colorStateList.getColorForState(iArr, this.f35824m)) != this.f35824m) {
            this.f35825n = true;
            this.f35824m = colorForState;
        }
        if (this.f35825n) {
            invalidateSelf();
        }
        return this.f35825n;
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
