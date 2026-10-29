package p460u6;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: u6.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00060\u0003j\u0002`\u0004B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00028\u00012\u0006\u0010\t\u001a\u00028\u0000¢\u0006\u0004\b\n\u0010\u000bR$\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\fR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m31665d2 = {"Lu6/b;", "P", "T", "", "Lkotlinx/atomicfu/locks/SynchronizedObject;", "Lkotlin/Function1;", "initializer", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "parameter", "a", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlin/jvm/functions/Function1;", "b", "Ljava/lang/Object;", "_value", "coil-network-core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C11804b<P, T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public Function1<? super P, ? extends T> initializer;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public Object _value = C11806d.f41559a;

    public C11804b(@NotNull Function1<? super P, ? extends T> function1) {
        this.initializer = function1;
    }

    /* JADX INFO: renamed from: a */
    public final T m44157a(P parameter) {
        T tInvoke;
        T t8 = (T) this._value;
        C11806d c11806d = C11806d.f41559a;
        if (t8 != c11806d) {
            return t8;
        }
        synchronized (this) {
            tInvoke = (T) this._value;
            if (tInvoke == c11806d) {
                Function1<? super P, ? extends T> function1 = this.initializer;
                Intrinsics.checkNotNull(function1);
                tInvoke = function1.invoke(parameter);
                this._value = tInvoke;
                this.initializer = null;
            }
        }
        return tInvoke;
    }
}
