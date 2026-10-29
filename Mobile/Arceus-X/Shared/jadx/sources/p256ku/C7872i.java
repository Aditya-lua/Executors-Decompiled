package p256ku;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p315nt.InterfaceC9557b;

/* JADX INFO: renamed from: ku.i */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"ku/j", "ku/k"}, m31665d2 = {}, m31666k = 4, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C7872i {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final <T> InterfaceC7934w0<T> m32678a(@NotNull InterfaceC7906p0 interfaceC7906p0, @NotNull CoroutineContext coroutineContext, @NotNull EnumC7914r0 enumC7914r0, @NotNull Function2<? super InterfaceC7906p0, ? super InterfaceC9557b<? super T>, ? extends Object> function2) {
        return C7882k.m32777a(interfaceC7906p0, coroutineContext, enumC7914r0, function2);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final InterfaceC7850d2 m32680c(@NotNull InterfaceC7906p0 interfaceC7906p0, @NotNull CoroutineContext coroutineContext, @NotNull EnumC7914r0 enumC7914r0, @NotNull Function2<? super InterfaceC7906p0, ? super InterfaceC9557b<? super Unit>, ? extends Object> function2) {
        return C7882k.m32779c(interfaceC7906p0, coroutineContext, enumC7914r0, function2);
    }

    /* JADX INFO: renamed from: e */
    public static final <T> T m32682e(@NotNull CoroutineContext coroutineContext, @NotNull Function2<? super InterfaceC7906p0, ? super InterfaceC9557b<? super T>, ? extends Object> function2) {
        return (T) C7877j.m32693a(coroutineContext, function2);
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public static final <T> Object m32684g(@NotNull CoroutineContext coroutineContext, @NotNull Function2<? super InterfaceC7906p0, ? super InterfaceC9557b<? super T>, ? extends Object> function2, @NotNull InterfaceC9557b<? super T> interfaceC9557b) {
        return C7882k.m32781e(coroutineContext, function2, interfaceC9557b);
    }
}
