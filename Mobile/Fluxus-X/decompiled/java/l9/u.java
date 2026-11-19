package l9;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import l9.p;

/* JADX INFO: loaded from: classes.dex */
public final class u<R extends p> extends BasePendingResult<R> {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final p f22017o;

    public u(h hVar, p pVar) {
        super(hVar);
        this.f22017o = pVar;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final R e(Status status) {
        return (R) this.f22017o;
    }
}
