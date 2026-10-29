package p063d0;

import androidx.camera.camera2.internal.compat.quirk.CaptureSessionStuckWhenCreatingBeforeClosingCameraQuirk;
import androidx.camera.camera2.internal.compat.quirk.LegacyCameraOutputConfigNullPointerQuirk;
import p296n0.C8782k3;

/* JADX INFO: renamed from: d0.c */
/* JADX INFO: loaded from: classes.dex */
public class C4372c {
    /* JADX INFO: renamed from: a */
    public static boolean m22027a(C8782k3 c8782k3) {
        return c8782k3.m35233a(LegacyCameraOutputConfigNullPointerQuirk.class) || c8782k3.m35233a(CaptureSessionStuckWhenCreatingBeforeClosingCameraQuirk.class);
    }
}
