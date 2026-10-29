package mu;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aE\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"E", "", "capacity", "Lmu/a;", "onBufferOverflow", "Lkotlin/Function1;", "", "onUndeliveredElement", "Lmu/g;", "a", "(ILmu/a;Lkotlin/jvm/functions/Function1;)Lmu/g;", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class j {
    @NotNull
    public static final <E> g<E> a(int i10, @NotNull a aVar, @Nullable Function1<? super E, Unit> function1) {
        if (i10 == -2) {
            return aVar == a.SUSPEND ? new e(g.INSTANCE.a(), function1) : new s(1, aVar, function1);
        }
        if (i10 == -1) {
            if (aVar == a.SUSPEND) {
                return new s(1, a.DROP_OLDEST, function1);
            }
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
        }
        if (i10 == 0) {
            return aVar == a.SUSPEND ? new e(0, function1) : new s(1, aVar, function1);
        }
        if (i10 != Integer.MAX_VALUE) {
            return aVar == a.SUSPEND ? new e(i10, function1) : new s(i10, aVar, function1);
        }
        return new e(Integer.MAX_VALUE, function1);
    }

    public static /* synthetic */ g b(int i10, a aVar, Function1 function1, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        if ((i11 & 2) != 0) {
            aVar = a.SUSPEND;
        }
        if ((i11 & 4) != 0) {
            function1 = null;
        }
        return a(i10, aVar, function1);
    }
}
