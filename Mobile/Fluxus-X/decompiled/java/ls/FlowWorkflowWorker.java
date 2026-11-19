package ls;

import com.github.luben.zstd.BuildConfig;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: ls.a, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000f\u001a\u00020\u000e2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0013¨\u0006\u0014"}, d2 = {"Lls/a;", "OutputT", "Lls/j;", BuildConfig.FLAVOR, "name", "Ldv/h;", "work", "<init>", "(Ljava/lang/String;Ldv/h;)V", "run", "()Ldv/h;", "toString", "()Ljava/lang/String;", "otherWorker", BuildConfig.FLAVOR, "c", "(Lls/j;)Z", "b", "Ljava/lang/String;", "Ldv/h;", "workflows_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FlowWorkflowWorker<OutputT> implements j<OutputT> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String name;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final dv.h<OutputT> work;

    /* JADX WARN: Multi-variable type inference failed */
    public FlowWorkflowWorker(@NotNull String name, @NotNull dv.h<? extends OutputT> work) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(work, "work");
        this.name = name;
        this.work = work;
    }

    @Override // ls.j
    public boolean b(@NotNull j<?> jVar) {
        return super.b(jVar);
    }

    @Override // ls.j
    public boolean c(@NotNull j<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        return super.c(otherWorker) && Intrinsics.c(toString(), otherWorker.toString());
    }

    @Override // ls.j
    @NotNull
    public dv.h<OutputT> run() {
        return this.work;
    }

    @NotNull
    public String toString() {
        return "FlowWorkflowWorker(" + this.name + ")";
    }
}
