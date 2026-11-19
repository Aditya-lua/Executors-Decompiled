package u3;

import com.github.luben.zstd.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002JF\u0010\n\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00032.\u0010\t\u001a*\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004H¦@¢\u0006\u0004\b\n\u0010\u000bJ:\u0010\u000f\u001a\u00020\u000e2(\u0010\t\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\fH¦@¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0015À\u0006\u0001"}, d2 = {"Lu3/f0;", "T", "Lu3/c;", "R", "Lkotlin/Function3;", "Lu3/y;", BuildConfig.FLAVOR, "Leu/b;", BuildConfig.FLAVOR, "block", "d", "(Lpu/n;Leu/b;)Ljava/lang/Object;", "Lkotlin/Function2;", "Lu3/k0;", BuildConfig.FLAVOR, "b", "(Lkotlin/jvm/functions/Function2;Leu/b;)Ljava/lang/Object;", "Lu3/t;", "c", "()Lu3/t;", "coordinator", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface f0<T> extends c {
    @Nullable
    Object b(@NotNull Function2<? super k0<T>, ? super eu.b<? super Unit>, ? extends Object> function2, @NotNull eu.b<? super Unit> bVar);

    @NotNull
    t c();

    @Nullable
    <R> Object d(@NotNull pu.n<? super y<T>, ? super Boolean, ? super eu.b<? super R>, ? extends Object> nVar, @NotNull eu.b<? super R> bVar);
}
