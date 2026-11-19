package iv;

import av.l0;
import com.github.luben.zstd.BuildConfig;
import gv.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\u0003J\u000f\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Liv/c;", "Liv/f;", "<init>", "()V", BuildConfig.FLAVOR, "parallelism", BuildConfig.FLAVOR, "name", "Lav/l0;", "Q", "(ILjava/lang/String;)Lav/l0;", BuildConfig.FLAVOR, "close", "toString", "()Ljava/lang/String;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c extends f {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final c f19820i = new c();

    public c() {
        super(j.f19830c, j.f19831d, j.f19832e, j.f19829a);
    }

    @Override // av.l0
    @NotNull
    public l0 Q(int parallelism, @Nullable String name) {
        m.a(parallelism);
        return parallelism >= j.f19830c ? m.b(this, name) : super.Q(parallelism, name);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // av.l0
    @NotNull
    /* JADX INFO: renamed from: toString */
    public String getName() {
        return "Dispatchers.Default";
    }
}
