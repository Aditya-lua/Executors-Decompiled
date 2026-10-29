package zm;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7739h0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p581ym.AbstractC13218k;
import p581ym.AbstractC13225r;
import p581ym.InterfaceC13224q;

/* JADX INFO: renamed from: zm.i */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u0003*\u0004\b\u0003\u0010\u0004*\u0004\b\u0004\u0010\u00052\u001c\u0012\u0018\u0012\u0016\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00000\u0006B_\u0012\u0014\u0010\b\u001a\u0010\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u0001\u0012\u0002\b\u00030\u0007\u0012$\u0010\u000b\u001a \u0012\u0004\u0012\u00028\u0001\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00040\n0\t\u0012\u001a\u0010\r\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u0001\u0012\u0002\b\u00030\f¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0014\u001a\u00020\u00132\u0012\u0010\u0010\u001a\u000e\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00072\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015JK\u0010\u001c\u001a\u00020\u001b\"\u0004\b\u0005\u0010\u0016\"\u0004\b\u0006\u0010\u0017\"\u0004\b\u0007\u0010\u0018\"\u0004\b\b\u0010\u00192$\u0010\u001a\u001a \u0012\u0004\u0012\u00028\u0005\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00028\b0\n0\t¢\u0006\u0004\b\u001c\u0010\u001dJ5\u0010\"\u001a\u00028\u0005\"\u0004\b\u0005\u0010\u001e2\u0016\u0010\b\u001a\u0012\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u001f2\b\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\"\u0010#J)\u0010%\u001a\u0014\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00040\n2\b\u0010$\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b%\u0010&R%\u0010\b\u001a\u0010\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u0001\u0012\u0002\b\u00030\u00078\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R4\u0010\u000b\u001a \u0012\u0004\u0012\u00028\u0001\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00040\n0\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R+\u0010\r\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u0001\u0012\u0002\b\u00030\f8\u0006¢\u0006\f\n\u0004\b%\u0010-\u001a\u0004\b.\u0010/R8\u00106\u001a\u0018\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u00008\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u0011\u00109\u001a\u0002078F¢\u0006\u0006\u001a\u0004\b0\u00108¨\u0006:"}, m31665d2 = {"Lzm/i;", "ChildPropsT", "ChildOutputT", "ParentPropsT", "ParentStateT", "ParentOutputT", "Lzm/e$a;", "Lym/q;", "workflow", "Lkotlin/Function1;", "Lym/r;", "handler", "Lzm/j;", "workflowNode", "<init>", "(Lym/q;Lkotlin/jvm/functions/Function1;Lzm/j;)V", "otherWorkflow", "", "key", "", "h", "(Lym/q;Ljava/lang/String;)Z", "CO", "CP", "S", "O", "newHandler", "", "j", "(Lkotlin/jvm/functions/Function1;)V", "R", "Lym/k;", "", "props", "i", "(Lym/k;Ljava/lang/Object;)Ljava/lang/Object;", "output", "c", "(Ljava/lang/Object;)Lym/r;", "a", "Lym/q;", "f", "()Lym/q;", "b", "Lkotlin/jvm/functions/Function1;", "Lzm/j;", "g", "()Lzm/j;", "d", "Lzm/i;", "e", "()Lzm/i;", "k", "(Lzm/i;)V", "nextListNode", "Lzm/k;", "()Lzm/k;", "id", "wf1-workflow-runtime"}, m31666k = 1, m31667mv = {1, 6, 0}, m31669xi = 48)
public final class C13849i<ChildPropsT, ChildOutputT, ParentPropsT, ParentStateT, ParentOutputT> implements C13845e.a<C13849i<?, ?, ?, ?, ?>> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC13224q<?, ChildOutputT, ?> workflow;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public Function1<? super ChildOutputT, ? extends AbstractC13225r<? super ParentPropsT, ParentStateT, ? extends ParentOutputT>> handler;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final C13850j<ChildPropsT, ?, ChildOutputT, ?> workflowNode;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public C13849i<?, ?, ?, ?, ?> nextListNode;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: ym.q<?, ? extends ChildOutputT, ?> */
    /* JADX WARN: Multi-variable type inference failed */
    public C13849i(@NotNull InterfaceC13224q<?, ? extends ChildOutputT, ?> workflow, @NotNull Function1<? super ChildOutputT, ? extends AbstractC13225r<? super ParentPropsT, ParentStateT, ? extends ParentOutputT>> handler, @NotNull C13850j<ChildPropsT, ?, ChildOutputT, ?> workflowNode) {
        Intrinsics.checkNotNullParameter(workflow, "workflow");
        Intrinsics.checkNotNullParameter(handler, "handler");
        Intrinsics.checkNotNullParameter(workflowNode, "workflowNode");
        this.workflow = workflow;
        this.handler = handler;
        this.workflowNode = workflowNode;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final AbstractC13225r<ParentPropsT, ParentStateT, ParentOutputT> m50382c(@Nullable Object output) {
        return this.handler.invoke(output);
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final WorkflowNodeId m50383d() {
        return this.workflowNode.getId();
    }

    /* JADX DEBUG: Method merged with bridge method: a()Lzm/e$a; */
    @Override // zm.C13845e.a
    @Nullable
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public C13849i<?, ?, ?, ?, ?> getNextListNode() {
        return this.nextListNode;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final InterfaceC13224q<?, ChildOutputT, ?> m50385f() {
        return this.workflow;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final C13850j<ChildPropsT, ?, ChildOutputT, ?> m50386g() {
        return this.workflowNode;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m50387h(@NotNull InterfaceC13224q<?, ?, ?> otherWorkflow, @NotNull String key) {
        Intrinsics.checkNotNullParameter(otherWorkflow, "otherWorkflow");
        Intrinsics.checkNotNullParameter(key, "key");
        return m50383d().m50412c(otherWorkflow, key);
    }

    /* JADX INFO: renamed from: i */
    public final <R> R m50388i(@NotNull AbstractC13218k<?, ?, ?, ?> workflow, @Nullable Object props) {
        Intrinsics.checkNotNullParameter(workflow, "workflow");
        return (R) this.workflowNode.m50401m(workflow, props);
    }

    /* JADX INFO: renamed from: j */
    public final <CO, CP, S, O> void m50389j(@NotNull Function1<? super CO, ? extends AbstractC13225r<? super CP, S, ? extends O>> newHandler) {
        Intrinsics.checkNotNullParameter(newHandler, "newHandler");
        this.handler = (Function1) C7739h0.m32040e(newHandler, 1);
    }

    /* JADX DEBUG: Method merged with bridge method: b(Lzm/e$a;)V */
    @Override // zm.C13845e.a
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void mo50366b(@Nullable C13849i<?, ?, ?, ?, ?> c13849i) {
        this.nextListNode = c13849i;
    }
}
