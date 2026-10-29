package p535x4;

import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7697o;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C7797x;
import org.jetbrains.annotations.NotNull;
import p006a5.AbstractC0072b;
import p041c5.C1532h;
import p119f5.C5358a;
import p119f5.InterfaceC5359b;
import p119f5.InterfaceC5360c;
import p119f5.InterfaceC5361d;
import p229jt.C7347n;
import p229jt.C7348o;
import p229jt.C7352s;
import p559xt.C12915a;
import p566y4.C13028b;

/* JADX INFO: renamed from: x4.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u0000 92\u00020\u0001:\u0002*'B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\bJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\bJ\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\bJ\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\bJ\u0017\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\bJ\u0017\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u000fJ\u0017\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0015\u0010\bJ\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\bJ\u0017\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0017\u0010\bJ\u0017\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018H\u0010¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0004¢\u0006\u0004\b\u001c\u0010\bJ'\u0010 \u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001dH\u0004¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0004¢\u0006\u0004\b\"\u0010\bJ\u0013\u0010$\u001a\u00020\u001d*\u00020#H\u0004¢\u0006\u0004\b$\u0010%J\u0013\u0010&\u001a\u00020\u001d*\u00020#H\u0004¢\u0006\u0004\b&\u0010%R\u0016\u0010)\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010+\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010(R\u0014\u0010/\u001a\u00020,8$X¤\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0014\u00103\u001a\u0002008$X¤\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u001a\u00108\u001a\b\u0012\u0004\u0012\u000205048$X¤\u0004¢\u0006\u0006\u001a\u0004\b6\u00107¨\u0006:"}, m31665d2 = {"Lx4/a;", "", "<init>", "()V", "Lf5/b;", "connection", "", "i", "(Lf5/b;)V", "g", "j", "k", "h", "", "s", "(Lf5/b;)Z", "B", "l", "m", "f", "t", "u", "v", "w", "", "fileName", "A", "(Ljava/lang/String;)Ljava/lang/String;", "x", "", "oldVersion", "newVersion", "y", "(Lf5/b;II)V", "z", "Lx4/u$d;", "p", "(Lx4/u$d;)I", "q", "a", "Z", "isConfigured", "b", "isInitializing", "Lx4/c;", "o", "()Lx4/c;", "configuration", "Lx4/a0;", "r", "()Lx4/a0;", "openDelegate", "", "Lx4/u$b;", "n", "()Ljava/util/List;", "callbacks", "c", "room-runtime"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public abstract class AbstractC12650a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public boolean isConfigured;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public boolean isInitializing;

    /* JADX INFO: renamed from: x4.a$b */
    @Metadata(m31664d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0084\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\tR\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, m31665d2 = {"Lx4/a$b;", "Lf5/c;", "actual", "<init>", "(Lx4/a;Lf5/c;)V", "", "fileName", "Lf5/b;", "a", "(Ljava/lang/String;)Lf5/b;", "filename", "d", "Lf5/c;", "", "b", "()Z", "hasConnectionPool", "room-runtime"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public final class b implements InterfaceC5360c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final InterfaceC5360c actual;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ AbstractC12650a f44982b;

        /* JADX INFO: renamed from: x4.a$b$a */
        @Metadata(m31666k = 3, m31667mv = {2, 1, 0}, m31669xi = 48)
        public static final class a implements Function1 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ String f44983a;

            public a(String str) {
                this.f44983a = str;
            }

            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Void invoke(Throwable error) {
                Intrinsics.checkNotNullParameter(error, "error");
                throw new IllegalStateException("Unable to open database '" + this.f44983a + "'. Was a proper path / name used in Room's database builder?", error);
            }
        }

        public b(@NotNull AbstractC12650a abstractC12650a, InterfaceC5360c actual) {
            Intrinsics.checkNotNullParameter(actual, "actual");
            this.f44982b = abstractC12650a;
            this.actual = actual;
        }

        /* JADX INFO: renamed from: e */
        public static final InterfaceC5359b m47151e(AbstractC12650a abstractC12650a, b bVar, String str) throws Exception {
            if (abstractC12650a.isInitializing) {
                throw new IllegalStateException("Recursive database initialization detected. Did you try to use the database instance during initialization? Maybe in one of the callbacks?");
            }
            InterfaceC5359b interfaceC5359bMo24697a = bVar.actual.mo24697a(str);
            if (abstractC12650a.isConfigured) {
                abstractC12650a.m47130g(interfaceC5359bMo24697a);
                return interfaceC5359bMo24697a;
            }
            try {
                abstractC12650a.isInitializing = true;
                abstractC12650a.m47132i(interfaceC5359bMo24697a);
                return interfaceC5359bMo24697a;
            } finally {
                abstractC12650a.isInitializing = false;
            }
        }

        @Override // p119f5.InterfaceC5360c
        @NotNull
        /* JADX INFO: renamed from: a */
        public InterfaceC5359b mo24697a(@NotNull String fileName) {
            Intrinsics.checkNotNullParameter(fileName, "fileName");
            return m47152d(this.f44982b.mo47127A(fileName));
        }

        @Override // p119f5.InterfaceC5360c
        /* JADX INFO: renamed from: b */
        public boolean mo24698b() {
            return this.actual.mo24698b();
        }

        /* JADX INFO: renamed from: d */
        public final InterfaceC5359b m47152d(final String filename) {
            C13028b c13028b = new C13028b(filename, (this.f44982b.isConfigured || this.f44982b.isInitializing || Intrinsics.m31980c(filename, ":memory:")) ? false : true);
            final AbstractC12650a abstractC12650a = this.f44982b;
            return (InterfaceC5359b) c13028b.m48538b(new Function0() { // from class: x4.b
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AbstractC12650a.b.m47151e(abstractC12650a, this, filename);
                }
            }, new a(filename));
        }
    }

    /* JADX INFO: renamed from: x4.a$c */
    @Metadata(m31666k = 3, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f44984a;

        static {
            int[] iArr = new int[AbstractC12682u.d.values().length];
            try {
                iArr[AbstractC12682u.d.TRUNCATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AbstractC12682u.d.WRITE_AHEAD_LOGGING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f44984a = iArr;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: A */
    public abstract String mo47127A(@NotNull String fileName);

    /* JADX INFO: renamed from: B */
    public final void m47128B(InterfaceC5359b connection) {
        m47135l(connection);
        C5358a.m24693a(connection, C12687z.m47321a(getOpenDelegate().getIdentityHash()));
    }

    /* JADX INFO: renamed from: f */
    public final void m47129f(InterfaceC5359b connection) throws Exception {
        Object objM30460b;
        if (m47143t(connection)) {
            InterfaceC5361d interfaceC5361dMo24696r3 = connection.mo24696r3("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1");
            try {
                String strMo24702E2 = interfaceC5361dMo24696r3.mo24704g3() ? interfaceC5361dMo24696r3.mo24702E2(0) : null;
                C12915a.m47941a(interfaceC5361dMo24696r3, null);
                if (Intrinsics.m31980c(getOpenDelegate().getIdentityHash(), strMo24702E2) || Intrinsics.m31980c(getOpenDelegate().getLegacyIdentityHash(), strMo24702E2)) {
                    return;
                }
                throw new IllegalStateException(("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: " + getOpenDelegate().getIdentityHash() + ", found: " + strMo24702E2).toString());
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    C12915a.m47941a(interfaceC5361dMo24696r3, th2);
                    throw th3;
                }
            }
        }
        C5358a.m24693a(connection, "BEGIN EXCLUSIVE TRANSACTION");
        try {
            C7347n.Companion companion = C7347n.INSTANCE;
            AbstractC12651a0.a aVarMo6384j = getOpenDelegate().mo6384j(connection);
            if (!aVarMo6384j.isValid) {
                throw new IllegalStateException(("Pre-packaged database has an invalid schema: " + aVarMo6384j.expectedFoundMsg).toString());
            }
            getOpenDelegate().mo6382h(connection);
            m47128B(connection);
            objM30460b = C7347n.m30460b(Unit.f29331a);
            if (C7347n.m30466h(objM30460b)) {
                C5358a.m24693a(connection, "END TRANSACTION");
            }
            Throwable thM30463e = C7347n.m30463e(objM30460b);
            if (thM30463e == null) {
                C7347n.m30459a(objM30460b);
            } else {
                C5358a.m24693a(connection, "ROLLBACK TRANSACTION");
                throw thM30463e;
            }
        } catch (Throwable th4) {
            C7347n.Companion companion2 = C7347n.INSTANCE;
            objM30460b = C7347n.m30460b(C7348o.m30469a(th4));
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m47130g(InterfaceC5359b connection) throws Exception {
        m47131h(connection);
        m47134k(connection);
        getOpenDelegate().mo6381g(connection);
    }

    /* JADX INFO: renamed from: h */
    public final void m47131h(InterfaceC5359b connection) throws Exception {
        InterfaceC5361d interfaceC5361dMo24696r3 = connection.mo24696r3("PRAGMA busy_timeout");
        try {
            interfaceC5361dMo24696r3.mo24704g3();
            long j10 = interfaceC5361dMo24696r3.getLong(0);
            C12915a.m47941a(interfaceC5361dMo24696r3, null);
            if (j10 < 3000) {
                C5358a.m24693a(connection, "PRAGMA busy_timeout = 3000");
            }
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                C12915a.m47941a(interfaceC5361dMo24696r3, th2);
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m47132i(InterfaceC5359b connection) throws Exception {
        Object objM30460b;
        m47131h(connection);
        m47133j(connection);
        m47134k(connection);
        InterfaceC5361d interfaceC5361dMo24696r3 = connection.mo24696r3("PRAGMA user_version");
        try {
            interfaceC5361dMo24696r3.mo24704g3();
            int i10 = (int) interfaceC5361dMo24696r3.getLong(0);
            C12915a.m47941a(interfaceC5361dMo24696r3, null);
            if (i10 != getOpenDelegate().getVersion()) {
                C5358a.m24693a(connection, "BEGIN EXCLUSIVE TRANSACTION");
                try {
                    C7347n.Companion companion = C7347n.INSTANCE;
                    if (i10 == 0) {
                        m47147x(connection);
                    } else {
                        m47148y(connection, i10, getOpenDelegate().getVersion());
                    }
                    C5358a.m24693a(connection, "PRAGMA user_version = " + getOpenDelegate().getVersion());
                    objM30460b = C7347n.m30460b(Unit.f29331a);
                } catch (Throwable th2) {
                    C7347n.Companion companion2 = C7347n.INSTANCE;
                    objM30460b = C7347n.m30460b(C7348o.m30469a(th2));
                }
                if (C7347n.m30466h(objM30460b)) {
                    C5358a.m24693a(connection, "END TRANSACTION");
                }
                Throwable thM30463e = C7347n.m30463e(objM30460b);
                if (thM30463e != null) {
                    C5358a.m24693a(connection, "ROLLBACK TRANSACTION");
                    throw thM30463e;
                }
            }
            m47149z(connection);
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                C12915a.m47941a(interfaceC5361dMo24696r3, th3);
                throw th4;
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m47133j(InterfaceC5359b connection) {
        if (getConfiguration().journalMode == AbstractC12682u.d.WRITE_AHEAD_LOGGING) {
            C5358a.m24693a(connection, "PRAGMA journal_mode = WAL");
        } else {
            C5358a.m24693a(connection, "PRAGMA journal_mode = TRUNCATE");
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m47134k(InterfaceC5359b connection) {
        if (getConfiguration().journalMode == AbstractC12682u.d.WRITE_AHEAD_LOGGING) {
            C5358a.m24693a(connection, "PRAGMA synchronous = NORMAL");
        } else {
            C5358a.m24693a(connection, "PRAGMA synchronous = FULL");
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m47135l(InterfaceC5359b connection) {
        C5358a.m24693a(connection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
    }

    /* JADX INFO: renamed from: m */
    public final void m47136m(InterfaceC5359b connection) throws Exception {
        if (!getConfiguration().allowDestructiveMigrationForAllTables) {
            getOpenDelegate().mo6379b(connection);
            return;
        }
        InterfaceC5361d interfaceC5361dMo24696r3 = connection.mo24696r3("SELECT name, type FROM sqlite_master WHERE type = 'table' OR type = 'view'");
        try {
            List listM31877c = C7697o.m31877c();
            while (interfaceC5361dMo24696r3.mo24704g3()) {
                String strMo24702E2 = interfaceC5361dMo24696r3.mo24702E2(0);
                if (!C7797x.m32309T(strMo24702E2, "sqlite_", false, 2, null) && !Intrinsics.m31980c(strMo24702E2, "android_metadata")) {
                    listM31877c.add(C7352s.m30477a(strMo24702E2, Boolean.valueOf(Intrinsics.m31980c(interfaceC5361dMo24696r3.mo24702E2(1), "view"))));
                }
            }
            List<Pair> listM31875a = C7697o.m31875a(listM31877c);
            C12915a.m47941a(interfaceC5361dMo24696r3, null);
            for (Pair pair : listM31875a) {
                String str = (String) pair.m31671a();
                if (((Boolean) pair.m31672b()).booleanValue()) {
                    C5358a.m24693a(connection, "DROP VIEW IF EXISTS `" + str + '`');
                } else {
                    C5358a.m24693a(connection, "DROP TABLE IF EXISTS `" + str + '`');
                }
            }
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
    /* JADX INFO: renamed from: n */
    public abstract List<AbstractC12682u.b> mo47137n();

    @NotNull
    /* JADX INFO: renamed from: o */
    public abstract C12654c getConfiguration();

    /* JADX INFO: renamed from: p */
    public final int m47139p(@NotNull AbstractC12682u.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        int i10 = c.f44984a[dVar.ordinal()];
        if (i10 == 1) {
            return 1;
        }
        if (i10 == 2) {
            return 4;
        }
        throw new IllegalStateException(("Can't get max number of reader for journal mode '" + dVar + '\'').toString());
    }

    /* JADX INFO: renamed from: q */
    public final int m47140q(@NotNull AbstractC12682u.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        int i10 = c.f44984a[dVar.ordinal()];
        if (i10 == 1 || i10 == 2) {
            return 1;
        }
        throw new IllegalStateException(("Can't get max number of writers for journal mode '" + dVar + '\'').toString());
    }

    @NotNull
    /* JADX INFO: renamed from: r */
    public abstract AbstractC12651a0 getOpenDelegate();

    /* JADX INFO: renamed from: s */
    public final boolean m47142s(InterfaceC5359b connection) throws Exception {
        InterfaceC5361d interfaceC5361dMo24696r3 = connection.mo24696r3("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z10 = false;
            if (interfaceC5361dMo24696r3.mo24704g3() && interfaceC5361dMo24696r3.getLong(0) == 0) {
                z10 = true;
            }
            C12915a.m47941a(interfaceC5361dMo24696r3, null);
            return z10;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                C12915a.m47941a(interfaceC5361dMo24696r3, th2);
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public final boolean m47143t(InterfaceC5359b connection) throws Exception {
        InterfaceC5361d interfaceC5361dMo24696r3 = connection.mo24696r3("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name = 'room_master_table'");
        try {
            boolean z10 = false;
            if (interfaceC5361dMo24696r3.mo24704g3() && interfaceC5361dMo24696r3.getLong(0) != 0) {
                z10 = true;
            }
            C12915a.m47941a(interfaceC5361dMo24696r3, null);
            return z10;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                C12915a.m47941a(interfaceC5361dMo24696r3, th2);
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m47144u(InterfaceC5359b connection) {
        Iterator<T> it = mo47137n().iterator();
        while (it.hasNext()) {
            ((AbstractC12682u.b) it.next()).m47291a(connection);
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m47145v(InterfaceC5359b connection) {
        Iterator<T> it = mo47137n().iterator();
        while (it.hasNext()) {
            ((AbstractC12682u.b) it.next()).m47293c(connection);
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m47146w(InterfaceC5359b connection) {
        Iterator<T> it = mo47137n().iterator();
        while (it.hasNext()) {
            ((AbstractC12682u.b) it.next()).m47295e(connection);
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m47147x(@NotNull InterfaceC5359b connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        boolean zM47142s = m47142s(connection);
        getOpenDelegate().mo6378a(connection);
        if (!zM47142s) {
            AbstractC12651a0.a aVarMo6384j = getOpenDelegate().mo6384j(connection);
            if (!aVarMo6384j.isValid) {
                throw new IllegalStateException(("Pre-packaged database has an invalid schema: " + aVarMo6384j.expectedFoundMsg).toString());
            }
        }
        m47128B(connection);
        getOpenDelegate().mo6380f(connection);
        m47144u(connection);
    }

    /* JADX INFO: renamed from: y */
    public final void m47148y(@NotNull InterfaceC5359b connection, int oldVersion, int newVersion) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        List<AbstractC0072b> listM8092b = C1532h.m8092b(getConfiguration().migrationContainer, oldVersion, newVersion);
        if (listM8092b == null) {
            if (!C1532h.m8094d(getConfiguration(), oldVersion, newVersion)) {
                m47136m(connection);
                m47145v(connection);
                getOpenDelegate().mo6378a(connection);
                return;
            } else {
                throw new IllegalStateException(("A migration from " + oldVersion + " to " + newVersion + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* functions.").toString());
            }
        }
        getOpenDelegate().mo6383i(connection);
        Iterator<T> it = listM8092b.iterator();
        while (it.hasNext()) {
            ((AbstractC0072b) it.next()).mo175a(connection);
        }
        AbstractC12651a0.a aVarMo6384j = getOpenDelegate().mo6384j(connection);
        if (aVarMo6384j.isValid) {
            getOpenDelegate().mo6382h(connection);
            m47128B(connection);
        } else {
            throw new IllegalStateException(("Migration didn't properly handle: " + aVarMo6384j.expectedFoundMsg).toString());
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m47149z(@NotNull InterfaceC5359b connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        m47129f(connection);
        getOpenDelegate().mo6381g(connection);
        m47146w(connection);
        this.isConfigured = true;
    }
}
