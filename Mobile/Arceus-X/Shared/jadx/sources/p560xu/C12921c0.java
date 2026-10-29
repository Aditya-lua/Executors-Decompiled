package p560xu;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p588yu.C13459h;

/* JADX INFO: renamed from: xu.c0 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u001d\u0010\u000f\u001a\u00020\u0001*\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0011\u0010\u0011\u001a\u00020\u0005*\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m31665d2 = {"Ljava/io/OutputStream;", "Lxu/p0;", "b", "(Ljava/io/OutputStream;)Lxu/p0;", "Ljava/io/InputStream;", "Lxu/r0;", "f", "(Ljava/io/InputStream;)Lxu/r0;", "Ljava/net/Socket;", "Lxu/q0;", "d", "(Ljava/net/Socket;)Lxu/q0;", "Ljava/io/File;", "", "append", "a", "(Ljava/io/File;Z)Lxu/p0;", "e", "(Ljava/io/File;)Lxu/r0;", "okio"}, m31666k = 5, m31667mv = {2, 2, 0}, m31669xi = 48, m31670xs = "okio/Okio")
public final /* synthetic */ class C12921c0 {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final InterfaceC12947p0 m47979a(@NotNull File file, boolean z10) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        return C12919b0.m47964f(new FileOutputStream(file, z10));
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final InterfaceC12947p0 m47980b(@NotNull OutputStream outputStream) {
        Intrinsics.checkNotNullParameter(outputStream, "<this>");
        return new sink(outputStream, new C12953s0());
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ InterfaceC12947p0 m47981c(File file, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return C12919b0.m47963e(file, z10);
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public static final InterfaceC12949q0 m47982d(@NotNull Socket socket) {
        Intrinsics.checkNotNullParameter(socket, "<this>");
        return new C13459h(socket);
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public static final InterfaceC12951r0 m47983e(@NotNull File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        return new source(new FileInputStream(file), C12953s0.NONE);
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public static final InterfaceC12951r0 m47984f(@NotNull InputStream inputStream) {
        Intrinsics.checkNotNullParameter(inputStream, "<this>");
        return new source(inputStream, new C12953s0());
    }
}
