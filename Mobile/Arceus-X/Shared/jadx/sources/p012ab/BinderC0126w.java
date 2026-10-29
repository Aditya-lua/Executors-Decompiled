package p012ab;

import com.google.android.gms.auth.blockstore.RetrieveBytesResponse;
import com.google.android.gms.common.api.Status;
import p268l9.C8081v;
import sb.C11264k;

/* JADX INFO: renamed from: ab.w */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC0126w extends BinderC0109f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C11264k f385a;

    public BinderC0126w(C0105b c0105b, C11264k c11264k) {
        this.f385a = c11264k;
    }

    @Override // p012ab.InterfaceC0117n
    /* JADX INFO: renamed from: a1 */
    public final void mo321a1(Status status, RetrieveBytesResponse retrieveBytesResponse) {
        C8081v.m33290a(status, retrieveBytesResponse, this.f385a);
    }
}
