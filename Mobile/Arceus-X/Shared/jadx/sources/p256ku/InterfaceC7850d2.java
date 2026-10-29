package p256ku;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p315nt.InterfaceC9557b;

/* JADX INFO: renamed from: ku.d2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\bg\u0018\u0000 $2\u00020\u0001:\u0001\u001fJ\u0013\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H'¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u00020\n2\u0010\b\u0002\u0010\t\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003H&¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH'¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\nH¦@¢\u0006\u0004\b\u0012\u0010\u0013J)\u0010\u0019\u001a\u00020\u00182\u0018\u0010\u0017\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0004\u0012\u00020\n0\u0014j\u0002`\u0016H&¢\u0006\u0004\b\u0019\u0010\u001aJ=\u0010\u001d\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u00062\b\b\u0002\u0010\u001c\u001a\u00020\u00062\u0018\u0010\u0017\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0004\u0012\u00020\n0\u0014j\u0002`\u0016H'¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\bR\u0014\u0010\"\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\bR\u0014\u0010#\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\b¨\u0006%"}, m31665d2 = {"Lku/d2;", "Lkotlin/coroutines/CoroutineContext$Element;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "m", "()Ljava/util/concurrent/CancellationException;", "", "start", "()Z", "cause", "", "c", "(Ljava/util/concurrent/CancellationException;)V", "Lku/w;", "child", "Lku/u;", "y", "(Lku/w;)Lku/u;", "L", "(Lnt/b;)Ljava/lang/Object;", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/CompletionHandler;", "handler", "Lku/i1;", "q", "(Lkotlin/jvm/functions/Function1;)Lku/i1;", "onCancelling", "invokeImmediately", "l", "(ZZLkotlin/jvm/functions/Function1;)Lku/i1;", "b", "isActive", "d", "isCompleted", "isCancelled", "Mo", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public interface InterfaceC7850d2 extends CoroutineContext.Element {

    /* JADX INFO: renamed from: Mo, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f29701a;

    /* JADX INFO: renamed from: ku.d2$a */
    @Metadata(m31666k = 3, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m32603a(InterfaceC7850d2 interfaceC7850d2, CancellationException cancellationException, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i10 & 1) != 0) {
                cancellationException = null;
            }
            interfaceC7850d2.mo32597c(cancellationException);
        }

        /* JADX INFO: renamed from: b */
        public static <R> R m32604b(@NotNull InterfaceC7850d2 interfaceC7850d2, R r8, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
            return (R) CoroutineContext.Element.C7714a.m31947a(interfaceC7850d2, r8, function2);
        }

        @Nullable
        /* JADX INFO: renamed from: c */
        public static <E extends CoroutineContext.Element> E m32605c(@NotNull InterfaceC7850d2 interfaceC7850d2, @NotNull CoroutineContext.InterfaceC7716b<E> interfaceC7716b) {
            return (E) CoroutineContext.Element.C7714a.m31948b(interfaceC7850d2, interfaceC7716b);
        }

        @NotNull
        /* JADX INFO: renamed from: d */
        public static CoroutineContext m32606d(@NotNull InterfaceC7850d2 interfaceC7850d2, @NotNull CoroutineContext.InterfaceC7716b<?> interfaceC7716b) {
            return CoroutineContext.Element.C7714a.m31949c(interfaceC7850d2, interfaceC7716b);
        }

        @NotNull
        /* JADX INFO: renamed from: e */
        public static CoroutineContext m32607e(@NotNull InterfaceC7850d2 interfaceC7850d2, @NotNull CoroutineContext coroutineContext) {
            return CoroutineContext.Element.C7714a.m31950d(interfaceC7850d2, coroutineContext);
        }
    }

    /* JADX INFO: renamed from: ku.d2$b, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m31665d2 = {"Lku/d2$b;", "Lkotlin/coroutines/CoroutineContext$b;", "Lku/d2;", "<init>", "()V", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class Companion implements CoroutineContext.InterfaceC7716b<InterfaceC7850d2> {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f29701a = new Companion();
    }

    @Nullable
    /* JADX INFO: renamed from: L */
    Object mo32596L(@NotNull InterfaceC9557b<? super Unit> interfaceC9557b);

    /* JADX INFO: renamed from: b */
    boolean mo32556b();

    /* JADX INFO: renamed from: c */
    void mo32597c(@Nullable CancellationException cause);

    /* JADX INFO: renamed from: d */
    boolean mo32598d();

    boolean isCancelled();

    @NotNull
    /* JADX INFO: renamed from: l */
    InterfaceC7874i1 mo32599l(boolean onCancelling, boolean invokeImmediately, @NotNull Function1<? super Throwable, Unit> handler);

    @NotNull
    /* JADX INFO: renamed from: m */
    CancellationException mo32600m();

    @NotNull
    /* JADX INFO: renamed from: q */
    InterfaceC7874i1 mo32601q(@NotNull Function1<? super Throwable, Unit> handler);

    boolean start();

    @NotNull
    /* JADX INFO: renamed from: y */
    InterfaceC7925u mo32602y(@NotNull InterfaceC7933w child);
}
