package xu;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u001d\u0010\u000f\u001a\u00020\u0001*\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0011\u0010\u0011\u001a\u00020\u0005*\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Ljava/io/OutputStream;", "Lxu/p0;", "b", "(Ljava/io/OutputStream;)Lxu/p0;", "Ljava/io/InputStream;", "Lxu/r0;", "f", "(Ljava/io/InputStream;)Lxu/r0;", "Ljava/net/Socket;", "Lxu/q0;", "d", "(Ljava/net/Socket;)Lxu/q0;", "Ljava/io/File;", "", "append", "a", "(Ljava/io/File;Z)Lxu/p0;", "e", "(Ljava/io/File;)Lxu/r0;", "okio"}, k = 5, mv = {2, 2, 0}, xi = 48, xs = "okio/Okio")
public final /* synthetic */ class c0 {
    @NotNull
    public static final p0 a(@NotNull File file, boolean z10) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        return b0.f(new FileOutputStream(file, z10));
    }

    @NotNull
    public static final p0 b(@NotNull OutputStream outputStream) {
        Intrinsics.checkNotNullParameter(outputStream, "<this>");
        return new sink(outputStream, new s0());
    }

    public static /* synthetic */ p0 c(File file, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return b0.e(file, z10);
    }

    @NotNull
    public static final q0 d(@NotNull Socket socket) {
        Intrinsics.checkNotNullParameter(socket, "<this>");
        return new yu.h(socket);
    }

    @NotNull
    public static final r0 e(@NotNull File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        return new source(new FileInputStream(file), s0.NONE);
    }

    @NotNull
    public static final r0 f(@NotNull InputStream inputStream) {
        Intrinsics.checkNotNullParameter(inputStream, "<this>");
        return new source(inputStream, new s0());
    }
}
