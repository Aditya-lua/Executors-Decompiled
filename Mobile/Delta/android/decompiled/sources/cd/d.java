package cd;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class d extends i<ObjectAnimator> {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int[] f4702k = {0, 1350, 2700, 4050};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int[] f4703l = {667, 2017, 3367, 4717};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int[] f4704m = {1000, 2350, 3700, 5050};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Property<d, Float> f4705n = new c(Float.class, "animationFraction");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Property<d, Float> f4706o = new C0103d(Float.class, "completeEndFraction");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ObjectAnimator f4707c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ObjectAnimator f4708d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g4.b f4709e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final cd.b f4710f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f4711g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f4712h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f4713i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public p5.b f4714j;

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            d dVar = d.this;
            dVar.f4711g = (dVar.f4711g + 4) % d.this.f4710f.f4693c.length;
        }
    }

    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            d.this.a();
            d dVar = d.this;
            p5.b bVar = dVar.f4714j;
            if (bVar != null) {
                bVar.b(dVar.f4746a);
            }
        }
    }

    public class c extends Property<d, Float> {
        public c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(d dVar) {
            return Float.valueOf(dVar.o());
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(d dVar, Float f10) {
            dVar.t(f10.floatValue());
        }
    }

    /* JADX INFO: renamed from: cd.d$d, reason: collision with other inner class name */
    public class C0103d extends Property<d, Float> {
        public C0103d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(d dVar) {
            return Float.valueOf(dVar.p());
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(d dVar, Float f10) {
            dVar.u(f10.floatValue());
        }
    }

    public d(@NonNull e eVar) {
        super(1);
        this.f4711g = 0;
        this.f4714j = null;
        this.f4710f = eVar;
        this.f4709e = new g4.b();
    }

    @Override // cd.i
    public void a() {
        ObjectAnimator objectAnimator = this.f4707c;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // cd.i
    public void c() {
        s();
    }

    @Override // cd.i
    public void d(@NonNull p5.b bVar) {
        this.f4714j = bVar;
    }

    @Override // cd.i
    public void f() {
        ObjectAnimator objectAnimator = this.f4708d;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        if (this.f4746a.isVisible()) {
            this.f4708d.start();
        } else {
            a();
        }
    }

    @Override // cd.i
    public void g() {
        q();
        s();
        this.f4707c.start();
    }

    @Override // cd.i
    public void h() {
        this.f4714j = null;
    }

    public final float o() {
        return this.f4712h;
    }

    public final float p() {
        return this.f4713i;
    }

    public final void q() {
        if (this.f4707c == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, f4705n, 0.0f, 1.0f);
            this.f4707c = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(5400L);
            this.f4707c.setInterpolator(null);
            this.f4707c.setRepeatCount(-1);
            this.f4707c.addListener(new a());
        }
        if (this.f4708d == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, f4706o, 0.0f, 1.0f);
            this.f4708d = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(333L);
            this.f4708d.setInterpolator(this.f4709e);
            this.f4708d.addListener(new b());
        }
    }

    public final void r(int i10) {
        for (int i11 = 0; i11 < 4; i11++) {
            float fB = b(i10, f4704m[i11], 333);
            if (fB >= 0.0f && fB <= 1.0f) {
                int i12 = i11 + this.f4711g;
                int[] iArr = this.f4710f.f4693c;
                int length = i12 % iArr.length;
                int length2 = (length + 1) % iArr.length;
                int i13 = iArr[length];
                int i14 = iArr[length2];
                this.b.get(0).f4744c = ic.c.b().evaluate(this.f4709e.getInterpolation(fB), Integer.valueOf(i13), Integer.valueOf(i14)).intValue();
                return;
            }
        }
    }

    public void s() {
        this.f4711g = 0;
        this.b.get(0).f4744c = this.f4710f.f4693c[0];
        this.f4713i = 0.0f;
    }

    public void t(float f10) {
        this.f4712h = f10;
        int i10 = (int) (f10 * 5400.0f);
        v(i10);
        r(i10);
        this.f4746a.invalidateSelf();
    }

    public final void u(float f10) {
        this.f4713i = f10;
    }

    public final void v(int i10) {
        h.a aVar = this.b.get(0);
        float f10 = this.f4712h;
        aVar.f4743a = (f10 * 1520.0f) - 20.0f;
        aVar.b = f10 * 1520.0f;
        for (int i11 = 0; i11 < 4; i11++) {
            aVar.b += this.f4709e.getInterpolation(b(i10, f4702k[i11], 667)) * 250.0f;
            aVar.f4743a += this.f4709e.getInterpolation(b(i10, f4703l[i11], 667)) * 250.0f;
        }
        float f11 = aVar.f4743a;
        float f12 = aVar.b;
        aVar.f4743a = (f11 + ((f12 - f11) * this.f4713i)) / 360.0f;
        aVar.b = f12 / 360.0f;
    }
}
