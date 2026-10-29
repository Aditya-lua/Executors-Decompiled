package okhttp3.internal;

import hu.InterfaceC6567c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\t\u001a\u00020\u0001\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\b\u0010\b\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\t\u0010\nJ*\u0010\u000b\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m31665d2 = {"Lokhttp3/internal/EmptyTags;", "Lokhttp3/internal/Tags;", "<init>", "()V", "", "T", "Lhu/c;", "key", "value", "plus", "(Lhu/c;Ljava/lang/Object;)Lokhttp3/internal/Tags;", "get", "(Lhu/c;)Ljava/lang/Object;", "", "toString", "()Ljava/lang/String;", "okhttp"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class EmptyTags extends Tags {

    @NotNull
    public static final EmptyTags INSTANCE = new EmptyTags();

    private EmptyTags() {
        super(null);
    }

    @Override // okhttp3.internal.Tags
    @Nullable
    public <T> T get(@NotNull InterfaceC6567c<T> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return null;
    }

    @Override // okhttp3.internal.Tags
    @NotNull
    public <T> Tags plus(@NotNull InterfaceC6567c<T> key, @Nullable T value) {
        Intrinsics.checkNotNullParameter(key, "key");
        return value != null ? new LinkedTags(key, value, this) : this;
    }

    @NotNull
    public String toString() {
        return "{}";
    }
}
