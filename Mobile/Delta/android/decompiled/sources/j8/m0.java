package j8;

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
public class m0 implements j8.d, k8.b, j8.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final y7.c f21132f = y7.c.b("proto");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t0 f21133a;
    public final l8.a b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l8.a f21134c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f21135d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ht.a<String> f21136e;

    public interface b<T, U> {
        U apply(T t8);
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f21137a;
        public final String b;

        public c(String str, String str2) {
            this.f21137a = str;
            this.b = str2;
        }
    }

    public interface d<T> {
        T a();
    }

    public m0(l8.a aVar, l8.a aVar2, e eVar, t0 t0Var, ht.a<String> aVar3) {
        this.f21133a = t0Var;
        this.b = aVar;
        this.f21134c = aVar2;
        this.f21135d = eVar;
        this.f21136e = aVar3;
    }

    public static /* synthetic */ Object B(Throwable th2) {
        throw new k8.a("Timed out while trying to acquire the lock.", th2);
    }

    public static byte[] E0(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    public static /* synthetic */ Object F(String str, e8.c.b bVar, long j10, SQLiteDatabase sQLiteDatabase) {
        if (((Boolean) O0(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(bVar.getNumber())}), new b() { // from class: j8.y
            @Override // j8.m0.b
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

    public static /* synthetic */ Object H(Map map, Cursor cursor) {
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

    public static /* synthetic */ Integer I(final m0 m0Var, long j10, SQLiteDatabase sQLiteDatabase) {
        m0Var.getClass();
        String[] strArr = {String.valueOf(j10)};
        O0(sQLiteDatabase.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr), new b() { // from class: j8.s
            @Override // j8.m0.b
            public final Object apply(Object obj) {
                return m0.l(this.f21147a, (Cursor) obj);
            }
        });
        return Integer.valueOf(sQLiteDatabase.delete("events", "timestamp_ms < ?", strArr));
    }

    public static /* synthetic */ Object L(m0 m0Var, List list, b8.o oVar, Cursor cursor) {
        m0Var.getClass();
        while (cursor.moveToNext()) {
            long j10 = cursor.getLong(0);
            boolean z10 = cursor.getInt(7) != 0;
            b8.i.a aVarK = b8.i.a().j(cursor.getString(1)).i(cursor.getLong(2)).k(cursor.getLong(3));
            if (z10) {
                aVarK.h(new b8.h(L0(cursor.getString(4)), cursor.getBlob(5)));
            } else {
                aVarK.h(new b8.h(L0(cursor.getString(4)), m0Var.H0(j10)));
            }
            if (!cursor.isNull(6)) {
                aVarK.g(Integer.valueOf(cursor.getInt(6)));
            }
            list.add(k.a(j10, oVar, aVarK.d()));
        }
        return null;
    }

    public static y7.c L0(String str) {
        return str == null ? f21132f : y7.c.b(str);
    }

    public static /* synthetic */ Object M(m0 m0Var, SQLiteDatabase sQLiteDatabase) {
        m0Var.getClass();
        sQLiteDatabase.compileStatement("DELETE FROM log_event_dropped").execute();
        sQLiteDatabase.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + m0Var.b.a()).execute();
        return null;
    }

    public static String N0(Iterable<k> iterable) {
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

    public static <T> T O0(Cursor cursor, b<Cursor, T> bVar) {
        try {
            return bVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    public static /* synthetic */ e8.a P(final m0 m0Var, String str, final Map map, final e8.a.C0281a c0281a, SQLiteDatabase sQLiteDatabase) {
        m0Var.getClass();
        return (e8.a) O0(sQLiteDatabase.rawQuery(str, new String[0]), new b() { // from class: j8.a0
            @Override // j8.m0.b
            public final Object apply(Object obj) {
                return m0.s(this.f21113a, map, c0281a, (Cursor) obj);
            }
        });
    }

    public static /* synthetic */ Long U(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return 0L;
    }

    public static /* synthetic */ e8.f X(final long j10, SQLiteDatabase sQLiteDatabase) {
        return (e8.f) O0(sQLiteDatabase.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]), new b() { // from class: j8.d0
            @Override // j8.m0.b
            public final Object apply(Object obj) {
                return m0.e(j10, (Cursor) obj);
            }
        });
    }

    public static /* synthetic */ e8.f e(long j10, Cursor cursor) {
        cursor.moveToNext();
        return e8.f.c().c(cursor.getLong(0)).b(j10).a();
    }

    public static /* synthetic */ List f(m0 m0Var, b8.o oVar, SQLiteDatabase sQLiteDatabase) {
        List<k> listA0 = m0Var.A0(sQLiteDatabase, oVar, m0Var.f21135d.d());
        for (y7.e eVar : y7.e.values()) {
            if (eVar != oVar.d()) {
                int iD = m0Var.f21135d.d() - listA0.size();
                if (iD <= 0) {
                    break;
                }
                listA0.addAll(m0Var.A0(sQLiteDatabase, oVar.f(eVar), iD));
            }
        }
        return m0Var.z0(listA0, m0Var.D0(sQLiteDatabase, listA0));
    }

    public static /* synthetic */ List g(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            arrayList.add(b8.o.a().b(cursor.getString(1)).d(m8.a.b(cursor.getInt(2))).c(E0(cursor.getString(3))).a());
        }
        return arrayList;
    }

    public static /* synthetic */ Object h(m0 m0Var, Cursor cursor) {
        m0Var.getClass();
        while (cursor.moveToNext()) {
            m0Var.d(cursor.getInt(0), e8.c.b.MAX_RETRIES_REACHED, cursor.getString(1));
        }
        return null;
    }

    public static /* synthetic */ SQLiteDatabase j(Throwable th2) {
        throw new k8.a("Timed out while trying to open db.", th2);
    }

    public static /* synthetic */ Object l(m0 m0Var, Cursor cursor) {
        m0Var.getClass();
        while (cursor.moveToNext()) {
            m0Var.d(cursor.getInt(0), e8.c.b.MESSAGE_TOO_OLD, cursor.getString(1));
        }
        return null;
    }

    public static /* synthetic */ Object m(final m0 m0Var, String str, String str2, SQLiteDatabase sQLiteDatabase) {
        m0Var.getClass();
        sQLiteDatabase.compileStatement(str).execute();
        O0(sQLiteDatabase.rawQuery(str2, null), new b() { // from class: j8.v
            @Override // j8.m0.b
            public final Object apply(Object obj) {
                return m0.h(this.f21162a, (Cursor) obj);
            }
        });
        sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
        return null;
    }

    public static /* synthetic */ Boolean n(m0 m0Var, b8.o oVar, SQLiteDatabase sQLiteDatabase) {
        Long lT0 = m0Var.t0(sQLiteDatabase, oVar);
        return lT0 == null ? Boolean.FALSE : (Boolean) O0(m0Var.e0().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lT0.toString()}), new b() { // from class: j8.u
            @Override // j8.m0.b
            public final Object apply(Object obj) {
                return Boolean.valueOf(((Cursor) obj).moveToNext());
            }
        });
    }

    public static /* synthetic */ Object o(long j10, b8.o oVar, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(j10));
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{oVar.b(), String.valueOf(m8.a.a(oVar.d()))}) < 1) {
            contentValues.put("backend_name", oVar.b());
            contentValues.put("priority", Integer.valueOf(m8.a.a(oVar.d())));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    public static /* synthetic */ byte[] q(Cursor cursor) {
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

    public static /* synthetic */ List r(SQLiteDatabase sQLiteDatabase) {
        return (List) O0(sQLiteDatabase.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), new b() { // from class: j8.k0
            @Override // j8.m0.b
            public final Object apply(Object obj) {
                return m0.g((Cursor) obj);
            }
        });
    }

    public static /* synthetic */ e8.a s(m0 m0Var, Map map, e8.a.C0281a c0281a, Cursor cursor) {
        m0Var.getClass();
        while (cursor.moveToNext()) {
            String string = cursor.getString(0);
            e8.c.b bVarY = m0Var.Y(cursor.getInt(1));
            long j10 = cursor.getLong(2);
            if (!map.containsKey(string)) {
                map.put(string, new ArrayList());
            }
            ((List) map.get(string)).add(e8.c.c().c(bVarY).b(j10).a());
        }
        m0Var.F0(c0281a, map);
        c0281a.e(m0Var.r0());
        c0281a.d(m0Var.f0());
        c0281a.c(m0Var.f21136e.get());
        return c0281a.b();
    }

    public static /* synthetic */ Long v(m0 m0Var, b8.i iVar, b8.o oVar, SQLiteDatabase sQLiteDatabase) {
        if (m0Var.y0()) {
            m0Var.d(1L, e8.c.b.CACHE_FULL, iVar.j());
            return -1L;
        }
        long jA0 = m0Var.a0(sQLiteDatabase, oVar);
        int iE = m0Var.f21135d.e();
        byte[] bArrA = iVar.e().a();
        boolean z10 = bArrA.length <= iE;
        ContentValues contentValues = new ContentValues();
        contentValues.put("context_id", Long.valueOf(jA0));
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

    public static /* synthetic */ Object w(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.beginTransaction();
        return null;
    }

    public static /* synthetic */ Long y(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return null;
    }

    public final List<k> A0(SQLiteDatabase sQLiteDatabase, final b8.o oVar, int i10) {
        final ArrayList arrayList = new ArrayList();
        Long lT0 = t0(sQLiteDatabase, oVar);
        if (lT0 == null) {
            return arrayList;
        }
        O0(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{lT0.toString()}, null, null, null, String.valueOf(i10)), new b() { // from class: j8.x
            @Override // j8.m0.b
            public final Object apply(Object obj) {
                return m0.L(this.f21163a, arrayList, oVar, (Cursor) obj);
            }
        });
        return arrayList;
    }

    public final Map<Long, Set<c>> D0(SQLiteDatabase sQLiteDatabase, List<k> list) {
        final HashMap map = new HashMap();
        StringBuilder sb2 = new StringBuilder("event_id IN (");
        for (int i10 = 0; i10 < list.size(); i10++) {
            sb2.append(list.get(i10).c());
            if (i10 < list.size() - 1) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        O0(sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb2.toString(), null, null, null, null), new b() { // from class: j8.z
            @Override // j8.m0.b
            public final Object apply(Object obj) {
                return m0.H(map, (Cursor) obj);
            }
        });
        return map;
    }

    public final void F0(e8.a.C0281a c0281a, Map<String, List<e8.c>> map) {
        for (Map.Entry<String, List<e8.c>> entry : map.entrySet()) {
            c0281a.a(e8.d.c().c(entry.getKey()).b(entry.getValue()).a());
        }
    }

    public final byte[] H0(long j10) {
        return (byte[]) O0(e0().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j10)}, null, null, "sequence_num"), new b() { // from class: j8.b0
            @Override // j8.m0.b
            public final Object apply(Object obj) {
                return m0.q((Cursor) obj);
            }
        });
    }

    @Override // j8.d
    public void J(Iterable<k> iterable) {
        if (iterable.iterator().hasNext()) {
            e0().compileStatement("DELETE FROM events WHERE _id in " + N0(iterable)).execute();
        }
    }

    public final <T> T J0(d<T> dVar, b<Throwable, T> bVar) {
        long jA = this.f21134c.a();
        while (true) {
            try {
                return dVar.a();
            } catch (SQLiteDatabaseLockedException e10) {
                if (this.f21134c.a() >= ((long) this.f21135d.b()) + jA) {
                    return bVar.apply(e10);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    @Override // j8.d
    public boolean K(final b8.o oVar) {
        return ((Boolean) x0(new b() { // from class: j8.o
            @Override // j8.m0.b
            public final Object apply(Object obj) {
                return m0.n(this.f21142a, oVar, (SQLiteDatabase) obj);
            }
        })).booleanValue();
    }

    @Override // j8.d
    public k U0(final b8.o oVar, final b8.i iVar) {
        f8.a.b("SQLiteEventStore", "Storing event with priority=%s, name=%s for destination %s", oVar.d(), iVar.j(), oVar.b());
        long jLongValue = ((Long) x0(new b() { // from class: j8.i0
            @Override // j8.m0.b
            public final Object apply(Object obj) {
                return m0.v(this.f21124a, iVar, oVar, (SQLiteDatabase) obj);
            }
        })).longValue();
        if (jLongValue < 1) {
            return null;
        }
        return k.a(jLongValue, oVar, iVar);
    }

    public final e8.c.b Y(int i10) {
        e8.c.b bVar = e8.c.b.REASON_UNKNOWN;
        if (i10 == bVar.getNumber()) {
            return bVar;
        }
        e8.c.b bVar2 = e8.c.b.MESSAGE_TOO_OLD;
        if (i10 == bVar2.getNumber()) {
            return bVar2;
        }
        e8.c.b bVar3 = e8.c.b.CACHE_FULL;
        if (i10 == bVar3.getNumber()) {
            return bVar3;
        }
        e8.c.b bVar4 = e8.c.b.PAYLOAD_TOO_BIG;
        if (i10 == bVar4.getNumber()) {
            return bVar4;
        }
        e8.c.b bVar5 = e8.c.b.MAX_RETRIES_REACHED;
        if (i10 == bVar5.getNumber()) {
            return bVar5;
        }
        e8.c.b bVar6 = e8.c.b.INVALID_PAYLOD;
        if (i10 == bVar6.getNumber()) {
            return bVar6;
        }
        e8.c.b bVar7 = e8.c.b.SERVER_ERROR;
        if (i10 == bVar7.getNumber()) {
            return bVar7;
        }
        f8.a.a("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i10));
        return bVar;
    }

    public final void Z(final SQLiteDatabase sQLiteDatabase) {
        J0(new d() { // from class: j8.l
            @Override // j8.m0.d
            public final Object a() {
                return m0.w(sQLiteDatabase);
            }
        }, new b() { // from class: j8.w
            @Override // j8.m0.b
            public final Object apply(Object obj) {
                return m0.B((Throwable) obj);
            }
        });
    }

    @Override // j8.c
    public void a() {
        x0(new b() { // from class: j8.q
            @Override // j8.m0.b
            public final Object apply(Object obj) {
                return m0.M(this.f21144a, (SQLiteDatabase) obj);
            }
        });
    }

    public final long a0(SQLiteDatabase sQLiteDatabase, b8.o oVar) {
        Long lT0 = t0(sQLiteDatabase, oVar);
        if (lT0 != null) {
            return lT0.longValue();
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("backend_name", oVar.b());
        contentValues.put("priority", Integer.valueOf(m8.a.a(oVar.d())));
        contentValues.put("next_request_ms", (Integer) 0);
        if (oVar.c() != null) {
            contentValues.put("extras", Base64.encodeToString(oVar.c(), 0));
        }
        return sQLiteDatabase.insert("transport_contexts", null, contentValues);
    }

    @Override // k8.b
    public <T> T b(k8.b.a<T> aVar) {
        SQLiteDatabase sQLiteDatabaseE0 = e0();
        Z(sQLiteDatabaseE0);
        try {
            T tExecute = aVar.execute();
            sQLiteDatabaseE0.setTransactionSuccessful();
            return tExecute;
        } finally {
            sQLiteDatabaseE0.endTransaction();
        }
    }

    public long b0() {
        return i0() * l0();
    }

    @Override // j8.c
    public e8.a c() {
        final e8.a.C0281a c0281aE = e8.a.e();
        final HashMap map = new HashMap();
        final String str = "SELECT log_source, reason, events_dropped_count FROM log_event_dropped";
        return (e8.a) x0(new b() { // from class: j8.t
            @Override // j8.m0.b
            public final Object apply(Object obj) {
                return m0.P(this.f21148a, str, map, c0281aE, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // j8.d
    public int cleanUp() {
        final long jA = this.b.a() - this.f21135d.c();
        return ((Integer) x0(new b() { // from class: j8.j0
            @Override // j8.m0.b
            public final Object apply(Object obj) {
                return m0.I(this.f21127a, jA, (SQLiteDatabase) obj);
            }
        })).intValue();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f21133a.close();
    }

    @Override // j8.c
    public void d(final long j10, final e8.c.b bVar, final String str) {
        x0(new b() { // from class: j8.r
            @Override // j8.m0.b
            public final Object apply(Object obj) {
                return m0.F(str, bVar, j10, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // j8.d
    public Iterable<k> d1(final b8.o oVar) {
        return (Iterable) x0(new b() { // from class: j8.m
            @Override // j8.m0.b
            public final Object apply(Object obj) {
                return m0.f(this.f21131a, oVar, (SQLiteDatabase) obj);
            }
        });
    }

    public SQLiteDatabase e0() {
        final t0 t0Var = this.f21133a;
        Objects.requireNonNull(t0Var);
        return (SQLiteDatabase) J0(new d() { // from class: j8.e0
            @Override // j8.m0.d
            public final Object a() {
                return t0Var.getWritableDatabase();
            }
        }, new b() { // from class: j8.f0
            @Override // j8.m0.b
            public final Object apply(Object obj) {
                return m0.j((Throwable) obj);
            }
        });
    }

    public final e8.b f0() {
        return e8.b.b().b(e8.e.c().b(b0()).c(e.f21119a.f()).a()).a();
    }

    @Override // j8.d
    public Iterable<b8.o> g0() {
        return (Iterable) x0(new b() { // from class: j8.g0
            @Override // j8.m0.b
            public final Object apply(Object obj) {
                return m0.r((SQLiteDatabase) obj);
            }
        });
    }

    public final long i0() {
        return e0().compileStatement("PRAGMA page_count").simpleQueryForLong();
    }

    public final long l0() {
        return e0().compileStatement("PRAGMA page_size").simpleQueryForLong();
    }

    @Override // j8.d
    public void o2(final b8.o oVar, final long j10) {
        x0(new b() { // from class: j8.p
            @Override // j8.m0.b
            public final Object apply(Object obj) {
                return m0.o(j10, oVar, (SQLiteDatabase) obj);
            }
        });
    }

    public final e8.f r0() {
        final long jA = this.b.a();
        return (e8.f) x0(new b() { // from class: j8.c0
            @Override // j8.m0.b
            public final Object apply(Object obj) {
                return m0.X(jA, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // j8.d
    public void s1(Iterable<k> iterable) {
        if (iterable.iterator().hasNext()) {
            final String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + N0(iterable);
            final String str2 = "SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name";
            x0(new b() { // from class: j8.l0
                @Override // j8.m0.b
                public final Object apply(Object obj) {
                    return m0.m(this.f21129a, str, str2, (SQLiteDatabase) obj);
                }
            });
        }
    }

    public final Long t0(SQLiteDatabase sQLiteDatabase, b8.o oVar) {
        StringBuilder sb2 = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(oVar.b(), String.valueOf(m8.a.a(oVar.d()))));
        if (oVar.c() != null) {
            sb2.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(oVar.c(), 0));
        } else {
            sb2.append(" and extras is null");
        }
        return (Long) O0(sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb2.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null), new b() { // from class: j8.n
            @Override // j8.m0.b
            public final Object apply(Object obj) {
                return m0.y((Cursor) obj);
            }
        });
    }

    @Override // j8.d
    public long v0(b8.o oVar) {
        return ((Long) O0(e0().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{oVar.b(), String.valueOf(m8.a.a(oVar.d()))}), new b() { // from class: j8.h0
            @Override // j8.m0.b
            public final Object apply(Object obj) {
                return m0.U((Cursor) obj);
            }
        })).longValue();
    }

    public <T> T x0(b<SQLiteDatabase, T> bVar) {
        SQLiteDatabase sQLiteDatabaseE0 = e0();
        sQLiteDatabaseE0.beginTransaction();
        try {
            T tApply = bVar.apply(sQLiteDatabaseE0);
            sQLiteDatabaseE0.setTransactionSuccessful();
            return tApply;
        } finally {
            sQLiteDatabaseE0.endTransaction();
        }
    }

    public final boolean y0() {
        return i0() * l0() >= this.f21135d.f();
    }

    public final List<k> z0(List<k> list, Map<Long, Set<c>> map) {
        ListIterator<k> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            k next = listIterator.next();
            if (map.containsKey(Long.valueOf(next.c()))) {
                b8.i.a aVarL = next.b().l();
                for (c cVar : map.get(Long.valueOf(next.c()))) {
                    aVarL.c(cVar.f21137a, cVar.b);
                }
                listIterator.set(k.a(next.c(), next.d(), aVarL.d()));
            }
        }
        return list;
    }
}
