package ed;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class d extends i<ObjectAnimator> {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int[] f13331k = {0, 1350, 2700, 4050};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int[] f13332l = {667, 2017, 3367, 4717};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int[] f13333m = {1000, 2350, 3700, 5050};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Property<d, Float> f13334n = new c(Float.class, "animationFraction");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Property<d, Float> f13335o = new C0257d(Float.class, "completeEndFraction");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ObjectAnimator f13336c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ObjectAnimator f13337d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h4.b f13338e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ed.b f13339f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f13340g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f13341h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f13342i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public q5.b f13343j;

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            d dVar = d.this;
            dVar.f13340g = (dVar.f13340g + 4) % d.this.f13339f.f13322c.length;
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
            q5.b bVar = dVar.f13343j;
            if (bVar != null) {
                bVar.b(dVar.f13375a);
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

    /* JADX INFO: renamed from: ed.d$d, reason: collision with other inner class name */
    public class C0257d extends Property<d, Float> {
        public C0257d(Class cls, String str) {
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
        this.f13340g = 0;
        this.f13343j = null;
        this.f13339f = eVar;
        this.f13338e = new h4.b();
    }

    @Override // ed.i
    public void a() {
        ObjectAnimator objectAnimator = this.f13336c;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // ed.i
    public void c() {
        s();
    }

    @Override // ed.i
    public void d(@NonNull q5.b bVar) {
        this.f13343j = bVar;
    }

    @Override // ed.i
    public void f() {
        ObjectAnimator objectAnimator = this.f13337d;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        if (this.f13375a.isVisible()) {
            this.f13337d.start();
        } else {
            a();
        }
    }

    @Override // ed.i
    public void g() {
        q();
        s();
        this.f13336c.start();
    }

    @Override // ed.i
    public void h() {
        this.f13343j = null;
    }

    public final float o() {
        return this.f13341h;
    }

    public final float p() {
        return this.f13342i;
    }

    public final void q() {
        if (this.f13336c == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, f13334n, 0.0f, 1.0f);
            this.f13336c = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(5400L);
            this.f13336c.setInterpolator(null);
            this.f13336c.setRepeatCount(-1);
            this.f13336c.addListener(new a());
        }
        if (this.f13337d == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, f13335o, 0.0f, 1.0f);
            this.f13337d = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(333L);
            this.f13337d.setInterpolator(this.f13338e);
            this.f13337d.addListener(new b());
        }
    }

    public final void r(int i10) {
        for (int i11 = 0; i11 < 4; i11++) {
            float fB = b(i10, f13333m[i11], 333);
            if (fB >= 0.0f && fB <= 1.0f) {
                int i12 = i11 + this.f13340g;
                int[] iArr = this.f13339f.f13322c;
                int length = i12 % iArr.length;
                int length2 = (length + 1) % iArr.length;
                int i13 = iArr[length];
                int i14 = iArr[length2];
                this.b.get(0).f13373c = kc.c.b().evaluate(this.f13338e.getInterpolation(fB), Integer.valueOf(i13), Integer.valueOf(i14)).intValue();
                return;
            }
        }
    }

    public void s() {
        this.f13340g = 0;
        this.b.get(0).f13373c = this.f13339f.f13322c[0];
        this.f13342i = 0.0f;
    }

    public void t(float f10) {
        this.f13341h = f10;
        int i10 = (int) (f10 * 5400.0f);
        v(i10);
        r(i10);
        this.f13375a.invalidateSelf();
    }

    public final void u(float f10) {
        this.f13342i = f10;
    }

    public final void v(int i10) {
        h.a aVar = this.b.get(0);
        float f10 = this.f13341h;
        aVar.f13372a = (f10 * 1520.0f) - 20.0f;
        aVar.b = f10 * 1520.0f;
        for (int i11 = 0; i11 < 4; i11++) {
            aVar.b += this.f13338e.getInterpolation(b(i10, f13331k[i11], 667)) * 250.0f;
            aVar.f13372a += this.f13338e.getInterpolation(b(i10, f13332l[i11], 667)) * 250.0f;
        }
        float f11 = aVar.f13372a;
        float f12 = aVar.b;
        aVar.f13372a = (f11 + ((f12 - f11) * this.f13342i)) / 360.0f;
        aVar.b = f12 / 360.0f;
    }
}
