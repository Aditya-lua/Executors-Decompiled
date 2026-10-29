package ot;

import jt.o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pt.h;
import pt.j;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\u001aS\u0010\u0007\u001a\u0004\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00022\u0006\u0010\u0005\u001a\u00028\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001aW\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00022\u0006\u0010\u0005\u001a\u00028\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a%\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0007¢\u0006\u0004\b\f\u0010\r\u001a)\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0002¢\u0006\u0004\b\u000e\u0010\r¨\u0006\u000f"}, d2 = {"R", "T", "Lkotlin/Function2;", "Lnt/b;", "", "receiver", "completion", "d", "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;", "", "a", "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Lnt/b;)Lnt/b;", "c", "(Lnt/b;)Lnt/b;", "b", "kotlin-stdlib"}, k = 5, mv = {2, 2, 0}, xi = 49, xs = "kotlin/coroutines/intrinsics/IntrinsicsKt")
public class b {

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\u0014¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"ot/b$a", "Lpt/j;", "Ljt/n;", "", "result", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "t", "I", "label", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a extends j {

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
        public int label;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Function2 f27933u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Object f27934v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(nt.b bVar, Function2 function2, Object obj) {
            super(bVar);
            this.f27933u = function2;
            this.f27934v = obj;
            Intrinsics.d(bVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // pt.a
        public Object invokeSuspend(Object result) {
            int i10 = this.label;
            if (i10 == 0) {
                this.label = 1;
                o.b(result);
                Intrinsics.d(this.f27933u, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
                return ((Function2) h0.e(this.f27933u, 2)).invoke(this.f27934v, this);
            }
            if (i10 != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.label = 2;
            o.b(result);
            return result;
        }
    }

    /* JADX INFO: renamed from: ot.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\u0014¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"ot/b$b", "Lpt/d;", "Ljt/n;", "", "result", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "t", "I", "label", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0482b extends pt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
        public int label;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Function2 f27936u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Object f27937v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0482b(nt.b bVar, CoroutineContext coroutineContext, Function2 function2, Object obj) {
            super(bVar, coroutineContext);
            this.f27936u = function2;
            this.f27937v = obj;
            Intrinsics.d(bVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // pt.a
        public Object invokeSuspend(Object result) {
            int i10 = this.label;
            if (i10 == 0) {
                this.label = 1;
                o.b(result);
                Intrinsics.d(this.f27936u, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
                return ((Function2) h0.e(this.f27936u, 2)).invoke(this.f27937v, this);
            }
            if (i10 != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.label = 2;
            o.b(result);
            return result;
        }
    }

    @Metadata(d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\u0014¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"ot/b$c", "Lpt/j;", "Ljt/n;", "", "result", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c extends j {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(nt.b<? super T> bVar) {
            super(bVar);
            Intrinsics.d(bVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // pt.a
        public Object invokeSuspend(Object result) {
            o.b(result);
            return result;
        }
    }

    @Metadata(d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\u0014¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"ot/b$d", "Lpt/d;", "Ljt/n;", "", "result", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class d extends pt.d {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(nt.b<? super T> bVar, CoroutineContext coroutineContext) {
            super(bVar, coroutineContext);
            Intrinsics.d(bVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // pt.a
        public Object invokeSuspend(Object result) {
            o.b(result);
            return result;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static <R, T> nt.b<Unit> a(@NotNull Function2<? super R, ? super nt.b<? super T>, ? extends Object> function2, R r8, @NotNull nt.b<? super T> completion) {
        Intrinsics.checkNotNullParameter(function2, "<this>");
        Intrinsics.checkNotNullParameter(completion, "completion");
        nt.b<?> bVarA = h.a(completion);
        if (function2 instanceof pt.a) {
            return ((pt.a) function2).create(r8, bVarA);
        }
        CoroutineContext context = bVarA.getContext();
        return context == e.f22525a ? new a(bVarA, function2, r8) : new C0482b(bVarA, context, function2, r8);
    }

    public static final <T> nt.b<T> b(nt.b<? super T> bVar) {
        CoroutineContext context = bVar.getContext();
        return context == e.f22525a ? new c(bVar) : new d(bVar, context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static <T> nt.b<T> c(@NotNull nt.b<? super T> bVar) {
        nt.b<T> bVar2;
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        pt.d dVar = bVar instanceof pt.d ? (pt.d) bVar : null;
        return (dVar == null || (bVar2 = (nt.b<T>) dVar.intercepted()) == null) ? bVar : bVar2;
    }

    @Nullable
    public static <R, T> Object d(@NotNull Function2<? super R, ? super nt.b<? super T>, ? extends Object> function2, R r8, @NotNull nt.b<? super T> completion) {
        Intrinsics.checkNotNullParameter(function2, "<this>");
        Intrinsics.checkNotNullParameter(completion, "completion");
        return ((Function2) h0.e(function2, 2)).invoke(r8, b(h.a(completion)));
    }
}
