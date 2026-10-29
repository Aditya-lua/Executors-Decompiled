package p256ku;

import kotlin.Metadata;
import kotlin.coroutines.AbstractC7717a;
import kotlin.coroutines.AbstractC7718b;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.InterfaceC7720d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p315nt.InterfaceC9557b;
import p395qu.C10726i;
import p395qu.C10728j;
import p395qu.C10732l;
import p395qu.C10734m;

/* JADX INFO: renamed from: ku.l0 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b&\u0018\u0000 \"2\u00020\u00012\u00020\u0002:\u0001#B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nH\u0017¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u00052\n\u0010\u0014\u001a\u00060\u0012j\u0002`\u0013H&¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u00052\n\u0010\u0014\u001a\u00060\u0012j\u0002`\u0013H\u0017¢\u0006\u0004\b\u0018\u0010\u0017J'\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a\"\u0004\b\u0000\u0010\u00192\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010\u001e\u001a\u00020\u00152\n\u0010\u001b\u001a\u0006\u0012\u0002\b\u00030\u001a¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\fH\u0016¢\u0006\u0004\b \u0010!¨\u0006$"}, m31665d2 = {"Lku/l0;", "Lkotlin/coroutines/a;", "Lkotlin/coroutines/d;", "<init>", "()V", "Lkotlin/coroutines/CoroutineContext;", "context", "", "H", "(Lkotlin/coroutines/CoroutineContext;)Z", "", "parallelism", "", "name", "P", "(ILjava/lang/String;)Lku/l0;", "I", "(I)Lku/l0;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "", "w", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V", "F", "T", "Lnt/b;", "continuation", "v", "(Lnt/b;)Lnt/b;", "M", "(Lnt/b;)V", "toString", "()Ljava/lang/String;", "b", "a", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public abstract class AbstractC7888l0 extends AbstractC7717a implements InterfaceC7720d {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: ku.l0$a, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m31665d2 = {"Lku/l0$a;", "Lkotlin/coroutines/b;", "Lkotlin/coroutines/d;", "Lku/l0;", "<init>", "()V", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class Companion extends AbstractC7718b<InterfaceC7720d, AbstractC7888l0> {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: ku.l0.a.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: d */
        public static final AbstractC7888l0 m32795d(CoroutineContext.Element element) {
            if (element instanceof AbstractC7888l0) {
                return (AbstractC7888l0) element;
            }
            return null;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Companion() {
            super(InterfaceC7720d.INSTANCE, new Function1() { // from class: ku.k0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AbstractC7888l0.Companion.m32795d((CoroutineContext.Element) obj);
                }
            });
        }
    }

    public AbstractC7888l0() {
        super(InterfaceC7720d.INSTANCE);
    }

    /* JADX INFO: renamed from: U */
    public static /* synthetic */ AbstractC7888l0 m32791U(AbstractC7888l0 abstractC7888l0, int i10, String str, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: limitedParallelism");
        }
        if ((i11 & 2) != 0) {
            str = null;
        }
        return abstractC7888l0.mo32677P(i10, str);
    }

    /* JADX INFO: renamed from: F */
    public void mo32792F(@NotNull CoroutineContext context, @NotNull Runnable block) {
        C10728j.m40868c(this, context, block);
    }

    /* JADX INFO: renamed from: H */
    public boolean mo6245H(@NotNull CoroutineContext context) {
        return true;
    }

    /* JADX INFO: renamed from: I */
    public /* synthetic */ AbstractC7888l0 m32793I(int parallelism) {
        return mo32677P(parallelism, null);
    }

    @Override // kotlin.coroutines.InterfaceC7720d
    /* JADX INFO: renamed from: M */
    public final void mo31961M(@NotNull InterfaceC9557b<?> continuation) {
        Intrinsics.m31981d(continuation, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        ((C10726i) continuation).m40864v();
    }

    @NotNull
    /* JADX INFO: renamed from: P */
    public AbstractC7888l0 mo32677P(int parallelism, @Nullable String name) {
        C10734m.m40890a(parallelism);
        return new C10732l(this, parallelism, name);
    }

    @Override // kotlin.coroutines.AbstractC7717a, kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    @Nullable
    public <E extends CoroutineContext.Element> E get(@NotNull CoroutineContext.InterfaceC7716b<E> interfaceC7716b) {
        return (E) InterfaceC7720d.a.m31963a(this, interfaceC7716b);
    }

    @Override // kotlin.coroutines.AbstractC7717a, kotlin.coroutines.CoroutineContext
    @NotNull
    public CoroutineContext minusKey(@NotNull CoroutineContext.InterfaceC7716b<?> interfaceC7716b) {
        return InterfaceC7720d.a.m31964b(this, interfaceC7716b);
    }

    @NotNull
    public String toString() {
        return C7922t0.m32908a(this) + '@' + C7922t0.m32909b(this);
    }

    @Override // kotlin.coroutines.InterfaceC7720d
    @NotNull
    /* JADX INFO: renamed from: v */
    public final <T> InterfaceC9557b<T> mo31962v(@NotNull InterfaceC9557b<? super T> continuation) {
        return new C10726i(this, continuation);
    }

    /* JADX INFO: renamed from: w */
    public abstract void mo6246w(@NotNull CoroutineContext context, @NotNull Runnable block);
}
