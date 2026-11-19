package nv;

import com.github.luben.zstd.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\t\u001a\u00020\u0001\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\b\u0010\b\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\t\u0010\nJ*\u0010\u000b\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lnv/a;", "Lnv/g;", "<init>", "()V", BuildConfig.FLAVOR, "T", "Lxu/c;", "key", "value", "b", "(Lxu/c;Ljava/lang/Object;)Lnv/g;", "a", "(Lxu/c;)Ljava/lang/Object;", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f26630a = new a();

    public a() {
        super(null);
    }

    @Override // nv.g
    @Nullable
    public <T> T a(@NotNull xu.c<T> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return null;
    }

    @Override // nv.g
    @NotNull
    public <T> g b(@NotNull xu.c<T> key, @Nullable T value) {
        Intrinsics.checkNotNullParameter(key, "key");
        return value != null ? new f(key, value, this) : this;
    }

    @NotNull
    public String toString() {
        return "{}";
    }
}
