package ew;

import com.appsflyer.sdk_base.referrer.Payload;
import com.github.luben.zstd.BuildConfig;
import java.io.Closeable;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\r\b&\u0018\u0000 !2\u00060\u0001j\u0002`\u0002:\u0001!B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\n\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\n\u0010\tJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u000f2\u0006\u0010\u000e\u001a\u00020\u0005H&¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0005H&¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u0005H&¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0019\u001a\u00020\u000bH&¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0012\u001a\u00020\u0005¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010 \u001a\u00020\u001a2\u0006\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u001f\u001a\u00020\u000bH&¢\u0006\u0004\b \u0010\u001cJ\u0015\u0010!\u001a\u00020\u001a2\u0006\u0010\u0012\u001a\u00020\u0005¢\u0006\u0004\b!\u0010\u001eJ!\u0010#\u001a\u00020\"2\u0006\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u0019\u001a\u00020\u000bH&¢\u0006\u0004\b#\u0010$J\u001f\u0010%\u001a\u00020\"2\u0006\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u0019\u001a\u00020\u000b¢\u0006\u0004\b%\u0010$J\u0015\u0010&\u001a\u00020\"2\u0006\u0010\u000e\u001a\u00020\u0005¢\u0006\u0004\b&\u0010'J\u001f\u0010*\u001a\u00020\"2\u0006\u0010(\u001a\u00020\u00052\u0006\u0010)\u001a\u00020\u0005H&¢\u0006\u0004\b*\u0010+J!\u0010,\u001a\u00020\"2\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u001f\u001a\u00020\u000bH&¢\u0006\u0004\b,\u0010$J\u0015\u0010-\u001a\u00020\"2\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b-\u0010'J\u000f\u0010.\u001a\u00020\"H\u0016¢\u0006\u0004\b.\u0010\u0004¨\u0006/"}, d2 = {"Lew/k;", "Ljava/io/Closeable;", "Lokio/Closeable;", "<init>", "()V", "Lew/b0;", "path", "Lew/j;", "o", "(Lew/b0;)Lew/j;", "p", BuildConfig.FLAVOR, "m", "(Lew/b0;)Z", "dir", BuildConfig.FLAVOR, "n", "(Lew/b0;)Ljava/util/List;", "file", "Lew/i;", "r", "(Lew/b0;)Lew/i;", "Lew/l0;", "w", "(Lew/b0;)Lew/l0;", "mustCreate", "Lew/j0;", "u", "(Lew/b0;Z)Lew/j0;", "s", "(Lew/b0;)Lew/j0;", "mustExist", "b", "a", BuildConfig.FLAVOR, "f", "(Lew/b0;Z)V", "e", "d", "(Lew/b0;)V", Payload.SOURCE, "target", "c", "(Lew/b0;Lew/b0;)V", "k", "h", "close", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class k implements Closeable {

    @NotNull
    public static final k b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final b0 f14828c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final k f14829d;

    static {
        k tVar;
        try {
            Class.forName("java.nio.file.Files");
            tVar = new u();
        } catch (ClassNotFoundException unused) {
            tVar = new t();
        }
        b = tVar;
        b0.Companion companion = b0.INSTANCE;
        String property = System.getProperty("java.io.tmpdir");
        Intrinsics.checkNotNullExpressionValue(property, "getProperty(...)");
        f14828c = b0.Companion.e(companion, property, false, 1, null);
        ClassLoader classLoader = fw.m.class.getClassLoader();
        Intrinsics.checkNotNullExpressionValue(classLoader, "getClassLoader(...)");
        f14829d = new fw.m(classLoader, false, null, 4, null);
    }

    public static /* synthetic */ void g(k kVar, b0 b0Var, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createDirectory");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        kVar.f(b0Var, z10);
    }

    @NotNull
    public final j0 a(@NotNull b0 file) {
        Intrinsics.checkNotNullParameter(file, "file");
        return b(file, false);
    }

    @NotNull
    public abstract j0 b(@NotNull b0 file, boolean mustExist);

    public abstract void c(@NotNull b0 source, @NotNull b0 target);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public final void d(@NotNull b0 dir) {
        Intrinsics.checkNotNullParameter(dir, "dir");
        e(dir, false);
    }

    public final void e(@NotNull b0 dir, boolean mustCreate) {
        Intrinsics.checkNotNullParameter(dir, "dir");
        fw.d.a(this, dir, mustCreate);
    }

    public abstract void f(@NotNull b0 dir, boolean mustCreate);

    public final void h(@NotNull b0 path) {
        Intrinsics.checkNotNullParameter(path, "path");
        k(path, false);
    }

    public abstract void k(@NotNull b0 path, boolean mustExist);

    public final boolean m(@NotNull b0 path) {
        Intrinsics.checkNotNullParameter(path, "path");
        return fw.d.b(this, path);
    }

    @NotNull
    public abstract List<b0> n(@NotNull b0 dir);

    @NotNull
    public final j o(@NotNull b0 path) {
        Intrinsics.checkNotNullParameter(path, "path");
        return fw.d.c(this, path);
    }

    @Nullable
    public abstract j p(@NotNull b0 path);

    @NotNull
    public abstract i r(@NotNull b0 file);

    @NotNull
    public final j0 s(@NotNull b0 file) {
        Intrinsics.checkNotNullParameter(file, "file");
        return u(file, false);
    }

    @NotNull
    public abstract j0 u(@NotNull b0 file, boolean mustCreate);

    @NotNull
    public abstract l0 w(@NotNull b0 file);
}
