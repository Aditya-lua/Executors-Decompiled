package p063d0;

import android.util.Size;
import androidx.camera.camera2.internal.compat.quirk.SmallDisplaySizeQuirk;
import p036c0.C1500e;

/* JADX INFO: renamed from: d0.d */
/* JADX INFO: loaded from: classes.dex */
public class C4373d {

    /* JADX INFO: renamed from: a */
    public final SmallDisplaySizeQuirk f18226a = (SmallDisplaySizeQuirk) C1500e.m7653b(SmallDisplaySizeQuirk.class);

    /* JADX INFO: renamed from: a */
    public Size m22028a() {
        SmallDisplaySizeQuirk smallDisplaySizeQuirk = this.f18226a;
        if (smallDisplaySizeQuirk != null) {
            return smallDisplaySizeQuirk.m2146g();
        }
        return null;
    }
}
