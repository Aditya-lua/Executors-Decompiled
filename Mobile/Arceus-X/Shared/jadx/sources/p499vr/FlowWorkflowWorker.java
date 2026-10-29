package p499vr;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nu.InterfaceC9575h;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: vr.a, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000f\u001a\u00020\u000e2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0013¨\u0006\u0014"}, m31665d2 = {"Lvr/a;", "OutputT", "Lvr/h;", "", "name", "Lnu/h;", "work", "<init>", "(Ljava/lang/String;Lnu/h;)V", "run", "()Lnu/h;", "toString", "()Ljava/lang/String;", "otherWorker", "", "c", "(Lvr/h;)Z", "b", "Ljava/lang/String;", "Lnu/h;", "workflows_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class FlowWorkflowWorker<OutputT> implements InterfaceC12257h<OutputT> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String name;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC9575h<OutputT> work;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: nu.h<? extends OutputT> */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowWorkflowWorker(@NotNull String name, @NotNull InterfaceC9575h<? extends OutputT> work) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(work, "work");
        this.name = name;
        this.work = work;
    }

    @Override // p499vr.InterfaceC12257h
    /* JADX INFO: renamed from: a */
    public boolean mo7572a(@NotNull InterfaceC12257h<?> interfaceC12257h) {
        return super.mo7572a(interfaceC12257h);
    }

    @Override // p499vr.InterfaceC12257h
    /* JADX INFO: renamed from: c */
    public boolean mo7574c(@NotNull InterfaceC12257h<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        return super.mo7574c(otherWorker) && Intrinsics.m31980c(toString(), otherWorker.toString());
    }

    @Override // p499vr.InterfaceC12257h
    @NotNull
    public InterfaceC9575h<OutputT> run() {
        return this.work;
    }

    @NotNull
    public String toString() {
        return "FlowWorkflowWorker(" + this.name + ")";
    }
}
