package mk;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.hardware.input.InputManager;
import android.util.SparseArray;
import android.view.GestureDetector;
import android.view.InputDevice;
import android.view.MotionEvent;
import android.view.OrientationEventListener;
import android.view.SurfaceView;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import com.roblox.engine.jni.NativeInputInterface;
import e4.q;
import gk.p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import sg.a1;

/* JADX INFO: loaded from: classes2.dex */
public class f implements View.OnTouchListener, i.a, j.a, SensorEventListener {
    public static int[] F = {96, 97, 99, 100, 19, 20, 21, 22, 103, 102, 106, 107, 109, 108};
    public static int[] G = {19, 20, 21, 22, 23, 4, 183, 184, 185, 186};
    public final Activity A;
    public InterfaceC0430f B;
    public boolean D;
    public VelocityTracker E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SurfaceView f24330a;
    public boolean b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public GestureDetector f24331c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public g f24332d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public i f24333e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public j f24334f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public SensorManager f24336h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Sensor f24337i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Sensor f24338j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public OrientationEventListener f24339k;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public InputManager f24353y;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public SparseArray<h> f24335g = new SparseArray<>();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f24340l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f24341m = 0.0f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f24342n = 0.0f;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f24343o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f24344p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f24345q = 1.0f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final float[] f24346r = new float[4];

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final float[] f24347s = new float[9];

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final float[] f24348t = new float[3];

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final float[] f24349u = new float[3];

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final float[] f24350v = new float[3];

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Set<Integer> f24351w = new HashSet();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Set<Integer> f24352x = new HashSet();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public InputManager.InputDeviceListener f24354z = null;
    public final List<Integer> C = new ArrayList();

    public class a extends OrientationEventListener {
        public a(Context context, int i10) {
            super(context, i10);
        }

        @Override // android.view.OrientationEventListener
        public void onOrientationChanged(int i10) {
            f.this.J();
        }
    }

    public class b implements InputManager.InputDeviceListener {
        public b() {
        }

        @Override // android.hardware.input.InputManager.InputDeviceListener
        public void onInputDeviceAdded(int i10) {
            f.this.s(i10);
        }

        @Override // android.hardware.input.InputManager.InputDeviceListener
        public void onInputDeviceChanged(int i10) {
            f.this.t(i10);
        }

        @Override // android.hardware.input.InputManager.InputDeviceListener
        public void onInputDeviceRemoved(int i10) {
            f.this.u(i10);
        }
    }

    public class c implements View.OnKeyListener {
        public c() {
        }

        /* JADX WARN: Code duplicated, block: B:29:0x005b A[FALL_THROUGH, PHI: r7
          0x005b: PHI (r7v1 int) = (r7v0 int), (r7v2 int), (r7v0 int), (r7v0 int), (r7v0 int), (r7v0 int), (r7v0 int), (r7v0 int), (r7v0 int) binds: [B:7:0x001f, B:27:0x0058, B:11:0x0027, B:13:0x002b, B:15:0x002f, B:17:0x0033, B:18:0x0035, B:19:0x0038, B:20:0x003b] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:31:0x0066  */
        /* JADX WARN: Code duplicated, block: B:32:0x0068  */
        /* JADX WARN: Code duplicated, block: B:35:0x006f  */
        /* JADX WARN: Code duplicated, block: B:38:0x0077  */
        /* JADX WARN: Code duplicated, block: B:40:0x007a A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:43:0x007f  */
        /* JADX WARN: Code duplicated, block: B:46:0x0086  */
        /* JADX WARN: Code duplicated, block: B:49:0x008d  */
        /* JADX WARN: Code duplicated, block: B:51:0x0096 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:52:0x0098  */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0058, code lost:
        
            if (r7 == 82) goto L28;
         */
        @Override // android.view.View.OnKeyListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean onKey(android.view.View r6, int r7, android.view.KeyEvent r8) {
            /*
                Method dump skipped, instruction units count: 208
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: mk.f.c.onKey(android.view.View, int, android.view.KeyEvent):boolean");
        }
    }

    public class d implements View.OnCapturedPointerListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ SurfaceView f24358a;

        public d(SurfaceView surfaceView) {
            this.f24358a = surfaceView;
        }

        @Override // android.view.View.OnCapturedPointerListener
        public boolean onCapturedPointer(View view, MotionEvent motionEvent) {
            if (NativeInputInterface.nativeGetMainWindowIsMouseLockedCenter() || !this.f24358a.hasPointerCapture()) {
                return f.this.z(motionEvent);
            }
            this.f24358a.releasePointerCapture();
            return false;
        }
    }

    public class e implements View.OnGenericMotionListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float[] f24359a = new float[8];
        public final /* synthetic */ SurfaceView b;

        public e(SurfaceView surfaceView) {
            this.b = surfaceView;
        }

        public final float a(MotionEvent motionEvent, InputDevice inputDevice, int i10, int i11) {
            InputDevice.MotionRange motionRange = inputDevice.getMotionRange(i10, motionEvent.getSource());
            if (motionRange == null) {
                return 0.0f;
            }
            float flat = motionRange.getFlat();
            float axisValue = i11 < 0 ? motionEvent.getAxisValue(i10) : motionEvent.getHistoricalAxisValue(i10, i11);
            if (Math.abs(axisValue) > flat) {
                return axisValue;
            }
            return 0.0f;
        }

        public final void b(MotionEvent motionEvent, int i10) {
            InputDevice device = motionEvent.getDevice();
            if (device == null) {
                return;
            }
            this.f24359a[0] = a(motionEvent, device, 0, i10);
            this.f24359a[1] = a(motionEvent, device, 1, i10);
            this.f24359a[2] = a(motionEvent, device, 11, i10);
            this.f24359a[3] = a(motionEvent, device, 14, i10);
            this.f24359a[4] = Math.max(a(motionEvent, device, 17, i10), a(motionEvent, device, 23, i10));
            this.f24359a[5] = Math.max(a(motionEvent, device, 18, i10), a(motionEvent, device, 22, i10));
            this.f24359a[6] = a(motionEvent, device, 15, i10);
            this.f24359a[7] = a(motionEvent, device, 16, i10);
        }

        @Override // android.view.View.OnGenericMotionListener
        public boolean onGenericMotion(View view, MotionEvent motionEvent) {
            if ((motionEvent.getSource() & 8194) == 8194 || (motionEvent.getSource() & 1048584) == 1048584) {
                if (!NativeInputInterface.nativeGetMainWindowIsMouseLockedCenter() || this.b.hasPointerCapture()) {
                    return f.this.y(motionEvent);
                }
                this.b.requestPointerCapture();
                return false;
            }
            if ((motionEvent.getSource() & 1025) != 1025 && (motionEvent.getSource() & 16777232) != 16777232) {
                return false;
            }
            if (motionEvent.getDevice() == null) {
                p.b("rbx.input", "Motion event is from a disconnected device");
                return false;
            }
            int historySize = motionEvent.getHistorySize();
            for (int i10 = 0; i10 < historySize; i10++) {
                b(motionEvent, i10);
            }
            b(motionEvent, -1);
            int deviceId = motionEvent.getDeviceId();
            f.this.o(deviceId);
            int i11 = 0;
            while (true) {
                float[] fArr = this.f24359a;
                if (i11 >= fArr.length) {
                    return true;
                }
                switch (i11) {
                    case 0:
                        NativeInputInterface.nativeGamepadAxisEvent(deviceId, 0, fArr[0], -fArr[1], 0.0f);
                        break;
                    case 1:
                        NativeInputInterface.nativeGamepadAxisEvent(deviceId, 1, fArr[0], -fArr[1], 0.0f);
                        break;
                    case 2:
                        NativeInputInterface.nativeGamepadAxisEvent(deviceId, 11, fArr[2], -fArr[3], 0.0f);
                        break;
                    case 3:
                        NativeInputInterface.nativeGamepadAxisEvent(deviceId, 14, fArr[2], -fArr[3], 0.0f);
                        break;
                    case 4:
                        NativeInputInterface.nativeGamepadAxisEvent(deviceId, 17, 0.0f, 0.0f, fArr[4]);
                        break;
                    case 5:
                        NativeInputInterface.nativeGamepadAxisEvent(deviceId, 18, 0.0f, 0.0f, fArr[5]);
                        break;
                    case 6:
                        NativeInputInterface.nativeGamepadAxisEvent(deviceId, 15, 0.0f, 0.0f, fArr[6]);
                        break;
                    case 7:
                        NativeInputInterface.nativeGamepadAxisEvent(deviceId, 16, 0.0f, 0.0f, -fArr[7]);
                        break;
                }
                i11++;
            }
        }
    }

    /* JADX INFO: renamed from: mk.f$f, reason: collision with other inner class name */
    public interface InterfaceC0430f {
        boolean b();
    }

    public final class g implements GestureDetector.OnGestureListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f24361a;
        public int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f24362c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f24363d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f24364e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f24365f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public VelocityTracker f24366g;

        public void a() {
            this.b = -1;
            VelocityTracker velocityTracker = this.f24366g;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f24366g = null;
            }
            f.this.f24344p = false;
            NativeInputInterface.nativePassPanGestureWithVelocity(2, this.f24362c, this.f24363d, this.f24364e, this.f24365f, 0.0f, 0.0f);
        }

        public void b(MotionEvent motionEvent) {
            if (th.h.a().a0()) {
                this.b = -1;
                VelocityTracker velocityTracker = this.f24366g;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.f24366g = null;
                }
                f.this.f24344p = false;
                NativeInputInterface.nativePassPanGestureMultitouch(2, f.r(motionEvent, f.this.q()), this.f24364e, this.f24365f, 0.0f, 0.0f);
            }
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            return false;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
            if (motionEvent == null || motionEvent2 == null || (motionEvent.getSource() & 8194) == 8194) {
                return false;
            }
            try {
                float fQ = f.this.q();
                int x10 = (int) (motionEvent2.getX() / fQ);
                int y10 = (int) (motionEvent2.getY() / fQ);
                int x11 = (int) (motionEvent.getX() / fQ);
                int y11 = (int) (motionEvent.getY() / fQ);
                float f12 = y10 - y11;
                float f13 = x10 - x11;
                if (Math.abs(f13) > Math.abs(f12)) {
                    if (Math.abs(f13) > 50.0f && Math.abs(f10) > 50.0f) {
                        if (f13 > 0.0f) {
                            f.this.C(x11, y11);
                        } else {
                            f.this.B(x11, y11);
                        }
                    }
                } else if (Math.abs(f12) > 50.0f && Math.abs(f11) > 50.0f) {
                    if (f12 > 0.0f) {
                        f.this.A(x11, y11);
                    } else {
                        f.this.D(x11, y11);
                    }
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            return false;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            if ((motionEvent.getSource() & 8194) == 8194) {
                return;
            }
            this.f24361a = motionEvent.getPointerId(motionEvent.getActionIndex());
            float fQ = f.this.q();
            NativeInputInterface.nativePassLongPressGesture(0, motionEvent.getX() / fQ, motionEvent.getY() / fQ);
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
            boolean z10;
            float xVelocity;
            float yVelocity;
            if (motionEvent != null && motionEvent2 != null) {
                if (this.b == -1) {
                    z10 = true;
                    f.this.f24344p = true;
                } else {
                    z10 = false;
                }
                this.b = motionEvent2.getPointerId(motionEvent2.getActionIndex());
                float fQ = f.this.q();
                int i10 = this.f24362c;
                int i11 = this.f24363d;
                this.f24362c = (int) (motionEvent2.getX() / fQ);
                this.f24363d = (int) (motionEvent2.getY() / fQ);
                int x10 = (int) (motionEvent.getX() / fQ);
                int y10 = (int) (motionEvent.getY() / fQ);
                this.f24364e = this.f24362c - x10;
                this.f24365f = this.f24363d - y10;
                if ((motionEvent.getSource() & 8194) == 8194) {
                    if (z10) {
                        i10 = this.f24362c;
                        i11 = this.f24363d;
                    }
                    NativeInputInterface.nativePassMousePan(x10, y10, ((this.f24362c - i10) * 7.0f) / (f.this.f24330a.getWidth() / fQ), ((this.f24363d - i11) * 7.0f) / (f.this.f24330a.getHeight() / fQ));
                    return false;
                }
                if (z10) {
                    if (th.h.a().a0()) {
                        NativeInputInterface.nativePassPanGestureMultitouch(0, f.r(motionEvent2, fQ), this.f24364e, this.f24365f, 0.0f, 0.0f);
                    } else {
                        NativeInputInterface.nativePassPanGestureWithVelocity(0, this.f24362c, this.f24363d, this.f24364e, this.f24365f, 0.0f, 0.0f);
                    }
                    if (this.f24366g == null) {
                        this.f24366g = VelocityTracker.obtain();
                    }
                    this.f24366g.addMovement(motionEvent2);
                } else {
                    VelocityTracker velocityTracker = this.f24366g;
                    if (velocityTracker != null) {
                        velocityTracker.addMovement(motionEvent2);
                        this.f24366g.computeCurrentVelocity(1000);
                        xVelocity = this.f24366g.getXVelocity() / fQ;
                        yVelocity = this.f24366g.getYVelocity() / fQ;
                    } else {
                        xVelocity = 0.0f;
                        yVelocity = 0.0f;
                    }
                    if (th.h.a().a0()) {
                        NativeInputInterface.nativePassPanGestureMultitouch(1, f.r(motionEvent2, fQ), this.f24364e, this.f24365f, xVelocity, yVelocity);
                    } else {
                        NativeInputInterface.nativePassPanGestureWithVelocity(1, this.f24362c, this.f24363d, this.f24364e, this.f24365f, xVelocity, yVelocity);
                    }
                }
            }
            return false;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public void onShowPress(MotionEvent motionEvent) {
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            if ((motionEvent.getSource() & 8194) == 8194) {
                return false;
            }
            float fQ = f.this.q();
            NativeInputInterface.nativePassTapGesture((int) (motionEvent.getX() / fQ), (int) (motionEvent.getY() / fQ));
            return false;
        }

        public g() {
            this.f24361a = -1;
            this.b = -1;
            this.f24362c = 0;
            this.f24363d = 0;
            this.f24364e = 0;
            this.f24365f = 0;
        }
    }

    public class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f24368a;
        public float b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f24369c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f24370d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f24371e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f24372f;

        public h() {
        }

        public int a() {
            return this.f24369c;
        }

        public float b() {
            return this.f24368a;
        }

        public float c() {
            return this.b;
        }

        public void d(int i10) {
            this.f24372f = this.f24369c;
            this.f24369c = i10;
        }

        public void e(float f10) {
            this.f24370d = this.f24368a;
            this.f24368a = f10;
        }

        public void f(float f10) {
            this.f24371e = this.b;
            this.b = f10;
        }
    }

    public f(@NonNull Activity activity, SurfaceView surfaceView, InterfaceC0430f interfaceC0430f) {
        this.f24330a = null;
        this.b = true;
        this.f24331c = null;
        this.f24332d = null;
        this.f24333e = null;
        this.f24334f = null;
        this.f24336h = null;
        this.f24337i = null;
        this.f24338j = null;
        this.f24339k = null;
        this.f24330a = surfaceView;
        this.A = activity;
        boolean zHasSystemFeature = activity.getPackageManager().hasSystemFeature("android.hardware.touchscreen");
        this.b = zHasSystemFeature;
        this.B = interfaceC0430f;
        if (zHasSystemFeature || !a1.q0()) {
            this.f24332d = new g();
            this.f24331c = new GestureDetector(activity, this.f24332d);
            this.f24333e = new i(this);
            this.f24334f = new j(this);
        }
        G(surfaceView);
        this.f24336h = (SensorManager) activity.getBaseContext().getSystemService("sensor");
        this.f24353y = (InputManager) activity.getBaseContext().getSystemService("input");
        v();
        this.f24337i = this.f24336h.getDefaultSensor(1);
        Sensor defaultSensor = this.f24336h.getDefaultSensor(11);
        this.f24338j = defaultSensor;
        if (defaultSensor != null) {
            NativeInputInterface.nativeSetGyroscopeEnabled(true);
        }
        if (this.f24337i != null) {
            NativeInputInterface.nativeSetAccelerometerEnabled(true);
        }
        a aVar = new a(activity, 3);
        this.f24339k = aVar;
        if (aVar.canDetectOrientation()) {
            this.f24339k.enable();
        }
        this.D = th.h.a().o5();
    }

    public static float[] n(int i10, float[] fArr) {
        int[] iArr = new int[][]{new int[]{1, -1, 0, 1}, new int[]{-1, -1, 1, 0}, new int[]{-1, 1, 0, 1}, new int[]{1, 1, 1, 0}}[i10];
        return new float[]{iArr[0] * fArr[iArr[2]], iArr[1] * fArr[iArr[3]], fArr[2]};
    }

    public static float[] r(MotionEvent motionEvent, float f10) {
        int pointerCount = motionEvent.getPointerCount();
        float[] fArr = new float[pointerCount * 2];
        for (int i10 = 0; i10 < pointerCount; i10++) {
            int i11 = i10 * 2;
            fArr[i11] = motionEvent.getX(i10) / f10;
            fArr[i11 + 1] = motionEvent.getY(i10) / f10;
        }
        return fArr;
    }

    public static int x(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }
        String upperCase = str.toUpperCase(Locale.ROOT);
        if (upperCase.contains("XBOX")) {
            return 3;
        }
        if (upperCase.contains("DUALSENSE") || upperCase.contains("PS5")) {
            return 2;
        }
        return (upperCase.contains("DUALSHOCK") || upperCase.contains("PS4") || upperCase.contains("PLAYSTATION")) ? 1 : 0;
    }

    public void A(int i10, int i11) {
        NativeInputInterface.nativePassSwipeGesture(1, i10, i11);
    }

    public void B(int i10, int i11) {
        NativeInputInterface.nativePassSwipeGesture(2, i10, i11);
    }

    public void C(int i10, int i11) {
        NativeInputInterface.nativePassSwipeGesture(0, i10, i11);
    }

    public void D(int i10, int i11) {
        NativeInputInterface.nativePassSwipeGesture(3, i10, i11);
    }

    public final void E(int i10, int i11) {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        boolean[] zArrHasKeys = new boolean[F.length];
        InputDevice inputDevice = this.f24353y.getInputDevice(i10);
        if (inputDevice != null) {
            zArrHasKeys = inputDevice.hasKeys(F);
        }
        for (int i12 = 0; i12 < zArrHasKeys.length; i12++) {
            map.put(Integer.valueOf(F[i12]), Boolean.valueOf(zArrHasKeys[i12]));
        }
        Boolean bool = Boolean.FALSE;
        map2.put(0, bool);
        map2.put(1, bool);
        map2.put(11, bool);
        map2.put(14, bool);
        map2.put(23, bool);
        map2.put(22, bool);
        map2.put(17, bool);
        map2.put(18, bool);
        map2.put(15, bool);
        map2.put(16, bool);
        InputDevice device = InputDevice.getDevice(i10);
        if (device != null) {
            Iterator<InputDevice.MotionRange> it = device.getMotionRanges().iterator();
            while (it.hasNext()) {
                map2.put(Integer.valueOf(it.next().getAxis()), Boolean.TRUE);
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            NativeInputInterface.nativeSetGamepadSupportedKeyWithGamepadType(i10, ((Integer) entry.getKey()).intValue(), ((Boolean) entry.getValue()).booleanValue(), i11);
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            Integer num = (Integer) entry2.getKey();
            Boolean bool2 = (Boolean) entry2.getValue();
            NativeInputInterface.nativeSetGamepadSupportedMotionWithGamepadType(i10, num.intValue(), -1, bool2.booleanValue(), i11);
            if (num.intValue() == 15 || num.intValue() == 16) {
                NativeInputInterface.nativeSetGamepadSupportedMotionWithGamepadType(i10, num.intValue(), 1, bool2.booleanValue(), i11);
            }
        }
    }

    public final void F(int i10) {
        boolean[] zArrHasKeys = new boolean[G.length];
        InputDevice inputDevice = this.f24353y.getInputDevice(i10);
        if (inputDevice != null) {
            zArrHasKeys = inputDevice.hasKeys(G);
        }
        for (int i11 = 0; i11 < zArrHasKeys.length; i11++) {
            NativeInputInterface.nativeSetTVRemoteSupportedKey(i10, G[i11], zArrHasKeys[i11]);
        }
    }

    public final void G(final SurfaceView surfaceView) {
        surfaceView.setOnKeyListener(new c());
        surfaceView.setOnCapturedPointerListener(new d(surfaceView));
        this.A.getWindow().getDecorView().getViewTreeObserver().addOnWindowFocusChangeListener(new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: mk.e
            @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
            public final void onWindowFocusChanged(boolean z10) {
                this.f24329a.w(surfaceView, z10);
            }
        });
        surfaceView.setOnGenericMotionListener(new e(surfaceView));
    }

    public void H(boolean z10) {
        if (!this.f24340l) {
            this.f24340l = z10;
        }
        if (this.f24340l) {
            this.f24336h.registerListener(this, this.f24338j, 1);
            this.f24336h.registerListener(this, this.f24337i, 1);
        }
    }

    public void I() {
        this.f24336h.unregisterListener(this);
    }

    public final void J() {
        Activity activity = this.A;
        if (activity == null) {
            return;
        }
        WindowManager windowManager = activity.getWindowManager();
        int rotation = windowManager.getDefaultDisplay().getRotation();
        int i10 = 0;
        Point point = new Point(0, 0);
        windowManager.getDefaultDisplay().getSize(point);
        if (point.x < point.y) {
            i10 = 3;
        } else if (rotation == 0 || rotation == 2 ? rotation != 2 : rotation != 3) {
            i10 = 1;
        }
        NativeInputInterface.nativeUpdateScreenOrientation(i10);
    }

    @Override // mk.i.a
    public void a(i iVar) {
        float fB = iVar.b();
        int iE = iVar.e();
        Point pointC = iVar.c();
        Point pointD = iVar.d();
        NativeInputInterface.nativePassRotateGesture(iE, fB, 0.0f, pointC.x, pointC.y, pointD.x, pointD.y);
    }

    @Override // mk.j.a
    public void b(j jVar) {
        Point pointA = jVar.a();
        Point pointB = jVar.b();
        float fC = jVar.c();
        int iD = jVar.d();
        float fQ = q();
        this.f24344p = true;
        if (iD == 0) {
            this.f24345q = 1.0f;
        }
        if (this.f24343o) {
            NativeInputInterface.nativePassMousePinch(pointA.x / fQ, pointA.y / fQ, (fC - this.f24345q) * 3.5f);
        } else {
            NativeInputInterface.nativePassPinchGesture(iD, fC, 0.0f, (int) (pointA.x / fQ), (int) (pointA.y / fQ), (int) (pointB.x / fQ), (int) (pointB.y / fQ));
        }
        this.f24345q = fC;
    }

    public final void o(int i10) {
        if (this.f24353y.getInputDevice(i10) == null) {
            p.b("rbx.input", "inputDevice is null for device ID: " + i10);
            return;
        }
        if (this.f24351w.add(Integer.valueOf(i10))) {
            InputDevice inputDevice = this.f24353y.getInputDevice(i10);
            int iX = x(inputDevice != null ? inputDevice.getName() : "");
            E(i10, iX);
            NativeInputInterface.nativeGamepadConnectEventWithGamepadType(i10, iX);
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i10) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        int rotation = ((WindowManager) this.A.getBaseContext().getSystemService("window")).getDefaultDisplay().getRotation();
        if (sensorEvent.sensor.getType() == 11) {
            SensorManager.getQuaternionFromVector(this.f24346r, n(rotation, sensorEvent.values));
            SensorManager.getRotationMatrixFromVector(this.f24347s, this.f24346r);
            SensorManager.getOrientation(this.f24347s, this.f24348t);
            float[] fArr = this.f24348t;
            float f10 = fArr[0];
            float f11 = fArr[1];
            float f12 = fArr[2];
            float[] fArr2 = this.f24346r;
            NativeInputInterface.nativePassGyroscopeChange(f10, f11, f12, fArr2[0], fArr2[2], fArr2[3], fArr2[1]);
            return;
        }
        if (sensorEvent.sensor.getType() == 1) {
            float[] fArr3 = this.f24349u;
            float f13 = fArr3[0] * 0.8f;
            float[] fArr4 = sensorEvent.values;
            float f14 = f13 + (fArr4[0] * 0.19999999f);
            fArr3[0] = f14;
            float f15 = (fArr3[1] * 0.8f) + (fArr4[1] * 0.19999999f);
            fArr3[1] = f15;
            float f16 = (fArr3[2] * 0.8f) + (fArr4[2] * 0.19999999f);
            fArr3[2] = f16;
            float[] fArr5 = this.f24350v;
            fArr5[0] = fArr4[0] - f14;
            fArr5[1] = fArr4[1] - f15;
            fArr5[2] = fArr4[2] - f16;
            float[] fArrN = n(rotation, fArr5);
            float[] fArrN2 = n(rotation, this.f24349u);
            NativeInputInterface.nativePassAccelerometerChange(-fArrN[1], fArrN[2], fArrN[0]);
            NativeInputInterface.nativePassGravityChange(-fArrN2[1], -fArrN2[2], fArrN2[0]);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:107:0x022a  */
    /* JADX WARN: Code duplicated, block: B:133:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:138:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:139:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:145:0x02f6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:146:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:166:0x02ff A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x014c  */
    /* JADX WARN: Code duplicated, block: B:75:0x0151  */
    /* JADX WARN: Code duplicated, block: B:78:0x0171  */
    /* JADX WARN: Code duplicated, block: B:81:0x0187  */
    /* JADX WARN: Code duplicated, block: B:83:0x019b  */
    /* JADX WARN: Code duplicated, block: B:84:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:86:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:88:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:89:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:90:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:92:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:93:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:95:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:97:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:98:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:99:0x01f1  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v30 */
    /* JADX WARN: Type inference failed for: r10v9 */
    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int i10;
        int i11;
        boolean zB;
        ?? r10;
        InterfaceC0430f interfaceC0430f;
        VelocityTracker velocityTracker;
        h hVar;
        g gVar;
        float x10;
        float y10;
        g gVar2;
        InterfaceC0430f interfaceC0430f2;
        int historySize;
        int i12 = 0;
        boolean z10 = (motionEvent.getSource() & 8194) == 8194;
        boolean z11 = z10 && motionEvent.getToolType(0) == 1;
        this.f24343o = z11;
        if (z10 && !z11) {
            if (motionEvent.getButtonState() != 0) {
                return y(motionEvent);
            }
            int historySize2 = motionEvent.getHistorySize();
            if (historySize2 > 0) {
                float y11 = (motionEvent.getY() / q()) - (motionEvent.getHistoricalY(0, historySize2 - 1) / q());
                if (y11 != 0.0f) {
                    NativeInputInterface.nativePassMouseWheel(this.f24341m, this.f24342n, y11);
                }
            }
            return true;
        }
        if (a1.q0() && !this.b) {
            return false;
        }
        int actionIndex = motionEvent.getActionIndex();
        int pointerId = motionEvent.getPointerId(actionIndex);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            if (th.h.a().j2()) {
                view.requestUnbufferedDispatch(motionEvent);
            }
            h hVar2 = new h();
            float fQ = q();
            hVar2.e(motionEvent.getX(actionIndex) / fQ);
            hVar2.f(motionEvent.getY(actionIndex) / fQ);
            i10 = 0;
            hVar2.d(0);
            this.f24335g.put(pointerId, hVar2);
            if (this.D && !z10) {
                if (this.E == null) {
                    this.E = VelocityTracker.obtain();
                }
                this.E.addMovement(motionEvent);
            }
        } else if (actionMasked == 1) {
            velocityTracker = this.E;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
                if (actionMasked != 3) {
                    this.E.computeCurrentVelocity(1000);
                    float fQ2 = q();
                    NativeInputInterface.nativePassTouchEndVelocity(pointerId, this.E.getXVelocity(pointerId) / fQ2, this.E.getYVelocity(pointerId) / fQ2);
                }
                if (actionMasked != 1 || actionMasked == 3) {
                    this.E.recycle();
                    this.E = null;
                }
            }
            hVar = this.f24335g.get(pointerId);
            this.f24344p = false;
            if (hVar == null) {
                float fQ3 = q();
                x10 = motionEvent.getX(actionIndex) / fQ3;
                y10 = motionEvent.getY(actionIndex) / fQ3;
                gVar2 = this.f24332d;
                if (pointerId == gVar2.f24361a) {
                    gVar2.f24361a = -1;
                    NativeInputInterface.nativePassLongPressGesture(2, x10, y10);
                } else if (pointerId == gVar2.b) {
                    if (th.h.a().a0()) {
                        this.f24332d.b(motionEvent);
                    } else {
                        this.f24332d.a();
                    }
                }
            } else {
                hVar.d(2);
                gVar = this.f24332d;
                if (pointerId == gVar.f24361a) {
                    gVar.f24361a = -1;
                    NativeInputInterface.nativePassLongPressGesture(2, hVar.b(), hVar.c());
                } else if (pointerId == gVar.b) {
                    if (th.h.a().a0()) {
                        this.f24332d.b(motionEvent);
                    } else {
                        this.f24332d.a();
                    }
                }
            }
            i10 = 0;
        } else if (actionMasked != 2) {
            if (actionMasked != 3) {
                if (actionMasked == 5) {
                    if (th.h.a().j2()) {
                        view.requestUnbufferedDispatch(motionEvent);
                    }
                    h hVar3 = new h();
                    float fQ4 = q();
                    hVar3.e(motionEvent.getX(actionIndex) / fQ4);
                    hVar3.f(motionEvent.getY(actionIndex) / fQ4);
                    i10 = 0;
                    hVar3.d(0);
                    this.f24335g.put(pointerId, hVar3);
                    if (this.D) {
                        if (this.E == null) {
                            this.E = VelocityTracker.obtain();
                        }
                        this.E.addMovement(motionEvent);
                    }
                } else if (actionMasked != 6) {
                    i10 = 0;
                }
            }
            velocityTracker = this.E;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
                if (actionMasked != 3) {
                    this.E.computeCurrentVelocity(1000);
                    float fQ5 = q();
                    NativeInputInterface.nativePassTouchEndVelocity(pointerId, this.E.getXVelocity(pointerId) / fQ5, this.E.getYVelocity(pointerId) / fQ5);
                }
                if (actionMasked != 1) {
                    this.E.recycle();
                    this.E = null;
                } else {
                    this.E.recycle();
                    this.E = null;
                }
            }
            hVar = this.f24335g.get(pointerId);
            this.f24344p = false;
            if (hVar == null) {
                float fQ6 = q();
                x10 = motionEvent.getX(actionIndex) / fQ6;
                y10 = motionEvent.getY(actionIndex) / fQ6;
                gVar2 = this.f24332d;
                if (pointerId == gVar2.f24361a) {
                    gVar2.f24361a = -1;
                    NativeInputInterface.nativePassLongPressGesture(2, x10, y10);
                } else if (pointerId == gVar2.b) {
                    if (th.h.a().a0()) {
                        this.f24332d.b(motionEvent);
                    } else {
                        this.f24332d.a();
                    }
                }
            } else {
                hVar.d(2);
                gVar = this.f24332d;
                if (pointerId == gVar.f24361a) {
                    gVar.f24361a = -1;
                    NativeInputInterface.nativePassLongPressGesture(2, hVar.b(), hVar.c());
                } else if (pointerId == gVar.b) {
                    if (th.h.a().a0()) {
                        this.f24332d.b(motionEvent);
                    } else {
                        this.f24332d.a();
                    }
                }
            }
            i10 = 0;
        } else {
            VelocityTracker velocityTracker2 = this.E;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
            }
            if (th.h.a().W() && !z10 && (interfaceC0430f2 = this.B) != null && interfaceC0430f2.b() && (historySize = motionEvent.getHistorySize()) > 0) {
                float fQ7 = q();
                int width = (int) (this.f24330a.getWidth() / fQ7);
                int height = (int) (this.f24330a.getHeight() / fQ7);
                int size = this.f24335g.size();
                int i13 = historySize * size;
                int[] iArr = new int[i13];
                float[] fArr = new float[i13 * 2];
                int i14 = 0;
                int i15 = 0;
                while (i14 < historySize) {
                    for (int i16 = i12; i16 < size; i16++) {
                        int iKeyAt = this.f24335g.keyAt(i16);
                        try {
                            int iFindPointerIndex = motionEvent.findPointerIndex(iKeyAt);
                            iArr[i15] = iKeyAt;
                            int i17 = i15 * 2;
                            fArr[i17] = motionEvent.getHistoricalX(iFindPointerIndex, i14) / fQ7;
                            fArr[i17 + 1] = motionEvent.getHistoricalY(iFindPointerIndex, i14) / fQ7;
                            i15++;
                        } catch (IllegalArgumentException unused) {
                        }
                    }
                    i14++;
                    i12 = 0;
                }
                if (i15 > 0) {
                    NativeInputInterface.nativePassInputBatch(iArr, fArr, i15, 1, width, height);
                }
            }
            for (int i18 = 0; i18 < this.f24335g.size(); i18++) {
                try {
                    int iKeyAt2 = this.f24335g.keyAt(i18);
                    int iFindPointerIndex2 = motionEvent.findPointerIndex(iKeyAt2);
                    h hVar4 = this.f24335g.get(iKeyAt2);
                    float fQ8 = q();
                    hVar4.e(motionEvent.getX(iFindPointerIndex2) / fQ8);
                    hVar4.f(motionEvent.getY(iFindPointerIndex2) / fQ8);
                    hVar4.d(1);
                    if (iKeyAt2 == this.f24332d.f24361a) {
                        NativeInputInterface.nativePassLongPressGesture(1, hVar4.b(), hVar4.c());
                    }
                } catch (IllegalArgumentException unused2) {
                }
            }
            i10 = 0;
        }
        this.C.clear();
        int size2 = this.f24335g.size();
        for (int i19 = i10; i19 < size2; i19++) {
            int iKeyAt3 = this.f24335g.keyAt(i19);
            h hVarValueAt = this.f24335g.valueAt(i19);
            if (hVarValueAt.a() == 2) {
                this.C.add(Integer.valueOf(iKeyAt3));
            } else {
                if (hVarValueAt.a() != hVarValueAt.f24372f ? !(hVarValueAt.a() != 1 || hVarValueAt.f24372f != 0 || hVarValueAt.b() != hVarValueAt.f24370d || hVarValueAt.c() != hVarValueAt.f24371e) : !(hVarValueAt.b() != hVarValueAt.f24370d || hVarValueAt.c() != hVarValueAt.f24371e)) {
                    i11 = i10;
                }
                if (th.h.a().O0()) {
                    interfaceC0430f = this.B;
                    if (interfaceC0430f == null && interfaceC0430f.b()) {
                        r10 = 1;
                    } else {
                        r10 = i10;
                    }
                } else {
                    zB = this.B.b();
                }
                if (i11 == 0 && r10 != 0) {
                    float fQ9 = q();
                    int width2 = (int) (this.f24330a.getWidth() / fQ9);
                    int height2 = (int) (this.f24330a.getHeight() / fQ9);
                    hVarValueAt.f24370d = hVarValueAt.b();
                    hVarValueAt.f24371e = hVarValueAt.c();
                    if (!z10) {
                        NativeInputInterface.nativePassInput(iKeyAt3, hVarValueAt.b(), hVarValueAt.c(), hVarValueAt.a(), width2, height2);
                    }
                } else if (r10 == 0) {
                    p.k("rbx.input", "nativePassInput not ready or already passed event");
                }
            }
            i11 = 1;
            if (th.h.a().O0()) {
                interfaceC0430f = this.B;
                if (interfaceC0430f == null) {
                    r10 = i10;
                } else {
                    r10 = i10;
                }
            } else {
                zB = this.B.b();
            }
            if (i11 == 0) {
                if (r10 == 0) {
                    p.k("rbx.input", "nativePassInput not ready or already passed event");
                }
            } else if (r10 == 0) {
                p.k("rbx.input", "nativePassInput not ready or already passed event");
            }
        }
        Iterator<Integer> it = this.C.iterator();
        while (it.hasNext()) {
            this.f24335g.remove(it.next().intValue());
        }
        this.f24334f.e(motionEvent);
        this.f24331c.onTouchEvent(motionEvent);
        this.f24333e.f(motionEvent);
        if (z10) {
            y(motionEvent);
        }
        return true;
    }

    public final void p(int i10) {
        if (this.f24353y.getInputDevice(i10) == null) {
            p.b("rbx.input", "inputDevice is null for device ID: " + i10);
            return;
        }
        if (this.f24352x.add(Integer.valueOf(i10))) {
            F(i10);
            NativeInputInterface.nativeTVRemoteConnectEvent(i10);
        }
    }

    public final float q() {
        return el.a.e(this.A);
    }

    public final void s(int i10) {
    }

    public final void t(int i10) {
    }

    public final void u(int i10) {
        if (this.f24351w.remove(Integer.valueOf(i10))) {
            E(i10, 0);
            NativeInputInterface.nativeGamepadDisconnectEvent(i10);
        }
        if (this.f24352x.remove(Integer.valueOf(i10))) {
            F(i10);
            NativeInputInterface.nativeTVRemoteDisconnectEvent(i10);
        }
    }

    public final void v() {
        b bVar = new b();
        this.f24354z = bVar;
        this.f24353y.registerInputDeviceListener(bVar, null);
    }

    public final /* synthetic */ void w(SurfaceView surfaceView, boolean z10) {
        if (z10) {
            if (!th.h.a().O1()) {
                surfaceView.requestFocus();
                return;
            }
            Activity activity = this.A;
            if ((activity instanceof q) && ((q) activity).l1().u0() == 0) {
                surfaceView.requestFocus();
            }
        }
    }

    public boolean y(MotionEvent motionEvent) {
        if (this.f24344p) {
            return true;
        }
        if (motionEvent.getActionMasked() == 7 || motionEvent.getActionMasked() == 2) {
            float x10 = motionEvent.getX() / q();
            float y10 = motionEvent.getY() / q();
            float f10 = x10 - this.f24341m;
            float f11 = y10 - this.f24342n;
            this.f24341m = x10;
            this.f24342n = y10;
            NativeInputInterface.nativePassMouseMove(x10, y10, f10, f11);
            return true;
        }
        if (motionEvent.getActionMasked() == 11) {
            NativeInputInterface.nativePassMouseButton(this.f24341m, this.f24342n, true, motionEvent.getActionButton() - 1);
            return true;
        }
        if (motionEvent.getActionMasked() == 12) {
            NativeInputInterface.nativePassMouseButton(this.f24341m, this.f24342n, false, motionEvent.getActionButton() - 1);
            return true;
        }
        if (motionEvent.getActionMasked() != 8) {
            return motionEvent.getActionMasked() == 0;
        }
        float f12 = this.f24341m;
        if (f12 <= 0.0f) {
            f12 = 0.0f;
        }
        float f13 = this.f24342n;
        NativeInputInterface.nativePassMouseWheel(f12, f13 > 0.0f ? f13 : 0.0f, motionEvent.getAxisValue(9));
        return true;
    }

    public boolean z(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 7 && motionEvent.getActionMasked() != 2) {
            return y(motionEvent);
        }
        float axisValue = motionEvent.getAxisValue(27) / q();
        float axisValue2 = motionEvent.getAxisValue(28) / q();
        if (!th.h.a().H()) {
            this.f24341m += axisValue;
            this.f24342n += axisValue2;
        }
        NativeInputInterface.nativePassMouseMove(this.f24341m, this.f24342n, axisValue, axisValue2);
        return true;
    }
}
