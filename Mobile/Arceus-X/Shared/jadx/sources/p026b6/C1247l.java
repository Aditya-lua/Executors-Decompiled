package p026b6;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7701q;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import nu.C9579j;
import nu.InterfaceC9575h;
import nu.InterfaceC9577i;
import org.jetbrains.annotations.NotNull;
import p042c6.InterfaceC1545e;
import p069d6.C4463n;
import p120f6.C5390j0;
import p229jt.C7348o;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p615zt.InterfaceC14057n;
import p617ou.C10062l;
import pt.AbstractC10351m;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: b6.l */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tJ\u001b\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010¨\u0006\u0011"}, m31665d2 = {"Lb6/l;", "", "", "Lc6/e;", "controllers", "<init>", "(Ljava/util/List;)V", "Ld6/n;", "trackers", "(Ld6/n;)V", "Lf6/j0;", "spec", "Lnu/h;", "Lb6/b;", "a", "(Lf6/j0;)Lnu/h;", "Ljava/util/List;", "work-runtime_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C1247l {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final List<InterfaceC1545e> controllers;

    /* JADX INFO: renamed from: b6.l$a */
    @Metadata(m31664d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m31665d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lnu/h;", "Lnu/i;", "collector", "", "collect", "(Lnu/i;Lnt/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class a implements InterfaceC9575h<AbstractC1237b> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC9575h[] f5199a;

        /* JADX INFO: renamed from: b6.l$a$a, reason: collision with other inner class name */
        @Metadata(m31666k = 3, m31667mv = {2, 1, 0}, m31669xi = 48)
        public static final class C14093a implements Function0<AbstractC1237b[]> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ InterfaceC9575h[] f5200a;

            public C14093a(InterfaceC9575h[] interfaceC9575hArr) {
                this.f5200a = interfaceC9575hArr;
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final AbstractC1237b[] invoke() {
                return new AbstractC1237b[this.f5200a.length];
            }
        }

        /* JADX INFO: renamed from: b6.l$a$b */
        @Metadata(m31664d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m31665d2 = {"R", "T", "Lnu/i;", "", "it", "", "<anonymous>", "(Lnu/i;Lkotlin/Array;)V"}, m31666k = 3, m31667mv = {2, 1, 0})
        @InterfaceC10344f(m39663c = "androidx.work.impl.constraints.WorkConstraintsTracker$track$$inlined$combine$1$3", m39664f = "WorkConstraintsTracker.kt", m39665l = {288}, m39666m = "invokeSuspend")
        public static final class b extends AbstractC10351m implements InterfaceC14057n<InterfaceC9577i<? super AbstractC1237b>, AbstractC1237b[], InterfaceC9557b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t */
            public int f5201t;

            /* JADX INFO: renamed from: u */
            public /* synthetic */ Object f5202u;

            /* JADX INFO: renamed from: v */
            public /* synthetic */ Object f5203v;

            public b(InterfaceC9557b interfaceC9557b) {
                super(3, interfaceC9557b);
            }

            @Override // pt.AbstractC10339a
            public final Object invokeSuspend(Object obj) {
                AbstractC1237b abstractC1237b;
                Object objM38805e = C10047c.m38805e();
                int i10 = this.f5201t;
                if (i10 == 0) {
                    C7348o.m30470b(obj);
                    InterfaceC9577i interfaceC9577i = (InterfaceC9577i) this.f5202u;
                    AbstractC1237b[] abstractC1237bArr = (AbstractC1237b[]) ((Object[]) this.f5203v);
                    int length = abstractC1237bArr.length;
                    int i11 = 0;
                    while (true) {
                        if (i11 >= length) {
                            abstractC1237b = null;
                            break;
                        }
                        abstractC1237b = abstractC1237bArr[i11];
                        if (!Intrinsics.m31980c(abstractC1237b, AbstractC1237b.a.f5166a)) {
                            break;
                        }
                        i11++;
                    }
                    if (abstractC1237b == null) {
                        abstractC1237b = AbstractC1237b.a.f5166a;
                    }
                    this.f5201t = 1;
                    if (interfaceC9577i.emit(abstractC1237b, this) == objM38805e) {
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

            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // p615zt.InterfaceC14057n
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC9577i<? super AbstractC1237b> interfaceC9577i, AbstractC1237b[] abstractC1237bArr, InterfaceC9557b<? super Unit> interfaceC9557b) {
                b bVar = new b(interfaceC9557b);
                bVar.f5202u = interfaceC9577i;
                bVar.f5203v = abstractC1237bArr;
                return bVar.invokeSuspend(Unit.f29331a);
            }
        }

        public a(InterfaceC9575h[] interfaceC9575hArr) {
            this.f5199a = interfaceC9575hArr;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [nu.i, nt.b] */
        @Override // nu.InterfaceC9575h
        public Object collect(InterfaceC9577i<? super AbstractC1237b> interfaceC9577i, InterfaceC9557b interfaceC9557b) {
            InterfaceC9575h[] interfaceC9575hArr = this.f5199a;
            Object objM38831a = C10062l.m38831a(interfaceC9577i, interfaceC9575hArr, new C14093a(interfaceC9575hArr), new b(null), interfaceC9557b);
            return objM38831a == C10047c.m38805e() ? objM38831a : Unit.f29331a;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends c6.e> */
    /* JADX WARN: Multi-variable type inference failed */
    public C1247l(@NotNull List<? extends InterfaceC1545e> controllers) {
        Intrinsics.checkNotNullParameter(controllers, "controllers");
        this.controllers = controllers;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final InterfaceC9575h<AbstractC1237b> m6958a(@NotNull C5390j0 spec) {
        Intrinsics.checkNotNullParameter(spec, "spec");
        List<InterfaceC1545e> list = this.controllers;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((InterfaceC1545e) obj).mo6939a(spec)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(C7701q.m31905u(arrayList, 10));
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj2 = arrayList.get(i10);
            i10++;
            arrayList2.add(((InterfaceC1545e) obj2).mo6940b(spec.constraints));
        }
        return C9579j.m37796m(new a((InterfaceC9575h[]) CollectionsKt.m31687M0(arrayList2).toArray(new InterfaceC9575h[0])));
    }

    /* JADX DEBUG: Class process forced to load method for inline: b6.m.b(d6.n):java.util.List */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1247l(@NotNull C4463n trackers) {
        this((List<? extends InterfaceC1545e>) C1248m.m6964d(trackers));
        Intrinsics.checkNotNullParameter(trackers, "trackers");
    }
}
