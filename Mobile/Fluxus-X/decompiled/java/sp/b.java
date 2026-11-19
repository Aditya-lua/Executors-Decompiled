package sp;

import p001kotlin.Metadata;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.internal.Intrinsics;
import tb.g;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final /* synthetic */ class b implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function1 f31825a;

    public b(Function1 function) {
        Intrinsics.checkNotNullParameter(function, "function");
        this.f31825a = function;
    }

    @Override // tb.g
    public final /* synthetic */ void onSuccess(Object obj) {
        this.f31825a.invoke(obj);
    }
}
