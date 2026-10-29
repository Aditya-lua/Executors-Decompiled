package p111ep;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import sb.InterfaceC11256g;

/* JADX INFO: renamed from: ep.b */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
public final /* synthetic */ class C5175b implements InterfaceC11256g {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Function1 f20193a;

    public C5175b(Function1 function) {
        Intrinsics.checkNotNullParameter(function, "function");
        this.f20193a = function;
    }

    @Override // sb.InterfaceC11256g
    public final /* synthetic */ void onSuccess(Object obj) {
        this.f20193a.invoke(obj);
    }
}
