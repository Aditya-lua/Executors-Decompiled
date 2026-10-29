package p063d0;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.internal.compat.quirk.StillCaptureFlashStopRepeatingQuirk;
import java.util.Iterator;
import java.util.List;
import p036c0.C1500e;

/* JADX INFO: renamed from: d0.v */
/* JADX INFO: loaded from: classes.dex */
public class C4391v {

    /* JADX INFO: renamed from: a */
    public final boolean f18251a;

    public C4391v() {
        this.f18251a = ((StillCaptureFlashStopRepeatingQuirk) C1500e.m7653b(StillCaptureFlashStopRepeatingQuirk.class)) != null;
    }

    /* JADX INFO: renamed from: a */
    public boolean m22063a(List<CaptureRequest> list, boolean z10) {
        if (this.f18251a && z10) {
            Iterator<CaptureRequest> it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next().get(CaptureRequest.CONTROL_AE_MODE)).intValue();
                if (iIntValue == 2 || iIntValue == 3) {
                    return true;
                }
            }
        }
        return false;
    }
}
