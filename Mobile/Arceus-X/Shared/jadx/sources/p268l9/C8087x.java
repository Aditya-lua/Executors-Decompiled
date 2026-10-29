package p268l9;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import p242k9.AbstractC7499i;

/* JADX INFO: renamed from: l9.x */
/* JADX INFO: loaded from: classes.dex */
public final class C8087x implements AbstractC7499i.a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ BasePendingResult f30119a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C8093z f30120b;

    public C8087x(C8093z c8093z, BasePendingResult basePendingResult) {
        this.f30120b = c8093z;
        this.f30119a = basePendingResult;
    }

    @Override // p242k9.AbstractC7499i.a
    /* JADX INFO: renamed from: a */
    public final void mo31159a(Status status) {
        this.f30120b.f30130a.remove(this.f30119a);
    }
}
