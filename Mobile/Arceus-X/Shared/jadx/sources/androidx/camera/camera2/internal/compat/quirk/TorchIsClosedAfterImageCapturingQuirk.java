package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import p296n0.InterfaceC8758g3;

/* JADX INFO: loaded from: classes.dex */
public class TorchIsClosedAfterImageCapturingQuirk implements InterfaceC8758g3 {

    /* JADX INFO: renamed from: a */
    public static final List<String> f1760a = Arrays.asList("mi a1", "mi a2", "mi a2 lite", "redmi 4x", "redmi 5a", "redmi note 5", "redmi note 5 pro", "redmi 6 pro", "redmi note 6 pro");

    /* JADX INFO: renamed from: g */
    public static boolean m2157g() {
        return f1760a.contains(Build.MODEL.toLowerCase(Locale.US));
    }
}
