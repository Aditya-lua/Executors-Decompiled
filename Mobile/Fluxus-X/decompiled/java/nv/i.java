package nv;

import mv.h0;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0001\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Lmv/h0;", "a", "(Lmv/h0;)Lmv/h0;", "okhttp"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class i {
    @NotNull
    public static final h0 a(@NotNull h0 h0Var) {
        Intrinsics.checkNotNullParameter(h0Var, "<this>");
        return h0Var.s().b(new h(h0Var.getBody().getMediaType(), h0Var.getBody().getContentLength())).c();
    }
}
