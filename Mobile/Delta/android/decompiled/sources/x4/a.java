package x4;

import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u0000 92\u00020\u0001:\u0002*'B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\bJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\bJ\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\bJ\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\bJ\u0017\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\bJ\u0017\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u000fJ\u0017\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0015\u0010\bJ\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\bJ\u0017\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0017\u0010\bJ\u0017\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018H\u0010¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0004¢\u0006\u0004\b\u001c\u0010\bJ'\u0010 \u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001dH\u0004¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0004¢\u0006\u0004\b\"\u0010\bJ\u0013\u0010$\u001a\u00020\u001d*\u00020#H\u0004¢\u0006\u0004\b$\u0010%J\u0013\u0010&\u001a\u00020\u001d*\u00020#H\u0004¢\u0006\u0004\b&\u0010%R\u0016\u0010)\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010+\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010(R\u0014\u0010/\u001a\u00020,8$X¤\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0014\u00103\u001a\u0002008$X¤\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u001a\u00108\u001a\b\u0012\u0004\u0012\u000205048$X¤\u0004¢\u0006\u0006\u001a\u0004\b6\u00107¨\u0006:"}, d2 = {"Lx4/a;", "", "<init>", "()V", "Lf5/b;", "connection", "", "i", "(Lf5/b;)V", "g", "j", "k", "h", "", "s", "(Lf5/b;)Z", "B", "l", "m", "f", "t", "u", "v", "w", "", "fileName", "A", "(Ljava/lang/String;)Ljava/lang/String;", "x", "", "oldVersion", "newVersion", "y", "(Lf5/b;II)V", "z", "Lx4/u$d;", "p", "(Lx4/u$d;)I", "q", "a", "Z", "isConfigured", "b", "isInitializing", "Lx4/c;", "o", "()Lx4/c;", "configuration", "Lx4/a0;", "r", "()Lx4/a0;", "openDelegate", "", "Lx4/u$b;", "n", "()Ljava/util/List;", "callbacks", "c", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public boolean isConfigured;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public boolean isInitializing;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0084\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\tR\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lx4/a$b;", "Lf5/c;", "actual", "<init>", "(Lx4/a;Lf5/c;)V", "", "fileName", "Lf5/b;", "a", "(Ljava/lang/String;)Lf5/b;", "filename", "d", "Lf5/c;", "", "b", "()Z", "hasConnectionPool", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class b implements f5.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final f5.c actual;
        public final /* synthetic */ a b;

        /* JADX INFO: renamed from: x4.a$b$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class C0637a implements Function1 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f34703a;

            public C0637a(String str) {
                this.f34703a = str;
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Void invoke(Throwable error) {
                Intrinsics.checkNotNullParameter(error, "error");
                throw new IllegalStateException("Unable to open database '" + this.f34703a + "'. Was a proper path / name used in Room's database builder?", error);
            }
        }

        public b(@NotNull a aVar, f5.c actual) {
            Intrinsics.checkNotNullParameter(actual, "actual");
            this.b = aVar;
            this.actual = actual;
        }

        public static final f5.b e(a aVar, b bVar, String str) throws Exception {
            if (aVar.isInitializing) {
                throw new IllegalStateException("Recursive database initialization detected. Did you try to use the database instance during initialization? Maybe in one of the callbacks?");
            }
            f5.b bVarA = bVar.actual.a(str);
            if (aVar.isConfigured) {
                aVar.g(bVarA);
                return bVarA;
            }
            try {
                aVar.isInitializing = true;
                aVar.i(bVarA);
                return bVarA;
            } finally {
                aVar.isInitializing = false;
            }
        }

        @Override // f5.c
        @NotNull
        public f5.b a(@NotNull String fileName) {
            Intrinsics.checkNotNullParameter(fileName, "fileName");
            return d(this.b.A(fileName));
        }

        @Override // f5.c
        public boolean b() {
            return this.actual.b();
        }

        public final f5.b d(final String filename) {
            y4.b bVar = new y4.b(filename, (this.b.isConfigured || this.b.isInitializing || Intrinsics.c(filename, ":memory:")) ? false : true);
            final a aVar = this.b;
            return (f5.b) bVar.b(new Function0() { // from class: x4.b
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return a.b.e(aVar, this, filename);
                }
            }, new C0637a(filename));
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f34704a;

        static {
            int[] iArr = new int[u.d.values().length];
            try {
                iArr[u.d.TRUNCATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[u.d.WRITE_AHEAD_LOGGING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f34704a = iArr;
        }
    }

    @NotNull
    public abstract String A(@NotNull String fileName);

    public final void B(f5.b connection) {
        l(connection);
        f5.a.a(connection, z.a(getOpenDelegate().getIdentityHash()));
    }

    public final void f(f5.b connection) throws Exception {
        Object objB;
        if (t(connection)) {
            f5.d dVarR3 = connection.r3("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1");
            try {
                String strE2 = dVarR3.g3() ? dVarR3.E2(0) : null;
                xt.a.a(dVarR3, null);
                if (Intrinsics.c(getOpenDelegate().getIdentityHash(), strE2) || Intrinsics.c(getOpenDelegate().getLegacyIdentityHash(), strE2)) {
                    return;
                }
                throw new IllegalStateException(("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: " + getOpenDelegate().getIdentityHash() + ", found: " + strE2).toString());
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    xt.a.a(dVarR3, th2);
                    throw th3;
                }
            }
        }
        f5.a.a(connection, "BEGIN EXCLUSIVE TRANSACTION");
        try {
            jt.n.Companion companion = jt.n.INSTANCE;
            a0.a aVarJ = getOpenDelegate().j(connection);
            if (!aVarJ.isValid) {
                throw new IllegalStateException(("Pre-packaged database has an invalid schema: " + aVarJ.expectedFoundMsg).toString());
            }
            getOpenDelegate().h(connection);
            B(connection);
            objB = jt.n.b(Unit.f22483a);
            if (jt.n.h(objB)) {
                f5.a.a(connection, "END TRANSACTION");
            }
            Throwable thE = jt.n.e(objB);
            if (thE == null) {
                jt.n.a(objB);
            } else {
                f5.a.a(connection, "ROLLBACK TRANSACTION");
                throw thE;
            }
        } catch (Throwable th4) {
            jt.n.Companion companion2 = jt.n.INSTANCE;
            objB = jt.n.b(jt.o.a(th4));
        }
    }

    public final void g(f5.b connection) throws Exception {
        h(connection);
        k(connection);
        getOpenDelegate().g(connection);
    }

    public final void h(f5.b connection) throws Exception {
        f5.d dVarR3 = connection.r3("PRAGMA busy_timeout");
        try {
            dVarR3.g3();
            long j10 = dVarR3.getLong(0);
            xt.a.a(dVarR3, null);
            if (j10 < 3000) {
                f5.a.a(connection, "PRAGMA busy_timeout = 3000");
            }
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                xt.a.a(dVarR3, th2);
                throw th3;
            }
        }
    }

    public final void i(f5.b connection) throws Exception {
        Object objB;
        h(connection);
        j(connection);
        k(connection);
        f5.d dVarR3 = connection.r3("PRAGMA user_version");
        try {
            dVarR3.g3();
            int i10 = (int) dVarR3.getLong(0);
            xt.a.a(dVarR3, null);
            if (i10 != getOpenDelegate().getVersion()) {
                f5.a.a(connection, "BEGIN EXCLUSIVE TRANSACTION");
                try {
                    jt.n.Companion companion = jt.n.INSTANCE;
                    if (i10 == 0) {
                        x(connection);
                    } else {
                        y(connection, i10, getOpenDelegate().getVersion());
                    }
                    f5.a.a(connection, "PRAGMA user_version = " + getOpenDelegate().getVersion());
                    objB = jt.n.b(Unit.f22483a);
                } catch (Throwable th2) {
                    jt.n.Companion companion2 = jt.n.INSTANCE;
                    objB = jt.n.b(jt.o.a(th2));
                }
                if (jt.n.h(objB)) {
                    f5.a.a(connection, "END TRANSACTION");
                }
                Throwable thE = jt.n.e(objB);
                if (thE != null) {
                    f5.a.a(connection, "ROLLBACK TRANSACTION");
                    throw thE;
                }
            }
            z(connection);
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                xt.a.a(dVarR3, th3);
                throw th4;
            }
        }
    }

    public final void j(f5.b connection) {
        if (getConfiguration().journalMode == u.d.WRITE_AHEAD_LOGGING) {
            f5.a.a(connection, "PRAGMA journal_mode = WAL");
        } else {
            f5.a.a(connection, "PRAGMA journal_mode = TRUNCATE");
        }
    }

    public final void k(f5.b connection) {
        if (getConfiguration().journalMode == u.d.WRITE_AHEAD_LOGGING) {
            f5.a.a(connection, "PRAGMA synchronous = NORMAL");
        } else {
            f5.a.a(connection, "PRAGMA synchronous = FULL");
        }
    }

    public final void l(f5.b connection) {
        f5.a.a(connection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
    }

    public final void m(f5.b connection) throws Exception {
        if (!getConfiguration().allowDestructiveMigrationForAllTables) {
            getOpenDelegate().b(connection);
            return;
        }
        f5.d dVarR3 = connection.r3("SELECT name, type FROM sqlite_master WHERE type = 'table' OR type = 'view'");
        try {
            List listC = kotlin.collections.o.c();
            while (dVarR3.g3()) {
                String strE2 = dVarR3.E2(0);
                if (!kotlin.text.x.T(strE2, "sqlite_", false, 2, null) && !Intrinsics.c(strE2, "android_metadata")) {
                    listC.add(jt.s.a(strE2, Boolean.valueOf(Intrinsics.c(dVarR3.E2(1), "view"))));
                }
            }
            List<Pair> listA = kotlin.collections.o.a(listC);
            xt.a.a(dVarR3, null);
            for (Pair pair : listA) {
                String str = (String) pair.a();
                if (((Boolean) pair.b()).booleanValue()) {
                    f5.a.a(connection, "DROP VIEW IF EXISTS `" + str + '`');
                } else {
                    f5.a.a(connection, "DROP TABLE IF EXISTS `" + str + '`');
                }
            }
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                xt.a.a(dVarR3, th2);
                throw th3;
            }
        }
    }

    @NotNull
    public abstract List<u.b> n();

    @NotNull
    /* JADX INFO: renamed from: o */
    public abstract x4.c getConfiguration();

    public final int p(@NotNull u.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        int i10 = c.f34704a[dVar.ordinal()];
        if (i10 == 1) {
            return 1;
        }
        if (i10 == 2) {
            return 4;
        }
        throw new IllegalStateException(("Can't get max number of reader for journal mode '" + dVar + '\'').toString());
    }

    public final int q(@NotNull u.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        int i10 = c.f34704a[dVar.ordinal()];
        if (i10 == 1 || i10 == 2) {
            return 1;
        }
        throw new IllegalStateException(("Can't get max number of writers for journal mode '" + dVar + '\'').toString());
    }

    @NotNull
    /* JADX INFO: renamed from: r */
    public abstract a0 getOpenDelegate();

    public final boolean s(f5.b connection) throws Exception {
        f5.d dVarR3 = connection.r3("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z10 = false;
            if (dVarR3.g3() && dVarR3.getLong(0) == 0) {
                z10 = true;
            }
            xt.a.a(dVarR3, null);
            return z10;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                xt.a.a(dVarR3, th2);
                throw th3;
            }
        }
    }

    public final boolean t(f5.b connection) throws Exception {
        f5.d dVarR3 = connection.r3("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name = 'room_master_table'");
        try {
            boolean z10 = false;
            if (dVarR3.g3() && dVarR3.getLong(0) != 0) {
                z10 = true;
            }
            xt.a.a(dVarR3, null);
            return z10;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                xt.a.a(dVarR3, th2);
                throw th3;
            }
        }
    }

    public final void u(f5.b connection) {
        Iterator<T> it = n().iterator();
        while (it.hasNext()) {
            ((u.b) it.next()).a(connection);
        }
    }

    public final void v(f5.b connection) {
        Iterator<T> it = n().iterator();
        while (it.hasNext()) {
            ((u.b) it.next()).c(connection);
        }
    }

    public final void w(f5.b connection) {
        Iterator<T> it = n().iterator();
        while (it.hasNext()) {
            ((u.b) it.next()).e(connection);
        }
    }

    public final void x(@NotNull f5.b connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        boolean zS = s(connection);
        getOpenDelegate().a(connection);
        if (!zS) {
            a0.a aVarJ = getOpenDelegate().j(connection);
            if (!aVarJ.isValid) {
                throw new IllegalStateException(("Pre-packaged database has an invalid schema: " + aVarJ.expectedFoundMsg).toString());
            }
        }
        B(connection);
        getOpenDelegate().f(connection);
        u(connection);
    }

    public final void y(@NotNull f5.b connection, int oldVersion, int newVersion) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        List<a5.b> listB = c5.h.b(getConfiguration().migrationContainer, oldVersion, newVersion);
        if (listB == null) {
            if (!c5.h.d(getConfiguration(), oldVersion, newVersion)) {
                m(connection);
                v(connection);
                getOpenDelegate().a(connection);
                return;
            } else {
                throw new IllegalStateException(("A migration from " + oldVersion + " to " + newVersion + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* functions.").toString());
            }
        }
        getOpenDelegate().i(connection);
        Iterator<T> it = listB.iterator();
        while (it.hasNext()) {
            ((a5.b) it.next()).a(connection);
        }
        a0.a aVarJ = getOpenDelegate().j(connection);
        if (aVarJ.isValid) {
            getOpenDelegate().h(connection);
            B(connection);
        } else {
            throw new IllegalStateException(("Migration didn't properly handle: " + aVarJ.expectedFoundMsg).toString());
        }
    }

    public final void z(@NotNull f5.b connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        f(connection);
        getOpenDelegate().g(connection);
        w(connection);
        this.isConfigured = true;
    }
}
