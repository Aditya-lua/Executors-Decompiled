package p581ym;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nu.InterfaceC9575h;
import nu.InterfaceC9577i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7347n;
import p256ku.C7905p;
import p256ku.InterfaceC7897n;
import p315nt.InterfaceC9557b;
import p344ot.C10046b;
import p344ot.C10047c;
import pt.C10346h;

/* JADX INFO: renamed from: ym.y */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u001a{\u0010\u000b\u001a\u00020\n\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00042\u001e\u0010\u0007\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00060\u00052$\u0010\t\u001a \u0012\u0004\u0012\u00028\u0000\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00060\bH\u0080@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a[\u0010\u000e\u001a\u00020\n\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u0002\"\u0004\b\u0002\u0010\u0003*\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00060\u00052\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0006H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, m31665d2 = {"T", "PropsT", "StateT", "OutputT", "Lnu/h;", "Lym/h;", "Lym/r;", "actionSink", "Lkotlin/Function1;", "handler", "", "a", "(Lnu/h;Lym/h;Lkotlin/jvm/functions/Function1;Lnt/b;)Ljava/lang/Object;", "action", "b", "(Lym/h;Lym/r;Lnt/b;)Ljava/lang/Object;", "wf1-workflow-core"}, m31666k = 5, m31667mv = {1, 6, 0}, m31669xi = 48, m31670xs = "com/squareup/workflow1/Workflows")
public final /* synthetic */ class C13232y {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: ym.y$a */
    @Metadata(m31664d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006"}, m31665d2 = {"ym/y$a", "Lnu/i;", "value", "", "emit", "(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {1, 6, 0}, m31669xi = 48)
    public static final class a<T> implements InterfaceC9577i<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC13215h f46567a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f46568b;

        public a(InterfaceC13215h interfaceC13215h, Function1 function1) {
            this.f46567a = interfaceC13215h;
            this.f46568b = function1;
        }

        @Override // nu.InterfaceC9577i
        @Nullable
        public Object emit(T t8, @NotNull InterfaceC9557b<? super Unit> interfaceC9557b) {
            Object objM48938m = C13230w.m48938m(this.f46567a, (AbstractC13225r) this.f46568b.invoke(t8), interfaceC9557b);
            return objM48938m == C10047c.m38805e() ? objM48938m : Unit.f29331a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [StateT, OutputT, PropsT] */
    /* JADX INFO: renamed from: ym.y$b, reason: from toString */
    @Metadata(m31664d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J)\u0010\u0007\u001a\u00020\u0006*\u00180\u0005R\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0001H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m31665d2 = {"ym/y$b", "Lym/r;", "", "toString", "()Ljava/lang/String;", "Lym/r$c;", "", "a", "(Lym/r$c;)V", "wf1-workflow-core"}, m31666k = 1, m31667mv = {1, 6, 0}, m31669xi = 48)
    public static final class sendAndAwaitApplication<OutputT, PropsT, StateT> extends AbstractC13225r<PropsT, StateT, OutputT> {

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ AbstractC13225r<PropsT, StateT, OutputT> f46569c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ InterfaceC7897n<Unit> f46570d;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: ym.r<? super PropsT, StateT, ? extends OutputT> */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: ku.n<? super kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public sendAndAwaitApplication(AbstractC13225r<? super PropsT, StateT, ? extends OutputT> abstractC13225r, InterfaceC7897n<? super Unit> interfaceC7897n) {
            this.f46569c = abstractC13225r;
            this.f46570d = interfaceC7897n;
        }

        @Override // p581ym.AbstractC13225r
        /* JADX INFO: renamed from: a */
        public void mo48844a(@NotNull AbstractC13225r<? super PropsT, StateT, ? extends OutputT>.c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "<this>");
            if (this.f46570d.mo32811b()) {
                this.f46569c.mo48844a(cVar);
                InterfaceC7897n<Unit> interfaceC7897n = this.f46570d;
                C7347n.Companion companion = C7347n.INSTANCE;
                interfaceC7897n.resumeWith(C7347n.m30460b(Unit.f29331a));
            }
        }

        @NotNull
        public String toString() {
            return "sendAndAwaitApplication(" + this.f46569c + ')';
        }
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public static final <T, PropsT, StateT, OutputT> Object m48941a(@NotNull InterfaceC9575h<? extends T> interfaceC9575h, @NotNull InterfaceC13215h<? super AbstractC13225r<? super PropsT, StateT, ? extends OutputT>> interfaceC13215h, @NotNull Function1<? super T, ? extends AbstractC13225r<? super PropsT, StateT, ? extends OutputT>> function1, @NotNull InterfaceC9557b<? super Unit> interfaceC9557b) {
        Object objCollect = interfaceC9575h.collect(new a(interfaceC13215h, function1), interfaceC9557b);
        return objCollect == C10047c.m38805e() ? objCollect : Unit.f29331a;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static final <PropsT, StateT, OutputT> Object m48942b(@NotNull InterfaceC13215h<? super AbstractC13225r<? super PropsT, StateT, ? extends OutputT>> interfaceC13215h, @NotNull AbstractC13225r<? super PropsT, StateT, ? extends OutputT> abstractC13225r, @NotNull InterfaceC9557b<? super Unit> interfaceC9557b) {
        C7905p c7905p = new C7905p(C10046b.m38803c(interfaceC9557b), 1);
        c7905p.m32860H();
        interfaceC13215h.mo17905a(new sendAndAwaitApplication(abstractC13225r, c7905p));
        Object objM32857A = c7905p.m32857A();
        if (objM32857A == C10047c.m38805e()) {
            C10346h.m39673c(interfaceC9557b);
        }
        return objM32857A == C10047c.m38805e() ? objM32857A : Unit.f29331a;
    }
}
