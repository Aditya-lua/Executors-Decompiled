package ep;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import sb.g;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final /* synthetic */ class b implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function1 f15731a;

    public b(Function1 function) {
        Intrinsics.checkNotNullParameter(function, "function");
        this.f15731a = function;
    }

    @Override // sb.g
    public final /* synthetic */ void onSuccess(Object obj) {
        this.f15731a.invoke(obj);
    }
}
