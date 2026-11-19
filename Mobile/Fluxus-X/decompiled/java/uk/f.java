package uk;

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
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.OrientationEventListener;
import android.view.SurfaceView;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import bh.a1;
import com.github.luben.zstd.BuildConfig;
import com.google.mlkit.common.MlKitException;
import com.roblox.engine.jni.NativeInputInterface;
import com.roblox.platform.util.DeviceUtils;
import f4.v;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import ok.q;

/* JADX INFO: loaded from: classes2.dex */
public class f implements View.OnTouchListener, i.a, j.a, SensorEventListener {
    public static int[] F = {96, 97, 99, 100, 19, 20, 21, 22, 103, MlKitException.MODEL_HASH_MISMATCH, 106, 107, 109, 108};
    public static int[] G = {19, 20, 21, 22, 23, 4, 183, 184, 185, 186};
    public final Activity A;
    public InterfaceC0678f B;
    public boolean D;
    public VelocityTracker E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SurfaceView f33427a;
    public boolean b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public GestureDetector f33428c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public g f33429d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public i f33430e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public j f33431f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public SensorManager f33433h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Sensor f33434i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Sensor f33435j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public OrientationEventListener f33436k;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public InputManager f33450y;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public SparseArray<h> f33432g = new SparseArray<>();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f33437l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f33438m = 0.0f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f33439n = 0.0f;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f33440o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f33441p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f33442q = 1.0f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final float[] f33443r = new float[4];

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final float[] f33444s = new float[9];

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final float[] f33445t = new float[3];

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final float[] f33446u = new float[3];

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final float[] f33447v = new float[3];

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Set<Integer> f33448w = new HashSet();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Set<Integer> f33449x = new HashSet();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public InputManager.InputDeviceListener f33451z = null;
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
        */
        public boolean onKey(View view, int i10, KeyEvent keyEvent) {
            int source;
            boolean z10;
            boolean z11;
            boolean z12;
            int i11;
            int deviceId;
            InputDevice device = keyEvent.getDevice();
            if (device == null) {
                q.b("rbx.input", "Key event is from a disconnected device for keyCode: " + i10);
                return false;
            }
            if (i10 != 4) {
                if (i10 != 82) {
                    if (i10 != 96 && i10 != 97 && i10 != 99 && i10 != 100) {
                        switch (i10) {
                            default:
                                switch (i10) {
                                    default:
                                        switch (i10) {
                                            case 183:
                                            case 184:
                                            case 185:
                                            case 186:
                                                break;
                                            default:
                                                return false;
                                        }
                                    case MlKitException.MODEL_HASH_MISMATCH /* 102 */:
                                    case 103:
                                    case 104:
                                    case 105:
                                    case 106:
                                    case 107:
                                    case 108:
                                    case 109:
                                        source = keyEvent.getSource();
                                        if ((16778240 & source) != 0) {
                                            z10 = true;
                                        } else {
                                            z10 = false;
                                        }
                                        if (a1.t0() || (source & 33554944) == 0) {
                                            z11 = false;
                                        } else {
                                            z11 = true;
                                        }
                                        if (!z10 || z11) {
                                            z12 = true;
                                        } else {
                                            z12 = false;
                                        }
                                        i11 = keyEvent.getAction() == 0 ? 1 : 0;
                                        deviceId = keyEvent.getDeviceId();
                                        if (z10) {
                                            f.this.o(deviceId);
                                            NativeInputInterface.nativeGamepadButtonEvent(deviceId, i10, i11);
                                            return z12;
                                        }
                                        if (z11) {
                                            f.this.p(deviceId);
                                            NativeInputInterface.nativeTVRemoteButtonEvent(deviceId, i10, i11);
                                        }
                                        return z12;
                                }
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                                source = keyEvent.getSource();
                                if ((16778240 & source) != 0) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (a1.t0()) {
                                    z11 = false;
                                } else {
                                    z11 = false;
                                }
                                if (z10) {
                                    z12 = true;
                                } else {
                                    z12 = true;
                                }
                                if (keyEvent.getAction() == 0) {
                                }
                                deviceId = keyEvent.getDeviceId();
                                if (z10) {
                                    f.this.o(deviceId);
                                    NativeInputInterface.nativeGamepadButtonEvent(deviceId, i10, i11);
                                    return z12;
                                }
                                if (z11) {
                                    f.this.p(deviceId);
                                    NativeInputInterface.nativeTVRemoteButtonEvent(deviceId, i10, i11);
                                }
                                return z12;
                        }
                    }
                } else if ((device.getSources() & 50332689) == 50332689 && !device.hasKeys(108)[0]) {
                    i10 = 108;
                }
            }
            source = keyEvent.getSource();
            if ((16778240 & source) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (a1.t0()) {
                z11 = false;
            } else {
                z11 = false;
            }
            if (z10) {
                z12 = true;
            } else {
                z12 = true;
            }
            if (keyEvent.getAction() == 0) {
            }
            deviceId = keyEvent.getDeviceId();
            if (z10) {
                f.this.o(deviceId);
                NativeInputInterface.nativeGamepadButtonEvent(deviceId, i10, i11);
                return z12;
            }
            if (z11) {
                f.this.p(deviceId);
                NativeInputInterface.nativeTVRemoteButtonEvent(deviceId, i10, i11);
            }
            return z12;
        }
    }

    public class d implements View.OnCapturedPointerListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ SurfaceView f33455a;

        public d(SurfaceView surfaceView) {
            this.f33455a = surfaceView;
        }

        @Override // android.view.View.OnCapturedPointerListener
        public boolean onCapturedPointer(View view, MotionEvent motionEvent) {
            if (NativeInputInterface.nativeGetMainWindowIsMouseLockedCenter() || !this.f33455a.hasPointerCapture()) {
                return f.this.z(motionEvent);
            }
            this.f33455a.releasePointerCapture();
            return false;
        }
    }

    public class e implements View.OnGenericMotionListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float[] f33456a = new float[8];
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
            this.f33456a[0] = a(motionEvent, device, 0, i10);
            this.f33456a[1] = a(motionEvent, device, 1, i10);
            this.f33456a[2] = a(motionEvent, device, 11, i10);
            this.f33456a[3] = a(motionEvent, device, 14, i10);
            this.f33456a[4] = Math.max(a(motionEvent, device, 17, i10), a(motionEvent, device, 23, i10));
            this.f33456a[5] = Math.max(a(motionEvent, device, 18, i10), a(motionEvent, device, 22, i10));
            this.f33456a[6] = a(motionEvent, device, 15, i10);
            this.f33456a[7] = a(motionEvent, device, 16, i10);
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
                q.b("rbx.input", "Motion event is from a disconnected device");
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
                float[] fArr = this.f33456a;
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

    /* JADX INFO: renamed from: uk.f$f, reason: collision with other inner class name */
    public interface InterfaceC0678f {
        boolean b();
    }

    public final class g implements GestureDetector.OnGestureListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f33458a;
        public int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f33459c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f33460d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f33461e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f33462f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public VelocityTracker f33463g;

        public void a() {
            this.b = -1;
            VelocityTracker velocityTracker = this.f33463g;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f33463g = null;
            }
            f.this.f33441p = false;
            NativeInputInterface.nativePassPanGestureWithVelocity(2, this.f33459c, this.f33460d, this.f33461e, this.f33462f, 0.0f, 0.0f);
        }

        public void b(MotionEvent motionEvent) {
            if (bi.h.a().g0()) {
                this.b = -1;
                VelocityTracker velocityTracker = this.f33463g;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.f33463g = null;
                }
                f.this.f33441p = false;
                NativeInputInterface.nativePassPanGestureMultitouch(2, f.r(motionEvent, f.this.q()), this.f33461e, this.f33462f, 0.0f, 0.0f);
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
                int x5 = (int) (motionEvent2.getX() / fQ);
                int y10 = (int) (motionEvent2.getY() / fQ);
                int x10 = (int) (motionEvent.getX() / fQ);
                int y11 = (int) (motionEvent.getY() / fQ);
                float f12 = y10 - y11;
                float f13 = x5 - x10;
                if (Math.abs(f13) > Math.abs(f12)) {
                    if (Math.abs(f13) > 50.0f && Math.abs(f10) > 50.0f) {
                        if (f13 > 0.0f) {
                            f.this.C(x10, y11);
                        } else {
                            f.this.B(x10, y11);
                        }
                    }
                } else if (Math.abs(f12) > 50.0f && Math.abs(f11) > 50.0f) {
                    if (f12 > 0.0f) {
                        f.this.A(x10, y11);
                    } else {
                        f.this.D(x10, y11);
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
            this.f33458a = motionEvent.getPointerId(motionEvent.getActionIndex());
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
                    f.this.f33441p = true;
                } else {
                    z10 = false;
                }
                this.b = motionEvent2.getPointerId(motionEvent2.getActionIndex());
                float fQ = f.this.q();
                int i10 = this.f33459c;
                int i11 = this.f33460d;
                this.f33459c = (int) (motionEvent2.getX() / fQ);
                this.f33460d = (int) (motionEvent2.getY() / fQ);
                int x5 = (int) (motionEvent.getX() / fQ);
                int y10 = (int) (motionEvent.getY() / fQ);
                this.f33461e = this.f33459c - x5;
                this.f33462f = this.f33460d - y10;
                if ((motionEvent.getSource() & 8194) == 8194) {
                    if (z10) {
                        i10 = this.f33459c;
                        i11 = this.f33460d;
                    }
                    NativeInputInterface.nativePassMousePan(x5, y10, ((this.f33459c - i10) * 7.0f) / (f.this.f33427a.getWidth() / fQ), ((this.f33460d - i11) * 7.0f) / (f.this.f33427a.getHeight() / fQ));
                    return false;
                }
                if (z10) {
                    if (bi.h.a().g0()) {
                        NativeInputInterface.nativePassPanGestureMultitouch(0, f.r(motionEvent2, fQ), this.f33461e, this.f33462f, 0.0f, 0.0f);
                    } else {
                        NativeInputInterface.nativePassPanGestureWithVelocity(0, this.f33459c, this.f33460d, this.f33461e, this.f33462f, 0.0f, 0.0f);
                    }
                    if (this.f33463g == null) {
                        this.f33463g = VelocityTracker.obtain();
                    }
                    this.f33463g.addMovement(motionEvent2);
                } else {
                    VelocityTracker velocityTracker = this.f33463g;
                    if (velocityTracker != null) {
                        velocityTracker.addMovement(motionEvent2);
                        this.f33463g.computeCurrentVelocity(1000);
                        xVelocity = this.f33463g.getXVelocity() / fQ;
                        yVelocity = this.f33463g.getYVelocity() / fQ;
                    } else {
                        xVelocity = 0.0f;
                        yVelocity = 0.0f;
                    }
                    if (bi.h.a().g0()) {
                        NativeInputInterface.nativePassPanGestureMultitouch(1, f.r(motionEvent2, fQ), this.f33461e, this.f33462f, xVelocity, yVelocity);
                    } else {
                        NativeInputInterface.nativePassPanGestureWithVelocity(1, this.f33459c, this.f33460d, this.f33461e, this.f33462f, xVelocity, yVelocity);
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
            this.f33458a = -1;
            this.b = -1;
            this.f33459c = 0;
            this.f33460d = 0;
            this.f33461e = 0;
            this.f33462f = 0;
        }
    }

    public class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f33465a;
        public float b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f33466c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f33467d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f33468e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f33469f;

        public h() {
        }

        public int a() {
            return this.f33466c;
        }

        public float b() {
            return this.f33465a;
        }

        public float c() {
            return this.b;
        }

        public void d(int i10) {
            this.f33469f = this.f33466c;
            this.f33466c = i10;
        }

        public void e(float f10) {
            this.f33467d = this.f33465a;
            this.f33465a = f10;
        }

        public void f(float f10) {
            this.f33468e = this.b;
            this.b = f10;
        }
    }

    public f(@NonNull Activity activity, SurfaceView surfaceView, InterfaceC0678f interfaceC0678f) {
        this.f33427a = null;
        this.b = true;
        this.f33428c = null;
        this.f33429d = null;
        this.f33430e = null;
        this.f33431f = null;
        this.f33433h = null;
        this.f33434i = null;
        this.f33435j = null;
        this.f33436k = null;
        this.f33427a = surfaceView;
        this.A = activity;
        boolean zHasSystemFeature = activity.getPackageManager().hasSystemFeature("android.hardware.touchscreen");
        this.b = zHasSystemFeature;
        this.B = interfaceC0678f;
        if (zHasSystemFeature || !a1.q0()) {
            this.f33429d = new g();
            this.f33428c = new GestureDetector(activity, this.f33429d);
            this.f33430e = new i(this);
            this.f33431f = new j(this);
        }
        G(surfaceView);
        this.f33433h = (SensorManager) activity.getBaseContext().getSystemService("sensor");
        this.f33450y = (InputManager) activity.getBaseContext().getSystemService("input");
        v();
        this.f33434i = this.f33433h.getDefaultSensor(1);
        Sensor defaultSensor = this.f33433h.getDefaultSensor(11);
        this.f33435j = defaultSensor;
        if (defaultSensor != null) {
            NativeInputInterface.nativeSetGyroscopeEnabled(true);
        }
        if (this.f33434i != null) {
            NativeInputInterface.nativeSetAccelerometerEnabled(true);
        }
        a aVar = new a(activity, 3);
        this.f33436k = aVar;
        if (aVar.canDetectOrientation()) {
            this.f33436k.enable();
        }
        this.D = bi.h.a().w5();
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
        InputDevice inputDevice = this.f33450y.getInputDevice(i10);
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
        InputDevice inputDevice = this.f33450y.getInputDevice(i10);
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
        this.A.getWindow().getDecorView().getViewTreeObserver().addOnWindowFocusChangeListener(new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: uk.e
            @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
            public final void onWindowFocusChanged(boolean z10) {
                this.f33426a.w(surfaceView, z10);
            }
        });
        surfaceView.setOnGenericMotionListener(new e(surfaceView));
    }

    public void H(boolean z10) {
        if (!this.f33437l) {
            this.f33437l = z10;
        }
        if (this.f33437l) {
            this.f33433h.registerListener(this, this.f33435j, 1);
            this.f33433h.registerListener(this, this.f33434i, 1);
        }
    }

    public void I() {
        this.f33433h.unregisterListener(this);
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

    @Override // uk.i.a
    public void a(i iVar) {
        float fB = iVar.b();
        int iE = iVar.e();
        Point pointC = iVar.c();
        Point pointD = iVar.d();
        NativeInputInterface.nativePassRotateGesture(iE, fB, 0.0f, pointC.x, pointC.y, pointD.x, pointD.y);
    }

    @Override // uk.j.a
    public void b(j jVar) {
        Point pointA = jVar.a();
        Point pointB = jVar.b();
        float fC = jVar.c();
        int iD = jVar.d();
        float fQ = q();
        this.f33441p = true;
        if (iD == 0) {
            this.f33442q = 1.0f;
        }
        if (this.f33440o) {
            NativeInputInterface.nativePassMousePinch(pointA.x / fQ, pointA.y / fQ, (fC - this.f33442q) * 3.5f);
        } else {
            NativeInputInterface.nativePassPinchGesture(iD, fC, 0.0f, (int) (pointA.x / fQ), (int) (pointA.y / fQ), (int) (pointB.x / fQ), (int) (pointB.y / fQ));
        }
        this.f33442q = fC;
    }

    public final void o(int i10) {
        if (this.f33450y.getInputDevice(i10) == null) {
            q.b("rbx.input", "inputDevice is null for device ID: " + i10);
            return;
        }
        if (this.f33448w.add(Integer.valueOf(i10))) {
            InputDevice inputDevice = this.f33450y.getInputDevice(i10);
            int iX = x(inputDevice != null ? inputDevice.getName() : BuildConfig.FLAVOR);
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
            SensorManager.getQuaternionFromVector(this.f33443r, n(rotation, sensorEvent.values));
            SensorManager.getRotationMatrixFromVector(this.f33444s, this.f33443r);
            SensorManager.getOrientation(this.f33444s, this.f33445t);
            float[] fArr = this.f33445t;
            float f10 = fArr[0];
            float f11 = fArr[1];
            float f12 = fArr[2];
            float[] fArr2 = this.f33443r;
            NativeInputInterface.nativePassGyroscopeChange(f10, f11, f12, fArr2[0], fArr2[2], fArr2[3], fArr2[1]);
            return;
        }
        if (sensorEvent.sensor.getType() == 1) {
            float[] fArr3 = this.f33446u;
            float f13 = fArr3[0] * 0.8f;
            float[] fArr4 = sensorEvent.values;
            float f14 = f13 + (fArr4[0] * 0.19999999f);
            fArr3[0] = f14;
            float f15 = (fArr3[1] * 0.8f) + (fArr4[1] * 0.19999999f);
            fArr3[1] = f15;
            float f16 = (fArr3[2] * 0.8f) + (fArr4[2] * 0.19999999f);
            fArr3[2] = f16;
            float[] fArr5 = this.f33447v;
            fArr5[0] = fArr4[0] - f14;
            fArr5[1] = fArr4[1] - f15;
            fArr5[2] = fArr4[2] - f16;
            float[] fArrN = n(rotation, fArr5);
            float[] fArrN2 = n(rotation, this.f33446u);
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
        ?? B;
        InterfaceC0678f interfaceC0678f;
        VelocityTracker velocityTracker;
        h hVar;
        g gVar;
        float x5;
        float y10;
        g gVar2;
        InterfaceC0678f interfaceC0678f2;
        int historySize;
        int i12 = 0;
        boolean z10 = (motionEvent.getSource() & 8194) == 8194;
        boolean z11 = z10 && motionEvent.getToolType(0) == 1;
        this.f33440o = z11;
        if (z10 && !z11) {
            if (motionEvent.getButtonState() != 0) {
                return y(motionEvent);
            }
            int historySize2 = motionEvent.getHistorySize();
            if (historySize2 > 0) {
                float y11 = (motionEvent.getY() / q()) - (motionEvent.getHistoricalY(0, historySize2 - 1) / q());
                if (y11 != 0.0f) {
                    NativeInputInterface.nativePassMouseWheel(this.f33438m, this.f33439n, y11);
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
            if (bi.h.a().v2()) {
                view.requestUnbufferedDispatch(motionEvent);
            }
            h hVar2 = new h();
            float fQ = q();
            hVar2.e(motionEvent.getX(actionIndex) / fQ);
            hVar2.f(motionEvent.getY(actionIndex) / fQ);
            i10 = 0;
            hVar2.d(0);
            this.f33432g.put(pointerId, hVar2);
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
            hVar = this.f33432g.get(pointerId);
            this.f33441p = false;
            if (hVar == null) {
                float fQ3 = q();
                x5 = motionEvent.getX(actionIndex) / fQ3;
                y10 = motionEvent.getY(actionIndex) / fQ3;
                gVar2 = this.f33429d;
                if (pointerId == gVar2.f33458a) {
                    gVar2.f33458a = -1;
                    NativeInputInterface.nativePassLongPressGesture(2, x5, y10);
                } else if (pointerId == gVar2.b) {
                    if (bi.h.a().g0()) {
                        this.f33429d.b(motionEvent);
                    } else {
                        this.f33429d.a();
                    }
                }
            } else {
                hVar.d(2);
                gVar = this.f33429d;
                if (pointerId == gVar.f33458a) {
                    gVar.f33458a = -1;
                    NativeInputInterface.nativePassLongPressGesture(2, hVar.b(), hVar.c());
                } else if (pointerId == gVar.b) {
                    if (bi.h.a().g0()) {
                        this.f33429d.b(motionEvent);
                    } else {
                        this.f33429d.a();
                    }
                }
            }
            i10 = 0;
        } else if (actionMasked != 2) {
            if (actionMasked != 3) {
                if (actionMasked == 5) {
                    if (bi.h.a().v2()) {
                        view.requestUnbufferedDispatch(motionEvent);
                    }
                    h hVar3 = new h();
                    float fQ4 = q();
                    hVar3.e(motionEvent.getX(actionIndex) / fQ4);
                    hVar3.f(motionEvent.getY(actionIndex) / fQ4);
                    i10 = 0;
                    hVar3.d(0);
                    this.f33432g.put(pointerId, hVar3);
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
            hVar = this.f33432g.get(pointerId);
            this.f33441p = false;
            if (hVar == null) {
                float fQ6 = q();
                x5 = motionEvent.getX(actionIndex) / fQ6;
                y10 = motionEvent.getY(actionIndex) / fQ6;
                gVar2 = this.f33429d;
                if (pointerId == gVar2.f33458a) {
                    gVar2.f33458a = -1;
                    NativeInputInterface.nativePassLongPressGesture(2, x5, y10);
                } else if (pointerId == gVar2.b) {
                    if (bi.h.a().g0()) {
                        this.f33429d.b(motionEvent);
                    } else {
                        this.f33429d.a();
                    }
                }
            } else {
                hVar.d(2);
                gVar = this.f33429d;
                if (pointerId == gVar.f33458a) {
                    gVar.f33458a = -1;
                    NativeInputInterface.nativePassLongPressGesture(2, hVar.b(), hVar.c());
                } else if (pointerId == gVar.b) {
                    if (bi.h.a().g0()) {
                        this.f33429d.b(motionEvent);
                    } else {
                        this.f33429d.a();
                    }
                }
            }
            i10 = 0;
        } else {
            VelocityTracker velocityTracker2 = this.E;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
            }
            if (bi.h.a().c0() && !z10 && (interfaceC0678f2 = this.B) != null && interfaceC0678f2.b() && (historySize = motionEvent.getHistorySize()) > 0) {
                float fQ7 = q();
                int width = (int) (this.f33427a.getWidth() / fQ7);
                int height = (int) (this.f33427a.getHeight() / fQ7);
                int size = this.f33432g.size();
                int i13 = historySize * size;
                int[] iArr = new int[i13];
                float[] fArr = new float[i13 * 2];
                int i14 = 0;
                int i15 = 0;
                while (i14 < historySize) {
                    for (int i16 = i12; i16 < size; i16++) {
                        int iKeyAt = this.f33432g.keyAt(i16);
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
            for (int i18 = 0; i18 < this.f33432g.size(); i18++) {
                try {
                    int iKeyAt2 = this.f33432g.keyAt(i18);
                    int iFindPointerIndex2 = motionEvent.findPointerIndex(iKeyAt2);
                    h hVar4 = this.f33432g.get(iKeyAt2);
                    float fQ8 = q();
                    hVar4.e(motionEvent.getX(iFindPointerIndex2) / fQ8);
                    hVar4.f(motionEvent.getY(iFindPointerIndex2) / fQ8);
                    hVar4.d(1);
                    if (iKeyAt2 == this.f33429d.f33458a) {
                        NativeInputInterface.nativePassLongPressGesture(1, hVar4.b(), hVar4.c());
                    }
                } catch (IllegalArgumentException unused2) {
                }
            }
            i10 = 0;
        }
        this.C.clear();
        int size2 = this.f33432g.size();
        for (int i19 = i10; i19 < size2; i19++) {
            int iKeyAt3 = this.f33432g.keyAt(i19);
            h hVarValueAt = this.f33432g.valueAt(i19);
            if (hVarValueAt.a() == 2) {
                this.C.add(Integer.valueOf(iKeyAt3));
            } else {
                if (hVarValueAt.a() != hVarValueAt.f33469f ? !(hVarValueAt.a() != 1 || hVarValueAt.f33469f != 0 || hVarValueAt.b() != hVarValueAt.f33467d || hVarValueAt.c() != hVarValueAt.f33468e) : !(hVarValueAt.b() != hVarValueAt.f33467d || hVarValueAt.c() != hVarValueAt.f33468e)) {
                    i11 = i10;
                }
                if (bi.h.a().X0()) {
                    interfaceC0678f = this.B;
                    if (interfaceC0678f == null && interfaceC0678f.b()) {
                        B = 1;
                    } else {
                        B = i10;
                    }
                } else {
                    B = this.B.b();
                }
                if (i11 == 0 && B != 0) {
                    float fQ9 = q();
                    int width2 = (int) (this.f33427a.getWidth() / fQ9);
                    int height2 = (int) (this.f33427a.getHeight() / fQ9);
                    hVarValueAt.f33467d = hVarValueAt.b();
                    hVarValueAt.f33468e = hVarValueAt.c();
                    if (!z10) {
                        NativeInputInterface.nativePassInput(iKeyAt3, hVarValueAt.b(), hVarValueAt.c(), hVarValueAt.a(), width2, height2);
                    }
                } else if (B == 0) {
                    q.k("rbx.input", "nativePassInput not ready or already passed event");
                }
            }
            i11 = 1;
            if (bi.h.a().X0()) {
                interfaceC0678f = this.B;
                if (interfaceC0678f == null) {
                    B = i10;
                } else {
                    B = i10;
                }
            } else {
                B = this.B.b();
            }
            if (i11 == 0) {
                if (B == 0) {
                    q.k("rbx.input", "nativePassInput not ready or already passed event");
                }
            } else if (B == 0) {
                q.k("rbx.input", "nativePassInput not ready or already passed event");
            }
        }
        Iterator<Integer> it = this.C.iterator();
        while (it.hasNext()) {
            this.f33432g.remove(it.next().intValue());
        }
        this.f33431f.e(motionEvent);
        this.f33428c.onTouchEvent(motionEvent);
        this.f33430e.f(motionEvent);
        if (z10) {
            y(motionEvent);
        }
        return true;
    }

    public final void p(int i10) {
        if (this.f33450y.getInputDevice(i10) == null) {
            q.b("rbx.input", "inputDevice is null for device ID: " + i10);
            return;
        }
        if (this.f33449x.add(Integer.valueOf(i10))) {
            F(i10);
            NativeInputInterface.nativeTVRemoteConnectEvent(i10);
        }
    }

    public final float q() {
        return DeviceUtils.getScreenDensity(this.A);
    }

    public final void s(int i10) {
    }

    public final void t(int i10) {
    }

    public final void u(int i10) {
        if (this.f33448w.remove(Integer.valueOf(i10))) {
            E(i10, 0);
            NativeInputInterface.nativeGamepadDisconnectEvent(i10);
        }
        if (this.f33449x.remove(Integer.valueOf(i10))) {
            F(i10);
            NativeInputInterface.nativeTVRemoteDisconnectEvent(i10);
        }
    }

    public final void v() {
        b bVar = new b();
        this.f33451z = bVar;
        this.f33450y.registerInputDeviceListener(bVar, null);
    }

    public final /* synthetic */ void w(SurfaceView surfaceView, boolean z10) {
        if (z10) {
            if (!bi.h.a().Y1()) {
                surfaceView.requestFocus();
                return;
            }
            Activity activity = this.A;
            if ((activity instanceof v) && ((v) activity).l1().u0() == 0) {
                surfaceView.requestFocus();
            }
        }
    }

    public boolean y(MotionEvent motionEvent) {
        if (this.f33441p) {
            return true;
        }
        if (motionEvent.getActionMasked() == 7 || motionEvent.getActionMasked() == 2) {
            float x5 = motionEvent.getX() / q();
            float y10 = motionEvent.getY() / q();
            float f10 = x5 - this.f33438m;
            float f11 = y10 - this.f33439n;
            this.f33438m = x5;
            this.f33439n = y10;
            NativeInputInterface.nativePassMouseMove(x5, y10, f10, f11);
            return true;
        }
        if (motionEvent.getActionMasked() == 11) {
            NativeInputInterface.nativePassMouseButton(this.f33438m, this.f33439n, true, motionEvent.getActionButton() - 1);
            return true;
        }
        if (motionEvent.getActionMasked() == 12) {
            NativeInputInterface.nativePassMouseButton(this.f33438m, this.f33439n, false, motionEvent.getActionButton() - 1);
            return true;
        }
        if (motionEvent.getActionMasked() != 8) {
            return motionEvent.getActionMasked() == 0;
        }
        float f12 = this.f33438m;
        if (f12 <= 0.0f) {
            f12 = 0.0f;
        }
        float f13 = this.f33439n;
        NativeInputInterface.nativePassMouseWheel(f12, f13 > 0.0f ? f13 : 0.0f, motionEvent.getAxisValue(9));
        return true;
    }

    public boolean z(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 7 && motionEvent.getActionMasked() != 2) {
            return y(motionEvent);
        }
        float axisValue = motionEvent.getAxisValue(27) / q();
        float axisValue2 = motionEvent.getAxisValue(28) / q();
        if (!bi.h.a().J()) {
            this.f33438m += axisValue;
            this.f33439n += axisValue2;
        }
        NativeInputInterface.nativePassMouseMove(this.f33438m, this.f33439n, axisValue, axisValue2);
        return true;
    }
}
