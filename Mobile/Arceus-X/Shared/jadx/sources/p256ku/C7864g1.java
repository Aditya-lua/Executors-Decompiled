package p256ku;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p395qu.C10748t;
import su.C11454c;
import su.ExecutorC11453b;

/* JADX INFO: renamed from: ku.g1 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\bR \u0010\u000e\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010\u0006\u0012\u0004\b\r\u0010\u0003\u001a\u0004\b\f\u0010\bR\u001a\u0010\u0012\u001a\u00020\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0011\u0010\u0003\u001a\u0004\b\u000b\u0010\u0010R\u001a\u0010\u0014\u001a\u00020\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0013\u0010\u0003\u001a\u0004\b\u0005\u0010\b¨\u0006\u0015"}, m31665d2 = {"Lku/g1;", "", "<init>", "()V", "Lku/l0;", "b", "Lku/l0;", "a", "()Lku/l0;", "getDefault$annotations", "Default", "c", "d", "getUnconfined$annotations", "Unconfined", "Lku/n2;", "()Lku/n2;", "getMain$annotations", "Main", "getIO$annotations", "IO", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C7864g1 {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C7864g1 f29723a = new C7864g1();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final AbstractC7888l0 Default = C11454c.f40495i;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final AbstractC7888l0 Unconfined = C7871h3.f29735c;

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final AbstractC7888l0 m32643a() {
        return Default;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final AbstractC7888l0 m32644b() {
        return ExecutorC11453b.f40493d;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final AbstractC7900n2 m32645c() {
        return C10748t.dispatcher;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public static final AbstractC7888l0 m32646d() {
        return Unconfined;
    }
}
