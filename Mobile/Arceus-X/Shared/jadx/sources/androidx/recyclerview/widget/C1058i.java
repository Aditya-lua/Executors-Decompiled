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

/* JADX INFO: renamed from: androidx.recyclerview.widget.i */
/* JADX INFO: loaded from: classes.dex */
public class C1058i extends RecyclerView.AbstractC1033p implements RecyclerView.InterfaceC1038u {

    /* JADX INFO: renamed from: D */
    public static final int[] f4244D = {R.attr.state_pressed};

    /* JADX INFO: renamed from: E */
    public static final int[] f4245E = new int[0];

    /* JADX INFO: renamed from: A */
    public int f4246A;

    /* JADX INFO: renamed from: B */
    public final Runnable f4247B;

    /* JADX INFO: renamed from: C */
    public final RecyclerView.AbstractC1039v f4248C;

    /* JADX INFO: renamed from: a */
    public final int f4249a;

    /* JADX INFO: renamed from: b */
    public final int f4250b;

    /* JADX INFO: renamed from: c */
    public final StateListDrawable f4251c;

    /* JADX INFO: renamed from: d */
    public final Drawable f4252d;

    /* JADX INFO: renamed from: e */
    public final int f4253e;

    /* JADX INFO: renamed from: f */
    public final int f4254f;

    /* JADX INFO: renamed from: g */
    public final StateListDrawable f4255g;

    /* JADX INFO: renamed from: h */
    public final Drawable f4256h;

    /* JADX INFO: renamed from: i */
    public final int f4257i;

    /* JADX INFO: renamed from: j */
    public final int f4258j;

    /* JADX INFO: renamed from: k */
    public int f4259k;

    /* JADX INFO: renamed from: l */
    public int f4260l;

    /* JADX INFO: renamed from: m */
    public float f4261m;

    /* JADX INFO: renamed from: n */
    public int f4262n;

    /* JADX INFO: renamed from: o */
    public int f4263o;

    /* JADX INFO: renamed from: p */
    public float f4264p;

    /* JADX INFO: renamed from: s */
    public RecyclerView f4267s;

    /* JADX INFO: renamed from: z */
    public final ValueAnimator f4274z;

    /* JADX INFO: renamed from: q */
    public int f4265q = 0;

    /* JADX INFO: renamed from: r */
    public int f4266r = 0;

    /* JADX INFO: renamed from: t */
    public boolean f4268t = false;

    /* JADX INFO: renamed from: u */
    public boolean f4269u = false;

    /* JADX INFO: renamed from: v */
    public int f4270v = 0;

    /* JADX INFO: renamed from: w */
    public int f4271w = 0;

    /* JADX INFO: renamed from: x */
    public final int[] f4272x = new int[2];

    /* JADX INFO: renamed from: y */
    public final int[] f4273y = new int[2];

    /* JADX INFO: renamed from: androidx.recyclerview.widget.i$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C1058i.this.m5959q(500);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.i$b */
    public class b extends RecyclerView.AbstractC1039v {
        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1039v
        /* JADX INFO: renamed from: b */
        public void mo5660b(RecyclerView recyclerView, int i10, int i11) {
            C1058i.this.m5950B(recyclerView.computeHorizontalScrollOffset(), recyclerView.computeVerticalScrollOffset());
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.i$c */
    public class c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public boolean f4277a = false;

        public c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f4277a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f4277a) {
                this.f4277a = false;
                return;
            }
            if (((Float) C1058i.this.f4274z.getAnimatedValue()).floatValue() == 0.0f) {
                C1058i c1058i = C1058i.this;
                c1058i.f4246A = 0;
                c1058i.m5967y(0);
            } else {
                C1058i c1058i2 = C1058i.this;
                c1058i2.f4246A = 2;
                c1058i2.m5964v();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.i$d */
    public class d implements ValueAnimator.AnimatorUpdateListener {
        public d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            C1058i.this.f4251c.setAlpha(iFloatValue);
            C1058i.this.f4252d.setAlpha(iFloatValue);
            C1058i.this.m5964v();
        }
    }

    public C1058i(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i10, int i11, int i12) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f4274z = valueAnimatorOfFloat;
        this.f4246A = 0;
        this.f4247B = new a();
        this.f4248C = new b();
        this.f4251c = stateListDrawable;
        this.f4252d = drawable;
        this.f4255g = stateListDrawable2;
        this.f4256h = drawable2;
        this.f4253e = Math.max(i10, stateListDrawable.getIntrinsicWidth());
        this.f4254f = Math.max(i10, drawable.getIntrinsicWidth());
        this.f4257i = Math.max(i10, stateListDrawable2.getIntrinsicWidth());
        this.f4258j = Math.max(i10, drawable2.getIntrinsicWidth());
        this.f4249a = i11;
        this.f4250b = i12;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        valueAnimatorOfFloat.addListener(new c());
        valueAnimatorOfFloat.addUpdateListener(new d());
        m5952j(recyclerView);
    }

    /* JADX INFO: renamed from: A */
    public void m5949A() {
        int i10 = this.f4246A;
        if (i10 != 0) {
            if (i10 != 3) {
                return;
            } else {
                this.f4274z.cancel();
            }
        }
        this.f4246A = 1;
        ValueAnimator valueAnimator = this.f4274z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        this.f4274z.setDuration(500L);
        this.f4274z.setStartDelay(0L);
        this.f4274z.start();
    }

    /* JADX INFO: renamed from: B */
    public void m5950B(int i10, int i11) {
        int iComputeVerticalScrollRange = this.f4267s.computeVerticalScrollRange();
        int i12 = this.f4266r;
        this.f4268t = iComputeVerticalScrollRange - i12 > 0 && i12 >= this.f4249a;
        int iComputeHorizontalScrollRange = this.f4267s.computeHorizontalScrollRange();
        int i13 = this.f4265q;
        boolean z10 = iComputeHorizontalScrollRange - i13 > 0 && i13 >= this.f4249a;
        this.f4269u = z10;
        boolean z11 = this.f4268t;
        if (!z11 && !z10) {
            if (this.f4270v != 0) {
                m5967y(0);
                return;
            }
            return;
        }
        if (z11) {
            float f10 = i12;
            this.f4260l = (int) ((f10 * (i11 + (f10 / 2.0f))) / iComputeVerticalScrollRange);
            this.f4259k = Math.min(i12, (i12 * i12) / iComputeVerticalScrollRange);
        }
        if (this.f4269u) {
            float f11 = i13;
            this.f4263o = (int) ((f11 * (i10 + (f11 / 2.0f))) / iComputeHorizontalScrollRange);
            this.f4262n = Math.min(i13, (i13 * i13) / iComputeHorizontalScrollRange);
        }
        int i14 = this.f4270v;
        if (i14 == 0 || i14 == 1) {
            m5967y(1);
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m5951C(float f10) {
        int[] iArrM5958p = m5958p();
        float fMax = Math.max(iArrM5958p[0], Math.min(iArrM5958p[1], f10));
        if (Math.abs(this.f4260l - fMax) < 2.0f) {
            return;
        }
        int iM5966x = m5966x(this.f4261m, fMax, iArrM5958p, this.f4267s.computeVerticalScrollRange(), this.f4267s.computeVerticalScrollOffset(), this.f4266r);
        if (iM5966x != 0) {
            this.f4267s.scrollBy(0, iM5966x);
        }
        this.f4261m = fMax;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC1038u
    /* JADX INFO: renamed from: a */
    public void mo5656a(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent) {
        if (this.f4270v == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean zM5963u = m5963u(motionEvent.getX(), motionEvent.getY());
            boolean zM5962t = m5962t(motionEvent.getX(), motionEvent.getY());
            if (zM5963u || zM5962t) {
                if (zM5962t) {
                    this.f4271w = 1;
                    this.f4264p = (int) motionEvent.getX();
                } else if (zM5963u) {
                    this.f4271w = 2;
                    this.f4261m = (int) motionEvent.getY();
                }
                m5967y(2);
                return;
            }
            return;
        }
        if (motionEvent.getAction() == 1 && this.f4270v == 2) {
            this.f4261m = 0.0f;
            this.f4264p = 0.0f;
            m5967y(1);
            this.f4271w = 0;
            return;
        }
        if (motionEvent.getAction() == 2 && this.f4270v == 2) {
            m5949A();
            if (this.f4271w == 1) {
                m5960r(motionEvent.getX());
            }
            if (this.f4271w == 2) {
                m5951C(motionEvent.getY());
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC1038u
    /* JADX INFO: renamed from: b */
    public boolean mo5657b(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent) {
        int i10 = this.f4270v;
        if (i10 != 1) {
            return i10 == 2;
        }
        boolean zM5963u = m5963u(motionEvent.getX(), motionEvent.getY());
        boolean zM5962t = m5962t(motionEvent.getX(), motionEvent.getY());
        if (motionEvent.getAction() != 0 || (!zM5963u && !zM5962t)) {
            return false;
        }
        if (zM5962t) {
            this.f4271w = 1;
            this.f4264p = (int) motionEvent.getX();
        } else if (zM5963u) {
            this.f4271w = 2;
            this.f4261m = (int) motionEvent.getY();
        }
        m5967y(2);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC1038u
    /* JADX INFO: renamed from: c */
    public void mo5658c(boolean z10) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1033p
    /* JADX INFO: renamed from: i */
    public void mo5541i(Canvas canvas, RecyclerView recyclerView, RecyclerView.C1015b0 c1015b0) {
        if (this.f4265q != this.f4267s.getWidth() || this.f4266r != this.f4267s.getHeight()) {
            this.f4265q = this.f4267s.getWidth();
            this.f4266r = this.f4267s.getHeight();
            m5967y(0);
        } else if (this.f4246A != 0) {
            if (this.f4268t) {
                m5956n(canvas);
            }
            if (this.f4269u) {
                m5955m(canvas);
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public void m5952j(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f4267s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            m5954l();
        }
        this.f4267s = recyclerView;
        if (recyclerView != null) {
            m5968z();
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m5953k() {
        this.f4267s.removeCallbacks(this.f4247B);
    }

    /* JADX INFO: renamed from: l */
    public final void m5954l() {
        this.f4267s.m5316i1(this);
        this.f4267s.m5319j1(this);
        this.f4267s.m5322k1(this.f4248C);
        m5953k();
    }

    /* JADX INFO: renamed from: m */
    public final void m5955m(Canvas canvas) {
        int i10 = this.f4266r;
        int i11 = this.f4257i;
        int i12 = i10 - i11;
        int i13 = this.f4263o;
        int i14 = this.f4262n;
        int i15 = i13 - (i14 / 2);
        this.f4255g.setBounds(0, 0, i14, i11);
        this.f4256h.setBounds(0, 0, this.f4265q, this.f4258j);
        canvas.translate(0.0f, i12);
        this.f4256h.draw(canvas);
        canvas.translate(i15, 0.0f);
        this.f4255g.draw(canvas);
        canvas.translate(-i15, -i12);
    }

    /* JADX INFO: renamed from: n */
    public final void m5956n(Canvas canvas) {
        int i10 = this.f4265q;
        int i11 = this.f4253e;
        int i12 = i10 - i11;
        int i13 = this.f4260l;
        int i14 = this.f4259k;
        int i15 = i13 - (i14 / 2);
        this.f4251c.setBounds(0, 0, i11, i14);
        this.f4252d.setBounds(0, 0, this.f4254f, this.f4266r);
        if (!m5961s()) {
            canvas.translate(i12, 0.0f);
            this.f4252d.draw(canvas);
            canvas.translate(0.0f, i15);
            this.f4251c.draw(canvas);
            canvas.translate(-i12, -i15);
            return;
        }
        this.f4252d.draw(canvas);
        canvas.translate(this.f4253e, i15);
        canvas.scale(-1.0f, 1.0f);
        this.f4251c.draw(canvas);
        canvas.scale(-1.0f, 1.0f);
        canvas.translate(-this.f4253e, -i15);
    }

    /* JADX INFO: renamed from: o */
    public final int[] m5957o() {
        int[] iArr = this.f4273y;
        int i10 = this.f4250b;
        iArr[0] = i10;
        iArr[1] = this.f4265q - i10;
        return iArr;
    }

    /* JADX INFO: renamed from: p */
    public final int[] m5958p() {
        int[] iArr = this.f4272x;
        int i10 = this.f4250b;
        iArr[0] = i10;
        iArr[1] = this.f4266r - i10;
        return iArr;
    }

    /* JADX INFO: renamed from: q */
    public void m5959q(int i10) {
        int i11 = this.f4246A;
        if (i11 == 1) {
            this.f4274z.cancel();
        } else if (i11 != 2) {
            return;
        }
        this.f4246A = 3;
        ValueAnimator valueAnimator = this.f4274z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
        this.f4274z.setDuration(i10);
        this.f4274z.start();
    }

    /* JADX INFO: renamed from: r */
    public final void m5960r(float f10) {
        int[] iArrM5957o = m5957o();
        float fMax = Math.max(iArrM5957o[0], Math.min(iArrM5957o[1], f10));
        if (Math.abs(this.f4263o - fMax) < 2.0f) {
            return;
        }
        int iM5966x = m5966x(this.f4264p, fMax, iArrM5957o, this.f4267s.computeHorizontalScrollRange(), this.f4267s.computeHorizontalScrollOffset(), this.f4265q);
        if (iM5966x != 0) {
            this.f4267s.scrollBy(iM5966x, 0);
        }
        this.f4264p = fMax;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m5961s() {
        return this.f4267s.getLayoutDirection() == 1;
    }

    /* JADX INFO: renamed from: t */
    public boolean m5962t(float f10, float f11) {
        if (f11 < this.f4266r - this.f4257i) {
            return false;
        }
        int i10 = this.f4263o;
        int i11 = this.f4262n;
        return f10 >= ((float) (i10 - (i11 / 2))) && f10 <= ((float) (i10 + (i11 / 2)));
    }

    /* JADX INFO: renamed from: u */
    public boolean m5963u(float f10, float f11) {
        if (m5961s()) {
            if (f10 > this.f4253e) {
                return false;
            }
        } else if (f10 < this.f4265q - this.f4253e) {
            return false;
        }
        int i10 = this.f4260l;
        int i11 = this.f4259k;
        return f11 >= ((float) (i10 - (i11 / 2))) && f11 <= ((float) (i10 + (i11 / 2)));
    }

    /* JADX INFO: renamed from: v */
    public void m5964v() {
        this.f4267s.invalidate();
    }

    /* JADX INFO: renamed from: w */
    public final void m5965w(int i10) {
        m5953k();
        this.f4267s.postDelayed(this.f4247B, i10);
    }

    /* JADX INFO: renamed from: x */
    public final int m5966x(float f10, float f11, int[] iArr, int i10, int i11, int i12) {
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

    /* JADX INFO: renamed from: y */
    public void m5967y(int i10) {
        if (i10 == 2 && this.f4270v != 2) {
            this.f4251c.setState(f4244D);
            m5953k();
        }
        if (i10 == 0) {
            m5964v();
        } else {
            m5949A();
        }
        if (this.f4270v == 2 && i10 != 2) {
            this.f4251c.setState(f4245E);
            m5965w(1200);
        } else if (i10 == 1) {
            m5965w(1500);
        }
        this.f4270v = i10;
    }

    /* JADX INFO: renamed from: z */
    public final void m5968z() {
        this.f4267s.m5317j(this);
        this.f4267s.m5326m(this);
        this.f4267s.m5329n(this.f4248C);
    }
}
