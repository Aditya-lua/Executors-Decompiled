package p589z;

import android.hardware.camera2.CaptureResult;
import android.os.Build;
import java.nio.BufferUnderflowException;
import p140g0.C5931r1;
import p296n0.C8857z3;
import p296n0.EnumC8719a0;
import p296n0.EnumC8725b0;
import p296n0.EnumC8731c0;
import p296n0.EnumC8737d0;
import p296n0.EnumC8843x;
import p296n0.EnumC8848y;
import p296n0.EnumC8853z;
import p296n0.InterfaceC8743e0;
import p347p0.C10093i;

/* JADX INFO: renamed from: z.h */
/* JADX INFO: loaded from: classes.dex */
public class C13531h implements InterfaceC8743e0 {

    /* JADX INFO: renamed from: a */
    public final C8857z3 f47395a;

    /* JADX INFO: renamed from: b */
    public final CaptureResult f47396b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C13531h(C8857z3 c8857z3, CaptureResult captureResult) {
        this.f47395a = c8857z3;
        this.f47396b = captureResult;
    }

    @Override // p296n0.InterfaceC8743e0
    /* JADX INFO: renamed from: a */
    public void mo35072a(C10093i.b bVar) {
        super.mo35072a(bVar);
        try {
            Integer num = (Integer) this.f47396b.get(CaptureResult.JPEG_ORIENTATION);
            if (num != null) {
                bVar.m38978m(num.intValue());
            }
        } catch (BufferUnderflowException unused) {
            C5931r1.m26572l("C2CameraCaptureResult", "Failed to get JPEG orientation.");
        }
        Long l10 = (Long) this.f47396b.get(CaptureResult.SENSOR_EXPOSURE_TIME);
        if (l10 != null) {
            bVar.m38971f(l10.longValue());
        }
        Float f10 = (Float) this.f47396b.get(CaptureResult.LENS_APERTURE);
        if (f10 != null) {
            bVar.m38977l(f10.floatValue());
        }
        Integer numValueOf = (Integer) this.f47396b.get(CaptureResult.SENSOR_SENSITIVITY);
        if (numValueOf != null) {
            Integer num2 = (Integer) this.f47396b.get(CaptureResult.CONTROL_POST_RAW_SENSITIVITY_BOOST);
            if (num2 != null) {
                numValueOf = Integer.valueOf(numValueOf.intValue() * ((int) (num2.intValue() / 100.0f)));
            }
            bVar.m38976k(numValueOf.intValue());
        }
        Float f11 = (Float) this.f47396b.get(CaptureResult.LENS_FOCAL_LENGTH);
        if (f11 != null) {
            bVar.m38973h(f11.floatValue());
        }
        Integer num3 = (Integer) this.f47396b.get(CaptureResult.CONTROL_AWB_MODE);
        if (num3 != null) {
            C10093i.c cVar = C10093i.c.AUTO;
            if (num3.intValue() == 0) {
                cVar = C10093i.c.MANUAL;
            }
            bVar.m38979n(cVar);
        }
    }

    @Override // p296n0.InterfaceC8743e0
    /* JADX INFO: renamed from: b */
    public EnumC8737d0 mo6734b() {
        Integer num = (Integer) this.f47396b.get(CaptureResult.FLASH_STATE);
        if (num == null) {
            return EnumC8737d0.UNKNOWN;
        }
        int iIntValue = num.intValue();
        if (iIntValue == 0 || iIntValue == 1) {
            return EnumC8737d0.NONE;
        }
        if (iIntValue == 2) {
            return EnumC8737d0.READY;
        }
        if (iIntValue == 3 || iIntValue == 4) {
            return EnumC8737d0.FIRED;
        }
        C5931r1.m26563c("C2CameraCaptureResult", "Undefined flash state: " + num);
        return EnumC8737d0.UNKNOWN;
    }

    @Override // p296n0.InterfaceC8743e0
    /* JADX INFO: renamed from: c */
    public C8857z3 mo6735c() {
        return this.f47395a;
    }

    @Override // p296n0.InterfaceC8743e0
    /* JADX INFO: renamed from: d */
    public EnumC8725b0 mo6736d() {
        Integer num = (Integer) this.f47396b.get(CaptureResult.CONTROL_AWB_MODE);
        if (num == null) {
            return EnumC8725b0.UNKNOWN;
        }
        switch (num.intValue()) {
            case 0:
                return EnumC8725b0.OFF;
            case 1:
                return EnumC8725b0.AUTO;
            case 2:
                return EnumC8725b0.INCANDESCENT;
            case 3:
                return EnumC8725b0.FLUORESCENT;
            case 4:
                return EnumC8725b0.WARM_FLUORESCENT;
            case 5:
                return EnumC8725b0.DAYLIGHT;
            case 6:
                return EnumC8725b0.CLOUDY_DAYLIGHT;
            case 7:
                return EnumC8725b0.TWILIGHT;
            case 8:
                return EnumC8725b0.SHADE;
            default:
                return EnumC8725b0.UNKNOWN;
        }
    }

    @Override // p296n0.InterfaceC8743e0
    /* JADX INFO: renamed from: e */
    public CaptureResult mo35073e() {
        return this.f47396b;
    }

    @Override // p296n0.InterfaceC8743e0
    /* JADX INFO: renamed from: f */
    public EnumC8843x mo6737f() {
        Integer num = (Integer) this.f47396b.get(CaptureResult.CONTROL_AE_MODE);
        if (num == null) {
            return EnumC8843x.UNKNOWN;
        }
        int iIntValue = num.intValue();
        if (iIntValue == 0) {
            return EnumC8843x.OFF;
        }
        if (iIntValue == 1) {
            return EnumC8843x.ON;
        }
        if (iIntValue == 2) {
            return EnumC8843x.ON_AUTO_FLASH;
        }
        if (iIntValue == 3) {
            return EnumC8843x.ON_ALWAYS_FLASH;
        }
        if (iIntValue == 4) {
            return EnumC8843x.ON_AUTO_FLASH_REDEYE;
        }
        if (iIntValue == 5 && Build.VERSION.SDK_INT >= 28) {
            return EnumC8843x.ON_EXTERNAL_FLASH;
        }
        return EnumC8843x.UNKNOWN;
    }

    @Override // p296n0.InterfaceC8743e0
    /* JADX INFO: renamed from: g */
    public EnumC8719a0 mo6738g() {
        Integer num = (Integer) this.f47396b.get(CaptureResult.CONTROL_AF_STATE);
        if (num == null) {
            return EnumC8719a0.UNKNOWN;
        }
        switch (num.intValue()) {
            case 0:
                return EnumC8719a0.INACTIVE;
            case 1:
            case 3:
                return EnumC8719a0.SCANNING;
            case 2:
                return EnumC8719a0.PASSIVE_FOCUSED;
            case 4:
                return EnumC8719a0.LOCKED_FOCUSED;
            case 5:
                return EnumC8719a0.LOCKED_NOT_FOCUSED;
            case 6:
                return EnumC8719a0.PASSIVE_NOT_FOCUSED;
            default:
                C5931r1.m26563c("C2CameraCaptureResult", "Undefined af state: " + num);
                return EnumC8719a0.UNKNOWN;
        }
    }

    @Override // p296n0.InterfaceC8743e0
    public long getTimestamp() {
        Long l10 = (Long) this.f47396b.get(CaptureResult.SENSOR_TIMESTAMP);
        if (l10 == null) {
            return -1L;
        }
        return l10.longValue();
    }

    @Override // p296n0.InterfaceC8743e0
    /* JADX INFO: renamed from: h */
    public EnumC8731c0 mo6739h() {
        Integer num = (Integer) this.f47396b.get(CaptureResult.CONTROL_AWB_STATE);
        if (num == null) {
            return EnumC8731c0.UNKNOWN;
        }
        int iIntValue = num.intValue();
        if (iIntValue == 0) {
            return EnumC8731c0.INACTIVE;
        }
        if (iIntValue == 1) {
            return EnumC8731c0.METERING;
        }
        if (iIntValue == 2) {
            return EnumC8731c0.CONVERGED;
        }
        if (iIntValue == 3) {
            return EnumC8731c0.LOCKED;
        }
        C5931r1.m26563c("C2CameraCaptureResult", "Undefined awb state: " + num);
        return EnumC8731c0.UNKNOWN;
    }

    @Override // p296n0.InterfaceC8743e0
    /* JADX INFO: renamed from: i */
    public EnumC8853z mo6740i() {
        Integer num = (Integer) this.f47396b.get(CaptureResult.CONTROL_AF_MODE);
        if (num == null) {
            return EnumC8853z.UNKNOWN;
        }
        int iIntValue = num.intValue();
        if (iIntValue != 0) {
            if (iIntValue == 1 || iIntValue == 2) {
                return EnumC8853z.ON_MANUAL_AUTO;
            }
            if (iIntValue == 3 || iIntValue == 4) {
                return EnumC8853z.ON_CONTINUOUS_AUTO;
            }
            if (iIntValue != 5) {
                C5931r1.m26563c("C2CameraCaptureResult", "Undefined af mode: " + num);
                return EnumC8853z.UNKNOWN;
            }
        }
        return EnumC8853z.OFF;
    }

    @Override // p296n0.InterfaceC8743e0
    /* JADX INFO: renamed from: j */
    public EnumC8848y mo6741j() {
        Integer num = (Integer) this.f47396b.get(CaptureResult.CONTROL_AE_STATE);
        if (num == null) {
            return EnumC8848y.UNKNOWN;
        }
        int iIntValue = num.intValue();
        if (iIntValue == 0) {
            return EnumC8848y.INACTIVE;
        }
        if (iIntValue != 1) {
            if (iIntValue == 2) {
                return EnumC8848y.CONVERGED;
            }
            if (iIntValue == 3) {
                return EnumC8848y.LOCKED;
            }
            if (iIntValue == 4) {
                return EnumC8848y.FLASH_REQUIRED;
            }
            if (iIntValue != 5) {
                C5931r1.m26563c("C2CameraCaptureResult", "Undefined ae state: " + num);
                return EnumC8848y.UNKNOWN;
            }
        }
        return EnumC8848y.SEARCHING;
    }

    public C13531h(CaptureResult captureResult) {
        this(C8857z3.m35562b(), captureResult);
    }
}
