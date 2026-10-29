package q;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;

/* JADX INFO: loaded from: classes.dex */
public abstract class n0 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f29037a;
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f29038c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View f29039d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Runnable f29040e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Runnable f29041f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f29042g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f29043h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int[] f29044i = new int[2];

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewParent parent = n0.this.f29039d.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            n0.this.e();
        }
    }

    public n0(View view) {
        this.f29039d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f29037a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.b = tapTimeout;
        this.f29038c = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    public static boolean h(View view, float f10, float f11, float f12) {
        float f13 = -f12;
        return f10 >= f13 && f11 >= f13 && f10 < ((float) (view.getRight() - view.getLeft())) + f12 && f11 < ((float) (view.getBottom() - view.getTop())) + f12;
    }

    public final void a() {
        Runnable runnable = this.f29041f;
        if (runnable != null) {
            this.f29039d.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f29040e;
        if (runnable2 != null) {
            this.f29039d.removeCallbacks(runnable2);
        }
    }

    public abstract p.f b();

    public abstract boolean c();

    public boolean d() {
        p.f fVarB = b();
        if (fVarB == null || !fVarB.a()) {
            return true;
        }
        fVarB.dismiss();
        return true;
    }

    public void e() {
        a();
        View view = this.f29039d;
        if (view.isEnabled() && !view.isLongClickable() && c()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long jUptimeMillis = SystemClock.uptimeMillis();
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(motionEventObtain);
            motionEventObtain.recycle();
            this.f29042g = true;
        }
    }

    public final boolean f(MotionEvent motionEvent) {
        l0 l0Var;
        View view = this.f29039d;
        p.f fVarB = b();
        if (fVarB != null && fVarB.a() && (l0Var = (l0) fVarB.o()) != null && l0Var.isShown()) {
            MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
            i(view, motionEventObtainNoHistory);
            j(l0Var, motionEventObtainNoHistory);
            boolean zE = l0Var.e(motionEventObtainNoHistory, this.f29043h);
            motionEventObtainNoHistory.recycle();
            int actionMasked = motionEvent.getActionMasked();
            boolean z10 = (actionMasked == 1 || actionMasked == 3) ? false : true;
            if (zE && z10) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003d  */
    public final boolean g(MotionEvent motionEvent) {
        View view = this.f29039d;
        if (!view.isEnabled()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f29043h = motionEvent.getPointerId(0);
            if (this.f29040e == null) {
                this.f29040e = new a();
            }
            view.postDelayed(this.f29040e, this.b);
            if (this.f29041f == null) {
                this.f29041f = new b();
            }
            view.postDelayed(this.f29041f, this.f29038c);
        } else if (actionMasked == 1) {
            a();
        } else if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.f29043h);
            if (iFindPointerIndex >= 0 && !h(view, motionEvent.getX(iFindPointerIndex), motionEvent.getY(iFindPointerIndex), this.f29037a)) {
                a();
                view.getParent().requestDisallowInterceptTouchEvent(true);
                return true;
            }
        } else if (actionMasked == 3) {
            a();
        }
        return false;
    }

    public final boolean i(View view, MotionEvent motionEvent) {
        int[] iArr = this.f29044i;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation(iArr[0], iArr[1]);
        return true;
    }

    public final boolean j(View view, MotionEvent motionEvent) {
        int[] iArr = this.f29044i;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation(-iArr[0], -iArr[1]);
        return true;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z10;
        boolean z11 = this.f29042g;
        if (z11) {
            z10 = f(motionEvent) || !d();
        } else {
            z10 = g(motionEvent) && c();
            if (z10) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                this.f29039d.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
            }
        }
        this.f29042g = z10;
        return z10 || z11;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.f29042g = false;
        this.f29043h = -1;
        Runnable runnable = this.f29040e;
        if (runnable != null) {
            this.f29039d.removeCallbacks(runnable);
        }
    }
}
