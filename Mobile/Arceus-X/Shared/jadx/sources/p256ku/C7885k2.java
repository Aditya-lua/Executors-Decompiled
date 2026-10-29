package p256ku;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p395qu.C10719e0;

/* JADX INFO: renamed from: ku.k2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\u0018\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0017\u0010\u0001\u001a\u0004\u0018\u00010\u0000*\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0017\u0010\u0003\u001a\u0004\u0018\u00010\u0000*\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0002\"\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006\"\u0014\u0010\t\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0006\"\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0006\"\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0006\"\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006\"\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\"\u0014\u0010\u0014\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u0012¨\u0006\u0015"}, m31665d2 = {"", "g", "(Ljava/lang/Object;)Ljava/lang/Object;", "h", "Lqu/e0;", "a", "Lqu/e0;", "COMPLETING_ALREADY", "b", "COMPLETING_WAITING_CHILDREN", "c", "COMPLETING_RETRY", "d", "TOO_LATE_TO_CANCEL", "e", "SEALED", "Lku/l1;", "f", "Lku/l1;", "EMPTY_NEW", "EMPTY_ACTIVE", "kotlinx-coroutines-core"}, m31666k = 2, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C7885k2 {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C10719e0 f29752a = new C10719e0("COMPLETING_ALREADY");

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final C10719e0 f29753b = new C10719e0("COMPLETING_WAITING_CHILDREN");

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final C10719e0 f29754c = new C10719e0("COMPLETING_RETRY");

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final C10719e0 f29755d = new C10719e0("TOO_LATE_TO_CANCEL");

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final C10719e0 f29756e = new C10719e0("SEALED");

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final C7889l1 f29757f = new C7889l1(false);

    /* JADX INFO: renamed from: g */
    @NotNull
    public static final C7889l1 f29758g = new C7889l1(true);

    @Nullable
    /* JADX INFO: renamed from: g */
    public static final Object m32788g(@Nullable Object obj) {
        return obj instanceof InterfaceC7943y1 ? new C7947z1((InterfaceC7943y1) obj) : obj;
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public static final Object m32789h(@Nullable Object obj) {
        InterfaceC7943y1 interfaceC7943y1;
        C7947z1 c7947z1 = obj instanceof C7947z1 ? (C7947z1) obj : null;
        return (c7947z1 == null || (interfaceC7943y1 = c7947z1.state) == null) ? obj : interfaceC7943y1;
    }
}
