package iu;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\u001a\u0017\u0010\u0002\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\"\u0018\u0010\u0007\u001a\u00020\u0001*\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\"\u0018\u0010\t\u001a\u00020\u0001*\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006¨\u0006\n"}, d2 = {"Llt/b;", "", "c", "(Llt/b;)Ljava/lang/String;", "", "b", "(Ljava/lang/Object;)Ljava/lang/String;", "hexAddress", "a", "classSimpleName", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class t0 {
    @NotNull
    public static final String a(@NotNull Object obj) {
        return obj.getClass().getSimpleName();
    }

    @NotNull
    public static final String b(@NotNull Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    @NotNull
    public static final String c(@NotNull lt.b<?> bVar) {
        Object objB;
        if (bVar instanceof ou.i) {
            return ((ou.i) bVar).toString();
        }
        try {
            gt.n.Companion companion = gt.n.INSTANCE;
            objB = gt.n.b(bVar + '@' + b(bVar));
        } catch (Throwable th2) {
            gt.n.Companion companion2 = gt.n.INSTANCE;
            objB = gt.n.b(gt.o.a(th2));
        }
        if (gt.n.e(objB) != null) {
            objB = bVar.getClass().getName() + '@' + b(bVar);
        }
        return (String) objB;
    }
}
