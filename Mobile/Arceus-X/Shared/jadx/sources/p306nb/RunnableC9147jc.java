package p306nb;

import android.content.ComponentName;
import android.content.Context;
import java.util.Objects;

/* JADX INFO: renamed from: nb.jc */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC9147jc implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ServiceConnectionC9211nc f33084a;

    public RunnableC9147jc(ServiceConnectionC9211nc serviceConnectionC9211nc) {
        Objects.requireNonNull(serviceConnectionC9211nc);
        this.f33084a = serviceConnectionC9211nc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C9307tc c9307tc = this.f33084a.f33281c;
        C9094g7 c9094g7 = c9307tc.f33067a;
        Context contextMo36324d = c9094g7.mo36324d();
        c9094g7.mo36323c();
        c9307tc.m36870K(new ComponentName(contextMo36324d, "com.google.android.gms.measurement.AppMeasurementService"));
    }
}
