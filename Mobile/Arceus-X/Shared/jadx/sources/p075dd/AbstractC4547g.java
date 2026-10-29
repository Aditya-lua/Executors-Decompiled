package p075dd;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.util.Property;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p216jc.C7137a;
import p352p5.AbstractC10160b;

/* JADX INFO: renamed from: dd.g */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4547g extends Drawable implements Animatable {

    /* JADX INFO: renamed from: o */
    public static final Property<AbstractC4547g, Float> f18621o = new c(Float.class, "growFraction");

    /* JADX INFO: renamed from: a */
    public final Context f18622a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4542b f18623b;

    /* JADX INFO: renamed from: d */
    public ValueAnimator f18625d;

    /* JADX INFO: renamed from: e */
    public ValueAnimator f18626e;

    /* JADX INFO: renamed from: f */
    public boolean f18627f;

    /* JADX INFO: renamed from: g */
    public boolean f18628g;

    /* JADX INFO: renamed from: h */
    public float f18629h;

    /* JADX INFO: renamed from: i */
    public List<AbstractC10160b> f18630i;

    /* JADX INFO: renamed from: j */
    public AbstractC10160b f18631j;

    /* JADX INFO: renamed from: k */
    public boolean f18632k;

    /* JADX INFO: renamed from: l */
    public float f18633l;

    /* JADX INFO: renamed from: n */
    public int f18635n;

    /* JADX INFO: renamed from: m */
    public final Paint f18634m = new Paint();

    /* JADX INFO: renamed from: c */
    public C4541a f18624c = new C4541a();

    /* JADX INFO: renamed from: dd.g$a */
    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            AbstractC4547g.this.m22580f();
        }
    }

    /* JADX INFO: renamed from: dd.g$b */
    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            AbstractC4547g.super.setVisible(false, false);
            AbstractC4547g.this.m22579e();
        }
    }

    /* JADX INFO: renamed from: dd.g$c */
    public class c extends Property<AbstractC4547g, Float> {
        public c(Class cls, String str) {
            super(cls, str);
        }

        /* JADX DEBUG: Method merged with bridge method: get(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(AbstractC4547g abstractC4547g) {
            return Float.valueOf(abstractC4547g.m22582h());
        }

        /* JADX DEBUG: Method merged with bridge method: set(Ljava/lang/Object;Ljava/lang/Object;)V */
        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(AbstractC4547g abstractC4547g, Float f10) {
            abstractC4547g.m22584n(f10.floatValue());
        }
    }

    public AbstractC4547g(@NonNull Context context, @NonNull AbstractC4542b abstractC4542b) {
        this.f18622a = context;
        this.f18623b = abstractC4542b;
        setAlpha(255);
    }

    /* JADX INFO: renamed from: d */
    public final void m22578d(@NonNull ValueAnimator... valueAnimatorArr) {
        boolean z10 = this.f18632k;
        this.f18632k = true;
        for (ValueAnimator valueAnimator : valueAnimatorArr) {
            valueAnimator.cancel();
        }
        this.f18632k = z10;
    }

    /* JADX INFO: renamed from: e */
    public final void m22579e() {
        AbstractC10160b abstractC10160b = this.f18631j;
        if (abstractC10160b != null) {
            abstractC10160b.mo12376b(this);
        }
        List<AbstractC10160b> list = this.f18630i;
        if (list == null || this.f18632k) {
            return;
        }
        Iterator<AbstractC10160b> it = list.iterator();
        while (it.hasNext()) {
            it.next().mo12376b(this);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m22580f() {
        AbstractC10160b abstractC10160b = this.f18631j;
        if (abstractC10160b != null) {
            abstractC10160b.mo12377c(this);
        }
        List<AbstractC10160b> list = this.f18630i;
        if (list == null || this.f18632k) {
            return;
        }
        Iterator<AbstractC10160b> it = list.iterator();
        while (it.hasNext()) {
            it.next().mo12377c(this);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m22581g(@NonNull ValueAnimator... valueAnimatorArr) {
        boolean z10 = this.f18632k;
        this.f18632k = true;
        for (ValueAnimator valueAnimator : valueAnimatorArr) {
            valueAnimator.end();
        }
        this.f18632k = z10;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f18635n;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    /* JADX INFO: renamed from: h */
    public float m22582h() {
        if (this.f18623b.m22518b() || this.f18623b.m22517a()) {
            return (this.f18628g || this.f18627f) ? this.f18629h : this.f18633l;
        }
        return 1.0f;
    }

    /* JADX INFO: renamed from: i */
    public boolean mo22560i() {
        return mo22564q(false, false, false);
    }

    public boolean isRunning() {
        return mo22562k() || mo22561j();
    }

    /* JADX INFO: renamed from: j */
    public boolean mo22561j() {
        ValueAnimator valueAnimator = this.f18626e;
        return (valueAnimator != null && valueAnimator.isRunning()) || this.f18628g;
    }

    /* JADX INFO: renamed from: k */
    public boolean mo22562k() {
        ValueAnimator valueAnimator = this.f18625d;
        return (valueAnimator != null && valueAnimator.isRunning()) || this.f18627f;
    }

    /* JADX INFO: renamed from: l */
    public final void m22583l() {
        if (this.f18625d == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, f18621o, 0.0f, 1.0f);
            this.f18625d = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(500L);
            this.f18625d.setInterpolator(C7137a.f27785b);
            m22586p(this.f18625d);
        }
        if (this.f18626e == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, f18621o, 1.0f, 0.0f);
            this.f18626e = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(500L);
            this.f18626e.setInterpolator(C7137a.f27785b);
            m22585o(this.f18626e);
        }
    }

    /* JADX INFO: renamed from: m */
    public void mo22563m(@NonNull AbstractC10160b abstractC10160b) {
        if (this.f18630i == null) {
            this.f18630i = new ArrayList();
        }
        if (this.f18630i.contains(abstractC10160b)) {
            return;
        }
        this.f18630i.add(abstractC10160b);
    }

    /* JADX INFO: renamed from: n */
    public void m22584n(float f10) {
        if (this.f18633l != f10) {
            this.f18633l = f10;
            invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m22585o(@NonNull ValueAnimator valueAnimator) {
        ValueAnimator valueAnimator2 = this.f18626e;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            throw new IllegalArgumentException("Cannot set hideAnimator while the current hideAnimator is running.");
        }
        this.f18626e = valueAnimator;
        valueAnimator.addListener(new b());
    }

    /* JADX INFO: renamed from: p */
    public final void m22586p(@NonNull ValueAnimator valueAnimator) {
        ValueAnimator valueAnimator2 = this.f18625d;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            throw new IllegalArgumentException("Cannot set showAnimator while the current showAnimator is running.");
        }
        this.f18625d = valueAnimator;
        valueAnimator.addListener(new a());
    }

    /* JADX INFO: renamed from: q */
    public boolean mo22564q(boolean z10, boolean z11, boolean z12) {
        return mo22565r(z10, z11, z12 && this.f18624c.m22516a(this.f18622a.getContentResolver()) > 0.0f);
    }

    /* JADX INFO: renamed from: r */
    public boolean mo22565r(boolean z10, boolean z11, boolean z12) {
        m22583l();
        if (!isVisible() && !z10) {
            return false;
        }
        ValueAnimator valueAnimator = z10 ? this.f18625d : this.f18626e;
        ValueAnimator valueAnimator2 = z10 ? this.f18626e : this.f18625d;
        if (!z12) {
            if (valueAnimator2.isRunning()) {
                m22578d(valueAnimator2);
            }
            if (valueAnimator.isRunning()) {
                valueAnimator.end();
            } else {
                m22581g(valueAnimator);
            }
            return super.setVisible(z10, false);
        }
        if (valueAnimator.isRunning()) {
            return false;
        }
        boolean z13 = !z10 || super.setVisible(z10, false);
        if (!(z10 ? this.f18623b.m22518b() : this.f18623b.m22517a())) {
            m22581g(valueAnimator);
            return z13;
        }
        if (z11 || !valueAnimator.isPaused()) {
            valueAnimator.start();
            return z13;
        }
        valueAnimator.resume();
        return z13;
    }

    /* JADX INFO: renamed from: s */
    public boolean mo22566s(@NonNull AbstractC10160b abstractC10160b) {
        List<AbstractC10160b> list = this.f18630i;
        if (list == null || !list.contains(abstractC10160b)) {
            return false;
        }
        this.f18630i.remove(abstractC10160b);
        if (!this.f18630i.isEmpty()) {
            return true;
        }
        this.f18630i = null;
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f18635n = i10;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f18634m.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        return mo22564q(z10, z11, true);
    }

    public void start() {
        mo22565r(true, true, false);
    }

    public void stop() {
        mo22565r(false, true, false);
    }
}
