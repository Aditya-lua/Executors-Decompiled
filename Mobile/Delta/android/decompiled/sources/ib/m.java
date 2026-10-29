package ib;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class m implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o f20456a;

    public /* synthetic */ m(o oVar, n nVar) {
        Objects.requireNonNull(oVar);
        this.f20456a = oVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        o oVar = this.f20456a;
        oVar.b.c("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        oVar.c().post(new k(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        o oVar = this.f20456a;
        oVar.b.c("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        oVar.c().post(new l(this));
    }
}
