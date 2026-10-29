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
import androidx.core.app.NotificationCompat;
import com.withpersona.sdk2.inquiry.selfie.view.Pi2ProgressArcView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p584yp.C13406u;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 /2\u00020\u0001:\u0001 B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000e2\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u000b¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000e2\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u001d\u0010\u0016J\u000f\u0010\u001e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001e\u0010\u0018R\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010%\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010'\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010$R\u0016\u0010\u0012\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010$R\u0018\u0010*\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010)R\u0018\u0010+\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010)R\u0018\u0010-\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010)R\u0016\u0010.\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010$¨\u00060"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/view/Pi2ProgressArcView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "newColor", "", "setStrokeColor", "(I)V", "", "newWidth", "setStrokeWidth", "(F)V", NotificationCompat.CATEGORY_PROGRESS, "Lkotlin/Function0;", "onAnimationEnd", "f", "(FLkotlin/jvm/functions/Function0;)V", "e", "()V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "h", "d", "Landroid/graphics/Paint;", "a", "Landroid/graphics/Paint;", "paint", "b", "F", "size", "c", "startAngle", "Landroid/animation/ValueAnimator;", "Landroid/animation/ValueAnimator;", "animator", "indeterminateAnimator", "g", "rotateToZeroAnimator", "_rotation", "i", "selfie_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class Pi2ProgressArcView extends View {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Paint paint;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final float size;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final float startAngle;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public float progress;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public ValueAnimator animator;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public ValueAnimator indeterminateAnimator;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public ValueAnimator rotateToZeroAnimator;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public float _rotation;

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.view.Pi2ProgressArcView$b */
    @Metadata(m31664d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\u000e\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u000f"}, m31665d2 = {"com/withpersona/sdk2/inquiry/selfie/view/Pi2ProgressArcView$b", "Landroid/animation/ValueAnimator$AnimatorUpdateListener;", "Landroid/animation/ValueAnimator;", "animator", "", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "", "a", "F", "getLastProgress", "()F", "setLastProgress", "(F)V", "lastProgress", "selfie_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class C3990b implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public float lastProgress;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ValueAnimator f16806b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Pi2ProgressArcView f16807c;

        public C3990b(ValueAnimator valueAnimator, Pi2ProgressArcView pi2ProgressArcView) {
            this.f16806b = valueAnimator;
            this.f16807c = pi2ProgressArcView;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
            Object animatedValue = this.f16806b.getAnimatedValue();
            Intrinsics.m31981d(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float fFloatValue = ((Float) animatedValue).floatValue();
            float fAbs = Math.abs(fFloatValue - this.lastProgress);
            float f10 = this.f16807c._rotation;
            Pi2ProgressArcView pi2ProgressArcView = this.f16807c;
            pi2ProgressArcView._rotation = (pi2ProgressArcView._rotation + fAbs) % 360;
            if (f10 > this.f16807c._rotation) {
                this.f16807c._rotation = 0.0f;
                animator.cancel();
            }
            this.lastProgress = fFloatValue;
            this.f16807c.invalidate();
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.view.Pi2ProgressArcView$c */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class RunnableC3991c implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Function0 f16808a;

        public RunnableC3991c(Function0 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f16808a = function;
        }

        @Override // java.lang.Runnable
        public final /* synthetic */ void run() {
            this.f16808a.invoke();
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.view.Pi2ProgressArcView$d */
    @Metadata(m31664d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\u000e\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u000f"}, m31665d2 = {"com/withpersona/sdk2/inquiry/selfie/view/Pi2ProgressArcView$d", "Landroid/animation/ValueAnimator$AnimatorUpdateListener;", "Landroid/animation/ValueAnimator;", "animator", "", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "", "a", "F", "getLastProgress", "()F", "setLastProgress", "(F)V", "lastProgress", "selfie_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class C3992d implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public float lastProgress;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ValueAnimator f16810b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Pi2ProgressArcView f16811c;

        public C3992d(ValueAnimator valueAnimator, Pi2ProgressArcView pi2ProgressArcView) {
            this.f16810b = valueAnimator;
            this.f16811c = pi2ProgressArcView;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
            Object animatedValue = this.f16810b.getAnimatedValue();
            Intrinsics.m31981d(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float fFloatValue = ((Float) animatedValue).floatValue();
            float fAbs = Math.abs(fFloatValue - this.lastProgress);
            Pi2ProgressArcView pi2ProgressArcView = this.f16811c;
            pi2ProgressArcView._rotation = (pi2ProgressArcView._rotation + fAbs) % 360;
            this.lastProgress = fFloatValue;
            this.f16811c.invalidate();
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.view.Pi2ProgressArcView$e */
    @Metadata(m31664d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0006¨\u0006\u000b¸\u0006\n"}, m31665d2 = {"androidx/core/animation/AnimatorKt$addListener$listener$1", "Landroid/animation/Animator$AnimatorListener;", "Landroid/animation/Animator;", "animator", "", "onAnimationRepeat", "(Landroid/animation/Animator;)V", "onAnimationEnd", "onAnimationCancel", "onAnimationStart", "androidx/core/animation/AnimatorKt$doOnEnd$$inlined$addListener$1", "core-ktx_release"}, m31666k = 1, m31667mv = {2, 2, 0})
    public static final class C3993e implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Function0 f16812a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Pi2ProgressArcView f16813b;

        public C3993e(Function0 function0, Pi2ProgressArcView pi2ProgressArcView) {
            this.f16812a = function0;
            this.f16813b = pi2ProgressArcView;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@NotNull Animator animator) {
            Intrinsics.m31982e(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NotNull Animator animator) {
            Intrinsics.m31982e(animator, "animator");
            Function0 function0 = this.f16812a;
            if (function0 != null) {
                this.f16813b.postDelayed(new RunnableC3991c(function0), 100L);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(@NotNull Animator animator) {
            Intrinsics.m31982e(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@NotNull Animator animator) {
            Intrinsics.m31982e(animator, "animator");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Pi2ProgressArcView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.withpersona.sdk2.inquiry.selfie.view.Pi2ProgressArcView */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m20318g(Pi2ProgressArcView pi2ProgressArcView, float f10, Function0 function0, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            function0 = null;
        }
        pi2ProgressArcView.m20322f(f10, function0);
    }

    /* JADX INFO: renamed from: i */
    public static final void m20319i(Pi2ProgressArcView pi2ProgressArcView, ValueAnimator valueAnimator, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.m31981d(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        pi2ProgressArcView.progress = ((Float) animatedValue).floatValue();
        pi2ProgressArcView.invalidate();
    }

    /* JADX INFO: renamed from: d */
    public final void m20320d() {
        if (this._rotation == 0.0f) {
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 100.0f);
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.addUpdateListener(new C3990b(valueAnimatorOfFloat, this));
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setRepeatMode(2);
        valueAnimatorOfFloat.start();
        this.rotateToZeroAnimator = valueAnimatorOfFloat;
    }

    /* JADX INFO: renamed from: e */
    public final void m20321e() {
        ValueAnimator valueAnimator = this.rotateToZeroAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.indeterminateAnimator;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        m20323h(25.0f, null);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 100.0f);
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.addUpdateListener(new C3992d(valueAnimatorOfFloat, this));
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setRepeatMode(2);
        valueAnimatorOfFloat.start();
        this.indeterminateAnimator = valueAnimatorOfFloat;
    }

    /* JADX INFO: renamed from: f */
    public final void m20322f(float progress, @Nullable Function0<Unit> onAnimationEnd) {
        ValueAnimator valueAnimator = this.indeterminateAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        m20320d();
        m20323h(progress, onAnimationEnd);
    }

    /* JADX INFO: renamed from: h */
    public final void m20323h(float progress, Function0<Unit> onAnimationEnd) {
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
                Pi2ProgressArcView.m20319i(this.f27216a, valueAnimatorOfFloat, valueAnimator2);
            }
        });
        Intrinsics.checkNotNull(valueAnimatorOfFloat);
        valueAnimatorOfFloat.addListener(new C3993e(onAnimationEnd, this));
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

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
      (r1v0 android.content.Context)
      (wrap android.util.AttributeSet:?: TERNARY null = ((wrap int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
      (wrap int:?: TERNARY null = ((wrap int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
     A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:2) call: com.withpersona.sdk2.inquiry.selfie.view.Pi2ProgressArcView.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* synthetic */ Pi2ProgressArcView(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Pi2ProgressArcView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        Paint paint = new Paint(1);
        this.paint = paint;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C13406u.f47000d, i10, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        try {
            this.size = typedArrayObtainStyledAttributes.getFloat(C13406u.f47001e, 0.4f);
            this.startAngle = typedArrayObtainStyledAttributes.getFloat(C13406u.f47003g, 270.0f);
            this.progress = typedArrayObtainStyledAttributes.getFloat(C13406u.f47002f, 0.0f);
            paint.setColor(typedArrayObtainStyledAttributes.getColor(C13406u.f47004h, -1));
            paint.setStrokeWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(C13406u.f47005i, 4));
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
