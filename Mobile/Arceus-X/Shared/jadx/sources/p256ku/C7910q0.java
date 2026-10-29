package p256ku;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p395qu.C10711a0;
import p395qu.CoroutineScope;
import pt.C10346h;
import ru.C11137b;

/* JADX INFO: renamed from: ku.q0 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a\u001c\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a\r\u0010\u0005\u001a\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001aG\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00072\"\u0010\u000b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\bH\u0086@\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\f\u0010\r\u001a\u0015\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a#\u0010\u0014\u001a\u00020\u0013*\u00020\u00002\u0010\b\u0002\u0010\u0012\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u0011¢\u0006\u0004\b\u0014\u0010\u0015\u001a%\u0010\u0019\u001a\u00020\u0013*\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0011\u0010\u001b\u001a\u00020\u0013*\u00020\u0000¢\u0006\u0004\b\u001b\u0010\u001c\"\u001b\u0010!\u001a\u00020\u001d*\u00020\u00008F¢\u0006\f\u0012\u0004\b \u0010\u001c\u001a\u0004\b\u001e\u0010\u001f¨\u0006\""}, m31665d2 = {"Lku/p0;", "Lkotlin/coroutines/CoroutineContext;", "context", "j", "(Lku/p0;Lkotlin/coroutines/CoroutineContext;)Lku/p0;", "b", "()Lku/p0;", "R", "Lkotlin/Function2;", "Lnt/b;", "", "block", "g", "(Lkotlin/jvm/functions/Function2;Lnt/b;)Ljava/lang/Object;", "a", "(Lkotlin/coroutines/CoroutineContext;)Lku/p0;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cause", "", "d", "(Lku/p0;Ljava/util/concurrent/CancellationException;)V", "", "message", "", "c", "(Lku/p0;Ljava/lang/String;Ljava/lang/Throwable;)V", "h", "(Lku/p0;)V", "", "i", "(Lku/p0;)Z", "isActive$annotations", "isActive", "kotlinx-coroutines-core"}, m31666k = 2, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C7910q0 {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final InterfaceC7906p0 m32885a(@NotNull CoroutineContext coroutineContext) {
        if (coroutineContext.get(InterfaceC7850d2.INSTANCE) == null) {
            coroutineContext = coroutineContext.plus(C7870h2.m32666b(null, 1, null));
        }
        return new CoroutineScope(coroutineContext);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final InterfaceC7906p0 m32886b() {
        return new CoroutineScope(C7948z2.m32943b(null, 1, null).plus(C7864g1.m32645c()));
    }

    /* JADX INFO: renamed from: c */
    public static final void m32887c(@NotNull InterfaceC7906p0 interfaceC7906p0, @NotNull String str, @Nullable Throwable th2) {
        m32888d(interfaceC7906p0, C7915r1.m32905a(str, th2));
    }

    /* JADX INFO: renamed from: d */
    public static final void m32888d(@NotNull InterfaceC7906p0 interfaceC7906p0, @Nullable CancellationException cancellationException) {
        InterfaceC7850d2 interfaceC7850d2 = (InterfaceC7850d2) interfaceC7906p0.getCoroutineContext().get(InterfaceC7850d2.INSTANCE);
        if (interfaceC7850d2 != null) {
            interfaceC7850d2.mo32597c(cancellationException);
            return;
        }
        throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + interfaceC7906p0).toString());
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m32889e(InterfaceC7906p0 interfaceC7906p0, String str, Throwable th2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            th2 = null;
        }
        m32887c(interfaceC7906p0, str, th2);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m32890f(InterfaceC7906p0 interfaceC7906p0, CancellationException cancellationException, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cancellationException = null;
        }
        m32888d(interfaceC7906p0, cancellationException);
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public static final <R> Object m32891g(@NotNull Function2<? super InterfaceC7906p0, ? super InterfaceC9557b<? super R>, ? extends Object> function2, @NotNull InterfaceC9557b<? super R> interfaceC9557b) {
        C10711a0 c10711a0 = new C10711a0(interfaceC9557b.getContext(), interfaceC9557b);
        Object objM41914d = C11137b.m41914d(c10711a0, c10711a0, function2);
        if (objM41914d == C10047c.m38805e()) {
            C10346h.m39673c(interfaceC9557b);
        }
        return objM41914d;
    }

    /* JADX INFO: renamed from: h */
    public static final void m32892h(@NotNull InterfaceC7906p0 interfaceC7906p0) {
        C7865g2.m32652f(interfaceC7906p0.getCoroutineContext());
    }

    /* JADX INFO: renamed from: i */
    public static final boolean m32893i(@NotNull InterfaceC7906p0 interfaceC7906p0) {
        InterfaceC7850d2 interfaceC7850d2 = (InterfaceC7850d2) interfaceC7906p0.getCoroutineContext().get(InterfaceC7850d2.INSTANCE);
        if (interfaceC7850d2 != null) {
            return interfaceC7850d2.mo32556b();
        }
        return true;
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public static final InterfaceC7906p0 m32894j(@NotNull InterfaceC7906p0 interfaceC7906p0, @NotNull CoroutineContext coroutineContext) {
        return new CoroutineScope(interfaceC7906p0.getCoroutineContext().plus(coroutineContext));
    }
}
