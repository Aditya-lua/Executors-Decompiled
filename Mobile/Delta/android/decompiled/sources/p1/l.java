package p1;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import g0.x2;

/* JADX INFO: loaded from: classes.dex */
public final class l extends i {
    public androidx.p000lifecycle.s R;

    public l(Context context) {
        super(context);
    }

    @Override // p1.i
    public g0.l K() {
        if (this.R == null) {
            Log.d("CamLifecycleController", "Lifecycle is not set.");
            return null;
        }
        if (this.f28163v == null) {
            Log.d("CamLifecycleController", "CameraProvider is not ready.");
            return null;
        }
        x2 x2VarJ = j();
        if (x2VarJ == null) {
            return null;
        }
        try {
            return this.f28163v.b(this.R, this.f28143a, x2VarJ);
        } catch (IllegalArgumentException e10) {
            throw new IllegalStateException("The selected camera does not support the enabled use cases. Please disable use case and/or select a different camera. e.g. #setVideoCaptureEnabled(false)", e10);
        }
    }

    @SuppressLint({"MissingPermission"})
    public void X(androidx.p000lifecycle.s sVar) {
        p0.z.b();
        this.R = sVar;
        L();
    }
}
