package p581ym;

import hu.InterfaceC6577m;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7348o;
import p256ku.InterfaceC7906p0;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import pt.AbstractC10351m;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: ym.p */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012 \u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u00022\u00020\u0006B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0012\u001a\u00020\u00042\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J3\u0010\u0017\u001a\u00020\u00042\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0016\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0017\u0010\u0018JO\u0010\u001d\u001a\u00020\u00052\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u001a\u001a\u00020\u00042(\u0010\u001c\u001a$0\u001bR \u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0002H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0016\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\r\u0010!\u001a\u0004\b\"\u0010#R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001a\u0010*\u001a\u00020&8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b'\u0010)¨\u0006+"}, m31665d2 = {"Lym/p;", "OutputT", "Lym/k;", "Lym/o;", "", "", "Lym/c;", "Lhu/m;", "workerType", "", "key", "<init>", "(Lhu/m;Ljava/lang/String;)V", "a", "()Ljava/lang/String;", "props", "Lym/i;", "snapshot", "i", "(Lym/o;Lym/i;)Ljava/lang/Integer;", "old", "new", "state", "j", "(Lym/o;Lym/o;I)Ljava/lang/Integer;", "renderProps", "renderState", "Lym/k$a;", "context", "k", "(Lym/o;ILym/k$a;)V", "l", "(I)Lym/i;", "Lhu/m;", "getWorkerType", "()Lhu/m;", "b", "Ljava/lang/String;", "Lym/s;", "c", "Lym/s;", "()Lym/s;", "realIdentifier", "wf1-workflow-core"}, m31666k = 1, m31667mv = {1, 6, 0}, m31669xi = 48)
public final class C13223p<OutputT> extends AbstractC13218k<InterfaceC13222o<? extends OutputT>, Integer, OutputT, Unit> implements InterfaceC13209c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC6577m workerType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String key;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final C13226s realIdentifier;

    /* JADX INFO: renamed from: ym.p$a */
    @Metadata(m31664d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"OutputT", "Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {1, 6, 0})
    @InterfaceC10344f(m39663c = "com.squareup.workflow1.WorkerWorkflow$render$1", m39664f = "WorkerWorkflow.kt", m39665l = {57}, m39666m = "invokeSuspend")
    public static final class a extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f46541t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ InterfaceC13222o<OutputT> f46542u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ C13223p<OutputT> f46543v;

        /* JADX INFO: renamed from: w */
        public final /* synthetic */ AbstractC13218k<InterfaceC13222o<? extends OutputT>, Integer, OutputT, Unit>.a f46544w;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: ym.o<? extends OutputT> */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: ym.k<? super ym.o<? extends OutputT>, java.lang.Integer, ? extends OutputT, kotlin.Unit>$a */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(InterfaceC13222o<? extends OutputT> interfaceC13222o, C13223p<OutputT> c13223p, AbstractC13218k<? super InterfaceC13222o<? extends OutputT>, Integer, ? extends OutputT, Unit>.a aVar, InterfaceC9557b<? super a> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f46542u = interfaceC13222o;
            this.f46543v = c13223p;
            this.f46544w = aVar;
        }

        @Override // pt.AbstractC10339a
        @NotNull
        public final InterfaceC9557b<Unit> create(@Nullable Object obj, @NotNull InterfaceC9557b<?> interfaceC9557b) {
            return new a(this.f46542u, this.f46543v, this.f46544w, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f46541t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                InterfaceC13222o<OutputT> interfaceC13222o = this.f46542u;
                String str = this.f46543v.key;
                InterfaceC13215h<AbstractC13225r<? super InterfaceC13222o<? extends OutputT>, Integer, ? extends OutputT>> interfaceC13215hMo48837d = this.f46544w.mo48837d();
                this.f46541t = 1;
                if (C13230w.m48936k(interfaceC13222o, str, interfaceC13215hMo48837d, this) == objM38805e) {
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

    public C13223p(@NotNull InterfaceC6577m workerType, @NotNull String key) {
        Intrinsics.checkNotNullParameter(workerType, "workerType");
        Intrinsics.checkNotNullParameter(key, "key");
        this.workerType = workerType;
        this.key = key;
        this.realIdentifier = C13230w.m48939n(workerType);
    }

    @Override // p581ym.InterfaceC13209c
    @NotNull
    /* JADX INFO: renamed from: a */
    public String mo48850a() {
        return Intrinsics.m31989l("worker ", this.workerType);
    }

    @Override // p581ym.InterfaceC13209c
    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public C13226s getRealIdentifier() {
        return this.realIdentifier;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // p581ym.AbstractC13218k
    /* JADX INFO: renamed from: e */
    public /* bridge */ /* synthetic */ Integer mo48882e(Object obj, Object obj2, Integer num) {
        return m48896j((InterfaceC13222o) obj, (InterfaceC13222o) obj2, num.intValue());
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, ym.k$a] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // p581ym.AbstractC13218k
    /* JADX INFO: renamed from: f */
    public /* bridge */ /* synthetic */ Unit mo16431f(Object obj, Integer num, AbstractC13218k.a aVar) {
        m48897k((InterfaceC13222o) obj, num.intValue(), aVar);
        return Unit.f29331a;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // p581ym.AbstractC13218k
    /* JADX INFO: renamed from: g */
    public /* bridge */ /* synthetic */ Snapshot mo16432g(Integer num) {
        return m48898l(num.intValue());
    }

    /* JADX DEBUG: Method merged with bridge method: d(Ljava/lang/Object;Lym/i;)Ljava/lang/Object; */
    @Override // p581ym.AbstractC13218k
    @NotNull
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public Integer mo16430d(@NotNull InterfaceC13222o<? extends OutputT> props, @Nullable Snapshot snapshot) {
        Intrinsics.checkNotNullParameter(props, "props");
        return 0;
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public Integer m48896j(@NotNull InterfaceC13222o<? extends OutputT> old, @NotNull InterfaceC13222o<? extends OutputT> interfaceC13222o, int state) {
        Intrinsics.checkNotNullParameter(old, "old");
        Intrinsics.checkNotNullParameter(interfaceC13222o, "new");
        if (!old.mo7573b(interfaceC13222o)) {
            state++;
        }
        return Integer.valueOf(state);
    }

    /* JADX INFO: renamed from: k */
    public void m48897k(@NotNull InterfaceC13222o<? extends OutputT> renderProps, int renderState, @NotNull AbstractC13218k<? super InterfaceC13222o<? extends OutputT>, Integer, ? extends OutputT, Unit>.a context) {
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(context, "context");
        context.mo48835b(String.valueOf(renderState), new a(renderProps, this, context, null));
    }

    @Nullable
    /* JADX INFO: renamed from: l */
    public Snapshot m48898l(int state) {
        return null;
    }
}
