package p306nb;

import android.content.Context;
import android.content.Intent;
import p305n9.C8953m;

/* JADX INFO: renamed from: nb.p6 */
/* JADX INFO: loaded from: classes.dex */
public final class C9237p6 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC9221o6 f33337a;

    public C9237p6(InterfaceC9221o6 interfaceC9221o6) {
        C8953m.m36047l(interfaceC9221o6);
        this.f33337a = interfaceC9221o6;
    }

    /* JADX INFO: renamed from: a */
    public final void m36626a(Context context, Intent intent) {
        C9094g7 c9094g7M36300O = C9094g7.m36300O(context, null, null);
        C9348w5 c9348w5Mo36321a = c9094g7M36300O.mo36321a();
        if (intent == null) {
            c9348w5Mo36321a.m37006r().m36911a("Receiver called with null intent");
            return;
        }
        c9094g7M36300O.mo36323c();
        String action = intent.getAction();
        c9348w5Mo36321a.m37011w().m36912b("Local receiver got", action);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
                c9348w5Mo36321a.m37006r().m36911a("Install Referrer Broadcasts are deprecated");
            }
        } else {
            Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
            className.setAction("com.google.android.gms.measurement.UPLOAD");
            c9348w5Mo36321a.m37011w().m36911a("Starting wakeful intent.");
            this.f33337a.mo11874a(context, className);
        }
    }
}
