package ln;

import com.github.luben.zstd.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u001a{\u0010\u000b\u001a\u00020\n\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00042\u001e\u0010\u0007\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00060\u00052$\u0010\t\u001a \u0012\u0004\u0012\u00028\u0000\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00060\bH\u0080@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a[\u0010\u000e\u001a\u00020\n\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u0002\"\u0004\b\u0002\u0010\u0003*\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00060\u00052\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0006H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"T", "PropsT", "StateT", "OutputT", "Ldv/h;", "Lln/h;", "Lln/r;", "actionSink", "Lkotlin/Function1;", "handler", BuildConfig.FLAVOR, "a", "(Ldv/h;Lln/h;Lkotlin/jvm/functions/Function1;Leu/b;)Ljava/lang/Object;", "action", "b", "(Lln/h;Lln/r;Leu/b;)Ljava/lang/Object;", "wf1-workflow-core"}, k = 5, mv = {1, 6, 0}, xi = 48, xs = "com/squareup/workflow1/Workflows")
public final /* synthetic */ class y {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006"}, d2 = {"ln/y$a", "Ldv/i;", "value", BuildConfig.FLAVOR, "emit", "(Ljava/lang/Object;Leu/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class a<T> implements dv.i<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h f22369a;
        public final /* synthetic */ Function1 b;

        public a(h hVar, Function1 function1) {
            this.f22369a = hVar;
            this.b = function1;
        }

        @Override // dv.i
        @Nullable
        public Object emit(T t8, @NotNull eu.b<? super Unit> bVar) {
            Object objM = w.m(this.f22369a, (r) this.b.invoke(t8), bVar);
            return objM == fu.c.e() ? objM : Unit.f21506a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [StateT, OutputT, PropsT] */
    /* JADX INFO: renamed from: ln.y$b, reason: from toString */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J)\u0010\u0007\u001a\u00020\u0006*\u00180\u0005R\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0001H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"ln/y$b", "Lln/r;", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", "Lln/r$c;", BuildConfig.FLAVOR, "a", "(Lln/r$c;)V", "wf1-workflow-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class sendAndAwaitApplication<OutputT, PropsT, StateT> extends r<PropsT, StateT, OutputT> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ r<PropsT, StateT, OutputT> f22370c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ av.n<Unit> f22371d;

        /* JADX WARN: Multi-variable type inference failed */
        public sendAndAwaitApplication(r<? super PropsT, StateT, ? extends OutputT> rVar, av.n<? super Unit> nVar) {
            this.f22370c = rVar;
            this.f22371d = nVar;
        }

        @Override // ln.r
        public void a(@NotNull r<? super PropsT, StateT, ? extends OutputT>.c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "<this>");
            if (this.f22371d.b()) {
                this.f22370c.a(cVar);
                av.n<Unit> nVar = this.f22371d;
                zt.n.Companion companion = zt.n.INSTANCE;
                nVar.resumeWith(zt.n.b(Unit.f21506a));
            }
        }

        @NotNull
        public String toString() {
            return "sendAndAwaitApplication(" + this.f22370c + ')';
        }
    }

    @Nullable
    public static final <T, PropsT, StateT, OutputT> Object a(@NotNull dv.h<? extends T> hVar, @NotNull h<? super r<? super PropsT, StateT, ? extends OutputT>> hVar2, @NotNull Function1<? super T, ? extends r<? super PropsT, StateT, ? extends OutputT>> function1, @NotNull eu.b<? super Unit> bVar) {
        Object objCollect = hVar.collect(new a(hVar2, function1), bVar);
        return objCollect == fu.c.e() ? objCollect : Unit.f21506a;
    }

    @Nullable
    public static final <PropsT, StateT, OutputT> Object b(@NotNull h<? super r<? super PropsT, StateT, ? extends OutputT>> hVar, @NotNull r<? super PropsT, StateT, ? extends OutputT> rVar, @NotNull eu.b<? super Unit> bVar) {
        av.p pVar = new av.p(fu.b.c(bVar), 1);
        pVar.G();
        hVar.a(new sendAndAwaitApplication(rVar, pVar));
        Object objY = pVar.y();
        if (objY == fu.c.e()) {
            gu.h.c(bVar);
        }
        return objY == fu.c.e() ? objY : Unit.f21506a;
    }
}
