package nu;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import mu.InterfaceC8687v;
import org.jetbrains.annotations.NotNull;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;

/* JADX INFO: renamed from: nu.k */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aE\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u00002*\b\u0001\u0010\u0006\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001¢\u0006\u0004\b\b\u0010\t\u001a!\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u00002\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b\u000b\u0010\f\u001aE\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u00002*\b\u0001\u0010\u0006\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001¢\u0006\u0004\b\u000e\u0010\t\u001aE\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u00002*\b\u0001\u0010\u0006\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001¢\u0006\u0004\b\u000f\u0010\t¨\u0006\u0010"}, m31665d2 = {"T", "Lkotlin/Function2;", "Lnu/i;", "Lnt/b;", "", "", "block", "Lnu/h;", "c", "(Lkotlin/jvm/functions/Function2;)Lnu/h;", "value", "d", "(Ljava/lang/Object;)Lnu/h;", "Lmu/v;", "b", "a", "kotlinx-coroutines-core"}, m31666k = 5, m31667mv = {2, 1, 0}, m31669xi = 48, m31670xs = "kotlinx/coroutines/flow/FlowKt")
public final /* synthetic */ class C9581k {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: nu.k$a */
    @Metadata(m31664d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m31665d2 = {"nu/k$a", "Lnu/h;", "Lnu/i;", "collector", "", "collect", "(Lnu/i;Lnt/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class a<T> implements InterfaceC9575h<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Object f34604a;

        public a(Object obj) {
            this.f34604a = obj;
        }

        @Override // nu.InterfaceC9575h
        public Object collect(InterfaceC9577i<? super T> interfaceC9577i, InterfaceC9557b<? super Unit> interfaceC9557b) {
            Object objEmit = interfaceC9577i.emit((Object) this.f34604a, interfaceC9557b);
            return objEmit == C10047c.m38805e() ? objEmit : Unit.f29331a;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final <T> InterfaceC9575h<T> m37814a(@NotNull Function2<? super InterfaceC8687v<? super T>, ? super InterfaceC9557b<? super Unit>, ? extends Object> function2) {
        return new C9563b(function2, null, 0, null, 14, null);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final <T> InterfaceC9575h<T> m37815b(@NotNull Function2<? super InterfaceC8687v<? super T>, ? super InterfaceC9557b<? super Unit>, ? extends Object> function2) {
        return new C9571f(function2, null, 0, null, 14, null);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final <T> InterfaceC9575h<T> m37816c(@NotNull Function2<? super InterfaceC9577i<? super T>, ? super InterfaceC9557b<? super Unit>, ? extends Object> function2) {
        return new C9572f0(function2);
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public static final <T> InterfaceC9575h<T> m37817d(T t8) {
        return new a(t8);
    }
}
