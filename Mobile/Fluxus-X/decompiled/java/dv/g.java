package dv;

import com.github.luben.zstd.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002BI\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u001c\u0010\t\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\u000f\u001a\u00020\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\"\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R*\u0010\t\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Ldv/g;", "T", "Ldv/h;", "upstream", "Lkotlin/Function1;", BuildConfig.FLAVOR, "keySelector", "Lkotlin/Function2;", BuildConfig.FLAVOR, "areEquivalent", "<init>", "(Ldv/h;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V", "Ldv/i;", "collector", BuildConfig.FLAVOR, "collect", "(Ldv/i;Leu/b;)Ljava/lang/Object;", "a", "Ldv/h;", "b", "Lkotlin/jvm/functions/Function1;", "c", "Lkotlin/jvm/functions/Function2;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
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
        public final /* synthetic */ g<T> f12743a;
        public final /* synthetic */ p001kotlin.jvm.internal.c0<Object> b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ i<T> f12744c;

        /* JADX INFO: renamed from: dv.g$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @gu.f(c = "kotlinx.coroutines.flow.DistinctFlowImpl$collect$2", f = "Distinct.kt", l = {73}, m = "emit")
        public static final class C0240a extends gu.d {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public /* synthetic */ Object f12745t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ a<T> f12746u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public int f12747v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0240a(a<? super T> aVar, eu.b<? super C0240a> bVar) {
                super(bVar);
                this.f12746u = aVar;
            }

            @Override // gu.a
            public final Object invokeSuspend(Object obj) {
                this.f12745t = obj;
                this.f12747v |= Integer.MIN_VALUE;
                return this.f12746u.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(g<T> gVar, p001kotlin.jvm.internal.c0<Object> c0Var, i<? super T> iVar) {
            this.f12743a = gVar;
            this.b = c0Var;
            this.f12744c = iVar;
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
        @Override // dv.i
        public final Object emit(T t8, eu.b<? super Unit> bVar) {
            C0240a c0240a;
            if (bVar instanceof C0240a) {
                c0240a = (C0240a) bVar;
                int i10 = c0240a.f12747v;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    c0240a.f12747v = i10 - Integer.MIN_VALUE;
                } else {
                    c0240a = new C0240a(this, bVar);
                }
            } else {
                c0240a = new C0240a(this, bVar);
            }
            Object obj = c0240a.f12745t;
            Object objE = fu.c.e();
            int i11 = c0240a.f12747v;
            if (i11 == 0) {
                zt.o.b(obj);
                T t10 = (T) this.f12743a.keySelector.invoke(t8);
                Object obj2 = this.b.f21575a;
                if (obj2 != kotlin.t.f14752a && this.f12743a.areEquivalent.invoke(obj2, t10).booleanValue()) {
                    return Unit.f21506a;
                }
                this.b.f21575a = t10;
                i<T> iVar = this.f12744c;
                c0240a.f12747v = 1;
                if (iVar.emit(t8, c0240a) == objE) {
                    return objE;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zt.o.b(obj);
            }
            return Unit.f21506a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g(@NotNull h<? extends T> hVar, @NotNull Function1<? super T, ? extends Object> function1, @NotNull Function2<Object, Object, Boolean> function2) {
        this.upstream = hVar;
        this.keySelector = function1;
        this.areEquivalent = function2;
    }

    @Override // dv.h
    @Nullable
    public Object collect(@NotNull i<? super T> iVar, @NotNull eu.b<? super Unit> bVar) {
        p001kotlin.jvm.internal.c0 c0Var = new p001kotlin.jvm.internal.c0();
        c0Var.f21575a = (T) kotlin.t.f14752a;
        Object objCollect = this.upstream.collect(new a(this, c0Var, iVar), bVar);
        return objCollect == fu.c.e() ? objCollect : Unit.f21506a;
    }
}
