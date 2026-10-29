package nu;

import androidx.core.view.inputmethod.EditorInfoCompat;
import com.appsflyer.C1759R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7745l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7328a;
import p229jt.C7348o;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p615zt.InterfaceC14057n;
import p617ou.C10072v;
import pt.AbstractC10342d;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: nu.u */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\b\u001aM\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012(\u0010\u0007\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002¢\u0006\u0004\b\b\u0010\t\u001aU\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000120\u0010\u0007\u001a,\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\n¢\u0006\u0004\b\f\u0010\r\u001a\u0017\u0010\u000e\u001a\u00020\u0005*\u0006\u0012\u0002\b\u00030\u0003H\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\\\u0010\u0011\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000320\u0010\u0007\u001a,\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000bH\u0082@¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m31665d2 = {"T", "Lnu/h;", "Lkotlin/Function2;", "Lnu/i;", "Lnt/b;", "", "", "action", "e", "(Lnu/h;Lkotlin/jvm/functions/Function2;)Lnu/h;", "Lkotlin/Function3;", "", "d", "(Lnu/h;Lzt/n;)Lnu/h;", "b", "(Lnu/i;)V", "cause", "c", "(Lnu/i;Lzt/n;Ljava/lang/Throwable;Lnt/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m31666k = 5, m31667mv = {2, 1, 0}, m31669xi = 48, m31670xs = "kotlinx/coroutines/flow/FlowKt")
public final /* synthetic */ class C9601u {

    /* JADX INFO: renamed from: nu.u$a */
    @Metadata(m31666k = 3, m31667mv = {2, 1, 0}, m31669xi = 48)
    @InterfaceC10344f(m39663c = "kotlinx.coroutines.flow.FlowKt__EmittersKt", m39664f = "Emitters.kt", m39665l = {212}, m39666m = "invokeSafely$FlowKt__EmittersKt")
    public static final class a<T> extends AbstractC10342d {

        /* JADX INFO: renamed from: t */
        public Object f34687t;

        /* JADX INFO: renamed from: u */
        public /* synthetic */ Object f34688u;

        /* JADX INFO: renamed from: v */
        public int f34689v;

        public a(InterfaceC9557b<? super a> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f34688u = obj;
            this.f34689v |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return C9601u.m37878c(null, null, null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: nu.u$b */
    @Metadata(m31664d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m31665d2 = {"nu/u$b", "Lnu/h;", "Lnu/i;", "collector", "", "collect", "(Lnu/i;Lnt/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class b<T> implements InterfaceC9575h<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC9575h f34690a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC14057n f34691b;

        /* JADX INFO: renamed from: nu.u$b$a */
        @InterfaceC10344f(m39663c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1", m39664f = "Emitters.kt", m39665l = {110, 117, C1759R.styleable.AppCompatTheme_windowMinWidthMajor}, m39666m = "collect")
        @Metadata(m31666k = 3, m31667mv = {2, 1, 0}, m31669xi = 48)
        public static final class a extends AbstractC10342d {

            /* JADX INFO: renamed from: t */
            public /* synthetic */ Object f34692t;

            /* JADX INFO: renamed from: u */
            public int f34693u;

            /* JADX INFO: renamed from: w */
            public Object f34695w;

            /* JADX INFO: renamed from: x */
            public Object f34696x;

            public a(InterfaceC9557b interfaceC9557b) {
                super(interfaceC9557b);
            }

            @Override // pt.AbstractC10339a
            public final Object invokeSuspend(Object obj) {
                this.f34692t = obj;
                this.f34693u |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                return b.this.collect(null, this);
            }
        }

        public b(InterfaceC9575h interfaceC9575h, InterfaceC14057n interfaceC14057n) {
            this.f34690a = interfaceC9575h;
            this.f34691b = interfaceC14057n;
        }

        /* JADX WARN: Code duplicated, block: B:35:0x0088  */
        /* JADX WARN: Code duplicated, block: B:56:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // nu.InterfaceC9575h
        public Object collect(InterfaceC9577i<? super T> interfaceC9577i, InterfaceC9557b<? super Unit> interfaceC9557b) throws Throwable {
            a aVar;
            b<T> bVar;
            C9602u0 c9602u0;
            InterfaceC14057n interfaceC14057n;
            C10072v c10072v;
            Throwable th2;
            C10072v c10072v2;
            Object objInvoke;
            if (interfaceC9557b instanceof a) {
                aVar = (a) interfaceC9557b;
                int i10 = aVar.f34693u;
                if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                    aVar.f34693u = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                } else {
                    aVar = new a(interfaceC9557b);
                }
            } else {
                aVar = new a(interfaceC9557b);
            }
            Object obj = aVar.f34692t;
            Object objM38805e = C10047c.m38805e();
            int i11 = aVar.f34693u;
            if (i11 == 0) {
                C7348o.m30470b(obj);
                try {
                    InterfaceC9575h interfaceC9575h = this.f34690a;
                    aVar.f34695w = this;
                    aVar.f34696x = interfaceC9577i;
                    aVar.f34693u = 1;
                    if (interfaceC9575h.collect(interfaceC9577i, aVar) != objM38805e) {
                        bVar = this;
                        c10072v = new C10072v(interfaceC9577i, aVar.getContext());
                        InterfaceC14057n interfaceC14057n2 = bVar.f34691b;
                        aVar.f34695w = c10072v;
                        aVar.f34696x = null;
                        aVar.f34693u = 3;
                        C7745l.m32061c(6);
                        objInvoke = interfaceC14057n2.invoke(c10072v, null, aVar);
                        C7745l.m32061c(7);
                        if (objInvoke != objM38805e) {
                            c10072v2 = c10072v;
                            c10072v2.releaseIntercepted();
                            return Unit.f29331a;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    bVar = this;
                    c9602u0 = new C9602u0(th);
                    interfaceC14057n = bVar.f34691b;
                    aVar.f34695w = th;
                    aVar.f34696x = null;
                    aVar.f34693u = 2;
                    if (C9601u.m37878c(c9602u0, interfaceC14057n, th, aVar) == objM38805e) {
                        throw th;
                    }
                }
                return objM38805e;
            }
            if (i11 != 1) {
                if (i11 == 2) {
                    Throwable th4 = (Throwable) aVar.f34695w;
                    C7348o.m30470b(obj);
                    throw th4;
                }
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c10072v2 = (C10072v) aVar.f34695w;
                try {
                    C7348o.m30470b(obj);
                    c10072v2.releaseIntercepted();
                    return Unit.f29331a;
                } catch (Throwable th5) {
                    th2 = th5;
                    c10072v2.releaseIntercepted();
                    throw th2;
                }
            }
            interfaceC9577i = (InterfaceC9577i) aVar.f34696x;
            bVar = (b) aVar.f34695w;
            try {
                C7348o.m30470b(obj);
                c10072v = new C10072v(interfaceC9577i, aVar.getContext());
                try {
                    InterfaceC14057n interfaceC14057n3 = bVar.f34691b;
                    aVar.f34695w = c10072v;
                    aVar.f34696x = null;
                    aVar.f34693u = 3;
                    C7745l.m32061c(6);
                    objInvoke = interfaceC14057n3.invoke(c10072v, null, aVar);
                    C7745l.m32061c(7);
                    if (objInvoke != objM38805e) {
                        c10072v2 = c10072v;
                        c10072v2.releaseIntercepted();
                        return Unit.f29331a;
                    }
                    return objM38805e;
                } catch (Throwable th6) {
                    th2 = th6;
                    c10072v2 = c10072v;
                    c10072v2.releaseIntercepted();
                    throw th2;
                }
            } catch (Throwable th7) {
                th = th7;
                c9602u0 = new C9602u0(th);
                interfaceC14057n = bVar.f34691b;
                aVar.f34695w = th;
                aVar.f34696x = null;
                aVar.f34693u = 2;
                if (C9601u.m37878c(c9602u0, interfaceC14057n, th, aVar) == objM38805e) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: nu.u$c */
    @Metadata(m31664d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m31665d2 = {"nu/u$c", "Lnu/h;", "Lnu/i;", "collector", "", "collect", "(Lnu/i;Lnt/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class c<T> implements InterfaceC9575h<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Function2 f34697a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC9575h f34698b;

        /* JADX INFO: renamed from: nu.u$c$a */
        @InterfaceC10344f(m39663c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1", m39664f = "Emitters.kt", m39665l = {112, 116}, m39666m = "collect")
        @Metadata(m31666k = 3, m31667mv = {2, 1, 0}, m31669xi = 48)
        public static final class a extends AbstractC10342d {

            /* JADX INFO: renamed from: t */
            public /* synthetic */ Object f34699t;

            /* JADX INFO: renamed from: u */
            public int f34700u;

            /* JADX INFO: renamed from: w */
            public Object f34702w;

            /* JADX INFO: renamed from: x */
            public Object f34703x;

            /* JADX INFO: renamed from: y */
            public Object f34704y;

            public a(InterfaceC9557b interfaceC9557b) {
                super(interfaceC9557b);
            }

            @Override // pt.AbstractC10339a
            public final Object invokeSuspend(Object obj) {
                this.f34699t = obj;
                this.f34700u |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                return c.this.collect(null, this);
            }
        }

        public c(Function2 function2, InterfaceC9575h interfaceC9575h) {
            this.f34697a = function2;
            this.f34698b = interfaceC9575h;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0080, code lost:
        
            if (r7.collect(r2, r0) == r1) goto L27;
         */
        @Override // nu.InterfaceC9575h
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object collect(InterfaceC9577i<? super T> interfaceC9577i, InterfaceC9557b<? super Unit> interfaceC9557b) throws Throwable {
            a aVar;
            Throwable th2;
            C10072v c10072v;
            c<T> cVar;
            InterfaceC9577i<? super T> interfaceC9577i2;
            if (interfaceC9557b instanceof a) {
                aVar = (a) interfaceC9557b;
                int i10 = aVar.f34700u;
                if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                    aVar.f34700u = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                } else {
                    aVar = new a(interfaceC9557b);
                }
            } else {
                aVar = new a(interfaceC9557b);
            }
            Object obj = aVar.f34699t;
            Object objM38805e = C10047c.m38805e();
            int i11 = aVar.f34700u;
            if (i11 != 0) {
                if (i11 == 1) {
                    c10072v = (C10072v) aVar.f34704y;
                    interfaceC9577i2 = (InterfaceC9577i) aVar.f34703x;
                    cVar = (c) aVar.f34702w;
                    try {
                        C7348o.m30470b(obj);
                        c10072v.releaseIntercepted();
                        InterfaceC9575h interfaceC9575h = cVar.f34698b;
                        aVar.f34702w = null;
                        aVar.f34703x = null;
                        aVar.f34704y = null;
                        aVar.f34700u = 2;
                    } catch (Throwable th3) {
                        th2 = th3;
                        c10072v.releaseIntercepted();
                        throw th2;
                    }
                } else {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7348o.m30470b(obj);
                }
                return Unit.f29331a;
            }
            C7348o.m30470b(obj);
            C10072v c10072v2 = new C10072v(interfaceC9577i, aVar.getContext());
            try {
                Function2 function2 = this.f34697a;
                aVar.f34702w = this;
                aVar.f34703x = interfaceC9577i;
                aVar.f34704y = c10072v2;
                aVar.f34700u = 1;
                C7745l.m32061c(6);
                Object objInvoke = function2.invoke(c10072v2, aVar);
                C7745l.m32061c(7);
                if (objInvoke != objM38805e) {
                    cVar = this;
                    interfaceC9577i2 = interfaceC9577i;
                    c10072v = c10072v2;
                    c10072v.releaseIntercepted();
                    InterfaceC9575h interfaceC9575h2 = cVar.f34698b;
                    aVar.f34702w = null;
                    aVar.f34703x = null;
                    aVar.f34704y = null;
                    aVar.f34700u = 2;
                }
                return objM38805e;
            } catch (Throwable th4) {
                th2 = th4;
                c10072v = c10072v2;
                c10072v.releaseIntercepted();
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m37877b(@NotNull InterfaceC9577i<?> interfaceC9577i) {
        if (interfaceC9577i instanceof C9602u0) {
            throw ((C9602u0) interfaceC9577i).e;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public static final <T> Object m37878c(InterfaceC9577i<? super T> interfaceC9577i, InterfaceC14057n<? super InterfaceC9577i<? super T>, ? super Throwable, ? super InterfaceC9557b<? super Unit>, ? extends Object> interfaceC14057n, Throwable th2, InterfaceC9557b<? super Unit> interfaceC9557b) {
        a aVar;
        if (interfaceC9557b instanceof a) {
            aVar = (a) interfaceC9557b;
            int i10 = aVar.f34689v;
            if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                aVar.f34689v = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                aVar = new a(interfaceC9557b);
            }
        } else {
            aVar = new a(interfaceC9557b);
        }
        Object obj = aVar.f34688u;
        Object objM38805e = C10047c.m38805e();
        int i11 = aVar.f34689v;
        try {
            if (i11 == 0) {
                C7348o.m30470b(obj);
                aVar.f34687t = th2;
                aVar.f34689v = 1;
                if (interfaceC14057n.invoke(interfaceC9577i, th2, aVar) == objM38805e) {
                    return objM38805e;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                th2 = (Throwable) aVar.f34687t;
                C7348o.m30470b(obj);
            }
            return Unit.f29331a;
        } catch (Throwable th3) {
            if (th2 != null && th2 != th3) {
                C7328a.m30429a(th3, th2);
            }
            throw th3;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public static final <T> InterfaceC9575h<T> m37879d(@NotNull InterfaceC9575h<? extends T> interfaceC9575h, @NotNull InterfaceC14057n<? super InterfaceC9577i<? super T>, ? super Throwable, ? super InterfaceC9557b<? super Unit>, ? extends Object> interfaceC14057n) {
        return new b(interfaceC9575h, interfaceC14057n);
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public static final <T> InterfaceC9575h<T> m37880e(@NotNull InterfaceC9575h<? extends T> interfaceC9575h, @NotNull Function2<? super InterfaceC9577i<? super T>, ? super InterfaceC9557b<? super Unit>, ? extends Object> function2) {
        return new c(function2, interfaceC9575h);
    }
}
