package e9;

import android.os.Bundle;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;

/* JADX INFO: loaded from: classes.dex */
public final class y implements n4.a.InterfaceC0490a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SignInHubActivity f13256a;

    public /* synthetic */ y(SignInHubActivity signInHubActivity, x xVar) {
        this.f13256a = signInHubActivity;
    }

    @Override // n4.a.InterfaceC0490a
    public final /* bridge */ /* synthetic */ void a(o4.b bVar, Object obj) {
        SignInHubActivity signInHubActivity = this.f13256a;
        signInHubActivity.setResult(signInHubActivity.F, signInHubActivity.G);
        this.f13256a.finish();
    }

    @Override // n4.a.InterfaceC0490a
    public final o4.b b(int i10, Bundle bundle) {
        return new g(this.f13256a, l9.h.b());
    }

    @Override // n4.a.InterfaceC0490a
    public final void c(o4.b bVar) {
    }
}
