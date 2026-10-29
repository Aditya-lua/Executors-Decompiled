package p1;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import g0.f1;
import g0.r1;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class f0 extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i f28133a;
    public Window b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public f1.j f28134c;

    public class a implements f1.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f28135a;
        public ValueAnimator b;

        public a() {
        }

        @Override // g0.f1.j
        public void a(long j10, final f1.k kVar) {
            r1.a("ScreenFlashView", "ScreenFlash#apply");
            this.f28135a = f0.this.getBrightness();
            f0.this.setBrightness(1.0f);
            ValueAnimator valueAnimator = this.b;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            f0 f0Var = f0.this;
            Objects.requireNonNull(kVar);
            this.b = f0Var.e(new Runnable() { // from class: p1.e0
                @Override // java.lang.Runnable
                public final void run() {
                    kVar.a();
                }
            });
        }

        @Override // g0.f1.j
        public void clear() {
            r1.a("ScreenFlashView", "ScreenFlash#clear");
            ValueAnimator valueAnimator = this.b;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.b = null;
            }
            f0.this.setAlpha(0.0f);
            f0.this.setBrightness(this.f28135a);
        }
    }

    public class b implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Runnable f28137a;

        public b(Runnable runnable) {
            this.f28137a = runnable;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            r1.a("ScreenFlashView", "ScreenFlash#apply: onAnimationEnd");
            Runnable runnable = this.f28137a;
            if (runnable != null) {
                runnable.run();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    public f0(Context context) {
        this(context, null);
    }

    public static /* synthetic */ void a(f0 f0Var, ValueAnimator valueAnimator) {
        f0Var.getClass();
        r1.a("ScreenFlashView", "animateToFullOpacity: value = " + ((Float) valueAnimator.getAnimatedValue()).floatValue());
        f0Var.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getBrightness() {
        Window window = this.b;
        if (window != null) {
            return window.getAttributes().screenBrightness;
        }
        r1.c("ScreenFlashView", "setBrightness: mScreenFlashWindow is null!");
        return Float.NaN;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBrightness(float f10) {
        if (this.b == null) {
            r1.c("ScreenFlashView", "setBrightness: mScreenFlashWindow is null!");
            return;
        }
        if (Float.isNaN(f10)) {
            r1.c("ScreenFlashView", "setBrightness: value is NaN!");
            return;
        }
        WindowManager.LayoutParams attributes = this.b.getAttributes();
        attributes.screenBrightness = f10;
        this.b.setAttributes(attributes);
        r1.a("ScreenFlashView", "Brightness set to " + attributes.screenBrightness);
    }

    private void setScreenFlashUiInfo(f1.j jVar) {
        i iVar = this.f28133a;
        if (iVar == null) {
            r1.a("ScreenFlashView", "setScreenFlashUiInfo: mCameraController is null!");
        } else {
            iVar.H(new r1.a(r1.a.EnumC0526a.SCREEN_FLASH_VIEW, jVar));
        }
    }

    public final ValueAnimator e(Runnable runnable) {
        r1.a("ScreenFlashView", "animateToFullOpacity");
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(getVisibilityRampUpAnimationDurationMillis());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: p1.d0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                f0.a(this.f28131a, valueAnimator);
            }
        });
        valueAnimatorOfFloat.addListener(new b(runnable));
        valueAnimatorOfFloat.start();
        return valueAnimatorOfFloat;
    }

    public final void f(Window window) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("updateScreenFlash: is new window null = ");
        sb2.append(window == null);
        sb2.append(",  is new window same as previous = ");
        sb2.append(window == this.b);
        r1.a("ScreenFlashView", sb2.toString());
        if (this.b != window) {
            this.f28134c = window == null ? null : new a();
        }
    }

    public f1.j getScreenFlash() {
        return this.f28134c;
    }

    public long getVisibilityRampUpAnimationDurationMillis() {
        return 1000L;
    }

    public void setController(i iVar) {
        p0.z.b();
        i iVar2 = this.f28133a;
        if (iVar2 != null && iVar2 != iVar) {
            setScreenFlashUiInfo(null);
        }
        this.f28133a = iVar;
        if (iVar == null) {
            return;
        }
        if (iVar.m() == 3 && this.b == null) {
            throw new IllegalStateException("No window set despite setting FLASH_MODE_SCREEN in CameraController");
        }
        setScreenFlashUiInfo(getScreenFlash());
    }

    public void setScreenFlashWindow(Window window) {
        p0.z.b();
        f(window);
        this.b = window;
        setScreenFlashUiInfo(getScreenFlash());
    }

    public f0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public f0(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public f0(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        setBackgroundColor(-1);
        setAlpha(0.0f);
        setElevation(Float.MAX_VALUE);
    }
}
