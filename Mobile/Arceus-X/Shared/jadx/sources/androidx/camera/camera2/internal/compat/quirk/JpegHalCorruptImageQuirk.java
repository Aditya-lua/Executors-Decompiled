package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.internal.compat.quirk.SoftwareJpegEncodingPreferredQuirk;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import p001a0.C0008c0;

/* JADX INFO: loaded from: classes.dex */
public final class JpegHalCorruptImageQuirk implements SoftwareJpegEncodingPreferredQuirk {

    /* JADX INFO: renamed from: a */
    public static final Set<String> f1752a = new HashSet(Arrays.asList("heroqltevzw", "heroqltetmo", "k61v1_basic_ref"));

    /* JADX INFO: renamed from: g */
    public static boolean m2125g(C0008c0 c0008c0) {
        return f1752a.contains(Build.DEVICE.toLowerCase(Locale.US));
    }
}
