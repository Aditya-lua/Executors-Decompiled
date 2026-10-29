package p063d0;

import androidx.camera.camera2.internal.compat.quirk.ConfigureSurfaceToSecondarySessionFailQuirk;
import androidx.camera.camera2.internal.compat.quirk.PreviewOrientationIncorrectQuirk;
import androidx.camera.camera2.internal.compat.quirk.TextureViewIsClosedQuirk;
import java.util.Iterator;
import java.util.List;
import p140g0.C5931r1;
import p296n0.AbstractC8830u1;
import p296n0.C8782k3;

/* JADX INFO: renamed from: d0.i */
/* JADX INFO: loaded from: classes.dex */
public class C4378i {

    /* JADX INFO: renamed from: a */
    public final boolean f18230a;

    /* JADX INFO: renamed from: b */
    public final boolean f18231b;

    /* JADX INFO: renamed from: c */
    public final boolean f18232c;

    public C4378i(C8782k3 c8782k3, C8782k3 c8782k4) {
        this.f18230a = c8782k4.m35233a(TextureViewIsClosedQuirk.class);
        this.f18231b = c8782k3.m35233a(PreviewOrientationIncorrectQuirk.class);
        this.f18232c = c8782k3.m35233a(ConfigureSurfaceToSecondarySessionFailQuirk.class);
    }

    /* JADX INFO: renamed from: a */
    public void m22038a(List<AbstractC8830u1> list) {
        if (!m22039b() || list == null) {
            return;
        }
        Iterator<AbstractC8830u1> it = list.iterator();
        while (it.hasNext()) {
            it.next().mo35430d();
        }
        C5931r1.m26561a("ForceCloseDeferrableSurface", "deferrableSurface closed");
    }

    /* JADX INFO: renamed from: b */
    public boolean m22039b() {
        return this.f18230a || this.f18231b || this.f18232c;
    }
}
