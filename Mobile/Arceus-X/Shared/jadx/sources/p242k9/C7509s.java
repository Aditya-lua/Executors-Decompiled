package p242k9;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import p242k9.InterfaceC7504n;

/* JADX INFO: renamed from: k9.s */
/* JADX INFO: loaded from: classes.dex */
public final class C7509s<R extends InterfaceC7504n> extends BasePendingResult<R> {

    /* JADX INFO: renamed from: o */
    public final InterfaceC7504n f28867o;

    public C7509s(AbstractC7496f abstractC7496f, InterfaceC7504n interfaceC7504n) {
        super(abstractC7496f);
        this.f28867o = interfaceC7504n;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    /* JADX INFO: renamed from: e */
    public final R mo9173e(Status status) {
        return (R) this.f28867o;
    }
}
