package p001a0;

import android.hardware.camera2.CameraCharacteristics;

/* JADX INFO: renamed from: a0.y */
/* JADX INFO: loaded from: classes.dex */
public class C0050y implements C0008c0.a {

    /* JADX INFO: renamed from: a */
    public final CameraCharacteristics f97a;

    public C0050y(CameraCharacteristics cameraCharacteristics) {
        this.f97a = cameraCharacteristics;
    }

    @Override // p001a0.C0008c0.a
    /* JADX INFO: renamed from: a */
    public CameraCharacteristics mo19a() {
        return this.f97a;
    }

    @Override // p001a0.C0008c0.a
    /* JADX INFO: renamed from: b */
    public <T> T mo20b(CameraCharacteristics.Key<T> key) {
        return (T) this.f97a.get(key);
    }
}
