package ku;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\u0005J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u000bH&¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0016\u001a\u00020\u000f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0019R\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u001e¨\u0006 "}, d2 = {"Lku/i2;", "Lqu/p;", "Lku/i1;", "Lku/y1;", "<init>", "()V", "", "a", "", "toString", "()Ljava/lang/String;", "", "cause", "x", "(Ljava/lang/Throwable;)V", "Lku/j2;", "d", "Lku/j2;", "v", "()Lku/j2;", "y", "(Lku/j2;)V", "job", "", "w", "()Z", "onCancelling", "b", "isActive", "Lku/o2;", "()Lku/o2;", "list", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class i2 extends qu.p implements i1, y1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public j2 job;

    @Override // ku.i1
    public void a() {
        v().H0(this);
    }

    @Override // ku.y1
    /* JADX INFO: renamed from: b */
    public boolean getIsActive() {
        return true;
    }

    @Override // ku.y1
    @Nullable
    /* JADX INFO: renamed from: d */
    public o2 getList() {
        return null;
    }

    @Override // qu.p
    @NotNull
    public String toString() {
        return t0.a(this) + '@' + t0.b(this) + "[job@" + t0.b(v()) + ']';
    }

    @NotNull
    public final j2 v() {
        j2 j2Var = this.job;
        if (j2Var != null) {
            return j2Var;
        }
        Intrinsics.u("job");
        return null;
    }

    public abstract boolean w();

    public abstract void x(@Nullable Throwable cause);

    public final void y(@NotNull j2 j2Var) {
        this.job = j2Var;
    }
}
