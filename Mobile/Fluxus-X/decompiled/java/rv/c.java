package rv;

import mv.a0;
import mv.h0;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lrv/c;", "Lmv/a0;", "<init>", "()V", "Lmv/a0$a;", "chain", "Lmv/h0;", "intercept", "(Lmv/a0$a;)Lmv/h0;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final c f30952a = new c();

    @Override // mv.a0
    @NotNull
    public h0 intercept(@NotNull a0.a chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        sv.g gVar = (sv.g) chain;
        return sv.g.d(gVar, 0, gVar.getCall().x(gVar), null, 0, 0, 0, 61, null).a(gVar.j());
    }
}
