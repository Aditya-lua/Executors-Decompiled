package p072d9;

import android.os.Bundle;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import p242k9.AbstractC7496f;
import p285m4.AbstractC8422a;
import p300n4.C8882b;

/* JADX INFO: renamed from: d9.x */
/* JADX INFO: loaded from: classes.dex */
public final class C4496x implements AbstractC8422a.a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ SignInHubActivity f18530a;

    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [com.google.android.gms.auth.api.signin.internal.SignInHubActivity.u1():void] */
    public /* synthetic */ C4496x(SignInHubActivity signInHubActivity, C4495w c4495w) {
        this.f18530a = signInHubActivity;
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.google.android.gms.auth.api.signin.internal.SignInHubActivity.s1(com.google.android.gms.auth.api.signin.internal.SignInHubActivity):int */
    @Override // p285m4.AbstractC8422a.a
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo22452a(C8882b c8882b, Object obj) {
        SignInHubActivity signInHubActivity = this.f18530a;
        signInHubActivity.setResult(signInHubActivity.f7342F, signInHubActivity.f7343G);
        this.f18530a.finish();
    }

    @Override // p285m4.AbstractC8422a.a
    /* JADX INFO: renamed from: b */
    public final C8882b mo22453b(int i10, Bundle bundle) {
        return new C4478f(this.f18530a, AbstractC7496f.m31154b());
    }

    @Override // p285m4.AbstractC8422a.a
    /* JADX INFO: renamed from: c */
    public final void mo22454c(C8882b c8882b) {
    }
}
