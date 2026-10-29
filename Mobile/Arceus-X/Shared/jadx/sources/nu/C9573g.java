package nu;

import androidx.core.view.inputmethod.EditorInfoCompat;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7729c0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7348o;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p617ou.C10070t;
import pt.AbstractC10342d;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: nu.g */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002BI\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u001c\u0010\t\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\u000f\u001a\u00020\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\"\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R*\u0010\t\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m31665d2 = {"Lnu/g;", "T", "Lnu/h;", "upstream", "Lkotlin/Function1;", "", "keySelector", "Lkotlin/Function2;", "", "areEquivalent", "<init>", "(Lnu/h;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V", "Lnu/i;", "collector", "", "collect", "(Lnu/i;Lnt/b;)Ljava/lang/Object;", "a", "Lnu/h;", "b", "Lkotlin/jvm/functions/Function1;", "c", "Lkotlin/jvm/functions/Function2;", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C9573g<T> implements InterfaceC9575h<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC9575h<T> upstream;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Function1<T, Object> keySelector;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Function2<Object, Object, Boolean> areEquivalent;

    /* JADX INFO: renamed from: nu.g$a */
    @Metadata(m31666k = 3, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class a<T> implements InterfaceC9577i {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C9573g<T> f34575a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C7729c0<Object> f34576b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ InterfaceC9577i<T> f34577c;

        /* JADX INFO: renamed from: nu.g$a$a, reason: collision with other inner class name */
        @InterfaceC10344f(m39663c = "kotlinx.coroutines.flow.DistinctFlowImpl$collect$2", m39664f = "Distinct.kt", m39665l = {73}, m39666m = "emit")
        @Metadata(m31666k = 3, m31667mv = {2, 1, 0}, m31669xi = 48)
        public static final class C14206a extends AbstractC10342d {

            /* JADX INFO: renamed from: t */
            public /* synthetic */ Object f34578t;

            /* JADX INFO: renamed from: u */
            public final /* synthetic */ a<T> f34579u;

            /* JADX INFO: renamed from: v */
            public int f34580v;

            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: nu.g$a<? super T> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C14206a(a<? super T> aVar, InterfaceC9557b<? super C14206a> interfaceC9557b) {
                super(interfaceC9557b);
                this.f34579u = aVar;
            }

            @Override // pt.AbstractC10339a
            public final Object invokeSuspend(Object obj) {
                this.f34578t = obj;
                this.f34580v |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                return this.f34579u.emit(null, this);
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: nu.i<? super T> */
        /* JADX WARN: Multi-variable type inference failed */
        public a(C9573g<T> c9573g, C7729c0<Object> c7729c0, InterfaceC9577i<? super T> interfaceC9577i) {
            this.f34575a = c9573g;
            this.f34576b = c7729c0;
            this.f34577c = interfaceC9577i;
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
        @Override // nu.InterfaceC9577i
        public final Object emit(T t8, InterfaceC9557b<? super Unit> interfaceC9557b) {
            C14206a c14206a;
            if (interfaceC9557b instanceof C14206a) {
                c14206a = (C14206a) interfaceC9557b;
                int i10 = c14206a.f34580v;
                if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                    c14206a.f34580v = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                } else {
                    c14206a = new C14206a(this, interfaceC9557b);
                }
            } else {
                c14206a = new C14206a(this, interfaceC9557b);
            }
            Object obj = c14206a.f34578t;
            Object objM38805e = C10047c.m38805e();
            int i11 = c14206a.f34580v;
            if (i11 == 0) {
                C7348o.m30470b(obj);
                T t10 = (T) this.f34575a.keySelector.invoke(t8);
                Object obj2 = this.f34576b.f29425a;
                if (obj2 != C10070t.f36266a && this.f34575a.areEquivalent.invoke(obj2, t10).booleanValue()) {
                    return Unit.f29331a;
                }
                this.f34576b.f29425a = t10;
                InterfaceC9577i<T> interfaceC9577i = this.f34577c;
                c14206a.f34580v = 1;
                if (interfaceC9577i.emit(t8, c14206a) == objM38805e) {
                    return objM38805e;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
            }
            return Unit.f29331a;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: nu.h<? extends T> */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super T, ? extends java.lang.Object> */
    /* JADX WARN: Multi-variable type inference failed */
    public C9573g(@NotNull InterfaceC9575h<? extends T> interfaceC9575h, @NotNull Function1<? super T, ? extends Object> function1, @NotNull Function2<Object, Object, Boolean> function2) {
        this.upstream = interfaceC9575h;
        this.keySelector = function1;
        this.areEquivalent = function2;
    }

    @Override // nu.InterfaceC9575h
    @Nullable
    public Object collect(@NotNull InterfaceC9577i<? super T> interfaceC9577i, @NotNull InterfaceC9557b<? super Unit> interfaceC9557b) {
        C7729c0 c7729c0 = new C7729c0();
        c7729c0.f29425a = (T) C10070t.f36266a;
        Object objCollect = this.upstream.collect(new a(this, c7729c0, interfaceC9577i), interfaceC9557b);
        return objCollect == C10047c.m38805e() ? objCollect : Unit.f29331a;
    }
}
