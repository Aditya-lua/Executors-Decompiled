package p451ts;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: ts.c */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u001f\u0010\u0002\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001f\u0010\u0004\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0004\u0010\u0003\u001a'\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0006*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m31665d2 = {"T", "", "b", "(Ljava/util/List;)Ljava/lang/Object;", "c", "", "", "", "a", "(Ljava/util/List;)Ljava/util/Map;", "utils_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C11746c {
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final Map<String, Object> m43978a(@NotNull List<? extends Object> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Object objM43979b = m43979b(list);
        if (!C11744a.m43974f(objM43979b)) {
            objM43979b = null;
        }
        if (objM43979b instanceof Map) {
            return (Map) objM43979b;
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static final <T> T m43979b(@NotNull List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return (T) CollectionsKt.m31708f0(list, 1);
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public static final <T> T m43980c(@NotNull List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return (T) CollectionsKt.m31708f0(list, 2);
    }
}
