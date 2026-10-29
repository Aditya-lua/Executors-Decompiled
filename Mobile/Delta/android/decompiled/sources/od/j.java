package od;

import android.os.Bundle;
import android.os.RemoteException;
import ib.p;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class j extends ib.e {
    public final /* synthetic */ sb.k b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f27325c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l f27326d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(l lVar, sb.k kVar, sb.k kVar2, d dVar) {
        super(kVar);
        this.b = kVar2;
        this.f27325c = dVar;
        Objects.requireNonNull(lVar);
        this.f27326d = lVar;
    }

    @Override // ib.e
    public final void a(Exception exc) {
        if (exc instanceof p) {
            super.a(new a(-5));
        } else {
            super.a(exc);
        }
    }

    @Override // ib.e
    public final void b() {
        try {
            l lVar = this.f27326d;
            pd.a aVar = (pd.a) lVar.b.e();
            String packageName = lVar.f27330a.getPackageName();
            Bundle bundle = new Bundle();
            bundle.putInt("playcore.version.code", 3);
            aVar.G0(packageName, bundle, new k(lVar, this.b));
        } catch (RemoteException e10) {
            l.f27329c.b(e10, "checkAgeSignals(%s)", this.f27325c);
            this.b.d(new a(-100));
        }
    }
}
