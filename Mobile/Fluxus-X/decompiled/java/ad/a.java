package ad;

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
import id.k;
import id.l;

/* JADX INFO: loaded from: classes2.dex */
public class a extends Drawable {

    @NonNull
    public final Paint b;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f402h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f403i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f404j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f405k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f406l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f407m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public k f409o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ColorStateList f410p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f396a = l.k();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Path f397c = new Path();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f398d = new Rect();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final RectF f399e = new RectF();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final RectF f400f = new RectF();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b f401g = new b();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f408n = true;

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
        this.f409o = kVar;
        Paint paint = new Paint(1);
        this.b = paint;
        paint.setStyle(Paint.Style.STROKE);
    }

    @NonNull
    public final Shader a() {
        Rect rect = this.f398d;
        copyBounds(rect);
        float fHeight = this.f402h / rect.height();
        return new LinearGradient(0.0f, rect.top, 0.0f, rect.bottom, new int[]{c.h(this.f403i, this.f407m), c.h(this.f404j, this.f407m), c.h(c.l(this.f404j, 0), this.f407m), c.h(c.l(this.f406l, 0), this.f407m), c.h(this.f406l, this.f407m), c.h(this.f405k, this.f407m)}, new float[]{0.0f, fHeight, 0.5f, 0.5f, 1.0f - fHeight, 1.0f}, Shader.TileMode.CLAMP);
    }

    @NonNull
    public RectF b() {
        this.f400f.set(getBounds());
        return this.f400f;
    }

    public void c(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f407m = colorStateList.getColorForState(getState(), this.f407m);
        }
        this.f410p = colorStateList;
        this.f408n = true;
        invalidateSelf();
    }

    public void d(float f10) {
        if (this.f402h != f10) {
            this.f402h = f10;
            this.b.setStrokeWidth(f10 * 1.3333f);
            this.f408n = true;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        if (this.f408n) {
            this.b.setShader(a());
            this.f408n = false;
        }
        float strokeWidth = this.b.getStrokeWidth() / 2.0f;
        copyBounds(this.f398d);
        this.f399e.set(this.f398d);
        float fMin = Math.min(this.f409o.r().a(b()), this.f399e.width() / 2.0f);
        if (this.f409o.u(b())) {
            this.f399e.inset(strokeWidth, strokeWidth);
            canvas.drawRoundRect(this.f399e, fMin, fMin, this.b);
        }
    }

    public void e(int i10, int i11, int i12, int i13) {
        this.f403i = i10;
        this.f404j = i11;
        this.f405k = i12;
        this.f406l = i13;
    }

    public void f(k kVar) {
        this.f409o = kVar;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f401g;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f402h > 0.0f ? -3 : -2;
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(@NonNull Outline outline) {
        if (this.f409o.u(b())) {
            outline.setRoundRect(getBounds(), this.f409o.r().a(b()));
        } else {
            copyBounds(this.f398d);
            this.f399e.set(this.f398d);
            this.f396a.d(this.f409o, 1.0f, this.f399e, this.f397c);
            xc.c.k(outline, this.f397c);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(@NonNull Rect rect) {
        if (!this.f409o.u(b())) {
            return true;
        }
        int iRound = Math.round(this.f402h);
        rect.set(iRound, iRound, iRound, iRound);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = this.f410p;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.f408n = true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        int colorForState;
        ColorStateList colorStateList = this.f410p;
        if (colorStateList != null && (colorForState = colorStateList.getColorForState(iArr, this.f407m)) != this.f407m) {
            this.f408n = true;
            this.f407m = colorForState;
        }
        if (this.f408n) {
            invalidateSelf();
        }
        return this.f408n;
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
