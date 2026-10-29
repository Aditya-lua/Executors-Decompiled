package p037c1;

import android.content.Context;
import android.hardware.camera2.CameraManager;

/* JADX INFO: renamed from: c1.c */
/* JADX INFO: loaded from: classes.dex */
public class C1504c implements InterfaceC1507f {

    /* JADX INFO: renamed from: a */
    public final CameraManager f5780a;

    public C1504c(Context context) {
        this.f5780a = (CameraManager) context.getSystemService(CameraManager.class);
    }

    @Override // p037c1.InterfaceC1507f
    /* JADX INFO: renamed from: a */
    public InterfaceC1505d mo7658a(String str) {
        return new C1503b(this.f5780a, str);
    }
}
