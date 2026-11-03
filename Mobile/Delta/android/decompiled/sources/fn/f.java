package fn;

import com.withpersona.sdk2.camera.camera2.Camera2PreviewView;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements c.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f17374a;

    public f(e eVar) {
        this.f17374a = eVar;
    }

    public static dt.i<c.a> b(e eVar) {
        return dt.e.a(new f(eVar));
    }

    @Override // fn.c.a
    public c a(CameraChoices cameraChoices, Camera2PreviewView camera2PreviewView, g gVar, kn.a aVar, @Nullable sr.a aVar2, boolean z10) {
        return this.f17374a.b(cameraChoices, camera2PreviewView, gVar, aVar, aVar2, z10);
    }
}
