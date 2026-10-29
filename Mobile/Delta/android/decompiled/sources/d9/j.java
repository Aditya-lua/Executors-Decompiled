package d9;

import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
public final class j extends m {
    public j(k9.f fVar) {
        super(fVar);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ k9.n e(Status status) {
        return status;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.a
    public final /* bridge */ /* synthetic */ void n(k9.a.b bVar) {
        h hVar = (h) bVar;
        ((t) hVar.getService()).u2(new i(this), hVar.g());
    }
}
