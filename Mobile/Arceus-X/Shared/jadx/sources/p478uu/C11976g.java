package p478uu;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p395qu.C10719e0;

/* JADX INFO: renamed from: uu.g */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0017\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\"\u0014\u0010\u0007\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0006\"\u0014\u0010\t\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\n"}, m31665d2 = {"", "locked", "Luu/a;", "a", "(Z)Luu/a;", "Lqu/e0;", "Lqu/e0;", "NO_OWNER", "b", "ON_LOCK_ALREADY_LOCKED_BY_OWNER", "kotlinx-coroutines-core"}, m31666k = 2, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C11976g {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C10719e0 f42431a = new C10719e0("NO_OWNER");

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final C10719e0 f42432b = new C10719e0("ALREADY_LOCKED_BY_OWNER");

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final InterfaceC11970a m44696a(boolean z10) {
        return new C11975f(z10);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ InterfaceC11970a m44697b(boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return m44696a(z10);
    }
}
