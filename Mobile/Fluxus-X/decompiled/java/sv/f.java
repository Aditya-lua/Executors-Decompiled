package sv;

import com.github.luben.zstd.BuildConfig;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\bJ\u0015\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\bJ\u0015\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\b¨\u0006\u000f"}, d2 = {"Lsv/f;", BuildConfig.FLAVOR, "<init>", "()V", BuildConfig.FLAVOR, "method", BuildConfig.FLAVOR, "a", "(Ljava/lang/String;)Z", "f", "c", "e", "d", "requestMethod", "b", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final f f31916a = new f();

    public static final boolean a(@NotNull String method) {
        Intrinsics.checkNotNullParameter(method, "method");
        return Intrinsics.c(method, "POST") || Intrinsics.c(method, "PATCH") || Intrinsics.c(method, "PUT") || Intrinsics.c(method, "DELETE") || Intrinsics.c(method, "MOVE");
    }

    public static final boolean c(@NotNull String method) {
        Intrinsics.checkNotNullParameter(method, "method");
        return (Intrinsics.c(method, "GET") || Intrinsics.c(method, "HEAD")) ? false : true;
    }

    public static final boolean f(@NotNull String method) {
        Intrinsics.checkNotNullParameter(method, "method");
        return Intrinsics.c(method, "POST") || Intrinsics.c(method, "PUT") || Intrinsics.c(method, "PATCH") || Intrinsics.c(method, "PROPPATCH") || Intrinsics.c(method, "QUERY") || Intrinsics.c(method, "REPORT");
    }

    public final boolean b(@NotNull String requestMethod) {
        Intrinsics.checkNotNullParameter(requestMethod, "requestMethod");
        return Intrinsics.c(requestMethod, "GET") || Intrinsics.c(requestMethod, "QUERY");
    }

    public final boolean d(@NotNull String method) {
        Intrinsics.checkNotNullParameter(method, "method");
        return !Intrinsics.c(method, "PROPFIND");
    }

    public final boolean e(@NotNull String method) {
        Intrinsics.checkNotNullParameter(method, "method");
        return Intrinsics.c(method, "PROPFIND");
    }
}
