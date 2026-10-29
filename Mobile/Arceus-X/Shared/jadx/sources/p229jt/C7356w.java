package p229jt;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: jt.w */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087@\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0010B\u0011\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u0012\u0004\b\u0012\u0010\u0013\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0014"}, m31665d2 = {"Ljt/w;", "", "", "data", "b", "(I)I", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "e", "(I)Ljava/lang/String;", "a", "I", "getData$annotations", "()V", "kotlin-stdlib"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C7356w implements Comparable<C7356w> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final int data;

    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [jt.w.a(int):jt.w] */
    public /* synthetic */ C7356w(int i10) {
        this.data = i10;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0002: CONSTRUCTOR (r1v0 int) A[MD:(int):void (m)] call: jt.w.<init>(int):void type: CONSTRUCTOR */
    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ C7356w m30496a(int i10) {
        return new C7356w(i10);
    }

    /* JADX INFO: renamed from: b */
    public static int m30497b(int i10) {
        return i10;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m30498c(int i10, Object obj) {
        return (obj instanceof C7356w) && i10 == ((C7356w) obj).getData();
    }

    /* JADX INFO: renamed from: d */
    public static int m30499d(int i10) {
        return Integer.hashCode(i10);
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public static String m30500e(int i10) {
        return String.valueOf(((long) i10) & 4294967295L);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(C7356w c7356w) {
        return C7339f0.m30451a(getData(), c7356w.getData());
    }

    public boolean equals(Object other) {
        return m30498c(this.data, other);
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final /* synthetic */ int getData() {
        return this.data;
    }

    public int hashCode() {
        return m30499d(this.data);
    }

    @NotNull
    public String toString() {
        return m30500e(this.data);
    }
}
