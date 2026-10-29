package com.withpersona.sdk2.inquiry.selfie.view;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.withpersona.sdk2.inquiry.selfie.view.Pi2ProgressArcView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import yp.u;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 /2\u00020\u0001:\u0001 B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000e2\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u000b¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000e2\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u001d\u0010\u0016J\u000f\u0010\u001e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001e\u0010\u0018R\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010%\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010'\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010$R\u0016\u0010\u0012\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010$R\u0018\u0010*\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010)R\u0018\u0010+\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010)R\u0018\u0010-\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010)R\u0016\u0010.\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010$¨\u00060"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/view/Pi2ProgressArcView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "newColor", "", "setStrokeColor", "(I)V", "", "newWidth", "setStrokeWidth", "(F)V", "progress", "Lkotlin/Function0;", "onAnimationEnd", "f", "(FLkotlin/jvm/functions/Function0;)V", "e", "()V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "h", "d", "Landroid/graphics/Paint;", "a", "Landroid/graphics/Paint;", "paint", "b", "F", "size", "c", "startAngle", "Landroid/animation/ValueAnimator;", "Landroid/animation/ValueAnimator;", "animator", "indeterminateAnimator", "g", "rotateToZeroAnimator", "_rotation", "i", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class Pi2ProgressArcView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Paint paint;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final float size;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final float startAngle;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public float progress;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public ValueAnimator animator;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public ValueAnimator indeterminateAnimator;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public ValueAnimator rotateToZeroAnimator;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public float _rotation;

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\u000e\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"com/withpersona/sdk2/inquiry/selfie/view/Pi2ProgressArcView$b", "Landroid/animation/ValueAnimator$AnimatorUpdateListener;", "Landroid/animation/ValueAnimator;", "animator", "", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "", "a", "F", "getLastProgress", "()F", "setLastProgress", "(F)V", "lastProgress", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public float lastProgress;
        public final /* synthetic */ ValueAnimator b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Pi2ProgressArcView f13109c;

        public b(ValueAnimator valueAnimator, Pi2ProgressArcView pi2ProgressArcView) {
            this.b = valueAnimator;
            this.f13109c = pi2ProgressArcView;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
            Object animatedValue = this.b.getAnimatedValue();
            Intrinsics.d(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float fFloatValue = ((Float) animatedValue).floatValue();
            float fAbs = Math.abs(fFloatValue - this.lastProgress);
            float f10 = this.f13109c._rotation;
            Pi2ProgressArcView pi2ProgressArcView = this.f13109c;
            pi2ProgressArcView._rotation = (pi2ProgressArcView._rotation + fAbs) % 360;
            if (f10 > this.f13109c._rotation) {
                this.f13109c._rotation = 0.0f;
                animator.cancel();
            }
            this.lastProgress = fFloatValue;
            this.f13109c.invalidate();
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Function0 f13110a;

        public c(Function0 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f13110a = function;
        }

        @Override // java.lang.Runnable
        public final /* synthetic */ void run() {
            this.f13110a.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\u000e\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"com/withpersona/sdk2/inquiry/selfie/view/Pi2ProgressArcView$d", "Landroid/animation/ValueAnimator$AnimatorUpdateListener;", "Landroid/animation/ValueAnimator;", "animator", "", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "", "a", "F", "getLastProgress", "()F", "setLastProgress", "(F)V", "lastProgress", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class d implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public float lastProgress;
        public final /* synthetic */ ValueAnimator b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Pi2ProgressArcView f13112c;

        public d(ValueAnimator valueAnimator, Pi2ProgressArcView pi2ProgressArcView) {
            this.b = valueAnimator;
            this.f13112c = pi2ProgressArcView;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
            Object animatedValue = this.b.getAnimatedValue();
            Intrinsics.d(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float fFloatValue = ((Float) animatedValue).floatValue();
            float fAbs = Math.abs(fFloatValue - this.lastProgress);
            Pi2ProgressArcView pi2ProgressArcView = this.f13112c;
            pi2ProgressArcView._rotation = (pi2ProgressArcView._rotation + fAbs) % 360;
            this.lastProgress = fFloatValue;
            this.f13112c.invalidate();
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0006¨\u0006\u000b¸\u0006\n"}, d2 = {"androidx/core/animation/AnimatorKt$addListener$listener$1", "Landroid/animation/Animator$AnimatorListener;", "Landroid/animation/Animator;", "animator", "", "onAnimationRepeat", "(Landroid/animation/Animator;)V", "onAnimationEnd", "onAnimationCancel", "onAnimationStart", "androidx/core/animation/AnimatorKt$doOnEnd$$inlined$addListener$1", "core-ktx_release"}, k = 1, mv = {2, 2, 0})
    public static final class e implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Function0 f13113a;
        public final /* synthetic */ Pi2ProgressArcView b;

        public e(Function0 function0, Pi2ProgressArcView pi2ProgressArcView) {
            this.f13113a = function0;
            this.b = pi2ProgressArcView;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@NotNull Animator animator) {
            Intrinsics.e(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NotNull Animator animator) {
            Intrinsics.e(animator, "animator");
            Function0 function0 = this.f13113a;
            if (function0 != null) {
                this.b.postDelayed(new c(function0), 100L);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(@NotNull Animator animator) {
            Intrinsics.e(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@NotNull Animator animator) {
            Intrinsics.e(animator, "animator");
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Pi2ProgressArcView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void g(Pi2ProgressArcView pi2ProgressArcView, float f10, Function0 function0, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            function0 = null;
        }
        pi2ProgressArcView.f(f10, function0);
    }

    public static final void i(Pi2ProgressArcView pi2ProgressArcView, ValueAnimator valueAnimator, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.d(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        pi2ProgressArcView.progress = ((Float) animatedValue).floatValue();
        pi2ProgressArcView.invalidate();
    }

    public final void d() {
        if (this._rotation == 0.0f) {
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 100.0f);
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.addUpdateListener(new b(valueAnimatorOfFloat, this));
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setRepeatMode(2);
        valueAnimatorOfFloat.start();
        this.rotateToZeroAnimator = valueAnimatorOfFloat;
    }

    public final void e() {
        ValueAnimator valueAnimator = this.rotateToZeroAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.indeterminateAnimator;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        h(25.0f, null);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 100.0f);
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.addUpdateListener(new d(valueAnimatorOfFloat, this));
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setRepeatMode(2);
        valueAnimatorOfFloat.start();
        this.indeterminateAnimator = valueAnimatorOfFloat;
    }

    public final void f(float progress, @Nullable Function0<Unit> onAnimationEnd) {
        ValueAnimator valueAnimator = this.indeterminateAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        d();
        h(progress, onAnimationEnd);
    }

    public final void h(float progress, Function0<Unit> onAnimationEnd) {
        if (this.progress == progress) {
            if (onAnimationEnd != null) {
                onAnimationEnd.invoke();
                return;
            }
            return;
        }
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f10 = this.progress;
        final ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f10, progress);
        valueAnimatorOfFloat.setDuration((long) (1000 * (Math.abs(progress - f10) / 100.0f)));
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: iq.o
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                Pi2ProgressArcView.i(this.f20837a, valueAnimatorOfFloat, valueAnimator2);
            }
        });
        Intrinsics.checkNotNull(valueAnimatorOfFloat);
        valueAnimatorOfFloat.addListener(new e(onAnimationEnd, this));
        valueAnimatorOfFloat.start();
        this.animator = valueAnimatorOfFloat;
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        int width = getWidth() / 2;
        int height = getHeight() / 2;
        float fMin = (this.size * Math.min(getWidth(), getHeight())) - (this.paint.getStrokeWidth() / 2);
        float f10 = width;
        float f11 = height;
        canvas.drawArc(f10 - fMin, f11 - fMin, f10 + fMin, f11 + fMin, this.startAngle + this._rotation, (this.progress * 360) / 100.0f, false, this.paint);
    }

    public final void setStrokeColor(int newColor) {
        this.paint.setColor(newColor);
    }

    public final void setStrokeWidth(float newWidth) {
        this.paint.setStrokeWidth(newWidth);
    }

    public /* synthetic */ Pi2ProgressArcView(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Pi2ProgressArcView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        Paint paint = new Paint(1);
        this.paint = paint;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u.f36282d, i10, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        try {
            this.size = typedArrayObtainStyledAttributes.getFloat(u.f36283e, 0.4f);
            this.startAngle = typedArrayObtainStyledAttributes.getFloat(u.f36285g, 270.0f);
            this.progress = typedArrayObtainStyledAttributes.getFloat(u.f36284f, 0.0f);
            paint.setColor(typedArrayObtainStyledAttributes.getColor(u.f36286h, -1));
            paint.setStrokeWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(u.f36287i, 4));
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(Paint.Cap.BUTT);
            typedArrayObtainStyledAttributes.recycle();
            setWillNotDraw(false);
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }
}
