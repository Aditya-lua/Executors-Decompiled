package p070d7;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p229jt.C7345l;
import p537x6.ErrorResult;
import p537x6.InterfaceC12750k;
import p537x6.SuccessResult;

/* JADX INFO: renamed from: d7.c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0001\tB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, m31665d2 = {"Ld7/c;", "Ld7/d;", "Ld7/e;", "target", "Lx6/k;", "result", "<init>", "(Ld7/e;Lx6/k;)V", "", "a", "()V", "Ld7/e;", "b", "Lx6/k;", "coil-core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C4466c implements InterfaceC4467d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC4468e target;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC12750k result;

    /* JADX INFO: renamed from: d7.c$a */
    @Metadata(m31664d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m31665d2 = {"Ld7/c$a;", "Ld7/d$a;", "<init>", "()V", "Ld7/e;", "target", "Lx6/k;", "result", "Ld7/d;", "a", "(Ld7/e;Lx6/k;)Ld7/d;", "coil-core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class a implements InterfaceC4467d.a {
        @Override // p070d7.InterfaceC4467d.a
        @NotNull
        /* JADX INFO: renamed from: a */
        public InterfaceC4467d mo22413a(@NotNull InterfaceC4468e target, @NotNull InterfaceC12750k result) {
            return new C4466c(target, result);
        }
    }

    public C4466c(@NotNull InterfaceC4468e interfaceC4468e, @NotNull InterfaceC12750k interfaceC12750k) {
        this.target = interfaceC4468e;
        this.result = interfaceC12750k;
    }

    @Override // p070d7.InterfaceC4467d
    /* JADX INFO: renamed from: a */
    public void mo22412a() {
        InterfaceC12750k interfaceC12750k = this.result;
        if (interfaceC12750k instanceof SuccessResult) {
            this.target.mo6969c(((SuccessResult) interfaceC12750k).getImage());
        } else {
            if (!(interfaceC12750k instanceof ErrorResult)) {
                throw new C7345l();
            }
            this.target.mo6967a(((ErrorResult) interfaceC12750k).getImage());
        }
    }
}
