package y5;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0004\"\u0014\u0010\u0003\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"", "a", "Ljava/lang/String;", "TAG", "", "b", "[Ljava/lang/String;", "DATABASE_EXTRA_FILES", "work-runtime_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final String f35638a;

    @NotNull
    public static final String[] b;

    static {
        String strI = x5.w.i("WrkDbPathHelper");
        Intrinsics.checkNotNullExpressionValue(strI, "tagWithPrefix(...)");
        f35638a = strI;
        b = new String[]{"-journal", "-shm", "-wal"};
    }
}
