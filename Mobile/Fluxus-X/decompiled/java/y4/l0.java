package y4;

import android.database.SQLException;
import av.CoroutineName;
import av.p0;
import com.github.luben.zstd.BuildConfig;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Pair;
import p001kotlin.Unit;
import p001kotlin.collections.CollectionsKt;
import p001kotlin.collections.q0;
import p001kotlin.jvm.functions.Function0;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 !2\u00020\u0001:\u00018Bo\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00070\u0004\u0012\u000e\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0018\u0010\u0010\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u0007\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\t2\u000e\u0010\u0013\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\tH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J \u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b\u0019\u0010\u001aJ \u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b\u001b\u0010\u001aJ\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007H\u0082@¢\u0006\u0004\b\u001c\u0010\u001dJ\u001e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\u0006\u0010\u0017\u001a\u00020\u0016H\u0082@¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010!\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020 ¢\u0006\u0004\b!\u0010\"J9\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00070'2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00050\t2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u000bH\u0000¢\u0006\u0004\b(\u0010)J1\u0010+\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\t\u0012\u0004\u0012\u00020$0*2\u000e\u0010\u0013\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\tH\u0000¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020$H\u0000¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020$H\u0000¢\u0006\u0004\b/\u0010.J\u0010\u00100\u001a\u00020\u000fH\u0080@¢\u0006\u0004\b0\u0010\u001dJ/\u00104\u001a\u00020\u000f2\u000e\b\u0002\u00102\u001a\b\u0012\u0004\u0012\u00020\u000f012\u000e\b\u0002\u00103\u001a\b\u0012\u0004\u0012\u00020\u000f01H\u0000¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\u000fH\u0000¢\u0006\u0004\b6\u00107R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R&\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00070\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010;R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R&\u0010\u0010\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u0007\u0012\u0004\u0012\u00020\u000f0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R \u0010B\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010;R\u001a\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00050\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010I\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010M\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0018\u0010Q\u001a\u00060Nj\u0002`O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010PR(\u0010X\u001a\b\u0012\u0004\u0012\u00020\u000b018\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010W¨\u0006Y"}, d2 = {"Ly4/l0;", BuildConfig.FLAVOR, "Ly4/u;", "database", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "shadowTablesMap", BuildConfig.FLAVOR, "viewTables", BuildConfig.FLAVOR, "tableNames", BuildConfig.FLAVOR, "useTempTable", "Lkotlin/Function1;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "onInvalidatedTablesIds", "<init>", "(Ly4/u;Ljava/util/Map;Ljava/util/Map;[Ljava/lang/String;ZLkotlin/jvm/functions/Function1;)V", "names", "t", "([Ljava/lang/String;)[Ljava/lang/String;", "Ly4/m;", "connection", "tableId", "v", "(Ly4/m;ILeu/b;)Ljava/lang/Object;", "w", "n", "(Leu/b;)Ljava/lang/Object;", "j", "(Ly4/m;Leu/b;)Ljava/lang/Object;", "Lg5/b;", "l", "(Lg5/b;)V", "resolvedTableNames", BuildConfig.FLAVOR, "tableIds", "emitInitialState", "Ldv/h;", "m", "([Ljava/lang/String;[IZ)Ldv/h;", "Lkotlin/Pair;", "y", "([Ljava/lang/String;)Lkotlin/Pair;", "p", "([I)Z", "q", "x", "Lkotlin/Function0;", "onRefreshScheduled", "onRefreshCompleted", "r", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "s", "()V", "a", "Ly4/u;", "b", "Ljava/util/Map;", "c", "d", "Z", "e", "Lkotlin/jvm/functions/Function1;", "f", "tableIdLookup", "g", "[Ljava/lang/String;", "tablesNames", "Ly4/k;", "h", "Ly4/k;", "observedTableStates", "Ly4/l;", "i", "Ly4/l;", "observedTableVersions", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Landroidx/room/concurrent/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "pendingRefresh", "k", "Lkotlin/jvm/functions/Function0;", "getOnAllowRefresh$room_runtime", "()Lkotlin/jvm/functions/Function0;", "u", "(Lkotlin/jvm/functions/Function0;)V", "onAllowRefresh", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class l0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public static final String[] f37304m = {"INSERT", "UPDATE", "DELETE"};

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

    /* JADX INFO: renamed from: y4.l0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\rR\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\rR\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\rR\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\r¨\u0006\u0014"}, d2 = {"Ly4/l0$a;", BuildConfig.FLAVOR, "<init>", "()V", BuildConfig.FLAVOR, "tableName", "triggerType", "b", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", BuildConfig.FLAVOR, "TRIGGERS", "[Ljava/lang/String;", "UPDATE_TABLE_NAME", "Ljava/lang/String;", "TABLE_ID_COLUMN_NAME", "INVALIDATED_COLUMN_NAME", "CREATE_TRACKING_TABLE_SQL", "DROP_TRACKING_TABLE_SQL", "SELECT_UPDATED_TABLES_SQL", "RESET_UPDATED_TABLES_SQL", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @gu.f(c = "androidx.room.TriggerBasedInvalidationTracker", f = "InvalidationTracker.kt", l = {445, 453}, m = "checkInvalidatedTables")
    public static final class b extends gu.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f37315t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f37316u;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f37318w;

        public b(eu.b<? super b> bVar) {
            super(bVar);
        }

        @Override // gu.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f37316u = obj;
            this.f37318w |= Integer.MIN_VALUE;
            return l0.this.j(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ldv/i;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR, "<anonymous>", "(Ldv/i;)V"}, k = 3, mv = {2, 1, 0})
    @gu.f(c = "androidx.room.TriggerBasedInvalidationTracker$createFlow$1", f = "InvalidationTracker.kt", l = {239, 239, 243}, m = "invokeSuspend")
    public static final class c extends gu.m implements Function2<dv.i<? super Set<? extends String>>, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f37319t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f37320u;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ int[] f37322w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ boolean f37323x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final /* synthetic */ String[] f37324y;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 1, 0})
        @gu.f(c = "androidx.room.TriggerBasedInvalidationTracker$createFlow$1$1", f = "InvalidationTracker.kt", l = {239}, m = "invokeSuspend")
        public static final class a extends gu.m implements Function2<p0, eu.b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f37325t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ l0 f37326u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(l0 l0Var, eu.b<? super a> bVar) {
                super(2, bVar);
                this.f37326u = l0Var;
            }

            @Override // gu.a
            public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
                return new a(this.f37326u, bVar);
            }

            @Override // p001kotlin.jvm.functions.Function2
            public final Object invoke(p0 p0Var, eu.b<? super Unit> bVar) {
                return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
            }

            @Override // gu.a
            public final Object invokeSuspend(Object obj) {
                Object objE = fu.c.e();
                int i10 = this.f37325t;
                if (i10 == 0) {
                    zt.o.b(obj);
                    l0 l0Var = this.f37326u;
                    this.f37325t = 1;
                    if (l0Var.x(this) == objE) {
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
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class b<T> implements dv.i {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ p001kotlin.jvm.internal.c0<int[]> f37327a;
            public final /* synthetic */ boolean b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ dv.i<Set<String>> f37328c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ String[] f37329d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ int[] f37330e;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @gu.f(c = "androidx.room.TriggerBasedInvalidationTracker$createFlow$1$2", f = "InvalidationTracker.kt", l = {247, Barcode.FORMAT_QR_CODE}, m = "emit")
            public static final class a extends gu.d {

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public Object f37331t;

                /* JADX INFO: renamed from: u, reason: collision with root package name */
                public /* synthetic */ Object f37332u;

                /* JADX INFO: renamed from: v, reason: collision with root package name */
                public final /* synthetic */ b<T> f37333v;

                /* JADX INFO: renamed from: w, reason: collision with root package name */
                public int f37334w;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public a(b<? super T> bVar, eu.b<? super a> bVar2) {
                    super(bVar2);
                    this.f37333v = bVar;
                }

                @Override // gu.a
                public final Object invokeSuspend(Object obj) {
                    this.f37332u = obj;
                    this.f37334w |= Integer.MIN_VALUE;
                    return this.f37333v.emit(null, this);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public b(p001kotlin.jvm.internal.c0<int[]> c0Var, boolean z10, dv.i<? super Set<String>> iVar, String[] strArr, int[] iArr) {
                this.f37327a = c0Var;
                this.b = z10;
                this.f37328c = iVar;
                this.f37329d = strArr;
                this.f37330e = iArr;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x0056, code lost:
            
                if (r14.emit(r2, r0) == r1) goto L37;
             */
            /* JADX WARN: Code restructure failed: missing block: B:36:0x009c, code lost:
            
                if (r14.emit(r2, r0) == r1) goto L37;
             */
            /* JADX WARN: Code restructure failed: missing block: B:37:0x009e, code lost:
            
                return r1;
             */
            @Override // dv.i
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(int[] iArr, eu.b<? super Unit> bVar) {
                a aVar;
                Object obj;
                if (bVar instanceof a) {
                    aVar = (a) bVar;
                    int i10 = aVar.f37334w;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        aVar.f37334w = i10 - Integer.MIN_VALUE;
                    } else {
                        aVar = new a(this, bVar);
                    }
                } else {
                    aVar = new a(this, bVar);
                }
                Object obj2 = aVar.f37332u;
                Object objE = fu.c.e();
                int i11 = aVar.f37334w;
                if (i11 == 0) {
                    zt.o.b(obj2);
                    p001kotlin.jvm.internal.c0<int[]> c0Var = this.f37327a;
                    if (c0Var.f21575a == null) {
                        obj = iArr;
                        if (this.b) {
                            dv.i<Set<String>> iVar = this.f37328c;
                            Set<String> setM0 = p001kotlin.collections.m.m0(this.f37329d);
                            aVar.f37331t = iArr;
                            aVar.f37334w = 1;
                            obj = iArr;
                        }
                    } else {
                        String[] strArr = this.f37329d;
                        int[] iArr2 = this.f37330e;
                        ArrayList arrayList = new ArrayList();
                        int length = strArr.length;
                        int i12 = 0;
                        int i13 = 0;
                        while (i12 < length) {
                            String str = strArr[i12];
                            int i14 = i13 + 1;
                            int[] iArr3 = c0Var.f21575a;
                            if (iArr3 == null) {
                                throw new IllegalStateException("Required value was null.");
                            }
                            int i15 = iArr2[i13];
                            if (iArr3[i15] != iArr[i15]) {
                                arrayList.add(str);
                            }
                            i12++;
                            i13 = i14;
                        }
                        obj = iArr;
                        if (!arrayList.isEmpty()) {
                            dv.i<Set<String>> iVar2 = this.f37328c;
                            Set<String> setQ0 = CollectionsKt.Q0(arrayList);
                            aVar.f37331t = iArr;
                            aVar.f37334w = 2;
                            obj = iArr;
                        }
                    }
                } else {
                    if (i11 != 1 && i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Object obj3 = (T) ((int[]) aVar.f37331t);
                    zt.o.b(obj2);
                    obj = obj3;
                }
                this.f37327a.f21575a = (T) obj;
                return Unit.f21506a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int[] iArr, boolean z10, String[] strArr, eu.b<? super c> bVar) {
            super(2, bVar);
            this.f37322w = iArr;
            this.f37323x = z10;
            this.f37324y = strArr;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            c cVar = l0.this.new c(this.f37322w, this.f37323x, this.f37324y, bVar);
            cVar.f37320u = obj;
            return cVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x006e, code lost:
        
            if (av.i.g((p001kotlin.coroutines.CoroutineContext) r12, r5, r11) == r0) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0092, code lost:
        
            if (r12.a(r4, r11) == r0) goto L28;
         */
        @Override // gu.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            dv.i iVar;
            dv.i iVar2;
            Object objE = fu.c.e();
            int i10 = this.f37319t;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        iVar2 = (dv.i) this.f37320u;
                        zt.o.b(obj);
                    } else if (i10 == 2) {
                        iVar2 = (dv.i) this.f37320u;
                        zt.o.b(obj);
                        iVar = iVar2;
                        p001kotlin.jvm.internal.c0 c0Var = new p001kotlin.jvm.internal.c0();
                        l lVar = l0.this.observedTableVersions;
                        b bVar = new b(c0Var, this.f37323x, iVar, this.f37324y, this.f37322w);
                        this.f37320u = null;
                        this.f37319t = 3;
                    } else {
                        if (i10 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        zt.o.b(obj);
                    }
                    throw new zt.d();
                }
                zt.o.b(obj);
                dv.i iVar3 = (dv.i) this.f37320u;
                if (l0.this.observedTableStates.i(this.f37322w)) {
                    u uVar = l0.this.database;
                    this.f37320u = iVar3;
                    this.f37319t = 1;
                    Object objB = d5.a.b(uVar, false, this);
                    if (objB != objE) {
                        iVar2 = iVar3;
                        obj = objB;
                    }
                } else {
                    iVar = iVar3;
                    p001kotlin.jvm.internal.c0 c0Var2 = new p001kotlin.jvm.internal.c0();
                    l lVar2 = l0.this.observedTableVersions;
                    b bVar2 = new b(c0Var2, this.f37323x, iVar, this.f37324y, this.f37322w);
                    this.f37320u = null;
                    this.f37319t = 3;
                }
                return objE;
                a aVar = new a(l0.this, null);
                this.f37320u = iVar2;
                this.f37319t = 2;
            } catch (Throwable th2) {
                l0.this.observedTableStates.j(this.f37322w);
                throw th2;
            }
        }

        @Override // p001kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(dv.i<? super Set<String>> iVar, eu.b<? super Unit> bVar) {
            return ((c) create(iVar, bVar)).invokeSuspend(Unit.f21506a);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @gu.f(c = "androidx.room.TriggerBasedInvalidationTracker", f = "InvalidationTracker.kt", l = {417}, m = "notifyInvalidation")
    public static final class d extends gu.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f37335t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f37336u;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f37338w;

        public d(eu.b<? super d> bVar) {
            super(bVar);
        }

        @Override // gu.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f37336u = obj;
            this.f37338w |= Integer.MIN_VALUE;
            return l0.this.n(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ly4/g0;", "connection", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "<anonymous>", "(Ly4/g0;)Ljava/util/Set;"}, k = 3, mv = {2, 1, 0})
    @gu.f(c = "androidx.room.TriggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$1", f = "InvalidationTracker.kt", l = {418, 425}, m = "invokeSuspend")
    public static final class e extends gu.m implements Function2<g0, eu.b<? super Set<? extends Integer>>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f37339t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f37340u;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ly4/f0;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "<anonymous>", "(Ly4/f0;)Ljava/util/Set;"}, k = 3, mv = {2, 1, 0})
        @gu.f(c = "androidx.room.TriggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$1$1", f = "InvalidationTracker.kt", l = {426}, m = "invokeSuspend")
        public static final class a extends gu.m implements Function2<f0<Set<? extends Integer>>, eu.b<? super Set<? extends Integer>>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f37342t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public /* synthetic */ Object f37343u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ l0 f37344v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(l0 l0Var, eu.b<? super a> bVar) {
                super(2, bVar);
                this.f37344v = l0Var;
            }

            @Override // gu.a
            public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
                a aVar = new a(this.f37344v, bVar);
                aVar.f37343u = obj;
                return aVar;
            }

            @Override // gu.a
            public final Object invokeSuspend(Object obj) {
                Object objE = fu.c.e();
                int i10 = this.f37342t;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zt.o.b(obj);
                    return obj;
                }
                zt.o.b(obj);
                f0 f0Var = (f0) this.f37343u;
                l0 l0Var = this.f37344v;
                this.f37342t = 1;
                Object objJ = l0Var.j(f0Var, this);
                return objJ == objE ? objE : objJ;
            }

            @Override // p001kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public final Object invoke(f0<Set<Integer>> f0Var, eu.b<? super Set<Integer>> bVar) {
                return ((a) create(f0Var, bVar)).invokeSuspend(Unit.f21506a);
            }
        }

        public e(eu.b<? super e> bVar) {
            super(2, bVar);
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            e eVar = l0.this.new e(bVar);
            eVar.f37340u = obj;
            return eVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0054, code lost:
        
            if (r7 == r0) goto L20;
         */
        @Override // gu.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            g0 g0Var;
            Object objE = fu.c.e();
            int i10 = this.f37339t;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        g0Var = (g0) this.f37340u;
                        zt.o.b(obj);
                    } else {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        zt.o.b(obj);
                    }
                    return (Set) obj;
                }
                zt.o.b(obj);
                g0Var = (g0) this.f37340u;
                this.f37340u = g0Var;
                this.f37339t = 1;
                obj = g0Var.b(this);
                if (obj != objE) {
                }
                return objE;
                if (((Boolean) obj).booleanValue()) {
                    return q0.d();
                }
                g0.a aVar = g0.a.IMMEDIATE;
                a aVar2 = new a(l0.this, null);
                this.f37340u = null;
                this.f37339t = 2;
                obj = g0Var.c(aVar, aVar2, this);
            } catch (SQLException unused) {
                return q0.d();
            }
        }

        @Override // p001kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(g0 g0Var, eu.b<? super Set<Integer>> bVar) {
            return ((e) create(g0Var, bVar)).invokeSuspend(Unit.f21506a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 1, 0})
    @gu.f(c = "androidx.room.TriggerBasedInvalidationTracker$refreshInvalidationAsync$3", f = "InvalidationTracker.kt", l = {394}, m = "invokeSuspend")
    public static final class f extends gu.m implements Function2<p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f37345t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f37347v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Function0<Unit> function0, eu.b<? super f> bVar) {
            super(2, bVar);
            this.f37347v = function0;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return l0.this.new f(this.f37347v, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, eu.b<? super Unit> bVar) {
            return ((f) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f37345t;
            try {
                if (i10 == 0) {
                    zt.o.b(obj);
                    l0 l0Var = l0.this;
                    this.f37345t = 1;
                    obj = l0Var.n(this);
                    if (obj == objE) {
                        return objE;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zt.o.b(obj);
                }
                this.f37347v.invoke();
                return Unit.f21506a;
            } catch (Throwable th2) {
                this.f37347v.invoke();
                throw th2;
            }
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @gu.f(c = "androidx.room.TriggerBasedInvalidationTracker", f = "InvalidationTracker.kt", l = {328, 333}, m = "startTrackingTable")
    public static final class g extends gu.d {
        public int B;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f37348t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f37349u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f37350v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f37351w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f37352x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f37353y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public /* synthetic */ Object f37354z;

        public g(eu.b<? super g> bVar) {
            super(bVar);
        }

        @Override // gu.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f37354z = obj;
            this.B |= Integer.MIN_VALUE;
            return l0.this.v(null, 0, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @gu.f(c = "androidx.room.TriggerBasedInvalidationTracker", f = "InvalidationTracker.kt", l = {347}, m = "stopTrackingTable")
    public static final class h extends gu.d {
        public int A;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f37355t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f37356u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f37357v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f37358w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f37359x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public /* synthetic */ Object f37360y;

        public h(eu.b<? super h> bVar) {
            super(bVar);
        }

        @Override // gu.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f37360y = obj;
            this.A |= Integer.MIN_VALUE;
            return l0.this.w(null, 0, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @gu.f(c = "androidx.room.TriggerBasedInvalidationTracker", f = "InvalidationTracker.kt", l = {306}, m = "syncTriggers$room_runtime")
    public static final class i extends gu.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f37362t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f37363u;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f37365w;

        public i(eu.b<? super i> bVar) {
            super(bVar);
        }

        @Override // gu.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f37363u = obj;
            this.f37365w |= Integer.MIN_VALUE;
            return l0.this.x(this);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ly4/g0;", "connection", BuildConfig.FLAVOR, "<anonymous>", "(Ly4/g0;)V"}, k = 3, mv = {2, 1, 0})
    @gu.f(c = "androidx.room.TriggerBasedInvalidationTracker$syncTriggers$2$1", f = "InvalidationTracker.kt", l = {307, 314}, m = "invokeSuspend")
    public static final class j extends gu.m implements Function2<g0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f37366t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f37367u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f37368v;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ly4/f0;", BuildConfig.FLAVOR, "<anonymous>", "(Ly4/f0;)V"}, k = 3, mv = {2, 1, 0})
        @gu.f(c = "androidx.room.TriggerBasedInvalidationTracker$syncTriggers$2$1$1$1", f = "InvalidationTracker.kt", l = {318, 319}, m = "invokeSuspend")
        public static final class a extends gu.m implements Function2<f0<Unit>, eu.b<? super Unit>, Object> {
            public final /* synthetic */ k.a[] A;
            public final /* synthetic */ l0 B;
            public final /* synthetic */ g0 C;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public Object f37370t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public Object f37371u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public Object f37372v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public int f37373w;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            public int f37374x;

            /* JADX INFO: renamed from: y, reason: collision with root package name */
            public int f37375y;

            /* JADX INFO: renamed from: z, reason: collision with root package name */
            public int f37376z;

            /* JADX INFO: renamed from: y4.l0$j$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final /* synthetic */ class C0764a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f37377a;

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
                    f37377a = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(k.a[] aVarArr, l0 l0Var, g0 g0Var, eu.b<? super a> bVar) {
                super(2, bVar);
                this.A = aVarArr;
                this.B = l0Var;
                this.C = g0Var;
            }

            @Override // gu.a
            public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
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
            @Override // gu.a
            public final java.lang.Object invokeSuspend(java.lang.Object r12) {
                /*
                    r11 = this;
                    java.lang.Object r0 = fu.c.e()
                    int r1 = r11.f37376z
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L2c
                    if (r1 == r3) goto Le
                    if (r1 != r2) goto L24
                Le:
                    int r1 = r11.f37375y
                    int r4 = r11.f37374x
                    int r5 = r11.f37373w
                    java.lang.Object r6 = r11.f37372v
                    y4.g0 r6 = (y4.g0) r6
                    java.lang.Object r7 = r11.f37371u
                    y4.l0 r7 = (y4.l0) r7
                    java.lang.Object r8 = r11.f37370t
                    y4.k$a[] r8 = (y4.k.a[]) r8
                    zt.o.b(r12)
                    goto L68
                L24:
                    java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r12.<init>(r0)
                    throw r12
                L2c:
                    zt.o.b(r12)
                    y4.k$a[] r12 = r11.A
                    y4.l0 r1 = r11.B
                    y4.g0 r4 = r11.C
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
                    int[] r10 = y4.l0.j.a.C0764a.f37377a
                    int r5 = r5.ordinal()
                    r5 = r10[r5]
                    if (r5 == r3) goto L86
                    if (r5 == r2) goto L71
                    r10 = 3
                    if (r5 != r10) goto L6b
                    r11.f37370t = r8
                    r11.f37371u = r7
                    r11.f37372v = r12
                    r11.f37373w = r9
                    r11.f37374x = r4
                    r11.f37375y = r1
                    r11.f37376z = r2
                    java.lang.Object r5 = y4.l0.i(r7, r12, r6, r11)
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
                    zt.l r12 = new zt.l
                    r12.<init>()
                    throw r12
                L71:
                    r11.f37370t = r8
                    r11.f37371u = r7
                    r11.f37372v = r12
                    r11.f37373w = r9
                    r11.f37374x = r4
                    r11.f37375y = r1
                    r11.f37376z = r3
                    java.lang.Object r5 = y4.l0.h(r7, r12, r6, r11)
                    if (r5 != r0) goto L66
                L85:
                    return r0
                L86:
                    r6 = r9
                L87:
                    int r4 = r4 + r3
                    goto L3c
                L89:
                    kotlin.Unit r12 = p001kotlin.Unit.f21506a
                    return r12
                */
                throw new UnsupportedOperationException("Method not decompiled: y4.l0.j.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // p001kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public final Object invoke(f0<Unit> f0Var, eu.b<? super Unit> bVar) {
                return ((a) create(f0Var, bVar)).invokeSuspend(Unit.f21506a);
            }
        }

        public j(eu.b<? super j> bVar) {
            super(2, bVar);
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            j jVar = l0.this.new j(bVar);
            jVar.f37368v = obj;
            return jVar;
        }

        /* JADX WARN: Code duplicated, block: B:25:0x0073  */
        @Override // gu.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            g0 g0Var;
            Object objB;
            k kVar;
            ReentrantLock reentrantLock;
            k.a[] aVarArr;
            k.a aVar;
            k kVar2;
            ReentrantLock reentrantLock2;
            Object objE = fu.c.e();
            int i10 = this.f37367u;
            boolean z10 = true;
            if (i10 == 0) {
                zt.o.b(obj);
                g0Var = (g0) this.f37368v;
                this.f37368v = g0Var;
                this.f37367u = 1;
                objB = g0Var.b(this);
                if (objB != objE) {
                }
                return objE;
            }
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                reentrantLock2 = (ReentrantLock) this.f37366t;
                kVar2 = (k) this.f37368v;
                try {
                    zt.o.b(obj);
                    reentrantLock = reentrantLock2;
                    kVar = kVar2;
                    kVar.inProgressSync = false;
                    Unit unit = Unit.f21506a;
                    reentrantLock.unlock();
                    return Unit.f21506a;
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
            g0Var = (g0) this.f37368v;
            zt.o.b(obj);
            objB = obj;
            if (((Boolean) objB).booleanValue()) {
                return Unit.f21506a;
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
                                this.f37368v = kVar;
                                this.f37366t = reentrantLock;
                                this.f37367u = 2;
                                if (g0Var.c(aVar2, aVar3, this) != objE) {
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
                    Unit unit2 = Unit.f21506a;
                    reentrantLock.unlock();
                    return Unit.f21506a;
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

        @Override // p001kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(g0 g0Var, eu.b<? super Unit> bVar) {
            return ((j) create(g0Var, bVar)).invokeSuspend(Unit.f21506a);
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
        this.onAllowRefresh = new Function0() { // from class: y4.k0
            @Override // p001kotlin.jvm.functions.Function0
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
                map.put(lowerCase4, (Integer) p001kotlin.collections.k0.k(map, lowerCase3));
            }
        }
        this.observedTableStates = new k(this.tablesNames.length);
        this.observedTableVersions = new l(this.tablesNames.length);
    }

    public static final Set k(g5.d statement) {
        Intrinsics.checkNotNullParameter(statement, "statement");
        Set setB = p001kotlin.collections.p0.b();
        while (statement.n3()) {
            setB.add(Integer.valueOf((int) statement.getLong(0)));
        }
        return p001kotlin.collections.p0.a(setB);
    }

    public static final boolean o() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object j(m mVar, eu.b<? super Set<Integer>> bVar) {
        b bVar2;
        if (bVar instanceof b) {
            bVar2 = (b) bVar;
            int i10 = bVar2.f37318w;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar2.f37318w = i10 - Integer.MIN_VALUE;
            } else {
                bVar2 = new b(bVar);
            }
        } else {
            bVar2 = new b(bVar);
        }
        Object objA = bVar2.f37316u;
        Object objE = fu.c.e();
        int i11 = bVar2.f37318w;
        if (i11 == 0) {
            zt.o.b(objA);
            Function1 function1 = new Function1() { // from class: y4.j0
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return l0.k((g5.d) obj);
                }
            };
            bVar2.f37315t = mVar;
            bVar2.f37318w = 1;
            objA = mVar.a("SELECT * FROM room_table_modification_log WHERE invalidated = 1", function1, bVar2);
            if (objA != objE) {
            }
            return objE;
        }
        if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Set set = (Set) bVar2.f37315t;
            zt.o.b(objA);
            return set;
        }
        mVar = (m) bVar2.f37315t;
        zt.o.b(objA);
        Set set2 = (Set) objA;
        if (!set2.isEmpty()) {
            bVar2.f37315t = set2;
            bVar2.f37318w = 2;
            if (i0.b(mVar, "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1", bVar2) == objE) {
                return objE;
            }
        }
        return set2;
    }

    public final void l(@NotNull g5.b connection) throws Exception {
        Intrinsics.checkNotNullParameter(connection, "connection");
        g5.d dVarW3 = connection.w3("PRAGMA query_only");
        try {
            dVarW3.n3();
            boolean zD2 = dVarW3.d2(0);
            nu.a.a(dVarW3, null);
            if (zD2) {
                return;
            }
            g5.a.a(connection, "PRAGMA temp_store = MEMORY");
            g5.a.a(connection, "PRAGMA recursive_triggers = 1");
            g5.a.a(connection, "DROP TABLE IF EXISTS room_table_modification_log");
            if (this.useTempTable) {
                g5.a.a(connection, "CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
            } else {
                g5.a.a(connection, p001kotlin.text.x.N("CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)", "TEMP", BuildConfig.FLAVOR, false, 4, null));
            }
            this.observedTableStates.h();
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                nu.a.a(dVarW3, th2);
                throw th3;
            }
        }
    }

    @NotNull
    public final dv.h<Set<String>> m(@NotNull String[] resolvedTableNames, @NotNull int[] tableIds, boolean emitInitialState) {
        Intrinsics.checkNotNullParameter(resolvedTableNames, "resolvedTableNames");
        Intrinsics.checkNotNullParameter(tableIds, "tableIds");
        return dv.j.w(new c(tableIds, emitInitialState, resolvedTableNames, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object n(eu.b<? super Set<Integer>> bVar) throws Throwable {
        d dVar;
        z4.a aVar;
        Throwable th2;
        if (bVar instanceof d) {
            dVar = (d) bVar;
            int i10 = dVar.f37338w;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar.f37338w = i10 - Integer.MIN_VALUE;
            } else {
                dVar = new d(bVar);
            }
        } else {
            dVar = new d(bVar);
        }
        Object obj = dVar.f37336u;
        Object objE = fu.c.e();
        int i11 = dVar.f37338w;
        if (i11 == 0) {
            zt.o.b(obj);
            z4.a closeBarrier = this.database.getCloseBarrier();
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
                dVar.f37335t = closeBarrier;
                dVar.f37338w = 1;
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
            aVar = (z4.a) dVar.f37335t;
            try {
                zt.o.b(obj);
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
            av.k.d(this.database.s(), new CoroutineName("Room Invalidation Tracker Refresh"), null, new f(onRefreshCompleted, null), 2, null);
        }
    }

    public final void s() {
        this.observedTableStates.k();
    }

    public final String[] t(String[] names) {
        Set setB = p001kotlin.collections.p0.b();
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
        return (String[]) p001kotlin.collections.p0.a(setB).toArray(new String[0]);
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
    
        if (y4.i0.b(r13, r15, r0) == r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00e0, code lost:
    
        if (y4.i0.b(r7, r15, r0) == r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00e2, code lost:
    
        return r1;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00e0 -> B:28:0x00e3). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(m mVar, int i10, eu.b<? super Unit> bVar) {
        g gVar;
        m mVar2;
        int length;
        String[] strArr;
        int i11;
        int i12;
        String str;
        String str2;
        if (bVar instanceof g) {
            gVar = (g) bVar;
            int i13 = gVar.B;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                gVar.B = i13 - Integer.MIN_VALUE;
            } else {
                gVar = new g(bVar);
            }
        } else {
            gVar = new g(bVar);
        }
        Object obj = gVar.f37354z;
        Object objE = fu.c.e();
        int i14 = gVar.B;
        if (i14 != 0) {
            if (i14 == 1) {
                i10 = gVar.f37351w;
                mVar = (m) gVar.f37348t;
                zt.o.b(obj);
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                length = gVar.f37353y;
                i12 = gVar.f37352x;
                i11 = gVar.f37351w;
                strArr = (String[]) gVar.f37350v;
                str = (String) gVar.f37349u;
                mVar2 = (m) gVar.f37348t;
                zt.o.b(obj);
            }
            i12++;
            if (i12 < length) {
                return Unit.f21506a;
            }
            String str3 = strArr[i12];
            if (this.useTempTable) {
                str2 = "TEMP";
            } else {
                str2 = BuildConfig.FLAVOR;
            }
            String str4 = "CREATE " + str2 + " TRIGGER IF NOT EXISTS `" + INSTANCE.b(str, str3) + "` AFTER " + str3 + " ON `" + str + "` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = " + i11 + " AND invalidated = 0; END";
            gVar.f37348t = mVar2;
            gVar.f37349u = str;
            gVar.f37350v = strArr;
            gVar.f37351w = i11;
            gVar.f37352x = i12;
            gVar.f37353y = length;
            gVar.B = 2;
        } else {
            zt.o.b(obj);
            String str5 = "INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i10 + ", 0)";
            gVar.f37348t = mVar;
            gVar.f37351w = i10;
            gVar.B = 1;
        }
        String str6 = this.tablesNames[i10];
        String[] strArr2 = f37304m;
        mVar2 = mVar;
        length = strArr2.length;
        strArr = strArr2;
        i11 = i10;
        i12 = 0;
        str = str6;
        if (i12 < length) {
            return Unit.f21506a;
        }
        String str7 = strArr[i12];
        if (this.useTempTable) {
            str2 = "TEMP";
        } else {
            str2 = BuildConfig.FLAVOR;
        }
        String str8 = "CREATE " + str2 + " TRIGGER IF NOT EXISTS `" + INSTANCE.b(str, str7) + "` AFTER " + str7 + " ON `" + str + "` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = " + i11 + " AND invalidated = 0; END";
        gVar.f37348t = mVar2;
        gVar.f37349u = str;
        gVar.f37350v = strArr;
        gVar.f37351w = i11;
        gVar.f37352x = i12;
        gVar.f37353y = length;
        gVar.B = 2;
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
    public final java.lang.Object w(y4.m r10, int r11, eu.b<? super p001kotlin.Unit> r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof y4.l0.h
            if (r0 == 0) goto L13
            r0 = r12
            y4.l0$h r0 = (y4.l0.h) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            y4.l0$h r0 = new y4.l0$h
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f37360y
            java.lang.Object r1 = fu.c.e()
            int r2 = r0.A
            r3 = 1
            if (r2 == 0) goto L42
            if (r2 != r3) goto L3a
            int r10 = r0.f37359x
            int r11 = r0.f37358w
            java.lang.Object r2 = r0.f37357v
            java.lang.String[] r2 = (java.lang.String[]) r2
            java.lang.Object r4 = r0.f37356u
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r0.f37355t
            y4.m r5 = (y4.m) r5
            zt.o.b(r12)
            r12 = r4
            goto L87
        L3a:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L42:
            zt.o.b(r12)
            java.lang.String[] r12 = r9.tablesNames
            r11 = r12[r11]
            java.lang.String[] r12 = y4.l0.f37304m
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
            y4.l0$a r6 = y4.l0.INSTANCE
            java.lang.String r5 = y4.l0.Companion.a(r6, r12, r5)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "DROP TRIGGER IF EXISTS `"
            r6.append(r7)
            r6.append(r5)
            r5 = 96
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            r0.f37355t = r11
            r0.f37356u = r12
            r0.f37357v = r2
            r0.f37358w = r4
            r0.f37359x = r10
            r0.A = r3
            java.lang.Object r5 = y4.i0.b(r11, r5, r0)
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
            kotlin.Unit r10 = p001kotlin.Unit.f21506a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: y4.l0.w(y4.m, int, eu.b):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object x(@NotNull eu.b<? super Unit> bVar) throws Throwable {
        i iVar;
        z4.a aVar;
        Throwable th2;
        if (bVar instanceof i) {
            iVar = (i) bVar;
            int i10 = iVar.f37365w;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                iVar.f37365w = i10 - Integer.MIN_VALUE;
            } else {
                iVar = new i(bVar);
            }
        } else {
            iVar = new i(bVar);
        }
        Object obj = iVar.f37363u;
        Object objE = fu.c.e();
        int i11 = iVar.f37365w;
        if (i11 == 0) {
            zt.o.b(obj);
            z4.a closeBarrier = this.database.getCloseBarrier();
            if (closeBarrier.a()) {
                try {
                    u uVar = this.database;
                    j jVar = new j(null);
                    iVar.f37362t = closeBarrier;
                    iVar.f37365w = 1;
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
            aVar = (z4.a) iVar.f37362t;
            try {
                zt.o.b(obj);
                aVar.c();
            } catch (Throwable th4) {
                th2 = th4;
                aVar.c();
                throw th2;
            }
        }
        return Unit.f21506a;
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
        return zt.s.a(strArrT, iArr);
    }
}
