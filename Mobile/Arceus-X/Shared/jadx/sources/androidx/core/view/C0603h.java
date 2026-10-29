package androidx.core.view;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

/* JADX INFO: renamed from: androidx.core.view.h */
/* JADX INFO: loaded from: classes.dex */
public class C0603h {

    /* JADX INFO: renamed from: a */
    public final Context f2415a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC0606i f2416b;

    /* JADX INFO: renamed from: c */
    public final b f2417c;

    /* JADX INFO: renamed from: d */
    public final a f2418d;

    /* JADX INFO: renamed from: e */
    public VelocityTracker f2419e;

    /* JADX INFO: renamed from: f */
    public float f2420f;

    /* JADX INFO: renamed from: g */
    public int f2421g;

    /* JADX INFO: renamed from: h */
    public int f2422h;

    /* JADX INFO: renamed from: i */
    public int f2423i;

    /* JADX INFO: renamed from: j */
    public final int[] f2424j;

    /* JADX INFO: renamed from: androidx.core.view.h$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        float mo2896a(VelocityTracker velocityTracker, MotionEvent motionEvent, int i10);
    }

    /* JADX INFO: renamed from: androidx.core.view.h$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo2891a(Context context, int[] iArr, MotionEvent motionEvent, int i10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0603h(Context context, InterfaceC0606i interfaceC0606i) {
        this(context, interfaceC0606i, new b() { // from class: androidx.core.view.f
            @Override // androidx.core.view.C0603h.b
            /* JADX INFO: renamed from: a */
            public final void mo2891a(Context context2, int[] iArr, MotionEvent motionEvent, int i10) {
                C0603h.m2900c(context2, iArr, motionEvent, i10);
            }
        }, new a() { // from class: androidx.core.view.g
            @Override // androidx.core.view.C0603h.a
            /* JADX INFO: renamed from: a */
            public final float mo2896a(VelocityTracker velocityTracker, MotionEvent motionEvent, int i10) {
                return C0603h.m2901f(velocityTracker, motionEvent, i10);
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public static void m2900c(Context context, int[] iArr, MotionEvent motionEvent, int i10) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        iArr[0] = C0631r0.m3166g(context, viewConfiguration, motionEvent.getDeviceId(), i10, motionEvent.getSource());
        iArr[1] = C0631r0.m3165f(context, viewConfiguration, motionEvent.getDeviceId(), i10, motionEvent.getSource());
    }

    /* JADX INFO: renamed from: f */
    public static float m2901f(VelocityTracker velocityTracker, MotionEvent motionEvent, int i10) {
        C0618l0.m2940a(velocityTracker, motionEvent);
        C0618l0.m2941b(velocityTracker, 1000);
        return C0618l0.m2943d(velocityTracker, i10);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m2902d(MotionEvent motionEvent, int i10) {
        int source = motionEvent.getSource();
        int deviceId = motionEvent.getDeviceId();
        if (this.f2422h == source && this.f2423i == deviceId && this.f2421g == i10) {
            return false;
        }
        this.f2417c.mo2891a(this.f2415a, this.f2424j, motionEvent, i10);
        this.f2422h = source;
        this.f2423i = deviceId;
        this.f2421g = i10;
        return true;
    }

    /* JADX INFO: renamed from: e */
    public final float m2903e(MotionEvent motionEvent, int i10) {
        if (this.f2419e == null) {
            this.f2419e = VelocityTracker.obtain();
        }
        return this.f2418d.mo2896a(this.f2419e, motionEvent, i10);
    }

    /* JADX INFO: renamed from: g */
    public void m2904g(MotionEvent motionEvent, int i10) {
        boolean zM2902d = m2902d(motionEvent, i10);
        if (this.f2424j[0] == Integer.MAX_VALUE) {
            VelocityTracker velocityTracker = this.f2419e;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f2419e = null;
                return;
            }
            return;
        }
        float fM2903e = m2903e(motionEvent, i10) * this.f2416b.mo2907b();
        float fSignum = Math.signum(fM2903e);
        if (zM2902d || (fSignum != Math.signum(this.f2420f) && fSignum != 0.0f)) {
            this.f2416b.mo2908c();
        }
        float fAbs = Math.abs(fM2903e);
        int[] iArr = this.f2424j;
        if (fAbs < iArr[0]) {
            return;
        }
        int i11 = iArr[1];
        float fMax = Math.max(-i11, Math.min(fM2903e, i11));
        this.f2420f = this.f2416b.mo2906a(fMax) ? fMax : 0.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C0603h(Context context, InterfaceC0606i interfaceC0606i, b bVar, a aVar) {
        this.f2421g = -1;
        this.f2422h = -1;
        this.f2423i = -1;
        this.f2424j = new int[]{Integer.MAX_VALUE, 0};
        this.f2415a = context;
        this.f2416b = interfaceC0606i;
        this.f2417c = bVar;
        this.f2418d = aVar;
    }
}
