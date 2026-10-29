package di;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0005J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0012"}, d2 = {"Ldi/k;", "", "", "id", "b", "(Ljava/lang/String;)Ljava/lang/String;", "f", "", "e", "(Ljava/lang/String;)I", "other", "", "c", "(Ljava/lang/String;Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String id;

    public /* synthetic */ k(String str) {
        this.id = str;
    }

    public static final /* synthetic */ k a(String str) {
        return new k(str);
    }

    @NotNull
    public static String b(@NotNull String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        return id2;
    }

    public static boolean c(String str, Object obj) {
        return (obj instanceof k) && Intrinsics.c(str, ((k) obj).getId());
    }

    public static final boolean d(String str, String str2) {
        return Intrinsics.c(str, str2);
    }

    public static int e(String str) {
        return str.hashCode();
    }

    public static String f(String str) {
        return "RobloxId(id=" + str + ")";
    }

    public boolean equals(Object obj) {
        return c(this.id, obj);
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final /* synthetic */ String getId() {
        return this.id;
    }

    public int hashCode() {
        return e(this.id);
    }

    public String toString() {
        return f(this.id);
    }
}
