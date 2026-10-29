package p581ym;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7746m;
import kotlin.text.StringsKt;
import nu.InterfaceC9575h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7348o;
import p256ku.C7872i;
import p256ku.CoroutineName;
import p256ku.InterfaceC7906p0;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import pt.AbstractC10351m;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: ym.a0 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aU\u0010\n\u001a\u00020\t\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0004\u001a\u00020\u00032$\u0010\b\u001a \u0012\u001c\u0012\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0001\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u00060\u0005H\u0080@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a%\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001f\u0010\u0011\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u00012\u0006\u0010\u0010\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, m31665d2 = {"OutputT", "Lym/o;", "worker", "", "renderKey", "Lym/h;", "Lym/r;", "", "actionSink", "", "d", "(Lym/o;Ljava/lang/String;Lym/h;Lnt/b;)Ljava/lang/Object;", "T", "Lnu/h;", "c", "(Lym/o;)Lnu/h;", "key", "b", "(Lym/o;Ljava/lang/String;)Ljava/lang/String;", "wf1-workflow-core"}, m31666k = 5, m31667mv = {1, 6, 0}, m31669xi = 48, m31670xs = "com/squareup/workflow1/Workflows")
public final /* synthetic */ class C13206a0 {

    /* JADX INFO: renamed from: ym.a0$a */
    @Metadata(m31664d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"OutputT", "Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {1, 6, 0})
    @InterfaceC10344f(m39663c = "com.squareup.workflow1.Workflows__WorkerWorkflowKt$runWorker$2", m39664f = "WorkerWorkflow.kt", m39665l = {78}, m39666m = "invokeSuspend")
    public static final class a extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f46485t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ InterfaceC13222o<OutputT> f46486u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ InterfaceC13215h<AbstractC13225r<? super InterfaceC13222o<? extends OutputT>, Integer, ? extends OutputT>> f46487v;

        /* JADX INFO: renamed from: w */
        public final /* synthetic */ String f46488w;

        /* JADX INFO: Add missing generic type declarations: [OutputT] */
        /* JADX INFO: renamed from: ym.a0$a$a, reason: collision with other inner class name */
        @Metadata(m31664d1 = {"\u0000\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0005\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m31665d2 = {"OutputT", "output", "Lym/r;", "Lym/o;", "", "a", "(Ljava/lang/Object;)Lym/r;"}, m31666k = 3, m31667mv = {1, 6, 0})
        public static final class C14288a<OutputT> extends AbstractC7746m implements Function1<OutputT, AbstractC13225r<? super InterfaceC13222o<? extends OutputT>, Integer, ? extends OutputT>> {

            /* JADX INFO: renamed from: i */
            public final /* synthetic */ InterfaceC13222o<OutputT> f46489i;

            /* JADX INFO: renamed from: j */
            public final /* synthetic */ String f46490j;

            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: ym.o<? extends OutputT> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C14288a(InterfaceC13222o<? extends OutputT> interfaceC13222o, String str) {
                super(1);
                this.f46489i = interfaceC13222o;
                this.f46490j = str;
            }

            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final AbstractC13225r<InterfaceC13222o<? extends OutputT>, Integer, OutputT> invoke(OutputT outputt) {
                return new C13207b(this.f46489i, this.f46490j, outputt);
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: ym.o<? extends OutputT> */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: ym.h<? super ym.r<? super ym.o<? extends OutputT>, java.lang.Integer, ? extends OutputT>> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(InterfaceC13222o<? extends OutputT> interfaceC13222o, InterfaceC13215h<? super AbstractC13225r<? super InterfaceC13222o<? extends OutputT>, Integer, ? extends OutputT>> interfaceC13215h, String str, InterfaceC9557b<? super a> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f46486u = interfaceC13222o;
            this.f46487v = interfaceC13215h;
            this.f46488w = str;
        }

        @Override // pt.AbstractC10339a
        @NotNull
        public final InterfaceC9557b<Unit> create(@Nullable Object obj, @NotNull InterfaceC9557b<?> interfaceC9557b) {
            return new a(this.f46486u, this.f46487v, this.f46488w, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f46485t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                InterfaceC9575h interfaceC9575hM48841c = C13206a0.m48841c(this.f46486u);
                InterfaceC13215h<AbstractC13225r<? super InterfaceC13222o<? extends OutputT>, Integer, ? extends OutputT>> interfaceC13215h = this.f46487v;
                C14288a c14288a = new C14288a(this.f46486u, this.f46488w);
                this.f46485t = 1;
                if (C13230w.m48934i(interfaceC9575hM48841c, interfaceC13215h, c14288a, this) == objM38805e) {
                    return objM38805e;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
            }
            return Unit.f29331a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull InterfaceC7906p0 interfaceC7906p0, @Nullable InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((a) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final String m48840b(InterfaceC13222o<?> interfaceC13222o, String str) {
        String string = interfaceC13222o.toString();
        if (StringsKt.m32182p0(str)) {
            return string;
        }
        return string + ':' + str;
    }

    /* JADX INFO: renamed from: c */
    public static final <T> InterfaceC9575h<T> m48841c(InterfaceC13222o<? extends T> interfaceC13222o) {
        InterfaceC9575h<? extends T> interfaceC9575hRun = interfaceC13222o.run();
        if (interfaceC9575hRun != null) {
            return interfaceC9575hRun;
        }
        throw new NullPointerException("Worker " + interfaceC13222o + " returned a null Flow. If this is a test mock, make sure you mock the run() method!");
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public static final <OutputT> Object m48842d(@NotNull InterfaceC13222o<? extends OutputT> interfaceC13222o, @NotNull String str, @NotNull InterfaceC13215h<? super AbstractC13225r<? super InterfaceC13222o<? extends OutputT>, Integer, ? extends OutputT>> interfaceC13215h, @NotNull InterfaceC9557b<? super Unit> interfaceC9557b) {
        Object objM32684g = C7872i.m32684g(new CoroutineName(m48840b(interfaceC13222o, str)), new a(interfaceC13222o, interfaceC13215h, str, null), interfaceC9557b);
        return objM32684g == C10047c.m38805e() ? objM32684g : Unit.f29331a;
    }
}
