package p256ku;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p315nt.InterfaceC9557b;
import p615zt.InterfaceC14057n;

/* JADX INFO: renamed from: ku.n */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\bg\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002JO\u0010\f\u001a\u0004\u0018\u00010\u0005\"\b\b\u0001\u0010\u0003*\u00028\u00002\u0006\u0010\u0004\u001a\u00028\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052 \u0010\u000b\u001a\u001c\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007H'¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000e\u001a\u00020\bH'¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0005H'¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0016\u001a\u00020\u00152\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\bH&¢\u0006\u0004\b\u0016\u0010\u0017J)\u0010\u001b\u001a\u00020\n2\u0018\u0010\u001a\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\n0\u0018j\u0002`\u0019H&¢\u0006\u0004\b\u001b\u0010\u001cJ\u001b\u0010\u001e\u001a\u00020\n*\u00020\u001d2\u0006\u0010\u0004\u001a\u00028\u0000H'¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010 \u001a\u00020\n*\u00020\u001d2\u0006\u0010\u000e\u001a\u00020\bH'¢\u0006\u0004\b \u0010!JC\u0010\"\u001a\u00020\n\"\b\b\u0001\u0010\u0003*\u00028\u00002\u0006\u0010\u0004\u001a\u00028\u00012 \u0010\u000b\u001a\u001c\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007H&¢\u0006\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020\u00158&X¦\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0014\u0010(\u001a\u00020\u00158&X¦\u0004¢\u0006\u0006\u001a\u0004\b'\u0010%¨\u0006)"}, m31665d2 = {"Lku/n;", "T", "Lnt/b;", "R", "value", "", "idempotent", "Lkotlin/Function3;", "", "Lkotlin/coroutines/CoroutineContext;", "", "onCancellation", "G", "(Ljava/lang/Object;Ljava/lang/Object;Lzt/n;)Ljava/lang/Object;", "exception", "o", "(Ljava/lang/Throwable;)Ljava/lang/Object;", "token", "J", "(Ljava/lang/Object;)V", "cause", "", "p", "(Ljava/lang/Throwable;)Z", "Lkotlin/Function1;", "Lkotlinx/coroutines/CompletionHandler;", "handler", "n", "(Lkotlin/jvm/functions/Function1;)V", "Lku/l0;", "x", "(Lku/l0;Ljava/lang/Object;)V", "f", "(Lku/l0;Ljava/lang/Throwable;)V", "k", "(Ljava/lang/Object;Lzt/n;)V", "b", "()Z", "isActive", "d", "isCompleted", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public interface InterfaceC7897n<T> extends InterfaceC9557b<T> {

    /* JADX INFO: renamed from: ku.n$a */
    @Metadata(m31666k = 3, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static /* synthetic */ boolean m32819a(InterfaceC7897n interfaceC7897n, Throwable th2, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i10 & 1) != 0) {
                th2 = null;
            }
            return interfaceC7897n.mo32817p(th2);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: G */
    <R extends T> Object mo32809G(R value, @Nullable Object idempotent, @Nullable InterfaceC14057n<? super Throwable, ? super R, ? super CoroutineContext, Unit> onCancellation);

    /* JADX INFO: renamed from: J */
    void mo32810J(@NotNull Object token);

    /* JADX INFO: renamed from: b */
    boolean mo32811b();

    /* JADX INFO: renamed from: d */
    boolean mo32812d();

    /* JADX INFO: renamed from: f */
    void mo32813f(@NotNull AbstractC7888l0 abstractC7888l0, @NotNull Throwable th2);

    /* JADX INFO: renamed from: k */
    <R extends T> void mo32814k(R value, @Nullable InterfaceC14057n<? super Throwable, ? super R, ? super CoroutineContext, Unit> onCancellation);

    /* JADX INFO: renamed from: n */
    void mo32815n(@NotNull Function1<? super Throwable, Unit> handler);

    @Nullable
    /* JADX INFO: renamed from: o */
    Object mo32816o(@NotNull Throwable exception);

    /* JADX INFO: renamed from: p */
    boolean mo32817p(@Nullable Throwable cause);

    /* JADX INFO: renamed from: x */
    void mo32818x(@NotNull AbstractC7888l0 abstractC7888l0, T t8);
}
