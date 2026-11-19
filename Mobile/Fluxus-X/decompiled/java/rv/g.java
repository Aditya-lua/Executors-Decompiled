package rv;

import com.github.luben.zstd.BuildConfig;
import java.io.IOException;
import mv.j0;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b \u0018\u0000 \u001a2\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ+\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\n\u0010\r\u001a\u00060\u000bj\u0002`\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0018\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0019\u0010\u0015¨\u0006\u001b"}, d2 = {"Lrv/g;", BuildConfig.FLAVOR, "<init>", "()V", "Lmv/j0;", "route", "Lmv/e;", "call", BuildConfig.FLAVOR, "d", "(Lmv/j0;Lmv/e;)V", "Ljava/io/IOException;", "Lokio/IOException;", "failure", "c", "(Lmv/j0;Lmv/e;Ljava/io/IOException;)V", "Lmv/k;", "connection", "b", "(Lmv/k;Lmv/j0;Lmv/e;)V", "f", "(Lmv/k;)V", "e", "(Lmv/k;Lmv/e;)V", "g", "h", "a", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final g b = new a();

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"rv/g$a", "Lrv/g;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a extends g {
    }

    /* JADX INFO: renamed from: rv.g$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lrv/g$b;", BuildConfig.FLAVOR, "<init>", "()V", "Lrv/g;", "NONE", "Lrv/g;", "a", "()Lrv/g;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final g a() {
            return g.b;
        }

        public Companion() {
        }
    }

    public void b(@NotNull mv.k connection, @NotNull j0 route, @NotNull mv.e call) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(call, "call");
    }

    public void c(@NotNull j0 route, @NotNull mv.e call, @NotNull IOException failure) {
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(failure, "failure");
    }

    public void d(@NotNull j0 route, @NotNull mv.e call) {
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(call, "call");
    }

    public void e(@NotNull mv.k connection, @NotNull mv.e call) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        Intrinsics.checkNotNullParameter(call, "call");
    }

    public void f(@NotNull mv.k connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
    }

    public void g(@NotNull mv.k connection, @NotNull mv.e call) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        Intrinsics.checkNotNullParameter(call, "call");
    }

    public void h(@NotNull mv.k connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
    }
}
