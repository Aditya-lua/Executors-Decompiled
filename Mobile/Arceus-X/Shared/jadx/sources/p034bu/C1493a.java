package p034bu;

import java.util.Optional;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: bu.a */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a%\u0010\u0003\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a.\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0001*\f\u0012\b\b\u0001\u0012\u0004\b\u00028\u00000\u00022\u0006\u0010\u0005\u001a\u00028\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u0004\n\u0002\b9¨\u0006\b"}, m31665d2 = {"", "T", "Ljava/util/Optional;", "b", "(Ljava/util/Optional;)Ljava/lang/Object;", "defaultValue", "a", "(Ljava/util/Optional;Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-stdlib-jdk8"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C1493a {
    /* JADX INFO: renamed from: a */
    public static final <T> T m7620a(@NotNull Optional<? extends T> optional, T t8) {
        Intrinsics.checkNotNullParameter(optional, "<this>");
        return optional.isPresent() ? optional.get() : t8;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static final <T> T m7621b(@NotNull Optional<T> optional) {
        Intrinsics.checkNotNullParameter(optional, "<this>");
        return optional.orElse(null);
    }
}
