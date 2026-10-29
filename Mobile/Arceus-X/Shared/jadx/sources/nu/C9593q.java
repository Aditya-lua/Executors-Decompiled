package nu;

import androidx.core.view.inputmethod.EditorInfoCompat;
import com.google.mlkit.common.MlKitException;
import com.withpersona.sdk2.inquiry.network.core.HttpStatusCode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7727b0;
import kotlin.jvm.internal.C7729c0;
import kotlin.time.C7800a;
import mu.C8676k;
import mu.C8685t;
import mu.InterfaceC8687v;
import mu.InterfaceC8689x;
import org.jetbrains.annotations.NotNull;
import p229jt.C7348o;
import p256ku.C7856e3;
import p256ku.InterfaceC7906p0;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p395qu.C10719e0;
import p452tu.C11751c;
import p452tu.C11759k;
import p615zt.InterfaceC14057n;
import p617ou.C10065o;
import p617ou.C10070t;
import pt.AbstractC10342d;
import pt.AbstractC10351m;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: nu.q */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a-\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a9\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\t\u001a-\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\u0005\u001a-\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u0005¨\u0006\u000e"}, m31665d2 = {"T", "Lnu/h;", "", "timeoutMillis", "b", "(Lnu/h;J)Lnu/h;", "Lkotlin/Function1;", "timeoutMillisSelector", "d", "(Lnu/h;Lkotlin/jvm/functions/Function1;)Lnu/h;", "Lkotlin/time/a;", "timeout", "e", "f", "kotlinx-coroutines-core"}, m31666k = 5, m31667mv = {2, 1, 0}, m31669xi = 48, m31670xs = "kotlinx/coroutines/flow/FlowKt")
public final /* synthetic */ class C9593q {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: nu.q$a */
    @Metadata(m31664d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m31665d2 = {"T", "Lku/p0;", "Lnu/i;", "downstream", "", "<anonymous>", "(Lku/p0;Lnu/i;)V"}, m31666k = 3, m31667mv = {2, 1, 0})
    @InterfaceC10344f(m39663c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1", m39664f = "Delay.kt", m39665l = {215, 415}, m39666m = "invokeSuspend")
    public static final class a<T> extends AbstractC10351m implements InterfaceC14057n<InterfaceC7906p0, InterfaceC9577i<? super T>, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public Object f34639t;

        /* JADX INFO: renamed from: u */
        public Object f34640u;

        /* JADX INFO: renamed from: v */
        public int f34641v;

        /* JADX INFO: renamed from: w */
        public /* synthetic */ Object f34642w;

        /* JADX INFO: renamed from: x */
        public /* synthetic */ Object f34643x;

        /* JADX INFO: renamed from: y */
        public final /* synthetic */ Function1<T, Long> f34644y;

        /* JADX INFO: renamed from: z */
        public final /* synthetic */ InterfaceC9575h<T> f34645z;

        /* JADX INFO: renamed from: nu.q$a$a, reason: collision with other inner class name */
        @Metadata(m31664d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m31665d2 = {"<anonymous>", ""}, m31666k = 3, m31667mv = {2, 1, 0}, m31669xi = 48)
        @InterfaceC10344f(m39663c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$1", m39664f = "Delay.kt", m39665l = {226}, m39666m = "invokeSuspend")
        public static final class C14209a extends AbstractC10351m implements Function1<InterfaceC9557b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t */
            public int f34646t;

            /* JADX INFO: renamed from: u */
            public final /* synthetic */ InterfaceC9577i<T> f34647u;

            /* JADX INFO: renamed from: v */
            public final /* synthetic */ C7729c0<Object> f34648v;

            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: nu.i<? super T> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C14209a(InterfaceC9577i<? super T> interfaceC9577i, C7729c0<Object> c7729c0, InterfaceC9557b<? super C14209a> interfaceC9557b) {
                super(1, interfaceC9557b);
                this.f34647u = interfaceC9577i;
                this.f34648v = c7729c0;
            }

            @Override // pt.AbstractC10339a
            public final InterfaceC9557b<Unit> create(InterfaceC9557b<?> interfaceC9557b) {
                return new C14209a(this.f34647u, this.f34648v, interfaceC9557b);
            }

            @Override // pt.AbstractC10339a
            public final Object invokeSuspend(Object obj) {
                Object objM38805e = C10047c.m38805e();
                int i10 = this.f34646t;
                if (i10 == 0) {
                    C7348o.m30470b(obj);
                    InterfaceC9577i<T> interfaceC9577i = this.f34647u;
                    C10719e0 c10719e0 = C10070t.f36266a;
                    T t8 = this.f34648v.f29425a;
                    if (t8 == c10719e0) {
                        t8 = null;
                    }
                    this.f34646t = 1;
                    if (interfaceC9577i.emit(t8, this) == objM38805e) {
                        return objM38805e;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7348o.m30470b(obj);
                }
                this.f34648v.f29425a = null;
                return Unit.f29331a;
            }

            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC9557b<? super Unit> interfaceC9557b) {
                return ((C14209a) create(interfaceC9557b)).invokeSuspend(Unit.f29331a);
            }
        }

        /* JADX INFO: renamed from: nu.q$a$b */
        @Metadata(m31664d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m31665d2 = {"Lmu/k;", "", "value", "", "<anonymous>", "(Lmu/k;)V"}, m31666k = 3, m31667mv = {2, 1, 0})
        @InterfaceC10344f(m39663c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$2", m39664f = "Delay.kt", m39665l = {236}, m39666m = "invokeSuspend")
        public static final class b extends AbstractC10351m implements Function2<C8676k<? extends Object>, InterfaceC9557b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t */
            public Object f34649t;

            /* JADX INFO: renamed from: u */
            public int f34650u;

            /* JADX INFO: renamed from: v */
            public /* synthetic */ Object f34651v;

            /* JADX INFO: renamed from: w */
            public final /* synthetic */ C7729c0<Object> f34652w;

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ InterfaceC9577i<T> f34653x;

            /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: nu.i<? super T> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(C7729c0<Object> c7729c0, InterfaceC9577i<? super T> interfaceC9577i, InterfaceC9557b<? super b> interfaceC9557b) {
                super(2, interfaceC9557b);
                this.f34652w = c7729c0;
                this.f34653x = interfaceC9577i;
            }

            @Override // pt.AbstractC10339a
            public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
                b bVar = new b(this.f34652w, this.f34653x, interfaceC9557b);
                bVar.f34651v = obj;
                return bVar;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(C8676k<? extends Object> c8676k, InterfaceC9557b<? super Unit> interfaceC9557b) {
                return m37850q(c8676k.getHolder(), interfaceC9557b);
            }

            /* JADX WARN: Type inference failed for: r7v6, types: [T, qu.e0] */
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type nt.b to nu.q$a$b for r6v1 'this'  nt.b
                	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
                	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
                	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
                	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
                	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
                */
            @Override // pt.AbstractC10339a
            public final java.lang.Object invokeSuspend(java.lang.Object r7) {
                /*
                    r6 = this;
                    java.lang.Object r0 = p344ot.C10047c.m38805e()
                    int r1 = r6.f34650u
                    r2 = 1
                    if (r1 == 0) goto L1b
                    if (r1 != r2) goto L13
                    java.lang.Object r0 = r6.f34649t
                    kotlin.jvm.internal.c0 r0 = (kotlin.jvm.internal.C7729c0) r0
                    p229jt.C7348o.m30470b(r7)
                    goto L4f
                L13:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r0)
                    throw r7
                L1b:
                    p229jt.C7348o.m30470b(r7)
                    java.lang.Object r7 = r6.f34651v
                    mu.k r7 = (mu.C8676k) r7
                    java.lang.Object r7 = r7.getHolder()
                    kotlin.jvm.internal.c0<java.lang.Object> r1 = r6.f34652w
                    boolean r3 = r7 instanceof mu.C8676k.c
                    if (r3 != 0) goto L2e
                    r1.f29425a = r7
                L2e:
                    nu.i<T> r4 = r6.f34653x
                    if (r3 == 0) goto L56
                    java.lang.Throwable r3 = mu.C8676k.m34932e(r7)
                    if (r3 != 0) goto L55
                    T r3 = r1.f29425a
                    if (r3 == 0) goto L50
                    qu.e0 r5 = p617ou.C10070t.f36266a
                    if (r3 != r5) goto L41
                    r3 = 0
                L41:
                    r6.f34651v = r7
                    r6.f34649t = r1
                    r6.f34650u = r2
                    java.lang.Object r7 = r4.emit(r3, r6)
                    if (r7 != r0) goto L4e
                    return r0
                L4e:
                    r0 = r1
                L4f:
                    r1 = r0
                L50:
                    qu.e0 r7 = p617ou.C10070t.f36268c
                    r1.f29425a = r7
                    goto L56
                L55:
                    throw r3
                L56:
                    kotlin.Unit r7 = kotlin.Unit.f29331a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: nu.C9593q.a.b.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            /* JADX INFO: renamed from: q */
            public final Object m37850q(Object obj, InterfaceC9557b<? super Unit> interfaceC9557b) {
                return ((b) create(C8676k.m34929b(obj), interfaceC9557b)).invokeSuspend(Unit.f29331a);
            }
        }

        /* JADX INFO: renamed from: nu.q$a$c */
        @Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"Lmu/v;", "", "", "<anonymous>", "(Lmu/v;)V"}, m31666k = 3, m31667mv = {2, 1, 0})
        @InterfaceC10344f(m39663c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1", m39664f = "Delay.kt", m39665l = {MlKitException.CODE_SCANNER_TASK_IN_PROGRESS}, m39666m = "invokeSuspend")
        public static final class c extends AbstractC10351m implements Function2<InterfaceC8687v<? super Object>, InterfaceC9557b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t */
            public int f34654t;

            /* JADX INFO: renamed from: u */
            public /* synthetic */ Object f34655u;

            /* JADX INFO: renamed from: v */
            public final /* synthetic */ InterfaceC9575h<T> f34656v;

            /* JADX INFO: renamed from: nu.q$a$c$a, reason: collision with other inner class name */
            @Metadata(m31666k = 3, m31667mv = {2, 1, 0}, m31669xi = 48)
            public static final class C14210a<T> implements InterfaceC9577i {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ InterfaceC8687v<Object> f34657a;

                /* JADX INFO: renamed from: nu.q$a$c$a$a, reason: collision with other inner class name */
                @InterfaceC10344f(m39663c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1$1", m39664f = "Delay.kt", m39665l = {MlKitException.CODE_SCANNER_TASK_IN_PROGRESS}, m39666m = "emit")
                @Metadata(m31666k = 3, m31667mv = {2, 1, 0}, m31669xi = 48)
                public static final class C14211a extends AbstractC10342d {

                    /* JADX INFO: renamed from: t */
                    public /* synthetic */ Object f34658t;

                    /* JADX INFO: renamed from: u */
                    public final /* synthetic */ C14210a<T> f34659u;

                    /* JADX INFO: renamed from: v */
                    public int f34660v;

                    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: nu.q$a$c$a<? super T> */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public C14211a(C14210a<? super T> c14210a, InterfaceC9557b<? super C14211a> interfaceC9557b) {
                        super(interfaceC9557b);
                        this.f34659u = c14210a;
                    }

                    @Override // pt.AbstractC10339a
                    public final Object invokeSuspend(Object obj) {
                        this.f34658t = obj;
                        this.f34660v |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                        return this.f34659u.emit(null, this);
                    }
                }

                public C14210a(InterfaceC8687v<Object> interfaceC8687v) {
                    this.f34657a = interfaceC8687v;
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
                    C14211a c14211a;
                    if (interfaceC9557b instanceof C14211a) {
                        c14211a = (C14211a) interfaceC9557b;
                        int i10 = c14211a.f34660v;
                        if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                            c14211a.f34660v = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                        } else {
                            c14211a = new C14211a(this, interfaceC9557b);
                        }
                    } else {
                        c14211a = new C14211a(this, interfaceC9557b);
                    }
                    Object obj = c14211a.f34658t;
                    Object objM38805e = C10047c.m38805e();
                    int i11 = c14211a.f34660v;
                    if (i11 == 0) {
                        C7348o.m30470b(obj);
                        InterfaceC8687v<Object> interfaceC8687v = this.f34657a;
                        if (t8 == null) {
                            t8 = (T) C10070t.f36266a;
                        }
                        c14211a.f34660v = 1;
                        if (interfaceC8687v.mo34848i(t8, c14211a) == objM38805e) {
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
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public c(InterfaceC9575h<? extends T> interfaceC9575h, InterfaceC9557b<? super c> interfaceC9557b) {
                super(2, interfaceC9557b);
                this.f34656v = interfaceC9575h;
            }

            @Override // pt.AbstractC10339a
            public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
                c cVar = new c(this.f34656v, interfaceC9557b);
                cVar.f34655u = obj;
                return cVar;
            }

            @Override // pt.AbstractC10339a
            public final Object invokeSuspend(Object obj) {
                Object objM38805e = C10047c.m38805e();
                int i10 = this.f34654t;
                if (i10 == 0) {
                    C7348o.m30470b(obj);
                    InterfaceC8687v interfaceC8687v = (InterfaceC8687v) this.f34655u;
                    InterfaceC9575h<T> interfaceC9575h = this.f34656v;
                    C14210a c14210a = new C14210a(interfaceC8687v);
                    this.f34654t = 1;
                    if (interfaceC9575h.collect(c14210a, this) == objM38805e) {
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
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC8687v<Object> interfaceC8687v, InterfaceC9557b<? super Unit> interfaceC9557b) {
                return ((c) create(interfaceC8687v, interfaceC9557b)).invokeSuspend(Unit.f29331a);
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super T, java.lang.Long> */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: nu.h<? extends T> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Function1<? super T, Long> function1, InterfaceC9575h<? extends T> interfaceC9575h, InterfaceC9557b<? super a> interfaceC9557b) {
            super(3, interfaceC9557b);
            this.f34644y = function1;
            this.f34645z = interfaceC9575h;
        }

        /* JADX WARN: Code duplicated, block: B:14:0x0066  */
        /* JADX WARN: Code duplicated, block: B:16:0x006f  */
        /* JADX WARN: Code duplicated, block: B:18:0x0075  */
        /* JADX WARN: Code duplicated, block: B:21:0x0088  */
        /* JADX WARN: Code duplicated, block: B:23:0x008c  */
        /* JADX WARN: Code duplicated, block: B:25:0x0090  */
        /* JADX WARN: Code duplicated, block: B:30:0x00a4 A[PHI: r1 r5 r6 r7
          0x00a4: PHI (r1v3 kotlin.jvm.internal.b0) = (r1v5 kotlin.jvm.internal.b0), (r1v7 kotlin.jvm.internal.b0), (r1v7 kotlin.jvm.internal.b0) binds: [B:29:0x00a2, B:15:0x006d, B:22:0x008a] A[DONT_GENERATE, DONT_INLINE]
          0x00a4: PHI (r5v3 kotlin.jvm.internal.c0) = (r5v5 kotlin.jvm.internal.c0), (r5v6 kotlin.jvm.internal.c0), (r5v6 kotlin.jvm.internal.c0) binds: [B:29:0x00a2, B:15:0x006d, B:22:0x008a] A[DONT_GENERATE, DONT_INLINE]
          0x00a4: PHI (r6v2 mu.x) = (r6v4 mu.x), (r6v5 mu.x), (r6v5 mu.x) binds: [B:29:0x00a2, B:15:0x006d, B:22:0x008a] A[DONT_GENERATE, DONT_INLINE]
          0x00a4: PHI (r7v2 nu.i) = (r7v4 nu.i), (r7v5 nu.i), (r7v5 nu.i) binds: [B:29:0x00a2, B:15:0x006d, B:22:0x008a] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:31:0x00a9  */
        /* JADX WARN: Code duplicated, block: B:35:0x00be  */
        /* JADX WARN: Code duplicated, block: B:39:0x00e5  */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x009f, code lost:
        
            if (r7.emit(r15, r14) == r0) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x00e2, code lost:
        
            if (r7.m44016o(r14) == r0) goto L38;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00e2 -> B:7:0x001e). Please report as a decompilation issue!!! */
        @Override // pt.AbstractC10339a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            C7729c0 c7729c0;
            InterfaceC9577i interfaceC9577i;
            InterfaceC8689x interfaceC8689x;
            C7727b0 c7727b0;
            C7727b0 c7727b1;
            C7729c0 c7729c1;
            InterfaceC8689x interfaceC8689x2;
            InterfaceC9577i interfaceC9577i2;
            C11759k c11759k;
            T t8;
            C10719e0 c10719e0;
            long jLongValue;
            T t10;
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f34641v;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                InterfaceC7906p0 interfaceC7906p0 = (InterfaceC7906p0) this.f34642w;
                InterfaceC9577i interfaceC9577i3 = (InterfaceC9577i) this.f34643x;
                InterfaceC8689x interfaceC8689xM34967d = C8685t.m34967d(interfaceC7906p0, null, 0, new c(this.f34645z, null), 3, null);
                c7729c0 = new C7729c0();
                interfaceC9577i = interfaceC9577i3;
                interfaceC8689x = interfaceC8689xM34967d;
                if (c7729c0.f29425a != C10070t.f36268c) {
                    return Unit.f29331a;
                }
                c7727b0 = new C7727b0();
                t8 = c7729c0.f29425a;
                if (t8 != null) {
                    Function1<T, Long> function1 = this.f34644y;
                    c10719e0 = C10070t.f36266a;
                    if (t8 == c10719e0) {
                        t8 = null;
                    }
                    jLongValue = function1.invoke(t8).longValue();
                    c7727b0.f29424a = jLongValue;
                    if (jLongValue < 0) {
                        throw new IllegalArgumentException("Debounce timeout should not be negative");
                    }
                    if (jLongValue != 0) {
                        c7727b1 = c7727b0;
                        c7729c1 = c7729c0;
                        interfaceC8689x2 = interfaceC8689x;
                        interfaceC9577i2 = interfaceC9577i;
                        c11759k = new C11759k(getContext());
                        if (c7729c1.f29425a != null) {
                            C11751c.m43991a(c11759k, c7727b1.f29424a, new C14209a(interfaceC9577i2, c7729c1, null));
                        }
                        c11759k.mo43993c(interfaceC8689x2.mo34793A(), new b(c7729c1, interfaceC9577i2, null));
                        this.f34642w = interfaceC9577i2;
                        this.f34643x = interfaceC8689x2;
                        this.f34639t = c7729c1;
                        this.f34640u = null;
                        this.f34641v = 2;
                    } else {
                        t10 = c7729c0.f29425a;
                        if (t10 == c10719e0) {
                            t10 = null;
                        }
                        this.f34642w = interfaceC9577i;
                        this.f34643x = interfaceC8689x;
                        this.f34639t = c7729c0;
                        this.f34640u = c7727b0;
                        this.f34641v = 1;
                    }
                } else {
                    c7727b1 = c7727b0;
                    c7729c1 = c7729c0;
                    interfaceC8689x2 = interfaceC8689x;
                    interfaceC9577i2 = interfaceC9577i;
                    c11759k = new C11759k(getContext());
                    if (c7729c1.f29425a != null) {
                        C11751c.m43991a(c11759k, c7727b1.f29424a, new C14209a(interfaceC9577i2, c7729c1, null));
                    }
                    c11759k.mo43993c(interfaceC8689x2.mo34793A(), new b(c7729c1, interfaceC9577i2, null));
                    this.f34642w = interfaceC9577i2;
                    this.f34643x = interfaceC8689x2;
                    this.f34639t = c7729c1;
                    this.f34640u = null;
                    this.f34641v = 2;
                }
                return objM38805e;
            }
            if (i10 == 1) {
                c7727b0 = (C7727b0) this.f34640u;
                c7729c0 = (C7729c0) this.f34639t;
                interfaceC8689x = (InterfaceC8689x) this.f34643x;
                interfaceC9577i = (InterfaceC9577i) this.f34642w;
                C7348o.m30470b(obj);
                c7729c0.f29425a = null;
                c7727b1 = c7727b0;
                c7729c1 = c7729c0;
                interfaceC8689x2 = interfaceC8689x;
                interfaceC9577i2 = interfaceC9577i;
                c11759k = new C11759k(getContext());
                if (c7729c1.f29425a != null) {
                    C11751c.m43991a(c11759k, c7727b1.f29424a, new C14209a(interfaceC9577i2, c7729c1, null));
                }
                c11759k.mo43993c(interfaceC8689x2.mo34793A(), new b(c7729c1, interfaceC9577i2, null));
                this.f34642w = interfaceC9577i2;
                this.f34643x = interfaceC8689x2;
                this.f34639t = c7729c1;
                this.f34640u = null;
                this.f34641v = 2;
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c7729c1 = (C7729c0) this.f34639t;
                interfaceC8689x2 = (InterfaceC8689x) this.f34643x;
                interfaceC9577i2 = (InterfaceC9577i) this.f34642w;
                C7348o.m30470b(obj);
            }
            interfaceC9577i = interfaceC9577i2;
            interfaceC8689x = interfaceC8689x2;
            c7729c0 = c7729c1;
            if (c7729c0.f29425a != C10070t.f36268c) {
                return Unit.f29331a;
            }
            c7727b0 = new C7727b0();
            t8 = c7729c0.f29425a;
            if (t8 != null) {
                Function1<T, Long> function2 = this.f34644y;
                c10719e0 = C10070t.f36266a;
                if (t8 == c10719e0) {
                    t8 = null;
                }
                jLongValue = function2.invoke(t8).longValue();
                c7727b0.f29424a = jLongValue;
                if (jLongValue < 0) {
                    throw new IllegalArgumentException("Debounce timeout should not be negative");
                }
                if (jLongValue != 0) {
                    c7727b1 = c7727b0;
                    c7729c1 = c7729c0;
                    interfaceC8689x2 = interfaceC8689x;
                    interfaceC9577i2 = interfaceC9577i;
                    c11759k = new C11759k(getContext());
                    if (c7729c1.f29425a != null) {
                        C11751c.m43991a(c11759k, c7727b1.f29424a, new C14209a(interfaceC9577i2, c7729c1, null));
                    }
                    c11759k.mo43993c(interfaceC8689x2.mo34793A(), new b(c7729c1, interfaceC9577i2, null));
                    this.f34642w = interfaceC9577i2;
                    this.f34643x = interfaceC8689x2;
                    this.f34639t = c7729c1;
                    this.f34640u = null;
                    this.f34641v = 2;
                } else {
                    t10 = c7729c0.f29425a;
                    if (t10 == c10719e0) {
                        t10 = null;
                    }
                    this.f34642w = interfaceC9577i;
                    this.f34643x = interfaceC8689x;
                    this.f34639t = c7729c0;
                    this.f34640u = c7727b0;
                    this.f34641v = 1;
                }
            } else {
                c7727b1 = c7727b0;
                c7729c1 = c7729c0;
                interfaceC8689x2 = interfaceC8689x;
                interfaceC9577i2 = interfaceC9577i;
                c11759k = new C11759k(getContext());
                if (c7729c1.f29425a != null) {
                    C11751c.m43991a(c11759k, c7727b1.f29424a, new C14209a(interfaceC9577i2, c7729c1, null));
                }
                c11759k.mo43993c(interfaceC8689x2.mo34793A(), new b(c7729c1, interfaceC9577i2, null));
                this.f34642w = interfaceC9577i2;
                this.f34643x = interfaceC8689x2;
                this.f34639t = c7729c1;
                this.f34640u = null;
                this.f34641v = 2;
            }
            return objM38805e;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // p615zt.InterfaceC14057n
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9577i<? super T> interfaceC9577i, InterfaceC9557b<? super Unit> interfaceC9557b) {
            a aVar = new a(this.f34644y, this.f34645z, interfaceC9557b);
            aVar.f34642w = interfaceC7906p0;
            aVar.f34643x = interfaceC9577i;
            return aVar.invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: nu.q$b */
    @Metadata(m31664d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m31665d2 = {"T", "Lku/p0;", "Lnu/i;", "downStream", "", "<anonymous>", "(Lku/p0;Lnu/i;)V"}, m31666k = 3, m31667mv = {2, 1, 0})
    @InterfaceC10344f(m39663c = "kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1", m39664f = "Delay.kt", m39665l = {HttpStatusCode.PAYLOAD_TOO_LARGE_413}, m39666m = "invokeSuspend")
    public static final class b<T> extends AbstractC10351m implements InterfaceC14057n<InterfaceC7906p0, InterfaceC9577i<? super T>, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public long f34661t;

        /* JADX INFO: renamed from: u */
        public int f34662u;

        /* JADX INFO: renamed from: v */
        public /* synthetic */ Object f34663v;

        /* JADX INFO: renamed from: w */
        public /* synthetic */ Object f34664w;

        /* JADX INFO: renamed from: x */
        public final /* synthetic */ long f34665x;

        /* JADX INFO: renamed from: y */
        public final /* synthetic */ InterfaceC9575h<T> f34666y;

        /* JADX INFO: renamed from: nu.q$b$a */
        @Metadata(m31664d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m31665d2 = {"T", "Lmu/k;", "value", "", "<anonymous>", "(Lmu/k;)Z"}, m31666k = 3, m31667mv = {2, 1, 0})
        @InterfaceC10344f(m39663c = "kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$1", m39664f = "Delay.kt", m39665l = {395}, m39666m = "invokeSuspend")
        public static final class a extends AbstractC10351m implements Function2<C8676k<? extends T>, InterfaceC9557b<? super Boolean>, Object> {

            /* JADX INFO: renamed from: t */
            public int f34667t;

            /* JADX INFO: renamed from: u */
            public /* synthetic */ Object f34668u;

            /* JADX INFO: renamed from: v */
            public final /* synthetic */ InterfaceC9577i<T> f34669v;

            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: nu.i<? super T> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(InterfaceC9577i<? super T> interfaceC9577i, InterfaceC9557b<? super a> interfaceC9557b) {
                super(2, interfaceC9557b);
                this.f34669v = interfaceC9577i;
            }

            @Override // pt.AbstractC10339a
            public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
                a aVar = new a(this.f34669v, interfaceC9557b);
                aVar.f34668u = obj;
                return aVar;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, InterfaceC9557b<? super Boolean> interfaceC9557b) {
                return m37853q(((C8676k) obj).getHolder(), interfaceC9557b);
            }

            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type nt.b to nu.q$b$a for r4v1 'this'  nt.b
                	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
                	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
                	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
                	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
                	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
                */
            @Override // pt.AbstractC10339a
            public final java.lang.Object invokeSuspend(java.lang.Object r5) {
                /*
                    r4 = this;
                    java.lang.Object r0 = p344ot.C10047c.m38805e()
                    int r1 = r4.f34667t
                    r2 = 1
                    if (r1 == 0) goto L19
                    if (r1 != r2) goto L11
                    java.lang.Object r0 = r4.f34668u
                    p229jt.C7348o.m30470b(r5)
                    goto L36
                L11:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r0)
                    throw r5
                L19:
                    p229jt.C7348o.m30470b(r5)
                    java.lang.Object r5 = r4.f34668u
                    mu.k r5 = (mu.C8676k) r5
                    java.lang.Object r5 = r5.getHolder()
                    nu.i<T> r1 = r4.f34669v
                    boolean r3 = r5 instanceof mu.C8676k.c
                    if (r3 != 0) goto L37
                    r4.f34668u = r5
                    r4.f34667t = r2
                    java.lang.Object r1 = r1.emit(r5, r4)
                    if (r1 != r0) goto L35
                    return r0
                L35:
                    r0 = r5
                L36:
                    r5 = r0
                L37:
                    boolean r0 = r5 instanceof mu.C8676k.Closed
                    if (r0 == 0) goto L49
                    java.lang.Throwable r5 = mu.C8676k.m34932e(r5)
                    if (r5 != 0) goto L48
                    r5 = 0
                    java.lang.Boolean r5 = pt.C10340b.m39658a(r5)
                    return r5
                L48:
                    throw r5
                L49:
                    java.lang.Boolean r5 = pt.C10340b.m39658a(r2)
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: nu.C9593q.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            /* JADX INFO: renamed from: q */
            public final Object m37853q(Object obj, InterfaceC9557b<? super Boolean> interfaceC9557b) {
                return ((a) create(C8676k.m34929b(obj), interfaceC9557b)).invokeSuspend(Unit.f29331a);
            }
        }

        /* JADX INFO: renamed from: nu.q$b$b, reason: collision with other inner class name */
        @Metadata(m31664d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0001\u0010\u0000\u001a\u00020\u0001H\n"}, m31665d2 = {"<anonymous>", ""}, m31666k = 3, m31667mv = {2, 1, 0}, m31669xi = 48)
        @InterfaceC10344f(m39663c = "kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$2", m39664f = "Delay.kt", m39665l = {}, m39666m = "invokeSuspend")
        public static final class C14212b extends AbstractC10351m implements Function1<InterfaceC9557b<?>, Object> {

            /* JADX INFO: renamed from: t */
            public int f34670t;

            /* JADX INFO: renamed from: u */
            public final /* synthetic */ long f34671u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C14212b(long j10, InterfaceC9557b<? super C14212b> interfaceC9557b) {
                super(1, interfaceC9557b);
                this.f34671u = j10;
            }

            @Override // pt.AbstractC10339a
            public final InterfaceC9557b<Unit> create(InterfaceC9557b<?> interfaceC9557b) {
                return new C14212b(this.f34671u, interfaceC9557b);
            }

            @Override // pt.AbstractC10339a
            public final Object invokeSuspend(Object obj) {
                C10047c.m38805e();
                if (this.f34670t != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
                throw new C7856e3("Timed out waiting for " + ((Object) C7800a.m32332R(this.f34671u)));
            }

            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC9557b<?> interfaceC9557b) {
                return ((C14212b) create(interfaceC9557b)).invokeSuspend(Unit.f29331a);
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: nu.h<? extends T> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(long j10, InterfaceC9575h<? extends T> interfaceC9575h, InterfaceC9557b<? super b> interfaceC9557b) {
            super(3, interfaceC9557b);
            this.f34665x = j10;
            this.f34666y = interfaceC9575h;
        }

        /* JADX WARN: Code duplicated, block: B:13:0x0076 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:16:0x007f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0074 -> B:14:0x0077). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:0:?
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // pt.AbstractC10339a
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = p344ot.C10047c.m38805e()
                int r1 = r9.f34662u
                r2 = 1
                r3 = 0
                if (r1 == 0) goto L22
                if (r1 != r2) goto L1a
                long r4 = r9.f34661t
                java.lang.Object r1 = r9.f34664w
                mu.x r1 = (mu.InterfaceC8689x) r1
                java.lang.Object r6 = r9.f34663v
                nu.i r6 = (nu.InterfaceC9577i) r6
                p229jt.C7348o.m30470b(r10)
                goto L77
            L1a:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L22:
                p229jt.C7348o.m30470b(r10)
                java.lang.Object r10 = r9.f34663v
                ku.p0 r10 = (p256ku.InterfaceC7906p0) r10
                java.lang.Object r1 = r9.f34664w
                nu.i r1 = (nu.InterfaceC9577i) r1
                long r4 = r9.f34665x
                kotlin.time.a$a r6 = kotlin.time.C7800a.INSTANCE
                long r6 = r6.m32355b()
                int r4 = kotlin.time.C7800a.m32339j(r4, r6)
                if (r4 <= 0) goto L82
                nu.h<T> r4 = r9.f34666y
                r5 = 0
                r6 = 2
                nu.h r4 = nu.C9579j.m37786c(r4, r5, r3, r6, r3)
                mu.x r10 = nu.C9579j.m37770G(r4, r10)
                long r4 = r9.f34665x
                r6 = r1
                r1 = r10
            L4b:
                tu.k r10 = new tu.k
                kotlin.coroutines.CoroutineContext r7 = r9.getContext()
                r10.<init>(r7)
                tu.h r7 = r1.mo34793A()
                nu.q$b$a r8 = new nu.q$b$a
                r8.<init>(r6, r3)
                r10.mo43993c(r7, r8)
                nu.q$b$b r7 = new nu.q$b$b
                r7.<init>(r4, r3)
                p452tu.C11751c.m43992b(r10, r4, r7)
                r9.f34663v = r6
                r9.f34664w = r1
                r9.f34661t = r4
                r9.f34662u = r2
                java.lang.Object r10 = r10.m44016o(r9)
                if (r10 != r0) goto L77
                return r0
            L77:
                java.lang.Boolean r10 = (java.lang.Boolean) r10
                boolean r10 = r10.booleanValue()
                if (r10 != 0) goto L4b
                kotlin.Unit r10 = kotlin.Unit.f29331a
                return r10
            L82:
                ku.e3 r10 = new ku.e3
                java.lang.String r0 = "Timed out immediately"
                r10.<init>(r0)
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: nu.C9593q.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // p615zt.InterfaceC14057n
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9577i<? super T> interfaceC9577i, InterfaceC9557b<? super Unit> interfaceC9557b) {
            b bVar = new b(this.f34665x, this.f34666y, interfaceC9557b);
            bVar.f34663v = interfaceC7906p0;
            bVar.f34664w = interfaceC9577i;
            return bVar.invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: nu.h<? extends T> */
    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    /* JADX INFO: renamed from: b */
    public static final <T> InterfaceC9575h<T> m37843b(@NotNull InterfaceC9575h<? extends T> interfaceC9575h, final long j10) {
        if (j10 >= 0) {
            return j10 == 0 ? interfaceC9575h : m37845d(interfaceC9575h, new Function1() { // from class: nu.p
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Long.valueOf(C9593q.m37844c(j10, obj));
                }
            });
        }
        throw new IllegalArgumentException("Debounce timeout should not be negative");
    }

    /* JADX INFO: renamed from: c */
    public static final long m37844c(long j10, Object obj) {
        return j10;
    }

    /* JADX INFO: renamed from: d */
    public static final <T> InterfaceC9575h<T> m37845d(InterfaceC9575h<? extends T> interfaceC9575h, Function1<? super T, Long> function1) {
        return C10065o.m38833b(new a(function1, interfaceC9575h, null));
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public static final <T> InterfaceC9575h<T> m37846e(@NotNull InterfaceC9575h<? extends T> interfaceC9575h, long j10) {
        return m37847f(interfaceC9575h, j10);
    }

    /* JADX INFO: renamed from: f */
    public static final <T> InterfaceC9575h<T> m37847f(InterfaceC9575h<? extends T> interfaceC9575h, long j10) {
        return C10065o.m38833b(new b(j10, interfaceC9575h, null));
    }
}
