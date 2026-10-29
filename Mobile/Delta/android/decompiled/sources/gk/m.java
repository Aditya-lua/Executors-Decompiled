package gk;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2\u0006\u0010\t\u001a\u00020\u00052\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0007¢\u0006\u0004\b\f\u0010\rR \u0010\u0013\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u0012\u0004\b\u0012\u0010\u0003\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0014"}, d2 = {"Lgk/m;", "", "<init>", "()V", "obj", "", "c", "(Ljava/lang/Object;)Ljava/lang/String;", "R", "json", "Ljava/lang/Class;", "clazz", "a", "(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;", "Ljg/f;", "b", "Ljg/f;", "()Ljg/f;", "getGson$annotations", "gson", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final m f18240a = new m();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final jg.f gson = new jg.f();

    public static final <R> R a(@NotNull String json, @NotNull Class<R> clazz) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        return (R) gson.j(json, clazz);
    }

    @NotNull
    public static final jg.f b() {
        return gson;
    }

    @NotNull
    public static final String c(@Nullable Object obj) {
        String strT = gson.t(obj);
        Intrinsics.checkNotNullExpressionValue(strT, "toJson(...)");
        return strT;
    }
}
