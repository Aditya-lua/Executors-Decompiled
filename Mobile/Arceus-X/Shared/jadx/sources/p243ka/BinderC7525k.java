package p243ka;

import android.content.Intent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.internal.p049v2.appshortcuts.zzg;
import p305n9.C8917a;
import sb.C11264k;

/* JADX INFO: renamed from: ka.k */
/* JADX INFO: loaded from: classes.dex */
public class BinderC7525k extends AbstractBinderC7533s {

    /* JADX INFO: renamed from: a */
    public final C11264k f28875a;

    public BinderC7525k(C11264k c11264k) {
        this.f28875a = c11264k;
    }

    /* JADX INFO: renamed from: A1 */
    public void mo31174A1(zzg zzgVar) {
        mo31176J0(new Status(10));
    }

    @Override // p243ka.InterfaceC7534t
    /* JADX INFO: renamed from: J0 */
    public final void mo31176J0(Status status) {
        this.f28875a.m42329d(C8917a.m35951a(status));
    }

    /* JADX INFO: renamed from: g */
    public void mo31175g(Intent intent) {
        mo31176J0(new Status(10));
    }
}
