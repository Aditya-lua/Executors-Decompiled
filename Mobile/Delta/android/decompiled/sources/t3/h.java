package t3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u0000 \u0003*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lt3/h;", "T", "", "a", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class h<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: t3.h$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JI\u0010\f\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\b\"\u0004\b\u0001\u0010\u00042\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00060\u0005¢\u0006\u0004\b\f\u0010\rJ8\u0010\u000f\u001a\u00020\u000b\"\u0004\b\u0001\u0010\u00042\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00060\u00052\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\tH\u0082@¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lt3/h$a;", "", "<init>", "()V", "T", "", "Lt3/g;", "migrations", "Lkotlin/Function2;", "Lt3/s;", "Lnt/b;", "", "b", "(Ljava/util/List;)Lkotlin/jvm/functions/Function2;", "api", "c", "(Ljava/util/List;Lt3/s;Lnt/b;)Ljava/lang/Object;", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: t3.h$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lt3/s;", "api", "", "<anonymous>", "(Lt3/s;)V"}, k = 3, mv = {1, 8, 0})
        @pt.f(c = "androidx.datastore.core.DataMigrationInitializer$Companion$getInitializer$1", f = "DataMigrationInitializer.kt", l = {33}, m = "invokeSuspend")
        public static final class C0555a extends pt.m implements Function2<s<T>, nt.b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f31375t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public /* synthetic */ Object f31376u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ List<g<T>> f31377v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0555a(List<? extends g<T>> list, nt.b<? super C0555a> bVar) {
                super(2, bVar);
                this.f31377v = list;
            }

            @Override // pt.a
            @NotNull
            public final nt.b<Unit> create(@Nullable Object obj, @NotNull nt.b<?> bVar) {
                C0555a c0555a = new C0555a(this.f31377v, bVar);
                c0555a.f31376u = obj;
                return c0555a;
            }

            @Override // pt.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object objE = ot.c.e();
                int i10 = this.f31375t;
                if (i10 == 0) {
                    jt.o.b(obj);
                    s sVar = (s) this.f31376u;
                    Companion companion = h.INSTANCE;
                    List<g<T>> list = this.f31377v;
                    this.f31375t = 1;
                    if (companion.c(list, sVar, this) == objE) {
                        return objE;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jt.o.b(obj);
                }
                return Unit.f22483a;
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@NotNull s<T> sVar, @Nullable nt.b<? super Unit> bVar) {
                return ((C0555a) create(sVar, bVar)).invokeSuspend(Unit.f22483a);
            }
        }

        /* JADX INFO: renamed from: t3.h$a$b */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        @pt.f(c = "androidx.datastore.core.DataMigrationInitializer$Companion", f = "DataMigrationInitializer.kt", l = {42, 57}, m = "runMigrations")
        public static final class b<T> extends pt.d {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public Object f31378t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public Object f31379u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public /* synthetic */ Object f31380v;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            public int f31382x;

            public b(nt.b<? super b> bVar) {
                super(bVar);
            }

            @Override // pt.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f31380v = obj;
                this.f31382x |= Integer.MIN_VALUE;
                return Companion.this.c(null, null, this);
            }
        }

        /* JADX INFO: renamed from: t3.h$a$c */
        @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0003\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u0002H\u0001H\u008a@"}, d2 = {"<anonymous>", "T", "startingData"}, k = 3, mv = {1, 8, 0}, xi = 48)
        @pt.f(c = "androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2", f = "DataMigrationInitializer.kt", l = {44, 46}, m = "invokeSuspend")
        public static final class c extends pt.m implements Function2<T, nt.b<? super T>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public Object f31383t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public Object f31384u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public Object f31385v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public int f31386w;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            public /* synthetic */ Object f31387x;

            /* JADX INFO: renamed from: y, reason: collision with root package name */
            public final /* synthetic */ List<g<T>> f31388y;

            /* JADX INFO: renamed from: z, reason: collision with root package name */
            public final /* synthetic */ List<Function1<nt.b<? super Unit>, Object>> f31389z;

            /* JADX INFO: renamed from: t3.h$a$c$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0002H\u008a@"}, d2 = {"<anonymous>", "", "T"}, k = 3, mv = {1, 8, 0}, xi = 48)
            @pt.f(c = "androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2$1$1", f = "DataMigrationInitializer.kt", l = {45}, m = "invokeSuspend")
            public static final class C0556a extends pt.m implements Function1<nt.b<? super Unit>, Object> {

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public int f31390t;

                /* JADX INFO: renamed from: u, reason: collision with root package name */
                public final /* synthetic */ g<T> f31391u;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0556a(g<T> gVar, nt.b<? super C0556a> bVar) {
                    super(1, bVar);
                    this.f31391u = gVar;
                }

                @Override // pt.a
                @NotNull
                public final nt.b<Unit> create(@NotNull nt.b<?> bVar) {
                    return new C0556a(this.f31391u, bVar);
                }

                @Override // pt.a
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    Object objE = ot.c.e();
                    int i10 = this.f31390t;
                    if (i10 == 0) {
                        jt.o.b(obj);
                        g<T> gVar = this.f31391u;
                        this.f31390t = 1;
                        if (gVar.a(this) == objE) {
                            return objE;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        jt.o.b(obj);
                    }
                    return Unit.f22483a;
                }

                @Override // kotlin.jvm.functions.Function1
                @Nullable
                /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
                public final Object invoke(@Nullable nt.b<? super Unit> bVar) {
                    return ((C0556a) create(bVar)).invokeSuspend(Unit.f22483a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public c(List<? extends g<T>> list, List<Function1<nt.b<? super Unit>, Object>> list2, nt.b<? super c> bVar) {
                super(2, bVar);
                this.f31388y = list;
                this.f31389z = list2;
            }

            @Override // pt.a
            @NotNull
            public final nt.b<Unit> create(@Nullable Object obj, @NotNull nt.b<?> bVar) {
                c cVar = new c(this.f31388y, this.f31389z, bVar);
                cVar.f31387x = obj;
                return cVar;
            }

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
            @Override // pt.a
            @org.jetbrains.annotations.Nullable
            public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r10) {
                /*
                    r9 = this;
                    java.lang.Object r0 = ot.c.e()
                    int r1 = r9.f31386w
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L37
                    if (r1 == r3) goto L22
                    if (r1 != r2) goto L1a
                    java.lang.Object r1 = r9.f31383t
                    java.util.Iterator r1 = (java.util.Iterator) r1
                    java.lang.Object r4 = r9.f31387x
                    java.util.List r4 = (java.util.List) r4
                    jt.o.b(r10)
                    goto L46
                L1a:
                    java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r10.<init>(r0)
                    throw r10
                L22:
                    java.lang.Object r1 = r9.f31385v
                    java.lang.Object r4 = r9.f31384u
                    t3.g r4 = (t3.g) r4
                    java.lang.Object r5 = r9.f31383t
                    java.util.Iterator r5 = (java.util.Iterator) r5
                    java.lang.Object r6 = r9.f31387x
                    java.util.List r6 = (java.util.List) r6
                    jt.o.b(r10)
                    r8 = r6
                    r6 = r4
                    r4 = r8
                    goto L68
                L37:
                    jt.o.b(r10)
                    java.lang.Object r10 = r9.f31387x
                    java.util.List<t3.g<T>> r1 = r9.f31388y
                    java.lang.Iterable r1 = (java.lang.Iterable) r1
                    java.util.List<kotlin.jvm.functions.Function1<nt.b<? super kotlin.Unit>, java.lang.Object>> r4 = r9.f31389z
                    java.util.Iterator r1 = r1.iterator()
                L46:
                    boolean r5 = r1.hasNext()
                    if (r5 == 0) goto L8e
                    java.lang.Object r5 = r1.next()
                    t3.g r5 = (t3.g) r5
                    r9.f31387x = r4
                    r9.f31383t = r1
                    r9.f31384u = r5
                    r9.f31385v = r10
                    r9.f31386w = r3
                    java.lang.Object r6 = r5.b(r10, r9)
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
                    r9.f31387x = r4
                    r9.f31383t = r5
                    r9.f31384u = r7
                    r9.f31385v = r7
                    r9.f31386w = r2
                    java.lang.Object r10 = r6.c(r1, r9)
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
                throw new UnsupportedOperationException("Method not decompiled: t3.h.Companion.c.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public final Object invoke(T t8, @Nullable nt.b<? super T> bVar) {
                return ((c) create(t8, bVar)).invokeSuspend(Unit.f22483a);
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final <T> Function2<s<T>, nt.b<? super Unit>, Object> b(@NotNull List<? extends g<T>> migrations) {
            Intrinsics.checkNotNullParameter(migrations, "migrations");
            return new C0555a(migrations, null);
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
        public final <T> Object c(List<? extends g<T>> list, s<T> sVar, nt.b<? super Unit> bVar) throws Throwable {
            b bVar2;
            List list2;
            kotlin.jvm.internal.c0 c0Var;
            Iterator<T> it;
            Throwable th2;
            Function1 function1;
            if (bVar instanceof b) {
                bVar2 = (b) bVar;
                int i10 = bVar2.f31382x;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    bVar2.f31382x = i10 - Integer.MIN_VALUE;
                } else {
                    bVar2 = new b(bVar);
                }
            } else {
                bVar2 = new b(bVar);
            }
            Object obj = bVar2.f31380v;
            Object objE = ot.c.e();
            int i11 = bVar2.f31382x;
            if (i11 == 0) {
                jt.o.b(obj);
                ArrayList arrayList = new ArrayList();
                Function2<? super T, ? super nt.b<? super T>, ? extends Object> cVar = new c(list, arrayList, null);
                bVar2.f31378t = arrayList;
                bVar2.f31382x = 1;
                if (sVar.a(cVar, bVar2) != objE) {
                    list2 = arrayList;
                }
                return objE;
            }
            if (i11 == 1) {
                list2 = (List) bVar2.f31378t;
                jt.o.b(obj);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (Iterator) bVar2.f31379u;
                c0Var = (kotlin.jvm.internal.c0) bVar2.f31378t;
                try {
                    jt.o.b(obj);
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
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                    */
                /*
                    this = this;
                    boolean r0 = r9 instanceof t3.h.Companion.b
                    if (r0 == 0) goto L13
                    r0 = r9
                    t3.h$a$b r0 = (t3.h.Companion.b) r0
                    int r1 = r0.f31382x
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f31382x = r1
                    goto L18
                L13:
                    t3.h$a$b r0 = new t3.h$a$b
                    r0.<init>(r9)
                L18:
                    java.lang.Object r9 = r0.f31380v
                    java.lang.Object r1 = ot.c.e()
                    int r2 = r0.f31382x
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L46
                    if (r2 == r4) goto L3e
                    if (r2 != r3) goto L36
                    java.lang.Object r7 = r0.f31379u
                    java.util.Iterator r7 = (java.util.Iterator) r7
                    java.lang.Object r8 = r0.f31378t
                    kotlin.jvm.internal.c0 r8 = (kotlin.jvm.internal.c0) r8
                    jt.o.b(r9)     // Catch: java.lang.Throwable -> L34
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
                    java.lang.Object r7 = r0.f31378t
                    java.util.List r7 = (java.util.List) r7
                    jt.o.b(r9)
                    goto L60
                L46:
                    jt.o.b(r9)
                    java.util.ArrayList r9 = new java.util.ArrayList
                    r9.<init>()
                    t3.h$a$c r2 = new t3.h$a$c
                    r5 = 0
                    r2.<init>(r7, r9, r5)
                    r0.f31378t = r9
                    r0.f31382x = r4
                    java.lang.Object r7 = r8.a(r2, r0)
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
                    r0.f31378t = r8     // Catch: java.lang.Throwable -> L34
                    r0.f31379u = r7     // Catch: java.lang.Throwable -> L34
                    r0.f31382x = r3     // Catch: java.lang.Throwable -> L34
                    java.lang.Object r9 = r9.invoke(r0)     // Catch: java.lang.Throwable -> L34
                    if (r9 != r1) goto L6b
                L83:
                    return r1
                L84:
                    T r2 = r8.f22552a
                    if (r2 != 0) goto L8b
                    r8.f22552a = r9
                    goto L6b
                L8b:
                    kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
                    java.lang.Throwable r2 = (java.lang.Throwable) r2
                    jt.a.a(r2, r9)
                    goto L6b
                L94:
                    T r7 = r8.f22552a
                    java.lang.Throwable r7 = (java.lang.Throwable) r7
                    if (r7 != 0) goto L9d
                    kotlin.Unit r7 = kotlin.Unit.f22483a
                    return r7
                L9d:
                    throw r7
                */
                throw new UnsupportedOperationException("Method not decompiled: t3.h.Companion.c(java.util.List, t3.s, nt.b):java.lang.Object");
            }

            public Companion() {
            }
        }
    }
