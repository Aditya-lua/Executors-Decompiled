package ns;

import java.util.List;
import p001kotlin.Metadata;
import p001kotlin.collections.CollectionsKt;
import p001kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final class g implements Function0<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List<Comparable<Object>> f26625a;

    public g(List<Comparable<Object>> list) {
        this.f26625a = list;
    }

    @Override // p001kotlin.jvm.functions.Function0
    public final Object invoke() {
        return CollectionsKt.E0(this.f26625a);
    }
}
