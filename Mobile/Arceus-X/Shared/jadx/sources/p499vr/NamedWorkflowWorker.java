package p499vr;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nu.InterfaceC9575h;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: vr.b, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000f\u001a\u00020\u000e2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0011\u001a\u00020\u000e2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m31665d2 = {"Lvr/b;", "OutputT", "Lvr/h;", "", "name", "innerWorker", "<init>", "(Ljava/lang/String;Lvr/h;)V", "Lnu/h;", "run", "()Lnu/h;", "toString", "()Ljava/lang/String;", "otherWorker", "", "a", "(Lvr/h;)Z", "c", "b", "Ljava/lang/String;", "Lvr/h;", "getInnerWorker", "()Lvr/h;", "workflows_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class NamedWorkflowWorker<OutputT> implements InterfaceC12257h<OutputT> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String name;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC12257h<OutputT> innerWorker;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: vr.h<? extends OutputT> */
    /* JADX WARN: Multi-variable type inference failed */
    public NamedWorkflowWorker(@NotNull String name, @NotNull InterfaceC12257h<? extends OutputT> innerWorker) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(innerWorker, "innerWorker");
        this.name = name;
        this.innerWorker = innerWorker;
    }

    @Override // p499vr.InterfaceC12257h
    /* JADX INFO: renamed from: a */
    public boolean mo7572a(@NotNull InterfaceC12257h<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        return (otherWorker instanceof NamedWorkflowWorker) && Intrinsics.m31980c(this.name, ((NamedWorkflowWorker) otherWorker).name);
    }

    @Override // p499vr.InterfaceC12257h
    /* JADX INFO: renamed from: c */
    public boolean mo7574c(@NotNull InterfaceC12257h<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        if (!super.mo7574c(otherWorker)) {
            return false;
        }
        NamedWorkflowWorker namedWorkflowWorker = (NamedWorkflowWorker) otherWorker;
        return namedWorkflowWorker.innerWorker.mo7574c((InterfaceC12257h<?>) this.innerWorker) && Intrinsics.m31980c(toString(), namedWorkflowWorker.toString());
    }

    @Override // p499vr.InterfaceC12257h
    @NotNull
    public InterfaceC9575h<OutputT> run() {
        return this.innerWorker.run();
    }

    @NotNull
    public String toString() {
        return "NamedWorkflowWorker(" + this.name + ")";
    }
}
