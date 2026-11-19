package e9;

import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
public final class k extends n {
    public k(l9.h hVar) {
        super(hVar);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ l9.p e(Status status) {
        return status;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.a
    public final /* bridge */ /* synthetic */ void n(l9.a.b bVar) {
        i iVar = (i) bVar;
        ((u) iVar.getService()).u2(new j(this), iVar.g());
    }
}
