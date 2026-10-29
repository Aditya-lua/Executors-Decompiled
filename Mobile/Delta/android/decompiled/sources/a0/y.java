package a0;

import android.hardware.camera2.CameraCharacteristics;

/* JADX INFO: loaded from: classes.dex */
public class y implements c0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CameraCharacteristics f67a;

    public y(CameraCharacteristics cameraCharacteristics) {
        this.f67a = cameraCharacteristics;
    }

    @Override // a0.c0.a
    public CameraCharacteristics a() {
        return this.f67a;
    }

    @Override // a0.c0.a
    public <T> T b(CameraCharacteristics.Key<T> key) {
        return (T) this.f67a.get(key);
    }
}
