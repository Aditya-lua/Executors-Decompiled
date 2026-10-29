package nu;

import androidx.core.view.inputmethod.EditorInfoCompat;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7745l;
import org.jetbrains.annotations.NotNull;
import p229jt.C7348o;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import pt.AbstractC10342d;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: nu.a0 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\u001e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a)\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001aG\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\"\u0010\b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m31665d2 = {"", "T", "Lnu/h;", "a", "(Lnu/h;)Lnu/h;", "Lkotlin/Function2;", "Lnt/b;", "", "action", "b", "(Lnu/h;Lkotlin/jvm/functions/Function2;)Lnu/h;", "kotlinx-coroutines-core"}, m31666k = 5, m31667mv = {2, 1, 0}, m31669xi = 48, m31670xs = "kotlinx/coroutines/flow/FlowKt")
public final /* synthetic */ class C9562a0 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: nu.a0$a */
    @Metadata(m31664d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m31665d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lnu/h;", "Lnu/i;", "collector", "", "collect", "(Lnu/i;Lnt/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class a<T> implements InterfaceC9575h<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC9575h f34539a;

        /* JADX INFO: renamed from: nu.a0$a$a, reason: collision with other inner class name */
        @Metadata(m31666k = 3, m31667mv = {2, 1, 0}, m31669xi = 48)
        public static final class C14202a<T> implements InterfaceC9577i {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ InterfaceC9577i f34540a;

            /* JADX INFO: renamed from: nu.a0$a$a$a, reason: collision with other inner class name */
            @InterfaceC10344f(m39663c = "kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2", m39664f = "Transform.kt", m39665l = {50}, m39666m = "emit")
            @Metadata(m31666k = 3, m31667mv = {2, 1, 0}, m31669xi = 48)
            public static final class C14203a extends AbstractC10342d {

                /* JADX INFO: renamed from: t */
                public /* synthetic */ Object f34541t;

                /* JADX INFO: renamed from: u */
                public int f34542u;

                public C14203a(InterfaceC9557b interfaceC9557b) {
                    super(interfaceC9557b);
                }

                @Override // pt.AbstractC10339a
                public final Object invokeSuspend(Object obj) {
                    this.f34541t = obj;
                    this.f34542u |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                    return C14202a.this.emit(null, this);
                }
            }

            public C14202a(InterfaceC9577i interfaceC9577i) {
                this.f34540a = interfaceC9577i;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // nu.InterfaceC9577i
            public final Object emit(T t8, InterfaceC9557b<? super Unit> interfaceC9557b) {
                C14203a c14203a;
                if (interfaceC9557b instanceof C14203a) {
                    c14203a = (C14203a) interfaceC9557b;
                    int i10 = c14203a.f34542u;
                    if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                        c14203a.f34542u = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                    } else {
                        c14203a = new C14203a(interfaceC9557b);
                    }
                } else {
                    c14203a = new C14203a(interfaceC9557b);
                }
                Object obj = c14203a.f34541t;
                Object objM38805e = C10047c.m38805e();
                int i11 = c14203a.f34542u;
                if (i11 == 0) {
                    C7348o.m30470b(obj);
                    InterfaceC9577i interfaceC9577i = this.f34540a;
                    if (t8 != null) {
                        c14203a.f34542u = 1;
                        if (interfaceC9577i.emit(t8, c14203a) == objM38805e) {
                            return objM38805e;
                        }
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

        public a(InterfaceC9575h interfaceC9575h) {
            this.f34539a = interfaceC9575h;
        }

        @Override // nu.InterfaceC9575h
        public Object collect(InterfaceC9577i interfaceC9577i, InterfaceC9557b interfaceC9557b) {
            Object objCollect = this.f34539a.collect(new C14202a(interfaceC9577i), interfaceC9557b);
            return objCollect == C10047c.m38805e() ? objCollect : Unit.f29331a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: nu.a0$b */
    @Metadata(m31664d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m31665d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lnu/h;", "Lnu/i;", "collector", "", "collect", "(Lnu/i;Lnt/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class b<T> implements InterfaceC9575h<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC9575h f34544a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function2 f34545b;

        /* JADX INFO: renamed from: nu.a0$b$a */
        @Metadata(m31666k = 3, m31667mv = {2, 1, 0}, m31669xi = 48)
        public static final class a<T> implements InterfaceC9577i {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ InterfaceC9577i f34546a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ Function2 f34547b;

            /* JADX INFO: renamed from: nu.a0$b$a$a, reason: collision with other inner class name */
            @InterfaceC10344f(m39663c = "kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2", m39664f = "Transform.kt", m39665l = {50, 51}, m39666m = "emit")
            @Metadata(m31666k = 3, m31667mv = {2, 1, 0}, m31669xi = 48)
            public static final class C14204a extends AbstractC10342d {

                /* JADX INFO: renamed from: t */
                public /* synthetic */ Object f34548t;

                /* JADX INFO: renamed from: u */
                public int f34549u;

                /* JADX INFO: renamed from: w */
                public Object f34551w;

                /* JADX INFO: renamed from: x */
                public Object f34552x;

                public C14204a(InterfaceC9557b interfaceC9557b) {
                    super(interfaceC9557b);
                }

                @Override // pt.AbstractC10339a
                public final Object invokeSuspend(Object obj) {
                    this.f34548t = obj;
                    this.f34549u |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC9577i interfaceC9577i, Function2 function2) {
                this.f34546a = interfaceC9577i;
                this.f34547b = function2;
            }

            /* JADX DEBUG: Multi-variable search result rejected for r6v1, resolved type: nu.i */
            /* JADX DEBUG: Multi-variable search result rejected for r6v2, resolved type: nu.i */
            /* JADX DEBUG: Multi-variable search result rejected for r6v8, resolved type: nu.i */
            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x0067, code lost:
            
                if (r6.emit(r2, r0) == r1) goto L22;
             */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // nu.InterfaceC9577i
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(T t8, InterfaceC9557b<? super Unit> interfaceC9557b) {
                C14204a c14204a;
                Object obj;
                InterfaceC9577i interfaceC9577i;
                if (interfaceC9557b instanceof C14204a) {
                    c14204a = (C14204a) interfaceC9557b;
                    int i10 = c14204a.f34549u;
                    if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                        c14204a.f34549u = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                    } else {
                        c14204a = new C14204a(interfaceC9557b);
                    }
                } else {
                    c14204a = new C14204a(interfaceC9557b);
                }
                Object obj2 = c14204a.f34548t;
                Object objM38805e = C10047c.m38805e();
                int i11 = c14204a.f34549u;
                if (i11 != 0) {
                    if (i11 == 1) {
                        InterfaceC9577i interfaceC9577i2 = (InterfaceC9577i) c14204a.f34552x;
                        obj = c14204a.f34551w;
                        C7348o.m30470b(obj2);
                        interfaceC9577i = interfaceC9577i2;
                    } else {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C7348o.m30470b(obj2);
                    }
                    return Unit.f29331a;
                }
                C7348o.m30470b(obj2);
                InterfaceC9577i interfaceC9577i3 = this.f34546a;
                Function2 function2 = this.f34547b;
                c14204a.f34551w = t8;
                c14204a.f34552x = interfaceC9577i3;
                c14204a.f34549u = 1;
                C7745l.m32061c(6);
                Object objInvoke = function2.invoke(t8, c14204a);
                C7745l.m32061c(7);
                if (objInvoke != objM38805e) {
                    obj = t8;
                    interfaceC9577i = interfaceC9577i3;
                }
                return objM38805e;
                c14204a.f34551w = null;
                c14204a.f34552x = null;
                c14204a.f34549u = 2;
            }
        }

        public b(InterfaceC9575h interfaceC9575h, Function2 function2) {
            this.f34544a = interfaceC9575h;
            this.f34545b = function2;
        }

        @Override // nu.InterfaceC9575h
        public Object collect(InterfaceC9577i interfaceC9577i, InterfaceC9557b interfaceC9557b) {
            Object objCollect = this.f34544a.collect(new a(interfaceC9577i, this.f34545b), interfaceC9557b);
            return objCollect == C10047c.m38805e() ? objCollect : Unit.f29331a;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final <T> InterfaceC9575h<T> m37703a(@NotNull InterfaceC9575h<? extends T> interfaceC9575h) {
        return new a(interfaceC9575h);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final <T> InterfaceC9575h<T> m37704b(@NotNull InterfaceC9575h<? extends T> interfaceC9575h, @NotNull Function2<? super T, ? super InterfaceC9557b<? super Unit>, ? extends Object> function2) {
        return new b(interfaceC9575h, function2);
    }
}
