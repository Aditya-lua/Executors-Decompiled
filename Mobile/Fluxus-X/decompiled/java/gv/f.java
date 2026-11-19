package gv;

import com.github.luben.zstd.BuildConfig;
import java.util.Collection;
import java.util.ServiceLoader;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\" \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t¨\u0006\u000b"}, d2 = {BuildConfig.FLAVOR, "exception", BuildConfig.FLAVOR, "b", "(Ljava/lang/Throwable;)V", BuildConfig.FLAVOR, "Lav/m0;", "a", "Ljava/util/Collection;", "()Ljava/util/Collection;", "platformExceptionHandlers", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Collection<av.m0> f17951a = yu.p.z(yu.m.e(ServiceLoader.load(av.m0.class, av.m0.class.getClassLoader()).iterator()));

    @NotNull
    public static final Collection<av.m0> a() {
        return f17951a;
    }

    public static final void b(@NotNull Throwable th2) {
        Thread threadCurrentThread = Thread.currentThread();
        threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th2);
    }
}
