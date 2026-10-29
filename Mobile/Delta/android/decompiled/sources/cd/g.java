package cd;

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
    public static final Property<g, Float> f4726o = new c(Float.class, "growFraction");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f4727a;
    public final cd.b b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ValueAnimator f4729d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ValueAnimator f4730e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f4731f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f4732g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f4733h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public List<p5.b> f4734i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public p5.b f4735j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f4736k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f4737l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f4739n;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Paint f4738m = new Paint();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public cd.a f4728c = new cd.a();

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

    public g(@NonNull Context context, @NonNull cd.b bVar) {
        this.f4727a = context;
        this.b = bVar;
        setAlpha(255);
    }

    public final void d(@NonNull ValueAnimator... valueAnimatorArr) {
        boolean z10 = this.f4736k;
        this.f4736k = true;
        for (ValueAnimator valueAnimator : valueAnimatorArr) {
            valueAnimator.cancel();
        }
        this.f4736k = z10;
    }

    public final void e() {
        p5.b bVar = this.f4735j;
        if (bVar != null) {
            bVar.b(this);
        }
        List<p5.b> list = this.f4734i;
        if (list == null || this.f4736k) {
            return;
        }
        Iterator<p5.b> it = list.iterator();
        while (it.hasNext()) {
            it.next().b(this);
        }
    }

    public final void f() {
        p5.b bVar = this.f4735j;
        if (bVar != null) {
            bVar.c(this);
        }
        List<p5.b> list = this.f4734i;
        if (list == null || this.f4736k) {
            return;
        }
        Iterator<p5.b> it = list.iterator();
        while (it.hasNext()) {
            it.next().c(this);
        }
    }

    public final void g(@NonNull ValueAnimator... valueAnimatorArr) {
        boolean z10 = this.f4736k;
        this.f4736k = true;
        for (ValueAnimator valueAnimator : valueAnimatorArr) {
            valueAnimator.end();
        }
        this.f4736k = z10;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f4739n;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public float h() {
        if (this.b.b() || this.b.a()) {
            return (this.f4732g || this.f4731f) ? this.f4733h : this.f4737l;
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
        ValueAnimator valueAnimator = this.f4730e;
        return (valueAnimator != null && valueAnimator.isRunning()) || this.f4732g;
    }

    public boolean k() {
        ValueAnimator valueAnimator = this.f4729d;
        return (valueAnimator != null && valueAnimator.isRunning()) || this.f4731f;
    }

    public final void l() {
        if (this.f4729d == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, f4726o, 0.0f, 1.0f);
            this.f4729d = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(500L);
            this.f4729d.setInterpolator(ic.a.b);
            p(this.f4729d);
        }
        if (this.f4730e == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, f4726o, 1.0f, 0.0f);
            this.f4730e = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(500L);
            this.f4730e.setInterpolator(ic.a.b);
            o(this.f4730e);
        }
    }

    public void m(@NonNull p5.b bVar) {
        if (this.f4734i == null) {
            this.f4734i = new ArrayList();
        }
        if (this.f4734i.contains(bVar)) {
            return;
        }
        this.f4734i.add(bVar);
    }

    public void n(float f10) {
        if (this.f4737l != f10) {
            this.f4737l = f10;
            invalidateSelf();
        }
    }

    public final void o(@NonNull ValueAnimator valueAnimator) {
        ValueAnimator valueAnimator2 = this.f4730e;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            throw new IllegalArgumentException("Cannot set hideAnimator while the current hideAnimator is running.");
        }
        this.f4730e = valueAnimator;
        valueAnimator.addListener(new b());
    }

    public final void p(@NonNull ValueAnimator valueAnimator) {
        ValueAnimator valueAnimator2 = this.f4729d;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            throw new IllegalArgumentException("Cannot set showAnimator while the current showAnimator is running.");
        }
        this.f4729d = valueAnimator;
        valueAnimator.addListener(new a());
    }

    public boolean q(boolean z10, boolean z11, boolean z12) {
        return r(z10, z11, z12 && this.f4728c.a(this.f4727a.getContentResolver()) > 0.0f);
    }

    public boolean r(boolean z10, boolean z11, boolean z12) {
        l();
        if (!isVisible() && !z10) {
            return false;
        }
        ValueAnimator valueAnimator = z10 ? this.f4729d : this.f4730e;
        ValueAnimator valueAnimator2 = z10 ? this.f4730e : this.f4729d;
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
        List<p5.b> list = this.f4734i;
        if (list == null || !list.contains(bVar)) {
            return false;
        }
        this.f4734i.remove(bVar);
        if (!this.f4734i.isEmpty()) {
            return true;
        }
        this.f4734i = null;
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f4739n = i10;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f4738m.setColorFilter(colorFilter);
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
