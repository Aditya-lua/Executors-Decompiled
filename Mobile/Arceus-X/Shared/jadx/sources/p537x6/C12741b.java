package p537x6;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p256ku.InterfaceC7850d2;

/* JADX INFO: renamed from: x6.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0081@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0013"}, m31665d2 = {"Lx6/b;", "Lx6/q;", "Lku/d2;", "job", "f", "(Lku/d2;)Lku/d2;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lku/d2;", "coil-core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C12741b implements InterfaceC12756q {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC7850d2 job;

    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [x6.b.d(ku.d2):x6.b] */
    public /* synthetic */ C12741b(InterfaceC7850d2 interfaceC7850d2) {
        this.job = interfaceC7850d2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0002: CONSTRUCTOR (r1v0 ku.d2) A[MD:(ku.d2):void (m)] call: x6.b.<init>(ku.d2):void type: CONSTRUCTOR */
    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ C12741b m47480d(InterfaceC7850d2 interfaceC7850d2) {
        return new C12741b(interfaceC7850d2);
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public static InterfaceC7850d2 m47481f(@NotNull InterfaceC7850d2 interfaceC7850d2) {
        return interfaceC7850d2;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m47482g(InterfaceC7850d2 interfaceC7850d2, Object obj) {
        return (obj instanceof C12741b) && Intrinsics.m31980c(interfaceC7850d2, ((C12741b) obj).getJob());
    }

    /* JADX INFO: renamed from: h */
    public static int m47483h(InterfaceC7850d2 interfaceC7850d2) {
        return interfaceC7850d2.hashCode();
    }

    /* JADX INFO: renamed from: i */
    public static String m47484i(InterfaceC7850d2 interfaceC7850d2) {
        return "BaseRequestDelegate(job=" + interfaceC7850d2 + ')';
    }

    public boolean equals(Object other) {
        return m47482g(this.job, other);
    }

    public int hashCode() {
        return m47483h(this.job);
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final /* synthetic */ InterfaceC7850d2 getJob() {
        return this.job;
    }

    public String toString() {
        return m47484i(this.job);
    }
}
