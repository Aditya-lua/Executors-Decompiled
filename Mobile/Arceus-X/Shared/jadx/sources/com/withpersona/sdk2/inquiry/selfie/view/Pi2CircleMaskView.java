package com.withpersona.sdk2.inquiry.selfie.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.core.view.ViewCompat;
import com.withpersona.sdk2.inquiry.selfie.view.Pi2CircleMaskView;
import cu.C4366b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p584yp.C13406u;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 .2\u00020\u0001:\u0001\"B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0015\u001a\u00020\f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0011¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0019\u0010\u0010J\u000f\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b \u0010!R\u0014\u0010$\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010%R\u0018\u0010(\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010'R\u0016\u0010+\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010*R\u0016\u0010-\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010*¨\u0006/"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/view/Pi2CircleMaskView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/graphics/Canvas;", "canvas", "", "onDraw", "(Landroid/graphics/Canvas;)V", "h", "()V", "", "animated", "Lkotlin/Function0;", "onComplete", "d", "(ZLkotlin/jvm/functions/Function0;)V", "g", "()Z", "onDetachedFromWindow", "Landroid/graphics/Bitmap;", "c", "()Landroid/graphics/Bitmap;", "", "targetScaleX", "", "b", "(F)J", "a", "F", "size", "I", "maskColor", "Landroid/graphics/Bitmap;", "mask", "Landroid/graphics/Paint;", "Landroid/graphics/Paint;", "paint", "e", "clearPaint", "f", "selfie_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class Pi2CircleMaskView extends View {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final float size;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final int maskColor;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public Bitmap mask;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public Paint paint;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public Paint clearPaint;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Pi2CircleMaskView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.withpersona.sdk2.inquiry.selfie.view.Pi2CircleMaskView */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m20308e(Pi2CircleMaskView pi2CircleMaskView, boolean z10, Function0 function0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if ((i10 & 2) != 0) {
            function0 = null;
        }
        pi2CircleMaskView.m20312d(z10, function0);
    }

    /* JADX INFO: renamed from: f */
    public static final void m20309f(Function0 function0) {
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX INFO: renamed from: b */
    public final long m20310b(float targetScaleX) {
        return C4366b.m22018f((Math.abs(getScaleX() - targetScaleX) / 4.0f) * 500);
    }

    /* JADX INFO: renamed from: c */
    public final Bitmap m20311c() {
        Bitmap bitmap = this.mask;
        if (bitmap != null) {
            if (bitmap.getWidth() != getWidth() || bitmap.getHeight() != getHeight()) {
                bitmap = null;
            }
            if (bitmap != null) {
                return bitmap;
            }
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawColor(this.maskColor);
        canvas.drawCircle(canvas.getWidth() / 2.0f, canvas.getHeight() / 2.0f, this.size * Math.min(canvas.getWidth(), canvas.getHeight()), this.clearPaint);
        this.mask = bitmapCreateBitmap;
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: d */
    public final void m20312d(boolean animated, @Nullable final Function0<Unit> onComplete) {
        if (animated) {
            ViewPropertyAnimator viewPropertyAnimatorAnimate = animate();
            viewPropertyAnimatorAnimate.setDuration(m20310b(1.0f));
            viewPropertyAnimatorAnimate.scaleX(1.0f);
            viewPropertyAnimatorAnimate.scaleY(1.0f);
            viewPropertyAnimatorAnimate.withEndAction(new Runnable() { // from class: iq.n
                @Override // java.lang.Runnable
                public final void run() {
                    Pi2CircleMaskView.m20309f(onComplete);
                }
            });
            viewPropertyAnimatorAnimate.start();
            return;
        }
        getAnimation().cancel();
        setScaleX(1.0f);
        setScaleY(1.0f);
        if (onComplete != null) {
            onComplete.invoke();
        }
    }

    /* JADX INFO: renamed from: g */
    public final boolean m20313g() {
        return (getScaleX() == 5.0f && getScaleY() == 5.0f) ? false : true;
    }

    /* JADX INFO: renamed from: h */
    public final void m20314h() {
        if (getScaleX() == 5.0f && getScaleY() == 5.0f) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimatorAnimate = animate();
        viewPropertyAnimatorAnimate.setDuration(m20310b(5.0f));
        viewPropertyAnimatorAnimate.scaleX(5.0f);
        viewPropertyAnimatorAnimate.scaleY(5.0f);
        viewPropertyAnimatorAnimate.start();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        Bitmap bitmap;
        Bitmap bitmap2 = this.mask;
        if (bitmap2 != null && !bitmap2.isRecycled() && (bitmap = this.mask) != null) {
            bitmap.recycle();
        }
        this.mask = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        canvas.drawBitmap(m20311c(), 0.0f, 0.0f, this.paint);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
      (r1v0 android.content.Context)
      (wrap android.util.AttributeSet:?: TERNARY null = ((wrap int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
      (wrap int:?: TERNARY null = ((wrap int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
     A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:2) call: com.withpersona.sdk2.inquiry.selfie.view.Pi2CircleMaskView.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* synthetic */ Pi2CircleMaskView(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Pi2CircleMaskView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        this.paint = new Paint(7);
        Paint paint = new Paint(1);
        paint.setColor(0);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.clearPaint = paint;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C13406u.f46997a, i10, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        try {
            this.size = typedArrayObtainStyledAttributes.getFloat(C13406u.f46998b, 0.4f);
            this.maskColor = typedArrayObtainStyledAttributes.getColor(C13406u.f46999c, ViewCompat.MEASURED_STATE_MASK);
            typedArrayObtainStyledAttributes.recycle();
            setWillNotDraw(false);
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }
}
