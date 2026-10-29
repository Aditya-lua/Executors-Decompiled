package mp;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p139g.InterfaceC5852a;
import p154h.AbstractC6248a;

/* JADX INFO: renamed from: mp.i0 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u0018\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aI\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m31665d2 = {"I", "O", "Lh/a;", "contract", "Lg/a;", "callback", "Lmp/h0;", "a", "(Lh/a;Lg/a;)Lmp/h0;", "launchers_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C8626i0 {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final <I, O> C8624h0<I, O> m34685a(@NotNull AbstractC6248a<I, O> contract, @NotNull InterfaceC5852a<O> callback) {
        Intrinsics.checkNotNullParameter(contract, "contract");
        Intrinsics.checkNotNullParameter(callback, "callback");
        return new C8624h0<>(contract, callback);
    }
}
