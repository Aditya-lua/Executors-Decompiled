package yu;

import com.github.luben.zstd.BuildConfig;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002B\t\b\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00028\u0000H¦@¢\u0006\u0004\b\u0007\u0010\bJ\u001e\u0010\u000b\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH¦@¢\u0006\u0004\b\u000b\u0010\fJ\u001e\u0010\u000f\u001a\u00020\u00062\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0086@¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lyu/h;", "T", BuildConfig.FLAVOR, "<init>", "()V", "value", BuildConfig.FLAVOR, "a", "(Ljava/lang/Object;Leu/b;)Ljava/lang/Object;", BuildConfig.FLAVOR, "iterator", "e", "(Ljava/util/Iterator;Leu/b;)Ljava/lang/Object;", "Lkotlin/sequences/Sequence;", "sequence", "f", "(Lkotlin/sequences/Sequence;Leu/b;)Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class h<T> {
    @Nullable
    public abstract Object a(T t8, @NotNull eu.b<? super Unit> bVar);

    @Nullable
    public abstract Object e(@NotNull Iterator<? extends T> it, @NotNull eu.b<? super Unit> bVar);

    @Nullable
    public final Object f(@NotNull Sequence<? extends T> sequence, @NotNull eu.b<? super Unit> bVar) {
        Object objE = e(sequence.iterator(), bVar);
        return objE == fu.c.e() ? objE : Unit.f21506a;
    }
}
