package p256ku;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7347n;
import p229jt.C7348o;
import p315nt.InterfaceC9557b;

/* JADX INFO: renamed from: ku.e0 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a!\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a-\u0010\u0007\u001a\u0004\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a3\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u00022\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0000¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m31665d2 = {"T", "Ljt/n;", "", "b", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lku/n;", "caller", "c", "(Ljava/lang/Object;Lku/n;)Ljava/lang/Object;", "state", "Lnt/b;", "uCont", "a", "(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m31666k = 2, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C7853e0 {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final <T> Object m32623a(@Nullable Object obj, @NotNull InterfaceC9557b<? super T> interfaceC9557b) {
        if (!(obj instanceof C7843c0)) {
            return C7347n.m30460b(obj);
        }
        C7347n.Companion companion = C7347n.INSTANCE;
        return C7347n.m30460b(C7348o.m30469a(((C7843c0) obj).cause));
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static final <T> Object m32624b(@NotNull Object obj) {
        Throwable thM30463e = C7347n.m30463e(obj);
        return thM30463e == null ? obj : new C7843c0(thM30463e, false, 2, null);
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public static final <T> Object m32625c(@NotNull Object obj, @NotNull InterfaceC7897n<?> interfaceC7897n) {
        Throwable thM30463e = C7347n.m30463e(obj);
        return thM30463e == null ? obj : new C7843c0(thM30463e, false, 2, null);
    }
}
