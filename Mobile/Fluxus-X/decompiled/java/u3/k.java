package u3;

import av.d2;
import av.p0;
import com.github.luben.zstd.BuildConfig;
import com.google.mlkit.common.MlKitException;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Pair;
import p001kotlin.Unit;
import p001kotlin.collections.CollectionsKt;
import p001kotlin.coroutines.CoroutineContext;
import p001kotlin.jvm.functions.Function0;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 f*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0002\u00136Ba\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u00120\b\u0002\u0010\u000b\u001a*\u0012&\u0012$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00060\u0005\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J4\u0010\u0013\u001a\u00028\u00002\"\u0010\u0012\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0006H\u0096@¢\u0006\u0004\b\u0013\u0010\u0014J \u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00020\u0016H\u0080@¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\tH\u0082@¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\tH\u0082@¢\u0006\u0004\b\u001d\u0010\u001cJ\u001e\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001f2\u0006\u0010\u001e\u001a\u00020\u0016H\u0082@¢\u0006\u0004\b \u0010!J\u001e\u0010$\u001a\u00020\t2\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\"H\u0082@¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\tH\u0082@¢\u0006\u0004\b&\u0010\u001cJ\u001e\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000\u001f2\u0006\u0010\u001e\u001a\u00020\u0016H\u0082@¢\u0006\u0004\b'\u0010!J\u0010\u0010(\u001a\u00028\u0000H\u0082@¢\u0006\u0004\b(\u0010\u001cJ<\u0010+\u001a\u00028\u00002\"\u0010\u0012\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00062\u0006\u0010*\u001a\u00020)H\u0082@¢\u0006\u0004\b+\u0010,J\u001e\u0010/\u001a\b\u0012\u0004\u0012\u00028\u00000.2\u0006\u0010-\u001a\u00020\u0016H\u0082@¢\u0006\u0004\b/\u0010!JI\u00103\u001a\u00028\u0001\"\u0004\b\u0001\u001002\u0006\u0010-\u001a\u00020\u00162\u001c\u00102\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\n01H\u0082@\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b3\u00104R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u00105R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R \u0010?\u001a\b\u0012\u0004\u0012\u00028\u00000:8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u0014\u0010C\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0016\u0010F\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0018\u0010J\u001a\u0004\u0018\u00010G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u001a\u0010N\u001a\b\u0012\u0004\u0012\u00028\u00000K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u001e\u0010R\u001a\f0OR\b\u0012\u0004\u0012\u00028\u00000\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR \u0010W\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000T0S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u001b\u0010\\\u001a\u00020X8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bY\u0010V\u001a\u0004\bZ\u0010[R \u0010`\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\"0]8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R!\u0010e\u001a\b\u0012\u0004\u0012\u00028\u00000T8@X\u0080\u0084\u0002¢\u0006\f\u001a\u0004\ba\u0010b*\u0004\bc\u0010d¨\u0006g"}, d2 = {"Lu3/k;", "T", "Lu3/i;", "Lu3/e0;", "storage", BuildConfig.FLAVOR, "Lkotlin/Function2;", "Lu3/s;", "Leu/b;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "initTasksList", "Lu3/e;", "corruptionHandler", "Lav/p0;", "scope", "<init>", "(Lu3/e0;Ljava/util/List;Lu3/e;Lav/p0;)V", "transform", "a", "(Lkotlin/jvm/functions/Function2;Leu/b;)Ljava/lang/Object;", "newData", BuildConfig.FLAVOR, "updateCache", BuildConfig.FLAVOR, "B", "(Ljava/lang/Object;ZLeu/b;)Ljava/lang/Object;", "u", "(Leu/b;)Ljava/lang/Object;", "p", "requireLock", "Lu3/d0;", "z", "(ZLeu/b;)Ljava/lang/Object;", "Lu3/w$a;", "update", "t", "(Lu3/w$a;Leu/b;)Ljava/lang/Object;", "v", "w", "x", "Lkotlin/coroutines/CoroutineContext;", "callerContext", "A", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/CoroutineContext;Leu/b;)Ljava/lang/Object;", "hasWriteFileLock", "Lu3/f;", "y", "R", "Lkotlin/Function1;", "block", "q", "(ZLkotlin/jvm/functions/Function1;Leu/b;)Ljava/lang/Object;", "Lu3/e0;", "b", "Lu3/e;", "c", "Lav/p0;", "Ldv/h;", "d", "Ldv/h;", "getData", "()Ldv/h;", "data", "Lkv/a;", "e", "Lkv/a;", "collectorMutex", "f", "I", "collectorCounter", "Lav/d2;", "g", "Lav/d2;", "collectorJob", "Lu3/l;", "h", "Lu3/l;", "inMemoryCache", "Lu3/k$b;", "i", "Lu3/k$b;", "readAndInit", "Lzt/h;", "Lu3/f0;", "j", "Lzt/h;", "storageConnectionDelegate", "Lu3/t;", "k", "r", "()Lu3/t;", "coordinator", "Lu3/b0;", "l", "Lu3/b0;", "writeActor", "s", "()Lu3/f0;", "getStorageConnection$datastore_core_release$delegate", "(Lu3/k;)Ljava/lang/Object;", "storageConnection", "m", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class k<T> implements u3.i<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final e0<T> storage;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final u3.e<T> corruptionHandler;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final p0 scope;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final dv.h<T> data;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final kv.a collectorMutex;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public int collectorCounter;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public d2 collectorJob;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final u3.l<T> inMemoryCache;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final k<T>.b readAndInit;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final zt.h<f0<T>> storageConnectionDelegate;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final zt.h coordinator;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final b0<u3.w.a<T>> writeActor;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0082\u0004\u0018\u00002\u00020\u0001B7\u0012.\u0010\b\u001a*\u0012&\u0012$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00030\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0006H\u0094@¢\u0006\u0004\b\u000b\u0010\fR@\u0010\u000f\u001a,\u0012&\u0012$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lu3/k$b;", "Lu3/z;", BuildConfig.FLAVOR, "Lkotlin/Function2;", "Lu3/s;", "Leu/b;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "initTasksList", "<init>", "(Lu3/k;Ljava/util/List;)V", "b", "(Leu/b;)Ljava/lang/Object;", "c", "Ljava/util/List;", "initTasks", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class b extends z {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public List<? extends Function2<? super u3.s<T>, ? super eu.b<? super Unit>, ? extends Object>> initTasks;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ k<T> f32977d;

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        @gu.f(c = "androidx.datastore.core.DataStoreImpl$InitDataStore", f = "DataStoreImpl.kt", l = {430, 434}, m = "doRun")
        public static final class a extends gu.d {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public Object f32978t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public /* synthetic */ Object f32979u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ k<T>.b f32980v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public int f32981w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(k<T>.b bVar, eu.b<? super a> bVar2) {
                super(bVar2);
                this.f32980v = bVar;
            }

            @Override // gu.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f32979u = obj;
                this.f32981w |= Integer.MIN_VALUE;
                return this.f32980v.b(this);
            }
        }

        /* JADX INFO: renamed from: u3.k$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "Lu3/f;", "<anonymous>", "()Lu3/f;"}, k = 3, mv = {1, 8, 0})
        @gu.f(c = "androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$initData$1", f = "DataStoreImpl.kt", l = {437, 458, 546, 468}, m = "invokeSuspend")
        public static final class C0663b extends gu.m implements Function1<eu.b<? super u3.f<T>>, Object> {
            public final /* synthetic */ k<T> A;
            public final /* synthetic */ k<T>.b B;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public Object f32982t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public Object f32983u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public Object f32984v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public Object f32985w;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            public Object f32986x;

            /* JADX INFO: renamed from: y, reason: collision with root package name */
            public int f32987y;

            /* JADX INFO: renamed from: z, reason: collision with root package name */
            public int f32988z;

            /* JADX INFO: renamed from: u3.k$b$b$a */
            @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J4\u0010\u0006\u001a\u00028\u00002\"\u0010\u0005\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002H\u0096@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"u3/k$b$b$a", "Lu3/s;", "Lkotlin/Function2;", "Leu/b;", BuildConfig.FLAVOR, "transform", "a", "(Lkotlin/jvm/functions/Function2;Leu/b;)Ljava/lang/Object;", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class a implements u3.s<T> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ kv.a f32989a;
                public final /* synthetic */ p001kotlin.jvm.internal.y b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ p001kotlin.jvm.internal.c0<T> f32990c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ k<T> f32991d;

                /* JADX INFO: renamed from: u3.k$b$b$a$a, reason: collision with other inner class name */
                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                @gu.f(c = "androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$initData$1$api$1", f = "DataStoreImpl.kt", l = {544, 447, 449}, m = "updateData")
                public static final class C0664a extends gu.d {
                    public int A;

                    /* JADX INFO: renamed from: t, reason: collision with root package name */
                    public Object f32992t;

                    /* JADX INFO: renamed from: u, reason: collision with root package name */
                    public Object f32993u;

                    /* JADX INFO: renamed from: v, reason: collision with root package name */
                    public Object f32994v;

                    /* JADX INFO: renamed from: w, reason: collision with root package name */
                    public Object f32995w;

                    /* JADX INFO: renamed from: x, reason: collision with root package name */
                    public Object f32996x;

                    /* JADX INFO: renamed from: y, reason: collision with root package name */
                    public /* synthetic */ Object f32997y;

                    public C0664a(eu.b bVar) {
                        super(bVar);
                    }

                    @Override // gu.a
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.f32997y = obj;
                        this.A |= Integer.MIN_VALUE;
                        return a.this.a(null, this);
                    }
                }

                public a(kv.a aVar, p001kotlin.jvm.internal.y yVar, p001kotlin.jvm.internal.c0<T> c0Var, k<T> kVar) {
                    this.f32989a = aVar;
                    this.b = yVar;
                    this.f32990c = c0Var;
                    this.f32991d = kVar;
                }

                /* JADX WARN: Code duplicated, block: B:38:0x00ba A[Catch: all -> 0x0056, TRY_LEAVE, TryCatch #0 {all -> 0x0056, blocks: (B:21:0x0052, B:36:0x00b2, B:38:0x00ba), top: B:53:0x0052 }] */
                /* JADX WARN: Code duplicated, block: B:41:0x00ca  */
                /* JADX WARN: Code duplicated, block: B:43:0x00d1  */
                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // u3.s
                @Nullable
                public Object a(@NotNull Function2<? super T, ? super eu.b<? super T>, ? extends Object> function2, @NotNull eu.b<? super T> bVar) throws Throwable {
                    C0664a c0664a;
                    kv.a aVar;
                    k kVar;
                    p001kotlin.jvm.internal.y yVar;
                    p001kotlin.jvm.internal.c0<T> c0Var;
                    kv.a aVar2;
                    kv.a aVar3;
                    k kVar2;
                    T t8;
                    p001kotlin.jvm.internal.c0<T> c0Var2;
                    if (bVar instanceof C0664a) {
                        c0664a = (C0664a) bVar;
                        int i10 = c0664a.A;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            c0664a.A = i10 - Integer.MIN_VALUE;
                        } else {
                            c0664a = new C0664a(bVar);
                        }
                    } else {
                        c0664a = new C0664a(bVar);
                    }
                    Object obj = c0664a.f32997y;
                    Object objE = fu.c.e();
                    int i11 = c0664a.A;
                    try {
                        if (i11 == 0) {
                            zt.o.b(obj);
                            aVar = this.f32989a;
                            p001kotlin.jvm.internal.y yVar2 = this.b;
                            p001kotlin.jvm.internal.c0<T> c0Var3 = this.f32990c;
                            kVar = this.f32991d;
                            c0664a.f32992t = function2;
                            c0664a.f32993u = aVar;
                            c0664a.f32994v = yVar2;
                            c0664a.f32995w = c0Var3;
                            c0664a.f32996x = kVar;
                            c0664a.A = 1;
                            if (aVar.d(null, c0664a) != objE) {
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
                                t8 = (T) c0664a.f32994v;
                                c0Var2 = (p001kotlin.jvm.internal.c0) c0664a.f32993u;
                                aVar2 = (kv.a) c0664a.f32992t;
                                try {
                                    zt.o.b(obj);
                                    c0Var2.f21575a = t8;
                                    c0Var = c0Var2;
                                    T t10 = c0Var.f21575a;
                                    aVar2.f(null);
                                    return t10;
                                } catch (Throwable th2) {
                                    th = th2;
                                    aVar2.f(null);
                                    throw th;
                                }
                            }
                            k kVar3 = (k) c0664a.f32994v;
                            c0Var = (p001kotlin.jvm.internal.c0) c0664a.f32993u;
                            aVar3 = (kv.a) c0664a.f32992t;
                            try {
                                zt.o.b(obj);
                                kVar2 = kVar3;
                                if (!Intrinsics.c(obj, c0Var.f21575a)) {
                                    c0664a.f32992t = aVar3;
                                    c0664a.f32993u = c0Var;
                                    c0664a.f32994v = obj;
                                    c0664a.A = 3;
                                    if (kVar2.B(obj, false, c0664a) != objE) {
                                        t8 = (T) obj;
                                        c0Var2 = c0Var;
                                        aVar2 = aVar3;
                                        c0Var2.f21575a = t8;
                                        c0Var = c0Var2;
                                    }
                                    return objE;
                                }
                                aVar2 = aVar3;
                                T t11 = c0Var.f21575a;
                                aVar2.f(null);
                                return t11;
                            } catch (Throwable th3) {
                                th = th3;
                                aVar2 = aVar3;
                                aVar2.f(null);
                                throw th;
                            }
                        }
                        k kVar4 = (k) c0664a.f32996x;
                        c0Var = (p001kotlin.jvm.internal.c0) c0664a.f32995w;
                        yVar = (p001kotlin.jvm.internal.y) c0664a.f32994v;
                        kv.a aVar4 = (kv.a) c0664a.f32993u;
                        Function2<? super T, ? super eu.b<? super T>, ? extends Object> function3 = (Function2) c0664a.f32992t;
                        zt.o.b(obj);
                        kVar = kVar4;
                        function2 = function3;
                        aVar = aVar4;
                        if (yVar.f21591a) {
                            throw new IllegalStateException("InitializerApi.updateData should not be called after initialization is complete.");
                        }
                        T t12 = c0Var.f21575a;
                        c0664a.f32992t = aVar;
                        c0664a.f32993u = c0Var;
                        c0664a.f32994v = kVar;
                        c0664a.f32995w = null;
                        c0664a.f32996x = null;
                        c0664a.A = 2;
                        Object objInvoke = function2.invoke(t12, c0664a);
                        if (objInvoke != objE) {
                            aVar3 = aVar;
                            obj = objInvoke;
                            kVar2 = kVar;
                            if (!Intrinsics.c(obj, c0Var.f21575a)) {
                                c0664a.f32992t = aVar3;
                                c0664a.f32993u = c0Var;
                                c0664a.f32994v = obj;
                                c0664a.A = 3;
                                if (kVar2.B(obj, false, c0664a) != objE) {
                                    t8 = (T) obj;
                                    c0Var2 = c0Var;
                                    aVar2 = aVar3;
                                    c0Var2.f21575a = t8;
                                    c0Var = c0Var2;
                                }
                            } else {
                                aVar2 = aVar3;
                            }
                            T t13 = c0Var.f21575a;
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
            public C0663b(k<T> kVar, k<T>.b bVar, eu.b<? super C0663b> bVar2) {
                super(1, bVar2);
                this.A = kVar;
                this.B = bVar;
            }

            @Override // gu.a
            @NotNull
            public final eu.b<Unit> create(@NotNull eu.b<?> bVar) {
                return new C0663b(this.A, this.B, bVar);
            }

            /* JADX WARN: Code duplicated, block: B:23:0x00b1  */
            /* JADX WARN: Code duplicated, block: B:31:0x00e8  */
            /* JADX WARN: Code duplicated, block: B:35:0x00f4  */
            /* JADX WARN: Code duplicated, block: B:39:0x010f  */
            /* JADX WARN: Code duplicated, block: B:48:0x010e A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:50:? A[LOOP:0: B:21:0x00ab->B:50:?, LOOP_END, SYNTHETIC] */
            @Override // gu.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) throws u3.d, IllegalAccessException, InvocationTargetException {
                kv.a aVarB;
                p001kotlin.jvm.internal.y yVar;
                p001kotlin.jvm.internal.c0 c0Var;
                p001kotlin.jvm.internal.c0 c0Var2;
                p001kotlin.jvm.internal.y yVar2;
                kv.a aVar;
                Iterator<T> it;
                kv.a aVar2;
                p001kotlin.jvm.internal.y yVar3;
                p001kotlin.jvm.internal.c0 c0Var3;
                a aVar3;
                p001kotlin.jvm.internal.c0 c0Var4;
                Function2 function2;
                Object obj2;
                int iHashCode;
                int i10;
                Object objE = fu.c.e();
                int i11 = this.f32988z;
                if (i11 == 0) {
                    zt.o.b(obj);
                    aVarB = kv.g.b(false, 1, null);
                    yVar = new p001kotlin.jvm.internal.y();
                    c0Var = new p001kotlin.jvm.internal.c0();
                    k<T> kVar = this.A;
                    this.f32982t = aVarB;
                    this.f32983u = yVar;
                    this.f32984v = c0Var;
                    this.f32985w = c0Var;
                    this.f32988z = 1;
                    obj = kVar.y(true, this);
                    if (obj != objE) {
                        c0Var2 = c0Var;
                    }
                    return objE;
                }
                if (i11 == 1) {
                    c0Var = (p001kotlin.jvm.internal.c0) this.f32985w;
                    c0Var2 = (p001kotlin.jvm.internal.c0) this.f32984v;
                    yVar = (p001kotlin.jvm.internal.y) this.f32983u;
                    aVarB = (kv.a) this.f32982t;
                    zt.o.b(obj);
                } else {
                    if (i11 == 2) {
                        it = (Iterator) this.f32986x;
                        aVar3 = (a) this.f32985w;
                        c0Var3 = (p001kotlin.jvm.internal.c0) this.f32984v;
                        yVar3 = (p001kotlin.jvm.internal.y) this.f32983u;
                        aVar2 = (kv.a) this.f32982t;
                        zt.o.b(obj);
                        while (it.hasNext()) {
                            function2 = (Function2) it.next();
                            this.f32982t = aVar2;
                            this.f32983u = yVar3;
                            this.f32984v = c0Var3;
                            this.f32985w = aVar3;
                            this.f32986x = it;
                            this.f32988z = 2;
                            if (function2.invoke(aVar3, this) == objE) {
                                return objE;
                            }
                        }
                        c0Var2 = c0Var3;
                        yVar2 = yVar3;
                        aVar = aVar2;
                        this.B.initTasks = null;
                        this.f32982t = yVar2;
                        this.f32983u = c0Var2;
                        this.f32984v = aVar;
                        this.f32985w = null;
                        this.f32986x = null;
                        this.f32988z = 3;
                        if (aVar.d(null, this) != objE) {
                            c0Var4 = c0Var2;
                            yVar2.f21591a = true;
                            Unit unit = Unit.f21506a;
                            aVar.f(null);
                            obj2 = c0Var4.f21575a;
                            if (obj2 != null) {
                            }
                            u3.t tVarR = this.A.r();
                            this.f32982t = obj2;
                            this.f32983u = null;
                            this.f32984v = null;
                            this.f32987y = iHashCode;
                            this.f32988z = 4;
                            obj = tVarR.a(this);
                            if (obj != objE) {
                                i10 = iHashCode;
                            }
                        }
                        return objE;
                    }
                    if (i11 == 3) {
                        aVar = (kv.a) this.f32984v;
                        c0Var4 = (p001kotlin.jvm.internal.c0) this.f32983u;
                        yVar2 = (p001kotlin.jvm.internal.y) this.f32982t;
                        zt.o.b(obj);
                        try {
                            yVar2.f21591a = true;
                            Unit unit2 = Unit.f21506a;
                            aVar.f(null);
                            obj2 = c0Var4.f21575a;
                            iHashCode = obj2 != null ? obj2.hashCode() : 0;
                            u3.t tVarR2 = this.A.r();
                            this.f32982t = obj2;
                            this.f32983u = null;
                            this.f32984v = null;
                            this.f32987y = iHashCode;
                            this.f32988z = 4;
                            obj = tVarR2.a(this);
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
                    i10 = this.f32987y;
                    obj2 = this.f32982t;
                    zt.o.b(obj);
                }
                return new u3.f(obj2, i10, ((Number) obj).intValue());
                c0Var.f21575a = (T) ((u3.f) obj).c();
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
                        this.f32982t = aVar2;
                        this.f32983u = yVar3;
                        this.f32984v = c0Var3;
                        this.f32985w = aVar3;
                        this.f32986x = it;
                        this.f32988z = 2;
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
                this.f32982t = yVar2;
                this.f32983u = c0Var2;
                this.f32984v = aVar;
                this.f32985w = null;
                this.f32986x = null;
                this.f32988z = 3;
                if (aVar.d(null, this) != objE) {
                    c0Var4 = c0Var2;
                    yVar2.f21591a = true;
                    Unit unit3 = Unit.f21506a;
                    aVar.f(null);
                    obj2 = c0Var4.f21575a;
                    if (obj2 != null) {
                    }
                    u3.t tVarR3 = this.A.r();
                    this.f32982t = obj2;
                    this.f32983u = null;
                    this.f32984v = null;
                    this.f32987y = iHashCode;
                    this.f32988z = 4;
                    obj = tVarR3.a(this);
                    if (obj != objE) {
                        i10 = iHashCode;
                        return new u3.f(obj2, i10, ((Number) obj).intValue());
                    }
                }
                return objE;
            }

            @Override // p001kotlin.jvm.functions.Function1
            @Nullable
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@Nullable eu.b<? super u3.f<T>> bVar) {
                return ((C0663b) create(bVar)).invokeSuspend(Unit.f21506a);
            }
        }

        public b(@NotNull k kVar, List<? extends Function2<? super u3.s<T>, ? super eu.b<? super Unit>, ? extends Object>> initTasksList) {
            Intrinsics.checkNotNullParameter(initTasksList, "initTasksList");
            this.f32977d = kVar;
            this.initTasks = CollectionsKt.M0(initTasksList);
        }

        /* JADX WARN: Code duplicated, block: B:26:0x006e  */
        /* JADX WARN: Code duplicated, block: B:29:0x007c  */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // u3.z
        @Nullable
        public Object b(@NotNull eu.b<? super Unit> bVar) throws u3.d, IllegalAccessException, InvocationTargetException {
            a aVar;
            b bVar2;
            u3.f fVar;
            if (bVar instanceof a) {
                aVar = (a) bVar;
                int i10 = aVar.f32981w;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    aVar.f32981w = i10 - Integer.MIN_VALUE;
                } else {
                    aVar = new a(this, bVar);
                }
            } else {
                aVar = new a(this, bVar);
            }
            Object objY = aVar.f32979u;
            Object objE = fu.c.e();
            int i11 = aVar.f32981w;
            if (i11 == 0) {
                zt.o.b(objY);
                List<? extends Function2<? super u3.s<T>, ? super eu.b<? super Unit>, ? extends Object>> list = this.initTasks;
                if (list != null) {
                    Intrinsics.checkNotNull(list);
                    if (list.isEmpty()) {
                        k<T> kVar = this.f32977d;
                        aVar.f32978t = this;
                        aVar.f32981w = 1;
                        objY = kVar.y(false, aVar);
                        if (objY != objE) {
                            bVar2 = this;
                            fVar = (u3.f) objY;
                        }
                    } else {
                        u3.t tVarR = this.f32977d.r();
                        C0663b c0663b = new C0663b(this.f32977d, this, null);
                        aVar.f32978t = this;
                        aVar.f32981w = 2;
                        objY = tVarR.e(c0663b, aVar);
                        if (objY != objE) {
                            bVar2 = this;
                            fVar = (u3.f) objY;
                        }
                    }
                } else {
                    k<T> kVar2 = this.f32977d;
                    aVar.f32978t = this;
                    aVar.f32981w = 1;
                    objY = kVar2.y(false, aVar);
                    if (objY != objE) {
                        bVar2 = this;
                        fVar = (u3.f) objY;
                    }
                }
                return objE;
            }
            if (i11 == 1) {
                bVar2 = (b) aVar.f32978t;
                zt.o.b(objY);
                fVar = (u3.f) objY;
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bVar2 = (b) aVar.f32978t;
                zt.o.b(objY);
                fVar = (u3.f) objY;
            }
            bVar2.f32977d.inMemoryCache.c(fVar);
            return Unit.f21506a;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "Lu3/t;", "b", "()Lu3/t;"}, k = 3, mv = {1, 8, 0})
    public static final class c extends p001kotlin.jvm.internal.m implements Function0<u3.t> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ k<T> f32999i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(k<T> kVar) {
            super(0);
            this.f32999i = kVar;
        }

        @Override // p001kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final u3.t invoke() {
            return this.f32999i.s().getCoordinator();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Ldv/i;", BuildConfig.FLAVOR, "<anonymous>", "(Ldv/i;)V"}, k = 3, mv = {1, 8, 0})
    @gu.f(c = "androidx.datastore.core.DataStoreImpl$data$1", f = "DataStoreImpl.kt", l = {72, 74, MlKitException.MODEL_INCOMPATIBLE_WITH_TFLITE}, m = "invokeSuspend")
    public static final class d extends gu.m implements Function2<dv.i<? super T>, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f33000t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f33001u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f33002v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ k<T> f33003w;

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Ldv/i;", "Lu3/d0;", BuildConfig.FLAVOR, "<anonymous>", "(Ldv/i;)V"}, k = 3, mv = {1, 8, 0})
        @gu.f(c = "androidx.datastore.core.DataStoreImpl$data$1$1", f = "DataStoreImpl.kt", l = {MlKitException.MODEL_HASH_MISMATCH}, m = "invokeSuspend")
        public static final class a extends gu.m implements Function2<dv.i<? super d0<T>>, eu.b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f33004t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ k<T> f33005u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(k<T> kVar, eu.b<? super a> bVar) {
                super(2, bVar);
                this.f33005u = kVar;
            }

            @Override // gu.a
            @NotNull
            public final eu.b<Unit> create(@Nullable Object obj, @NotNull eu.b<?> bVar) {
                return new a(this.f33005u, bVar);
            }

            @Override // gu.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object objE = fu.c.e();
                int i10 = this.f33004t;
                if (i10 == 0) {
                    zt.o.b(obj);
                    k<T> kVar = this.f33005u;
                    this.f33004t = 1;
                    if (kVar.u(this) == objE) {
                        return objE;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zt.o.b(obj);
                }
                return Unit.f21506a;
            }

            @Override // p001kotlin.jvm.functions.Function2
            @Nullable
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@NotNull dv.i<? super d0<T>> iVar, @Nullable eu.b<? super Unit> bVar) {
                return ((a) create(iVar, bVar)).invokeSuspend(Unit.f21506a);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lu3/d0;", "it", BuildConfig.FLAVOR, "<anonymous>", "(Lu3/d0;)Z"}, k = 3, mv = {1, 8, 0})
        @gu.f(c = "androidx.datastore.core.DataStoreImpl$data$1$2", f = "DataStoreImpl.kt", l = {}, m = "invokeSuspend")
        public static final class b extends gu.m implements Function2<d0<T>, eu.b<? super Boolean>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f33006t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public /* synthetic */ Object f33007u;

            public b(eu.b<? super b> bVar) {
                super(2, bVar);
            }

            @Override // gu.a
            @NotNull
            public final eu.b<Unit> create(@Nullable Object obj, @NotNull eu.b<?> bVar) {
                b bVar2 = new b(bVar);
                bVar2.f33007u = obj;
                return bVar2;
            }

            @Override // gu.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                fu.c.e();
                if (this.f33006t != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zt.o.b(obj);
                return gu.b.a(!(((d0) this.f33007u) instanceof u3.r));
            }

            @Override // p001kotlin.jvm.functions.Function2
            @Nullable
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@NotNull d0<T> d0Var, @Nullable eu.b<? super Boolean> bVar) {
                return ((b) create(d0Var, bVar)).invokeSuspend(Unit.f21506a);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lu3/d0;", "it", BuildConfig.FLAVOR, "<anonymous>", "(Lu3/d0;)Z"}, k = 3, mv = {1, 8, 0})
        @gu.f(c = "androidx.datastore.core.DataStoreImpl$data$1$3", f = "DataStoreImpl.kt", l = {}, m = "invokeSuspend")
        public static final class c extends gu.m implements Function2<d0<T>, eu.b<? super Boolean>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f33008t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public /* synthetic */ Object f33009u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ d0<T> f33010v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(d0<T> d0Var, eu.b<? super c> bVar) {
                super(2, bVar);
                this.f33010v = d0Var;
            }

            @Override // gu.a
            @NotNull
            public final eu.b<Unit> create(@Nullable Object obj, @NotNull eu.b<?> bVar) {
                c cVar = new c(this.f33010v, bVar);
                cVar.f33009u = obj;
                return cVar;
            }

            @Override // gu.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                fu.c.e();
                if (this.f33008t != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zt.o.b(obj);
                d0 d0Var = (d0) this.f33009u;
                return gu.b.a((d0Var instanceof u3.f) && d0Var.getVersion() <= this.f33010v.getVersion());
            }

            @Override // p001kotlin.jvm.functions.Function2
            @Nullable
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@NotNull d0<T> d0Var, @Nullable eu.b<? super Boolean> bVar) {
                return ((c) create(d0Var, bVar)).invokeSuspend(Unit.f21506a);
            }
        }

        /* JADX INFO: renamed from: u3.k$d$d, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Ldv/i;", BuildConfig.FLAVOR, "it", BuildConfig.FLAVOR, "<anonymous>", "(Ldv/i;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
        @gu.f(c = "androidx.datastore.core.DataStoreImpl$data$1$5", f = "DataStoreImpl.kt", l = {116}, m = "invokeSuspend")
        public static final class C0665d extends gu.m implements pu.n<dv.i<? super T>, Throwable, eu.b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f33011t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ k<T> f33012u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0665d(k<T> kVar, eu.b<? super C0665d> bVar) {
                super(3, bVar);
                this.f33012u = kVar;
            }

            @Override // gu.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object objE = fu.c.e();
                int i10 = this.f33011t;
                if (i10 == 0) {
                    zt.o.b(obj);
                    k<T> kVar = this.f33012u;
                    this.f33011t = 1;
                    if (kVar.p(this) == objE) {
                        return objE;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zt.o.b(obj);
                }
                return Unit.f21506a;
            }

            @Override // pu.n
            @Nullable
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@NotNull dv.i<? super T> iVar, @Nullable Throwable th2, @Nullable eu.b<? super Unit> bVar) {
                return new C0665d(this.f33012u, bVar).invokeSuspend(Unit.f21506a);
            }
        }

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Ldv/h;", "Ldv/i;", "collector", BuildConfig.FLAVOR, "collect", "(Ldv/i;Leu/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class e implements dv.h<T> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ dv.h f33013a;

            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", BuildConfig.FLAVOR, "emit", "(Ljava/lang/Object;Leu/b;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            public static final class a<T> implements dv.i {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ dv.i f33014a;

                /* JADX INFO: renamed from: u3.k$d$e$a$a, reason: collision with other inner class name */
                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                @gu.f(c = "androidx.datastore.core.DataStoreImpl$data$1$invokeSuspend$$inlined$map$1$2", f = "DataStoreImpl.kt", l = {223}, m = "emit")
                public static final class C0666a extends gu.d {

                    /* JADX INFO: renamed from: t, reason: collision with root package name */
                    public /* synthetic */ Object f33015t;

                    /* JADX INFO: renamed from: u, reason: collision with root package name */
                    public int f33016u;

                    public C0666a(eu.b bVar) {
                        super(bVar);
                    }

                    @Override // gu.a
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.f33015t = obj;
                        this.f33016u |= Integer.MIN_VALUE;
                        return a.this.emit(null, this);
                    }
                }

                public a(dv.i iVar) {
                    this.f33014a = iVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // dv.i
                @Nullable
                public final Object emit(Object obj, @NotNull eu.b bVar) throws Throwable {
                    C0666a c0666a;
                    if (bVar instanceof C0666a) {
                        c0666a = (C0666a) bVar;
                        int i10 = c0666a.f33016u;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            c0666a.f33016u = i10 - Integer.MIN_VALUE;
                        } else {
                            c0666a = new C0666a(bVar);
                        }
                    } else {
                        c0666a = new C0666a(bVar);
                    }
                    Object obj2 = c0666a.f33015t;
                    Object objE = fu.c.e();
                    int i11 = c0666a.f33016u;
                    if (i11 == 0) {
                        zt.o.b(obj2);
                        dv.i iVar = this.f33014a;
                        d0 d0Var = (d0) obj;
                        if (d0Var instanceof u3.x) {
                            throw ((u3.x) d0Var).getReadException();
                        }
                        if (!(d0Var instanceof u3.f)) {
                            if (d0Var instanceof u3.r ? true : d0Var instanceof h0) {
                                throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                            }
                            throw new zt.l();
                        }
                        Object objC = ((u3.f) d0Var).c();
                        c0666a.f33016u = 1;
                        if (iVar.emit(objC, c0666a) == objE) {
                            return objE;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        zt.o.b(obj2);
                    }
                    return Unit.f21506a;
                }
            }

            public e(dv.h hVar) {
                this.f33013a = hVar;
            }

            @Override // dv.h
            @Nullable
            public Object collect(@NotNull dv.i iVar, @NotNull eu.b bVar) {
                Object objCollect = this.f33013a.collect(new a(iVar), bVar);
                return objCollect == fu.c.e() ? objCollect : Unit.f21506a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(k<T> kVar, eu.b<? super d> bVar) {
            super(2, bVar);
            this.f33003w = kVar;
        }

        @Override // gu.a
        @NotNull
        public final eu.b<Unit> create(@Nullable Object obj, @NotNull eu.b<?> bVar) {
            d dVar = new d(this.f33003w, bVar);
            dVar.f33002v = obj;
            return dVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:32:0x00bb, code lost:
        
            if (dv.j.q(r1, r9, r8) == r0) goto L33;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v13 */
        /* JADX WARN: Type inference failed for: r1v14 */
        /* JADX WARN: Type inference failed for: r1v3 */
        /* JADX WARN: Type inference failed for: r1v4, types: [dv.i, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v6, types: [dv.i] */
        /* JADX WARN: Type inference failed for: r1v8 */
        /* JADX WARN: Type inference failed for: r3v12 */
        /* JADX WARN: Type inference failed for: r3v15 */
        /* JADX WARN: Type inference failed for: r3v5 */
        @Override // gu.a
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            ?? r10;
            d0 d0Var;
            ?? r11;
            d0 d0Var2;
            ?? r12;
            Object objE = fu.c.e();
            int i10 = this.f33001u;
            if (i10 == 0) {
                zt.o.b(obj);
                dv.i iVar = (dv.i) this.f33002v;
                k<T> kVar = this.f33003w;
                this.f33002v = iVar;
                this.f33001u = 1;
                Object objZ = kVar.z(false, this);
                if (objZ != objE) {
                    r10 = iVar;
                    obj = objZ;
                }
                return objE;
            }
            if (i10 == 1) {
                dv.i iVar2 = (dv.i) this.f33002v;
                zt.o.b(obj);
                r10 = iVar2;
            } else if (i10 == 2) {
                d0Var2 = (d0) this.f33000t;
                dv.i iVar3 = (dv.i) this.f33002v;
                zt.o.b(obj);
                r11 = iVar3;
                d0Var = d0Var2;
                r12 = r11;
                dv.h hVarD = dv.j.D(new e(dv.j.o(dv.j.O(dv.j.F(this.f33003w.inMemoryCache.b(), new a(this.f33003w, null)), new b(null)), new c(d0Var, null))), new C0665d(this.f33003w, null));
                this.f33002v = null;
                this.f33000t = null;
                this.f33001u = 3;
            } else {
                if (i10 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zt.o.b(obj);
            }
            return Unit.f21506a;
            d0Var = (d0) obj;
            if (d0Var instanceof u3.f) {
                Object objC = ((u3.f) d0Var).c();
                this.f33002v = r10;
                this.f33000t = d0Var;
                this.f33001u = 2;
                if (r10.emit(objC, this) != objE) {
                    r11 = r10;
                    d0Var2 = d0Var;
                    d0Var = d0Var2;
                    r12 = r11;
                    dv.h hVarD2 = dv.j.D(new e(dv.j.o(dv.j.O(dv.j.F(this.f33003w.inMemoryCache.b(), new a(this.f33003w, null)), new b(null)), new c(d0Var, null))), new C0665d(this.f33003w, null));
                    this.f33002v = null;
                    this.f33000t = null;
                    this.f33001u = 3;
                }
            } else {
                if (d0Var instanceof h0) {
                    throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                }
                if (d0Var instanceof u3.x) {
                    throw ((u3.x) d0Var).getReadException();
                }
                r12 = r10;
                if (d0Var instanceof u3.r) {
                    return Unit.f21506a;
                }
                dv.h hVarD3 = dv.j.D(new e(dv.j.o(dv.j.O(dv.j.F(this.f33003w.inMemoryCache.b(), new a(this.f33003w, null)), new b(null)), new c(d0Var, null))), new C0665d(this.f33003w, null));
                this.f33002v = null;
                this.f33000t = null;
                this.f33001u = 3;
            }
            return objE;
        }

        @Override // p001kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull dv.i<? super T> iVar, @Nullable eu.b<? super Unit> bVar) {
            return ((d) create(iVar, bVar)).invokeSuspend(Unit.f21506a);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @gu.f(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", l = {544}, m = "decrementCollector")
    public static final class e extends gu.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f33018t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f33019u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f33020v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ k<T> f33021w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f33022x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(k<T> kVar, eu.b<? super e> bVar) {
            super(bVar);
            this.f33021w = kVar;
        }

        @Override // gu.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f33020v = obj;
            this.f33022x |= Integer.MIN_VALUE;
            return this.f33021w.p(this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0003\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u0002H\u008a@"}, d2 = {"<anonymous>", "R", "T"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @gu.f(c = "androidx.datastore.core.DataStoreImpl$doWithWriteFileLock$3", f = "DataStoreImpl.kt", l = {416}, m = "invokeSuspend")
    public static final class f<R> extends gu.m implements Function1<eu.b<? super R>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f33023t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Function1<eu.b<? super R>, Object> f33024u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(Function1<? super eu.b<? super R>, ? extends Object> function1, eu.b<? super f> bVar) {
            super(1, bVar);
            this.f33024u = function1;
        }

        @Override // gu.a
        @NotNull
        public final eu.b<Unit> create(@NotNull eu.b<?> bVar) {
            return new f(this.f33024u, bVar);
        }

        @Override // gu.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f33023t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zt.o.b(obj);
                return obj;
            }
            zt.o.b(obj);
            Function1<eu.b<? super R>, Object> function1 = this.f33024u;
            this.f33023t = 1;
            Object objInvoke = function1.invoke(this);
            return objInvoke == objE ? objE : objInvoke;
        }

        @Override // p001kotlin.jvm.functions.Function1
        @Nullable
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Nullable eu.b<? super R> bVar) {
            return ((f) create(bVar)).invokeSuspend(Unit.f21506a);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @gu.f(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", l = {237, 243, 246}, m = "handleUpdate")
    public static final class g extends gu.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f33025t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f33026u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f33027v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public /* synthetic */ Object f33028w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ k<T> f33029x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f33030y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(k<T> kVar, eu.b<? super g> bVar) {
            super(bVar);
            this.f33029x = kVar;
        }

        @Override // gu.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f33028w = obj;
            this.f33030y |= Integer.MIN_VALUE;
            return this.f33029x.t(null, this);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @gu.f(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", l = {544}, m = "incrementCollector")
    public static final class h extends gu.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f33031t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f33032u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f33033v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ k<T> f33034w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f33035x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(k<T> kVar, eu.b<? super h> bVar) {
            super(bVar);
            this.f33034w = kVar;
        }

        @Override // gu.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f33033v = obj;
            this.f33035x |= Integer.MIN_VALUE;
            return this.f33034w.u(this);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {1, 8, 0})
    @gu.f(c = "androidx.datastore.core.DataStoreImpl$incrementCollector$2$1", f = "DataStoreImpl.kt", l = {134, 135}, m = "invokeSuspend")
    public static final class i extends gu.m implements Function2<p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f33036t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ k<T> f33037u;

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", BuildConfig.FLAVOR, "it", "b", "(Lkotlin/Unit;Leu/b;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
        public static final class a<T> implements dv.i {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ k<T> f33038a;

            public a(k<T> kVar) {
                this.f33038a = kVar;
            }

            @Override // dv.i
            @Nullable
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(@NotNull Unit unit, @NotNull eu.b<? super Unit> bVar) {
                Object objW;
                return ((this.f33038a.inMemoryCache.a() instanceof u3.r) || (objW = this.f33038a.w(true, bVar)) != fu.c.e()) ? Unit.f21506a : objW;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(k<T> kVar, eu.b<? super i> bVar) {
            super(2, bVar);
            this.f33037u = kVar;
        }

        @Override // gu.a
        @NotNull
        public final eu.b<Unit> create(@Nullable Object obj, @NotNull eu.b<?> bVar) {
            return new i(this.f33037u, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull p0 p0Var, @Nullable eu.b<? super Unit> bVar) {
            return ((i) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
        
            if (r5.collect(r1, r4) == r0) goto L15;
         */
        @Override // gu.a
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f33036t;
            if (i10 == 0) {
                zt.o.b(obj);
                b bVar = this.f33037u.readAndInit;
                this.f33036t = 1;
                if (bVar.a(this) != objE) {
                }
                return objE;
            }
            if (i10 == 1) {
                zt.o.b(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zt.o.b(obj);
            }
            return Unit.f21506a;
            dv.h hVarK = dv.j.k(this.f33037u.r().b());
            a aVar = new a(this.f33037u);
            this.f33036t = 2;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @gu.f(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", l = {264, 266}, m = "readAndInitOrPropagateAndThrowFailure")
    public static final class j extends gu.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f33039t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f33040u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f33041v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ k<T> f33042w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f33043x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(k<T> kVar, eu.b<? super j> bVar) {
            super(bVar);
            this.f33042w = kVar;
        }

        @Override // gu.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f33041v = obj;
            this.f33043x |= Integer.MIN_VALUE;
            return this.f33042w.v(this);
        }
    }

    /* JADX INFO: renamed from: u3.k$k, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @gu.f(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", l = {287, 296, 304}, m = "readDataAndUpdateCache")
    public static final class C0667k extends gu.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f33044t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f33045u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public boolean f33046v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public /* synthetic */ Object f33047w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ k<T> f33048x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f33049y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0667k(k<T> kVar, eu.b<? super C0667k> bVar) {
            super(bVar);
            this.f33048x = kVar;
        }

        @Override // gu.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f33047w = obj;
            this.f33049y |= Integer.MIN_VALUE;
            return this.f33048x.w(false, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0004\u0012\u00020\u00030\u0001\"\u0004\b\u0000\u0010\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lkotlin/Pair;", "Lu3/d0;", BuildConfig.FLAVOR, "<anonymous>", "()Lkotlin/Pair;"}, k = 3, mv = {1, 8, 0})
    @gu.f(c = "androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$3", f = "DataStoreImpl.kt", l = {298, MlKitException.LOW_LIGHT_AUTO_EXPOSURE_COMPUTATION_FAILURE}, m = "invokeSuspend")
    public static final class l extends gu.m implements Function1<eu.b<? super Pair<? extends d0<T>, ? extends Boolean>>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f33050t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f33051u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ k<T> f33052v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(k<T> kVar, eu.b<? super l> bVar) {
            super(1, bVar);
            this.f33052v = kVar;
        }

        @Override // gu.a
        @NotNull
        public final eu.b<Unit> create(@NotNull eu.b<?> bVar) {
            return new l(this.f33052v, bVar);
        }

        @Override // gu.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Throwable th2;
            d0 xVar;
            Object objE = fu.c.e();
            int i10 = this.f33051u;
            try {
                if (i10 == 0) {
                    zt.o.b(obj);
                    k<T> kVar = this.f33052v;
                    this.f33051u = 1;
                    obj = kVar.y(true, this);
                    if (obj == objE) {
                        return objE;
                    }
                } else {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        th2 = (Throwable) this.f33050t;
                        zt.o.b(obj);
                        xVar = new u3.x(th2, ((Number) obj).intValue());
                        return zt.s.a(xVar, gu.b.a(true));
                    }
                    zt.o.b(obj);
                }
                xVar = (d0) obj;
            } catch (Throwable th3) {
                u3.t tVarR = this.f33052v.r();
                this.f33050t = th3;
                this.f33051u = 2;
                Object objA = tVarR.a(this);
                if (objA != objE) {
                    th2 = th3;
                    obj = objA;
                }
                return objE;
            }
            return zt.s.a(xVar, gu.b.a(true));
        }

        @Override // p001kotlin.jvm.functions.Function1
        @Nullable
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Nullable eu.b<? super Pair<? extends d0<T>, Boolean>> bVar) {
            return ((l) create(bVar)).invokeSuspend(Unit.f21506a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0004\u0012\u00020\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", BuildConfig.FLAVOR, "locked", "Lkotlin/Pair;", "Lu3/d0;", "<anonymous>", "(Z)Lkotlin/Pair;"}, k = 3, mv = {1, 8, 0})
    @gu.f(c = "androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$4", f = "DataStoreImpl.kt", l = {306, 309}, m = "invokeSuspend")
    public static final class m extends gu.m implements Function2<Boolean, eu.b<? super Pair<? extends d0<T>, ? extends Boolean>>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f33053t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f33054u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ boolean f33055v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ k<T> f33056w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ int f33057x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(k<T> kVar, int i10, eu.b<? super m> bVar) {
            super(2, bVar);
            this.f33056w = kVar;
            this.f33057x = i10;
        }

        @Override // gu.a
        @NotNull
        public final eu.b<Unit> create(@Nullable Object obj, @NotNull eu.b<?> bVar) {
            m mVar = new m(this.f33056w, this.f33057x, bVar);
            mVar.f33055v = ((Boolean) obj).booleanValue();
            return mVar;
        }

        @Override // p001kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Object obj) {
            return m(bool.booleanValue(), (eu.b) obj);
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
        @Override // gu.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Throwable th2;
            int iIntValue;
            ?? r10;
            ?? r11;
            d0 d0Var;
            ?? r12;
            Object objE = fu.c.e();
            ?? r13 = this.f33054u;
            try {
                if (r13 == 0) {
                    zt.o.b(obj);
                    boolean z10 = this.f33055v;
                    k<T> kVar = this.f33056w;
                    this.f33055v = z10;
                    this.f33054u = 1;
                    obj = kVar.y(z10, this);
                    r13 = z10;
                    if (obj == objE) {
                        return objE;
                    }
                } else {
                    if (r13 != 1) {
                        if (r13 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        boolean z11 = this.f33055v;
                        th2 = (Throwable) this.f33053t;
                        zt.o.b(obj);
                        r11 = z11;
                        iIntValue = ((Number) obj).intValue();
                        r10 = r11;
                        u3.x xVar = new u3.x(th2, iIntValue);
                        r12 = r10;
                        d0Var = xVar;
                        return zt.s.a(d0Var, gu.b.a(r12));
                    }
                    boolean z12 = this.f33055v;
                    zt.o.b(obj);
                    r13 = z12;
                }
                d0Var = (d0) obj;
                r12 = r13;
            } catch (Throwable th3) {
                if (r13 != 0) {
                    u3.t tVarR = this.f33056w.r();
                    this.f33053t = th3;
                    this.f33055v = r13;
                    this.f33054u = 2;
                    Object objA = tVarR.a(this);
                    if (objA != objE) {
                        r11 = r13;
                        th2 = th3;
                        obj = objA;
                    }
                    return objE;
                }
                ?? r14 = r13;
                th2 = th3;
                iIntValue = this.f33057x;
                r10 = r14 == true ? 1 : 0;
            }
            return zt.s.a(d0Var, gu.b.a(r12));
        }

        @Nullable
        public final Object m(boolean z10, @Nullable eu.b<? super Pair<? extends d0<T>, Boolean>> bVar) {
            return ((m) create(Boolean.valueOf(z10), bVar)).invokeSuspend(Unit.f21506a);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @gu.f(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", l = {365, 366, 368, 369, 380, 384}, m = "readDataOrHandleCorruption")
    public static final class n extends gu.d {
        public final /* synthetic */ k<T> A;
        public int B;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f33058t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f33059u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f33060v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Object f33061w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public boolean f33062x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f33063y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public /* synthetic */ Object f33064z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(k<T> kVar, eu.b<? super n> bVar) {
            super(bVar);
            this.A = kVar;
        }

        @Override // gu.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f33064z = obj;
            this.B |= Integer.MIN_VALUE;
            return this.A.y(false, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", BuildConfig.FLAVOR, "locked", "Lu3/f;", "<anonymous>", "(Z)Lu3/f;"}, k = 3, mv = {1, 8, 0})
    @gu.f(c = "androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$2", f = "DataStoreImpl.kt", l = {370, 371}, m = "invokeSuspend")
    public static final class o extends gu.m implements Function2<Boolean, eu.b<? super u3.f<T>>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f33065t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f33066u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ boolean f33067v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ k<T> f33068w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ int f33069x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(k<T> kVar, int i10, eu.b<? super o> bVar) {
            super(2, bVar);
            this.f33068w = kVar;
            this.f33069x = i10;
        }

        @Override // gu.a
        @NotNull
        public final eu.b<Unit> create(@Nullable Object obj, @NotNull eu.b<?> bVar) {
            o oVar = new o(this.f33068w, this.f33069x, bVar);
            oVar.f33067v = ((Boolean) obj).booleanValue();
            return oVar;
        }

        @Override // p001kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Object obj) {
            return m(bool.booleanValue(), (eu.b) obj);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0059  */
        /* JADX WARN: Code duplicated, block: B:23:0x005e  */
        @Override // gu.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            boolean z10;
            Object obj2;
            int iIntValue;
            int iHashCode;
            Object objE = fu.c.e();
            int i10 = this.f33066u;
            if (i10 == 0) {
                zt.o.b(obj);
                z10 = this.f33067v;
                k<T> kVar = this.f33068w;
                this.f33067v = z10;
                this.f33066u = 1;
                obj = kVar.x(this);
                if (obj != objE) {
                }
                return objE;
            }
            if (i10 == 1) {
                z10 = this.f33067v;
                zt.o.b(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj2 = this.f33065t;
                zt.o.b(obj);
            }
            iIntValue = ((Number) obj).intValue();
            if (obj2 != null) {
                iHashCode = obj2.hashCode();
            } else {
                iHashCode = 0;
            }
            return new u3.f(obj2, iHashCode, iIntValue);
            if (z10) {
                u3.t tVarR = this.f33068w.r();
                this.f33065t = obj;
                this.f33066u = 2;
                Object objA = tVarR.a(this);
                if (objA != objE) {
                    obj2 = obj;
                    obj = objA;
                    iIntValue = ((Number) obj).intValue();
                }
                return objE;
            }
            obj2 = obj;
            iIntValue = this.f33069x;
            if (obj2 != null) {
                iHashCode = obj2.hashCode();
            } else {
                iHashCode = 0;
            }
            return new u3.f(obj2, iHashCode, iIntValue);
        }

        @Nullable
        public final Object m(boolean z10, @Nullable eu.b<? super u3.f<T>> bVar) {
            return ((o) create(Boolean.valueOf(z10), bVar)).invokeSuspend(Unit.f21506a);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\u008a@"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "T"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @gu.f(c = "androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$3", f = "DataStoreImpl.kt", l = {387, 388, 390}, m = "invokeSuspend")
    public static final class p extends gu.m implements Function1<eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f33070t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f33071u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ p001kotlin.jvm.internal.c0<T> f33072v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ k<T> f33073w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ p001kotlin.jvm.internal.a0 f33074x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(p001kotlin.jvm.internal.c0<T> c0Var, k<T> kVar, p001kotlin.jvm.internal.a0 a0Var, eu.b<? super p> bVar) {
            super(1, bVar);
            this.f33072v = c0Var;
            this.f33073w = kVar;
            this.f33074x = a0Var;
        }

        @Override // gu.a
        @NotNull
        public final eu.b<Unit> create(@NotNull eu.b<?> bVar) {
            return new p(this.f33072v, this.f33073w, this.f33074x, bVar);
        }

        @Override // gu.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            p001kotlin.jvm.internal.a0 a0Var;
            p001kotlin.jvm.internal.c0<T> c0Var;
            p001kotlin.jvm.internal.a0 a0Var2;
            Object objE = fu.c.e();
            int i10 = this.f33071u;
            try {
                if (i10 == 0) {
                    zt.o.b(obj);
                    c0Var = this.f33072v;
                    k<T> kVar = this.f33073w;
                    this.f33070t = c0Var;
                    this.f33071u = 1;
                    obj = (T) kVar.x(this);
                    if (obj == objE) {
                    }
                    return objE;
                }
                if (i10 == 1) {
                    c0Var = (p001kotlin.jvm.internal.c0) this.f33070t;
                    zt.o.b(obj);
                } else {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        a0Var = (p001kotlin.jvm.internal.a0) this.f33070t;
                        zt.o.b(obj);
                        a0Var.f21572a = ((Number) obj).intValue();
                        return Unit.f21506a;
                    }
                    a0Var2 = (p001kotlin.jvm.internal.a0) this.f33070t;
                    zt.o.b(obj);
                }
                a0Var2.f21572a = ((Number) obj).intValue();
                return Unit.f21506a;
                c0Var.f21575a = (T) obj;
                a0Var2 = this.f33074x;
                u3.t tVarR = this.f33073w.r();
                this.f33070t = a0Var2;
                this.f33071u = 2;
                obj = (T) tVarR.a(this);
                if (obj == objE) {
                    return objE;
                }
                a0Var2.f21572a = ((Number) obj).intValue();
            } catch (u3.d unused) {
                p001kotlin.jvm.internal.a0 a0Var3 = this.f33074x;
                k<T> kVar2 = this.f33073w;
                T t8 = this.f33072v.f21575a;
                this.f33070t = a0Var3;
                this.f33071u = 3;
                Object objB = kVar2.B(t8, true, this);
                if (objB != objE) {
                    a0Var = a0Var3;
                    obj = (T) objB;
                }
                return objE;
            }
            return Unit.f21506a;
        }

        @Override // p001kotlin.jvm.functions.Function1
        @Nullable
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Nullable eu.b<? super Unit> bVar) {
            return ((p) create(bVar)).invokeSuspend(Unit.f21506a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lav/p0;", "Lu3/d0;", "<anonymous>", "(Lav/p0;)Lu3/d0;"}, k = 3, mv = {1, 8, 0})
    @gu.f(c = "androidx.datastore.core.DataStoreImpl$readState$2", f = "DataStoreImpl.kt", l = {218, 226}, m = "invokeSuspend")
    public static final class q extends gu.m implements Function2<p0, eu.b<? super d0<T>>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f33075t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ k<T> f33076u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ boolean f33077v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(k<T> kVar, boolean z10, eu.b<? super q> bVar) {
            super(2, bVar);
            this.f33076u = kVar;
            this.f33077v = z10;
        }

        @Override // gu.a
        @NotNull
        public final eu.b<Unit> create(@Nullable Object obj, @NotNull eu.b<?> bVar) {
            return new q(this.f33076u, this.f33077v, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull p0 p0Var, @Nullable eu.b<? super d0<T>> bVar) {
            return ((q) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0051, code lost:
        
            if (r5 == r0) goto L22;
         */
        @Override // gu.a
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f33075t;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        zt.o.b(obj);
                    } else {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        zt.o.b(obj);
                    }
                    return (d0) obj;
                }
                zt.o.b(obj);
                if (this.f33076u.inMemoryCache.a() instanceof u3.r) {
                    return this.f33076u.inMemoryCache.a();
                }
                k<T> kVar = this.f33076u;
                this.f33075t = 1;
                if (kVar.v(this) != objE) {
                }
                return objE;
                k<T> kVar2 = this.f33076u;
                boolean z10 = this.f33077v;
                this.f33075t = 2;
                obj = kVar2.w(z10, this);
            } catch (Throwable th2) {
                return new u3.x(th2, -1);
            }
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "Lu3/f0;", "b", "()Lu3/f0;"}, k = 3, mv = {1, 8, 0})
    public static final class r extends p001kotlin.jvm.internal.m implements Function0<f0<T>> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ k<T> f33078i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(k<T> kVar) {
            super(0);
            this.f33078i = kVar;
        }

        @Override // p001kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final f0<T> invoke() {
            return this.f33078i.storage.a();
        }
    }

    @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001H\u008a@"}, d2 = {"<anonymous>", "T"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @gu.f(c = "androidx.datastore.core.DataStoreImpl$transformAndWrite$2", f = "DataStoreImpl.kt", l = {330, 331, 337}, m = "invokeSuspend")
    public static final class s extends gu.m implements Function1<eu.b<? super T>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f33079t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f33080u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ k<T> f33081v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ CoroutineContext f33082w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ Function2<T, eu.b<? super T>, Object> f33083x;

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"T", "Lav/p0;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @gu.f(c = "androidx.datastore.core.DataStoreImpl$transformAndWrite$2$newData$1", f = "DataStoreImpl.kt", l = {331}, m = "invokeSuspend")
        public static final class a extends gu.m implements Function2<p0, eu.b<? super T>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f33084t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ Function2<T, eu.b<? super T>, Object> f33085u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ u3.f<T> f33086v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(Function2<? super T, ? super eu.b<? super T>, ? extends Object> function2, u3.f<T> fVar, eu.b<? super a> bVar) {
                super(2, bVar);
                this.f33085u = function2;
                this.f33086v = fVar;
            }

            @Override // gu.a
            @NotNull
            public final eu.b<Unit> create(@Nullable Object obj, @NotNull eu.b<?> bVar) {
                return new a(this.f33085u, this.f33086v, bVar);
            }

            @Override // p001kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull p0 p0Var, @Nullable eu.b<? super T> bVar) {
                return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to u3.k$s$a for r3v1 'this'  java.lang.Object
                	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
                	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
                	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
                	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
                	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
                */
            @Override // gu.a
            @org.jetbrains.annotations.Nullable
            public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r4) {
                /*
                    r3 = this;
                    java.lang.Object r0 = fu.c.e()
                    int r1 = r3.f33084t
                    r2 = 1
                    if (r1 == 0) goto L17
                    if (r1 != r2) goto Lf
                    zt.o.b(r4)
                    return r4
                Lf:
                    java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r4.<init>(r0)
                    throw r4
                L17:
                    zt.o.b(r4)
                    kotlin.jvm.functions.Function2<T, eu.b<? super T>, java.lang.Object> r4 = r3.f33085u
                    u3.f<T> r1 = r3.f33086v
                    java.lang.Object r1 = r1.c()
                    r3.f33084t = r2
                    java.lang.Object r4 = r4.invoke(r1, r3)
                    if (r4 != r0) goto L2b
                    return r0
                L2b:
                    return r4
                */
                throw new UnsupportedOperationException("Method not decompiled: u3.k.s.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public s(k<T> kVar, CoroutineContext coroutineContext, Function2<? super T, ? super eu.b<? super T>, ? extends Object> function2, eu.b<? super s> bVar) {
            super(1, bVar);
            this.f33081v = kVar;
            this.f33082w = coroutineContext;
            this.f33083x = function2;
        }

        @Override // gu.a
        @NotNull
        public final eu.b<Unit> create(@NotNull eu.b<?> bVar) {
            return new s(this.f33081v, this.f33082w, this.f33083x, bVar);
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type eu.b to u3.k$s for r8v1 'this'  eu.b
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // gu.a
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = fu.c.e()
                int r1 = r8.f33080u
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L2b
                if (r1 == r4) goto L27
                if (r1 == r3) goto L1f
                if (r1 != r2) goto L17
                java.lang.Object r0 = r8.f33079t
                zt.o.b(r9)
                return r0
            L17:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L1f:
                java.lang.Object r1 = r8.f33079t
                u3.f r1 = (u3.f) r1
                zt.o.b(r9)
                goto L51
            L27:
                zt.o.b(r9)
                goto L39
            L2b:
                zt.o.b(r9)
                u3.k<T> r9 = r8.f33081v
                r8.f33080u = r4
                java.lang.Object r9 = u3.k.n(r9, r4, r8)
                if (r9 != r0) goto L39
                goto L6a
            L39:
                r1 = r9
                u3.f r1 = (u3.f) r1
                kotlin.coroutines.CoroutineContext r9 = r8.f33082w
                u3.k$s$a r5 = new u3.k$s$a
                kotlin.jvm.functions.Function2<T, eu.b<? super T>, java.lang.Object> r6 = r8.f33083x
                r7 = 0
                r5.<init>(r6, r1, r7)
                r8.f33079t = r1
                r8.f33080u = r3
                java.lang.Object r9 = av.i.g(r9, r5, r8)
                if (r9 != r0) goto L51
                goto L6a
            L51:
                r1.b()
                java.lang.Object r1 = r1.c()
                boolean r1 = p001kotlin.jvm.internal.Intrinsics.c(r1, r9)
                if (r1 != 0) goto L6b
                u3.k<T> r1 = r8.f33081v
                r8.f33079t = r9
                r8.f33080u = r2
                java.lang.Object r1 = r1.B(r9, r4, r8)
                if (r1 != r0) goto L6b
            L6a:
                return r0
            L6b:
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: u3.k.s.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p001kotlin.jvm.functions.Function1
        @Nullable
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Nullable eu.b<? super T> bVar) {
            return ((s) create(bVar)).invokeSuspend(Unit.f21506a);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"T", "Lav/p0;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @gu.f(c = "androidx.datastore.core.DataStoreImpl$updateData$2", f = "DataStoreImpl.kt", l = {169}, m = "invokeSuspend")
    public static final class t extends gu.m implements Function2<p0, eu.b<? super T>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f33087t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f33088u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ k<T> f33089v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ Function2<T, eu.b<? super T>, Object> f33090w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public t(k<T> kVar, Function2<? super T, ? super eu.b<? super T>, ? extends Object> function2, eu.b<? super t> bVar) {
            super(2, bVar);
            this.f33089v = kVar;
            this.f33090w = function2;
        }

        @Override // gu.a
        @NotNull
        public final eu.b<Unit> create(@Nullable Object obj, @NotNull eu.b<?> bVar) {
            t tVar = new t(this.f33089v, this.f33090w, bVar);
            tVar.f33088u = obj;
            return tVar;
        }

        @Override // p001kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull p0 p0Var, @Nullable eu.b<? super T> bVar) {
            return ((t) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objE = fu.c.e();
            int i10 = this.f33087t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zt.o.b(obj);
                return obj;
            }
            zt.o.b(obj);
            p0 p0Var = (p0) this.f33088u;
            av.x xVarC = av.z.c(null, 1, null);
            this.f33089v.writeActor.e(new u3.w.a(this.f33090w, xVarC, this.f33089v.inMemoryCache.a(), p0Var.getCoroutineContext()));
            this.f33087t = 1;
            Object objY = xVarC.y(this);
            return objY == objE ? objE : objY;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", BuildConfig.FLAVOR, "it", BuildConfig.FLAVOR, "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
    public static final class u extends p001kotlin.jvm.internal.m implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ k<T> f33091i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(k<T> kVar) {
            super(1);
            this.f33091i = kVar;
        }

        public final void a(@Nullable Throwable th2) {
            if (th2 != null) {
                this.f33091i.inMemoryCache.c(new u3.r(th2));
            }
            if (this.f33091i.storageConnectionDelegate.isInitialized()) {
                this.f33091i.s().close();
            }
        }

        @Override // p001kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            a(th2);
            return Unit.f21506a;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"T", "Lu3/w$a;", "msg", BuildConfig.FLAVOR, "ex", BuildConfig.FLAVOR, "a", "(Lu3/w$a;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
    public static final class v extends p001kotlin.jvm.internal.m implements Function2<u3.w.a<T>, Throwable, Unit> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final v f33092i = new v();

        public v() {
            super(2);
        }

        public final void a(@NotNull u3.w.a<T> msg, @Nullable Throwable th2) {
            Intrinsics.checkNotNullParameter(msg, "msg");
            av.x<T> xVarA = msg.a();
            if (th2 == null) {
                th2 = new CancellationException("DataStore scope was cancelled before updateData could complete");
            }
            xVarA.r(th2);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Object obj, Throwable th2) {
            a((u3.w.a) obj, th2);
            return Unit.f21506a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lu3/w$a;", "msg", BuildConfig.FLAVOR, "<anonymous>", "(Lu3/w$a;)V"}, k = 3, mv = {1, 8, 0})
    @gu.f(c = "androidx.datastore.core.DataStoreImpl$writeActor$3", f = "DataStoreImpl.kt", l = {MlKitException.CODE_SCANNER_GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD}, m = "invokeSuspend")
    public static final class w extends gu.m implements Function2<u3.w.a<T>, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f33093t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f33094u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ k<T> f33095v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(k<T> kVar, eu.b<? super w> bVar) {
            super(2, bVar);
            this.f33095v = kVar;
        }

        @Override // gu.a
        @NotNull
        public final eu.b<Unit> create(@Nullable Object obj, @NotNull eu.b<?> bVar) {
            w wVar = new w(this.f33095v, bVar);
            wVar.f33094u = obj;
            return wVar;
        }

        @Override // gu.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f33093t;
            if (i10 == 0) {
                zt.o.b(obj);
                u3.w.a aVar = (u3.w.a) this.f33094u;
                k<T> kVar = this.f33095v;
                this.f33093t = 1;
                if (kVar.t(aVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zt.o.b(obj);
            }
            return Unit.f21506a;
        }

        @Override // p001kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull u3.w.a<T> aVar, @Nullable eu.b<? super Unit> bVar) {
            return ((w) create(aVar, bVar)).invokeSuspend(Unit.f21506a);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @gu.f(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", l = {348}, m = "writeData$datastore_core_release")
    public static final class x extends gu.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f33096t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f33097u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ k<T> f33098v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f33099w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(k<T> kVar, eu.b<? super x> bVar) {
            super(bVar);
            this.f33098v = kVar;
        }

        @Override // gu.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f33097u = obj;
            this.f33099w |= Integer.MIN_VALUE;
            return this.f33098v.B(null, false, this);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lu3/k0;", BuildConfig.FLAVOR, "<anonymous>", "(Lu3/k0;)V"}, k = 3, mv = {1, 8, 0})
    @gu.f(c = "androidx.datastore.core.DataStoreImpl$writeData$2", f = "DataStoreImpl.kt", l = {352, 353}, m = "invokeSuspend")
    public static final class y extends gu.m implements Function2<k0<T>, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f33100t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f33101u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f33102v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ p001kotlin.jvm.internal.a0 f33103w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ k<T> f33104x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final /* synthetic */ T f33105y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ boolean f33106z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(p001kotlin.jvm.internal.a0 a0Var, k<T> kVar, T t8, boolean z10, eu.b<? super y> bVar) {
            super(2, bVar);
            this.f33103w = a0Var;
            this.f33104x = kVar;
            this.f33105y = t8;
            this.f33106z = z10;
        }

        @Override // gu.a
        @NotNull
        public final eu.b<Unit> create(@Nullable Object obj, @NotNull eu.b<?> bVar) {
            y yVar = new y(this.f33103w, this.f33104x, this.f33105y, this.f33106z, bVar);
            yVar.f33102v = obj;
            return yVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x005a, code lost:
        
            if (r3.e(r7, r6) == r0) goto L16;
         */
        @Override // gu.a
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) {
            p001kotlin.jvm.internal.a0 a0Var;
            k0 k0Var;
            Object objE = fu.c.e();
            int i10 = this.f33101u;
            if (i10 != 0) {
                if (i10 == 1) {
                    a0Var = (p001kotlin.jvm.internal.a0) this.f33100t;
                    k0Var = (k0) this.f33102v;
                    zt.o.b(obj);
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zt.o.b(obj);
                }
                if (this.f33106z) {
                    u3.l lVar = this.f33104x.inMemoryCache;
                    T t8 = this.f33105y;
                    lVar.c(new u3.f(t8, t8 != null ? t8.hashCode() : 0, this.f33103w.f21572a));
                }
                return Unit.f21506a;
            }
            zt.o.b(obj);
            k0 k0Var2 = (k0) this.f33102v;
            a0Var = this.f33103w;
            u3.t tVarR = this.f33104x.r();
            this.f33102v = k0Var2;
            this.f33100t = a0Var;
            this.f33101u = 1;
            Object objD = tVarR.d(this);
            if (objD != objE) {
                k0Var = k0Var2;
                obj = objD;
            }
            return objE;
            a0Var.f21572a = ((Number) obj).intValue();
            T t10 = this.f33105y;
            this.f33102v = null;
            this.f33100t = null;
            this.f33101u = 2;
        }

        @Override // p001kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull k0<T> k0Var, @Nullable eu.b<? super Unit> bVar) {
            return ((y) create(k0Var, bVar)).invokeSuspend(Unit.f21506a);
        }
    }

    public k(@NotNull e0<T> storage, @NotNull List<? extends Function2<? super u3.s<T>, ? super eu.b<? super Unit>, ? extends Object>> initTasksList, @NotNull u3.e<T> corruptionHandler, @NotNull p0 scope) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(initTasksList, "initTasksList");
        Intrinsics.checkNotNullParameter(corruptionHandler, "corruptionHandler");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.storage = storage;
        this.corruptionHandler = corruptionHandler;
        this.scope = scope;
        this.data = dv.j.w(new d(this, null));
        this.collectorMutex = kv.g.b(false, 1, null);
        this.inMemoryCache = new u3.l<>();
        this.readAndInit = new b(this, initTasksList);
        this.storageConnectionDelegate = zt.i.a(new r(this));
        this.coordinator = zt.i.a(new c(this));
        this.writeActor = new b0<>(scope, new u(this), v.f33092i, new w(this, null));
    }

    public final Object A(Function2<? super T, ? super eu.b<? super T>, ? extends Object> function2, CoroutineContext coroutineContext, eu.b<? super T> bVar) {
        return r().e(new s(this, coroutineContext, function2, null), bVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object B(T t8, boolean z10, @NotNull eu.b<? super Integer> bVar) {
        x xVar;
        p001kotlin.jvm.internal.a0 a0Var;
        if (bVar instanceof x) {
            xVar = (x) bVar;
            int i10 = xVar.f33099w;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                xVar.f33099w = i10 - Integer.MIN_VALUE;
            } else {
                xVar = new x(this, bVar);
            }
        } else {
            xVar = new x(this, bVar);
        }
        Object obj = xVar.f33097u;
        Object objE = fu.c.e();
        int i11 = xVar.f33099w;
        if (i11 == 0) {
            zt.o.b(obj);
            p001kotlin.jvm.internal.a0 a0Var2 = new p001kotlin.jvm.internal.a0();
            f0<T> f0VarS = s();
            y yVar = new y(a0Var2, this, t8, z10, null);
            xVar.f33096t = a0Var2;
            xVar.f33099w = 1;
            if (f0VarS.b(yVar, xVar) == objE) {
                return objE;
            }
            a0Var = a0Var2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0Var = (p001kotlin.jvm.internal.a0) xVar.f33096t;
            zt.o.b(obj);
        }
        return gu.b.c(a0Var.f21572a);
    }

    @Override // u3.i
    @Nullable
    public Object a(@NotNull Function2<? super T, ? super eu.b<? super T>, ? extends Object> function2, @NotNull eu.b<? super T> bVar) {
        j0 j0Var = (j0) bVar.getContext().get(j0.Companion.C0662a.f32963a);
        if (j0Var != null) {
            j0Var.a(this);
        }
        return av.i.g(new j0(j0Var, this), new t(this, function2, null), bVar);
    }

    @Override // u3.i
    @NotNull
    public dv.h<T> getData() {
        return this.data;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object p(eu.b<? super Unit> bVar) {
        e eVar;
        k<T> kVar;
        kv.a aVar;
        if (bVar instanceof e) {
            eVar = (e) bVar;
            int i10 = eVar.f33022x;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                eVar.f33022x = i10 - Integer.MIN_VALUE;
            } else {
                eVar = new e(this, bVar);
            }
        } else {
            eVar = new e(this, bVar);
        }
        Object obj = eVar.f33020v;
        Object objE = fu.c.e();
        int i11 = eVar.f33022x;
        if (i11 == 0) {
            zt.o.b(obj);
            kv.a aVar2 = this.collectorMutex;
            eVar.f33018t = this;
            eVar.f33019u = aVar2;
            eVar.f33022x = 1;
            if (aVar2.d(null, eVar) == objE) {
                return objE;
            }
            kVar = this;
            aVar = aVar2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = (kv.a) eVar.f33019u;
            kVar = (k) eVar.f33018t;
            zt.o.b(obj);
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
            Unit unit = Unit.f21506a;
            return Unit.f21506a;
        } finally {
            aVar.f(null);
        }
    }

    public final <R> Object q(boolean z10, Function1<? super eu.b<? super R>, ? extends Object> function1, eu.b<? super R> bVar) {
        return z10 ? function1.invoke(bVar) : r().e(new f(function1, null), bVar);
    }

    public final u3.t r() {
        return (u3.t) this.coordinator.getValue();
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
    /* JADX WARN: Type inference failed for: r2v9, types: [u3.k] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, u3.k, u3.k<T>] */
    /* JADX WARN: Type inference failed for: r9v3, types: [av.x] */
    /* JADX WARN: Type inference failed for: r9v33 */
    /* JADX WARN: Type inference failed for: r9v34 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object t(u3.w.a<T> aVar, eu.b<? super Unit> bVar) {
        g gVar;
        Object objB;
        ?? r10;
        av.x<T> xVarA;
        ?? r11;
        Object objA;
        u3.w.a<T> aVar2;
        if (bVar instanceof g) {
            gVar = (g) bVar;
            int i10 = gVar.f33030y;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                gVar.f33030y = i10 - Integer.MIN_VALUE;
            } else {
                gVar = new g(this, bVar);
            }
        } else {
            gVar = new g(this, bVar);
        }
        Object obj = gVar.f33028w;
        Object objE = fu.c.e();
        int i11 = gVar.f33030y;
        boolean z10 = true;
        try {
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        av.x<T> xVar = (av.x) gVar.f33027v;
                        k kVar = (k) gVar.f33026u;
                        u3.w.a<T> aVar3 = (u3.w.a) gVar.f33025t;
                        zt.o.b(obj);
                        xVarA = xVar;
                        r11 = kVar;
                        aVar2 = aVar3;
                    } else if (i11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
                u3.w.a<T> aVar4 = (u3.w.a<T>) ((av.x) gVar.f33025t);
                zt.o.b(obj);
                aVar = aVar4;
                objB = zt.n.b(obj);
                r10 = aVar;
                av.z.d(r10, objB);
                return Unit.f21506a;
            }
            zt.o.b(obj);
            xVarA = aVar.a();
            try {
                zt.n.Companion companion = zt.n.INSTANCE;
                d0<T> d0VarA = this.inMemoryCache.a();
                if (d0VarA instanceof u3.f) {
                    Function2<T, eu.b<? super T>, Object> function2D = aVar.d();
                    CoroutineContext callerContext = aVar.getCallerContext();
                    gVar.f33025t = xVarA;
                    gVar.f33030y = 1;
                    objA = A(function2D, callerContext, gVar);
                    if (objA == objE) {
                    }
                    av.x<T> xVar2 = xVarA;
                    obj = objA;
                    aVar = (u3.w.a<T>) xVar2;
                    objB = zt.n.b(obj);
                    r10 = aVar;
                    av.z.d(r10, objB);
                    return Unit.f21506a;
                }
                if (!(d0VarA instanceof u3.x)) {
                    z10 = d0VarA instanceof h0;
                }
                if (!z10) {
                    if (d0VarA instanceof u3.r) {
                        throw ((u3.r) d0VarA).getFinalException();
                    }
                    throw new zt.l();
                }
                if (d0VarA != aVar.c()) {
                    Intrinsics.d(d0VarA, "null cannot be cast to non-null type androidx.datastore.core.ReadException<T of androidx.datastore.core.DataStoreImpl.handleUpdate$lambda$2>");
                    throw ((u3.x) d0VarA).getReadException();
                }
                gVar.f33025t = aVar;
                gVar.f33026u = this;
                gVar.f33027v = xVarA;
                gVar.f33030y = 2;
                if (v(gVar) != objE) {
                    r11 = this;
                    aVar2 = aVar;
                }
                return objE;
            } catch (Throwable th2) {
                th = th2;
                aVar = xVarA;
                zt.n.Companion companion2 = zt.n.INSTANCE;
                objB = zt.n.b(zt.o.a(th));
                r10 = aVar;
            }
            Function2<T, eu.b<? super T>, Object> function2D2 = aVar2.d();
            CoroutineContext callerContext2 = aVar2.getCallerContext();
            gVar.f33025t = xVarA;
            gVar.f33026u = null;
            gVar.f33027v = null;
            gVar.f33030y = 3;
            objA = r11.A(function2D2, callerContext2, gVar);
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object u(eu.b<? super Unit> bVar) {
        h hVar;
        k<T> kVar;
        kv.a aVar;
        if (bVar instanceof h) {
            hVar = (h) bVar;
            int i10 = hVar.f33035x;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                hVar.f33035x = i10 - Integer.MIN_VALUE;
            } else {
                hVar = new h(this, bVar);
            }
        } else {
            hVar = new h(this, bVar);
        }
        Object obj = hVar.f33033v;
        Object objE = fu.c.e();
        int i11 = hVar.f33035x;
        if (i11 == 0) {
            zt.o.b(obj);
            kv.a aVar2 = this.collectorMutex;
            hVar.f33031t = this;
            hVar.f33032u = aVar2;
            hVar.f33035x = 1;
            if (aVar2.d(null, hVar) == objE) {
                return objE;
            }
            kVar = this;
            aVar = aVar2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = (kv.a) hVar.f33032u;
            kVar = (k) hVar.f33031t;
            zt.o.b(obj);
        }
        try {
            int i12 = kVar.collectorCounter + 1;
            kVar.collectorCounter = i12;
            if (i12 == 1) {
                kVar.collectorJob = av.k.d(kVar.scope, null, null, new i(kVar, null), 3, null);
            }
            Unit unit = Unit.f21506a;
            return Unit.f21506a;
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
    */
    public final Object v(eu.b<? super Unit> bVar) throws Throwable {
        j jVar;
        k<T> kVar;
        int iIntValue;
        int i10;
        Throwable th2;
        k<T> kVar2;
        if (bVar instanceof j) {
            jVar = (j) bVar;
            int i11 = jVar.f33043x;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                jVar.f33043x = i11 - Integer.MIN_VALUE;
            } else {
                jVar = new j(this, bVar);
            }
        } else {
            jVar = new j(this, bVar);
        }
        Object objA = jVar.f33041v;
        Object objE = fu.c.e();
        int i12 = jVar.f33043x;
        try {
            if (i12 == 0) {
                zt.o.b(objA);
                u3.t tVarR = r();
                jVar.f33039t = this;
                jVar.f33043x = 1;
                objA = tVarR.a(jVar);
                if (objA != objE) {
                    kVar = this;
                }
                return objE;
            }
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i10 = jVar.f33040u;
                kVar2 = (k) jVar.f33039t;
                try {
                    zt.o.b(objA);
                    return Unit.f21506a;
                } catch (Throwable th3) {
                    th2 = th3;
                    kVar2.inMemoryCache.c(new u3.x(th2, i10));
                    throw th2;
                }
            }
            kVar = (k) jVar.f33039t;
            zt.o.b(objA);
            k<T>.b bVar2 = kVar.readAndInit;
            jVar.f33039t = kVar;
            jVar.f33040u = iIntValue;
            jVar.f33043x = 2;
        } catch (Throwable th4) {
            i10 = iIntValue;
            th2 = th4;
            kVar2 = kVar;
            kVar2.inMemoryCache.c(new u3.x(th2, i10));
            throw th2;
        }
        iIntValue = ((Number) objA).intValue();
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
    */
    public final Object w(boolean z10, eu.b<? super d0<T>> bVar) {
        C0667k c0667k;
        d0<T> d0Var;
        Object obj;
        boolean z11;
        k<T> kVar;
        Pair pair;
        d0<T> d0Var2;
        if (bVar instanceof C0667k) {
            c0667k = (C0667k) bVar;
            int i10 = c0667k.f33049y;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c0667k.f33049y = i10 - Integer.MIN_VALUE;
            } else {
                c0667k = new C0667k(this, bVar);
            }
        } else {
            c0667k = new C0667k(this, bVar);
        }
        Object objC = c0667k.f33047w;
        Object objE = fu.c.e();
        int i11 = c0667k.f33049y;
        if (i11 == 0) {
            zt.o.b(objC);
            d0<T> d0VarA = this.inMemoryCache.a();
            if (d0VarA instanceof h0) {
                throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
            }
            u3.t tVarR = r();
            c0667k.f33044t = this;
            c0667k.f33045u = d0VarA;
            c0667k.f33046v = z10;
            c0667k.f33049y = 1;
            Object objA = tVarR.a(c0667k);
            if (objA != objE) {
                d0Var = d0VarA;
                obj = objA;
                z11 = z10;
                kVar = this;
            }
            return objE;
        }
        if (i11 != 1) {
            if (i11 == 2) {
                kVar = (k) c0667k.f33044t;
                zt.o.b(objC);
                pair = (Pair) objC;
                d0Var2 = (d0) pair.a();
                if (((Boolean) pair.b()).booleanValue()) {
                    kVar.inMemoryCache.c(d0Var2);
                }
                return d0Var2;
            }
            if (i11 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kVar = (k) c0667k.f33044t;
            zt.o.b(objC);
            pair = (Pair) objC;
            d0Var2 = (d0) pair.a();
            if (((Boolean) pair.b()).booleanValue()) {
                kVar.inMemoryCache.c(d0Var2);
            }
            return d0Var2;
        }
        boolean z12 = c0667k.f33046v;
        d0<T> d0Var3 = (d0) c0667k.f33045u;
        k<T> kVar2 = (k) c0667k.f33044t;
        zt.o.b(objC);
        z11 = z12;
        kVar = kVar2;
        d0Var = d0Var3;
        obj = objC;
        int iIntValue = ((Number) obj).intValue();
        boolean z13 = d0Var instanceof u3.f;
        int version = z13 ? d0Var.getVersion() : -1;
        if (z13 && iIntValue == version) {
            return d0Var;
        }
        if (z11) {
            u3.t tVarR2 = kVar.r();
            l lVar = new l(kVar, null);
            c0667k.f33044t = kVar;
            c0667k.f33045u = null;
            c0667k.f33049y = 2;
            objC = tVarR2.e(lVar, c0667k);
        } else {
            u3.t tVarR3 = kVar.r();
            m mVar = new m(kVar, version, null);
            c0667k.f33044t = kVar;
            c0667k.f33045u = null;
            c0667k.f33049y = 3;
            objC = tVarR3.c(mVar, c0667k);
        }
        return objE;
    }

    public final Object x(eu.b<? super T> bVar) {
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
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object, u3.k] */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r6v10, types: [u3.k] */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, u3.k] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, u3.k] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v2, types: [u3.k] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, u3.k, u3.k<T>] */
    public final Object y(boolean z10, eu.b<? super u3.f<T>> bVar) throws u3.d, IllegalAccessException, InvocationTargetException {
        n nVar;
        ?? r10;
        p001kotlin.jvm.internal.c0 c0Var;
        Object objA;
        u3.d dVar;
        p001kotlin.jvm.internal.c0 c0Var2;
        ?? r11;
        p001kotlin.jvm.internal.a0 a0Var;
        u3.d dVar2;
        p pVar;
        p001kotlin.jvm.internal.a0 a0Var2;
        p001kotlin.jvm.internal.c0 c0Var3;
        ?? r12;
        ?? r13;
        int iHashCode;
        Object objA2;
        boolean z11;
        int i10;
        Object obj;
        ?? r14;
        ?? r15;
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
        Object obj2 = (T) nVar.f33064z;
        Object objE = fu.c.e();
        ?? r16 = nVar.B;
        try {
            switch (r16) {
                case 0:
                    zt.o.b(obj2);
                    try {
                        if (z10) {
                            nVar.f33058t = this;
                            nVar.f33062x = z10;
                            nVar.B = 1;
                            obj2 = (T) x(nVar);
                            if (obj2 != objE) {
                                r13 = this;
                                if (obj2 != null) {
                                    try {
                                        iHashCode = obj2.hashCode();
                                    } catch (u3.d e10) {
                                        e = e10;
                                        r14 = r13;
                                        r10 = r14;
                                        c0Var = new p001kotlin.jvm.internal.c0();
                                        u3.e<T> eVar = r10.corruptionHandler;
                                        nVar.f33058t = r10;
                                        nVar.f33059u = e;
                                        nVar.f33060v = c0Var;
                                        nVar.f33061w = c0Var;
                                        nVar.f33062x = z10;
                                        nVar.B = 5;
                                        objA = eVar.a(e, nVar);
                                        if (objA != objE) {
                                            dVar = e;
                                            obj2 = (T) objA;
                                            c0Var2 = c0Var;
                                            r11 = r10;
                                            c0Var2.f21575a = (T) obj2;
                                            a0Var = new p001kotlin.jvm.internal.a0();
                                            try {
                                                pVar = new p(c0Var, r11, a0Var, null);
                                                nVar.f33058t = dVar;
                                                nVar.f33059u = c0Var;
                                                nVar.f33060v = a0Var;
                                                nVar.f33061w = null;
                                                nVar.B = 6;
                                                if (r11.q(z10, pVar, nVar) != objE) {
                                                    a0Var2 = a0Var;
                                                    c0Var3 = c0Var;
                                                    T t8 = c0Var3.f21575a;
                                                    return new u3.f(t8, t8 != null ? t8.hashCode() : 0, a0Var2.f21572a);
                                                }
                                            } catch (Throwable th2) {
                                                th = th2;
                                                dVar2 = dVar;
                                                zt.a.a(dVar2, th);
                                                throw dVar2;
                                            }
                                        }
                                    }
                                } else {
                                    iHashCode = 0;
                                }
                                u3.t tVarR = r13.r();
                                nVar.f33058t = r13;
                                nVar.f33059u = obj2;
                                nVar.f33062x = z10;
                                nVar.f33063y = iHashCode;
                                nVar.B = 2;
                                objA2 = tVarR.a(nVar);
                                if (objA2 != objE) {
                                    int i12 = iHashCode;
                                    z11 = z10;
                                    i10 = i12;
                                    obj = obj2;
                                    obj2 = (T) objA2;
                                    r15 = r13;
                                    return new u3.f(obj, i10, ((Number) obj2).intValue());
                                }
                            }
                        } else {
                            u3.t tVarR2 = r();
                            nVar.f33058t = this;
                            nVar.f33062x = z10;
                            nVar.B = 3;
                            obj2 = (T) tVarR2.a(nVar);
                            if (obj2 != objE) {
                                r12 = this;
                                int iIntValue = ((Number) obj2).intValue();
                                u3.t tVarR3 = r12.r();
                                o oVar = new o(r12, iIntValue, null);
                                nVar.f33058t = r12;
                                nVar.f33062x = z10;
                                nVar.B = 4;
                                obj2 = (T) tVarR3.c(oVar, nVar);
                                if (obj2 == objE) {
                                }
                                return (u3.f) obj2;
                            }
                        }
                    } catch (u3.d e11) {
                        e = e11;
                        r10 = this;
                        c0Var = new p001kotlin.jvm.internal.c0();
                        u3.e<T> eVar2 = r10.corruptionHandler;
                        nVar.f33058t = r10;
                        nVar.f33059u = e;
                        nVar.f33060v = c0Var;
                        nVar.f33061w = c0Var;
                        nVar.f33062x = z10;
                        nVar.B = 5;
                        objA = eVar2.a(e, nVar);
                        if (objA != objE) {
                            dVar = e;
                            obj2 = (T) objA;
                            c0Var2 = c0Var;
                            r11 = r10;
                            c0Var2.f21575a = (T) obj2;
                            a0Var = new p001kotlin.jvm.internal.a0();
                            pVar = new p(c0Var, r11, a0Var, null);
                            nVar.f33058t = dVar;
                            nVar.f33059u = c0Var;
                            nVar.f33060v = a0Var;
                            nVar.f33061w = null;
                            nVar.B = 6;
                            if (r11.q(z10, pVar, nVar) != objE) {
                                a0Var2 = a0Var;
                                c0Var3 = c0Var;
                                T t10 = c0Var3.f21575a;
                                return new u3.f(t10, t10 != null ? t10.hashCode() : 0, a0Var2.f21572a);
                            }
                        }
                    }
                    return objE;
                case 1:
                    z10 = nVar.f33062x;
                    k kVar = (k) nVar.f33058t;
                    zt.o.b(obj2);
                    r13 = kVar;
                    if (obj2 != null) {
                        iHashCode = obj2.hashCode();
                    } else {
                        iHashCode = 0;
                    }
                    u3.t tVarR4 = r13.r();
                    nVar.f33058t = r13;
                    nVar.f33059u = obj2;
                    nVar.f33062x = z10;
                    nVar.f33063y = iHashCode;
                    nVar.B = 2;
                    objA2 = tVarR4.a(nVar);
                    if (objA2 != objE) {
                        int i13 = iHashCode;
                        z11 = z10;
                        i10 = i13;
                        obj = obj2;
                        obj2 = (T) objA2;
                        r15 = r13;
                        return new u3.f(obj, i10, ((Number) obj2).intValue());
                    }
                    return objE;
                case 2:
                    i10 = nVar.f33063y;
                    z11 = nVar.f33062x;
                    obj = nVar.f33059u;
                    r15 = (k) nVar.f33058t;
                    try {
                        zt.o.b(obj2);
                        r15 = r15;
                        return new u3.f(obj, i10, ((Number) obj2).intValue());
                    } catch (u3.d e12) {
                        e = e12;
                        z10 = z11;
                        r14 = r15;
                        r10 = r14;
                        c0Var = new p001kotlin.jvm.internal.c0();
                        u3.e<T> eVar3 = r10.corruptionHandler;
                        nVar.f33058t = r10;
                        nVar.f33059u = e;
                        nVar.f33060v = c0Var;
                        nVar.f33061w = c0Var;
                        nVar.f33062x = z10;
                        nVar.B = 5;
                        objA = eVar3.a(e, nVar);
                        if (objA != objE) {
                            dVar = e;
                            obj2 = (T) objA;
                            c0Var2 = c0Var;
                            r11 = r10;
                            c0Var2.f21575a = (T) obj2;
                            a0Var = new p001kotlin.jvm.internal.a0();
                            pVar = new p(c0Var, r11, a0Var, null);
                            nVar.f33058t = dVar;
                            nVar.f33059u = c0Var;
                            nVar.f33060v = a0Var;
                            nVar.f33061w = null;
                            nVar.B = 6;
                            if (r11.q(z10, pVar, nVar) != objE) {
                                a0Var2 = a0Var;
                                c0Var3 = c0Var;
                                T t11 = c0Var3.f21575a;
                                return new u3.f(t11, t11 != null ? t11.hashCode() : 0, a0Var2.f21572a);
                            }
                        }
                        return objE;
                    }
                case 3:
                    z10 = nVar.f33062x;
                    k kVar2 = (k) nVar.f33058t;
                    zt.o.b(obj2);
                    r12 = kVar2;
                    int iIntValue2 = ((Number) obj2).intValue();
                    u3.t tVarR5 = r12.r();
                    o oVar2 = new o(r12, iIntValue2, null);
                    nVar.f33058t = r12;
                    nVar.f33062x = z10;
                    nVar.B = 4;
                    obj2 = (T) tVarR5.c(oVar2, nVar);
                    if (obj2 == objE) {
                        return objE;
                    }
                    return (u3.f) obj2;
                case 4:
                    boolean z12 = nVar.f33062x;
                    zt.o.b(obj2);
                    return (u3.f) obj2;
                case 5:
                    z10 = nVar.f33062x;
                    p001kotlin.jvm.internal.c0 c0Var4 = (p001kotlin.jvm.internal.c0) nVar.f33061w;
                    p001kotlin.jvm.internal.c0 c0Var5 = (p001kotlin.jvm.internal.c0) nVar.f33060v;
                    dVar = (u3.d) nVar.f33059u;
                    k kVar3 = (k) nVar.f33058t;
                    zt.o.b(obj2);
                    c0Var2 = c0Var4;
                    c0Var = c0Var5;
                    r11 = kVar3;
                    c0Var2.f21575a = (T) obj2;
                    a0Var = new p001kotlin.jvm.internal.a0();
                    pVar = new p(c0Var, r11, a0Var, null);
                    nVar.f33058t = dVar;
                    nVar.f33059u = c0Var;
                    nVar.f33060v = a0Var;
                    nVar.f33061w = null;
                    nVar.B = 6;
                    if (r11.q(z10, pVar, nVar) != objE) {
                        a0Var2 = a0Var;
                        c0Var3 = c0Var;
                        T t12 = c0Var3.f21575a;
                        return new u3.f(t12, t12 != null ? t12.hashCode() : 0, a0Var2.f21572a);
                    }
                    return objE;
                case 6:
                    a0Var2 = (p001kotlin.jvm.internal.a0) nVar.f33060v;
                    c0Var3 = (p001kotlin.jvm.internal.c0) nVar.f33059u;
                    dVar2 = (u3.d) nVar.f33058t;
                    try {
                        zt.o.b(obj2);
                        T t13 = c0Var3.f21575a;
                        return new u3.f(t13, t13 != null ? t13.hashCode() : 0, a0Var2.f21572a);
                    } catch (Throwable th3) {
                        th = th3;
                        zt.a.a(dVar2, th);
                        throw dVar2;
                    }
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } catch (u3.d e13) {
            e = e13;
            r10 = r16;
        }
    }

    public final Object z(boolean z10, eu.b<? super d0<T>> bVar) {
        return av.i.g(this.scope.getCoroutineContext(), new q(this, z10, null), bVar);
    }
}
