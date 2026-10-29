package com.withpersona.sdk2.inquiry.shared.p055ui;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.core.graphics.C0546c;
import com.withpersona.sdk2.inquiry.shared.p055ui.SpotlightView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p226jq.C7265j;
import p226jq.C7285w;
import p526wq.C12543z;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0010\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u000b¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u0017\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0017\u0010\u0007J/\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u0018\u0010!\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010$\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010(\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010\u0014\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010#R\u0018\u0010,\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010+R\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00103\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u00102R\"\u0010;\u001a\u0002048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R.\u0010C\u001a\u0004\u0018\u00010\u00012\b\u0010<\u001a\u0004\u0018\u00010\u00018\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010B¨\u0006D"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/shared/ui/SpotlightView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "onFinishInflate", "()V", "", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "Landroid/graphics/Canvas;", "canvas", "draw", "(Landroid/graphics/Canvas;)V", "borderColor", "setBorderColor", "(I)V", "e", "left", "top", "right", "bottom", "g", "(IIII)V", "Landroid/animation/ValueAnimator;", "a", "Landroid/animation/ValueAnimator;", "intensityAnimator", "b", "I", "targetViewId", "Landroid/graphics/Path;", "c", "Landroid/graphics/Path;", "clipPath", "d", "Landroid/graphics/Rect;", "Landroid/graphics/Rect;", "rect", "Landroid/graphics/Paint;", "f", "Landroid/graphics/Paint;", "borderPaint", "Landroid/view/View$OnLayoutChangeListener;", "Landroid/view/View$OnLayoutChangeListener;", "targetLayoutChangeListener", "", "h", "F", "getRadius", "()F", "setRadius", "(F)V", "radius", "value", "i", "Landroid/view/View;", "getTargetView", "()Landroid/view/View;", "setTargetView", "(Landroid/view/View;)V", "targetView", "shared_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class SpotlightView extends View {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public ValueAnimator intensityAnimator;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public int targetViewId;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public Path clipPath;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public int borderColor;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public Rect rect;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final Paint borderPaint;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final View.OnLayoutChangeListener targetLayoutChangeListener;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public float radius;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public View targetView;

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.shared.ui.SpotlightView$a */
    @Metadata(m31664d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0006¨\u0006\n"}, m31665d2 = {"androidx/core/animation/AnimatorKt$addListener$listener$1", "Landroid/animation/Animator$AnimatorListener;", "Landroid/animation/Animator;", "animator", "", "onAnimationRepeat", "(Landroid/animation/Animator;)V", "onAnimationEnd", "onAnimationCancel", "onAnimationStart", "core-ktx_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class C4017a implements Animator.AnimatorListener {
        public C4017a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            SpotlightView.this.intensityAnimator = null;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    public SpotlightView(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint();
        paint.setStrokeWidth((float) C7265j.m30285a(7.0d));
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        this.borderPaint = paint;
        this.targetLayoutChangeListener = new View.OnLayoutChangeListener() { // from class: wq.r
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                SpotlightView.m20468i(this.f44765a, view, i10, i11, i12, i13, i14, i15, i16, i17);
            }
        };
        m20469e(context, attributeSet);
    }

    /* JADX INFO: renamed from: f */
    public static final Unit m20466f(SpotlightView spotlightView) {
        Object parent = spotlightView.getParent();
        if (parent instanceof View) {
            spotlightView.setTargetView(((View) parent).findViewById(spotlightView.targetViewId));
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: h */
    public static final void m20467h(SpotlightView spotlightView, int i10, int i11, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(it, "it");
        spotlightView.borderColor = C0546c.m2669c(i10, i11, it.getAnimatedFraction());
        spotlightView.invalidate();
    }

    /* JADX INFO: renamed from: i */
    public static final void m20468i(SpotlightView spotlightView, View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        spotlightView.m20470g(i10, i11, i12, i13);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003c  */
    @Override // android.view.View
    public void draw(@NotNull Canvas canvas) throws Throwable {
        Canvas canvas2;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Path path = this.clipPath;
        if (path == null) {
            super.draw(canvas);
            return;
        }
        int iSave = canvas.save();
        try {
            canvas.clipOutPath(path);
            super.draw(canvas);
            int i10 = this.borderColor;
            if (i10 != 0) {
                this.borderPaint.setColor(i10);
                Rect rect = this.rect;
                if (rect != null) {
                    float f10 = rect.left;
                    float f11 = rect.top;
                    float f12 = rect.right;
                    float f13 = rect.bottom;
                    float f14 = this.radius;
                    canvas2 = canvas;
                    try {
                        canvas2.drawRoundRect(f10, f11, f12, f13, f14, f14, this.borderPaint);
                    } catch (Throwable th2) {
                        th = th2;
                        Throwable th3 = th;
                        canvas2.restoreToCount(iSave);
                        throw th3;
                    }
                } else {
                    canvas2 = canvas;
                }
            } else {
                canvas2 = canvas;
            }
            canvas2.restoreToCount(iSave);
        } catch (Throwable th4) {
            th = th4;
            canvas2 = canvas;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m20469e(Context context, AttributeSet attrs) {
        Resources.Theme theme;
        TypedArray typedArrayObtainStyledAttributes;
        if (context == null || (theme = context.getTheme()) == null || (typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attrs, C7285w.f28134j, 0, 0)) == null) {
            return;
        }
        try {
            this.targetViewId = typedArrayObtainStyledAttributes.getResourceId(C7285w.f28136l, 0);
            this.radius = typedArrayObtainStyledAttributes.getDimensionPixelSize(C7285w.f28135k, 0);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m20470g(int left, int top, int right, int bottom) {
        this.rect = new Rect(left, top, right, bottom);
        Path path = new Path();
        float f10 = this.radius;
        path.addRoundRect(left, top, right, bottom, f10, f10, Path.Direction.CW);
        this.clipPath = path;
        invalidate();
    }

    public final float getRadius() {
        return this.radius;
    }

    @Nullable
    public final View getTargetView() {
        return this.targetView;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        C12543z.m46890b(this, new Function0() { // from class: wq.q
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SpotlightView.m20466f(this.f44764a);
            }
        });
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        View view = this.targetView;
        if (view != null) {
            m20470g(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    public final void setBorderColor(final int borderColor) {
        final int i10 = this.borderColor;
        if (i10 == borderColor) {
            return;
        }
        ValueAnimator valueAnimator = this.intensityAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            valueAnimator.removeAllUpdateListeners();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.setStartDelay(0L);
        valueAnimatorOfFloat.setRepeatCount(0);
        valueAnimatorOfFloat.setDuration(200L);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: wq.p
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                SpotlightView.m20467h(this.f44761a, i10, borderColor, valueAnimator2);
            }
        });
        Intrinsics.checkNotNull(valueAnimatorOfFloat);
        valueAnimatorOfFloat.addListener(new C4017a());
        valueAnimatorOfFloat.start();
        this.intensityAnimator = valueAnimatorOfFloat;
    }

    public final void setRadius(float f10) {
        this.radius = f10;
    }

    public final void setTargetView(@Nullable View view) {
        View view2 = this.targetView;
        if (view2 != null) {
            view2.removeOnLayoutChangeListener(this.targetLayoutChangeListener);
        }
        this.targetView = view;
        if (view != null) {
            view.addOnLayoutChangeListener(this.targetLayoutChangeListener);
            m20470g(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
        requestLayout();
    }
}
