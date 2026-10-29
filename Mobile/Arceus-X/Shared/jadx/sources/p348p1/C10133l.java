package p348p1;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import androidx.p616lifecycle.InterfaceC0980s;
import p140g0.C5956x2;
import p140g0.InterfaceC5905l;
import p347p0.C10110z;

/* JADX INFO: renamed from: p1.l */
/* JADX INFO: loaded from: classes.dex */
public final class C10133l extends AbstractC10127i {

    /* JADX INFO: renamed from: R */
    public InterfaceC0980s f36483R;

    public C10133l(Context context) {
        super(context);
    }

    @Override // p348p1.AbstractC10127i
    /* JADX INFO: renamed from: K */
    public InterfaceC5905l mo39038K() {
        if (this.f36483R == null) {
            Log.d("CamLifecycleController", "Lifecycle is not set.");
            return null;
        }
        if (this.f36468v == null) {
            Log.d("CamLifecycleController", "CameraProvider is not ready.");
            return null;
        }
        C5956x2 c5956x2M39058j = m39058j();
        if (c5956x2M39058j == null) {
            return null;
        }
        try {
            return this.f36468v.mo39089b(this.f36483R, this.f36447a, c5956x2M39058j);
        } catch (IllegalArgumentException e10) {
            throw new IllegalStateException("The selected camera does not support the enabled use cases. Please disable use case and/or select a different camera. e.g. #setVideoCaptureEnabled(false)", e10);
        }
    }

    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: X */
    public void m39080X(InterfaceC0980s interfaceC0980s) {
        C10110z.m39008b();
        this.f36483R = interfaceC0980s;
        m39039L();
    }
}
