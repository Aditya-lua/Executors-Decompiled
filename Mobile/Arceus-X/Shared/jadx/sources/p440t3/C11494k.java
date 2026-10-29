package p440t3;

import androidx.core.app.NotificationCompat;
import androidx.core.view.inputmethod.EditorInfoCompat;
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
import kotlin.jvm.internal.AbstractC7746m;
import kotlin.jvm.internal.C7725a0;
import kotlin.jvm.internal.C7729c0;
import kotlin.jvm.internal.C7758y;
import kotlin.jvm.internal.Intrinsics;
import nu.C9579j;
import nu.InterfaceC9575h;
import nu.InterfaceC9577i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7328a;
import p229jt.C7342i;
import p229jt.C7345l;
import p229jt.C7347n;
import p229jt.C7348o;
import p229jt.C7352s;
import p229jt.InterfaceC7341h;
import p256ku.C7872i;
import p256ku.C7882k;
import p256ku.C7945z;
import p256ku.InterfaceC7850d2;
import p256ku.InterfaceC7906p0;
import p256ku.InterfaceC7937x;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p478uu.C11976g;
import p478uu.InterfaceC11970a;
import p615zt.InterfaceC14057n;
import pt.AbstractC10342d;
import pt.AbstractC10351m;
import pt.C10340b;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: t3.k */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 f*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0002\u00136Ba\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u00120\b\u0002\u0010\u000b\u001a*\u0012&\u0012$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00060\u0005\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J4\u0010\u0013\u001a\u00028\u00002\"\u0010\u0012\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0006H\u0096@¢\u0006\u0004\b\u0013\u0010\u0014J \u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00020\u0016H\u0080@¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\tH\u0082@¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\tH\u0082@¢\u0006\u0004\b\u001d\u0010\u001cJ\u001e\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001f2\u0006\u0010\u001e\u001a\u00020\u0016H\u0082@¢\u0006\u0004\b \u0010!J\u001e\u0010$\u001a\u00020\t2\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\"H\u0082@¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\tH\u0082@¢\u0006\u0004\b&\u0010\u001cJ\u001e\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000\u001f2\u0006\u0010\u001e\u001a\u00020\u0016H\u0082@¢\u0006\u0004\b'\u0010!J\u0010\u0010(\u001a\u00028\u0000H\u0082@¢\u0006\u0004\b(\u0010\u001cJ<\u0010+\u001a\u00028\u00002\"\u0010\u0012\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00062\u0006\u0010*\u001a\u00020)H\u0082@¢\u0006\u0004\b+\u0010,J\u001e\u0010/\u001a\b\u0012\u0004\u0012\u00028\u00000.2\u0006\u0010-\u001a\u00020\u0016H\u0082@¢\u0006\u0004\b/\u0010!JI\u00103\u001a\u00028\u0001\"\u0004\b\u0001\u001002\u0006\u0010-\u001a\u00020\u00162\u001c\u00102\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\n01H\u0082@\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b3\u00104R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u00105R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R \u0010?\u001a\b\u0012\u0004\u0012\u00028\u00000:8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u0014\u0010C\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0016\u0010F\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0018\u0010J\u001a\u0004\u0018\u00010G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u001a\u0010N\u001a\b\u0012\u0004\u0012\u00028\u00000K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u001e\u0010R\u001a\f0OR\b\u0012\u0004\u0012\u00028\u00000\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR \u0010W\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000T0S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u001b\u0010\\\u001a\u00020X8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bY\u0010V\u001a\u0004\bZ\u0010[R \u0010`\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\"0]8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R!\u0010e\u001a\b\u0012\u0004\u0012\u00028\u00000T8@X\u0080\u0084\u0002¢\u0006\f\u001a\u0004\ba\u0010b*\u0004\bc\u0010d¨\u0006g"}, m31665d2 = {"Lt3/k;", "T", "Lt3/i;", "Lt3/e0;", "storage", "", "Lkotlin/Function2;", "Lt3/s;", "Lnt/b;", "", "", "initTasksList", "Lt3/e;", "corruptionHandler", "Lku/p0;", "scope", "<init>", "(Lt3/e0;Ljava/util/List;Lt3/e;Lku/p0;)V", "transform", "a", "(Lkotlin/jvm/functions/Function2;Lnt/b;)Ljava/lang/Object;", "newData", "", "updateCache", "", "B", "(Ljava/lang/Object;ZLnt/b;)Ljava/lang/Object;", "u", "(Lnt/b;)Ljava/lang/Object;", "p", "requireLock", "Lt3/d0;", "z", "(ZLnt/b;)Ljava/lang/Object;", "Lt3/w$a;", "update", "t", "(Lt3/w$a;Lnt/b;)Ljava/lang/Object;", "v", "w", "x", "Lkotlin/coroutines/CoroutineContext;", "callerContext", "A", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/CoroutineContext;Lnt/b;)Ljava/lang/Object;", "hasWriteFileLock", "Lt3/f;", "y", "R", "Lkotlin/Function1;", "block", "q", "(ZLkotlin/jvm/functions/Function1;Lnt/b;)Ljava/lang/Object;", "Lt3/e0;", "b", "Lt3/e;", "c", "Lku/p0;", "Lnu/h;", "d", "Lnu/h;", "getData", "()Lnu/h;", "data", "Luu/a;", "e", "Luu/a;", "collectorMutex", "f", "I", "collectorCounter", "Lku/d2;", "g", "Lku/d2;", "collectorJob", "Lt3/l;", "h", "Lt3/l;", "inMemoryCache", "Lt3/k$b;", "i", "Lt3/k$b;", "readAndInit", "Ljt/h;", "Lt3/f0;", "j", "Ljt/h;", "storageConnectionDelegate", "Lt3/t;", "k", "r", "()Lt3/t;", "coordinator", "Lt3/b0;", "l", "Lt3/b0;", "writeActor", "s", "()Lt3/f0;", "getStorageConnection$datastore_core_release$delegate", "(Lt3/k;)Ljava/lang/Object;", "storageConnection", "m", "datastore-core_release"}, m31666k = 1, m31667mv = {1, 8, 0}, m31669xi = 48)
public final class C11494k<T> implements InterfaceC11490i<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC11483e0<T> storage;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC11482e<T> corruptionHandler;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC7906p0 scope;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC9575h<T> data;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC11970a collectorMutex;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public int collectorCounter;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public InterfaceC7850d2 collectorJob;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final C11496l<T> inMemoryCache;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final C11494k<T>.b readAndInit;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC7341h<InterfaceC11485f0<T>> storageConnectionDelegate;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC7341h coordinator;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    public final C11477b0<AbstractC11507w.a<T>> writeActor;

    /* JADX INFO: renamed from: t3.k$b */
    @Metadata(m31664d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0082\u0004\u0018\u00002\u00020\u0001B7\u0012.\u0010\b\u001a*\u0012&\u0012$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00030\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0006H\u0094@¢\u0006\u0004\b\u000b\u0010\fR@\u0010\u000f\u001a,\u0012&\u0012$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m31665d2 = {"Lt3/k$b;", "Lt3/z;", "", "Lkotlin/Function2;", "Lt3/s;", "Lnt/b;", "", "", "initTasksList", "<init>", "(Lt3/k;Ljava/util/List;)V", "b", "(Lnt/b;)Ljava/lang/Object;", "c", "Ljava/util/List;", "initTasks", "datastore-core_release"}, m31666k = 1, m31667mv = {1, 8, 0}, m31669xi = 48)
    public final class b extends AbstractC11510z {

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @Nullable
        public List<? extends Function2<? super InterfaceC11503s<T>, ? super InterfaceC9557b<? super Unit>, ? extends Object>> initTasks;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ C11494k<T> f40596d;

        /* JADX INFO: renamed from: t3.k$b$a */
        @InterfaceC10344f(m39663c = "androidx.datastore.core.DataStoreImpl$InitDataStore", m39664f = "DataStoreImpl.kt", m39665l = {430, 434}, m39666m = "doRun")
        @Metadata(m31666k = 3, m31667mv = {1, 8, 0}, m31669xi = 48)
        public static final class a extends AbstractC10342d {

            /* JADX INFO: renamed from: t */
            public Object f40597t;

            /* JADX INFO: renamed from: u */
            public /* synthetic */ Object f40598u;

            /* JADX INFO: renamed from: v */
            public final /* synthetic */ C11494k<T>.b f40599v;

            /* JADX INFO: renamed from: w */
            public int f40600w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C11494k<T>.b bVar, InterfaceC9557b<? super a> interfaceC9557b) {
                super(interfaceC9557b);
                this.f40599v = bVar;
            }

            @Override // pt.AbstractC10339a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f40598u = obj;
                this.f40600w |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                return this.f40599v.mo43025b(this);
            }
        }

        /* JADX INFO: renamed from: t3.k$b$b, reason: collision with other inner class name */
        @Metadata(m31664d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"T", "Lt3/f;", "<anonymous>", "()Lt3/f;"}, m31666k = 3, m31667mv = {1, 8, 0})
        @InterfaceC10344f(m39663c = "androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$initData$1", m39664f = "DataStoreImpl.kt", m39665l = {437, 458, 546, 468}, m39666m = "invokeSuspend")
        public static final class C14253b extends AbstractC10351m implements Function1<InterfaceC9557b<? super C11484f<T>>, Object> {

            /* JADX INFO: renamed from: A */
            public final /* synthetic */ C11494k<T> f40601A;

            /* JADX INFO: renamed from: B */
            public final /* synthetic */ C11494k<T>.b f40602B;

            /* JADX INFO: renamed from: t */
            public Object f40603t;

            /* JADX INFO: renamed from: u */
            public Object f40604u;

            /* JADX INFO: renamed from: v */
            public Object f40605v;

            /* JADX INFO: renamed from: w */
            public Object f40606w;

            /* JADX INFO: renamed from: x */
            public Object f40607x;

            /* JADX INFO: renamed from: y */
            public int f40608y;

            /* JADX INFO: renamed from: z */
            public int f40609z;

            /* JADX INFO: renamed from: t3.k$b$b$a */
            @Metadata(m31664d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J4\u0010\u0006\u001a\u00028\u00002\"\u0010\u0005\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002H\u0096@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m31665d2 = {"t3/k$b$b$a", "Lt3/s;", "Lkotlin/Function2;", "Lnt/b;", "", "transform", "a", "(Lkotlin/jvm/functions/Function2;Lnt/b;)Ljava/lang/Object;", "datastore-core_release"}, m31666k = 1, m31667mv = {1, 8, 0}, m31669xi = 48)
            public static final class a implements InterfaceC11503s<T> {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ InterfaceC11970a f40610a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ C7758y f40611b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ C7729c0<T> f40612c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ C11494k<T> f40613d;

                /* JADX INFO: renamed from: t3.k$b$b$a$a, reason: collision with other inner class name */
                @InterfaceC10344f(m39663c = "androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$initData$1$api$1", m39664f = "DataStoreImpl.kt", m39665l = {544, 447, 449}, m39666m = "updateData")
                @Metadata(m31666k = 3, m31667mv = {1, 8, 0}, m31669xi = 48)
                public static final class C14254a extends AbstractC10342d {

                    /* JADX INFO: renamed from: A */
                    public int f40614A;

                    /* JADX INFO: renamed from: t */
                    public Object f40615t;

                    /* JADX INFO: renamed from: u */
                    public Object f40616u;

                    /* JADX INFO: renamed from: v */
                    public Object f40617v;

                    /* JADX INFO: renamed from: w */
                    public Object f40618w;

                    /* JADX INFO: renamed from: x */
                    public Object f40619x;

                    /* JADX INFO: renamed from: y */
                    public /* synthetic */ Object f40620y;

                    public C14254a(InterfaceC9557b interfaceC9557b) {
                        super(interfaceC9557b);
                    }

                    @Override // pt.AbstractC10339a
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.f40620y = obj;
                        this.f40614A |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                        return a.this.mo43027a(null, this);
                    }
                }

                public a(InterfaceC11970a interfaceC11970a, C7758y c7758y, C7729c0<T> c7729c0, C11494k<T> c11494k) {
                    this.f40610a = interfaceC11970a;
                    this.f40611b = c7758y;
                    this.f40612c = c7729c0;
                    this.f40613d = c11494k;
                }

                /* JADX WARN: Code duplicated, block: B:38:0x00ba A[Catch: all -> 0x0056, TRY_LEAVE, TryCatch #0 {all -> 0x0056, blocks: (B:21:0x0052, B:36:0x00b2, B:38:0x00ba), top: B:53:0x0052 }] */
                /* JADX WARN: Code duplicated, block: B:41:0x00ca  */
                /* JADX WARN: Code duplicated, block: B:43:0x00d1  */
                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // p440t3.InterfaceC11503s
                @Nullable
                /* JADX INFO: renamed from: a */
                public Object mo43027a(@NotNull Function2<? super T, ? super InterfaceC9557b<? super T>, ? extends Object> function2, @NotNull InterfaceC9557b<? super T> interfaceC9557b) throws Throwable {
                    C14254a c14254a;
                    InterfaceC11970a interfaceC11970a;
                    C11494k c11494k;
                    C7758y c7758y;
                    C7729c0<T> c7729c0;
                    InterfaceC11970a interfaceC11970a2;
                    InterfaceC11970a interfaceC11970a3;
                    C11494k c11494k2;
                    T t8;
                    C7729c0<T> c7729c1;
                    if (interfaceC9557b instanceof C14254a) {
                        c14254a = (C14254a) interfaceC9557b;
                        int i10 = c14254a.f40614A;
                        if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                            c14254a.f40614A = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                        } else {
                            c14254a = new C14254a(interfaceC9557b);
                        }
                    } else {
                        c14254a = new C14254a(interfaceC9557b);
                    }
                    Object obj = c14254a.f40620y;
                    Object objM38805e = C10047c.m38805e();
                    int i11 = c14254a.f40614A;
                    try {
                        if (i11 == 0) {
                            C7348o.m30470b(obj);
                            interfaceC11970a = this.f40610a;
                            C7758y c7758y2 = this.f40611b;
                            C7729c0<T> c7729c2 = this.f40612c;
                            c11494k = this.f40613d;
                            c14254a.f40615t = function2;
                            c14254a.f40616u = interfaceC11970a;
                            c14254a.f40617v = c7758y2;
                            c14254a.f40618w = c7729c2;
                            c14254a.f40619x = c11494k;
                            c14254a.f40614A = 1;
                            if (interfaceC11970a.mo44674f(null, c14254a) != objM38805e) {
                                c7758y = c7758y2;
                                c7729c0 = c7729c2;
                            }
                            return objM38805e;
                        }
                        if (i11 != 1) {
                            if (i11 != 2) {
                                if (i11 != 3) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                t8 = (T) c14254a.f40617v;
                                c7729c1 = (C7729c0) c14254a.f40616u;
                                interfaceC11970a2 = (InterfaceC11970a) c14254a.f40615t;
                                try {
                                    C7348o.m30470b(obj);
                                    c7729c1.f29425a = t8;
                                    c7729c0 = c7729c1;
                                    T t10 = c7729c0.f29425a;
                                    interfaceC11970a2.mo44673e(null);
                                    return t10;
                                } catch (Throwable th2) {
                                    th = th2;
                                    interfaceC11970a2.mo44673e(null);
                                    throw th;
                                }
                            }
                            C11494k c11494k3 = (C11494k) c14254a.f40617v;
                            c7729c0 = (C7729c0) c14254a.f40616u;
                            interfaceC11970a3 = (InterfaceC11970a) c14254a.f40615t;
                            try {
                                C7348o.m30470b(obj);
                                c11494k2 = c11494k3;
                                if (!Intrinsics.m31980c(obj, c7729c0.f29425a)) {
                                    c14254a.f40615t = interfaceC11970a3;
                                    c14254a.f40616u = c7729c0;
                                    c14254a.f40617v = obj;
                                    c14254a.f40614A = 3;
                                    if (c11494k2.m43011B(obj, false, c14254a) != objM38805e) {
                                        t8 = (T) obj;
                                        c7729c1 = c7729c0;
                                        interfaceC11970a2 = interfaceC11970a3;
                                        c7729c1.f29425a = t8;
                                        c7729c0 = c7729c1;
                                    }
                                    return objM38805e;
                                }
                                interfaceC11970a2 = interfaceC11970a3;
                                T t11 = c7729c0.f29425a;
                                interfaceC11970a2.mo44673e(null);
                                return t11;
                            } catch (Throwable th3) {
                                th = th3;
                                interfaceC11970a2 = interfaceC11970a3;
                                interfaceC11970a2.mo44673e(null);
                                throw th;
                            }
                        }
                        C11494k c11494k4 = (C11494k) c14254a.f40619x;
                        c7729c0 = (C7729c0) c14254a.f40618w;
                        c7758y = (C7758y) c14254a.f40617v;
                        InterfaceC11970a interfaceC11970a4 = (InterfaceC11970a) c14254a.f40616u;
                        Function2<? super T, ? super InterfaceC9557b<? super T>, ? extends Object> function3 = (Function2) c14254a.f40615t;
                        C7348o.m30470b(obj);
                        c11494k = c11494k4;
                        function2 = function3;
                        interfaceC11970a = interfaceC11970a4;
                        if (c7758y.f29445a) {
                            throw new IllegalStateException("InitializerApi.updateData should not be called after initialization is complete.");
                        }
                        T t12 = c7729c0.f29425a;
                        c14254a.f40615t = interfaceC11970a;
                        c14254a.f40616u = c7729c0;
                        c14254a.f40617v = c11494k;
                        c14254a.f40618w = null;
                        c14254a.f40619x = null;
                        c14254a.f40614A = 2;
                        Object objInvoke = function2.invoke(t12, c14254a);
                        if (objInvoke != objM38805e) {
                            interfaceC11970a3 = interfaceC11970a;
                            obj = objInvoke;
                            c11494k2 = c11494k;
                            if (!Intrinsics.m31980c(obj, c7729c0.f29425a)) {
                                c14254a.f40615t = interfaceC11970a3;
                                c14254a.f40616u = c7729c0;
                                c14254a.f40617v = obj;
                                c14254a.f40614A = 3;
                                if (c11494k2.m43011B(obj, false, c14254a) != objM38805e) {
                                    t8 = (T) obj;
                                    c7729c1 = c7729c0;
                                    interfaceC11970a2 = interfaceC11970a3;
                                    c7729c1.f29425a = t8;
                                    c7729c0 = c7729c1;
                                }
                            } else {
                                interfaceC11970a2 = interfaceC11970a3;
                            }
                            T t13 = c7729c0.f29425a;
                            interfaceC11970a2.mo44673e(null);
                            return t13;
                        }
                        return objM38805e;
                    } catch (Throwable th4) {
                        th = th4;
                        interfaceC11970a2 = interfaceC11970a;
                        interfaceC11970a2.mo44673e(null);
                        throw th;
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C14253b(C11494k<T> c11494k, C11494k<T>.b bVar, InterfaceC9557b<? super C14253b> interfaceC9557b) {
                super(1, interfaceC9557b);
                this.f40601A = c11494k;
                this.f40602B = bVar;
            }

            @Override // pt.AbstractC10339a
            @NotNull
            public final InterfaceC9557b<Unit> create(@NotNull InterfaceC9557b<?> interfaceC9557b) {
                return new C14253b(this.f40601A, this.f40602B, interfaceC9557b);
            }

            /* JADX WARN: Code duplicated, block: B:23:0x00b1  */
            /* JADX WARN: Code duplicated, block: B:31:0x00e8  */
            /* JADX WARN: Code duplicated, block: B:35:0x00f4  */
            /* JADX WARN: Code duplicated, block: B:39:0x010f  */
            /* JADX WARN: Code duplicated, block: B:48:0x010e A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:50:? A[LOOP:0: B:21:0x00ab->B:50:?, LOOP_END, SYNTHETIC] */
            @Override // pt.AbstractC10339a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) throws C11480d {
                InterfaceC11970a interfaceC11970aM44697b;
                C7758y c7758y;
                C7729c0 c7729c0;
                C7729c0 c7729c1;
                C7758y c7758y2;
                InterfaceC11970a interfaceC11970a;
                Iterator<T> it;
                InterfaceC11970a interfaceC11970a2;
                C7758y c7758y3;
                C7729c0 c7729c2;
                a aVar;
                C7729c0 c7729c3;
                Function2 function2;
                Object obj2;
                int iHashCode;
                int i10;
                Object objM38805e = C10047c.m38805e();
                int i11 = this.f40609z;
                if (i11 == 0) {
                    C7348o.m30470b(obj);
                    interfaceC11970aM44697b = C11976g.m44697b(false, 1, null);
                    c7758y = new C7758y();
                    c7729c0 = new C7729c0();
                    C11494k<T> c11494k = this.f40601A;
                    this.f40603t = interfaceC11970aM44697b;
                    this.f40604u = c7758y;
                    this.f40605v = c7729c0;
                    this.f40606w = c7729c0;
                    this.f40609z = 1;
                    obj = c11494k.m43021y(true, this);
                    if (obj != objM38805e) {
                        c7729c1 = c7729c0;
                    }
                    return objM38805e;
                }
                if (i11 == 1) {
                    c7729c0 = (C7729c0) this.f40606w;
                    c7729c1 = (C7729c0) this.f40605v;
                    c7758y = (C7758y) this.f40604u;
                    interfaceC11970aM44697b = (InterfaceC11970a) this.f40603t;
                    C7348o.m30470b(obj);
                } else {
                    if (i11 == 2) {
                        it = (Iterator) this.f40607x;
                        aVar = (a) this.f40606w;
                        c7729c2 = (C7729c0) this.f40605v;
                        c7758y3 = (C7758y) this.f40604u;
                        interfaceC11970a2 = (InterfaceC11970a) this.f40603t;
                        C7348o.m30470b(obj);
                        while (it.hasNext()) {
                            function2 = (Function2) it.next();
                            this.f40603t = interfaceC11970a2;
                            this.f40604u = c7758y3;
                            this.f40605v = c7729c2;
                            this.f40606w = aVar;
                            this.f40607x = it;
                            this.f40609z = 2;
                            if (function2.invoke(aVar, this) == objM38805e) {
                                return objM38805e;
                            }
                        }
                        c7729c1 = c7729c2;
                        c7758y2 = c7758y3;
                        interfaceC11970a = interfaceC11970a2;
                        this.f40602B.initTasks = null;
                        this.f40603t = c7758y2;
                        this.f40604u = c7729c1;
                        this.f40605v = interfaceC11970a;
                        this.f40606w = null;
                        this.f40607x = null;
                        this.f40609z = 3;
                        if (interfaceC11970a.mo44674f(null, this) != objM38805e) {
                            c7729c3 = c7729c1;
                            c7758y2.f29445a = true;
                            Unit unit = Unit.f29331a;
                            interfaceC11970a.mo44673e(null);
                            obj2 = c7729c3.f29425a;
                            if (obj2 != null) {
                            }
                            InterfaceC11504t interfaceC11504tM43014r = this.f40601A.m43014r();
                            this.f40603t = obj2;
                            this.f40604u = null;
                            this.f40605v = null;
                            this.f40608y = iHashCode;
                            this.f40609z = 4;
                            obj = interfaceC11504tM43014r.mo42968c(this);
                            if (obj != objM38805e) {
                                i10 = iHashCode;
                            }
                        }
                        return objM38805e;
                    }
                    if (i11 == 3) {
                        interfaceC11970a = (InterfaceC11970a) this.f40605v;
                        c7729c3 = (C7729c0) this.f40604u;
                        c7758y2 = (C7758y) this.f40603t;
                        C7348o.m30470b(obj);
                        try {
                            c7758y2.f29445a = true;
                            Unit unit2 = Unit.f29331a;
                            interfaceC11970a.mo44673e(null);
                            obj2 = c7729c3.f29425a;
                            iHashCode = obj2 != null ? obj2.hashCode() : 0;
                            InterfaceC11504t interfaceC11504tM43014r2 = this.f40601A.m43014r();
                            this.f40603t = obj2;
                            this.f40604u = null;
                            this.f40605v = null;
                            this.f40608y = iHashCode;
                            this.f40609z = 4;
                            obj = interfaceC11504tM43014r2.mo42968c(this);
                            if (obj != objM38805e) {
                                i10 = iHashCode;
                            }
                            return objM38805e;
                        } catch (Throwable th2) {
                            interfaceC11970a.mo44673e(null);
                            throw th2;
                        }
                    }
                    if (i11 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i10 = this.f40608y;
                    obj2 = this.f40603t;
                    C7348o.m30470b(obj);
                }
                return new C11484f(obj2, i10, ((Number) obj).intValue());
                c7729c0.f29425a = (T) ((C11484f) obj).m42976c();
                a aVar2 = new a(interfaceC11970aM44697b, c7758y, c7729c1, this.f40601A);
                List list = this.f40602B.initTasks;
                if (list != null) {
                    it = list.iterator();
                    interfaceC11970a2 = interfaceC11970aM44697b;
                    c7758y3 = c7758y;
                    c7729c2 = c7729c1;
                    aVar = aVar2;
                    while (it.hasNext()) {
                        function2 = (Function2) it.next();
                        this.f40603t = interfaceC11970a2;
                        this.f40604u = c7758y3;
                        this.f40605v = c7729c2;
                        this.f40606w = aVar;
                        this.f40607x = it;
                        this.f40609z = 2;
                        if (function2.invoke(aVar, this) == objM38805e) {
                            return objM38805e;
                        }
                    }
                    c7729c1 = c7729c2;
                    c7758y2 = c7758y3;
                    interfaceC11970a = interfaceC11970a2;
                } else {
                    c7758y2 = c7758y;
                    interfaceC11970a = interfaceC11970aM44697b;
                }
                this.f40602B.initTasks = null;
                this.f40603t = c7758y2;
                this.f40604u = c7729c1;
                this.f40605v = interfaceC11970a;
                this.f40606w = null;
                this.f40607x = null;
                this.f40609z = 3;
                if (interfaceC11970a.mo44674f(null, this) != objM38805e) {
                    c7729c3 = c7729c1;
                    c7758y2.f29445a = true;
                    Unit unit3 = Unit.f29331a;
                    interfaceC11970a.mo44673e(null);
                    obj2 = c7729c3.f29425a;
                    if (obj2 != null) {
                    }
                    InterfaceC11504t interfaceC11504tM43014r3 = this.f40601A.m43014r();
                    this.f40603t = obj2;
                    this.f40604u = null;
                    this.f40605v = null;
                    this.f40608y = iHashCode;
                    this.f40609z = 4;
                    obj = interfaceC11504tM43014r3.mo42968c(this);
                    if (obj != objM38805e) {
                        i10 = iHashCode;
                        return new C11484f(obj2, i10, ((Number) obj).intValue());
                    }
                }
                return objM38805e;
            }

            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function1
            @Nullable
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@Nullable InterfaceC9557b<? super C11484f<T>> interfaceC9557b) {
                return ((C14253b) create(interfaceC9557b)).invokeSuspend(Unit.f29331a);
            }
        }

        public b(@NotNull C11494k c11494k, List<? extends Function2<? super InterfaceC11503s<T>, ? super InterfaceC9557b<? super Unit>, ? extends Object>> initTasksList) {
            Intrinsics.checkNotNullParameter(initTasksList, "initTasksList");
            this.f40596d = c11494k;
            this.initTasks = CollectionsKt.m31687M0(initTasksList);
        }

        /* JADX WARN: Code duplicated, block: B:26:0x006e  */
        /* JADX WARN: Code duplicated, block: B:29:0x007c  */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // p440t3.AbstractC11510z
        @Nullable
        /* JADX INFO: renamed from: b */
        public Object mo43025b(@NotNull InterfaceC9557b<? super Unit> interfaceC9557b) throws C11480d {
            a aVar;
            b bVar;
            C11484f c11484f;
            if (interfaceC9557b instanceof a) {
                aVar = (a) interfaceC9557b;
                int i10 = aVar.f40600w;
                if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                    aVar.f40600w = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                } else {
                    aVar = new a(this, interfaceC9557b);
                }
            } else {
                aVar = new a(this, interfaceC9557b);
            }
            Object objM43021y = aVar.f40598u;
            Object objM38805e = C10047c.m38805e();
            int i11 = aVar.f40600w;
            if (i11 == 0) {
                C7348o.m30470b(objM43021y);
                List<? extends Function2<? super InterfaceC11503s<T>, ? super InterfaceC9557b<? super Unit>, ? extends Object>> list = this.initTasks;
                if (list != null) {
                    Intrinsics.checkNotNull(list);
                    if (list.isEmpty()) {
                        C11494k<T> c11494k = this.f40596d;
                        aVar.f40597t = this;
                        aVar.f40600w = 1;
                        objM43021y = c11494k.m43021y(false, aVar);
                        if (objM43021y != objM38805e) {
                            bVar = this;
                            c11484f = (C11484f) objM43021y;
                        }
                    } else {
                        InterfaceC11504t interfaceC11504tM43014r = this.f40596d.m43014r();
                        C14253b c14253b = new C14253b(this.f40596d, this, null);
                        aVar.f40597t = this;
                        aVar.f40600w = 2;
                        objM43021y = interfaceC11504tM43014r.mo42967b(c14253b, aVar);
                        if (objM43021y != objM38805e) {
                            bVar = this;
                            c11484f = (C11484f) objM43021y;
                        }
                    }
                } else {
                    C11494k<T> c11494k2 = this.f40596d;
                    aVar.f40597t = this;
                    aVar.f40600w = 1;
                    objM43021y = c11494k2.m43021y(false, aVar);
                    if (objM43021y != objM38805e) {
                        bVar = this;
                        c11484f = (C11484f) objM43021y;
                    }
                }
                return objM38805e;
            }
            if (i11 == 1) {
                bVar = (b) aVar.f40597t;
                C7348o.m30470b(objM43021y);
                c11484f = (C11484f) objM43021y;
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bVar = (b) aVar.f40597t;
                C7348o.m30470b(objM43021y);
                c11484f = (C11484f) objM43021y;
            }
            bVar.f40596d.inMemoryCache.m43049c(c11484f);
            return Unit.f29331a;
        }
    }

    /* JADX INFO: renamed from: t3.k$c */
    @Metadata(m31664d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"T", "Lt3/t;", "b", "()Lt3/t;"}, m31666k = 3, m31667mv = {1, 8, 0})
    public static final class c extends AbstractC7746m implements Function0<InterfaceC11504t> {

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ C11494k<T> f40622i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C11494k<T> c11494k) {
            super(0);
            this.f40622i = c11494k;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final InterfaceC11504t invoke() {
            return this.f40622i.m43015s().getCoordinator();
        }
    }

    /* JADX INFO: renamed from: t3.k$d */
    @Metadata(m31664d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"T", "Lnu/i;", "", "<anonymous>", "(Lnu/i;)V"}, m31666k = 3, m31667mv = {1, 8, 0})
    @InterfaceC10344f(m39663c = "androidx.datastore.core.DataStoreImpl$data$1", m39664f = "DataStoreImpl.kt", m39665l = {72, 74, 100}, m39666m = "invokeSuspend")
    public static final class d extends AbstractC10351m implements Function2<InterfaceC9577i<? super T>, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public Object f40623t;

        /* JADX INFO: renamed from: u */
        public int f40624u;

        /* JADX INFO: renamed from: v */
        public /* synthetic */ Object f40625v;

        /* JADX INFO: renamed from: w */
        public final /* synthetic */ C11494k<T> f40626w;

        /* JADX INFO: renamed from: t3.k$d$a */
        @Metadata(m31664d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m31665d2 = {"T", "Lnu/i;", "Lt3/d0;", "", "<anonymous>", "(Lnu/i;)V"}, m31666k = 3, m31667mv = {1, 8, 0})
        @InterfaceC10344f(m39663c = "androidx.datastore.core.DataStoreImpl$data$1$1", m39664f = "DataStoreImpl.kt", m39665l = {102}, m39666m = "invokeSuspend")
        public static final class a extends AbstractC10351m implements Function2<InterfaceC9577i<? super AbstractC11481d0<T>>, InterfaceC9557b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t */
            public int f40627t;

            /* JADX INFO: renamed from: u */
            public final /* synthetic */ C11494k<T> f40628u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C11494k<T> c11494k, InterfaceC9557b<? super a> interfaceC9557b) {
                super(2, interfaceC9557b);
                this.f40628u = c11494k;
            }

            @Override // pt.AbstractC10339a
            @NotNull
            public final InterfaceC9557b<Unit> create(@Nullable Object obj, @NotNull InterfaceC9557b<?> interfaceC9557b) {
                return new a(this.f40628u, interfaceC9557b);
            }

            @Override // pt.AbstractC10339a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object objM38805e = C10047c.m38805e();
                int i10 = this.f40627t;
                if (i10 == 0) {
                    C7348o.m30470b(obj);
                    C11494k<T> c11494k = this.f40628u;
                    this.f40627t = 1;
                    if (c11494k.m43017u(this) == objM38805e) {
                        return objM38805e;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7348o.m30470b(obj);
                }
                return Unit.f29331a;
            }

            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            @Nullable
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@NotNull InterfaceC9577i<? super AbstractC11481d0<T>> interfaceC9577i, @Nullable InterfaceC9557b<? super Unit> interfaceC9557b) {
                return ((a) create(interfaceC9577i, interfaceC9557b)).invokeSuspend(Unit.f29331a);
            }
        }

        /* JADX INFO: renamed from: t3.k$d$b */
        @Metadata(m31664d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m31665d2 = {"T", "Lt3/d0;", "it", "", "<anonymous>", "(Lt3/d0;)Z"}, m31666k = 3, m31667mv = {1, 8, 0})
        @InterfaceC10344f(m39663c = "androidx.datastore.core.DataStoreImpl$data$1$2", m39664f = "DataStoreImpl.kt", m39665l = {}, m39666m = "invokeSuspend")
        public static final class b extends AbstractC10351m implements Function2<AbstractC11481d0<T>, InterfaceC9557b<? super Boolean>, Object> {

            /* JADX INFO: renamed from: t */
            public int f40629t;

            /* JADX INFO: renamed from: u */
            public /* synthetic */ Object f40630u;

            public b(InterfaceC9557b<? super b> interfaceC9557b) {
                super(2, interfaceC9557b);
            }

            @Override // pt.AbstractC10339a
            @NotNull
            public final InterfaceC9557b<Unit> create(@Nullable Object obj, @NotNull InterfaceC9557b<?> interfaceC9557b) {
                b bVar = new b(interfaceC9557b);
                bVar.f40630u = obj;
                return bVar;
            }

            @Override // pt.AbstractC10339a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                C10047c.m38805e();
                if (this.f40629t != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
                return C10340b.m39658a(!(((AbstractC11481d0) this.f40630u) instanceof C11502r));
            }

            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            @Nullable
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@NotNull AbstractC11481d0<T> abstractC11481d0, @Nullable InterfaceC9557b<? super Boolean> interfaceC9557b) {
                return ((b) create(abstractC11481d0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
            }
        }

        /* JADX INFO: renamed from: t3.k$d$c */
        @Metadata(m31664d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m31665d2 = {"T", "Lt3/d0;", "it", "", "<anonymous>", "(Lt3/d0;)Z"}, m31666k = 3, m31667mv = {1, 8, 0})
        @InterfaceC10344f(m39663c = "androidx.datastore.core.DataStoreImpl$data$1$3", m39664f = "DataStoreImpl.kt", m39665l = {}, m39666m = "invokeSuspend")
        public static final class c extends AbstractC10351m implements Function2<AbstractC11481d0<T>, InterfaceC9557b<? super Boolean>, Object> {

            /* JADX INFO: renamed from: t */
            public int f40631t;

            /* JADX INFO: renamed from: u */
            public /* synthetic */ Object f40632u;

            /* JADX INFO: renamed from: v */
            public final /* synthetic */ AbstractC11481d0<T> f40633v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(AbstractC11481d0<T> abstractC11481d0, InterfaceC9557b<? super c> interfaceC9557b) {
                super(2, interfaceC9557b);
                this.f40633v = abstractC11481d0;
            }

            @Override // pt.AbstractC10339a
            @NotNull
            public final InterfaceC9557b<Unit> create(@Nullable Object obj, @NotNull InterfaceC9557b<?> interfaceC9557b) {
                c cVar = new c(this.f40633v, interfaceC9557b);
                cVar.f40632u = obj;
                return cVar;
            }

            @Override // pt.AbstractC10339a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                C10047c.m38805e();
                if (this.f40631t != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
                AbstractC11481d0 abstractC11481d0 = (AbstractC11481d0) this.f40632u;
                return C10340b.m39658a((abstractC11481d0 instanceof C11484f) && abstractC11481d0.getVersion() <= this.f40633v.getVersion());
            }

            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            @Nullable
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@NotNull AbstractC11481d0<T> abstractC11481d0, @Nullable InterfaceC9557b<? super Boolean> interfaceC9557b) {
                return ((c) create(abstractC11481d0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
            }
        }

        /* JADX INFO: renamed from: t3.k$d$d, reason: collision with other inner class name */
        @Metadata(m31664d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, m31665d2 = {"T", "Lnu/i;", "", "it", "", "<anonymous>", "(Lnu/i;Ljava/lang/Throwable;)V"}, m31666k = 3, m31667mv = {1, 8, 0})
        @InterfaceC10344f(m39663c = "androidx.datastore.core.DataStoreImpl$data$1$5", m39664f = "DataStoreImpl.kt", m39665l = {116}, m39666m = "invokeSuspend")
        public static final class C14255d extends AbstractC10351m implements InterfaceC14057n<InterfaceC9577i<? super T>, Throwable, InterfaceC9557b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t */
            public int f40634t;

            /* JADX INFO: renamed from: u */
            public final /* synthetic */ C11494k<T> f40635u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C14255d(C11494k<T> c11494k, InterfaceC9557b<? super C14255d> interfaceC9557b) {
                super(3, interfaceC9557b);
                this.f40635u = c11494k;
            }

            @Override // pt.AbstractC10339a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object objM38805e = C10047c.m38805e();
                int i10 = this.f40634t;
                if (i10 == 0) {
                    C7348o.m30470b(obj);
                    C11494k<T> c11494k = this.f40635u;
                    this.f40634t = 1;
                    if (c11494k.m43012p(this) == objM38805e) {
                        return objM38805e;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7348o.m30470b(obj);
                }
                return Unit.f29331a;
            }

            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // p615zt.InterfaceC14057n
            @Nullable
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@NotNull InterfaceC9577i<? super T> interfaceC9577i, @Nullable Throwable th2, @Nullable InterfaceC9557b<? super Unit> interfaceC9557b) {
                return new C14255d(this.f40635u, interfaceC9557b).invokeSuspend(Unit.f29331a);
            }
        }

        /* JADX INFO: renamed from: t3.k$d$e */
        @Metadata(m31664d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, m31665d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lnu/h;", "Lnu/i;", "collector", "", "collect", "(Lnu/i;Lnt/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {1, 8, 0}, m31669xi = 48)
        public static final class e implements InterfaceC9575h<T> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ InterfaceC9575h f40636a;

            /* JADX INFO: renamed from: t3.k$d$e$a */
            @Metadata(m31664d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m31665d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;", "<anonymous>"}, m31666k = 3, m31667mv = {1, 8, 0})
            public static final class a<T> implements InterfaceC9577i {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ InterfaceC9577i f40637a;

                /* JADX INFO: renamed from: t3.k$d$e$a$a, reason: collision with other inner class name */
                @InterfaceC10344f(m39663c = "androidx.datastore.core.DataStoreImpl$data$1$invokeSuspend$$inlined$map$1$2", m39664f = "DataStoreImpl.kt", m39665l = {223}, m39666m = "emit")
                @Metadata(m31666k = 3, m31667mv = {1, 8, 0}, m31669xi = 48)
                public static final class C14256a extends AbstractC10342d {

                    /* JADX INFO: renamed from: t */
                    public /* synthetic */ Object f40638t;

                    /* JADX INFO: renamed from: u */
                    public int f40639u;

                    public C14256a(InterfaceC9557b interfaceC9557b) {
                        super(interfaceC9557b);
                    }

                    @Override // pt.AbstractC10339a
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.f40638t = obj;
                        this.f40639u |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                        return a.this.emit(null, this);
                    }
                }

                public a(InterfaceC9577i interfaceC9577i) {
                    this.f40637a = interfaceC9577i;
                }

                /* JADX DEBUG: Multi-variable search result rejected for r6v2, resolved type: nu.i */
                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // nu.InterfaceC9577i
                @Nullable
                public final Object emit(Object obj, @NotNull InterfaceC9557b interfaceC9557b) throws Throwable {
                    C14256a c14256a;
                    if (interfaceC9557b instanceof C14256a) {
                        c14256a = (C14256a) interfaceC9557b;
                        int i10 = c14256a.f40639u;
                        if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                            c14256a.f40639u = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                        } else {
                            c14256a = new C14256a(interfaceC9557b);
                        }
                    } else {
                        c14256a = new C14256a(interfaceC9557b);
                    }
                    Object obj2 = c14256a.f40638t;
                    Object objM38805e = C10047c.m38805e();
                    int i11 = c14256a.f40639u;
                    if (i11 == 0) {
                        C7348o.m30470b(obj2);
                        InterfaceC9577i interfaceC9577i = this.f40637a;
                        AbstractC11481d0 abstractC11481d0 = (AbstractC11481d0) obj;
                        if (abstractC11481d0 instanceof C11508x) {
                            throw ((C11508x) abstractC11481d0).getReadException();
                        }
                        if (!(abstractC11481d0 instanceof C11484f)) {
                            if (abstractC11481d0 instanceof C11502r ? true : abstractC11481d0 instanceof C11489h0) {
                                throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                            }
                            throw new C7345l();
                        }
                        Object objM42976c = ((C11484f) abstractC11481d0).m42976c();
                        c14256a.f40639u = 1;
                        if (interfaceC9577i.emit(objM42976c, c14256a) == objM38805e) {
                            return objM38805e;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C7348o.m30470b(obj2);
                    }
                    return Unit.f29331a;
                }
            }

            public e(InterfaceC9575h interfaceC9575h) {
                this.f40636a = interfaceC9575h;
            }

            @Override // nu.InterfaceC9575h
            @Nullable
            public Object collect(@NotNull InterfaceC9577i interfaceC9577i, @NotNull InterfaceC9557b interfaceC9557b) {
                Object objCollect = this.f40636a.collect(new a(interfaceC9577i), interfaceC9557b);
                return objCollect == C10047c.m38805e() ? objCollect : Unit.f29331a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C11494k<T> c11494k, InterfaceC9557b<? super d> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f40626w = c11494k;
        }

        @Override // pt.AbstractC10339a
        @NotNull
        public final InterfaceC9557b<Unit> create(@Nullable Object obj, @NotNull InterfaceC9557b<?> interfaceC9557b) {
            d dVar = new d(this.f40626w, interfaceC9557b);
            dVar.f40625v = obj;
            return dVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:32:0x00bb, code lost:
        
            if (nu.C9579j.m37800q(r1, r9, r8) == r0) goto L33;
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
        @Override // pt.AbstractC10339a
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            ?? r8;
            AbstractC11481d0 abstractC11481d0;
            ?? r10;
            AbstractC11481d0 abstractC11481d1;
            ?? r11;
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f40624u;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                InterfaceC9577i interfaceC9577i = (InterfaceC9577i) this.f40625v;
                C11494k<T> c11494k = this.f40626w;
                this.f40625v = interfaceC9577i;
                this.f40624u = 1;
                Object objM43022z = c11494k.m43022z(false, this);
                if (objM43022z != objM38805e) {
                    r8 = interfaceC9577i;
                    obj = objM43022z;
                }
                return objM38805e;
            }
            if (i10 == 1) {
                InterfaceC9577i interfaceC9577i2 = (InterfaceC9577i) this.f40625v;
                C7348o.m30470b(obj);
                r8 = interfaceC9577i2;
            } else if (i10 == 2) {
                abstractC11481d1 = (AbstractC11481d0) this.f40623t;
                InterfaceC9577i interfaceC9577i3 = (InterfaceC9577i) this.f40625v;
                C7348o.m30470b(obj);
                r10 = interfaceC9577i3;
                abstractC11481d0 = abstractC11481d1;
                r11 = r10;
                r11 = r8;
                InterfaceC9575h interfaceC9575hM37767D = C9579j.m37767D(new e(C9579j.m37798o(C9579j.m37777N(C9579j.m37769F(this.f40626w.inMemoryCache.m43048b(), new a(this.f40626w, null)), new b(null)), new c(abstractC11481d0, null))), new C14255d(this.f40626w, null));
                this.f40625v = null;
                this.f40623t = null;
                this.f40624u = 3;
            } else {
                if (i10 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
            }
            return Unit.f29331a;
            abstractC11481d0 = (AbstractC11481d0) obj;
            if (abstractC11481d0 instanceof C11484f) {
                Object objM42976c = ((C11484f) abstractC11481d0).m42976c();
                this.f40625v = r8;
                this.f40623t = abstractC11481d0;
                this.f40624u = 2;
                if (r8.emit(objM42976c, this) != objM38805e) {
                    r10 = r8;
                    abstractC11481d1 = abstractC11481d0;
                    abstractC11481d0 = abstractC11481d1;
                    r11 = r10;
                    r11 = r8;
                    InterfaceC9575h interfaceC9575hM37767D2 = C9579j.m37767D(new e(C9579j.m37798o(C9579j.m37777N(C9579j.m37769F(this.f40626w.inMemoryCache.m43048b(), new a(this.f40626w, null)), new b(null)), new c(abstractC11481d0, null))), new C14255d(this.f40626w, null));
                    this.f40625v = null;
                    this.f40623t = null;
                    this.f40624u = 3;
                }
            } else {
                if (abstractC11481d0 instanceof C11489h0) {
                    throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                }
                if (abstractC11481d0 instanceof C11508x) {
                    throw ((C11508x) abstractC11481d0).getReadException();
                }
                if (abstractC11481d0 instanceof C11502r) {
                    r11 = r8;
                    return Unit.f29331a;
                }
                r11 = r8;
                InterfaceC9575h interfaceC9575hM37767D3 = C9579j.m37767D(new e(C9579j.m37798o(C9579j.m37777N(C9579j.m37769F(this.f40626w.inMemoryCache.m43048b(), new a(this.f40626w, null)), new b(null)), new c(abstractC11481d0, null))), new C14255d(this.f40626w, null));
                this.f40625v = null;
                this.f40623t = null;
                this.f40624u = 3;
            }
            return objM38805e;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull InterfaceC9577i<? super T> interfaceC9577i, @Nullable InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((d) create(interfaceC9577i, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: t3.k$e */
    @InterfaceC10344f(m39663c = "androidx.datastore.core.DataStoreImpl", m39664f = "DataStoreImpl.kt", m39665l = {544}, m39666m = "decrementCollector")
    @Metadata(m31666k = 3, m31667mv = {1, 8, 0}, m31669xi = 48)
    public static final class e extends AbstractC10342d {

        /* JADX INFO: renamed from: t */
        public Object f40641t;

        /* JADX INFO: renamed from: u */
        public Object f40642u;

        /* JADX INFO: renamed from: v */
        public /* synthetic */ Object f40643v;

        /* JADX INFO: renamed from: w */
        public final /* synthetic */ C11494k<T> f40644w;

        /* JADX INFO: renamed from: x */
        public int f40645x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(C11494k<T> c11494k, InterfaceC9557b<? super e> interfaceC9557b) {
            super(interfaceC9557b);
            this.f40644w = c11494k;
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f40643v = obj;
            this.f40645x |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return this.f40644w.m43012p(this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: t3.k$f */
    @Metadata(m31664d1 = {"\u0000\u0004\n\u0002\b\u0003\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u0002H\u008a@"}, m31665d2 = {"<anonymous>", "R", "T"}, m31666k = 3, m31667mv = {1, 8, 0}, m31669xi = 48)
    @InterfaceC10344f(m39663c = "androidx.datastore.core.DataStoreImpl$doWithWriteFileLock$3", m39664f = "DataStoreImpl.kt", m39665l = {416}, m39666m = "invokeSuspend")
    public static final class f<R> extends AbstractC10351m implements Function1<InterfaceC9557b<? super R>, Object> {

        /* JADX INFO: renamed from: t */
        public int f40646t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ Function1<InterfaceC9557b<? super R>, Object> f40647u;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super nt.b<? super R>, ? extends java.lang.Object> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(Function1<? super InterfaceC9557b<? super R>, ? extends Object> function1, InterfaceC9557b<? super f> interfaceC9557b) {
            super(1, interfaceC9557b);
            this.f40647u = function1;
        }

        @Override // pt.AbstractC10339a
        @NotNull
        public final InterfaceC9557b<Unit> create(@NotNull InterfaceC9557b<?> interfaceC9557b) {
            return new f(this.f40647u, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f40646t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
                return obj;
            }
            C7348o.m30470b(obj);
            Function1<InterfaceC9557b<? super R>, Object> function1 = this.f40647u;
            this.f40646t = 1;
            Object objInvoke = function1.invoke(this);
            return objInvoke == objM38805e ? objM38805e : objInvoke;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Nullable InterfaceC9557b<? super R> interfaceC9557b) {
            return ((f) create(interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: t3.k$g */
    @InterfaceC10344f(m39663c = "androidx.datastore.core.DataStoreImpl", m39664f = "DataStoreImpl.kt", m39665l = {237, 243, 246}, m39666m = "handleUpdate")
    @Metadata(m31666k = 3, m31667mv = {1, 8, 0}, m31669xi = 48)
    public static final class g extends AbstractC10342d {

        /* JADX INFO: renamed from: t */
        public Object f40648t;

        /* JADX INFO: renamed from: u */
        public Object f40649u;

        /* JADX INFO: renamed from: v */
        public Object f40650v;

        /* JADX INFO: renamed from: w */
        public /* synthetic */ Object f40651w;

        /* JADX INFO: renamed from: x */
        public final /* synthetic */ C11494k<T> f40652x;

        /* JADX INFO: renamed from: y */
        public int f40653y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(C11494k<T> c11494k, InterfaceC9557b<? super g> interfaceC9557b) {
            super(interfaceC9557b);
            this.f40652x = c11494k;
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f40651w = obj;
            this.f40653y |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return this.f40652x.m43016t(null, this);
        }
    }

    /* JADX INFO: renamed from: t3.k$h */
    @InterfaceC10344f(m39663c = "androidx.datastore.core.DataStoreImpl", m39664f = "DataStoreImpl.kt", m39665l = {544}, m39666m = "incrementCollector")
    @Metadata(m31666k = 3, m31667mv = {1, 8, 0}, m31669xi = 48)
    public static final class h extends AbstractC10342d {

        /* JADX INFO: renamed from: t */
        public Object f40654t;

        /* JADX INFO: renamed from: u */
        public Object f40655u;

        /* JADX INFO: renamed from: v */
        public /* synthetic */ Object f40656v;

        /* JADX INFO: renamed from: w */
        public final /* synthetic */ C11494k<T> f40657w;

        /* JADX INFO: renamed from: x */
        public int f40658x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(C11494k<T> c11494k, InterfaceC9557b<? super h> interfaceC9557b) {
            super(interfaceC9557b);
            this.f40657w = c11494k;
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f40656v = obj;
            this.f40658x |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return this.f40657w.m43017u(this);
        }
    }

    /* JADX INFO: renamed from: t3.k$i */
    @Metadata(m31664d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"T", "Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {1, 8, 0})
    @InterfaceC10344f(m39663c = "androidx.datastore.core.DataStoreImpl$incrementCollector$2$1", m39664f = "DataStoreImpl.kt", m39665l = {134, 135}, m39666m = "invokeSuspend")
    public static final class i extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f40659t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ C11494k<T> f40660u;

        /* JADX INFO: renamed from: t3.k$i$a */
        @Metadata(m31664d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"T", "", "it", "b", "(Lkotlin/Unit;Lnt/b;)Ljava/lang/Object;"}, m31666k = 3, m31667mv = {1, 8, 0})
        public static final class a<T> implements InterfaceC9577i {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ C11494k<T> f40661a;

            public a(C11494k<T> c11494k) {
                this.f40661a = c11494k;
            }

            /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object; */
            @Override // nu.InterfaceC9577i
            @Nullable
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(@NotNull Unit unit, @NotNull InterfaceC9557b<? super Unit> interfaceC9557b) {
                Object objM43019w;
                return ((this.f40661a.inMemoryCache.m43047a() instanceof C11502r) || (objM43019w = this.f40661a.m43019w(true, interfaceC9557b)) != C10047c.m38805e()) ? Unit.f29331a : objM43019w;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(C11494k<T> c11494k, InterfaceC9557b<? super i> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f40660u = c11494k;
        }

        @Override // pt.AbstractC10339a
        @NotNull
        public final InterfaceC9557b<Unit> create(@Nullable Object obj, @NotNull InterfaceC9557b<?> interfaceC9557b) {
            return new i(this.f40660u, interfaceC9557b);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
        
            if (r5.collect(r1, r4) == r0) goto L15;
         */
        @Override // pt.AbstractC10339a
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f40659t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                b bVar = this.f40660u.readAndInit;
                this.f40659t = 1;
                if (bVar.m43072a(this) != objM38805e) {
                }
                return objM38805e;
            }
            if (i10 == 1) {
                C7348o.m30470b(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
            }
            return Unit.f29331a;
            InterfaceC9575h interfaceC9575hM37794k = C9579j.m37794k(this.f40660u.m43014r().mo42966a());
            a aVar = new a(this.f40660u);
            this.f40659t = 2;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull InterfaceC7906p0 interfaceC7906p0, @Nullable InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((i) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: t3.k$j */
    @InterfaceC10344f(m39663c = "androidx.datastore.core.DataStoreImpl", m39664f = "DataStoreImpl.kt", m39665l = {264, 266}, m39666m = "readAndInitOrPropagateAndThrowFailure")
    @Metadata(m31666k = 3, m31667mv = {1, 8, 0}, m31669xi = 48)
    public static final class j extends AbstractC10342d {

        /* JADX INFO: renamed from: t */
        public Object f40662t;

        /* JADX INFO: renamed from: u */
        public int f40663u;

        /* JADX INFO: renamed from: v */
        public /* synthetic */ Object f40664v;

        /* JADX INFO: renamed from: w */
        public final /* synthetic */ C11494k<T> f40665w;

        /* JADX INFO: renamed from: x */
        public int f40666x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(C11494k<T> c11494k, InterfaceC9557b<? super j> interfaceC9557b) {
            super(interfaceC9557b);
            this.f40665w = c11494k;
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f40664v = obj;
            this.f40666x |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return this.f40665w.m43018v(this);
        }
    }

    /* JADX INFO: renamed from: t3.k$k */
    @InterfaceC10344f(m39663c = "androidx.datastore.core.DataStoreImpl", m39664f = "DataStoreImpl.kt", m39665l = {287, 296, 304}, m39666m = "readDataAndUpdateCache")
    @Metadata(m31666k = 3, m31667mv = {1, 8, 0}, m31669xi = 48)
    public static final class k extends AbstractC10342d {

        /* JADX INFO: renamed from: t */
        public Object f40667t;

        /* JADX INFO: renamed from: u */
        public Object f40668u;

        /* JADX INFO: renamed from: v */
        public boolean f40669v;

        /* JADX INFO: renamed from: w */
        public /* synthetic */ Object f40670w;

        /* JADX INFO: renamed from: x */
        public final /* synthetic */ C11494k<T> f40671x;

        /* JADX INFO: renamed from: y */
        public int f40672y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(C11494k<T> c11494k, InterfaceC9557b<? super k> interfaceC9557b) {
            super(interfaceC9557b);
            this.f40671x = c11494k;
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f40670w = obj;
            this.f40672y |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return this.f40671x.m43019w(false, this);
        }
    }

    /* JADX INFO: renamed from: t3.k$l */
    @Metadata(m31664d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0004\u0012\u00020\u00030\u0001\"\u0004\b\u0000\u0010\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m31665d2 = {"T", "Lkotlin/Pair;", "Lt3/d0;", "", "<anonymous>", "()Lkotlin/Pair;"}, m31666k = 3, m31667mv = {1, 8, 0})
    @InterfaceC10344f(m39663c = "androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$3", m39664f = "DataStoreImpl.kt", m39665l = {298, MlKitException.LOW_LIGHT_AUTO_EXPOSURE_COMPUTATION_FAILURE}, m39666m = "invokeSuspend")
    public static final class l extends AbstractC10351m implements Function1<InterfaceC9557b<? super Pair<? extends AbstractC11481d0<T>, ? extends Boolean>>, Object> {

        /* JADX INFO: renamed from: t */
        public Object f40673t;

        /* JADX INFO: renamed from: u */
        public int f40674u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ C11494k<T> f40675v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(C11494k<T> c11494k, InterfaceC9557b<? super l> interfaceC9557b) {
            super(1, interfaceC9557b);
            this.f40675v = c11494k;
        }

        @Override // pt.AbstractC10339a
        @NotNull
        public final InterfaceC9557b<Unit> create(@NotNull InterfaceC9557b<?> interfaceC9557b) {
            return new l(this.f40675v, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Throwable th2;
            AbstractC11481d0 c11508x;
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f40674u;
            try {
                if (i10 == 0) {
                    C7348o.m30470b(obj);
                    C11494k<T> c11494k = this.f40675v;
                    this.f40674u = 1;
                    obj = c11494k.m43021y(true, this);
                    if (obj == objM38805e) {
                        return objM38805e;
                    }
                } else {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        th2 = (Throwable) this.f40673t;
                        C7348o.m30470b(obj);
                        c11508x = new C11508x(th2, ((Number) obj).intValue());
                        return C7352s.m30477a(c11508x, C10340b.m39658a(true));
                    }
                    C7348o.m30470b(obj);
                }
                c11508x = (AbstractC11481d0) obj;
            } catch (Throwable th3) {
                InterfaceC11504t interfaceC11504tM43014r = this.f40675v.m43014r();
                this.f40673t = th3;
                this.f40674u = 2;
                Object objMo42968c = interfaceC11504tM43014r.mo42968c(this);
                if (objMo42968c != objM38805e) {
                    th2 = th3;
                    obj = objMo42968c;
                }
                return objM38805e;
            }
            return C7352s.m30477a(c11508x, C10340b.m39658a(true));
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Nullable InterfaceC9557b<? super Pair<? extends AbstractC11481d0<T>, Boolean>> interfaceC9557b) {
            return ((l) create(interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: t3.k$m */
    @Metadata(m31664d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0004\u0012\u00020\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, m31665d2 = {"T", "", "locked", "Lkotlin/Pair;", "Lt3/d0;", "<anonymous>", "(Z)Lkotlin/Pair;"}, m31666k = 3, m31667mv = {1, 8, 0})
    @InterfaceC10344f(m39663c = "androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$4", m39664f = "DataStoreImpl.kt", m39665l = {306, 309}, m39666m = "invokeSuspend")
    public static final class m extends AbstractC10351m implements Function2<Boolean, InterfaceC9557b<? super Pair<? extends AbstractC11481d0<T>, ? extends Boolean>>, Object> {

        /* JADX INFO: renamed from: t */
        public Object f40676t;

        /* JADX INFO: renamed from: u */
        public int f40677u;

        /* JADX INFO: renamed from: v */
        public /* synthetic */ boolean f40678v;

        /* JADX INFO: renamed from: w */
        public final /* synthetic */ C11494k<T> f40679w;

        /* JADX INFO: renamed from: x */
        public final /* synthetic */ int f40680x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(C11494k<T> c11494k, int i10, InterfaceC9557b<? super m> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f40679w = c11494k;
            this.f40680x = i10;
        }

        @Override // pt.AbstractC10339a
        @NotNull
        public final InterfaceC9557b<Unit> create(@Nullable Object obj, @NotNull InterfaceC9557b<?> interfaceC9557b) {
            m mVar = new m(this.f40679w, this.f40680x, interfaceC9557b);
            mVar.f40678v = ((Boolean) obj).booleanValue();
            return mVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Object obj) {
            return m43037q(bool.booleanValue(), (InterfaceC9557b) obj);
        }

        /* JADX DEBUG: Failed to insert an additional move for type inference into block B:30:0x0008 */
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
        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Throwable th2;
            int iIntValue;
            ?? r8;
            ?? r10;
            AbstractC11481d0 abstractC11481d0;
            ?? r11;
            Object objM38805e = C10047c.m38805e();
            ?? r12 = this.f40677u;
            try {
                if (r12 == 0) {
                    C7348o.m30470b(obj);
                    boolean z10 = this.f40678v;
                    C11494k<T> c11494k = this.f40679w;
                    this.f40678v = z10;
                    this.f40677u = 1;
                    obj = c11494k.m43021y(z10, this);
                    r12 = z10;
                    if (obj == objM38805e) {
                        return objM38805e;
                    }
                } else {
                    if (r12 != 1) {
                        if (r12 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        boolean z11 = this.f40678v;
                        th2 = (Throwable) this.f40676t;
                        C7348o.m30470b(obj);
                        r10 = z11;
                        iIntValue = ((Number) obj).intValue();
                        r8 = r10;
                        C11508x c11508x = new C11508x(th2, iIntValue);
                        r11 = r8;
                        abstractC11481d0 = c11508x;
                        return C7352s.m30477a(abstractC11481d0, C10340b.m39658a(r11));
                    }
                    boolean z12 = this.f40678v;
                    C7348o.m30470b(obj);
                    r12 = z12;
                }
                abstractC11481d0 = (AbstractC11481d0) obj;
                r11 = r12;
            } catch (Throwable th3) {
                if (r12 != 0) {
                    InterfaceC11504t interfaceC11504tM43014r = this.f40679w.m43014r();
                    this.f40676t = th3;
                    this.f40678v = r12;
                    this.f40677u = 2;
                    Object objMo42968c = interfaceC11504tM43014r.mo42968c(this);
                    if (objMo42968c != objM38805e) {
                        r10 = r12;
                        th2 = th3;
                        obj = objMo42968c;
                    }
                    return objM38805e;
                }
                ?? r13 = r12;
                th2 = th3;
                iIntValue = this.f40680x;
                r8 = r13 == true ? 1 : 0;
            }
            return C7352s.m30477a(abstractC11481d0, C10340b.m39658a(r11));
        }

        @Nullable
        /* JADX INFO: renamed from: q */
        public final Object m43037q(boolean z10, @Nullable InterfaceC9557b<? super Pair<? extends AbstractC11481d0<T>, Boolean>> interfaceC9557b) {
            return ((m) create(Boolean.valueOf(z10), interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: t3.k$n */
    @InterfaceC10344f(m39663c = "androidx.datastore.core.DataStoreImpl", m39664f = "DataStoreImpl.kt", m39665l = {365, 366, 368, 369, 380, 384}, m39666m = "readDataOrHandleCorruption")
    @Metadata(m31666k = 3, m31667mv = {1, 8, 0}, m31669xi = 48)
    public static final class n extends AbstractC10342d {

        /* JADX INFO: renamed from: A */
        public final /* synthetic */ C11494k<T> f40681A;

        /* JADX INFO: renamed from: B */
        public int f40682B;

        /* JADX INFO: renamed from: t */
        public Object f40683t;

        /* JADX INFO: renamed from: u */
        public Object f40684u;

        /* JADX INFO: renamed from: v */
        public Object f40685v;

        /* JADX INFO: renamed from: w */
        public Object f40686w;

        /* JADX INFO: renamed from: x */
        public boolean f40687x;

        /* JADX INFO: renamed from: y */
        public int f40688y;

        /* JADX INFO: renamed from: z */
        public /* synthetic */ Object f40689z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(C11494k<T> c11494k, InterfaceC9557b<? super n> interfaceC9557b) {
            super(interfaceC9557b);
            this.f40681A = c11494k;
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f40689z = obj;
            this.f40682B |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return this.f40681A.m43021y(false, this);
        }
    }

    /* JADX INFO: renamed from: t3.k$o */
    @Metadata(m31664d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m31665d2 = {"T", "", "locked", "Lt3/f;", "<anonymous>", "(Z)Lt3/f;"}, m31666k = 3, m31667mv = {1, 8, 0})
    @InterfaceC10344f(m39663c = "androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$2", m39664f = "DataStoreImpl.kt", m39665l = {370, 371}, m39666m = "invokeSuspend")
    public static final class o extends AbstractC10351m implements Function2<Boolean, InterfaceC9557b<? super C11484f<T>>, Object> {

        /* JADX INFO: renamed from: t */
        public Object f40690t;

        /* JADX INFO: renamed from: u */
        public int f40691u;

        /* JADX INFO: renamed from: v */
        public /* synthetic */ boolean f40692v;

        /* JADX INFO: renamed from: w */
        public final /* synthetic */ C11494k<T> f40693w;

        /* JADX INFO: renamed from: x */
        public final /* synthetic */ int f40694x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(C11494k<T> c11494k, int i10, InterfaceC9557b<? super o> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f40693w = c11494k;
            this.f40694x = i10;
        }

        @Override // pt.AbstractC10339a
        @NotNull
        public final InterfaceC9557b<Unit> create(@Nullable Object obj, @NotNull InterfaceC9557b<?> interfaceC9557b) {
            o oVar = new o(this.f40693w, this.f40694x, interfaceC9557b);
            oVar.f40692v = ((Boolean) obj).booleanValue();
            return oVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Object obj) {
            return m43038q(bool.booleanValue(), (InterfaceC9557b) obj);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0059  */
        /* JADX WARN: Code duplicated, block: B:23:0x005e  */
        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            boolean z10;
            Object obj2;
            int iIntValue;
            int iHashCode;
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f40691u;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                z10 = this.f40692v;
                C11494k<T> c11494k = this.f40693w;
                this.f40692v = z10;
                this.f40691u = 1;
                obj = c11494k.m43020x(this);
                if (obj != objM38805e) {
                }
                return objM38805e;
            }
            if (i10 == 1) {
                z10 = this.f40692v;
                C7348o.m30470b(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj2 = this.f40690t;
                C7348o.m30470b(obj);
            }
            iIntValue = ((Number) obj).intValue();
            if (obj2 != null) {
                iHashCode = obj2.hashCode();
            } else {
                iHashCode = 0;
            }
            return new C11484f(obj2, iHashCode, iIntValue);
            if (z10) {
                InterfaceC11504t interfaceC11504tM43014r = this.f40693w.m43014r();
                this.f40690t = obj;
                this.f40691u = 2;
                Object objMo42968c = interfaceC11504tM43014r.mo42968c(this);
                if (objMo42968c != objM38805e) {
                    obj2 = obj;
                    obj = objMo42968c;
                    iIntValue = ((Number) obj).intValue();
                }
                return objM38805e;
            }
            obj2 = obj;
            iIntValue = this.f40694x;
            if (obj2 != null) {
                iHashCode = obj2.hashCode();
            } else {
                iHashCode = 0;
            }
            return new C11484f(obj2, iHashCode, iIntValue);
        }

        @Nullable
        /* JADX INFO: renamed from: q */
        public final Object m43038q(boolean z10, @Nullable InterfaceC9557b<? super C11484f<T>> interfaceC9557b) {
            return ((o) create(Boolean.valueOf(z10), interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: t3.k$p */
    @Metadata(m31664d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\u008a@"}, m31665d2 = {"<anonymous>", "", "T"}, m31666k = 3, m31667mv = {1, 8, 0}, m31669xi = 48)
    @InterfaceC10344f(m39663c = "androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$3", m39664f = "DataStoreImpl.kt", m39665l = {387, 388, 390}, m39666m = "invokeSuspend")
    public static final class p extends AbstractC10351m implements Function1<InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public Object f40695t;

        /* JADX INFO: renamed from: u */
        public int f40696u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ C7729c0<T> f40697v;

        /* JADX INFO: renamed from: w */
        public final /* synthetic */ C11494k<T> f40698w;

        /* JADX INFO: renamed from: x */
        public final /* synthetic */ C7725a0 f40699x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(C7729c0<T> c7729c0, C11494k<T> c11494k, C7725a0 c7725a0, InterfaceC9557b<? super p> interfaceC9557b) {
            super(1, interfaceC9557b);
            this.f40697v = c7729c0;
            this.f40698w = c11494k;
            this.f40699x = c7725a0;
        }

        @Override // pt.AbstractC10339a
        @NotNull
        public final InterfaceC9557b<Unit> create(@NotNull InterfaceC9557b<?> interfaceC9557b) {
            return new p(this.f40697v, this.f40698w, this.f40699x, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            C7725a0 c7725a0;
            C7729c0<T> c7729c0;
            C7725a0 c7725a1;
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f40696u;
            try {
                if (i10 == 0) {
                    C7348o.m30470b(obj);
                    c7729c0 = this.f40697v;
                    C11494k<T> c11494k = this.f40698w;
                    this.f40695t = c7729c0;
                    this.f40696u = 1;
                    obj = (T) c11494k.m43020x(this);
                    if (obj == objM38805e) {
                    }
                    return objM38805e;
                }
                if (i10 == 1) {
                    c7729c0 = (C7729c0) this.f40695t;
                    C7348o.m30470b(obj);
                } else {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c7725a0 = (C7725a0) this.f40695t;
                        C7348o.m30470b(obj);
                        c7725a0.f29421a = ((Number) obj).intValue();
                        return Unit.f29331a;
                    }
                    c7725a1 = (C7725a0) this.f40695t;
                    C7348o.m30470b(obj);
                }
                c7725a1.f29421a = ((Number) obj).intValue();
                return Unit.f29331a;
                c7729c0.f29425a = (T) obj;
                c7725a1 = this.f40699x;
                InterfaceC11504t interfaceC11504tM43014r = this.f40698w.m43014r();
                this.f40695t = c7725a1;
                this.f40696u = 2;
                obj = (T) interfaceC11504tM43014r.mo42968c(this);
                if (obj == objM38805e) {
                    return objM38805e;
                }
                c7725a1.f29421a = ((Number) obj).intValue();
            } catch (C11480d unused) {
                C7725a0 c7725a2 = this.f40699x;
                C11494k<T> c11494k2 = this.f40698w;
                T t8 = this.f40697v.f29425a;
                this.f40695t = c7725a2;
                this.f40696u = 3;
                Object objM43011B = c11494k2.m43011B(t8, true, this);
                if (objM43011B != objM38805e) {
                    c7725a0 = c7725a2;
                    obj = (T) objM43011B;
                }
                return objM38805e;
            }
            return Unit.f29331a;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Nullable InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((p) create(interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: t3.k$q */
    @Metadata(m31664d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"T", "Lku/p0;", "Lt3/d0;", "<anonymous>", "(Lku/p0;)Lt3/d0;"}, m31666k = 3, m31667mv = {1, 8, 0})
    @InterfaceC10344f(m39663c = "androidx.datastore.core.DataStoreImpl$readState$2", m39664f = "DataStoreImpl.kt", m39665l = {218, 226}, m39666m = "invokeSuspend")
    public static final class q extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super AbstractC11481d0<T>>, Object> {

        /* JADX INFO: renamed from: t */
        public int f40700t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ C11494k<T> f40701u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ boolean f40702v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(C11494k<T> c11494k, boolean z10, InterfaceC9557b<? super q> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f40701u = c11494k;
            this.f40702v = z10;
        }

        @Override // pt.AbstractC10339a
        @NotNull
        public final InterfaceC9557b<Unit> create(@Nullable Object obj, @NotNull InterfaceC9557b<?> interfaceC9557b) {
            return new q(this.f40701u, this.f40702v, interfaceC9557b);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0051, code lost:
        
            if (r5 == r0) goto L22;
         */
        @Override // pt.AbstractC10339a
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f40700t;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        C7348o.m30470b(obj);
                    } else {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C7348o.m30470b(obj);
                    }
                    return (AbstractC11481d0) obj;
                }
                C7348o.m30470b(obj);
                if (this.f40701u.inMemoryCache.m43047a() instanceof C11502r) {
                    return this.f40701u.inMemoryCache.m43047a();
                }
                C11494k<T> c11494k = this.f40701u;
                this.f40700t = 1;
                if (c11494k.m43018v(this) != objM38805e) {
                }
                return objM38805e;
                C11494k<T> c11494k2 = this.f40701u;
                boolean z10 = this.f40702v;
                this.f40700t = 2;
                obj = c11494k2.m43019w(z10, this);
            } catch (Throwable th2) {
                return new C11508x(th2, -1);
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull InterfaceC7906p0 interfaceC7906p0, @Nullable InterfaceC9557b<? super AbstractC11481d0<T>> interfaceC9557b) {
            return ((q) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: t3.k$r */
    @Metadata(m31664d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"T", "Lt3/f0;", "b", "()Lt3/f0;"}, m31666k = 3, m31667mv = {1, 8, 0})
    public static final class r extends AbstractC7746m implements Function0<InterfaceC11485f0<T>> {

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ C11494k<T> f40703i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(C11494k<T> c11494k) {
            super(0);
            this.f40703i = c11494k;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final InterfaceC11485f0<T> invoke() {
            return this.f40703i.storage.mo42974a();
        }
    }

    /* JADX INFO: renamed from: t3.k$s */
    @Metadata(m31664d1 = {"\u0000\u0004\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001H\u008a@"}, m31665d2 = {"<anonymous>", "T"}, m31666k = 3, m31667mv = {1, 8, 0}, m31669xi = 48)
    @InterfaceC10344f(m39663c = "androidx.datastore.core.DataStoreImpl$transformAndWrite$2", m39664f = "DataStoreImpl.kt", m39665l = {330, 331, 337}, m39666m = "invokeSuspend")
    public static final class s extends AbstractC10351m implements Function1<InterfaceC9557b<? super T>, Object> {

        /* JADX INFO: renamed from: t */
        public Object f40704t;

        /* JADX INFO: renamed from: u */
        public int f40705u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ C11494k<T> f40706v;

        /* JADX INFO: renamed from: w */
        public final /* synthetic */ CoroutineContext f40707w;

        /* JADX INFO: renamed from: x */
        public final /* synthetic */ Function2<T, InterfaceC9557b<? super T>, Object> f40708x;

        /* JADX INFO: renamed from: t3.k$s$a */
        @Metadata(m31664d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, m31665d2 = {"T", "Lku/p0;", "<anonymous>"}, m31666k = 3, m31667mv = {1, 8, 0})
        @InterfaceC10344f(m39663c = "androidx.datastore.core.DataStoreImpl$transformAndWrite$2$newData$1", m39664f = "DataStoreImpl.kt", m39665l = {331}, m39666m = "invokeSuspend")
        public static final class a extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super T>, Object> {

            /* JADX INFO: renamed from: t */
            public int f40709t;

            /* JADX INFO: renamed from: u */
            public final /* synthetic */ Function2<T, InterfaceC9557b<? super T>, Object> f40710u;

            /* JADX INFO: renamed from: v */
            public final /* synthetic */ C11484f<T> f40711v;

            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function2<? super T, ? super nt.b<? super T>, ? extends java.lang.Object> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(Function2<? super T, ? super InterfaceC9557b<? super T>, ? extends Object> function2, C11484f<T> c11484f, InterfaceC9557b<? super a> interfaceC9557b) {
                super(2, interfaceC9557b);
                this.f40710u = function2;
                this.f40711v = c11484f;
            }

            @Override // pt.AbstractC10339a
            @NotNull
            public final InterfaceC9557b<Unit> create(@Nullable Object obj, @NotNull InterfaceC9557b<?> interfaceC9557b) {
                return new a(this.f40710u, this.f40711v, interfaceC9557b);
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
            @Override // pt.AbstractC10339a
            @org.jetbrains.annotations.Nullable
            public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r4) {
                /*
                    r3 = this;
                    java.lang.Object r0 = p344ot.C10047c.m38805e()
                    int r1 = r3.f40709t
                    r2 = 1
                    if (r1 == 0) goto L17
                    if (r1 != r2) goto Lf
                    p229jt.C7348o.m30470b(r4)
                    return r4
                Lf:
                    java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r4.<init>(r0)
                    throw r4
                L17:
                    p229jt.C7348o.m30470b(r4)
                    kotlin.jvm.functions.Function2<T, nt.b<? super T>, java.lang.Object> r4 = r3.f40710u
                    t3.f<T> r1 = r3.f40711v
                    java.lang.Object r1 = r1.m42976c()
                    r3.f40709t = r2
                    java.lang.Object r4 = r4.invoke(r1, r3)
                    if (r4 != r0) goto L2b
                    return r0
                L2b:
                    return r4
                */
                throw new UnsupportedOperationException("Method not decompiled: p440t3.C11494k.s.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull InterfaceC7906p0 interfaceC7906p0, @Nullable InterfaceC9557b<? super T> interfaceC9557b) {
                return ((a) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function2<? super T, ? super nt.b<? super T>, ? extends java.lang.Object> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public s(C11494k<T> c11494k, CoroutineContext coroutineContext, Function2<? super T, ? super InterfaceC9557b<? super T>, ? extends Object> function2, InterfaceC9557b<? super s> interfaceC9557b) {
            super(1, interfaceC9557b);
            this.f40706v = c11494k;
            this.f40707w = coroutineContext;
            this.f40708x = function2;
        }

        @Override // pt.AbstractC10339a
        @NotNull
        public final InterfaceC9557b<Unit> create(@NotNull InterfaceC9557b<?> interfaceC9557b) {
            return new s(this.f40706v, this.f40707w, this.f40708x, interfaceC9557b);
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type nt.b to t3.k$s for r8v1 'this'  nt.b
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // pt.AbstractC10339a
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = p344ot.C10047c.m38805e()
                int r1 = r8.f40705u
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L2b
                if (r1 == r4) goto L27
                if (r1 == r3) goto L1f
                if (r1 != r2) goto L17
                java.lang.Object r0 = r8.f40704t
                p229jt.C7348o.m30470b(r9)
                return r0
            L17:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L1f:
                java.lang.Object r1 = r8.f40704t
                t3.f r1 = (p440t3.C11484f) r1
                p229jt.C7348o.m30470b(r9)
                goto L51
            L27:
                p229jt.C7348o.m30470b(r9)
                goto L39
            L2b:
                p229jt.C7348o.m30470b(r9)
                t3.k<T> r9 = r8.f40706v
                r8.f40705u = r4
                java.lang.Object r9 = p440t3.C11494k.m43008n(r9, r4, r8)
                if (r9 != r0) goto L39
                goto L6a
            L39:
                r1 = r9
                t3.f r1 = (p440t3.C11484f) r1
                kotlin.coroutines.CoroutineContext r9 = r8.f40707w
                t3.k$s$a r5 = new t3.k$s$a
                kotlin.jvm.functions.Function2<T, nt.b<? super T>, java.lang.Object> r6 = r8.f40708x
                r7 = 0
                r5.<init>(r6, r1, r7)
                r8.f40704t = r1
                r8.f40705u = r3
                java.lang.Object r9 = p256ku.C7872i.m32684g(r9, r5, r8)
                if (r9 != r0) goto L51
                goto L6a
            L51:
                r1.m42975b()
                java.lang.Object r1 = r1.m42976c()
                boolean r1 = kotlin.jvm.internal.Intrinsics.m31980c(r1, r9)
                if (r1 != 0) goto L6b
                t3.k<T> r1 = r8.f40706v
                r8.f40704t = r9
                r8.f40705u = r2
                java.lang.Object r1 = r1.m43011B(r9, r4, r8)
                if (r1 != r0) goto L6b
            L6a:
                return r0
            L6b:
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: p440t3.C11494k.s.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Nullable InterfaceC9557b<? super T> interfaceC9557b) {
            return ((s) create(interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: t3.k$t */
    @Metadata(m31664d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, m31665d2 = {"T", "Lku/p0;", "<anonymous>"}, m31666k = 3, m31667mv = {1, 8, 0})
    @InterfaceC10344f(m39663c = "androidx.datastore.core.DataStoreImpl$updateData$2", m39664f = "DataStoreImpl.kt", m39665l = {169}, m39666m = "invokeSuspend")
    public static final class t extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super T>, Object> {

        /* JADX INFO: renamed from: t */
        public int f40712t;

        /* JADX INFO: renamed from: u */
        public /* synthetic */ Object f40713u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ C11494k<T> f40714v;

        /* JADX INFO: renamed from: w */
        public final /* synthetic */ Function2<T, InterfaceC9557b<? super T>, Object> f40715w;

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function2<? super T, ? super nt.b<? super T>, ? extends java.lang.Object> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public t(C11494k<T> c11494k, Function2<? super T, ? super InterfaceC9557b<? super T>, ? extends Object> function2, InterfaceC9557b<? super t> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f40714v = c11494k;
            this.f40715w = function2;
        }

        @Override // pt.AbstractC10339a
        @NotNull
        public final InterfaceC9557b<Unit> create(@Nullable Object obj, @NotNull InterfaceC9557b<?> interfaceC9557b) {
            t tVar = new t(this.f40714v, this.f40715w, interfaceC9557b);
            tVar.f40713u = obj;
            return tVar;
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f40712t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
                return obj;
            }
            C7348o.m30470b(obj);
            InterfaceC7906p0 interfaceC7906p0 = (InterfaceC7906p0) this.f40713u;
            InterfaceC7937x interfaceC7937xM32935c = C7945z.m32935c(null, 1, null);
            this.f40714v.writeActor.m42964e(new AbstractC11507w.a(this.f40715w, interfaceC7937xM32935c, this.f40714v.inMemoryCache.m43047a(), interfaceC7906p0.getCoroutineContext()));
            this.f40712t = 1;
            Object objMo32927B = interfaceC7937xM32935c.mo32927B(this);
            return objMo32927B == objM38805e ? objM38805e : objMo32927B;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull InterfaceC7906p0 interfaceC7906p0, @Nullable InterfaceC9557b<? super T> interfaceC9557b) {
            return ((t) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: t3.k$u */
    @Metadata(m31664d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m31665d2 = {"T", "", "it", "", "a", "(Ljava/lang/Throwable;)V"}, m31666k = 3, m31667mv = {1, 8, 0})
    public static final class u extends AbstractC7746m implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ C11494k<T> f40716i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(C11494k<T> c11494k) {
            super(1);
            this.f40716i = c11494k;
        }

        /* JADX INFO: renamed from: a */
        public final void m43042a(@Nullable Throwable th2) {
            if (th2 != null) {
                this.f40716i.inMemoryCache.m43049c(new C11502r(th2));
            }
            if (this.f40716i.storageConnectionDelegate.isInitialized()) {
                this.f40716i.m43015s().close();
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            m43042a(th2);
            return Unit.f29331a;
        }
    }

    /* JADX INFO: renamed from: t3.k$v */
    @Metadata(m31664d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m31665d2 = {"T", "Lt3/w$a;", NotificationCompat.CATEGORY_MESSAGE, "", "ex", "", "a", "(Lt3/w$a;Ljava/lang/Throwable;)V"}, m31666k = 3, m31667mv = {1, 8, 0})
    public static final class v extends AbstractC7746m implements Function2<AbstractC11507w.a<T>, Throwable, Unit> {

        /* JADX INFO: renamed from: i */
        public static final v f40717i = new v();

        public v() {
            super(2);
        }

        /* JADX INFO: renamed from: a */
        public final void m43043a(@NotNull AbstractC11507w.a<T> msg, @Nullable Throwable th2) {
            Intrinsics.checkNotNullParameter(msg, "msg");
            InterfaceC7937x<T> interfaceC7937xM43067a = msg.m43067a();
            if (th2 == null) {
                th2 = new CancellationException("DataStore scope was cancelled before updateData could complete");
            }
            interfaceC7937xM43067a.mo32929r(th2);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Object obj, Throwable th2) {
            m43043a((AbstractC11507w.a) obj, th2);
            return Unit.f29331a;
        }
    }

    /* JADX INFO: renamed from: t3.k$w */
    @Metadata(m31664d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m31665d2 = {"T", "Lt3/w$a;", NotificationCompat.CATEGORY_MESSAGE, "", "<anonymous>", "(Lt3/w$a;)V"}, m31666k = 3, m31667mv = {1, 8, 0})
    @InterfaceC10344f(m39663c = "androidx.datastore.core.DataStoreImpl$writeActor$3", m39664f = "DataStoreImpl.kt", m39665l = {MlKitException.CODE_SCANNER_GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD}, m39666m = "invokeSuspend")
    public static final class w extends AbstractC10351m implements Function2<AbstractC11507w.a<T>, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f40718t;

        /* JADX INFO: renamed from: u */
        public /* synthetic */ Object f40719u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ C11494k<T> f40720v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(C11494k<T> c11494k, InterfaceC9557b<? super w> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f40720v = c11494k;
        }

        @Override // pt.AbstractC10339a
        @NotNull
        public final InterfaceC9557b<Unit> create(@Nullable Object obj, @NotNull InterfaceC9557b<?> interfaceC9557b) {
            w wVar = new w(this.f40720v, interfaceC9557b);
            wVar.f40719u = obj;
            return wVar;
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f40718t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                AbstractC11507w.a aVar = (AbstractC11507w.a) this.f40719u;
                C11494k<T> c11494k = this.f40720v;
                this.f40718t = 1;
                if (c11494k.m43016t(aVar, this) == objM38805e) {
                    return objM38805e;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
            }
            return Unit.f29331a;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull AbstractC11507w.a<T> aVar, @Nullable InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((w) create(aVar, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: t3.k$x */
    @InterfaceC10344f(m39663c = "androidx.datastore.core.DataStoreImpl", m39664f = "DataStoreImpl.kt", m39665l = {348}, m39666m = "writeData$datastore_core_release")
    @Metadata(m31666k = 3, m31667mv = {1, 8, 0}, m31669xi = 48)
    public static final class x extends AbstractC10342d {

        /* JADX INFO: renamed from: t */
        public Object f40721t;

        /* JADX INFO: renamed from: u */
        public /* synthetic */ Object f40722u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ C11494k<T> f40723v;

        /* JADX INFO: renamed from: w */
        public int f40724w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(C11494k<T> c11494k, InterfaceC9557b<? super x> interfaceC9557b) {
            super(interfaceC9557b);
            this.f40723v = c11494k;
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f40722u = obj;
            this.f40724w |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return this.f40723v.m43011B(null, false, this);
        }
    }

    /* JADX INFO: renamed from: t3.k$y */
    @Metadata(m31664d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"T", "Lt3/k0;", "", "<anonymous>", "(Lt3/k0;)V"}, m31666k = 3, m31667mv = {1, 8, 0})
    @InterfaceC10344f(m39663c = "androidx.datastore.core.DataStoreImpl$writeData$2", m39664f = "DataStoreImpl.kt", m39665l = {352, 353}, m39666m = "invokeSuspend")
    public static final class y extends AbstractC10351m implements Function2<InterfaceC11495k0<T>, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public Object f40725t;

        /* JADX INFO: renamed from: u */
        public int f40726u;

        /* JADX INFO: renamed from: v */
        public /* synthetic */ Object f40727v;

        /* JADX INFO: renamed from: w */
        public final /* synthetic */ C7725a0 f40728w;

        /* JADX INFO: renamed from: x */
        public final /* synthetic */ C11494k<T> f40729x;

        /* JADX INFO: renamed from: y */
        public final /* synthetic */ T f40730y;

        /* JADX INFO: renamed from: z */
        public final /* synthetic */ boolean f40731z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(C7725a0 c7725a0, C11494k<T> c11494k, T t8, boolean z10, InterfaceC9557b<? super y> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f40728w = c7725a0;
            this.f40729x = c11494k;
            this.f40730y = t8;
            this.f40731z = z10;
        }

        @Override // pt.AbstractC10339a
        @NotNull
        public final InterfaceC9557b<Unit> create(@Nullable Object obj, @NotNull InterfaceC9557b<?> interfaceC9557b) {
            y yVar = new y(this.f40728w, this.f40729x, this.f40730y, this.f40731z, interfaceC9557b);
            yVar.f40727v = obj;
            return yVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x005a, code lost:
        
            if (r3.mo43046b(r7, r6) == r0) goto L16;
         */
        @Override // pt.AbstractC10339a
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) {
            C7725a0 c7725a0;
            InterfaceC11495k0 interfaceC11495k0;
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f40726u;
            if (i10 != 0) {
                if (i10 == 1) {
                    c7725a0 = (C7725a0) this.f40725t;
                    interfaceC11495k0 = (InterfaceC11495k0) this.f40727v;
                    C7348o.m30470b(obj);
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7348o.m30470b(obj);
                }
                if (this.f40731z) {
                    C11496l c11496l = this.f40729x.inMemoryCache;
                    T t8 = this.f40730y;
                    c11496l.m43049c(new C11484f(t8, t8 != null ? t8.hashCode() : 0, this.f40728w.f29421a));
                }
                return Unit.f29331a;
            }
            C7348o.m30470b(obj);
            InterfaceC11495k0 interfaceC11495k1 = (InterfaceC11495k0) this.f40727v;
            c7725a0 = this.f40728w;
            InterfaceC11504t interfaceC11504tM43014r = this.f40729x.m43014r();
            this.f40727v = interfaceC11495k1;
            this.f40725t = c7725a0;
            this.f40726u = 1;
            Object objMo42970e = interfaceC11504tM43014r.mo42970e(this);
            if (objMo42970e != objM38805e) {
                interfaceC11495k0 = interfaceC11495k1;
                obj = objMo42970e;
            }
            return objM38805e;
            c7725a0.f29421a = ((Number) obj).intValue();
            T t10 = this.f40730y;
            this.f40727v = null;
            this.f40725t = null;
            this.f40726u = 2;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull InterfaceC11495k0<T> interfaceC11495k0, @Nullable InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((y) create(interfaceC11495k0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    public C11494k(@NotNull InterfaceC11483e0<T> storage, @NotNull List<? extends Function2<? super InterfaceC11503s<T>, ? super InterfaceC9557b<? super Unit>, ? extends Object>> initTasksList, @NotNull InterfaceC11482e<T> corruptionHandler, @NotNull InterfaceC7906p0 scope) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(initTasksList, "initTasksList");
        Intrinsics.checkNotNullParameter(corruptionHandler, "corruptionHandler");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.storage = storage;
        this.corruptionHandler = corruptionHandler;
        this.scope = scope;
        this.data = C9579j.m37806w(new d(this, null));
        this.collectorMutex = C11976g.m44697b(false, 1, null);
        this.inMemoryCache = new C11496l<>();
        this.readAndInit = new b(this, initTasksList);
        this.storageConnectionDelegate = C7342i.m30456b(new r(this));
        this.coordinator = C7342i.m30456b(new c(this));
        this.writeActor = new C11477b0<>(scope, new u(this), v.f40717i, new w(this, null));
    }

    /* JADX INFO: renamed from: A */
    public final Object m43010A(Function2<? super T, ? super InterfaceC9557b<? super T>, ? extends Object> function2, CoroutineContext coroutineContext, InterfaceC9557b<? super T> interfaceC9557b) {
        return m43014r().mo42967b(new s(this, coroutineContext, function2, null), interfaceC9557b);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: B */
    public final Object m43011B(T t8, boolean z10, @NotNull InterfaceC9557b<? super Integer> interfaceC9557b) {
        x xVar;
        C7725a0 c7725a0;
        if (interfaceC9557b instanceof x) {
            xVar = (x) interfaceC9557b;
            int i10 = xVar.f40724w;
            if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                xVar.f40724w = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                xVar = new x(this, interfaceC9557b);
            }
        } else {
            xVar = new x(this, interfaceC9557b);
        }
        Object obj = xVar.f40722u;
        Object objM38805e = C10047c.m38805e();
        int i11 = xVar.f40724w;
        if (i11 == 0) {
            C7348o.m30470b(obj);
            C7725a0 c7725a1 = new C7725a0();
            InterfaceC11485f0<T> interfaceC11485f0M43015s = m43015s();
            y yVar = new y(c7725a1, this, t8, z10, null);
            xVar.f40721t = c7725a1;
            xVar.f40724w = 1;
            if (interfaceC11485f0M43015s.mo42977c(yVar, xVar) == objM38805e) {
                return objM38805e;
            }
            c7725a0 = c7725a1;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c7725a0 = (C7725a0) xVar.f40721t;
            C7348o.m30470b(obj);
        }
        return C10340b.m39661d(c7725a0.f29421a);
    }

    @Override // p440t3.InterfaceC11490i
    @Nullable
    /* JADX INFO: renamed from: a */
    public Object mo42991a(@NotNull Function2<? super T, ? super InterfaceC9557b<? super T>, ? extends Object> function2, @NotNull InterfaceC9557b<? super T> interfaceC9557b) {
        C11493j0 c11493j0 = (C11493j0) interfaceC9557b.getContext().get(C11493j0.Companion.C14252a.f40581a);
        if (c11493j0 != null) {
            c11493j0.m42995a(this);
        }
        return C7872i.m32684g(new C11493j0(c11493j0, this), new t(this, function2, null), interfaceC9557b);
    }

    @Override // p440t3.InterfaceC11490i
    @NotNull
    public InterfaceC9575h<T> getData() {
        return this.data;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: p */
    public final Object m43012p(InterfaceC9557b<? super Unit> interfaceC9557b) {
        e eVar;
        C11494k<T> c11494k;
        InterfaceC11970a interfaceC11970a;
        if (interfaceC9557b instanceof e) {
            eVar = (e) interfaceC9557b;
            int i10 = eVar.f40645x;
            if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                eVar.f40645x = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                eVar = new e(this, interfaceC9557b);
            }
        } else {
            eVar = new e(this, interfaceC9557b);
        }
        Object obj = eVar.f40643v;
        Object objM38805e = C10047c.m38805e();
        int i11 = eVar.f40645x;
        if (i11 == 0) {
            C7348o.m30470b(obj);
            InterfaceC11970a interfaceC11970a2 = this.collectorMutex;
            eVar.f40641t = this;
            eVar.f40642u = interfaceC11970a2;
            eVar.f40645x = 1;
            if (interfaceC11970a2.mo44674f(null, eVar) == objM38805e) {
                return objM38805e;
            }
            c11494k = this;
            interfaceC11970a = interfaceC11970a2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC11970a = (InterfaceC11970a) eVar.f40642u;
            c11494k = (C11494k) eVar.f40641t;
            C7348o.m30470b(obj);
        }
        try {
            int i12 = c11494k.collectorCounter - 1;
            c11494k.collectorCounter = i12;
            if (i12 == 0) {
                InterfaceC7850d2 interfaceC7850d2 = c11494k.collectorJob;
                if (interfaceC7850d2 != null) {
                    InterfaceC7850d2.a.m32603a(interfaceC7850d2, null, 1, null);
                }
                c11494k.collectorJob = null;
            }
            Unit unit = Unit.f29331a;
            return Unit.f29331a;
        } finally {
            interfaceC11970a.mo44673e(null);
        }
    }

    /* JADX INFO: renamed from: q */
    public final <R> Object m43013q(boolean z10, Function1<? super InterfaceC9557b<? super R>, ? extends Object> function1, InterfaceC9557b<? super R> interfaceC9557b) {
        return z10 ? function1.invoke(interfaceC9557b) : m43014r().mo42967b(new f(function1, null), interfaceC9557b);
    }

    /* JADX INFO: renamed from: r */
    public final InterfaceC11504t m43014r() {
        return (InterfaceC11504t) this.coordinator.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public final InterfaceC11485f0<T> m43015s() {
        return this.storageConnectionDelegate.getValue();
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:16:0x0034 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:59:0x0023 */
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
    /* JADX INFO: renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m43016t(AbstractC11507w.a<T> aVar, InterfaceC9557b<? super Unit> interfaceC9557b) {
        g gVar;
        Object objM30460b;
        ?? r10;
        InterfaceC7937x<T> interfaceC7937xM43067a;
        ?? r8;
        Object objM43010A;
        AbstractC11507w.a<T> aVar2;
        if (interfaceC9557b instanceof g) {
            gVar = (g) interfaceC9557b;
            int i10 = gVar.f40653y;
            if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                gVar.f40653y = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                gVar = new g(this, interfaceC9557b);
            }
        } else {
            gVar = new g(this, interfaceC9557b);
        }
        Object obj = gVar.f40651w;
        Object objM38805e = C10047c.m38805e();
        int i11 = gVar.f40653y;
        boolean z10 = true;
        try {
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        InterfaceC7937x<T> interfaceC7937x = (InterfaceC7937x) gVar.f40650v;
                        C11494k c11494k = (C11494k) gVar.f40649u;
                        AbstractC11507w.a<T> aVar3 = (AbstractC11507w.a) gVar.f40648t;
                        C7348o.m30470b(obj);
                        interfaceC7937xM43067a = interfaceC7937x;
                        r8 = c11494k;
                        aVar2 = aVar3;
                    } else if (i11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
                AbstractC11507w.a<T> aVar4 = (AbstractC11507w.a<T>) ((InterfaceC7937x) gVar.f40648t);
                C7348o.m30470b(obj);
                aVar = aVar4;
                objM30460b = C7347n.m30460b(obj);
                r10 = aVar;
                C7945z.m32936d(r10, objM30460b);
                return Unit.f29331a;
            }
            C7348o.m30470b(obj);
            interfaceC7937xM43067a = aVar.m43067a();
            try {
                C7347n.Companion companion = C7347n.INSTANCE;
                AbstractC11481d0<T> abstractC11481d0M43047a = this.inMemoryCache.m43047a();
                if (abstractC11481d0M43047a instanceof C11484f) {
                    Function2<T, InterfaceC9557b<? super T>, Object> function2M43070d = aVar.m43070d();
                    CoroutineContext callerContext = aVar.getCallerContext();
                    gVar.f40648t = interfaceC7937xM43067a;
                    gVar.f40653y = 1;
                    objM43010A = m43010A(function2M43070d, callerContext, gVar);
                    if (objM43010A == objM38805e) {
                    }
                    InterfaceC7937x<T> interfaceC7937x2 = interfaceC7937xM43067a;
                    obj = objM43010A;
                    aVar = (AbstractC11507w.a<T>) interfaceC7937x2;
                    objM30460b = C7347n.m30460b(obj);
                    r10 = aVar;
                    C7945z.m32936d(r10, objM30460b);
                    return Unit.f29331a;
                }
                if (!(abstractC11481d0M43047a instanceof C11508x)) {
                    z10 = abstractC11481d0M43047a instanceof C11489h0;
                }
                if (!z10) {
                    if (abstractC11481d0M43047a instanceof C11502r) {
                        throw ((C11502r) abstractC11481d0M43047a).getFinalException();
                    }
                    throw new C7345l();
                }
                if (abstractC11481d0M43047a != aVar.m43069c()) {
                    Intrinsics.m31981d(abstractC11481d0M43047a, "null cannot be cast to non-null type androidx.datastore.core.ReadException<T of androidx.datastore.core.DataStoreImpl.handleUpdate$lambda$2>");
                    throw ((C11508x) abstractC11481d0M43047a).getReadException();
                }
                gVar.f40648t = aVar;
                gVar.f40649u = this;
                gVar.f40650v = interfaceC7937xM43067a;
                gVar.f40653y = 2;
                if (m43018v(gVar) != objM38805e) {
                    r8 = this;
                    aVar2 = aVar;
                }
                return objM38805e;
            } catch (Throwable th2) {
                th = th2;
                aVar = interfaceC7937xM43067a;
                C7347n.Companion companion2 = C7347n.INSTANCE;
                objM30460b = C7347n.m30460b(C7348o.m30469a(th));
                r10 = aVar;
            }
            Function2<T, InterfaceC9557b<? super T>, Object> function2M43070d2 = aVar2.m43070d();
            CoroutineContext callerContext2 = aVar2.getCallerContext();
            gVar.f40648t = interfaceC7937xM43067a;
            gVar.f40649u = null;
            gVar.f40650v = null;
            gVar.f40653y = 3;
            objM43010A = r8.m43010A(function2M43070d2, callerContext2, gVar);
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: u */
    public final Object m43017u(InterfaceC9557b<? super Unit> interfaceC9557b) {
        h hVar;
        C11494k<T> c11494k;
        InterfaceC11970a interfaceC11970a;
        if (interfaceC9557b instanceof h) {
            hVar = (h) interfaceC9557b;
            int i10 = hVar.f40658x;
            if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                hVar.f40658x = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                hVar = new h(this, interfaceC9557b);
            }
        } else {
            hVar = new h(this, interfaceC9557b);
        }
        Object obj = hVar.f40656v;
        Object objM38805e = C10047c.m38805e();
        int i11 = hVar.f40658x;
        if (i11 == 0) {
            C7348o.m30470b(obj);
            InterfaceC11970a interfaceC11970a2 = this.collectorMutex;
            hVar.f40654t = this;
            hVar.f40655u = interfaceC11970a2;
            hVar.f40658x = 1;
            if (interfaceC11970a2.mo44674f(null, hVar) == objM38805e) {
                return objM38805e;
            }
            c11494k = this;
            interfaceC11970a = interfaceC11970a2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC11970a = (InterfaceC11970a) hVar.f40655u;
            c11494k = (C11494k) hVar.f40654t;
            C7348o.m30470b(obj);
        }
        try {
            int i12 = c11494k.collectorCounter + 1;
            c11494k.collectorCounter = i12;
            if (i12 == 1) {
                c11494k.collectorJob = C7882k.m32780d(c11494k.scope, null, null, new i(c11494k, null), 3, null);
            }
            Unit unit = Unit.f29331a;
            return Unit.f29331a;
        } finally {
            interfaceC11970a.mo44673e(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0069, code lost:
    
        if (r4.m43073c(r0) == r1) goto L27;
     */
    /* JADX INFO: renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m43018v(InterfaceC9557b<? super Unit> interfaceC9557b) throws Throwable {
        j jVar;
        C11494k<T> c11494k;
        int iIntValue;
        int i10;
        Throwable th2;
        C11494k<T> c11494k2;
        if (interfaceC9557b instanceof j) {
            jVar = (j) interfaceC9557b;
            int i11 = jVar.f40666x;
            if ((i11 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                jVar.f40666x = i11 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                jVar = new j(this, interfaceC9557b);
            }
        } else {
            jVar = new j(this, interfaceC9557b);
        }
        Object objMo42968c = jVar.f40664v;
        Object objM38805e = C10047c.m38805e();
        int i12 = jVar.f40666x;
        try {
            if (i12 == 0) {
                C7348o.m30470b(objMo42968c);
                InterfaceC11504t interfaceC11504tM43014r = m43014r();
                jVar.f40662t = this;
                jVar.f40666x = 1;
                objMo42968c = interfaceC11504tM43014r.mo42968c(jVar);
                if (objMo42968c != objM38805e) {
                    c11494k = this;
                }
                return objM38805e;
            }
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i10 = jVar.f40663u;
                c11494k2 = (C11494k) jVar.f40662t;
                try {
                    C7348o.m30470b(objMo42968c);
                    return Unit.f29331a;
                } catch (Throwable th3) {
                    th2 = th3;
                    c11494k2.inMemoryCache.m43049c(new C11508x(th2, i10));
                    throw th2;
                }
            }
            c11494k = (C11494k) jVar.f40662t;
            C7348o.m30470b(objMo42968c);
            C11494k<T>.b bVar = c11494k.readAndInit;
            jVar.f40662t = c11494k;
            jVar.f40663u = iIntValue;
            jVar.f40666x = 2;
        } catch (Throwable th4) {
            i10 = iIntValue;
            th2 = th4;
            c11494k2 = c11494k;
            c11494k2.inMemoryCache.m43049c(new C11508x(th2, i10));
            throw th2;
        }
        iIntValue = ((Number) objMo42968c).intValue();
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a7, code lost:
    
        if (r11 == r1) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c0, code lost:
    
        if (r11 == r1) goto L39;
     */
    /* JADX INFO: renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m43019w(boolean z10, InterfaceC9557b<? super AbstractC11481d0<T>> interfaceC9557b) {
        k kVar;
        AbstractC11481d0<T> abstractC11481d0;
        Object obj;
        boolean z11;
        C11494k<T> c11494k;
        Pair pair;
        AbstractC11481d0<T> abstractC11481d1;
        if (interfaceC9557b instanceof k) {
            kVar = (k) interfaceC9557b;
            int i10 = kVar.f40672y;
            if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                kVar.f40672y = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                kVar = new k(this, interfaceC9557b);
            }
        } else {
            kVar = new k(this, interfaceC9557b);
        }
        Object objMo42969d = kVar.f40670w;
        Object objM38805e = C10047c.m38805e();
        int i11 = kVar.f40672y;
        if (i11 == 0) {
            C7348o.m30470b(objMo42969d);
            AbstractC11481d0<T> abstractC11481d0M43047a = this.inMemoryCache.m43047a();
            if (abstractC11481d0M43047a instanceof C11489h0) {
                throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
            }
            InterfaceC11504t interfaceC11504tM43014r = m43014r();
            kVar.f40667t = this;
            kVar.f40668u = abstractC11481d0M43047a;
            kVar.f40669v = z10;
            kVar.f40672y = 1;
            Object objMo42968c = interfaceC11504tM43014r.mo42968c(kVar);
            if (objMo42968c != objM38805e) {
                abstractC11481d0 = abstractC11481d0M43047a;
                obj = objMo42968c;
                z11 = z10;
                c11494k = this;
            }
            return objM38805e;
        }
        if (i11 != 1) {
            if (i11 == 2) {
                c11494k = (C11494k) kVar.f40667t;
                C7348o.m30470b(objMo42969d);
                pair = (Pair) objMo42969d;
                abstractC11481d1 = (AbstractC11481d0) pair.m31671a();
                if (((Boolean) pair.m31672b()).booleanValue()) {
                    c11494k.inMemoryCache.m43049c(abstractC11481d1);
                }
                return abstractC11481d1;
            }
            if (i11 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c11494k = (C11494k) kVar.f40667t;
            C7348o.m30470b(objMo42969d);
            pair = (Pair) objMo42969d;
            abstractC11481d1 = (AbstractC11481d0) pair.m31671a();
            if (((Boolean) pair.m31672b()).booleanValue()) {
                c11494k.inMemoryCache.m43049c(abstractC11481d1);
            }
            return abstractC11481d1;
        }
        boolean z12 = kVar.f40669v;
        AbstractC11481d0<T> abstractC11481d2 = (AbstractC11481d0) kVar.f40668u;
        C11494k<T> c11494k2 = (C11494k) kVar.f40667t;
        C7348o.m30470b(objMo42969d);
        z11 = z12;
        c11494k = c11494k2;
        abstractC11481d0 = abstractC11481d2;
        obj = objMo42969d;
        int iIntValue = ((Number) obj).intValue();
        boolean z13 = abstractC11481d0 instanceof C11484f;
        int version = z13 ? abstractC11481d0.getVersion() : -1;
        if (z13 && iIntValue == version) {
            return abstractC11481d0;
        }
        if (z11) {
            InterfaceC11504t interfaceC11504tM43014r2 = c11494k.m43014r();
            l lVar = new l(c11494k, null);
            kVar.f40667t = c11494k;
            kVar.f40668u = null;
            kVar.f40672y = 2;
            objMo42969d = interfaceC11504tM43014r2.mo42967b(lVar, kVar);
        } else {
            InterfaceC11504t interfaceC11504tM43014r3 = c11494k.m43014r();
            m mVar = new m(c11494k, version, null);
            kVar.f40667t = c11494k;
            kVar.f40668u = null;
            kVar.f40672y = 3;
            objMo42969d = interfaceC11504tM43014r3.mo42969d(mVar, kVar);
        }
        return objM38805e;
    }

    /* JADX INFO: renamed from: x */
    public final Object m43020x(InterfaceC9557b<? super T> interfaceC9557b) {
        return C11487g0.m42983a(m43015s(), interfaceC9557b);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:88:? */
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
    /* JADX INFO: renamed from: y */
    public final Object m43021y(boolean z10, InterfaceC9557b<? super C11484f<T>> interfaceC9557b) throws C11480d {
        n nVar;
        ?? r8;
        C7729c0 c7729c0;
        Object objMo42973a;
        C11480d c11480d;
        C7729c0 c7729c1;
        ?? r10;
        C7725a0 c7725a0;
        C11480d c11480d2;
        p pVar;
        C7725a0 c7725a1;
        C7729c0 c7729c2;
        ?? r11;
        ?? r12;
        int iHashCode;
        Object objMo42968c;
        boolean z11;
        int i10;
        Object obj;
        ?? r13;
        ?? r14;
        if (interfaceC9557b instanceof n) {
            nVar = (n) interfaceC9557b;
            int i11 = nVar.f40682B;
            if ((i11 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                nVar.f40682B = i11 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                nVar = new n(this, interfaceC9557b);
            }
        } else {
            nVar = new n(this, interfaceC9557b);
        }
        Object obj2 = (T) nVar.f40689z;
        Object objM38805e = C10047c.m38805e();
        ?? r15 = nVar.f40682B;
        try {
            switch (r15) {
                case 0:
                    C7348o.m30470b(obj2);
                    try {
                        if (z10) {
                            nVar.f40683t = this;
                            nVar.f40687x = z10;
                            nVar.f40682B = 1;
                            obj2 = (T) m43020x(nVar);
                            if (obj2 != objM38805e) {
                                r12 = this;
                                if (obj2 != null) {
                                    try {
                                        iHashCode = obj2.hashCode();
                                    } catch (C11480d e10) {
                                        e = e10;
                                        r13 = r12;
                                        r8 = r13;
                                        c7729c0 = new C7729c0();
                                        InterfaceC11482e<T> interfaceC11482e = r8.corruptionHandler;
                                        nVar.f40683t = r8;
                                        nVar.f40684u = e;
                                        nVar.f40685v = c7729c0;
                                        nVar.f40686w = c7729c0;
                                        nVar.f40687x = z10;
                                        nVar.f40682B = 5;
                                        objMo42973a = interfaceC11482e.mo42973a(e, nVar);
                                        if (objMo42973a != objM38805e) {
                                            c11480d = e;
                                            obj2 = (T) objMo42973a;
                                            c7729c1 = c7729c0;
                                            r10 = r8;
                                            c7729c1.f29425a = (T) obj2;
                                            c7725a0 = new C7725a0();
                                            try {
                                                pVar = new p(c7729c0, r10, c7725a0, null);
                                                nVar.f40683t = c11480d;
                                                nVar.f40684u = c7729c0;
                                                nVar.f40685v = c7725a0;
                                                nVar.f40686w = null;
                                                nVar.f40682B = 6;
                                                if (r10.m43013q(z10, pVar, nVar) != objM38805e) {
                                                    c7725a1 = c7725a0;
                                                    c7729c2 = c7729c0;
                                                    T t8 = c7729c2.f29425a;
                                                    return new C11484f(t8, t8 != null ? t8.hashCode() : 0, c7725a1.f29421a);
                                                }
                                            } catch (Throwable th2) {
                                                th = th2;
                                                c11480d2 = c11480d;
                                                C7328a.m30429a(c11480d2, th);
                                                throw c11480d2;
                                            }
                                        }
                                    }
                                } else {
                                    iHashCode = 0;
                                }
                                InterfaceC11504t interfaceC11504tM43014r = r12.m43014r();
                                nVar.f40683t = r12;
                                nVar.f40684u = obj2;
                                nVar.f40687x = z10;
                                nVar.f40688y = iHashCode;
                                nVar.f40682B = 2;
                                objMo42968c = interfaceC11504tM43014r.mo42968c(nVar);
                                if (objMo42968c != objM38805e) {
                                    int i12 = iHashCode;
                                    z11 = z10;
                                    i10 = i12;
                                    obj = obj2;
                                    obj2 = (T) objMo42968c;
                                    r14 = r12;
                                    return new C11484f(obj, i10, ((Number) obj2).intValue());
                                }
                            }
                        } else {
                            InterfaceC11504t interfaceC11504tM43014r2 = m43014r();
                            nVar.f40683t = this;
                            nVar.f40687x = z10;
                            nVar.f40682B = 3;
                            obj2 = (T) interfaceC11504tM43014r2.mo42968c(nVar);
                            if (obj2 != objM38805e) {
                                r11 = this;
                                int iIntValue = ((Number) obj2).intValue();
                                InterfaceC11504t interfaceC11504tM43014r3 = r11.m43014r();
                                o oVar = new o(r11, iIntValue, null);
                                nVar.f40683t = r11;
                                nVar.f40687x = z10;
                                nVar.f40682B = 4;
                                obj2 = (T) interfaceC11504tM43014r3.mo42969d(oVar, nVar);
                                if (obj2 == objM38805e) {
                                }
                                return (C11484f) obj2;
                            }
                        }
                    } catch (C11480d e11) {
                        e = e11;
                        r8 = this;
                        c7729c0 = new C7729c0();
                        InterfaceC11482e<T> interfaceC11482e2 = r8.corruptionHandler;
                        nVar.f40683t = r8;
                        nVar.f40684u = e;
                        nVar.f40685v = c7729c0;
                        nVar.f40686w = c7729c0;
                        nVar.f40687x = z10;
                        nVar.f40682B = 5;
                        objMo42973a = interfaceC11482e2.mo42973a(e, nVar);
                        if (objMo42973a != objM38805e) {
                            c11480d = e;
                            obj2 = (T) objMo42973a;
                            c7729c1 = c7729c0;
                            r10 = r8;
                            c7729c1.f29425a = (T) obj2;
                            c7725a0 = new C7725a0();
                            pVar = new p(c7729c0, r10, c7725a0, null);
                            nVar.f40683t = c11480d;
                            nVar.f40684u = c7729c0;
                            nVar.f40685v = c7725a0;
                            nVar.f40686w = null;
                            nVar.f40682B = 6;
                            if (r10.m43013q(z10, pVar, nVar) != objM38805e) {
                                c7725a1 = c7725a0;
                                c7729c2 = c7729c0;
                                T t10 = c7729c2.f29425a;
                                return new C11484f(t10, t10 != null ? t10.hashCode() : 0, c7725a1.f29421a);
                            }
                        }
                    }
                    return objM38805e;
                case 1:
                    z10 = nVar.f40687x;
                    C11494k c11494k = (C11494k) nVar.f40683t;
                    C7348o.m30470b(obj2);
                    r12 = c11494k;
                    if (obj2 != null) {
                        iHashCode = obj2.hashCode();
                    } else {
                        iHashCode = 0;
                    }
                    InterfaceC11504t interfaceC11504tM43014r4 = r12.m43014r();
                    nVar.f40683t = r12;
                    nVar.f40684u = obj2;
                    nVar.f40687x = z10;
                    nVar.f40688y = iHashCode;
                    nVar.f40682B = 2;
                    objMo42968c = interfaceC11504tM43014r4.mo42968c(nVar);
                    if (objMo42968c != objM38805e) {
                        int i13 = iHashCode;
                        z11 = z10;
                        i10 = i13;
                        obj = obj2;
                        obj2 = (T) objMo42968c;
                        r14 = r12;
                        return new C11484f(obj, i10, ((Number) obj2).intValue());
                    }
                    return objM38805e;
                case 2:
                    i10 = nVar.f40688y;
                    z11 = nVar.f40687x;
                    obj = nVar.f40684u;
                    r14 = (C11494k) nVar.f40683t;
                    try {
                        C7348o.m30470b(obj2);
                        r14 = r14;
                        return new C11484f(obj, i10, ((Number) obj2).intValue());
                    } catch (C11480d e12) {
                        e = e12;
                        z10 = z11;
                        r13 = r14;
                        r8 = r13;
                        c7729c0 = new C7729c0();
                        InterfaceC11482e<T> interfaceC11482e3 = r8.corruptionHandler;
                        nVar.f40683t = r8;
                        nVar.f40684u = e;
                        nVar.f40685v = c7729c0;
                        nVar.f40686w = c7729c0;
                        nVar.f40687x = z10;
                        nVar.f40682B = 5;
                        objMo42973a = interfaceC11482e3.mo42973a(e, nVar);
                        if (objMo42973a != objM38805e) {
                            c11480d = e;
                            obj2 = (T) objMo42973a;
                            c7729c1 = c7729c0;
                            r10 = r8;
                            c7729c1.f29425a = (T) obj2;
                            c7725a0 = new C7725a0();
                            pVar = new p(c7729c0, r10, c7725a0, null);
                            nVar.f40683t = c11480d;
                            nVar.f40684u = c7729c0;
                            nVar.f40685v = c7725a0;
                            nVar.f40686w = null;
                            nVar.f40682B = 6;
                            if (r10.m43013q(z10, pVar, nVar) != objM38805e) {
                                c7725a1 = c7725a0;
                                c7729c2 = c7729c0;
                                T t11 = c7729c2.f29425a;
                                return new C11484f(t11, t11 != null ? t11.hashCode() : 0, c7725a1.f29421a);
                            }
                        }
                        return objM38805e;
                    }
                case 3:
                    z10 = nVar.f40687x;
                    C11494k c11494k2 = (C11494k) nVar.f40683t;
                    C7348o.m30470b(obj2);
                    r11 = c11494k2;
                    int iIntValue2 = ((Number) obj2).intValue();
                    InterfaceC11504t interfaceC11504tM43014r5 = r11.m43014r();
                    o oVar2 = new o(r11, iIntValue2, null);
                    nVar.f40683t = r11;
                    nVar.f40687x = z10;
                    nVar.f40682B = 4;
                    obj2 = (T) interfaceC11504tM43014r5.mo42969d(oVar2, nVar);
                    if (obj2 == objM38805e) {
                        return objM38805e;
                    }
                    return (C11484f) obj2;
                case 4:
                    boolean z12 = nVar.f40687x;
                    C7348o.m30470b(obj2);
                    return (C11484f) obj2;
                case 5:
                    z10 = nVar.f40687x;
                    C7729c0 c7729c3 = (C7729c0) nVar.f40686w;
                    C7729c0 c7729c4 = (C7729c0) nVar.f40685v;
                    c11480d = (C11480d) nVar.f40684u;
                    C11494k c11494k3 = (C11494k) nVar.f40683t;
                    C7348o.m30470b(obj2);
                    c7729c1 = c7729c3;
                    c7729c0 = c7729c4;
                    r10 = c11494k3;
                    c7729c1.f29425a = (T) obj2;
                    c7725a0 = new C7725a0();
                    pVar = new p(c7729c0, r10, c7725a0, null);
                    nVar.f40683t = c11480d;
                    nVar.f40684u = c7729c0;
                    nVar.f40685v = c7725a0;
                    nVar.f40686w = null;
                    nVar.f40682B = 6;
                    if (r10.m43013q(z10, pVar, nVar) != objM38805e) {
                        c7725a1 = c7725a0;
                        c7729c2 = c7729c0;
                        T t12 = c7729c2.f29425a;
                        return new C11484f(t12, t12 != null ? t12.hashCode() : 0, c7725a1.f29421a);
                    }
                    return objM38805e;
                case 6:
                    c7725a1 = (C7725a0) nVar.f40685v;
                    c7729c2 = (C7729c0) nVar.f40684u;
                    c11480d2 = (C11480d) nVar.f40683t;
                    try {
                        C7348o.m30470b(obj2);
                        T t13 = c7729c2.f29425a;
                        return new C11484f(t13, t13 != null ? t13.hashCode() : 0, c7725a1.f29421a);
                    } catch (Throwable th3) {
                        th = th3;
                        C7328a.m30429a(c11480d2, th);
                        throw c11480d2;
                    }
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } catch (C11480d e13) {
            e = e13;
            r8 = r15;
        }
    }

    /* JADX INFO: renamed from: z */
    public final Object m43022z(boolean z10, InterfaceC9557b<? super AbstractC11481d0<T>> interfaceC9557b) {
        return C7872i.m32684g(this.scope.getCoroutineContext(), new q(this, z10, null), interfaceC9557b);
    }
}
