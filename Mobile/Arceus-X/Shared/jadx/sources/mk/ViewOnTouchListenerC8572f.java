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
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.OrientationEventListener;
import android.view.SurfaceView;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import androidx.core.view.InputDeviceCompat;
import com.roblox.engine.jni.NativeInputInterface;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import p093e4.ActivityC4831q;
import p107el.C5160a;
import p151gk.C6124q;
import sg.C11295a1;
import th.C11659h;

/* JADX INFO: renamed from: mk.f */
/* JADX INFO: loaded from: classes2.dex */
public class ViewOnTouchListenerC8572f implements View.OnTouchListener, C8575i.a, C8576j.a, SensorEventListener {

    /* JADX INFO: renamed from: F */
    public static int[] f31433F = {96, 97, 99, 100, 19, 20, 21, 22, 103, 102, 106, 107, 109, 108};

    /* JADX INFO: renamed from: G */
    public static int[] f31434G = {19, 20, 21, 22, 23, 4, 183, 184, 185, 186};

    /* JADX INFO: renamed from: A */
    public final Activity f31435A;

    /* JADX INFO: renamed from: B */
    public f f31436B;

    /* JADX INFO: renamed from: D */
    public boolean f31438D;

    /* JADX INFO: renamed from: E */
    public VelocityTracker f31439E;

    /* JADX INFO: renamed from: a */
    public SurfaceView f31440a;

    /* JADX INFO: renamed from: b */
    public boolean f31441b;

    /* JADX INFO: renamed from: c */
    public GestureDetector f31442c;

    /* JADX INFO: renamed from: d */
    public g f31443d;

    /* JADX INFO: renamed from: e */
    public C8575i f31444e;

    /* JADX INFO: renamed from: f */
    public C8576j f31445f;

    /* JADX INFO: renamed from: h */
    public SensorManager f31447h;

    /* JADX INFO: renamed from: i */
    public Sensor f31448i;

    /* JADX INFO: renamed from: j */
    public Sensor f31449j;

    /* JADX INFO: renamed from: k */
    public OrientationEventListener f31450k;

    /* JADX INFO: renamed from: y */
    public InputManager f31464y;

    /* JADX INFO: renamed from: g */
    public SparseArray<h> f31446g = new SparseArray<>();

    /* JADX INFO: renamed from: l */
    public boolean f31451l = false;

    /* JADX INFO: renamed from: m */
    public float f31452m = 0.0f;

    /* JADX INFO: renamed from: n */
    public float f31453n = 0.0f;

    /* JADX INFO: renamed from: o */
    public boolean f31454o = false;

    /* JADX INFO: renamed from: p */
    public boolean f31455p = false;

    /* JADX INFO: renamed from: q */
    public float f31456q = 1.0f;

    /* JADX INFO: renamed from: r */
    public final float[] f31457r = new float[4];

    /* JADX INFO: renamed from: s */
    public final float[] f31458s = new float[9];

    /* JADX INFO: renamed from: t */
    public final float[] f31459t = new float[3];

    /* JADX INFO: renamed from: u */
    public final float[] f31460u = new float[3];

    /* JADX INFO: renamed from: v */
    public final float[] f31461v = new float[3];

    /* JADX INFO: renamed from: w */
    public final Set<Integer> f31462w = new HashSet();

    /* JADX INFO: renamed from: x */
    public final Set<Integer> f31463x = new HashSet();

    /* JADX INFO: renamed from: z */
    public InputManager.InputDeviceListener f31465z = null;

    /* JADX INFO: renamed from: C */
    public final List<Integer> f31437C = new ArrayList();

    /* JADX INFO: renamed from: mk.f$a */
    public class a extends OrientationEventListener {
        public a(Context context, int i10) {
            super(context, i10);
        }

        @Override // android.view.OrientationEventListener
        public void onOrientationChanged(int i10) {
            ViewOnTouchListenerC8572f.this.m34558J();
        }
    }

    /* JADX INFO: renamed from: mk.f$b */
    public class b implements InputManager.InputDeviceListener {
        public b() {
        }

        @Override // android.hardware.input.InputManager.InputDeviceListener
        public void onInputDeviceAdded(int i10) {
            ViewOnTouchListenerC8572f.this.m34564s(i10);
        }

        @Override // android.hardware.input.InputManager.InputDeviceListener
        public void onInputDeviceChanged(int i10) {
            ViewOnTouchListenerC8572f.this.m34565t(i10);
        }

        @Override // android.hardware.input.InputManager.InputDeviceListener
        public void onInputDeviceRemoved(int i10) {
            ViewOnTouchListenerC8572f.this.m34566u(i10);
        }
    }

    /* JADX INFO: renamed from: mk.f$c */
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
                C6124q.m27057b("rbx.input", "Key event is from a disconnected device for keyCode: " + i10);
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
                                    case 102:
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
                                        if (C11295a1.m42477t0() || (source & 33554944) == 0) {
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
                                            ViewOnTouchListenerC8572f.this.m34561o(deviceId);
                                            NativeInputInterface.nativeGamepadButtonEvent(deviceId, i10, i11);
                                            return z12;
                                        }
                                        if (z11) {
                                            ViewOnTouchListenerC8572f.this.m34562p(deviceId);
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
                                if (C11295a1.m42477t0()) {
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
                                    ViewOnTouchListenerC8572f.this.m34561o(deviceId);
                                    NativeInputInterface.nativeGamepadButtonEvent(deviceId, i10, i11);
                                    return z12;
                                }
                                if (z11) {
                                    ViewOnTouchListenerC8572f.this.m34562p(deviceId);
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
            if (C11295a1.m42477t0()) {
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
                ViewOnTouchListenerC8572f.this.m34561o(deviceId);
                NativeInputInterface.nativeGamepadButtonEvent(deviceId, i10, i11);
                return z12;
            }
            if (z11) {
                ViewOnTouchListenerC8572f.this.m34562p(deviceId);
                NativeInputInterface.nativeTVRemoteButtonEvent(deviceId, i10, i11);
            }
            return z12;
        }
    }

    /* JADX INFO: renamed from: mk.f$d */
    public class d implements View.OnCapturedPointerListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ SurfaceView f31469a;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public d(SurfaceView surfaceView) {
            this.f31469a = surfaceView;
        }

        @Override // android.view.View.OnCapturedPointerListener
        public boolean onCapturedPointer(View view, MotionEvent motionEvent) {
            if (NativeInputInterface.nativeGetMainWindowIsMouseLockedCenter() || !this.f31469a.hasPointerCapture()) {
                return ViewOnTouchListenerC8572f.this.m34570z(motionEvent);
            }
            this.f31469a.releasePointerCapture();
            return false;
        }
    }

    /* JADX INFO: renamed from: mk.f$e */
    public class e implements View.OnGenericMotionListener {

        /* JADX INFO: renamed from: a */
        public float[] f31471a = new float[8];

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ SurfaceView f31472b;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public e(SurfaceView surfaceView) {
            this.f31472b = surfaceView;
        }

        /* JADX INFO: renamed from: a */
        public final float m34571a(MotionEvent motionEvent, InputDevice inputDevice, int i10, int i11) {
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

        /* JADX INFO: renamed from: b */
        public final void m34572b(MotionEvent motionEvent, int i10) {
            InputDevice device = motionEvent.getDevice();
            if (device == null) {
                return;
            }
            this.f31471a[0] = m34571a(motionEvent, device, 0, i10);
            this.f31471a[1] = m34571a(motionEvent, device, 1, i10);
            this.f31471a[2] = m34571a(motionEvent, device, 11, i10);
            this.f31471a[3] = m34571a(motionEvent, device, 14, i10);
            this.f31471a[4] = Math.max(m34571a(motionEvent, device, 17, i10), m34571a(motionEvent, device, 23, i10));
            this.f31471a[5] = Math.max(m34571a(motionEvent, device, 18, i10), m34571a(motionEvent, device, 22, i10));
            this.f31471a[6] = m34571a(motionEvent, device, 15, i10);
            this.f31471a[7] = m34571a(motionEvent, device, 16, i10);
        }

        @Override // android.view.View.OnGenericMotionListener
        public boolean onGenericMotion(View view, MotionEvent motionEvent) {
            if ((motionEvent.getSource() & InputDeviceCompat.SOURCE_MOUSE) == 8194 || (motionEvent.getSource() & InputDeviceCompat.SOURCE_TOUCHPAD) == 1048584) {
                if (!NativeInputInterface.nativeGetMainWindowIsMouseLockedCenter() || this.f31472b.hasPointerCapture()) {
                    return ViewOnTouchListenerC8572f.this.m34569y(motionEvent);
                }
                this.f31472b.requestPointerCapture();
                return false;
            }
            if ((motionEvent.getSource() & InputDeviceCompat.SOURCE_GAMEPAD) != 1025 && (motionEvent.getSource() & InputDeviceCompat.SOURCE_JOYSTICK) != 16777232) {
                return false;
            }
            if (motionEvent.getDevice() == null) {
                C6124q.m27057b("rbx.input", "Motion event is from a disconnected device");
                return false;
            }
            int historySize = motionEvent.getHistorySize();
            for (int i10 = 0; i10 < historySize; i10++) {
                m34572b(motionEvent, i10);
            }
            m34572b(motionEvent, -1);
            int deviceId = motionEvent.getDeviceId();
            ViewOnTouchListenerC8572f.this.m34561o(deviceId);
            int i11 = 0;
            while (true) {
                float[] fArr = this.f31471a;
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

    /* JADX INFO: renamed from: mk.f$f */
    public interface f {
        /* JADX INFO: renamed from: b */
        boolean mo1325b();
    }

    /* JADX INFO: renamed from: mk.f$g */
    public final class g implements GestureDetector.OnGestureListener {

        /* JADX INFO: renamed from: a */
        public int f31474a;

        /* JADX INFO: renamed from: b */
        public int f31475b;

        /* JADX INFO: renamed from: c */
        public int f31476c;

        /* JADX INFO: renamed from: d */
        public int f31477d;

        /* JADX INFO: renamed from: e */
        public int f31478e;

        /* JADX INFO: renamed from: f */
        public int f31479f;

        /* JADX INFO: renamed from: g */
        public VelocityTracker f31480g;

        /* JADX INFO: renamed from: a */
        public void m34573a() {
            this.f31475b = -1;
            VelocityTracker velocityTracker = this.f31480g;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f31480g = null;
            }
            ViewOnTouchListenerC8572f.this.f31455p = false;
            NativeInputInterface.nativePassPanGestureWithVelocity(2, this.f31476c, this.f31477d, this.f31478e, this.f31479f, 0.0f, 0.0f);
        }

        /* JADX INFO: renamed from: b */
        public void m34574b(MotionEvent motionEvent) {
            if (C11659h.m43403a().mo43617e0()) {
                this.f31475b = -1;
                VelocityTracker velocityTracker = this.f31480g;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.f31480g = null;
                }
                ViewOnTouchListenerC8572f.this.f31455p = false;
                NativeInputInterface.nativePassPanGestureMultitouch(2, ViewOnTouchListenerC8572f.m34547r(motionEvent, ViewOnTouchListenerC8572f.this.m34563q()), this.f31478e, this.f31479f, 0.0f, 0.0f);
            }
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            return false;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
            if (motionEvent == null || motionEvent2 == null || (motionEvent.getSource() & InputDeviceCompat.SOURCE_MOUSE) == 8194) {
                return false;
            }
            try {
                float fM34563q = ViewOnTouchListenerC8572f.this.m34563q();
                int x10 = (int) (motionEvent2.getX() / fM34563q);
                int y10 = (int) (motionEvent2.getY() / fM34563q);
                int x11 = (int) (motionEvent.getX() / fM34563q);
                int y11 = (int) (motionEvent.getY() / fM34563q);
                float f12 = y10 - y11;
                float f13 = x10 - x11;
                if (Math.abs(f13) > Math.abs(f12)) {
                    if (Math.abs(f13) > 50.0f && Math.abs(f10) > 50.0f) {
                        if (f13 > 0.0f) {
                            ViewOnTouchListenerC8572f.this.m34551C(x11, y11);
                        } else {
                            ViewOnTouchListenerC8572f.this.m34550B(x11, y11);
                        }
                    }
                } else if (Math.abs(f12) > 50.0f && Math.abs(f11) > 50.0f) {
                    if (f12 > 0.0f) {
                        ViewOnTouchListenerC8572f.this.m34549A(x11, y11);
                    } else {
                        ViewOnTouchListenerC8572f.this.m34552D(x11, y11);
                    }
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            return false;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            if ((motionEvent.getSource() & InputDeviceCompat.SOURCE_MOUSE) == 8194) {
                return;
            }
            this.f31474a = motionEvent.getPointerId(motionEvent.getActionIndex());
            float fM34563q = ViewOnTouchListenerC8572f.this.m34563q();
            NativeInputInterface.nativePassLongPressGesture(0, motionEvent.getX() / fM34563q, motionEvent.getY() / fM34563q);
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
            boolean z10;
            float xVelocity;
            float yVelocity;
            if (motionEvent != null && motionEvent2 != null) {
                if (this.f31475b == -1) {
                    z10 = true;
                    ViewOnTouchListenerC8572f.this.f31455p = true;
                } else {
                    z10 = false;
                }
                this.f31475b = motionEvent2.getPointerId(motionEvent2.getActionIndex());
                float fM34563q = ViewOnTouchListenerC8572f.this.m34563q();
                int i10 = this.f31476c;
                int i11 = this.f31477d;
                this.f31476c = (int) (motionEvent2.getX() / fM34563q);
                this.f31477d = (int) (motionEvent2.getY() / fM34563q);
                int x10 = (int) (motionEvent.getX() / fM34563q);
                int y10 = (int) (motionEvent.getY() / fM34563q);
                this.f31478e = this.f31476c - x10;
                this.f31479f = this.f31477d - y10;
                if ((motionEvent.getSource() & InputDeviceCompat.SOURCE_MOUSE) == 8194) {
                    if (z10) {
                        i10 = this.f31476c;
                        i11 = this.f31477d;
                    }
                    NativeInputInterface.nativePassMousePan(x10, y10, ((this.f31476c - i10) * 7.0f) / (ViewOnTouchListenerC8572f.this.f31440a.getWidth() / fM34563q), ((this.f31477d - i11) * 7.0f) / (ViewOnTouchListenerC8572f.this.f31440a.getHeight() / fM34563q));
                    return false;
                }
                if (z10) {
                    if (C11659h.m43403a().mo43617e0()) {
                        NativeInputInterface.nativePassPanGestureMultitouch(0, ViewOnTouchListenerC8572f.m34547r(motionEvent2, fM34563q), this.f31478e, this.f31479f, 0.0f, 0.0f);
                    } else {
                        NativeInputInterface.nativePassPanGestureWithVelocity(0, this.f31476c, this.f31477d, this.f31478e, this.f31479f, 0.0f, 0.0f);
                    }
                    if (this.f31480g == null) {
                        this.f31480g = VelocityTracker.obtain();
                    }
                    this.f31480g.addMovement(motionEvent2);
                } else {
                    VelocityTracker velocityTracker = this.f31480g;
                    if (velocityTracker != null) {
                        velocityTracker.addMovement(motionEvent2);
                        this.f31480g.computeCurrentVelocity(1000);
                        xVelocity = this.f31480g.getXVelocity() / fM34563q;
                        yVelocity = this.f31480g.getYVelocity() / fM34563q;
                    } else {
                        xVelocity = 0.0f;
                        yVelocity = 0.0f;
                    }
                    if (C11659h.m43403a().mo43617e0()) {
                        NativeInputInterface.nativePassPanGestureMultitouch(1, ViewOnTouchListenerC8572f.m34547r(motionEvent2, fM34563q), this.f31478e, this.f31479f, xVelocity, yVelocity);
                    } else {
                        NativeInputInterface.nativePassPanGestureWithVelocity(1, this.f31476c, this.f31477d, this.f31478e, this.f31479f, xVelocity, yVelocity);
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
            if ((motionEvent.getSource() & InputDeviceCompat.SOURCE_MOUSE) == 8194) {
                return false;
            }
            float fM34563q = ViewOnTouchListenerC8572f.this.m34563q();
            NativeInputInterface.nativePassTapGesture((int) (motionEvent.getX() / fM34563q), (int) (motionEvent.getY() / fM34563q));
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public g() {
            this.f31474a = -1;
            this.f31475b = -1;
            this.f31476c = 0;
            this.f31477d = 0;
            this.f31478e = 0;
            this.f31479f = 0;
        }
    }

    /* JADX INFO: renamed from: mk.f$h */
    public class h {

        /* JADX INFO: renamed from: a */
        public float f31482a;

        /* JADX INFO: renamed from: b */
        public float f31483b;

        /* JADX INFO: renamed from: c */
        public int f31484c;

        /* JADX INFO: renamed from: d */
        public float f31485d;

        /* JADX INFO: renamed from: e */
        public float f31486e;

        /* JADX INFO: renamed from: f */
        public int f31487f;

        public h() {
        }

        /* JADX INFO: renamed from: a */
        public int m34575a() {
            return this.f31484c;
        }

        /* JADX INFO: renamed from: b */
        public float m34576b() {
            return this.f31482a;
        }

        /* JADX INFO: renamed from: c */
        public float m34577c() {
            return this.f31483b;
        }

        /* JADX INFO: renamed from: d */
        public void m34578d(int i10) {
            this.f31487f = this.f31484c;
            this.f31484c = i10;
        }

        /* JADX INFO: renamed from: e */
        public void m34579e(float f10) {
            this.f31485d = this.f31482a;
            this.f31482a = f10;
        }

        /* JADX INFO: renamed from: f */
        public void m34580f(float f10) {
            this.f31486e = this.f31483b;
            this.f31483b = f10;
        }
    }

    public ViewOnTouchListenerC8572f(@NonNull Activity activity, SurfaceView surfaceView, f fVar) {
        this.f31440a = null;
        this.f31441b = true;
        this.f31442c = null;
        this.f31443d = null;
        this.f31444e = null;
        this.f31445f = null;
        this.f31447h = null;
        this.f31448i = null;
        this.f31449j = null;
        this.f31450k = null;
        this.f31440a = surfaceView;
        this.f31435A = activity;
        boolean zHasSystemFeature = activity.getPackageManager().hasSystemFeature("android.hardware.touchscreen");
        this.f31441b = zHasSystemFeature;
        this.f31436B = fVar;
        if (zHasSystemFeature || !C11295a1.m42471q0()) {
            this.f31443d = new g();
            this.f31442c = new GestureDetector(activity, this.f31443d);
            this.f31444e = new C8575i(this);
            this.f31445f = new C8576j(this);
        }
        m34555G(surfaceView);
        this.f31447h = (SensorManager) activity.getBaseContext().getSystemService("sensor");
        this.f31464y = (InputManager) activity.getBaseContext().getSystemService("input");
        m34567v();
        this.f31448i = this.f31447h.getDefaultSensor(1);
        Sensor defaultSensor = this.f31447h.getDefaultSensor(11);
        this.f31449j = defaultSensor;
        if (defaultSensor != null) {
            NativeInputInterface.nativeSetGyroscopeEnabled(true);
        }
        if (this.f31448i != null) {
            NativeInputInterface.nativeSetAccelerometerEnabled(true);
        }
        a aVar = new a(activity, 3);
        this.f31450k = aVar;
        if (aVar.canDetectOrientation()) {
            this.f31450k.enable();
        }
        this.f31438D = C11659h.m43403a().mo43735u5();
    }

    /* JADX INFO: renamed from: n */
    public static float[] m34546n(int i10, float[] fArr) {
        int[] iArr = new int[][]{new int[]{1, -1, 0, 1}, new int[]{-1, -1, 1, 0}, new int[]{-1, 1, 0, 1}, new int[]{1, 1, 1, 0}}[i10];
        return new float[]{iArr[0] * fArr[iArr[2]], iArr[1] * fArr[iArr[3]], fArr[2]};
    }

    /* JADX INFO: renamed from: r */
    public static float[] m34547r(MotionEvent motionEvent, float f10) {
        int pointerCount = motionEvent.getPointerCount();
        float[] fArr = new float[pointerCount * 2];
        for (int i10 = 0; i10 < pointerCount; i10++) {
            int i11 = i10 * 2;
            fArr[i11] = motionEvent.getX(i10) / f10;
            fArr[i11 + 1] = motionEvent.getY(i10) / f10;
        }
        return fArr;
    }

    /* JADX INFO: renamed from: x */
    public static int m34548x(String str) {
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

    /* JADX INFO: renamed from: A */
    public void m34549A(int i10, int i11) {
        NativeInputInterface.nativePassSwipeGesture(1, i10, i11);
    }

    /* JADX INFO: renamed from: B */
    public void m34550B(int i10, int i11) {
        NativeInputInterface.nativePassSwipeGesture(2, i10, i11);
    }

    /* JADX INFO: renamed from: C */
    public void m34551C(int i10, int i11) {
        NativeInputInterface.nativePassSwipeGesture(0, i10, i11);
    }

    /* JADX INFO: renamed from: D */
    public void m34552D(int i10, int i11) {
        NativeInputInterface.nativePassSwipeGesture(3, i10, i11);
    }

    /* JADX INFO: renamed from: E */
    public final void m34553E(int i10, int i11) {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        boolean[] zArrHasKeys = new boolean[f31433F.length];
        InputDevice inputDevice = this.f31464y.getInputDevice(i10);
        if (inputDevice != null) {
            zArrHasKeys = inputDevice.hasKeys(f31433F);
        }
        for (int i12 = 0; i12 < zArrHasKeys.length; i12++) {
            map.put(Integer.valueOf(f31433F[i12]), Boolean.valueOf(zArrHasKeys[i12]));
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

    /* JADX INFO: renamed from: F */
    public final void m34554F(int i10) {
        boolean[] zArrHasKeys = new boolean[f31434G.length];
        InputDevice inputDevice = this.f31464y.getInputDevice(i10);
        if (inputDevice != null) {
            zArrHasKeys = inputDevice.hasKeys(f31434G);
        }
        for (int i11 = 0; i11 < zArrHasKeys.length; i11++) {
            NativeInputInterface.nativeSetTVRemoteSupportedKey(i10, f31434G[i11], zArrHasKeys[i11]);
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m34555G(final SurfaceView surfaceView) {
        surfaceView.setOnKeyListener(new c());
        surfaceView.setOnCapturedPointerListener(new d(surfaceView));
        this.f31435A.getWindow().getDecorView().getViewTreeObserver().addOnWindowFocusChangeListener(new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: mk.e
            @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
            public final void onWindowFocusChanged(boolean z10) {
                this.f31431a.m34568w(surfaceView, z10);
            }
        });
        surfaceView.setOnGenericMotionListener(new e(surfaceView));
    }

    /* JADX INFO: renamed from: H */
    public void m34556H(boolean z10) {
        if (!this.f31451l) {
            this.f31451l = z10;
        }
        if (this.f31451l) {
            this.f31447h.registerListener(this, this.f31449j, 1);
            this.f31447h.registerListener(this, this.f31448i, 1);
        }
    }

    /* JADX INFO: renamed from: I */
    public void m34557I() {
        this.f31447h.unregisterListener(this);
    }

    /* JADX INFO: renamed from: J */
    public final void m34558J() {
        Activity activity = this.f31435A;
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

    @Override // mk.C8575i.a
    /* JADX INFO: renamed from: a */
    public void mo34559a(C8575i c8575i) {
        float fM34588b = c8575i.m34588b();
        int iM34591e = c8575i.m34591e();
        Point pointM34589c = c8575i.m34589c();
        Point pointM34590d = c8575i.m34590d();
        NativeInputInterface.nativePassRotateGesture(iM34591e, fM34588b, 0.0f, pointM34589c.x, pointM34589c.y, pointM34590d.x, pointM34590d.y);
    }

    @Override // mk.C8576j.a
    /* JADX INFO: renamed from: b */
    public void mo34560b(C8576j c8576j) {
        Point pointM34593a = c8576j.m34593a();
        Point pointM34594b = c8576j.m34594b();
        float fM34595c = c8576j.m34595c();
        int iM34596d = c8576j.m34596d();
        float fM34563q = m34563q();
        this.f31455p = true;
        if (iM34596d == 0) {
            this.f31456q = 1.0f;
        }
        if (this.f31454o) {
            NativeInputInterface.nativePassMousePinch(pointM34593a.x / fM34563q, pointM34593a.y / fM34563q, (fM34595c - this.f31456q) * 3.5f);
        } else {
            NativeInputInterface.nativePassPinchGesture(iM34596d, fM34595c, 0.0f, (int) (pointM34593a.x / fM34563q), (int) (pointM34593a.y / fM34563q), (int) (pointM34594b.x / fM34563q), (int) (pointM34594b.y / fM34563q));
        }
        this.f31456q = fM34595c;
    }

    /* JADX INFO: renamed from: o */
    public final void m34561o(int i10) {
        if (this.f31464y.getInputDevice(i10) == null) {
            C6124q.m27057b("rbx.input", "inputDevice is null for device ID: " + i10);
            return;
        }
        if (this.f31462w.add(Integer.valueOf(i10))) {
            InputDevice inputDevice = this.f31464y.getInputDevice(i10);
            int iM34548x = m34548x(inputDevice != null ? inputDevice.getName() : "");
            m34553E(i10, iM34548x);
            NativeInputInterface.nativeGamepadConnectEventWithGamepadType(i10, iM34548x);
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i10) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        int rotation = ((WindowManager) this.f31435A.getBaseContext().getSystemService("window")).getDefaultDisplay().getRotation();
        if (sensorEvent.sensor.getType() == 11) {
            SensorManager.getQuaternionFromVector(this.f31457r, m34546n(rotation, sensorEvent.values));
            SensorManager.getRotationMatrixFromVector(this.f31458s, this.f31457r);
            SensorManager.getOrientation(this.f31458s, this.f31459t);
            float[] fArr = this.f31459t;
            float f10 = fArr[0];
            float f11 = fArr[1];
            float f12 = fArr[2];
            float[] fArr2 = this.f31457r;
            NativeInputInterface.nativePassGyroscopeChange(f10, f11, f12, fArr2[0], fArr2[2], fArr2[3], fArr2[1]);
            return;
        }
        if (sensorEvent.sensor.getType() == 1) {
            float[] fArr3 = this.f31460u;
            float f13 = fArr3[0] * 0.8f;
            float[] fArr4 = sensorEvent.values;
            float f14 = f13 + (fArr4[0] * 0.19999999f);
            fArr3[0] = f14;
            float f15 = (fArr3[1] * 0.8f) + (fArr4[1] * 0.19999999f);
            fArr3[1] = f15;
            float f16 = (fArr3[2] * 0.8f) + (fArr4[2] * 0.19999999f);
            fArr3[2] = f16;
            float[] fArr5 = this.f31461v;
            fArr5[0] = fArr4[0] - f14;
            fArr5[1] = fArr4[1] - f15;
            fArr5[2] = fArr4[2] - f16;
            float[] fArrM34546n = m34546n(rotation, fArr5);
            float[] fArrM34546n2 = m34546n(rotation, this.f31460u);
            NativeInputInterface.nativePassAccelerometerChange(-fArrM34546n[1], fArrM34546n[2], fArrM34546n[0]);
            NativeInputInterface.nativePassGravityChange(-fArrM34546n2[1], -fArrM34546n2[2], fArrM34546n2[0]);
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
        boolean zMo1325b;
        ?? r10;
        f fVar;
        VelocityTracker velocityTracker;
        h hVar;
        g gVar;
        float x10;
        float y10;
        g gVar2;
        f fVar2;
        int historySize;
        int i12 = 0;
        boolean z10 = (motionEvent.getSource() & InputDeviceCompat.SOURCE_MOUSE) == 8194;
        boolean z11 = z10 && motionEvent.getToolType(0) == 1;
        this.f31454o = z11;
        if (z10 && !z11) {
            if (motionEvent.getButtonState() != 0) {
                return m34569y(motionEvent);
            }
            int historySize2 = motionEvent.getHistorySize();
            if (historySize2 > 0) {
                float y11 = (motionEvent.getY() / m34563q()) - (motionEvent.getHistoricalY(0, historySize2 - 1) / m34563q());
                if (y11 != 0.0f) {
                    NativeInputInterface.nativePassMouseWheel(this.f31452m, this.f31453n, y11);
                }
            }
            return true;
        }
        if (C11295a1.m42471q0() && !this.f31441b) {
            return false;
        }
        int actionIndex = motionEvent.getActionIndex();
        int pointerId = motionEvent.getPointerId(actionIndex);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            if (C11659h.m43403a().mo43690o2()) {
                view.requestUnbufferedDispatch(motionEvent);
            }
            h hVar2 = new h();
            float fM34563q = m34563q();
            hVar2.m34579e(motionEvent.getX(actionIndex) / fM34563q);
            hVar2.m34580f(motionEvent.getY(actionIndex) / fM34563q);
            i10 = 0;
            hVar2.m34578d(0);
            this.f31446g.put(pointerId, hVar2);
            if (this.f31438D && !z10) {
                if (this.f31439E == null) {
                    this.f31439E = VelocityTracker.obtain();
                }
                this.f31439E.addMovement(motionEvent);
            }
        } else if (actionMasked == 1) {
            velocityTracker = this.f31439E;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
                if (actionMasked != 3) {
                    this.f31439E.computeCurrentVelocity(1000);
                    float fM34563q2 = m34563q();
                    NativeInputInterface.nativePassTouchEndVelocity(pointerId, this.f31439E.getXVelocity(pointerId) / fM34563q2, this.f31439E.getYVelocity(pointerId) / fM34563q2);
                }
                if (actionMasked != 1 || actionMasked == 3) {
                    this.f31439E.recycle();
                    this.f31439E = null;
                }
            }
            hVar = this.f31446g.get(pointerId);
            this.f31455p = false;
            if (hVar == null) {
                float fM34563q3 = m34563q();
                x10 = motionEvent.getX(actionIndex) / fM34563q3;
                y10 = motionEvent.getY(actionIndex) / fM34563q3;
                gVar2 = this.f31443d;
                if (pointerId == gVar2.f31474a) {
                    gVar2.f31474a = -1;
                    NativeInputInterface.nativePassLongPressGesture(2, x10, y10);
                } else if (pointerId == gVar2.f31475b) {
                    if (C11659h.m43403a().mo43617e0()) {
                        this.f31443d.m34574b(motionEvent);
                    } else {
                        this.f31443d.m34573a();
                    }
                }
            } else {
                hVar.m34578d(2);
                gVar = this.f31443d;
                if (pointerId == gVar.f31474a) {
                    gVar.f31474a = -1;
                    NativeInputInterface.nativePassLongPressGesture(2, hVar.m34576b(), hVar.m34577c());
                } else if (pointerId == gVar.f31475b) {
                    if (C11659h.m43403a().mo43617e0()) {
                        this.f31443d.m34574b(motionEvent);
                    } else {
                        this.f31443d.m34573a();
                    }
                }
            }
            i10 = 0;
        } else if (actionMasked != 2) {
            if (actionMasked != 3) {
                if (actionMasked == 5) {
                    if (C11659h.m43403a().mo43690o2()) {
                        view.requestUnbufferedDispatch(motionEvent);
                    }
                    h hVar3 = new h();
                    float fM34563q4 = m34563q();
                    hVar3.m34579e(motionEvent.getX(actionIndex) / fM34563q4);
                    hVar3.m34580f(motionEvent.getY(actionIndex) / fM34563q4);
                    i10 = 0;
                    hVar3.m34578d(0);
                    this.f31446g.put(pointerId, hVar3);
                    if (this.f31438D) {
                        if (this.f31439E == null) {
                            this.f31439E = VelocityTracker.obtain();
                        }
                        this.f31439E.addMovement(motionEvent);
                    }
                } else if (actionMasked != 6) {
                    i10 = 0;
                }
            }
            velocityTracker = this.f31439E;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
                if (actionMasked != 3) {
                    this.f31439E.computeCurrentVelocity(1000);
                    float fM34563q5 = m34563q();
                    NativeInputInterface.nativePassTouchEndVelocity(pointerId, this.f31439E.getXVelocity(pointerId) / fM34563q5, this.f31439E.getYVelocity(pointerId) / fM34563q5);
                }
                if (actionMasked != 1) {
                    this.f31439E.recycle();
                    this.f31439E = null;
                } else {
                    this.f31439E.recycle();
                    this.f31439E = null;
                }
            }
            hVar = this.f31446g.get(pointerId);
            this.f31455p = false;
            if (hVar == null) {
                float fM34563q6 = m34563q();
                x10 = motionEvent.getX(actionIndex) / fM34563q6;
                y10 = motionEvent.getY(actionIndex) / fM34563q6;
                gVar2 = this.f31443d;
                if (pointerId == gVar2.f31474a) {
                    gVar2.f31474a = -1;
                    NativeInputInterface.nativePassLongPressGesture(2, x10, y10);
                } else if (pointerId == gVar2.f31475b) {
                    if (C11659h.m43403a().mo43617e0()) {
                        this.f31443d.m34574b(motionEvent);
                    } else {
                        this.f31443d.m34573a();
                    }
                }
            } else {
                hVar.m34578d(2);
                gVar = this.f31443d;
                if (pointerId == gVar.f31474a) {
                    gVar.f31474a = -1;
                    NativeInputInterface.nativePassLongPressGesture(2, hVar.m34576b(), hVar.m34577c());
                } else if (pointerId == gVar.f31475b) {
                    if (C11659h.m43403a().mo43617e0()) {
                        this.f31443d.m34574b(motionEvent);
                    } else {
                        this.f31443d.m34573a();
                    }
                }
            }
            i10 = 0;
        } else {
            VelocityTracker velocityTracker2 = this.f31439E;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
            }
            if (C11659h.m43403a().mo43585a0() && !z10 && (fVar2 = this.f31436B) != null && fVar2.mo1325b() && (historySize = motionEvent.getHistorySize()) > 0) {
                float fM34563q7 = m34563q();
                int width = (int) (this.f31440a.getWidth() / fM34563q7);
                int height = (int) (this.f31440a.getHeight() / fM34563q7);
                int size = this.f31446g.size();
                int i13 = historySize * size;
                int[] iArr = new int[i13];
                float[] fArr = new float[i13 * 2];
                int i14 = 0;
                int i15 = 0;
                while (i14 < historySize) {
                    for (int i16 = i12; i16 < size; i16++) {
                        int iKeyAt = this.f31446g.keyAt(i16);
                        try {
                            int iFindPointerIndex = motionEvent.findPointerIndex(iKeyAt);
                            iArr[i15] = iKeyAt;
                            int i17 = i15 * 2;
                            fArr[i17] = motionEvent.getHistoricalX(iFindPointerIndex, i14) / fM34563q7;
                            fArr[i17 + 1] = motionEvent.getHistoricalY(iFindPointerIndex, i14) / fM34563q7;
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
            for (int i18 = 0; i18 < this.f31446g.size(); i18++) {
                try {
                    int iKeyAt2 = this.f31446g.keyAt(i18);
                    int iFindPointerIndex2 = motionEvent.findPointerIndex(iKeyAt2);
                    h hVar4 = this.f31446g.get(iKeyAt2);
                    float fM34563q8 = m34563q();
                    hVar4.m34579e(motionEvent.getX(iFindPointerIndex2) / fM34563q8);
                    hVar4.m34580f(motionEvent.getY(iFindPointerIndex2) / fM34563q8);
                    hVar4.m34578d(1);
                    if (iKeyAt2 == this.f31443d.f31474a) {
                        NativeInputInterface.nativePassLongPressGesture(1, hVar4.m34576b(), hVar4.m34577c());
                    }
                } catch (IllegalArgumentException unused2) {
                }
            }
            i10 = 0;
        }
        this.f31437C.clear();
        int size2 = this.f31446g.size();
        for (int i19 = i10; i19 < size2; i19++) {
            int iKeyAt3 = this.f31446g.keyAt(i19);
            h hVarValueAt = this.f31446g.valueAt(i19);
            if (hVarValueAt.m34575a() == 2) {
                this.f31437C.add(Integer.valueOf(iKeyAt3));
            } else {
                if (hVarValueAt.m34575a() != hVarValueAt.f31487f ? !(hVarValueAt.m34575a() != 1 || hVarValueAt.f31487f != 0 || hVarValueAt.m34576b() != hVarValueAt.f31485d || hVarValueAt.m34577c() != hVarValueAt.f31486e) : !(hVarValueAt.m34576b() != hVarValueAt.f31485d || hVarValueAt.m34577c() != hVarValueAt.f31486e)) {
                    i11 = i10;
                }
                if (C11659h.m43403a().mo43529S0()) {
                    fVar = this.f31436B;
                    if (fVar == null && fVar.mo1325b()) {
                        r10 = 1;
                    } else {
                        r10 = i10;
                    }
                } else {
                    zMo1325b = this.f31436B.mo1325b();
                }
                if (i11 == 0 && r10 != 0) {
                    float fM34563q9 = m34563q();
                    int width2 = (int) (this.f31440a.getWidth() / fM34563q9);
                    int height2 = (int) (this.f31440a.getHeight() / fM34563q9);
                    hVarValueAt.f31485d = hVarValueAt.m34576b();
                    hVarValueAt.f31486e = hVarValueAt.m34577c();
                    if (!z10) {
                        NativeInputInterface.nativePassInput(iKeyAt3, hVarValueAt.m34576b(), hVarValueAt.m34577c(), hVarValueAt.m34575a(), width2, height2);
                    }
                } else if (r10 == 0) {
                    C6124q.m27066k("rbx.input", "nativePassInput not ready or already passed event");
                }
            }
            i11 = 1;
            if (C11659h.m43403a().mo43529S0()) {
                fVar = this.f31436B;
                if (fVar == null) {
                    r10 = i10;
                } else {
                    r10 = i10;
                }
            } else {
                zMo1325b = this.f31436B.mo1325b();
            }
            if (i11 == 0) {
                if (r10 == 0) {
                    C6124q.m27066k("rbx.input", "nativePassInput not ready or already passed event");
                }
            } else if (r10 == 0) {
                C6124q.m27066k("rbx.input", "nativePassInput not ready or already passed event");
            }
        }
        Iterator<Integer> it = this.f31437C.iterator();
        while (it.hasNext()) {
            this.f31446g.remove(it.next().intValue());
        }
        this.f31445f.m34597e(motionEvent);
        this.f31442c.onTouchEvent(motionEvent);
        this.f31444e.m34592f(motionEvent);
        if (z10) {
            m34569y(motionEvent);
        }
        return true;
    }

    /* JADX INFO: renamed from: p */
    public final void m34562p(int i10) {
        if (this.f31464y.getInputDevice(i10) == null) {
            C6124q.m27057b("rbx.input", "inputDevice is null for device ID: " + i10);
            return;
        }
        if (this.f31463x.add(Integer.valueOf(i10))) {
            m34554F(i10);
            NativeInputInterface.nativeTVRemoteConnectEvent(i10);
        }
    }

    /* JADX INFO: renamed from: q */
    public final float m34563q() {
        return C5160a.m24001e(this.f31435A);
    }

    /* JADX INFO: renamed from: s */
    public final void m34564s(int i10) {
    }

    /* JADX INFO: renamed from: t */
    public final void m34565t(int i10) {
    }

    /* JADX INFO: renamed from: u */
    public final void m34566u(int i10) {
        if (this.f31462w.remove(Integer.valueOf(i10))) {
            m34553E(i10, 0);
            NativeInputInterface.nativeGamepadDisconnectEvent(i10);
        }
        if (this.f31463x.remove(Integer.valueOf(i10))) {
            m34554F(i10);
            NativeInputInterface.nativeTVRemoteDisconnectEvent(i10);
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m34567v() {
        b bVar = new b();
        this.f31465z = bVar;
        this.f31464y.registerInputDeviceListener(bVar, null);
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m34568w(SurfaceView surfaceView, boolean z10) {
        if (z10) {
            if (!C11659h.m43403a().mo43544U1()) {
                surfaceView.requestFocus();
                return;
            }
            Activity activity = this.f31435A;
            if ((activity instanceof ActivityC4831q) && ((ActivityC4831q) activity).m23360l1().m4462u0() == 0) {
                surfaceView.requestFocus();
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public boolean m34569y(MotionEvent motionEvent) {
        if (this.f31455p) {
            return true;
        }
        if (motionEvent.getActionMasked() == 7 || motionEvent.getActionMasked() == 2) {
            float x10 = motionEvent.getX() / m34563q();
            float y10 = motionEvent.getY() / m34563q();
            float f10 = x10 - this.f31452m;
            float f11 = y10 - this.f31453n;
            this.f31452m = x10;
            this.f31453n = y10;
            NativeInputInterface.nativePassMouseMove(x10, y10, f10, f11);
            return true;
        }
        if (motionEvent.getActionMasked() == 11) {
            NativeInputInterface.nativePassMouseButton(this.f31452m, this.f31453n, true, motionEvent.getActionButton() - 1);
            return true;
        }
        if (motionEvent.getActionMasked() == 12) {
            NativeInputInterface.nativePassMouseButton(this.f31452m, this.f31453n, false, motionEvent.getActionButton() - 1);
            return true;
        }
        if (motionEvent.getActionMasked() != 8) {
            return motionEvent.getActionMasked() == 0;
        }
        float f12 = this.f31452m;
        if (f12 <= 0.0f) {
            f12 = 0.0f;
        }
        float f13 = this.f31453n;
        NativeInputInterface.nativePassMouseWheel(f12, f13 > 0.0f ? f13 : 0.0f, motionEvent.getAxisValue(9));
        return true;
    }

    /* JADX INFO: renamed from: z */
    public boolean m34570z(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 7 && motionEvent.getActionMasked() != 2) {
            return m34569y(motionEvent);
        }
        float axisValue = motionEvent.getAxisValue(27) / m34563q();
        float axisValue2 = motionEvent.getAxisValue(28) / m34563q();
        if (!C11659h.m43403a().mo43474K()) {
            this.f31452m += axisValue;
            this.f31453n += axisValue2;
        }
        NativeInputInterface.nativePassMouseMove(this.f31452m, this.f31453n, axisValue, axisValue2);
        return true;
    }
}
