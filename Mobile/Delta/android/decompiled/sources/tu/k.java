package tu;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ku.i1;
import ku.k3;
import ku.p;
import ku.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qu.b0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0011\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004:\u0001>B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00028\u0000H\u0082@¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\fH\u0082@¢\u0006\u0004\b\u000f\u0010\nJ\u0017\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ!\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0016\u001a\u000e\u0018\u00010\u0015R\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00028\u0000H\u0082@¢\u0006\u0004\b\u0018\u0010\nJ!\u0010\u001a\u001a\u00020\f2\u0010\u0010\u0019\u001a\f0\u0015R\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00028\u0000H\u0091@¢\u0006\u0004\b\u001c\u0010\nJ2\u0010!\u001a\u00020\f*\u00020\u001d2\u001c\u0010 \u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001f\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u001eH\u0096\u0002¢\u0006\u0004\b!\u0010\"JD\u0010&\u001a\u00020\f\"\u0004\b\u0001\u0010#*\b\u0012\u0004\u0012\u00028\u00010$2\"\u0010 \u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001f\u0012\u0006\u0012\u0004\u0018\u00010\u00040%H\u0096\u0002¢\u0006\u0004\b&\u0010'J'\u0010*\u001a\u00020\f*\f0\u0015R\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010)\u001a\u00020(H\u0001¢\u0006\u0004\b*\u0010+J\u0017\u0010.\u001a\u00020\f2\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b.\u0010/J#\u00103\u001a\u00020\f2\n\u00101\u001a\u0006\u0012\u0002\b\u0003002\u0006\u00102\u001a\u00020\u0012H\u0016¢\u0006\u0004\b3\u00104J\u0019\u00105\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b5\u0010\u000eJ!\u00107\u001a\u00020(2\u0006\u0010\u000b\u001a\u00020\u00042\b\u00106\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b7\u00108J\u001f\u0010:\u001a\u0002092\u0006\u0010\u000b\u001a\u00020\u00042\b\u00106\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b:\u0010;J\u0019\u0010>\u001a\u00020\f2\b\u0010=\u001a\u0004\u0018\u00010<H\u0016¢\u0006\u0004\b>\u0010?R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b>\u0010@\u001a\u0004\bA\u0010BR(\u0010E\u001a\u0014\u0012\u000e\u0012\f0\u0015R\b\u0012\u0004\u0012\u00028\u00000\u0000\u0018\u00010C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u0010DR\u0018\u0010G\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010FR\u0016\u0010I\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010HR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010FR\u0014\u0010L\u001a\u00020(8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010KR\u0011\u0010N\u001a\b\u0012\u0004\u0012\u00020\u00040M8\u0002X\u0082\u0004¨\u0006O"}, d2 = {"Ltu/k;", "R", "Lku/m;", "Ltu/d;", "", "Lkotlin/coroutines/CoroutineContext;", "context", "<init>", "(Lkotlin/coroutines/CoroutineContext;)V", "q", "(Lnt/b;)Ljava/lang/Object;", "clauseObject", "", "k", "(Ljava/lang/Object;)V", "z", "w", "internalResult", "", "y", "(Ljava/lang/Object;Ljava/lang/Object;)I", "Ltu/k$a;", "r", "(Ljava/lang/Object;)Ltu/k$a;", "m", "selectedClause", "l", "(Ltu/k$a;)V", "o", "Ltu/f;", "Lkotlin/Function1;", "Lnt/b;", "block", "d", "(Ltu/f;Lkotlin/jvm/functions/Function1;)V", "Q", "Ltu/h;", "Lkotlin/Function2;", "c", "(Ltu/h;Lkotlin/jvm/functions/Function2;)V", "", "reregister", "u", "(Ltu/k$a;Z)V", "Lku/i1;", "disposableHandle", "n", "(Lku/i1;)V", "Lqu/b0;", "segment", "index", "e", "(Lqu/b0;I)V", "b", "result", "f", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "Ltu/o;", "x", "(Ljava/lang/Object;Ljava/lang/Object;)Ltu/o;", "", "cause", "a", "(Ljava/lang/Throwable;)V", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "", "Ljava/util/List;", "clauses", "Ljava/lang/Object;", "disposableHandleOrSegment", "I", "indexInSegment", "t", "()Z", "isSelected", "Lkotlinx/atomicfu/AtomicRef;", "state", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class k<R> implements ku.m, d<R>, l, k3 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f31982f = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "state$volatile");

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final CoroutineContext context;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Object disposableHandleOrSegment;
    private volatile /* synthetic */ Object state$volatile = m.b;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public List<k<R>.a> clauses = new ArrayList(2);

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public int indexInSegment = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Object internalResult = m.f32002e;

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0004\b\u0080\u0004\u0018\u00002\u00020\u0001B¿\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012(\u0010\u0007\u001a$\u0012\u0004\u0012\u00020\u0001\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00050\u0003j\u0002`\u0006\u0012(\u0010\t\u001a$\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003j\u0002`\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u000b\u001a\u00020\u0001\u0012H\u0010\u000f\u001aD\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\u0003\u0018\u00010\u0003j\u0004\u0018\u0001`\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0015\u001a\u00020\u00142\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001b\u001a\u00028\u00002\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u0086@¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u0005¢\u0006\u0004\b\u001d\u0010\u001eJ?\u0010 \u001a\u001e\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00032\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b \u0010!R\u0014\u0010\u0002\u001a\u00020\u00018\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b \u0010\"R6\u0010\u0007\u001a$\u0012\u0004\u0012\u00020\u0001\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00050\u0003j\u0002`\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010#R6\u0010\t\u001a$\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003j\u0002`\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010#R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\"R\u0014\u0010\u000b\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\"RV\u0010\u000f\u001aD\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\u0003\u0018\u00010\u0003j\u0004\u0018\u0001`\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b$\u0010#R\u0018\u0010&\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b%\u0010\"R\u0016\u0010*\u001a\u00020'8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006+"}, d2 = {"Ltu/k$a;", "", "clauseObject", "Lkotlin/Function3;", "Ltu/l;", "", "Lkotlinx/coroutines/selects/RegistrationFunction;", "regFunc", "Lkotlinx/coroutines/selects/ProcessResultFunction;", "processResFunc", "param", "block", "", "Lkotlin/coroutines/CoroutineContext;", "Lkotlinx/coroutines/selects/OnCancellationConstructor;", "onCancellationConstructor", "<init>", "(Ltu/k;Ljava/lang/Object;Lzt/n;Lzt/n;Ljava/lang/Object;Ljava/lang/Object;Lzt/n;)V", "Ltu/k;", "select", "", "e", "(Ltu/k;)Z", "result", "d", "(Ljava/lang/Object;)Ljava/lang/Object;", "argument", "c", "(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;", "b", "()V", "internalResult", "a", "(Ltu/l;Ljava/lang/Object;)Lzt/n;", "Ljava/lang/Object;", "Lzt/n;", "f", "g", "disposableHandleOrSegment", "", "h", "I", "indexInSegment", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Object clauseObject;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final zt.n<Object, l<?>, Object, Unit> regFunc;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final zt.n<Object, Object, Object, Object> processResFunc;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final Object param;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Object block;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final zt.n<l<?>, Object, Object, zt.n<Throwable, Object, CoroutineContext, Unit>> onCancellationConstructor;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Object disposableHandleOrSegment;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        public int indexInSegment = -1;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@NotNull Object obj, @NotNull zt.n<Object, ? super l<?>, Object, Unit> nVar, @Nullable zt.n<Object, Object, Object, ? extends Object> nVar2, @NotNull Object obj2, @Nullable Object obj3, zt.n<? super l<?>, Object, Object, ? extends zt.n<? super Throwable, Object, ? super CoroutineContext, Unit>> nVar3) {
            this.clauseObject = obj;
            this.regFunc = nVar;
            this.processResFunc = nVar2;
            this.param = obj2;
            this.block = obj3;
            this.onCancellationConstructor = nVar3;
        }

        @Nullable
        public final zt.n<Throwable, Object, CoroutineContext, Unit> a(@NotNull l<?> select, @Nullable Object internalResult) {
            zt.n<l<?>, Object, Object, zt.n<Throwable, Object, CoroutineContext, Unit>> nVar = this.onCancellationConstructor;
            if (nVar != null) {
                return nVar.invoke(select, this.param, internalResult);
            }
            return null;
        }

        public final void b() {
            Object obj = this.disposableHandleOrSegment;
            k<R> kVar = k.this;
            if (obj instanceof b0) {
                ((b0) obj).s(this.indexInSegment, null, kVar.getContext());
                return;
            }
            i1 i1Var = obj instanceof i1 ? (i1) obj : null;
            if (i1Var != null) {
                i1Var.a();
            }
        }

        @Nullable
        public final Object c(@Nullable Object obj, @NotNull nt.b<? super R> bVar) {
            Object obj2 = this.block;
            if (this.param == m.i()) {
                Intrinsics.d(obj2, "null cannot be cast to non-null type kotlin.coroutines.SuspendFunction0<R of kotlinx.coroutines.selects.SelectImplementation>");
                return ((Function1) obj2).invoke(bVar);
            }
            Intrinsics.d(obj2, "null cannot be cast to non-null type kotlin.coroutines.SuspendFunction1<kotlin.Any?, R of kotlinx.coroutines.selects.SelectImplementation>");
            return ((Function2) obj2).invoke(obj, bVar);
        }

        @Nullable
        public final Object d(@Nullable Object result) {
            return this.processResFunc.invoke(this.clauseObject, this.param, result);
        }

        public final boolean e(@NotNull k<R> select) {
            this.regFunc.invoke(this.clauseObject, select, this.param);
            return select.internalResult == m.f32002e;
        }
    }

    @pt.f(c = "kotlinx.coroutines.selects.SelectImplementation", f = "Select.kt", l = {453, 456}, m = "doSelectSuspend")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class b extends pt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f31995t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f31996u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ k<R> f31997v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f31998w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(k<R> kVar, nt.b<? super b> bVar) {
            super(bVar);
            this.f31997v = kVar;
        }

        @Override // pt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f31996u = obj;
            this.f31998w |= Integer.MIN_VALUE;
            return this.f31997v.q(this);
        }
    }

    public k(@NotNull CoroutineContext coroutineContext) {
        this.context = coroutineContext;
    }

    public static /* synthetic */ <R> Object p(k<R> kVar, nt.b<? super R> bVar) {
        return kVar.t() ? kVar.m(bVar) : kVar.q(bVar);
    }

    private final boolean t() {
        return f31982f.get(this) instanceof a;
    }

    public static /* synthetic */ void v(k kVar, a aVar, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: register");
        }
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        kVar.u(aVar, z10);
    }

    @Override // ku.m
    public void a(@Nullable Throwable cause) {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f31982f;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            if (obj == m.f32000c) {
                return;
            }
        } while (!y1.b.a(atomicReferenceFieldUpdater, this, obj, m.f32001d));
        List<k<R>.a> list = this.clauses;
        if (list == null) {
            return;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ((a) it.next()).b();
        }
        this.internalResult = m.f32002e;
        this.clauses = null;
    }

    @Override // tu.l
    public void b(@Nullable Object internalResult) {
        this.internalResult = internalResult;
    }

    @Override // tu.d
    public <Q> void c(@NotNull h<? extends Q> hVar, @NotNull Function2<? super Q, ? super nt.b<? super R>, ? extends Object> function2) {
        v(this, new a(hVar.getClauseObject(), hVar.a(), hVar.c(), null, function2, hVar.b()), false, 1, null);
    }

    @Override // tu.d
    public void d(@NotNull f fVar, @NotNull Function1<? super nt.b<? super R>, ? extends Object> function1) {
        v(this, new a(fVar.getClauseObject(), fVar.a(), fVar.c(), m.i(), function1, fVar.b()), false, 1, null);
    }

    @Override // ku.k3
    public void e(@NotNull b0<?> segment, int index) {
        this.disposableHandleOrSegment = segment;
        this.indexInSegment = index;
    }

    @Override // tu.l
    public boolean f(@NotNull Object clauseObject, @Nullable Object result) {
        return y(clauseObject, result) == 0;
    }

    @Override // tu.l
    @NotNull
    public CoroutineContext getContext() {
        return this.context;
    }

    public final void k(Object clauseObject) {
        List<k<R>.a> list = this.clauses;
        Intrinsics.checkNotNull(list);
        List<k<R>.a> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return;
        }
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            if (((a) it.next()).clauseObject == clauseObject) {
                throw new IllegalStateException(("Cannot use select clauses on the same object: " + clauseObject).toString());
            }
        }
    }

    public final void l(k<R>.a selectedClause) {
        List<k<R>.a> list = this.clauses;
        if (list == null) {
            return;
        }
        for (k<R>.a aVar : list) {
            if (aVar != selectedClause) {
                aVar.b();
            }
        }
        f31982f.set(this, m.f32000c);
        this.internalResult = m.f32002e;
        this.clauses = null;
    }

    public final Object m(nt.b<? super R> bVar) {
        Object obj = f31982f.get(this);
        Intrinsics.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation.ClauseData<R of kotlinx.coroutines.selects.SelectImplementation>");
        k<R>.a aVar = (a) obj;
        Object obj2 = this.internalResult;
        l(aVar);
        return aVar.c(aVar.d(obj2), bVar);
    }

    public void n(@NotNull i1 disposableHandle) {
        this.disposableHandleOrSegment = disposableHandle;
    }

    @Nullable
    public Object o(@NotNull nt.b<? super R> bVar) {
        return p(this, bVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object q(nt.b<? super R> bVar) {
        b bVar2;
        k kVar;
        if (bVar instanceof b) {
            bVar2 = (b) bVar;
            int i10 = bVar2.f31998w;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar2.f31998w = i10 - Integer.MIN_VALUE;
            } else {
                bVar2 = new b(this, bVar);
            }
        } else {
            bVar2 = new b(this, bVar);
        }
        Object obj = bVar2.f31996u;
        Object objE = ot.c.e();
        int i11 = bVar2.f31998w;
        if (i11 == 0) {
            jt.o.b(obj);
            bVar2.f31995t = this;
            bVar2.f31998w = 1;
            if (z(bVar2) != objE) {
                kVar = this;
            }
        }
        if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jt.o.b(obj);
            return obj;
        }
        k kVar2 = (k) bVar2.f31995t;
        jt.o.b(obj);
        kVar = kVar2;
        bVar2.f31995t = null;
        bVar2.f31998w = 2;
        Object objM = kVar.m(bVar2);
        return objM == objE ? objE : objM;
    }

    public final k<R>.a r(Object clauseObject) {
        List<k<R>.a> list = this.clauses;
        Object obj = null;
        if (list == null) {
            return null;
        }
        for (Object obj2 : list) {
            if (((a) obj2).clauseObject == clauseObject) {
                obj = obj2;
                break;
            }
        }
        k<R>.a aVar = (a) obj;
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalStateException(("Clause with object " + clauseObject + " is not found").toString());
    }

    public final void u(@NotNull k<R>.a aVar, boolean z10) {
        if (f31982f.get(this) instanceof a) {
            return;
        }
        if (!z10) {
            k(aVar.clauseObject);
        }
        if (!aVar.e(this)) {
            f31982f.set(this, aVar);
            return;
        }
        if (!z10) {
            List<k<R>.a> list = this.clauses;
            Intrinsics.checkNotNull(list);
            list.add(aVar);
        }
        aVar.disposableHandleOrSegment = this.disposableHandleOrSegment;
        aVar.indexInSegment = this.indexInSegment;
        this.disposableHandleOrSegment = null;
        this.indexInSegment = -1;
    }

    public final void w(Object clauseObject) {
        k<R>.a aVarR = r(clauseObject);
        Intrinsics.checkNotNull(aVarR);
        aVarR.disposableHandleOrSegment = null;
        aVarR.indexInSegment = -1;
        u(aVarR, true);
    }

    @NotNull
    public final o x(@NotNull Object clauseObject, @Nullable Object result) {
        return m.a(y(clauseObject, result));
    }

    public final int y(Object clauseObject, Object internalResult) {
        while (true) {
            Object obj = f31982f.get(this);
            if (obj instanceof ku.n) {
                k<R>.a aVarR = r(clauseObject);
                if (aVarR == null) {
                    continue;
                } else {
                    zt.n<Throwable, Object, CoroutineContext, Unit> nVarA = aVarR.a(this, internalResult);
                    if (y1.b.a(f31982f, this, obj, aVarR)) {
                        this.internalResult = internalResult;
                        if (m.j((ku.n) obj, nVarA)) {
                            return 0;
                        }
                        this.internalResult = m.f32002e;
                        return 2;
                    }
                }
            } else {
                if (Intrinsics.c(obj, m.f32000c) || (obj instanceof a)) {
                    return 3;
                }
                if (Intrinsics.c(obj, m.f32001d)) {
                    return 2;
                }
                if (Intrinsics.c(obj, m.b)) {
                    if (y1.b.a(f31982f, this, obj, kotlin.collections.o.d(clauseObject))) {
                        return 1;
                    }
                } else {
                    if (!(obj instanceof List)) {
                        throw new IllegalStateException(("Unexpected state: " + obj).toString());
                    }
                    if (y1.b.a(f31982f, this, obj, CollectionsKt.x0((Collection) obj, clauseObject))) {
                        return 1;
                    }
                }
            }
        }
    }

    public final Object z(nt.b<? super Unit> bVar) {
        p pVar = new p(ot.b.c(bVar), 1);
        pVar.H();
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f31982f;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == m.b) {
                if (y1.b.a(f31982f, this, obj, pVar)) {
                    r.c(pVar, this);
                    break;
                }
            } else {
                if (!(obj instanceof List)) {
                    if (obj instanceof a) {
                        pVar.k(Unit.f22483a, ((a) obj).a(this, this.internalResult));
                        break;
                    }
                    throw new IllegalStateException(("unexpected state: " + obj).toString());
                }
                if (y1.b.a(f31982f, this, obj, m.b)) {
                    Iterator it = ((Iterable) obj).iterator();
                    while (it.hasNext()) {
                        w(it.next());
                    }
                }
            }
        }
        Object objA = pVar.A();
        if (objA == ot.c.e()) {
            pt.h.c(bVar);
        }
        return objA == ot.c.e() ? objA : Unit.f22483a;
    }
}
