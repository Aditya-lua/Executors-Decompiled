package av;

import com.github.luben.zstd.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.coroutines.CoroutineContext;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b&\u0018\u0000 \"2\u00020\u00012\u00020\u0002:\u0001#B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nH\u0017¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u00052\n\u0010\u0014\u001a\u00060\u0012j\u0002`\u0013H&¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u00052\n\u0010\u0014\u001a\u00060\u0012j\u0002`\u0013H\u0017¢\u0006\u0004\b\u0018\u0010\u0017J'\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a\"\u0004\b\u0000\u0010\u00192\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010\u001e\u001a\u00020\u00152\n\u0010\u001b\u001a\u0006\u0012\u0002\b\u00030\u001a¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\fH\u0016¢\u0006\u0004\b \u0010!¨\u0006$"}, d2 = {"Lav/l0;", "Lkotlin/coroutines/a;", "Lkotlin/coroutines/d;", "<init>", "()V", "Lkotlin/coroutines/CoroutineContext;", "context", BuildConfig.FLAVOR, "N", "(Lkotlin/coroutines/CoroutineContext;)Z", BuildConfig.FLAVOR, "parallelism", BuildConfig.FLAVOR, "name", "Q", "(ILjava/lang/String;)Lav/l0;", "O", "(I)Lav/l0;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", BuildConfig.FLAVOR, "I", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V", "L", "T", "Leu/b;", "continuation", "K", "(Leu/b;)Leu/b;", "n", "(Leu/b;)V", "toString", "()Ljava/lang/String;", "b", "a", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class l0 extends p001kotlin.coroutines.a implements p001kotlin.coroutines.d {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: av.l0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lav/l0$a;", "Lkotlin/coroutines/b;", "Lkotlin/coroutines/d;", "Lav/l0;", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion extends p001kotlin.coroutines.b<p001kotlin.coroutines.d, l0> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final l0 d(CoroutineContext.Element element) {
            if (element instanceof l0) {
                return (l0) element;
            }
            return null;
        }

        public Companion() {
            super(p001kotlin.coroutines.d.INSTANCE, new Function1() { // from class: av.k0
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return l0.Companion.d((CoroutineContext.Element) obj);
                }
            });
        }
    }

    public l0() {
        super(p001kotlin.coroutines.d.INSTANCE);
    }

    public static /* synthetic */ l0 T(l0 l0Var, int i10, String str, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: limitedParallelism");
        }
        if ((i11 & 2) != 0) {
            str = null;
        }
        return l0Var.Q(i10, str);
    }

    public abstract void I(@NotNull CoroutineContext context, @NotNull Runnable block);

    @Override // p001kotlin.coroutines.d
    @NotNull
    public final <T> eu.b<T> K(@NotNull eu.b<? super T> continuation) {
        return new gv.i(this, continuation);
    }

    public void L(@NotNull CoroutineContext context, @NotNull Runnable block) {
        gv.j.c(this, context, block);
    }

    public boolean N(@NotNull CoroutineContext context) {
        return true;
    }

    public /* synthetic */ l0 O(int parallelism) {
        return Q(parallelism, null);
    }

    @NotNull
    public l0 Q(int parallelism, @Nullable String name) {
        gv.m.a(parallelism);
        return new gv.l(this, parallelism, name);
    }

    @Override // p001kotlin.coroutines.a, kotlin.coroutines.CoroutineContext.Element, p001kotlin.coroutines.CoroutineContext
    @Nullable
    public <E extends CoroutineContext.Element> E get(@NotNull CoroutineContext.b<E> bVar) {
        return (E) kotlin.coroutines.d.a.a(this, bVar);
    }

    @Override // p001kotlin.coroutines.a, p001kotlin.coroutines.CoroutineContext
    @NotNull
    public CoroutineContext minusKey(@NotNull CoroutineContext.b<?> bVar) {
        return kotlin.coroutines.d.a.b(this, bVar);
    }

    @Override // p001kotlin.coroutines.d
    public final void n(@NotNull eu.b<?> continuation) {
        Intrinsics.d(continuation, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        ((gv.i) continuation).u();
    }

    @NotNull
    public String toString() {
        return t0.a(this) + '@' + t0.b(this);
    }
}
