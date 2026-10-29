package ka;

import android.content.Intent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.internal.v2.appshortcuts.zzg;

/* JADX INFO: loaded from: classes.dex */
public class k extends s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sb.k f22291a;

    public k(sb.k kVar) {
        this.f22291a = kVar;
    }

    public void B1(zzg zzgVar) {
        N0(new Status(10));
    }

    @Override // ka.t
    public final void N0(Status status) {
        this.f22291a.d(n9.a.a(status));
    }

    public void g(Intent intent) {
        N0(new Status(10));
    }
}
