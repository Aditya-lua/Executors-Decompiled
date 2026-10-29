package p063d0;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.camera.camera2.internal.compat.quirk.FlashAvailabilityBufferUnderflowQuirk;
import java.nio.BufferUnderflowException;
import p036c0.C1500e;
import p140g0.C5931r1;

/* JADX INFO: renamed from: d0.g */
/* JADX INFO: loaded from: classes.dex */
public final class C4376g {
    /* JADX INFO: renamed from: a */
    public static boolean m22031a(InterfaceC4370b interfaceC4370b) {
        return m22032b(false, interfaceC4370b);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m22032b(boolean z10, InterfaceC4370b interfaceC4370b) {
        Boolean bool;
        try {
            bool = (Boolean) interfaceC4370b.mo22025b(CameraCharacteristics.FLASH_INFO_AVAILABLE);
        } catch (BufferUnderflowException e10) {
            if (C1500e.m7653b(FlashAvailabilityBufferUnderflowQuirk.class) != null) {
                C5931r1.m26561a("FlashAvailability", String.format("Device is known to throw an exception while checking flash availability. Flash is not available. [Manufacturer: %s, Model: %s, API Level: %d].", Build.MANUFACTURER, Build.MODEL, Integer.valueOf(Build.VERSION.SDK_INT)));
            } else {
                C5931r1.m26564d("FlashAvailability", String.format("Exception thrown while checking for flash availability on device not known to throw exceptions during this check. Please file an issue at https://issuetracker.google.com/issues/new?component=618491&template=1257717 with this error message [Manufacturer: %s, Model: %s, API Level: %d].\nFlash is not available.", Build.MANUFACTURER, Build.MODEL, Integer.valueOf(Build.VERSION.SDK_INT)), e10);
            }
            if (z10) {
                throw e10;
            }
            bool = Boolean.FALSE;
        }
        if (bool == null) {
            C5931r1.m26572l("FlashAvailability", "Characteristics did not contain key FLASH_INFO_AVAILABLE. Flash is not available.");
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }
}
