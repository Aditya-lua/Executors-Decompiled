package x6;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ku.d2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0081@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0013"}, d2 = {"Lx6/b;", "Lx6/q;", "Lku/d2;", "job", "f", "(Lku/d2;)Lku/d2;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lku/d2;", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final d2 job;

    public /* synthetic */ b(d2 d2Var) {
        this.job = d2Var;
    }

    public static final /* synthetic */ b d(d2 d2Var) {
        return new b(d2Var);
    }

    @NotNull
    public static d2 f(@NotNull d2 d2Var) {
        return d2Var;
    }

    public static boolean g(d2 d2Var, Object obj) {
        return (obj instanceof b) && Intrinsics.c(d2Var, ((b) obj).getJob());
    }

    public static int h(d2 d2Var) {
        return d2Var.hashCode();
    }

    public static String i(d2 d2Var) {
        return "BaseRequestDelegate(job=" + d2Var + ')';
    }

    public boolean equals(Object other) {
        return g(this.job, other);
    }

    public int hashCode() {
        return h(this.job);
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final /* synthetic */ d2 getJob() {
        return this.job;
    }

    public String toString() {
        return i(this.job);
    }
}
