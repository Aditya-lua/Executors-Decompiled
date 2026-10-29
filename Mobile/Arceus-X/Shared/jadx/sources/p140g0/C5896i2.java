package p140g0;

import androidx.camera.core.AbstractC0492b;
import androidx.camera.core.InterfaceC0494d;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: g0.i2 */
/* JADX INFO: loaded from: classes.dex */
public final class C5896i2 extends AbstractC0492b {

    /* JADX INFO: renamed from: d */
    public final AtomicBoolean f22534d;

    public C5896i2(InterfaceC0494d interfaceC0494d) {
        super(interfaceC0494d);
        this.f22534d = new AtomicBoolean(false);
    }

    @Override // androidx.camera.core.AbstractC0492b, androidx.camera.core.InterfaceC0494d, java.lang.AutoCloseable
    public void close() {
        if (this.f22534d.getAndSet(true)) {
            return;
        }
        super.close();
    }
}
