package p617ou;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import nu.InterfaceC9575h;
import nu.InterfaceC9577i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7348o;
import p256ku.InterfaceC7906p0;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p615zt.InterfaceC14057n;
import pt.AbstractC10351m;
import pt.C10346h;
import pt.InterfaceC10344f;
import ru.C11137b;

/* JADX INFO: renamed from: ou.o */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a<\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002$\b\u0001\u0010\u0005\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0001H\u0080@¢\u0006\u0004\b\u0006\u0010\u0007\u001aM\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\u000020\b\u0001\u0010\u0005\u001a*\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\bH\u0000¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m31665d2 = {"R", "Lkotlin/Function2;", "Lku/p0;", "Lnt/b;", "", "block", "a", "(Lkotlin/jvm/functions/Function2;Lnt/b;)Ljava/lang/Object;", "Lkotlin/Function3;", "Lnu/i;", "", "Lnu/h;", "b", "(Lzt/n;)Lnu/h;", "kotlinx-coroutines-core"}, m31666k = 2, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C10065o {

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: ou.o$a */
    @Metadata(m31664d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m31665d2 = {"ou/o$a", "Lnu/h;", "Lnu/i;", "collector", "", "collect", "(Lnu/i;Lnt/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class a<R> implements InterfaceC9575h<R> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC14057n f36258a;

        public a(InterfaceC14057n interfaceC14057n) {
            this.f36258a = interfaceC14057n;
        }

        @Override // nu.InterfaceC9575h
        public Object collect(InterfaceC9577i<? super R> interfaceC9577i, InterfaceC9557b<? super Unit> interfaceC9557b) {
            Object objM38832a = C10065o.m38832a(new b(this.f36258a, interfaceC9577i, null), interfaceC9557b);
            return objM38832a == C10047c.m38805e() ? objM38832a : Unit.f29331a;
        }
    }

    /* JADX INFO: renamed from: ou.o$b */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 1, 0})
    @InterfaceC10344f(m39663c = "kotlinx.coroutines.flow.internal.FlowCoroutineKt$scopedFlow$1$1", m39664f = "FlowCoroutine.kt", m39665l = {47}, m39666m = "invokeSuspend")
    public static final class b extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f36259t;

        /* JADX INFO: renamed from: u */
        public /* synthetic */ Object f36260u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ InterfaceC14057n<InterfaceC7906p0, InterfaceC9577i<? super R>, InterfaceC9557b<? super Unit>, Object> f36261v;

        /* JADX INFO: renamed from: w */
        public final /* synthetic */ InterfaceC9577i<R> f36262w;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: zt.n<? super ku.p0, ? super nu.i<? super R>, ? super nt.b<? super kotlin.Unit>, ? extends java.lang.Object> */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: nu.i<? super R> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(InterfaceC14057n<? super InterfaceC7906p0, ? super InterfaceC9577i<? super R>, ? super InterfaceC9557b<? super Unit>, ? extends Object> interfaceC14057n, InterfaceC9577i<? super R> interfaceC9577i, InterfaceC9557b<? super b> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f36261v = interfaceC14057n;
            this.f36262w = interfaceC9577i;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            b bVar = new b(this.f36261v, this.f36262w, interfaceC9557b);
            bVar.f36260u = obj;
            return bVar;
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
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f36259t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                InterfaceC7906p0 interfaceC7906p0 = (InterfaceC7906p0) this.f36260u;
                InterfaceC14057n<InterfaceC7906p0, InterfaceC9577i<? super R>, InterfaceC9557b<? super Unit>, Object> interfaceC14057n = this.f36261v;
                Object obj2 = this.f36262w;
                this.f36259t = 1;
                if (interfaceC14057n.invoke(interfaceC7906p0, obj2, this) == objM38805e) {
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
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((b) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public static final <R> Object m38832a(@NotNull Function2<? super InterfaceC7906p0, ? super InterfaceC9557b<? super R>, ? extends Object> function2, @NotNull InterfaceC9557b<? super R> interfaceC9557b) {
        C10064n c10064n = new C10064n(interfaceC9557b.getContext(), interfaceC9557b);
        Object objM41914d = C11137b.m41914d(c10064n, c10064n, function2);
        if (objM41914d == C10047c.m38805e()) {
            C10346h.m39673c(interfaceC9557b);
        }
        return objM41914d;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final <R> InterfaceC9575h<R> m38833b(@NotNull InterfaceC14057n<? super InterfaceC7906p0, ? super InterfaceC9577i<? super R>, ? super InterfaceC9557b<? super Unit>, ? extends Object> interfaceC14057n) {
        return new a(interfaceC14057n);
    }
}
