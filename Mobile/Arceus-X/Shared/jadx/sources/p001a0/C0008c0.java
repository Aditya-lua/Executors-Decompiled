package p001a0;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import java.util.HashMap;
import java.util.Map;
import p063d0.C4382m;

/* JADX INFO: renamed from: a0.c0 */
/* JADX INFO: loaded from: classes.dex */
public class C0008c0 {

    /* JADX INFO: renamed from: b */
    public final a f2b;

    /* JADX INFO: renamed from: c */
    public final String f3c;

    /* JADX INFO: renamed from: a */
    public final Map<CameraCharacteristics.Key<?>, Object> f1a = new HashMap();

    /* JADX INFO: renamed from: d */
    public C0044u0 f4d = null;

    /* JADX INFO: renamed from: a0.c0$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        CameraCharacteristics mo19a();

        /* JADX INFO: renamed from: b */
        <T> T mo20b(CameraCharacteristics.Key<T> key);
    }

    public C0008c0(CameraCharacteristics cameraCharacteristics, String str) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f2b = new C0049x(cameraCharacteristics);
        } else {
            this.f2b = new C0050y(cameraCharacteristics);
        }
        this.f3c = str;
    }

    /* JADX INFO: renamed from: k */
    public static C0008c0 m8k(CameraCharacteristics cameraCharacteristics, String str) {
        return new C0008c0(cameraCharacteristics, str);
    }

    /* JADX INFO: renamed from: a */
    public <T> T m9a(CameraCharacteristics.Key<T> key) {
        if (m15g(key)) {
            return (T) this.f2b.mo20b(key);
        }
        synchronized (this) {
            try {
                T t8 = (T) this.f1a.get(key);
                if (t8 != null) {
                    return t8;
                }
                T t10 = (T) this.f2b.mo20b(key);
                if (t10 != null) {
                    this.f1a.put((CameraCharacteristics.Key<?>) key, t10);
                }
                return t10;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public String m10b() {
        return this.f3c;
    }

    /* JADX INFO: renamed from: c */
    public int m11c() {
        Integer num = (!m14f() || Build.VERSION.SDK_INT < 35) ? null : (Integer) m9a(CameraCharacteristics.FLASH_TORCH_STRENGTH_DEFAULT_LEVEL);
        if (num == null) {
            return 1;
        }
        return num.intValue();
    }

    /* JADX INFO: renamed from: d */
    public int m12d() {
        Integer num = (!m14f() || Build.VERSION.SDK_INT < 35) ? null : (Integer) m9a(CameraCharacteristics.FLASH_TORCH_STRENGTH_MAX_LEVEL);
        if (num == null) {
            return 1;
        }
        return num.intValue();
    }

    /* JADX INFO: renamed from: e */
    public C0044u0 m13e() {
        if (this.f4d == null) {
            try {
                StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) m9a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
                if (streamConfigurationMap == null) {
                    throw new IllegalArgumentException("StreamConfigurationMap is null!");
                }
                this.f4d = C0044u0.m88i(streamConfigurationMap, new C4382m(this.f3c));
            } catch (AssertionError | NullPointerException e10) {
                throw new IllegalArgumentException(e10.getMessage());
            }
        }
        return this.f4d;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m14f() {
        Boolean bool = (Boolean) m9a(CameraCharacteristics.FLASH_INFO_AVAILABLE);
        return bool != null && bool.booleanValue();
    }

    /* JADX INFO: renamed from: g */
    public final boolean m15g(CameraCharacteristics.Key<?> key) {
        return key.equals(CameraCharacteristics.SENSOR_ORIENTATION);
    }

    /* JADX INFO: renamed from: h */
    public boolean m16h() {
        return m14f() && Build.VERSION.SDK_INT >= 35 && m12d() > 1;
    }

    /* JADX INFO: renamed from: i */
    public boolean m17i() {
        int[] iArr;
        if (Build.VERSION.SDK_INT >= 34 && (iArr = (int[]) this.f2b.mo20b(CameraCharacteristics.CONTROL_AVAILABLE_SETTINGS_OVERRIDES)) != null) {
            for (int i10 : iArr) {
                if (i10 == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public CameraCharacteristics m18j() {
        return this.f2b.mo19a();
    }
}
