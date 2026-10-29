package p457u3;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p315nt.InterfaceC9557b;
import p440t3.C11480d;
import p440t3.InterfaceC11482e;

/* JADX INFO: renamed from: u3.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\t\u0010\nR \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\f"}, m31665d2 = {"Lu3/b;", "T", "Lt3/e;", "Lkotlin/Function1;", "Lt3/d;", "produceNewData", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "ex", "a", "(Lt3/d;Lnt/b;)Ljava/lang/Object;", "Lkotlin/jvm/functions/Function1;", "datastore-core_release"}, m31666k = 1, m31667mv = {1, 8, 0}, m31669xi = 48)
public final class C11789b<T> implements InterfaceC11482e<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Function1<C11480d, T> produceNewData;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super t3.d, ? extends T> */
    /* JADX WARN: Multi-variable type inference failed */
    public C11789b(@NotNull Function1<? super C11480d, ? extends T> produceNewData) {
        Intrinsics.checkNotNullParameter(produceNewData, "produceNewData");
        this.produceNewData = produceNewData;
    }

    @Override // p440t3.InterfaceC11482e
    @Nullable
    /* JADX INFO: renamed from: a */
    public Object mo42973a(@NotNull C11480d c11480d, @NotNull InterfaceC9557b<? super T> interfaceC9557b) {
        return this.produceNewData.invoke(c11480d);
    }
}
