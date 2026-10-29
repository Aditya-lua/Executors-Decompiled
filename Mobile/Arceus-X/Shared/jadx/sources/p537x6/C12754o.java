package p537x6;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p256ku.InterfaceC7850d2;
import p256ku.InterfaceC7934w0;

/* JADX INFO: renamed from: x6.o */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, m31665d2 = {"Lx6/o;", "Lx6/d;", "Lku/w0;", "Lx6/k;", "job", "<init>", "(Lku/w0;)V", "", "a", "()V", "Lku/w0;", "b", "()Lku/w0;", "", "c", "()Z", "isDisposed", "coil-core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C12754o implements InterfaceC12743d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC7934w0<InterfaceC12750k> job;

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: ku.w0<? extends x6.k> */
    /* JADX WARN: Multi-variable type inference failed */
    public C12754o(@NotNull InterfaceC7934w0<? extends InterfaceC12750k> interfaceC7934w0) {
        this.job = interfaceC7934w0;
    }

    @Override // p537x6.InterfaceC12743d
    /* JADX INFO: renamed from: a */
    public void mo47489a() {
        if (m47606c()) {
            return;
        }
        InterfaceC7850d2.a.m32603a(mo47490b(), null, 1, null);
    }

    @Override // p537x6.InterfaceC12743d
    @NotNull
    /* JADX INFO: renamed from: b */
    public InterfaceC7934w0<InterfaceC12750k> mo47490b() {
        return this.job;
    }

    /* JADX INFO: renamed from: c */
    public boolean m47606c() {
        return !mo47490b().mo32556b();
    }
}
