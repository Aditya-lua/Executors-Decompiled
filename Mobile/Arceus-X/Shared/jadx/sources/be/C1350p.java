package be;

import android.os.Build;

/* JADX INFO: renamed from: be.p */
/* JADX INFO: loaded from: classes2.dex */
public final class C1350p {
    /* JADX INFO: renamed from: a */
    public static InterfaceC1347o m7200a() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 != 26) {
            return (i10 == 27 && Build.VERSION.PREVIEW_SDK_INT == 0) ? new C1306a0() : new C1312c0();
        }
        return new C1377z();
    }
}
