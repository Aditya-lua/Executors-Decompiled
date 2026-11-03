package dd;

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

/* JADX INFO: loaded from: classes2.dex */
public abstract class g extends Drawable implements Animatable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Property<g, Float> f14564o = new c(Float.class, "growFraction");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f14565a;
    public final dd.b b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ValueAnimator f14567d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ValueAnimator f14568e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f14569f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f14570g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f14571h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public List<p5.b> f14572i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public p5.b f14573j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f14574k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f14575l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f14577n;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Paint f14576m = new Paint();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public dd.a f14566c = new dd.a();

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            g.this.f();
        }
    }

    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            g.super.setVisible(false, false);
            g.this.e();
        }
    }

    public class c extends Property<g, Float> {
        public c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(g gVar) {
            return Float.valueOf(gVar.h());
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(g gVar, Float f10) {
            gVar.n(f10.floatValue());
        }
    }

    public g(@NonNull Context context, @NonNull dd.b bVar) {
        this.f14565a = context;
        this.b = bVar;
        setAlpha(255);
    }

    public final void d(@NonNull ValueAnimator... valueAnimatorArr) {
        boolean z10 = this.f14574k;
        this.f14574k = true;
        for (ValueAnimator valueAnimator : valueAnimatorArr) {
            valueAnimator.cancel();
        }
        this.f14574k = z10;
    }

    public final void e() {
        p5.b bVar = this.f14573j;
        if (bVar != null) {
            bVar.b(this);
        }
        List<p5.b> list = this.f14572i;
        if (list == null || this.f14574k) {
            return;
        }
        Iterator<p5.b> it = list.iterator();
        while (it.hasNext()) {
            it.next().b(this);
        }
    }

    public final void f() {
        p5.b bVar = this.f14573j;
        if (bVar != null) {
            bVar.c(this);
        }
        List<p5.b> list = this.f14572i;
        if (list == null || this.f14574k) {
            return;
        }
        Iterator<p5.b> it = list.iterator();
        while (it.hasNext()) {
            it.next().c(this);
        }
    }

    public final void g(@NonNull ValueAnimator... valueAnimatorArr) {
        boolean z10 = this.f14574k;
        this.f14574k = true;
        for (ValueAnimator valueAnimator : valueAnimatorArr) {
            valueAnimator.end();
        }
        this.f14574k = z10;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f14577n;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public float h() {
        if (this.b.b() || this.b.a()) {
            return (this.f14570g || this.f14569f) ? this.f14571h : this.f14575l;
        }
        return 1.0f;
    }

    public boolean i() {
        return q(false, false, false);
    }

    public boolean isRunning() {
        return k() || j();
    }

    public boolean j() {
        ValueAnimator valueAnimator = this.f14568e;
        return (valueAnimator != null && valueAnimator.isRunning()) || this.f14570g;
    }

    public boolean k() {
        ValueAnimator valueAnimator = this.f14567d;
        return (valueAnimator != null && valueAnimator.isRunning()) || this.f14569f;
    }

    public final void l() {
        if (this.f14567d == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, f14564o, 0.0f, 1.0f);
            this.f14567d = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(500L);
            this.f14567d.setInterpolator(jc.a.b);
            p(this.f14567d);
        }
        if (this.f14568e == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, f14564o, 1.0f, 0.0f);
            this.f14568e = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(500L);
            this.f14568e.setInterpolator(jc.a.b);
            o(this.f14568e);
        }
    }

    public void m(@NonNull p5.b bVar) {
        if (this.f14572i == null) {
            this.f14572i = new ArrayList();
        }
        if (this.f14572i.contains(bVar)) {
            return;
        }
        this.f14572i.add(bVar);
    }

    public void n(float f10) {
        if (this.f14575l != f10) {
            this.f14575l = f10;
            invalidateSelf();
        }
    }

    public final void o(@NonNull ValueAnimator valueAnimator) {
        ValueAnimator valueAnimator2 = this.f14568e;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            throw new IllegalArgumentException("Cannot set hideAnimator while the current hideAnimator is running.");
        }
        this.f14568e = valueAnimator;
        valueAnimator.addListener(new b());
    }

    public final void p(@NonNull ValueAnimator valueAnimator) {
        ValueAnimator valueAnimator2 = this.f14567d;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            throw new IllegalArgumentException("Cannot set showAnimator while the current showAnimator is running.");
        }
        this.f14567d = valueAnimator;
        valueAnimator.addListener(new a());
    }

    public boolean q(boolean z10, boolean z11, boolean z12) {
        return r(z10, z11, z12 && this.f14566c.a(this.f14565a.getContentResolver()) > 0.0f);
    }

    public boolean r(boolean z10, boolean z11, boolean z12) {
        l();
        if (!isVisible() && !z10) {
            return false;
        }
        ValueAnimator valueAnimator = z10 ? this.f14567d : this.f14568e;
        ValueAnimator valueAnimator2 = z10 ? this.f14568e : this.f14567d;
        if (!z12) {
            if (valueAnimator2.isRunning()) {
                d(valueAnimator2);
            }
            if (valueAnimator.isRunning()) {
                valueAnimator.end();
            } else {
                g(valueAnimator);
            }
            return super.setVisible(z10, false);
        }
        if (valueAnimator.isRunning()) {
            return false;
        }
        boolean z13 = !z10 || super.setVisible(z10, false);
        if (!(z10 ? this.b.b() : this.b.a())) {
            g(valueAnimator);
            return z13;
        }
        if (z11 || !valueAnimator.isPaused()) {
            valueAnimator.start();
            return z13;
        }
        valueAnimator.resume();
        return z13;
    }

    public boolean s(@NonNull p5.b bVar) {
        List<p5.b> list = this.f14572i;
        if (list == null || !list.contains(bVar)) {
            return false;
        }
        this.f14572i.remove(bVar);
        if (!this.f14572i.isEmpty()) {
            return true;
        }
        this.f14572i = null;
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f14577n = i10;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f14576m.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        return q(z10, z11, true);
    }

    public void start() {
        r(true, true, false);
    }

    public void stop() {
        r(false, true, false);
    }
}
