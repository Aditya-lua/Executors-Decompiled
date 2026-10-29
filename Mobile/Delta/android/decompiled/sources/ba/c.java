package ba;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import eb.u4;
import l9.v;
import sb.k;

/* JADX INFO: loaded from: classes.dex */
public final class c extends u4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f4060a;

    public c(a aVar, k kVar) {
        this.f4060a = kVar;
    }

    @Override // eb.v4
    public final void C0(Status status, PendingIntent pendingIntent) {
        v.a(status, pendingIntent, this.f4060a);
    }
}
