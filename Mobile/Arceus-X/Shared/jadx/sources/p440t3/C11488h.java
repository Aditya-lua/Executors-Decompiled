package p440t3;

import androidx.core.view.inputmethod.EditorInfoCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7729c0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7348o;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import pt.AbstractC10342d;
import pt.AbstractC10351m;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: t3.h */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u0000 \u0003*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, m31665d2 = {"Lt3/h;", "T", "", "a", "datastore-core_release"}, m31666k = 1, m31667mv = {1, 8, 0}, m31669xi = 48)
public final class C11488h<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: t3.h$a, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JI\u0010\f\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\b\"\u0004\b\u0001\u0010\u00042\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00060\u0005¢\u0006\u0004\b\f\u0010\rJ8\u0010\u000f\u001a\u00020\u000b\"\u0004\b\u0001\u0010\u00042\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00060\u00052\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\tH\u0082@¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m31665d2 = {"Lt3/h$a;", "", "<init>", "()V", "T", "", "Lt3/g;", "migrations", "Lkotlin/Function2;", "Lt3/s;", "Lnt/b;", "", "b", "(Ljava/util/List;)Lkotlin/jvm/functions/Function2;", "api", "c", "(Ljava/util/List;Lt3/s;Lnt/b;)Ljava/lang/Object;", "datastore-core_release"}, m31666k = 1, m31667mv = {1, 8, 0}, m31669xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: t3.h$a$a, reason: collision with other inner class name */
        @Metadata(m31664d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m31665d2 = {"T", "Lt3/s;", "api", "", "<anonymous>", "(Lt3/s;)V"}, m31666k = 3, m31667mv = {1, 8, 0})
        @InterfaceC10344f(m39663c = "androidx.datastore.core.DataMigrationInitializer$Companion$getInitializer$1", m39664f = "DataMigrationInitializer.kt", m39665l = {33}, m39666m = "invokeSuspend")
        public static final class C14250a extends AbstractC10351m implements Function2<InterfaceC11503s<T>, InterfaceC9557b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t */
            public int f40557t;

            /* JADX INFO: renamed from: u */
            public /* synthetic */ Object f40558u;

            /* JADX INFO: renamed from: v */
            public final /* synthetic */ List<InterfaceC11486g<T>> f40559v;

            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.util.List<? extends t3.g<T>> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C14250a(List<? extends InterfaceC11486g<T>> list, InterfaceC9557b<? super C14250a> interfaceC9557b) {
                super(2, interfaceC9557b);
                this.f40559v = list;
            }

            @Override // pt.AbstractC10339a
            @NotNull
            public final InterfaceC9557b<Unit> create(@Nullable Object obj, @NotNull InterfaceC9557b<?> interfaceC9557b) {
                C14250a c14250a = new C14250a(this.f40559v, interfaceC9557b);
                c14250a.f40558u = obj;
                return c14250a;
            }

            @Override // pt.AbstractC10339a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object objM38805e = C10047c.m38805e();
                int i10 = this.f40557t;
                if (i10 == 0) {
                    C7348o.m30470b(obj);
                    InterfaceC11503s interfaceC11503s = (InterfaceC11503s) this.f40558u;
                    Companion companion = C11488h.INSTANCE;
                    List<InterfaceC11486g<T>> list = this.f40559v;
                    this.f40557t = 1;
                    if (companion.m42987c(list, interfaceC11503s, this) == objM38805e) {
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

            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            @Nullable
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@NotNull InterfaceC11503s<T> interfaceC11503s, @Nullable InterfaceC9557b<? super Unit> interfaceC9557b) {
                return ((C14250a) create(interfaceC11503s, interfaceC9557b)).invokeSuspend(Unit.f29331a);
            }
        }

        /* JADX INFO: renamed from: t3.h$a$b */
        @Metadata(m31666k = 3, m31667mv = {1, 8, 0}, m31669xi = 48)
        @InterfaceC10344f(m39663c = "androidx.datastore.core.DataMigrationInitializer$Companion", m39664f = "DataMigrationInitializer.kt", m39665l = {42, 57}, m39666m = "runMigrations")
        public static final class b<T> extends AbstractC10342d {

            /* JADX INFO: renamed from: t */
            public Object f40560t;

            /* JADX INFO: renamed from: u */
            public Object f40561u;

            /* JADX INFO: renamed from: v */
            public /* synthetic */ Object f40562v;

            /* JADX INFO: renamed from: x */
            public int f40564x;

            public b(InterfaceC9557b<? super b> interfaceC9557b) {
                super(interfaceC9557b);
            }

            @Override // pt.AbstractC10339a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f40562v = obj;
                this.f40564x |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                return Companion.this.m42987c(null, null, this);
            }
        }

        /* JADX INFO: renamed from: t3.h$a$c */
        @Metadata(m31664d1 = {"\u0000\u0004\n\u0002\b\u0003\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u0002H\u0001H\u008a@"}, m31665d2 = {"<anonymous>", "T", "startingData"}, m31666k = 3, m31667mv = {1, 8, 0}, m31669xi = 48)
        @InterfaceC10344f(m39663c = "androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2", m39664f = "DataMigrationInitializer.kt", m39665l = {44, 46}, m39666m = "invokeSuspend")
        public static final class c extends AbstractC10351m implements Function2<T, InterfaceC9557b<? super T>, Object> {

            /* JADX INFO: renamed from: t */
            public Object f40565t;

            /* JADX INFO: renamed from: u */
            public Object f40566u;

            /* JADX INFO: renamed from: v */
            public Object f40567v;

            /* JADX INFO: renamed from: w */
            public int f40568w;

            /* JADX INFO: renamed from: x */
            public /* synthetic */ Object f40569x;

            /* JADX INFO: renamed from: y */
            public final /* synthetic */ List<InterfaceC11486g<T>> f40570y;

            /* JADX INFO: renamed from: z */
            public final /* synthetic */ List<Function1<InterfaceC9557b<? super Unit>, Object>> f40571z;

            /* JADX INFO: renamed from: t3.h$a$c$a, reason: collision with other inner class name */
            @Metadata(m31664d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0002H\u008a@"}, m31665d2 = {"<anonymous>", "", "T"}, m31666k = 3, m31667mv = {1, 8, 0}, m31669xi = 48)
            @InterfaceC10344f(m39663c = "androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2$1$1", m39664f = "DataMigrationInitializer.kt", m39665l = {45}, m39666m = "invokeSuspend")
            public static final class C14251a extends AbstractC10351m implements Function1<InterfaceC9557b<? super Unit>, Object> {

                /* JADX INFO: renamed from: t */
                public int f40572t;

                /* JADX INFO: renamed from: u */
                public final /* synthetic */ InterfaceC11486g<T> f40573u;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C14251a(InterfaceC11486g<T> interfaceC11486g, InterfaceC9557b<? super C14251a> interfaceC9557b) {
                    super(1, interfaceC9557b);
                    this.f40573u = interfaceC11486g;
                }

                @Override // pt.AbstractC10339a
                @NotNull
                public final InterfaceC9557b<Unit> create(@NotNull InterfaceC9557b<?> interfaceC9557b) {
                    return new C14251a(this.f40573u, interfaceC9557b);
                }

                @Override // pt.AbstractC10339a
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    Object objM38805e = C10047c.m38805e();
                    int i10 = this.f40572t;
                    if (i10 == 0) {
                        C7348o.m30470b(obj);
                        InterfaceC11486g<T> interfaceC11486g = this.f40573u;
                        this.f40572t = 1;
                        if (interfaceC11486g.mo42980a(this) == objM38805e) {
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

                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function1
                @Nullable
                /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
                public final Object invoke(@Nullable InterfaceC9557b<? super Unit> interfaceC9557b) {
                    return ((C14251a) create(interfaceC9557b)).invokeSuspend(Unit.f29331a);
                }
            }

            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.util.List<? extends t3.g<T>> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public c(List<? extends InterfaceC11486g<T>> list, List<Function1<InterfaceC9557b<? super Unit>, Object>> list2, InterfaceC9557b<? super c> interfaceC9557b) {
                super(2, interfaceC9557b);
                this.f40570y = list;
                this.f40571z = list2;
            }

            @Override // pt.AbstractC10339a
            @NotNull
            public final InterfaceC9557b<Unit> create(@Nullable Object obj, @NotNull InterfaceC9557b<?> interfaceC9557b) {
                c cVar = new c(this.f40570y, this.f40571z, interfaceC9557b);
                cVar.f40569x = obj;
                return cVar;
            }

            /* JADX DEBUG: Duplicate block (B:22:0x008a) to fix multi-entry loop: BACK_EDGE: B:22:0x008a -> B:11:0x0046 */
            /* JADX WARN: Code duplicated, block: B:13:0x004c  */
            /* JADX WARN: Code duplicated, block: B:16:0x0063  */
            /* JADX WARN: Code duplicated, block: B:19:0x0070  */
            /* JADX WARN: Code duplicated, block: B:22:0x008a  */
            /* JADX WARN: Code duplicated, block: B:23:0x008c  */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            @Override // pt.AbstractC10339a
            @org.jetbrains.annotations.Nullable
            public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r10) {
                /*
                    r9 = this;
                    java.lang.Object r0 = p344ot.C10047c.m38805e()
                    int r1 = r9.f40568w
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L37
                    if (r1 == r3) goto L22
                    if (r1 != r2) goto L1a
                    java.lang.Object r1 = r9.f40565t
                    java.util.Iterator r1 = (java.util.Iterator) r1
                    java.lang.Object r4 = r9.f40569x
                    java.util.List r4 = (java.util.List) r4
                    p229jt.C7348o.m30470b(r10)
                    goto L46
                L1a:
                    java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r10.<init>(r0)
                    throw r10
                L22:
                    java.lang.Object r1 = r9.f40567v
                    java.lang.Object r4 = r9.f40566u
                    t3.g r4 = (p440t3.InterfaceC11486g) r4
                    java.lang.Object r5 = r9.f40565t
                    java.util.Iterator r5 = (java.util.Iterator) r5
                    java.lang.Object r6 = r9.f40569x
                    java.util.List r6 = (java.util.List) r6
                    p229jt.C7348o.m30470b(r10)
                    r8 = r6
                    r6 = r4
                    r4 = r8
                    goto L68
                L37:
                    p229jt.C7348o.m30470b(r10)
                    java.lang.Object r10 = r9.f40569x
                    java.util.List<t3.g<T>> r1 = r9.f40570y
                    java.lang.Iterable r1 = (java.lang.Iterable) r1
                    java.util.List<kotlin.jvm.functions.Function1<nt.b<? super kotlin.Unit>, java.lang.Object>> r4 = r9.f40571z
                    java.util.Iterator r1 = r1.iterator()
                L46:
                    boolean r5 = r1.hasNext()
                    if (r5 == 0) goto L8e
                    java.lang.Object r5 = r1.next()
                    t3.g r5 = (p440t3.InterfaceC11486g) r5
                    r9.f40569x = r4
                    r9.f40565t = r1
                    r9.f40566u = r5
                    r9.f40567v = r10
                    r9.f40568w = r3
                    java.lang.Object r6 = r5.mo42981b(r10, r9)
                    if (r6 != r0) goto L63
                    goto L89
                L63:
                    r8 = r1
                    r1 = r10
                    r10 = r6
                    r6 = r5
                    r5 = r8
                L68:
                    java.lang.Boolean r10 = (java.lang.Boolean) r10
                    boolean r10 = r10.booleanValue()
                    if (r10 == 0) goto L8c
                    t3.h$a$c$a r10 = new t3.h$a$c$a
                    r7 = 0
                    r10.<init>(r6, r7)
                    r4.add(r10)
                    r9.f40569x = r4
                    r9.f40565t = r5
                    r9.f40566u = r7
                    r9.f40567v = r7
                    r9.f40568w = r2
                    java.lang.Object r10 = r6.mo42982c(r1, r9)
                    if (r10 != r0) goto L8a
                L89:
                    return r0
                L8a:
                    r1 = r5
                    goto L46
                L8c:
                    r10 = r1
                    goto L8a
                L8e:
                    return r10
                */
                throw new UnsupportedOperationException("Method not decompiled: p440t3.C11488h.Companion.c.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            @Nullable
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public final Object invoke(T t8, @Nullable InterfaceC9557b<? super T> interfaceC9557b) {
                return ((c) create(t8, interfaceC9557b)).invokeSuspend(Unit.f29331a);
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: t3.h.a.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final <T> Function2<InterfaceC11503s<T>, InterfaceC9557b<? super Unit>, Object> m42986b(@NotNull List<? extends InterfaceC11486g<T>> migrations) {
            Intrinsics.checkNotNullParameter(migrations, "migrations");
            return new C14250a(migrations, null);
        }

        /* JADX WARN: Code duplicated, block: B:27:0x0071  */
        /* JADX WARN: Code duplicated, block: B:37:0x009a  */
        /* JADX WARN: Code duplicated, block: B:39:0x009d  */
        /* JADX WARN: Code duplicated, block: B:43:0x0083 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:45:? A[LOOP:0: B:25:0x006b->B:45:?, LOOP_END, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Type inference failed for: r9v3, types: [T, java.lang.Throwable] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0088 -> B:25:0x006b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x008b -> B:25:0x006b). Please report as a decompilation issue!!! */
        /* JADX INFO: renamed from: c */
        public final <T> Object m42987c(List<? extends InterfaceC11486g<T>> list, InterfaceC11503s<T> interfaceC11503s, InterfaceC9557b<? super Unit> interfaceC9557b) throws Throwable {
            b bVar;
            List list2;
            C7729c0 c7729c0;
            Iterator<T> it;
            Throwable th2;
            Function1 function1;
            if (interfaceC9557b instanceof b) {
                bVar = (b) interfaceC9557b;
                int i10 = bVar.f40564x;
                if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                    bVar.f40564x = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                } else {
                    bVar = new b(interfaceC9557b);
                }
            } else {
                bVar = new b(interfaceC9557b);
            }
            Object obj = bVar.f40562v;
            Object objM38805e = C10047c.m38805e();
            int i11 = bVar.f40564x;
            if (i11 == 0) {
                C7348o.m30470b(obj);
                ArrayList arrayList = new ArrayList();
                Function2<? super T, ? super InterfaceC9557b<? super T>, ? extends Object> cVar = new c(list, arrayList, null);
                bVar.f40560t = arrayList;
                bVar.f40564x = 1;
                if (interfaceC11503s.mo43027a(cVar, bVar) != objM38805e) {
                    list2 = arrayList;
                }
                return objM38805e;
            }
            if (i11 == 1) {
                list2 = (List) bVar.f40560t;
                C7348o.m30470b(obj);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (Iterator) bVar.f40561u;
                c7729c0 = (C7729c0) bVar.f40560t;
                try {
                    C7348o.m30470b(obj);
                } catch (Throwable 
                /*  JADX ERROR: Method code generation error
                    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getCodeVar()" because "ssaVar" is null
                    	at jadx.core.codegen.RegionGen.makeCatchBlock(RegionGen.java:372)
                    	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:335)
                    	at jadx.core.dex.regions.TryCatchRegion.generate(TryCatchRegion.java:85)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    */
                /*
                    this = this;
                    boolean r0 = r9 instanceof p440t3.C11488h.Companion.b
                    if (r0 == 0) goto L13
                    r0 = r9
                    t3.h$a$b r0 = (p440t3.C11488h.Companion.b) r0
                    int r1 = r0.f40564x
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f40564x = r1
                    goto L18
                L13:
                    t3.h$a$b r0 = new t3.h$a$b
                    r0.<init>(r9)
                L18:
                    java.lang.Object r9 = r0.f40562v
                    java.lang.Object r1 = p344ot.C10047c.m38805e()
                    int r2 = r0.f40564x
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L46
                    if (r2 == r4) goto L3e
                    if (r2 != r3) goto L36
                    java.lang.Object r7 = r0.f40561u
                    java.util.Iterator r7 = (java.util.Iterator) r7
                    java.lang.Object r8 = r0.f40560t
                    kotlin.jvm.internal.c0 r8 = (kotlin.jvm.internal.C7729c0) r8
                    p229jt.C7348o.m30470b(r9)     // Catch: java.lang.Throwable -> L34
                    goto L6b
                L34:
                    r9 = move-exception
                    goto L84
                L36:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L3e:
                    java.lang.Object r7 = r0.f40560t
                    java.util.List r7 = (java.util.List) r7
                    p229jt.C7348o.m30470b(r9)
                    goto L60
                L46:
                    p229jt.C7348o.m30470b(r9)
                    java.util.ArrayList r9 = new java.util.ArrayList
                    r9.<init>()
                    t3.h$a$c r2 = new t3.h$a$c
                    r5 = 0
                    r2.<init>(r7, r9, r5)
                    r0.f40560t = r9
                    r0.f40564x = r4
                    java.lang.Object r7 = r8.mo43027a(r2, r0)
                    if (r7 != r1) goto L5f
                    goto L83
                L5f:
                    r7 = r9
                L60:
                    kotlin.jvm.internal.c0 r8 = new kotlin.jvm.internal.c0
                    r8.<init>()
                    java.lang.Iterable r7 = (java.lang.Iterable) r7
                    java.util.Iterator r7 = r7.iterator()
                L6b:
                    boolean r9 = r7.hasNext()
                    if (r9 == 0) goto L94
                    java.lang.Object r9 = r7.next()
                    kotlin.jvm.functions.Function1 r9 = (kotlin.jvm.functions.Function1) r9
                    r0.f40560t = r8     // Catch: java.lang.Throwable -> L34
                    r0.f40561u = r7     // Catch: java.lang.Throwable -> L34
                    r0.f40564x = r3     // Catch: java.lang.Throwable -> L34
                    java.lang.Object r9 = r9.invoke(r0)     // Catch: java.lang.Throwable -> L34
                    if (r9 != r1) goto L6b
                L83:
                    return r1
                L84:
                    T r2 = r8.f29425a
                    if (r2 != 0) goto L8b
                    r8.f29425a = r9
                    goto L6b
                L8b:
                    kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
                    java.lang.Throwable r2 = (java.lang.Throwable) r2
                    p229jt.C7328a.m30429a(r2, r9)
                    goto L6b
                L94:
                    T r7 = r8.f29425a
                    java.lang.Throwable r7 = (java.lang.Throwable) r7
                    if (r7 != 0) goto L9d
                    kotlin.Unit r7 = kotlin.Unit.f29331a
                    return r7
                L9d:
                    throw r7
                */
                throw new UnsupportedOperationException("Method not decompiled: p440t3.C11488h.Companion.m42987c(java.util.List, t3.s, nt.b):java.lang.Object");
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            public Companion() {
            }
        }
    }
