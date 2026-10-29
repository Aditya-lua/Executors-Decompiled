package v7;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class e1 implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.android.billingclient.api.g f32783a;

    public /* synthetic */ e1(com.android.billingclient.api.g gVar, f1 f1Var) {
        Objects.requireNonNull(gVar);
        this.f32783a = gVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        com.google.android.gms.internal.play_billing.m0.l("BillingClientTesting", "Billing Override Service connected.");
        com.android.billingclient.api.g gVar = this.f32783a;
        gVar.P = com.google.android.gms.internal.play_billing.k.u2(iBinder);
        gVar.O = 2;
        gVar.h1(26);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        com.google.android.gms.internal.play_billing.m0.m("BillingClientTesting", "Billing Override Service disconnected.");
        com.android.billingclient.api.g gVar = this.f32783a;
        gVar.P = null;
        gVar.O = 0;
    }
}
