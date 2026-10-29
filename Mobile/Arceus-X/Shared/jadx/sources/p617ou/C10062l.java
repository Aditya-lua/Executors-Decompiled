package p617ou;

import androidx.core.view.inputmethod.EditorInfoCompat;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import mu.InterfaceC8672g;
import mu.InterfaceC8690y;
import nu.InterfaceC9575h;
import nu.InterfaceC9577i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7348o;
import p256ku.InterfaceC7906p0;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p615zt.InterfaceC14057n;
import pt.AbstractC10342d;
import pt.AbstractC10351m;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: ou.l */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u00004\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u008a\u0001\u0010\r\u001a\u00020\n\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0014\u0010\u0005\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\u00032\u0016\u0010\u0007\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00018\u0001\u0018\u00010\u00030\u000624\u0010\f\u001a0\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\bH\u0081@¢\u0006\u0004\b\r\u0010\u000e*\u001c\b\u0002\u0010\u0010\"\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u000f2\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u000f¨\u0006\u0011"}, m31665d2 = {"R", "T", "Lnu/i;", "", "Lnu/h;", "flows", "Lkotlin/Function0;", "arrayFactory", "Lkotlin/Function3;", "Lnt/b;", "", "", "transform", "a", "(Lnu/i;[Lnu/h;Lkotlin/jvm/functions/Function0;Lzt/n;Lnt/b;)Ljava/lang/Object;", "Lkotlin/collections/IndexedValue;", "Update", "kotlinx-coroutines-core"}, m31666k = 2, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C10062l {

    /* JADX INFO: renamed from: ou.l$a */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 1, 0})
    @InterfaceC10344f(m39663c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2", m39664f = "Combine.kt", m39665l = {51, 73, 76}, m39666m = "invokeSuspend")
    public static final class a extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: A */
        public final /* synthetic */ Function0<T[]> f36236A;

        /* JADX INFO: renamed from: B */
        public final /* synthetic */ InterfaceC14057n<InterfaceC9577i<? super R>, T[], InterfaceC9557b<? super Unit>, Object> f36237B;

        /* JADX INFO: renamed from: C */
        public final /* synthetic */ InterfaceC9577i<R> f36238C;

        /* JADX INFO: renamed from: t */
        public Object f36239t;

        /* JADX INFO: renamed from: u */
        public Object f36240u;

        /* JADX INFO: renamed from: v */
        public int f36241v;

        /* JADX INFO: renamed from: w */
        public int f36242w;

        /* JADX INFO: renamed from: x */
        public int f36243x;

        /* JADX INFO: renamed from: y */
        public /* synthetic */ Object f36244y;

        /* JADX INFO: renamed from: z */
        public final /* synthetic */ InterfaceC9575h<T>[] f36245z;

        /* JADX INFO: renamed from: ou.l$a$a, reason: collision with other inner class name */
        @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 1, 0})
        @InterfaceC10344f(m39663c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1", m39664f = "Combine.kt", m39665l = {28}, m39666m = "invokeSuspend")
        public static final class C14226a extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t */
            public int f36246t;

            /* JADX INFO: renamed from: u */
            public final /* synthetic */ InterfaceC9575h<T>[] f36247u;

            /* JADX INFO: renamed from: v */
            public final /* synthetic */ int f36248v;

            /* JADX INFO: renamed from: w */
            public final /* synthetic */ AtomicInteger f36249w;

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ InterfaceC8672g<IndexedValue<Object>> f36250x;

            /* JADX INFO: renamed from: ou.l$a$a$a, reason: collision with other inner class name */
            @Metadata(m31666k = 3, m31667mv = {2, 1, 0}, m31669xi = 48)
            public static final class C14227a<T> implements InterfaceC9577i {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ InterfaceC8672g<IndexedValue<Object>> f36251a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ int f36252b;

                /* JADX INFO: renamed from: ou.l$a$a$a$a, reason: collision with other inner class name */
                @InterfaceC10344f(m39663c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1", m39664f = "Combine.kt", m39665l = {29, 30}, m39666m = "emit")
                @Metadata(m31666k = 3, m31667mv = {2, 1, 0}, m31669xi = 48)
                public static final class C14228a extends AbstractC10342d {

                    /* JADX INFO: renamed from: t */
                    public /* synthetic */ Object f36253t;

                    /* JADX INFO: renamed from: u */
                    public final /* synthetic */ C14227a<T> f36254u;

                    /* JADX INFO: renamed from: v */
                    public int f36255v;

                    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: ou.l$a$a$a<? super T> */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public C14228a(C14227a<? super T> c14227a, InterfaceC9557b<? super C14228a> interfaceC9557b) {
                        super(interfaceC9557b);
                        this.f36254u = c14227a;
                    }

                    @Override // pt.AbstractC10339a
                    public final Object invokeSuspend(Object obj) {
                        this.f36253t = obj;
                        this.f36255v |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                        return this.f36254u.emit(null, this);
                    }
                }

                public C14227a(InterfaceC8672g<IndexedValue<Object>> interfaceC8672g, int i10) {
                    this.f36251a = interfaceC8672g;
                    this.f36252b = i10;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
                
                    if (p256ku.C7896m3.m32808a(r0) == r1) goto L21;
                 */
                @Override // nu.InterfaceC9577i
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(T t8, InterfaceC9557b<? super Unit> interfaceC9557b) {
                    C14228a c14228a;
                    if (interfaceC9557b instanceof C14228a) {
                        c14228a = (C14228a) interfaceC9557b;
                        int i10 = c14228a.f36255v;
                        if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                            c14228a.f36255v = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                        } else {
                            c14228a = new C14228a(this, interfaceC9557b);
                        }
                    } else {
                        c14228a = new C14228a(this, interfaceC9557b);
                    }
                    Object obj = c14228a.f36253t;
                    Object objM38805e = C10047c.m38805e();
                    int i11 = c14228a.f36255v;
                    if (i11 != 0) {
                        if (i11 == 1) {
                            C7348o.m30470b(obj);
                        } else {
                            if (i11 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            C7348o.m30470b(obj);
                        }
                        return Unit.f29331a;
                    }
                    C7348o.m30470b(obj);
                    InterfaceC8672g<IndexedValue<Object>> interfaceC8672g = this.f36251a;
                    IndexedValue<Object> indexedValue = new IndexedValue<>(this.f36252b, t8);
                    c14228a.f36255v = 1;
                    if (interfaceC8672g.mo34848i(indexedValue, c14228a) != objM38805e) {
                    }
                    return objM38805e;
                    c14228a.f36255v = 2;
                }
            }

            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: nu.h<? extends T>[] */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C14226a(InterfaceC9575h<? extends T>[] interfaceC9575hArr, int i10, AtomicInteger atomicInteger, InterfaceC8672g<IndexedValue<Object>> interfaceC8672g, InterfaceC9557b<? super C14226a> interfaceC9557b) {
                super(2, interfaceC9557b);
                this.f36247u = interfaceC9575hArr;
                this.f36248v = i10;
                this.f36249w = atomicInteger;
                this.f36250x = interfaceC8672g;
            }

            @Override // pt.AbstractC10339a
            public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
                return new C14226a(this.f36247u, this.f36248v, this.f36249w, this.f36250x, interfaceC9557b);
            }

            @Override // pt.AbstractC10339a
            public final Object invokeSuspend(Object obj) {
                Object objM38805e = C10047c.m38805e();
                int i10 = this.f36246t;
                try {
                    if (i10 == 0) {
                        C7348o.m30470b(obj);
                        InterfaceC9575h[] interfaceC9575hArr = this.f36247u;
                        int i11 = this.f36248v;
                        InterfaceC9575h interfaceC9575h = interfaceC9575hArr[i11];
                        C14227a c14227a = new C14227a(this.f36250x, i11);
                        this.f36246t = 1;
                        if (interfaceC9575h.collect(c14227a, this) == objM38805e) {
                            return objM38805e;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C7348o.m30470b(obj);
                    }
                    if (this.f36249w.decrementAndGet() == 0) {
                        InterfaceC8690y.a.m34972a(this.f36250x, null, 1, null);
                    }
                    return Unit.f29331a;
                } catch (Throwable th2) {
                    if (this.f36249w.decrementAndGet() == 0) {
                        InterfaceC8690y.a.m34972a(this.f36250x, null, 1, null);
                    }
                    throw th2;
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
                return ((C14226a) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: nu.h<? extends T>[] */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: zt.n<? super nu.i<? super R>, ? super T[], ? super nt.b<? super kotlin.Unit>, ? extends java.lang.Object> */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: nu.i<? super R> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(InterfaceC9575h<? extends T>[] interfaceC9575hArr, Function0<T[]> function0, InterfaceC14057n<? super InterfaceC9577i<? super R>, ? super T[], ? super InterfaceC9557b<? super Unit>, ? extends Object> interfaceC14057n, InterfaceC9577i<? super R> interfaceC9577i, InterfaceC9557b<? super a> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f36245z = interfaceC9575hArr;
            this.f36236A = function0;
            this.f36237B = interfaceC14057n;
            this.f36238C = interfaceC9577i;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            a aVar = new a(this.f36245z, this.f36236A, this.f36237B, this.f36238C, interfaceC9557b);
            aVar.f36244y = obj;
            return aVar;
        }

        /* JADX DEBUG: Duplicate block (B:35:0x00e6) to fix multi-entry loop: BACK_EDGE: B:35:0x00e6 -> B:44:0x0129 */
        /* JADX WARN: Code duplicated, block: B:30:0x00d1  */
        /* JADX WARN: Code duplicated, block: B:33:0x00d7  */
        /* JADX WARN: Code duplicated, block: B:35:0x00e6 A[EDGE_INSN: B:35:0x00e6->B:44:0x0129 BREAK  A[LOOP:0: B:28:0x00c1->B:47:?]] */
        /* JADX WARN: Code duplicated, block: B:36:0x00e8  */
        /* JADX WARN: Code duplicated, block: B:38:0x00f2  */
        /* JADX WARN: Code duplicated, block: B:41:0x0109  */
        /* JADX WARN: Code duplicated, block: B:46:0x00e6 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:47:? A[LOOP:0: B:28:0x00c1->B:47:?, LOOP_END, SYNTHETIC] */
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
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0106 -> B:44:0x0129). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x0126 -> B:44:0x0129). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:41:0x0109
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // pt.AbstractC10339a
        public final java.lang.Object invokeSuspend(java.lang.Object r22) {
            /*
                r21 = this;
                r0 = r21
                java.lang.Object r1 = p344ot.C10047c.m38805e()
                int r2 = r0.f36243x
                r3 = 3
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L4e
                if (r2 == r5) goto L31
                if (r2 == r4) goto L1c
                if (r2 != r3) goto L14
                goto L1c
            L14:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L1c:
                int r2 = r0.f36242w
                int r6 = r0.f36241v
                java.lang.Object r7 = r0.f36240u
                byte[] r7 = (byte[]) r7
                java.lang.Object r8 = r0.f36239t
                mu.g r8 = (mu.InterfaceC8672g) r8
                java.lang.Object r9 = r0.f36244y
                java.lang.Object[] r9 = (java.lang.Object[]) r9
                p229jt.C7348o.m30470b(r22)
                goto L129
            L31:
                int r2 = r0.f36242w
                int r6 = r0.f36241v
                java.lang.Object r7 = r0.f36240u
                byte[] r7 = (byte[]) r7
                java.lang.Object r8 = r0.f36239t
                mu.g r8 = (mu.InterfaceC8672g) r8
                java.lang.Object r9 = r0.f36244y
                java.lang.Object[] r9 = (java.lang.Object[]) r9
                p229jt.C7348o.m30470b(r22)
                r10 = r22
                mu.k r10 = (mu.C8676k) r10
                java.lang.Object r10 = r10.getHolder()
                goto Lb6
            L4e:
                p229jt.C7348o.m30470b(r22)
                java.lang.Object r2 = r0.f36244y
                r6 = r2
                ku.p0 r6 = (p256ku.InterfaceC7906p0) r6
                nu.h<T>[] r2 = r0.f36245z
                int r2 = r2.length
                if (r2 != 0) goto L5e
                kotlin.Unit r1 = kotlin.Unit.f29331a
                return r1
            L5e:
                java.lang.Object[] r7 = new java.lang.Object[r2]
                qu.e0 r8 = p617ou.C10070t.f36267b
                r11 = 6
                r12 = 0
                r9 = 0
                r10 = 0
                kotlin.collections.C7691l.m31825t(r7, r8, r9, r10, r11, r12)
                r12 = r7
                r7 = 6
                r8 = 0
                mu.g r17 = mu.C8675j.m34927b(r2, r8, r8, r7, r8)
                java.util.concurrent.atomic.AtomicInteger r7 = new java.util.concurrent.atomic.AtomicInteger
                r7.<init>(r2)
                r19 = 0
                r15 = r19
            L79:
                if (r15 >= r2) goto L93
                ou.l$a$a r9 = new ou.l$a$a
                nu.h<T>[] r14 = r0.f36245z
                r18 = 0
                r16 = r7
                r13 = r9
                r13.<init>(r14, r15, r16, r17, r18)
                r10 = 3
                r11 = 0
                r7 = 0
                r8 = 0
                p256ku.C7872i.m32681d(r6, r7, r8, r9, r10, r11)
                int r15 = r15 + 1
                r7 = r16
                goto L79
            L93:
                byte[] r6 = new byte[r2]
                r7 = r12
                r8 = r17
            L98:
                int r9 = r19 + 1
                byte r9 = (byte) r9
                r0.f36244y = r7
                r0.f36239t = r8
                r0.f36240u = r6
                r0.f36241v = r2
                r0.f36242w = r9
                r0.f36243x = r5
                java.lang.Object r10 = r8.mo34800E(r0)
                if (r10 != r1) goto Laf
                goto L128
            Laf:
                r20 = r6
                r6 = r2
                r2 = r9
                r9 = r7
                r7 = r20
            Lb6:
                java.lang.Object r10 = mu.C8676k.m34933f(r10)
                kotlin.collections.IndexedValue r10 = (kotlin.collections.IndexedValue) r10
                if (r10 != 0) goto Lc1
                kotlin.Unit r1 = kotlin.Unit.f29331a
                return r1
            Lc1:
                int r11 = r10.m31731c()
                r12 = r9[r11]
                java.lang.Object r10 = r10.m31732d()
                r9[r11] = r10
                qu.e0 r10 = p617ou.C10070t.f36267b
                if (r12 != r10) goto Ld3
                int r6 = r6 + (-1)
            Ld3:
                r10 = r7[r11]
                if (r10 == r2) goto Le6
                byte r10 = (byte) r2
                r7[r11] = r10
                java.lang.Object r10 = r8.mo34796C()
                java.lang.Object r10 = mu.C8676k.m34933f(r10)
                kotlin.collections.IndexedValue r10 = (kotlin.collections.IndexedValue) r10
                if (r10 != 0) goto Lc1
            Le6:
                if (r6 != 0) goto L129
                kotlin.jvm.functions.Function0<T[]> r10 = r0.f36236A
                java.lang.Object r10 = r10.invoke()
                java.lang.Object[] r10 = (java.lang.Object[]) r10
                if (r10 != 0) goto L109
                zt.n<nu.i<? super R>, T[], nt.b<? super kotlin.Unit>, java.lang.Object> r10 = r0.f36237B
                nu.i<R> r11 = r0.f36238C
                r0.f36244y = r9
                r0.f36239t = r8
                r0.f36240u = r7
                r0.f36241v = r6
                r0.f36242w = r2
                r0.f36243x = r4
                java.lang.Object r10 = r10.invoke(r11, r9, r0)
                if (r10 != r1) goto L129
                goto L128
            L109:
                r14 = 14
                r15 = 0
                r11 = 0
                r12 = 0
                r13 = 0
                kotlin.collections.C7691l.m31817l(r9, r10, r11, r12, r13, r14, r15)
                zt.n<nu.i<? super R>, T[], nt.b<? super kotlin.Unit>, java.lang.Object> r11 = r0.f36237B
                nu.i<R> r12 = r0.f36238C
                r0.f36244y = r9
                r0.f36239t = r8
                r0.f36240u = r7
                r0.f36241v = r6
                r0.f36242w = r2
                r0.f36243x = r3
                java.lang.Object r10 = r11.invoke(r12, r10, r0)
                if (r10 != r1) goto L129
            L128:
                return r1
            L129:
                r19 = r2
                r2 = r6
                r6 = r7
                r7 = r9
                goto L98
            */
            throw new UnsupportedOperationException("Method not decompiled: p617ou.C10062l.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((a) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public static final <R, T> Object m38831a(@NotNull InterfaceC9577i<? super R> interfaceC9577i, @NotNull InterfaceC9575h<? extends T>[] interfaceC9575hArr, @NotNull Function0<T[]> function0, @NotNull InterfaceC14057n<? super InterfaceC9577i<? super R>, ? super T[], ? super InterfaceC9557b<? super Unit>, ? extends Object> interfaceC14057n, @NotNull InterfaceC9557b<? super Unit> interfaceC9557b) {
        Object objM38832a = C10065o.m38832a(new a(interfaceC9575hArr, function0, interfaceC14057n, interfaceC9577i, null), interfaceC9557b);
        return objM38832a == C10047c.m38805e() ? objM38832a : Unit.f29331a;
    }
}
