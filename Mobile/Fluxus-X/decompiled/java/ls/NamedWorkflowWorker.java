package ls;

import com.github.luben.zstd.BuildConfig;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: ls.b, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000f\u001a\u00020\u000e2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0011\u001a\u00020\u000e2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0012R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lls/b;", "OutputT", "Lls/j;", BuildConfig.FLAVOR, "name", "innerWorker", "<init>", "(Ljava/lang/String;Lls/j;)V", "Ldv/h;", "run", "()Ldv/h;", "toString", "()Ljava/lang/String;", "otherWorker", BuildConfig.FLAVOR, "b", "(Lls/j;)Z", "c", "Ljava/lang/String;", "Lls/j;", "getInnerWorker", "()Lls/j;", "workflows_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class NamedWorkflowWorker<OutputT> implements j<OutputT> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String name;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final j<OutputT> innerWorker;

    /* JADX WARN: Multi-variable type inference failed */
    public NamedWorkflowWorker(@NotNull String name, @NotNull j<? extends OutputT> innerWorker) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(innerWorker, "innerWorker");
        this.name = name;
        this.innerWorker = innerWorker;
    }

    @Override // ls.j
    public boolean b(@NotNull j<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        return (otherWorker instanceof NamedWorkflowWorker) && Intrinsics.c(this.name, ((NamedWorkflowWorker) otherWorker).name);
    }

    @Override // ls.j
    public boolean c(@NotNull j<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        if (!super.c(otherWorker)) {
            return false;
        }
        NamedWorkflowWorker namedWorkflowWorker = (NamedWorkflowWorker) otherWorker;
        return namedWorkflowWorker.innerWorker.c((j<?>) this.innerWorker) && Intrinsics.c(toString(), namedWorkflowWorker.toString());
    }

    @Override // ls.j
    @NotNull
    public dv.h<OutputT> run() {
        return this.innerWorker.run();
    }

    @NotNull
    public String toString() {
        return "NamedWorkflowWorker(" + this.name + ")";
    }
}
