package x5;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Lx5/n;", "", "<init>", "()V", "", "className", "Lx5/m;", "a", "(Ljava/lang/String;)Lx5/m;", "b", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class n {
    @Nullable
    public abstract m a(@NotNull String className);

    @Nullable
    public final m b(@NotNull String className) {
        Intrinsics.checkNotNullParameter(className, "className");
        m mVarA = a(className);
        return mVarA == null ? o.a(className) : mVarA;
    }
}
