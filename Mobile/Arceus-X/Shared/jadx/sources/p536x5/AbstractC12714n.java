package p536x5;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: x5.n */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\b¨\u0006\n"}, m31665d2 = {"Lx5/n;", "", "<init>", "()V", "", "className", "Lx5/m;", "a", "(Ljava/lang/String;)Lx5/m;", "b", "work-runtime_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public abstract class AbstractC12714n {
    @Nullable
    /* JADX INFO: renamed from: a */
    public abstract AbstractC12712m mo47387a(@NotNull String className);

    @Nullable
    /* JADX INFO: renamed from: b */
    public final AbstractC12712m m47388b(@NotNull String className) {
        Intrinsics.checkNotNullParameter(className, "className");
        AbstractC12712m abstractC12712mMo47387a = mo47387a(className);
        return abstractC12712mMo47387a == null ? C12716o.m47389a(className) : abstractC12712mMo47387a;
    }
}
