package p395qu;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p256ku.AbstractC7849d1;
import p256ku.AbstractC7888l0;
import p256ku.AbstractC7894m1;
import p256ku.C7839b1;
import p256ku.C7846c3;
import p256ku.C7853e0;
import p256ku.C7905p;
import p256ku.C7922t0;
import p256ku.InterfaceC7897n;
import p315nt.InterfaceC9557b;
import p563y1.C12996b;
import pt.InterfaceC10343e;

/* JADX INFO: renamed from: qu.i */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u00042\b\u0012\u0004\u0012\u00028\u00000\u0005B\u001d\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0013\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0012H\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0015H\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u0016H\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u0011\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0010¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010!\u001a\u00020\u000e2\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u001f\u0010&\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00028\u0000H\u0000¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b)\u0010*R\u0014\u0010\u0007\u001a\u00020\u00068\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u001e\u00102\u001a\u0004\u0018\u00010\u001c8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b/\u00100\u0012\u0004\b1\u0010\u0010R\u0014\u00104\u001a\u00020\u001c8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b3\u00100R\u001c\u00107\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u00106R\u001a\u0010:\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b8\u00109R\u0014\u0010$\u001a\u00020#8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b;\u0010<R\u001a\u0010>\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b=\u0010\u0014R\u0013\u0010@\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0?8\u0002X\u0082\u0004¨\u0006A"}, m31665d2 = {"Lqu/i;", "T", "Lku/d1;", "Lpt/e;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "Lnt/b;", "Lku/l0;", "dispatcher", "continuation", "<init>", "(Lku/l0;Lnt/b;)V", "", "t", "()Z", "", "l", "()V", "v", "Lku/p;", "m", "()Lku/p;", "Lku/n;", "", "w", "(Lku/n;)Ljava/lang/Throwable;", "cause", "u", "(Ljava/lang/Throwable;)Z", "", "j", "()Ljava/lang/Object;", "Ljt/n;", "result", "resumeWith", "(Ljava/lang/Object;)V", "Lkotlin/coroutines/CoroutineContext;", "context", "value", "q", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "d", "Lku/l0;", "e", "Lnt/b;", "f", "Ljava/lang/Object;", "get_state$kotlinx_coroutines_core$annotations", "_state", "g", "countOrElement", "getCallerFrame", "()Lpt/e;", "callerFrame", "c", "()Lnt/b;", "delegate", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "r", "reusableCancellableContinuation", "Lkotlinx/atomicfu/AtomicRef;", "_reusableCancellableContinuation", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C10726i<T> extends AbstractC7849d1<T> implements InterfaceC10343e, InterfaceC9557b<T> {

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f38279h = AtomicReferenceFieldUpdater.newUpdater(C10726i.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final AbstractC7888l0 dispatcher;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC9557b<T> continuation;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public Object _state;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final Object countOrElement;

    /* JADX DEBUG: Class process forced to load method for inline: qu.j.a():qu.e0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: nt.b<? super T> */
    /* JADX WARN: Multi-variable type inference failed */
    public C10726i(@NotNull AbstractC7888l0 abstractC7888l0, @NotNull InterfaceC9557b<? super T> interfaceC9557b) {
        super(-1);
        this.dispatcher = abstractC7888l0;
        this.continuation = interfaceC9557b;
        this._state = C10728j.f38284a;
        this.countOrElement = C10733l0.m40887g(getContext());
    }

    @Override // p256ku.AbstractC7849d1
    @NotNull
    /* JADX INFO: renamed from: c */
    public InterfaceC9557b<T> mo32591c() {
        return this;
    }

    @Override // pt.InterfaceC10343e
    @Nullable
    public InterfaceC10343e getCallerFrame() {
        InterfaceC9557b<T> interfaceC9557b = this.continuation;
        if (interfaceC9557b instanceof InterfaceC10343e) {
            return (InterfaceC10343e) interfaceC9557b;
        }
        return null;
    }

    @Override // p315nt.InterfaceC9557b
    @NotNull
    public CoroutineContext getContext() {
        return this.continuation.getContext();
    }

    @Override // p256ku.AbstractC7849d1
    @Nullable
    /* JADX INFO: renamed from: j */
    public Object mo32595j() {
        Object obj = this._state;
        this._state = C10728j.f38284a;
        return obj;
    }

    /* JADX INFO: renamed from: l */
    public final void m40858l() {
        while (f38279h.get(this) == C10728j.f38285b) {
        }
    }

    @Nullable
    /* JADX INFO: renamed from: m */
    public final C7905p<T> m40859m() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f38279h;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                f38279h.set(this, C10728j.f38285b);
                return null;
            }
            if (obj instanceof C7905p) {
                if (C12996b.m48310a(f38279h, this, obj, C10728j.f38285b)) {
                    return (C7905p) obj;
                }
            } else if (obj != C10728j.f38285b && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m40860q(@NotNull CoroutineContext context, T value) {
        this._state = value;
        this.resumeMode = 1;
        this.dispatcher.mo32792F(context, this);
    }

    /* JADX INFO: renamed from: r */
    public final C7905p<?> m40861r() {
        Object obj = f38279h.get(this);
        if (obj instanceof C7905p) {
            return (C7905p) obj;
        }
        return null;
    }

    @Override // p315nt.InterfaceC9557b
    public void resumeWith(@NotNull Object result) throws C7839b1 {
        Object objM32624b = C7853e0.m32624b(result);
        if (C10728j.m40869d(this.dispatcher, getContext())) {
            this._state = objM32624b;
            this.resumeMode = 0;
            C10728j.m40868c(this.dispatcher, getContext(), this);
            return;
        }
        AbstractC7894m1 abstractC7894m1M32587b = C7846c3.f29696a.m32587b();
        if (abstractC7894m1M32587b.m32803i0()) {
            this._state = objM32624b;
            this.resumeMode = 0;
            abstractC7894m1M32587b.m32800a0(this);
            return;
        }
        abstractC7894m1M32587b.m32802e0(true);
        try {
            CoroutineContext context = getContext();
            Object objM40889i = C10733l0.m40889i(context, this.countOrElement);
            try {
                this.continuation.resumeWith(result);
                Unit unit = Unit.f29331a;
                C10733l0.m40886f(context, objM40889i);
                while (abstractC7894m1M32587b.m32806t0()) {
                }
            } catch (Throwable th2) {
                C10733l0.m40886f(context, objM40889i);
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                m32594i(th3);
            } finally {
                abstractC7894m1M32587b.m32798X(true);
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public final boolean m40862t() {
        return f38279h.get(this) != null;
    }

    @NotNull
    public String toString() {
        return "DispatchedContinuation[" + this.dispatcher + ", " + C7922t0.m32910c(this.continuation) + ']';
    }

    /* JADX INFO: renamed from: u */
    public final boolean m40863u(@NotNull Throwable cause) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f38279h;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            C10719e0 c10719e0 = C10728j.f38285b;
            if (Intrinsics.m31980c(obj, c10719e0)) {
                if (C12996b.m48310a(f38279h, this, c10719e0, cause)) {
                    return true;
                }
            } else {
                if (obj instanceof Throwable) {
                    return true;
                }
                if (C12996b.m48310a(f38279h, this, obj, null)) {
                    return false;
                }
            }
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m40864v() {
        m40858l();
        C7905p<?> c7905pM40861r = m40861r();
        if (c7905pM40861r != null) {
            c7905pM40861r.m32880u();
        }
    }

    @Nullable
    /* JADX INFO: renamed from: w */
    public final Throwable m40865w(@NotNull InterfaceC7897n<?> continuation) {
        C10719e0 c10719e0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f38279h;
        do {
            Object obj = atomicReferenceFieldUpdater.get(this);
            c10719e0 = C10728j.f38285b;
            if (obj != c10719e0) {
                if (obj instanceof Throwable) {
                    if (C12996b.m48310a(f38279h, this, obj, null)) {
                        return (Throwable) obj;
                    }
                    throw new IllegalArgumentException("Failed requirement.");
                }
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        } while (!C12996b.m48310a(f38279h, this, c10719e0, continuation));
        return null;
    }
}
