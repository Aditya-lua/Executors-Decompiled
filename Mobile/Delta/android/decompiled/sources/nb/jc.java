package nb;

import android.content.ComponentName;
import android.content.Context;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class jc implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nc f26462a;

    public jc(nc ncVar) {
        Objects.requireNonNull(ncVar);
        this.f26462a = ncVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        tc tcVar = this.f26462a.f26622c;
        g7 g7Var = tcVar.f26446a;
        Context contextD = g7Var.d();
        g7Var.c();
        tcVar.K(new ComponentName(contextD, "com.google.android.gms.measurement.AppMeasurementService"));
    }
}
