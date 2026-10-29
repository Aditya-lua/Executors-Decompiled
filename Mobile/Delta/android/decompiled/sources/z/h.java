package z;

import android.hardware.camera2.CaptureResult;
import android.os.Build;
import java.nio.BufferUnderflowException;

/* JADX INFO: loaded from: classes.dex */
public class h implements n0.e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0.z3 f36587a;
    public final CaptureResult b;

    public h(n0.z3 z3Var, CaptureResult captureResult) {
        this.f36587a = z3Var;
        this.b = captureResult;
    }

    @Override // n0.e0
    public void a(p0.i.b bVar) {
        super.a(bVar);
        try {
            Integer num = (Integer) this.b.get(CaptureResult.JPEG_ORIENTATION);
            if (num != null) {
                bVar.m(num.intValue());
            }
        } catch (BufferUnderflowException unused) {
            g0.r1.l("C2CameraCaptureResult", "Failed to get JPEG orientation.");
        }
        Long l10 = (Long) this.b.get(CaptureResult.SENSOR_EXPOSURE_TIME);
        if (l10 != null) {
            bVar.f(l10.longValue());
        }
        Float f10 = (Float) this.b.get(CaptureResult.LENS_APERTURE);
        if (f10 != null) {
            bVar.l(f10.floatValue());
        }
        Integer numValueOf = (Integer) this.b.get(CaptureResult.SENSOR_SENSITIVITY);
        if (numValueOf != null) {
            Integer num2 = (Integer) this.b.get(CaptureResult.CONTROL_POST_RAW_SENSITIVITY_BOOST);
            if (num2 != null) {
                numValueOf = Integer.valueOf(numValueOf.intValue() * ((int) (num2.intValue() / 100.0f)));
            }
            bVar.k(numValueOf.intValue());
        }
        Float f11 = (Float) this.b.get(CaptureResult.LENS_FOCAL_LENGTH);
        if (f11 != null) {
            bVar.h(f11.floatValue());
        }
        Integer num3 = (Integer) this.b.get(CaptureResult.CONTROL_AWB_MODE);
        if (num3 != null) {
            p0.i.c cVar = p0.i.c.AUTO;
            if (num3.intValue() == 0) {
                cVar = p0.i.c.MANUAL;
            }
            bVar.n(cVar);
        }
    }

    @Override // n0.e0
    public n0.d0 b() {
        Integer num = (Integer) this.b.get(CaptureResult.FLASH_STATE);
        if (num == null) {
            return n0.d0.UNKNOWN;
        }
        int iIntValue = num.intValue();
        if (iIntValue == 0 || iIntValue == 1) {
            return n0.d0.NONE;
        }
        if (iIntValue == 2) {
            return n0.d0.READY;
        }
        if (iIntValue == 3 || iIntValue == 4) {
            return n0.d0.FIRED;
        }
        g0.r1.c("C2CameraCaptureResult", "Undefined flash state: " + num);
        return n0.d0.UNKNOWN;
    }

    @Override // n0.e0
    public n0.z3 c() {
        return this.f36587a;
    }

    @Override // n0.e0
    public n0.b0 d() {
        Integer num = (Integer) this.b.get(CaptureResult.CONTROL_AWB_MODE);
        if (num == null) {
            return n0.b0.UNKNOWN;
        }
        switch (num.intValue()) {
            case 0:
                return n0.b0.OFF;
            case 1:
                return n0.b0.AUTO;
            case 2:
                return n0.b0.INCANDESCENT;
            case 3:
                return n0.b0.FLUORESCENT;
            case 4:
                return n0.b0.WARM_FLUORESCENT;
            case 5:
                return n0.b0.DAYLIGHT;
            case 6:
                return n0.b0.CLOUDY_DAYLIGHT;
            case 7:
                return n0.b0.TWILIGHT;
            case 8:
                return n0.b0.SHADE;
            default:
                return n0.b0.UNKNOWN;
        }
    }

    @Override // n0.e0
    public CaptureResult e() {
        return this.b;
    }

    @Override // n0.e0
    public n0.x f() {
        Integer num = (Integer) this.b.get(CaptureResult.CONTROL_AE_MODE);
        if (num == null) {
            return n0.x.UNKNOWN;
        }
        int iIntValue = num.intValue();
        if (iIntValue == 0) {
            return n0.x.OFF;
        }
        if (iIntValue == 1) {
            return n0.x.ON;
        }
        if (iIntValue == 2) {
            return n0.x.ON_AUTO_FLASH;
        }
        if (iIntValue == 3) {
            return n0.x.ON_ALWAYS_FLASH;
        }
        if (iIntValue == 4) {
            return n0.x.ON_AUTO_FLASH_REDEYE;
        }
        if (iIntValue == 5 && Build.VERSION.SDK_INT >= 28) {
            return n0.x.ON_EXTERNAL_FLASH;
        }
        return n0.x.UNKNOWN;
    }

    @Override // n0.e0
    public n0.a0 g() {
        Integer num = (Integer) this.b.get(CaptureResult.CONTROL_AF_STATE);
        if (num == null) {
            return n0.a0.UNKNOWN;
        }
        switch (num.intValue()) {
            case 0:
                return n0.a0.INACTIVE;
            case 1:
            case 3:
                return n0.a0.SCANNING;
            case 2:
                return n0.a0.PASSIVE_FOCUSED;
            case 4:
                return n0.a0.LOCKED_FOCUSED;
            case 5:
                return n0.a0.LOCKED_NOT_FOCUSED;
            case 6:
                return n0.a0.PASSIVE_NOT_FOCUSED;
            default:
                g0.r1.c("C2CameraCaptureResult", "Undefined af state: " + num);
                return n0.a0.UNKNOWN;
        }
    }

    @Override // n0.e0
    public long getTimestamp() {
        Long l10 = (Long) this.b.get(CaptureResult.SENSOR_TIMESTAMP);
        if (l10 == null) {
            return -1L;
        }
        return l10.longValue();
    }

    @Override // n0.e0
    public n0.c0 h() {
        Integer num = (Integer) this.b.get(CaptureResult.CONTROL_AWB_STATE);
        if (num == null) {
            return n0.c0.UNKNOWN;
        }
        int iIntValue = num.intValue();
        if (iIntValue == 0) {
            return n0.c0.INACTIVE;
        }
        if (iIntValue == 1) {
            return n0.c0.METERING;
        }
        if (iIntValue == 2) {
            return n0.c0.CONVERGED;
        }
        if (iIntValue == 3) {
            return n0.c0.LOCKED;
        }
        g0.r1.c("C2CameraCaptureResult", "Undefined awb state: " + num);
        return n0.c0.UNKNOWN;
    }

    @Override // n0.e0
    public n0.z i() {
        Integer num = (Integer) this.b.get(CaptureResult.CONTROL_AF_MODE);
        if (num == null) {
            return n0.z.UNKNOWN;
        }
        int iIntValue = num.intValue();
        if (iIntValue != 0) {
            if (iIntValue == 1 || iIntValue == 2) {
                return n0.z.ON_MANUAL_AUTO;
            }
            if (iIntValue == 3 || iIntValue == 4) {
                return n0.z.ON_CONTINUOUS_AUTO;
            }
            if (iIntValue != 5) {
                g0.r1.c("C2CameraCaptureResult", "Undefined af mode: " + num);
                return n0.z.UNKNOWN;
            }
        }
        return n0.z.OFF;
    }

    @Override // n0.e0
    public n0.y j() {
        Integer num = (Integer) this.b.get(CaptureResult.CONTROL_AE_STATE);
        if (num == null) {
            return n0.y.UNKNOWN;
        }
        int iIntValue = num.intValue();
        if (iIntValue == 0) {
            return n0.y.INACTIVE;
        }
        if (iIntValue != 1) {
            if (iIntValue == 2) {
                return n0.y.CONVERGED;
            }
            if (iIntValue == 3) {
                return n0.y.LOCKED;
            }
            if (iIntValue == 4) {
                return n0.y.FLASH_REQUIRED;
            }
            if (iIntValue != 5) {
                g0.r1.c("C2CameraCaptureResult", "Undefined ae state: " + num);
                return n0.y.UNKNOWN;
            }
        }
        return n0.y.SEARCHING;
    }

    public h(CaptureResult captureResult) {
        this(n0.z3.b(), captureResult);
    }
}
