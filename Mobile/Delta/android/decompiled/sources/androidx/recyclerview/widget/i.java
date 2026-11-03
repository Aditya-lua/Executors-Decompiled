package androidx.recyclerview.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class i extends RecyclerView.p implements RecyclerView.u {
    public static final int[] D = {R.attr.state_pressed};
    public static final int[] E = new int[0];
    public int A;
    public final Runnable B;
    public final RecyclerView.v C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3066a;
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final StateListDrawable f3067c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Drawable f3068d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f3069e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f3070f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final StateListDrawable f3071g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Drawable f3072h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f3073i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f3074j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f3075k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f3076l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f3077m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f3078n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f3079o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f3080p;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public RecyclerView f3083s;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final ValueAnimator f3090z;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f3081q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f3082r = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f3084t = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f3085u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f3086v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f3087w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int[] f3088x = new int[2];

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int[] f3089y = new int[2];

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            i.this.q(500);
        }
    }

    public class b extends RecyclerView.v {
        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.v
        public void b(RecyclerView recyclerView, int i10, int i11) {
            i.this.B(recyclerView.computeHorizontalScrollOffset(), recyclerView.computeVerticalScrollOffset());
        }
    }

    public class c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f3093a = false;

        public c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f3093a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f3093a) {
                this.f3093a = false;
                return;
            }
            if (((Float) i.this.f3090z.getAnimatedValue()).floatValue() == 0.0f) {
                i iVar = i.this;
                iVar.A = 0;
                iVar.y(0);
            } else {
                i iVar2 = i.this;
                iVar2.A = 2;
                iVar2.v();
            }
        }
    }

    public class d implements ValueAnimator.AnimatorUpdateListener {
        public d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            i.this.f3067c.setAlpha(iFloatValue);
            i.this.f3068d.setAlpha(iFloatValue);
            i.this.v();
        }
    }

    public i(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i10, int i11, int i12) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f3090z = valueAnimatorOfFloat;
        this.A = 0;
        this.B = new a();
        this.C = new b();
        this.f3067c = stateListDrawable;
        this.f3068d = drawable;
        this.f3071g = stateListDrawable2;
        this.f3072h = drawable2;
        this.f3069e = Math.max(i10, stateListDrawable.getIntrinsicWidth());
        this.f3070f = Math.max(i10, drawable.getIntrinsicWidth());
        this.f3073i = Math.max(i10, stateListDrawable2.getIntrinsicWidth());
        this.f3074j = Math.max(i10, drawable2.getIntrinsicWidth());
        this.f3066a = i11;
        this.b = i12;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        valueAnimatorOfFloat.addListener(new c());
        valueAnimatorOfFloat.addUpdateListener(new d());
        j(recyclerView);
    }

    public void A() {
        int i10 = this.A;
        if (i10 != 0) {
            if (i10 != 3) {
                return;
            } else {
                this.f3090z.cancel();
            }
        }
        this.A = 1;
        ValueAnimator valueAnimator = this.f3090z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        this.f3090z.setDuration(500L);
        this.f3090z.setStartDelay(0L);
        this.f3090z.start();
    }

    public void B(int i10, int i11) {
        int iComputeVerticalScrollRange = this.f3083s.computeVerticalScrollRange();
        int i12 = this.f3082r;
        this.f3084t = iComputeVerticalScrollRange - i12 > 0 && i12 >= this.f3066a;
        int iComputeHorizontalScrollRange = this.f3083s.computeHorizontalScrollRange();
        int i13 = this.f3081q;
        boolean z10 = iComputeHorizontalScrollRange - i13 > 0 && i13 >= this.f3066a;
        this.f3085u = z10;
        boolean z11 = this.f3084t;
        if (!z11 && !z10) {
            if (this.f3086v != 0) {
                y(0);
                return;
            }
            return;
        }
        if (z11) {
            float f10 = i12;
            this.f3076l = (int) ((f10 * (i11 + (f10 / 2.0f))) / iComputeVerticalScrollRange);
            this.f3075k = Math.min(i12, (i12 * i12) / iComputeVerticalScrollRange);
        }
        if (this.f3085u) {
            float f11 = i13;
            this.f3079o = (int) ((f11 * (i10 + (f11 / 2.0f))) / iComputeHorizontalScrollRange);
            this.f3078n = Math.min(i13, (i13 * i13) / iComputeHorizontalScrollRange);
        }
        int i14 = this.f3086v;
        if (i14 == 0 || i14 == 1) {
            y(1);
        }
    }

    public final void C(float f10) {
        int[] iArrP = p();
        float fMax = Math.max(iArrP[0], Math.min(iArrP[1], f10));
        if (Math.abs(this.f3076l - fMax) < 2.0f) {
            return;
        }
        int iX = x(this.f3077m, fMax, iArrP, this.f3083s.computeVerticalScrollRange(), this.f3083s.computeVerticalScrollOffset(), this.f3082r);
        if (iX != 0) {
            this.f3083s.scrollBy(0, iX);
        }
        this.f3077m = fMax;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.u
    public void a(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent) {
        if (this.f3086v == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean zU = u(motionEvent.getX(), motionEvent.getY());
            boolean zT = t(motionEvent.getX(), motionEvent.getY());
            if (zU || zT) {
                if (zT) {
                    this.f3087w = 1;
                    this.f3080p = (int) motionEvent.getX();
                } else if (zU) {
                    this.f3087w = 2;
                    this.f3077m = (int) motionEvent.getY();
                }
                y(2);
                return;
            }
            return;
        }
        if (motionEvent.getAction() == 1 && this.f3086v == 2) {
            this.f3077m = 0.0f;
            this.f3080p = 0.0f;
            y(1);
            this.f3087w = 0;
            return;
        }
        if (motionEvent.getAction() == 2 && this.f3086v == 2) {
            A();
            if (this.f3087w == 1) {
                r(motionEvent.getX());
            }
            if (this.f3087w == 2) {
                C(motionEvent.getY());
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.u
    public boolean b(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent) {
        int i10 = this.f3086v;
        if (i10 != 1) {
            return i10 == 2;
        }
        boolean zU = u(motionEvent.getX(), motionEvent.getY());
        boolean zT = t(motionEvent.getX(), motionEvent.getY());
        if (motionEvent.getAction() != 0 || (!zU && !zT)) {
            return false;
        }
        if (zT) {
            this.f3087w = 1;
            this.f3080p = (int) motionEvent.getX();
        } else if (zU) {
            this.f3087w = 2;
            this.f3077m = (int) motionEvent.getY();
        }
        y(2);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.u
    public void c(boolean z10) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void i(Canvas canvas, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
        if (this.f3081q != this.f3083s.getWidth() || this.f3082r != this.f3083s.getHeight()) {
            this.f3081q = this.f3083s.getWidth();
            this.f3082r = this.f3083s.getHeight();
            y(0);
        } else if (this.A != 0) {
            if (this.f3084t) {
                n(canvas);
            }
            if (this.f3085u) {
                m(canvas);
            }
        }
    }

    public void j(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f3083s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            l();
        }
        this.f3083s = recyclerView;
        if (recyclerView != null) {
            z();
        }
    }

    public final void k() {
        this.f3083s.removeCallbacks(this.B);
    }

    public final void l() {
        this.f3083s.i1(this);
        this.f3083s.j1(this);
        this.f3083s.k1(this.C);
        k();
    }

    public final void m(Canvas canvas) {
        int i10 = this.f3082r;
        int i11 = this.f3073i;
        int i12 = i10 - i11;
        int i13 = this.f3079o;
        int i14 = this.f3078n;
        int i15 = i13 - (i14 / 2);
        this.f3071g.setBounds(0, 0, i14, i11);
        this.f3072h.setBounds(0, 0, this.f3081q, this.f3074j);
        canvas.translate(0.0f, i12);
        this.f3072h.draw(canvas);
        canvas.translate(i15, 0.0f);
        this.f3071g.draw(canvas);
        canvas.translate(-i15, -i12);
    }

    public final void n(Canvas canvas) {
        int i10 = this.f3081q;
        int i11 = this.f3069e;
        int i12 = i10 - i11;
        int i13 = this.f3076l;
        int i14 = this.f3075k;
        int i15 = i13 - (i14 / 2);
        this.f3067c.setBounds(0, 0, i11, i14);
        this.f3068d.setBounds(0, 0, this.f3070f, this.f3082r);
        if (!s()) {
            canvas.translate(i12, 0.0f);
            this.f3068d.draw(canvas);
            canvas.translate(0.0f, i15);
            this.f3067c.draw(canvas);
            canvas.translate(-i12, -i15);
            return;
        }
        this.f3068d.draw(canvas);
        canvas.translate(this.f3069e, i15);
        canvas.scale(-1.0f, 1.0f);
        this.f3067c.draw(canvas);
        canvas.scale(-1.0f, 1.0f);
        canvas.translate(-this.f3069e, -i15);
    }

    public final int[] o() {
        int[] iArr = this.f3089y;
        int i10 = this.b;
        iArr[0] = i10;
        iArr[1] = this.f3081q - i10;
        return iArr;
    }

    public final int[] p() {
        int[] iArr = this.f3088x;
        int i10 = this.b;
        iArr[0] = i10;
        iArr[1] = this.f3082r - i10;
        return iArr;
    }

    public void q(int i10) {
        int i11 = this.A;
        if (i11 == 1) {
            this.f3090z.cancel();
        } else if (i11 != 2) {
            return;
        }
        this.A = 3;
        ValueAnimator valueAnimator = this.f3090z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
        this.f3090z.setDuration(i10);
        this.f3090z.start();
    }

    public final void r(float f10) {
        int[] iArrO = o();
        float fMax = Math.max(iArrO[0], Math.min(iArrO[1], f10));
        if (Math.abs(this.f3079o - fMax) < 2.0f) {
            return;
        }
        int iX = x(this.f3080p, fMax, iArrO, this.f3083s.computeHorizontalScrollRange(), this.f3083s.computeHorizontalScrollOffset(), this.f3081q);
        if (iX != 0) {
            this.f3083s.scrollBy(iX, 0);
        }
        this.f3080p = fMax;
    }

    public final boolean s() {
        return this.f3083s.getLayoutDirection() == 1;
    }

    public boolean t(float f10, float f11) {
        if (f11 < this.f3082r - this.f3073i) {
            return false;
        }
        int i10 = this.f3079o;
        int i11 = this.f3078n;
        return f10 >= ((float) (i10 - (i11 / 2))) && f10 <= ((float) (i10 + (i11 / 2)));
    }

    public boolean u(float f10, float f11) {
        if (s()) {
            if (f10 > this.f3069e) {
                return false;
            }
        } else if (f10 < this.f3081q - this.f3069e) {
            return false;
        }
        int i10 = this.f3076l;
        int i11 = this.f3075k;
        return f11 >= ((float) (i10 - (i11 / 2))) && f11 <= ((float) (i10 + (i11 / 2)));
    }

    public void v() {
        this.f3083s.invalidate();
    }

    public final void w(int i10) {
        k();
        this.f3083s.postDelayed(this.B, i10);
    }

    public final int x(float f10, float f11, int[] iArr, int i10, int i11, int i12) {
        int i13 = iArr[1] - iArr[0];
        if (i13 == 0) {
            return 0;
        }
        int i14 = i10 - i12;
        int i15 = (int) (((f11 - f10) / i13) * i14);
        int i16 = i11 + i15;
        if (i16 >= i14 || i16 < 0) {
            return 0;
        }
        return i15;
    }

    public void y(int i10) {
        if (i10 == 2 && this.f3086v != 2) {
            this.f3067c.setState(D);
            k();
        }
        if (i10 == 0) {
            v();
        } else {
            A();
        }
        if (this.f3086v == 2 && i10 != 2) {
            this.f3067c.setState(E);
            w(1200);
        } else if (i10 == 1) {
            w(1500);
        }
        this.f3086v = i10;
    }

    public final void z() {
        this.f3083s.j(this);
        this.f3083s.m(this);
        this.f3083s.n(this.C);
    }
}
