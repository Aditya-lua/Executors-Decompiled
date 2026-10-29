package d9;

import android.os.Bundle;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;

/* JADX INFO: loaded from: classes.dex */
public final class x implements m4.a.InterfaceC0421a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SignInHubActivity f14504a;

    public /* synthetic */ x(SignInHubActivity signInHubActivity, w wVar) {
        this.f14504a = signInHubActivity;
    }

    @Override // m4.a.InterfaceC0421a
    public final /* bridge */ /* synthetic */ void a(n4.b bVar, Object obj) {
        SignInHubActivity signInHubActivity = this.f14504a;
        signInHubActivity.setResult(signInHubActivity.F, signInHubActivity.G);
        this.f14504a.finish();
    }

    @Override // m4.a.InterfaceC0421a
    public final n4.b b(int i10, Bundle bundle) {
        return new f(this.f14504a, k9.f.b());
    }

    @Override // m4.a.InterfaceC0421a
    public final void c(n4.b bVar) {
    }
}
