package k9;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import k9.n;

/* JADX INFO: loaded from: classes.dex */
public final class s<R extends n> extends BasePendingResult<R> {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final n f22285o;

    public s(f fVar, n nVar) {
        super(fVar);
        this.f22285o = nVar;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final R e(Status status) {
        return (R) this.f22285o;
    }
}
