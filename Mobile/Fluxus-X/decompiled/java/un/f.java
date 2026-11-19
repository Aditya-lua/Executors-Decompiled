package un;

import com.withpersona.sdk2.camera.camera2.Camera2PreviewView;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements c.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f33614a;

    public f(e eVar) {
        this.f33614a = eVar;
    }

    public static wt.i<c.a> b(e eVar) {
        return wt.e.a(new f(eVar));
    }

    @Override // un.c.a
    public c a(CameraChoices cameraChoices, Camera2PreviewView camera2PreviewView, g gVar, zn.a aVar, @Nullable ks.a aVar2, boolean z10) {
        return this.f33614a.b(cameraChoices, camera2PreviewView, gVar, aVar, aVar2, z10);
    }
}
