package p572ya;

import com.google.android.gms.auth.api.identity.BeginSignInResult;
import com.google.android.gms.common.api.Status;
import p268l9.C8081v;
import sb.C11264k;

/* JADX INFO: renamed from: ya.k */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC13154k extends AbstractBinderC13168y {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C11264k f46407a;

    public BinderC13154k(C13158o c13158o, C11264k c11264k) {
        this.f46407a = c11264k;
    }

    @Override // p572ya.InterfaceC13169z
    /* JADX INFO: renamed from: C */
    public final void mo48755C(Status status, BeginSignInResult beginSignInResult) {
        C8081v.m33290a(status, beginSignInResult, this.f46407a);
    }
}
