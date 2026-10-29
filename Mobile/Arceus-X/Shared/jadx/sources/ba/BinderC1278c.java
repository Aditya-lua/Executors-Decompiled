package ba;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import p100eb.AbstractBinderC5019u4;
import p268l9.C8081v;
import sb.C11264k;

/* JADX INFO: renamed from: ba.c */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC1278c extends AbstractBinderC5019u4 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C11264k f5305a;

    public BinderC1278c(C1276a c1276a, C11264k c11264k) {
        this.f5305a = c11264k;
    }

    @Override // p100eb.InterfaceC5025v4
    /* JADX INFO: renamed from: y0 */
    public final void mo7059y0(Status status, PendingIntent pendingIntent) {
        C8081v.m33290a(status, pendingIntent, this.f5305a);
    }
}
