package mu;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: mu.j */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000 \n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aE\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m31665d2 = {"E", "", "capacity", "Lmu/a;", "onBufferOverflow", "Lkotlin/Function1;", "", "onUndeliveredElement", "Lmu/g;", "a", "(ILmu/a;Lkotlin/jvm/functions/Function1;)Lmu/g;", "kotlinx-coroutines-core"}, m31666k = 2, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C8675j {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final <E> InterfaceC8672g<E> m34926a(int i10, @NotNull EnumC8666a enumC8666a, @Nullable Function1<? super E, Unit> function1) {
        if (i10 == -2) {
            return enumC8666a == EnumC8666a.SUSPEND ? new C8670e(InterfaceC8672g.INSTANCE.m34923a(), function1) : new C8684s(1, enumC8666a, function1);
        }
        if (i10 == -1) {
            if (enumC8666a == EnumC8666a.SUSPEND) {
                return new C8684s(1, EnumC8666a.DROP_OLDEST, function1);
            }
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
        }
        if (i10 == 0) {
            return enumC8666a == EnumC8666a.SUSPEND ? new C8670e(0, function1) : new C8684s(1, enumC8666a, function1);
        }
        if (i10 != Integer.MAX_VALUE) {
            return enumC8666a == EnumC8666a.SUSPEND ? new C8670e(i10, function1) : new C8684s(i10, enumC8666a, function1);
        }
        return new C8670e(Integer.MAX_VALUE, function1);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ InterfaceC8672g m34927b(int i10, EnumC8666a enumC8666a, Function1 function1, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        if ((i11 & 2) != 0) {
            enumC8666a = EnumC8666a.SUSPEND;
        }
        if ((i11 & 4) != 0) {
            function1 = null;
        }
        return m34926a(i10, enumC8666a, function1);
    }
}
