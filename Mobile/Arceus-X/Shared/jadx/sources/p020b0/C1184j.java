package p020b0;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;

/* JADX INFO: renamed from: b0.j */
/* JADX INFO: loaded from: classes.dex */
public class C1184j extends C1188n {
    public C1184j(Object obj) {
        super(obj);
    }

    @Override // p020b0.C1183i.a
    public Surface getSurface() {
        return ((OutputConfiguration) mo6573h()).getSurface();
    }

    @Override // p020b0.C1183i.a
    /* JADX INFO: renamed from: h */
    public Object mo6573h() {
        throw null;
    }
}
