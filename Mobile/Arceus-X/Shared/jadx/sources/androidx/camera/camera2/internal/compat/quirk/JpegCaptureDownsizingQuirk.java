package androidx.camera.camera2.internal.compat.quirk;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.camera.core.internal.compat.quirk.SoftwareJpegEncodingPreferredQuirk;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import p001a0.C0008c0;

/* JADX INFO: loaded from: classes.dex */
public class JpegCaptureDownsizingQuirk implements SoftwareJpegEncodingPreferredQuirk {

    /* JADX INFO: renamed from: a */
    public static final Set<String> f1751a = new HashSet(Arrays.asList("redmi note 8 pro"));

    /* JADX INFO: renamed from: g */
    public static boolean m2124g(C0008c0 c0008c0) {
        return f1751a.contains(Build.MODEL.toLowerCase(Locale.US)) && ((Integer) c0008c0.m9a(CameraCharacteristics.LENS_FACING)).intValue() == 0;
    }
}
