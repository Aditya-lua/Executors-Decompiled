package vr;

import androidx.p000lifecycle.l0;
import com.withpersona.sdk2.inquiry.workflows.WorkflowState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ku.p0;
import nu.c0;
import nu.r0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\n\b\u0001\u0010\u0003*\u0004\u0018\u00010\u0002*\u0004\b\u0002\u0010\u0004*\u0004\b\u0003\u0010\u00052\u00020\u0006B\u001f\u0012\u0006\u0010\u0007\u001a\u00028\u0000\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00028\u0002H\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00028\u0001H\u0004¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00010\u001b8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001f\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00020\u00158\u0006¢\u0006\f\n\u0004\b \u0010\u0017\u001a\u0004\b\u0016\u0010\u0019R\u001f\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00030\u00158\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b \u0010\u0019¨\u0006\""}, d2 = {"Lvr/c;", "PropsT", "Lcom/withpersona/sdk2/inquiry/workflows/WorkflowState;", "StateT", "OutputT", "RenderingT", "", "initialProp", "Landroidx/lifecycle/l0;", "savedStateHandle", "Lku/p0;", "baseScope", "<init>", "(Ljava/lang/Object;Landroidx/lifecycle/l0;Lku/p0;)V", "output", "", "e", "(Ljava/lang/Object;)V", "newState", "f", "(Lcom/withpersona/sdk2/inquiry/workflows/WorkflowState;)V", "Lnu/c0;", "a", "Lnu/c0;", "b", "()Lnu/c0;", "props", "Lvr/f;", "Lvr/f;", "d", "()Lvr/f;", "workflowContext", "c", "rendering", "workflows_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class c<PropsT, StateT extends WorkflowState, OutputT, RenderingT> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final c0<PropsT> props;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final f<StateT> workflowContext;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final c0<OutputT> output;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final c0<RenderingT> rendering;

    public c(PropsT propst, @NotNull l0 savedStateHandle, @NotNull p0 baseScope) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(baseScope, "baseScope");
        this.props = r0.a(propst);
        this.workflowContext = new f<>(savedStateHandle, baseScope);
        this.output = r0.a(null);
        this.rendering = r0.a(null);
    }

    @NotNull
    public final c0<OutputT> a() {
        return this.output;
    }

    @NotNull
    public final c0<PropsT> b() {
        return this.props;
    }

    @NotNull
    public final c0<RenderingT> c() {
        return this.rendering;
    }

    @NotNull
    public final f<StateT> d() {
        return this.workflowContext;
    }

    public void e(OutputT output) {
        if (this.output.getValue() != null) {
            return;
        }
        this.output.setValue(output);
    }

    public final void f(StateT newState) {
        this.workflowContext.p(newState);
    }
}
