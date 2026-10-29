package mu;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p315nt.InterfaceC9557b;
import p395qu.C10717d0;

/* JADX INFO: renamed from: mu.y */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H¦@¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00072\u0006\u0010\u0003\u001a\u00028\u0000H&¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH&¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0011\u001a\u00020\u00042\u0014\u0010\u0010\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u00040\u000fH&¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00028\u0000H\u0017¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0019\u001a\u00020\f8&X§\u0004¢\u0006\f\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, m31665d2 = {"Lmu/y;", "E", "", "element", "", "i", "(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;", "Lmu/k;", "w", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "cause", "", "F", "(Ljava/lang/Throwable;)Z", "Lkotlin/Function1;", "handler", "t", "(Lkotlin/jvm/functions/Function1;)V", "offer", "(Ljava/lang/Object;)Z", "I", "()Z", "isClosedForSend$annotations", "()V", "isClosedForSend", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public interface InterfaceC8690y<E> {

    /* JADX INFO: renamed from: mu.y$a */
    @Metadata(m31666k = 3, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static /* synthetic */ boolean m34972a(InterfaceC8690y interfaceC8690y, Throwable th2, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: close");
            }
            if ((i10 & 1) != 0) {
                th2 = null;
            }
            return interfaceC8690y.mo34802F(th2);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: E */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: b */
        public static <E> boolean m34973b(@NotNull InterfaceC8690y<? super E> interfaceC8690y, E e10) throws Throwable {
            Object objMo34870w = interfaceC8690y.mo34870w(e10);
            if (C8676k.m34936i(objMo34870w)) {
                return true;
            }
            Throwable thM34932e = C8676k.m34932e(objMo34870w);
            if (thM34932e == null) {
                return false;
            }
            throw C10717d0.m40837a(thM34932e);
        }
    }

    /* JADX INFO: renamed from: F */
    boolean mo34802F(@Nullable Throwable cause);

    /* JADX INFO: renamed from: I */
    boolean mo34806I();

    @Nullable
    /* JADX INFO: renamed from: i */
    Object mo34848i(E e10, @NotNull InterfaceC9557b<? super Unit> interfaceC9557b);

    boolean offer(E element);

    /* JADX INFO: renamed from: t */
    void mo34864t(@NotNull Function1<? super Throwable, Unit> handler);

    @NotNull
    /* JADX INFO: renamed from: w */
    Object mo34870w(E element);
}
