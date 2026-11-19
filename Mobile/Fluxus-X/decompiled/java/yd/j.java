package yd;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class j extends zd.j {
    public final /* synthetic */ tb.k b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f37722c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(m mVar, tb.k kVar, tb.k kVar2) {
        super(kVar);
        this.b = kVar2;
        this.f37722c = mVar;
    }

    @Override // zd.j
    public final void a() {
        try {
            zd.f fVar = (zd.f) this.f37722c.f37726a.e();
            String str = this.f37722c.b;
            Bundle bundle = new Bundle();
            Map mapA = n.a();
            bundle.putInt("playcore_version_code", ((Integer) mapA.get("java")).intValue());
            if (mapA.containsKey("native")) {
                bundle.putInt("playcore_native_version", ((Integer) mapA.get("native")).intValue());
            }
            if (mapA.containsKey("unity")) {
                bundle.putInt("playcore_unity_version", ((Integer) mapA.get("unity")).intValue());
            }
            m mVar = this.f37722c;
            fVar.x0(str, bundle, new l(mVar, this.b, mVar.b));
        } catch (RemoteException e10) {
            m.f37725c.b(e10, "error requesting in-app review for %s", this.f37722c.b);
            this.b.d(new RuntimeException(e10));
        }
    }
}
