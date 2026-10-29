package mu;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ku.p0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a+\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"E", "Lmu/y;", "element", "Lmu/k;", "", "a", "(Lmu/y;Ljava/lang/Object;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/channels/ChannelsKt")
public final /* synthetic */ class o {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lku/p0;", "Lmu/k;", "", "<anonymous>", "(Lku/p0;)Lmu/k;"}, k = 3, mv = {2, 1, 0})
    @pt.f(c = "kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$trySendBlocking$2", f = "Channels.kt", l = {39}, m = "invokeSuspend")
    public static final class a extends pt.m implements Function2<p0, nt.b<? super k<? extends Unit>>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f24566t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f24567u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ y<E> f24568v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ E f24569w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(y<? super E> yVar, E e10, nt.b<? super a> bVar) {
            super(2, bVar);
            this.f24568v = yVar;
            this.f24569w = e10;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            a aVar = new a(this.f24568v, this.f24569w, bVar);
            aVar.f24567u = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(p0 p0Var, nt.b<? super k<? extends Unit>> bVar) {
            return invoke2(p0Var, (nt.b<? super k<Unit>>) bVar);
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
        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object objE = ot.c.e();
            int i10 = this.f24566t;
            try {
                if (i10 == 0) {
                    jt.o.b(obj);
                    y<E> yVar = this.f24568v;
                    E e10 = this.f24569w;
                    jt.n.Companion companion = jt.n.INSTANCE;
                    this.f24566t = 1;
                    if (yVar.i(e10, this) == objE) {
                        return objE;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jt.o.b(obj);
                }
                objB = jt.n.b(Unit.f22483a);
            } catch (Throwable th2) {
                jt.n.Companion companion2 = jt.n.INSTANCE;
                objB = jt.n.b(jt.o.a(th2));
            }
            return k.b(jt.n.h(objB) ? k.INSTANCE.c(Unit.f22483a) : k.INSTANCE.a(jt.n.e(objB)));
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(p0 p0Var, nt.b<? super k<Unit>> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <E> Object a(@NotNull y<? super E> yVar, E e10) {
        Object objW = yVar.w(e10);
        if (objW instanceof k.c) {
            return ((k) ku.j.b(null, new a(yVar, e10, null), 1, null)).getHolder();
        }
        return k.INSTANCE.c(Unit.f22483a);
    }
}
