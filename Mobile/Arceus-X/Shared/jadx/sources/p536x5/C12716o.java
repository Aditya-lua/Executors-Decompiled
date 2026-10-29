package p536x5;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: x5.o */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\"\u0014\u0010\u0006\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0005¨\u0006\u0007"}, m31665d2 = {"", "className", "Lx5/m;", "a", "(Ljava/lang/String;)Lx5/m;", "Ljava/lang/String;", "TAG", "work-runtime_release"}, m31666k = 2, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C12716o {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final String f45276a;

    static {
        String strM47443i = AbstractC12732w.m47443i("InputMerger");
        Intrinsics.checkNotNullExpressionValue(strM47443i, "tagWithPrefix(...)");
        f45276a = strM47443i;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public static final AbstractC12712m m47389a(@NotNull String className) {
        Intrinsics.checkNotNullParameter(className, "className");
        try {
            Object objNewInstance = Class.forName(className).getDeclaredConstructor(null).newInstance(null);
            Intrinsics.m31981d(objNewInstance, "null cannot be cast to non-null type androidx.work.InputMerger");
            return (AbstractC12712m) objNewInstance;
        } catch (Exception e10) {
            AbstractC12732w.m47441e().mo47447d(f45276a, "Trouble instantiating " + className, e10);
            return null;
        }
    }
}
