package p535x4;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import java.io.File;
import java.io.InputStream;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p006a5.InterfaceC0071a;
import p041c5.C1532h;
import p119f5.InterfaceC5360c;
import p145g5.InterfaceC6009d;

/* JADX INFO: renamed from: x4.c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b8\b\u0016\u0018\u00002\u00020\u0001Bí\u0001\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0011\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0016\u001a\u00020\r\u0012\u0006\u0010\u0017\u001a\u00020\r\u0012\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e\u0012\b\u0010\"\u001a\u0004\u0018\u00010!\u0012\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00010\n\u0012\f\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\n\u0012\u0006\u0010&\u001a\u00020\r\u0012\b\u0010(\u001a\u0004\u0018\u00010'\u0012\b\u0010*\u001a\u0004\u0018\u00010)¢\u0006\u0004\b+\u0010,J\u001f\u0010/\u001a\u00020\r2\u0006\u0010-\u001a\u00020\u00192\u0006\u0010.\u001a\u00020\u0019H\u0016¢\u0006\u0004\b/\u00100J\u009f\u0002\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00112\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0016\u001a\u00020\r2\b\b\u0002\u0010\u0017\u001a\u00020\r2\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00182\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0010\b\u0002\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!2\u000e\b\u0002\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\u000e\b\u0002\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\n2\b\b\u0002\u0010&\u001a\u00020\r2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)H\u0007¢\u0006\u0004\b1\u00102R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b1\u00103R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u001c\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b/\u0010<R\u0014\u0010\u0010\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010\u0012\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010\u0013\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bA\u0010@R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010\u0016\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bD\u0010<R\u0014\u0010\u0017\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bE\u0010<R\"\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00188\u0000X\u0080\u0004¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\b6\u0010HR\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bI\u00105R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u001c\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00010\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bN\u0010;R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bO\u0010;R\u0014\u0010&\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bP\u0010<R\u0016\u0010(\u001a\u0004\u0018\u00010'8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0016\u0010*\u001a\u0004\u0018\u00010)8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010V\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bU\u0010<R\"\u0010Z\u001a\u00020\r8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bW\u0010<\u001a\u0004\b:\u0010X\"\u0004\b=\u0010YR\"\u0010`\u001a\u00020\u00198\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b[\u0010\\\u001a\u0004\b8\u0010]\"\u0004\b^\u0010_¨\u0006a"}, m31665d2 = {"Lx4/c;", "", "Landroid/content/Context;", "context", "", "name", "Lg5/d$c;", "sqliteOpenHelperFactory", "Lx4/u$e;", "migrationContainer", "", "Lx4/u$b;", "callbacks", "", "allowMainThreadQueries", "Lx4/u$d;", "journalMode", "Ljava/util/concurrent/Executor;", "queryExecutor", "transactionExecutor", "Landroid/content/Intent;", "multiInstanceInvalidationServiceIntent", "requireMigration", "allowDestructiveMigrationOnDowngrade", "", "", "migrationNotRequiredFrom", "copyFromAssetPath", "Ljava/io/File;", "copyFromFile", "Ljava/util/concurrent/Callable;", "Ljava/io/InputStream;", "copyFromInputStream", "Lx4/u$f;", "prepackagedDatabaseCallback", "typeConverters", "La5/a;", "autoMigrationSpecs", "allowDestructiveMigrationForAllTables", "Lf5/c;", "sqliteDriver", "Lkotlin/coroutines/CoroutineContext;", "queryCoroutineContext", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lg5/d$c;Lx4/u$e;Ljava/util/List;ZLx4/u$d;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Landroid/content/Intent;ZZLjava/util/Set;Ljava/lang/String;Ljava/io/File;Ljava/util/concurrent/Callable;Lx4/u$f;Ljava/util/List;Ljava/util/List;ZLf5/c;Lkotlin/coroutines/CoroutineContext;)V", "fromVersion", "toVersion", "f", "(II)Z", "a", "(Landroid/content/Context;Ljava/lang/String;Lg5/d$c;Lx4/u$e;Ljava/util/List;ZLx4/u$d;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Landroid/content/Intent;ZZLjava/util/Set;Ljava/lang/String;Ljava/io/File;Ljava/util/concurrent/Callable;Lx4/u$f;Ljava/util/List;Ljava/util/List;ZLf5/c;Lkotlin/coroutines/CoroutineContext;)Lx4/c;", "Landroid/content/Context;", "b", "Ljava/lang/String;", "c", "Lg5/d$c;", "d", "Lx4/u$e;", "e", "Ljava/util/List;", "Z", "g", "Lx4/u$d;", "h", "Ljava/util/concurrent/Executor;", "i", "j", "Landroid/content/Intent;", "k", "l", "m", "Ljava/util/Set;", "()Ljava/util/Set;", "n", "o", "Ljava/io/File;", "p", "Ljava/util/concurrent/Callable;", "q", "r", "s", "t", "Lf5/c;", "u", "Lkotlin/coroutines/CoroutineContext;", "v", "multiInstanceInvalidation", "w", "()Z", "(Z)V", "useTempTrackingTable", "x", "I", "()I", "setPreparedStatementCacheSize$room_runtime", "(I)V", "preparedStatementCacheSize", "room-runtime"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public class C12654c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public final String name;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public final InterfaceC6009d.c sqliteOpenHelperFactory;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final AbstractC12682u.e migrationContainer;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public final List<AbstractC12682u.b> callbacks;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final boolean allowMainThreadQueries;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final AbstractC12682u.d journalMode;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final Executor queryExecutor;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final Executor transactionExecutor;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    public final Intent multiInstanceInvalidationServiceIntent;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public final boolean requireMigration;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public final boolean allowDestructiveMigrationOnDowngrade;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    public final Set<Integer> migrationNotRequiredFrom;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @Nullable
    public final String copyFromAssetPath;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @Nullable
    public final File copyFromFile;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @Nullable
    public final Callable<InputStream> copyFromInputStream;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    public final List<Object> typeConverters;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @NotNull
    public final List<InterfaceC0071a> autoMigrationSpecs;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    public final boolean allowDestructiveMigrationForAllTables;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @Nullable
    public final InterfaceC5360c sqliteDriver;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @Nullable
    public final CoroutineContext queryCoroutineContext;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    public final boolean multiInstanceInvalidation;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    public boolean useTempTrackingTable;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    public int preparedStatementCacheSize;

    /* JADX DEBUG: Multi-variable search result rejected for r10v0, resolved type: java.util.List<? extends x4.u$b> */
    /* JADX DEBUG: Multi-variable search result rejected for r24v0, resolved type: java.util.List<? extends a5.a> */
    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"LambdaLast"})
    public C12654c(@NotNull Context context, @Nullable String str, @Nullable InterfaceC6009d.c cVar, @NotNull AbstractC12682u.e migrationContainer, @Nullable List<? extends AbstractC12682u.b> list, boolean z10, @NotNull AbstractC12682u.d journalMode, @NotNull Executor queryExecutor, @NotNull Executor transactionExecutor, @Nullable Intent intent, boolean z11, boolean z12, @Nullable Set<Integer> set, @Nullable String str2, @Nullable File file, @Nullable Callable<InputStream> callable, @Nullable AbstractC12682u.f fVar, @NotNull List<? extends Object> typeConverters, @NotNull List<? extends InterfaceC0071a> autoMigrationSpecs, boolean z13, @Nullable InterfaceC5360c interfaceC5360c, @Nullable CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(migrationContainer, "migrationContainer");
        Intrinsics.checkNotNullParameter(journalMode, "journalMode");
        Intrinsics.checkNotNullParameter(queryExecutor, "queryExecutor");
        Intrinsics.checkNotNullParameter(transactionExecutor, "transactionExecutor");
        Intrinsics.checkNotNullParameter(typeConverters, "typeConverters");
        Intrinsics.checkNotNullParameter(autoMigrationSpecs, "autoMigrationSpecs");
        this.context = context;
        this.name = str;
        this.sqliteOpenHelperFactory = cVar;
        this.migrationContainer = migrationContainer;
        this.callbacks = list;
        this.allowMainThreadQueries = z10;
        this.journalMode = journalMode;
        this.queryExecutor = queryExecutor;
        this.transactionExecutor = transactionExecutor;
        this.multiInstanceInvalidationServiceIntent = intent;
        this.requireMigration = z11;
        this.allowDestructiveMigrationOnDowngrade = z12;
        this.migrationNotRequiredFrom = set;
        this.copyFromAssetPath = str2;
        this.copyFromFile = file;
        this.copyFromInputStream = callable;
        this.typeConverters = typeConverters;
        this.autoMigrationSpecs = autoMigrationSpecs;
        this.allowDestructiveMigrationForAllTables = z13;
        this.sqliteDriver = interfaceC5360c;
        this.queryCoroutineContext = coroutineContext;
        this.multiInstanceInvalidation = intent != null;
        this.useTempTrackingTable = true;
        this.preparedStatementCacheSize = 25;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r18v0, resolved type: x4.c */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C12654c m47157b(C12654c c12654c, Context context, String str, InterfaceC6009d.c cVar, AbstractC12682u.e eVar, List list, boolean z10, AbstractC12682u.d dVar, Executor executor, Executor executor2, Intent intent, boolean z11, boolean z12, Set set, String str2, File file, Callable callable, AbstractC12682u.f fVar, List list2, List list3, boolean z13, InterfaceC5360c interfaceC5360c, CoroutineContext coroutineContext, int i10, Object obj) {
        AbstractC12682u.f fVar2;
        CoroutineContext coroutineContext2;
        InterfaceC5360c interfaceC5360c2;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copy");
        }
        Context context2 = (i10 & 1) != 0 ? c12654c.context : context;
        String str3 = (i10 & 2) != 0 ? c12654c.name : str;
        InterfaceC6009d.c cVar2 = (i10 & 4) != 0 ? c12654c.sqliteOpenHelperFactory : cVar;
        AbstractC12682u.e eVar2 = (i10 & 8) != 0 ? c12654c.migrationContainer : eVar;
        List list4 = (i10 & 16) != 0 ? c12654c.callbacks : list;
        boolean z14 = (i10 & 32) != 0 ? c12654c.allowMainThreadQueries : z10;
        AbstractC12682u.d dVar2 = (i10 & 64) != 0 ? c12654c.journalMode : dVar;
        Executor executor3 = (i10 & 128) != 0 ? c12654c.queryExecutor : executor;
        Executor executor4 = (i10 & 256) != 0 ? c12654c.transactionExecutor : executor2;
        Intent intent2 = (i10 & 512) != 0 ? c12654c.multiInstanceInvalidationServiceIntent : intent;
        boolean z15 = (i10 & 1024) != 0 ? c12654c.requireMigration : z11;
        boolean z16 = (i10 & 2048) != 0 ? c12654c.allowDestructiveMigrationOnDowngrade : z12;
        Set set2 = (i10 & 4096) != 0 ? c12654c.migrationNotRequiredFrom : set;
        String str4 = (i10 & 8192) != 0 ? c12654c.copyFromAssetPath : str2;
        Context context3 = context2;
        File file2 = (i10 & 16384) != 0 ? c12654c.copyFromFile : file;
        Callable callable2 = (i10 & 32768) != 0 ? c12654c.copyFromInputStream : callable;
        if ((i10 & 65536) != 0) {
            c12654c.getClass();
            fVar2 = null;
        } else {
            fVar2 = fVar;
        }
        Callable callable3 = callable2;
        List list5 = (i10 & 131072) != 0 ? c12654c.typeConverters : list2;
        List list6 = (i10 & 262144) != 0 ? c12654c.autoMigrationSpecs : list3;
        boolean z17 = (i10 & 524288) != 0 ? c12654c.allowDestructiveMigrationForAllTables : z13;
        InterfaceC5360c interfaceC5360c3 = (i10 & 1048576) != 0 ? c12654c.sqliteDriver : interfaceC5360c;
        if ((i10 & 2097152) != 0) {
            interfaceC5360c2 = interfaceC5360c3;
            coroutineContext2 = c12654c.queryCoroutineContext;
        } else {
            coroutineContext2 = coroutineContext;
            interfaceC5360c2 = interfaceC5360c3;
        }
        return c12654c.m47158a(context3, str3, cVar2, eVar2, list4, z14, dVar2, executor3, executor4, intent2, z15, z16, set2, str4, file2, callable3, fVar2, list5, list6, z17, interfaceC5360c2, coroutineContext2);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final C12654c m47158a(@NotNull Context context, @Nullable String name, @Nullable InterfaceC6009d.c sqliteOpenHelperFactory, @NotNull AbstractC12682u.e migrationContainer, @Nullable List<? extends AbstractC12682u.b> callbacks, boolean allowMainThreadQueries, @NotNull AbstractC12682u.d journalMode, @NotNull Executor queryExecutor, @NotNull Executor transactionExecutor, @Nullable Intent multiInstanceInvalidationServiceIntent, boolean requireMigration, boolean allowDestructiveMigrationOnDowngrade, @Nullable Set<Integer> migrationNotRequiredFrom, @Nullable String copyFromAssetPath, @Nullable File copyFromFile, @Nullable Callable<InputStream> copyFromInputStream, @Nullable AbstractC12682u.f prepackagedDatabaseCallback, @NotNull List<? extends Object> typeConverters, @NotNull List<? extends InterfaceC0071a> autoMigrationSpecs, boolean allowDestructiveMigrationForAllTables, @Nullable InterfaceC5360c sqliteDriver, @Nullable CoroutineContext queryCoroutineContext) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(migrationContainer, "migrationContainer");
        Intrinsics.checkNotNullParameter(journalMode, "journalMode");
        Intrinsics.checkNotNullParameter(queryExecutor, "queryExecutor");
        Intrinsics.checkNotNullParameter(transactionExecutor, "transactionExecutor");
        Intrinsics.checkNotNullParameter(typeConverters, "typeConverters");
        Intrinsics.checkNotNullParameter(autoMigrationSpecs, "autoMigrationSpecs");
        C12654c c12654c = new C12654c(context, name, sqliteOpenHelperFactory, migrationContainer, callbacks, allowMainThreadQueries, journalMode, queryExecutor, transactionExecutor, multiInstanceInvalidationServiceIntent, requireMigration, allowDestructiveMigrationOnDowngrade, migrationNotRequiredFrom, copyFromAssetPath, copyFromFile, copyFromInputStream, prepackagedDatabaseCallback, typeConverters, autoMigrationSpecs, allowDestructiveMigrationForAllTables, sqliteDriver, queryCoroutineContext);
        c12654c.useTempTrackingTable = this.useTempTrackingTable;
        c12654c.preparedStatementCacheSize = this.preparedStatementCacheSize;
        return c12654c;
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final Set<Integer> m47159c() {
        return this.migrationNotRequiredFrom;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getPreparedStatementCacheSize() {
        return this.preparedStatementCacheSize;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getUseTempTrackingTable() {
        return this.useTempTrackingTable;
    }

    /* JADX INFO: renamed from: f */
    public boolean m47162f(int fromVersion, int toVersion) {
        return C1532h.m8094d(this, fromVersion, toVersion);
    }

    /* JADX INFO: renamed from: g */
    public final void m47163g(boolean z10) {
        this.useTempTrackingTable = z10;
    }
}
