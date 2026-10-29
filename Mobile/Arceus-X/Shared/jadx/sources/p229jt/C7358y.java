package p229jt;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: jt.y */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087@\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0011B\u0011\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u0012\u0004\b\u0013\u0010\u0014\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0015"}, m31665d2 = {"Ljt/y;", "", "", "data", "b", "(J)J", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "e", "(J)Ljava/lang/String;", "a", "J", "getData$annotations", "()V", "kotlin-stdlib"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C7358y implements Comparable<C7358y> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final long data;

    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [jt.y.a(long):jt.y] */
    public /* synthetic */ C7358y(long j10) {
        this.data = j10;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0002: CONSTRUCTOR (r1v0 long) A[MD:(long):void (m)] call: jt.y.<init>(long):void type: CONSTRUCTOR */
    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ C7358y m30514a(long j10) {
        return new C7358y(j10);
    }

    /* JADX INFO: renamed from: b */
    public static long m30515b(long j10) {
        return j10;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m30516c(long j10, Object obj) {
        return (obj instanceof C7358y) && j10 == ((C7358y) obj).getData();
    }

    /* JADX INFO: renamed from: d */
    public static int m30517d(long j10) {
        return Long.hashCode(j10);
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public static String m30518e(long j10) {
        return C7339f0.m30453c(j10, 10);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(C7358y c7358y) {
        return C7339f0.m30452b(getData(), c7358y.getData());
    }

    public boolean equals(Object other) {
        return m30516c(this.data, other);
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final /* synthetic */ long getData() {
        return this.data;
    }

    public int hashCode() {
        return m30517d(this.data);
    }

    @NotNull
    public String toString() {
        return m30518e(this.data);
    }
}
