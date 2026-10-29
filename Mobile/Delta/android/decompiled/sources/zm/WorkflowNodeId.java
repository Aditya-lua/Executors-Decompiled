package zm;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ym.q;
import ym.s;
import ym.w;

/* JADX INFO: renamed from: zm.k, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000b\b\u0080\b\u0018\u0000 \u000e2\u00020\u0001:\u0001\u001bB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B'\b\u0016\u0012\u0012\u0010\t\u001a\u000e\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u00030\b\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\nJ)\u0010\u000e\u001a\u00020\r2\u0012\u0010\u000b\u001a\u000e\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u00030\b2\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\r2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010\u0014¨\u0006 "}, d2 = {"Lzm/k;", "", "Lym/s;", "identifier", "", "name", "<init>", "(Lym/s;Ljava/lang/String;)V", "Lym/q;", "workflow", "(Lym/q;Ljava/lang/String;)V", "otherWorkflow", "otherName", "", "c", "(Lym/q;Ljava/lang/String;)Z", "Lxu/h;", "d", "()Lxu/h;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lym/s;", "()Lym/s;", "b", "Ljava/lang/String;", "wf1-workflow-runtime"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class WorkflowNodeId {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final s identifier;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final String name;

    /* JADX INFO: renamed from: zm.k$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lzm/k$a;", "", "<init>", "()V", "Lxu/h;", "bytes", "Lzm/k;", "a", "(Lxu/h;)Lzm/k;", "wf1-workflow-runtime"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final WorkflowNodeId a(@NotNull xu.h bytes) {
            Intrinsics.checkNotNullParameter(bytes, "bytes");
            xu.e eVar = new xu.e();
            eVar.d0(bytes);
            return new WorkflowNodeId(s.INSTANCE.a(ym.j.a(eVar)), ym.j.b(eVar));
        }

        public Companion() {
        }
    }

    public WorkflowNodeId(@NotNull s identifier, @NotNull String name) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(name, "name");
        this.identifier = identifier;
        this.name = name;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final s getIdentifier() {
        return this.identifier;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final boolean c(@NotNull q<?, ?, ?> otherWorkflow, @NotNull String otherName) {
        Intrinsics.checkNotNullParameter(otherWorkflow, "otherWorkflow");
        Intrinsics.checkNotNullParameter(otherName, "otherName");
        return Intrinsics.c(this.identifier, w.j(otherWorkflow)) && Intrinsics.c(this.name, otherName);
    }

    @Nullable
    public final xu.h d() {
        xu.h hVarE = this.identifier.e();
        if (hVarE == null) {
            return null;
        }
        xu.e eVar = new xu.e();
        ym.j.c(eVar, hVarE);
        ym.j.d(eVar, getName());
        return eVar.F2();
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WorkflowNodeId)) {
            return false;
        }
        WorkflowNodeId workflowNodeId = (WorkflowNodeId) other;
        return Intrinsics.c(this.identifier, workflowNodeId.identifier) && Intrinsics.c(this.name, workflowNodeId.name);
    }

    public int hashCode() {
        return (this.identifier.hashCode() * 31) + this.name.hashCode();
    }

    @NotNull
    public String toString() {
        return "WorkflowNodeId(identifier=" + this.identifier + ", name=" + this.name + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WorkflowNodeId(@NotNull q<?, ?, ?> workflow, @NotNull String name) {
        this(w.j(workflow), name);
        Intrinsics.checkNotNullParameter(workflow, "workflow");
        Intrinsics.checkNotNullParameter(name, "name");
    }
}
