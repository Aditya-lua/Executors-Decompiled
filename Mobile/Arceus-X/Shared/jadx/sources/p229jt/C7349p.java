package p229jt;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p563y1.C12996b;

/* JADX INFO: renamed from: jt.p */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\f\b\u0002\u0018\u0000 \u001c*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004:\u0001\u000fB\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0018\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u0012\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001b\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, m31665d2 = {"Ljt/p;", "T", "Ljt/h;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "Lkotlin/Function0;", "initializer", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "", "isInitialized", "()Z", "", "toString", "()Ljava/lang/String;", "a", "Lkotlin/jvm/functions/Function0;", "", "b", "Ljava/lang/Object;", "_value", "c", "getFinal$annotations", "()V", "final", "getValue", "()Ljava/lang/Object;", "value", "d", "kotlin-stdlib"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C7349p<T> implements InterfaceC7341h<T>, Serializable {

    /* JADX INFO: renamed from: e */
    public static final AtomicReferenceFieldUpdater<C7349p<?>, Object> f28241e = AtomicReferenceFieldUpdater.newUpdater(C7349p.class, Object.class, "b");

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public volatile Function0<? extends T> initializer;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public volatile Object _value;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Object final;

    public C7349p(@NotNull Function0<? extends T> initializer) {
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        this.initializer = initializer;
        C7329a0 c7329a0 = C7329a0.f28215a;
        this._value = c7329a0;
        this.final = c7329a0;
    }

    @Override // p229jt.InterfaceC7341h
    public T getValue() {
        T t8 = (T) this._value;
        C7329a0 c7329a0 = C7329a0.f28215a;
        if (t8 != c7329a0) {
            return t8;
        }
        Function0<? extends T> function0 = this.initializer;
        if (function0 != null) {
            T tInvoke = function0.invoke();
            if (C12996b.m48310a(f28241e, this, c7329a0, tInvoke)) {
                this.initializer = null;
                return tInvoke;
            }
        }
        return (T) this._value;
    }

    @Override // p229jt.InterfaceC7341h
    public boolean isInitialized() {
        return this._value != C7329a0.f28215a;
    }

    @NotNull
    public String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
