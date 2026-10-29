package p256ku;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p315nt.InterfaceC9557b;
import p395qu.C10726i;

/* JADX INFO: renamed from: ku.r */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a)\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u0004\b\u0000\u0010\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u001f\u0010\u000e\u001a\u00020\u0004*\u0006\u0012\u0002\b\u00030\u00012\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m31665d2 = {"T", "Lku/n;", "Lku/m;", "handler", "", "c", "(Lku/n;Lku/m;)V", "Lnt/b;", "delegate", "Lku/p;", "b", "(Lnt/b;)Lku/p;", "Lku/i1;", "handle", "a", "(Lku/n;Lku/i1;)V", "kotlinx-coroutines-core"}, m31666k = 2, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C7913r {
    /* JADX INFO: renamed from: a */
    public static final void m32899a(@NotNull InterfaceC7897n<?> interfaceC7897n, @NotNull InterfaceC7874i1 interfaceC7874i1) {
        m32901c(interfaceC7897n, new C7879j1(interfaceC7874i1));
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final <T> C7905p<T> m32900b(@NotNull InterfaceC9557b<? super T> interfaceC9557b) {
        if (!(interfaceC9557b instanceof C10726i)) {
            return new C7905p<>(interfaceC9557b, 1);
        }
        C7905p<T> c7905pM40859m = ((C10726i) interfaceC9557b).m40859m();
        if (c7905pM40859m != null) {
            if (!c7905pM40859m.m32868R()) {
                c7905pM40859m = null;
            }
            if (c7905pM40859m != null) {
                return c7905pM40859m;
            }
        }
        return new C7905p<>(interfaceC9557b, 2);
    }

    /* JADX INFO: renamed from: c */
    public static final <T> void m32901c(@NotNull InterfaceC7897n<? super T> interfaceC7897n, @NotNull InterfaceC7892m interfaceC7892m) {
        if (!(interfaceC7897n instanceof C7905p)) {
            throw new UnsupportedOperationException("third-party implementation of CancellableContinuation is not supported");
        }
        ((C7905p) interfaceC7897n).m32863L(interfaceC7892m);
    }
}
