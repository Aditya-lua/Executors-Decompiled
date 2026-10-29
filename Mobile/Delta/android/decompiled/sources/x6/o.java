package x6;

import kotlin.Metadata;
import ku.d2;
import ku.w0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lx6/o;", "Lx6/d;", "Lku/w0;", "Lx6/k;", "job", "<init>", "(Lku/w0;)V", "", "a", "()V", "Lku/w0;", "b", "()Lku/w0;", "", "c", "()Z", "isDisposed", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class o implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final w0<k> job;

    /* JADX WARN: Multi-variable type inference failed */
    public o(@NotNull w0<? extends k> w0Var) {
        this.job = w0Var;
    }

    @Override // x6.d
    public void a() {
        if (c()) {
            return;
        }
        d2.a.a(b(), null, 1, null);
    }

    @Override // x6.d
    @NotNull
    public w0<k> b() {
        return this.job;
    }

    public boolean c() {
        return !b().b();
    }
}
