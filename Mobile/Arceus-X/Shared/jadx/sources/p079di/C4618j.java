package p079di;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: di.j */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0005J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0012"}, m31665d2 = {"Ldi/j;", "", "", "id", "b", "(Ljava/lang/String;)Ljava/lang/String;", "f", "", "e", "(Ljava/lang/String;)I", "other", "", "c", "(Ljava/lang/String;Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C4618j {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String id;

    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [di.j.a(java.lang.String):di.j] */
    public /* synthetic */ C4618j(String str) {
        this.id = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0002: CONSTRUCTOR (r1v0 java.lang.String) A[MD:(java.lang.String):void (m)] call: di.j.<init>(java.lang.String):void type: CONSTRUCTOR */
    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ C4618j m22806a(String str) {
        return new C4618j(str);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static String m22807b(@NotNull String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        return id2;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m22808c(String str, Object obj) {
        return (obj instanceof C4618j) && Intrinsics.m31980c(str, ((C4618j) obj).getId());
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m22809d(String str, String str2) {
        return Intrinsics.m31980c(str, str2);
    }

    /* JADX INFO: renamed from: e */
    public static int m22810e(String str) {
        return str.hashCode();
    }

    /* JADX INFO: renamed from: f */
    public static String m22811f(String str) {
        return "PlayId(id=" + str + ")";
    }

    public boolean equals(Object obj) {
        return m22808c(this.id, obj);
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final /* synthetic */ String getId() {
        return this.id;
    }

    public int hashCode() {
        return m22810e(this.id);
    }

    public String toString() {
        return m22811f(this.id);
    }
}
