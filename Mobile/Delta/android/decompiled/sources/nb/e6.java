package nb;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* JADX INFO: loaded from: classes.dex */
public final class e6 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final me f26302a;
    public boolean b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f26303c;

    public e6(me meVar) {
        n9.m.l(meVar);
        this.f26302a = meVar;
    }

    public final void a() {
        me meVar = this.f26302a;
        meVar.O0();
        meVar.b().h();
        if (this.b) {
            return;
        }
        meVar.d().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        this.f26303c = meVar.E0().m();
        meVar.a().w().b("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.f26303c));
        this.b = true;
    }

    public final void b() {
        me meVar = this.f26302a;
        meVar.O0();
        meVar.b().h();
        meVar.b().h();
        if (this.b) {
            meVar.a().w().a("Unregistering connectivity change receiver");
            this.b = false;
            this.f26303c = false;
            try {
                meVar.d().unregisterReceiver(this);
            } catch (IllegalArgumentException e10) {
                this.f26302a.a().o().b("Failed to unregister the network broadcast receiver", e10);
            }
        }
    }

    public final /* synthetic */ me c() {
        return this.f26302a;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        me meVar = this.f26302a;
        meVar.O0();
        String action = intent.getAction();
        meVar.a().w().b("NetworkBroadcastReceiver received action", action);
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            meVar.a().r().b("NetworkBroadcastReceiver received unknown action", action);
            return;
        }
        boolean zM = meVar.E0().m();
        if (this.f26303c != zM) {
            this.f26303c = zM;
            meVar.b().t(new d6(this, zM));
        }
    }
}
