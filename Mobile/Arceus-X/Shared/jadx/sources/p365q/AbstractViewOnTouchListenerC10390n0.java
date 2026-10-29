package p365q;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import p346p.InterfaceC10082f;

/* JADX INFO: renamed from: q.n0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractViewOnTouchListenerC10390n0 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a */
    public final float f37381a;

    /* JADX INFO: renamed from: b */
    public final int f37382b;

    /* JADX INFO: renamed from: c */
    public final int f37383c;

    /* JADX INFO: renamed from: d */
    public final View f37384d;

    /* JADX INFO: renamed from: e */
    public Runnable f37385e;

    /* JADX INFO: renamed from: f */
    public Runnable f37386f;

    /* JADX INFO: renamed from: g */
    public boolean f37387g;

    /* JADX INFO: renamed from: h */
    public int f37388h;

    /* JADX INFO: renamed from: i */
    public final int[] f37389i = new int[2];

    /* JADX INFO: renamed from: q.n0$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewParent parent = AbstractViewOnTouchListenerC10390n0.this.f37384d.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    /* JADX INFO: renamed from: q.n0$b */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractViewOnTouchListenerC10390n0.this.m39932e();
        }
    }

    public AbstractViewOnTouchListenerC10390n0(View view) {
        this.f37384d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f37381a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f37382b = tapTimeout;
        this.f37383c = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m39930h(View view, float f10, float f11, float f12) {
        float f13 = -f12;
        return f10 >= f13 && f11 >= f13 && f10 < ((float) (view.getRight() - view.getLeft())) + f12 && f11 < ((float) (view.getBottom() - view.getTop())) + f12;
    }

    /* JADX INFO: renamed from: a */
    public final void m39931a() {
        Runnable runnable = this.f37386f;
        if (runnable != null) {
            this.f37384d.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f37385e;
        if (runnable2 != null) {
            this.f37384d.removeCallbacks(runnable2);
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract InterfaceC10082f mo1542b();

    /* JADX INFO: renamed from: c */
    public abstract boolean mo1543c();

    /* JADX INFO: renamed from: d */
    public boolean mo1773d() {
        InterfaceC10082f interfaceC10082fMo1542b = mo1542b();
        if (interfaceC10082fMo1542b == null || !interfaceC10082fMo1542b.mo1574a()) {
            return true;
        }
        interfaceC10082fMo1542b.dismiss();
        return true;
    }

    /* JADX INFO: renamed from: e */
    public void m39932e() {
        m39931a();
        View view = this.f37384d;
        if (view.isEnabled() && !view.isLongClickable() && mo1543c()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long jUptimeMillis = SystemClock.uptimeMillis();
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(motionEventObtain);
            motionEventObtain.recycle();
            this.f37387g = true;
        }
    }

    /* JADX INFO: renamed from: f */
    public final boolean m39933f(MotionEvent motionEvent) {
        C10386l0 c10386l0;
        View view = this.f37384d;
        InterfaceC10082f interfaceC10082fMo1542b = mo1542b();
        if (interfaceC10082fMo1542b != null && interfaceC10082fMo1542b.mo1574a() && (c10386l0 = (C10386l0) interfaceC10082fMo1542b.mo1579o()) != null && c10386l0.isShown()) {
            MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
            m39935i(view, motionEventObtainNoHistory);
            m39936j(c10386l0, motionEventObtainNoHistory);
            boolean zMo39899e = c10386l0.mo39899e(motionEventObtainNoHistory, this.f37388h);
            motionEventObtainNoHistory.recycle();
            int actionMasked = motionEvent.getActionMasked();
            boolean z10 = (actionMasked == 1 || actionMasked == 3) ? false : true;
            if (zMo39899e && z10) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003d  */
    /* JADX INFO: renamed from: g */
    public final boolean m39934g(MotionEvent motionEvent) {
        View view = this.f37384d;
        if (!view.isEnabled()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f37388h = motionEvent.getPointerId(0);
            if (this.f37385e == null) {
                this.f37385e = new a();
            }
            view.postDelayed(this.f37385e, this.f37382b);
            if (this.f37386f == null) {
                this.f37386f = new b();
            }
            view.postDelayed(this.f37386f, this.f37383c);
        } else if (actionMasked == 1) {
            m39931a();
        } else if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.f37388h);
            if (iFindPointerIndex >= 0 && !m39930h(view, motionEvent.getX(iFindPointerIndex), motionEvent.getY(iFindPointerIndex), this.f37381a)) {
                m39931a();
                view.getParent().requestDisallowInterceptTouchEvent(true);
                return true;
            }
        } else if (actionMasked == 3) {
            m39931a();
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m39935i(View view, MotionEvent motionEvent) {
        int[] iArr = this.f37389i;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation(iArr[0], iArr[1]);
        return true;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m39936j(View view, MotionEvent motionEvent) {
        int[] iArr = this.f37389i;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation(-iArr[0], -iArr[1]);
        return true;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z10;
        boolean z11 = this.f37387g;
        if (z11) {
            z10 = m39933f(motionEvent) || !mo1773d();
        } else {
            z10 = m39934g(motionEvent) && mo1543c();
            if (z10) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                this.f37384d.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
            }
        }
        this.f37387g = z10;
        return z10 || z11;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.f37387g = false;
        this.f37388h = -1;
        Runnable runnable = this.f37385e;
        if (runnable != null) {
            this.f37384d.removeCallbacks(runnable);
        }
    }
}
