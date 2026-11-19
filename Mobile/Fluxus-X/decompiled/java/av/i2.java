package av;

import com.github.luben.zstd.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\u0005J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u000bH&¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0016\u001a\u00020\u000f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0019R\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u001e¨\u0006 "}, d2 = {"Lav/i2;", "Lgv/p;", "Lav/i1;", "Lav/y1;", "<init>", "()V", BuildConfig.FLAVOR, "a", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", BuildConfig.FLAVOR, "cause", "x", "(Ljava/lang/Throwable;)V", "Lav/j2;", "d", "Lav/j2;", "v", "()Lav/j2;", "y", "(Lav/j2;)V", "job", BuildConfig.FLAVOR, "w", "()Z", "onCancelling", "b", "isActive", "Lav/o2;", "()Lav/o2;", "list", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class i2 extends gv.p implements i1, y1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public j2 job;

    @Override // av.i1
    public void a() {
        v().H0(this);
    }

    @Override // av.y1
    /* JADX INFO: renamed from: b */
    public boolean getIsActive() {
        return true;
    }

    @Override // av.y1
    @Nullable
    /* JADX INFO: renamed from: d */
    public o2 getList() {
        return null;
    }

    @Override // gv.p
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
