package ob;

import android.content.ComponentName;
import android.content.Context;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class oc implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sc f27657a;

    public oc(sc scVar) {
        Objects.requireNonNull(scVar);
        this.f27657a = scVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yc ycVar = this.f27657a.f27802c;
        l7 l7Var = ycVar.f27641a;
        Context contextD = l7Var.d();
        l7Var.c();
        ycVar.K(new ComponentName(contextD, "com.google.android.gms.measurement.AppMeasurementService"));
    }
}
