package p201iu;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;

/* JADX INFO: renamed from: iu.h */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002B\t\b\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00028\u0000H¦@¢\u0006\u0004\b\u0007\u0010\bJ\u001e\u0010\u000b\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH¦@¢\u0006\u0004\b\u000b\u0010\fJ\u001e\u0010\u000f\u001a\u00020\u00062\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0086@¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m31665d2 = {"Liu/h;", "T", "", "<init>", "()V", "value", "", "a", "(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;", "", "iterator", "e", "(Ljava/util/Iterator;Lnt/b;)Ljava/lang/Object;", "Lkotlin/sequences/Sequence;", "sequence", "g", "(Lkotlin/sequences/Sequence;Lnt/b;)Ljava/lang/Object;", "kotlin-stdlib"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public abstract class AbstractC6980h<T> {
    @Nullable
    /* JADX INFO: renamed from: a */
    public abstract Object mo29366a(T t8, @NotNull InterfaceC9557b<? super Unit> interfaceC9557b);

    @Nullable
    /* JADX INFO: renamed from: e */
    public abstract Object mo29367e(@NotNull Iterator<? extends T> it, @NotNull InterfaceC9557b<? super Unit> interfaceC9557b);

    @Nullable
    /* JADX INFO: renamed from: g */
    public final Object m29371g(@NotNull Sequence<? extends T> sequence, @NotNull InterfaceC9557b<? super Unit> interfaceC9557b) {
        Object objMo29367e = mo29367e(sequence.iterator(), interfaceC9557b);
        return objMo29367e == C10047c.m38805e() ? objMo29367e : Unit.f29331a;
    }
}
