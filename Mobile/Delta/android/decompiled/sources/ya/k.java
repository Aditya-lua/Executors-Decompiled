package ya;

import com.google.android.gms.auth.api.identity.BeginSignInResult;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
public final class k extends y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sb.k f36649a;

    public k(o oVar, sb.k kVar) {
        this.f36649a = kVar;
    }

    @Override // ya.z
    public final void C(Status status, BeginSignInResult beginSignInResult) {
        l9.v.a(status, beginSignInResult, this.f36649a);
    }
}
