package p499vr;

import androidx.p616lifecycle.C0967l0;
import com.withpersona.sdk2.inquiry.workflows.WorkflowState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nu.C9596r0;
import nu.InterfaceC9566c0;
import org.jetbrains.annotations.NotNull;
import p256ku.InterfaceC7906p0;

/* JADX INFO: renamed from: vr.c */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\n\b\u0001\u0010\u0003*\u0004\u0018\u00010\u0002*\u0004\b\u0002\u0010\u0004*\u0004\b\u0003\u0010\u00052\u00020\u0006B\u001f\u0012\u0006\u0010\u0007\u001a\u00028\u0000\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00028\u0002H\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00028\u0001H\u0004¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00010\u001b8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001f\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00020\u00158\u0006¢\u0006\f\n\u0004\b \u0010\u0017\u001a\u0004\b\u0016\u0010\u0019R\u001f\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00030\u00158\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b \u0010\u0019¨\u0006\""}, m31665d2 = {"Lvr/c;", "PropsT", "Lcom/withpersona/sdk2/inquiry/workflows/WorkflowState;", "StateT", "OutputT", "RenderingT", "", "initialProp", "Landroidx/lifecycle/l0;", "savedStateHandle", "Lku/p0;", "baseScope", "<init>", "(Ljava/lang/Object;Landroidx/lifecycle/l0;Lku/p0;)V", "output", "", "e", "(Ljava/lang/Object;)V", "newState", "f", "(Lcom/withpersona/sdk2/inquiry/workflows/WorkflowState;)V", "Lnu/c0;", "a", "Lnu/c0;", "b", "()Lnu/c0;", "props", "Lvr/f;", "Lvr/f;", "d", "()Lvr/f;", "workflowContext", "c", "rendering", "workflows_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public abstract class AbstractC12252c<PropsT, StateT extends WorkflowState, OutputT, RenderingT> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC9566c0<PropsT> props;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final C12255f<StateT> workflowContext;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC9566c0<OutputT> output;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC9566c0<RenderingT> rendering;

    public AbstractC12252c(PropsT propst, @NotNull C0967l0 savedStateHandle, @NotNull InterfaceC7906p0 baseScope) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(baseScope, "baseScope");
        this.props = C9596r0.m37859a(propst);
        this.workflowContext = new C12255f<>(savedStateHandle, baseScope);
        this.output = C9596r0.m37859a(null);
        this.rendering = C9596r0.m37859a(null);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final InterfaceC9566c0<OutputT> m45394a() {
        return this.output;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final InterfaceC9566c0<PropsT> m45395b() {
        return this.props;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final InterfaceC9566c0<RenderingT> m45396c() {
        return this.rendering;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final C12255f<StateT> m45397d() {
        return this.workflowContext;
    }

    /* JADX INFO: renamed from: e */
    public void m45398e(OutputT output) {
        if (this.output.getValue() != null) {
            return;
        }
        this.output.setValue(output);
    }

    /* JADX INFO: renamed from: f */
    public final void m45399f(StateT newState) {
        this.workflowContext.m45417p(newState);
    }
}
