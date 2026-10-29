package ab;

import com.google.android.gms.auth.blockstore.RetrieveBytesResponse;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
public final class w extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sb.k f310a;

    public w(b bVar, sb.k kVar) {
        this.f310a = kVar;
    }

    @Override // ab.n
    public final void d1(Status status, RetrieveBytesResponse retrieveBytesResponse) {
        l9.v.a(status, retrieveBytesResponse, this.f310a);
    }
}
