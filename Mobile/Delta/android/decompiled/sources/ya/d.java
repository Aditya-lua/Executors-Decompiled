package ya;

import com.google.android.gms.auth.api.identity.SavePasswordResult;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
public final class d extends f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sb.k f35783a;

    public d(e eVar, sb.k kVar) {
        this.f35783a = kVar;
    }

    @Override // ya.g0
    public final void X1(Status status, SavePasswordResult savePasswordResult) {
        l9.v.a(status, savePasswordResult, this.f35783a);
    }
}
