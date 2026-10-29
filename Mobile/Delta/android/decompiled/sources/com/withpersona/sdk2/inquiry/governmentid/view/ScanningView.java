package com.withpersona.sdk2.inquiry.governmentid.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.withpersona.sdk2.inquiry.governmentid.view.ScanningView;
import i.a;
import jq.j;
import jq.z;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0015\u0018\u0000 L2\u00020\u0001:\u0001 B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001c\u0010\u0015J\u000f\u0010\u001d\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001d\u0010\u0015J\u000f\u0010\u001e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001e\u0010\u0015R\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010%\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010$R\u0016\u0010'\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010&R\u0014\u0010*\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010)R\u0016\u0010,\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010+R$\u00102\u001a\u00020-2\u0006\u0010.\u001a\u00020-8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\u001d\u0010/\"\u0004\b0\u00101R*\u00107\u001a\u00020-2\u0006\u0010.\u001a\u00020-8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b3\u0010/\u001a\u0004\b4\u00105\"\u0004\b6\u00101R*\u0010:\u001a\u0002082\u0006\u0010.\u001a\u0002088\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R*\u0010D\u001a\u00020\b2\u0006\u0010.\u001a\u00020\b8\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR*\u0010H\u001a\u00020\b2\u0006\u0010.\u001a\u00020\b8\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\bE\u0010?\u001a\u0004\bF\u0010A\"\u0004\bG\u0010CR$\u0010K\u001a\u00020-2\u0006\u0010.\u001a\u00020-8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bI\u00105\"\u0004\bJ\u00101¨\u0006M"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/view/ScanningView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "w", "h", "oldw", "oldh", "", "onSizeChanged", "(IIII)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "onDetachedFromWindow", "()V", "Landroid/graphics/Path;", "c", "()Landroid/graphics/Path;", "Landroid/graphics/SweepGradient;", "b", "()Landroid/graphics/SweepGradient;", "d", "f", "e", "Landroid/graphics/Matrix;", "a", "Landroid/graphics/Matrix;", "gradientMatrix", "Landroid/animation/ValueAnimator;", "Landroid/animation/ValueAnimator;", "animator", "Landroid/graphics/SweepGradient;", "gradient", "Landroid/graphics/Paint;", "Landroid/graphics/Paint;", "paint", "Landroid/graphics/Path;", "path", "", "value", "F", "setAnimationRotation", "(F)V", "animationRotation", "g", "getCornerRadius", "()F", "setCornerRadius", "cornerRadius", "", "Z", "isScanningAnimationEnabled", "()Z", "setScanningAnimationEnabled", "(Z)V", "i", "I", "getHighlightColor", "()I", "setHighlightColor", "(I)V", "highlightColor", "j", "getBorderColor", "setBorderColor", "borderColor", "getStrokeWidth", "setStrokeWidth", "strokeWidth", "k", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ScanningView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Matrix gradientMatrix;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final ValueAnimator animator;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public SweepGradient gradient;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Paint paint;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public Path path;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public float animationRotation;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public float cornerRadius;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public boolean isScanningAnimationEnabled;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public int highlightColor;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public int borderColor;

    public ScanningView(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.gradientMatrix = new Matrix();
        this.cornerRadius = (float) j.a(8.0d);
        this.isScanningAnimationEnabled = true;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.highlightColor = z.d(context2, a.f19910z, null, false, 6, null);
        this.borderColor = -1;
        this.gradient = b();
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth((float) j.a(3.0d));
        paint.setShader(this.gradient);
        this.paint = paint;
        this.path = c();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(4000L);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: vo.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ScanningView.a(this.f33340a, valueAnimator);
            }
        });
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.start();
        Intrinsics.checkNotNullExpressionValue(valueAnimatorOfFloat, "apply(...)");
        this.animator = valueAnimatorOfFloat;
    }

    public static void a(ScanningView scanningView, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(it, "it");
        scanningView.setAnimationRotation(it.getAnimatedFraction() * 360.0f);
    }

    private final void setAnimationRotation(float f10) {
        if (this.animationRotation == f10) {
            return;
        }
        this.animationRotation = f10;
        e();
    }

    public final SweepGradient b() {
        int[] iArr;
        if (this.isScanningAnimationEnabled) {
            int i10 = this.borderColor;
            iArr = new int[]{i10, i10, this.highlightColor};
        } else {
            int i11 = this.borderColor;
            iArr = new int[]{i11, i11, i11};
        }
        return new SweepGradient(0.5f, 0.5f, iArr, new float[]{0.0f, 0.5f, 1.0f});
    }

    public final Path c() {
        Path path = new Path();
        float strokeWidth = this.paint.getStrokeWidth();
        float f10 = strokeWidth / 2.0f;
        if (getMeasuredWidth() > strokeWidth && getMeasuredHeight() > strokeWidth) {
            float measuredWidth = getMeasuredWidth() - f10;
            float measuredHeight = getMeasuredHeight() - f10;
            float f11 = this.cornerRadius;
            path.addRoundRect(f10, f10, measuredWidth, measuredHeight, new float[]{f11, f11, f11, f11, f11, f11, f11, f11}, Path.Direction.CW);
        }
        return path;
    }

    public final void d() {
        SweepGradient sweepGradientB = b();
        this.gradient = sweepGradientB;
        this.paint.setShader(sweepGradientB);
        e();
        invalidate();
    }

    public final void e() {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int iMax = Integer.max(measuredWidth, measuredHeight);
        this.gradientMatrix.setRotate(this.animationRotation, 0.5f, 0.5f);
        float f10 = iMax;
        this.gradientMatrix.postScale(f10, f10);
        this.gradientMatrix.postTranslate((measuredWidth - iMax) / 2.0f, (measuredHeight - iMax) / 2.0f);
        this.gradient.setLocalMatrix(this.gradientMatrix);
        invalidate();
    }

    public final void f() {
        this.path = c();
        invalidate();
    }

    public final int getBorderColor() {
        return this.borderColor;
    }

    public final float getCornerRadius() {
        return this.cornerRadius;
    }

    public final int getHighlightColor() {
        return this.highlightColor;
    }

    public final float getStrokeWidth() {
        return this.paint.getStrokeWidth();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.animator.cancel();
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        canvas.drawPath(this.path, this.paint);
    }

    @Override // android.view.View
    public void onSizeChanged(int w5, int h10, int oldw, int oldh) {
        super.onSizeChanged(w5, h10, oldw, oldh);
        f();
        e();
    }

    public final void setBorderColor(int i10) {
        if (this.borderColor == i10) {
            return;
        }
        this.borderColor = i10;
        d();
    }

    public final void setCornerRadius(float f10) {
        if (this.cornerRadius == f10) {
            return;
        }
        this.cornerRadius = f10;
        f();
    }

    public final void setHighlightColor(int i10) {
        if (this.highlightColor == i10) {
            return;
        }
        this.highlightColor = i10;
        d();
    }

    public final void setScanningAnimationEnabled(boolean z10) {
        if (this.isScanningAnimationEnabled == z10) {
            return;
        }
        this.isScanningAnimationEnabled = z10;
        d();
    }

    public final void setStrokeWidth(float f10) {
        if (this.paint.getStrokeWidth() == f10) {
            return;
        }
        this.paint.setStrokeWidth(f10);
        invalidate();
    }
}
