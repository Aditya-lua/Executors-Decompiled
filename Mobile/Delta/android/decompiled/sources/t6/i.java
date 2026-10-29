package t6;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001JB\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\"\u0010\b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005H¦@¢\u0006\u0004\b\t\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Lt6/i;", "", "T", "Lt6/o;", "request", "Lkotlin/Function2;", "Lt6/q;", "Lnt/b;", "block", "a", "(Lt6/o;Lkotlin/jvm/functions/Function2;Lnt/b;)Ljava/lang/Object;", "coil-network-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface i {
    @Nullable
    <T> Object a(@NotNull NetworkRequest networkRequest, @NotNull Function2<? super NetworkResponse, ? super nt.b<? super T>, ? extends Object> function2, @NotNull nt.b<? super T> bVar);
}
