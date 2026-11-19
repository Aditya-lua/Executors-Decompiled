package ob;

import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes.dex */
public final class u6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t6 f27839a;

    public u6(t6 t6Var) {
        o9.s.l(t6Var);
        this.f27839a = t6Var;
    }

    public final void a(Context context, Intent intent) {
        l7 l7VarO = l7.O(context, null, null);
        b6 b6VarA = l7VarO.a();
        if (intent == null) {
            b6VarA.r().a("Receiver called with null intent");
            return;
        }
        l7VarO.c();
        String action = intent.getAction();
        b6VarA.w().b("Local receiver got", action);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
                b6VarA.r().a("Install Referrer Broadcasts are deprecated");
            }
        } else {
            Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
            className.setAction("com.google.android.gms.measurement.UPLOAD");
            b6VarA.w().a("Starting wakeful intent.");
            this.f27839a.a(context, className);
        }
    }
}
