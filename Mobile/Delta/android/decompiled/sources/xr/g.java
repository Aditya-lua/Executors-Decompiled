package xr;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final class g implements Function0<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List<Comparable<Object>> f35300a;

    public g(List<Comparable<Object>> list) {
        this.f35300a = list;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return CollectionsKt.E0(this.f35300a);
    }
}
