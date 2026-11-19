package rd;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.Objects;
import jb.p;

/* JADX INFO: loaded from: classes2.dex */
public final class j extends jb.e {
    public final /* synthetic */ tb.k b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f30656c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l f30657d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(l lVar, tb.k kVar, tb.k kVar2, d dVar) {
        super(kVar);
        this.b = kVar2;
        this.f30656c = dVar;
        Objects.requireNonNull(lVar);
        this.f30657d = lVar;
    }

    @Override // jb.e
    public final void a(Exception exc) {
        if (exc instanceof p) {
            super.a(new a(-5));
        } else {
            super.a(exc);
        }
    }

    @Override // jb.e
    public final void b() {
        try {
            l lVar = this.f30657d;
            sd.a aVar = (sd.a) lVar.b.e();
            String packageName = lVar.f30661a.getPackageName();
            Bundle bundle = new Bundle();
            bundle.putInt("playcore.version.code", 3);
            aVar.R1(packageName, bundle, new k(lVar, this.b));
        } catch (RemoteException e10) {
            l.f30660c.b(e10, "checkAgeSignals(%s)", this.f30656c);
            this.b.d(new a(-100));
        }
    }
}
