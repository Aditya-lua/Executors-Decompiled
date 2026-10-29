package tl;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p470ul.GetQueryInfoError;

/* JADX INFO: renamed from: tl.j */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000bÀ\u0006\u0003"}, m31665d2 = {"Ltl/j;", "", "", "queryInfo", "", "onSuccess", "(Ljava/lang/String;)V", "Lul/a;", "error", "a", "(Lul/a;)V", "universalapp_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public interface InterfaceC11689j {
    /* JADX INFO: renamed from: a */
    default void mo43354a(@NotNull GetQueryInfoError error) {
        Intrinsics.checkNotNullParameter(error, "error");
    }

    default void onSuccess(@Nullable String queryInfo) {
    }
}
