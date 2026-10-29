package p452tu;

import kotlin.Metadata;
import p229jt.C7347n;
import p229jt.C7348o;
import p256ku.AbstractC7888l0;
import p256ku.InterfaceC7897n;

/* JADX INFO: renamed from: tu.n */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\u001a'\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001f\u0010\b\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u00012\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m31665d2 = {"T", "Lku/n;", "result", "", "c", "(Lku/n;Ljava/lang/Object;)V", "", "exception", "d", "(Lku/n;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, m31666k = 2, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C11762n {
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public static final <T> void m44042c(InterfaceC7897n<? super T> interfaceC7897n, T t8) {
        AbstractC7888l0 abstractC7888l0 = (AbstractC7888l0) interfaceC7897n.getContext().get(AbstractC7888l0.INSTANCE);
        if (abstractC7888l0 != null) {
            interfaceC7897n.mo32818x(abstractC7888l0, t8);
        } else {
            interfaceC7897n.resumeWith(C7347n.m30460b(t8));
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m44043d(InterfaceC7897n<?> interfaceC7897n, Throwable th2) {
        AbstractC7888l0 abstractC7888l0 = (AbstractC7888l0) interfaceC7897n.getContext().get(AbstractC7888l0.INSTANCE);
        if (abstractC7888l0 != null) {
            interfaceC7897n.mo32813f(abstractC7888l0, th2);
        } else {
            C7347n.Companion companion = C7347n.INSTANCE;
            interfaceC7897n.resumeWith(C7347n.m30460b(C7348o.m30469a(th2)));
        }
    }
}
