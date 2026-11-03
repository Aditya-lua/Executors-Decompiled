package d9;

import android.os.Bundle;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;

/* JADX INFO: loaded from: classes.dex */
public final class x implements m4.a.InterfaceC0435a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SignInHubActivity f14484a;

    public /* synthetic */ x(SignInHubActivity signInHubActivity, w wVar) {
        this.f14484a = signInHubActivity;
    }

    @Override // m4.a.InterfaceC0435a
    public final /* bridge */ /* synthetic */ void a(n4.b bVar, Object obj) {
        SignInHubActivity signInHubActivity = this.f14484a;
        signInHubActivity.setResult(signInHubActivity.F, signInHubActivity.G);
        this.f14484a.finish();
    }

    @Override // m4.a.InterfaceC0435a
    public final n4.b b(int i10, Bundle bundle) {
        return new f(this.f14484a, k9.f.b());
    }

    @Override // m4.a.InterfaceC0435a
    public final void c(n4.b bVar) {
    }
}
