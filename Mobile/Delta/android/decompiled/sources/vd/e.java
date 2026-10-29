package vd;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.Map;
import sb.k;
import wd.j;

/* JADX INFO: loaded from: classes2.dex */
public final class e extends j {
    public final /* synthetic */ k b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f32911c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, k kVar, k kVar2) {
        super(kVar);
        this.b = kVar2;
        this.f32911c = gVar;
    }

    @Override // wd.j
    public final void a() {
        try {
            wd.f fVar = (wd.f) this.f32911c.f32915a.e();
            String str = this.f32911c.b;
            Bundle bundle = new Bundle();
            Map mapA = h.a();
            bundle.putInt("playcore_version_code", ((Integer) mapA.get("java")).intValue());
            if (mapA.containsKey("native")) {
                bundle.putInt("playcore_native_version", ((Integer) mapA.get("native")).intValue());
            }
            if (mapA.containsKey("unity")) {
                bundle.putInt("playcore_unity_version", ((Integer) mapA.get("unity")).intValue());
            }
            g gVar = this.f32911c;
            fVar.z0(str, bundle, new com.google.android.play.core.review.c(gVar, this.b, gVar.b));
        } catch (RemoteException e10) {
            g.f32914c.b(e10, "error requesting in-app review for %s", this.f32911c.b);
            this.b.d(new RuntimeException(e10));
        }
    }
}
