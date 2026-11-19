package fu;

import com.github.luben.zstd.BuildConfig;
import gu.h;
import gu.j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.coroutines.CoroutineContext;
import p001kotlin.coroutines.e;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.Intrinsics;
import p001kotlin.jvm.internal.h0;
import zt.o;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\u001aS\u0010\u0007\u001a\u0004\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00022\u0006\u0010\u0005\u001a\u00028\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001aW\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00022\u0006\u0010\u0005\u001a\u00028\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a%\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0007¢\u0006\u0004\b\f\u0010\r\u001a)\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0002¢\u0006\u0004\b\u000e\u0010\r¨\u0006\u000f"}, d2 = {"R", "T", "Lkotlin/Function2;", "Leu/b;", BuildConfig.FLAVOR, "receiver", "completion", "d", "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Leu/b;)Ljava/lang/Object;", BuildConfig.FLAVOR, "a", "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Leu/b;)Leu/b;", "c", "(Leu/b;)Leu/b;", "b", "kotlin-stdlib"}, k = 5, mv = {2, 2, 0}, xi = 49, xs = "kotlin/coroutines/intrinsics/IntrinsicsKt")
public class b {

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\u0014¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"fu/b$a", "Lgu/j;", "Lzt/n;", BuildConfig.FLAVOR, "result", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", BuildConfig.FLAVOR, "t", "I", "label", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a extends j {

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
        public int label;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Function2 f16624u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Object f16625v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(eu.b bVar, Function2 function2, Object obj) {
            super(bVar);
            this.f16624u = function2;
            this.f16625v = obj;
            Intrinsics.d(bVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // gu.a
        public Object invokeSuspend(Object result) {
            int i10 = this.label;
            if (i10 == 0) {
                this.label = 1;
                o.b(result);
                Intrinsics.d(this.f16624u, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
                return ((Function2) h0.e(this.f16624u, 2)).invoke(this.f16625v, this);
            }
            if (i10 != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.label = 2;
            o.b(result);
            return result;
        }
    }

    /* JADX INFO: renamed from: fu.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\u0014¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"fu/b$b", "Lgu/d;", "Lzt/n;", BuildConfig.FLAVOR, "result", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", BuildConfig.FLAVOR, "t", "I", "label", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0315b extends gu.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
        public int label;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Function2 f16627u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Object f16628v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0315b(eu.b bVar, CoroutineContext coroutineContext, Function2 function2, Object obj) {
            super(bVar, coroutineContext);
            this.f16627u = function2;
            this.f16628v = obj;
            Intrinsics.d(bVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // gu.a
        public Object invokeSuspend(Object result) {
            int i10 = this.label;
            if (i10 == 0) {
                this.label = 1;
                o.b(result);
                Intrinsics.d(this.f16627u, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
                return ((Function2) h0.e(this.f16627u, 2)).invoke(this.f16628v, this);
            }
            if (i10 != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.label = 2;
            o.b(result);
            return result;
        }
    }

    @Metadata(d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\u0014¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"fu/b$c", "Lgu/j;", "Lzt/n;", BuildConfig.FLAVOR, "result", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c extends j {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(eu.b<? super T> bVar) {
            super(bVar);
            Intrinsics.d(bVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // gu.a
        public Object invokeSuspend(Object result) {
            o.b(result);
            return result;
        }
    }

    @Metadata(d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\u0014¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"fu/b$d", "Lgu/d;", "Lzt/n;", BuildConfig.FLAVOR, "result", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class d extends gu.d {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(eu.b<? super T> bVar, CoroutineContext coroutineContext) {
            super(bVar, coroutineContext);
            Intrinsics.d(bVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // gu.a
        public Object invokeSuspend(Object result) {
            o.b(result);
            return result;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static <R, T> eu.b<Unit> a(@NotNull Function2<? super R, ? super eu.b<? super T>, ? extends Object> function2, R r10, @NotNull eu.b<? super T> completion) {
        Intrinsics.checkNotNullParameter(function2, "<this>");
        Intrinsics.checkNotNullParameter(completion, "completion");
        eu.b<?> bVarA = h.a(completion);
        if (function2 instanceof gu.a) {
            return ((gu.a) function2).create(r10, bVarA);
        }
        CoroutineContext context = bVarA.getContext();
        return context == e.f21548a ? new a(bVarA, function2, r10) : new C0315b(bVarA, context, function2, r10);
    }

    public static final <T> eu.b<T> b(eu.b<? super T> bVar) {
        CoroutineContext context = bVar.getContext();
        return context == e.f21548a ? new c(bVar) : new d(bVar, context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static <T> eu.b<T> c(@NotNull eu.b<? super T> bVar) {
        eu.b<T> bVar2;
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        gu.d dVar = bVar instanceof gu.d ? (gu.d) bVar : null;
        return (dVar == null || (bVar2 = (eu.b<T>) dVar.intercepted()) == null) ? bVar : bVar2;
    }

    @Nullable
    public static <R, T> Object d(@NotNull Function2<? super R, ? super eu.b<? super T>, ? extends Object> function2, R r10, @NotNull eu.b<? super T> completion) {
        Intrinsics.checkNotNullParameter(function2, "<this>");
        Intrinsics.checkNotNullParameter(completion, "completion");
        return ((Function2) h0.e(function2, 2)).invoke(r10, b(h.a(completion)));
    }
}
