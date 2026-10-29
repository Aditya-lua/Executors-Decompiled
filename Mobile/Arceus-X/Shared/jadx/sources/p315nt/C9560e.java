package p315nt;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7347n;
import p344ot.C10047c;
import p344ot.EnumC10045a;
import p563y1.C12996b;
import pt.InterfaceC10343e;

/* JADX INFO: renamed from: nt.e */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000 \u001d*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003:\u0001\u000fB!\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0017\b\u0011\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0007\u0010\tJ\u001d\u0010\r\u001a\u00020\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0011\u0010\u000f\u001a\u0004\u0018\u00010\u0005H\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0014R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, m31665d2 = {"Lnt/e;", "T", "Lnt/b;", "Lpt/e;", "delegate", "", "initialResult", "<init>", "(Lnt/b;Ljava/lang/Object;)V", "(Lnt/b;)V", "Ljt/n;", "result", "", "resumeWith", "(Ljava/lang/Object;)V", "a", "()Ljava/lang/Object;", "", "toString", "()Ljava/lang/String;", "Lnt/b;", "Ljava/lang/Object;", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "context", "getCallerFrame", "()Lpt/e;", "callerFrame", "b", "kotlin-stdlib"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C9560e<T> implements InterfaceC9557b<T>, InterfaceC10343e {

    /* JADX INFO: renamed from: b */
    @NotNull
    private static final a f34532b = new a(null);

    /* JADX INFO: renamed from: c */
    public static final AtomicReferenceFieldUpdater<C9560e<?>, Object> f34533c = AtomicReferenceFieldUpdater.newUpdater(C9560e.class, Object.class, "result");

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC9557b<T> delegate;

    @Nullable
    private volatile Object result;

    /* JADX INFO: renamed from: nt.e$a */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m31665d2 = {"Lnt/e$a;", "", "<init>", "()V", "kotlin-stdlib"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class a {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: nt.e.a.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public a() {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: nt.b<? super T> */
    /* JADX WARN: Multi-variable type inference failed */
    public C9560e(@NotNull InterfaceC9557b<? super T> delegate, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.delegate = delegate;
        this.result = obj;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final Object m37701a() throws Throwable {
        Object obj = this.result;
        EnumC10045a enumC10045a = EnumC10045a.UNDECIDED;
        if (obj == enumC10045a) {
            if (C12996b.m48310a(f34533c, this, enumC10045a, C10047c.m38805e())) {
                return C10047c.m38805e();
            }
            obj = this.result;
        }
        if (obj == EnumC10045a.RESUMED) {
            return C10047c.m38805e();
        }
        if (obj instanceof C7347n.Failure) {
            throw ((C7347n.Failure) obj).exception;
        }
        return obj;
    }

    @Override // pt.InterfaceC10343e
    @Nullable
    public InterfaceC10343e getCallerFrame() {
        InterfaceC9557b<T> interfaceC9557b = this.delegate;
        if (interfaceC9557b instanceof InterfaceC10343e) {
            return (InterfaceC10343e) interfaceC9557b;
        }
        return null;
    }

    @Override // p315nt.InterfaceC9557b
    @NotNull
    public CoroutineContext getContext() {
        return this.delegate.getContext();
    }

    @Override // p315nt.InterfaceC9557b
    public void resumeWith(@NotNull Object result) {
        while (true) {
            Object obj = this.result;
            EnumC10045a enumC10045a = EnumC10045a.UNDECIDED;
            if (obj == enumC10045a) {
                if (C12996b.m48310a(f34533c, this, enumC10045a, result)) {
                    return;
                }
            } else {
                if (obj != C10047c.m38805e()) {
                    throw new IllegalStateException("Already resumed");
                }
                if (C12996b.m48310a(f34533c, this, C10047c.m38805e(), EnumC10045a.RESUMED)) {
                    this.delegate.resumeWith(result);
                    return;
                }
            }
        }
    }

    @NotNull
    public String toString() {
        return "SafeContinuation for " + this.delegate;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C9560e(@NotNull InterfaceC9557b<? super T> delegate) {
        this(delegate, EnumC10045a.UNDECIDED);
        Intrinsics.checkNotNullParameter(delegate, "delegate");
    }
}
