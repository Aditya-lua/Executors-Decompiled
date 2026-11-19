package av;

import com.github.luben.zstd.BuildConfig;
import java.util.concurrent.CancellationException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.coroutines.CoroutineContext;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u0000 (2\u00020\u0001:\u0001\u001fJ\u0013\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H'¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u00020\n2\u0010\b\u0002\u0010\t\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003H&¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH'¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\nH¦@¢\u0006\u0004\b\u0012\u0010\u0013J)\u0010\u0019\u001a\u00020\u00182\u0018\u0010\u0017\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0004\u0012\u00020\n0\u0014j\u0002`\u0016H&¢\u0006\u0004\b\u0019\u0010\u001aJ=\u0010\u001d\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u00062\b\b\u0002\u0010\u001c\u001a\u00020\u00062\u0018\u0010\u0017\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0004\u0012\u00020\n0\u0014j\u0002`\u0016H'¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\bR\u0014\u0010\"\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\bR\u0014\u0010#\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\bR\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00000$8&X¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006)"}, d2 = {"Lav/d2;", "Lkotlin/coroutines/CoroutineContext$Element;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "k", "()Ljava/util/concurrent/CancellationException;", BuildConfig.FLAVOR, "start", "()Z", "cause", BuildConfig.FLAVOR, "c", "(Ljava/util/concurrent/CancellationException;)V", "Lav/w;", "child", "Lav/u;", "E", "(Lav/w;)Lav/u;", "z", "(Leu/b;)Ljava/lang/Object;", "Lkotlin/Function1;", BuildConfig.FLAVOR, "Lkotlinx/coroutines/CompletionHandler;", "handler", "Lav/i1;", "o", "(Lkotlin/jvm/functions/Function1;)Lav/i1;", "onCancelling", "invokeImmediately", "h", "(ZZLkotlin/jvm/functions/Function1;)Lav/i1;", "b", "isActive", "d", "isCompleted", "isCancelled", "Lkotlin/sequences/Sequence;", "getChildren", "()Lkotlin/sequences/Sequence;", "children", "Ao", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface d2 extends CoroutineContext.Element {

    /* JADX INFO: renamed from: Ao, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f3390a;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public static /* synthetic */ void a(d2 d2Var, CancellationException cancellationException, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i10 & 1) != 0) {
                cancellationException = null;
            }
            d2Var.c(cancellationException);
        }

        public static <R> R b(@NotNull d2 d2Var, R r10, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
            return (R) CoroutineContext.Element.a.a(d2Var, r10, function2);
        }

        @Nullable
        public static <E extends CoroutineContext.Element> E c(@NotNull d2 d2Var, @NotNull CoroutineContext.b<E> bVar) {
            return (E) CoroutineContext.Element.a.b(d2Var, bVar);
        }

        @NotNull
        public static CoroutineContext d(@NotNull d2 d2Var, @NotNull CoroutineContext.b<?> bVar) {
            return CoroutineContext.Element.a.c(d2Var, bVar);
        }

        @NotNull
        public static CoroutineContext e(@NotNull d2 d2Var, @NotNull CoroutineContext coroutineContext) {
            return CoroutineContext.Element.a.d(d2Var, coroutineContext);
        }
    }

    /* JADX INFO: renamed from: av.d2$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lav/d2$b;", "Lkotlin/coroutines/CoroutineContext$b;", "Lav/d2;", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion implements CoroutineContext.b<d2> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f3390a = new Companion();
    }

    @NotNull
    u E(@NotNull w child);

    boolean b();

    void c(@Nullable CancellationException cause);

    boolean d();

    @NotNull
    Sequence<d2> getChildren();

    @NotNull
    i1 h(boolean onCancelling, boolean invokeImmediately, @NotNull Function1<? super Throwable, Unit> handler);

    boolean isCancelled();

    @NotNull
    CancellationException k();

    @NotNull
    i1 o(@NotNull Function1<? super Throwable, Unit> handler);

    boolean start();

    @Nullable
    Object z(@NotNull eu.b<? super Unit> bVar);
}
