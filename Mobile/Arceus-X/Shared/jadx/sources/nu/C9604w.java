package nu;

import androidx.core.view.inputmethod.EditorInfoCompat;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7725a0;
import kotlin.jvm.internal.C7745l;
import kotlin.jvm.internal.C7758y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7348o;
import p256ku.C7865g2;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p615zt.InterfaceC14057n;
import p617ou.C10048a;
import p617ou.C10066p;
import pt.AbstractC10342d;
import pt.AbstractC10351m;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: nu.w */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a+\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001aG\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\"\u0010\n\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006¢\u0006\u0004\b\u000b\u0010\f\u001a+\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u0005\u001a0\u0010\u0012\u001a\u00020\u0011\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00020\tH\u0082@¢\u0006\u0004\b\u0012\u0010\u0013\u001aG\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\"\u0010\n\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006¢\u0006\u0004\b\u0014\u0010\f\u001a[\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0015*\b\u0012\u0004\u0012\u00028\u00000\u000120\b\u0001\u0010\u0017\u001a*\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u000e\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0016¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m31665d2 = {"T", "Lnu/h;", "", "count", "b", "(Lnu/h;I)Lnu/h;", "Lkotlin/Function2;", "Lnt/b;", "", "", "predicate", "c", "(Lnu/h;Lkotlin/jvm/functions/Function2;)Lnu/h;", "e", "Lnu/i;", "value", "ownershipMarker", "", "d", "(Lnu/i;Ljava/lang/Object;Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;", "f", "R", "Lkotlin/Function3;", "transform", "g", "(Lnu/h;Lzt/n;)Lnu/h;", "kotlinx-coroutines-core"}, m31666k = 5, m31667mv = {2, 1, 0}, m31669xi = 48, m31670xs = "kotlinx/coroutines/flow/FlowKt")
public final /* synthetic */ class C9604w {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: nu.w$a */
    @Metadata(m31664d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m31665d2 = {"nu/w$a", "Lnu/h;", "Lnu/i;", "collector", "", "collect", "(Lnu/i;Lnt/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class a<T> implements InterfaceC9575h<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC9575h f34732a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f34733b;

        public a(InterfaceC9575h interfaceC9575h, int i10) {
            this.f34732a = interfaceC9575h;
            this.f34733b = i10;
        }

        @Override // nu.InterfaceC9575h
        public Object collect(InterfaceC9577i<? super T> interfaceC9577i, InterfaceC9557b<? super Unit> interfaceC9557b) {
            Object objCollect = this.f34732a.collect(new b(new C7725a0(), this.f34733b, interfaceC9577i), interfaceC9557b);
            return objCollect == C10047c.m38805e() ? objCollect : Unit.f29331a;
        }
    }

    /* JADX INFO: renamed from: nu.w$b */
    @Metadata(m31666k = 3, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class b<T> implements InterfaceC9577i {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C7725a0 f34734a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f34735b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ InterfaceC9577i<T> f34736c;

        /* JADX INFO: renamed from: nu.w$b$a */
        @InterfaceC10344f(m39663c = "kotlinx.coroutines.flow.FlowKt__LimitKt$drop$2$1", m39664f = "Limit.kt", m39665l = {22}, m39666m = "emit")
        @Metadata(m31666k = 3, m31667mv = {2, 1, 0}, m31669xi = 48)
        public static final class a extends AbstractC10342d {

            /* JADX INFO: renamed from: t */
            public /* synthetic */ Object f34737t;

            /* JADX INFO: renamed from: u */
            public final /* synthetic */ b<T> f34738u;

            /* JADX INFO: renamed from: v */
            public int f34739v;

            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: nu.w$b<? super T> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(b<? super T> bVar, InterfaceC9557b<? super a> interfaceC9557b) {
                super(interfaceC9557b);
                this.f34738u = bVar;
            }

            @Override // pt.AbstractC10339a
            public final Object invokeSuspend(Object obj) {
                this.f34737t = obj;
                this.f34739v |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                return this.f34738u.emit(null, this);
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: nu.i<? super T> */
        /* JADX WARN: Multi-variable type inference failed */
        public b(C7725a0 c7725a0, int i10, InterfaceC9577i<? super T> interfaceC9577i) {
            this.f34734a = c7725a0;
            this.f34735b = i10;
            this.f34736c = interfaceC9577i;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // nu.InterfaceC9577i
        public final Object emit(T t8, InterfaceC9557b<? super Unit> interfaceC9557b) {
            a aVar;
            if (interfaceC9557b instanceof a) {
                aVar = (a) interfaceC9557b;
                int i10 = aVar.f34739v;
                if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                    aVar.f34739v = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                } else {
                    aVar = new a(this, interfaceC9557b);
                }
            } else {
                aVar = new a(this, interfaceC9557b);
            }
            Object obj = aVar.f34737t;
            Object objM38805e = C10047c.m38805e();
            int i11 = aVar.f34739v;
            if (i11 == 0) {
                C7348o.m30470b(obj);
                C7725a0 c7725a0 = this.f34734a;
                int i12 = c7725a0.f29421a;
                if (i12 < this.f34735b) {
                    c7725a0.f29421a = i12 + 1;
                    return Unit.f29331a;
                }
                InterfaceC9577i<T> interfaceC9577i = this.f34736c;
                aVar.f34739v = 1;
                if (interfaceC9577i.emit(t8, aVar) == objM38805e) {
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

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: nu.w$c */
    @Metadata(m31664d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m31665d2 = {"nu/w$c", "Lnu/h;", "Lnu/i;", "collector", "", "collect", "(Lnu/i;Lnt/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class c<T> implements InterfaceC9575h<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC9575h f34740a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function2 f34741b;

        public c(InterfaceC9575h interfaceC9575h, Function2 function2) {
            this.f34740a = interfaceC9575h;
            this.f34741b = function2;
        }

        @Override // nu.InterfaceC9575h
        public Object collect(InterfaceC9577i<? super T> interfaceC9577i, InterfaceC9557b<? super Unit> interfaceC9557b) {
            Object objCollect = this.f34740a.collect(new d(new C7758y(), interfaceC9577i, this.f34741b), interfaceC9557b);
            return objCollect == C10047c.m38805e() ? objCollect : Unit.f29331a;
        }
    }

    /* JADX INFO: renamed from: nu.w$d */
    @Metadata(m31666k = 3, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class d<T> implements InterfaceC9577i {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C7758y f34742a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC9577i<T> f34743b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Function2<T, InterfaceC9557b<? super Boolean>, Object> f34744c;

        /* JADX INFO: renamed from: nu.w$d$a */
        @InterfaceC10344f(m39663c = "kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1", m39664f = "Limit.kt", m39665l = {34, 35, 37}, m39666m = "emit")
        @Metadata(m31666k = 3, m31667mv = {2, 1, 0}, m31669xi = 48)
        public static final class a extends AbstractC10342d {

            /* JADX INFO: renamed from: t */
            public Object f34745t;

            /* JADX INFO: renamed from: u */
            public Object f34746u;

            /* JADX INFO: renamed from: v */
            public /* synthetic */ Object f34747v;

            /* JADX INFO: renamed from: w */
            public final /* synthetic */ d<T> f34748w;

            /* JADX INFO: renamed from: x */
            public int f34749x;

            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: nu.w$d<? super T> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(d<? super T> dVar, InterfaceC9557b<? super a> interfaceC9557b) {
                super(interfaceC9557b);
                this.f34748w = dVar;
            }

            @Override // pt.AbstractC10339a
            public final Object invokeSuspend(Object obj) {
                this.f34747v = obj;
                this.f34749x |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                return this.f34748w.emit(null, this);
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: nu.i<? super T> */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function2<? super T, ? super nt.b<? super java.lang.Boolean>, ? extends java.lang.Object> */
        /* JADX WARN: Multi-variable type inference failed */
        public d(C7758y c7758y, InterfaceC9577i<? super T> interfaceC9577i, Function2<? super T, ? super InterfaceC9557b<? super Boolean>, ? extends Object> function2) {
            this.f34742a = c7758y;
            this.f34743b = interfaceC9577i;
            this.f34744c = function2;
        }

        /* JADX WARN: Code duplicated, block: B:31:0x0074  */
        /* JADX WARN: Code duplicated, block: B:36:0x008b  */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0056, code lost:
        
            if (r8.emit(r7, r0) == r1) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0085, code lost:
        
            if (r8.emit(r7, r0) == r1) goto L33;
         */
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
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(T t8, InterfaceC9557b<? super Unit> interfaceC9557b) {
            a aVar;
            d<T> dVar;
            if (interfaceC9557b instanceof a) {
                aVar = (a) interfaceC9557b;
                int i10 = aVar.f34749x;
                if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                    aVar.f34749x = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                } else {
                    aVar = new a(this, interfaceC9557b);
                }
            } else {
                aVar = new a(this, interfaceC9557b);
            }
            Object objInvoke = aVar.f34747v;
            Object objM38805e = C10047c.m38805e();
            int i11 = aVar.f34749x;
            if (i11 != 0) {
                if (i11 == 1) {
                    C7348o.m30470b(objInvoke);
                    return Unit.f29331a;
                }
                if (i11 == 2) {
                    t8 = (T) aVar.f34746u;
                    dVar = (d) aVar.f34745t;
                    C7348o.m30470b(objInvoke);
                    if (!((Boolean) objInvoke).booleanValue()) {
                        return Unit.f29331a;
                    }
                    dVar.f34742a.f29445a = true;
                    InterfaceC9577i<T> interfaceC9577i = dVar.f34743b;
                    aVar.f34745t = null;
                    aVar.f34746u = null;
                    aVar.f34749x = 3;
                } else {
                    if (i11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7348o.m30470b(objInvoke);
                }
                return Unit.f29331a;
            }
            C7348o.m30470b(objInvoke);
            if (this.f34742a.f29445a) {
                InterfaceC9577i<T> interfaceC9577i2 = this.f34743b;
                aVar.f34749x = 1;
            } else {
                Function2<T, InterfaceC9557b<? super Boolean>, Object> function2 = this.f34744c;
                aVar.f34745t = this;
                aVar.f34746u = t8;
                aVar.f34749x = 2;
                objInvoke = function2.invoke(t8, aVar);
                if (objInvoke != objM38805e) {
                    dVar = this;
                    if (!((Boolean) objInvoke).booleanValue()) {
                        return Unit.f29331a;
                    }
                    dVar.f34742a.f29445a = true;
                    InterfaceC9577i<T> interfaceC9577i3 = dVar.f34743b;
                    aVar.f34745t = null;
                    aVar.f34746u = null;
                    aVar.f34749x = 3;
                }
            }
            return objM38805e;
        }
    }

    /* JADX INFO: renamed from: nu.w$e */
    @Metadata(m31666k = 3, m31667mv = {2, 1, 0}, m31669xi = 48)
    @InterfaceC10344f(m39663c = "kotlinx.coroutines.flow.FlowKt__LimitKt", m39664f = "Limit.kt", m39665l = {71}, m39666m = "emitAbort$FlowKt__LimitKt")
    public static final class e<T> extends AbstractC10342d {

        /* JADX INFO: renamed from: t */
        public Object f34750t;

        /* JADX INFO: renamed from: u */
        public /* synthetic */ Object f34751u;

        /* JADX INFO: renamed from: v */
        public int f34752v;

        public e(InterfaceC9557b<? super e> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f34751u = obj;
            this.f34752v |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return C9604w.m37889d(null, null, null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: nu.w$f */
    @Metadata(m31664d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m31665d2 = {"nu/w$f", "Lnu/h;", "Lnu/i;", "collector", "", "collect", "(Lnu/i;Lnt/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class f<T> implements InterfaceC9575h<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC9575h f34753a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f34754b;

        /* JADX INFO: renamed from: nu.w$f$a */
        @InterfaceC10344f(m39663c = "kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1", m39664f = "Limit.kt", m39665l = {112}, m39666m = "collect")
        @Metadata(m31666k = 3, m31667mv = {2, 1, 0}, m31669xi = 48)
        public static final class a extends AbstractC10342d {

            /* JADX INFO: renamed from: t */
            public /* synthetic */ Object f34755t;

            /* JADX INFO: renamed from: u */
            public int f34756u;

            /* JADX INFO: renamed from: w */
            public Object f34758w;

            public a(InterfaceC9557b interfaceC9557b) {
                super(interfaceC9557b);
            }

            @Override // pt.AbstractC10339a
            public final Object invokeSuspend(Object obj) {
                this.f34755t = obj;
                this.f34756u |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                return f.this.collect(null, this);
            }
        }

        public f(InterfaceC9575h interfaceC9575h, int i10) {
            this.f34753a = interfaceC9575h;
            this.f34754b = i10;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // nu.InterfaceC9575h
        public Object collect(InterfaceC9577i<? super T> interfaceC9577i, InterfaceC9557b<? super Unit> interfaceC9557b) {
            a aVar;
            C10048a e10;
            Object obj;
            if (interfaceC9557b instanceof a) {
                aVar = (a) interfaceC9557b;
                int i10 = aVar.f34756u;
                if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                    aVar.f34756u = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                } else {
                    aVar = new a(interfaceC9557b);
                }
            } else {
                aVar = new a(interfaceC9557b);
            }
            Object obj2 = aVar.f34755t;
            Object objM38805e = C10047c.m38805e();
            int i11 = aVar.f34756u;
            if (i11 == 0) {
                C7348o.m30470b(obj2);
                Object obj3 = new Object();
                C7725a0 c7725a0 = new C7725a0();
                try {
                    InterfaceC9575h interfaceC9575h = this.f34753a;
                    g gVar = new g(c7725a0, this.f34754b, interfaceC9577i, obj3);
                    aVar.f34758w = obj3;
                    aVar.f34756u = 1;
                    if (interfaceC9575h.collect(gVar, aVar) == objM38805e) {
                        return objM38805e;
                    }
                } catch (C10048a e11) {
                    e10 = e11;
                    obj = obj3;
                    C10066p.m38834a(e10, obj);
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj = aVar.f34758w;
                try {
                    C7348o.m30470b(obj2);
                } catch (C10048a e12) {
                    e10 = e12;
                    C10066p.m38834a(e10, obj);
                }
            }
            return Unit.f29331a;
        }
    }

    /* JADX INFO: renamed from: nu.w$g */
    @Metadata(m31666k = 3, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class g<T> implements InterfaceC9577i {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C7725a0 f34759a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f34760b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ InterfaceC9577i<T> f34761c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ Object f34762d;

        /* JADX INFO: renamed from: nu.w$g$a */
        @InterfaceC10344f(m39663c = "kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1", m39664f = "Limit.kt", m39665l = {59, 61}, m39666m = "emit")
        @Metadata(m31666k = 3, m31667mv = {2, 1, 0}, m31669xi = 48)
        public static final class a extends AbstractC10342d {

            /* JADX INFO: renamed from: t */
            public /* synthetic */ Object f34763t;

            /* JADX INFO: renamed from: u */
            public final /* synthetic */ g<T> f34764u;

            /* JADX INFO: renamed from: v */
            public int f34765v;

            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: nu.w$g<? super T> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(g<? super T> gVar, InterfaceC9557b<? super a> interfaceC9557b) {
                super(interfaceC9557b);
                this.f34764u = gVar;
            }

            @Override // pt.AbstractC10339a
            public final Object invokeSuspend(Object obj) {
                this.f34763t = obj;
                this.f34765v |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                return this.f34764u.emit(null, this);
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: nu.i<? super T> */
        /* JADX WARN: Multi-variable type inference failed */
        public g(C7725a0 c7725a0, int i10, InterfaceC9577i<? super T> interfaceC9577i, Object obj) {
            this.f34759a = c7725a0;
            this.f34760b = i10;
            this.f34761c = interfaceC9577i;
            this.f34762d = obj;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x004e, code lost:
        
            if (r7.emit(r6, r0) == r1) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x005e, code lost:
        
            if (nu.C9604w.m37889d(r7, r6, r2, r0) == r1) goto L25;
         */
        @Override // nu.InterfaceC9577i
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(T t8, InterfaceC9557b<? super Unit> interfaceC9557b) {
            a aVar;
            if (interfaceC9557b instanceof a) {
                aVar = (a) interfaceC9557b;
                int i10 = aVar.f34765v;
                if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                    aVar.f34765v = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                } else {
                    aVar = new a(this, interfaceC9557b);
                }
            } else {
                aVar = new a(this, interfaceC9557b);
            }
            Object obj = aVar.f34763t;
            Object objM38805e = C10047c.m38805e();
            int i11 = aVar.f34765v;
            if (i11 != 0) {
                if (i11 == 1) {
                    C7348o.m30470b(obj);
                    return Unit.f29331a;
                }
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
                return Unit.f29331a;
            }
            C7348o.m30470b(obj);
            C7725a0 c7725a0 = this.f34759a;
            int i12 = c7725a0.f29421a + 1;
            c7725a0.f29421a = i12;
            if (i12 < this.f34760b) {
                InterfaceC9577i<T> interfaceC9577i = this.f34761c;
                aVar.f34765v = 1;
            } else {
                InterfaceC9577i<T> interfaceC9577i2 = this.f34761c;
                Object obj2 = this.f34762d;
                aVar.f34765v = 2;
            }
            return objM38805e;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: nu.w$h */
    @Metadata(m31664d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m31665d2 = {"nu/w$h", "Lnu/h;", "Lnu/i;", "collector", "", "collect", "(Lnu/i;Lnt/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class h<T> implements InterfaceC9575h<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC9575h f34766a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function2 f34767b;

        /* JADX INFO: renamed from: nu.w$h$a */
        @InterfaceC10344f(m39663c = "kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1", m39664f = "Limit.kt", m39665l = {120}, m39666m = "collect")
        @Metadata(m31666k = 3, m31667mv = {2, 1, 0}, m31669xi = 48)
        public static final class a extends AbstractC10342d {

            /* JADX INFO: renamed from: t */
            public /* synthetic */ Object f34768t;

            /* JADX INFO: renamed from: u */
            public int f34769u;

            /* JADX INFO: renamed from: w */
            public Object f34771w;

            public a(InterfaceC9557b interfaceC9557b) {
                super(interfaceC9557b);
            }

            @Override // pt.AbstractC10339a
            public final Object invokeSuspend(Object obj) {
                this.f34768t = obj;
                this.f34769u |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                return h.this.collect(null, this);
            }
        }

        public h(InterfaceC9575h interfaceC9575h, Function2 function2) {
            this.f34766a = interfaceC9575h;
            this.f34767b = function2;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // nu.InterfaceC9575h
        public Object collect(InterfaceC9577i<? super T> interfaceC9577i, InterfaceC9557b<? super Unit> interfaceC9557b) {
            a aVar;
            i iVar;
            if (interfaceC9557b instanceof a) {
                aVar = (a) interfaceC9557b;
                int i10 = aVar.f34769u;
                if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                    aVar.f34769u = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                } else {
                    aVar = new a(interfaceC9557b);
                }
            } else {
                aVar = new a(interfaceC9557b);
            }
            Object obj = aVar.f34768t;
            Object objM38805e = C10047c.m38805e();
            int i11 = aVar.f34769u;
            if (i11 == 0) {
                C7348o.m30470b(obj);
                InterfaceC9575h interfaceC9575h = this.f34766a;
                i iVar2 = new i(this.f34767b, interfaceC9577i);
                try {
                    aVar.f34771w = iVar2;
                    aVar.f34769u = 1;
                    if (interfaceC9575h.collect(iVar2, aVar) == objM38805e) {
                        return objM38805e;
                    }
                } catch (C10048a e10) {
                    e = e10;
                    iVar = iVar2;
                    C10066p.m38834a(e, iVar);
                    C7865g2.m32652f(aVar.getContext());
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                iVar = (i) aVar.f34771w;
                try {
                    C7348o.m30470b(obj);
                } catch (C10048a e11) {
                    e = e11;
                    C10066p.m38834a(e, iVar);
                    C7865g2.m32652f(aVar.getContext());
                }
            }
            return Unit.f29331a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: nu.w$i */
    @Metadata(m31664d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m31665d2 = {"nu/w$i", "Lnu/i;", "value", "", "emit", "(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class i<T> implements InterfaceC9577i<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Function2 f34772a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC9577i f34773b;

        /* JADX INFO: renamed from: nu.w$i$a */
        @InterfaceC10344f(m39663c = "kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1", m39664f = "Limit.kt", m39665l = {132, 133}, m39666m = "emit")
        @Metadata(m31666k = 3, m31667mv = {2, 1, 0}, m31669xi = 48)
        public static final class a extends AbstractC10342d {

            /* JADX INFO: renamed from: t */
            public Object f34774t;

            /* JADX INFO: renamed from: u */
            public /* synthetic */ Object f34775u;

            /* JADX INFO: renamed from: v */
            public int f34776v;

            /* JADX INFO: renamed from: x */
            public Object f34778x;

            public a(InterfaceC9557b interfaceC9557b) {
                super(interfaceC9557b);
            }

            @Override // pt.AbstractC10339a
            public final Object invokeSuspend(Object obj) {
                this.f34775u = obj;
                this.f34776v |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                return i.this.emit(null, this);
            }
        }

        public i(Function2 function2, InterfaceC9577i interfaceC9577i) {
            this.f34772a = function2;
            this.f34773b = interfaceC9577i;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v7, resolved type: nu.i */
        /* JADX WARN: Code duplicated, block: B:27:0x007e  */
        /* JADX WARN: Code duplicated, block: B:29:0x0081  */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0078, code lost:
        
            if (r2.emit(r9, r0) == r1) goto L24;
         */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // nu.InterfaceC9577i
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object emit(T t8, InterfaceC9557b<? super Unit> interfaceC9557b) {
            a aVar;
            Object obj;
            Object obj2;
            i<T> iVar;
            if (interfaceC9557b instanceof a) {
                aVar = (a) interfaceC9557b;
                int i10 = aVar.f34776v;
                if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                    aVar.f34776v = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                } else {
                    aVar = new a(interfaceC9557b);
                }
            } else {
                aVar = new a(interfaceC9557b);
            }
            Object obj3 = aVar.f34775u;
            Object objM38805e = C10047c.m38805e();
            int i11 = aVar.f34776v;
            boolean z10 = true;
            if (i11 == 0) {
                C7348o.m30470b(obj3);
                Function2 function2 = this.f34772a;
                aVar.f34774t = this;
                aVar.f34778x = t8;
                aVar.f34776v = 1;
                C7745l.m32061c(6);
                Object objInvoke = function2.invoke(t8, aVar);
                C7745l.m32061c(7);
                if (objInvoke != objM38805e) {
                    obj = objInvoke;
                    obj2 = t8;
                    iVar = this;
                }
                return objM38805e;
            }
            if (i11 == 1) {
                Object obj4 = aVar.f34778x;
                i<T> iVar2 = (i) aVar.f34774t;
                C7348o.m30470b(obj3);
                obj2 = obj4;
                iVar = iVar2;
                obj = obj3;
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                iVar = (i) aVar.f34774t;
                C7348o.m30470b(obj3);
            }
            if (z10) {
                return Unit.f29331a;
            }
            throw new C10048a(iVar);
            if (((Boolean) obj).booleanValue()) {
                InterfaceC9577i interfaceC9577i = iVar.f34773b;
                aVar.f34774t = iVar;
                aVar.f34778x = null;
                aVar.f34776v = 2;
            } else {
                z10 = false;
            }
            if (z10) {
                return Unit.f29331a;
            }
            throw new C10048a(iVar);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: nu.w$j */
    @Metadata(m31664d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"R", "Lnu/i;", "", "<anonymous>", "(Lnu/i;)V"}, m31666k = 3, m31667mv = {2, 1, 0})
    @InterfaceC10344f(m39663c = "kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1", m39664f = "Limit.kt", m39665l = {152}, m39666m = "invokeSuspend")
    public static final class j<R> extends AbstractC10351m implements Function2<InterfaceC9577i<? super R>, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f34779t;

        /* JADX INFO: renamed from: u */
        public /* synthetic */ Object f34780u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ InterfaceC9575h<T> f34781v;

        /* JADX INFO: renamed from: w */
        public final /* synthetic */ InterfaceC14057n<InterfaceC9577i<? super R>, T, InterfaceC9557b<? super Boolean>, Object> f34782w;

        /* JADX INFO: Add missing generic type declarations: [T] */
        /* JADX INFO: renamed from: nu.w$j$a */
        @Metadata(m31664d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m31665d2 = {"nu/w$j$a", "Lnu/i;", "value", "", "emit", "(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
        public static final class a<T> implements InterfaceC9577i<T> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ InterfaceC14057n f34783a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ InterfaceC9577i f34784b;

            /* JADX INFO: renamed from: nu.w$j$a$a, reason: collision with other inner class name */
            @InterfaceC10344f(m39663c = "kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1", m39664f = "Limit.kt", m39665l = {132}, m39666m = "emit")
            @Metadata(m31666k = 3, m31667mv = {2, 1, 0}, m31669xi = 48)
            public static final class C14214a extends AbstractC10342d {

                /* JADX INFO: renamed from: t */
                public Object f34785t;

                /* JADX INFO: renamed from: u */
                public /* synthetic */ Object f34786u;

                /* JADX INFO: renamed from: v */
                public int f34787v;

                public C14214a(InterfaceC9557b interfaceC9557b) {
                    super(interfaceC9557b);
                }

                @Override // pt.AbstractC10339a
                public final Object invokeSuspend(Object obj) {
                    this.f34786u = obj;
                    this.f34787v |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC14057n interfaceC14057n, InterfaceC9577i interfaceC9577i) {
                this.f34783a = interfaceC14057n;
                this.f34784b = interfaceC9577i;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // nu.InterfaceC9577i
            public Object emit(T t8, InterfaceC9557b<? super Unit> interfaceC9557b) {
                C14214a c14214a;
                a<T> aVar;
                if (interfaceC9557b instanceof C14214a) {
                    c14214a = (C14214a) interfaceC9557b;
                    int i10 = c14214a.f34787v;
                    if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                        c14214a.f34787v = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                    } else {
                        c14214a = new C14214a(interfaceC9557b);
                    }
                } else {
                    c14214a = new C14214a(interfaceC9557b);
                }
                Object objInvoke = c14214a.f34786u;
                Object objM38805e = C10047c.m38805e();
                int i11 = c14214a.f34787v;
                if (i11 == 0) {
                    C7348o.m30470b(objInvoke);
                    InterfaceC14057n interfaceC14057n = this.f34783a;
                    InterfaceC9577i interfaceC9577i = this.f34784b;
                    c14214a.f34785t = this;
                    c14214a.f34787v = 1;
                    C7745l.m32061c(6);
                    objInvoke = interfaceC14057n.invoke(interfaceC9577i, t8, c14214a);
                    C7745l.m32061c(7);
                    if (objInvoke == objM38805e) {
                        return objM38805e;
                    }
                    aVar = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar = (a) c14214a.f34785t;
                    C7348o.m30470b(objInvoke);
                }
                if (((Boolean) objInvoke).booleanValue()) {
                    return Unit.f29331a;
                }
                throw new C10048a(aVar);
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: nu.h<? extends T> */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: zt.n<? super nu.i<? super R>, ? super T, ? super nt.b<? super java.lang.Boolean>, ? extends java.lang.Object> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public j(InterfaceC9575h<? extends T> interfaceC9575h, InterfaceC14057n<? super InterfaceC9577i<? super R>, ? super T, ? super InterfaceC9557b<? super Boolean>, ? extends Object> interfaceC14057n, InterfaceC9557b<? super j> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f34781v = interfaceC9575h;
            this.f34782w = interfaceC14057n;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            j jVar = new j(this.f34781v, this.f34782w, interfaceC9557b);
            jVar.f34780u = obj;
            return jVar;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type nt.b to nu.w$j<R> for r5v1 'this'  nt.b
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
                int r1 = r5.f34779t
                r2 = 1
                if (r1 == 0) goto L1d
                if (r1 != r2) goto L15
                java.lang.Object r0 = r5.f34780u
                nu.w$j$a r0 = (nu.C9604w.j.a) r0
                p229jt.C7348o.m30470b(r6)     // Catch: p617ou.C10048a -> L13
                goto L44
            L13:
                r6 = move-exception
                goto L3a
            L15:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1d:
                p229jt.C7348o.m30470b(r6)
                java.lang.Object r6 = r5.f34780u
                nu.i r6 = (nu.InterfaceC9577i) r6
                nu.h<T> r1 = r5.f34781v
                zt.n<nu.i<? super R>, T, nt.b<? super java.lang.Boolean>, java.lang.Object> r3 = r5.f34782w
                nu.w$j$a r4 = new nu.w$j$a
                r4.<init>(r3, r6)
                r5.f34780u = r4     // Catch: p617ou.C10048a -> L38
                r5.f34779t = r2     // Catch: p617ou.C10048a -> L38
                java.lang.Object r6 = r1.collect(r4, r5)     // Catch: p617ou.C10048a -> L38
                if (r6 != r0) goto L44
                return r0
            L38:
                r6 = move-exception
                r0 = r4
            L3a:
                p617ou.C10066p.m38834a(r6, r0)
                kotlin.coroutines.CoroutineContext r6 = r5.getContext()
                p256ku.C7865g2.m32652f(r6)
            L44:
                kotlin.Unit r6 = kotlin.Unit.f29331a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: nu.C9604w.j.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC9577i<? super R> interfaceC9577i, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((j) create(interfaceC9577i, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final <T> InterfaceC9575h<T> m37887b(@NotNull InterfaceC9575h<? extends T> interfaceC9575h, int i10) {
        if (i10 >= 0) {
            return new a(interfaceC9575h, i10);
        }
        throw new IllegalArgumentException(("Drop count should be non-negative, but had " + i10).toString());
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final <T> InterfaceC9575h<T> m37888c(@NotNull InterfaceC9575h<? extends T> interfaceC9575h, @NotNull Function2<? super T, ? super InterfaceC9557b<? super Boolean>, ? extends Object> function2) {
        return new c(interfaceC9575h, function2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public static final <T> Object m37889d(InterfaceC9577i<? super T> interfaceC9577i, T t8, Object obj, InterfaceC9557b<? super Unit> interfaceC9557b) {
        e eVar;
        if (interfaceC9557b instanceof e) {
            eVar = (e) interfaceC9557b;
            int i10 = eVar.f34752v;
            if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                eVar.f34752v = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                eVar = new e(interfaceC9557b);
            }
        } else {
            eVar = new e(interfaceC9557b);
        }
        Object obj2 = eVar.f34751u;
        Object objM38805e = C10047c.m38805e();
        int i11 = eVar.f34752v;
        if (i11 == 0) {
            C7348o.m30470b(obj2);
            eVar.f34750t = obj;
            eVar.f34752v = 1;
            if (interfaceC9577i.emit(t8, eVar) == objM38805e) {
                return objM38805e;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj = eVar.f34750t;
            C7348o.m30470b(obj2);
        }
        throw new C10048a(obj);
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public static final <T> InterfaceC9575h<T> m37890e(@NotNull InterfaceC9575h<? extends T> interfaceC9575h, int i10) {
        if (i10 > 0) {
            return new f(interfaceC9575h, i10);
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " should be positive").toString());
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public static final <T> InterfaceC9575h<T> m37891f(@NotNull InterfaceC9575h<? extends T> interfaceC9575h, @NotNull Function2<? super T, ? super InterfaceC9557b<? super Boolean>, ? extends Object> function2) {
        return new h(interfaceC9575h, function2);
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public static final <T, R> InterfaceC9575h<R> m37892g(@NotNull InterfaceC9575h<? extends T> interfaceC9575h, @NotNull InterfaceC14057n<? super InterfaceC9577i<? super R>, ? super T, ? super InterfaceC9557b<? super Boolean>, ? extends Object> interfaceC14057n) {
        return C9579j.m37806w(new j(interfaceC9575h, interfaceC14057n, null));
    }
}
