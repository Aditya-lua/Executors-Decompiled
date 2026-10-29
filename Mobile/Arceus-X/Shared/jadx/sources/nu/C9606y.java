package nu;

import androidx.core.view.inputmethod.EditorInfoCompat;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7729c0;
import kotlin.jvm.internal.C7745l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7348o;
import p256ku.C7865g2;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p617ou.C10048a;
import p617ou.C10066p;
import p617ou.C10070t;
import pt.AbstractC10342d;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: nu.y */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0005\u001a \u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086@¢\u0006\u0004\b\u0002\u0010\u0003\u001aD\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\"\u0010\b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004H\u0086@¢\u0006\u0004\b\t\u0010\n\u001a\"\u0010\u000b\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086@¢\u0006\u0004\b\u000b\u0010\u0003¨\u0006\f"}, m31665d2 = {"T", "Lnu/h;", "b", "(Lnu/h;Lnt/b;)Ljava/lang/Object;", "Lkotlin/Function2;", "Lnt/b;", "", "", "predicate", "a", "(Lnu/h;Lkotlin/jvm/functions/Function2;Lnt/b;)Ljava/lang/Object;", "c", "kotlinx-coroutines-core"}, m31666k = 5, m31667mv = {2, 1, 0}, m31669xi = 48, m31670xs = "kotlinx/coroutines/flow/FlowKt")
public final /* synthetic */ class C9606y {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: nu.y$a */
    @Metadata(m31664d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m31665d2 = {"nu/y$a", "Lnu/i;", "value", "", "emit", "(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class a<T> implements InterfaceC9577i<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C7729c0 f34794a;

        public a(C7729c0 c7729c0) {
            this.f34794a = c7729c0;
        }

        @Override // nu.InterfaceC9577i
        public Object emit(T t8, InterfaceC9557b<? super Unit> interfaceC9557b) {
            this.f34794a.f29425a = t8;
            throw new C10048a(this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: nu.y$b */
    @Metadata(m31664d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m31665d2 = {"nu/y$b", "Lnu/i;", "value", "", "emit", "(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class b<T> implements InterfaceC9577i<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Function2 f34795a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C7729c0 f34796b;

        /* JADX INFO: renamed from: nu.y$b$a */
        @InterfaceC10344f(m39663c = "kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2", m39664f = "Reduce.kt", m39665l = {132}, m39666m = "emit")
        @Metadata(m31666k = 3, m31667mv = {2, 1, 0}, m31669xi = 48)
        public static final class a extends AbstractC10342d {

            /* JADX INFO: renamed from: t */
            public Object f34797t;

            /* JADX INFO: renamed from: u */
            public /* synthetic */ Object f34798u;

            /* JADX INFO: renamed from: v */
            public int f34799v;

            /* JADX INFO: renamed from: x */
            public Object f34801x;

            public a(InterfaceC9557b interfaceC9557b) {
                super(interfaceC9557b);
            }

            @Override // pt.AbstractC10339a
            public final Object invokeSuspend(Object obj) {
                this.f34798u = obj;
                this.f34799v |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                return b.this.emit(null, this);
            }
        }

        public b(Function2 function2, C7729c0 c7729c0) {
            this.f34795a = function2;
            this.f34796b = c7729c0;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // nu.InterfaceC9577i
        public Object emit(T t8, InterfaceC9557b<? super Unit> interfaceC9557b) {
            a aVar;
            b<T> bVar;
            if (interfaceC9557b instanceof a) {
                aVar = (a) interfaceC9557b;
                int i10 = aVar.f34799v;
                if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                    aVar.f34799v = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                } else {
                    aVar = new a(interfaceC9557b);
                }
            } else {
                aVar = new a(interfaceC9557b);
            }
            Object objInvoke = aVar.f34798u;
            Object objM38805e = C10047c.m38805e();
            int i11 = aVar.f34799v;
            if (i11 == 0) {
                C7348o.m30470b(objInvoke);
                Function2 function2 = this.f34795a;
                aVar.f34797t = this;
                aVar.f34801x = t8;
                aVar.f34799v = 1;
                C7745l.m32061c(6);
                objInvoke = function2.invoke(t8, aVar);
                C7745l.m32061c(7);
                if (objInvoke == objM38805e) {
                    return objM38805e;
                }
                bVar = this;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t8 = (T) aVar.f34801x;
                bVar = (b) aVar.f34797t;
                C7348o.m30470b(objInvoke);
            }
            if (!((Boolean) objInvoke).booleanValue()) {
                return Unit.f29331a;
            }
            bVar.f34796b.f29425a = t8;
            throw new C10048a(bVar);
        }
    }

    /* JADX INFO: renamed from: nu.y$c */
    @Metadata(m31666k = 3, m31667mv = {2, 1, 0}, m31669xi = 48)
    @InterfaceC10344f(m39663c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", m39664f = "Reduce.kt", m39665l = {179}, m39666m = "first")
    public static final class c<T> extends AbstractC10342d {

        /* JADX INFO: renamed from: t */
        public Object f34802t;

        /* JADX INFO: renamed from: u */
        public Object f34803u;

        /* JADX INFO: renamed from: v */
        public /* synthetic */ Object f34804v;

        /* JADX INFO: renamed from: w */
        public int f34805w;

        public c(InterfaceC9557b<? super c> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f34804v = obj;
            this.f34805w |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return C9579j.m37804u(null, this);
        }
    }

    /* JADX INFO: renamed from: nu.y$d */
    @Metadata(m31666k = 3, m31667mv = {2, 1, 0}, m31669xi = 48)
    @InterfaceC10344f(m39663c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", m39664f = "Reduce.kt", m39665l = {179}, m39666m = "first")
    public static final class d<T> extends AbstractC10342d {

        /* JADX INFO: renamed from: t */
        public Object f34806t;

        /* JADX INFO: renamed from: u */
        public Object f34807u;

        /* JADX INFO: renamed from: v */
        public /* synthetic */ Object f34808v;

        /* JADX INFO: renamed from: w */
        public int f34809w;

        public d(InterfaceC9557b<? super d> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f34808v = obj;
            this.f34809w |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return C9579j.m37803t(null, null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: nu.y$e */
    @Metadata(m31664d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m31665d2 = {"nu/y$e", "Lnu/i;", "value", "", "emit", "(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class e<T> implements InterfaceC9577i<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C7729c0 f34810a;

        public e(C7729c0 c7729c0) {
            this.f34810a = c7729c0;
        }

        @Override // nu.InterfaceC9577i
        public Object emit(T t8, InterfaceC9557b<? super Unit> interfaceC9557b) {
            this.f34810a.f29425a = t8;
            throw new C10048a(this);
        }
    }

    /* JADX INFO: renamed from: nu.y$f */
    @Metadata(m31666k = 3, m31667mv = {2, 1, 0}, m31669xi = 48)
    @InterfaceC10344f(m39663c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", m39664f = "Reduce.kt", m39665l = {179}, m39666m = "firstOrNull")
    public static final class f<T> extends AbstractC10342d {

        /* JADX INFO: renamed from: t */
        public Object f34811t;

        /* JADX INFO: renamed from: u */
        public Object f34812u;

        /* JADX INFO: renamed from: v */
        public /* synthetic */ Object f34813v;

        /* JADX INFO: renamed from: w */
        public int f34814w;

        public f(InterfaceC9557b<? super f> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f34813v = obj;
            this.f34814w |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return C9579j.m37805v(null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final <T> Object m37899a(@NotNull InterfaceC9575h<? extends T> interfaceC9575h, @NotNull Function2<? super T, ? super InterfaceC9557b<? super Boolean>, ? extends Object> function2, @NotNull InterfaceC9557b<? super T> interfaceC9557b) {
        d dVar;
        C7729c0 c7729c0;
        C10048a e10;
        InterfaceC9577i<? super Object> interfaceC9577i;
        if (interfaceC9557b instanceof d) {
            dVar = (d) interfaceC9557b;
            int i10 = dVar.f34809w;
            if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                dVar.f34809w = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                dVar = new d(interfaceC9557b);
            }
        } else {
            dVar = new d(interfaceC9557b);
        }
        Object obj = dVar.f34808v;
        Object objM38805e = C10047c.m38805e();
        int i11 = dVar.f34809w;
        if (i11 == 0) {
            C7348o.m30470b(obj);
            C7729c0 c7729c1 = new C7729c0();
            c7729c1.f29425a = (T) C10070t.f36266a;
            InterfaceC9577i<? super Object> bVar = new b<>(function2, c7729c1);
            try {
                dVar.f34806t = c7729c1;
                dVar.f34807u = bVar;
                dVar.f34809w = 1;
                if (interfaceC9575h.collect(bVar, dVar) == objM38805e) {
                    return objM38805e;
                }
                c7729c0 = c7729c1;
            } catch (C10048a e11) {
                c7729c0 = c7729c1;
                e10 = e11;
                interfaceC9577i = bVar;
                C10066p.m38834a(e10, interfaceC9577i);
                C7865g2.m32652f(dVar.getContext());
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC9577i = (b) dVar.f34807u;
            c7729c0 = (C7729c0) dVar.f34806t;
            try {
                C7348o.m30470b(obj);
            } catch (C10048a e12) {
                e10 = e12;
                C10066p.m38834a(e10, interfaceC9577i);
                C7865g2.m32652f(dVar.getContext());
            }
        }
        T t8 = c7729c0.f29425a;
        if (t8 != C10070t.f36266a) {
            return t8;
        }
        throw new NoSuchElementException("Expected at least one element matching the predicate");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: b */
    public static final <T> Object m37900b(@NotNull InterfaceC9575h<? extends T> interfaceC9575h, @NotNull InterfaceC9557b<? super T> interfaceC9557b) {
        c cVar;
        C7729c0 c7729c0;
        C10048a e10;
        InterfaceC9577i<? super Object> interfaceC9577i;
        if (interfaceC9557b instanceof c) {
            cVar = (c) interfaceC9557b;
            int i10 = cVar.f34805w;
            if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                cVar.f34805w = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                cVar = new c(interfaceC9557b);
            }
        } else {
            cVar = new c(interfaceC9557b);
        }
        Object obj = cVar.f34804v;
        Object objM38805e = C10047c.m38805e();
        int i11 = cVar.f34805w;
        if (i11 == 0) {
            C7348o.m30470b(obj);
            C7729c0 c7729c1 = new C7729c0();
            c7729c1.f29425a = (T) C10070t.f36266a;
            InterfaceC9577i<? super Object> aVar = new a<>(c7729c1);
            try {
                cVar.f34802t = c7729c1;
                cVar.f34803u = aVar;
                cVar.f34805w = 1;
                if (interfaceC9575h.collect(aVar, cVar) == objM38805e) {
                    return objM38805e;
                }
                c7729c0 = c7729c1;
            } catch (C10048a e11) {
                c7729c0 = c7729c1;
                e10 = e11;
                interfaceC9577i = aVar;
                C10066p.m38834a(e10, interfaceC9577i);
                C7865g2.m32652f(cVar.getContext());
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC9577i = (a) cVar.f34803u;
            c7729c0 = (C7729c0) cVar.f34802t;
            try {
                C7348o.m30470b(obj);
            } catch (C10048a e12) {
                e10 = e12;
                C10066p.m38834a(e10, interfaceC9577i);
                C7865g2.m32652f(cVar.getContext());
            }
        }
        T t8 = c7729c0.f29425a;
        if (t8 != C10070t.f36266a) {
            return t8;
        }
        throw new NoSuchElementException("Expected at least one element");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: c */
    public static final <T> Object m37901c(@NotNull InterfaceC9575h<? extends T> interfaceC9575h, @NotNull InterfaceC9557b<? super T> interfaceC9557b) {
        f fVar;
        C7729c0 c7729c0;
        C10048a e10;
        InterfaceC9577i<? super Object> interfaceC9577i;
        if (interfaceC9557b instanceof f) {
            fVar = (f) interfaceC9557b;
            int i10 = fVar.f34814w;
            if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                fVar.f34814w = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                fVar = new f(interfaceC9557b);
            }
        } else {
            fVar = new f(interfaceC9557b);
        }
        Object obj = fVar.f34813v;
        Object objM38805e = C10047c.m38805e();
        int i11 = fVar.f34814w;
        if (i11 == 0) {
            C7348o.m30470b(obj);
            C7729c0 c7729c1 = new C7729c0();
            InterfaceC9577i<? super Object> eVar = new e<>(c7729c1);
            try {
                fVar.f34811t = c7729c1;
                fVar.f34812u = eVar;
                fVar.f34814w = 1;
                if (interfaceC9575h.collect(eVar, fVar) == objM38805e) {
                    return objM38805e;
                }
                c7729c0 = c7729c1;
            } catch (C10048a e11) {
                c7729c0 = c7729c1;
                e10 = e11;
                interfaceC9577i = eVar;
                C10066p.m38834a(e10, interfaceC9577i);
                C7865g2.m32652f(fVar.getContext());
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC9577i = (e) fVar.f34812u;
            c7729c0 = (C7729c0) fVar.f34811t;
            try {
                C7348o.m30470b(obj);
            } catch (C10048a e12) {
                e10 = e12;
                C10066p.m38834a(e10, interfaceC9577i);
                C7865g2.m32652f(fVar.getContext());
            }
        }
        return c7729c0.f29425a;
    }
}
