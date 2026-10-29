package p344ot;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.C7721e;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7739h0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7348o;
import p315nt.InterfaceC9557b;
import pt.AbstractC10339a;
import pt.AbstractC10342d;
import pt.AbstractC10348j;
import pt.C10346h;

/* JADX INFO: renamed from: ot.b */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\u001c\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\u001aS\u0010\u0007\u001a\u0004\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00022\u0006\u0010\u0005\u001a\u00028\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001aW\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00022\u0006\u0010\u0005\u001a\u00028\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a%\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0007¢\u0006\u0004\b\f\u0010\r\u001a)\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0002¢\u0006\u0004\b\u000e\u0010\r¨\u0006\u000f"}, m31665d2 = {"R", "T", "Lkotlin/Function2;", "Lnt/b;", "", "receiver", "completion", "d", "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;", "", "a", "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Lnt/b;)Lnt/b;", "c", "(Lnt/b;)Lnt/b;", "b", "kotlin-stdlib"}, m31666k = 5, m31667mv = {2, 2, 0}, m31669xi = 49, m31670xs = "kotlin/coroutines/intrinsics/IntrinsicsKt")
public class C10046b {

    /* JADX INFO: renamed from: ot.b$a */
    @Metadata(m31664d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\u0014¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000b"}, m31665d2 = {"ot/b$a", "Lpt/j;", "Ljt/n;", "", "result", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "t", "I", "label", "kotlin-stdlib"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class a extends AbstractC10348j {

        /* JADX INFO: renamed from: t, reason: from kotlin metadata */
        public int label;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ Function2 f36180u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ Object f36181v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC9557b interfaceC9557b, Function2 function2, Object obj) {
            super(interfaceC9557b);
            this.f36180u = function2;
            this.f36181v = obj;
            Intrinsics.m31981d(interfaceC9557b, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // pt.AbstractC10339a
        public Object invokeSuspend(Object result) {
            int i10 = this.label;
            if (i10 == 0) {
                this.label = 1;
                C7348o.m30470b(result);
                Intrinsics.m31981d(this.f36180u, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
                return ((Function2) C7739h0.m32040e(this.f36180u, 2)).invoke(this.f36181v, this);
            }
            if (i10 != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.label = 2;
            C7348o.m30470b(result);
            return result;
        }
    }

    /* JADX INFO: renamed from: ot.b$b */
    @Metadata(m31664d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\u0014¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000b"}, m31665d2 = {"ot/b$b", "Lpt/d;", "Ljt/n;", "", "result", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "t", "I", "label", "kotlin-stdlib"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class b extends AbstractC10342d {

        /* JADX INFO: renamed from: t, reason: from kotlin metadata */
        public int label;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ Function2 f36183u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ Object f36184v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC9557b interfaceC9557b, CoroutineContext coroutineContext, Function2 function2, Object obj) {
            super(interfaceC9557b, coroutineContext);
            this.f36183u = function2;
            this.f36184v = obj;
            Intrinsics.m31981d(interfaceC9557b, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // pt.AbstractC10339a
        public Object invokeSuspend(Object result) {
            int i10 = this.label;
            if (i10 == 0) {
                this.label = 1;
                C7348o.m30470b(result);
                Intrinsics.m31981d(this.f36183u, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
                return ((Function2) C7739h0.m32040e(this.f36183u, 2)).invoke(this.f36184v, this);
            }
            if (i10 != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.label = 2;
            C7348o.m30470b(result);
            return result;
        }
    }

    /* JADX INFO: renamed from: ot.b$c */
    @Metadata(m31664d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\u0014¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m31665d2 = {"ot/b$c", "Lpt/j;", "Ljt/n;", "", "result", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-stdlib"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class c extends AbstractC10348j {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC9557b<? super T> interfaceC9557b) {
            super(interfaceC9557b);
            Intrinsics.m31981d(interfaceC9557b, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // pt.AbstractC10339a
        public Object invokeSuspend(Object result) {
            C7348o.m30470b(result);
            return result;
        }
    }

    /* JADX INFO: renamed from: ot.b$d */
    @Metadata(m31664d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\u0014¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m31665d2 = {"ot/b$d", "Lpt/d;", "Ljt/n;", "", "result", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-stdlib"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class d extends AbstractC10342d {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(InterfaceC9557b<? super T> interfaceC9557b, CoroutineContext coroutineContext) {
            super(interfaceC9557b, coroutineContext);
            Intrinsics.m31981d(interfaceC9557b, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // pt.AbstractC10339a
        public Object invokeSuspend(Object result) {
            C7348o.m30470b(result);
            return result;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function2<? super R, ? super nt.b<? super T>, ? extends java.lang.Object> */
    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    /* JADX INFO: renamed from: a */
    public static <R, T> InterfaceC9557b<Unit> m38801a(@NotNull Function2<? super R, ? super InterfaceC9557b<? super T>, ? extends Object> function2, R r8, @NotNull InterfaceC9557b<? super T> completion) {
        Intrinsics.checkNotNullParameter(function2, "<this>");
        Intrinsics.checkNotNullParameter(completion, "completion");
        InterfaceC9557b<?> interfaceC9557bM39671a = C10346h.m39671a(completion);
        if (function2 instanceof AbstractC10339a) {
            return ((AbstractC10339a) function2).create(r8, interfaceC9557bM39671a);
        }
        CoroutineContext context = interfaceC9557bM39671a.getContext();
        return context == C7721e.f29393a ? new a(interfaceC9557bM39671a, function2, r8) : new b(interfaceC9557bM39671a, context, function2, r8);
    }

    /* JADX INFO: renamed from: b */
    public static final <T> InterfaceC9557b<T> m38802b(InterfaceC9557b<? super T> interfaceC9557b) {
        CoroutineContext context = interfaceC9557b.getContext();
        return context == C7721e.f29393a ? new c(interfaceC9557b) : new d(interfaceC9557b, context);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: nt.b<? super T> */
    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    /* JADX INFO: renamed from: c */
    public static <T> InterfaceC9557b<T> m38803c(@NotNull InterfaceC9557b<? super T> interfaceC9557b) {
        InterfaceC9557b<T> interfaceC9557b2;
        Intrinsics.checkNotNullParameter(interfaceC9557b, "<this>");
        AbstractC10342d abstractC10342d = interfaceC9557b instanceof AbstractC10342d ? (AbstractC10342d) interfaceC9557b : null;
        return (abstractC10342d == null || (interfaceC9557b2 = (InterfaceC9557b<T>) abstractC10342d.intercepted()) == null) ? interfaceC9557b : interfaceC9557b2;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public static <R, T> Object m38804d(@NotNull Function2<? super R, ? super InterfaceC9557b<? super T>, ? extends Object> function2, R r8, @NotNull InterfaceC9557b<? super T> completion) {
        Intrinsics.checkNotNullParameter(function2, "<this>");
        Intrinsics.checkNotNullParameter(completion, "completion");
        return ((Function2) C7739h0.m32040e(function2, 2)).invoke(r8, m38802b(C10346h.m39671a(completion)));
    }
}
