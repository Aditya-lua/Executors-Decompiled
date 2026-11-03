package wm;

import iu.p0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012 \u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u00022\u00020\u0006B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0012\u001a\u00020\u00042\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J3\u0010\u0017\u001a\u00020\u00042\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0016\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0017\u0010\u0018JO\u0010\u001d\u001a\u00020\u00052\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u001a\u001a\u00020\u00042(\u0010\u001c\u001a$0\u001bR \u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0002H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0016\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\r\u0010!\u001a\u0004\b\"\u0010#R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001a\u0010*\u001a\u00020&8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b'\u0010)¨\u0006+"}, d2 = {"Lwm/p;", "OutputT", "Lwm/k;", "Lwm/o;", "", "", "Lwm/c;", "Lfu/m;", "workerType", "", "key", "<init>", "(Lfu/m;Ljava/lang/String;)V", "a", "()Ljava/lang/String;", "props", "Lwm/i;", "snapshot", "i", "(Lwm/o;Lwm/i;)Ljava/lang/Integer;", "old", "new", "state", "j", "(Lwm/o;Lwm/o;I)Ljava/lang/Integer;", "renderProps", "renderState", "Lwm/k$a;", "context", "k", "(Lwm/o;ILwm/k$a;)V", "l", "(I)Lwm/i;", "Lfu/m;", "getWorkerType", "()Lfu/m;", "b", "Ljava/lang/String;", "Lwm/s;", "c", "Lwm/s;", "()Lwm/s;", "realIdentifier", "wf1-workflow-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class p<OutputT> extends k<o<? extends OutputT>, Integer, OutputT, Unit> implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final fu.m workerType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String key;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final s realIdentifier;

    @nt.f(c = "com.squareup.workflow1.WorkerWorkflow$render$1", f = "WorkerWorkflow.kt", l = {57}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"OutputT", "Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {1, 6, 0})
    public static final class a extends nt.m implements Function2<p0, lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f34587t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ o<OutputT> f34588u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ p<OutputT> f34589v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ k<o<? extends OutputT>, Integer, OutputT, Unit>.a f34590w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(o<? extends OutputT> oVar, p<OutputT> pVar, k<? super o<? extends OutputT>, Integer, ? extends OutputT, Unit>.a aVar, lt.b<? super a> bVar) {
            super(2, bVar);
            this.f34588u = oVar;
            this.f34589v = pVar;
            this.f34590w = aVar;
        }

        @Override // nt.a
        @NotNull
        public final lt.b<Unit> create(@Nullable Object obj, @NotNull lt.b<?> bVar) {
            return new a(this.f34588u, this.f34589v, this.f34590w, bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull p0 p0Var, @Nullable lt.b<? super Unit> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        @Override // nt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objE = mt.c.e();
            int i10 = this.f34587t;
            if (i10 == 0) {
                gt.o.b(obj);
                o<OutputT> oVar = this.f34588u;
                String str = this.f34589v.key;
                h<r<? super o<? extends OutputT>, Integer, ? extends OutputT>> hVarD = this.f34590w.d();
                this.f34587t = 1;
                if (w.k(oVar, str, hVarD, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
            }
            return Unit.f22938a;
        }
    }

    public p(@NotNull fu.m workerType, @NotNull String key) {
        Intrinsics.checkNotNullParameter(workerType, "workerType");
        Intrinsics.checkNotNullParameter(key, "key");
        this.workerType = workerType;
        this.key = key;
        this.realIdentifier = w.n(workerType);
    }

    @Override // wm.c
    @NotNull
    public String a() {
        return Intrinsics.l("worker ", this.workerType);
    }

    @Override // wm.c
    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public s getRealIdentifier() {
        return this.realIdentifier;
    }

    @Override // wm.k
    public /* bridge */ /* synthetic */ Integer e(Object obj, Object obj2, Integer num) {
        return j((o) obj, (o) obj2, num.intValue());
    }

    @Override // wm.k
    public /* bridge */ /* synthetic */ Unit f(Object obj, Integer num, k.a aVar) {
        k((o) obj, num.intValue(), aVar);
        return Unit.f22938a;
    }

    @Override // wm.k
    public /* bridge */ /* synthetic */ Snapshot g(Integer num) {
        return l(num.intValue());
    }

    @Override // wm.k
    @NotNull
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public Integer d(@NotNull o<? extends OutputT> props, @Nullable Snapshot snapshot) {
        Intrinsics.checkNotNullParameter(props, "props");
        return 0;
    }

    @NotNull
    public Integer j(@NotNull o<? extends OutputT> old, @NotNull o<? extends OutputT> oVar, int state) {
        Intrinsics.checkNotNullParameter(old, "old");
        Intrinsics.checkNotNullParameter(oVar, "new");
        if (!old.c(oVar)) {
            state++;
        }
        return Integer.valueOf(state);
    }

    public void k(@NotNull o<? extends OutputT> renderProps, int renderState, @NotNull k<? super o<? extends OutputT>, Integer, ? extends OutputT, Unit>.a context) {
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(context, "context");
        context.b(String.valueOf(renderState), new a(renderProps, this, context, null));
    }

    @Nullable
    public Snapshot l(int state) {
        return null;
    }
}
