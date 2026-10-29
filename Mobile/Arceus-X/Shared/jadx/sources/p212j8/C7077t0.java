package p212j8;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: j8.t0 */
/* JADX INFO: loaded from: classes.dex */
public final class C7077t0 extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: c */
    public static final String f27663c = "INSERT INTO global_log_event_state VALUES (" + System.currentTimeMillis() + ")";

    /* JADX INFO: renamed from: d */
    public static int f27664d = 5;

    /* JADX INFO: renamed from: e */
    public static final a f27665e;

    /* JADX INFO: renamed from: f */
    public static final a f27666f;

    /* JADX INFO: renamed from: g */
    public static final a f27667g;

    /* JADX INFO: renamed from: h */
    public static final a f27668h;

    /* JADX INFO: renamed from: i */
    public static final a f27669i;

    /* JADX INFO: renamed from: j */
    public static final List<a> f27670j;

    /* JADX INFO: renamed from: a */
    public final int f27671a;

    /* JADX INFO: renamed from: b */
    public boolean f27672b;

    /* JADX INFO: renamed from: j8.t0$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo29833a(SQLiteDatabase sQLiteDatabase);
    }

    static {
        a aVar = new a() { // from class: j8.o0
            @Override // p212j8.C7077t0.a
            /* JADX INFO: renamed from: a */
            public final void mo29833a(SQLiteDatabase sQLiteDatabase) {
                C7077t0.m29834a(sQLiteDatabase);
            }
        };
        f27665e = aVar;
        a aVar2 = new a() { // from class: j8.p0
            @Override // p212j8.C7077t0.a
            /* JADX INFO: renamed from: a */
            public final void mo29833a(SQLiteDatabase sQLiteDatabase) {
                C7077t0.m29837d(sQLiteDatabase);
            }
        };
        f27666f = aVar2;
        a aVar3 = new a() { // from class: j8.q0
            @Override // p212j8.C7077t0.a
            /* JADX INFO: renamed from: a */
            public final void mo29833a(SQLiteDatabase sQLiteDatabase) {
                sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
            }
        };
        f27667g = aVar3;
        a aVar4 = new a() { // from class: j8.r0
            @Override // p212j8.C7077t0.a
            /* JADX INFO: renamed from: a */
            public final void mo29833a(SQLiteDatabase sQLiteDatabase) {
                C7077t0.m29838e(sQLiteDatabase);
            }
        };
        f27668h = aVar4;
        a aVar5 = new a() { // from class: j8.s0
            @Override // p212j8.C7077t0.a
            /* JADX INFO: renamed from: a */
            public final void mo29833a(SQLiteDatabase sQLiteDatabase) {
                C7077t0.m29836c(sQLiteDatabase);
            }
        };
        f27669i = aVar5;
        f27670j = Arrays.asList(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public C7077t0(Context context, String str, int i10) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i10);
        this.f27672b = false;
        this.f27671a = i10;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m29834a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY, context_id INTEGER NOT NULL, transport_name TEXT NOT NULL, timestamp_ms INTEGER NOT NULL, uptime_ms INTEGER NOT NULL, payload BLOB NOT NULL, code INTEGER, num_attempts INTEGER NOT NULL,FOREIGN KEY (context_id) REFERENCES transport_contexts(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE event_metadata (_id INTEGER PRIMARY KEY, event_id INTEGER NOT NULL, name TEXT NOT NULL, value TEXT NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE transport_contexts (_id INTEGER PRIMARY KEY, backend_name TEXT NOT NULL, priority INTEGER NOT NULL, next_request_ms INTEGER NOT NULL)");
        sQLiteDatabase.execSQL("CREATE INDEX events_backend_id on events(context_id)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority on transport_contexts(backend_name, priority)");
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m29836c(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        sQLiteDatabase.execSQL("CREATE TABLE log_event_dropped (log_source VARCHAR(45) NOT NULL,reason INTEGER NOT NULL,events_dropped_count BIGINT NOT NULL,PRIMARY KEY(log_source, reason))");
        sQLiteDatabase.execSQL("CREATE TABLE global_log_event_state (last_metrics_upload_ms BIGINT PRIMARY KEY)");
        sQLiteDatabase.execSQL(f27663c);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m29837d(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE transport_contexts ADD COLUMN extras BLOB");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority_extras on transport_contexts(backend_name, priority, extras)");
        sQLiteDatabase.execSQL("DROP INDEX contexts_backend_priority");
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m29838e(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN inline BOOLEAN NOT NULL DEFAULT 1");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("CREATE TABLE event_payloads (sequence_num INTEGER NOT NULL, event_id INTEGER NOT NULL, bytes BLOB NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE,PRIMARY KEY (sequence_num, event_id))");
    }

    /* JADX INFO: renamed from: f */
    public final void m29839f(SQLiteDatabase sQLiteDatabase) {
        if (this.f27672b) {
            return;
        }
        onConfigure(sQLiteDatabase);
    }

    /* JADX INFO: renamed from: g */
    public final void m29840g(SQLiteDatabase sQLiteDatabase, int i10) {
        m29839f(sQLiteDatabase);
        m29841h(sQLiteDatabase, 0, i10);
    }

    /* JADX INFO: renamed from: h */
    public final void m29841h(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        List<a> list = f27670j;
        if (i11 <= list.size()) {
            while (i10 < i11) {
                f27670j.get(i10).mo29833a(sQLiteDatabase);
                i10++;
            }
            return;
        }
        throw new IllegalArgumentException("Migration from " + i10 + " to " + i11 + " was requested, but cannot be performed. Only " + list.size() + " migrations are provided");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.f27672b = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        m29840g(sQLiteDatabase, this.f27671a);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        sQLiteDatabase.execSQL("DROP TABLE events");
        sQLiteDatabase.execSQL("DROP TABLE event_metadata");
        sQLiteDatabase.execSQL("DROP TABLE transport_contexts");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        m29840g(sQLiteDatabase, i11);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        m29839f(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        m29839f(sQLiteDatabase);
        m29841h(sQLiteDatabase, i10, i11);
    }
}
