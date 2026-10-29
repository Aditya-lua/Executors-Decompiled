package p581ym;

import hu.InterfaceC6577m;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nu.InterfaceC9575h;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: ym.n, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m31665d2 = {"Lym/n;", "OutputT", "Lym/o;", "Lhu/m;", "outputType", "Lnu/h;", "work", "<init>", "(Lhu/m;Lnu/h;)V", "run", "()Lnu/h;", "", "toString", "()Ljava/lang/String;", "b", "Lhu/m;", "c", "Lnu/h;", "wf1-workflow-core"}, m31666k = 1, m31667mv = {1, 6, 0}, m31669xi = 48)
public final class TypedWorker<OutputT> implements InterfaceC13222o<OutputT> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC6577m outputType;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC9575h<OutputT> work;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: nu.h<? extends OutputT> */
    /* JADX WARN: Multi-variable type inference failed */
    public TypedWorker(@NotNull InterfaceC6577m outputType, @NotNull InterfaceC9575h<? extends OutputT> work) {
        Intrinsics.checkNotNullParameter(outputType, "outputType");
        Intrinsics.checkNotNullParameter(work, "work");
        this.outputType = outputType;
        this.work = work;
    }

    @Override // p581ym.InterfaceC13222o
    /* JADX INFO: renamed from: b */
    public boolean mo7573b(@NotNull InterfaceC13222o<?> interfaceC13222o) {
        return InterfaceC13222o.b.m48893a(this, interfaceC13222o);
    }

    @Override // p581ym.InterfaceC13222o, p499vr.InterfaceC12257h
    @NotNull
    public InterfaceC9575h<OutputT> run() {
        return this.work;
    }

    @NotNull
    public String toString() {
        return "TypedWorker(" + this.outputType + ')';
    }
}
