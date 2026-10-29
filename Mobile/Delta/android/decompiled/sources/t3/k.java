package t3;

import com.google.mlkit.common.MlKitException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ku.d2;
import ku.p0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 f*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0002\u00136Ba\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u00120\b\u0002\u0010\u000b\u001a*\u0012&\u0012$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00060\u0005\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J4\u0010\u0013\u001a\u00028\u00002\"\u0010\u0012\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0006H\u0096@¢\u0006\u0004\b\u0013\u0010\u0014J \u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00020\u0016H\u0080@¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\tH\u0082@¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\tH\u0082@¢\u0006\u0004\b\u001d\u0010\u001cJ\u001e\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001f2\u0006\u0010\u001e\u001a\u00020\u0016H\u0082@¢\u0006\u0004\b \u0010!J\u001e\u0010$\u001a\u00020\t2\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\"H\u0082@¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\tH\u0082@¢\u0006\u0004\b&\u0010\u001cJ\u001e\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000\u001f2\u0006\u0010\u001e\u001a\u00020\u0016H\u0082@¢\u0006\u0004\b'\u0010!J\u0010\u0010(\u001a\u00028\u0000H\u0082@¢\u0006\u0004\b(\u0010\u001cJ<\u0010+\u001a\u00028\u00002\"\u0010\u0012\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00062\u0006\u0010*\u001a\u00020)H\u0082@¢\u0006\u0004\b+\u0010,J\u001e\u0010/\u001a\b\u0012\u0004\u0012\u00028\u00000.2\u0006\u0010-\u001a\u00020\u0016H\u0082@¢\u0006\u0004\b/\u0010!JI\u00103\u001a\u00028\u0001\"\u0004\b\u0001\u001002\u0006\u0010-\u001a\u00020\u00162\u001c\u00102\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\n01H\u0082@\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b3\u00104R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u00105R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R \u0010?\u001a\b\u0012\u0004\u0012\u00028\u00000:8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u0014\u0010C\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0016\u0010F\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0018\u0010J\u001a\u0004\u0018\u00010G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u001a\u0010N\u001a\b\u0012\u0004\u0012\u00028\u00000K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u001e\u0010R\u001a\f0OR\b\u0012\u0004\u0012\u00028\u00000\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR \u0010W\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000T0S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u001b\u0010\\\u001a\u00020X8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bY\u0010V\u001a\u0004\bZ\u0010[R \u0010`\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\"0]8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R!\u0010e\u001a\b\u0012\u0004\u0012\u00028\u00000T8@X\u0080\u0084\u0002¢\u0006\f\u001a\u0004\ba\u0010b*\u0004\bc\u0010d¨\u0006g"}, d2 = {"Lt3/k;", "T", "Lt3/i;", "Lt3/e0;", "storage", "", "Lkotlin/Function2;", "Lt3/s;", "Lnt/b;", "", "", "initTasksList", "Lt3/e;", "corruptionHandler", "Lku/p0;", "scope", "<init>", "(Lt3/e0;Ljava/util/List;Lt3/e;Lku/p0;)V", "transform", "a", "(Lkotlin/jvm/functions/Function2;Lnt/b;)Ljava/lang/Object;", "newData", "", "updateCache", "", "B", "(Ljava/lang/Object;ZLnt/b;)Ljava/lang/Object;", "u", "(Lnt/b;)Ljava/lang/Object;", "p", "requireLock", "Lt3/d0;", "z", "(ZLnt/b;)Ljava/lang/Object;", "Lt3/w$a;", "update", "t", "(Lt3/w$a;Lnt/b;)Ljava/lang/Object;", "v", "w", "x", "Lkotlin/coroutines/CoroutineContext;", "callerContext", "A", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/CoroutineContext;Lnt/b;)Ljava/lang/Object;", "hasWriteFileLock", "Lt3/f;", "y", "R", "Lkotlin/Function1;", "block", "q", "(ZLkotlin/jvm/functions/Function1;Lnt/b;)Ljava/lang/Object;", "Lt3/e0;", "b", "Lt3/e;", "c", "Lku/p0;", "Lnu/h;", "d", "Lnu/h;", "getData", "()Lnu/h;", "data", "Luu/a;", "e", "Luu/a;", "collectorMutex", "f", "I", "collectorCounter", "Lku/d2;", "g", "Lku/d2;", "collectorJob", "Lt3/l;", "h", "Lt3/l;", "inMemoryCache", "Lt3/k$b;", "i", "Lt3/k$b;", "readAndInit", "Ljt/h;", "Lt3/f0;", "j", "Ljt/h;", "storageConnectionDelegate", "Lt3/t;", "k", "r", "()Lt3/t;", "coordinator", "Lt3/b0;", "l", "Lt3/b0;", "writeActor", "s", "()Lt3/f0;", "getStorageConnection$datastore_core_release$delegate", "(Lt3/k;)Ljava/lang/Object;", "storageConnection", "m", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class k<T> implements t3.i<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final e0<T> storage;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final t3.e<T> corruptionHandler;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final p0 scope;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final nu.h<T> data;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final uu.a collectorMutex;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public int collectorCounter;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public d2 collectorJob;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final t3.l<T> inMemoryCache;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final k<T>.b readAndInit;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final jt.h<f0<T>> storageConnectionDelegate;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final jt.h coordinator;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final b0<t3.w.a<T>> writeActor;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0082\u0004\u0018\u00002\u00020\u0001B7\u0012.\u0010\b\u001a*\u0012&\u0012$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00030\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0006H\u0094@¢\u0006\u0004\b\u000b\u0010\fR@\u0010\u000f\u001a,\u0012&\u0012$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lt3/k$b;", "Lt3/z;", "", "Lkotlin/Function2;", "Lt3/s;", "Lnt/b;", "", "", "initTasksList", "<init>", "(Lt3/k;Ljava/util/List;)V", "b", "(Lnt/b;)Ljava/lang/Object;", "c", "Ljava/util/List;", "initTasks", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class b extends z {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public List<? extends Function2<? super t3.s<T>, ? super nt.b<? super Unit>, ? extends Object>> initTasks;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ k<T> f31411d;

        @pt.f(c = "androidx.datastore.core.DataStoreImpl$InitDataStore", f = "DataStoreImpl.kt", l = {430, 434}, m = "doRun")
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class a extends pt.d {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public Object f31412t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public /* synthetic */ Object f31413u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ k<T>.b f31414v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public int f31415w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(k<T>.b bVar, nt.b<? super a> bVar2) {
                super(bVar2);
                this.f31414v = bVar;
            }

            @Override // pt.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f31413u = obj;
                this.f31415w |= Integer.MIN_VALUE;
                return this.f31414v.b(this);
            }
        }

        /* JADX INFO: renamed from: t3.k$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "Lt3/f;", "<anonymous>", "()Lt3/f;"}, k = 3, mv = {1, 8, 0})
        @pt.f(c = "androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$initData$1", f = "DataStoreImpl.kt", l = {437, 458, 546, 468}, m = "invokeSuspend")
        public static final class C0558b extends pt.m implements Function1<nt.b<? super t3.f<T>>, Object> {
            public final /* synthetic */ k<T> A;
            public final /* synthetic */ k<T>.b B;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public Object f31416t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public Object f31417u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public Object f31418v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public Object f31419w;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            public Object f31420x;

            /* JADX INFO: renamed from: y, reason: collision with root package name */
            public int f31421y;

            /* JADX INFO: renamed from: z, reason: collision with root package name */
            public int f31422z;

            /* JADX INFO: renamed from: t3.k$b$b$a */
            @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J4\u0010\u0006\u001a\u00028\u00002\"\u0010\u0005\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002H\u0096@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"t3/k$b$b$a", "Lt3/s;", "Lkotlin/Function2;", "Lnt/b;", "", "transform", "a", "(Lkotlin/jvm/functions/Function2;Lnt/b;)Ljava/lang/Object;", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class a implements t3.s<T> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ uu.a f31423a;
                public final /* synthetic */ kotlin.jvm.internal.y b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ kotlin.jvm.internal.c0<T> f31424c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ k<T> f31425d;

                /* JADX INFO: renamed from: t3.k$b$b$a$a, reason: collision with other inner class name */
                @pt.f(c = "androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$initData$1$api$1", f = "DataStoreImpl.kt", l = {544, 447, 449}, m = "updateData")
                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                public static final class C0559a extends pt.d {
                    public int A;

                    /* JADX INFO: renamed from: t, reason: collision with root package name */
                    public Object f31426t;

                    /* JADX INFO: renamed from: u, reason: collision with root package name */
                    public Object f31427u;

                    /* JADX INFO: renamed from: v, reason: collision with root package name */
                    public Object f31428v;

                    /* JADX INFO: renamed from: w, reason: collision with root package name */
                    public Object f31429w;

                    /* JADX INFO: renamed from: x, reason: collision with root package name */
                    public Object f31430x;

                    /* JADX INFO: renamed from: y, reason: collision with root package name */
                    public /* synthetic */ Object f31431y;

                    public C0559a(nt.b bVar) {
                        super(bVar);
                    }

                    @Override // pt.a
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.f31431y = obj;
                        this.A |= Integer.MIN_VALUE;
                        return a.this.a(null, this);
                    }
                }

                public a(uu.a aVar, kotlin.jvm.internal.y yVar, kotlin.jvm.internal.c0<T> c0Var, k<T> kVar) {
                    this.f31423a = aVar;
                    this.b = yVar;
                    this.f31424c = c0Var;
                    this.f31425d = kVar;
                }

                /* JADX WARN: Code duplicated, block: B:38:0x00ba A[Catch: all -> 0x0056, TRY_LEAVE, TryCatch #0 {all -> 0x0056, blocks: (B:21:0x0052, B:36:0x00b2, B:38:0x00ba), top: B:53:0x0052 }] */
                /* JADX WARN: Code duplicated, block: B:41:0x00ca  */
                /* JADX WARN: Code duplicated, block: B:43:0x00d1  */
                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // t3.s
                @Nullable
                public Object a(@NotNull Function2<? super T, ? super nt.b<? super T>, ? extends Object> function2, @NotNull nt.b<? super T> bVar) throws Throwable {
                    C0559a c0559a;
                    uu.a aVar;
                    k kVar;
                    kotlin.jvm.internal.y yVar;
                    kotlin.jvm.internal.c0<T> c0Var;
                    uu.a aVar2;
                    uu.a aVar3;
                    k kVar2;
                    T t8;
                    kotlin.jvm.internal.c0<T> c0Var2;
                    if (bVar instanceof C0559a) {
                        c0559a = (C0559a) bVar;
                        int i10 = c0559a.A;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            c0559a.A = i10 - Integer.MIN_VALUE;
                        } else {
                            c0559a = new C0559a(bVar);
                        }
                    } else {
                        c0559a = new C0559a(bVar);
                    }
                    Object obj = c0559a.f31431y;
                    Object objE = ot.c.e();
                    int i11 = c0559a.A;
                    try {
                        if (i11 == 0) {
                            jt.o.b(obj);
                            aVar = this.f31423a;
                            kotlin.jvm.internal.y yVar2 = this.b;
                            kotlin.jvm.internal.c0<T> c0Var3 = this.f31424c;
                            kVar = this.f31425d;
                            c0559a.f31426t = function2;
                            c0559a.f31427u = aVar;
                            c0559a.f31428v = yVar2;
                            c0559a.f31429w = c0Var3;
                            c0559a.f31430x = kVar;
                            c0559a.A = 1;
                            if (aVar.f(null, c0559a) != objE) {
                                yVar = yVar2;
                                c0Var = c0Var3;
                            }
                            return objE;
                        }
                        if (i11 != 1) {
                            if (i11 != 2) {
                                if (i11 != 3) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                t8 = (T) c0559a.f31428v;
                                c0Var2 = (kotlin.jvm.internal.c0) c0559a.f31427u;
                                aVar2 = (uu.a) c0559a.f31426t;
                                try {
                                    jt.o.b(obj);
                                    c0Var2.f22552a = t8;
                                    c0Var = c0Var2;
                                    T t10 = c0Var.f22552a;
                                    aVar2.e(null);
                                    return t10;
                                } catch (Throwable th2) {
                                    th = th2;
                                    aVar2.e(null);
                                    throw th;
                                }
                            }
                            k kVar3 = (k) c0559a.f31428v;
                            c0Var = (kotlin.jvm.internal.c0) c0559a.f31427u;
                            aVar3 = (uu.a) c0559a.f31426t;
                            try {
                                jt.o.b(obj);
                                kVar2 = kVar3;
                                if (!Intrinsics.c(obj, c0Var.f22552a)) {
                                    c0559a.f31426t = aVar3;
                                    c0559a.f31427u = c0Var;
                                    c0559a.f31428v = obj;
                                    c0559a.A = 3;
                                    if (kVar2.B(obj, false, c0559a) != objE) {
                                        t8 = (T) obj;
                                        c0Var2 = c0Var;
                                        aVar2 = aVar3;
                                        c0Var2.f22552a = t8;
                                        c0Var = c0Var2;
                                    }
                                    return objE;
                                }
                                aVar2 = aVar3;
                                T t11 = c0Var.f22552a;
                                aVar2.e(null);
                                return t11;
                            } catch (Throwable th3) {
                                th = th3;
                                aVar2 = aVar3;
                                aVar2.e(null);
                                throw th;
                            }
                        }
                        k kVar4 = (k) c0559a.f31430x;
                        c0Var = (kotlin.jvm.internal.c0) c0559a.f31429w;
                        yVar = (kotlin.jvm.internal.y) c0559a.f31428v;
                        uu.a aVar4 = (uu.a) c0559a.f31427u;
                        Function2<? super T, ? super nt.b<? super T>, ? extends Object> function3 = (Function2) c0559a.f31426t;
                        jt.o.b(obj);
                        kVar = kVar4;
                        function2 = function3;
                        aVar = aVar4;
                        if (yVar.f22568a) {
                            throw new IllegalStateException("InitializerApi.updateData should not be called after initialization is complete.");
                        }
                        T t12 = c0Var.f22552a;
                        c0559a.f31426t = aVar;
                        c0559a.f31427u = c0Var;
                        c0559a.f31428v = kVar;
                        c0559a.f31429w = null;
                        c0559a.f31430x = null;
                        c0559a.A = 2;
                        Object objInvoke = function2.invoke(t12, c0559a);
                        if (objInvoke != objE) {
                            aVar3 = aVar;
                            obj = objInvoke;
                            kVar2 = kVar;
                            if (!Intrinsics.c(obj, c0Var.f22552a)) {
                                c0559a.f31426t = aVar3;
                                c0559a.f31427u = c0Var;
                                c0559a.f31428v = obj;
                                c0559a.A = 3;
                                if (kVar2.B(obj, false, c0559a) != objE) {
                                    t8 = (T) obj;
                                    c0Var2 = c0Var;
                                    aVar2 = aVar3;
                                    c0Var2.f22552a = t8;
                                    c0Var = c0Var2;
                                }
                            } else {
                                aVar2 = aVar3;
                            }
                            T t13 = c0Var.f22552a;
                            aVar2.e(null);
                            return t13;
                        }
                        return objE;
                    } catch (Throwable th4) {
                        th = th4;
                        aVar2 = aVar;
                        aVar2.e(null);
                        throw th;
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0558b(k<T> kVar, k<T>.b bVar, nt.b<? super C0558b> bVar2) {
                super(1, bVar2);
                this.A = kVar;
                this.B = bVar;
            }

            @Override // pt.a
            @NotNull
            public final nt.b<Unit> create(@NotNull nt.b<?> bVar) {
                return new C0558b(this.A, this.B, bVar);
            }

            /* JADX WARN: Code duplicated, block: B:23:0x00b1  */
            /* JADX WARN: Code duplicated, block: B:31:0x00e8  */
            /* JADX WARN: Code duplicated, block: B:35:0x00f4  */
            /* JADX WARN: Code duplicated, block: B:39:0x010f  */
            /* JADX WARN: Code duplicated, block: B:48:0x010e A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:50:? A[LOOP:0: B:21:0x00ab->B:50:?, LOOP_END, SYNTHETIC] */
            @Override // pt.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) throws t3.d {
                uu.a aVarB;
                kotlin.jvm.internal.y yVar;
                kotlin.jvm.internal.c0 c0Var;
                kotlin.jvm.internal.c0 c0Var2;
                kotlin.jvm.internal.y yVar2;
                uu.a aVar;
                Iterator<T> it;
                uu.a aVar2;
                kotlin.jvm.internal.y yVar3;
                kotlin.jvm.internal.c0 c0Var3;
                a aVar3;
                kotlin.jvm.internal.c0 c0Var4;
                Function2 function2;
                Object obj2;
                int iHashCode;
                int i10;
                Object objE = ot.c.e();
                int i11 = this.f31422z;
                if (i11 == 0) {
                    jt.o.b(obj);
                    aVarB = uu.g.b(false, 1, null);
                    yVar = new kotlin.jvm.internal.y();
                    c0Var = new kotlin.jvm.internal.c0();
                    k<T> kVar = this.A;
                    this.f31416t = aVarB;
                    this.f31417u = yVar;
                    this.f31418v = c0Var;
                    this.f31419w = c0Var;
                    this.f31422z = 1;
                    obj = kVar.y(true, this);
                    if (obj != objE) {
                        c0Var2 = c0Var;
                    }
                    return objE;
                }
                if (i11 == 1) {
                    c0Var = (kotlin.jvm.internal.c0) this.f31419w;
                    c0Var2 = (kotlin.jvm.internal.c0) this.f31418v;
                    yVar = (kotlin.jvm.internal.y) this.f31417u;
                    aVarB = (uu.a) this.f31416t;
                    jt.o.b(obj);
                } else {
                    if (i11 == 2) {
                        it = (Iterator) this.f31420x;
                        aVar3 = (a) this.f31419w;
                        c0Var3 = (kotlin.jvm.internal.c0) this.f31418v;
                        yVar3 = (kotlin.jvm.internal.y) this.f31417u;
                        aVar2 = (uu.a) this.f31416t;
                        jt.o.b(obj);
                        while (it.hasNext()) {
                            function2 = (Function2) it.next();
                            this.f31416t = aVar2;
                            this.f31417u = yVar3;
                            this.f31418v = c0Var3;
                            this.f31419w = aVar3;
                            this.f31420x = it;
                            this.f31422z = 2;
                            if (function2.invoke(aVar3, this) == objE) {
                                return objE;
                            }
                        }
                        c0Var2 = c0Var3;
                        yVar2 = yVar3;
                        aVar = aVar2;
                        this.B.initTasks = null;
                        this.f31416t = yVar2;
                        this.f31417u = c0Var2;
                        this.f31418v = aVar;
                        this.f31419w = null;
                        this.f31420x = null;
                        this.f31422z = 3;
                        if (aVar.f(null, this) != objE) {
                            c0Var4 = c0Var2;
                            yVar2.f22568a = true;
                            Unit unit = Unit.f22483a;
                            aVar.e(null);
                            obj2 = c0Var4.f22552a;
                            if (obj2 != null) {
                            }
                            t3.t tVarR = this.A.r();
                            this.f31416t = obj2;
                            this.f31417u = null;
                            this.f31418v = null;
                            this.f31421y = iHashCode;
                            this.f31422z = 4;
                            obj = tVarR.c(this);
                            if (obj != objE) {
                                i10 = iHashCode;
                            }
                        }
                        return objE;
                    }
                    if (i11 == 3) {
                        aVar = (uu.a) this.f31418v;
                        c0Var4 = (kotlin.jvm.internal.c0) this.f31417u;
                        yVar2 = (kotlin.jvm.internal.y) this.f31416t;
                        jt.o.b(obj);
                        try {
                            yVar2.f22568a = true;
                            Unit unit2 = Unit.f22483a;
                            aVar.e(null);
                            obj2 = c0Var4.f22552a;
                            iHashCode = obj2 != null ? obj2.hashCode() : 0;
                            t3.t tVarR2 = this.A.r();
                            this.f31416t = obj2;
                            this.f31417u = null;
                            this.f31418v = null;
                            this.f31421y = iHashCode;
                            this.f31422z = 4;
                            obj = tVarR2.c(this);
                            if (obj != objE) {
                                i10 = iHashCode;
                            }
                            return objE;
                        } catch (Throwable th2) {
                            aVar.e(null);
                            throw th2;
                        }
                    }
                    if (i11 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i10 = this.f31421y;
                    obj2 = this.f31416t;
                    jt.o.b(obj);
                }
                return new t3.f(obj2, i10, ((Number) obj).intValue());
                c0Var.f22552a = (T) ((t3.f) obj).c();
                a aVar4 = new a(aVarB, yVar, c0Var2, this.A);
                List list = this.B.initTasks;
                if (list != null) {
                    it = list.iterator();
                    aVar2 = aVarB;
                    yVar3 = yVar;
                    c0Var3 = c0Var2;
                    aVar3 = aVar4;
                    while (it.hasNext()) {
                        function2 = (Function2) it.next();
                        this.f31416t = aVar2;
                        this.f31417u = yVar3;
                        this.f31418v = c0Var3;
                        this.f31419w = aVar3;
                        this.f31420x = it;
                        this.f31422z = 2;
                        if (function2.invoke(aVar3, this) == objE) {
                            return objE;
                        }
                    }
                    c0Var2 = c0Var3;
                    yVar2 = yVar3;
                    aVar = aVar2;
                } else {
                    yVar2 = yVar;
                    aVar = aVarB;
                }
                this.B.initTasks = null;
                this.f31416t = yVar2;
                this.f31417u = c0Var2;
                this.f31418v = aVar;
                this.f31419w = null;
                this.f31420x = null;
                this.f31422z = 3;
                if (aVar.f(null, this) != objE) {
                    c0Var4 = c0Var2;
                    yVar2.f22568a = true;
                    Unit unit3 = Unit.f22483a;
                    aVar.e(null);
                    obj2 = c0Var4.f22552a;
                    if (obj2 != null) {
                    }
                    t3.t tVarR3 = this.A.r();
                    this.f31416t = obj2;
                    this.f31417u = null;
                    this.f31418v = null;
                    this.f31421y = iHashCode;
                    this.f31422z = 4;
                    obj = tVarR3.c(this);
                    if (obj != objE) {
                        i10 = iHashCode;
                        return new t3.f(obj2, i10, ((Number) obj).intValue());
                    }
                }
                return objE;
            }

            @Override // kotlin.jvm.functions.Function1
            @Nullable
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@Nullable nt.b<? super t3.f<T>> bVar) {
                return ((C0558b) create(bVar)).invokeSuspend(Unit.f22483a);
            }
        }

        public b(@NotNull k kVar, List<? extends Function2<? super t3.s<T>, ? super nt.b<? super Unit>, ? extends Object>> initTasksList) {
            Intrinsics.checkNotNullParameter(initTasksList, "initTasksList");
            this.f31411d = kVar;
            this.initTasks = CollectionsKt.M0(initTasksList);
        }

        /* JADX WARN: Code duplicated, block: B:26:0x006e  */
        /* JADX WARN: Code duplicated, block: B:29:0x007c  */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // t3.z
        @Nullable
        public Object b(@NotNull nt.b<? super Unit> bVar) throws t3.d {
            a aVar;
            b bVar2;
            t3.f fVar;
            if (bVar instanceof a) {
                aVar = (a) bVar;
                int i10 = aVar.f31415w;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    aVar.f31415w = i10 - Integer.MIN_VALUE;
                } else {
                    aVar = new a(this, bVar);
                }
            } else {
                aVar = new a(this, bVar);
            }
            Object objY = aVar.f31413u;
            Object objE = ot.c.e();
            int i11 = aVar.f31415w;
            if (i11 == 0) {
                jt.o.b(objY);
                List<? extends Function2<? super t3.s<T>, ? super nt.b<? super Unit>, ? extends Object>> list = this.initTasks;
                if (list != null) {
                    Intrinsics.checkNotNull(list);
                    if (list.isEmpty()) {
                        k<T> kVar = this.f31411d;
                        aVar.f31412t = this;
                        aVar.f31415w = 1;
                        objY = kVar.y(false, aVar);
                        if (objY != objE) {
                            bVar2 = this;
                            fVar = (t3.f) objY;
                        }
                    } else {
                        t3.t tVarR = this.f31411d.r();
                        C0558b c0558b = new C0558b(this.f31411d, this, null);
                        aVar.f31412t = this;
                        aVar.f31415w = 2;
                        objY = tVarR.b(c0558b, aVar);
                        if (objY != objE) {
                            bVar2 = this;
                            fVar = (t3.f) objY;
                        }
                    }
                } else {
                    k<T> kVar2 = this.f31411d;
                    aVar.f31412t = this;
                    aVar.f31415w = 1;
                    objY = kVar2.y(false, aVar);
                    if (objY != objE) {
                        bVar2 = this;
                        fVar = (t3.f) objY;
                    }
                }
                return objE;
            }
            if (i11 == 1) {
                bVar2 = (b) aVar.f31412t;
                jt.o.b(objY);
                fVar = (t3.f) objY;
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bVar2 = (b) aVar.f31412t;
                jt.o.b(objY);
                fVar = (t3.f) objY;
            }
            bVar2.f31411d.inMemoryCache.c(fVar);
            return Unit.f22483a;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "Lt3/t;", "b", "()Lt3/t;"}, k = 3, mv = {1, 8, 0})
    public static final class c extends kotlin.jvm.internal.m implements Function0<t3.t> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ k<T> f31433i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(k<T> kVar) {
            super(0);
            this.f31433i = kVar;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final t3.t invoke() {
            return this.f31433i.s().getCoordinator();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lnu/i;", "", "<anonymous>", "(Lnu/i;)V"}, k = 3, mv = {1, 8, 0})
    @pt.f(c = "androidx.datastore.core.DataStoreImpl$data$1", f = "DataStoreImpl.kt", l = {72, 74, 100}, m = "invokeSuspend")
    public static final class d extends pt.m implements Function2<nu.i<? super T>, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f31434t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f31435u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f31436v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ k<T> f31437w;

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lnu/i;", "Lt3/d0;", "", "<anonymous>", "(Lnu/i;)V"}, k = 3, mv = {1, 8, 0})
        @pt.f(c = "androidx.datastore.core.DataStoreImpl$data$1$1", f = "DataStoreImpl.kt", l = {102}, m = "invokeSuspend")
        public static final class a extends pt.m implements Function2<nu.i<? super d0<T>>, nt.b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f31438t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ k<T> f31439u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(k<T> kVar, nt.b<? super a> bVar) {
                super(2, bVar);
                this.f31439u = kVar;
            }

            @Override // pt.a
            @NotNull
            public final nt.b<Unit> create(@Nullable Object obj, @NotNull nt.b<?> bVar) {
                return new a(this.f31439u, bVar);
            }

            @Override // pt.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object objE = ot.c.e();
                int i10 = this.f31438t;
                if (i10 == 0) {
                    jt.o.b(obj);
                    k<T> kVar = this.f31439u;
                    this.f31438t = 1;
                    if (kVar.u(this) == objE) {
                        return objE;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jt.o.b(obj);
                }
                return Unit.f22483a;
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@NotNull nu.i<? super d0<T>> iVar, @Nullable nt.b<? super Unit> bVar) {
                return ((a) create(iVar, bVar)).invokeSuspend(Unit.f22483a);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lt3/d0;", "it", "", "<anonymous>", "(Lt3/d0;)Z"}, k = 3, mv = {1, 8, 0})
        @pt.f(c = "androidx.datastore.core.DataStoreImpl$data$1$2", f = "DataStoreImpl.kt", l = {}, m = "invokeSuspend")
        public static final class b extends pt.m implements Function2<d0<T>, nt.b<? super Boolean>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f31440t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public /* synthetic */ Object f31441u;

            public b(nt.b<? super b> bVar) {
                super(2, bVar);
            }

            @Override // pt.a
            @NotNull
            public final nt.b<Unit> create(@Nullable Object obj, @NotNull nt.b<?> bVar) {
                b bVar2 = new b(bVar);
                bVar2.f31441u = obj;
                return bVar2;
            }

            @Override // pt.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                ot.c.e();
                if (this.f31440t != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jt.o.b(obj);
                return pt.b.a(!(((d0) this.f31441u) instanceof t3.r));
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@NotNull d0<T> d0Var, @Nullable nt.b<? super Boolean> bVar) {
                return ((b) create(d0Var, bVar)).invokeSuspend(Unit.f22483a);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lt3/d0;", "it", "", "<anonymous>", "(Lt3/d0;)Z"}, k = 3, mv = {1, 8, 0})
        @pt.f(c = "androidx.datastore.core.DataStoreImpl$data$1$3", f = "DataStoreImpl.kt", l = {}, m = "invokeSuspend")
        public static final class c extends pt.m implements Function2<d0<T>, nt.b<? super Boolean>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f31442t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public /* synthetic */ Object f31443u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ d0<T> f31444v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(d0<T> d0Var, nt.b<? super c> bVar) {
                super(2, bVar);
                this.f31444v = d0Var;
            }

            @Override // pt.a
            @NotNull
            public final nt.b<Unit> create(@Nullable Object obj, @NotNull nt.b<?> bVar) {
                c cVar = new c(this.f31444v, bVar);
                cVar.f31443u = obj;
                return cVar;
            }

            @Override // pt.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                ot.c.e();
                if (this.f31442t != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jt.o.b(obj);
                d0 d0Var = (d0) this.f31443u;
                return pt.b.a((d0Var instanceof t3.f) && d0Var.getVersion() <= this.f31444v.getVersion());
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@NotNull d0<T> d0Var, @Nullable nt.b<? super Boolean> bVar) {
                return ((c) create(d0Var, bVar)).invokeSuspend(Unit.f22483a);
            }
        }

        /* JADX INFO: renamed from: t3.k$d$d, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lnu/i;", "", "it", "", "<anonymous>", "(Lnu/i;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
        @pt.f(c = "androidx.datastore.core.DataStoreImpl$data$1$5", f = "DataStoreImpl.kt", l = {116}, m = "invokeSuspend")
        public static final class C0560d extends pt.m implements zt.n<nu.i<? super T>, Throwable, nt.b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f31445t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ k<T> f31446u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0560d(k<T> kVar, nt.b<? super C0560d> bVar) {
                super(3, bVar);
                this.f31446u = kVar;
            }

            @Override // pt.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object objE = ot.c.e();
                int i10 = this.f31445t;
                if (i10 == 0) {
                    jt.o.b(obj);
                    k<T> kVar = this.f31446u;
                    this.f31445t = 1;
                    if (kVar.p(this) == objE) {
                        return objE;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jt.o.b(obj);
                }
                return Unit.f22483a;
            }

            @Override // zt.n
            @Nullable
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@NotNull nu.i<? super T> iVar, @Nullable Throwable th2, @Nullable nt.b<? super Unit> bVar) {
                return new C0560d(this.f31446u, bVar).invokeSuspend(Unit.f22483a);
            }
        }

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lnu/h;", "Lnu/i;", "collector", "", "collect", "(Lnu/i;Lnt/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class e implements nu.h<T> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ nu.h f31447a;

            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            public static final class a<T> implements nu.i {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ nu.i f31448a;

                /* JADX INFO: renamed from: t3.k$d$e$a$a, reason: collision with other inner class name */
                @pt.f(c = "androidx.datastore.core.DataStoreImpl$data$1$invokeSuspend$$inlined$map$1$2", f = "DataStoreImpl.kt", l = {223}, m = "emit")
                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                public static final class C0561a extends pt.d {

                    /* JADX INFO: renamed from: t, reason: collision with root package name */
                    public /* synthetic */ Object f31449t;

                    /* JADX INFO: renamed from: u, reason: collision with root package name */
                    public int f31450u;

                    public C0561a(nt.b bVar) {
                        super(bVar);
                    }

                    @Override // pt.a
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.f31449t = obj;
                        this.f31450u |= Integer.MIN_VALUE;
                        return a.this.emit(null, this);
                    }
                }

                public a(nu.i iVar) {
                    this.f31448a = iVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // nu.i
                @Nullable
                public final Object emit(Object obj, @NotNull nt.b bVar) throws Throwable {
                    C0561a c0561a;
                    if (bVar instanceof C0561a) {
                        c0561a = (C0561a) bVar;
                        int i10 = c0561a.f31450u;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            c0561a.f31450u = i10 - Integer.MIN_VALUE;
                        } else {
                            c0561a = new C0561a(bVar);
                        }
                    } else {
                        c0561a = new C0561a(bVar);
                    }
                    Object obj2 = c0561a.f31449t;
                    Object objE = ot.c.e();
                    int i11 = c0561a.f31450u;
                    if (i11 == 0) {
                        jt.o.b(obj2);
                        nu.i iVar = this.f31448a;
                        d0 d0Var = (d0) obj;
                        if (d0Var instanceof t3.x) {
                            throw ((t3.x) d0Var).getReadException();
                        }
                        if (!(d0Var instanceof t3.f)) {
                            if (d0Var instanceof t3.r ? true : d0Var instanceof h0) {
                                throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                            }
                            throw new jt.l();
                        }
                        Object objC = ((t3.f) d0Var).c();
                        c0561a.f31450u = 1;
                        if (iVar.emit(objC, c0561a) == objE) {
                            return objE;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        jt.o.b(obj2);
                    }
                    return Unit.f22483a;
                }
            }

            public e(nu.h hVar) {
                this.f31447a = hVar;
            }

            @Override // nu.h
            @Nullable
            public Object collect(@NotNull nu.i iVar, @NotNull nt.b bVar) {
                Object objCollect = this.f31447a.collect(new a(iVar), bVar);
                return objCollect == ot.c.e() ? objCollect : Unit.f22483a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(k<T> kVar, nt.b<? super d> bVar) {
            super(2, bVar);
            this.f31437w = kVar;
        }

        @Override // pt.a
        @NotNull
        public final nt.b<Unit> create(@Nullable Object obj, @NotNull nt.b<?> bVar) {
            d dVar = new d(this.f31437w, bVar);
            dVar.f31436v = obj;
            return dVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:32:0x00bb, code lost:
        
            if (nu.j.q(r1, r9, r8) == r0) goto L33;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v13 */
        /* JADX WARN: Type inference failed for: r1v14 */
        /* JADX WARN: Type inference failed for: r1v3 */
        /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, nu.i] */
        /* JADX WARN: Type inference failed for: r1v6, types: [nu.i] */
        /* JADX WARN: Type inference failed for: r1v8 */
        /* JADX WARN: Type inference failed for: r3v12 */
        /* JADX WARN: Type inference failed for: r3v15 */
        /* JADX WARN: Type inference failed for: r3v5 */
        @Override // pt.a
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r9) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 208
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: t3.k.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull nu.i<? super T> iVar, @Nullable nt.b<? super Unit> bVar) {
            return ((d) create(iVar, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @pt.f(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", l = {544}, m = "decrementCollector")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class e extends pt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f31452t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f31453u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f31454v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ k<T> f31455w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f31456x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(k<T> kVar, nt.b<? super e> bVar) {
            super(bVar);
            this.f31455w = kVar;
        }

        @Override // pt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f31454v = obj;
            this.f31456x |= Integer.MIN_VALUE;
            return this.f31455w.p(this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0003\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u0002H\u008a@"}, d2 = {"<anonymous>", "R", "T"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @pt.f(c = "androidx.datastore.core.DataStoreImpl$doWithWriteFileLock$3", f = "DataStoreImpl.kt", l = {416}, m = "invokeSuspend")
    public static final class f<R> extends pt.m implements Function1<nt.b<? super R>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f31457t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Function1<nt.b<? super R>, Object> f31458u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(Function1<? super nt.b<? super R>, ? extends Object> function1, nt.b<? super f> bVar) {
            super(1, bVar);
            this.f31458u = function1;
        }

        @Override // pt.a
        @NotNull
        public final nt.b<Unit> create(@NotNull nt.b<?> bVar) {
            return new f(this.f31458u, bVar);
        }

        @Override // pt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objE = ot.c.e();
            int i10 = this.f31457t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jt.o.b(obj);
                return obj;
            }
            jt.o.b(obj);
            Function1<nt.b<? super R>, Object> function1 = this.f31458u;
            this.f31457t = 1;
            Object objInvoke = function1.invoke(this);
            return objInvoke == objE ? objE : objInvoke;
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Nullable nt.b<? super R> bVar) {
            return ((f) create(bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @pt.f(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", l = {237, 243, 246}, m = "handleUpdate")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class g extends pt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f31459t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f31460u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f31461v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public /* synthetic */ Object f31462w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ k<T> f31463x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f31464y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(k<T> kVar, nt.b<? super g> bVar) {
            super(bVar);
            this.f31463x = kVar;
        }

        @Override // pt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f31462w = obj;
            this.f31464y |= Integer.MIN_VALUE;
            return this.f31463x.t(null, this);
        }
    }

    @pt.f(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", l = {544}, m = "incrementCollector")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class h extends pt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f31465t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f31466u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f31467v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ k<T> f31468w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f31469x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(k<T> kVar, nt.b<? super h> bVar) {
            super(bVar);
            this.f31468w = kVar;
        }

        @Override // pt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f31467v = obj;
            this.f31469x |= Integer.MIN_VALUE;
            return this.f31468w.u(this);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {1, 8, 0})
    @pt.f(c = "androidx.datastore.core.DataStoreImpl$incrementCollector$2$1", f = "DataStoreImpl.kt", l = {134, 135}, m = "invokeSuspend")
    public static final class i extends pt.m implements Function2<p0, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f31470t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ k<T> f31471u;

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "", "it", "b", "(Lkotlin/Unit;Lnt/b;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
        public static final class a<T> implements nu.i {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ k<T> f31472a;

            public a(k<T> kVar) {
                this.f31472a = kVar;
            }

            @Override // nu.i
            @Nullable
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(@NotNull Unit unit, @NotNull nt.b<? super Unit> bVar) {
                Object objW;
                return ((this.f31472a.inMemoryCache.a() instanceof t3.r) || (objW = this.f31472a.w(true, bVar)) != ot.c.e()) ? Unit.f22483a : objW;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(k<T> kVar, nt.b<? super i> bVar) {
            super(2, bVar);
            this.f31471u = kVar;
        }

        @Override // pt.a
        @NotNull
        public final nt.b<Unit> create(@Nullable Object obj, @NotNull nt.b<?> bVar) {
            return new i(this.f31471u, bVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
        
            if (r5.collect(r1, r4) == r0) goto L15;
         */
        @Override // pt.a
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = ot.c.e()
                int r1 = r4.f31470t
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                jt.o.b(r5)
                goto L4e
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1a:
                jt.o.b(r5)
                goto L30
            L1e:
                jt.o.b(r5)
                t3.k<T> r5 = r4.f31471u
                t3.k$b r5 = t3.k.e(r5)
                r4.f31470t = r3
                java.lang.Object r5 = r5.a(r4)
                if (r5 != r0) goto L30
                goto L4d
            L30:
                t3.k<T> r5 = r4.f31471u
                t3.t r5 = t3.k.c(r5)
                nu.h r5 = r5.a()
                nu.h r5 = nu.j.k(r5)
                t3.k$i$a r1 = new t3.k$i$a
                t3.k<T> r3 = r4.f31471u
                r1.<init>(r3)
                r4.f31470t = r2
                java.lang.Object r5 = r5.collect(r1, r4)
                if (r5 != r0) goto L4e
            L4d:
                return r0
            L4e:
                kotlin.Unit r5 = kotlin.Unit.f22483a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: t3.k.i.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull p0 p0Var, @Nullable nt.b<? super Unit> bVar) {
            return ((i) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @pt.f(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", l = {264, 266}, m = "readAndInitOrPropagateAndThrowFailure")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class j extends pt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f31473t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f31474u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f31475v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ k<T> f31476w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f31477x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(k<T> kVar, nt.b<? super j> bVar) {
            super(bVar);
            this.f31476w = kVar;
        }

        @Override // pt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f31475v = obj;
            this.f31477x |= Integer.MIN_VALUE;
            return this.f31476w.v(this);
        }
    }

    /* JADX INFO: renamed from: t3.k$k, reason: collision with other inner class name */
    @pt.f(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", l = {287, 296, 304}, m = "readDataAndUpdateCache")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class C0562k extends pt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f31478t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f31479u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public boolean f31480v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public /* synthetic */ Object f31481w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ k<T> f31482x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f31483y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0562k(k<T> kVar, nt.b<? super C0562k> bVar) {
            super(bVar);
            this.f31482x = kVar;
        }

        @Override // pt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f31481w = obj;
            this.f31483y |= Integer.MIN_VALUE;
            return this.f31482x.w(false, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0004\u0012\u00020\u00030\u0001\"\u0004\b\u0000\u0010\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lkotlin/Pair;", "Lt3/d0;", "", "<anonymous>", "()Lkotlin/Pair;"}, k = 3, mv = {1, 8, 0})
    @pt.f(c = "androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$3", f = "DataStoreImpl.kt", l = {298, MlKitException.LOW_LIGHT_AUTO_EXPOSURE_COMPUTATION_FAILURE}, m = "invokeSuspend")
    public static final class l extends pt.m implements Function1<nt.b<? super Pair<? extends d0<T>, ? extends Boolean>>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f31484t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f31485u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ k<T> f31486v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(k<T> kVar, nt.b<? super l> bVar) {
            super(1, bVar);
            this.f31486v = kVar;
        }

        @Override // pt.a
        @NotNull
        public final nt.b<Unit> create(@NotNull nt.b<?> bVar) {
            return new l(this.f31486v, bVar);
        }

        @Override // pt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Throwable th2;
            d0 xVar;
            Object objE = ot.c.e();
            int i10 = this.f31485u;
            try {
                if (i10 == 0) {
                    jt.o.b(obj);
                    k<T> kVar = this.f31486v;
                    this.f31485u = 1;
                    obj = kVar.y(true, this);
                    if (obj == objE) {
                        return objE;
                    }
                } else {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        th2 = (Throwable) this.f31484t;
                        jt.o.b(obj);
                        xVar = new t3.x(th2, ((Number) obj).intValue());
                        return jt.s.a(xVar, pt.b.a(true));
                    }
                    jt.o.b(obj);
                }
                xVar = (d0) obj;
            } catch (Throwable th3) {
                t3.t tVarR = this.f31486v.r();
                this.f31484t = th3;
                this.f31485u = 2;
                Object objC = tVarR.c(this);
                if (objC != objE) {
                    th2 = th3;
                    obj = objC;
                }
                return objE;
            }
            return jt.s.a(xVar, pt.b.a(true));
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Nullable nt.b<? super Pair<? extends d0<T>, Boolean>> bVar) {
            return ((l) create(bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0004\u0012\u00020\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "", "locked", "Lkotlin/Pair;", "Lt3/d0;", "<anonymous>", "(Z)Lkotlin/Pair;"}, k = 3, mv = {1, 8, 0})
    @pt.f(c = "androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$4", f = "DataStoreImpl.kt", l = {306, 309}, m = "invokeSuspend")
    public static final class m extends pt.m implements Function2<Boolean, nt.b<? super Pair<? extends d0<T>, ? extends Boolean>>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f31487t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f31488u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ boolean f31489v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ k<T> f31490w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ int f31491x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(k<T> kVar, int i10, nt.b<? super m> bVar) {
            super(2, bVar);
            this.f31490w = kVar;
            this.f31491x = i10;
        }

        @Override // pt.a
        @NotNull
        public final nt.b<Unit> create(@Nullable Object obj, @NotNull nt.b<?> bVar) {
            m mVar = new m(this.f31490w, this.f31491x, bVar);
            mVar.f31489v = ((Boolean) obj).booleanValue();
            return mVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Object obj) {
            return q(bool.booleanValue(), (nt.b) obj);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v10 */
        /* JADX WARN: Type inference failed for: r0v2 */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v5 */
        /* JADX WARN: Type inference failed for: r0v6 */
        /* JADX WARN: Type inference failed for: r0v9 */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
        /* JADX WARN: Type inference failed for: r1v13 */
        /* JADX WARN: Type inference failed for: r1v14 */
        /* JADX WARN: Type inference failed for: r1v15 */
        /* JADX WARN: Type inference failed for: r1v4, types: [boolean] */
        /* JADX WARN: Type inference failed for: r1v6 */
        /* JADX WARN: Type inference failed for: r1v9 */
        /* JADX WARN: Type inference failed for: r4v0 */
        @Override // pt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Throwable th2;
            int iIntValue;
            ?? r8;
            ?? r10;
            d0 d0Var;
            ?? r11;
            Object objE = ot.c.e();
            ?? r12 = this.f31488u;
            try {
                if (r12 == 0) {
                    jt.o.b(obj);
                    boolean z10 = this.f31489v;
                    k<T> kVar = this.f31490w;
                    this.f31489v = z10;
                    this.f31488u = 1;
                    obj = kVar.y(z10, this);
                    r12 = z10;
                    if (obj == objE) {
                        return objE;
                    }
                } else {
                    if (r12 != 1) {
                        if (r12 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        boolean z11 = this.f31489v;
                        th2 = (Throwable) this.f31487t;
                        jt.o.b(obj);
                        r10 = z11;
                        iIntValue = ((Number) obj).intValue();
                        r8 = r10;
                        t3.x xVar = new t3.x(th2, iIntValue);
                        r11 = r8;
                        d0Var = xVar;
                        return jt.s.a(d0Var, pt.b.a(r11));
                    }
                    boolean z12 = this.f31489v;
                    jt.o.b(obj);
                    r12 = z12;
                }
                d0Var = (d0) obj;
                r11 = r12;
            } catch (Throwable th3) {
                if (r12 != 0) {
                    t3.t tVarR = this.f31490w.r();
                    this.f31487t = th3;
                    this.f31489v = r12;
                    this.f31488u = 2;
                    Object objC = tVarR.c(this);
                    if (objC != objE) {
                        r10 = r12;
                        th2 = th3;
                        obj = objC;
                    }
                    return objE;
                }
                ?? r13 = r12;
                th2 = th3;
                iIntValue = this.f31491x;
                r8 = r13 == true ? 1 : 0;
            }
            return jt.s.a(d0Var, pt.b.a(r11));
        }

        @Nullable
        public final Object q(boolean z10, @Nullable nt.b<? super Pair<? extends d0<T>, Boolean>> bVar) {
            return ((m) create(Boolean.valueOf(z10), bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @pt.f(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", l = {365, 366, 368, 369, 380, 384}, m = "readDataOrHandleCorruption")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class n extends pt.d {
        public final /* synthetic */ k<T> A;
        public int B;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f31492t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f31493u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f31494v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Object f31495w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public boolean f31496x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f31497y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public /* synthetic */ Object f31498z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(k<T> kVar, nt.b<? super n> bVar) {
            super(bVar);
            this.A = kVar;
        }

        @Override // pt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f31498z = obj;
            this.B |= Integer.MIN_VALUE;
            return this.A.y(false, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "locked", "Lt3/f;", "<anonymous>", "(Z)Lt3/f;"}, k = 3, mv = {1, 8, 0})
    @pt.f(c = "androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$2", f = "DataStoreImpl.kt", l = {370, 371}, m = "invokeSuspend")
    public static final class o extends pt.m implements Function2<Boolean, nt.b<? super t3.f<T>>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f31499t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f31500u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ boolean f31501v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ k<T> f31502w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ int f31503x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(k<T> kVar, int i10, nt.b<? super o> bVar) {
            super(2, bVar);
            this.f31502w = kVar;
            this.f31503x = i10;
        }

        @Override // pt.a
        @NotNull
        public final nt.b<Unit> create(@Nullable Object obj, @NotNull nt.b<?> bVar) {
            o oVar = new o(this.f31502w, this.f31503x, bVar);
            oVar.f31501v = ((Boolean) obj).booleanValue();
            return oVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Object obj) {
            return q(bool.booleanValue(), (nt.b) obj);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0059  */
        /* JADX WARN: Code duplicated, block: B:23:0x005e  */
        @Override // pt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            boolean z10;
            Object obj2;
            int iIntValue;
            int iHashCode;
            Object objE = ot.c.e();
            int i10 = this.f31500u;
            if (i10 == 0) {
                jt.o.b(obj);
                z10 = this.f31501v;
                k<T> kVar = this.f31502w;
                this.f31501v = z10;
                this.f31500u = 1;
                obj = kVar.x(this);
                if (obj != objE) {
                }
                return objE;
            }
            if (i10 == 1) {
                z10 = this.f31501v;
                jt.o.b(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj2 = this.f31499t;
                jt.o.b(obj);
            }
            iIntValue = ((Number) obj).intValue();
            if (obj2 != null) {
                iHashCode = obj2.hashCode();
            } else {
                iHashCode = 0;
            }
            return new t3.f(obj2, iHashCode, iIntValue);
            if (z10) {
                t3.t tVarR = this.f31502w.r();
                this.f31499t = obj;
                this.f31500u = 2;
                Object objC = tVarR.c(this);
                if (objC != objE) {
                    obj2 = obj;
                    obj = objC;
                    iIntValue = ((Number) obj).intValue();
                }
                return objE;
            }
            obj2 = obj;
            iIntValue = this.f31503x;
            if (obj2 != null) {
                iHashCode = obj2.hashCode();
            } else {
                iHashCode = 0;
            }
            return new t3.f(obj2, iHashCode, iIntValue);
        }

        @Nullable
        public final Object q(boolean z10, @Nullable nt.b<? super t3.f<T>> bVar) {
            return ((o) create(Boolean.valueOf(z10), bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\u008a@"}, d2 = {"<anonymous>", "", "T"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @pt.f(c = "androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$3", f = "DataStoreImpl.kt", l = {387, 388, 390}, m = "invokeSuspend")
    public static final class p extends pt.m implements Function1<nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f31504t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f31505u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.c0<T> f31506v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ k<T> f31507w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.a0 f31508x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(kotlin.jvm.internal.c0<T> c0Var, k<T> kVar, kotlin.jvm.internal.a0 a0Var, nt.b<? super p> bVar) {
            super(1, bVar);
            this.f31506v = c0Var;
            this.f31507w = kVar;
            this.f31508x = a0Var;
        }

        @Override // pt.a
        @NotNull
        public final nt.b<Unit> create(@NotNull nt.b<?> bVar) {
            return new p(this.f31506v, this.f31507w, this.f31508x, bVar);
        }

        @Override // pt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.jvm.internal.a0 a0Var;
            kotlin.jvm.internal.c0<T> c0Var;
            kotlin.jvm.internal.a0 a0Var2;
            Object objE = ot.c.e();
            int i10 = this.f31505u;
            try {
                if (i10 == 0) {
                    jt.o.b(obj);
                    c0Var = this.f31506v;
                    k<T> kVar = this.f31507w;
                    this.f31504t = c0Var;
                    this.f31505u = 1;
                    obj = (T) kVar.x(this);
                    if (obj == objE) {
                    }
                    return objE;
                }
                if (i10 == 1) {
                    c0Var = (kotlin.jvm.internal.c0) this.f31504t;
                    jt.o.b(obj);
                } else {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        a0Var = (kotlin.jvm.internal.a0) this.f31504t;
                        jt.o.b(obj);
                        a0Var.f22549a = ((Number) obj).intValue();
                        return Unit.f22483a;
                    }
                    a0Var2 = (kotlin.jvm.internal.a0) this.f31504t;
                    jt.o.b(obj);
                }
                a0Var2.f22549a = ((Number) obj).intValue();
                return Unit.f22483a;
                c0Var.f22552a = (T) obj;
                a0Var2 = this.f31508x;
                t3.t tVarR = this.f31507w.r();
                this.f31504t = a0Var2;
                this.f31505u = 2;
                obj = (T) tVarR.c(this);
                if (obj == objE) {
                    return objE;
                }
                a0Var2.f22549a = ((Number) obj).intValue();
            } catch (t3.d unused) {
                kotlin.jvm.internal.a0 a0Var3 = this.f31508x;
                k<T> kVar2 = this.f31507w;
                T t8 = this.f31506v.f22552a;
                this.f31504t = a0Var3;
                this.f31505u = 3;
                Object objB = kVar2.B(t8, true, this);
                if (objB != objE) {
                    a0Var = a0Var3;
                    obj = (T) objB;
                }
                return objE;
            }
            return Unit.f22483a;
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Nullable nt.b<? super Unit> bVar) {
            return ((p) create(bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lku/p0;", "Lt3/d0;", "<anonymous>", "(Lku/p0;)Lt3/d0;"}, k = 3, mv = {1, 8, 0})
    @pt.f(c = "androidx.datastore.core.DataStoreImpl$readState$2", f = "DataStoreImpl.kt", l = {218, 226}, m = "invokeSuspend")
    public static final class q extends pt.m implements Function2<p0, nt.b<? super d0<T>>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f31509t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ k<T> f31510u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ boolean f31511v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(k<T> kVar, boolean z10, nt.b<? super q> bVar) {
            super(2, bVar);
            this.f31510u = kVar;
            this.f31511v = z10;
        }

        @Override // pt.a
        @NotNull
        public final nt.b<Unit> create(@Nullable Object obj, @NotNull nt.b<?> bVar) {
            return new q(this.f31510u, this.f31511v, bVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0051, code lost:
        
            if (r5 == r0) goto L22;
         */
        @Override // pt.a
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = ot.c.e()
                int r1 = r4.f31509t
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L20
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                jt.o.b(r5)
                goto L54
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1a:
                jt.o.b(r5)     // Catch: java.lang.Throwable -> L1e
                goto L47
            L1e:
                r5 = move-exception
                goto L57
            L20:
                jt.o.b(r5)
                t3.k<T> r5 = r4.f31510u
                t3.l r5 = t3.k.d(r5)
                t3.d0 r5 = r5.a()
                boolean r5 = r5 instanceof t3.r
                if (r5 == 0) goto L3c
                t3.k<T> r5 = r4.f31510u
                t3.l r5 = t3.k.d(r5)
                t3.d0 r5 = r5.a()
                return r5
            L3c:
                t3.k<T> r5 = r4.f31510u     // Catch: java.lang.Throwable -> L1e
                r4.f31509t = r3     // Catch: java.lang.Throwable -> L1e
                java.lang.Object r5 = t3.k.k(r5, r4)     // Catch: java.lang.Throwable -> L1e
                if (r5 != r0) goto L47
                goto L53
            L47:
                t3.k<T> r5 = r4.f31510u
                boolean r1 = r4.f31511v
                r4.f31509t = r2
                java.lang.Object r5 = t3.k.l(r5, r1, r4)
                if (r5 != r0) goto L54
            L53:
                return r0
            L54:
                t3.d0 r5 = (t3.d0) r5
                return r5
            L57:
                t3.x r0 = new t3.x
                r1 = -1
                r0.<init>(r5, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: t3.k.q.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull p0 p0Var, @Nullable nt.b<? super d0<T>> bVar) {
            return ((q) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "Lt3/f0;", "b", "()Lt3/f0;"}, k = 3, mv = {1, 8, 0})
    public static final class r extends kotlin.jvm.internal.m implements Function0<f0<T>> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ k<T> f31512i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(k<T> kVar) {
            super(0);
            this.f31512i = kVar;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final f0<T> invoke() {
            return this.f31512i.storage.a();
        }
    }

    @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001H\u008a@"}, d2 = {"<anonymous>", "T"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @pt.f(c = "androidx.datastore.core.DataStoreImpl$transformAndWrite$2", f = "DataStoreImpl.kt", l = {330, 331, 337}, m = "invokeSuspend")
    public static final class s extends pt.m implements Function1<nt.b<? super T>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f31513t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f31514u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ k<T> f31515v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ CoroutineContext f31516w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ Function2<T, nt.b<? super T>, Object> f31517x;

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"T", "Lku/p0;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @pt.f(c = "androidx.datastore.core.DataStoreImpl$transformAndWrite$2$newData$1", f = "DataStoreImpl.kt", l = {331}, m = "invokeSuspend")
        public static final class a extends pt.m implements Function2<p0, nt.b<? super T>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f31518t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ Function2<T, nt.b<? super T>, Object> f31519u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ t3.f<T> f31520v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(Function2<? super T, ? super nt.b<? super T>, ? extends Object> function2, t3.f<T> fVar, nt.b<? super a> bVar) {
                super(2, bVar);
                this.f31519u = function2;
                this.f31520v = fVar;
            }

            @Override // pt.a
            @NotNull
            public final nt.b<Unit> create(@Nullable Object obj, @NotNull nt.b<?> bVar) {
                return new a(this.f31519u, this.f31520v, bVar);
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to t3.k$s$a for r3v1 'this'  java.lang.Object
                	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
                	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
                	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
                	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
                	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
                */
            @Override // pt.a
            @org.jetbrains.annotations.Nullable
            public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r4) {
                /*
                    r3 = this;
                    java.lang.Object r0 = ot.c.e()
                    int r1 = r3.f31518t
                    r2 = 1
                    if (r1 == 0) goto L17
                    if (r1 != r2) goto Lf
                    jt.o.b(r4)
                    return r4
                Lf:
                    java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r4.<init>(r0)
                    throw r4
                L17:
                    jt.o.b(r4)
                    kotlin.jvm.functions.Function2<T, nt.b<? super T>, java.lang.Object> r4 = r3.f31519u
                    t3.f<T> r1 = r3.f31520v
                    java.lang.Object r1 = r1.c()
                    r3.f31518t = r2
                    java.lang.Object r4 = r4.invoke(r1, r3)
                    if (r4 != r0) goto L2b
                    return r0
                L2b:
                    return r4
                */
                throw new UnsupportedOperationException("Method not decompiled: t3.k.s.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull p0 p0Var, @Nullable nt.b<? super T> bVar) {
                return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public s(k<T> kVar, CoroutineContext coroutineContext, Function2<? super T, ? super nt.b<? super T>, ? extends Object> function2, nt.b<? super s> bVar) {
            super(1, bVar);
            this.f31515v = kVar;
            this.f31516w = coroutineContext;
            this.f31517x = function2;
        }

        @Override // pt.a
        @NotNull
        public final nt.b<Unit> create(@NotNull nt.b<?> bVar) {
            return new s(this.f31515v, this.f31516w, this.f31517x, bVar);
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type nt.b to t3.k$s for r8v1 'this'  nt.b
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // pt.a
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = ot.c.e()
                int r1 = r8.f31514u
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L2b
                if (r1 == r4) goto L27
                if (r1 == r3) goto L1f
                if (r1 != r2) goto L17
                java.lang.Object r0 = r8.f31513t
                jt.o.b(r9)
                return r0
            L17:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L1f:
                java.lang.Object r1 = r8.f31513t
                t3.f r1 = (t3.f) r1
                jt.o.b(r9)
                goto L51
            L27:
                jt.o.b(r9)
                goto L39
            L2b:
                jt.o.b(r9)
                t3.k<T> r9 = r8.f31515v
                r8.f31514u = r4
                java.lang.Object r9 = t3.k.n(r9, r4, r8)
                if (r9 != r0) goto L39
                goto L6a
            L39:
                r1 = r9
                t3.f r1 = (t3.f) r1
                kotlin.coroutines.CoroutineContext r9 = r8.f31516w
                t3.k$s$a r5 = new t3.k$s$a
                kotlin.jvm.functions.Function2<T, nt.b<? super T>, java.lang.Object> r6 = r8.f31517x
                r7 = 0
                r5.<init>(r6, r1, r7)
                r8.f31513t = r1
                r8.f31514u = r3
                java.lang.Object r9 = ku.i.g(r9, r5, r8)
                if (r9 != r0) goto L51
                goto L6a
            L51:
                r1.b()
                java.lang.Object r1 = r1.c()
                boolean r1 = kotlin.jvm.internal.Intrinsics.c(r1, r9)
                if (r1 != 0) goto L6b
                t3.k<T> r1 = r8.f31515v
                r8.f31513t = r9
                r8.f31514u = r2
                java.lang.Object r1 = r1.B(r9, r4, r8)
                if (r1 != r0) goto L6b
            L6a:
                return r0
            L6b:
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: t3.k.s.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Nullable nt.b<? super T> bVar) {
            return ((s) create(bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"T", "Lku/p0;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @pt.f(c = "androidx.datastore.core.DataStoreImpl$updateData$2", f = "DataStoreImpl.kt", l = {169}, m = "invokeSuspend")
    public static final class t extends pt.m implements Function2<p0, nt.b<? super T>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f31521t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f31522u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ k<T> f31523v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ Function2<T, nt.b<? super T>, Object> f31524w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public t(k<T> kVar, Function2<? super T, ? super nt.b<? super T>, ? extends Object> function2, nt.b<? super t> bVar) {
            super(2, bVar);
            this.f31523v = kVar;
            this.f31524w = function2;
        }

        @Override // pt.a
        @NotNull
        public final nt.b<Unit> create(@Nullable Object obj, @NotNull nt.b<?> bVar) {
            t tVar = new t(this.f31523v, this.f31524w, bVar);
            tVar.f31522u = obj;
            return tVar;
        }

        @Override // pt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objE = ot.c.e();
            int i10 = this.f31521t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jt.o.b(obj);
                return obj;
            }
            jt.o.b(obj);
            p0 p0Var = (p0) this.f31522u;
            ku.x xVarC = ku.z.c(null, 1, null);
            this.f31523v.writeActor.e(new t3.w.a(this.f31524w, xVarC, this.f31523v.inMemoryCache.a(), p0Var.getCoroutineContext()));
            this.f31521t = 1;
            Object objB = xVarC.B(this);
            return objB == objE ? objE : objB;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull p0 p0Var, @Nullable nt.b<? super T> bVar) {
            return ((t) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "it", "", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
    public static final class u extends kotlin.jvm.internal.m implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ k<T> f31525i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(k<T> kVar) {
            super(1);
            this.f31525i = kVar;
        }

        public final void a(@Nullable Throwable th2) {
            if (th2 != null) {
                this.f31525i.inMemoryCache.c(new t3.r(th2));
            }
            if (this.f31525i.storageConnectionDelegate.isInitialized()) {
                this.f31525i.s().close();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            a(th2);
            return Unit.f22483a;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"T", "Lt3/w$a;", "msg", "", "ex", "", "a", "(Lt3/w$a;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
    public static final class v extends kotlin.jvm.internal.m implements Function2<t3.w.a<T>, Throwable, Unit> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final v f31526i = new v();

        public v() {
            super(2);
        }

        public final void a(@NotNull t3.w.a<T> msg, @Nullable Throwable th2) {
            Intrinsics.checkNotNullParameter(msg, "msg");
            ku.x<T> xVarA = msg.a();
            if (th2 == null) {
                th2 = new CancellationException("DataStore scope was cancelled before updateData could complete");
            }
            xVarA.r(th2);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Object obj, Throwable th2) {
            a((t3.w.a) obj, th2);
            return Unit.f22483a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lt3/w$a;", "msg", "", "<anonymous>", "(Lt3/w$a;)V"}, k = 3, mv = {1, 8, 0})
    @pt.f(c = "androidx.datastore.core.DataStoreImpl$writeActor$3", f = "DataStoreImpl.kt", l = {MlKitException.CODE_SCANNER_GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD}, m = "invokeSuspend")
    public static final class w extends pt.m implements Function2<t3.w.a<T>, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f31527t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f31528u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ k<T> f31529v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(k<T> kVar, nt.b<? super w> bVar) {
            super(2, bVar);
            this.f31529v = kVar;
        }

        @Override // pt.a
        @NotNull
        public final nt.b<Unit> create(@Nullable Object obj, @NotNull nt.b<?> bVar) {
            w wVar = new w(this.f31529v, bVar);
            wVar.f31528u = obj;
            return wVar;
        }

        @Override // pt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objE = ot.c.e();
            int i10 = this.f31527t;
            if (i10 == 0) {
                jt.o.b(obj);
                t3.w.a aVar = (t3.w.a) this.f31528u;
                k<T> kVar = this.f31529v;
                this.f31527t = 1;
                if (kVar.t(aVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jt.o.b(obj);
            }
            return Unit.f22483a;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull t3.w.a<T> aVar, @Nullable nt.b<? super Unit> bVar) {
            return ((w) create(aVar, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @pt.f(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", l = {348}, m = "writeData$datastore_core_release")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class x extends pt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f31530t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f31531u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ k<T> f31532v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f31533w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(k<T> kVar, nt.b<? super x> bVar) {
            super(bVar);
            this.f31532v = kVar;
        }

        @Override // pt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f31531u = obj;
            this.f31533w |= Integer.MIN_VALUE;
            return this.f31532v.B(null, false, this);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lt3/k0;", "", "<anonymous>", "(Lt3/k0;)V"}, k = 3, mv = {1, 8, 0})
    @pt.f(c = "androidx.datastore.core.DataStoreImpl$writeData$2", f = "DataStoreImpl.kt", l = {352, 353}, m = "invokeSuspend")
    public static final class y extends pt.m implements Function2<k0<T>, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f31534t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f31535u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f31536v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.a0 f31537w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ k<T> f31538x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final /* synthetic */ T f31539y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ boolean f31540z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(kotlin.jvm.internal.a0 a0Var, k<T> kVar, T t8, boolean z10, nt.b<? super y> bVar) {
            super(2, bVar);
            this.f31537w = a0Var;
            this.f31538x = kVar;
            this.f31539y = t8;
            this.f31540z = z10;
        }

        @Override // pt.a
        @NotNull
        public final nt.b<Unit> create(@Nullable Object obj, @NotNull nt.b<?> bVar) {
            y yVar = new y(this.f31537w, this.f31538x, this.f31539y, this.f31540z, bVar);
            yVar.f31536v = obj;
            return yVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x005a, code lost:
        
            if (r3.b(r7, r6) == r0) goto L16;
         */
        @Override // pt.a
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = ot.c.e()
                int r1 = r6.f31535u
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L26
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                jt.o.b(r7)
                goto L5d
            L12:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1a:
                java.lang.Object r1 = r6.f31534t
                kotlin.jvm.internal.a0 r1 = (kotlin.jvm.internal.a0) r1
                java.lang.Object r3 = r6.f31536v
                t3.k0 r3 = (t3.k0) r3
                jt.o.b(r7)
                goto L45
            L26:
                jt.o.b(r7)
                java.lang.Object r7 = r6.f31536v
                t3.k0 r7 = (t3.k0) r7
                kotlin.jvm.internal.a0 r1 = r6.f31537w
                t3.k<T> r4 = r6.f31538x
                t3.t r4 = t3.k.c(r4)
                r6.f31536v = r7
                r6.f31534t = r1
                r6.f31535u = r3
                java.lang.Object r3 = r4.e(r6)
                if (r3 != r0) goto L42
                goto L5c
            L42:
                r5 = r3
                r3 = r7
                r7 = r5
            L45:
                java.lang.Number r7 = (java.lang.Number) r7
                int r7 = r7.intValue()
                r1.f22549a = r7
                T r7 = r6.f31539y
                r1 = 0
                r6.f31536v = r1
                r6.f31534t = r1
                r6.f31535u = r2
                java.lang.Object r7 = r3.b(r7, r6)
                if (r7 != r0) goto L5d
            L5c:
                return r0
            L5d:
                boolean r7 = r6.f31540z
                if (r7 == 0) goto L7d
                t3.k<T> r7 = r6.f31538x
                t3.l r7 = t3.k.d(r7)
                t3.f r0 = new t3.f
                T r1 = r6.f31539y
                if (r1 == 0) goto L72
                int r2 = r1.hashCode()
                goto L73
            L72:
                r2 = 0
            L73:
                kotlin.jvm.internal.a0 r3 = r6.f31537w
                int r3 = r3.f22549a
                r0.<init>(r1, r2, r3)
                r7.c(r0)
            L7d:
                kotlin.Unit r7 = kotlin.Unit.f22483a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: t3.k.y.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull k0<T> k0Var, @Nullable nt.b<? super Unit> bVar) {
            return ((y) create(k0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    public k(@NotNull e0<T> storage, @NotNull List<? extends Function2<? super t3.s<T>, ? super nt.b<? super Unit>, ? extends Object>> initTasksList, @NotNull t3.e<T> corruptionHandler, @NotNull p0 scope) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(initTasksList, "initTasksList");
        Intrinsics.checkNotNullParameter(corruptionHandler, "corruptionHandler");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.storage = storage;
        this.corruptionHandler = corruptionHandler;
        this.scope = scope;
        this.data = nu.j.w(new d(this, null));
        this.collectorMutex = uu.g.b(false, 1, null);
        this.inMemoryCache = new t3.l<>();
        this.readAndInit = new b(this, initTasksList);
        this.storageConnectionDelegate = jt.i.b(new r(this));
        this.coordinator = jt.i.b(new c(this));
        this.writeActor = new b0<>(scope, new u(this), v.f31526i, new w(this, null));
    }

    public final Object A(Function2<? super T, ? super nt.b<? super T>, ? extends Object> function2, CoroutineContext coroutineContext, nt.b<? super T> bVar) {
        return r().b(new s(this, coroutineContext, function2, null), bVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object B(T t8, boolean z10, @NotNull nt.b<? super Integer> bVar) {
        x xVar;
        kotlin.jvm.internal.a0 a0Var;
        if (bVar instanceof x) {
            xVar = (x) bVar;
            int i10 = xVar.f31533w;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                xVar.f31533w = i10 - Integer.MIN_VALUE;
            } else {
                xVar = new x(this, bVar);
            }
        } else {
            xVar = new x(this, bVar);
        }
        Object obj = xVar.f31531u;
        Object objE = ot.c.e();
        int i11 = xVar.f31533w;
        if (i11 == 0) {
            jt.o.b(obj);
            kotlin.jvm.internal.a0 a0Var2 = new kotlin.jvm.internal.a0();
            f0<T> f0VarS = s();
            y yVar = new y(a0Var2, this, t8, z10, null);
            xVar.f31530t = a0Var2;
            xVar.f31533w = 1;
            if (f0VarS.c(yVar, xVar) == objE) {
                return objE;
            }
            a0Var = a0Var2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0Var = (kotlin.jvm.internal.a0) xVar.f31530t;
            jt.o.b(obj);
        }
        return pt.b.d(a0Var.f22549a);
    }

    @Override // t3.i
    @Nullable
    public Object a(@NotNull Function2<? super T, ? super nt.b<? super T>, ? extends Object> function2, @NotNull nt.b<? super T> bVar) {
        j0 j0Var = (j0) bVar.getContext().get(j0.Companion.C0557a.f31397a);
        if (j0Var != null) {
            j0Var.a(this);
        }
        return ku.i.g(new j0(j0Var, this), new t(this, function2, null), bVar);
    }

    @Override // t3.i
    @NotNull
    public nu.h<T> getData() {
        return this.data;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object p(nt.b<? super Unit> bVar) {
        e eVar;
        k<T> kVar;
        uu.a aVar;
        if (bVar instanceof e) {
            eVar = (e) bVar;
            int i10 = eVar.f31456x;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                eVar.f31456x = i10 - Integer.MIN_VALUE;
            } else {
                eVar = new e(this, bVar);
            }
        } else {
            eVar = new e(this, bVar);
        }
        Object obj = eVar.f31454v;
        Object objE = ot.c.e();
        int i11 = eVar.f31456x;
        if (i11 == 0) {
            jt.o.b(obj);
            uu.a aVar2 = this.collectorMutex;
            eVar.f31452t = this;
            eVar.f31453u = aVar2;
            eVar.f31456x = 1;
            if (aVar2.f(null, eVar) == objE) {
                return objE;
            }
            kVar = this;
            aVar = aVar2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = (uu.a) eVar.f31453u;
            kVar = (k) eVar.f31452t;
            jt.o.b(obj);
        }
        try {
            int i12 = kVar.collectorCounter - 1;
            kVar.collectorCounter = i12;
            if (i12 == 0) {
                d2 d2Var = kVar.collectorJob;
                if (d2Var != null) {
                    d2.a.a(d2Var, null, 1, null);
                }
                kVar.collectorJob = null;
            }
            Unit unit = Unit.f22483a;
            return Unit.f22483a;
        } finally {
            aVar.e(null);
        }
    }

    public final <R> Object q(boolean z10, Function1<? super nt.b<? super R>, ? extends Object> function1, nt.b<? super R> bVar) {
        return z10 ? function1.invoke(bVar) : r().b(new f(function1, null), bVar);
    }

    public final t3.t r() {
        return (t3.t) this.coordinator.getValue();
    }

    @NotNull
    public final f0<T> s() {
        return this.storageConnectionDelegate.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b4, code lost:
    
        if (r9 == r1) goto L45;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v9, types: [t3.k] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, t3.k, t3.k<T>] */
    /* JADX WARN: Type inference failed for: r9v3, types: [ku.x] */
    /* JADX WARN: Type inference failed for: r9v33 */
    /* JADX WARN: Type inference failed for: r9v34 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t(t3.w.a<T> r9, nt.b<? super kotlin.Unit> r10) {
        /*
            Method dump skipped, instruction units count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t3.k.t(t3.w$a, nt.b):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object u(nt.b<? super Unit> bVar) {
        h hVar;
        k<T> kVar;
        uu.a aVar;
        if (bVar instanceof h) {
            hVar = (h) bVar;
            int i10 = hVar.f31469x;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                hVar.f31469x = i10 - Integer.MIN_VALUE;
            } else {
                hVar = new h(this, bVar);
            }
        } else {
            hVar = new h(this, bVar);
        }
        Object obj = hVar.f31467v;
        Object objE = ot.c.e();
        int i11 = hVar.f31469x;
        if (i11 == 0) {
            jt.o.b(obj);
            uu.a aVar2 = this.collectorMutex;
            hVar.f31465t = this;
            hVar.f31466u = aVar2;
            hVar.f31469x = 1;
            if (aVar2.f(null, hVar) == objE) {
                return objE;
            }
            kVar = this;
            aVar = aVar2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = (uu.a) hVar.f31466u;
            kVar = (k) hVar.f31465t;
            jt.o.b(obj);
        }
        try {
            int i12 = kVar.collectorCounter + 1;
            kVar.collectorCounter = i12;
            if (i12 == 1) {
                kVar.collectorJob = ku.k.d(kVar.scope, null, null, new i(kVar, null), 3, null);
            }
            Unit unit = Unit.f22483a;
            return Unit.f22483a;
        } finally {
            aVar.e(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0069, code lost:
    
        if (r4.c(r0) == r1) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(nt.b<? super kotlin.Unit> r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof t3.k.j
            if (r0 == 0) goto L13
            r0 = r6
            t3.k$j r0 = (t3.k.j) r0
            int r1 = r0.f31477x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f31477x = r1
            goto L18
        L13:
            t3.k$j r0 = new t3.k$j
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f31475v
            java.lang.Object r1 = ot.c.e()
            int r2 = r0.f31477x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L44
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            int r1 = r0.f31474u
            java.lang.Object r0 = r0.f31473t
            t3.k r0 = (t3.k) r0
            jt.o.b(r6)     // Catch: java.lang.Throwable -> L32
            goto L6c
        L32:
            r6 = move-exception
            goto L73
        L34:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L3c:
            java.lang.Object r2 = r0.f31473t
            t3.k r2 = (t3.k) r2
            jt.o.b(r6)
            goto L57
        L44:
            jt.o.b(r6)
            t3.t r6 = r5.r()
            r0.f31473t = r5
            r0.f31477x = r4
            java.lang.Object r6 = r6.c(r0)
            if (r6 != r1) goto L56
            goto L6b
        L56:
            r2 = r5
        L57:
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            t3.k<T>$b r4 = r2.readAndInit     // Catch: java.lang.Throwable -> L6f
            r0.f31473t = r2     // Catch: java.lang.Throwable -> L6f
            r0.f31474u = r6     // Catch: java.lang.Throwable -> L6f
            r0.f31477x = r3     // Catch: java.lang.Throwable -> L6f
            java.lang.Object r6 = r4.c(r0)     // Catch: java.lang.Throwable -> L6f
            if (r6 != r1) goto L6c
        L6b:
            return r1
        L6c:
            kotlin.Unit r6 = kotlin.Unit.f22483a
            return r6
        L6f:
            r0 = move-exception
            r1 = r6
            r6 = r0
            r0 = r2
        L73:
            t3.l<T> r0 = r0.inMemoryCache
            t3.x r2 = new t3.x
            r2.<init>(r6, r1)
            r0.c(r2)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: t3.k.v(nt.b):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a7, code lost:
    
        if (r11 == r1) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c0, code lost:
    
        if (r11 == r1) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object w(boolean r10, nt.b<? super t3.d0<T>> r11) {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t3.k.w(boolean, nt.b):java.lang.Object");
    }

    public final Object x(nt.b<? super T> bVar) {
        return g0.a(s(), bVar);
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:60:0x010d  */
    /* JADX WARN: Code duplicated, block: B:66:0x012c  */
    /* JADX WARN: Code duplicated, block: B:71:0x014d  */
    /* JADX WARN: Code duplicated, block: B:74:0x0155  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:84:0x00aa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object, t3.k] */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r6v10, types: [t3.k] */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, t3.k] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, t3.k] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v2, types: [t3.k] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, t3.k, t3.k<T>] */
    public final Object y(boolean z10, nt.b<? super t3.f<T>> bVar) throws t3.d {
        n nVar;
        ?? r8;
        kotlin.jvm.internal.c0 c0Var;
        Object objA;
        t3.d dVar;
        kotlin.jvm.internal.c0 c0Var2;
        ?? r10;
        kotlin.jvm.internal.a0 a0Var;
        t3.d dVar2;
        p pVar;
        kotlin.jvm.internal.a0 a0Var2;
        kotlin.jvm.internal.c0 c0Var3;
        ?? r11;
        ?? r12;
        int iHashCode;
        Object objC;
        boolean z11;
        int i10;
        Object obj;
        ?? r13;
        ?? r14;
        if (bVar instanceof n) {
            nVar = (n) bVar;
            int i11 = nVar.B;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                nVar.B = i11 - Integer.MIN_VALUE;
            } else {
                nVar = new n(this, bVar);
            }
        } else {
            nVar = new n(this, bVar);
        }
        Object obj2 = (T) nVar.f31498z;
        Object objE = ot.c.e();
        ?? r15 = nVar.B;
        try {
            switch (r15) {
                case 0:
                    jt.o.b(obj2);
                    try {
                        if (z10) {
                            nVar.f31492t = this;
                            nVar.f31496x = z10;
                            nVar.B = 1;
                            obj2 = (T) x(nVar);
                            if (obj2 != objE) {
                                r12 = this;
                                if (obj2 != null) {
                                    try {
                                        iHashCode = obj2.hashCode();
                                    } catch (t3.d e10) {
                                        e = e10;
                                        r13 = r12;
                                        r8 = r13;
                                        c0Var = new kotlin.jvm.internal.c0();
                                        t3.e<T> eVar = r8.corruptionHandler;
                                        nVar.f31492t = r8;
                                        nVar.f31493u = e;
                                        nVar.f31494v = c0Var;
                                        nVar.f31495w = c0Var;
                                        nVar.f31496x = z10;
                                        nVar.B = 5;
                                        objA = eVar.a(e, nVar);
                                        if (objA != objE) {
                                            dVar = e;
                                            obj2 = (T) objA;
                                            c0Var2 = c0Var;
                                            r10 = r8;
                                            c0Var2.f22552a = (T) obj2;
                                            a0Var = new kotlin.jvm.internal.a0();
                                            try {
                                                pVar = new p(c0Var, r10, a0Var, null);
                                                nVar.f31492t = dVar;
                                                nVar.f31493u = c0Var;
                                                nVar.f31494v = a0Var;
                                                nVar.f31495w = null;
                                                nVar.B = 6;
                                                if (r10.q(z10, pVar, nVar) != objE) {
                                                    a0Var2 = a0Var;
                                                    c0Var3 = c0Var;
                                                    T t8 = c0Var3.f22552a;
                                                    return new t3.f(t8, t8 != null ? t8.hashCode() : 0, a0Var2.f22549a);
                                                }
                                            } catch (Throwable th2) {
                                                th = th2;
                                                dVar2 = dVar;
                                                jt.a.a(dVar2, th);
                                                throw dVar2;
                                            }
                                        }
                                    }
                                } else {
                                    iHashCode = 0;
                                }
                                t3.t tVarR = r12.r();
                                nVar.f31492t = r12;
                                nVar.f31493u = obj2;
                                nVar.f31496x = z10;
                                nVar.f31497y = iHashCode;
                                nVar.B = 2;
                                objC = tVarR.c(nVar);
                                if (objC != objE) {
                                    int i12 = iHashCode;
                                    z11 = z10;
                                    i10 = i12;
                                    obj = obj2;
                                    obj2 = (T) objC;
                                    r14 = r12;
                                    return new t3.f(obj, i10, ((Number) obj2).intValue());
                                }
                            }
                        } else {
                            t3.t tVarR2 = r();
                            nVar.f31492t = this;
                            nVar.f31496x = z10;
                            nVar.B = 3;
                            obj2 = (T) tVarR2.c(nVar);
                            if (obj2 != objE) {
                                r11 = this;
                                int iIntValue = ((Number) obj2).intValue();
                                t3.t tVarR3 = r11.r();
                                o oVar = new o(r11, iIntValue, null);
                                nVar.f31492t = r11;
                                nVar.f31496x = z10;
                                nVar.B = 4;
                                obj2 = (T) tVarR3.d(oVar, nVar);
                                if (obj2 == objE) {
                                }
                                return (t3.f) obj2;
                            }
                        }
                    } catch (t3.d e11) {
                        e = e11;
                        r8 = this;
                        c0Var = new kotlin.jvm.internal.c0();
                        t3.e<T> eVar2 = r8.corruptionHandler;
                        nVar.f31492t = r8;
                        nVar.f31493u = e;
                        nVar.f31494v = c0Var;
                        nVar.f31495w = c0Var;
                        nVar.f31496x = z10;
                        nVar.B = 5;
                        objA = eVar2.a(e, nVar);
                        if (objA != objE) {
                            dVar = e;
                            obj2 = (T) objA;
                            c0Var2 = c0Var;
                            r10 = r8;
                            c0Var2.f22552a = (T) obj2;
                            a0Var = new kotlin.jvm.internal.a0();
                            pVar = new p(c0Var, r10, a0Var, null);
                            nVar.f31492t = dVar;
                            nVar.f31493u = c0Var;
                            nVar.f31494v = a0Var;
                            nVar.f31495w = null;
                            nVar.B = 6;
                            if (r10.q(z10, pVar, nVar) != objE) {
                                a0Var2 = a0Var;
                                c0Var3 = c0Var;
                                T t10 = c0Var3.f22552a;
                                return new t3.f(t10, t10 != null ? t10.hashCode() : 0, a0Var2.f22549a);
                            }
                        }
                    }
                    return objE;
                case 1:
                    z10 = nVar.f31496x;
                    k kVar = (k) nVar.f31492t;
                    jt.o.b(obj2);
                    r12 = kVar;
                    if (obj2 != null) {
                        iHashCode = obj2.hashCode();
                    } else {
                        iHashCode = 0;
                    }
                    t3.t tVarR4 = r12.r();
                    nVar.f31492t = r12;
                    nVar.f31493u = obj2;
                    nVar.f31496x = z10;
                    nVar.f31497y = iHashCode;
                    nVar.B = 2;
                    objC = tVarR4.c(nVar);
                    if (objC != objE) {
                        int i13 = iHashCode;
                        z11 = z10;
                        i10 = i13;
                        obj = obj2;
                        obj2 = (T) objC;
                        r14 = r12;
                        return new t3.f(obj, i10, ((Number) obj2).intValue());
                    }
                    return objE;
                case 2:
                    i10 = nVar.f31497y;
                    z11 = nVar.f31496x;
                    obj = nVar.f31493u;
                    r14 = (k) nVar.f31492t;
                    try {
                        jt.o.b(obj2);
                        r14 = r14;
                        return new t3.f(obj, i10, ((Number) obj2).intValue());
                    } catch (t3.d e12) {
                        e = e12;
                        z10 = z11;
                        r13 = r14;
                        r8 = r13;
                        c0Var = new kotlin.jvm.internal.c0();
                        t3.e<T> eVar3 = r8.corruptionHandler;
                        nVar.f31492t = r8;
                        nVar.f31493u = e;
                        nVar.f31494v = c0Var;
                        nVar.f31495w = c0Var;
                        nVar.f31496x = z10;
                        nVar.B = 5;
                        objA = eVar3.a(e, nVar);
                        if (objA != objE) {
                            dVar = e;
                            obj2 = (T) objA;
                            c0Var2 = c0Var;
                            r10 = r8;
                            c0Var2.f22552a = (T) obj2;
                            a0Var = new kotlin.jvm.internal.a0();
                            pVar = new p(c0Var, r10, a0Var, null);
                            nVar.f31492t = dVar;
                            nVar.f31493u = c0Var;
                            nVar.f31494v = a0Var;
                            nVar.f31495w = null;
                            nVar.B = 6;
                            if (r10.q(z10, pVar, nVar) != objE) {
                                a0Var2 = a0Var;
                                c0Var3 = c0Var;
                                T t11 = c0Var3.f22552a;
                                return new t3.f(t11, t11 != null ? t11.hashCode() : 0, a0Var2.f22549a);
                            }
                        }
                        return objE;
                    }
                case 3:
                    z10 = nVar.f31496x;
                    k kVar2 = (k) nVar.f31492t;
                    jt.o.b(obj2);
                    r11 = kVar2;
                    int iIntValue2 = ((Number) obj2).intValue();
                    t3.t tVarR5 = r11.r();
                    o oVar2 = new o(r11, iIntValue2, null);
                    nVar.f31492t = r11;
                    nVar.f31496x = z10;
                    nVar.B = 4;
                    obj2 = (T) tVarR5.d(oVar2, nVar);
                    if (obj2 == objE) {
                        return objE;
                    }
                    return (t3.f) obj2;
                case 4:
                    boolean z12 = nVar.f31496x;
                    jt.o.b(obj2);
                    return (t3.f) obj2;
                case 5:
                    z10 = nVar.f31496x;
                    kotlin.jvm.internal.c0 c0Var4 = (kotlin.jvm.internal.c0) nVar.f31495w;
                    kotlin.jvm.internal.c0 c0Var5 = (kotlin.jvm.internal.c0) nVar.f31494v;
                    dVar = (t3.d) nVar.f31493u;
                    k kVar3 = (k) nVar.f31492t;
                    jt.o.b(obj2);
                    c0Var2 = c0Var4;
                    c0Var = c0Var5;
                    r10 = kVar3;
                    c0Var2.f22552a = (T) obj2;
                    a0Var = new kotlin.jvm.internal.a0();
                    pVar = new p(c0Var, r10, a0Var, null);
                    nVar.f31492t = dVar;
                    nVar.f31493u = c0Var;
                    nVar.f31494v = a0Var;
                    nVar.f31495w = null;
                    nVar.B = 6;
                    if (r10.q(z10, pVar, nVar) != objE) {
                        a0Var2 = a0Var;
                        c0Var3 = c0Var;
                        T t12 = c0Var3.f22552a;
                        return new t3.f(t12, t12 != null ? t12.hashCode() : 0, a0Var2.f22549a);
                    }
                    return objE;
                case 6:
                    a0Var2 = (kotlin.jvm.internal.a0) nVar.f31494v;
                    c0Var3 = (kotlin.jvm.internal.c0) nVar.f31493u;
                    dVar2 = (t3.d) nVar.f31492t;
                    try {
                        jt.o.b(obj2);
                        T t13 = c0Var3.f22552a;
                        return new t3.f(t13, t13 != null ? t13.hashCode() : 0, a0Var2.f22549a);
                    } catch (Throwable th3) {
                        th = th3;
                        jt.a.a(dVar2, th);
                        throw dVar2;
                    }
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } catch (t3.d e13) {
            e = e13;
            r8 = r15;
        }
    }

    public final Object z(boolean z10, nt.b<? super d0<T>> bVar) {
        return ku.i.g(this.scope.getCoroutineContext(), new q(this, z10, null), bVar);
    }
}
