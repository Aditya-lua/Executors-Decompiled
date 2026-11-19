package a0;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class s0 extends r0 {
    public s0(Context context) {
        super(context);
    }

    @Override // a0.t0, a0.p0.b
    public Set<Set<String>> d() throws f {
        try {
            return this.f57a.getConcurrentCameraIds();
        } catch (CameraAccessException e10) {
            throw f.e(e10);
        }
    }
}
