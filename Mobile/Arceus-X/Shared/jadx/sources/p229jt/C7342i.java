package p229jt;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: jt.i */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a/\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m31665d2 = {"T", "Lkotlin/Function0;", "initializer", "Ljt/h;", "b", "(Lkotlin/jvm/functions/Function0;)Ljt/h;", "Ljt/k;", "mode", "a", "(Ljt/k;Lkotlin/jvm/functions/Function0;)Ljt/h;", "kotlin-stdlib"}, m31666k = 5, m31667mv = {2, 2, 0}, m31669xi = 49, m31670xs = "kotlin/LazyKt")
public class C7342i {

    /* JADX INFO: renamed from: jt.i$a */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f28231a;

        static {
            int[] iArr = new int[EnumC7344k.values().length];
            try {
                iArr[EnumC7344k.SYNCHRONIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC7344k.PUBLICATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC7344k.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f28231a = iArr;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public static <T> InterfaceC7341h<T> m30455a(@NotNull EnumC7344k mode, @NotNull Function0<? extends T> initializer) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        int i10 = a.f28231a[mode.ordinal()];
        if (i10 == 1) {
            return new C7350q(initializer, null, 2, null);
        }
        if (i10 == 2) {
            return new C7349p(initializer);
        }
        if (i10 == 3) {
            return new C7337e0(initializer);
        }
        throw new C7345l();
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static <T> InterfaceC7341h<T> m30456b(@NotNull Function0<? extends T> initializer) {
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        return new C7350q(initializer, null, 2, null);
    }
}
