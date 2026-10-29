package nb;

import android.content.ComponentName;
import android.content.Context;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class jc implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nc f25641a;

    public jc(nc ncVar) {
        Objects.requireNonNull(ncVar);
        this.f25641a = ncVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        tc tcVar = this.f25641a.f25801c;
        g7 g7Var = tcVar.f25625a;
        Context contextD = g7Var.d();
        g7Var.c();
        tcVar.K(new ComponentName(contextD, "com.google.android.gms.measurement.AppMeasurementService"));
    }
}
