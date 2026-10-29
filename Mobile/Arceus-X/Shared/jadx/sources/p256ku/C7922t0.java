package p256ku;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p229jt.C7347n;
import p229jt.C7348o;
import p315nt.InterfaceC9557b;
import p395qu.C10726i;

/* JADX INFO: renamed from: ku.t0 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\u001a\u0017\u0010\u0002\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\"\u0018\u0010\u0007\u001a\u00020\u0001*\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\"\u0018\u0010\t\u001a\u00020\u0001*\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006¨\u0006\n"}, m31665d2 = {"Lnt/b;", "", "c", "(Lnt/b;)Ljava/lang/String;", "", "b", "(Ljava/lang/Object;)Ljava/lang/String;", "hexAddress", "a", "classSimpleName", "kotlinx-coroutines-core"}, m31666k = 2, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C7922t0 {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final String m32908a(@NotNull Object obj) {
        return obj.getClass().getSimpleName();
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final String m32909b(@NotNull Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final String m32910c(@NotNull InterfaceC9557b<?> interfaceC9557b) {
        Object objM30460b;
        if (interfaceC9557b instanceof C10726i) {
            return ((C10726i) interfaceC9557b).toString();
        }
        try {
            C7347n.Companion companion = C7347n.INSTANCE;
            objM30460b = C7347n.m30460b(interfaceC9557b + '@' + m32909b(interfaceC9557b));
        } catch (Throwable th2) {
            C7347n.Companion companion2 = C7347n.INSTANCE;
            objM30460b = C7347n.m30460b(C7348o.m30469a(th2));
        }
        if (C7347n.m30463e(objM30460b) != null) {
            objM30460b = interfaceC9557b.getClass().getName() + '@' + m32909b(interfaceC9557b);
        }
        return (String) objM30460b;
    }
}
