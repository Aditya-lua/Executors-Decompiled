package x4;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0000\u0018\u00002\u00020\u0001:\u0002DEBW\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012<\u0010\u000b\u001a8\b\u0001\u0012\u0018\u0012\u0016\b\u0001\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0007\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006j\u0006\u0012\u0002\b\u0003`\n¢\u0006\u0004\b\f\u0010\rBc\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e0\u0007\u0012<\u0010\u000b\u001a8\b\u0001\u0012\u0018\u0012\u0016\b\u0001\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0007\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006j\u0006\u0012\u0002\b\u0003`\n¢\u0006\u0004\b\f\u0010\u0010JB\u0010\u0016\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00112\u0006\u0010\u0013\u001a\u00020\u00122\"\u0010\u0015\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006H\u0096@¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018H\u0010¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u0012¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u001cH\u0002¢\u0006\u0004\b!\u0010\u001eJ'\u0010$\u001a\u00020\u0002*\u00020\u00022\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u001c0\u0007H\u0002¢\u0006\u0004\b$\u0010%R\u001a\u0010*\u001a\u00020\u00028\u0014X\u0094\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001a\u0010\u0005\u001a\u00020\u00048\u0014X\u0094\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R \u00105\u001a\b\u0012\u0004\u0012\u0002000/8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u001a\u0010;\u001a\u0002068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u001c\u0010@\u001a\u0004\u0018\u00010\u000e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u0018\u0010C\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010B¨\u0006F"}, d2 = {"Lx4/p;", "Lx4/a;", "Lx4/c;", "config", "Lx4/a0;", "openDelegate", "Lkotlin/Function2;", "Lkotlin/Function1;", "Lnt/b;", "", "Landroidx/room/coroutines/TransactionWrapper;", "transactionWrapper", "<init>", "(Lx4/c;Lx4/a0;Lkotlin/jvm/functions/Function2;)V", "Lg5/d;", "supportOpenHelperFactory", "(Lx4/c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V", "R", "", "isReadOnly", "Lx4/g0;", "block", "K", "(ZLkotlin/jvm/functions/Function2;Lnt/b;)Ljava/lang/Object;", "", "fileName", "A", "(Ljava/lang/String;)Ljava/lang/String;", "", "F", "()V", "J", "()Z", "H", "Lg5/c;", "onOpen", "I", "(Lx4/c;Lkotlin/jvm/functions/Function1;)Lx4/c;", "d", "Lx4/c;", "o", "()Lx4/c;", "configuration", "e", "Lx4/a0;", "r", "()Lx4/a0;", "", "Lx4/u$b;", "f", "Ljava/util/List;", "n", "()Ljava/util/List;", "callbacks", "Lz4/c;", "g", "Lz4/c;", "getConnectionPool$room_runtime", "()Lz4/c;", "connectionPool", "h", "Lg5/d;", "G", "()Lg5/d;", "supportOpenHelper", "i", "Lg5/c;", "supportDatabase", "b", "a", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class p extends x4.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final x4.c configuration;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final a0 openDelegate;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<u.b> callbacks;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final z4.c connectionPool;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final g5.d supportOpenHelper;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public g5.c supportDatabase;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\bJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\bJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\bJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\b¨\u0006\u0011"}, d2 = {"Lx4/p$a;", "Lx4/a0;", "<init>", "()V", "Lf5/b;", "connection", "", "f", "(Lf5/b;)V", "i", "Lx4/a0$a;", "j", "(Lf5/b;)Lx4/a0$a;", "h", "g", "a", "b", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends a0 {
        public a() {
            super(-1, "", "");
        }

        @Override // x4.a0
        public void a(@NotNull f5.b connection) {
            Intrinsics.checkNotNullParameter(connection, "connection");
            throw new IllegalStateException("NOP delegate should never be called");
        }

        @Override // x4.a0
        public void b(@NotNull f5.b connection) {
            Intrinsics.checkNotNullParameter(connection, "connection");
            throw new IllegalStateException("NOP delegate should never be called");
        }

        @Override // x4.a0
        public void f(@NotNull f5.b connection) {
            Intrinsics.checkNotNullParameter(connection, "connection");
            throw new IllegalStateException("NOP delegate should never be called");
        }

        @Override // x4.a0
        public void g(@NotNull f5.b connection) {
            Intrinsics.checkNotNullParameter(connection, "connection");
            throw new IllegalStateException("NOP delegate should never be called");
        }

        @Override // x4.a0
        public void h(@NotNull f5.b connection) {
            Intrinsics.checkNotNullParameter(connection, "connection");
            throw new IllegalStateException("NOP delegate should never be called");
        }

        @Override // x4.a0
        public void i(@NotNull f5.b connection) {
            Intrinsics.checkNotNullParameter(connection, "connection");
            throw new IllegalStateException("NOP delegate should never be called");
        }

        @Override // x4.a0
        @NotNull
        public a0.a j(@NotNull f5.b connection) {
            Intrinsics.checkNotNullParameter(connection, "connection");
            throw new IllegalStateException("NOP delegate should never be called");
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\r\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\n¨\u0006\u0011"}, d2 = {"Lx4/p$b;", "Lg5/d$a;", "", "version", "<init>", "(Lx4/p;I)V", "Lg5/c;", "db", "", "d", "(Lg5/c;)V", "oldVersion", "newVersion", "g", "(Lg5/c;II)V", "e", "f", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class b extends g5.d.a {
        public b(int i10) {
            super(i10);
        }

        @Override // g5.d.a
        public void d(@NotNull g5.c db2) {
            Intrinsics.checkNotNullParameter(db2, "db");
            p.this.x(new i5.a(db2));
        }

        @Override // g5.d.a
        public void e(@NotNull g5.c db2, int oldVersion, int newVersion) {
            Intrinsics.checkNotNullParameter(db2, "db");
            g(db2, oldVersion, newVersion);
        }

        @Override // g5.d.a
        public void f(@NotNull g5.c db2) {
            Intrinsics.checkNotNullParameter(db2, "db");
            p.this.z(new i5.a(db2));
            p.this.supportDatabase = db2;
        }

        @Override // g5.d.a
        public void g(@NotNull g5.c db2, int oldVersion, int newVersion) {
            Intrinsics.checkNotNullParameter(db2, "db");
            p.this.y(new i5.a(db2), oldVersion, newVersion);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"x4/p$c", "Lx4/u$b;", "Lg5/c;", "db", "", "f", "(Lg5/c;)V", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c extends u.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Function1<g5.c, Unit> f34843a;

        /* JADX WARN: Multi-variable type inference failed */
        public c(Function1<? super g5.c, Unit> function1) {
            this.f34843a = function1;
        }

        @Override // x4.u.b
        public void f(g5.c db2) {
            Intrinsics.checkNotNullParameter(db2, "db");
            this.f34843a.invoke(db2);
        }
    }

    public p(@NotNull x4.c config, @NotNull a0 openDelegate, @NotNull Function2<? super Function1<? super nt.b<Object>, ? extends Object>, ? super nt.b<Object>, ? extends Object> transactionWrapper) {
        z4.c cVarB;
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(openDelegate, "openDelegate");
        Intrinsics.checkNotNullParameter(transactionWrapper, "transactionWrapper");
        this.configuration = config;
        this.openDelegate = openDelegate;
        List<u.b> list = config.callbacks;
        this.callbacks = list == null ? kotlin.collections.p.k() : list;
        f5.c cVar = config.sqliteDriver;
        if (cVar != null) {
            this.supportOpenHelper = null;
            if (cVar.b()) {
                x4.a.b bVar = new x4.a.b(this, config.sqliteDriver);
                String str = config.name;
                cVarB = new z4.n(bVar, str != null ? str : ":memory:", transactionWrapper);
            } else {
                cVarB = config.name == null ? z4.i.b(new x4.a.b(this, config.sqliteDriver), ":memory:", config.getPreparedStatementCacheSize()) : z4.i.a(new x4.a.b(this, config.sqliteDriver), config.name, p(config.journalMode), q(config.journalMode), config.getPreparedStatementCacheSize());
            }
            this.connectionPool = cVarB;
        } else {
            if (config.sqliteOpenHelperFactory == null) {
                throw new IllegalArgumentException("SQLiteManager was constructed with both null driver and open helper factory!");
            }
            g5.d dVarA = config.sqliteOpenHelperFactory.a(g5.d.b.INSTANCE.a(config.context).d(config.name).c(new b(openDelegate.getVersion())).b());
            this.supportOpenHelper = dVarA;
            i5.b bVar2 = new i5.b(dVarA);
            String str2 = config.name;
            this.connectionPool = new z4.n(bVar2, str2 != null ? str2 : ":memory:", transactionWrapper);
        }
        H();
    }

    public static final Unit D(p pVar, g5.c db2) {
        Intrinsics.checkNotNullParameter(db2, "db");
        pVar.supportDatabase = db2;
        return Unit.f22483a;
    }

    @Override // x4.a
    @NotNull
    public String A(@NotNull String fileName) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        if (Intrinsics.c(fileName, ":memory:")) {
            return fileName;
        }
        String absolutePath = getConfiguration().context.getDatabasePath(fileName).getAbsolutePath();
        Intrinsics.checkNotNull(absolutePath);
        return absolutePath;
    }

    public final void F() {
        this.connectionPool.close();
        g5.d dVar = this.supportOpenHelper;
        if (dVar != null) {
            dVar.close();
        }
    }

    @Nullable
    /* JADX INFO: renamed from: G, reason: from getter */
    public final g5.d getSupportOpenHelper() {
        return this.supportOpenHelper;
    }

    public final void H() {
        boolean z10 = getConfiguration().journalMode == u.d.WRITE_AHEAD_LOGGING;
        g5.d dVar = this.supportOpenHelper;
        if (dVar != null) {
            dVar.setWriteAheadLoggingEnabled(z10);
        }
    }

    public final x4.c I(x4.c cVar, Function1<? super g5.c, Unit> function1) {
        List<u.b> listK = cVar.callbacks;
        if (listK == null) {
            listK = kotlin.collections.p.k();
        }
        return x4.c.b(cVar, null, null, null, null, CollectionsKt.x0(listK, new c(function1)), false, null, null, null, null, false, false, null, null, null, null, null, null, null, false, null, null, 4194287, null);
    }

    public final boolean J() {
        g5.c cVar = this.supportDatabase;
        if (cVar != null) {
            return cVar.isOpen();
        }
        return false;
    }

    @Nullable
    public <R> Object K(boolean z10, @NotNull Function2<? super g0, ? super nt.b<? super R>, ? extends Object> function2, @NotNull nt.b<? super R> bVar) {
        return this.connectionPool.n3(z10, function2, bVar);
    }

    @Override // x4.a
    @NotNull
    public List<u.b> n() {
        return this.callbacks;
    }

    @Override // x4.a
    @NotNull
    /* JADX INFO: renamed from: o, reason: from getter */
    public x4.c getConfiguration() {
        return this.configuration;
    }

    @Override // x4.a
    @NotNull
    /* JADX INFO: renamed from: r, reason: from getter */
    public a0 getOpenDelegate() {
        return this.openDelegate;
    }

    public p(@NotNull x4.c config, @NotNull Function1<? super x4.c, ? extends g5.d> supportOpenHelperFactory, @NotNull Function2<? super Function1<? super nt.b<Object>, ? extends Object>, ? super nt.b<Object>, ? extends Object> transactionWrapper) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(supportOpenHelperFactory, "supportOpenHelperFactory");
        Intrinsics.checkNotNullParameter(transactionWrapper, "transactionWrapper");
        this.configuration = config;
        this.openDelegate = new a();
        List<u.b> list = config.callbacks;
        this.callbacks = list == null ? kotlin.collections.p.k() : list;
        g5.d dVarInvoke = supportOpenHelperFactory.invoke(I(config, new Function1() { // from class: x4.o
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return p.D(this.f34835a, (g5.c) obj);
            }
        }));
        this.supportOpenHelper = dVarInvoke;
        i5.b bVar = new i5.b(dVarInvoke);
        String str = config.name;
        this.connectionPool = new z4.n(bVar, str == null ? ":memory:" : str, transactionWrapper);
        H();
    }
}
