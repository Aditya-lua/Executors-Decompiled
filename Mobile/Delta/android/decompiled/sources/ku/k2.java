package ku;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0017\u0010\u0001\u001a\u0004\u0018\u00010\u0000*\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0017\u0010\u0003\u001a\u0004\u0018\u00010\u0000*\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0002\"\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006\"\u0014\u0010\t\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0006\"\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0006\"\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0006\"\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006\"\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\"\u0014\u0010\u0014\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u0012¨\u0006\u0015"}, d2 = {"", "g", "(Ljava/lang/Object;)Ljava/lang/Object;", "h", "Lqu/e0;", "a", "Lqu/e0;", "COMPLETING_ALREADY", "b", "COMPLETING_WAITING_CHILDREN", "c", "COMPLETING_RETRY", "d", "TOO_LATE_TO_CANCEL", "e", "SEALED", "Lku/l1;", "f", "Lku/l1;", "EMPTY_NEW", "EMPTY_ACTIVE", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class k2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final qu.e0 f22818a = new qu.e0("COMPLETING_ALREADY");

    @NotNull
    public static final qu.e0 b = new qu.e0("COMPLETING_WAITING_CHILDREN");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final qu.e0 f22819c = new qu.e0("COMPLETING_RETRY");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final qu.e0 f22820d = new qu.e0("TOO_LATE_TO_CANCEL");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final qu.e0 f22821e = new qu.e0("SEALED");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final l1 f22822f = new l1(false);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final l1 f22823g = new l1(true);

    @Nullable
    public static final Object g(@Nullable Object obj) {
        return obj instanceof y1 ? new z1((y1) obj) : obj;
    }

    @Nullable
    public static final Object h(@Nullable Object obj) {
        y1 y1Var;
        z1 z1Var = obj instanceof z1 ? (z1) obj : null;
        return (z1Var == null || (y1Var = z1Var.state) == null) ? obj : y1Var;
    }
}
