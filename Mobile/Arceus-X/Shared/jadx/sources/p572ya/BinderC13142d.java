package p572ya;

import com.google.android.gms.auth.api.identity.SavePasswordResult;
import com.google.android.gms.common.api.Status;
import p268l9.C8081v;
import sb.C11264k;

/* JADX INFO: renamed from: ya.d */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC13142d extends AbstractBinderC13147f0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C11264k f46395a;

    public BinderC13142d(C13144e c13144e, C11264k c11264k) {
        this.f46395a = c11264k;
    }

    @Override // p572ya.InterfaceC13149g0
    /* JADX INFO: renamed from: X1 */
    public final void mo48748X1(Status status, SavePasswordResult savePasswordResult) {
        C8081v.m33290a(status, savePasswordResult, this.f46395a);
    }
}
