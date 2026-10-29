package xr;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final class f implements Function0<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List<Comparable<Object>> f35299a;

    public f(List<Comparable<Object>> list) {
        this.f35299a = list;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return CollectionsKt.D0(this.f35299a);
    }
}
