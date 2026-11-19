package ew;

import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"ew/w", "ew/x", "ew/y"}, d2 = {}, k = 4, mv = {2, 2, 0}, xi = 48)
public final class v {
    @NotNull
    public static final j0 a() {
        return x.a();
    }

    @NotNull
    public static final f b(@NotNull j0 j0Var) {
        return x.b(j0Var);
    }

    @NotNull
    public static final g c(@NotNull l0 l0Var) {
        return x.c(l0Var);
    }

    @NotNull
    public static final k d(@NotNull k kVar, @NotNull b0 b0Var) {
        return y.a(kVar, b0Var);
    }

    @NotNull
    public static final j0 e(@NotNull File file, boolean z10) {
        return w.a(file, z10);
    }

    @NotNull
    public static final j0 f(@NotNull OutputStream outputStream) {
        return w.b(outputStream);
    }

    @NotNull
    public static final k0 h(@NotNull Socket socket) {
        return w.d(socket);
    }

    @NotNull
    public static final l0 i(@NotNull File file) {
        return w.e(file);
    }

    @NotNull
    public static final l0 j(@NotNull InputStream inputStream) {
        return w.f(inputStream);
    }
}
