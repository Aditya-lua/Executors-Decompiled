package hn;

import com.withpersona.sdk2.camera.camera2.Camera2PreviewView;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements c.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f19399a;

    public f(e eVar) {
        this.f19399a = eVar;
    }

    public static ft.i<c.a> b(e eVar) {
        return ft.e.a(new f(eVar));
    }

    @Override // hn.c.a
    public c a(CameraChoices cameraChoices, Camera2PreviewView camera2PreviewView, g gVar, mn.a aVar, @Nullable ur.a aVar2, boolean z10) {
        return this.f19399a.b(cameraChoices, camera2PreviewView, gVar, aVar, aVar2, z10);
    }
}
