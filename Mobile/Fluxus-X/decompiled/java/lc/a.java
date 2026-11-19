package lc;

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
    public Runnable f22048d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public OverScroller f22049e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f22050f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f22051g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f22052h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f22053i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public VelocityTracker f22054j;

    /* JADX INFO: renamed from: lc.a$a, reason: collision with other inner class name */
    public class RunnableC0424a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CoordinatorLayout f22055a;
        public final V b;

        public RunnableC0424a(CoordinatorLayout coordinatorLayout, V v8) {
            this.f22055a = coordinatorLayout;
            this.b = v8;
        }

        @Override // java.lang.Runnable
        public void run() {
            OverScroller overScroller;
            if (this.b == null || (overScroller = a.this.f22049e) == null) {
                return;
            }
            if (!overScroller.computeScrollOffset()) {
                a.this.R(this.f22055a, this.b);
                return;
            }
            a aVar = a.this;
            aVar.T(this.f22055a, this.b, aVar.f22049e.getCurrY());
            o0.e0(this.b, this);
        }
    }

    public a() {
        this.f22051g = -1;
        this.f22053i = -1;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x007a  */
    /* JADX WARN: Code duplicated, block: B:30:0x0084  */
    /* JADX WARN: Code duplicated, block: B:33:0x008b A[ADDED_TO_REGION] */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean H(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v8, @NonNull MotionEvent motionEvent) {
        boolean z10;
        VelocityTracker velocityTracker;
        VelocityTracker velocityTracker2;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1) {
            VelocityTracker velocityTracker3 = this.f22054j;
            if (velocityTracker3 != null) {
                velocityTracker3.addMovement(motionEvent);
                this.f22054j.computeCurrentVelocity(1000);
                N(coordinatorLayout, v8, -P(v8), 0, this.f22054j.getYVelocity(this.f22051g));
                z10 = true;
            }
            this.f22050f = false;
            this.f22051g = -1;
            velocityTracker = this.f22054j;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f22054j = null;
            }
            velocityTracker2 = this.f22054j;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
            }
            if (this.f22050f) {
            }
        }
        if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.f22051g);
            if (iFindPointerIndex == -1) {
                return false;
            }
            int y10 = (int) motionEvent.getY(iFindPointerIndex);
            int i10 = this.f22052h - y10;
            this.f22052h = y10;
            S(coordinatorLayout, v8, i10, O(v8), 0);
        } else if (actionMasked != 3) {
            if (actionMasked == 6) {
                int i11 = motionEvent.getActionIndex() == 0 ? 1 : 0;
                this.f22051g = motionEvent.getPointerId(i11);
                this.f22052h = (int) (motionEvent.getY(i11) + 0.5f);
            }
        }
        z10 = false;
        velocityTracker2 = this.f22054j;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        return !this.f22050f || z10;
        z10 = false;
        this.f22050f = false;
        this.f22051g = -1;
        velocityTracker = this.f22054j;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f22054j = null;
        }
        velocityTracker2 = this.f22054j;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        if (this.f22050f) {
        }
    }

    public boolean L(V v8) {
        return false;
    }

    public final void M() {
        if (this.f22054j == null) {
            this.f22054j = VelocityTracker.obtain();
        }
    }

    public final boolean N(CoordinatorLayout coordinatorLayout, @NonNull V v8, int i10, int i11, float f10) {
        Runnable runnable = this.f22048d;
        if (runnable != null) {
            v8.removeCallbacks(runnable);
            this.f22048d = null;
        }
        if (this.f22049e == null) {
            this.f22049e = new OverScroller(v8.getContext());
        }
        this.f22049e.fling(0, I(), 0, Math.round(f10), 0, 0, i10, i11);
        if (!this.f22049e.computeScrollOffset()) {
            R(coordinatorLayout, v8);
            return false;
        }
        RunnableC0424a runnableC0424a = new RunnableC0424a(coordinatorLayout, v8);
        this.f22048d = runnableC0424a;
        o0.e0(v8, runnableC0424a);
        return true;
    }

    public int O(@NonNull V v8) {
        return -v8.getHeight();
    }

    public int P(@NonNull V v8) {
        return v8.getHeight();
    }

    public int Q() {
        return I();
    }

    public void R(CoordinatorLayout coordinatorLayout, V v8) {
    }

    public final int S(CoordinatorLayout coordinatorLayout, V v8, int i10, int i11, int i12) {
        return U(coordinatorLayout, v8, Q() - i10, i11, i12);
    }

    public int T(CoordinatorLayout coordinatorLayout, V v8, int i10) {
        return U(coordinatorLayout, v8, i10, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public int U(CoordinatorLayout coordinatorLayout, V v8, int i10, int i11, int i12) {
        int iC;
        int I = I();
        if (i11 == 0 || I < i11 || I > i12 || I == (iC = s2.a.c(i10, i11, i12))) {
            return 0;
        }
        K(iC);
        return I - iC;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean o(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v8, @NonNull MotionEvent motionEvent) {
        int iFindPointerIndex;
        if (this.f22053i < 0) {
            this.f22053i = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f22050f) {
            int i10 = this.f22051g;
            if (i10 == -1 || (iFindPointerIndex = motionEvent.findPointerIndex(i10)) == -1) {
                return false;
            }
            int y10 = (int) motionEvent.getY(iFindPointerIndex);
            if (Math.abs(y10 - this.f22052h) > this.f22053i) {
                this.f22052h = y10;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f22051g = -1;
            int x5 = (int) motionEvent.getX();
            int y11 = (int) motionEvent.getY();
            boolean z10 = L(v8) && coordinatorLayout.B(v8, x5, y11);
            this.f22050f = z10;
            if (z10) {
                this.f22052h = y11;
                this.f22051g = motionEvent.getPointerId(0);
                M();
                OverScroller overScroller = this.f22049e;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.f22049e.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.f22054j;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22051g = -1;
        this.f22053i = -1;
    }
}
