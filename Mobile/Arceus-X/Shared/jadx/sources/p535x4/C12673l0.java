package p535x4;

import android.database.SQLException;
import androidx.core.view.inputmethod.EditorInfoCompat;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7690k0;
import kotlin.collections.C7693m;
import kotlin.collections.C7700p0;
import kotlin.collections.C7702q0;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7729c0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C7797x;
import nu.C9579j;
import nu.InterfaceC9575h;
import nu.InterfaceC9577i;
import okhttp3.internal.http.HttpStatusCodesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p041c5.C1525a;
import p119f5.C5358a;
import p119f5.InterfaceC5359b;
import p119f5.InterfaceC5361d;
import p229jt.C7334d;
import p229jt.C7348o;
import p229jt.C7352s;
import p256ku.C7882k;
import p256ku.CoroutineName;
import p256ku.InterfaceC7906p0;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p559xt.C12915a;
import p566y4.C13027a;
import pt.AbstractC10342d;
import pt.AbstractC10351m;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: x4.l0 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 !2\u00020\u0001:\u00018Bo\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00070\u0004\u0012\u000e\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0018\u0010\u0010\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u0007\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\t2\u000e\u0010\u0013\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\tH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J \u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b\u0019\u0010\u001aJ \u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b\u001b\u0010\u001aJ\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007H\u0082@¢\u0006\u0004\b\u001c\u0010\u001dJ\u001e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\u0006\u0010\u0017\u001a\u00020\u0016H\u0082@¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010!\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020 ¢\u0006\u0004\b!\u0010\"J9\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00070'2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00050\t2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u000bH\u0000¢\u0006\u0004\b(\u0010)J1\u0010+\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\t\u0012\u0004\u0012\u00020$0*2\u000e\u0010\u0013\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\tH\u0000¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020$H\u0000¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020$H\u0000¢\u0006\u0004\b/\u0010.J\u0010\u00100\u001a\u00020\u000fH\u0080@¢\u0006\u0004\b0\u0010\u001dJ/\u00104\u001a\u00020\u000f2\u000e\b\u0002\u00102\u001a\b\u0012\u0004\u0012\u00020\u000f012\u000e\b\u0002\u00103\u001a\b\u0012\u0004\u0012\u00020\u000f01H\u0000¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\u000fH\u0000¢\u0006\u0004\b6\u00107R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R&\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00070\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010;R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R&\u0010\u0010\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u0007\u0012\u0004\u0012\u00020\u000f0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R \u0010B\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010;R\u001a\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00050\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010I\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010M\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0018\u0010Q\u001a\u00060Nj\u0002`O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010PR(\u0010X\u001a\b\u0012\u0004\u0012\u00020\u000b018\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010W¨\u0006Y"}, m31665d2 = {"Lx4/l0;", "", "Lx4/u;", "database", "", "", "shadowTablesMap", "", "viewTables", "", "tableNames", "", "useTempTable", "Lkotlin/Function1;", "", "", "onInvalidatedTablesIds", "<init>", "(Lx4/u;Ljava/util/Map;Ljava/util/Map;[Ljava/lang/String;ZLkotlin/jvm/functions/Function1;)V", "names", "t", "([Ljava/lang/String;)[Ljava/lang/String;", "Lx4/m;", "connection", "tableId", "v", "(Lx4/m;ILnt/b;)Ljava/lang/Object;", "w", "n", "(Lnt/b;)Ljava/lang/Object;", "j", "(Lx4/m;Lnt/b;)Ljava/lang/Object;", "Lf5/b;", "l", "(Lf5/b;)V", "resolvedTableNames", "", "tableIds", "emitInitialState", "Lnu/h;", "m", "([Ljava/lang/String;[IZ)Lnu/h;", "Lkotlin/Pair;", "y", "([Ljava/lang/String;)Lkotlin/Pair;", "p", "([I)Z", "q", "x", "Lkotlin/Function0;", "onRefreshScheduled", "onRefreshCompleted", "r", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "s", "()V", "a", "Lx4/u;", "b", "Ljava/util/Map;", "c", "d", "Z", "e", "Lkotlin/jvm/functions/Function1;", "f", "tableIdLookup", "g", "[Ljava/lang/String;", "tablesNames", "Lx4/k;", "h", "Lx4/k;", "observedTableStates", "Lx4/l;", "i", "Lx4/l;", "observedTableVersions", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Landroidx/room/concurrent/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "pendingRefresh", "k", "Lkotlin/jvm/functions/Function0;", "getOnAllowRefresh$room_runtime", "()Lkotlin/jvm/functions/Function0;", "u", "(Lkotlin/jvm/functions/Function0;)V", "onAllowRefresh", "room-runtime"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C12673l0 {

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: m */
    @NotNull
    public static final String[] f45051m = {"INSERT", "UPDATE", "DELETE"};

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final AbstractC12682u database;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Map<String, String> shadowTablesMap;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Map<String, Set<String>> viewTables;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final boolean useTempTable;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final Function1<Set<Integer>, Unit> onInvalidatedTablesIds;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final Map<String, Integer> tableIdLookup;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final String[] tablesNames;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final C12670k observedTableStates;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final C12672l observedTableVersions;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final AtomicBoolean pendingRefresh;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public Function0<Boolean> onAllowRefresh;

    /* JADX INFO: renamed from: x4.l0$a, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\rR\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\rR\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\rR\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\r¨\u0006\u0014"}, m31665d2 = {"Lx4/l0$a;", "", "<init>", "()V", "", "tableName", "triggerType", "b", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "", "TRIGGERS", "[Ljava/lang/String;", "UPDATE_TABLE_NAME", "Ljava/lang/String;", "TABLE_ID_COLUMN_NAME", "INVALIDATED_COLUMN_NAME", "CREATE_TRACKING_TABLE_SQL", "DROP_TRACKING_TABLE_SQL", "SELECT_UPDATED_TABLES_SQL", "RESET_UPDATED_TABLES_SQL", "room-runtime"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: x4.l0.a.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: b */
        public final String m47220b(String tableName, String triggerType) {
            return "room_table_modification_trigger_" + tableName + '_' + triggerType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Companion() {
        }
    }

    /* JADX INFO: renamed from: x4.l0$b */
    @InterfaceC10344f(m39663c = "androidx.room.TriggerBasedInvalidationTracker", m39664f = "InvalidationTracker.kt", m39665l = {445, 453}, m39666m = "checkInvalidatedTables")
    @Metadata(m31666k = 3, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class b extends AbstractC10342d {

        /* JADX INFO: renamed from: t */
        public Object f45063t;

        /* JADX INFO: renamed from: u */
        public /* synthetic */ Object f45064u;

        /* JADX INFO: renamed from: w */
        public int f45066w;

        public b(InterfaceC9557b<? super b> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f45064u = obj;
            this.f45066w |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return C12673l0.this.m47205j(null, this);
        }
    }

    /* JADX INFO: renamed from: x4.l0$c */
    @Metadata(m31664d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m31665d2 = {"Lnu/i;", "", "", "", "<anonymous>", "(Lnu/i;)V"}, m31666k = 3, m31667mv = {2, 1, 0})
    @InterfaceC10344f(m39663c = "androidx.room.TriggerBasedInvalidationTracker$createFlow$1", m39664f = "InvalidationTracker.kt", m39665l = {239, 239, 243}, m39666m = "invokeSuspend")
    public static final class c extends AbstractC10351m implements Function2<InterfaceC9577i<? super Set<? extends String>>, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f45067t;

        /* JADX INFO: renamed from: u */
        public /* synthetic */ Object f45068u;

        /* JADX INFO: renamed from: w */
        public final /* synthetic */ int[] f45070w;

        /* JADX INFO: renamed from: x */
        public final /* synthetic */ boolean f45071x;

        /* JADX INFO: renamed from: y */
        public final /* synthetic */ String[] f45072y;

        /* JADX INFO: renamed from: x4.l0$c$a */
        @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 1, 0})
        @InterfaceC10344f(m39663c = "androidx.room.TriggerBasedInvalidationTracker$createFlow$1$1", m39664f = "InvalidationTracker.kt", m39665l = {239}, m39666m = "invokeSuspend")
        public static final class a extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t */
            public int f45073t;

            /* JADX INFO: renamed from: u */
            public final /* synthetic */ C12673l0 f45074u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C12673l0 c12673l0, InterfaceC9557b<? super a> interfaceC9557b) {
                super(2, interfaceC9557b);
                this.f45074u = c12673l0;
            }

            @Override // pt.AbstractC10339a
            public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
                return new a(this.f45074u, interfaceC9557b);
            }

            @Override // pt.AbstractC10339a
            public final Object invokeSuspend(Object obj) {
                Object objM38805e = C10047c.m38805e();
                int i10 = this.f45073t;
                if (i10 == 0) {
                    C7348o.m30470b(obj);
                    C12673l0 c12673l0 = this.f45074u;
                    this.f45073t = 1;
                    if (c12673l0.m47217x(this) == objM38805e) {
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

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
                return ((a) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
            }
        }

        /* JADX INFO: renamed from: x4.l0$c$b */
        @Metadata(m31666k = 3, m31667mv = {2, 1, 0}, m31669xi = 48)
        public static final class b<T> implements InterfaceC9577i {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ C7729c0<int[]> f45075a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ boolean f45076b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ InterfaceC9577i<Set<String>> f45077c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ String[] f45078d;

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ int[] f45079e;

            /* JADX INFO: renamed from: x4.l0$c$b$a */
            @InterfaceC10344f(m39663c = "androidx.room.TriggerBasedInvalidationTracker$createFlow$1$2", m39664f = "InvalidationTracker.kt", m39665l = {247, 256}, m39666m = "emit")
            @Metadata(m31666k = 3, m31667mv = {2, 1, 0}, m31669xi = 48)
            public static final class a extends AbstractC10342d {

                /* JADX INFO: renamed from: t */
                public Object f45080t;

                /* JADX INFO: renamed from: u */
                public /* synthetic */ Object f45081u;

                /* JADX INFO: renamed from: v */
                public final /* synthetic */ b<T> f45082v;

                /* JADX INFO: renamed from: w */
                public int f45083w;

                /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: x4.l0$c$b<? super T> */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public a(b<? super T> bVar, InterfaceC9557b<? super a> interfaceC9557b) {
                    super(interfaceC9557b);
                    this.f45082v = bVar;
                }

                @Override // pt.AbstractC10339a
                public final Object invokeSuspend(Object obj) {
                    this.f45081u = obj;
                    this.f45083w |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                    return this.f45082v.emit(null, this);
                }
            }

            /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: nu.i<? super java.util.Set<java.lang.String>> */
            /* JADX WARN: Multi-variable type inference failed */
            public b(C7729c0<int[]> c7729c0, boolean z10, InterfaceC9577i<? super Set<String>> interfaceC9577i, String[] strArr, int[] iArr) {
                this.f45075a = c7729c0;
                this.f45076b = z10;
                this.f45077c = interfaceC9577i;
                this.f45078d = strArr;
                this.f45079e = iArr;
            }

            /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object; */
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
            @Override // nu.InterfaceC9577i
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(int[] iArr, InterfaceC9557b<? super Unit> interfaceC9557b) {
                a aVar;
                Object obj;
                if (interfaceC9557b instanceof a) {
                    aVar = (a) interfaceC9557b;
                    int i10 = aVar.f45083w;
                    if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                        aVar.f45083w = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                    } else {
                        aVar = new a(this, interfaceC9557b);
                    }
                } else {
                    aVar = new a(this, interfaceC9557b);
                }
                Object obj2 = aVar.f45081u;
                Object objM38805e = C10047c.m38805e();
                int i11 = aVar.f45083w;
                if (i11 == 0) {
                    C7348o.m30470b(obj2);
                    C7729c0<int[]> c7729c0 = this.f45075a;
                    if (c7729c0.f29425a != null) {
                        String[] strArr = this.f45078d;
                        int[] iArr2 = this.f45079e;
                        ArrayList arrayList = new ArrayList();
                        int length = strArr.length;
                        int i12 = 0;
                        int i13 = 0;
                        while (i12 < length) {
                            String str = strArr[i12];
                            int i14 = i13 + 1;
                            int[] iArr3 = c7729c0.f29425a;
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
                            InterfaceC9577i<Set<String>> interfaceC9577i = this.f45077c;
                            Set<String> setQ0 = CollectionsKt.m31691Q0(arrayList);
                            aVar.f45080t = iArr;
                            aVar.f45083w = 2;
                        }
                    } else if (this.f45076b) {
                        InterfaceC9577i<Set<String>> interfaceC9577i2 = this.f45077c;
                        Set<String> setM31870m0 = C7693m.m31870m0(this.f45078d);
                        aVar.f45080t = iArr;
                        aVar.f45083w = 1;
                    }
                } else {
                    if (i11 != 1 && i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Object obj3 = (T) ((int[]) aVar.f45080t);
                    C7348o.m30470b(obj2);
                    obj = obj3;
                }
                obj = iArr;
                obj = iArr;
                obj = iArr;
                obj = iArr;
                this.f45075a.f29425a = (T) obj;
                return Unit.f29331a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int[] iArr, boolean z10, String[] strArr, InterfaceC9557b<? super c> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f45070w = iArr;
            this.f45071x = z10;
            this.f45072y = strArr;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            c cVar = C12673l0.this.new c(this.f45070w, this.f45071x, this.f45072y, interfaceC9557b);
            cVar.f45068u = obj;
            return cVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x006e, code lost:
        
            if (p256ku.C7872i.m32684g((kotlin.coroutines.CoroutineContext) r12, r5, r11) == r0) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0092, code lost:
        
            if (r12.m47192a(r4, r11) == r0) goto L28;
         */
        @Override // pt.AbstractC10339a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            InterfaceC9577i interfaceC9577i;
            InterfaceC9577i interfaceC9577i2;
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f45067t;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        interfaceC9577i2 = (InterfaceC9577i) this.f45068u;
                        C7348o.m30470b(obj);
                    } else if (i10 == 2) {
                        interfaceC9577i2 = (InterfaceC9577i) this.f45068u;
                        C7348o.m30470b(obj);
                        interfaceC9577i = interfaceC9577i2;
                        C7729c0 c7729c0 = new C7729c0();
                        C12672l c12672l = C12673l0.this.observedTableVersions;
                        b bVar = new b(c7729c0, this.f45071x, interfaceC9577i, this.f45072y, this.f45070w);
                        this.f45068u = null;
                        this.f45067t = 3;
                    } else {
                        if (i10 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C7348o.m30470b(obj);
                    }
                    throw new C7334d();
                }
                C7348o.m30470b(obj);
                InterfaceC9577i interfaceC9577i3 = (InterfaceC9577i) this.f45068u;
                if (C12673l0.this.observedTableStates.m47188i(this.f45070w)) {
                    AbstractC12682u abstractC12682u = C12673l0.this.database;
                    this.f45068u = interfaceC9577i3;
                    this.f45067t = 1;
                    Object objM8064b = C1525a.m8064b(abstractC12682u, false, this);
                    if (objM8064b != objM38805e) {
                        interfaceC9577i2 = interfaceC9577i3;
                        obj = objM8064b;
                    }
                } else {
                    interfaceC9577i = interfaceC9577i3;
                    C7729c0 c7729c1 = new C7729c0();
                    C12672l c12672l2 = C12673l0.this.observedTableVersions;
                    b bVar2 = new b(c7729c1, this.f45071x, interfaceC9577i, this.f45072y, this.f45070w);
                    this.f45068u = null;
                    this.f45067t = 3;
                }
                return objM38805e;
                a aVar = new a(C12673l0.this, null);
                this.f45068u = interfaceC9577i2;
                this.f45067t = 2;
            } catch (Throwable th2) {
                C12673l0.this.observedTableStates.m47189j(this.f45070w);
                throw th2;
            }
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC9577i<? super Set<String>> interfaceC9577i, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((c) create(interfaceC9577i, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: x4.l0$d */
    @InterfaceC10344f(m39663c = "androidx.room.TriggerBasedInvalidationTracker", m39664f = "InvalidationTracker.kt", m39665l = {417}, m39666m = "notifyInvalidation")
    @Metadata(m31666k = 3, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class d extends AbstractC10342d {

        /* JADX INFO: renamed from: t */
        public Object f45084t;

        /* JADX INFO: renamed from: u */
        public /* synthetic */ Object f45085u;

        /* JADX INFO: renamed from: w */
        public int f45087w;

        public d(InterfaceC9557b<? super d> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f45085u = obj;
            this.f45087w |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return C12673l0.this.m47208n(this);
        }
    }

    /* JADX INFO: renamed from: x4.l0$e */
    @Metadata(m31664d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m31665d2 = {"Lx4/g0;", "connection", "", "", "<anonymous>", "(Lx4/g0;)Ljava/util/Set;"}, m31666k = 3, m31667mv = {2, 1, 0})
    @InterfaceC10344f(m39663c = "androidx.room.TriggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$1", m39664f = "InvalidationTracker.kt", m39665l = {418, 425}, m39666m = "invokeSuspend")
    public static final class e extends AbstractC10351m implements Function2<InterfaceC12663g0, InterfaceC9557b<? super Set<? extends Integer>>, Object> {

        /* JADX INFO: renamed from: t */
        public int f45088t;

        /* JADX INFO: renamed from: u */
        public /* synthetic */ Object f45089u;

        /* JADX INFO: renamed from: x4.l0$e$a */
        @Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"Lx4/f0;", "", "", "<anonymous>", "(Lx4/f0;)Ljava/util/Set;"}, m31666k = 3, m31667mv = {2, 1, 0})
        @InterfaceC10344f(m39663c = "androidx.room.TriggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$1$1", m39664f = "InvalidationTracker.kt", m39665l = {426}, m39666m = "invokeSuspend")
        public static final class a extends AbstractC10351m implements Function2<InterfaceC12661f0<Set<? extends Integer>>, InterfaceC9557b<? super Set<? extends Integer>>, Object> {

            /* JADX INFO: renamed from: t */
            public int f45091t;

            /* JADX INFO: renamed from: u */
            public /* synthetic */ Object f45092u;

            /* JADX INFO: renamed from: v */
            public final /* synthetic */ C12673l0 f45093v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C12673l0 c12673l0, InterfaceC9557b<? super a> interfaceC9557b) {
                super(2, interfaceC9557b);
                this.f45093v = c12673l0;
            }

            @Override // pt.AbstractC10339a
            public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
                a aVar = new a(this.f45093v, interfaceC9557b);
                aVar.f45092u = obj;
                return aVar;
            }

            @Override // pt.AbstractC10339a
            public final Object invokeSuspend(Object obj) {
                Object objM38805e = C10047c.m38805e();
                int i10 = this.f45091t;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7348o.m30470b(obj);
                    return obj;
                }
                C7348o.m30470b(obj);
                InterfaceC12661f0 interfaceC12661f0 = (InterfaceC12661f0) this.f45092u;
                C12673l0 c12673l0 = this.f45093v;
                this.f45091t = 1;
                Object objM47205j = c12673l0.m47205j(interfaceC12661f0, this);
                return objM47205j == objM38805e ? objM38805e : objM47205j;
            }

            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC12661f0<Set<Integer>> interfaceC12661f0, InterfaceC9557b<? super Set<Integer>> interfaceC9557b) {
                return ((a) create(interfaceC12661f0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
            }
        }

        public e(InterfaceC9557b<? super e> interfaceC9557b) {
            super(2, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            e eVar = C12673l0.this.new e(interfaceC9557b);
            eVar.f45089u = obj;
            return eVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0054, code lost:
        
            if (r7 == r0) goto L20;
         */
        @Override // pt.AbstractC10339a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            InterfaceC12663g0 interfaceC12663g0;
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f45088t;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        interfaceC12663g0 = (InterfaceC12663g0) this.f45089u;
                        C7348o.m30470b(obj);
                    } else {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C7348o.m30470b(obj);
                    }
                    return (Set) obj;
                }
                C7348o.m30470b(obj);
                interfaceC12663g0 = (InterfaceC12663g0) this.f45089u;
                this.f45089u = interfaceC12663g0;
                this.f45088t = 1;
                obj = interfaceC12663g0.mo47174b(this);
                if (obj != objM38805e) {
                }
                return objM38805e;
                if (((Boolean) obj).booleanValue()) {
                    return C7702q0.m31908d();
                }
                InterfaceC12663g0.a aVar = InterfaceC12663g0.a.IMMEDIATE;
                a aVar2 = new a(C12673l0.this, null);
                this.f45089u = null;
                this.f45088t = 2;
                obj = interfaceC12663g0.mo47175c(aVar, aVar2, this);
            } catch (SQLException unused) {
                return C7702q0.m31908d();
            }
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC12663g0 interfaceC12663g0, InterfaceC9557b<? super Set<Integer>> interfaceC9557b) {
            return ((e) create(interfaceC12663g0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: x4.l0$f */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 1, 0})
    @InterfaceC10344f(m39663c = "androidx.room.TriggerBasedInvalidationTracker$refreshInvalidationAsync$3", m39664f = "InvalidationTracker.kt", m39665l = {394}, m39666m = "invokeSuspend")
    public static final class f extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f45094t;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ Function0<Unit> f45096v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Function0<Unit> function0, InterfaceC9557b<? super f> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f45096v = function0;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return C12673l0.this.new f(this.f45096v, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f45094t;
            try {
                if (i10 == 0) {
                    C7348o.m30470b(obj);
                    C12673l0 c12673l0 = C12673l0.this;
                    this.f45094t = 1;
                    obj = c12673l0.m47208n(this);
                    if (obj == objM38805e) {
                        return objM38805e;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7348o.m30470b(obj);
                }
                this.f45096v.invoke();
                return Unit.f29331a;
            } catch (Throwable th2) {
                this.f45096v.invoke();
                throw th2;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((f) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: x4.l0$g */
    @InterfaceC10344f(m39663c = "androidx.room.TriggerBasedInvalidationTracker", m39664f = "InvalidationTracker.kt", m39665l = {328, 333}, m39666m = "startTrackingTable")
    @Metadata(m31666k = 3, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class g extends AbstractC10342d {

        /* JADX INFO: renamed from: B */
        public int f45098B;

        /* JADX INFO: renamed from: t */
        public Object f45099t;

        /* JADX INFO: renamed from: u */
        public Object f45100u;

        /* JADX INFO: renamed from: v */
        public Object f45101v;

        /* JADX INFO: renamed from: w */
        public int f45102w;

        /* JADX INFO: renamed from: x */
        public int f45103x;

        /* JADX INFO: renamed from: y */
        public int f45104y;

        /* JADX INFO: renamed from: z */
        public /* synthetic */ Object f45105z;

        public g(InterfaceC9557b<? super g> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f45105z = obj;
            this.f45098B |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return C12673l0.this.m47215v(null, 0, this);
        }
    }

    /* JADX INFO: renamed from: x4.l0$h */
    @InterfaceC10344f(m39663c = "androidx.room.TriggerBasedInvalidationTracker", m39664f = "InvalidationTracker.kt", m39665l = {347}, m39666m = "stopTrackingTable")
    @Metadata(m31666k = 3, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class h extends AbstractC10342d {

        /* JADX INFO: renamed from: A */
        public int f45106A;

        /* JADX INFO: renamed from: t */
        public Object f45107t;

        /* JADX INFO: renamed from: u */
        public Object f45108u;

        /* JADX INFO: renamed from: v */
        public Object f45109v;

        /* JADX INFO: renamed from: w */
        public int f45110w;

        /* JADX INFO: renamed from: x */
        public int f45111x;

        /* JADX INFO: renamed from: y */
        public /* synthetic */ Object f45112y;

        public h(InterfaceC9557b<? super h> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f45112y = obj;
            this.f45106A |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return C12673l0.this.m47216w(null, 0, this);
        }
    }

    /* JADX INFO: renamed from: x4.l0$i */
    @InterfaceC10344f(m39663c = "androidx.room.TriggerBasedInvalidationTracker", m39664f = "InvalidationTracker.kt", m39665l = {306}, m39666m = "syncTriggers$room_runtime")
    @Metadata(m31666k = 3, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class i extends AbstractC10342d {

        /* JADX INFO: renamed from: t */
        public Object f45114t;

        /* JADX INFO: renamed from: u */
        public /* synthetic */ Object f45115u;

        /* JADX INFO: renamed from: w */
        public int f45117w;

        public i(InterfaceC9557b<? super i> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f45115u = obj;
            this.f45117w |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return C12673l0.this.m47217x(this);
        }
    }

    /* JADX INFO: renamed from: x4.l0$j */
    @Metadata(m31664d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"Lx4/g0;", "connection", "", "<anonymous>", "(Lx4/g0;)V"}, m31666k = 3, m31667mv = {2, 1, 0})
    @InterfaceC10344f(m39663c = "androidx.room.TriggerBasedInvalidationTracker$syncTriggers$2$1", m39664f = "InvalidationTracker.kt", m39665l = {HttpStatusCodesKt.HTTP_TEMP_REDIRECT, 314}, m39666m = "invokeSuspend")
    public static final class j extends AbstractC10351m implements Function2<InterfaceC12663g0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public Object f45118t;

        /* JADX INFO: renamed from: u */
        public int f45119u;

        /* JADX INFO: renamed from: v */
        public /* synthetic */ Object f45120v;

        /* JADX INFO: renamed from: x4.l0$j$a */
        @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lx4/f0;", "", "<anonymous>", "(Lx4/f0;)V"}, m31666k = 3, m31667mv = {2, 1, 0})
        @InterfaceC10344f(m39663c = "androidx.room.TriggerBasedInvalidationTracker$syncTriggers$2$1$1$1", m39664f = "InvalidationTracker.kt", m39665l = {318, 319}, m39666m = "invokeSuspend")
        public static final class a extends AbstractC10351m implements Function2<InterfaceC12661f0<Unit>, InterfaceC9557b<? super Unit>, Object> {

            /* JADX INFO: renamed from: A */
            public final /* synthetic */ C12670k.a[] f45122A;

            /* JADX INFO: renamed from: B */
            public final /* synthetic */ C12673l0 f45123B;

            /* JADX INFO: renamed from: C */
            public final /* synthetic */ InterfaceC12663g0 f45124C;

            /* JADX INFO: renamed from: t */
            public Object f45125t;

            /* JADX INFO: renamed from: u */
            public Object f45126u;

            /* JADX INFO: renamed from: v */
            public Object f45127v;

            /* JADX INFO: renamed from: w */
            public int f45128w;

            /* JADX INFO: renamed from: x */
            public int f45129x;

            /* JADX INFO: renamed from: y */
            public int f45130y;

            /* JADX INFO: renamed from: z */
            public int f45131z;

            /* JADX INFO: renamed from: x4.l0$j$a$a, reason: collision with other inner class name */
            @Metadata(m31666k = 3, m31667mv = {2, 1, 0}, m31669xi = 48)
            public static final /* synthetic */ class C14281a {

                /* JADX INFO: renamed from: a */
                public static final /* synthetic */ int[] f45132a;

                static {
                    int[] iArr = new int[C12670k.a.values().length];
                    try {
                        iArr[C12670k.a.NO_OP.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[C12670k.a.ADD.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[C12670k.a.REMOVE.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    f45132a = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C12670k.a[] aVarArr, C12673l0 c12673l0, InterfaceC12663g0 interfaceC12663g0, InterfaceC9557b<? super a> interfaceC9557b) {
                super(2, interfaceC9557b);
                this.f45122A = aVarArr;
                this.f45123B = c12673l0;
                this.f45124C = interfaceC12663g0;
            }

            @Override // pt.AbstractC10339a
            public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
                return new a(this.f45122A, this.f45123B, this.f45124C, interfaceC9557b);
            }

            /* JADX DEBUG: Duplicate block (B:19:0x0066) to fix multi-entry loop: BACK_EDGE: B:19:0x0066 -> B:20:0x0068 */
            /* JADX WARN: Code duplicated, block: B:11:0x003e  */
            /* JADX WARN: Code duplicated, block: B:26:0x0086  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0086 -> B:27:0x0087). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            @Override // pt.AbstractC10339a
            public final java.lang.Object invokeSuspend(java.lang.Object r12) {
                /*
                    r11 = this;
                    java.lang.Object r0 = p344ot.C10047c.m38805e()
                    int r1 = r11.f45131z
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L2c
                    if (r1 == r3) goto Le
                    if (r1 != r2) goto L24
                Le:
                    int r1 = r11.f45130y
                    int r4 = r11.f45129x
                    int r5 = r11.f45128w
                    java.lang.Object r6 = r11.f45127v
                    x4.g0 r6 = (p535x4.InterfaceC12663g0) r6
                    java.lang.Object r7 = r11.f45126u
                    x4.l0 r7 = (p535x4.C12673l0) r7
                    java.lang.Object r8 = r11.f45125t
                    x4.k$a[] r8 = (p535x4.C12670k.a[]) r8
                    p229jt.C7348o.m30470b(r12)
                    goto L68
                L24:
                    java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r12.<init>(r0)
                    throw r12
                L2c:
                    p229jt.C7348o.m30470b(r12)
                    x4.k$a[] r12 = r11.f45122A
                    x4.l0 r1 = r11.f45123B
                    x4.g0 r4 = r11.f45124C
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
                    int[] r10 = p535x4.C12673l0.j.a.C14281a.f45132a
                    int r5 = r5.ordinal()
                    r5 = r10[r5]
                    if (r5 == r3) goto L86
                    if (r5 == r2) goto L71
                    r10 = 3
                    if (r5 != r10) goto L6b
                    r11.f45125t = r8
                    r11.f45126u = r7
                    r11.f45127v = r12
                    r11.f45128w = r9
                    r11.f45129x = r4
                    r11.f45130y = r1
                    r11.f45131z = r2
                    java.lang.Object r5 = p535x4.C12673l0.m47202i(r7, r12, r6, r11)
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
                    jt.l r12 = new jt.l
                    r12.<init>()
                    throw r12
                L71:
                    r11.f45125t = r8
                    r11.f45126u = r7
                    r11.f45127v = r12
                    r11.f45128w = r9
                    r11.f45129x = r4
                    r11.f45130y = r1
                    r11.f45131z = r3
                    java.lang.Object r5 = p535x4.C12673l0.m47201h(r7, r12, r6, r11)
                    if (r5 != r0) goto L66
                L85:
                    return r0
                L86:
                    r6 = r9
                L87:
                    int r4 = r4 + r3
                    goto L3c
                L89:
                    kotlin.Unit r12 = kotlin.Unit.f29331a
                    return r12
                */
                throw new UnsupportedOperationException("Method not decompiled: p535x4.C12673l0.j.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC12661f0<Unit> interfaceC12661f0, InterfaceC9557b<? super Unit> interfaceC9557b) {
                return ((a) create(interfaceC12661f0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
            }
        }

        public j(InterfaceC9557b<? super j> interfaceC9557b) {
            super(2, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            j jVar = C12673l0.this.new j(interfaceC9557b);
            jVar.f45120v = obj;
            return jVar;
        }

        /* JADX WARN: Code duplicated, block: B:25:0x0073  */
        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) throws Throwable {
            InterfaceC12663g0 interfaceC12663g0;
            Object objMo47174b;
            C12670k c12670k;
            ReentrantLock reentrantLock;
            C12670k.a[] aVarArr;
            C12670k.a aVar;
            C12670k c12670k2;
            ReentrantLock reentrantLock2;
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f45119u;
            boolean z10 = true;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                interfaceC12663g0 = (InterfaceC12663g0) this.f45120v;
                this.f45120v = interfaceC12663g0;
                this.f45119u = 1;
                objMo47174b = interfaceC12663g0.mo47174b(this);
                if (objMo47174b != objM38805e) {
                }
                return objM38805e;
            }
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                reentrantLock2 = (ReentrantLock) this.f45118t;
                c12670k2 = (C12670k) this.f45120v;
                try {
                    C7348o.m30470b(obj);
                    reentrantLock = reentrantLock2;
                    c12670k = c12670k2;
                    c12670k.inProgressSync = false;
                    Unit unit = Unit.f29331a;
                    reentrantLock.unlock();
                    return Unit.f29331a;
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        c12670k2.inProgressSync = false;
                        throw th;
                    } catch (Throwable th3) {
                        th = th3;
                        reentrantLock = reentrantLock2;
                        reentrantLock.unlock();
                        throw th;
                    }
                }
            }
            interfaceC12663g0 = (InterfaceC12663g0) this.f45120v;
            C7348o.m30470b(obj);
            objMo47174b = obj;
            if (((Boolean) objMo47174b).booleanValue()) {
                return Unit.f29331a;
            }
            c12670k = C12673l0.this.observedTableStates;
            C12673l0 c12673l0 = C12673l0.this;
            reentrantLock = c12670k.onSyncLock;
            reentrantLock.lock();
            try {
                c12670k.inProgressSync = true;
                ReentrantLock reentrantLock3 = c12670k.lock;
                reentrantLock3.lock();
                try {
                    if (c12670k.needsSync) {
                        c12670k.needsSync = false;
                        int length = c12670k.tableObserversCount.length;
                        aVarArr = new C12670k.a[length];
                        int i11 = 0;
                        boolean z11 = false;
                        while (i11 < length) {
                            boolean z12 = c12670k.tableObserversCount[i11] > 0 ? z10 : false;
                            if (z12 != c12670k.tableObservedState[i11]) {
                                c12670k.tableObservedState[i11] = z12;
                                aVar = z12 ? C12670k.a.ADD : C12670k.a.REMOVE;
                                z11 = true;
                            } else {
                                aVar = C12670k.a.NO_OP;
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
                                InterfaceC12663g0.a aVar2 = InterfaceC12663g0.a.IMMEDIATE;
                                a aVar3 = new a(aVarArr, c12673l0, interfaceC12663g0, null);
                                this.f45120v = c12670k;
                                this.f45118t = reentrantLock;
                                this.f45119u = 2;
                                if (interfaceC12663g0.mo47175c(aVar2, aVar3, this) != objM38805e) {
                                    c12670k2 = c12670k;
                                    reentrantLock2 = reentrantLock;
                                    reentrantLock = reentrantLock2;
                                    c12670k = c12670k2;
                                }
                                return objM38805e;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            c12670k2 = c12670k;
                            reentrantLock2 = reentrantLock;
                            c12670k2.inProgressSync = false;
                            throw th;
                        }
                    }
                    c12670k.inProgressSync = false;
                    Unit unit2 = Unit.f29331a;
                    reentrantLock.unlock();
                    return Unit.f29331a;
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

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC12663g0 interfaceC12663g0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((j) create(interfaceC12663g0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: java.util.Map<java.lang.String, ? extends java.util.Set<java.lang.String>> */
    /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: kotlin.jvm.functions.Function1<? super java.util.Set<java.lang.Integer>, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C12673l0(@NotNull AbstractC12682u database, @NotNull Map<String, String> shadowTablesMap, @NotNull Map<String, ? extends Set<String>> viewTables, @NotNull String[] tableNames, boolean z10, @NotNull Function1<? super Set<Integer>, Unit> onInvalidatedTablesIds) {
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
                return Boolean.valueOf(C12673l0.m47204o());
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
                map.put(lowerCase4, (Integer) C7690k0.m31796k(map, lowerCase3));
            }
        }
        this.observedTableStates = new C12670k(this.tablesNames.length);
        this.observedTableVersions = new C12672l(this.tablesNames.length);
    }

    /* JADX INFO: renamed from: k */
    public static final Set m47203k(InterfaceC5361d statement) {
        Intrinsics.checkNotNullParameter(statement, "statement");
        Set setM31903b = C7700p0.m31903b();
        while (statement.mo24704g3()) {
            setM31903b.add(Integer.valueOf((int) statement.getLong(0)));
        }
        return C7700p0.m31902a(setM31903b);
    }

    /* JADX INFO: renamed from: o */
    public static final boolean m47204o() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: j */
    public final Object m47205j(InterfaceC12674m interfaceC12674m, InterfaceC9557b<? super Set<Integer>> interfaceC9557b) {
        b bVar;
        if (interfaceC9557b instanceof b) {
            bVar = (b) interfaceC9557b;
            int i10 = bVar.f45066w;
            if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                bVar.f45066w = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                bVar = new b(interfaceC9557b);
            }
        } else {
            bVar = new b(interfaceC9557b);
        }
        Object objMo47227a = bVar.f45064u;
        Object objM38805e = C10047c.m38805e();
        int i11 = bVar.f45066w;
        if (i11 == 0) {
            C7348o.m30470b(objMo47227a);
            Function1 function1 = new Function1() { // from class: x4.j0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C12673l0.m47203k((InterfaceC5361d) obj);
                }
            };
            bVar.f45063t = interfaceC12674m;
            bVar.f45066w = 1;
            objMo47227a = interfaceC12674m.mo47227a("SELECT * FROM room_table_modification_log WHERE invalidated = 1", function1, bVar);
            if (objMo47227a != objM38805e) {
            }
            return objM38805e;
        }
        if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Set set = (Set) bVar.f45063t;
            C7348o.m30470b(objMo47227a);
            return set;
        }
        interfaceC12674m = (InterfaceC12674m) bVar.f45063t;
        C7348o.m30470b(objMo47227a);
        Set set2 = (Set) objMo47227a;
        if (!set2.isEmpty()) {
            bVar.f45063t = set2;
            bVar.f45066w = 2;
            if (C12667i0.m47178b(interfaceC12674m, "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1", bVar) == objM38805e) {
                return objM38805e;
            }
        }
        return set2;
    }

    /* JADX INFO: renamed from: l */
    public final void m47206l(@NotNull InterfaceC5359b connection) throws Exception {
        Intrinsics.checkNotNullParameter(connection, "connection");
        InterfaceC5361d interfaceC5361dMo24696r3 = connection.mo24696r3("PRAGMA query_only");
        try {
            interfaceC5361dMo24696r3.mo24704g3();
            boolean zMo24703a2 = interfaceC5361dMo24696r3.mo24703a2(0);
            C12915a.m47941a(interfaceC5361dMo24696r3, null);
            if (zMo24703a2) {
                return;
            }
            C5358a.m24693a(connection, "PRAGMA temp_store = MEMORY");
            C5358a.m24693a(connection, "PRAGMA recursive_triggers = 1");
            C5358a.m24693a(connection, "DROP TABLE IF EXISTS room_table_modification_log");
            if (this.useTempTable) {
                C5358a.m24693a(connection, "CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
            } else {
                C5358a.m24693a(connection, C7797x.m32303N("CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)", "TEMP", "", false, 4, null));
            }
            this.observedTableStates.m47187h();
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                C12915a.m47941a(interfaceC5361dMo24696r3, th2);
                throw th3;
            }
        }
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final InterfaceC9575h<Set<String>> m47207m(@NotNull String[] resolvedTableNames, @NotNull int[] tableIds, boolean emitInitialState) {
        Intrinsics.checkNotNullParameter(resolvedTableNames, "resolvedTableNames");
        Intrinsics.checkNotNullParameter(tableIds, "tableIds");
        return C9579j.m37806w(new c(tableIds, emitInitialState, resolvedTableNames, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: n */
    public final Object m47208n(InterfaceC9557b<? super Set<Integer>> interfaceC9557b) throws Throwable {
        d dVar;
        C13027a c13027a;
        Throwable th2;
        if (interfaceC9557b instanceof d) {
            dVar = (d) interfaceC9557b;
            int i10 = dVar.f45087w;
            if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                dVar.f45087w = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                dVar = new d(interfaceC9557b);
            }
        } else {
            dVar = new d(interfaceC9557b);
        }
        Object obj = dVar.f45085u;
        Object objM38805e = C10047c.m38805e();
        int i11 = dVar.f45087w;
        if (i11 == 0) {
            C7348o.m30470b(obj);
            C13027a closeBarrier = this.database.getCloseBarrier();
            if (!closeBarrier.m48534a()) {
                return C7702q0.m31908d();
            }
            try {
                if (!this.pendingRefresh.compareAndSet(true, false)) {
                    Set setM31908d = C7702q0.m31908d();
                    closeBarrier.m48536c();
                    return setM31908d;
                }
                if (!this.onAllowRefresh.invoke().booleanValue()) {
                    Set setM31908d2 = C7702q0.m31908d();
                    closeBarrier.m48536c();
                    return setM31908d2;
                }
                AbstractC12682u abstractC12682u = this.database;
                e eVar = new e(null);
                dVar.f45084t = closeBarrier;
                dVar.f45087w = 1;
                Object objM47268W = abstractC12682u.m47268W(false, eVar, dVar);
                if (objM47268W == objM38805e) {
                    return objM38805e;
                }
                c13027a = closeBarrier;
                obj = objM47268W;
            } catch (Throwable th3) {
                c13027a = closeBarrier;
                th2 = th3;
                c13027a.m48536c();
                throw th2;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c13027a = (C13027a) dVar.f45084t;
            try {
                C7348o.m30470b(obj);
            } catch (Throwable th4) {
                th2 = th4;
                c13027a.m48536c();
                throw th2;
            }
        }
        Set<Integer> set = (Set) obj;
        if (!set.isEmpty()) {
            this.observedTableVersions.m47193b(set);
            this.onInvalidatedTablesIds.invoke(set);
        }
        c13027a.m48536c();
        return set;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m47209p(@NotNull int[] tableIds) {
        Intrinsics.checkNotNullParameter(tableIds, "tableIds");
        return this.observedTableStates.m47188i(tableIds);
    }

    /* JADX INFO: renamed from: q */
    public final boolean m47210q(@NotNull int[] tableIds) {
        Intrinsics.checkNotNullParameter(tableIds, "tableIds");
        return this.observedTableStates.m47189j(tableIds);
    }

    /* JADX INFO: renamed from: r */
    public final void m47211r(@NotNull Function0<Unit> onRefreshScheduled, @NotNull Function0<Unit> onRefreshCompleted) {
        Intrinsics.checkNotNullParameter(onRefreshScheduled, "onRefreshScheduled");
        Intrinsics.checkNotNullParameter(onRefreshCompleted, "onRefreshCompleted");
        if (this.pendingRefresh.compareAndSet(false, true)) {
            onRefreshScheduled.invoke();
            C7882k.m32780d(this.database.m47278s(), new CoroutineName("Room Invalidation Tracker Refresh"), null, new f(onRefreshCompleted, null), 2, null);
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m47212s() {
        this.observedTableStates.m47190k();
    }

    /* JADX INFO: renamed from: t */
    public final String[] m47213t(String[] names) {
        Set setM31903b = C7700p0.m31903b();
        for (String str : names) {
            Map<String, Set<String>> map = this.viewTables;
            String lowerCase = str.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            Set<String> set = map.get(lowerCase);
            if (set != null) {
                setM31903b.addAll(set);
            } else {
                setM31903b.add(str);
            }
        }
        return (String[]) C7700p0.m31902a(setM31903b).toArray(new String[0]);
    }

    /* JADX INFO: renamed from: u */
    public final void m47214u(@NotNull Function0<Boolean> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.onAllowRefresh = function0;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0087  */
    /* JADX WARN: Code duplicated, block: B:23:0x008d  */
    /* JADX WARN: Code duplicated, block: B:24:0x0090  */
    /* JADX WARN: Code duplicated, block: B:29:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0074, code lost:
    
        if (p535x4.C12667i0.m47178b(r13, r15, r0) == r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00e0, code lost:
    
        if (p535x4.C12667i0.m47178b(r7, r15, r0) == r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00e2, code lost:
    
        return r1;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00e0 -> B:28:0x00e3). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m47215v(InterfaceC12674m interfaceC12674m, int i10, InterfaceC9557b<? super Unit> interfaceC9557b) {
        g gVar;
        InterfaceC12674m interfaceC12674m2;
        int length;
        String[] strArr;
        int i11;
        int i12;
        String str;
        String str2;
        if (interfaceC9557b instanceof g) {
            gVar = (g) interfaceC9557b;
            int i13 = gVar.f45098B;
            if ((i13 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                gVar.f45098B = i13 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                gVar = new g(interfaceC9557b);
            }
        } else {
            gVar = new g(interfaceC9557b);
        }
        Object obj = gVar.f45105z;
        Object objM38805e = C10047c.m38805e();
        int i14 = gVar.f45098B;
        if (i14 != 0) {
            if (i14 == 1) {
                i10 = gVar.f45102w;
                interfaceC12674m = (InterfaceC12674m) gVar.f45099t;
                C7348o.m30470b(obj);
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                length = gVar.f45104y;
                i12 = gVar.f45103x;
                i11 = gVar.f45102w;
                strArr = (String[]) gVar.f45101v;
                str = (String) gVar.f45100u;
                interfaceC12674m2 = (InterfaceC12674m) gVar.f45099t;
                C7348o.m30470b(obj);
            }
            i12++;
            if (i12 < length) {
                return Unit.f29331a;
            }
            String str3 = strArr[i12];
            if (this.useTempTable) {
                str2 = "TEMP";
            } else {
                str2 = "";
            }
            String str4 = "CREATE " + str2 + " TRIGGER IF NOT EXISTS `" + INSTANCE.m47220b(str, str3) + "` AFTER " + str3 + " ON `" + str + "` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = " + i11 + " AND invalidated = 0; END";
            gVar.f45099t = interfaceC12674m2;
            gVar.f45100u = str;
            gVar.f45101v = strArr;
            gVar.f45102w = i11;
            gVar.f45103x = i12;
            gVar.f45104y = length;
            gVar.f45098B = 2;
        } else {
            C7348o.m30470b(obj);
            String str5 = "INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i10 + ", 0)";
            gVar.f45099t = interfaceC12674m;
            gVar.f45102w = i10;
            gVar.f45098B = 1;
        }
        String str6 = this.tablesNames[i10];
        String[] strArr2 = f45051m;
        interfaceC12674m2 = interfaceC12674m;
        length = strArr2.length;
        strArr = strArr2;
        i11 = i10;
        i12 = 0;
        str = str6;
        if (i12 < length) {
            return Unit.f29331a;
        }
        String str7 = strArr[i12];
        if (this.useTempTable) {
            str2 = "TEMP";
        } else {
            str2 = "";
        }
        String str8 = "CREATE " + str2 + " TRIGGER IF NOT EXISTS `" + INSTANCE.m47220b(str, str7) + "` AFTER " + str7 + " ON `" + str + "` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = " + i11 + " AND invalidated = 0; END";
        gVar.f45099t = interfaceC12674m2;
        gVar.f45100u = str;
        gVar.f45101v = strArr;
        gVar.f45102w = i11;
        gVar.f45103x = i12;
        gVar.f45104y = length;
        gVar.f45098B = 2;
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
    /* JADX INFO: renamed from: w */
    public final java.lang.Object m47216w(p535x4.InterfaceC12674m r10, int r11, p315nt.InterfaceC9557b<? super kotlin.Unit> r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof p535x4.C12673l0.h
            if (r0 == 0) goto L13
            r0 = r12
            x4.l0$h r0 = (p535x4.C12673l0.h) r0
            int r1 = r0.f45106A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f45106A = r1
            goto L18
        L13:
            x4.l0$h r0 = new x4.l0$h
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f45112y
            java.lang.Object r1 = p344ot.C10047c.m38805e()
            int r2 = r0.f45106A
            r3 = 1
            if (r2 == 0) goto L42
            if (r2 != r3) goto L3a
            int r10 = r0.f45111x
            int r11 = r0.f45110w
            java.lang.Object r2 = r0.f45109v
            java.lang.String[] r2 = (java.lang.String[]) r2
            java.lang.Object r4 = r0.f45108u
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r0.f45107t
            x4.m r5 = (p535x4.InterfaceC12674m) r5
            p229jt.C7348o.m30470b(r12)
            r12 = r4
            goto L87
        L3a:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L42:
            p229jt.C7348o.m30470b(r12)
            java.lang.String[] r12 = r9.tablesNames
            r11 = r12[r11]
            java.lang.String[] r12 = p535x4.C12673l0.f45051m
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
            x4.l0$a r6 = p535x4.C12673l0.INSTANCE
            java.lang.String r5 = p535x4.C12673l0.Companion.m47219a(r6, r12, r5)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "DROP TRIGGER IF EXISTS `"
            r6.append(r7)
            r6.append(r5)
            r5 = 96
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            r0.f45107t = r11
            r0.f45108u = r12
            r0.f45109v = r2
            r0.f45110w = r4
            r0.f45111x = r10
            r0.f45106A = r3
            java.lang.Object r5 = p535x4.C12667i0.m47178b(r11, r5, r0)
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
            kotlin.Unit r10 = kotlin.Unit.f29331a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p535x4.C12673l0.m47216w(x4.m, int, nt.b):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: x */
    public final Object m47217x(@NotNull InterfaceC9557b<? super Unit> interfaceC9557b) throws Throwable {
        i iVar;
        C13027a c13027a;
        Throwable th2;
        if (interfaceC9557b instanceof i) {
            iVar = (i) interfaceC9557b;
            int i10 = iVar.f45117w;
            if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                iVar.f45117w = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                iVar = new i(interfaceC9557b);
            }
        } else {
            iVar = new i(interfaceC9557b);
        }
        Object obj = iVar.f45115u;
        Object objM38805e = C10047c.m38805e();
        int i11 = iVar.f45117w;
        if (i11 == 0) {
            C7348o.m30470b(obj);
            C13027a closeBarrier = this.database.getCloseBarrier();
            if (closeBarrier.m48534a()) {
                try {
                    AbstractC12682u abstractC12682u = this.database;
                    j jVar = new j(null);
                    iVar.f45114t = closeBarrier;
                    iVar.f45117w = 1;
                    if (abstractC12682u.m47268W(false, jVar, iVar) == objM38805e) {
                        return objM38805e;
                    }
                    c13027a = closeBarrier;
                    c13027a.m48536c();
                } catch (Throwable th3) {
                    c13027a = closeBarrier;
                    th2 = th3;
                    c13027a.m48536c();
                    throw th2;
                }
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c13027a = (C13027a) iVar.f45114t;
            try {
                C7348o.m30470b(obj);
                c13027a.m48536c();
            } catch (Throwable th4) {
                th2 = th4;
                c13027a.m48536c();
                throw th2;
            }
        }
        return Unit.f29331a;
    }

    @NotNull
    /* JADX INFO: renamed from: y */
    public final Pair<String[], int[]> m47218y(@NotNull String[] names) {
        Intrinsics.checkNotNullParameter(names, "names");
        String[] strArrM47213t = m47213t(names);
        int length = strArrM47213t.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            String str = strArrM47213t[i10];
            Map<String, Integer> map = this.tableIdLookup;
            String lowerCase = str.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            Integer num = map.get(lowerCase);
            if (num == null) {
                throw new IllegalArgumentException("There is no table with name " + str);
            }
            iArr[i10] = num.intValue();
        }
        return C7352s.m30477a(strArrM47213t, iArr);
    }
}
