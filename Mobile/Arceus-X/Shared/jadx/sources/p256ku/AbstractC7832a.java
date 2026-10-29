package p256ku;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p315nt.InterfaceC9557b;

/* JADX INFO: renamed from: ku.a */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b'\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u00042\u00020\u0005B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001b\u001a\u00020\u000e2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0004¢\u0006\u0004\b\u001b\u0010\u0010J\u001b\u0010\u001e\u001a\u00020\u000e2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c¢\u0006\u0004\b\u001e\u0010\u0010J\u0019\u0010\u001f\u001a\u00020\u000e2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0014¢\u0006\u0004\b\u001f\u0010\u0010J\u0017\u0010!\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u0011H\u0000¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0016H\u0010¢\u0006\u0004\b#\u0010\u0018JG\u0010*\u001a\u00020\u000e\"\u0004\b\u0001\u0010$2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00028\u00012\"\u0010)\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00190(¢\u0006\u0004\b*\u0010+R\u001d\u00102\u001a\u00020\u00068\u0006¢\u0006\u0012\n\u0004\b,\u0010-\u0012\u0004\b0\u00101\u001a\u0004\b.\u0010/R\u0014\u00104\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u0010/R\u0014\u00107\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u00106¨\u00068"}, m31665d2 = {"Lku/a;", "T", "Lku/j2;", "Lku/d2;", "Lnt/b;", "Lku/p0;", "Lkotlin/coroutines/CoroutineContext;", "parentContext", "", "initParentJob", "active", "<init>", "(Lkotlin/coroutines/CoroutineContext;ZZ)V", "value", "", "V0", "(Ljava/lang/Object;)V", "", "cause", "handled", "U0", "(Ljava/lang/Throwable;Z)V", "", "X", "()Ljava/lang/String;", "", "state", "D0", "Ljt/n;", "result", "resumeWith", "T0", "exception", "p0", "(Ljava/lang/Throwable;)V", "y0", "R", "Lku/r0;", "start", "receiver", "Lkotlin/Function2;", "block", "W0", "(Lku/r0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "c", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "getContext$annotations", "()V", "context", "H", "coroutineContext", "b", "()Z", "isActive", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public abstract class AbstractC7832a<T> extends C7880j2 implements InterfaceC7850d2, InterfaceC9557b<T>, InterfaceC7906p0 {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final CoroutineContext context;

    public AbstractC7832a(@NotNull CoroutineContext coroutineContext, boolean z10, boolean z11) {
        super(z11);
        if (z10) {
            m32752q0((InterfaceC7850d2) coroutineContext.get(InterfaceC7850d2.INSTANCE));
        }
        this.context = coroutineContext.plus(this);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p256ku.C7880j2
    /* JADX INFO: renamed from: D0 */
    public final void mo32550D0(@Nullable Object state) {
        if (!(state instanceof C7843c0)) {
            mo32553V0(state);
        } else {
            C7843c0 c7843c0 = (C7843c0) state;
            mo32552U0(c7843c0.cause, c7843c0.m32579a());
        }
    }

    @Override // p256ku.InterfaceC7906p0
    @NotNull
    /* JADX INFO: renamed from: H, reason: from getter */
    public CoroutineContext getCoroutineContext() {
        return this.context;
    }

    /* JADX INFO: renamed from: T0 */
    public void mo32551T0(@Nullable Object state) {
        mo32584P(state);
    }

    /* JADX INFO: renamed from: U0 */
    public void mo32552U0(@NotNull Throwable cause, boolean handled) {
    }

    /* JADX INFO: renamed from: V0 */
    public void mo32553V0(T value) {
    }

    /* JADX INFO: renamed from: W0 */
    public final <R> void m32554W0(@NotNull EnumC7914r0 start, R receiver, @NotNull Function2<? super R, ? super InterfaceC9557b<? super T>, ? extends Object> block) {
        start.m32903b(block, receiver, this);
    }

    @Override // p256ku.C7880j2
    @NotNull
    /* JADX INFO: renamed from: X */
    public String mo32555X() {
        return C7922t0.m32908a(this) + " was cancelled";
    }

    @Override // p256ku.C7880j2, p256ku.InterfaceC7850d2
    /* JADX INFO: renamed from: b */
    public boolean mo32556b() {
        return super.mo32556b();
    }

    @Override // p315nt.InterfaceC9557b
    @NotNull
    public final CoroutineContext getContext() {
        return this.context;
    }

    @Override // p256ku.C7880j2
    /* JADX INFO: renamed from: p0 */
    public final void mo32557p0(@NotNull Throwable exception) {
        C7898n0.m32820a(this.context, exception);
    }

    @Override // p315nt.InterfaceC9557b
    public final void resumeWith(@NotNull Object result) {
        Object objM32759x0 = m32759x0(C7853e0.m32624b(result));
        if (objM32759x0 == C7885k2.f29753b) {
            return;
        }
        mo32551T0(objM32759x0);
    }

    @Override // p256ku.C7880j2
    @NotNull
    /* JADX INFO: renamed from: y0 */
    public String mo32558y0() {
        String strM32701g = C7878j0.m32701g(this.context);
        if (strM32701g == null) {
            return super.mo32558y0();
        }
        return '\"' + strM32701g + "\":" + super.mo32558y0();
    }
}
