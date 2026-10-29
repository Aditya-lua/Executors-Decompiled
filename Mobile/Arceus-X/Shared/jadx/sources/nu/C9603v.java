package nu;

import androidx.core.view.inputmethod.EditorInfoCompat;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C7729c0;
import kotlin.jvm.internal.C7745l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7328a;
import p229jt.C7348o;
import p256ku.InterfaceC7850d2;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p615zt.InterfaceC14057n;
import p615zt.InterfaceC14058o;
import pt.AbstractC10342d;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: nu.v */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aS\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012.\u0010\b\u001a*\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0002¢\u0006\u0004\b\t\u0010\n\u001aY\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000124\u0010\u000e\u001a0\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000b¢\u0006\u0004\b\u000f\u0010\u0010\u001a0\u0010\u0012\u001a\u0004\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0080@¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001b\u0010\u0016\u001a\u00020\r*\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001d\u0010\u0019\u001a\u00020\r*\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m31665d2 = {"T", "Lnu/h;", "Lkotlin/Function3;", "Lnu/i;", "", "Lnt/b;", "", "", "action", "a", "(Lnu/h;Lzt/n;)Lnu/h;", "Lkotlin/Function4;", "", "", "predicate", "e", "(Lnu/h;Lzt/o;)Lnu/h;", "collector", "b", "(Lnu/h;Lnu/i;Lnt/b;)Ljava/lang/Object;", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "c", "(Ljava/lang/Throwable;Lkotlin/coroutines/CoroutineContext;)Z", "other", "d", "(Ljava/lang/Throwable;Ljava/lang/Throwable;)Z", "kotlinx-coroutines-core"}, m31666k = 5, m31667mv = {2, 1, 0}, m31669xi = 48, m31670xs = "kotlinx/coroutines/flow/FlowKt")
public final /* synthetic */ class C9603v {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: nu.v$a */
    @Metadata(m31664d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m31665d2 = {"nu/v$a", "Lnu/h;", "Lnu/i;", "collector", "", "collect", "(Lnu/i;Lnt/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class a<T> implements InterfaceC9575h<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC9575h f34706a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC14057n f34707b;

        /* JADX INFO: renamed from: nu.v$a$a, reason: collision with other inner class name */
        @InterfaceC10344f(m39663c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1", m39664f = "Errors.kt", m39665l = {109, 110}, m39666m = "collect")
        @Metadata(m31666k = 3, m31667mv = {2, 1, 0}, m31669xi = 48)
        public static final class C14213a extends AbstractC10342d {

            /* JADX INFO: renamed from: t */
            public /* synthetic */ Object f34708t;

            /* JADX INFO: renamed from: u */
            public int f34709u;

            /* JADX INFO: renamed from: w */
            public Object f34711w;

            /* JADX INFO: renamed from: x */
            public Object f34712x;

            public C14213a(InterfaceC9557b interfaceC9557b) {
                super(interfaceC9557b);
            }

            @Override // pt.AbstractC10339a
            public final Object invokeSuspend(Object obj) {
                this.f34708t = obj;
                this.f34709u |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                return a.this.collect(null, this);
            }
        }

        public a(InterfaceC9575h interfaceC9575h, InterfaceC14057n interfaceC14057n) {
            this.f34706a = interfaceC9575h;
            this.f34707b = interfaceC14057n;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x006c, code lost:
        
            if (r6 == r1) goto L24;
         */
        @Override // nu.InterfaceC9575h
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object collect(InterfaceC9577i<? super T> interfaceC9577i, InterfaceC9557b<? super Unit> interfaceC9557b) {
            C14213a c14213a;
            a<T> aVar;
            if (interfaceC9557b instanceof C14213a) {
                c14213a = (C14213a) interfaceC9557b;
                int i10 = c14213a.f34709u;
                if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                    c14213a.f34709u = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                } else {
                    c14213a = new C14213a(interfaceC9557b);
                }
            } else {
                c14213a = new C14213a(interfaceC9557b);
            }
            Object objM37790g = c14213a.f34708t;
            Object objM38805e = C10047c.m38805e();
            int i11 = c14213a.f34709u;
            if (i11 != 0) {
                if (i11 == 1) {
                    interfaceC9577i = (InterfaceC9577i) c14213a.f34712x;
                    aVar = (a) c14213a.f34711w;
                    C7348o.m30470b(objM37790g);
                } else {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7348o.m30470b(objM37790g);
                }
                return Unit.f29331a;
            }
            C7348o.m30470b(objM37790g);
            InterfaceC9575h interfaceC9575h = this.f34706a;
            c14213a.f34711w = this;
            c14213a.f34712x = interfaceC9577i;
            c14213a.f34709u = 1;
            objM37790g = C9579j.m37790g(interfaceC9575h, interfaceC9577i, c14213a);
            if (objM37790g != objM38805e) {
                aVar = this;
            }
            return objM38805e;
            Throwable th2 = (Throwable) objM37790g;
            if (th2 != null) {
                InterfaceC14057n interfaceC14057n = aVar.f34707b;
                c14213a.f34711w = null;
                c14213a.f34712x = null;
                c14213a.f34709u = 2;
                C7745l.m32061c(6);
                Object objInvoke = interfaceC14057n.invoke(interfaceC9577i, th2, c14213a);
                C7745l.m32061c(7);
            }
            return Unit.f29331a;
        }
    }

    /* JADX INFO: renamed from: nu.v$b */
    @Metadata(m31666k = 3, m31667mv = {2, 1, 0}, m31669xi = 48)
    @InterfaceC10344f(m39663c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt", m39664f = "Errors.kt", m39665l = {152}, m39666m = "catchImpl")
    public static final class b<T> extends AbstractC10342d {

        /* JADX INFO: renamed from: t */
        public Object f34713t;

        /* JADX INFO: renamed from: u */
        public /* synthetic */ Object f34714u;

        /* JADX INFO: renamed from: v */
        public int f34715v;

        public b(InterfaceC9557b<? super b> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f34714u = obj;
            this.f34715v |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return C9579j.m37790g(null, null, this);
        }
    }

    /* JADX INFO: renamed from: nu.v$c */
    @Metadata(m31666k = 3, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class c<T> implements InterfaceC9577i {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC9577i<T> f34716a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C7729c0<Throwable> f34717b;

        /* JADX INFO: renamed from: nu.v$c$a */
        @InterfaceC10344f(m39663c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2", m39664f = "Errors.kt", m39665l = {154}, m39666m = "emit")
        @Metadata(m31666k = 3, m31667mv = {2, 1, 0}, m31669xi = 48)
        public static final class a extends AbstractC10342d {

            /* JADX INFO: renamed from: t */
            public Object f34718t;

            /* JADX INFO: renamed from: u */
            public /* synthetic */ Object f34719u;

            /* JADX INFO: renamed from: v */
            public final /* synthetic */ c<T> f34720v;

            /* JADX INFO: renamed from: w */
            public int f34721w;

            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: nu.v$c<? super T> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(c<? super T> cVar, InterfaceC9557b<? super a> interfaceC9557b) {
                super(interfaceC9557b);
                this.f34720v = cVar;
            }

            @Override // pt.AbstractC10339a
            public final Object invokeSuspend(Object obj) {
                this.f34719u = obj;
                this.f34721w |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                return this.f34720v.emit(null, this);
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: nu.i<? super T> */
        /* JADX WARN: Multi-variable type inference failed */
        public c(InterfaceC9577i<? super T> interfaceC9577i, C7729c0<Throwable> c7729c0) {
            this.f34716a = interfaceC9577i;
            this.f34717b = c7729c0;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // nu.InterfaceC9577i
        public final Object emit(T t8, InterfaceC9557b<? super Unit> interfaceC9557b) throws Throwable {
            a aVar;
            c<T> cVar;
            if (interfaceC9557b instanceof a) {
                aVar = (a) interfaceC9557b;
                int i10 = aVar.f34721w;
                if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                    aVar.f34721w = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                } else {
                    aVar = new a(this, interfaceC9557b);
                }
            } else {
                aVar = new a(this, interfaceC9557b);
            }
            Object obj = aVar.f34719u;
            Object objM38805e = C10047c.m38805e();
            int i11 = aVar.f34721w;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                cVar = (c) aVar.f34718t;
                try {
                    C7348o.m30470b(obj);
                    return Unit.f29331a;
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
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    */
                /*
                    this = this;
                    boolean r0 = r6 instanceof nu.C9603v.c.a
                    if (r0 == 0) goto L13
                    r0 = r6
                    nu.v$c$a r0 = (nu.C9603v.c.a) r0
                    int r1 = r0.f34721w
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f34721w = r1
                    goto L18
                L13:
                    nu.v$c$a r0 = new nu.v$c$a
                    r0.<init>(r4, r6)
                L18:
                    java.lang.Object r6 = r0.f34719u
                    java.lang.Object r1 = p344ot.C10047c.m38805e()
                    int r2 = r0.f34721w
                    r3 = 1
                    if (r2 == 0) goto L37
                    if (r2 != r3) goto L2f
                    java.lang.Object r5 = r0.f34718t
                    nu.v$c r5 = (nu.C9603v.c) r5
                    p229jt.C7348o.m30470b(r6)     // Catch: java.lang.Throwable -> L2d
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
                    p229jt.C7348o.m30470b(r6)
                    nu.i<T> r6 = r4.f34716a     // Catch: java.lang.Throwable -> L4a
                    r0.f34718t = r4     // Catch: java.lang.Throwable -> L4a
                    r0.f34721w = r3     // Catch: java.lang.Throwable -> L4a
                    java.lang.Object r5 = r6.emit(r5, r0)     // Catch: java.lang.Throwable -> L4a
                    if (r5 != r1) goto L47
                    return r1
                L47:
                    kotlin.Unit r5 = kotlin.Unit.f29331a
                    return r5
                L4a:
                    r6 = move-exception
                    r5 = r4
                L4c:
                    kotlin.jvm.internal.c0<java.lang.Throwable> r5 = r5.f34717b
                    r5.f29425a = r6
                    throw r6
                */
                throw new UnsupportedOperationException("Method not decompiled: nu.C9603v.c.emit(java.lang.Object, nt.b):java.lang.Object");
            }
        }

        /* JADX INFO: Add missing generic type declarations: [T] */
        /* JADX INFO: renamed from: nu.v$d */
        @Metadata(m31664d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m31665d2 = {"nu/v$d", "Lnu/h;", "Lnu/i;", "collector", "", "collect", "(Lnu/i;Lnt/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
        public static final class d<T> implements InterfaceC9575h<T> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ InterfaceC9575h f34722a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ InterfaceC14058o f34723b;

            /* JADX INFO: renamed from: nu.v$d$a */
            @InterfaceC10344f(m39663c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1", m39664f = "Errors.kt", m39665l = {113, 115}, m39666m = "collect")
            @Metadata(m31666k = 3, m31667mv = {2, 1, 0}, m31669xi = 48)
            public static final class a extends AbstractC10342d {

                /* JADX INFO: renamed from: A */
                public int f34724A;

                /* JADX INFO: renamed from: t */
                public /* synthetic */ Object f34725t;

                /* JADX INFO: renamed from: u */
                public int f34726u;

                /* JADX INFO: renamed from: w */
                public Object f34728w;

                /* JADX INFO: renamed from: x */
                public Object f34729x;

                /* JADX INFO: renamed from: y */
                public Object f34730y;

                /* JADX INFO: renamed from: z */
                public long f34731z;

                public a(InterfaceC9557b interfaceC9557b) {
                    super(interfaceC9557b);
                }

                @Override // pt.AbstractC10339a
                public final Object invokeSuspend(Object obj) {
                    this.f34725t = obj;
                    this.f34726u |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                    return d.this.collect(null, this);
                }
            }

            public d(InterfaceC9575h interfaceC9575h, InterfaceC14058o interfaceC14058o) {
                this.f34722a = interfaceC9575h;
                this.f34723b = interfaceC14058o;
            }

            /* JADX WARN: Code duplicated, block: B:20:0x006f  */
            /* JADX WARN: Code duplicated, block: B:23:0x0078  */
            /* JADX WARN: Code duplicated, block: B:26:0x0097  */
            /* JADX WARN: Code duplicated, block: B:30:0x00a6 A[PHI: r2 r5 r7 r12
              0x00a6: PHI (r2v5 nu.i<? super T>) = (r2v1 nu.i<? super T>), (r2v6 nu.i<? super T>) binds: [B:22:0x0076, B:29:0x00a2] A[DONT_GENERATE, DONT_INLINE]
              0x00a6: PHI (r5v3 long) = (r5v1 long), (r5v5 long) binds: [B:22:0x0076, B:29:0x00a2] A[DONT_GENERATE, DONT_INLINE]
              0x00a6: PHI (r7v4 nu.v$d<T>) = (r7v0 nu.v$d<T>), (r7v5 nu.v$d<T>) binds: [B:22:0x0076, B:29:0x00a2] A[DONT_GENERATE, DONT_INLINE]
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
            @Override // nu.InterfaceC9575h
            public java.lang.Object collect(nu.InterfaceC9577i<? super T> r12, p315nt.InterfaceC9557b<? super kotlin.Unit> r13) {
                /*
                    r11 = this;
                    boolean r0 = r13 instanceof nu.C9603v.d.a
                    if (r0 == 0) goto L13
                    r0 = r13
                    nu.v$d$a r0 = (nu.C9603v.d.a) r0
                    int r1 = r0.f34726u
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f34726u = r1
                    goto L18
                L13:
                    nu.v$d$a r0 = new nu.v$d$a
                    r0.<init>(r13)
                L18:
                    java.lang.Object r13 = r0.f34725t
                    java.lang.Object r1 = p344ot.C10047c.m38805e()
                    int r2 = r0.f34726u
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L52
                    if (r2 == r4) goto L42
                    if (r2 != r3) goto L3a
                    long r5 = r0.f34731z
                    java.lang.Object r12 = r0.f34730y
                    java.lang.Throwable r12 = (java.lang.Throwable) r12
                    java.lang.Object r2 = r0.f34729x
                    nu.i r2 = (nu.InterfaceC9577i) r2
                    java.lang.Object r7 = r0.f34728w
                    nu.v$d r7 = (nu.C9603v.d) r7
                    p229jt.C7348o.m30470b(r13)
                    goto L9a
                L3a:
                    java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                    java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
                    r12.<init>(r13)
                    throw r12
                L42:
                    int r12 = r0.f34724A
                    long r5 = r0.f34731z
                    java.lang.Object r2 = r0.f34729x
                    nu.i r2 = (nu.InterfaceC9577i) r2
                    java.lang.Object r7 = r0.f34728w
                    nu.v$d r7 = (nu.C9603v.d) r7
                    p229jt.C7348o.m30470b(r13)
                    goto L74
                L52:
                    p229jt.C7348o.m30470b(r13)
                    r5 = 0
                    r13 = r11
                L58:
                    nu.h r2 = r13.f34722a
                    r0.f34728w = r13
                    r0.f34729x = r12
                    r7 = 0
                    r0.f34730y = r7
                    r0.f34731z = r5
                    r7 = 0
                    r0.f34724A = r7
                    r0.f34726u = r4
                    java.lang.Object r2 = nu.C9579j.m37790g(r2, r12, r0)
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
                    zt.o r12 = r7.f34723b
                    java.lang.Long r8 = pt.C10340b.m39662e(r5)
                    r0.f34728w = r7
                    r0.f34729x = r2
                    r0.f34730y = r13
                    r0.f34731z = r5
                    r0.f34726u = r3
                    r9 = 6
                    kotlin.jvm.internal.C7745l.m32061c(r9)
                    java.lang.Object r12 = r12.mo1397e(r2, r13, r8, r0)
                    r8 = 7
                    kotlin.jvm.internal.C7745l.m32061c(r8)
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
                    kotlin.Unit r12 = kotlin.Unit.f29331a
                    return r12
                Lae:
                    r12 = r2
                    goto L58
                */
                throw new UnsupportedOperationException("Method not decompiled: nu.C9603v.d.collect(nu.i, nt.b):java.lang.Object");
            }
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public static final <T> InterfaceC9575h<T> m37881a(@NotNull InterfaceC9575h<? extends T> interfaceC9575h, @NotNull InterfaceC14057n<? super InterfaceC9577i<? super T>, ? super Throwable, ? super InterfaceC9557b<? super Unit>, ? extends Object> interfaceC14057n) {
            return new a(interfaceC9575h, interfaceC14057n);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Nullable
        /* JADX INFO: renamed from: b */
        public static final <T> Object m37882b(@NotNull InterfaceC9575h<? extends T> interfaceC9575h, @NotNull InterfaceC9577i<? super T> interfaceC9577i, @NotNull InterfaceC9557b<? super Throwable> interfaceC9557b) throws Throwable {
            b bVar;
            C7729c0 c7729c0;
            if (interfaceC9557b instanceof b) {
                bVar = (b) interfaceC9557b;
                int i10 = bVar.f34715v;
                if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                    bVar.f34715v = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                } else {
                    bVar = new b(interfaceC9557b);
                }
            } else {
                bVar = new b(interfaceC9557b);
            }
            Object obj = bVar.f34714u;
            Object objM38805e = C10047c.m38805e();
            int i11 = bVar.f34715v;
            if (i11 == 0) {
                C7348o.m30470b(obj);
                C7729c0 c7729c1 = new C7729c0();
                try {
                    InterfaceC9577i<? super Object> cVar = new c<>(interfaceC9577i, c7729c1);
                    bVar.f34713t = c7729c1;
                    bVar.f34715v = 1;
                    if (interfaceC9575h.collect(cVar, bVar) == objM38805e) {
                        return objM38805e;
                    }
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    c7729c0 = c7729c1;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c7729c0 = (C7729c0) bVar.f34713t;
                try {
                    C7348o.m30470b(obj);
                    return null;
                } catch (Throwable th3) {
                    th = th3;
                }
            }
            Throwable th4 = (Throwable) c7729c0.f29425a;
            if (m37884d(th, th4) || m37883c(th, bVar.getContext())) {
                throw th;
            }
            if (th4 == null) {
                return th;
            }
            if (th instanceof CancellationException) {
                C7328a.m30429a(th4, th);
                throw th4;
            }
            C7328a.m30429a(th, th4);
            throw th;
        }

        /* JADX INFO: renamed from: c */
        public static final boolean m37883c(Throwable th2, CoroutineContext coroutineContext) {
            InterfaceC7850d2 interfaceC7850d2 = (InterfaceC7850d2) coroutineContext.get(InterfaceC7850d2.INSTANCE);
            if (interfaceC7850d2 == null || !interfaceC7850d2.isCancelled()) {
                return false;
            }
            return m37884d(th2, interfaceC7850d2.mo32600m());
        }

        /* JADX INFO: renamed from: d */
        public static final boolean m37884d(Throwable th2, Throwable th3) {
            return th3 != null && Intrinsics.m31980c(th3, th2);
        }

        @NotNull
        /* JADX INFO: renamed from: e */
        public static final <T> InterfaceC9575h<T> m37885e(@NotNull InterfaceC9575h<? extends T> interfaceC9575h, @NotNull InterfaceC14058o<? super InterfaceC9577i<? super T>, ? super Throwable, ? super Long, ? super InterfaceC9557b<? super Boolean>, ? extends Object> interfaceC14058o) {
            return new d(interfaceC9575h, interfaceC14058o);
        }
    }
