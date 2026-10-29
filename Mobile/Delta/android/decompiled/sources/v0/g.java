package v0;

import android.media.MediaCodec;
import androidx.camera.core.internal.compat.quirk.SurfaceOrderQuirk;
import g0.a2;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import n0.o3;
import n0.u1;

/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f32683a;

    public g() {
        this.f32683a = u0.b.b(SurfaceOrderQuirk.class) != null;
    }

    public static /* synthetic */ int a(g gVar, o3.f fVar, o3.f fVar2) {
        gVar.getClass();
        return gVar.b(fVar.f()) - gVar.b(fVar2.f());
    }

    public final int b(u1 u1Var) {
        if (u1Var.g() == MediaCodec.class) {
            return 2;
        }
        return (u1Var.g() == a2.class || u1Var.g() == b1.g.class) ? 0 : 1;
    }

    public void c(List<o3.f> list) {
        if (this.f32683a) {
            Collections.sort(list, new Comparator() { // from class: v0.f
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return g.a(this.f32682a, (o3.f) obj, (o3.f) obj2);
                }
            });
        }
    }
}
