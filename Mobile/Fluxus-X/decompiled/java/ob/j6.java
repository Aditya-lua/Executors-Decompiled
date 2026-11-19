package ob;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* JADX INFO: loaded from: classes.dex */
public final class j6 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ve f27484a;
    public boolean b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f27485c;

    public j6(ve veVar) {
        o9.s.l(veVar);
        this.f27484a = veVar;
    }

    public final void a() {
        ve veVar = this.f27484a;
        veVar.O0();
        veVar.b().h();
        if (this.b) {
            return;
        }
        veVar.d().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        this.f27485c = veVar.E0().m();
        veVar.a().w().b("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.f27485c));
        this.b = true;
    }

    public final void b() {
        ve veVar = this.f27484a;
        veVar.O0();
        veVar.b().h();
        veVar.b().h();
        if (this.b) {
            veVar.a().w().a("Unregistering connectivity change receiver");
            this.b = false;
            this.f27485c = false;
            try {
                veVar.d().unregisterReceiver(this);
            } catch (IllegalArgumentException e10) {
                this.f27484a.a().o().b("Failed to unregister the network broadcast receiver", e10);
            }
        }
    }

    public final /* synthetic */ ve c() {
        return this.f27484a;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        ve veVar = this.f27484a;
        veVar.O0();
        String action = intent.getAction();
        veVar.a().w().b("NetworkBroadcastReceiver received action", action);
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            veVar.a().r().b("NetworkBroadcastReceiver received unknown action", action);
            return;
        }
        boolean zM = veVar.E0().m();
        if (this.f27485c != zM) {
            this.f27485c = zM;
            veVar.b().t(new i6(this, zM));
        }
    }
}
