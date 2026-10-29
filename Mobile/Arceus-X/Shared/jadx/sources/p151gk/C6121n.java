package p151gk;

import kg.C7590f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: gk.n */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2\u0006\u0010\t\u001a\u00020\u00052\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0007¢\u0006\u0004\b\f\u0010\rR \u0010\u0013\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u0012\u0004\b\u0012\u0010\u0003\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0014"}, m31665d2 = {"Lgk/n;", "", "<init>", "()V", "obj", "", "c", "(Ljava/lang/Object;)Ljava/lang/String;", "R", "json", "Ljava/lang/Class;", "clazz", "a", "(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;", "Lkg/f;", "b", "Lkg/f;", "()Lkg/f;", "getGson$annotations", "gson", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C6121n {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C6121n f23457a = new C6121n();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final C7590f gson = new C7590f();

    /* JADX INFO: renamed from: a */
    public static final <R> R m27044a(@NotNull String json, @NotNull Class<R> clazz) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        return (R) gson.m31410j(json, clazz);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final C7590f m27045b() {
        return gson;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final String m27046c(@Nullable Object obj) {
        String strM31419t = gson.m31419t(obj);
        Intrinsics.checkNotNullExpressionValue(strM31419t, "toJson(...)");
        return strM31419t;
    }
}
