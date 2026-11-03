package l9;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* JADX INFO: loaded from: classes.dex */
public final class x implements k9.i.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BasePendingResult f23496a;
    public final /* synthetic */ z b;

    public x(z zVar, BasePendingResult basePendingResult) {
        this.b = zVar;
        this.f23496a = basePendingResult;
    }

    @Override // k9.i.a
    public final void a(Status status) {
        this.b.f23503a.remove(this.f23496a);
    }
}
