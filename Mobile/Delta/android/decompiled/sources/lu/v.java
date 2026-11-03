package lu;

import iu.d2;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aS\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012.\u0010\b\u001a*\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0002¢\u0006\u0004\b\t\u0010\n\u001aY\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000124\u0010\u000e\u001a0\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000b¢\u0006\u0004\b\u000f\u0010\u0010\u001a0\u0010\u0012\u001a\u0004\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0080@¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001b\u0010\u0016\u001a\u00020\r*\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001d\u0010\u0019\u001a\u00020\r*\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"T", "Llu/h;", "Lkotlin/Function3;", "Llu/i;", "", "Llt/b;", "", "", "action", "a", "(Llu/h;Lxt/n;)Llu/h;", "Lkotlin/Function4;", "", "", "predicate", "e", "(Llu/h;Lxt/o;)Llu/h;", "collector", "b", "(Llu/h;Llu/i;Llt/b;)Ljava/lang/Object;", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "c", "(Ljava/lang/Throwable;Lkotlin/coroutines/CoroutineContext;)Z", "other", "d", "(Ljava/lang/Throwable;Ljava/lang/Throwable;)Z", "kotlinx-coroutines-core"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
public final /* synthetic */ class v {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"lu/v$a", "Llu/h;", "Llu/i;", "collector", "", "collect", "(Llu/i;Llt/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a<T> implements h<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h f24105a;
        public final /* synthetic */ xt.n b;

        /* JADX INFO: renamed from: lu.v$a$a, reason: collision with other inner class name */
        @nt.f(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1", f = "Errors.kt", l = {109, 110}, m = "collect")
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class C0428a extends nt.d {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public /* synthetic */ Object f24106t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public int f24107u;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public Object f24109w;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            public Object f24110x;

            public C0428a(lt.b bVar) {
                super(bVar);
            }

            @Override // nt.a
            public final Object invokeSuspend(Object obj) {
                this.f24106t = obj;
                this.f24107u |= Integer.MIN_VALUE;
                return a.this.collect(null, this);
            }
        }

        public a(h hVar, xt.n nVar) {
            this.f24105a = hVar;
            this.b = nVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x006c, code lost:
        
            if (r6 == r1) goto L24;
         */
        @Override // lu.h
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object collect(lu.i<? super T> r6, lt.b<? super kotlin.Unit> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof lu.v.a.C0428a
                if (r0 == 0) goto L13
                r0 = r7
                lu.v$a$a r0 = (lu.v.a.C0428a) r0
                int r1 = r0.f24107u
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f24107u = r1
                goto L18
            L13:
                lu.v$a$a r0 = new lu.v$a$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f24106t
                java.lang.Object r1 = mt.c.e()
                int r2 = r0.f24107u
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L40
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                gt.o.b(r7)
                goto L6f
            L2c:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L34:
                java.lang.Object r6 = r0.f24110x
                lu.i r6 = (lu.i) r6
                java.lang.Object r2 = r0.f24109w
                lu.v$a r2 = (lu.v.a) r2
                gt.o.b(r7)
                goto L53
            L40:
                gt.o.b(r7)
                lu.h r7 = r5.f24105a
                r0.f24109w = r5
                r0.f24110x = r6
                r0.f24107u = r4
                java.lang.Object r7 = lu.j.g(r7, r6, r0)
                if (r7 != r1) goto L52
                goto L6e
            L52:
                r2 = r5
            L53:
                java.lang.Throwable r7 = (java.lang.Throwable) r7
                if (r7 == 0) goto L6f
                xt.n r2 = r2.b
                r4 = 0
                r0.f24109w = r4
                r0.f24110x = r4
                r0.f24107u = r3
                r3 = 6
                kotlin.jvm.internal.l.c(r3)
                java.lang.Object r6 = r2.invoke(r6, r7, r0)
                r7 = 7
                kotlin.jvm.internal.l.c(r7)
                if (r6 != r1) goto L6f
            L6e:
                return r1
            L6f:
                kotlin.Unit r6 = kotlin.Unit.f22938a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: lu.v.a.collect(lu.i, lt.b):java.lang.Object");
        }
    }

    @nt.f(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt", f = "Errors.kt", l = {152}, m = "catchImpl")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class b<T> extends nt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f24111t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f24112u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f24113v;

        public b(lt.b<? super b> bVar) {
            super(bVar);
        }

        @Override // nt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f24112u = obj;
            this.f24113v |= Integer.MIN_VALUE;
            return j.g(null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class c<T> implements i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i<T> f24114a;
        public final /* synthetic */ kotlin.jvm.internal.c0<Throwable> b;

        @nt.f(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2", f = "Errors.kt", l = {154}, m = "emit")
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a extends nt.d {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public Object f24115t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public /* synthetic */ Object f24116u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ c<T> f24117v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public int f24118w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(c<? super T> cVar, lt.b<? super a> bVar) {
                super(bVar);
                this.f24117v = cVar;
            }

            @Override // nt.a
            public final Object invokeSuspend(Object obj) {
                this.f24116u = obj;
                this.f24118w |= Integer.MIN_VALUE;
                return this.f24117v.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public c(i<? super T> iVar, kotlin.jvm.internal.c0<Throwable> c0Var) {
            this.f24114a = iVar;
            this.b = c0Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // lu.i
        public final Object emit(T t8, lt.b<? super Unit> bVar) throws Throwable {
            a aVar;
            c<T> cVar;
            if (bVar instanceof a) {
                aVar = (a) bVar;
                int i10 = aVar.f24118w;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    aVar.f24118w = i10 - Integer.MIN_VALUE;
                } else {
                    aVar = new a(this, bVar);
                }
            } else {
                aVar = new a(this, bVar);
            }
            Object obj = aVar.f24116u;
            Object objE = mt.c.e();
            int i11 = aVar.f24118w;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                cVar = (c) aVar.f24115t;
                try {
                    gt.o.b(obj);
                    return Unit.f22938a;
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
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
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
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
                    	at java.base/java.util.ArrayList.forEach(Unknown Source)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
                    	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(Unknown Source)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
                    	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:320)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:297)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
                    	at java.base/java.util.ArrayList.forEach(Unknown Source)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
                    	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(Unknown Source)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:104)
                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
                    	at jadx.core.ProcessClass.process(ProcessClass.java:89)
                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:127)
                    	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
                    	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
                    */
                /*
                    this = this;
                    boolean r0 = r6 instanceof lu.v.c.a
                    if (r0 == 0) goto L13
                    r0 = r6
                    lu.v$c$a r0 = (lu.v.c.a) r0
                    int r1 = r0.f24118w
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f24118w = r1
                    goto L18
                L13:
                    lu.v$c$a r0 = new lu.v$c$a
                    r0.<init>(r4, r6)
                L18:
                    java.lang.Object r6 = r0.f24116u
                    java.lang.Object r1 = mt.c.e()
                    int r2 = r0.f24118w
                    r3 = 1
                    if (r2 == 0) goto L37
                    if (r2 != r3) goto L2f
                    java.lang.Object r5 = r0.f24115t
                    lu.v$c r5 = (lu.v.c) r5
                    gt.o.b(r6)     // Catch: java.lang.Throwable -> L2d
                    goto L47
                L2d:
                    r6 = move-exception
                    goto L4c
                L2f:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L37:
                    gt.o.b(r6)
                    lu.i<T> r6 = r4.f24114a     // Catch: java.lang.Throwable -> L4a
                    r0.f24115t = r4     // Catch: java.lang.Throwable -> L4a
                    r0.f24118w = r3     // Catch: java.lang.Throwable -> L4a
                    java.lang.Object r5 = r6.emit(r5, r0)     // Catch: java.lang.Throwable -> L4a
                    if (r5 != r1) goto L47
                    return r1
                L47:
                    kotlin.Unit r5 = kotlin.Unit.f22938a
                    return r5
                L4a:
                    r6 = move-exception
                    r5 = r4
                L4c:
                    kotlin.jvm.internal.c0<java.lang.Throwable> r5 = r5.b
                    r5.f23007a = r6
                    throw r6
                */
                throw new UnsupportedOperationException("Method not decompiled: lu.v.c.emit(java.lang.Object, lt.b):java.lang.Object");
            }
        }

        /* JADX INFO: Add missing generic type declarations: [T] */
        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"lu/v$d", "Llu/h;", "Llu/i;", "collector", "", "collect", "(Llu/i;Llt/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class d<T> implements h<T> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ h f24119a;
            public final /* synthetic */ xt.o b;

            @nt.f(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1", f = "Errors.kt", l = {113, 115}, m = "collect")
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class a extends nt.d {
                public int A;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public /* synthetic */ Object f24120t;

                /* JADX INFO: renamed from: u, reason: collision with root package name */
                public int f24121u;

                /* JADX INFO: renamed from: w, reason: collision with root package name */
                public Object f24123w;

                /* JADX INFO: renamed from: x, reason: collision with root package name */
                public Object f24124x;

                /* JADX INFO: renamed from: y, reason: collision with root package name */
                public Object f24125y;

                /* JADX INFO: renamed from: z, reason: collision with root package name */
                public long f24126z;

                public a(lt.b bVar) {
                    super(bVar);
                }

                @Override // nt.a
                public final Object invokeSuspend(Object obj) {
                    this.f24120t = obj;
                    this.f24121u |= Integer.MIN_VALUE;
                    return d.this.collect(null, this);
                }
            }

            public d(h hVar, xt.o oVar) {
                this.f24119a = hVar;
                this.b = oVar;
            }

            /* JADX WARN: Code duplicated, block: B:20:0x006f  */
            /* JADX WARN: Code duplicated, block: B:23:0x0078  */
            /* JADX WARN: Code duplicated, block: B:26:0x0097  */
            /* JADX WARN: Code duplicated, block: B:30:0x00a6 A[PHI: r2 r5 r7 r12
              0x00a6: PHI (r2v5 lu.i<? super T>) = (r2v1 lu.i<? super T>), (r2v6 lu.i<? super T>) binds: [B:22:0x0076, B:29:0x00a2] A[DONT_GENERATE, DONT_INLINE]
              0x00a6: PHI (r5v3 long) = (r5v1 long), (r5v5 long) binds: [B:22:0x0076, B:29:0x00a2] A[DONT_GENERATE, DONT_INLINE]
              0x00a6: PHI (r7v4 lu.v$d<T>) = (r7v0 lu.v$d<T>), (r7v5 lu.v$d<T>) binds: [B:22:0x0076, B:29:0x00a2] A[DONT_GENERATE, DONT_INLINE]
              0x00a6: PHI (r12v7 int) = (r12v1 int), (r12v12 int) binds: [B:22:0x0076, B:29:0x00a2] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:33:0x00ab  */
            /* JADX WARN: Code duplicated, block: B:35:0x00ae  */
            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0076 -> B:30:0x00a6). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0097 -> B:27:0x009a). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            @Override // lu.h
            public java.lang.Object collect(lu.i<? super T> r12, lt.b<? super kotlin.Unit> r13) {
                /*
                    r11 = this;
                    boolean r0 = r13 instanceof lu.v.d.a
                    if (r0 == 0) goto L13
                    r0 = r13
                    lu.v$d$a r0 = (lu.v.d.a) r0
                    int r1 = r0.f24121u
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f24121u = r1
                    goto L18
                L13:
                    lu.v$d$a r0 = new lu.v$d$a
                    r0.<init>(r13)
                L18:
                    java.lang.Object r13 = r0.f24120t
                    java.lang.Object r1 = mt.c.e()
                    int r2 = r0.f24121u
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L52
                    if (r2 == r4) goto L42
                    if (r2 != r3) goto L3a
                    long r5 = r0.f24126z
                    java.lang.Object r12 = r0.f24125y
                    java.lang.Throwable r12 = (java.lang.Throwable) r12
                    java.lang.Object r2 = r0.f24124x
                    lu.i r2 = (lu.i) r2
                    java.lang.Object r7 = r0.f24123w
                    lu.v$d r7 = (lu.v.d) r7
                    gt.o.b(r13)
                    goto L9a
                L3a:
                    java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                    java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
                    r12.<init>(r13)
                    throw r12
                L42:
                    int r12 = r0.A
                    long r5 = r0.f24126z
                    java.lang.Object r2 = r0.f24124x
                    lu.i r2 = (lu.i) r2
                    java.lang.Object r7 = r0.f24123w
                    lu.v$d r7 = (lu.v.d) r7
                    gt.o.b(r13)
                    goto L74
                L52:
                    gt.o.b(r13)
                    r5 = 0
                    r13 = r11
                L58:
                    lu.h r2 = r13.f24119a
                    r0.f24123w = r13
                    r0.f24124x = r12
                    r7 = 0
                    r0.f24125y = r7
                    r0.f24126z = r5
                    r7 = 0
                    r0.A = r7
                    r0.f24121u = r4
                    java.lang.Object r2 = lu.j.g(r2, r12, r0)
                    if (r2 != r1) goto L6f
                    goto L96
                L6f:
                    r10 = r2
                    r2 = r12
                    r12 = r7
                    r7 = r13
                    r13 = r10
                L74:
                    java.lang.Throwable r13 = (java.lang.Throwable) r13
                    if (r13 == 0) goto La6
                    xt.o r12 = r7.b
                    java.lang.Long r8 = nt.b.e(r5)
                    r0.f24123w = r7
                    r0.f24124x = r2
                    r0.f24125y = r13
                    r0.f24126z = r5
                    r0.f24121u = r3
                    r9 = 6
                    kotlin.jvm.internal.l.c(r9)
                    java.lang.Object r12 = r12.e(r2, r13, r8, r0)
                    r8 = 7
                    kotlin.jvm.internal.l.c(r8)
                    if (r12 != r1) goto L97
                L96:
                    return r1
                L97:
                    r10 = r13
                    r13 = r12
                    r12 = r10
                L9a:
                    java.lang.Boolean r13 = (java.lang.Boolean) r13
                    boolean r13 = r13.booleanValue()
                    if (r13 == 0) goto La8
                    r12 = 1
                    long r5 = r5 + r12
                    r12 = r4
                La6:
                    r13 = r7
                    goto La9
                La8:
                    throw r12
                La9:
                    if (r12 != 0) goto Lae
                    kotlin.Unit r12 = kotlin.Unit.f22938a
                    return r12
                Lae:
                    r12 = r2
                    goto L58
                */
                throw new UnsupportedOperationException("Method not decompiled: lu.v.d.collect(lu.i, lt.b):java.lang.Object");
            }
        }

        @NotNull
        public static final <T> h<T> a(@NotNull h<? extends T> hVar, @NotNull xt.n<? super i<? super T>, ? super Throwable, ? super lt.b<? super Unit>, ? extends Object> nVar) {
            return new a(hVar, nVar);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Nullable
        public static final <T> Object b(@NotNull h<? extends T> hVar, @NotNull i<? super T> iVar, @NotNull lt.b<? super Throwable> bVar) throws Throwable {
            b bVar2;
            kotlin.jvm.internal.c0 c0Var;
            if (bVar instanceof b) {
                bVar2 = (b) bVar;
                int i10 = bVar2.f24113v;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    bVar2.f24113v = i10 - Integer.MIN_VALUE;
                } else {
                    bVar2 = new b(bVar);
                }
            } else {
                bVar2 = new b(bVar);
            }
            Object obj = bVar2.f24112u;
            Object objE = mt.c.e();
            int i11 = bVar2.f24113v;
            if (i11 == 0) {
                gt.o.b(obj);
                kotlin.jvm.internal.c0 c0Var2 = new kotlin.jvm.internal.c0();
                try {
                    i<? super Object> cVar = new c<>(iVar, c0Var2);
                    bVar2.f24111t = c0Var2;
                    bVar2.f24113v = 1;
                    if (hVar.collect(cVar, bVar2) == objE) {
                        return objE;
                    }
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    c0Var = c0Var2;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c0Var = (kotlin.jvm.internal.c0) bVar2.f24111t;
                try {
                    gt.o.b(obj);
                    return null;
                } catch (Throwable th3) {
                    th = th3;
                }
            }
            Throwable th4 = (Throwable) c0Var.f23007a;
            if (d(th, th4) || c(th, bVar2.getContext())) {
                throw th;
            }
            if (th4 == null) {
                return th;
            }
            if (th instanceof CancellationException) {
                gt.a.a(th4, th);
                throw th4;
            }
            gt.a.a(th, th4);
            throw th;
        }

        public static final boolean c(Throwable th2, CoroutineContext coroutineContext) {
            d2 d2Var = (d2) coroutineContext.get(d2.INSTANCE);
            if (d2Var == null || !d2Var.isCancelled()) {
                return false;
            }
            return d(th2, d2Var.m());
        }

        public static final boolean d(Throwable th2, Throwable th3) {
            return th3 != null && Intrinsics.c(th3, th2);
        }

        @NotNull
        public static final <T> h<T> e(@NotNull h<? extends T> hVar, @NotNull xt.o<? super i<? super T>, ? super Throwable, ? super Long, ? super lt.b<? super Boolean>, ? extends Object> oVar) {
            return new d(hVar, oVar);
        }
    }
