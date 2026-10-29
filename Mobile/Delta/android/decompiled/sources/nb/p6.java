package nb;

import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes.dex */
public final class p6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o6 f25847a;

    public p6(o6 o6Var) {
        n9.m.l(o6Var);
        this.f25847a = o6Var;
    }

    public final void a(Context context, Intent intent) {
        g7 g7VarO = g7.O(context, null, null);
        w5 w5VarA = g7VarO.a();
        if (intent == null) {
            w5VarA.r().a("Receiver called with null intent");
            return;
        }
        g7VarO.c();
        String action = intent.getAction();
        w5VarA.w().b("Local receiver got", action);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
                w5VarA.r().a("Install Referrer Broadcasts are deprecated");
            }
        } else {
            Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
            className.setAction("com.google.android.gms.measurement.UPLOAD");
            w5VarA.w().a("Starting wakeful intent.");
            this.f25847a.a(context, className);
        }
    }
}
