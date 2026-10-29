package hn;

import com.withpersona.sdk2.camera.camera2.Camera2PreviewView;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class d0 implements b0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c0 f19395a;

    public d0(c0 c0Var) {
        this.f19395a = c0Var;
    }

    public static ft.i<b0.a> b(c0 c0Var) {
        return ft.e.a(new d0(c0Var));
    }

    @Override // hn.b0.a
    public b0 a(CameraChoices cameraChoices, Camera2PreviewView camera2PreviewView, g gVar, mn.a aVar, @Nullable ur.a aVar2, boolean z10) {
        return this.f19395a.b(cameraChoices, camera2PreviewView, gVar, aVar, aVar2, z10);
    }
}
