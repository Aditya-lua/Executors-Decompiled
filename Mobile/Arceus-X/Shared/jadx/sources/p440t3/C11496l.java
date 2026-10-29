package p440t3;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nu.C9596r0;
import nu.InterfaceC9566c0;
import nu.InterfaceC9575h;
import org.jetbrains.annotations.NotNull;
import p229jt.C7345l;

/* JADX INFO: renamed from: t3.l */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bR&\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\t8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u0012\u0004\b\f\u0010\u0004R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000eR\u001d\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u00108F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, m31665d2 = {"Lt3/l;", "T", "", "<init>", "()V", "Lt3/d0;", "newState", "c", "(Lt3/d0;)Lt3/d0;", "Lnu/c0;", "a", "Lnu/c0;", "getCachedValue$annotations", "cachedValue", "()Lt3/d0;", "currentState", "Lnu/h;", "b", "()Lnu/h;", "flow", "datastore-core_release"}, m31666k = 1, m31667mv = {1, 8, 0}, m31669xi = 48)
public final class C11496l<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC9566c0<AbstractC11481d0<T>> cachedValue;

    public C11496l() {
        C11489h0 c11489h0 = C11489h0.f40574b;
        Intrinsics.m31981d(c11489h0, "null cannot be cast to non-null type androidx.datastore.core.State<T of androidx.datastore.core.DataStoreInMemoryCache>");
        this.cachedValue = C9596r0.m37859a(c11489h0);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final AbstractC11481d0<T> m43047a() {
        return this.cachedValue.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final InterfaceC9575h<AbstractC11481d0<T>> m43048b() {
        return this.cachedValue;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002b  */
    @NotNull
    /* JADX INFO: renamed from: c */
    public final AbstractC11481d0<T> m43049c(@NotNull AbstractC11481d0<T> newState) {
        AbstractC11481d0<T> value;
        AbstractC11481d0<T> abstractC11481d0;
        Intrinsics.checkNotNullParameter(newState, "newState");
        InterfaceC9566c0<AbstractC11481d0<T>> interfaceC9566c0 = this.cachedValue;
        do {
            value = interfaceC9566c0.getValue();
            abstractC11481d0 = value;
            if (abstractC11481d0 instanceof C11508x ? true : Intrinsics.m31980c(abstractC11481d0, C11489h0.f40574b)) {
                abstractC11481d0 = newState;
            } else if (abstractC11481d0 instanceof C11484f) {
                if (newState.getVersion() > abstractC11481d0.getVersion()) {
                    abstractC11481d0 = newState;
                }
            } else if (!(abstractC11481d0 instanceof C11502r)) {
                throw new C7345l();
            }
        } while (!interfaceC9566c0.mo37710i(value, abstractC11481d0));
        return abstractC11481d0;
    }
}
