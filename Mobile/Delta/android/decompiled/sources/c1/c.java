package c1;

import android.content.Context;
import android.hardware.camera2.CameraManager;

/* JADX INFO: loaded from: classes.dex */
public class c implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CameraManager f4317a;

    public c(Context context) {
        this.f4317a = (CameraManager) context.getSystemService(CameraManager.class);
    }

    @Override // c1.f
    public d a(String str) {
        return new b(this.f4317a, str);
    }
}
