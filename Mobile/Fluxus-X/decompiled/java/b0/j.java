package b0;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;

/* JADX INFO: loaded from: classes.dex */
public class j extends n {
    public j(Object obj) {
        super(obj);
    }

    @Override // b0.i.a
    public Surface getSurface() {
        return ((OutputConfiguration) h()).getSurface();
    }

    @Override // b0.i.a
    public Object h() {
        throw null;
    }
}
