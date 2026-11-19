package u3;

import com.github.luben.zstd.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J4\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u001c\u0010\u0005\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003H¦@¢\u0006\u0004\b\u0006\u0010\u0007J:\u0010\n\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\"\u0010\u0005\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\bH¦@¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fH¦@¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\fH¦@¢\u0006\u0004\b\u000f\u0010\u000eR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0015À\u0006\u0001"}, d2 = {"Lu3/t;", BuildConfig.FLAVOR, "T", "Lkotlin/Function1;", "Leu/b;", "block", "e", "(Lkotlin/jvm/functions/Function1;Leu/b;)Ljava/lang/Object;", "Lkotlin/Function2;", BuildConfig.FLAVOR, "c", "(Lkotlin/jvm/functions/Function2;Leu/b;)Ljava/lang/Object;", BuildConfig.FLAVOR, "a", "(Leu/b;)Ljava/lang/Object;", "d", "Ldv/h;", BuildConfig.FLAVOR, "b", "()Ldv/h;", "updateNotifications", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface t {
    @Nullable
    Object a(@NotNull eu.b<? super Integer> bVar);

    @NotNull
    dv.h<Unit> b();

    @Nullable
    <T> Object c(@NotNull Function2<? super Boolean, ? super eu.b<? super T>, ? extends Object> function2, @NotNull eu.b<? super T> bVar);

    @Nullable
    Object d(@NotNull eu.b<? super Integer> bVar);

    @Nullable
    <T> Object e(@NotNull Function1<? super eu.b<? super T>, ? extends Object> function1, @NotNull eu.b<? super T> bVar);
}
