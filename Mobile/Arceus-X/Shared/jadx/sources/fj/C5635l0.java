package fj;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p486v7.C12052k;

/* JADX INFO: renamed from: fj.l0 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m31665d2 = {"Lfj/l0;", "", "<init>", "()V", "", "Lv7/k;", "purchases", "", "b", "(Ljava/util/List;)Ljava/lang/String;", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C5635l0 {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C5635l0 f21598a = new C5635l0();

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final String m25486b(@NotNull List<? extends C12052k> purchases) {
        Intrinsics.checkNotNullParameter(purchases, "purchases");
        return CollectionsKt.m31715m0(purchases, "; ", null, null, 0, null, new Function1() { // from class: fj.k0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C5635l0.m25487c((C12052k) obj);
            }
        }, 30, null);
    }

    /* JADX INFO: renamed from: c */
    public static final CharSequence m25487c(C12052k it) {
        Intrinsics.checkNotNullParameter(it, "it");
        String strM25427j = C5614b.m25427j(it);
        return strM25427j != null ? strM25427j : "";
    }
}
