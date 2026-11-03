package x4;

import com.google.mlkit.vision.barcode.common.Barcode;
import iu.CoroutineName;
import iu.p0;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.q0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http.HttpStatusCodesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 !2\u00020\u0001:\u00018Bo\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00070\u0004\u0012\u000e\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0018\u0010\u0010\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u0007\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\t2\u000e\u0010\u0013\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\tH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J \u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b\u0019\u0010\u001aJ \u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b\u001b\u0010\u001aJ\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007H\u0082@¢\u0006\u0004\b\u001c\u0010\u001dJ\u001e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\u0006\u0010\u0017\u001a\u00020\u0016H\u0082@¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010!\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020 ¢\u0006\u0004\b!\u0010\"J9\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00070'2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00050\t2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u000bH\u0000¢\u0006\u0004\b(\u0010)J1\u0010+\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\t\u0012\u0004\u0012\u00020$0*2\u000e\u0010\u0013\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\tH\u0000¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020$H\u0000¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020$H\u0000¢\u0006\u0004\b/\u0010.J\u0010\u00100\u001a\u00020\u000fH\u0080@¢\u0006\u0004\b0\u0010\u001dJ/\u00104\u001a\u00020\u000f2\u000e\b\u0002\u00102\u001a\b\u0012\u0004\u0012\u00020\u000f012\u000e\b\u0002\u00103\u001a\b\u0012\u0004\u0012\u00020\u000f01H\u0000¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\u000fH\u0000¢\u0006\u0004\b6\u00107R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R&\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00070\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010;R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R&\u0010\u0010\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u0007\u0012\u0004\u0012\u00020\u000f0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R \u0010B\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010;R\u001a\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00050\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010I\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010M\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0018\u0010Q\u001a\u00060Nj\u0002`O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010PR(\u0010X\u001a\b\u0012\u0004\u0012\u00020\u000b018\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010W¨\u0006Y"}, d2 = {"Lx4/l0;", "", "Lx4/u;", "database", "", "", "shadowTablesMap", "", "viewTables", "", "tableNames", "", "useTempTable", "Lkotlin/Function1;", "", "", "onInvalidatedTablesIds", "<init>", "(Lx4/u;Ljava/util/Map;Ljava/util/Map;[Ljava/lang/String;ZLkotlin/jvm/functions/Function1;)V", "names", "t", "([Ljava/lang/String;)[Ljava/lang/String;", "Lx4/m;", "connection", "tableId", "v", "(Lx4/m;ILlt/b;)Ljava/lang/Object;", "w", "n", "(Llt/b;)Ljava/lang/Object;", "j", "(Lx4/m;Llt/b;)Ljava/lang/Object;", "Lf5/b;", "l", "(Lf5/b;)V", "resolvedTableNames", "", "tableIds", "emitInitialState", "Llu/h;", "m", "([Ljava/lang/String;[IZ)Llu/h;", "Lkotlin/Pair;", "y", "([Ljava/lang/String;)Lkotlin/Pair;", "p", "([I)Z", "q", "x", "Lkotlin/Function0;", "onRefreshScheduled", "onRefreshCompleted", "r", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "s", "()V", "a", "Lx4/u;", "b", "Ljava/util/Map;", "c", "d", "Z", "e", "Lkotlin/jvm/functions/Function1;", "f", "tableIdLookup", "g", "[Ljava/lang/String;", "tablesNames", "Lx4/k;", "h", "Lx4/k;", "observedTableStates", "Lx4/l;", "i", "Lx4/l;", "observedTableVersions", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Landroidx/room/concurrent/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "pendingRefresh", "k", "Lkotlin/jvm/functions/Function0;", "getOnAllowRefresh$room_runtime", "()Lkotlin/jvm/functions/Function0;", "u", "(Lkotlin/jvm/functions/Function0;)V", "onAllowRefresh", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class l0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public static final String[] f35258m = {"INSERT", "UPDATE", "DELETE"};

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final u database;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Map<String, String> shadowTablesMap;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Map<String, Set<String>> viewTables;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final boolean useTempTable;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Function1<Set<Integer>, Unit> onInvalidatedTablesIds;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Map<String, Integer> tableIdLookup;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String[] tablesNames;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final k observedTableStates;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final l observedTableVersions;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final AtomicBoolean pendingRefresh;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public Function0<Boolean> onAllowRefresh;

    /* JADX INFO: renamed from: x4.l0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\rR\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\rR\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\rR\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\r¨\u0006\u0014"}, d2 = {"Lx4/l0$a;", "", "<init>", "()V", "", "tableName", "triggerType", "b", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "", "TRIGGERS", "[Ljava/lang/String;", "UPDATE_TABLE_NAME", "Ljava/lang/String;", "TABLE_ID_COLUMN_NAME", "INVALIDATED_COLUMN_NAME", "CREATE_TRACKING_TABLE_SQL", "DROP_TRACKING_TABLE_SQL", "SELECT_UPDATED_TABLES_SQL", "RESET_UPDATED_TABLES_SQL", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String b(String tableName, String triggerType) {
            return "room_table_modification_trigger_" + tableName + '_' + triggerType;
        }

        public Companion() {
        }
    }

    @nt.f(c = "androidx.room.TriggerBasedInvalidationTracker", f = "InvalidationTracker.kt", l = {445, 453}, m = "checkInvalidatedTables")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class b extends nt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f35269t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f35270u;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f35272w;

        public b(lt.b<? super b> bVar) {
            super(bVar);
        }

        @Override // nt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f35270u = obj;
            this.f35272w |= Integer.MIN_VALUE;
            return l0.this.j(null, this);
        }
    }

    @nt.f(c = "androidx.room.TriggerBasedInvalidationTracker$createFlow$1", f = "InvalidationTracker.kt", l = {239, 239, 243}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Llu/i;", "", "", "", "<anonymous>", "(Llu/i;)V"}, k = 3, mv = {2, 1, 0})
    public static final class c extends nt.m implements Function2<lu.i<? super Set<? extends String>>, lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f35273t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f35274u;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ int[] f35276w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ boolean f35277x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final /* synthetic */ String[] f35278y;

        @nt.f(c = "androidx.room.TriggerBasedInvalidationTracker$createFlow$1$1", f = "InvalidationTracker.kt", l = {239}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {2, 1, 0})
        public static final class a extends nt.m implements Function2<p0, lt.b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f35279t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ l0 f35280u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(l0 l0Var, lt.b<? super a> bVar) {
                super(2, bVar);
                this.f35280u = l0Var;
            }

            @Override // nt.a
            public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
                return new a(this.f35280u, bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(p0 p0Var, lt.b<? super Unit> bVar) {
                return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
            }

            @Override // nt.a
            public final Object invokeSuspend(Object obj) {
                Object objE = mt.c.e();
                int i10 = this.f35279t;
                if (i10 == 0) {
                    gt.o.b(obj);
                    l0 l0Var = this.f35280u;
                    this.f35279t = 1;
                    if (l0Var.x(this) == objE) {
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
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class b<T> implements lu.i {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ kotlin.jvm.internal.c0<int[]> f35281a;
            public final /* synthetic */ boolean b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ lu.i<Set<String>> f35282c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ String[] f35283d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ int[] f35284e;

            @nt.f(c = "androidx.room.TriggerBasedInvalidationTracker$createFlow$1$2", f = "InvalidationTracker.kt", l = {247, Barcode.FORMAT_QR_CODE}, m = "emit")
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class a extends nt.d {

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public Object f35285t;

                /* JADX INFO: renamed from: u, reason: collision with root package name */
                public /* synthetic */ Object f35286u;

                /* JADX INFO: renamed from: v, reason: collision with root package name */
                public final /* synthetic */ b<T> f35287v;

                /* JADX INFO: renamed from: w, reason: collision with root package name */
                public int f35288w;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public a(b<? super T> bVar, lt.b<? super a> bVar2) {
                    super(bVar2);
                    this.f35287v = bVar;
                }

                @Override // nt.a
                public final Object invokeSuspend(Object obj) {
                    this.f35286u = obj;
                    this.f35288w |= Integer.MIN_VALUE;
                    return this.f35287v.emit(null, this);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public b(kotlin.jvm.internal.c0<int[]> c0Var, boolean z10, lu.i<? super Set<String>> iVar, String[] strArr, int[] iArr) {
                this.f35281a = c0Var;
                this.b = z10;
                this.f35282c = iVar;
                this.f35283d = strArr;
                this.f35284e = iArr;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x0056, code lost:
            
                if (r14.emit(r2, r0) == r1) goto L37;
             */
            /* JADX WARN: Code restructure failed: missing block: B:36:0x009c, code lost:
            
                if (r14.emit(r2, r0) == r1) goto L37;
             */
            /* JADX WARN: Code restructure failed: missing block: B:37:0x009e, code lost:
            
                r13 = r13;
                r13 = r13;
                r13 = r13;
                return r1;
             */
            @Override // lu.i
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(int[] r13, lt.b<? super kotlin.Unit> r14) {
                /*
                    r12 = this;
                    boolean r0 = r14 instanceof x4.l0.c.b.a
                    if (r0 == 0) goto L13
                    r0 = r14
                    x4.l0$c$b$a r0 = (x4.l0.c.b.a) r0
                    int r1 = r0.f35288w
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f35288w = r1
                    goto L18
                L13:
                    x4.l0$c$b$a r0 = new x4.l0$c$b$a
                    r0.<init>(r12, r14)
                L18:
                    java.lang.Object r14 = r0.f35286u
                    java.lang.Object r1 = mt.c.e()
                    int r2 = r0.f35288w
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L39
                    if (r2 == r4) goto L31
                    if (r2 != r3) goto L29
                    goto L31
                L29:
                    java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                    java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
                    r13.<init>(r14)
                    throw r13
                L31:
                    java.lang.Object r13 = r0.f35285t
                    int[] r13 = (int[]) r13
                    gt.o.b(r14)
                    goto L9f
                L39:
                    gt.o.b(r14)
                    kotlin.jvm.internal.c0<int[]> r14 = r12.f35281a
                    T r2 = r14.f23007a
                    if (r2 != 0) goto L59
                    boolean r14 = r12.b
                    if (r14 == 0) goto L9f
                    lu.i<java.util.Set<java.lang.String>> r14 = r12.f35282c
                    java.lang.String[] r2 = r12.f35283d
                    java.util.Set r2 = kotlin.collections.m.m0(r2)
                    r0.f35285t = r13
                    r0.f35288w = r4
                    java.lang.Object r14 = r14.emit(r2, r0)
                    if (r14 != r1) goto L9f
                    goto L9e
                L59:
                    java.lang.String[] r2 = r12.f35283d
                    int[] r4 = r12.f35284e
                    java.util.ArrayList r5 = new java.util.ArrayList
                    r5.<init>()
                    int r6 = r2.length
                    r7 = 0
                    r8 = r7
                L65:
                    if (r7 >= r6) goto L88
                    r9 = r2[r7]
                    int r10 = r8 + 1
                    T r11 = r14.f23007a
                    if (r11 == 0) goto L80
                    int[] r11 = (int[]) r11
                    r8 = r4[r8]
                    r11 = r11[r8]
                    r8 = r13[r8]
                    if (r11 == r8) goto L7c
                    r5.add(r9)
                L7c:
                    int r7 = r7 + 1
                    r8 = r10
                    goto L65
                L80:
                    java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                    java.lang.String r14 = "Required value was null."
                    r13.<init>(r14)
                    throw r13
                L88:
                    boolean r14 = r5.isEmpty()
                    if (r14 != 0) goto L9f
                    lu.i<java.util.Set<java.lang.String>> r14 = r12.f35282c
                    java.util.Set r2 = kotlin.collections.CollectionsKt.Q0(r5)
                    r0.f35285t = r13
                    r0.f35288w = r3
                    java.lang.Object r14 = r14.emit(r2, r0)
                    if (r14 != r1) goto L9f
                L9e:
                    return r1
                L9f:
                    kotlin.jvm.internal.c0<int[]> r14 = r12.f35281a
                    r14.f23007a = r13
                    kotlin.Unit r13 = kotlin.Unit.f22938a
                    return r13
                */
                throw new UnsupportedOperationException("Method not decompiled: x4.l0.c.b.emit(int[], lt.b):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int[] iArr, boolean z10, String[] strArr, lt.b<? super c> bVar) {
            super(2, bVar);
            this.f35276w = iArr;
            this.f35277x = z10;
            this.f35278y = strArr;
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            c cVar = l0.this.new c(this.f35276w, this.f35277x, this.f35278y, bVar);
            cVar.f35274u = obj;
            return cVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x006e, code lost:
        
            if (iu.i.g((kotlin.coroutines.CoroutineContext) r12, r5, r11) == r0) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0092, code lost:
        
            if (r12.a(r4, r11) == r0) goto L28;
         */
        @Override // nt.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = mt.c.e()
                int r1 = r11.f35273t
                r2 = 0
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L33
                if (r1 == r5) goto L2b
                if (r1 == r4) goto L23
                if (r1 == r3) goto L1a
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L1a:
                gt.o.b(r12)     // Catch: java.lang.Throwable -> L1f
                goto L95
            L1f:
                r0 = move-exception
                r12 = r0
                goto L9b
            L23:
                java.lang.Object r1 = r11.f35274u
                lu.i r1 = (lu.i) r1
                gt.o.b(r12)
                goto L71
            L2b:
                java.lang.Object r1 = r11.f35274u
                lu.i r1 = (lu.i) r1
                gt.o.b(r12)
                goto L5d
            L33:
                gt.o.b(r12)
                java.lang.Object r12 = r11.f35274u
                lu.i r12 = (lu.i) r12
                x4.l0 r1 = x4.l0.this
                x4.k r1 = x4.l0.e(r1)
                int[] r6 = r11.f35276w
                boolean r1 = r1.i(r6)
                if (r1 == 0) goto L73
                x4.l0 r1 = x4.l0.this
                x4.u r1 = x4.l0.d(r1)
                r11.f35274u = r12
                r11.f35273t = r5
                r5 = 0
                java.lang.Object r1 = c5.a.b(r1, r5, r11)
                if (r1 != r0) goto L5a
                goto L94
            L5a:
                r10 = r1
                r1 = r12
                r12 = r10
            L5d:
                kotlin.coroutines.CoroutineContext r12 = (kotlin.coroutines.CoroutineContext) r12
                x4.l0$c$a r5 = new x4.l0$c$a
                x4.l0 r6 = x4.l0.this
                r5.<init>(r6, r2)
                r11.f35274u = r1
                r11.f35273t = r4
                java.lang.Object r12 = iu.i.g(r12, r5, r11)
                if (r12 != r0) goto L71
                goto L94
            L71:
                r7 = r1
                goto L74
            L73:
                r7 = r12
            L74:
                kotlin.jvm.internal.c0 r5 = new kotlin.jvm.internal.c0     // Catch: java.lang.Throwable -> L1f
                r5.<init>()     // Catch: java.lang.Throwable -> L1f
                x4.l0 r12 = x4.l0.this     // Catch: java.lang.Throwable -> L1f
                x4.l r12 = x4.l0.f(r12)     // Catch: java.lang.Throwable -> L1f
                x4.l0$c$b r4 = new x4.l0$c$b     // Catch: java.lang.Throwable -> L1f
                boolean r6 = r11.f35277x     // Catch: java.lang.Throwable -> L1f
                java.lang.String[] r8 = r11.f35278y     // Catch: java.lang.Throwable -> L1f
                int[] r9 = r11.f35276w     // Catch: java.lang.Throwable -> L1f
                r4.<init>(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L1f
                r11.f35274u = r2     // Catch: java.lang.Throwable -> L1f
                r11.f35273t = r3     // Catch: java.lang.Throwable -> L1f
                java.lang.Object r12 = r12.a(r4, r11)     // Catch: java.lang.Throwable -> L1f
                if (r12 != r0) goto L95
            L94:
                return r0
            L95:
                gt.d r12 = new gt.d     // Catch: java.lang.Throwable -> L1f
                r12.<init>()     // Catch: java.lang.Throwable -> L1f
                throw r12     // Catch: java.lang.Throwable -> L1f
            L9b:
                x4.l0 r0 = x4.l0.this
                x4.k r0 = x4.l0.e(r0)
                int[] r1 = r11.f35276w
                r0.j(r1)
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: x4.l0.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(lu.i<? super Set<String>> iVar, lt.b<? super Unit> bVar) {
            return ((c) create(iVar, bVar)).invokeSuspend(Unit.f22938a);
        }
    }

    @nt.f(c = "androidx.room.TriggerBasedInvalidationTracker", f = "InvalidationTracker.kt", l = {417}, m = "notifyInvalidation")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class d extends nt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f35289t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f35290u;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f35292w;

        public d(lt.b<? super d> bVar) {
            super(bVar);
        }

        @Override // nt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f35290u = obj;
            this.f35292w |= Integer.MIN_VALUE;
            return l0.this.n(this);
        }
    }

    @nt.f(c = "androidx.room.TriggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$1", f = "InvalidationTracker.kt", l = {418, 425}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lx4/g0;", "connection", "", "", "<anonymous>", "(Lx4/g0;)Ljava/util/Set;"}, k = 3, mv = {2, 1, 0})
    public static final class e extends nt.m implements Function2<g0, lt.b<? super Set<? extends Integer>>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f35293t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f35294u;

        @nt.f(c = "androidx.room.TriggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$1$1", f = "InvalidationTracker.kt", l = {426}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lx4/f0;", "", "", "<anonymous>", "(Lx4/f0;)Ljava/util/Set;"}, k = 3, mv = {2, 1, 0})
        public static final class a extends nt.m implements Function2<f0<Set<? extends Integer>>, lt.b<? super Set<? extends Integer>>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f35296t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public /* synthetic */ Object f35297u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ l0 f35298v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(l0 l0Var, lt.b<? super a> bVar) {
                super(2, bVar);
                this.f35298v = l0Var;
            }

            @Override // nt.a
            public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
                a aVar = new a(this.f35298v, bVar);
                aVar.f35297u = obj;
                return aVar;
            }

            @Override // nt.a
            public final Object invokeSuspend(Object obj) {
                Object objE = mt.c.e();
                int i10 = this.f35296t;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gt.o.b(obj);
                    return obj;
                }
                gt.o.b(obj);
                f0 f0Var = (f0) this.f35297u;
                l0 l0Var = this.f35298v;
                this.f35296t = 1;
                Object objJ = l0Var.j(f0Var, this);
                return objJ == objE ? objE : objJ;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public final Object invoke(f0<Set<Integer>> f0Var, lt.b<? super Set<Integer>> bVar) {
                return ((a) create(f0Var, bVar)).invokeSuspend(Unit.f22938a);
            }
        }

        public e(lt.b<? super e> bVar) {
            super(2, bVar);
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            e eVar = l0.this.new e(bVar);
            eVar.f35294u = obj;
            return eVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0054, code lost:
        
            if (r7 == r0) goto L20;
         */
        @Override // nt.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = mt.c.e()
                int r1 = r6.f35293t
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                gt.o.b(r7)     // Catch: android.database.SQLException -> L5a
                goto L57
            L12:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1a:
                java.lang.Object r1 = r6.f35294u
                x4.g0 r1 = (x4.g0) r1
                gt.o.b(r7)
                goto L35
            L22:
                gt.o.b(r7)
                java.lang.Object r7 = r6.f35294u
                r1 = r7
                x4.g0 r1 = (x4.g0) r1
                r6.f35294u = r1
                r6.f35293t = r3
                java.lang.Object r7 = r1.b(r6)
                if (r7 != r0) goto L35
                goto L56
            L35:
                java.lang.Boolean r7 = (java.lang.Boolean) r7
                boolean r7 = r7.booleanValue()
                if (r7 == 0) goto L42
                java.util.Set r7 = kotlin.collections.q0.d()
                return r7
            L42:
                x4.g0$a r7 = x4.g0.a.IMMEDIATE     // Catch: android.database.SQLException -> L5a
                x4.l0$e$a r3 = new x4.l0$e$a     // Catch: android.database.SQLException -> L5a
                x4.l0 r4 = x4.l0.this     // Catch: android.database.SQLException -> L5a
                r5 = 0
                r3.<init>(r4, r5)     // Catch: android.database.SQLException -> L5a
                r6.f35294u = r5     // Catch: android.database.SQLException -> L5a
                r6.f35293t = r2     // Catch: android.database.SQLException -> L5a
                java.lang.Object r7 = r1.d(r7, r3, r6)     // Catch: android.database.SQLException -> L5a
                if (r7 != r0) goto L57
            L56:
                return r0
            L57:
                java.util.Set r7 = (java.util.Set) r7     // Catch: android.database.SQLException -> L5a
                return r7
            L5a:
                java.util.Set r7 = kotlin.collections.q0.d()
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: x4.l0.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(g0 g0Var, lt.b<? super Set<Integer>> bVar) {
            return ((e) create(g0Var, bVar)).invokeSuspend(Unit.f22938a);
        }
    }

    @nt.f(c = "androidx.room.TriggerBasedInvalidationTracker$refreshInvalidationAsync$3", f = "InvalidationTracker.kt", l = {394}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {2, 1, 0})
    public static final class f extends nt.m implements Function2<p0, lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f35299t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f35301v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Function0<Unit> function0, lt.b<? super f> bVar) {
            super(2, bVar);
            this.f35301v = function0;
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            return l0.this.new f(this.f35301v, bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, lt.b<? super Unit> bVar) {
            return ((f) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = mt.c.e();
            int i10 = this.f35299t;
            try {
                if (i10 == 0) {
                    gt.o.b(obj);
                    l0 l0Var = l0.this;
                    this.f35299t = 1;
                    obj = l0Var.n(this);
                    if (obj == objE) {
                        return objE;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gt.o.b(obj);
                }
                this.f35301v.invoke();
                return Unit.f22938a;
            } catch (Throwable th2) {
                this.f35301v.invoke();
                throw th2;
            }
        }
    }

    @nt.f(c = "androidx.room.TriggerBasedInvalidationTracker", f = "InvalidationTracker.kt", l = {328, 333}, m = "startTrackingTable")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class g extends nt.d {
        public int B;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f35302t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f35303u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f35304v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f35305w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f35306x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f35307y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public /* synthetic */ Object f35308z;

        public g(lt.b<? super g> bVar) {
            super(bVar);
        }

        @Override // nt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f35308z = obj;
            this.B |= Integer.MIN_VALUE;
            return l0.this.v(null, 0, this);
        }
    }

    @nt.f(c = "androidx.room.TriggerBasedInvalidationTracker", f = "InvalidationTracker.kt", l = {347}, m = "stopTrackingTable")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class h extends nt.d {
        public int A;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f35309t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f35310u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f35311v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f35312w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f35313x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public /* synthetic */ Object f35314y;

        public h(lt.b<? super h> bVar) {
            super(bVar);
        }

        @Override // nt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f35314y = obj;
            this.A |= Integer.MIN_VALUE;
            return l0.this.w(null, 0, this);
        }
    }

    @nt.f(c = "androidx.room.TriggerBasedInvalidationTracker", f = "InvalidationTracker.kt", l = {306}, m = "syncTriggers$room_runtime")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class i extends nt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f35316t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f35317u;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f35319w;

        public i(lt.b<? super i> bVar) {
            super(bVar);
        }

        @Override // nt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f35317u = obj;
            this.f35319w |= Integer.MIN_VALUE;
            return l0.this.x(this);
        }
    }

    @nt.f(c = "androidx.room.TriggerBasedInvalidationTracker$syncTriggers$2$1", f = "InvalidationTracker.kt", l = {HttpStatusCodesKt.HTTP_TEMP_REDIRECT, 314}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lx4/g0;", "connection", "", "<anonymous>", "(Lx4/g0;)V"}, k = 3, mv = {2, 1, 0})
    public static final class j extends nt.m implements Function2<g0, lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f35320t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f35321u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f35322v;

        @nt.f(c = "androidx.room.TriggerBasedInvalidationTracker$syncTriggers$2$1$1$1", f = "InvalidationTracker.kt", l = {318, 319}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lx4/f0;", "", "<anonymous>", "(Lx4/f0;)V"}, k = 3, mv = {2, 1, 0})
        public static final class a extends nt.m implements Function2<f0<Unit>, lt.b<? super Unit>, Object> {
            public final /* synthetic */ k.a[] A;
            public final /* synthetic */ l0 B;
            public final /* synthetic */ g0 C;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public Object f35324t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public Object f35325u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public Object f35326v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public int f35327w;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            public int f35328x;

            /* JADX INFO: renamed from: y, reason: collision with root package name */
            public int f35329y;

            /* JADX INFO: renamed from: z, reason: collision with root package name */
            public int f35330z;

            /* JADX INFO: renamed from: x4.l0$j$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final /* synthetic */ class C0645a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f35331a;

                static {
                    int[] iArr = new int[k.a.values().length];
                    try {
                        iArr[k.a.NO_OP.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[k.a.ADD.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[k.a.REMOVE.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    f35331a = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(k.a[] aVarArr, l0 l0Var, g0 g0Var, lt.b<? super a> bVar) {
                super(2, bVar);
                this.A = aVarArr;
                this.B = l0Var;
                this.C = g0Var;
            }

            @Override // nt.a
            public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
                return new a(this.A, this.B, this.C, bVar);
            }

            /* JADX WARN: Code duplicated, block: B:11:0x003e  */
            /* JADX WARN: Code duplicated, block: B:26:0x0086  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0086 -> B:27:0x0087). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            @Override // nt.a
            public final java.lang.Object invokeSuspend(java.lang.Object r12) {
                /*
                    r11 = this;
                    java.lang.Object r0 = mt.c.e()
                    int r1 = r11.f35330z
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L2c
                    if (r1 == r3) goto Le
                    if (r1 != r2) goto L24
                Le:
                    int r1 = r11.f35329y
                    int r4 = r11.f35328x
                    int r5 = r11.f35327w
                    java.lang.Object r6 = r11.f35326v
                    x4.g0 r6 = (x4.g0) r6
                    java.lang.Object r7 = r11.f35325u
                    x4.l0 r7 = (x4.l0) r7
                    java.lang.Object r8 = r11.f35324t
                    x4.k$a[] r8 = (x4.k.a[]) r8
                    gt.o.b(r12)
                    goto L68
                L24:
                    java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r12.<init>(r0)
                    throw r12
                L2c:
                    gt.o.b(r12)
                    x4.k$a[] r12 = r11.A
                    x4.l0 r1 = r11.B
                    x4.g0 r4 = r11.C
                    int r5 = r12.length
                    r6 = 0
                    r8 = r12
                    r7 = r1
                    r12 = r4
                    r1 = r5
                    r4 = r6
                L3c:
                    if (r4 >= r1) goto L89
                    r5 = r8[r4]
                    int r9 = r6 + 1
                    int[] r10 = x4.l0.j.a.C0645a.f35331a
                    int r5 = r5.ordinal()
                    r5 = r10[r5]
                    if (r5 == r3) goto L86
                    if (r5 == r2) goto L71
                    r10 = 3
                    if (r5 != r10) goto L6b
                    r11.f35324t = r8
                    r11.f35325u = r7
                    r11.f35326v = r12
                    r11.f35327w = r9
                    r11.f35328x = r4
                    r11.f35329y = r1
                    r11.f35330z = r2
                    java.lang.Object r5 = x4.l0.i(r7, r12, r6, r11)
                    if (r5 != r0) goto L66
                    goto L85
                L66:
                    r6 = r12
                    r5 = r9
                L68:
                    r12 = r6
                    r6 = r5
                    goto L87
                L6b:
                    gt.l r12 = new gt.l
                    r12.<init>()
                    throw r12
                L71:
                    r11.f35324t = r8
                    r11.f35325u = r7
                    r11.f35326v = r12
                    r11.f35327w = r9
                    r11.f35328x = r4
                    r11.f35329y = r1
                    r11.f35330z = r3
                    java.lang.Object r5 = x4.l0.h(r7, r12, r6, r11)
                    if (r5 != r0) goto L66
                L85:
                    return r0
                L86:
                    r6 = r9
                L87:
                    int r4 = r4 + r3
                    goto L3c
                L89:
                    kotlin.Unit r12 = kotlin.Unit.f22938a
                    return r12
                */
                throw new UnsupportedOperationException("Method not decompiled: x4.l0.j.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public final Object invoke(f0<Unit> f0Var, lt.b<? super Unit> bVar) {
                return ((a) create(f0Var, bVar)).invokeSuspend(Unit.f22938a);
            }
        }

        public j(lt.b<? super j> bVar) {
            super(2, bVar);
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            j jVar = l0.this.new j(bVar);
            jVar.f35322v = obj;
            return jVar;
        }

        /* JADX WARN: Code duplicated, block: B:25:0x0073  */
        @Override // nt.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            g0 g0Var;
            Object objB;
            k kVar;
            ReentrantLock reentrantLock;
            k.a[] aVarArr;
            k.a aVar;
            k kVar2;
            ReentrantLock reentrantLock2;
            Object objE = mt.c.e();
            int i10 = this.f35321u;
            boolean z10 = true;
            if (i10 == 0) {
                gt.o.b(obj);
                g0Var = (g0) this.f35322v;
                this.f35322v = g0Var;
                this.f35321u = 1;
                objB = g0Var.b(this);
                if (objB != objE) {
                }
                return objE;
            }
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                reentrantLock2 = (ReentrantLock) this.f35320t;
                kVar2 = (k) this.f35322v;
                try {
                    gt.o.b(obj);
                    reentrantLock = reentrantLock2;
                    kVar = kVar2;
                    kVar.inProgressSync = false;
                    Unit unit = Unit.f22938a;
                    reentrantLock.unlock();
                    return Unit.f22938a;
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        kVar2.inProgressSync = false;
                        throw th;
                    } catch (Throwable th3) {
                        th = th3;
                        reentrantLock = reentrantLock2;
                        reentrantLock.unlock();
                        throw th;
                    }
                }
            }
            g0Var = (g0) this.f35322v;
            gt.o.b(obj);
            objB = obj;
            if (((Boolean) objB).booleanValue()) {
                return Unit.f22938a;
            }
            kVar = l0.this.observedTableStates;
            l0 l0Var = l0.this;
            reentrantLock = kVar.onSyncLock;
            reentrantLock.lock();
            try {
                kVar.inProgressSync = true;
                ReentrantLock reentrantLock3 = kVar.lock;
                reentrantLock3.lock();
                try {
                    if (kVar.needsSync) {
                        kVar.needsSync = false;
                        int length = kVar.tableObserversCount.length;
                        aVarArr = new k.a[length];
                        int i11 = 0;
                        boolean z11 = false;
                        while (i11 < length) {
                            boolean z12 = kVar.tableObserversCount[i11] > 0 ? z10 : false;
                            if (z12 != kVar.tableObservedState[i11]) {
                                kVar.tableObservedState[i11] = z12;
                                aVar = z12 ? k.a.ADD : k.a.REMOVE;
                                z11 = true;
                            } else {
                                aVar = k.a.NO_OP;
                            }
                            aVarArr[i11] = aVar;
                            i11++;
                            z10 = true;
                        }
                        if (!z11) {
                            aVarArr = null;
                        }
                    } else {
                        aVarArr = null;
                    }
                    reentrantLock3.unlock();
                    if (aVarArr != null) {
                        try {
                            if (aVarArr.length != 0) {
                                g0.a aVar2 = g0.a.IMMEDIATE;
                                a aVar3 = new a(aVarArr, l0Var, g0Var, null);
                                this.f35322v = kVar;
                                this.f35320t = reentrantLock;
                                this.f35321u = 2;
                                if (g0Var.d(aVar2, aVar3, this) != objE) {
                                    kVar2 = kVar;
                                    reentrantLock2 = reentrantLock;
                                    reentrantLock = reentrantLock2;
                                    kVar = kVar2;
                                }
                                return objE;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            kVar2 = kVar;
                            reentrantLock2 = reentrantLock;
                            kVar2.inProgressSync = false;
                            throw th;
                        }
                    }
                    kVar.inProgressSync = false;
                    Unit unit2 = Unit.f22938a;
                    reentrantLock.unlock();
                    return Unit.f22938a;
                } catch (Throwable th5) {
                    reentrantLock3.unlock();
                    throw th5;
                }
            } catch (Throwable th6) {
                th = th6;
                reentrantLock.unlock();
                throw th;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(g0 g0Var, lt.b<? super Unit> bVar) {
            return ((j) create(g0Var, bVar)).invokeSuspend(Unit.f22938a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l0(@NotNull u database, @NotNull Map<String, String> shadowTablesMap, @NotNull Map<String, ? extends Set<String>> viewTables, @NotNull String[] tableNames, boolean z10, @NotNull Function1<? super Set<Integer>, Unit> onInvalidatedTablesIds) {
        String lowerCase;
        Intrinsics.checkNotNullParameter(database, "database");
        Intrinsics.checkNotNullParameter(shadowTablesMap, "shadowTablesMap");
        Intrinsics.checkNotNullParameter(viewTables, "viewTables");
        Intrinsics.checkNotNullParameter(tableNames, "tableNames");
        Intrinsics.checkNotNullParameter(onInvalidatedTablesIds, "onInvalidatedTablesIds");
        this.database = database;
        this.shadowTablesMap = shadowTablesMap;
        this.viewTables = viewTables;
        this.useTempTable = z10;
        this.onInvalidatedTablesIds = onInvalidatedTablesIds;
        this.pendingRefresh = new AtomicBoolean(false);
        this.onAllowRefresh = new Function0() { // from class: x4.k0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(l0.o());
            }
        };
        this.tableIdLookup = new LinkedHashMap();
        int length = tableNames.length;
        String[] strArr = new String[length];
        for (int i10 = 0; i10 < length; i10++) {
            String str = tableNames[i10];
            Locale locale = Locale.ROOT;
            String lowerCase2 = str.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
            this.tableIdLookup.put(lowerCase2, Integer.valueOf(i10));
            String str2 = this.shadowTablesMap.get(tableNames[i10]);
            if (str2 != null) {
                lowerCase = str2.toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            } else {
                lowerCase = null;
            }
            if (lowerCase != null) {
                lowerCase2 = lowerCase;
            }
            strArr[i10] = lowerCase2;
        }
        this.tablesNames = strArr;
        for (Map.Entry<String, String> entry : this.shadowTablesMap.entrySet()) {
            String value = entry.getValue();
            Locale locale2 = Locale.ROOT;
            String lowerCase3 = value.toLowerCase(locale2);
            Intrinsics.checkNotNullExpressionValue(lowerCase3, "toLowerCase(...)");
            if (this.tableIdLookup.containsKey(lowerCase3)) {
                String lowerCase4 = entry.getKey().toLowerCase(locale2);
                Intrinsics.checkNotNullExpressionValue(lowerCase4, "toLowerCase(...)");
                Map<String, Integer> map = this.tableIdLookup;
                map.put(lowerCase4, (Integer) kotlin.collections.k0.k(map, lowerCase3));
            }
        }
        this.observedTableStates = new k(this.tablesNames.length);
        this.observedTableVersions = new l(this.tablesNames.length);
    }

    public static final Set k(f5.d statement) {
        Intrinsics.checkNotNullParameter(statement, "statement");
        Set setB = kotlin.collections.p0.b();
        while (statement.i3()) {
            setB.add(Integer.valueOf((int) statement.getLong(0)));
        }
        return kotlin.collections.p0.a(setB);
    }

    public static final boolean o() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object j(m mVar, lt.b<? super Set<Integer>> bVar) {
        b bVar2;
        if (bVar instanceof b) {
            bVar2 = (b) bVar;
            int i10 = bVar2.f35272w;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar2.f35272w = i10 - Integer.MIN_VALUE;
            } else {
                bVar2 = new b(bVar);
            }
        } else {
            bVar2 = new b(bVar);
        }
        Object objA = bVar2.f35270u;
        Object objE = mt.c.e();
        int i11 = bVar2.f35272w;
        if (i11 == 0) {
            gt.o.b(objA);
            Function1 function1 = new Function1() { // from class: x4.j0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return l0.k((f5.d) obj);
                }
            };
            bVar2.f35269t = mVar;
            bVar2.f35272w = 1;
            objA = mVar.a("SELECT * FROM room_table_modification_log WHERE invalidated = 1", function1, bVar2);
            if (objA != objE) {
            }
            return objE;
        }
        if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Set set = (Set) bVar2.f35269t;
            gt.o.b(objA);
            return set;
        }
        mVar = (m) bVar2.f35269t;
        gt.o.b(objA);
        Set set2 = (Set) objA;
        if (!set2.isEmpty()) {
            bVar2.f35269t = set2;
            bVar2.f35272w = 2;
            if (i0.b(mVar, "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1", bVar2) == objE) {
                return objE;
            }
        }
        return set2;
    }

    public final void l(@NotNull f5.b connection) throws Exception {
        Intrinsics.checkNotNullParameter(connection, "connection");
        f5.d dVarR3 = connection.r3("PRAGMA query_only");
        try {
            dVarR3.i3();
            boolean zB2 = dVarR3.b2(0);
            vt.a.a(dVarR3, null);
            if (zB2) {
                return;
            }
            f5.a.a(connection, "PRAGMA temp_store = MEMORY");
            f5.a.a(connection, "PRAGMA recursive_triggers = 1");
            f5.a.a(connection, "DROP TABLE IF EXISTS room_table_modification_log");
            if (this.useTempTable) {
                f5.a.a(connection, "CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
            } else {
                f5.a.a(connection, kotlin.text.x.N("CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)", "TEMP", "", false, 4, null));
            }
            this.observedTableStates.h();
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                vt.a.a(dVarR3, th2);
                throw th3;
            }
        }
    }

    @NotNull
    public final lu.h<Set<String>> m(@NotNull String[] resolvedTableNames, @NotNull int[] tableIds, boolean emitInitialState) {
        Intrinsics.checkNotNullParameter(resolvedTableNames, "resolvedTableNames");
        Intrinsics.checkNotNullParameter(tableIds, "tableIds");
        return lu.j.w(new c(tableIds, emitInitialState, resolvedTableNames, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object n(lt.b<? super Set<Integer>> bVar) throws Throwable {
        d dVar;
        y4.a aVar;
        Throwable th2;
        if (bVar instanceof d) {
            dVar = (d) bVar;
            int i10 = dVar.f35292w;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar.f35292w = i10 - Integer.MIN_VALUE;
            } else {
                dVar = new d(bVar);
            }
        } else {
            dVar = new d(bVar);
        }
        Object obj = dVar.f35290u;
        Object objE = mt.c.e();
        int i11 = dVar.f35292w;
        if (i11 == 0) {
            gt.o.b(obj);
            y4.a closeBarrier = this.database.getCloseBarrier();
            if (!closeBarrier.a()) {
                return q0.d();
            }
            try {
                if (!this.pendingRefresh.compareAndSet(true, false)) {
                    Set setD = q0.d();
                    closeBarrier.c();
                    return setD;
                }
                if (!this.onAllowRefresh.invoke().booleanValue()) {
                    Set setD2 = q0.d();
                    closeBarrier.c();
                    return setD2;
                }
                u uVar = this.database;
                e eVar = new e(null);
                dVar.f35289t = closeBarrier;
                dVar.f35292w = 1;
                Object objW = uVar.W(false, eVar, dVar);
                if (objW == objE) {
                    return objE;
                }
                aVar = closeBarrier;
                obj = objW;
            } catch (Throwable th3) {
                aVar = closeBarrier;
                th2 = th3;
                aVar.c();
                throw th2;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = (y4.a) dVar.f35289t;
            try {
                gt.o.b(obj);
            } catch (Throwable th4) {
                th2 = th4;
                aVar.c();
                throw th2;
            }
        }
        Set<Integer> set = (Set) obj;
        if (!set.isEmpty()) {
            this.observedTableVersions.b(set);
            this.onInvalidatedTablesIds.invoke(set);
        }
        aVar.c();
        return set;
    }

    public final boolean p(@NotNull int[] tableIds) {
        Intrinsics.checkNotNullParameter(tableIds, "tableIds");
        return this.observedTableStates.i(tableIds);
    }

    public final boolean q(@NotNull int[] tableIds) {
        Intrinsics.checkNotNullParameter(tableIds, "tableIds");
        return this.observedTableStates.j(tableIds);
    }

    public final void r(@NotNull Function0<Unit> onRefreshScheduled, @NotNull Function0<Unit> onRefreshCompleted) {
        Intrinsics.checkNotNullParameter(onRefreshScheduled, "onRefreshScheduled");
        Intrinsics.checkNotNullParameter(onRefreshCompleted, "onRefreshCompleted");
        if (this.pendingRefresh.compareAndSet(false, true)) {
            onRefreshScheduled.invoke();
            iu.k.d(this.database.s(), new CoroutineName("Room Invalidation Tracker Refresh"), null, new f(onRefreshCompleted, null), 2, null);
        }
    }

    public final void s() {
        this.observedTableStates.k();
    }

    public final String[] t(String[] names) {
        Set setB = kotlin.collections.p0.b();
        for (String str : names) {
            Map<String, Set<String>> map = this.viewTables;
            String lowerCase = str.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            Set<String> set = map.get(lowerCase);
            if (set != null) {
                setB.addAll(set);
            } else {
                setB.add(str);
            }
        }
        return (String[]) kotlin.collections.p0.a(setB).toArray(new String[0]);
    }

    public final void u(@NotNull Function0<Boolean> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.onAllowRefresh = function0;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0087  */
    /* JADX WARN: Code duplicated, block: B:23:0x008d  */
    /* JADX WARN: Code duplicated, block: B:24:0x0090  */
    /* JADX WARN: Code duplicated, block: B:29:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0074, code lost:
    
        if (x4.i0.b(r13, r15, r0) == r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00e0, code lost:
    
        if (x4.i0.b(r7, r15, r0) == r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00e2, code lost:
    
        return r1;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00e0 -> B:28:0x00e3). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(x4.m r13, int r14, lt.b<? super kotlin.Unit> r15) {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x4.l0.v(x4.m, int, lt.b):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0054  */
    /* JADX WARN: Code duplicated, block: B:18:0x0084 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:19:0x0085  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0085 -> B:20:0x0087). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object w(x4.m r10, int r11, lt.b<? super kotlin.Unit> r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof x4.l0.h
            if (r0 == 0) goto L13
            r0 = r12
            x4.l0$h r0 = (x4.l0.h) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            x4.l0$h r0 = new x4.l0$h
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f35314y
            java.lang.Object r1 = mt.c.e()
            int r2 = r0.A
            r3 = 1
            if (r2 == 0) goto L42
            if (r2 != r3) goto L3a
            int r10 = r0.f35313x
            int r11 = r0.f35312w
            java.lang.Object r2 = r0.f35311v
            java.lang.String[] r2 = (java.lang.String[]) r2
            java.lang.Object r4 = r0.f35310u
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r0.f35309t
            x4.m r5 = (x4.m) r5
            gt.o.b(r12)
            r12 = r4
            goto L87
        L3a:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L42:
            gt.o.b(r12)
            java.lang.String[] r12 = r9.tablesNames
            r11 = r12[r11]
            java.lang.String[] r12 = x4.l0.f35258m
            int r2 = r12.length
            r4 = 0
            r8 = r11
            r11 = r10
            r10 = r2
            r2 = r12
            r12 = r8
        L52:
            if (r4 >= r10) goto L8b
            r5 = r2[r4]
            x4.l0$a r6 = x4.l0.INSTANCE
            java.lang.String r5 = x4.l0.Companion.a(r6, r12, r5)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "DROP TRIGGER IF EXISTS `"
            r6.append(r7)
            r6.append(r5)
            r5 = 96
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            r0.f35309t = r11
            r0.f35310u = r12
            r0.f35311v = r2
            r0.f35312w = r4
            r0.f35313x = r10
            r0.A = r3
            java.lang.Object r5 = x4.i0.b(r11, r5, r0)
            if (r5 != r1) goto L85
            return r1
        L85:
            r5 = r11
            r11 = r4
        L87:
            int r4 = r11 + 1
            r11 = r5
            goto L52
        L8b:
            kotlin.Unit r10 = kotlin.Unit.f22938a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: x4.l0.w(x4.m, int, lt.b):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object x(@NotNull lt.b<? super Unit> bVar) throws Throwable {
        i iVar;
        y4.a aVar;
        Throwable th2;
        if (bVar instanceof i) {
            iVar = (i) bVar;
            int i10 = iVar.f35319w;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                iVar.f35319w = i10 - Integer.MIN_VALUE;
            } else {
                iVar = new i(bVar);
            }
        } else {
            iVar = new i(bVar);
        }
        Object obj = iVar.f35317u;
        Object objE = mt.c.e();
        int i11 = iVar.f35319w;
        if (i11 == 0) {
            gt.o.b(obj);
            y4.a closeBarrier = this.database.getCloseBarrier();
            if (closeBarrier.a()) {
                try {
                    u uVar = this.database;
                    j jVar = new j(null);
                    iVar.f35316t = closeBarrier;
                    iVar.f35319w = 1;
                    if (uVar.W(false, jVar, iVar) == objE) {
                        return objE;
                    }
                    aVar = closeBarrier;
                    aVar.c();
                } catch (Throwable th3) {
                    aVar = closeBarrier;
                    th2 = th3;
                    aVar.c();
                    throw th2;
                }
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = (y4.a) iVar.f35316t;
            try {
                gt.o.b(obj);
                aVar.c();
            } catch (Throwable th4) {
                th2 = th4;
                aVar.c();
                throw th2;
            }
        }
        return Unit.f22938a;
    }

    @NotNull
    public final Pair<String[], int[]> y(@NotNull String[] names) {
        Intrinsics.checkNotNullParameter(names, "names");
        String[] strArrT = t(names);
        int length = strArrT.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            String str = strArrT[i10];
            Map<String, Integer> map = this.tableIdLookup;
            String lowerCase = str.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            Integer num = map.get(lowerCase);
            if (num == null) {
                throw new IllegalArgumentException("There is no table with name " + str);
            }
            iArr[i10] = num.intValue();
        }
        return gt.s.a(strArrT, iArr);
    }
}
