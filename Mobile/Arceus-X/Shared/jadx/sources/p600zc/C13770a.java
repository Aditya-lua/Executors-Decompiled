package p600zc;

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
import androidx.core.graphics.C0546c;
import p168hd.C6367k;
import p168hd.C6368l;
import p513wc.C12348c;

/* JADX INFO: renamed from: zc.a */
/* JADX INFO: loaded from: classes2.dex */
public class C13770a extends Drawable {

    /* JADX INFO: renamed from: b */
    @NonNull
    public final Paint f48337b;

    /* JADX INFO: renamed from: h */
    public float f48343h;

    /* JADX INFO: renamed from: i */
    public int f48344i;

    /* JADX INFO: renamed from: j */
    public int f48345j;

    /* JADX INFO: renamed from: k */
    public int f48346k;

    /* JADX INFO: renamed from: l */
    public int f48347l;

    /* JADX INFO: renamed from: m */
    public int f48348m;

    /* JADX INFO: renamed from: o */
    public C6367k f48350o;

    /* JADX INFO: renamed from: p */
    public ColorStateList f48351p;

    /* JADX INFO: renamed from: a */
    public final C6368l f48336a = C6368l.m27819k();

    /* JADX INFO: renamed from: c */
    public final Path f48338c = new Path();

    /* JADX INFO: renamed from: d */
    public final Rect f48339d = new Rect();

    /* JADX INFO: renamed from: e */
    public final RectF f48340e = new RectF();

    /* JADX INFO: renamed from: f */
    public final RectF f48341f = new RectF();

    /* JADX INFO: renamed from: g */
    public final b f48342g = new b();

    /* JADX INFO: renamed from: n */
    public boolean f48349n = true;

    /* JADX INFO: renamed from: zc.a$b */
    public class b extends Drawable.ConstantState {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public b() {
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable() {
            return C13770a.this;
        }
    }

    public C13770a(C6367k c6367k) {
        this.f48350o = c6367k;
        Paint paint = new Paint(1);
        this.f48337b = paint;
        paint.setStyle(Paint.Style.STROKE);
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public final Shader m50178a() {
        Rect rect = this.f48339d;
        copyBounds(rect);
        float fHeight = this.f48343h / rect.height();
        return new LinearGradient(0.0f, rect.top, 0.0f, rect.bottom, new int[]{C0546c.m2674h(this.f48344i, this.f48348m), C0546c.m2674h(this.f48345j, this.f48348m), C0546c.m2674h(C0546c.m2678l(this.f48345j, 0), this.f48348m), C0546c.m2674h(C0546c.m2678l(this.f48347l, 0), this.f48348m), C0546c.m2674h(this.f48347l, this.f48348m), C0546c.m2674h(this.f48346k, this.f48348m)}, new float[]{0.0f, fHeight, 0.5f, 0.5f, 1.0f - fHeight, 1.0f}, Shader.TileMode.CLAMP);
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public RectF m50179b() {
        this.f48341f.set(getBounds());
        return this.f48341f;
    }

    /* JADX INFO: renamed from: c */
    public void m50180c(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f48348m = colorStateList.getColorForState(getState(), this.f48348m);
        }
        this.f48351p = colorStateList;
        this.f48349n = true;
        invalidateSelf();
    }

    /* JADX INFO: renamed from: d */
    public void m50181d(float f10) {
        if (this.f48343h != f10) {
            this.f48343h = f10;
            this.f48337b.setStrokeWidth(f10 * 1.3333f);
            this.f48349n = true;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        if (this.f48349n) {
            this.f48337b.setShader(m50178a());
            this.f48349n = false;
        }
        float strokeWidth = this.f48337b.getStrokeWidth() / 2.0f;
        copyBounds(this.f48339d);
        this.f48340e.set(this.f48339d);
        float fMin = Math.min(this.f48350o.m27779r().mo27683a(m50179b()), this.f48340e.width() / 2.0f);
        if (this.f48350o.m27782u(m50179b())) {
            this.f48340e.inset(strokeWidth, strokeWidth);
            canvas.drawRoundRect(this.f48340e, fMin, fMin, this.f48337b);
        }
    }

    /* JADX INFO: renamed from: e */
    public void m50182e(int i10, int i11, int i12, int i13) {
        this.f48344i = i10;
        this.f48345j = i11;
        this.f48346k = i12;
        this.f48347l = i13;
    }

    /* JADX INFO: renamed from: f */
    public void m50183f(C6367k c6367k) {
        this.f48350o = c6367k;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f48342g;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f48343h > 0.0f ? -3 : -2;
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(@NonNull Outline outline) {
        if (this.f48350o.m27782u(m50179b())) {
            outline.setRoundRect(getBounds(), this.f48350o.m27779r().mo27683a(m50179b()));
        } else {
            copyBounds(this.f48339d);
            this.f48340e.set(this.f48339d);
            this.f48336a.m27823d(this.f48350o, 1.0f, this.f48340e, this.f48338c);
            C12348c.m46212k(outline, this.f48338c);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(@NonNull Rect rect) {
        if (!this.f48350o.m27782u(m50179b())) {
            return true;
        }
        int iRound = Math.round(this.f48343h);
        rect.set(iRound, iRound, iRound, iRound);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = this.f48351p;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.f48349n = true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        int colorForState;
        ColorStateList colorStateList = this.f48351p;
        if (colorStateList != null && (colorForState = colorStateList.getColorForState(iArr, this.f48348m)) != this.f48348m) {
            this.f48349n = true;
            this.f48348m = colorForState;
        }
        if (this.f48349n) {
            invalidateSelf();
        }
        return this.f48349n;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f48337b.setAlpha(i10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f48337b.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
