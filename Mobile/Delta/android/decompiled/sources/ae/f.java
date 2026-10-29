package ae;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* JADX INFO: loaded from: classes2.dex */
public final class f implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f320a;

    public /* synthetic */ f(g gVar, e eVar) {
        this.f320a = gVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f320a.b.d("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        g gVar = this.f320a;
        gVar.c().post(new c(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f320a.b.d("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        g gVar = this.f320a;
        gVar.c().post(new d(this));
    }
}
