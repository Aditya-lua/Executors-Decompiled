package g0;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class i2 extends androidx.camera.core.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f17997d;

    public i2(androidx.camera.core.d dVar) {
        super(dVar);
        this.f17997d = new AtomicBoolean(false);
    }

    @Override // androidx.camera.core.b, androidx.camera.core.d, java.lang.AutoCloseable
    public void close() {
        if (this.f17997d.getAndSet(true)) {
            return;
        }
        super.close();
    }
}
