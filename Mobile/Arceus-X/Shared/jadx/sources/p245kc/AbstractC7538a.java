package p245kc;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C0625o0;
import androidx.core.view.inputmethod.EditorInfoCompat;
import p426s2.C11162a;

/* JADX INFO: renamed from: kc.a */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7538a<V extends View> extends C7540c<V> {

    /* JADX INFO: renamed from: d */
    public Runnable f28889d;

    /* JADX INFO: renamed from: e */
    public OverScroller f28890e;

    /* JADX INFO: renamed from: f */
    public boolean f28891f;

    /* JADX INFO: renamed from: g */
    public int f28892g;

    /* JADX INFO: renamed from: h */
    public int f28893h;

    /* JADX INFO: renamed from: i */
    public int f28894i;

    /* JADX INFO: renamed from: j */
    public VelocityTracker f28895j;

    /* JADX INFO: renamed from: kc.a$a */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final CoordinatorLayout f28896a;

        /* JADX INFO: renamed from: b */
        public final V f28897b;

        public a(CoordinatorLayout coordinatorLayout, V v5) {
            this.f28896a = coordinatorLayout;
            this.f28897b = v5;
        }

        @Override // java.lang.Runnable
        public void run() {
            OverScroller overScroller;
            if (this.f28897b == null || (overScroller = AbstractC7538a.this.f28890e) == null) {
                return;
            }
            if (!overScroller.computeScrollOffset()) {
                AbstractC7538a.this.mo11937R(this.f28896a, this.f28897b);
                return;
            }
            AbstractC7538a abstractC7538a = AbstractC7538a.this;
            abstractC7538a.m31183T(this.f28896a, this.f28897b, abstractC7538a.f28890e.getCurrY());
            C0625o0.m3024e0(this.f28897b, this);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC7538a() {
        this.f28892g = -1;
        this.f28894i = -1;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x007a  */
    /* JADX WARN: Code duplicated, block: B:30:0x0084  */
    /* JADX WARN: Code duplicated, block: B:33:0x008b A[ADDED_TO_REGION] */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0524c
    /* JADX INFO: renamed from: H */
    public boolean mo2604H(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5, @NonNull MotionEvent motionEvent) {
        boolean z10;
        VelocityTracker velocityTracker;
        VelocityTracker velocityTracker2;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1) {
            VelocityTracker velocityTracker3 = this.f28895j;
            if (velocityTracker3 != null) {
                velocityTracker3.addMovement(motionEvent);
                this.f28895j.computeCurrentVelocity(1000);
                m31181N(coordinatorLayout, v5, -mo11935P(v5), 0, this.f28895j.getYVelocity(this.f28892g));
                z10 = true;
            }
            this.f28891f = false;
            this.f28892g = -1;
            velocityTracker = this.f28895j;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f28895j = null;
            }
            velocityTracker2 = this.f28895j;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
            }
            if (this.f28891f) {
            }
        }
        if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.f28892g);
            if (iFindPointerIndex == -1) {
                return false;
            }
            int y10 = (int) motionEvent.getY(iFindPointerIndex);
            int i10 = this.f28893h - y10;
            this.f28893h = y10;
            m31182S(coordinatorLayout, v5, i10, mo11934O(v5), 0);
        } else if (actionMasked != 3) {
            if (actionMasked == 6) {
                int i11 = motionEvent.getActionIndex() == 0 ? 1 : 0;
                this.f28892g = motionEvent.getPointerId(i11);
                this.f28893h = (int) (motionEvent.getY(i11) + 0.5f);
            }
        }
        z10 = false;
        velocityTracker2 = this.f28895j;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        return !this.f28891f || z10;
        z10 = false;
        this.f28891f = false;
        this.f28892g = -1;
        velocityTracker = this.f28895j;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f28895j = null;
        }
        velocityTracker2 = this.f28895j;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        if (this.f28891f) {
        }
    }

    /* JADX INFO: renamed from: L */
    public boolean mo11933L(V v5) {
        return false;
    }

    /* JADX INFO: renamed from: M */
    public final void m31180M() {
        if (this.f28895j == null) {
            this.f28895j = VelocityTracker.obtain();
        }
    }

    /* JADX INFO: renamed from: N */
    public final boolean m31181N(CoordinatorLayout coordinatorLayout, @NonNull V v5, int i10, int i11, float f10) {
        Runnable runnable = this.f28889d;
        if (runnable != null) {
            v5.removeCallbacks(runnable);
            this.f28889d = null;
        }
        if (this.f28890e == null) {
            this.f28890e = new OverScroller(v5.getContext());
        }
        this.f28890e.fling(0, mo11968I(), 0, Math.round(f10), 0, 0, i10, i11);
        if (!this.f28890e.computeScrollOffset()) {
            mo11937R(coordinatorLayout, v5);
            return false;
        }
        a aVar = new a(coordinatorLayout, v5);
        this.f28889d = aVar;
        C0625o0.m3024e0(v5, aVar);
        return true;
    }

    /* JADX INFO: renamed from: O */
    public int mo11934O(@NonNull V v5) {
        return -v5.getHeight();
    }

    /* JADX INFO: renamed from: P */
    public int mo11935P(@NonNull V v5) {
        return v5.getHeight();
    }

    /* JADX INFO: renamed from: Q */
    public int mo11936Q() {
        return mo11968I();
    }

    /* JADX INFO: renamed from: R */
    public void mo11937R(CoordinatorLayout coordinatorLayout, V v5) {
    }

    /* JADX INFO: renamed from: S */
    public final int m31182S(CoordinatorLayout coordinatorLayout, V v5, int i10, int i11, int i12) {
        return mo11938U(coordinatorLayout, v5, mo11936Q() - i10, i11, i12);
    }

    /* JADX INFO: renamed from: T */
    public int m31183T(CoordinatorLayout coordinatorLayout, V v5, int i10) {
        return mo11938U(coordinatorLayout, v5, i10, EditorInfoCompat.IME_FLAG_FORCE_ASCII, Integer.MAX_VALUE);
    }

    /* JADX INFO: renamed from: U */
    public int mo11938U(CoordinatorLayout coordinatorLayout, V v5, int i10, int i11, int i12) {
        int iM42060c;
        int iMo11968I = mo11968I();
        if (i11 == 0 || iMo11968I < i11 || iMo11968I > i12 || iMo11968I == (iM42060c = C11162a.m42060c(i10, i11, i12))) {
            return 0;
        }
        mo11969K(iM42060c);
        return iMo11968I - iM42060c;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0524c
    /* JADX INFO: renamed from: o */
    public boolean mo2615o(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5, @NonNull MotionEvent motionEvent) {
        int iFindPointerIndex;
        if (this.f28894i < 0) {
            this.f28894i = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f28891f) {
            int i10 = this.f28892g;
            if (i10 == -1 || (iFindPointerIndex = motionEvent.findPointerIndex(i10)) == -1) {
                return false;
            }
            int y10 = (int) motionEvent.getY(iFindPointerIndex);
            if (Math.abs(y10 - this.f28893h) > this.f28894i) {
                this.f28893h = y10;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f28892g = -1;
            int x10 = (int) motionEvent.getX();
            int y11 = (int) motionEvent.getY();
            boolean z10 = mo11933L(v5) && coordinatorLayout.m2558B(v5, x10, y11);
            this.f28891f = z10;
            if (z10) {
                this.f28893h = y11;
                this.f28892g = motionEvent.getPointerId(0);
                m31180M();
                OverScroller overScroller = this.f28890e;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.f28890e.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.f28895j;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    public AbstractC7538a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f28892g = -1;
        this.f28894i = -1;
    }
}
