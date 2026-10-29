package androidx.core.view;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f1862a;
    public final i b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f1863c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f1864d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public VelocityTracker f1865e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f1866f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f1867g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f1868h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f1869i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int[] f1870j;

    public interface a {
        float a(VelocityTracker velocityTracker, MotionEvent motionEvent, int i10);
    }

    public interface b {
        void a(Context context, int[] iArr, MotionEvent motionEvent, int i10);
    }

    public h(Context context, i iVar) {
        this(context, iVar, new b() { // from class: androidx.core.view.f
            @Override // androidx.core.view.h.b
            public final void a(Context context2, int[] iArr, MotionEvent motionEvent, int i10) {
                h.c(context2, iArr, motionEvent, i10);
            }
        }, new a() { // from class: androidx.core.view.g
            @Override // androidx.core.view.h.a
            public final float a(VelocityTracker velocityTracker, MotionEvent motionEvent, int i10) {
                return h.f(velocityTracker, motionEvent, i10);
            }
        });
    }

    public static void c(Context context, int[] iArr, MotionEvent motionEvent, int i10) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        iArr[0] = r0.g(context, viewConfiguration, motionEvent.getDeviceId(), i10, motionEvent.getSource());
        iArr[1] = r0.f(context, viewConfiguration, motionEvent.getDeviceId(), i10, motionEvent.getSource());
    }

    public static float f(VelocityTracker velocityTracker, MotionEvent motionEvent, int i10) {
        l0.a(velocityTracker, motionEvent);
        l0.b(velocityTracker, 1000);
        return l0.d(velocityTracker, i10);
    }

    public final boolean d(MotionEvent motionEvent, int i10) {
        int source = motionEvent.getSource();
        int deviceId = motionEvent.getDeviceId();
        if (this.f1868h == source && this.f1869i == deviceId && this.f1867g == i10) {
            return false;
        }
        this.f1863c.a(this.f1862a, this.f1870j, motionEvent, i10);
        this.f1868h = source;
        this.f1869i = deviceId;
        this.f1867g = i10;
        return true;
    }

    public final float e(MotionEvent motionEvent, int i10) {
        if (this.f1865e == null) {
            this.f1865e = VelocityTracker.obtain();
        }
        return this.f1864d.a(this.f1865e, motionEvent, i10);
    }

    public void g(MotionEvent motionEvent, int i10) {
        boolean zD = d(motionEvent, i10);
        if (this.f1870j[0] == Integer.MAX_VALUE) {
            VelocityTracker velocityTracker = this.f1865e;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f1865e = null;
                return;
            }
            return;
        }
        float fE = e(motionEvent, i10) * this.b.b();
        float fSignum = Math.signum(fE);
        if (zD || (fSignum != Math.signum(this.f1866f) && fSignum != 0.0f)) {
            this.b.c();
        }
        float fAbs = Math.abs(fE);
        int[] iArr = this.f1870j;
        if (fAbs < iArr[0]) {
            return;
        }
        int i11 = iArr[1];
        float fMax = Math.max(-i11, Math.min(fE, i11));
        this.f1866f = this.b.a(fMax) ? fMax : 0.0f;
    }

    public h(Context context, i iVar, b bVar, a aVar) {
        this.f1867g = -1;
        this.f1868h = -1;
        this.f1869i = -1;
        this.f1870j = new int[]{Integer.MAX_VALUE, 0};
        this.f1862a = context;
        this.b = iVar;
        this.f1863c = bVar;
        this.f1864d = aVar;
    }
}
