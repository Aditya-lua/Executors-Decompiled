package androidx.core.view;

import android.os.Build;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: androidx.core.view.l0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0618l0 {

    /* JADX INFO: renamed from: a */
    public static Map<VelocityTracker, C0621m0> f2439a = Collections.synchronizedMap(new WeakHashMap());

    /* JADX INFO: renamed from: androidx.core.view.l0$a */
    public static class a {
        /* JADX INFO: renamed from: a */
        public static float m2945a(VelocityTracker velocityTracker, int i10) {
            return velocityTracker.getAxisVelocity(i10);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m2940a(VelocityTracker velocityTracker, MotionEvent motionEvent) {
        velocityTracker.addMovement(motionEvent);
        if (Build.VERSION.SDK_INT < 34 && motionEvent.getSource() == 4194304) {
            if (!f2439a.containsKey(velocityTracker)) {
                f2439a.put(velocityTracker, new C0621m0());
            }
            f2439a.get(velocityTracker).m2969a(motionEvent);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m2941b(VelocityTracker velocityTracker, int i10) {
        m2942c(velocityTracker, i10, Float.MAX_VALUE);
    }

    /* JADX INFO: renamed from: c */
    public static void m2942c(VelocityTracker velocityTracker, int i10, float f10) {
        velocityTracker.computeCurrentVelocity(i10, f10);
        C0621m0 c0621m0M2944e = m2944e(velocityTracker);
        if (c0621m0M2944e != null) {
            c0621m0M2944e.m2971c(i10, f10);
        }
    }

    /* JADX INFO: renamed from: d */
    public static float m2943d(VelocityTracker velocityTracker, int i10) {
        if (Build.VERSION.SDK_INT >= 34) {
            return a.m2945a(velocityTracker, i10);
        }
        if (i10 == 0) {
            return velocityTracker.getXVelocity();
        }
        if (i10 == 1) {
            return velocityTracker.getYVelocity();
        }
        C0621m0 c0621m0M2944e = m2944e(velocityTracker);
        if (c0621m0M2944e != null) {
            return c0621m0M2944e.m2972d(i10);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: e */
    public static C0621m0 m2944e(VelocityTracker velocityTracker) {
        return f2439a.get(velocityTracker);
    }
}
