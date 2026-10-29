package p395qu;

import java.util.Collection;
import java.util.ServiceLoader;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p201iu.C6985m;
import p201iu.C6988p;
import p256ku.InterfaceC7893m0;

/* JADX INFO: renamed from: qu.f */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\u001a\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\" \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t¨\u0006\u000b"}, m31665d2 = {"", "exception", "", "b", "(Ljava/lang/Throwable;)V", "", "Lku/m0;", "a", "Ljava/util/Collection;", "()Ljava/util/Collection;", "platformExceptionHandlers", "kotlinx-coroutines-core"}, m31666k = 2, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C10720f {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Collection<InterfaceC7893m0> f38276a = C6988p.m29398z(C6985m.m29376e(ServiceLoader.load(InterfaceC7893m0.class, InterfaceC7893m0.class.getClassLoader()).iterator()));

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final Collection<InterfaceC7893m0> m40838a() {
        return f38276a;
    }

    /* JADX INFO: renamed from: b */
    public static final void m40839b(@NotNull Throwable th2) {
        Thread threadCurrentThread = Thread.currentThread();
        threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th2);
    }
}
