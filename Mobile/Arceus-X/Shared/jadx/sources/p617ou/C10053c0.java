package p617ou;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import nu.InterfaceC9577i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p395qu.C10733l0;
import pt.AbstractC10351m;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: ou.c0 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R0\u0010\u0016\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m31665d2 = {"Lou/c0;", "T", "Lnu/i;", "downstream", "Lkotlin/coroutines/CoroutineContext;", "emitContext", "<init>", "(Lnu/i;Lkotlin/coroutines/CoroutineContext;)V", "value", "", "emit", "(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;", "a", "Lkotlin/coroutines/CoroutineContext;", "", "b", "Ljava/lang/Object;", "countOrElement", "Lkotlin/Function2;", "Lnt/b;", "c", "Lkotlin/jvm/functions/Function2;", "emitRef", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C10053c0<T> implements InterfaceC9577i<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final CoroutineContext emitContext;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Object countOrElement;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Function2<T, InterfaceC9557b<? super Unit>, Object> emitRef;

    /* JADX INFO: renamed from: ou.c0$a */
    @Metadata(m31664d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\n"}, m31665d2 = {"<anonymous>", "", "T", "it"}, m31666k = 3, m31667mv = {2, 1, 0}, m31669xi = 48)
    @InterfaceC10344f(m39663c = "kotlinx.coroutines.flow.internal.UndispatchedContextCollector$emitRef$1", m39664f = "ChannelFlow.kt", m39665l = {208}, m39666m = "invokeSuspend")
    public static final class a extends AbstractC10351m implements Function2<T, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f36196t;

        /* JADX INFO: renamed from: u */
        public /* synthetic */ Object f36197u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ InterfaceC9577i<T> f36198v;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: nu.i<? super T> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(InterfaceC9577i<? super T> interfaceC9577i, InterfaceC9557b<? super a> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f36198v = interfaceC9577i;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            a aVar = new a(this.f36198v, interfaceC9557b);
            aVar.f36197u = obj;
            return aVar;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type nt.b to ou.c0$a for r3v1 'this'  nt.b
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // pt.AbstractC10339a
        public final java.lang.Object invokeSuspend(java.lang.Object r4) {
            /*
                r3 = this;
                java.lang.Object r0 = p344ot.C10047c.m38805e()
                int r1 = r3.f36196t
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                p229jt.C7348o.m30470b(r4)
                goto L27
            Lf:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r0)
                throw r4
            L17:
                p229jt.C7348o.m30470b(r4)
                java.lang.Object r4 = r3.f36197u
                nu.i<T> r1 = r3.f36198v
                r3.f36196t = r2
                java.lang.Object r4 = r1.emit(r4, r3)
                if (r4 != r0) goto L27
                return r0
            L27:
                kotlin.Unit r4 = kotlin.Unit.f29331a
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: p617ou.C10053c0.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(T t8, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((a) create(t8, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    public C10053c0(@NotNull InterfaceC9577i<? super T> interfaceC9577i, @NotNull CoroutineContext coroutineContext) {
        this.emitContext = coroutineContext;
        this.countOrElement = C10733l0.m40887g(coroutineContext);
        this.emitRef = new a(interfaceC9577i, null);
    }

    @Override // nu.InterfaceC9577i
    @Nullable
    public Object emit(T t8, @NotNull InterfaceC9557b<? super Unit> interfaceC9557b) {
        Object objM38822c = C10056f.m38822c(this.emitContext, t8, this.countOrElement, this.emitRef, interfaceC9557b);
        return objM38822c == C10047c.m38805e() ? objM38822c : Unit.f29331a;
    }
}
