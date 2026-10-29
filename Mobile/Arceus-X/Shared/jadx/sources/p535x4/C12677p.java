package p535x4;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7699p;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p119f5.InterfaceC5359b;
import p119f5.InterfaceC5360c;
import p145g5.InterfaceC6008c;
import p145g5.InterfaceC6009d;
import p187i5.C6639a;
import p187i5.C6640b;
import p315nt.InterfaceC9557b;
import p594z4.C13709i;
import p594z4.C13714n;
import p594z4.InterfaceC13703c;

/* JADX INFO: renamed from: x4.p */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0000\u0018\u00002\u00020\u0001:\u0002DEBW\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012<\u0010\u000b\u001a8\b\u0001\u0012\u0018\u0012\u0016\b\u0001\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0007\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006j\u0006\u0012\u0002\b\u0003`\n¢\u0006\u0004\b\f\u0010\rBc\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e0\u0007\u0012<\u0010\u000b\u001a8\b\u0001\u0012\u0018\u0012\u0016\b\u0001\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0007\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006j\u0006\u0012\u0002\b\u0003`\n¢\u0006\u0004\b\f\u0010\u0010JB\u0010\u0016\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00112\u0006\u0010\u0013\u001a\u00020\u00122\"\u0010\u0015\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006H\u0096@¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018H\u0010¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u0012¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u001cH\u0002¢\u0006\u0004\b!\u0010\u001eJ'\u0010$\u001a\u00020\u0002*\u00020\u00022\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u001c0\u0007H\u0002¢\u0006\u0004\b$\u0010%R\u001a\u0010*\u001a\u00020\u00028\u0014X\u0094\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001a\u0010\u0005\u001a\u00020\u00048\u0014X\u0094\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R \u00105\u001a\b\u0012\u0004\u0012\u0002000/8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u001a\u0010;\u001a\u0002068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u001c\u0010@\u001a\u0004\u0018\u00010\u000e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u0018\u0010C\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010B¨\u0006F"}, m31665d2 = {"Lx4/p;", "Lx4/a;", "Lx4/c;", "config", "Lx4/a0;", "openDelegate", "Lkotlin/Function2;", "Lkotlin/Function1;", "Lnt/b;", "", "Landroidx/room/coroutines/TransactionWrapper;", "transactionWrapper", "<init>", "(Lx4/c;Lx4/a0;Lkotlin/jvm/functions/Function2;)V", "Lg5/d;", "supportOpenHelperFactory", "(Lx4/c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V", "R", "", "isReadOnly", "Lx4/g0;", "block", "K", "(ZLkotlin/jvm/functions/Function2;Lnt/b;)Ljava/lang/Object;", "", "fileName", "A", "(Ljava/lang/String;)Ljava/lang/String;", "", "F", "()V", "J", "()Z", "H", "Lg5/c;", "onOpen", "I", "(Lx4/c;Lkotlin/jvm/functions/Function1;)Lx4/c;", "d", "Lx4/c;", "o", "()Lx4/c;", "configuration", "e", "Lx4/a0;", "r", "()Lx4/a0;", "", "Lx4/u$b;", "f", "Ljava/util/List;", "n", "()Ljava/util/List;", "callbacks", "Lz4/c;", "g", "Lz4/c;", "getConnectionPool$room_runtime", "()Lz4/c;", "connectionPool", "h", "Lg5/d;", "G", "()Lg5/d;", "supportOpenHelper", "i", "Lg5/c;", "supportDatabase", "b", "a", "room-runtime"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C12677p extends AbstractC12650a {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final C12654c configuration;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final AbstractC12651a0 openDelegate;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final List<AbstractC12682u.b> callbacks;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC13703c connectionPool;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public final InterfaceC6009d supportOpenHelper;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public InterfaceC6008c supportDatabase;

    /* JADX INFO: renamed from: x4.p$a */
    @Metadata(m31664d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\bJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\bJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\bJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\b¨\u0006\u0011"}, m31665d2 = {"Lx4/p$a;", "Lx4/a0;", "<init>", "()V", "Lf5/b;", "connection", "", "f", "(Lf5/b;)V", "i", "Lx4/a0$a;", "j", "(Lf5/b;)Lx4/a0$a;", "h", "g", "a", "b", "room-runtime"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class a extends AbstractC12651a0 {
        public a() {
            super(-1, "", "");
        }

        @Override // p535x4.AbstractC12651a0
        /* JADX INFO: renamed from: a */
        public void mo6378a(@NotNull InterfaceC5359b connection) {
            Intrinsics.checkNotNullParameter(connection, "connection");
            throw new IllegalStateException("NOP delegate should never be called");
        }

        @Override // p535x4.AbstractC12651a0
        /* JADX INFO: renamed from: b */
        public void mo6379b(@NotNull InterfaceC5359b connection) {
            Intrinsics.checkNotNullParameter(connection, "connection");
            throw new IllegalStateException("NOP delegate should never be called");
        }

        @Override // p535x4.AbstractC12651a0
        /* JADX INFO: renamed from: f */
        public void mo6380f(@NotNull InterfaceC5359b connection) {
            Intrinsics.checkNotNullParameter(connection, "connection");
            throw new IllegalStateException("NOP delegate should never be called");
        }

        @Override // p535x4.AbstractC12651a0
        /* JADX INFO: renamed from: g */
        public void mo6381g(@NotNull InterfaceC5359b connection) {
            Intrinsics.checkNotNullParameter(connection, "connection");
            throw new IllegalStateException("NOP delegate should never be called");
        }

        @Override // p535x4.AbstractC12651a0
        /* JADX INFO: renamed from: h */
        public void mo6382h(@NotNull InterfaceC5359b connection) {
            Intrinsics.checkNotNullParameter(connection, "connection");
            throw new IllegalStateException("NOP delegate should never be called");
        }

        @Override // p535x4.AbstractC12651a0
        /* JADX INFO: renamed from: i */
        public void mo6383i(@NotNull InterfaceC5359b connection) {
            Intrinsics.checkNotNullParameter(connection, "connection");
            throw new IllegalStateException("NOP delegate should never be called");
        }

        @Override // p535x4.AbstractC12651a0
        @NotNull
        /* JADX INFO: renamed from: j */
        public AbstractC12651a0.a mo6384j(@NotNull InterfaceC5359b connection) {
            Intrinsics.checkNotNullParameter(connection, "connection");
            throw new IllegalStateException("NOP delegate should never be called");
        }
    }

    /* JADX INFO: renamed from: x4.p$b */
    @Metadata(m31664d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\r\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\n¨\u0006\u0011"}, m31665d2 = {"Lx4/p$b;", "Lg5/d$a;", "", "version", "<init>", "(Lx4/p;I)V", "Lg5/c;", "db", "", "d", "(Lg5/c;)V", "oldVersion", "newVersion", "g", "(Lg5/c;II)V", "e", "f", "room-runtime"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public final class b extends InterfaceC6009d.a {
        public b(int i10) {
            super(i10);
        }

        @Override // p145g5.InterfaceC6009d.a
        /* JADX INFO: renamed from: d */
        public void mo26783d(@NotNull InterfaceC6008c db2) {
            Intrinsics.checkNotNullParameter(db2, "db");
            C12677p.this.m47147x(new C6639a(db2));
        }

        @Override // p145g5.InterfaceC6009d.a
        /* JADX INFO: renamed from: e */
        public void mo26784e(@NotNull InterfaceC6008c db2, int oldVersion, int newVersion) {
            Intrinsics.checkNotNullParameter(db2, "db");
            mo26786g(db2, oldVersion, newVersion);
        }

        @Override // p145g5.InterfaceC6009d.a
        /* JADX INFO: renamed from: f */
        public void mo26785f(@NotNull InterfaceC6008c db2) {
            Intrinsics.checkNotNullParameter(db2, "db");
            C12677p.this.m47149z(new C6639a(db2));
            C12677p.this.supportDatabase = db2;
        }

        @Override // p145g5.InterfaceC6009d.a
        /* JADX INFO: renamed from: g */
        public void mo26786g(@NotNull InterfaceC6008c db2, int oldVersion, int newVersion) {
            Intrinsics.checkNotNullParameter(db2, "db");
            C12677p.this.m47148y(new C6639a(db2), oldVersion, newVersion);
        }
    }

    /* JADX INFO: renamed from: x4.p$c */
    @Metadata(m31664d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m31665d2 = {"x4/p$c", "Lx4/u$b;", "Lg5/c;", "db", "", "f", "(Lg5/c;)V", "room-runtime"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class c extends AbstractC12682u.b {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Function1<InterfaceC6008c, Unit> f45142a;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super g5.c, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public c(Function1<? super InterfaceC6008c, Unit> function1) {
            this.f45142a = function1;
        }

        @Override // p535x4.AbstractC12682u.b
        /* JADX INFO: renamed from: f */
        public void mo47239f(InterfaceC6008c db2) {
            Intrinsics.checkNotNullParameter(db2, "db");
            this.f45142a.invoke(db2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C12677p(@NotNull C12654c config, @NotNull AbstractC12651a0 openDelegate, @NotNull Function2<? super Function1<? super InterfaceC9557b<Object>, ? extends Object>, ? super InterfaceC9557b<Object>, ? extends Object> transactionWrapper) {
        InterfaceC13703c interfaceC13703cM50076b;
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(openDelegate, "openDelegate");
        Intrinsics.checkNotNullParameter(transactionWrapper, "transactionWrapper");
        this.configuration = config;
        this.openDelegate = openDelegate;
        List<AbstractC12682u.b> list = config.callbacks;
        this.callbacks = list == null ? C7699p.m31892k() : list;
        InterfaceC5360c interfaceC5360c = config.sqliteDriver;
        if (interfaceC5360c != null) {
            this.supportOpenHelper = null;
            if (interfaceC5360c.mo24698b()) {
                AbstractC12650a.b bVar = new AbstractC12650a.b(this, config.sqliteDriver);
                String str = config.name;
                interfaceC13703cM50076b = new C13714n(bVar, str != null ? str : ":memory:", transactionWrapper);
            } else {
                interfaceC13703cM50076b = config.name == null ? C13709i.m50076b(new AbstractC12650a.b(this, config.sqliteDriver), ":memory:", config.getPreparedStatementCacheSize()) : C13709i.m50075a(new AbstractC12650a.b(this, config.sqliteDriver), config.name, m47139p(config.journalMode), m47140q(config.journalMode), config.getPreparedStatementCacheSize());
            }
            this.connectionPool = interfaceC13703cM50076b;
        } else {
            if (config.sqliteOpenHelperFactory == null) {
                throw new IllegalArgumentException("SQLiteManager was constructed with both null driver and open helper factory!");
            }
            InterfaceC6009d interfaceC6009dMo6926a = config.sqliteOpenHelperFactory.mo6926a(InterfaceC6009d.b.INSTANCE.m26792a(config.context).m26790d(config.name).m26789c(new b(openDelegate.getVersion())).m26788b());
            this.supportOpenHelper = interfaceC6009dMo6926a;
            C6640b c6640b = new C6640b(interfaceC6009dMo6926a);
            String str2 = config.name;
            this.connectionPool = new C13714n(c6640b, str2 != null ? str2 : ":memory:", transactionWrapper);
        }
        m47235H();
    }

    /* JADX INFO: renamed from: D */
    public static final Unit m47231D(C12677p c12677p, InterfaceC6008c db2) {
        Intrinsics.checkNotNullParameter(db2, "db");
        c12677p.supportDatabase = db2;
        return Unit.f29331a;
    }

    @Override // p535x4.AbstractC12650a
    @NotNull
    /* JADX INFO: renamed from: A */
    public String mo47127A(@NotNull String fileName) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        if (Intrinsics.m31980c(fileName, ":memory:")) {
            return fileName;
        }
        String absolutePath = getConfiguration().context.getDatabasePath(fileName).getAbsolutePath();
        Intrinsics.checkNotNull(absolutePath);
        return absolutePath;
    }

    /* JADX INFO: renamed from: F */
    public final void m47233F() {
        this.connectionPool.close();
        InterfaceC6009d interfaceC6009d = this.supportOpenHelper;
        if (interfaceC6009d != null) {
            interfaceC6009d.close();
        }
    }

    @Nullable
    /* JADX INFO: renamed from: G, reason: from getter */
    public final InterfaceC6009d getSupportOpenHelper() {
        return this.supportOpenHelper;
    }

    /* JADX INFO: renamed from: H */
    public final void m47235H() {
        boolean z10 = getConfiguration().journalMode == AbstractC12682u.d.WRITE_AHEAD_LOGGING;
        InterfaceC6009d interfaceC6009d = this.supportOpenHelper;
        if (interfaceC6009d != null) {
            interfaceC6009d.setWriteAheadLoggingEnabled(z10);
        }
    }

    /* JADX INFO: renamed from: I */
    public final C12654c m47236I(C12654c c12654c, Function1<? super InterfaceC6008c, Unit> function1) {
        List<AbstractC12682u.b> listM31892k = c12654c.callbacks;
        if (listM31892k == null) {
            listM31892k = C7699p.m31892k();
        }
        return C12654c.m47157b(c12654c, null, null, null, null, CollectionsKt.m31726x0(listM31892k, new c(function1)), false, null, null, null, null, false, false, null, null, null, null, null, null, null, false, null, null, 4194287, null);
    }

    /* JADX INFO: renamed from: J */
    public final boolean m47237J() {
        InterfaceC6008c interfaceC6008c = this.supportDatabase;
        if (interfaceC6008c != null) {
            return interfaceC6008c.isOpen();
        }
        return false;
    }

    @Nullable
    /* JADX INFO: renamed from: K */
    public <R> Object m47238K(boolean z10, @NotNull Function2<? super InterfaceC12663g0, ? super InterfaceC9557b<? super R>, ? extends Object> function2, @NotNull InterfaceC9557b<? super R> interfaceC9557b) {
        return this.connectionPool.mo50063n3(z10, function2, interfaceC9557b);
    }

    @Override // p535x4.AbstractC12650a
    @NotNull
    /* JADX INFO: renamed from: n */
    public List<AbstractC12682u.b> mo47137n() {
        return this.callbacks;
    }

    @Override // p535x4.AbstractC12650a
    @NotNull
    /* JADX INFO: renamed from: o, reason: from getter */
    public C12654c getConfiguration() {
        return this.configuration;
    }

    @Override // p535x4.AbstractC12650a
    @NotNull
    /* JADX INFO: renamed from: r, reason: from getter */
    public AbstractC12651a0 getOpenDelegate() {
        return this.openDelegate;
    }

    public C12677p(@NotNull C12654c config, @NotNull Function1<? super C12654c, ? extends InterfaceC6009d> supportOpenHelperFactory, @NotNull Function2<? super Function1<? super InterfaceC9557b<Object>, ? extends Object>, ? super InterfaceC9557b<Object>, ? extends Object> transactionWrapper) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(supportOpenHelperFactory, "supportOpenHelperFactory");
        Intrinsics.checkNotNullParameter(transactionWrapper, "transactionWrapper");
        this.configuration = config;
        this.openDelegate = new a();
        List<AbstractC12682u.b> list = config.callbacks;
        this.callbacks = list == null ? C7699p.m31892k() : list;
        InterfaceC6009d interfaceC6009dInvoke = supportOpenHelperFactory.invoke(m47236I(config, new Function1() { // from class: x4.o
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C12677p.m47231D(this.f45134a, (InterfaceC6008c) obj);
            }
        }));
        this.supportOpenHelper = interfaceC6009dInvoke;
        C6640b c6640b = new C6640b(interfaceC6009dInvoke);
        String str = config.name;
        this.connectionPool = new C13714n(c6640b, str == null ? ":memory:" : str, transactionWrapper);
        m47235H();
    }
}
