package t3;

import com.google.mlkit.common.MlKitException;
import iu.d2;
import iu.p0;
import java.lang.reflect.InvocationTargetException;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 f*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0002\u00136Ba\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u00120\b\u0002\u0010\u000b\u001a*\u0012&\u0012$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00060\u0005\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J4\u0010\u0013\u001a\u00028\u00002\"\u0010\u0012\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0006H\u0096@¢\u0006\u0004\b\u0013\u0010\u0014J \u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00020\u0016H\u0080@¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\tH\u0082@¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\tH\u0082@¢\u0006\u0004\b\u001d\u0010\u001cJ\u001e\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001f2\u0006\u0010\u001e\u001a\u00020\u0016H\u0082@¢\u0006\u0004\b \u0010!J\u001e\u0010$\u001a\u00020\t2\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\"H\u0082@¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\tH\u0082@¢\u0006\u0004\b&\u0010\u001cJ\u001e\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000\u001f2\u0006\u0010\u001e\u001a\u00020\u0016H\u0082@¢\u0006\u0004\b'\u0010!J\u0010\u0010(\u001a\u00028\u0000H\u0082@¢\u0006\u0004\b(\u0010\u001cJ<\u0010+\u001a\u00028\u00002\"\u0010\u0012\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00062\u0006\u0010*\u001a\u00020)H\u0082@¢\u0006\u0004\b+\u0010,J\u001e\u0010/\u001a\b\u0012\u0004\u0012\u00028\u00000.2\u0006\u0010-\u001a\u00020\u0016H\u0082@¢\u0006\u0004\b/\u0010!JI\u00103\u001a\u00028\u0001\"\u0004\b\u0001\u001002\u0006\u0010-\u001a\u00020\u00162\u001c\u00102\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\n01H\u0082@\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b3\u00104R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u00105R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R \u0010?\u001a\b\u0012\u0004\u0012\u00028\u00000:8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u0014\u0010C\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0016\u0010F\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0018\u0010J\u001a\u0004\u0018\u00010G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u001a\u0010N\u001a\b\u0012\u0004\u0012\u00028\u00000K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u001e\u0010R\u001a\f0OR\b\u0012\u0004\u0012\u00028\u00000\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR \u0010W\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000T0S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u001b\u0010\\\u001a\u00020X8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bY\u0010V\u001a\u0004\bZ\u0010[R \u0010`\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\"0]8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R!\u0010e\u001a\b\u0012\u0004\u0012\u00028\u00000T8@X\u0080\u0084\u0002¢\u0006\f\u001a\u0004\ba\u0010b*\u0004\bc\u0010d¨\u0006g"}, d2 = {"Lt3/k;", "T", "Lt3/i;", "Lt3/e0;", "storage", "", "Lkotlin/Function2;", "Lt3/s;", "Llt/b;", "", "", "initTasksList", "Lt3/e;", "corruptionHandler", "Liu/p0;", "scope", "<init>", "(Lt3/e0;Ljava/util/List;Lt3/e;Liu/p0;)V", "transform", "a", "(Lkotlin/jvm/functions/Function2;Llt/b;)Ljava/lang/Object;", "newData", "", "updateCache", "", "B", "(Ljava/lang/Object;ZLlt/b;)Ljava/lang/Object;", "u", "(Llt/b;)Ljava/lang/Object;", "p", "requireLock", "Lt3/d0;", "z", "(ZLlt/b;)Ljava/lang/Object;", "Lt3/w$a;", "update", "t", "(Lt3/w$a;Llt/b;)Ljava/lang/Object;", "v", "w", "x", "Lkotlin/coroutines/CoroutineContext;", "callerContext", "A", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/CoroutineContext;Llt/b;)Ljava/lang/Object;", "hasWriteFileLock", "Lt3/f;", "y", "R", "Lkotlin/Function1;", "block", "q", "(ZLkotlin/jvm/functions/Function1;Llt/b;)Ljava/lang/Object;", "Lt3/e0;", "b", "Lt3/e;", "c", "Liu/p0;", "Llu/h;", "d", "Llu/h;", "getData", "()Llu/h;", "data", "Lsu/a;", "e", "Lsu/a;", "collectorMutex", "f", "I", "collectorCounter", "Liu/d2;", "g", "Liu/d2;", "collectorJob", "Lt3/l;", "h", "Lt3/l;", "inMemoryCache", "Lt3/k$b;", "i", "Lt3/k$b;", "readAndInit", "Lgt/h;", "Lt3/f0;", "j", "Lgt/h;", "storageConnectionDelegate", "Lt3/t;", "k", "r", "()Lt3/t;", "coordinator", "Lt3/b0;", "l", "Lt3/b0;", "writeActor", "s", "()Lt3/f0;", "getStorageConnection$datastore_core_release$delegate", "(Lt3/k;)Ljava/lang/Object;", "storageConnection", "m", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
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
    public final lu.h<T> data;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final su.a collectorMutex;

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
    public final gt.h<f0<T>> storageConnectionDelegate;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final gt.h coordinator;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final b0<t3.w.a<T>> writeActor;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0082\u0004\u0018\u00002\u00020\u0001B7\u0012.\u0010\b\u001a*\u0012&\u0012$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00030\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0006H\u0094@¢\u0006\u0004\b\u000b\u0010\fR@\u0010\u000f\u001a,\u0012&\u0012$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lt3/k$b;", "Lt3/z;", "", "Lkotlin/Function2;", "Lt3/s;", "Llt/b;", "", "", "initTasksList", "<init>", "(Lt3/k;Ljava/util/List;)V", "b", "(Llt/b;)Ljava/lang/Object;", "c", "Ljava/util/List;", "initTasks", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class b extends z {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public List<? extends Function2<? super t3.s<T>, ? super lt.b<? super Unit>, ? extends Object>> initTasks;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ k<T> f31930d;

        @nt.f(c = "androidx.datastore.core.DataStoreImpl$InitDataStore", f = "DataStoreImpl.kt", l = {430, 434}, m = "doRun")
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class a extends nt.d {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public Object f31931t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public /* synthetic */ Object f31932u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ k<T>.b f31933v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public int f31934w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(k<T>.b bVar, lt.b<? super a> bVar2) {
                super(bVar2);
                this.f31933v = bVar;
            }

            @Override // nt.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f31932u = obj;
                this.f31934w |= Integer.MIN_VALUE;
                return this.f31933v.b(this);
            }
        }

        /* JADX INFO: renamed from: t3.k$b$b, reason: collision with other inner class name */
        @nt.f(c = "androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$initData$1", f = "DataStoreImpl.kt", l = {437, 458, 546, 468}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "Lt3/f;", "<anonymous>", "()Lt3/f;"}, k = 3, mv = {1, 8, 0})
        public static final class C0566b extends nt.m implements Function1<lt.b<? super t3.f<T>>, Object> {
            public final /* synthetic */ k<T> A;
            public final /* synthetic */ k<T>.b B;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public Object f31935t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public Object f31936u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public Object f31937v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public Object f31938w;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            public Object f31939x;

            /* JADX INFO: renamed from: y, reason: collision with root package name */
            public int f31940y;

            /* JADX INFO: renamed from: z, reason: collision with root package name */
            public int f31941z;

            /* JADX INFO: renamed from: t3.k$b$b$a */
            @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J4\u0010\u0006\u001a\u00028\u00002\"\u0010\u0005\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002H\u0096@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"t3/k$b$b$a", "Lt3/s;", "Lkotlin/Function2;", "Llt/b;", "", "transform", "a", "(Lkotlin/jvm/functions/Function2;Llt/b;)Ljava/lang/Object;", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class a implements t3.s<T> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ su.a f31942a;
                public final /* synthetic */ kotlin.jvm.internal.y b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ kotlin.jvm.internal.c0<T> f31943c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ k<T> f31944d;

                /* JADX INFO: renamed from: t3.k$b$b$a$a, reason: collision with other inner class name */
                @nt.f(c = "androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$initData$1$api$1", f = "DataStoreImpl.kt", l = {544, 447, 449}, m = "updateData")
                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                public static final class C0567a extends nt.d {
                    public int A;

                    /* JADX INFO: renamed from: t, reason: collision with root package name */
                    public Object f31945t;

                    /* JADX INFO: renamed from: u, reason: collision with root package name */
                    public Object f31946u;

                    /* JADX INFO: renamed from: v, reason: collision with root package name */
                    public Object f31947v;

                    /* JADX INFO: renamed from: w, reason: collision with root package name */
                    public Object f31948w;

                    /* JADX INFO: renamed from: x, reason: collision with root package name */
                    public Object f31949x;

                    /* JADX INFO: renamed from: y, reason: collision with root package name */
                    public /* synthetic */ Object f31950y;

                    public C0567a(lt.b bVar) {
                        super(bVar);
                    }

                    @Override // nt.a
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.f31950y = obj;
                        this.A |= Integer.MIN_VALUE;
                        return a.this.a(null, this);
                    }
                }

                public a(su.a aVar, kotlin.jvm.internal.y yVar, kotlin.jvm.internal.c0<T> c0Var, k<T> kVar) {
                    this.f31942a = aVar;
                    this.b = yVar;
                    this.f31943c = c0Var;
                    this.f31944d = kVar;
                }

                /* JADX WARN: Code duplicated, block: B:38:0x00ba A[Catch: all -> 0x0056, TRY_LEAVE, TryCatch #0 {all -> 0x0056, blocks: (B:21:0x0052, B:36:0x00b2, B:38:0x00ba), top: B:53:0x0052 }] */
                /* JADX WARN: Code duplicated, block: B:41:0x00ca  */
                /* JADX WARN: Code duplicated, block: B:43:0x00d1  */
                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // t3.s
                @Nullable
                public Object a(@NotNull Function2<? super T, ? super lt.b<? super T>, ? extends Object> function2, @NotNull lt.b<? super T> bVar) throws Throwable {
                    C0567a c0567a;
                    su.a aVar;
                    k kVar;
                    kotlin.jvm.internal.y yVar;
                    kotlin.jvm.internal.c0<T> c0Var;
                    su.a aVar2;
                    su.a aVar3;
                    k kVar2;
                    T t8;
                    kotlin.jvm.internal.c0<T> c0Var2;
                    if (bVar instanceof C0567a) {
                        c0567a = (C0567a) bVar;
                        int i10 = c0567a.A;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            c0567a.A = i10 - Integer.MIN_VALUE;
                        } else {
                            c0567a = new C0567a(bVar);
                        }
                    } else {
                        c0567a = new C0567a(bVar);
                    }
                    Object obj = c0567a.f31950y;
                    Object objE = mt.c.e();
                    int i11 = c0567a.A;
                    try {
                        if (i11 == 0) {
                            gt.o.b(obj);
                            aVar = this.f31942a;
                            kotlin.jvm.internal.y yVar2 = this.b;
                            kotlin.jvm.internal.c0<T> c0Var3 = this.f31943c;
                            kVar = this.f31944d;
                            c0567a.f31945t = function2;
                            c0567a.f31946u = aVar;
                            c0567a.f31947v = yVar2;
                            c0567a.f31948w = c0Var3;
                            c0567a.f31949x = kVar;
                            c0567a.A = 1;
                            if (aVar.b(null, c0567a) != objE) {
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
                                t8 = (T) c0567a.f31947v;
                                c0Var2 = (kotlin.jvm.internal.c0) c0567a.f31946u;
                                aVar2 = (su.a) c0567a.f31945t;
                                try {
                                    gt.o.b(obj);
                                    c0Var2.f23007a = t8;
                                    c0Var = c0Var2;
                                    T t10 = c0Var.f23007a;
                                    aVar2.f(null);
                                    return t10;
                                } catch (Throwable th2) {
                                    th = th2;
                                    aVar2.f(null);
                                    throw th;
                                }
                            }
                            k kVar3 = (k) c0567a.f31947v;
                            c0Var = (kotlin.jvm.internal.c0) c0567a.f31946u;
                            aVar3 = (su.a) c0567a.f31945t;
                            try {
                                gt.o.b(obj);
                                kVar2 = kVar3;
                                if (!Intrinsics.c(obj, c0Var.f23007a)) {
                                    c0567a.f31945t = aVar3;
                                    c0567a.f31946u = c0Var;
                                    c0567a.f31947v = obj;
                                    c0567a.A = 3;
                                    if (kVar2.B(obj, false, c0567a) != objE) {
                                        t8 = (T) obj;
                                        c0Var2 = c0Var;
                                        aVar2 = aVar3;
                                        c0Var2.f23007a = t8;
                                        c0Var = c0Var2;
                                    }
                                    return objE;
                                }
                                aVar2 = aVar3;
                                T t11 = c0Var.f23007a;
                                aVar2.f(null);
                                return t11;
                            } catch (Throwable th3) {
                                th = th3;
                                aVar2 = aVar3;
                                aVar2.f(null);
                                throw th;
                            }
                        }
                        k kVar4 = (k) c0567a.f31949x;
                        c0Var = (kotlin.jvm.internal.c0) c0567a.f31948w;
                        yVar = (kotlin.jvm.internal.y) c0567a.f31947v;
                        su.a aVar4 = (su.a) c0567a.f31946u;
                        Function2<? super T, ? super lt.b<? super T>, ? extends Object> function3 = (Function2) c0567a.f31945t;
                        gt.o.b(obj);
                        kVar = kVar4;
                        function2 = function3;
                        aVar = aVar4;
                        if (yVar.f23023a) {
                            throw new IllegalStateException("InitializerApi.updateData should not be called after initialization is complete.");
                        }
                        T t12 = c0Var.f23007a;
                        c0567a.f31945t = aVar;
                        c0567a.f31946u = c0Var;
                        c0567a.f31947v = kVar;
                        c0567a.f31948w = null;
                        c0567a.f31949x = null;
                        c0567a.A = 2;
                        Object objInvoke = function2.invoke(t12, c0567a);
                        if (objInvoke != objE) {
                            aVar3 = aVar;
                            obj = objInvoke;
                            kVar2 = kVar;
                            if (!Intrinsics.c(obj, c0Var.f23007a)) {
                                c0567a.f31945t = aVar3;
                                c0567a.f31946u = c0Var;
                                c0567a.f31947v = obj;
                                c0567a.A = 3;
                                if (kVar2.B(obj, false, c0567a) != objE) {
                                    t8 = (T) obj;
                                    c0Var2 = c0Var;
                                    aVar2 = aVar3;
                                    c0Var2.f23007a = t8;
                                    c0Var = c0Var2;
                                }
                            } else {
                                aVar2 = aVar3;
                            }
                            T t13 = c0Var.f23007a;
                            aVar2.f(null);
                            return t13;
                        }
                        return objE;
                    } catch (Throwable th4) {
                        th = th4;
                        aVar2 = aVar;
                        aVar2.f(null);
                        throw th;
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0566b(k<T> kVar, k<T>.b bVar, lt.b<? super C0566b> bVar2) {
                super(1, bVar2);
                this.A = kVar;
                this.B = bVar;
            }

            @Override // nt.a
            @NotNull
            public final lt.b<Unit> create(@NotNull lt.b<?> bVar) {
                return new C0566b(this.A, this.B, bVar);
            }

            /* JADX WARN: Code duplicated, block: B:23:0x00b1  */
            /* JADX WARN: Code duplicated, block: B:31:0x00e8  */
            /* JADX WARN: Code duplicated, block: B:35:0x00f4  */
            /* JADX WARN: Code duplicated, block: B:39:0x010f  */
            /* JADX WARN: Code duplicated, block: B:48:0x010e A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:50:? A[LOOP:0: B:21:0x00ab->B:50:?, LOOP_END, SYNTHETIC] */
            @Override // nt.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) throws t3.d, IllegalAccessException, InvocationTargetException {
                su.a aVarB;
                kotlin.jvm.internal.y yVar;
                kotlin.jvm.internal.c0 c0Var;
                kotlin.jvm.internal.c0 c0Var2;
                kotlin.jvm.internal.y yVar2;
                su.a aVar;
                Iterator<T> it;
                su.a aVar2;
                kotlin.jvm.internal.y yVar3;
                kotlin.jvm.internal.c0 c0Var3;
                a aVar3;
                kotlin.jvm.internal.c0 c0Var4;
                Function2 function2;
                Object obj2;
                int iHashCode;
                int i10;
                Object objE = mt.c.e();
                int i11 = this.f31941z;
                if (i11 == 0) {
                    gt.o.b(obj);
                    aVarB = su.g.b(false, 1, null);
                    yVar = new kotlin.jvm.internal.y();
                    c0Var = new kotlin.jvm.internal.c0();
                    k<T> kVar = this.A;
                    this.f31935t = aVarB;
                    this.f31936u = yVar;
                    this.f31937v = c0Var;
                    this.f31938w = c0Var;
                    this.f31941z = 1;
                    obj = kVar.y(true, this);
                    if (obj != objE) {
                        c0Var2 = c0Var;
                    }
                    return objE;
                }
                if (i11 == 1) {
                    c0Var = (kotlin.jvm.internal.c0) this.f31938w;
                    c0Var2 = (kotlin.jvm.internal.c0) this.f31937v;
                    yVar = (kotlin.jvm.internal.y) this.f31936u;
                    aVarB = (su.a) this.f31935t;
                    gt.o.b(obj);
                } else {
                    if (i11 == 2) {
                        it = (Iterator) this.f31939x;
                        aVar3 = (a) this.f31938w;
                        c0Var3 = (kotlin.jvm.internal.c0) this.f31937v;
                        yVar3 = (kotlin.jvm.internal.y) this.f31936u;
                        aVar2 = (su.a) this.f31935t;
                        gt.o.b(obj);
                        while (it.hasNext()) {
                            function2 = (Function2) it.next();
                            this.f31935t = aVar2;
                            this.f31936u = yVar3;
                            this.f31937v = c0Var3;
                            this.f31938w = aVar3;
                            this.f31939x = it;
                            this.f31941z = 2;
                            if (function2.invoke(aVar3, this) == objE) {
                                return objE;
                            }
                        }
                        c0Var2 = c0Var3;
                        yVar2 = yVar3;
                        aVar = aVar2;
                        this.B.initTasks = null;
                        this.f31935t = yVar2;
                        this.f31936u = c0Var2;
                        this.f31937v = aVar;
                        this.f31938w = null;
                        this.f31939x = null;
                        this.f31941z = 3;
                        if (aVar.b(null, this) != objE) {
                            c0Var4 = c0Var2;
                            yVar2.f23023a = true;
                            Unit unit = Unit.f22938a;
                            aVar.f(null);
                            obj2 = c0Var4.f23007a;
                            if (obj2 != null) {
                            }
                            t3.t tVarR = this.A.r();
                            this.f31935t = obj2;
                            this.f31936u = null;
                            this.f31937v = null;
                            this.f31940y = iHashCode;
                            this.f31941z = 4;
                            obj = tVarR.b(this);
                            if (obj != objE) {
                                i10 = iHashCode;
                            }
                        }
                        return objE;
                    }
                    if (i11 == 3) {
                        aVar = (su.a) this.f31937v;
                        c0Var4 = (kotlin.jvm.internal.c0) this.f31936u;
                        yVar2 = (kotlin.jvm.internal.y) this.f31935t;
                        gt.o.b(obj);
                        try {
                            yVar2.f23023a = true;
                            Unit unit2 = Unit.f22938a;
                            aVar.f(null);
                            obj2 = c0Var4.f23007a;
                            iHashCode = obj2 != null ? obj2.hashCode() : 0;
                            t3.t tVarR2 = this.A.r();
                            this.f31935t = obj2;
                            this.f31936u = null;
                            this.f31937v = null;
                            this.f31940y = iHashCode;
                            this.f31941z = 4;
                            obj = tVarR2.b(this);
                            if (obj != objE) {
                                i10 = iHashCode;
                            }
                            return objE;
                        } catch (Throwable th2) {
                            aVar.f(null);
                            throw th2;
                        }
                    }
                    if (i11 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i10 = this.f31940y;
                    obj2 = this.f31935t;
                    gt.o.b(obj);
                }
                return new t3.f(obj2, i10, ((Number) obj).intValue());
                c0Var.f23007a = (T) ((t3.f) obj).c();
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
                        this.f31935t = aVar2;
                        this.f31936u = yVar3;
                        this.f31937v = c0Var3;
                        this.f31938w = aVar3;
                        this.f31939x = it;
                        this.f31941z = 2;
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
                this.f31935t = yVar2;
                this.f31936u = c0Var2;
                this.f31937v = aVar;
                this.f31938w = null;
                this.f31939x = null;
                this.f31941z = 3;
                if (aVar.b(null, this) != objE) {
                    c0Var4 = c0Var2;
                    yVar2.f23023a = true;
                    Unit unit3 = Unit.f22938a;
                    aVar.f(null);
                    obj2 = c0Var4.f23007a;
                    if (obj2 != null) {
                    }
                    t3.t tVarR3 = this.A.r();
                    this.f31935t = obj2;
                    this.f31936u = null;
                    this.f31937v = null;
                    this.f31940y = iHashCode;
                    this.f31941z = 4;
                    obj = tVarR3.b(this);
                    if (obj != objE) {
                        i10 = iHashCode;
                        return new t3.f(obj2, i10, ((Number) obj).intValue());
                    }
                }
                return objE;
            }

            @Override // kotlin.jvm.functions.Function1
            @Nullable
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@Nullable lt.b<? super t3.f<T>> bVar) {
                return ((C0566b) create(bVar)).invokeSuspend(Unit.f22938a);
            }
        }

        public b(@NotNull k kVar, List<? extends Function2<? super t3.s<T>, ? super lt.b<? super Unit>, ? extends Object>> initTasksList) {
            Intrinsics.checkNotNullParameter(initTasksList, "initTasksList");
            this.f31930d = kVar;
            this.initTasks = CollectionsKt.M0(initTasksList);
        }

        /* JADX WARN: Code duplicated, block: B:26:0x006e  */
        /* JADX WARN: Code duplicated, block: B:29:0x007c  */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // t3.z
        @Nullable
        public Object b(@NotNull lt.b<? super Unit> bVar) throws t3.d, IllegalAccessException, InvocationTargetException {
            a aVar;
            b bVar2;
            t3.f fVar;
            if (bVar instanceof a) {
                aVar = (a) bVar;
                int i10 = aVar.f31934w;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    aVar.f31934w = i10 - Integer.MIN_VALUE;
                } else {
                    aVar = new a(this, bVar);
                }
            } else {
                aVar = new a(this, bVar);
            }
            Object objY = aVar.f31932u;
            Object objE = mt.c.e();
            int i11 = aVar.f31934w;
            if (i11 == 0) {
                gt.o.b(objY);
                List<? extends Function2<? super t3.s<T>, ? super lt.b<? super Unit>, ? extends Object>> list = this.initTasks;
                if (list != null) {
                    Intrinsics.checkNotNull(list);
                    if (list.isEmpty()) {
                        k<T> kVar = this.f31930d;
                        aVar.f31931t = this;
                        aVar.f31934w = 1;
                        objY = kVar.y(false, aVar);
                        if (objY != objE) {
                            bVar2 = this;
                            fVar = (t3.f) objY;
                        }
                    } else {
                        t3.t tVarR = this.f31930d.r();
                        C0566b c0566b = new C0566b(this.f31930d, this, null);
                        aVar.f31931t = this;
                        aVar.f31934w = 2;
                        objY = tVarR.e(c0566b, aVar);
                        if (objY != objE) {
                            bVar2 = this;
                            fVar = (t3.f) objY;
                        }
                    }
                } else {
                    k<T> kVar2 = this.f31930d;
                    aVar.f31931t = this;
                    aVar.f31934w = 1;
                    objY = kVar2.y(false, aVar);
                    if (objY != objE) {
                        bVar2 = this;
                        fVar = (t3.f) objY;
                    }
                }
                return objE;
            }
            if (i11 == 1) {
                bVar2 = (b) aVar.f31931t;
                gt.o.b(objY);
                fVar = (t3.f) objY;
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bVar2 = (b) aVar.f31931t;
                gt.o.b(objY);
                fVar = (t3.f) objY;
            }
            bVar2.f31930d.inMemoryCache.c(fVar);
            return Unit.f22938a;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "Lt3/t;", "b", "()Lt3/t;"}, k = 3, mv = {1, 8, 0})
    public static final class c extends kotlin.jvm.internal.m implements Function0<t3.t> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ k<T> f31952i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(k<T> kVar) {
            super(0);
            this.f31952i = kVar;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final t3.t invoke() {
            return this.f31952i.s().getCoordinator();
        }
    }

    @nt.f(c = "androidx.datastore.core.DataStoreImpl$data$1", f = "DataStoreImpl.kt", l = {72, 74, 100}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Llu/i;", "", "<anonymous>", "(Llu/i;)V"}, k = 3, mv = {1, 8, 0})
    public static final class d extends nt.m implements Function2<lu.i<? super T>, lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f31953t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f31954u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f31955v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ k<T> f31956w;

        @nt.f(c = "androidx.datastore.core.DataStoreImpl$data$1$1", f = "DataStoreImpl.kt", l = {102}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Llu/i;", "Lt3/d0;", "", "<anonymous>", "(Llu/i;)V"}, k = 3, mv = {1, 8, 0})
        public static final class a extends nt.m implements Function2<lu.i<? super d0<T>>, lt.b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f31957t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ k<T> f31958u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(k<T> kVar, lt.b<? super a> bVar) {
                super(2, bVar);
                this.f31958u = kVar;
            }

            @Override // nt.a
            @NotNull
            public final lt.b<Unit> create(@Nullable Object obj, @NotNull lt.b<?> bVar) {
                return new a(this.f31958u, bVar);
            }

            @Override // nt.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object objE = mt.c.e();
                int i10 = this.f31957t;
                if (i10 == 0) {
                    gt.o.b(obj);
                    k<T> kVar = this.f31958u;
                    this.f31957t = 1;
                    if (kVar.u(this) == objE) {
                        return objE;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gt.o.b(obj);
                }
                return Unit.f22938a;
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@NotNull lu.i<? super d0<T>> iVar, @Nullable lt.b<? super Unit> bVar) {
                return ((a) create(iVar, bVar)).invokeSuspend(Unit.f22938a);
            }
        }

        @nt.f(c = "androidx.datastore.core.DataStoreImpl$data$1$2", f = "DataStoreImpl.kt", l = {}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lt3/d0;", "it", "", "<anonymous>", "(Lt3/d0;)Z"}, k = 3, mv = {1, 8, 0})
        public static final class b extends nt.m implements Function2<d0<T>, lt.b<? super Boolean>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f31959t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public /* synthetic */ Object f31960u;

            public b(lt.b<? super b> bVar) {
                super(2, bVar);
            }

            @Override // nt.a
            @NotNull
            public final lt.b<Unit> create(@Nullable Object obj, @NotNull lt.b<?> bVar) {
                b bVar2 = new b(bVar);
                bVar2.f31960u = obj;
                return bVar2;
            }

            @Override // nt.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                mt.c.e();
                if (this.f31959t != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
                return nt.b.a(!(((d0) this.f31960u) instanceof t3.r));
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@NotNull d0<T> d0Var, @Nullable lt.b<? super Boolean> bVar) {
                return ((b) create(d0Var, bVar)).invokeSuspend(Unit.f22938a);
            }
        }

        @nt.f(c = "androidx.datastore.core.DataStoreImpl$data$1$3", f = "DataStoreImpl.kt", l = {}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lt3/d0;", "it", "", "<anonymous>", "(Lt3/d0;)Z"}, k = 3, mv = {1, 8, 0})
        public static final class c extends nt.m implements Function2<d0<T>, lt.b<? super Boolean>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f31961t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public /* synthetic */ Object f31962u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ d0<T> f31963v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(d0<T> d0Var, lt.b<? super c> bVar) {
                super(2, bVar);
                this.f31963v = d0Var;
            }

            @Override // nt.a
            @NotNull
            public final lt.b<Unit> create(@Nullable Object obj, @NotNull lt.b<?> bVar) {
                c cVar = new c(this.f31963v, bVar);
                cVar.f31962u = obj;
                return cVar;
            }

            @Override // nt.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                mt.c.e();
                if (this.f31961t != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
                d0 d0Var = (d0) this.f31962u;
                return nt.b.a((d0Var instanceof t3.f) && d0Var.getVersion() <= this.f31963v.getVersion());
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@NotNull d0<T> d0Var, @Nullable lt.b<? super Boolean> bVar) {
                return ((c) create(d0Var, bVar)).invokeSuspend(Unit.f22938a);
            }
        }

        /* JADX INFO: renamed from: t3.k$d$d, reason: collision with other inner class name */
        @nt.f(c = "androidx.datastore.core.DataStoreImpl$data$1$5", f = "DataStoreImpl.kt", l = {116}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Llu/i;", "", "it", "", "<anonymous>", "(Llu/i;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
        public static final class C0568d extends nt.m implements xt.n<lu.i<? super T>, Throwable, lt.b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f31964t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ k<T> f31965u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0568d(k<T> kVar, lt.b<? super C0568d> bVar) {
                super(3, bVar);
                this.f31965u = kVar;
            }

            @Override // nt.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object objE = mt.c.e();
                int i10 = this.f31964t;
                if (i10 == 0) {
                    gt.o.b(obj);
                    k<T> kVar = this.f31965u;
                    this.f31964t = 1;
                    if (kVar.p(this) == objE) {
                        return objE;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gt.o.b(obj);
                }
                return Unit.f22938a;
            }

            @Override // xt.n
            @Nullable
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@NotNull lu.i<? super T> iVar, @Nullable Throwable th2, @Nullable lt.b<? super Unit> bVar) {
                return new C0568d(this.f31965u, bVar).invokeSuspend(Unit.f22938a);
            }
        }

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Llu/h;", "Llu/i;", "collector", "", "collect", "(Llu/i;Llt/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class e implements lu.h<T> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ lu.h f31966a;

            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Llt/b;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            public static final class a<T> implements lu.i {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ lu.i f31967a;

                /* JADX INFO: renamed from: t3.k$d$e$a$a, reason: collision with other inner class name */
                @nt.f(c = "androidx.datastore.core.DataStoreImpl$data$1$invokeSuspend$$inlined$map$1$2", f = "DataStoreImpl.kt", l = {223}, m = "emit")
                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                public static final class C0569a extends nt.d {

                    /* JADX INFO: renamed from: t, reason: collision with root package name */
                    public /* synthetic */ Object f31968t;

                    /* JADX INFO: renamed from: u, reason: collision with root package name */
                    public int f31969u;

                    public C0569a(lt.b bVar) {
                        super(bVar);
                    }

                    @Override // nt.a
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.f31968t = obj;
                        this.f31969u |= Integer.MIN_VALUE;
                        return a.this.emit(null, this);
                    }
                }

                public a(lu.i iVar) {
                    this.f31967a = iVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // lu.i
                @Nullable
                public final Object emit(Object obj, @NotNull lt.b bVar) throws Throwable {
                    C0569a c0569a;
                    if (bVar instanceof C0569a) {
                        c0569a = (C0569a) bVar;
                        int i10 = c0569a.f31969u;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            c0569a.f31969u = i10 - Integer.MIN_VALUE;
                        } else {
                            c0569a = new C0569a(bVar);
                        }
                    } else {
                        c0569a = new C0569a(bVar);
                    }
                    Object obj2 = c0569a.f31968t;
                    Object objE = mt.c.e();
                    int i11 = c0569a.f31969u;
                    if (i11 == 0) {
                        gt.o.b(obj2);
                        lu.i iVar = this.f31967a;
                        d0 d0Var = (d0) obj;
                        if (d0Var instanceof t3.x) {
                            throw ((t3.x) d0Var).getReadException();
                        }
                        if (!(d0Var instanceof t3.f)) {
                            if (d0Var instanceof t3.r ? true : d0Var instanceof h0) {
                                throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                            }
                            throw new gt.l();
                        }
                        Object objC = ((t3.f) d0Var).c();
                        c0569a.f31969u = 1;
                        if (iVar.emit(objC, c0569a) == objE) {
                            return objE;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        gt.o.b(obj2);
                    }
                    return Unit.f22938a;
                }
            }

            public e(lu.h hVar) {
                this.f31966a = hVar;
            }

            @Override // lu.h
            @Nullable
            public Object collect(@NotNull lu.i iVar, @NotNull lt.b bVar) {
                Object objCollect = this.f31966a.collect(new a(iVar), bVar);
                return objCollect == mt.c.e() ? objCollect : Unit.f22938a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(k<T> kVar, lt.b<? super d> bVar) {
            super(2, bVar);
            this.f31956w = kVar;
        }

        @Override // nt.a
        @NotNull
        public final lt.b<Unit> create(@Nullable Object obj, @NotNull lt.b<?> bVar) {
            d dVar = new d(this.f31956w, bVar);
            dVar.f31955v = obj;
            return dVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:32:0x00bb, code lost:
        
            if (lu.j.q(r1, r9, r8) == r0) goto L33;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v13 */
        /* JADX WARN: Type inference failed for: r1v14 */
        /* JADX WARN: Type inference failed for: r1v3 */
        /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, lu.i] */
        /* JADX WARN: Type inference failed for: r1v6, types: [lu.i] */
        /* JADX WARN: Type inference failed for: r1v8 */
        /* JADX WARN: Type inference failed for: r3v12 */
        /* JADX WARN: Type inference failed for: r3v15 */
        /* JADX WARN: Type inference failed for: r3v5 */
        @Override // nt.a
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
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull lu.i<? super T> iVar, @Nullable lt.b<? super Unit> bVar) {
            return ((d) create(iVar, bVar)).invokeSuspend(Unit.f22938a);
        }
    }

    @nt.f(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", l = {544}, m = "decrementCollector")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class e extends nt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f31971t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f31972u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f31973v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ k<T> f31974w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f31975x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(k<T> kVar, lt.b<? super e> bVar) {
            super(bVar);
            this.f31974w = kVar;
        }

        @Override // nt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f31973v = obj;
            this.f31975x |= Integer.MIN_VALUE;
            return this.f31974w.p(this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @nt.f(c = "androidx.datastore.core.DataStoreImpl$doWithWriteFileLock$3", f = "DataStoreImpl.kt", l = {416}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0003\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u0002H\u008a@"}, d2 = {"<anonymous>", "R", "T"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class f<R> extends nt.m implements Function1<lt.b<? super R>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f31976t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Function1<lt.b<? super R>, Object> f31977u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(Function1<? super lt.b<? super R>, ? extends Object> function1, lt.b<? super f> bVar) {
            super(1, bVar);
            this.f31977u = function1;
        }

        @Override // nt.a
        @NotNull
        public final lt.b<Unit> create(@NotNull lt.b<?> bVar) {
            return new f(this.f31977u, bVar);
        }

        @Override // nt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objE = mt.c.e();
            int i10 = this.f31976t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
                return obj;
            }
            gt.o.b(obj);
            Function1<lt.b<? super R>, Object> function1 = this.f31977u;
            this.f31976t = 1;
            Object objInvoke = function1.invoke(this);
            return objInvoke == objE ? objE : objInvoke;
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Nullable lt.b<? super R> bVar) {
            return ((f) create(bVar)).invokeSuspend(Unit.f22938a);
        }
    }

    @nt.f(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", l = {237, 243, 246}, m = "handleUpdate")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class g extends nt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f31978t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f31979u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f31980v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public /* synthetic */ Object f31981w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ k<T> f31982x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f31983y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(k<T> kVar, lt.b<? super g> bVar) {
            super(bVar);
            this.f31982x = kVar;
        }

        @Override // nt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f31981w = obj;
            this.f31983y |= Integer.MIN_VALUE;
            return this.f31982x.t(null, this);
        }
    }

    @nt.f(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", l = {544}, m = "incrementCollector")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class h extends nt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f31984t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f31985u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f31986v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ k<T> f31987w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f31988x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(k<T> kVar, lt.b<? super h> bVar) {
            super(bVar);
            this.f31987w = kVar;
        }

        @Override // nt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f31986v = obj;
            this.f31988x |= Integer.MIN_VALUE;
            return this.f31987w.u(this);
        }
    }

    @nt.f(c = "androidx.datastore.core.DataStoreImpl$incrementCollector$2$1", f = "DataStoreImpl.kt", l = {134, 135}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {1, 8, 0})
    public static final class i extends nt.m implements Function2<p0, lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f31989t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ k<T> f31990u;

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "", "it", "b", "(Lkotlin/Unit;Llt/b;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
        public static final class a<T> implements lu.i {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ k<T> f31991a;

            public a(k<T> kVar) {
                this.f31991a = kVar;
            }

            @Override // lu.i
            @Nullable
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(@NotNull Unit unit, @NotNull lt.b<? super Unit> bVar) {
                Object objW;
                return ((this.f31991a.inMemoryCache.a() instanceof t3.r) || (objW = this.f31991a.w(true, bVar)) != mt.c.e()) ? Unit.f22938a : objW;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(k<T> kVar, lt.b<? super i> bVar) {
            super(2, bVar);
            this.f31990u = kVar;
        }

        @Override // nt.a
        @NotNull
        public final lt.b<Unit> create(@Nullable Object obj, @NotNull lt.b<?> bVar) {
            return new i(this.f31990u, bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull p0 p0Var, @Nullable lt.b<? super Unit> bVar) {
            return ((i) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
        
            if (r5.collect(r1, r4) == r0) goto L15;
         */
        @Override // nt.a
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = mt.c.e()
                int r1 = r4.f31989t
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                gt.o.b(r5)
                goto L4e
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1a:
                gt.o.b(r5)
                goto L30
            L1e:
                gt.o.b(r5)
                t3.k<T> r5 = r4.f31990u
                t3.k$b r5 = t3.k.e(r5)
                r4.f31989t = r3
                java.lang.Object r5 = r5.a(r4)
                if (r5 != r0) goto L30
                goto L4d
            L30:
                t3.k<T> r5 = r4.f31990u
                t3.t r5 = t3.k.c(r5)
                lu.h r5 = r5.d()
                lu.h r5 = lu.j.k(r5)
                t3.k$i$a r1 = new t3.k$i$a
                t3.k<T> r3 = r4.f31990u
                r1.<init>(r3)
                r4.f31989t = r2
                java.lang.Object r5 = r5.collect(r1, r4)
                if (r5 != r0) goto L4e
            L4d:
                return r0
            L4e:
                kotlin.Unit r5 = kotlin.Unit.f22938a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: t3.k.i.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @nt.f(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", l = {264, 266}, m = "readAndInitOrPropagateAndThrowFailure")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class j extends nt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f31992t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f31993u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f31994v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ k<T> f31995w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f31996x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(k<T> kVar, lt.b<? super j> bVar) {
            super(bVar);
            this.f31995w = kVar;
        }

        @Override // nt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f31994v = obj;
            this.f31996x |= Integer.MIN_VALUE;
            return this.f31995w.v(this);
        }
    }

    /* JADX INFO: renamed from: t3.k$k, reason: collision with other inner class name */
    @nt.f(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", l = {287, 296, 304}, m = "readDataAndUpdateCache")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class C0570k extends nt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f31997t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f31998u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public boolean f31999v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public /* synthetic */ Object f32000w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ k<T> f32001x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f32002y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0570k(k<T> kVar, lt.b<? super C0570k> bVar) {
            super(bVar);
            this.f32001x = kVar;
        }

        @Override // nt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f32000w = obj;
            this.f32002y |= Integer.MIN_VALUE;
            return this.f32001x.w(false, this);
        }
    }

    @nt.f(c = "androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$3", f = "DataStoreImpl.kt", l = {298, MlKitException.LOW_LIGHT_AUTO_EXPOSURE_COMPUTATION_FAILURE}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0004\u0012\u00020\u00030\u0001\"\u0004\b\u0000\u0010\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lkotlin/Pair;", "Lt3/d0;", "", "<anonymous>", "()Lkotlin/Pair;"}, k = 3, mv = {1, 8, 0})
    public static final class l extends nt.m implements Function1<lt.b<? super Pair<? extends d0<T>, ? extends Boolean>>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f32003t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f32004u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ k<T> f32005v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(k<T> kVar, lt.b<? super l> bVar) {
            super(1, bVar);
            this.f32005v = kVar;
        }

        @Override // nt.a
        @NotNull
        public final lt.b<Unit> create(@NotNull lt.b<?> bVar) {
            return new l(this.f32005v, bVar);
        }

        @Override // nt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Throwable th2;
            d0 xVar;
            Object objE = mt.c.e();
            int i10 = this.f32004u;
            try {
                if (i10 == 0) {
                    gt.o.b(obj);
                    k<T> kVar = this.f32005v;
                    this.f32004u = 1;
                    obj = kVar.y(true, this);
                    if (obj == objE) {
                        return objE;
                    }
                } else {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        th2 = (Throwable) this.f32003t;
                        gt.o.b(obj);
                        xVar = new t3.x(th2, ((Number) obj).intValue());
                        return gt.s.a(xVar, nt.b.a(true));
                    }
                    gt.o.b(obj);
                }
                xVar = (d0) obj;
            } catch (Throwable th3) {
                t3.t tVarR = this.f32005v.r();
                this.f32003t = th3;
                this.f32004u = 2;
                Object objB = tVarR.b(this);
                if (objB != objE) {
                    th2 = th3;
                    obj = objB;
                }
                return objE;
            }
            return gt.s.a(xVar, nt.b.a(true));
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Nullable lt.b<? super Pair<? extends d0<T>, Boolean>> bVar) {
            return ((l) create(bVar)).invokeSuspend(Unit.f22938a);
        }
    }

    @nt.f(c = "androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$4", f = "DataStoreImpl.kt", l = {306, 309}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0004\u0012\u00020\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "", "locked", "Lkotlin/Pair;", "Lt3/d0;", "<anonymous>", "(Z)Lkotlin/Pair;"}, k = 3, mv = {1, 8, 0})
    public static final class m extends nt.m implements Function2<Boolean, lt.b<? super Pair<? extends d0<T>, ? extends Boolean>>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f32006t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f32007u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ boolean f32008v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ k<T> f32009w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ int f32010x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(k<T> kVar, int i10, lt.b<? super m> bVar) {
            super(2, bVar);
            this.f32009w = kVar;
            this.f32010x = i10;
        }

        @Override // nt.a
        @NotNull
        public final lt.b<Unit> create(@Nullable Object obj, @NotNull lt.b<?> bVar) {
            m mVar = new m(this.f32009w, this.f32010x, bVar);
            mVar.f32008v = ((Boolean) obj).booleanValue();
            return mVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Object obj) {
            return m(bool.booleanValue(), (lt.b) obj);
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
        @Override // nt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Throwable th2;
            int iIntValue;
            ?? r8;
            ?? r10;
            d0 d0Var;
            ?? r11;
            Object objE = mt.c.e();
            ?? r12 = this.f32007u;
            try {
                if (r12 == 0) {
                    gt.o.b(obj);
                    boolean z10 = this.f32008v;
                    k<T> kVar = this.f32009w;
                    this.f32008v = z10;
                    this.f32007u = 1;
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
                        boolean z11 = this.f32008v;
                        th2 = (Throwable) this.f32006t;
                        gt.o.b(obj);
                        r10 = z11;
                        iIntValue = ((Number) obj).intValue();
                        r8 = r10;
                        t3.x xVar = new t3.x(th2, iIntValue);
                        r11 = r8;
                        d0Var = xVar;
                        return gt.s.a(d0Var, nt.b.a(r11));
                    }
                    boolean z12 = this.f32008v;
                    gt.o.b(obj);
                    r12 = z12;
                }
                d0Var = (d0) obj;
                r11 = r12;
            } catch (Throwable th3) {
                if (r12 != 0) {
                    t3.t tVarR = this.f32009w.r();
                    this.f32006t = th3;
                    this.f32008v = r12;
                    this.f32007u = 2;
                    Object objB = tVarR.b(this);
                    if (objB != objE) {
                        r10 = r12;
                        th2 = th3;
                        obj = objB;
                    }
                    return objE;
                }
                ?? r13 = r12;
                th2 = th3;
                iIntValue = this.f32010x;
                r8 = r13 == true ? 1 : 0;
            }
            return gt.s.a(d0Var, nt.b.a(r11));
        }

        @Nullable
        public final Object m(boolean z10, @Nullable lt.b<? super Pair<? extends d0<T>, Boolean>> bVar) {
            return ((m) create(Boolean.valueOf(z10), bVar)).invokeSuspend(Unit.f22938a);
        }
    }

    @nt.f(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", l = {365, 366, 368, 369, 380, 384}, m = "readDataOrHandleCorruption")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class n extends nt.d {
        public final /* synthetic */ k<T> A;
        public int B;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f32011t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f32012u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f32013v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Object f32014w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public boolean f32015x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f32016y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public /* synthetic */ Object f32017z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(k<T> kVar, lt.b<? super n> bVar) {
            super(bVar);
            this.A = kVar;
        }

        @Override // nt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f32017z = obj;
            this.B |= Integer.MIN_VALUE;
            return this.A.y(false, this);
        }
    }

    @nt.f(c = "androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$2", f = "DataStoreImpl.kt", l = {370, 371}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "locked", "Lt3/f;", "<anonymous>", "(Z)Lt3/f;"}, k = 3, mv = {1, 8, 0})
    public static final class o extends nt.m implements Function2<Boolean, lt.b<? super t3.f<T>>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f32018t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f32019u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ boolean f32020v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ k<T> f32021w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ int f32022x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(k<T> kVar, int i10, lt.b<? super o> bVar) {
            super(2, bVar);
            this.f32021w = kVar;
            this.f32022x = i10;
        }

        @Override // nt.a
        @NotNull
        public final lt.b<Unit> create(@Nullable Object obj, @NotNull lt.b<?> bVar) {
            o oVar = new o(this.f32021w, this.f32022x, bVar);
            oVar.f32020v = ((Boolean) obj).booleanValue();
            return oVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Object obj) {
            return m(bool.booleanValue(), (lt.b) obj);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0059  */
        /* JADX WARN: Code duplicated, block: B:23:0x005e  */
        @Override // nt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            boolean z10;
            Object obj2;
            int iIntValue;
            int iHashCode;
            Object objE = mt.c.e();
            int i10 = this.f32019u;
            if (i10 == 0) {
                gt.o.b(obj);
                z10 = this.f32020v;
                k<T> kVar = this.f32021w;
                this.f32020v = z10;
                this.f32019u = 1;
                obj = kVar.x(this);
                if (obj != objE) {
                }
                return objE;
            }
            if (i10 == 1) {
                z10 = this.f32020v;
                gt.o.b(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj2 = this.f32018t;
                gt.o.b(obj);
            }
            iIntValue = ((Number) obj).intValue();
            if (obj2 != null) {
                iHashCode = obj2.hashCode();
            } else {
                iHashCode = 0;
            }
            return new t3.f(obj2, iHashCode, iIntValue);
            if (z10) {
                t3.t tVarR = this.f32021w.r();
                this.f32018t = obj;
                this.f32019u = 2;
                Object objB = tVarR.b(this);
                if (objB != objE) {
                    obj2 = obj;
                    obj = objB;
                    iIntValue = ((Number) obj).intValue();
                }
                return objE;
            }
            obj2 = obj;
            iIntValue = this.f32022x;
            if (obj2 != null) {
                iHashCode = obj2.hashCode();
            } else {
                iHashCode = 0;
            }
            return new t3.f(obj2, iHashCode, iIntValue);
        }

        @Nullable
        public final Object m(boolean z10, @Nullable lt.b<? super t3.f<T>> bVar) {
            return ((o) create(Boolean.valueOf(z10), bVar)).invokeSuspend(Unit.f22938a);
        }
    }

    @nt.f(c = "androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$3", f = "DataStoreImpl.kt", l = {387, 388, 390}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\u008a@"}, d2 = {"<anonymous>", "", "T"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class p extends nt.m implements Function1<lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f32023t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f32024u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.c0<T> f32025v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ k<T> f32026w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.a0 f32027x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(kotlin.jvm.internal.c0<T> c0Var, k<T> kVar, kotlin.jvm.internal.a0 a0Var, lt.b<? super p> bVar) {
            super(1, bVar);
            this.f32025v = c0Var;
            this.f32026w = kVar;
            this.f32027x = a0Var;
        }

        @Override // nt.a
        @NotNull
        public final lt.b<Unit> create(@NotNull lt.b<?> bVar) {
            return new p(this.f32025v, this.f32026w, this.f32027x, bVar);
        }

        @Override // nt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.jvm.internal.a0 a0Var;
            kotlin.jvm.internal.c0<T> c0Var;
            kotlin.jvm.internal.a0 a0Var2;
            Object objE = mt.c.e();
            int i10 = this.f32024u;
            try {
                if (i10 == 0) {
                    gt.o.b(obj);
                    c0Var = this.f32025v;
                    k<T> kVar = this.f32026w;
                    this.f32023t = c0Var;
                    this.f32024u = 1;
                    obj = (T) kVar.x(this);
                    if (obj == objE) {
                    }
                    return objE;
                }
                if (i10 == 1) {
                    c0Var = (kotlin.jvm.internal.c0) this.f32023t;
                    gt.o.b(obj);
                } else {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        a0Var = (kotlin.jvm.internal.a0) this.f32023t;
                        gt.o.b(obj);
                        a0Var.f23004a = ((Number) obj).intValue();
                        return Unit.f22938a;
                    }
                    a0Var2 = (kotlin.jvm.internal.a0) this.f32023t;
                    gt.o.b(obj);
                }
                a0Var2.f23004a = ((Number) obj).intValue();
                return Unit.f22938a;
                c0Var.f23007a = (T) obj;
                a0Var2 = this.f32027x;
                t3.t tVarR = this.f32026w.r();
                this.f32023t = a0Var2;
                this.f32024u = 2;
                obj = (T) tVarR.b(this);
                if (obj == objE) {
                    return objE;
                }
                a0Var2.f23004a = ((Number) obj).intValue();
            } catch (t3.d unused) {
                kotlin.jvm.internal.a0 a0Var3 = this.f32027x;
                k<T> kVar2 = this.f32026w;
                T t8 = this.f32025v.f23007a;
                this.f32023t = a0Var3;
                this.f32024u = 3;
                Object objB = kVar2.B(t8, true, this);
                if (objB != objE) {
                    a0Var = a0Var3;
                    obj = (T) objB;
                }
                return objE;
            }
            return Unit.f22938a;
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Nullable lt.b<? super Unit> bVar) {
            return ((p) create(bVar)).invokeSuspend(Unit.f22938a);
        }
    }

    @nt.f(c = "androidx.datastore.core.DataStoreImpl$readState$2", f = "DataStoreImpl.kt", l = {218, 226}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Liu/p0;", "Lt3/d0;", "<anonymous>", "(Liu/p0;)Lt3/d0;"}, k = 3, mv = {1, 8, 0})
    public static final class q extends nt.m implements Function2<p0, lt.b<? super d0<T>>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f32028t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ k<T> f32029u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ boolean f32030v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(k<T> kVar, boolean z10, lt.b<? super q> bVar) {
            super(2, bVar);
            this.f32029u = kVar;
            this.f32030v = z10;
        }

        @Override // nt.a
        @NotNull
        public final lt.b<Unit> create(@Nullable Object obj, @NotNull lt.b<?> bVar) {
            return new q(this.f32029u, this.f32030v, bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull p0 p0Var, @Nullable lt.b<? super d0<T>> bVar) {
            return ((q) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0051, code lost:
        
            if (r5 == r0) goto L22;
         */
        @Override // nt.a
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = mt.c.e()
                int r1 = r4.f32028t
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L20
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                gt.o.b(r5)
                goto L54
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1a:
                gt.o.b(r5)     // Catch: java.lang.Throwable -> L1e
                goto L47
            L1e:
                r5 = move-exception
                goto L57
            L20:
                gt.o.b(r5)
                t3.k<T> r5 = r4.f32029u
                t3.l r5 = t3.k.d(r5)
                t3.d0 r5 = r5.a()
                boolean r5 = r5 instanceof t3.r
                if (r5 == 0) goto L3c
                t3.k<T> r5 = r4.f32029u
                t3.l r5 = t3.k.d(r5)
                t3.d0 r5 = r5.a()
                return r5
            L3c:
                t3.k<T> r5 = r4.f32029u     // Catch: java.lang.Throwable -> L1e
                r4.f32028t = r3     // Catch: java.lang.Throwable -> L1e
                java.lang.Object r5 = t3.k.k(r5, r4)     // Catch: java.lang.Throwable -> L1e
                if (r5 != r0) goto L47
                goto L53
            L47:
                t3.k<T> r5 = r4.f32029u
                boolean r1 = r4.f32030v
                r4.f32028t = r2
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
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "Lt3/f0;", "b", "()Lt3/f0;"}, k = 3, mv = {1, 8, 0})
    public static final class r extends kotlin.jvm.internal.m implements Function0<f0<T>> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ k<T> f32031i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(k<T> kVar) {
            super(0);
            this.f32031i = kVar;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final f0<T> invoke() {
            return this.f32031i.storage.a();
        }
    }

    @nt.f(c = "androidx.datastore.core.DataStoreImpl$transformAndWrite$2", f = "DataStoreImpl.kt", l = {330, 331, 337}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001H\u008a@"}, d2 = {"<anonymous>", "T"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class s extends nt.m implements Function1<lt.b<? super T>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f32032t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f32033u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ k<T> f32034v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ CoroutineContext f32035w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ Function2<T, lt.b<? super T>, Object> f32036x;

        @nt.f(c = "androidx.datastore.core.DataStoreImpl$transformAndWrite$2$newData$1", f = "DataStoreImpl.kt", l = {331}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"T", "Liu/p0;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        public static final class a extends nt.m implements Function2<p0, lt.b<? super T>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f32037t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ Function2<T, lt.b<? super T>, Object> f32038u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ t3.f<T> f32039v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(Function2<? super T, ? super lt.b<? super T>, ? extends Object> function2, t3.f<T> fVar, lt.b<? super a> bVar) {
                super(2, bVar);
                this.f32038u = function2;
                this.f32039v = fVar;
            }

            @Override // nt.a
            @NotNull
            public final lt.b<Unit> create(@Nullable Object obj, @NotNull lt.b<?> bVar) {
                return new a(this.f32038u, this.f32039v, bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull p0 p0Var, @Nullable lt.b<? super T> bVar) {
                return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
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
            @Override // nt.a
            @org.jetbrains.annotations.Nullable
            public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r4) {
                /*
                    r3 = this;
                    java.lang.Object r0 = mt.c.e()
                    int r1 = r3.f32037t
                    r2 = 1
                    if (r1 == 0) goto L17
                    if (r1 != r2) goto Lf
                    gt.o.b(r4)
                    return r4
                Lf:
                    java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r4.<init>(r0)
                    throw r4
                L17:
                    gt.o.b(r4)
                    kotlin.jvm.functions.Function2<T, lt.b<? super T>, java.lang.Object> r4 = r3.f32038u
                    t3.f<T> r1 = r3.f32039v
                    java.lang.Object r1 = r1.c()
                    r3.f32037t = r2
                    java.lang.Object r4 = r4.invoke(r1, r3)
                    if (r4 != r0) goto L2b
                    return r0
                L2b:
                    return r4
                */
                throw new UnsupportedOperationException("Method not decompiled: t3.k.s.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public s(k<T> kVar, CoroutineContext coroutineContext, Function2<? super T, ? super lt.b<? super T>, ? extends Object> function2, lt.b<? super s> bVar) {
            super(1, bVar);
            this.f32034v = kVar;
            this.f32035w = coroutineContext;
            this.f32036x = function2;
        }

        @Override // nt.a
        @NotNull
        public final lt.b<Unit> create(@NotNull lt.b<?> bVar) {
            return new s(this.f32034v, this.f32035w, this.f32036x, bVar);
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type lt.b to t3.k$s for r8v1 'this'  lt.b
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // nt.a
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = mt.c.e()
                int r1 = r8.f32033u
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L2b
                if (r1 == r4) goto L27
                if (r1 == r3) goto L1f
                if (r1 != r2) goto L17
                java.lang.Object r0 = r8.f32032t
                gt.o.b(r9)
                return r0
            L17:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L1f:
                java.lang.Object r1 = r8.f32032t
                t3.f r1 = (t3.f) r1
                gt.o.b(r9)
                goto L51
            L27:
                gt.o.b(r9)
                goto L39
            L2b:
                gt.o.b(r9)
                t3.k<T> r9 = r8.f32034v
                r8.f32033u = r4
                java.lang.Object r9 = t3.k.n(r9, r4, r8)
                if (r9 != r0) goto L39
                goto L6a
            L39:
                r1 = r9
                t3.f r1 = (t3.f) r1
                kotlin.coroutines.CoroutineContext r9 = r8.f32035w
                t3.k$s$a r5 = new t3.k$s$a
                kotlin.jvm.functions.Function2<T, lt.b<? super T>, java.lang.Object> r6 = r8.f32036x
                r7 = 0
                r5.<init>(r6, r1, r7)
                r8.f32032t = r1
                r8.f32033u = r3
                java.lang.Object r9 = iu.i.g(r9, r5, r8)
                if (r9 != r0) goto L51
                goto L6a
            L51:
                r1.b()
                java.lang.Object r1 = r1.c()
                boolean r1 = kotlin.jvm.internal.Intrinsics.c(r1, r9)
                if (r1 != 0) goto L6b
                t3.k<T> r1 = r8.f32034v
                r8.f32032t = r9
                r8.f32033u = r2
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
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Nullable lt.b<? super T> bVar) {
            return ((s) create(bVar)).invokeSuspend(Unit.f22938a);
        }
    }

    @nt.f(c = "androidx.datastore.core.DataStoreImpl$updateData$2", f = "DataStoreImpl.kt", l = {169}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"T", "Liu/p0;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class t extends nt.m implements Function2<p0, lt.b<? super T>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f32040t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f32041u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ k<T> f32042v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ Function2<T, lt.b<? super T>, Object> f32043w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public t(k<T> kVar, Function2<? super T, ? super lt.b<? super T>, ? extends Object> function2, lt.b<? super t> bVar) {
            super(2, bVar);
            this.f32042v = kVar;
            this.f32043w = function2;
        }

        @Override // nt.a
        @NotNull
        public final lt.b<Unit> create(@Nullable Object obj, @NotNull lt.b<?> bVar) {
            t tVar = new t(this.f32042v, this.f32043w, bVar);
            tVar.f32041u = obj;
            return tVar;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull p0 p0Var, @Nullable lt.b<? super T> bVar) {
            return ((t) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        @Override // nt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objE = mt.c.e();
            int i10 = this.f32040t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
                return obj;
            }
            gt.o.b(obj);
            p0 p0Var = (p0) this.f32041u;
            iu.x xVarC = iu.z.c(null, 1, null);
            this.f32042v.writeActor.e(new t3.w.a(this.f32043w, xVarC, this.f32042v.inMemoryCache.a(), p0Var.getCoroutineContext()));
            this.f32040t = 1;
            Object objN = xVarC.n(this);
            return objN == objE ? objE : objN;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "it", "", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
    public static final class u extends kotlin.jvm.internal.m implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ k<T> f32044i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(k<T> kVar) {
            super(1);
            this.f32044i = kVar;
        }

        public final void a(@Nullable Throwable th2) {
            if (th2 != null) {
                this.f32044i.inMemoryCache.c(new t3.r(th2));
            }
            if (this.f32044i.storageConnectionDelegate.isInitialized()) {
                this.f32044i.s().close();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            a(th2);
            return Unit.f22938a;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"T", "Lt3/w$a;", "msg", "", "ex", "", "a", "(Lt3/w$a;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
    public static final class v extends kotlin.jvm.internal.m implements Function2<t3.w.a<T>, Throwable, Unit> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final v f32045i = new v();

        public v() {
            super(2);
        }

        public final void a(@NotNull t3.w.a<T> msg, @Nullable Throwable th2) {
            Intrinsics.checkNotNullParameter(msg, "msg");
            iu.x<T> xVarA = msg.a();
            if (th2 == null) {
                th2 = new CancellationException("DataStore scope was cancelled before updateData could complete");
            }
            xVarA.u(th2);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Object obj, Throwable th2) {
            a((t3.w.a) obj, th2);
            return Unit.f22938a;
        }
    }

    @nt.f(c = "androidx.datastore.core.DataStoreImpl$writeActor$3", f = "DataStoreImpl.kt", l = {MlKitException.CODE_SCANNER_GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lt3/w$a;", "msg", "", "<anonymous>", "(Lt3/w$a;)V"}, k = 3, mv = {1, 8, 0})
    public static final class w extends nt.m implements Function2<t3.w.a<T>, lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f32046t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f32047u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ k<T> f32048v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(k<T> kVar, lt.b<? super w> bVar) {
            super(2, bVar);
            this.f32048v = kVar;
        }

        @Override // nt.a
        @NotNull
        public final lt.b<Unit> create(@Nullable Object obj, @NotNull lt.b<?> bVar) {
            w wVar = new w(this.f32048v, bVar);
            wVar.f32047u = obj;
            return wVar;
        }

        @Override // nt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objE = mt.c.e();
            int i10 = this.f32046t;
            if (i10 == 0) {
                gt.o.b(obj);
                t3.w.a aVar = (t3.w.a) this.f32047u;
                k<T> kVar = this.f32048v;
                this.f32046t = 1;
                if (kVar.t(aVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
            }
            return Unit.f22938a;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull t3.w.a<T> aVar, @Nullable lt.b<? super Unit> bVar) {
            return ((w) create(aVar, bVar)).invokeSuspend(Unit.f22938a);
        }
    }

    @nt.f(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", l = {348}, m = "writeData$datastore_core_release")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class x extends nt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f32049t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f32050u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ k<T> f32051v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f32052w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(k<T> kVar, lt.b<? super x> bVar) {
            super(bVar);
            this.f32051v = kVar;
        }

        @Override // nt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f32050u = obj;
            this.f32052w |= Integer.MIN_VALUE;
            return this.f32051v.B(null, false, this);
        }
    }

    @nt.f(c = "androidx.datastore.core.DataStoreImpl$writeData$2", f = "DataStoreImpl.kt", l = {352, 353}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lt3/k0;", "", "<anonymous>", "(Lt3/k0;)V"}, k = 3, mv = {1, 8, 0})
    public static final class y extends nt.m implements Function2<k0<T>, lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f32053t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f32054u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f32055v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.a0 f32056w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ k<T> f32057x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final /* synthetic */ T f32058y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ boolean f32059z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(kotlin.jvm.internal.a0 a0Var, k<T> kVar, T t8, boolean z10, lt.b<? super y> bVar) {
            super(2, bVar);
            this.f32056w = a0Var;
            this.f32057x = kVar;
            this.f32058y = t8;
            this.f32059z = z10;
        }

        @Override // nt.a
        @NotNull
        public final lt.b<Unit> create(@Nullable Object obj, @NotNull lt.b<?> bVar) {
            y yVar = new y(this.f32056w, this.f32057x, this.f32058y, this.f32059z, bVar);
            yVar.f32055v = obj;
            return yVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x005a, code lost:
        
            if (r3.d(r7, r6) == r0) goto L16;
         */
        @Override // nt.a
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = mt.c.e()
                int r1 = r6.f32054u
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L26
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                gt.o.b(r7)
                goto L5d
            L12:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1a:
                java.lang.Object r1 = r6.f32053t
                kotlin.jvm.internal.a0 r1 = (kotlin.jvm.internal.a0) r1
                java.lang.Object r3 = r6.f32055v
                t3.k0 r3 = (t3.k0) r3
                gt.o.b(r7)
                goto L45
            L26:
                gt.o.b(r7)
                java.lang.Object r7 = r6.f32055v
                t3.k0 r7 = (t3.k0) r7
                kotlin.jvm.internal.a0 r1 = r6.f32056w
                t3.k<T> r4 = r6.f32057x
                t3.t r4 = t3.k.c(r4)
                r6.f32055v = r7
                r6.f32053t = r1
                r6.f32054u = r3
                java.lang.Object r3 = r4.a(r6)
                if (r3 != r0) goto L42
                goto L5c
            L42:
                r5 = r3
                r3 = r7
                r7 = r5
            L45:
                java.lang.Number r7 = (java.lang.Number) r7
                int r7 = r7.intValue()
                r1.f23004a = r7
                T r7 = r6.f32058y
                r1 = 0
                r6.f32055v = r1
                r6.f32053t = r1
                r6.f32054u = r2
                java.lang.Object r7 = r3.d(r7, r6)
                if (r7 != r0) goto L5d
            L5c:
                return r0
            L5d:
                boolean r7 = r6.f32059z
                if (r7 == 0) goto L7d
                t3.k<T> r7 = r6.f32057x
                t3.l r7 = t3.k.d(r7)
                t3.f r0 = new t3.f
                T r1 = r6.f32058y
                if (r1 == 0) goto L72
                int r2 = r1.hashCode()
                goto L73
            L72:
                r2 = 0
            L73:
                kotlin.jvm.internal.a0 r3 = r6.f32056w
                int r3 = r3.f23004a
                r0.<init>(r1, r2, r3)
                r7.c(r0)
            L7d:
                kotlin.Unit r7 = kotlin.Unit.f22938a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: t3.k.y.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull k0<T> k0Var, @Nullable lt.b<? super Unit> bVar) {
            return ((y) create(k0Var, bVar)).invokeSuspend(Unit.f22938a);
        }
    }

    public k(@NotNull e0<T> storage, @NotNull List<? extends Function2<? super t3.s<T>, ? super lt.b<? super Unit>, ? extends Object>> initTasksList, @NotNull t3.e<T> corruptionHandler, @NotNull p0 scope) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(initTasksList, "initTasksList");
        Intrinsics.checkNotNullParameter(corruptionHandler, "corruptionHandler");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.storage = storage;
        this.corruptionHandler = corruptionHandler;
        this.scope = scope;
        this.data = lu.j.w(new d(this, null));
        this.collectorMutex = su.g.b(false, 1, null);
        this.inMemoryCache = new t3.l<>();
        this.readAndInit = new b(this, initTasksList);
        this.storageConnectionDelegate = gt.i.b(new r(this));
        this.coordinator = gt.i.b(new c(this));
        this.writeActor = new b0<>(scope, new u(this), v.f32045i, new w(this, null));
    }

    public final Object A(Function2<? super T, ? super lt.b<? super T>, ? extends Object> function2, CoroutineContext coroutineContext, lt.b<? super T> bVar) {
        return r().e(new s(this, coroutineContext, function2, null), bVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object B(T t8, boolean z10, @NotNull lt.b<? super Integer> bVar) {
        x xVar;
        kotlin.jvm.internal.a0 a0Var;
        if (bVar instanceof x) {
            xVar = (x) bVar;
            int i10 = xVar.f32052w;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                xVar.f32052w = i10 - Integer.MIN_VALUE;
            } else {
                xVar = new x(this, bVar);
            }
        } else {
            xVar = new x(this, bVar);
        }
        Object obj = xVar.f32050u;
        Object objE = mt.c.e();
        int i11 = xVar.f32052w;
        if (i11 == 0) {
            gt.o.b(obj);
            kotlin.jvm.internal.a0 a0Var2 = new kotlin.jvm.internal.a0();
            f0<T> f0VarS = s();
            y yVar = new y(a0Var2, this, t8, z10, null);
            xVar.f32049t = a0Var2;
            xVar.f32052w = 1;
            if (f0VarS.a(yVar, xVar) == objE) {
                return objE;
            }
            a0Var = a0Var2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0Var = (kotlin.jvm.internal.a0) xVar.f32049t;
            gt.o.b(obj);
        }
        return nt.b.d(a0Var.f23004a);
    }

    @Override // t3.i
    @Nullable
    public Object a(@NotNull Function2<? super T, ? super lt.b<? super T>, ? extends Object> function2, @NotNull lt.b<? super T> bVar) {
        j0 j0Var = (j0) bVar.getContext().get(j0.Companion.C0565a.f31916a);
        if (j0Var != null) {
            j0Var.a(this);
        }
        return iu.i.g(new j0(j0Var, this), new t(this, function2, null), bVar);
    }

    @Override // t3.i
    @NotNull
    public lu.h<T> getData() {
        return this.data;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object p(lt.b<? super Unit> bVar) {
        e eVar;
        k<T> kVar;
        su.a aVar;
        if (bVar instanceof e) {
            eVar = (e) bVar;
            int i10 = eVar.f31975x;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                eVar.f31975x = i10 - Integer.MIN_VALUE;
            } else {
                eVar = new e(this, bVar);
            }
        } else {
            eVar = new e(this, bVar);
        }
        Object obj = eVar.f31973v;
        Object objE = mt.c.e();
        int i11 = eVar.f31975x;
        if (i11 == 0) {
            gt.o.b(obj);
            su.a aVar2 = this.collectorMutex;
            eVar.f31971t = this;
            eVar.f31972u = aVar2;
            eVar.f31975x = 1;
            if (aVar2.b(null, eVar) == objE) {
                return objE;
            }
            kVar = this;
            aVar = aVar2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = (su.a) eVar.f31972u;
            kVar = (k) eVar.f31971t;
            gt.o.b(obj);
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
            Unit unit = Unit.f22938a;
            return Unit.f22938a;
        } finally {
            aVar.f(null);
        }
    }

    public final <R> Object q(boolean z10, Function1<? super lt.b<? super R>, ? extends Object> function1, lt.b<? super R> bVar) {
        return z10 ? function1.invoke(bVar) : r().e(new f(function1, null), bVar);
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
    /* JADX WARN: Type inference failed for: r9v3, types: [iu.x] */
    /* JADX WARN: Type inference failed for: r9v33 */
    /* JADX WARN: Type inference failed for: r9v34 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t(t3.w.a<T> r9, lt.b<? super kotlin.Unit> r10) {
        /*
            Method dump skipped, instruction units count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t3.k.t(t3.w$a, lt.b):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object u(lt.b<? super Unit> bVar) {
        h hVar;
        k<T> kVar;
        su.a aVar;
        if (bVar instanceof h) {
            hVar = (h) bVar;
            int i10 = hVar.f31988x;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                hVar.f31988x = i10 - Integer.MIN_VALUE;
            } else {
                hVar = new h(this, bVar);
            }
        } else {
            hVar = new h(this, bVar);
        }
        Object obj = hVar.f31986v;
        Object objE = mt.c.e();
        int i11 = hVar.f31988x;
        if (i11 == 0) {
            gt.o.b(obj);
            su.a aVar2 = this.collectorMutex;
            hVar.f31984t = this;
            hVar.f31985u = aVar2;
            hVar.f31988x = 1;
            if (aVar2.b(null, hVar) == objE) {
                return objE;
            }
            kVar = this;
            aVar = aVar2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = (su.a) hVar.f31985u;
            kVar = (k) hVar.f31984t;
            gt.o.b(obj);
        }
        try {
            int i12 = kVar.collectorCounter + 1;
            kVar.collectorCounter = i12;
            if (i12 == 1) {
                kVar.collectorJob = iu.k.d(kVar.scope, null, null, new i(kVar, null), 3, null);
            }
            Unit unit = Unit.f22938a;
            return Unit.f22938a;
        } finally {
            aVar.f(null);
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
    public final java.lang.Object v(lt.b<? super kotlin.Unit> r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof t3.k.j
            if (r0 == 0) goto L13
            r0 = r6
            t3.k$j r0 = (t3.k.j) r0
            int r1 = r0.f31996x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f31996x = r1
            goto L18
        L13:
            t3.k$j r0 = new t3.k$j
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f31994v
            java.lang.Object r1 = mt.c.e()
            int r2 = r0.f31996x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L44
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            int r1 = r0.f31993u
            java.lang.Object r0 = r0.f31992t
            t3.k r0 = (t3.k) r0
            gt.o.b(r6)     // Catch: java.lang.Throwable -> L32
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
            java.lang.Object r2 = r0.f31992t
            t3.k r2 = (t3.k) r2
            gt.o.b(r6)
            goto L57
        L44:
            gt.o.b(r6)
            t3.t r6 = r5.r()
            r0.f31992t = r5
            r0.f31996x = r4
            java.lang.Object r6 = r6.b(r0)
            if (r6 != r1) goto L56
            goto L6b
        L56:
            r2 = r5
        L57:
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            t3.k<T>$b r4 = r2.readAndInit     // Catch: java.lang.Throwable -> L6f
            r0.f31992t = r2     // Catch: java.lang.Throwable -> L6f
            r0.f31993u = r6     // Catch: java.lang.Throwable -> L6f
            r0.f31996x = r3     // Catch: java.lang.Throwable -> L6f
            java.lang.Object r6 = r4.c(r0)     // Catch: java.lang.Throwable -> L6f
            if (r6 != r1) goto L6c
        L6b:
            return r1
        L6c:
            kotlin.Unit r6 = kotlin.Unit.f22938a
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
        throw new UnsupportedOperationException("Method not decompiled: t3.k.v(lt.b):java.lang.Object");
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
    public final java.lang.Object w(boolean r10, lt.b<? super t3.d0<T>> r11) {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t3.k.w(boolean, lt.b):java.lang.Object");
    }

    public final Object x(lt.b<? super T> bVar) {
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
    public final Object y(boolean z10, lt.b<? super t3.f<T>> bVar) throws t3.d, IllegalAccessException, InvocationTargetException {
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
        Object objB;
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
        Object obj2 = (T) nVar.f32017z;
        Object objE = mt.c.e();
        ?? r15 = nVar.B;
        try {
            switch (r15) {
                case 0:
                    gt.o.b(obj2);
                    try {
                        if (z10) {
                            nVar.f32011t = this;
                            nVar.f32015x = z10;
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
                                        nVar.f32011t = r8;
                                        nVar.f32012u = e;
                                        nVar.f32013v = c0Var;
                                        nVar.f32014w = c0Var;
                                        nVar.f32015x = z10;
                                        nVar.B = 5;
                                        objA = eVar.a(e, nVar);
                                        if (objA != objE) {
                                            dVar = e;
                                            obj2 = (T) objA;
                                            c0Var2 = c0Var;
                                            r10 = r8;
                                            c0Var2.f23007a = (T) obj2;
                                            a0Var = new kotlin.jvm.internal.a0();
                                            try {
                                                pVar = new p(c0Var, r10, a0Var, null);
                                                nVar.f32011t = dVar;
                                                nVar.f32012u = c0Var;
                                                nVar.f32013v = a0Var;
                                                nVar.f32014w = null;
                                                nVar.B = 6;
                                                if (r10.q(z10, pVar, nVar) != objE) {
                                                    a0Var2 = a0Var;
                                                    c0Var3 = c0Var;
                                                    T t8 = c0Var3.f23007a;
                                                    return new t3.f(t8, t8 != null ? t8.hashCode() : 0, a0Var2.f23004a);
                                                }
                                            } catch (Throwable th2) {
                                                th = th2;
                                                dVar2 = dVar;
                                                gt.a.a(dVar2, th);
                                                throw dVar2;
                                            }
                                        }
                                    }
                                } else {
                                    iHashCode = 0;
                                }
                                t3.t tVarR = r12.r();
                                nVar.f32011t = r12;
                                nVar.f32012u = obj2;
                                nVar.f32015x = z10;
                                nVar.f32016y = iHashCode;
                                nVar.B = 2;
                                objB = tVarR.b(nVar);
                                if (objB != objE) {
                                    int i12 = iHashCode;
                                    z11 = z10;
                                    i10 = i12;
                                    obj = obj2;
                                    obj2 = (T) objB;
                                    r14 = r12;
                                    return new t3.f(obj, i10, ((Number) obj2).intValue());
                                }
                            }
                        } else {
                            t3.t tVarR2 = r();
                            nVar.f32011t = this;
                            nVar.f32015x = z10;
                            nVar.B = 3;
                            obj2 = (T) tVarR2.b(nVar);
                            if (obj2 != objE) {
                                r11 = this;
                                int iIntValue = ((Number) obj2).intValue();
                                t3.t tVarR3 = r11.r();
                                o oVar = new o(r11, iIntValue, null);
                                nVar.f32011t = r11;
                                nVar.f32015x = z10;
                                nVar.B = 4;
                                obj2 = (T) tVarR3.c(oVar, nVar);
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
                        nVar.f32011t = r8;
                        nVar.f32012u = e;
                        nVar.f32013v = c0Var;
                        nVar.f32014w = c0Var;
                        nVar.f32015x = z10;
                        nVar.B = 5;
                        objA = eVar2.a(e, nVar);
                        if (objA != objE) {
                            dVar = e;
                            obj2 = (T) objA;
                            c0Var2 = c0Var;
                            r10 = r8;
                            c0Var2.f23007a = (T) obj2;
                            a0Var = new kotlin.jvm.internal.a0();
                            pVar = new p(c0Var, r10, a0Var, null);
                            nVar.f32011t = dVar;
                            nVar.f32012u = c0Var;
                            nVar.f32013v = a0Var;
                            nVar.f32014w = null;
                            nVar.B = 6;
                            if (r10.q(z10, pVar, nVar) != objE) {
                                a0Var2 = a0Var;
                                c0Var3 = c0Var;
                                T t10 = c0Var3.f23007a;
                                return new t3.f(t10, t10 != null ? t10.hashCode() : 0, a0Var2.f23004a);
                            }
                        }
                    }
                    return objE;
                case 1:
                    z10 = nVar.f32015x;
                    k kVar = (k) nVar.f32011t;
                    gt.o.b(obj2);
                    r12 = kVar;
                    if (obj2 != null) {
                        iHashCode = obj2.hashCode();
                    } else {
                        iHashCode = 0;
                    }
                    t3.t tVarR4 = r12.r();
                    nVar.f32011t = r12;
                    nVar.f32012u = obj2;
                    nVar.f32015x = z10;
                    nVar.f32016y = iHashCode;
                    nVar.B = 2;
                    objB = tVarR4.b(nVar);
                    if (objB != objE) {
                        int i13 = iHashCode;
                        z11 = z10;
                        i10 = i13;
                        obj = obj2;
                        obj2 = (T) objB;
                        r14 = r12;
                        return new t3.f(obj, i10, ((Number) obj2).intValue());
                    }
                    return objE;
                case 2:
                    i10 = nVar.f32016y;
                    z11 = nVar.f32015x;
                    obj = nVar.f32012u;
                    r14 = (k) nVar.f32011t;
                    try {
                        gt.o.b(obj2);
                        r14 = r14;
                        return new t3.f(obj, i10, ((Number) obj2).intValue());
                    } catch (t3.d e12) {
                        e = e12;
                        z10 = z11;
                        r13 = r14;
                        r8 = r13;
                        c0Var = new kotlin.jvm.internal.c0();
                        t3.e<T> eVar3 = r8.corruptionHandler;
                        nVar.f32011t = r8;
                        nVar.f32012u = e;
                        nVar.f32013v = c0Var;
                        nVar.f32014w = c0Var;
                        nVar.f32015x = z10;
                        nVar.B = 5;
                        objA = eVar3.a(e, nVar);
                        if (objA != objE) {
                            dVar = e;
                            obj2 = (T) objA;
                            c0Var2 = c0Var;
                            r10 = r8;
                            c0Var2.f23007a = (T) obj2;
                            a0Var = new kotlin.jvm.internal.a0();
                            pVar = new p(c0Var, r10, a0Var, null);
                            nVar.f32011t = dVar;
                            nVar.f32012u = c0Var;
                            nVar.f32013v = a0Var;
                            nVar.f32014w = null;
                            nVar.B = 6;
                            if (r10.q(z10, pVar, nVar) != objE) {
                                a0Var2 = a0Var;
                                c0Var3 = c0Var;
                                T t11 = c0Var3.f23007a;
                                return new t3.f(t11, t11 != null ? t11.hashCode() : 0, a0Var2.f23004a);
                            }
                        }
                        return objE;
                    }
                case 3:
                    z10 = nVar.f32015x;
                    k kVar2 = (k) nVar.f32011t;
                    gt.o.b(obj2);
                    r11 = kVar2;
                    int iIntValue2 = ((Number) obj2).intValue();
                    t3.t tVarR5 = r11.r();
                    o oVar2 = new o(r11, iIntValue2, null);
                    nVar.f32011t = r11;
                    nVar.f32015x = z10;
                    nVar.B = 4;
                    obj2 = (T) tVarR5.c(oVar2, nVar);
                    if (obj2 == objE) {
                        return objE;
                    }
                    return (t3.f) obj2;
                case 4:
                    boolean z12 = nVar.f32015x;
                    gt.o.b(obj2);
                    return (t3.f) obj2;
                case 5:
                    z10 = nVar.f32015x;
                    kotlin.jvm.internal.c0 c0Var4 = (kotlin.jvm.internal.c0) nVar.f32014w;
                    kotlin.jvm.internal.c0 c0Var5 = (kotlin.jvm.internal.c0) nVar.f32013v;
                    dVar = (t3.d) nVar.f32012u;
                    k kVar3 = (k) nVar.f32011t;
                    gt.o.b(obj2);
                    c0Var2 = c0Var4;
                    c0Var = c0Var5;
                    r10 = kVar3;
                    c0Var2.f23007a = (T) obj2;
                    a0Var = new kotlin.jvm.internal.a0();
                    pVar = new p(c0Var, r10, a0Var, null);
                    nVar.f32011t = dVar;
                    nVar.f32012u = c0Var;
                    nVar.f32013v = a0Var;
                    nVar.f32014w = null;
                    nVar.B = 6;
                    if (r10.q(z10, pVar, nVar) != objE) {
                        a0Var2 = a0Var;
                        c0Var3 = c0Var;
                        T t12 = c0Var3.f23007a;
                        return new t3.f(t12, t12 != null ? t12.hashCode() : 0, a0Var2.f23004a);
                    }
                    return objE;
                case 6:
                    a0Var2 = (kotlin.jvm.internal.a0) nVar.f32013v;
                    c0Var3 = (kotlin.jvm.internal.c0) nVar.f32012u;
                    dVar2 = (t3.d) nVar.f32011t;
                    try {
                        gt.o.b(obj2);
                        T t13 = c0Var3.f23007a;
                        return new t3.f(t13, t13 != null ? t13.hashCode() : 0, a0Var2.f23004a);
                    } catch (Throwable th3) {
                        th = th3;
                        gt.a.a(dVar2, th);
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

    public final Object z(boolean z10, lt.b<? super d0<T>> bVar) {
        return iu.i.g(this.scope.getCoroutineContext(), new q(this, z10, null), bVar);
    }
}
