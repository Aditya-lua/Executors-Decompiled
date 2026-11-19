package ln;

import av.CoroutineName;
import av.p0;
import com.github.luben.zstd.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aU\u0010\n\u001a\u00020\t\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0004\u001a\u00020\u00032$\u0010\b\u001a \u0012\u001c\u0012\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0001\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u00060\u0005H\u0080@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a%\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001f\u0010\u0011\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u00012\u0006\u0010\u0010\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"OutputT", "Lln/o;", "worker", BuildConfig.FLAVOR, "renderKey", "Lln/h;", "Lln/r;", BuildConfig.FLAVOR, "actionSink", BuildConfig.FLAVOR, "d", "(Lln/o;Ljava/lang/String;Lln/h;Leu/b;)Ljava/lang/Object;", "T", "Ldv/h;", "c", "(Lln/o;)Ldv/h;", "key", "b", "(Lln/o;Ljava/lang/String;)Ljava/lang/String;", "wf1-workflow-core"}, k = 5, mv = {1, 6, 0}, xi = 48, xs = "com/squareup/workflow1/Workflows")
public final /* synthetic */ class a0 {

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"OutputT", "Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {1, 6, 0})
    @gu.f(c = "com.squareup.workflow1.Workflows__WorkerWorkflowKt$runWorker$2", f = "WorkerWorkflow.kt", l = {78}, m = "invokeSuspend")
    public static final class a extends gu.m implements Function2<p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f22300t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ o<OutputT> f22301u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ h<r<? super o<? extends OutputT>, Integer, ? extends OutputT>> f22302v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ String f22303w;

        /* JADX INFO: Add missing generic type declarations: [OutputT] */
        /* JADX INFO: renamed from: ln.a0$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0005\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"OutputT", "output", "Lln/r;", "Lln/o;", BuildConfig.FLAVOR, "a", "(Ljava/lang/Object;)Lln/r;"}, k = 3, mv = {1, 6, 0})
        public static final class C0434a<OutputT> extends p001kotlin.jvm.internal.m implements Function1<OutputT, r<? super o<? extends OutputT>, Integer, ? extends OutputT>> {

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public final /* synthetic */ o<OutputT> f22304i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public final /* synthetic */ String f22305j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0434a(o<? extends OutputT> oVar, String str) {
                super(1);
                this.f22304i = oVar;
                this.f22305j = str;
            }

            @Override // p001kotlin.jvm.functions.Function1
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final r<o<? extends OutputT>, Integer, OutputT> invoke(OutputT outputt) {
                return new b(this.f22304i, this.f22305j, outputt);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(o<? extends OutputT> oVar, h<? super r<? super o<? extends OutputT>, Integer, ? extends OutputT>> hVar, String str, eu.b<? super a> bVar) {
            super(2, bVar);
            this.f22301u = oVar;
            this.f22302v = hVar;
            this.f22303w = str;
        }

        @Override // gu.a
        @NotNull
        public final eu.b<Unit> create(@Nullable Object obj, @NotNull eu.b<?> bVar) {
            return new a(this.f22301u, this.f22302v, this.f22303w, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull p0 p0Var, @Nullable eu.b<? super Unit> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f22300t;
            if (i10 == 0) {
                zt.o.b(obj);
                dv.h hVarC = a0.c(this.f22301u);
                h<r<? super o<? extends OutputT>, Integer, ? extends OutputT>> hVar = this.f22302v;
                C0434a c0434a = new C0434a(this.f22301u, this.f22303w);
                this.f22300t = 1;
                if (w.i(hVarC, hVar, c0434a, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zt.o.b(obj);
            }
            return Unit.f21506a;
        }
    }

    public static final String b(o<?> oVar, String str) {
        String string = oVar.toString();
        if (StringsKt.p0(str)) {
            return string;
        }
        return string + ':' + str;
    }

    public static final <T> dv.h<T> c(o<? extends T> oVar) {
        dv.h<? extends T> hVarRun = oVar.run();
        if (hVarRun != null) {
            return hVarRun;
        }
        throw new NullPointerException("Worker " + oVar + " returned a null Flow. If this is a test mock, make sure you mock the run() method!");
    }

    @Nullable
    public static final <OutputT> Object d(@NotNull o<? extends OutputT> oVar, @NotNull String str, @NotNull h<? super r<? super o<? extends OutputT>, Integer, ? extends OutputT>> hVar, @NotNull eu.b<? super Unit> bVar) {
        Object objG = av.i.g(new CoroutineName(b(oVar, str)), new a(oVar, hVar, str, null), bVar);
        return objG == fu.c.e() ? objG : Unit.f21506a;
    }
}
