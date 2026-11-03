package lu;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002BI\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u001c\u0010\t\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\u000f\u001a\u00020\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\"\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R*\u0010\t\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Llu/g;", "T", "Llu/h;", "upstream", "Lkotlin/Function1;", "", "keySelector", "Lkotlin/Function2;", "", "areEquivalent", "<init>", "(Llu/h;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V", "Llu/i;", "collector", "", "collect", "(Llu/i;Llt/b;)Ljava/lang/Object;", "a", "Llu/h;", "b", "Lkotlin/jvm/functions/Function1;", "c", "Lkotlin/jvm/functions/Function2;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g<T> implements h<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final h<T> upstream;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Function1<T, Object> keySelector;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Function2<Object, Object, Boolean> areEquivalent;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a<T> implements i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g<T> f23986a;
        public final /* synthetic */ kotlin.jvm.internal.c0<Object> b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ i<T> f23987c;

        /* JADX INFO: renamed from: lu.g$a$a, reason: collision with other inner class name */
        @nt.f(c = "kotlinx.coroutines.flow.DistinctFlowImpl$collect$2", f = "Distinct.kt", l = {73}, m = "emit")
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class C0421a extends nt.d {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public /* synthetic */ Object f23988t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ a<T> f23989u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public int f23990v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0421a(a<? super T> aVar, lt.b<? super C0421a> bVar) {
                super(bVar);
                this.f23989u = aVar;
            }

            @Override // nt.a
            public final Object invokeSuspend(Object obj) {
                this.f23988t = obj;
                this.f23990v |= Integer.MIN_VALUE;
                return this.f23989u.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(g<T> gVar, kotlin.jvm.internal.c0<Object> c0Var, i<? super T> iVar) {
            this.f23986a = gVar;
            this.b = c0Var;
            this.f23987c = iVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
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
        @Override // lu.i
        public final Object emit(T t8, lt.b<? super Unit> bVar) {
            C0421a c0421a;
            if (bVar instanceof C0421a) {
                c0421a = (C0421a) bVar;
                int i10 = c0421a.f23990v;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    c0421a.f23990v = i10 - Integer.MIN_VALUE;
                } else {
                    c0421a = new C0421a(this, bVar);
                }
            } else {
                c0421a = new C0421a(this, bVar);
            }
            Object obj = c0421a.f23988t;
            Object objE = mt.c.e();
            int i11 = c0421a.f23990v;
            if (i11 == 0) {
                gt.o.b(obj);
                T t10 = (T) this.f23986a.keySelector.invoke(t8);
                Object obj2 = this.b.f23007a;
                if (obj2 != p001mu.t.f25389a && this.f23986a.areEquivalent.invoke(obj2, t10).booleanValue()) {
                    return Unit.f22938a;
                }
                this.b.f23007a = t10;
                i<T> iVar = this.f23987c;
                c0421a.f23990v = 1;
                if (iVar.emit(t8, c0421a) == objE) {
                    return objE;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
            }
            return Unit.f22938a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g(@NotNull h<? extends T> hVar, @NotNull Function1<? super T, ? extends Object> function1, @NotNull Function2<Object, Object, Boolean> function2) {
        this.upstream = hVar;
        this.keySelector = function1;
        this.areEquivalent = function2;
    }

    @Override // lu.h
    @Nullable
    public Object collect(@NotNull i<? super T> iVar, @NotNull lt.b<? super Unit> bVar) {
        kotlin.jvm.internal.c0 c0Var = new kotlin.jvm.internal.c0();
        c0Var.f23007a = (T) p001mu.t.f25389a;
        Object objCollect = this.upstream.collect(new a(this, c0Var, iVar), bVar);
        return objCollect == mt.c.e() ? objCollect : Unit.f22938a;
    }
}
