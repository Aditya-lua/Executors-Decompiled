package hn;

import com.withpersona.sdk2.camera.camera2.Camera2PreviewView;
import mn.EnumC8598a;
import org.jetbrains.annotations.Nullable;
import p136ft.C5831e;
import p136ft.InterfaceC5835i;
import p476ur.InterfaceC11932a;

/* JADX INFO: renamed from: hn.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C6440f implements C6434c.a {

    /* JADX INFO: renamed from: a */
    public final C6438e f24430a;

    public C6440f(C6438e c6438e) {
        this.f24430a = c6438e;
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC5835i<C6434c.a> m28077b(C6438e c6438e) {
        return C5831e.m26182a(new C6440f(c6438e));
    }

    @Override // hn.C6434c.a
    /* JADX INFO: renamed from: a */
    public C6434c mo28063a(CameraChoices cameraChoices, Camera2PreviewView camera2PreviewView, InterfaceC6442g interfaceC6442g, EnumC8598a enumC8598a, @Nullable InterfaceC11932a interfaceC11932a, boolean z10) {
        return this.f24430a.m28074b(cameraChoices, camera2PreviewView, interfaceC6442g, enumC8598a, interfaceC11932a, z10);
    }
}
