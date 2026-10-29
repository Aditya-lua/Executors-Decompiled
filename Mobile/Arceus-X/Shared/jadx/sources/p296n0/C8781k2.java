package p296n0;

import android.util.Size;
import android.view.Surface;
import ne.InterfaceFutureC9440x;
import p397r0.C10773n;

/* JADX INFO: renamed from: n0.k2 */
/* JADX INFO: loaded from: classes.dex */
public final class C8781k2 extends AbstractC8830u1 {

    /* JADX INFO: renamed from: o */
    public final Surface f31934o;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C8781k2(Surface surface, Size size, int i10) {
        super(size, i10);
        this.f31934o = surface;
    }

    @Override // p296n0.AbstractC8830u1
    /* JADX INFO: renamed from: o */
    public InterfaceFutureC9440x<Surface> mo26666o() {
        return C10773n.m40993p(this.f31934o);
    }

    public C8781k2(Surface surface) {
        this.f31934o = surface;
    }
}
