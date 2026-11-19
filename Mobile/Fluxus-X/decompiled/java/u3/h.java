package u3;

import com.github.luben.zstd.BuildConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u0000 \u0003*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lu3/h;", "T", BuildConfig.FLAVOR, "a", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class h<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: u3.h$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JI\u0010\f\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\b\"\u0004\b\u0001\u0010\u00042\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00060\u0005¢\u0006\u0004\b\f\u0010\rJ8\u0010\u000f\u001a\u00020\u000b\"\u0004\b\u0001\u0010\u00042\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00060\u00052\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\tH\u0082@¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lu3/h$a;", BuildConfig.FLAVOR, "<init>", "()V", "T", BuildConfig.FLAVOR, "Lu3/g;", "migrations", "Lkotlin/Function2;", "Lu3/s;", "Leu/b;", BuildConfig.FLAVOR, "b", "(Ljava/util/List;)Lkotlin/jvm/functions/Function2;", "api", "c", "(Ljava/util/List;Lu3/s;Leu/b;)Ljava/lang/Object;", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: u3.h$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lu3/s;", "api", BuildConfig.FLAVOR, "<anonymous>", "(Lu3/s;)V"}, k = 3, mv = {1, 8, 0})
        @gu.f(c = "androidx.datastore.core.DataMigrationInitializer$Companion$getInitializer$1", f = "DataMigrationInitializer.kt", l = {33}, m = "invokeSuspend")
        public static final class C0660a extends gu.m implements Function2<s<T>, eu.b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f32941t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public /* synthetic */ Object f32942u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ List<g<T>> f32943v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0660a(List<? extends g<T>> list, eu.b<? super C0660a> bVar) {
                super(2, bVar);
                this.f32943v = list;
            }

            @Override // gu.a
            @NotNull
            public final eu.b<Unit> create(@Nullable Object obj, @NotNull eu.b<?> bVar) {
                C0660a c0660a = new C0660a(this.f32943v, bVar);
                c0660a.f32942u = obj;
                return c0660a;
            }

            @Override // gu.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object objE = fu.c.e();
                int i10 = this.f32941t;
                if (i10 == 0) {
                    zt.o.b(obj);
                    s sVar = (s) this.f32942u;
                    Companion companion = h.INSTANCE;
                    List<g<T>> list = this.f32943v;
                    this.f32941t = 1;
                    if (companion.c(list, sVar, this) == objE) {
                        return objE;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zt.o.b(obj);
                }
                return Unit.f21506a;
            }

            @Override // p001kotlin.jvm.functions.Function2
            @Nullable
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@NotNull s<T> sVar, @Nullable eu.b<? super Unit> bVar) {
                return ((C0660a) create(sVar, bVar)).invokeSuspend(Unit.f21506a);
            }
        }

        /* JADX INFO: renamed from: u3.h$a$b */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        @gu.f(c = "androidx.datastore.core.DataMigrationInitializer$Companion", f = "DataMigrationInitializer.kt", l = {42, 57}, m = "runMigrations")
        public static final class b<T> extends gu.d {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public Object f32944t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public Object f32945u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public /* synthetic */ Object f32946v;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            public int f32948x;

            public b(eu.b<? super b> bVar) {
                super(bVar);
            }

            @Override // gu.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f32946v = obj;
                this.f32948x |= Integer.MIN_VALUE;
                return Companion.this.c(null, null, this);
            }
        }

        /* JADX INFO: renamed from: u3.h$a$c */
        @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0003\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u0002H\u0001H\u008a@"}, d2 = {"<anonymous>", "T", "startingData"}, k = 3, mv = {1, 8, 0}, xi = 48)
        @gu.f(c = "androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2", f = "DataMigrationInitializer.kt", l = {44, 46}, m = "invokeSuspend")
        public static final class c extends gu.m implements Function2<T, eu.b<? super T>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public Object f32949t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public Object f32950u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public Object f32951v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public int f32952w;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            public /* synthetic */ Object f32953x;

            /* JADX INFO: renamed from: y, reason: collision with root package name */
            public final /* synthetic */ List<g<T>> f32954y;

            /* JADX INFO: renamed from: z, reason: collision with root package name */
            public final /* synthetic */ List<Function1<eu.b<? super Unit>, Object>> f32955z;

            /* JADX INFO: renamed from: u3.h$a$c$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0002H\u008a@"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "T"}, k = 3, mv = {1, 8, 0}, xi = 48)
            @gu.f(c = "androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2$1$1", f = "DataMigrationInitializer.kt", l = {45}, m = "invokeSuspend")
            public static final class C0661a extends gu.m implements Function1<eu.b<? super Unit>, Object> {

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public int f32956t;

                /* JADX INFO: renamed from: u, reason: collision with root package name */
                public final /* synthetic */ g<T> f32957u;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0661a(g<T> gVar, eu.b<? super C0661a> bVar) {
                    super(1, bVar);
                    this.f32957u = gVar;
                }

                @Override // gu.a
                @NotNull
                public final eu.b<Unit> create(@NotNull eu.b<?> bVar) {
                    return new C0661a(this.f32957u, bVar);
                }

                @Override // gu.a
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    Object objE = fu.c.e();
                    int i10 = this.f32956t;
                    if (i10 == 0) {
                        zt.o.b(obj);
                        g<T> gVar = this.f32957u;
                        this.f32956t = 1;
                        if (gVar.b(this) == objE) {
                            return objE;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        zt.o.b(obj);
                    }
                    return Unit.f21506a;
                }

                @Override // p001kotlin.jvm.functions.Function1
                @Nullable
                /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
                public final Object invoke(@Nullable eu.b<? super Unit> bVar) {
                    return ((C0661a) create(bVar)).invokeSuspend(Unit.f21506a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public c(List<? extends g<T>> list, List<Function1<eu.b<? super Unit>, Object>> list2, eu.b<? super c> bVar) {
                super(2, bVar);
                this.f32954y = list;
                this.f32955z = list2;
            }

            @Override // gu.a
            @NotNull
            public final eu.b<Unit> create(@Nullable Object obj, @NotNull eu.b<?> bVar) {
                c cVar = new c(this.f32954y, this.f32955z, bVar);
                cVar.f32953x = obj;
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
            @Override // gu.a
            @org.jetbrains.annotations.Nullable
            public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r10) {
                /*
                    r9 = this;
                    java.lang.Object r0 = fu.c.e()
                    int r1 = r9.f32952w
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L37
                    if (r1 == r3) goto L22
                    if (r1 != r2) goto L1a
                    java.lang.Object r1 = r9.f32949t
                    java.util.Iterator r1 = (java.util.Iterator) r1
                    java.lang.Object r4 = r9.f32953x
                    java.util.List r4 = (java.util.List) r4
                    zt.o.b(r10)
                    goto L46
                L1a:
                    java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r10.<init>(r0)
                    throw r10
                L22:
                    java.lang.Object r1 = r9.f32951v
                    java.lang.Object r4 = r9.f32950u
                    u3.g r4 = (u3.g) r4
                    java.lang.Object r5 = r9.f32949t
                    java.util.Iterator r5 = (java.util.Iterator) r5
                    java.lang.Object r6 = r9.f32953x
                    java.util.List r6 = (java.util.List) r6
                    zt.o.b(r10)
                    r8 = r6
                    r6 = r4
                    r4 = r8
                    goto L68
                L37:
                    zt.o.b(r10)
                    java.lang.Object r10 = r9.f32953x
                    java.util.List<u3.g<T>> r1 = r9.f32954y
                    java.lang.Iterable r1 = (java.lang.Iterable) r1
                    java.util.List<kotlin.jvm.functions.Function1<eu.b<? super kotlin.Unit>, java.lang.Object>> r4 = r9.f32955z
                    java.util.Iterator r1 = r1.iterator()
                L46:
                    boolean r5 = r1.hasNext()
                    if (r5 == 0) goto L8e
                    java.lang.Object r5 = r1.next()
                    u3.g r5 = (u3.g) r5
                    r9.f32953x = r4
                    r9.f32949t = r1
                    r9.f32950u = r5
                    r9.f32951v = r10
                    r9.f32952w = r3
                    java.lang.Object r6 = r5.a(r10, r9)
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
                    u3.h$a$c$a r10 = new u3.h$a$c$a
                    r7 = 0
                    r10.<init>(r6, r7)
                    r4.add(r10)
                    r9.f32953x = r4
                    r9.f32949t = r5
                    r9.f32950u = r7
                    r9.f32951v = r7
                    r9.f32952w = r2
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
                throw new UnsupportedOperationException("Method not decompiled: u3.h.Companion.c.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // p001kotlin.jvm.functions.Function2
            @Nullable
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public final Object invoke(T t8, @Nullable eu.b<? super T> bVar) {
                return ((c) create(t8, bVar)).invokeSuspend(Unit.f21506a);
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final <T> Function2<s<T>, eu.b<? super Unit>, Object> b(@NotNull List<? extends g<T>> migrations) {
            Intrinsics.checkNotNullParameter(migrations, "migrations");
            return new C0660a(migrations, null);
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
        public final <T> Object c(List<? extends g<T>> list, s<T> sVar, eu.b<? super Unit> bVar) throws Throwable {
            b bVar2;
            List list2;
            p001kotlin.jvm.internal.c0 c0Var;
            Iterator<T> it;
            Throwable th2;
            Function1 function1;
            if (bVar instanceof b) {
                bVar2 = (b) bVar;
                int i10 = bVar2.f32948x;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    bVar2.f32948x = i10 - Integer.MIN_VALUE;
                } else {
                    bVar2 = new b(bVar);
                }
            } else {
                bVar2 = new b(bVar);
            }
            Object obj = bVar2.f32946v;
            Object objE = fu.c.e();
            int i11 = bVar2.f32948x;
            if (i11 == 0) {
                zt.o.b(obj);
                ArrayList arrayList = new ArrayList();
                Function2<? super T, ? super eu.b<? super T>, ? extends Object> cVar = new c(list, arrayList, null);
                bVar2.f32944t = arrayList;
                bVar2.f32948x = 1;
                if (sVar.a(cVar, bVar2) != objE) {
                    list2 = arrayList;
                }
                return objE;
            }
            if (i11 == 1) {
                list2 = (List) bVar2.f32944t;
                zt.o.b(obj);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (Iterator) bVar2.f32945u;
                c0Var = (p001kotlin.jvm.internal.c0) bVar2.f32944t;
                try {
                    zt.o.b(obj);
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
                    boolean r0 = r9 instanceof u3.h.Companion.b
                    if (r0 == 0) goto L13
                    r0 = r9
                    u3.h$a$b r0 = (u3.h.Companion.b) r0
                    int r1 = r0.f32948x
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f32948x = r1
                    goto L18
                L13:
                    u3.h$a$b r0 = new u3.h$a$b
                    r0.<init>(r9)
                L18:
                    java.lang.Object r9 = r0.f32946v
                    java.lang.Object r1 = fu.c.e()
                    int r2 = r0.f32948x
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L46
                    if (r2 == r4) goto L3e
                    if (r2 != r3) goto L36
                    java.lang.Object r7 = r0.f32945u
                    java.util.Iterator r7 = (java.util.Iterator) r7
                    java.lang.Object r8 = r0.f32944t
                    kotlin.jvm.internal.c0 r8 = (p001kotlin.jvm.internal.c0) r8
                    zt.o.b(r9)     // Catch: java.lang.Throwable -> L34
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
                    java.lang.Object r7 = r0.f32944t
                    java.util.List r7 = (java.util.List) r7
                    zt.o.b(r9)
                    goto L60
                L46:
                    zt.o.b(r9)
                    java.util.ArrayList r9 = new java.util.ArrayList
                    r9.<init>()
                    u3.h$a$c r2 = new u3.h$a$c
                    r5 = 0
                    r2.<init>(r7, r9, r5)
                    r0.f32944t = r9
                    r0.f32948x = r4
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
                    kotlin.jvm.functions.Function1 r9 = (p001kotlin.jvm.functions.Function1) r9
                    r0.f32944t = r8     // Catch: java.lang.Throwable -> L34
                    r0.f32945u = r7     // Catch: java.lang.Throwable -> L34
                    r0.f32948x = r3     // Catch: java.lang.Throwable -> L34
                    java.lang.Object r9 = r9.invoke(r0)     // Catch: java.lang.Throwable -> L34
                    if (r9 != r1) goto L6b
                L83:
                    return r1
                L84:
                    T r2 = r8.f21575a
                    if (r2 != 0) goto L8b
                    r8.f21575a = r9
                    goto L6b
                L8b:
                    p001kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
                    java.lang.Throwable r2 = (java.lang.Throwable) r2
                    zt.a.a(r2, r9)
                    goto L6b
                L94:
                    T r7 = r8.f21575a
                    java.lang.Throwable r7 = (java.lang.Throwable) r7
                    if (r7 != 0) goto L9d
                    kotlin.Unit r7 = p001kotlin.Unit.f21506a
                    return r7
                L9d:
                    throw r7
                */
                throw new UnsupportedOperationException("Method not decompiled: u3.h.Companion.c(java.util.List, u3.s, eu.b):java.lang.Object");
            }

            public Companion() {
            }
        }
    }
