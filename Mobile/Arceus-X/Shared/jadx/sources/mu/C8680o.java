package mu;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import p229jt.C7347n;
import p229jt.C7348o;
import p256ku.C7877j;
import p256ku.InterfaceC7906p0;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import pt.AbstractC10351m;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: mu.o */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a+\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m31665d2 = {"E", "Lmu/y;", "element", "Lmu/k;", "", "a", "(Lmu/y;Ljava/lang/Object;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m31666k = 5, m31667mv = {2, 1, 0}, m31669xi = 48, m31670xs = "kotlinx/coroutines/channels/ChannelsKt")
public final /* synthetic */ class C8680o {

    /* JADX INFO: renamed from: mu.o$a */
    @Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"Lku/p0;", "Lmu/k;", "", "<anonymous>", "(Lku/p0;)Lmu/k;"}, m31666k = 3, m31667mv = {2, 1, 0})
    @InterfaceC10344f(m39663c = "kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$trySendBlocking$2", m39664f = "Channels.kt", m39665l = {39}, m39666m = "invokeSuspend")
    public static final class a extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super C8676k<? extends Unit>>, Object> {

        /* JADX INFO: renamed from: t */
        public int f31718t;

        /* JADX INFO: renamed from: u */
        public /* synthetic */ Object f31719u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ InterfaceC8690y<E> f31720v;

        /* JADX INFO: renamed from: w */
        public final /* synthetic */ E f31721w;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: mu.y<? super E> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(InterfaceC8690y<? super E> interfaceC8690y, E e10, InterfaceC9557b<? super a> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f31720v = interfaceC8690y;
            this.f31721w = e10;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            a aVar = new a(this.f31720v, this.f31721w, interfaceC9557b);
            aVar.f31719u = obj;
            return aVar;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super C8676k<? extends Unit>> interfaceC9557b) {
            return invoke2(interfaceC7906p0, (InterfaceC9557b<? super C8676k<Unit>>) interfaceC9557b);
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM30460b;
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f31718t;
            try {
                if (i10 == 0) {
                    C7348o.m30470b(obj);
                    InterfaceC8690y<E> interfaceC8690y = this.f31720v;
                    E e10 = this.f31721w;
                    C7347n.Companion companion = C7347n.INSTANCE;
                    this.f31718t = 1;
                    if (interfaceC8690y.mo34848i(e10, this) == objM38805e) {
                        return objM38805e;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7348o.m30470b(obj);
                }
                objM30460b = C7347n.m30460b(Unit.f29331a);
            } catch (Throwable th2) {
                C7347n.Companion companion2 = C7347n.INSTANCE;
                objM30460b = C7347n.m30460b(C7348o.m30469a(th2));
            }
            return C8676k.m34929b(C7347n.m30466h(objM30460b) ? C8676k.INSTANCE.m34941c(Unit.f29331a) : C8676k.INSTANCE.m34939a(C7347n.m30463e(objM30460b)));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super C8676k<Unit>> interfaceC9557b) {
            return ((a) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: E */
    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final <E> Object m34959a(@NotNull InterfaceC8690y<? super E> interfaceC8690y, E e10) {
        Object objMo34870w = interfaceC8690y.mo34870w(e10);
        if (objMo34870w instanceof C8676k.c) {
            return ((C8676k) C7877j.m32694b(null, new a(interfaceC8690y, e10, null), 1, null)).getHolder();
        }
        return C8676k.INSTANCE.m34941c(Unit.f29331a);
    }
}
