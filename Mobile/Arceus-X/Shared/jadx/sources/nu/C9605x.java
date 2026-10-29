package nu;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7693m;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import p315nt.InterfaceC9557b;
import p395qu.C10721f0;
import p615zt.InterfaceC14057n;
import p617ou.C10059i;
import p617ou.C10060j;
import pt.AbstractC10351m;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: nu.x */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000>\n\u0000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u001a)\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a9\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\u001e\u0010\u0006\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0005\"\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a]\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\t*\b\u0012\u0004\u0012\u00028\u00000\u000220\b\u0001\u0010\u000f\u001a*\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u000b\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\nH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001aQ\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\t*\b\u0012\u0004\u0012\u00028\u00000\u00022$\b\u0001\u0010\u000f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0012H\u0007¢\u0006\u0004\b\u0013\u0010\u0014\" \u0010\u001b\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\u0016\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, m31665d2 = {"T", "", "Lnu/h;", "b", "(Ljava/lang/Iterable;)Lnu/h;", "", "flows", "c", "([Lnu/h;)Lnu/h;", "R", "Lkotlin/Function3;", "Lnu/i;", "Lnt/b;", "", "", "transform", "d", "(Lnu/h;Lzt/n;)Lnu/h;", "Lkotlin/Function2;", "a", "(Lnu/h;Lkotlin/jvm/functions/Function2;)Lnu/h;", "", "I", "getDEFAULT_CONCURRENCY", "()I", "getDEFAULT_CONCURRENCY$annotations", "()V", "DEFAULT_CONCURRENCY", "kotlinx-coroutines-core"}, m31666k = 5, m31667mv = {2, 1, 0}, m31669xi = 48, m31670xs = "kotlinx/coroutines/flow/FlowKt")
public final /* synthetic */ class C9605x {

    /* JADX INFO: renamed from: a */
    public static final int f34789a = C10721f0.m40841b("kotlinx.coroutines.flow.defaultConcurrency", 16, 1, Integer.MAX_VALUE);

    /* JADX INFO: Add missing generic type declarations: [R, T] */
    /* JADX INFO: renamed from: nu.x$a */
    @Metadata(m31664d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m31665d2 = {"R", "T", "Lnu/i;", "it", "", "<anonymous>"}, m31666k = 3, m31667mv = {2, 1, 0})
    @InterfaceC10344f(m39663c = "kotlinx.coroutines.flow.FlowKt__MergeKt$mapLatest$1", m39664f = "Merge.kt", m39665l = {213, 213}, m39666m = "invokeSuspend")
    public static final class a<R, T> extends AbstractC10351m implements InterfaceC14057n<InterfaceC9577i<? super R>, T, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f34790t;

        /* JADX INFO: renamed from: u */
        public /* synthetic */ Object f34791u;

        /* JADX INFO: renamed from: v */
        public /* synthetic */ Object f34792v;

        /* JADX INFO: renamed from: w */
        public final /* synthetic */ Function2<T, InterfaceC9557b<? super R>, Object> f34793w;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function2<? super T, ? super nt.b<? super R>, ? extends java.lang.Object> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Function2<? super T, ? super InterfaceC9557b<? super R>, ? extends Object> function2, InterfaceC9557b<? super a> interfaceC9557b) {
            super(3, interfaceC9557b);
            this.f34793w = function2;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to nu.x$a<R, T> for r5v1 'this'  java.lang.Object
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // pt.AbstractC10339a
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = p344ot.C10047c.m38805e()
                int r1 = r5.f34790t
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                p229jt.C7348o.m30470b(r6)
                goto L45
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1a:
                java.lang.Object r1 = r5.f34791u
                nu.i r1 = (nu.InterfaceC9577i) r1
                p229jt.C7348o.m30470b(r6)
                goto L39
            L22:
                p229jt.C7348o.m30470b(r6)
                java.lang.Object r6 = r5.f34791u
                r1 = r6
                nu.i r1 = (nu.InterfaceC9577i) r1
                java.lang.Object r6 = r5.f34792v
                kotlin.jvm.functions.Function2<T, nt.b<? super R>, java.lang.Object> r4 = r5.f34793w
                r5.f34791u = r1
                r5.f34790t = r3
                java.lang.Object r6 = r4.invoke(r6, r5)
                if (r6 != r0) goto L39
                goto L44
            L39:
                r3 = 0
                r5.f34791u = r3
                r5.f34790t = r2
                java.lang.Object r6 = r1.emit(r6, r5)
                if (r6 != r0) goto L45
            L44:
                return r0
            L45:
                kotlin.Unit r6 = kotlin.Unit.f29331a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: nu.C9605x.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // p615zt.InterfaceC14057n
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC9577i<? super R> interfaceC9577i, T t8, InterfaceC9557b<? super Unit> interfaceC9557b) {
            a aVar = new a(this.f34793w, interfaceC9557b);
            aVar.f34791u = interfaceC9577i;
            aVar.f34792v = t8;
            return aVar.invokeSuspend(Unit.f29331a);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final <T, R> InterfaceC9575h<R> m37894a(@NotNull InterfaceC9575h<? extends T> interfaceC9575h, @NotNull Function2<? super T, ? super InterfaceC9557b<? super R>, ? extends Object> function2) {
        return C9579j.m37782S(interfaceC9575h, new a(function2, null));
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final <T> InterfaceC9575h<T> m37895b(@NotNull Iterable<? extends InterfaceC9575h<? extends T>> iterable) {
        return new C10060j(iterable, null, 0, null, 14, null);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final <T> InterfaceC9575h<T> m37896c(@NotNull InterfaceC9575h<? extends T>... interfaceC9575hArr) {
        return C9579j.m37765B(C7693m.m31832A(interfaceC9575hArr));
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public static final <T, R> InterfaceC9575h<R> m37897d(@NotNull InterfaceC9575h<? extends T> interfaceC9575h, @NotNull InterfaceC14057n<? super InterfaceC9577i<? super R>, ? super T, ? super InterfaceC9557b<? super Unit>, ? extends Object> interfaceC14057n) {
        return new C10059i(interfaceC14057n, interfaceC9575h, null, 0, null, 28, null);
    }
}
