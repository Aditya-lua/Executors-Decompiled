package wd;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.Map;
import sb.k;
import xd.j;

/* JADX INFO: loaded from: classes2.dex */
public final class e extends j {
    public final /* synthetic */ k b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f34365c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, k kVar, k kVar2) {
        super(kVar);
        this.b = kVar2;
        this.f34365c = gVar;
    }

    @Override // xd.j
    public final void a() {
        try {
            xd.f fVar = (xd.f) this.f34365c.f34369a.e();
            String str = this.f34365c.b;
            Bundle bundle = new Bundle();
            Map mapA = h.a();
            bundle.putInt("playcore_version_code", ((Integer) mapA.get("java")).intValue());
            if (mapA.containsKey("native")) {
                bundle.putInt("playcore_native_version", ((Integer) mapA.get("native")).intValue());
            }
            if (mapA.containsKey("unity")) {
                bundle.putInt("playcore_unity_version", ((Integer) mapA.get("unity")).intValue());
            }
            g gVar = this.f34365c;
            fVar.r1(str, bundle, new com.google.android.play.core.review.c(gVar, this.b, gVar.b));
        } catch (RemoteException e10) {
            g.f34368c.b(e10, "error requesting in-app review for %s", this.f34365c.b);
            this.b.d(new RuntimeException(e10));
        }
    }
}
