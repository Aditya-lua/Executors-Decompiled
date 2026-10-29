package g6;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import x5.t0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a'\u0010\u0006\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lx2/a;", "Lx5/t0;", "info", "", "tag", "", "a", "(Lx2/a;Lx5/t0;Ljava/lang/String;)V", "work-runtime_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class h0 {
    public static final void a(@NotNull x2.a<t0> aVar, @NotNull t0 info, @NotNull String tag) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(tag, "tag");
        try {
            aVar.accept(info);
        } catch (Throwable th2) {
            x5.w.e().d(tag, "Exception handler threw an exception", th2);
        }
    }
}
