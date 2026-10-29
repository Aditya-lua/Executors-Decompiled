package p306nb;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import p305n9.C8953m;

/* JADX INFO: renamed from: nb.e6 */
/* JADX INFO: loaded from: classes.dex */
public final class C9060e6 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public final C9197me f32879a;

    /* JADX INFO: renamed from: b */
    public boolean f32880b;

    /* JADX INFO: renamed from: c */
    public boolean f32881c;

    public C9060e6(C9197me c9197me) {
        C8953m.m36047l(c9197me);
        this.f32879a = c9197me;
    }

    /* JADX INFO: renamed from: a */
    public final void m36289a() {
        C9197me c9197me = this.f32879a;
        c9197me.m36523O0();
        c9197me.mo36322b().mo36088h();
        if (this.f32880b) {
            return;
        }
        c9197me.mo36324d().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        this.f32881c = c9197me.m36506E0().m36127m();
        c9197me.mo36321a().m37011w().m36912b("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.f32881c));
        this.f32880b = true;
    }

    /* JADX INFO: renamed from: b */
    public final void m36290b() {
        C9197me c9197me = this.f32879a;
        c9197me.m36523O0();
        c9197me.mo36322b().mo36088h();
        c9197me.mo36322b().mo36088h();
        if (this.f32880b) {
            c9197me.mo36321a().m37011w().m36911a("Unregistering connectivity change receiver");
            this.f32880b = false;
            this.f32881c = false;
            try {
                c9197me.mo36324d().unregisterReceiver(this);
            } catch (IllegalArgumentException e10) {
                this.f32879a.mo36321a().m37003o().m36912b("Failed to unregister the network broadcast receiver", e10);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C9197me m36291c() {
        return this.f32879a;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        C9197me c9197me = this.f32879a;
        c9197me.m36523O0();
        String action = intent.getAction();
        c9197me.mo36321a().m37011w().m36912b("NetworkBroadcastReceiver received action", action);
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            c9197me.mo36321a().m37006r().m36912b("NetworkBroadcastReceiver received unknown action", action);
            return;
        }
        boolean zM36127m = c9197me.m36506E0().m36127m();
        if (this.f32881c != zM36127m) {
            this.f32881c = zM36127m;
            c9197me.mo36322b().m36263t(new RunnableC9043d6(this, zM36127m));
        }
    }
}
