package p075dd;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import androidx.annotation.NonNull;
import p144g4.C6003b;
import p216jc.C7139c;
import p352p5.AbstractC10160b;

/* JADX INFO: renamed from: dd.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C4544d extends AbstractC4549i<ObjectAnimator> {

    /* JADX INFO: renamed from: k */
    public static final int[] f18597k = {0, 1350, 2700, 4050};

    /* JADX INFO: renamed from: l */
    public static final int[] f18598l = {667, 2017, 3367, 4717};

    /* JADX INFO: renamed from: m */
    public static final int[] f18599m = {1000, 2350, 3700, 5050};

    /* JADX INFO: renamed from: n */
    public static final Property<C4544d, Float> f18600n = new c(Float.class, "animationFraction");

    /* JADX INFO: renamed from: o */
    public static final Property<C4544d, Float> f18601o = new d(Float.class, "completeEndFraction");

    /* JADX INFO: renamed from: c */
    public ObjectAnimator f18602c;

    /* JADX INFO: renamed from: d */
    public ObjectAnimator f18603d;

    /* JADX INFO: renamed from: e */
    public final C6003b f18604e;

    /* JADX INFO: renamed from: f */
    public final AbstractC4542b f18605f;

    /* JADX INFO: renamed from: g */
    public int f18606g;

    /* JADX INFO: renamed from: h */
    public float f18607h;

    /* JADX INFO: renamed from: i */
    public float f18608i;

    /* JADX INFO: renamed from: j */
    public AbstractC10160b f18609j;

    /* JADX INFO: renamed from: dd.d$a */
    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            C4544d c4544d = C4544d.this;
            c4544d.f18606g = (c4544d.f18606g + 4) % C4544d.this.f18605f.f18587c.length;
        }
    }

    /* JADX INFO: renamed from: dd.d$b */
    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            C4544d.this.mo22538a();
            C4544d c4544d = C4544d.this;
            AbstractC10160b abstractC10160b = c4544d.f18609j;
            if (abstractC10160b != null) {
                abstractC10160b.mo12376b(c4544d.f18643a);
            }
        }
    }

    /* JADX INFO: renamed from: dd.d$c */
    public class c extends Property<C4544d, Float> {
        public c(Class cls, String str) {
            super(cls, str);
        }

        /* JADX DEBUG: Method merged with bridge method: get(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(C4544d c4544d) {
            return Float.valueOf(c4544d.m22544o());
        }

        /* JADX DEBUG: Method merged with bridge method: set(Ljava/lang/Object;Ljava/lang/Object;)V */
        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(C4544d c4544d, Float f10) {
            c4544d.m22549t(f10.floatValue());
        }
    }

    /* JADX INFO: renamed from: dd.d$d */
    public class d extends Property<C4544d, Float> {
        public d(Class cls, String str) {
            super(cls, str);
        }

        /* JADX DEBUG: Method merged with bridge method: get(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(C4544d c4544d) {
            return Float.valueOf(c4544d.m22545p());
        }

        /* JADX DEBUG: Method merged with bridge method: set(Ljava/lang/Object;Ljava/lang/Object;)V */
        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(C4544d c4544d, Float f10) {
            c4544d.m22550u(f10.floatValue());
        }
    }

    public C4544d(@NonNull C4545e c4545e) {
        super(1);
        this.f18606g = 0;
        this.f18609j = null;
        this.f18605f = c4545e;
        this.f18604e = new C6003b();
    }

    @Override // p075dd.AbstractC4549i
    /* JADX INFO: renamed from: a */
    public void mo22538a() {
        ObjectAnimator objectAnimator = this.f18602c;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // p075dd.AbstractC4549i
    /* JADX INFO: renamed from: c */
    public void mo22539c() {
        m22548s();
    }

    @Override // p075dd.AbstractC4549i
    /* JADX INFO: renamed from: d */
    public void mo22540d(@NonNull AbstractC10160b abstractC10160b) {
        this.f18609j = abstractC10160b;
    }

    @Override // p075dd.AbstractC4549i
    /* JADX INFO: renamed from: f */
    public void mo22541f() {
        ObjectAnimator objectAnimator = this.f18603d;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        if (this.f18643a.isVisible()) {
            this.f18603d.start();
        } else {
            mo22538a();
        }
    }

    @Override // p075dd.AbstractC4549i
    /* JADX INFO: renamed from: g */
    public void mo22542g() {
        m22546q();
        m22548s();
        this.f18602c.start();
    }

    @Override // p075dd.AbstractC4549i
    /* JADX INFO: renamed from: h */
    public void mo22543h() {
        this.f18609j = null;
    }

    /* JADX INFO: renamed from: o */
    public final float m22544o() {
        return this.f18607h;
    }

    /* JADX INFO: renamed from: p */
    public final float m22545p() {
        return this.f18608i;
    }

    /* JADX INFO: renamed from: q */
    public final void m22546q() {
        if (this.f18602c == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, f18600n, 0.0f, 1.0f);
            this.f18602c = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(5400L);
            this.f18602c.setInterpolator(null);
            this.f18602c.setRepeatCount(-1);
            this.f18602c.addListener(new a());
        }
        if (this.f18603d == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, f18601o, 0.0f, 1.0f);
            this.f18603d = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(333L);
            this.f18603d.setInterpolator(this.f18604e);
            this.f18603d.addListener(new b());
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m22547r(int i10) {
        for (int i11 = 0; i11 < 4; i11++) {
            float fM22590b = m22590b(i10, f18599m[i11], 333);
            if (fM22590b >= 0.0f && fM22590b <= 1.0f) {
                int i12 = i11 + this.f18606g;
                int[] iArr = this.f18605f.f18587c;
                int length = i12 % iArr.length;
                int length2 = (length + 1) % iArr.length;
                int i13 = iArr[length];
                int i14 = iArr[length2];
                this.f18644b.get(0).f18641c = C7139c.m29923b().evaluate(this.f18604e.getInterpolation(fM22590b), Integer.valueOf(i13), Integer.valueOf(i14)).intValue();
                return;
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public void m22548s() {
        this.f18606g = 0;
        this.f18644b.get(0).f18641c = this.f18605f.f18587c[0];
        this.f18608i = 0.0f;
    }

    /* JADX INFO: renamed from: t */
    public void m22549t(float f10) {
        this.f18607h = f10;
        int i10 = (int) (f10 * 5400.0f);
        m22551v(i10);
        m22547r(i10);
        this.f18643a.invalidateSelf();
    }

    /* JADX INFO: renamed from: u */
    public final void m22550u(float f10) {
        this.f18608i = f10;
    }

    /* JADX INFO: renamed from: v */
    public final void m22551v(int i10) {
        AbstractC4548h.a aVar = this.f18644b.get(0);
        float f10 = this.f18607h;
        aVar.f18639a = (f10 * 1520.0f) - 20.0f;
        aVar.f18640b = f10 * 1520.0f;
        for (int i11 = 0; i11 < 4; i11++) {
            aVar.f18640b += this.f18604e.getInterpolation(m22590b(i10, f18597k[i11], 667)) * 250.0f;
            aVar.f18639a += this.f18604e.getInterpolation(m22590b(i10, f18598l[i11], 667)) * 250.0f;
        }
        float f11 = aVar.f18639a;
        float f12 = aVar.f18640b;
        aVar.f18639a = (f11 + ((f12 - f11) * this.f18608i)) / 360.0f;
        aVar.f18640b = f12 / 360.0f;
    }
}
