package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import java.util.Arrays;
import java.util.List;
import n0.g3;

/* JADX INFO: loaded from: classes.dex */
public class Nexus4AndroidLTargetAspectRatioQuirk implements g3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List<String> f1342a = Arrays.asList("NEXUS 4");

    public static boolean h() {
        "GOOGLE".equalsIgnoreCase(Build.BRAND);
        return false;
    }

    public int g() {
        return 2;
    }
}
