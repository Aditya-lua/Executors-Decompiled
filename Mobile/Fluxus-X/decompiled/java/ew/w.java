package ew;

import com.github.luben.zstd.BuildConfig;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u001d\u0010\u000f\u001a\u00020\u0001*\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0011\u0010\u0011\u001a\u00020\u0005*\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Ljava/io/OutputStream;", "Lew/j0;", "b", "(Ljava/io/OutputStream;)Lew/j0;", "Ljava/io/InputStream;", "Lew/l0;", "f", "(Ljava/io/InputStream;)Lew/l0;", "Ljava/net/Socket;", "Lew/k0;", "d", "(Ljava/net/Socket;)Lew/k0;", "Ljava/io/File;", BuildConfig.FLAVOR, "append", "a", "(Ljava/io/File;Z)Lew/j0;", "e", "(Ljava/io/File;)Lew/l0;", "okio"}, k = 5, mv = {2, 2, 0}, xi = 48, xs = "okio/Okio")
public final /* synthetic */ class w {
    @NotNull
    public static final j0 a(@NotNull File file, boolean z10) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        return v.f(new FileOutputStream(file, z10));
    }

    @NotNull
    public static final j0 b(@NotNull OutputStream outputStream) {
        Intrinsics.checkNotNullParameter(outputStream, "<this>");
        return new sink(outputStream, new m0());
    }

    public static /* synthetic */ j0 c(File file, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return v.e(file, z10);
    }

    @NotNull
    public static final k0 d(@NotNull Socket socket) {
        Intrinsics.checkNotNullParameter(socket, "<this>");
        return new fw.h(socket);
    }

    @NotNull
    public static final l0 e(@NotNull File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        return new source(new FileInputStream(file), m0.f14833e);
    }

    @NotNull
    public static final l0 f(@NotNull InputStream inputStream) {
        Intrinsics.checkNotNullParameter(inputStream, "<this>");
        return new source(inputStream, new m0());
    }
}
