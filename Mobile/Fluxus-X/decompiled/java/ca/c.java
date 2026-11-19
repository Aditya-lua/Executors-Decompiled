package ca;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import fb.u4;
import m9.v;
import tb.k;

/* JADX INFO: loaded from: classes.dex */
public final class c extends u4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f4943a;

    public c(a aVar, k kVar) {
        this.f4943a = kVar;
    }

    @Override // fb.v4
    public final void E0(Status status, PendingIntent pendingIntent) {
        v.a(status, pendingIntent, this.f4943a);
    }
}
