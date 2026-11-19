package k8;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class m0 implements k8.d, l8.b, k8.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final z7.c f21180f = z7.c.b("proto");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t0 f21181a;
    public final m8.a b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m8.a f21182c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f21183d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final yt.a<String> f21184e;

    public interface b<T, U> {
        U apply(T t8);
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f21185a;
        public final String b;

        public c(String str, String str2) {
            this.f21185a = str;
            this.b = str2;
        }
    }

    public interface d<T> {
        T a();
    }

    public m0(m8.a aVar, m8.a aVar2, e eVar, t0 t0Var, yt.a<String> aVar3) {
        this.f21181a = t0Var;
        this.b = aVar;
        this.f21182c = aVar2;
        this.f21183d = eVar;
        this.f21184e = aVar3;
    }

    public static /* synthetic */ Long A(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return null;
    }

    public static /* synthetic */ Object E(Throwable th2) {
        throw new l8.a("Timed out while trying to acquire the lock.", th2);
    }

    public static byte[] F0(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    public static /* synthetic */ Object I(String str, f8.c.b bVar, long j10, SQLiteDatabase sQLiteDatabase) {
        if (((Boolean) P0(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(bVar.getNumber())}), new b() { // from class: k8.y
            @Override // k8.m0.b
            public final Object apply(Object obj) {
                return Boolean.valueOf(((Cursor) obj).getCount() > 0);
            }
        })).booleanValue()) {
            sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j10 + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(bVar.getNumber())});
            return null;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("log_source", str);
        contentValues.put("reason", Integer.valueOf(bVar.getNumber()));
        contentValues.put("events_dropped_count", Long.valueOf(j10));
        sQLiteDatabase.insert("log_event_dropped", null, contentValues);
        return null;
    }

    public static /* synthetic */ Object K(Map map, Cursor cursor) {
        while (true) {
            if (!cursor.moveToNext()) {
                return null;
            }
            long j10 = cursor.getLong(0);
            Set hashSet = (Set) map.get(Long.valueOf(j10));
            if (hashSet == null) {
                hashSet = new HashSet();
                map.put(Long.valueOf(j10), hashSet);
            }
            hashSet.add(new c(cursor.getString(1), cursor.getString(2)));
        }
    }

    public static /* synthetic */ Integer L(final m0 m0Var, long j10, SQLiteDatabase sQLiteDatabase) {
        m0Var.getClass();
        String[] strArr = {String.valueOf(j10)};
        P0(sQLiteDatabase.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr), new b() { // from class: k8.s
            @Override // k8.m0.b
            public final Object apply(Object obj) {
                return m0.m(this.f21195a, (Cursor) obj);
            }
        });
        return Integer.valueOf(sQLiteDatabase.delete("events", "timestamp_ms < ?", strArr));
    }

    public static z7.c M0(String str) {
        return str == null ? f21180f : z7.c.b(str);
    }

    public static /* synthetic */ Object N(m0 m0Var, List list, c8.o oVar, Cursor cursor) {
        m0Var.getClass();
        while (cursor.moveToNext()) {
            long j10 = cursor.getLong(0);
            boolean z10 = cursor.getInt(7) != 0;
            c8.i.a aVarK = c8.i.a().j(cursor.getString(1)).i(cursor.getLong(2)).k(cursor.getLong(3));
            if (z10) {
                aVarK.h(new c8.h(M0(cursor.getString(4)), cursor.getBlob(5)));
            } else {
                aVarK.h(new c8.h(M0(cursor.getString(4)), m0Var.I0(j10)));
            }
            if (!cursor.isNull(6)) {
                aVarK.g(Integer.valueOf(cursor.getInt(6)));
            }
            list.add(k.a(j10, oVar, aVarK.d()));
        }
        return null;
    }

    public static /* synthetic */ Object O(m0 m0Var, SQLiteDatabase sQLiteDatabase) {
        m0Var.getClass();
        sQLiteDatabase.compileStatement("DELETE FROM log_event_dropped").execute();
        sQLiteDatabase.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + m0Var.b.a()).execute();
        return null;
    }

    public static String O0(Iterable<k> iterable) {
        StringBuilder sb2 = new StringBuilder("(");
        Iterator<k> it = iterable.iterator();
        while (it.hasNext()) {
            sb2.append(it.next().c());
            if (it.hasNext()) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        return sb2.toString();
    }

    public static <T> T P0(Cursor cursor, b<Cursor, T> bVar) {
        try {
            return bVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    public static /* synthetic */ f8.a Q(final m0 m0Var, String str, final Map map, final f8.a.C0293a c0293a, SQLiteDatabase sQLiteDatabase) {
        m0Var.getClass();
        return (f8.a) P0(sQLiteDatabase.rawQuery(str, new String[0]), new b() { // from class: k8.a0
            @Override // k8.m0.b
            public final Object apply(Object obj) {
                return m0.u(this.f21161a, map, c0293a, (Cursor) obj);
            }
        });
    }

    public static /* synthetic */ Long T(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return 0L;
    }

    public static /* synthetic */ f8.f Y(final long j10, SQLiteDatabase sQLiteDatabase) {
        return (f8.f) P0(sQLiteDatabase.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]), new b() { // from class: k8.d0
            @Override // k8.m0.b
            public final Object apply(Object obj) {
                return m0.e(j10, (Cursor) obj);
            }
        });
    }

    public static /* synthetic */ f8.f e(long j10, Cursor cursor) {
        cursor.moveToNext();
        return f8.f.c().c(cursor.getLong(0)).b(j10).a();
    }

    public static /* synthetic */ List f(m0 m0Var, c8.o oVar, SQLiteDatabase sQLiteDatabase) {
        List<k> listA0 = m0Var.A0(sQLiteDatabase, oVar, m0Var.f21183d.d());
        for (z7.e eVar : z7.e.values()) {
            if (eVar != oVar.d()) {
                int iD = m0Var.f21183d.d() - listA0.size();
                if (iD <= 0) {
                    break;
                }
                listA0.addAll(m0Var.A0(sQLiteDatabase, oVar.f(eVar), iD));
            }
        }
        return m0Var.z0(listA0, m0Var.E0(sQLiteDatabase, listA0));
    }

    public static /* synthetic */ List g(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            arrayList.add(c8.o.a().b(cursor.getString(1)).d(n8.a.b(cursor.getInt(2))).c(F0(cursor.getString(3))).a());
        }
        return arrayList;
    }

    public static /* synthetic */ Object h(m0 m0Var, Cursor cursor) {
        m0Var.getClass();
        while (cursor.moveToNext()) {
            m0Var.d(cursor.getInt(0), f8.c.b.MAX_RETRIES_REACHED, cursor.getString(1));
        }
        return null;
    }

    public static /* synthetic */ SQLiteDatabase k(Throwable th2) {
        throw new l8.a("Timed out while trying to open db.", th2);
    }

    public static /* synthetic */ Object m(m0 m0Var, Cursor cursor) {
        m0Var.getClass();
        while (cursor.moveToNext()) {
            m0Var.d(cursor.getInt(0), f8.c.b.MESSAGE_TOO_OLD, cursor.getString(1));
        }
        return null;
    }

    public static /* synthetic */ Object n(final m0 m0Var, String str, String str2, SQLiteDatabase sQLiteDatabase) {
        m0Var.getClass();
        sQLiteDatabase.compileStatement(str).execute();
        P0(sQLiteDatabase.rawQuery(str2, null), new b() { // from class: k8.v
            @Override // k8.m0.b
            public final Object apply(Object obj) {
                return m0.h(this.f21210a, (Cursor) obj);
            }
        });
        sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
        return null;
    }

    public static /* synthetic */ Boolean o(m0 m0Var, c8.o oVar, SQLiteDatabase sQLiteDatabase) {
        Long lS0 = m0Var.s0(sQLiteDatabase, oVar);
        return lS0 == null ? Boolean.FALSE : (Boolean) P0(m0Var.f0().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lS0.toString()}), new b() { // from class: k8.u
            @Override // k8.m0.b
            public final Object apply(Object obj) {
                return Boolean.valueOf(((Cursor) obj).moveToNext());
            }
        });
    }

    public static /* synthetic */ Object p(long j10, c8.o oVar, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(j10));
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{oVar.b(), String.valueOf(n8.a.a(oVar.d()))}) < 1) {
            contentValues.put("backend_name", oVar.b());
            contentValues.put("priority", Integer.valueOf(n8.a.a(oVar.d())));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    public static /* synthetic */ byte[] r(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        int length = 0;
        while (cursor.moveToNext()) {
            byte[] blob = cursor.getBlob(0);
            arrayList.add(blob);
            length += blob.length;
        }
        byte[] bArr = new byte[length];
        int length2 = 0;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            byte[] bArr2 = (byte[]) arrayList.get(i10);
            System.arraycopy(bArr2, 0, bArr, length2, bArr2.length);
            length2 += bArr2.length;
        }
        return bArr;
    }

    public static /* synthetic */ List s(SQLiteDatabase sQLiteDatabase) {
        return (List) P0(sQLiteDatabase.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), new b() { // from class: k8.k0
            @Override // k8.m0.b
            public final Object apply(Object obj) {
                return m0.g((Cursor) obj);
            }
        });
    }

    public static /* synthetic */ f8.a u(m0 m0Var, Map map, f8.a.C0293a c0293a, Cursor cursor) {
        m0Var.getClass();
        while (cursor.moveToNext()) {
            String string = cursor.getString(0);
            f8.c.b bVarB0 = m0Var.b0(cursor.getInt(1));
            long j10 = cursor.getLong(2);
            if (!map.containsKey(string)) {
                map.put(string, new ArrayList());
            }
            ((List) map.get(string)).add(f8.c.c().c(bVarB0).b(j10).a());
        }
        m0Var.G0(c0293a, map);
        c0293a.e(m0Var.n0());
        c0293a.d(m0Var.h0());
        c0293a.c(m0Var.f21184e.get());
        return c0293a.b();
    }

    public static /* synthetic */ Long y(m0 m0Var, c8.i iVar, c8.o oVar, SQLiteDatabase sQLiteDatabase) {
        if (m0Var.x0()) {
            m0Var.d(1L, f8.c.b.CACHE_FULL, iVar.j());
            return -1L;
        }
        long jD0 = m0Var.d0(sQLiteDatabase, oVar);
        int iE = m0Var.f21183d.e();
        byte[] bArrA = iVar.e().a();
        boolean z10 = bArrA.length <= iE;
        ContentValues contentValues = new ContentValues();
        contentValues.put("context_id", Long.valueOf(jD0));
        contentValues.put("transport_name", iVar.j());
        contentValues.put("timestamp_ms", Long.valueOf(iVar.f()));
        contentValues.put("uptime_ms", Long.valueOf(iVar.k()));
        contentValues.put("payload_encoding", iVar.e().b().a());
        contentValues.put("code", iVar.d());
        contentValues.put("num_attempts", (Integer) 0);
        contentValues.put("inline", Boolean.valueOf(z10));
        contentValues.put("payload", z10 ? bArrA : new byte[0]);
        long jInsert = sQLiteDatabase.insert("events", null, contentValues);
        if (!z10) {
            int iCeil = (int) Math.ceil(((double) bArrA.length) / ((double) iE));
            for (int i10 = 1; i10 <= iCeil; i10++) {
                byte[] bArrCopyOfRange = Arrays.copyOfRange(bArrA, (i10 - 1) * iE, Math.min(i10 * iE, bArrA.length));
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("event_id", Long.valueOf(jInsert));
                contentValues2.put("sequence_num", Integer.valueOf(i10));
                contentValues2.put("bytes", bArrCopyOfRange);
                sQLiteDatabase.insert("event_payloads", null, contentValues2);
            }
        }
        for (Map.Entry<String, String> entry : iVar.i().entrySet()) {
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put("event_id", Long.valueOf(jInsert));
            contentValues3.put("name", entry.getKey());
            contentValues3.put("value", entry.getValue());
            sQLiteDatabase.insert("event_metadata", null, contentValues3);
        }
        return Long.valueOf(jInsert);
    }

    public static /* synthetic */ Object z(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.beginTransaction();
        return null;
    }

    public final List<k> A0(SQLiteDatabase sQLiteDatabase, final c8.o oVar, int i10) {
        final ArrayList arrayList = new ArrayList();
        Long lS0 = s0(sQLiteDatabase, oVar);
        if (lS0 == null) {
            return arrayList;
        }
        P0(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{lS0.toString()}, null, null, null, String.valueOf(i10)), new b() { // from class: k8.x
            @Override // k8.m0.b
            public final Object apply(Object obj) {
                return m0.N(this.f21211a, arrayList, oVar, (Cursor) obj);
            }
        });
        return arrayList;
    }

    public final Map<Long, Set<c>> E0(SQLiteDatabase sQLiteDatabase, List<k> list) {
        final HashMap map = new HashMap();
        StringBuilder sb2 = new StringBuilder("event_id IN (");
        for (int i10 = 0; i10 < list.size(); i10++) {
            sb2.append(list.get(i10).c());
            if (i10 < list.size() - 1) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        P0(sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb2.toString(), null, null, null, null), new b() { // from class: k8.z
            @Override // k8.m0.b
            public final Object apply(Object obj) {
                return m0.K(map, (Cursor) obj);
            }
        });
        return map;
    }

    public final void G0(f8.a.C0293a c0293a, Map<String, List<f8.c>> map) {
        for (Map.Entry<String, List<f8.c>> entry : map.entrySet()) {
            c0293a.a(f8.d.c().c(entry.getKey()).b(entry.getValue()).a());
        }
    }

    public final byte[] I0(long j10) {
        return (byte[]) P0(f0().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j10)}, null, null, "sequence_num"), new b() { // from class: k8.b0
            @Override // k8.m0.b
            public final Object apply(Object obj) {
                return m0.r((Cursor) obj);
            }
        });
    }

    public final <T> T K0(d<T> dVar, b<Throwable, T> bVar) {
        long jA = this.f21182c.a();
        while (true) {
            try {
                return dVar.a();
            } catch (SQLiteDatabaseLockedException e10) {
                if (this.f21182c.a() >= ((long) this.f21183d.b()) + jA) {
                    return bVar.apply(e10);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    @Override // k8.d
    public void M(Iterable<k> iterable) {
        if (iterable.iterator().hasNext()) {
            f0().compileStatement("DELETE FROM events WHERE _id in " + O0(iterable)).execute();
        }
    }

    @Override // k8.d
    public k S1(final c8.o oVar, final c8.i iVar) {
        g8.a.b("SQLiteEventStore", "Storing event with priority=%s, name=%s for destination %s", oVar.d(), iVar.j(), oVar.b());
        long jLongValue = ((Long) w0(new b() { // from class: k8.i0
            @Override // k8.m0.b
            public final Object apply(Object obj) {
                return m0.y(this.f21172a, iVar, oVar, (SQLiteDatabase) obj);
            }
        })).longValue();
        if (jLongValue < 1) {
            return null;
        }
        return k.a(jLongValue, oVar, iVar);
    }

    @Override // k8.c
    public void a() {
        w0(new b() { // from class: k8.q
            @Override // k8.m0.b
            public final Object apply(Object obj) {
                return m0.O(this.f21192a, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // l8.b
    public <T> T b(l8.b.a<T> aVar) {
        SQLiteDatabase sQLiteDatabaseF0 = f0();
        c0(sQLiteDatabaseF0);
        try {
            T tJ = aVar.j();
            sQLiteDatabaseF0.setTransactionSuccessful();
            return tJ;
        } finally {
            sQLiteDatabaseF0.endTransaction();
        }
    }

    public final f8.c.b b0(int i10) {
        f8.c.b bVar = f8.c.b.REASON_UNKNOWN;
        if (i10 == bVar.getNumber()) {
            return bVar;
        }
        f8.c.b bVar2 = f8.c.b.MESSAGE_TOO_OLD;
        if (i10 == bVar2.getNumber()) {
            return bVar2;
        }
        f8.c.b bVar3 = f8.c.b.CACHE_FULL;
        if (i10 == bVar3.getNumber()) {
            return bVar3;
        }
        f8.c.b bVar4 = f8.c.b.PAYLOAD_TOO_BIG;
        if (i10 == bVar4.getNumber()) {
            return bVar4;
        }
        f8.c.b bVar5 = f8.c.b.MAX_RETRIES_REACHED;
        if (i10 == bVar5.getNumber()) {
            return bVar5;
        }
        f8.c.b bVar6 = f8.c.b.INVALID_PAYLOD;
        if (i10 == bVar6.getNumber()) {
            return bVar6;
        }
        f8.c.b bVar7 = f8.c.b.SERVER_ERROR;
        if (i10 == bVar7.getNumber()) {
            return bVar7;
        }
        g8.a.a("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i10));
        return bVar;
    }

    @Override // k8.c
    public f8.a c() {
        final f8.a.C0293a c0293aE = f8.a.e();
        final HashMap map = new HashMap();
        final String str = "SELECT log_source, reason, events_dropped_count FROM log_event_dropped";
        return (f8.a) w0(new b() { // from class: k8.t
            @Override // k8.m0.b
            public final Object apply(Object obj) {
                return m0.Q(this.f21196a, str, map, c0293aE, (SQLiteDatabase) obj);
            }
        });
    }

    public final void c0(final SQLiteDatabase sQLiteDatabase) {
        K0(new d() { // from class: k8.l
            @Override // k8.m0.d
            public final Object a() {
                return m0.z(sQLiteDatabase);
            }
        }, new b() { // from class: k8.w
            @Override // k8.m0.b
            public final Object apply(Object obj) {
                return m0.E((Throwable) obj);
            }
        });
    }

    @Override // k8.d
    public int cleanUp() {
        final long jA = this.b.a() - this.f21183d.c();
        return ((Integer) w0(new b() { // from class: k8.j0
            @Override // k8.m0.b
            public final Object apply(Object obj) {
                return m0.L(this.f21175a, jA, (SQLiteDatabase) obj);
            }
        })).intValue();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f21181a.close();
    }

    @Override // k8.c
    public void d(final long j10, final f8.c.b bVar, final String str) {
        w0(new b() { // from class: k8.r
            @Override // k8.m0.b
            public final Object apply(Object obj) {
                return m0.I(str, bVar, j10, (SQLiteDatabase) obj);
            }
        });
    }

    public final long d0(SQLiteDatabase sQLiteDatabase, c8.o oVar) {
        Long lS0 = s0(sQLiteDatabase, oVar);
        if (lS0 != null) {
            return lS0.longValue();
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("backend_name", oVar.b());
        contentValues.put("priority", Integer.valueOf(n8.a.a(oVar.d())));
        contentValues.put("next_request_ms", (Integer) 0);
        if (oVar.c() != null) {
            contentValues.put("extras", Base64.encodeToString(oVar.c(), 0));
        }
        return sQLiteDatabase.insert("transport_contexts", null, contentValues);
    }

    public long e0() {
        return i0() * k0();
    }

    public SQLiteDatabase f0() {
        final t0 t0Var = this.f21181a;
        Objects.requireNonNull(t0Var);
        return (SQLiteDatabase) K0(new d() { // from class: k8.e0
            @Override // k8.m0.d
            public final Object a() {
                return t0Var.getWritableDatabase();
            }
        }, new b() { // from class: k8.f0
            @Override // k8.m0.b
            public final Object apply(Object obj) {
                return m0.k((Throwable) obj);
            }
        });
    }

    public final f8.b h0() {
        return f8.b.b().b(f8.e.c().b(e0()).c(e.f21167a.f()).a()).a();
    }

    public final long i0() {
        return f0().compileStatement("PRAGMA page_count").simpleQueryForLong();
    }

    @Override // k8.d
    public Iterable<c8.o> j0() {
        return (Iterable) w0(new b() { // from class: k8.g0
            @Override // k8.m0.b
            public final Object apply(Object obj) {
                return m0.s((SQLiteDatabase) obj);
            }
        });
    }

    public final long k0() {
        return f0().compileStatement("PRAGMA page_size").simpleQueryForLong();
    }

    @Override // k8.d
    public void k2(final c8.o oVar, final long j10) {
        w0(new b() { // from class: k8.p
            @Override // k8.m0.b
            public final Object apply(Object obj) {
                return m0.p(j10, oVar, (SQLiteDatabase) obj);
            }
        });
    }

    public final f8.f n0() {
        final long jA = this.b.a();
        return (f8.f) w0(new b() { // from class: k8.c0
            @Override // k8.m0.b
            public final Object apply(Object obj) {
                return m0.Y(jA, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // k8.d
    public boolean o2(final c8.o oVar) {
        return ((Boolean) w0(new b() { // from class: k8.o
            @Override // k8.m0.b
            public final Object apply(Object obj) {
                return m0.o(this.f21190a, oVar, (SQLiteDatabase) obj);
            }
        })).booleanValue();
    }

    @Override // k8.d
    public Iterable<k> q1(final c8.o oVar) {
        return (Iterable) w0(new b() { // from class: k8.m
            @Override // k8.m0.b
            public final Object apply(Object obj) {
                return m0.f(this.f21179a, oVar, (SQLiteDatabase) obj);
            }
        });
    }

    public final Long s0(SQLiteDatabase sQLiteDatabase, c8.o oVar) {
        StringBuilder sb2 = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(oVar.b(), String.valueOf(n8.a.a(oVar.d()))));
        if (oVar.c() != null) {
            sb2.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(oVar.c(), 0));
        } else {
            sb2.append(" and extras is null");
        }
        return (Long) P0(sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb2.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null), new b() { // from class: k8.n
            @Override // k8.m0.b
            public final Object apply(Object obj) {
                return m0.A((Cursor) obj);
            }
        });
    }

    @Override // k8.d
    public void t1(Iterable<k> iterable) {
        if (iterable.iterator().hasNext()) {
            final String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + O0(iterable);
            final String str2 = "SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name";
            w0(new b() { // from class: k8.l0
                @Override // k8.m0.b
                public final Object apply(Object obj) {
                    return m0.n(this.f21177a, str, str2, (SQLiteDatabase) obj);
                }
            });
        }
    }

    public <T> T w0(b<SQLiteDatabase, T> bVar) {
        SQLiteDatabase sQLiteDatabaseF0 = f0();
        sQLiteDatabaseF0.beginTransaction();
        try {
            T tApply = bVar.apply(sQLiteDatabaseF0);
            sQLiteDatabaseF0.setTransactionSuccessful();
            return tApply;
        } finally {
            sQLiteDatabaseF0.endTransaction();
        }
    }

    public final boolean x0() {
        return i0() * k0() >= this.f21183d.f();
    }

    @Override // k8.d
    public long y0(c8.o oVar) {
        return ((Long) P0(f0().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{oVar.b(), String.valueOf(n8.a.a(oVar.d()))}), new b() { // from class: k8.h0
            @Override // k8.m0.b
            public final Object apply(Object obj) {
                return m0.T((Cursor) obj);
            }
        })).longValue();
    }

    public final List<k> z0(List<k> list, Map<Long, Set<c>> map) {
        ListIterator<k> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            k next = listIterator.next();
            if (map.containsKey(Long.valueOf(next.c()))) {
                c8.i.a aVarL = next.b().l();
                for (c cVar : map.get(Long.valueOf(next.c()))) {
                    aVarL.c(cVar.f21185a, cVar.b);
                }
                listIterator.set(k.a(next.c(), next.d(), aVarL.d()));
            }
        }
        return list;
    }
}
