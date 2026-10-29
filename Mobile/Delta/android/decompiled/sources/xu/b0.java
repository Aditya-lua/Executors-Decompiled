package xu;

import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"xu/c0", "xu/d0", "xu/e0"}, d2 = {}, k = 4, mv = {2, 2, 0}, xi = 48)
public final class b0 {
    @NotNull
    public static final p0 a() {
        return d0.a();
    }

    @NotNull
    public static final f b(@NotNull p0 p0Var) {
        return d0.b(p0Var);
    }

    @NotNull
    public static final g c(@NotNull r0 r0Var) {
        return d0.c(r0Var);
    }

    @NotNull
    public static final l d(@NotNull l lVar, @NotNull h0 h0Var) {
        return e0.a(lVar, h0Var);
    }

    @NotNull
    public static final p0 e(@NotNull File file, boolean z10) {
        return c0.a(file, z10);
    }

    @NotNull
    public static final p0 f(@NotNull OutputStream outputStream) {
        return c0.b(outputStream);
    }

    @NotNull
    public static final q0 h(@NotNull Socket socket) {
        return c0.d(socket);
    }

    @NotNull
    public static final r0 i(@NotNull File file) {
        return c0.e(file);
    }

    @NotNull
    public static final r0 j(@NotNull InputStream inputStream) {
        return c0.f(inputStream);
    }
}
