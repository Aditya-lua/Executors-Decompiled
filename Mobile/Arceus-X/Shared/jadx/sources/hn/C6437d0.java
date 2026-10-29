package hn;

import com.withpersona.sdk2.camera.camera2.Camera2PreviewView;
import mn.EnumC8598a;
import org.jetbrains.annotations.Nullable;
import p136ft.C5831e;
import p136ft.InterfaceC5835i;
import p476ur.InterfaceC11932a;

/* JADX INFO: renamed from: hn.d0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6437d0 implements C6433b0.a {

    /* JADX INFO: renamed from: a */
    public final C6435c0 f24425a;

    public C6437d0(C6435c0 c6435c0) {
        this.f24425a = c6435c0;
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC5835i<C6433b0.a> m28071b(C6435c0 c6435c0) {
        return C5831e.m26182a(new C6437d0(c6435c0));
    }

    @Override // hn.C6433b0.a
    /* JADX INFO: renamed from: a */
    public C6433b0 mo28046a(CameraChoices cameraChoices, Camera2PreviewView camera2PreviewView, InterfaceC6442g interfaceC6442g, EnumC8598a enumC8598a, @Nullable InterfaceC11932a interfaceC11932a, boolean z10) {
        return this.f24425a.m28070b(cameraChoices, camera2PreviewView, interfaceC6442g, enumC8598a, interfaceC11932a, z10);
    }
}
