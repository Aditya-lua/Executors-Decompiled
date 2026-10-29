package d0;

import androidx.camera.camera2.internal.compat.quirk.ConfigureSurfaceToSecondarySessionFailQuirk;
import androidx.camera.camera2.internal.compat.quirk.PreviewOrientationIncorrectQuirk;
import androidx.camera.camera2.internal.compat.quirk.TextureViewIsClosedQuirk;
import g0.r1;
import java.util.Iterator;
import java.util.List;
import n0.k3;
import n0.u1;

/* JADX INFO: loaded from: classes.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f14252a;
    public final boolean b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f14253c;

    public i(k3 k3Var, k3 k3Var2) {
        this.f14252a = k3Var2.a(TextureViewIsClosedQuirk.class);
        this.b = k3Var.a(PreviewOrientationIncorrectQuirk.class);
        this.f14253c = k3Var.a(ConfigureSurfaceToSecondarySessionFailQuirk.class);
    }

    public void a(List<u1> list) {
        if (!b() || list == null) {
            return;
        }
        Iterator<u1> it = list.iterator();
        while (it.hasNext()) {
            it.next().d();
        }
        r1.a("ForceCloseDeferrableSurface", "deferrableSurface closed");
    }

    public boolean b() {
        return this.f14252a || this.b || this.f14253c;
    }
}
