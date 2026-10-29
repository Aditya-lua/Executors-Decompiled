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
    public final int f3221a;
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final StateListDrawable f3222c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Drawable f3223d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f3224e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f3225f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final StateListDrawable f3226g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Drawable f3227h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f3228i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f3229j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f3230k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f3231l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f3232m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f3233n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f3234o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f3235p;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public RecyclerView f3238s;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final ValueAnimator f3245z;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f3236q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f3237r = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f3239t = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f3240u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f3241v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f3242w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int[] f3243x = new int[2];

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int[] f3244y = new int[2];

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
        public boolean f3248a = false;

        public c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f3248a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f3248a) {
                this.f3248a = false;
                return;
            }
            if (((Float) i.this.f3245z.getAnimatedValue()).floatValue() == 0.0f) {
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
            i.this.f3222c.setAlpha(iFloatValue);
            i.this.f3223d.setAlpha(iFloatValue);
            i.this.v();
        }
    }

    public i(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i10, int i11, int i12) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f3245z = valueAnimatorOfFloat;
        this.A = 0;
        this.B = new a();
        this.C = new b();
        this.f3222c = stateListDrawable;
        this.f3223d = drawable;
        this.f3226g = stateListDrawable2;
        this.f3227h = drawable2;
        this.f3224e = Math.max(i10, stateListDrawable.getIntrinsicWidth());
        this.f3225f = Math.max(i10, drawable.getIntrinsicWidth());
        this.f3228i = Math.max(i10, stateListDrawable2.getIntrinsicWidth());
        this.f3229j = Math.max(i10, drawable2.getIntrinsicWidth());
        this.f3221a = i11;
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
                this.f3245z.cancel();
            }
        }
        this.A = 1;
        ValueAnimator valueAnimator = this.f3245z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        this.f3245z.setDuration(500L);
        this.f3245z.setStartDelay(0L);
        this.f3245z.start();
    }

    public void B(int i10, int i11) {
        int iComputeVerticalScrollRange = this.f3238s.computeVerticalScrollRange();
        int i12 = this.f3237r;
        this.f3239t = iComputeVerticalScrollRange - i12 > 0 && i12 >= this.f3221a;
        int iComputeHorizontalScrollRange = this.f3238s.computeHorizontalScrollRange();
        int i13 = this.f3236q;
        boolean z10 = iComputeHorizontalScrollRange - i13 > 0 && i13 >= this.f3221a;
        this.f3240u = z10;
        boolean z11 = this.f3239t;
        if (!z11 && !z10) {
            if (this.f3241v != 0) {
                y(0);
                return;
            }
            return;
        }
        if (z11) {
            float f10 = i12;
            this.f3231l = (int) ((f10 * (i11 + (f10 / 2.0f))) / iComputeVerticalScrollRange);
            this.f3230k = Math.min(i12, (i12 * i12) / iComputeVerticalScrollRange);
        }
        if (this.f3240u) {
            float f11 = i13;
            this.f3234o = (int) ((f11 * (i10 + (f11 / 2.0f))) / iComputeHorizontalScrollRange);
            this.f3233n = Math.min(i13, (i13 * i13) / iComputeHorizontalScrollRange);
        }
        int i14 = this.f3241v;
        if (i14 == 0 || i14 == 1) {
            y(1);
        }
    }

    public final void C(float f10) {
        int[] iArrP = p();
        float fMax = Math.max(iArrP[0], Math.min(iArrP[1], f10));
        if (Math.abs(this.f3231l - fMax) < 2.0f) {
            return;
        }
        int iX = x(this.f3232m, fMax, iArrP, this.f3238s.computeVerticalScrollRange(), this.f3238s.computeVerticalScrollOffset(), this.f3237r);
        if (iX != 0) {
            this.f3238s.scrollBy(0, iX);
        }
        this.f3232m = fMax;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.u
    public void a(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent) {
        if (this.f3241v == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean zU = u(motionEvent.getX(), motionEvent.getY());
            boolean zT = t(motionEvent.getX(), motionEvent.getY());
            if (zU || zT) {
                if (zT) {
                    this.f3242w = 1;
                    this.f3235p = (int) motionEvent.getX();
                } else if (zU) {
                    this.f3242w = 2;
                    this.f3232m = (int) motionEvent.getY();
                }
                y(2);
                return;
            }
            return;
        }
        if (motionEvent.getAction() == 1 && this.f3241v == 2) {
            this.f3232m = 0.0f;
            this.f3235p = 0.0f;
            y(1);
            this.f3242w = 0;
            return;
        }
        if (motionEvent.getAction() == 2 && this.f3241v == 2) {
            A();
            if (this.f3242w == 1) {
                r(motionEvent.getX());
            }
            if (this.f3242w == 2) {
                C(motionEvent.getY());
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.u
    public boolean b(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent) {
        int i10 = this.f3241v;
        if (i10 != 1) {
            return i10 == 2;
        }
        boolean zU = u(motionEvent.getX(), motionEvent.getY());
        boolean zT = t(motionEvent.getX(), motionEvent.getY());
        if (motionEvent.getAction() != 0 || (!zU && !zT)) {
            return false;
        }
        if (zT) {
            this.f3242w = 1;
            this.f3235p = (int) motionEvent.getX();
        } else if (zU) {
            this.f3242w = 2;
            this.f3232m = (int) motionEvent.getY();
        }
        y(2);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.u
    public void c(boolean z10) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void i(Canvas canvas, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
        if (this.f3236q != this.f3238s.getWidth() || this.f3237r != this.f3238s.getHeight()) {
            this.f3236q = this.f3238s.getWidth();
            this.f3237r = this.f3238s.getHeight();
            y(0);
        } else if (this.A != 0) {
            if (this.f3239t) {
                n(canvas);
            }
            if (this.f3240u) {
                m(canvas);
            }
        }
    }

    public void j(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f3238s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            l();
        }
        this.f3238s = recyclerView;
        if (recyclerView != null) {
            z();
        }
    }

    public final void k() {
        this.f3238s.removeCallbacks(this.B);
    }

    public final void l() {
        this.f3238s.i1(this);
        this.f3238s.j1(this);
        this.f3238s.k1(this.C);
        k();
    }

    public final void m(Canvas canvas) {
        int i10 = this.f3237r;
        int i11 = this.f3228i;
        int i12 = i10 - i11;
        int i13 = this.f3234o;
        int i14 = this.f3233n;
        int i15 = i13 - (i14 / 2);
        this.f3226g.setBounds(0, 0, i14, i11);
        this.f3227h.setBounds(0, 0, this.f3236q, this.f3229j);
        canvas.translate(0.0f, i12);
        this.f3227h.draw(canvas);
        canvas.translate(i15, 0.0f);
        this.f3226g.draw(canvas);
        canvas.translate(-i15, -i12);
    }

    public final void n(Canvas canvas) {
        int i10 = this.f3236q;
        int i11 = this.f3224e;
        int i12 = i10 - i11;
        int i13 = this.f3231l;
        int i14 = this.f3230k;
        int i15 = i13 - (i14 / 2);
        this.f3222c.setBounds(0, 0, i11, i14);
        this.f3223d.setBounds(0, 0, this.f3225f, this.f3237r);
        if (!s()) {
            canvas.translate(i12, 0.0f);
            this.f3223d.draw(canvas);
            canvas.translate(0.0f, i15);
            this.f3222c.draw(canvas);
            canvas.translate(-i12, -i15);
            return;
        }
        this.f3223d.draw(canvas);
        canvas.translate(this.f3224e, i15);
        canvas.scale(-1.0f, 1.0f);
        this.f3222c.draw(canvas);
        canvas.scale(-1.0f, 1.0f);
        canvas.translate(-this.f3224e, -i15);
    }

    public final int[] o() {
        int[] iArr = this.f3244y;
        int i10 = this.b;
        iArr[0] = i10;
        iArr[1] = this.f3236q - i10;
        return iArr;
    }

    public final int[] p() {
        int[] iArr = this.f3243x;
        int i10 = this.b;
        iArr[0] = i10;
        iArr[1] = this.f3237r - i10;
        return iArr;
    }

    public void q(int i10) {
        int i11 = this.A;
        if (i11 == 1) {
            this.f3245z.cancel();
        } else if (i11 != 2) {
            return;
        }
        this.A = 3;
        ValueAnimator valueAnimator = this.f3245z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
        this.f3245z.setDuration(i10);
        this.f3245z.start();
    }

    public final void r(float f10) {
        int[] iArrO = o();
        float fMax = Math.max(iArrO[0], Math.min(iArrO[1], f10));
        if (Math.abs(this.f3234o - fMax) < 2.0f) {
            return;
        }
        int iX = x(this.f3235p, fMax, iArrO, this.f3238s.computeHorizontalScrollRange(), this.f3238s.computeHorizontalScrollOffset(), this.f3236q);
        if (iX != 0) {
            this.f3238s.scrollBy(iX, 0);
        }
        this.f3235p = fMax;
    }

    public final boolean s() {
        return this.f3238s.getLayoutDirection() == 1;
    }

    public boolean t(float f10, float f11) {
        if (f11 < this.f3237r - this.f3228i) {
            return false;
        }
        int i10 = this.f3234o;
        int i11 = this.f3233n;
        return f10 >= ((float) (i10 - (i11 / 2))) && f10 <= ((float) (i10 + (i11 / 2)));
    }

    public boolean u(float f10, float f11) {
        if (s()) {
            if (f10 > this.f3224e) {
                return false;
            }
        } else if (f10 < this.f3236q - this.f3224e) {
            return false;
        }
        int i10 = this.f3231l;
        int i11 = this.f3230k;
        return f11 >= ((float) (i10 - (i11 / 2))) && f11 <= ((float) (i10 + (i11 / 2)));
    }

    public void v() {
        this.f3238s.invalidate();
    }

    public final void w(int i10) {
        k();
        this.f3238s.postDelayed(this.B, i10);
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
        if (i10 == 2 && this.f3241v != 2) {
            this.f3222c.setState(D);
            k();
        }
        if (i10 == 0) {
            v();
        } else {
            A();
        }
        if (this.f3241v == 2 && i10 != 2) {
            this.f3222c.setState(E);
            w(1200);
        } else if (i10 == 1) {
            w(1500);
        }
        this.f3241v = i10;
    }

    public final void z() {
        this.f3238s.j(this);
        this.f3238s.m(this);
        this.f3238s.n(this.C);
    }
}
