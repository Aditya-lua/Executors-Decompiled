package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import n0.g3;

/* JADX INFO: loaded from: classes.dex */
public class TorchIsClosedAfterImageCapturingQuirk implements g3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List<String> f1347a = Arrays.asList("mi a1", "mi a2", "mi a2 lite", "redmi 4x", "redmi 5a", "redmi note 5", "redmi note 5 pro", "redmi 6 pro", "redmi note 6 pro");

    public static boolean g() {
        return f1347a.contains(Build.MODEL.toLowerCase(Locale.US));
    }
}
