package m9;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* JADX INFO: loaded from: classes.dex */
public final class x implements l9.k.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BasePendingResult f23087a;
    public final /* synthetic */ z b;

    public x(z zVar, BasePendingResult basePendingResult) {
        this.b = zVar;
        this.f23087a = basePendingResult;
    }

    @Override // l9.k.a
    public final void a(Status status) {
        this.b.f23094a.remove(this.f23087a);
    }
}
