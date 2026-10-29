package p256ku;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7347n;
import p229jt.C7348o;
import p315nt.InterfaceC9557b;
import p395qu.C10726i;
import p395qu.C10733l0;
import su.AbstractRunnableC11459h;

/* JADX INFO: renamed from: ku.d1 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00060\u0002j\u0002`\u0003B\u0011\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\t\u001a\u0004\u0018\u00010\bH ¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000f\u001a\u00020\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\b2\u0006\u0010\r\u001a\u00020\fH\u0010¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0012\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00012\b\u0010\u0011\u001a\u0004\u0018\u00010\bH\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0014\u001a\u0004\u0018\u00010\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\bH\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u000e¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d8 X \u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001e¨\u0006 "}, m31665d2 = {"Lku/d1;", "T", "Lsu/h;", "Lkotlinx/coroutines/SchedulerTask;", "", "resumeMode", "<init>", "(I)V", "", "j", "()Ljava/lang/Object;", "takenState", "", "cause", "", "a", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", "state", "h", "(Ljava/lang/Object;)Ljava/lang/Object;", "g", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "run", "()V", "exception", "i", "(Ljava/lang/Throwable;)V", "c", "I", "Lnt/b;", "()Lnt/b;", "delegate", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public abstract class AbstractC7849d1<T> extends AbstractRunnableC11459h {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public int resumeMode;

    public AbstractC7849d1(int i10) {
        this.resumeMode = i10;
    }

    /* JADX INFO: renamed from: a */
    public void mo32590a(@Nullable Object takenState, @NotNull Throwable cause) {
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public abstract InterfaceC9557b<T> mo32591c();

    @Nullable
    /* JADX INFO: renamed from: g */
    public Throwable mo32592g(@Nullable Object state) {
        C7843c0 c7843c0 = state instanceof C7843c0 ? (C7843c0) state : null;
        if (c7843c0 != null) {
            return c7843c0.cause;
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h */
    public <T> T mo32593h(@Nullable Object state) {
        return state;
    }

    /* JADX INFO: renamed from: i */
    public final void m32594i(@NotNull Throwable exception) {
        C7898n0.m32820a(mo32591c().getContext(), new C7918s0("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", exception));
    }

    @Nullable
    /* JADX INFO: renamed from: j */
    public abstract Object mo32595j();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            InterfaceC9557b<T> interfaceC9557bMo32591c = mo32591c();
            Intrinsics.m31981d(interfaceC9557bMo32591c, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            C10726i c10726i = (C10726i) interfaceC9557bMo32591c;
            InterfaceC9557b<T> interfaceC9557b = c10726i.continuation;
            Object obj = c10726i.countOrElement;
            CoroutineContext context = interfaceC9557b.getContext();
            Object objM40889i = C10733l0.m40889i(context, obj);
            InterfaceC7850d2 interfaceC7850d2 = null;
            C7876i3<?> c7876i3M32707m = objM40889i != C10733l0.f38295a ? C7878j0.m32707m(interfaceC9557b, context, objM40889i) : null;
            try {
                CoroutineContext context2 = interfaceC9557b.getContext();
                Object objMo32595j = mo32595j();
                Throwable thMo32592g = mo32592g(objMo32595j);
                if (thMo32592g == null && C7854e1.m32627b(this.resumeMode)) {
                    interfaceC7850d2 = (InterfaceC7850d2) context2.get(InterfaceC7850d2.INSTANCE);
                }
                if (interfaceC7850d2 != null && !interfaceC7850d2.mo32556b()) {
                    CancellationException cancellationExceptionMo32600m = interfaceC7850d2.mo32600m();
                    mo32590a(objMo32595j, cancellationExceptionMo32600m);
                    C7347n.Companion companion = C7347n.INSTANCE;
                    interfaceC9557b.resumeWith(C7347n.m30460b(C7348o.m30469a(cancellationExceptionMo32600m)));
                } else if (thMo32592g != null) {
                    C7347n.Companion companion2 = C7347n.INSTANCE;
                    interfaceC9557b.resumeWith(C7347n.m30460b(C7348o.m30469a(thMo32592g)));
                } else {
                    C7347n.Companion companion3 = C7347n.INSTANCE;
                    interfaceC9557b.resumeWith(C7347n.m30460b(mo32593h(objMo32595j)));
                }
                Unit unit = Unit.f29331a;
            } finally {
                if (c7876i3M32707m == null || c7876i3M32707m.m32690Y0()) {
                    C10733l0.m40886f(context, objM40889i);
                }
            }
        } catch (C7839b1 e10) {
            C7898n0.m32820a(mo32591c().getContext(), e10.getCause());
        } catch (Throwable th2) {
            m32594i(th2);
        }
    }
}
