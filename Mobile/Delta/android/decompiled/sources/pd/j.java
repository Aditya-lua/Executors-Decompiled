package pd;

import android.os.Bundle;
import android.os.RemoteException;
import ib.p;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class j extends ib.e {
    public final /* synthetic */ sb.k b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f28653c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l f28654d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(l lVar, sb.k kVar, sb.k kVar2, d dVar) {
        super(kVar);
        this.b = kVar2;
        this.f28653c = dVar;
        Objects.requireNonNull(lVar);
        this.f28654d = lVar;
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
            l lVar = this.f28654d;
            qd.a aVar = (qd.a) lVar.b.e();
            String packageName = lVar.f28658a.getPackageName();
            Bundle bundle = new Bundle();
            bundle.putInt("playcore.version.code", 3);
            aVar.y1(packageName, bundle, new k(lVar, this.b));
        } catch (RemoteException e10) {
            l.f28657c.b(e10, "checkAgeSignals(%s)", this.f28653c);
            this.b.d(new a(-100));
        }
    }
}
