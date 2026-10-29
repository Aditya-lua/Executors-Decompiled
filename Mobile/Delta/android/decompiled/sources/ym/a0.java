package ym;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import ku.CoroutineName;
import ku.p0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aU\u0010\n\u001a\u00020\t\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0004\u001a\u00020\u00032$\u0010\b\u001a \u0012\u001c\u0012\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0001\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u00060\u0005H\u0080@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a%\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001f\u0010\u0011\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u00012\u0006\u0010\u0010\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"OutputT", "Lym/o;", "worker", "", "renderKey", "Lym/h;", "Lym/r;", "", "actionSink", "", "d", "(Lym/o;Ljava/lang/String;Lym/h;Lnt/b;)Ljava/lang/Object;", "T", "Lnu/h;", "c", "(Lym/o;)Lnu/h;", "key", "b", "(Lym/o;Ljava/lang/String;)Ljava/lang/String;", "wf1-workflow-core"}, k = 5, mv = {1, 6, 0}, xi = 48, xs = "com/squareup/workflow1/Workflows")
public final /* synthetic */ class a0 {

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"OutputT", "Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {1, 6, 0})
    @pt.f(c = "com.squareup.workflow1.Workflows__WorkerWorkflowKt$runWorker$2", f = "WorkerWorkflow.kt", l = {78}, m = "invokeSuspend")
    public static final class a extends pt.m implements Function2<p0, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f35909t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ o<OutputT> f35910u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ h<r<? super o<? extends OutputT>, Integer, ? extends OutputT>> f35911v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ String f35912w;

        /* JADX INFO: Add missing generic type declarations: [OutputT] */
        /* JADX INFO: renamed from: ym.a0$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0005\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"OutputT", "output", "Lym/r;", "Lym/o;", "", "a", "(Ljava/lang/Object;)Lym/r;"}, k = 3, mv = {1, 6, 0})
        public static final class C0662a<OutputT> extends kotlin.jvm.internal.m implements Function1<OutputT, r<? super o<? extends OutputT>, Integer, ? extends OutputT>> {

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public final /* synthetic */ o<OutputT> f35913i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public final /* synthetic */ String f35914j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0662a(o<? extends OutputT> oVar, String str) {
                super(1);
                this.f35913i = oVar;
                this.f35914j = str;
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final r<o<? extends OutputT>, Integer, OutputT> invoke(OutputT outputt) {
                return new b(this.f35913i, this.f35914j, outputt);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(o<? extends OutputT> oVar, h<? super r<? super o<? extends OutputT>, Integer, ? extends OutputT>> hVar, String str, nt.b<? super a> bVar) {
            super(2, bVar);
            this.f35910u = oVar;
            this.f35911v = hVar;
            this.f35912w = str;
        }

        @Override // pt.a
        @NotNull
        public final nt.b<Unit> create(@Nullable Object obj, @NotNull nt.b<?> bVar) {
            return new a(this.f35910u, this.f35911v, this.f35912w, bVar);
        }

        @Override // pt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objE = ot.c.e();
            int i10 = this.f35909t;
            if (i10 == 0) {
                jt.o.b(obj);
                nu.h hVarC = a0.c(this.f35910u);
                h<r<? super o<? extends OutputT>, Integer, ? extends OutputT>> hVar = this.f35911v;
                C0662a c0662a = new C0662a(this.f35910u, this.f35912w);
                this.f35909t = 1;
                if (w.i(hVarC, hVar, c0662a, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jt.o.b(obj);
            }
            return Unit.f22483a;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull p0 p0Var, @Nullable nt.b<? super Unit> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    public static final String b(o<?> oVar, String str) {
        String string = oVar.toString();
        if (StringsKt.p0(str)) {
            return string;
        }
        return string + ':' + str;
    }

    public static final <T> nu.h<T> c(o<? extends T> oVar) {
        nu.h<? extends T> hVarRun = oVar.run();
        if (hVarRun != null) {
            return hVarRun;
        }
        throw new NullPointerException("Worker " + oVar + " returned a null Flow. If this is a test mock, make sure you mock the run() method!");
    }

    @Nullable
    public static final <OutputT> Object d(@NotNull o<? extends OutputT> oVar, @NotNull String str, @NotNull h<? super r<? super o<? extends OutputT>, Integer, ? extends OutputT>> hVar, @NotNull nt.b<? super Unit> bVar) {
        Object objG = ku.i.g(new CoroutineName(b(oVar, str)), new a(oVar, hVar, str, null), bVar);
        return objG == ot.c.e() ? objG : Unit.f22483a;
    }
}
