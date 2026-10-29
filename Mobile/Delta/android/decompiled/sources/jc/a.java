package jc;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.o0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a<V extends View> extends c<V> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Runnable f21239d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public OverScroller f21240e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f21241f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f21242g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f21243h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f21244i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public VelocityTracker f21245j;

    /* JADX INFO: renamed from: jc.a$a, reason: collision with other inner class name */
    public class RunnableC0376a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CoordinatorLayout f21246a;
        public final V b;

        public RunnableC0376a(CoordinatorLayout coordinatorLayout, V v5) {
            this.f21246a = coordinatorLayout;
            this.b = v5;
        }

        @Override // java.lang.Runnable
        public void run() {
            OverScroller overScroller;
            if (this.b == null || (overScroller = a.this.f21240e) == null) {
                return;
            }
            if (!overScroller.computeScrollOffset()) {
                a.this.R(this.f21246a, this.b);
                return;
            }
            a aVar = a.this;
            aVar.T(this.f21246a, this.b, aVar.f21240e.getCurrY());
            o0.e0(this.b, this);
        }
    }

    public a() {
        this.f21242g = -1;
        this.f21244i = -1;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x007a  */
    /* JADX WARN: Code duplicated, block: B:30:0x0084  */
    /* JADX WARN: Code duplicated, block: B:33:0x008b A[ADDED_TO_REGION] */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean H(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5, @NonNull MotionEvent motionEvent) {
        boolean z10;
        VelocityTracker velocityTracker;
        VelocityTracker velocityTracker2;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1) {
            VelocityTracker velocityTracker3 = this.f21245j;
            if (velocityTracker3 != null) {
                velocityTracker3.addMovement(motionEvent);
                this.f21245j.computeCurrentVelocity(1000);
                N(coordinatorLayout, v5, -P(v5), 0, this.f21245j.getYVelocity(this.f21242g));
                z10 = true;
            }
            this.f21241f = false;
            this.f21242g = -1;
            velocityTracker = this.f21245j;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f21245j = null;
            }
            velocityTracker2 = this.f21245j;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
            }
            if (this.f21241f) {
            }
        }
        if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.f21242g);
            if (iFindPointerIndex == -1) {
                return false;
            }
            int y10 = (int) motionEvent.getY(iFindPointerIndex);
            int i10 = this.f21243h - y10;
            this.f21243h = y10;
            S(coordinatorLayout, v5, i10, O(v5), 0);
        } else if (actionMasked != 3) {
            if (actionMasked == 6) {
                int i11 = motionEvent.getActionIndex() == 0 ? 1 : 0;
                this.f21242g = motionEvent.getPointerId(i11);
                this.f21243h = (int) (motionEvent.getY(i11) + 0.5f);
            }
        }
        z10 = false;
        velocityTracker2 = this.f21245j;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        return !this.f21241f || z10;
        z10 = false;
        this.f21241f = false;
        this.f21242g = -1;
        velocityTracker = this.f21245j;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f21245j = null;
        }
        velocityTracker2 = this.f21245j;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        if (this.f21241f) {
        }
    }

    public boolean L(V v5) {
        return false;
    }

    public final void M() {
        if (this.f21245j == null) {
            this.f21245j = VelocityTracker.obtain();
        }
    }

    public final boolean N(CoordinatorLayout coordinatorLayout, @NonNull V v5, int i10, int i11, float f10) {
        Runnable runnable = this.f21239d;
        if (runnable != null) {
            v5.removeCallbacks(runnable);
            this.f21239d = null;
        }
        if (this.f21240e == null) {
            this.f21240e = new OverScroller(v5.getContext());
        }
        this.f21240e.fling(0, I(), 0, Math.round(f10), 0, 0, i10, i11);
        if (!this.f21240e.computeScrollOffset()) {
            R(coordinatorLayout, v5);
            return false;
        }
        RunnableC0376a runnableC0376a = new RunnableC0376a(coordinatorLayout, v5);
        this.f21239d = runnableC0376a;
        o0.e0(v5, runnableC0376a);
        return true;
    }

    public int O(@NonNull V v5) {
        return -v5.getHeight();
    }

    public int P(@NonNull V v5) {
        return v5.getHeight();
    }

    public int Q() {
        return I();
    }

    public void R(CoordinatorLayout coordinatorLayout, V v5) {
    }

    public final int S(CoordinatorLayout coordinatorLayout, V v5, int i10, int i11, int i12) {
        return U(coordinatorLayout, v5, Q() - i10, i11, i12);
    }

    public int T(CoordinatorLayout coordinatorLayout, V v5, int i10) {
        return U(coordinatorLayout, v5, i10, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public int U(CoordinatorLayout coordinatorLayout, V v5, int i10, int i11, int i12) {
        int iC;
        int I = I();
        if (i11 == 0 || I < i11 || I > i12 || I == (iC = s2.a.c(i10, i11, i12))) {
            return 0;
        }
        K(iC);
        return I - iC;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean o(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5, @NonNull MotionEvent motionEvent) {
        int iFindPointerIndex;
        if (this.f21244i < 0) {
            this.f21244i = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f21241f) {
            int i10 = this.f21242g;
            if (i10 == -1 || (iFindPointerIndex = motionEvent.findPointerIndex(i10)) == -1) {
                return false;
            }
            int y10 = (int) motionEvent.getY(iFindPointerIndex);
            if (Math.abs(y10 - this.f21243h) > this.f21244i) {
                this.f21243h = y10;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f21242g = -1;
            int x10 = (int) motionEvent.getX();
            int y11 = (int) motionEvent.getY();
            boolean z10 = L(v5) && coordinatorLayout.B(v5, x10, y11);
            this.f21241f = z10;
            if (z10) {
                this.f21243h = y11;
                this.f21242g = motionEvent.getPointerId(0);
                M();
                OverScroller overScroller = this.f21240e;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.f21240e.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.f21245j;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f21242g = -1;
        this.f21244i = -1;
    }
}
