package cn;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: cn.d */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u001a)\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m31665d2 = {"", "T", "", "Lcn/c;", "a", "(Ljava/util/List;)Lcn/c;", "wf1-container-common"}, m31666k = 2, m31667mv = {1, 6, 0}, m31669xi = 48)
public final class C1683d {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final <T> C1682c<T> m8399a(@NotNull List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        return new C1682c<>(CollectionsKt.m31706d0(list), list.subList(1, list.size()));
    }
}
