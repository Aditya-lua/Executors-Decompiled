package p348p1;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import java.util.Objects;
import p140g0.C5883f1;
import p140g0.C5931r1;
import p347p0.C10110z;
import p398r1.C10776a;

/* JADX INFO: renamed from: p1.f0 */
/* JADX INFO: loaded from: classes.dex */
public final class C10122f0 extends View {

    /* JADX INFO: renamed from: a */
    public AbstractC10127i f36416a;

    /* JADX INFO: renamed from: b */
    public Window f36417b;

    /* JADX INFO: renamed from: c */
    public C5883f1.j f36418c;

    /* JADX INFO: renamed from: p1.f0$a */
    public class a implements C5883f1.j {

        /* JADX INFO: renamed from: a */
        public float f36419a;

        /* JADX INFO: renamed from: b */
        public ValueAnimator f36420b;

        public a() {
        }

        @Override // p140g0.C5883f1.j
        /* JADX INFO: renamed from: a */
        public void mo26438a(long j10, final C5883f1.k kVar) {
            C5931r1.m26561a("ScreenFlashView", "ScreenFlash#apply");
            this.f36419a = C10122f0.this.getBrightness();
            C10122f0.this.setBrightness(1.0f);
            ValueAnimator valueAnimator = this.f36420b;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            C10122f0 c10122f0 = C10122f0.this;
            Objects.requireNonNull(kVar);
            this.f36420b = c10122f0.m39024e(new Runnable() { // from class: p1.e0
                @Override // java.lang.Runnable
                public final void run() {
                    kVar.mo26439a();
                }
            });
        }

        @Override // p140g0.C5883f1.j
        public void clear() {
            C5931r1.m26561a("ScreenFlashView", "ScreenFlash#clear");
            ValueAnimator valueAnimator = this.f36420b;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f36420b = null;
            }
            C10122f0.this.setAlpha(0.0f);
            C10122f0.this.setBrightness(this.f36419a);
        }
    }

    /* JADX INFO: renamed from: p1.f0$b */
    public class b implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Runnable f36422a;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public b(Runnable runnable) {
            this.f36422a = runnable;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C5931r1.m26561a("ScreenFlashView", "ScreenFlash#apply: onAnimationEnd");
            Runnable runnable = this.f36422a;
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C10122f0(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m39020a(C10122f0 c10122f0, ValueAnimator valueAnimator) {
        c10122f0.getClass();
        C5931r1.m26561a("ScreenFlashView", "animateToFullOpacity: value = " + ((Float) valueAnimator.getAnimatedValue()).floatValue());
        c10122f0.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getBrightness() {
        Window window = this.f36417b;
        if (window != null) {
            return window.getAttributes().screenBrightness;
        }
        C5931r1.m26563c("ScreenFlashView", "setBrightness: mScreenFlashWindow is null!");
        return Float.NaN;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBrightness(float f10) {
        if (this.f36417b == null) {
            C5931r1.m26563c("ScreenFlashView", "setBrightness: mScreenFlashWindow is null!");
            return;
        }
        if (Float.isNaN(f10)) {
            C5931r1.m26563c("ScreenFlashView", "setBrightness: value is NaN!");
            return;
        }
        WindowManager.LayoutParams attributes = this.f36417b.getAttributes();
        attributes.screenBrightness = f10;
        this.f36417b.setAttributes(attributes);
        C5931r1.m26561a("ScreenFlashView", "Brightness set to " + attributes.screenBrightness);
    }

    private void setScreenFlashUiInfo(C5883f1.j jVar) {
        AbstractC10127i abstractC10127i = this.f36416a;
        if (abstractC10127i == null) {
            C5931r1.m26561a("ScreenFlashView", "setScreenFlashUiInfo: mCameraController is null!");
        } else {
            abstractC10127i.m39035H(new C10776a(C10776a.a.SCREEN_FLASH_VIEW, jVar));
        }
    }

    /* JADX INFO: renamed from: e */
    public final ValueAnimator m39024e(Runnable runnable) {
        C5931r1.m26561a("ScreenFlashView", "animateToFullOpacity");
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(getVisibilityRampUpAnimationDurationMillis());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: p1.d0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C10122f0.m39020a(this.f36414a, valueAnimator);
            }
        });
        valueAnimatorOfFloat.addListener(new b(runnable));
        valueAnimatorOfFloat.start();
        return valueAnimatorOfFloat;
    }

    /* JADX INFO: renamed from: f */
    public final void m39025f(Window window) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("updateScreenFlash: is new window null = ");
        sb2.append(window == null);
        sb2.append(",  is new window same as previous = ");
        sb2.append(window == this.f36417b);
        C5931r1.m26561a("ScreenFlashView", sb2.toString());
        if (this.f36417b != window) {
            this.f36418c = window == null ? null : new a();
        }
    }

    public C5883f1.j getScreenFlash() {
        return this.f36418c;
    }

    public long getVisibilityRampUpAnimationDurationMillis() {
        return 1000L;
    }

    public void setController(AbstractC10127i abstractC10127i) {
        C10110z.m39008b();
        AbstractC10127i abstractC10127i2 = this.f36416a;
        if (abstractC10127i2 != null && abstractC10127i2 != abstractC10127i) {
            setScreenFlashUiInfo(null);
        }
        this.f36416a = abstractC10127i;
        if (abstractC10127i == null) {
            return;
        }
        if (abstractC10127i.m39061m() == 3 && this.f36417b == null) {
            throw new IllegalStateException("No window set despite setting FLASH_MODE_SCREEN in CameraController");
        }
        setScreenFlashUiInfo(getScreenFlash());
    }

    public void setScreenFlashWindow(Window window) {
        C10110z.m39008b();
        m39025f(window);
        this.f36417b = window;
        setScreenFlashUiInfo(getScreenFlash());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C10122f0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C10122f0(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public C10122f0(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        setBackgroundColor(-1);
        setAlpha(0.0f);
        setElevation(Float.MAX_VALUE);
    }
}
