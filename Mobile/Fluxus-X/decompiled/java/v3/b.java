package v3;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.internal.Intrinsics;
import u3.d;
import u3.e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\t\u0010\nR \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\f"}, d2 = {"Lv3/b;", "T", "Lu3/e;", "Lkotlin/Function1;", "Lu3/d;", "produceNewData", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "ex", "a", "(Lu3/d;Leu/b;)Ljava/lang/Object;", "Lkotlin/jvm/functions/Function1;", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class b<T> implements e<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Function1<d, T> produceNewData;

    /* JADX WARN: Multi-variable type inference failed */
    public b(@NotNull Function1<? super d, ? extends T> produceNewData) {
        Intrinsics.checkNotNullParameter(produceNewData, "produceNewData");
        this.produceNewData = produceNewData;
    }

    @Override // u3.e
    @Nullable
    public Object a(@NotNull d dVar, @NotNull eu.b<? super T> bVar) {
        return this.produceNewData.invoke(dVar);
    }
}
