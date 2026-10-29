package pt;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7347n;
import p229jt.C7348o;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;

/* JADX INFO: renamed from: pt.a */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b!\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u00032\u00020\u0004B\u0019\u0012\u0010\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\u00020\n2\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\r\u001a\u0004\u0018\u00010\u00022\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\bH$¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u00012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u00012\b\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\u0011\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0011\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR!\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010 \u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, m31665d2 = {"Lpt/a;", "Lnt/b;", "", "Lpt/e;", "Ljava/io/Serializable;", "completion", "<init>", "(Lnt/b;)V", "Ljt/n;", "result", "", "resumeWith", "(Ljava/lang/Object;)V", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "releaseIntercepted", "()V", "create", "(Lnt/b;)Lnt/b;", "value", "(Ljava/lang/Object;Lnt/b;)Lnt/b;", "", "toString", "()Ljava/lang/String;", "Ljava/lang/StackTraceElement;", "getStackTraceElement", "()Ljava/lang/StackTraceElement;", "Lnt/b;", "getCompletion", "()Lnt/b;", "getCallerFrame", "()Lpt/e;", "callerFrame", "kotlin-stdlib"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public abstract class AbstractC10339a implements InterfaceC9557b<Object>, InterfaceC10343e, Serializable {

    @Nullable
    private final InterfaceC9557b<Object> completion;

    public AbstractC10339a(@Nullable InterfaceC9557b<Object> interfaceC9557b) {
        this.completion = interfaceC9557b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @NotNull
    public InterfaceC9557b<Unit> create(@NotNull InterfaceC9557b<?> completion) {
        Intrinsics.checkNotNullParameter(completion, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    @Nullable
    public InterfaceC10343e getCallerFrame() {
        InterfaceC9557b<Object> interfaceC9557b = this.completion;
        if (interfaceC9557b instanceof InterfaceC10343e) {
            return (InterfaceC10343e) interfaceC9557b;
        }
        return null;
    }

    @Nullable
    public final InterfaceC9557b<Object> getCompletion() {
        return this.completion;
    }

    @Nullable
    public StackTraceElement getStackTraceElement() {
        return C10345g.m39670c(this);
    }

    @Nullable
    public abstract Object invokeSuspend(@NotNull Object result);

    public void releaseIntercepted() {
    }

    @Override // p315nt.InterfaceC9557b
    public final void resumeWith(@NotNull Object result) {
        InterfaceC9557b<Object> interfaceC9557b = this;
        while (true) {
            C10346h.m39672b(interfaceC9557b);
            AbstractC10339a abstractC10339a = (AbstractC10339a) interfaceC9557b;
            InterfaceC9557b<Object> interfaceC9557b2 = abstractC10339a.completion;
            Intrinsics.checkNotNull(interfaceC9557b2);
            try {
                Object objInvokeSuspend = abstractC10339a.invokeSuspend(result);
                if (objInvokeSuspend == C10047c.m38805e()) {
                    return;
                } else {
                    result = C7347n.m30460b(objInvokeSuspend);
                }
            } catch (Throwable th2) {
                C7347n.Companion companion = C7347n.INSTANCE;
                result = C7347n.m30460b(C7348o.m30469a(th2));
            }
            abstractC10339a.releaseIntercepted();
            if (!(interfaceC9557b2 instanceof AbstractC10339a)) {
                interfaceC9557b2.resumeWith(result);
                return;
            }
            interfaceC9557b = interfaceC9557b2;
        }
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb2.append(stackTraceElement);
        return sb2.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @NotNull
    public InterfaceC9557b<Unit> create(@Nullable Object value, @NotNull InterfaceC9557b<?> completion) {
        Intrinsics.checkNotNullParameter(completion, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }
}
