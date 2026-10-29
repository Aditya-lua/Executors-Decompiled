package p001a0;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import java.util.Set;

/* JADX INFO: renamed from: a0.s0 */
/* JADX INFO: loaded from: classes.dex */
public class C0040s0 extends C0038r0 {
    public C0040s0(Context context) {
        super(context);
    }

    @Override // p001a0.C0042t0, p001a0.C0034p0.b
    /* JADX INFO: renamed from: d */
    public Set<Set<String>> mo79d() throws C0013f {
        try {
            return this.f82a.getConcurrentCameraIds();
        } catch (CameraAccessException e10) {
            throw C0013f.m33e(e10);
        }
    }
}
