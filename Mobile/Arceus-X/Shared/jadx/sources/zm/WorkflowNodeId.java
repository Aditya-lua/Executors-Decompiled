package zm;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p560xu.C12924e;
import p560xu.C12930h;
import p581ym.C13217j;
import p581ym.C13226s;
import p581ym.C13230w;
import p581ym.InterfaceC13224q;

/* JADX INFO: renamed from: zm.k, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000b\b\u0080\b\u0018\u0000 \u000e2\u00020\u0001:\u0001\u001bB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B'\b\u0016\u0012\u0012\u0010\t\u001a\u000e\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u00030\b\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\nJ)\u0010\u000e\u001a\u00020\r2\u0012\u0010\u000b\u001a\u000e\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u00030\b2\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\r2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010\u0014¨\u0006 "}, m31665d2 = {"Lzm/k;", "", "Lym/s;", "identifier", "", "name", "<init>", "(Lym/s;Ljava/lang/String;)V", "Lym/q;", "workflow", "(Lym/q;Ljava/lang/String;)V", "otherWorkflow", "otherName", "", "c", "(Lym/q;Ljava/lang/String;)Z", "Lxu/h;", "d", "()Lxu/h;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lym/s;", "()Lym/s;", "b", "Ljava/lang/String;", "wf1-workflow-runtime"}, m31666k = 1, m31667mv = {1, 6, 0}, m31669xi = 48)
public final /* data */ class WorkflowNodeId {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final C13226s identifier;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final String name;

    /* JADX INFO: renamed from: zm.k$a, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m31665d2 = {"Lzm/k$a;", "", "<init>", "()V", "Lxu/h;", "bytes", "Lzm/k;", "a", "(Lxu/h;)Lzm/k;", "wf1-workflow-runtime"}, m31666k = 1, m31667mv = {1, 6, 0}, m31669xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: zm.k.a.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final WorkflowNodeId m50414a(@NotNull C12930h bytes) {
            Intrinsics.checkNotNullParameter(bytes, "bytes");
            C12924e c12924e = new C12924e();
            c12924e.mo48023d0(bytes);
            return new WorkflowNodeId(C13226s.INSTANCE.m48909a(C13217j.m48877a(c12924e)), C13217j.m48878b(c12924e));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Companion() {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public WorkflowNodeId(@NotNull C13226s identifier, @NotNull String name) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(name, "name");
        this.identifier = identifier;
        this.name = name;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final C13226s getIdentifier() {
        return this.identifier;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m50412c(@NotNull InterfaceC13224q<?, ?, ?> otherWorkflow, @NotNull String otherName) {
        Intrinsics.checkNotNullParameter(otherWorkflow, "otherWorkflow");
        Intrinsics.checkNotNullParameter(otherName, "otherName");
        return Intrinsics.m31980c(this.identifier, C13230w.m48935j(otherWorkflow)) && Intrinsics.m31980c(this.name, otherName);
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public final C12930h m50413d() {
        C12930h c12930hM48908e = this.identifier.m48908e();
        if (c12930hM48908e == null) {
            return null;
        }
        C12924e c12924e = new C12924e();
        C13217j.m48879c(c12924e, c12930hM48908e);
        C13217j.m48880d(c12924e, getName());
        return c12924e.mo47997F2();
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WorkflowNodeId)) {
            return false;
        }
        WorkflowNodeId workflowNodeId = (WorkflowNodeId) other;
        return Intrinsics.m31980c(this.identifier, workflowNodeId.identifier) && Intrinsics.m31980c(this.name, workflowNodeId.name);
    }

    public int hashCode() {
        return (this.identifier.hashCode() * 31) + this.name.hashCode();
    }

    @NotNull
    public String toString() {
        return "WorkflowNodeId(identifier=" + this.identifier + ", name=" + this.name + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WorkflowNodeId(@NotNull InterfaceC13224q<?, ?, ?> workflow, @NotNull String name) {
        this(C13230w.m48935j(workflow), name);
        Intrinsics.checkNotNullParameter(workflow, "workflow");
        Intrinsics.checkNotNullParameter(name, "name");
    }
}
