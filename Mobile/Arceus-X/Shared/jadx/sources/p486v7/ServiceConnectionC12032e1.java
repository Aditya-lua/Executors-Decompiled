package p486v7;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.android.billingclient.api.C1751g;
import com.google.android.gms.internal.play_billing.AbstractBinderC2548k;
import com.google.android.gms.internal.play_billing.C2571m0;
import java.util.Objects;

/* JADX INFO: renamed from: v7.e1 */
/* JADX INFO: loaded from: classes.dex */
public final class ServiceConnectionC12032e1 implements ServiceConnection {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C1751g f42594a;

    public /* synthetic */ ServiceConnectionC12032e1(C1751g c1751g, C12036f1 c12036f1) {
        Objects.requireNonNull(c1751g);
        this.f42594a = c1751g;
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.android.billingclient.api.g.S0(com.android.billingclient.api.g, com.google.android.gms.internal.play_billing.m):void */
    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C2571m0.m11564l("BillingClientTesting", "Billing Override Service connected.");
        C1751g c1751g = this.f42594a;
        c1751g.f6743P = AbstractBinderC2548k.m11516u2(iBinder);
        c1751g.f6742O = 2;
        c1751g.m8673h1(26);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        C2571m0.m11565m("BillingClientTesting", "Billing Override Service disconnected.");
        C1751g c1751g = this.f42594a;
        c1751g.f6743P = null;
        c1751g.f6742O = 0;
    }
}
