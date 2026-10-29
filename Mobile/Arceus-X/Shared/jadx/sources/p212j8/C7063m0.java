package p212j8;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import ht.InterfaceC6564a;
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
import p028b8.AbstractC1261i;
import p028b8.AbstractC1267o;
import p028b8.C1260h;
import p097e8.C4881a;
import p097e8.C4882b;
import p097e8.C4883c;
import p097e8.C4884d;
import p097e8.C4885e;
import p097e8.C4886f;
import p122f8.C5488a;
import p241k8.C7489a;
import p241k8.InterfaceC7490b;
import p267l8.InterfaceC8011a;
import p289m8.C8469a;
import p569y7.C13116c;
import p569y7.EnumC13118e;

/* JADX INFO: renamed from: j8.m0 */
/* JADX INFO: loaded from: classes.dex */
public class C7063m0 implements InterfaceC7044d, InterfaceC7490b, InterfaceC7042c {

    /* JADX INFO: renamed from: f */
    public static final C13116c f27637f = C13116c.m48729b("proto");

    /* JADX INFO: renamed from: a */
    public final C7077t0 f27638a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC8011a f27639b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC8011a f27640c;

    /* JADX INFO: renamed from: d */
    public final AbstractC7046e f27641d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC6564a<String> f27642e;

    /* JADX INFO: renamed from: j8.m0$b */
    public interface b<T, U> {
        U apply(T t8);
    }

    /* JADX INFO: renamed from: j8.m0$c */
    public static class c {

        /* JADX INFO: renamed from: a */
        public final String f27643a;

        /* JADX INFO: renamed from: b */
        public final String f27644b;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public c(String str, String str2) {
            this.f27643a = str;
            this.f27644b = str2;
        }
    }

    /* JADX INFO: renamed from: j8.m0$d */
    public interface d<T> {
        /* JADX INFO: renamed from: a */
        T mo29761a();
    }

    public C7063m0(InterfaceC8011a interfaceC8011a, InterfaceC8011a interfaceC8011a2, AbstractC7046e abstractC7046e, C7077t0 c7077t0, InterfaceC6564a<String> interfaceC6564a) {
        this.f27638a = c7077t0;
        this.f27639b = interfaceC8011a;
        this.f27640c = interfaceC8011a2;
        this.f27641d = abstractC7046e;
        this.f27642e = interfaceC6564a;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0007: THROW 
      (wrap k8.a:0x0004: CONSTRUCTOR ("Timed out while trying to acquire the lock."), (r2v0 java.lang.Throwable) A[MD:(java.lang.String, java.lang.Throwable):void (m), WRAPPED] call: k8.a.<init>(java.lang.String, java.lang.Throwable):void type: CONSTRUCTOR)
     */
    /* JADX INFO: renamed from: B */
    public static /* synthetic */ Object m29782B(Throwable th2) {
        throw new C7489a("Timed out while trying to acquire the lock.", th2);
    }

    /* JADX INFO: renamed from: E0 */
    public static byte[] m29783E0(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ Object m29784F(String str, C4883c.b bVar, long j10, SQLiteDatabase sQLiteDatabase) {
        if (((Boolean) m29791O0(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(bVar.getNumber())}), new b() { // from class: j8.y
            @Override // p212j8.C7063m0.b
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

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ Object m29785H(Map map, Cursor cursor) {
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

    /* JADX INFO: renamed from: I */
    public static /* synthetic */ Integer m29786I(final C7063m0 c7063m0, long j10, SQLiteDatabase sQLiteDatabase) {
        c7063m0.getClass();
        String[] strArr = {String.valueOf(j10)};
        m29791O0(sQLiteDatabase.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr), new b() { // from class: j8.s
            @Override // p212j8.C7063m0.b
            public final Object apply(Object obj) {
                return C7063m0.m29800l(this.f27658a, (Cursor) obj);
            }
        });
        return Integer.valueOf(sQLiteDatabase.delete("events", "timestamp_ms < ?", strArr));
    }

    /* JADX INFO: renamed from: L */
    public static /* synthetic */ Object m29787L(C7063m0 c7063m0, List list, AbstractC1267o abstractC1267o, Cursor cursor) {
        c7063m0.getClass();
        while (cursor.moveToNext()) {
            long j10 = cursor.getLong(0);
            boolean z10 = cursor.getInt(7) != 0;
            AbstractC1261i.a aVarMo6995k = AbstractC1261i.m7022a().mo6994j(cursor.getString(1)).mo6993i(cursor.getLong(2)).mo6995k(cursor.getLong(3));
            if (z10) {
                aVarMo6995k.mo6992h(new C1260h(m29788L0(cursor.getString(4)), cursor.getBlob(5)));
            } else {
                aVarMo6995k.mo6992h(new C1260h(m29788L0(cursor.getString(4)), c7063m0.m29814H0(j10)));
            }
            if (!cursor.isNull(6)) {
                aVarMo6995k.mo6991g(Integer.valueOf(cursor.getInt(6)));
            }
            list.add(AbstractC7058k.m29781a(j10, abstractC1267o, aVarMo6995k.mo6988d()));
        }
        return null;
    }

    /* JADX INFO: renamed from: L0 */
    public static C13116c m29788L0(String str) {
        return str == null ? f27637f : C13116c.m48729b(str);
    }

    /* JADX INFO: renamed from: M */
    public static /* synthetic */ Object m29789M(C7063m0 c7063m0, SQLiteDatabase sQLiteDatabase) {
        c7063m0.getClass();
        sQLiteDatabase.compileStatement("DELETE FROM log_event_dropped").execute();
        sQLiteDatabase.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + c7063m0.f27639b.mo33091a()).execute();
        return null;
    }

    /* JADX INFO: renamed from: N0 */
    public static String m29790N0(Iterable<AbstractC7058k> iterable) {
        StringBuilder sb2 = new StringBuilder("(");
        Iterator<AbstractC7058k> it = iterable.iterator();
        while (it.hasNext()) {
            sb2.append(it.next().mo29747c());
            if (it.hasNext()) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        return sb2.toString();
    }

    /* JADX INFO: renamed from: O0 */
    public static <T> T m29791O0(Cursor cursor, b<Cursor, T> bVar) {
        try {
            return bVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ C4881a m29792P(final C7063m0 c7063m0, String str, final Map map, final C4881a.a aVar, SQLiteDatabase sQLiteDatabase) {
        c7063m0.getClass();
        return (C4881a) m29791O0(sQLiteDatabase.rawQuery(str, new String[0]), new b() { // from class: j8.a0
            @Override // p212j8.C7063m0.b
            public final Object apply(Object obj) {
                return C7063m0.m29806s(this.f27612a, map, aVar, (Cursor) obj);
            }
        });
    }

    /* JADX INFO: renamed from: U */
    public static /* synthetic */ Long m29793U(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return 0L;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0012: CHECK_CAST (e8.f) (wrap java.lang.Object:0x000e: INVOKE 
      (wrap android.database.Cursor:0x0005: INVOKE 
      (r4v0 android.database.sqlite.SQLiteDatabase)
      ("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1")
      (wrap java.lang.String[]:0x0001: NEW_ARRAY (0 int) A[WRAPPED] type: java.lang.String[])
     VIRTUAL call: android.database.sqlite.SQLiteDatabase.rawQuery(java.lang.String, java.lang.String[]):android.database.Cursor A[MD:(java.lang.String, java.lang.String[]):android.database.Cursor (c), WRAPPED])
      (wrap j8.m0$b:0x000b: CONSTRUCTOR (r2v0 long A[DONT_INLINE]) A[MD:(long):void (m), WRAPPED] call: j8.d0.<init>(long):void type: CONSTRUCTOR)
     STATIC call: j8.m0.O0(android.database.Cursor, j8.m0$b):java.lang.Object A[MD:<T>:(android.database.Cursor, j8.m0$b<android.database.Cursor, T>):T (m), WRAPPED]) */
    /* JADX INFO: renamed from: X */
    public static /* synthetic */ C4886f m29794X(final long j10, SQLiteDatabase sQLiteDatabase) {
        return (C4886f) m29791O0(sQLiteDatabase.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]), new b() { // from class: j8.d0
            @Override // p212j8.C7063m0.b
            public final Object apply(Object obj) {
                return C7063m0.m29795e(j10, (Cursor) obj);
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ C4886f m29795e(long j10, Cursor cursor) {
        cursor.moveToNext();
        return C4886f.m23537c().m23542c(cursor.getLong(0)).m23541b(j10).m23540a();
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ List m29796f(C7063m0 c7063m0, AbstractC1267o abstractC1267o, SQLiteDatabase sQLiteDatabase) {
        List<AbstractC7058k> listM29811A0 = c7063m0.m29811A0(sQLiteDatabase, abstractC1267o, c7063m0.f27641d.mo29737d());
        for (EnumC13118e enumC13118e : EnumC13118e.values()) {
            if (enumC13118e != abstractC1267o.mo7009d()) {
                int iMo29737d = c7063m0.f27641d.mo29737d() - listM29811A0.size();
                if (iMo29737d <= 0) {
                    break;
                }
                listM29811A0.addAll(c7063m0.m29811A0(sQLiteDatabase, abstractC1267o.m7042f(enumC13118e), iMo29737d));
            }
        }
        return c7063m0.m29829z0(listM29811A0, c7063m0.m29812D0(sQLiteDatabase, listM29811A0));
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ List m29797g(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            arrayList.add(AbstractC1267o.m7040a().mo7011b(cursor.getString(1)).mo7013d(C8469a.m34256b(cursor.getInt(2))).mo7012c(m29783E0(cursor.getString(3))).mo7010a());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ Object m29798h(C7063m0 c7063m0, Cursor cursor) {
        c7063m0.getClass();
        while (cursor.moveToNext()) {
            c7063m0.mo29751d(cursor.getInt(0), C4883c.b.MAX_RETRIES_REACHED, cursor.getString(1));
        }
        return null;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0007: THROW 
      (wrap k8.a:0x0004: CONSTRUCTOR ("Timed out while trying to open db."), (r2v0 java.lang.Throwable) A[MD:(java.lang.String, java.lang.Throwable):void (m), WRAPPED] call: k8.a.<init>(java.lang.String, java.lang.Throwable):void type: CONSTRUCTOR)
     */
    /* JADX INFO: renamed from: j */
    public static /* synthetic */ SQLiteDatabase m29799j(Throwable th2) {
        throw new C7489a("Timed out while trying to open db.", th2);
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ Object m29800l(C7063m0 c7063m0, Cursor cursor) {
        c7063m0.getClass();
        while (cursor.moveToNext()) {
            c7063m0.mo29751d(cursor.getInt(0), C4883c.b.MESSAGE_TOO_OLD, cursor.getString(1));
        }
        return null;
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ Object m29801m(final C7063m0 c7063m0, String str, String str2, SQLiteDatabase sQLiteDatabase) {
        c7063m0.getClass();
        sQLiteDatabase.compileStatement(str).execute();
        m29791O0(sQLiteDatabase.rawQuery(str2, null), new b() { // from class: j8.v
            @Override // p212j8.C7063m0.b
            public final Object apply(Object obj) {
                return C7063m0.m29798h(this.f27676a, (Cursor) obj);
            }
        });
        sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
        return null;
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ Boolean m29802n(C7063m0 c7063m0, AbstractC1267o abstractC1267o, SQLiteDatabase sQLiteDatabase) {
        Long lM29826t0 = c7063m0.m29826t0(sQLiteDatabase, abstractC1267o);
        return lM29826t0 == null ? Boolean.FALSE : (Boolean) m29791O0(c7063m0.m29821e0().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lM29826t0.toString()}), new b() { // from class: j8.u
            @Override // p212j8.C7063m0.b
            public final Object apply(Object obj) {
                return Boolean.valueOf(((Cursor) obj).moveToNext());
            }
        });
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ Object m29803o(long j10, AbstractC1267o abstractC1267o, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(j10));
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{abstractC1267o.mo7007b(), String.valueOf(C8469a.m34255a(abstractC1267o.mo7009d()))}) < 1) {
            contentValues.put("backend_name", abstractC1267o.mo7007b());
            contentValues.put("priority", Integer.valueOf(C8469a.m34255a(abstractC1267o.mo7009d())));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ byte[] m29804q(Cursor cursor) {
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

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0012: CHECK_CAST (java.util.List) (wrap java.lang.Object:0x000e: INVOKE 
      (wrap android.database.Cursor:0x0005: INVOKE 
      (r2v0 android.database.sqlite.SQLiteDatabase)
      ("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id")
      (wrap java.lang.String[]:0x0001: NEW_ARRAY (0 int) A[WRAPPED] type: java.lang.String[])
     VIRTUAL call: android.database.sqlite.SQLiteDatabase.rawQuery(java.lang.String, java.lang.String[]):android.database.Cursor A[MD:(java.lang.String, java.lang.String[]):android.database.Cursor (c), WRAPPED])
      (wrap j8.m0$b:0x000b: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: j8.k0.<init>():void type: CONSTRUCTOR)
     STATIC call: j8.m0.O0(android.database.Cursor, j8.m0$b):java.lang.Object A[MD:<T>:(android.database.Cursor, j8.m0$b<android.database.Cursor, T>):T (m), WRAPPED]) */
    /* JADX INFO: renamed from: r */
    public static /* synthetic */ List m29805r(SQLiteDatabase sQLiteDatabase) {
        return (List) m29791O0(sQLiteDatabase.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), new b() { // from class: j8.k0
            @Override // p212j8.C7063m0.b
            public final Object apply(Object obj) {
                return C7063m0.m29797g((Cursor) obj);
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ C4881a m29806s(C7063m0 c7063m0, Map map, C4881a.a aVar, Cursor cursor) {
        c7063m0.getClass();
        while (cursor.moveToNext()) {
            String string = cursor.getString(0);
            C4883c.b bVarM29816Y = c7063m0.m29816Y(cursor.getInt(1));
            long j10 = cursor.getLong(2);
            if (!map.containsKey(string)) {
                map.put(string, new ArrayList());
            }
            ((List) map.get(string)).add(C4883c.m23519c().m23524c(bVarM29816Y).m23523b(j10).m23522a());
        }
        c7063m0.m29813F0(aVar, map);
        aVar.m23514e(c7063m0.m29825r0());
        aVar.m23513d(c7063m0.m29822f0());
        aVar.m23512c(c7063m0.f27642e.get());
        return aVar.m23511b();
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ Long m29808v(C7063m0 c7063m0, AbstractC1261i abstractC1261i, AbstractC1267o abstractC1267o, SQLiteDatabase sQLiteDatabase) {
        if (c7063m0.m29828y0()) {
            c7063m0.mo29751d(1L, C4883c.b.CACHE_FULL, abstractC1261i.mo6986j());
            return -1L;
        }
        long jM29818a0 = c7063m0.m29818a0(sQLiteDatabase, abstractC1267o);
        int iMo29738e = c7063m0.f27641d.mo29738e();
        byte[] bArrM7020a = abstractC1261i.mo6984e().m7020a();
        boolean z10 = bArrM7020a.length <= iMo29738e;
        ContentValues contentValues = new ContentValues();
        contentValues.put("context_id", Long.valueOf(jM29818a0));
        contentValues.put("transport_name", abstractC1261i.mo6986j());
        contentValues.put("timestamp_ms", Long.valueOf(abstractC1261i.mo6985f()));
        contentValues.put("uptime_ms", Long.valueOf(abstractC1261i.mo6987k()));
        contentValues.put("payload_encoding", abstractC1261i.mo6984e().m7021b().m48730a());
        contentValues.put("code", abstractC1261i.mo6983d());
        contentValues.put("num_attempts", (Integer) 0);
        contentValues.put("inline", Boolean.valueOf(z10));
        contentValues.put("payload", z10 ? bArrM7020a : new byte[0]);
        long jInsert = sQLiteDatabase.insert("events", null, contentValues);
        if (!z10) {
            int iCeil = (int) Math.ceil(((double) bArrM7020a.length) / ((double) iMo29738e));
            for (int i10 = 1; i10 <= iCeil; i10++) {
                byte[] bArrCopyOfRange = Arrays.copyOfRange(bArrM7020a, (i10 - 1) * iMo29738e, Math.min(i10 * iMo29738e, bArrM7020a.length));
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("event_id", Long.valueOf(jInsert));
                contentValues2.put("sequence_num", Integer.valueOf(i10));
                contentValues2.put("bytes", bArrCopyOfRange);
                sQLiteDatabase.insert("event_payloads", null, contentValues2);
            }
        }
        for (Map.Entry<String, String> entry : abstractC1261i.m7026i().entrySet()) {
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put("event_id", Long.valueOf(jInsert));
            contentValues3.put("name", entry.getKey());
            contentValues3.put("value", entry.getValue());
            sQLiteDatabase.insert("event_metadata", null, contentValues3);
        }
        return Long.valueOf(jInsert);
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ Object m29809w(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.beginTransaction();
        return null;
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ Long m29810y(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return null;
    }

    /* JADX INFO: renamed from: A0 */
    public final List<AbstractC7058k> m29811A0(SQLiteDatabase sQLiteDatabase, final AbstractC1267o abstractC1267o, int i10) {
        final ArrayList arrayList = new ArrayList();
        Long lM29826t0 = m29826t0(sQLiteDatabase, abstractC1267o);
        if (lM29826t0 == null) {
            return arrayList;
        }
        m29791O0(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{lM29826t0.toString()}, null, null, null, String.valueOf(i10)), new b() { // from class: j8.x
            @Override // p212j8.C7063m0.b
            public final Object apply(Object obj) {
                return C7063m0.m29787L(this.f27677a, arrayList, abstractC1267o, (Cursor) obj);
            }
        });
        return arrayList;
    }

    /* JADX INFO: renamed from: D0 */
    public final Map<Long, Set<c>> m29812D0(SQLiteDatabase sQLiteDatabase, List<AbstractC7058k> list) {
        final HashMap map = new HashMap();
        StringBuilder sb2 = new StringBuilder("event_id IN (");
        for (int i10 = 0; i10 < list.size(); i10++) {
            sb2.append(list.get(i10).mo29747c());
            if (i10 < list.size() - 1) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        m29791O0(sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb2.toString(), null, null, null, null), new b() { // from class: j8.z
            @Override // p212j8.C7063m0.b
            public final Object apply(Object obj) {
                return C7063m0.m29785H(map, (Cursor) obj);
            }
        });
        return map;
    }

    /* JADX INFO: renamed from: F0 */
    public final void m29813F0(C4881a.a aVar, Map<String, List<C4883c>> map) {
        for (Map.Entry<String, List<C4883c>> entry : map.entrySet()) {
            aVar.m23510a(C4884d.m23525c().m23530c(entry.getKey()).m23529b(entry.getValue()).m23528a());
        }
    }

    /* JADX INFO: renamed from: H0 */
    public final byte[] m29814H0(long j10) {
        return (byte[]) m29791O0(m29821e0().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j10)}, null, null, "sequence_num"), new b() { // from class: j8.b0
            @Override // p212j8.C7063m0.b
            public final Object apply(Object obj) {
                return C7063m0.m29804q((Cursor) obj);
            }
        });
    }

    @Override // p212j8.InterfaceC7044d
    /* JADX INFO: renamed from: J */
    public void mo29752J(Iterable<AbstractC7058k> iterable) {
        if (iterable.iterator().hasNext()) {
            m29821e0().compileStatement("DELETE FROM events WHERE _id in " + m29790N0(iterable)).execute();
        }
    }

    /* JADX INFO: renamed from: J0 */
    public final <T> T m29815J0(d<T> dVar, b<Throwable, T> bVar) {
        long jMo33091a = this.f27640c.mo33091a();
        while (true) {
            try {
                return dVar.mo29761a();
            } catch (SQLiteDatabaseLockedException e10) {
                if (this.f27640c.mo33091a() >= ((long) this.f27641d.mo29735b()) + jMo33091a) {
                    return bVar.apply(e10);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    @Override // p212j8.InterfaceC7044d
    /* JADX INFO: renamed from: K */
    public boolean mo29753K(final AbstractC1267o abstractC1267o) {
        return ((Boolean) m29827x0(new b() { // from class: j8.o
            @Override // p212j8.C7063m0.b
            public final Object apply(Object obj) {
                return C7063m0.m29802n(this.f27650a, abstractC1267o, (SQLiteDatabase) obj);
            }
        })).booleanValue();
    }

    @Override // p212j8.InterfaceC7044d
    /* JADX INFO: renamed from: U0 */
    public AbstractC7058k mo29754U0(final AbstractC1267o abstractC1267o, final AbstractC1261i abstractC1261i) {
        C5488a.m25129b("SQLiteEventStore", "Storing event with priority=%s, name=%s for destination %s", abstractC1267o.mo7009d(), abstractC1261i.mo6986j(), abstractC1267o.mo7007b());
        long jLongValue = ((Long) m29827x0(new b() { // from class: j8.i0
            @Override // p212j8.C7063m0.b
            public final Object apply(Object obj) {
                return C7063m0.m29808v(this.f27625a, abstractC1261i, abstractC1267o, (SQLiteDatabase) obj);
            }
        })).longValue();
        if (jLongValue < 1) {
            return null;
        }
        return AbstractC7058k.m29781a(jLongValue, abstractC1267o, abstractC1261i);
    }

    /* JADX INFO: renamed from: Y */
    public final C4883c.b m29816Y(int i10) {
        C4883c.b bVar = C4883c.b.REASON_UNKNOWN;
        if (i10 == bVar.getNumber()) {
            return bVar;
        }
        C4883c.b bVar2 = C4883c.b.MESSAGE_TOO_OLD;
        if (i10 == bVar2.getNumber()) {
            return bVar2;
        }
        C4883c.b bVar3 = C4883c.b.CACHE_FULL;
        if (i10 == bVar3.getNumber()) {
            return bVar3;
        }
        C4883c.b bVar4 = C4883c.b.PAYLOAD_TOO_BIG;
        if (i10 == bVar4.getNumber()) {
            return bVar4;
        }
        C4883c.b bVar5 = C4883c.b.MAX_RETRIES_REACHED;
        if (i10 == bVar5.getNumber()) {
            return bVar5;
        }
        C4883c.b bVar6 = C4883c.b.INVALID_PAYLOD;
        if (i10 == bVar6.getNumber()) {
            return bVar6;
        }
        C4883c.b bVar7 = C4883c.b.SERVER_ERROR;
        if (i10 == bVar7.getNumber()) {
            return bVar7;
        }
        C5488a.m25128a("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i10));
        return bVar;
    }

    /* JADX INFO: renamed from: Z */
    public final void m29817Z(final SQLiteDatabase sQLiteDatabase) {
        m29815J0(new d() { // from class: j8.l
            @Override // p212j8.C7063m0.d
            /* JADX INFO: renamed from: a */
            public final Object mo29761a() {
                return C7063m0.m29809w(sQLiteDatabase);
            }
        }, new b() { // from class: j8.w
            @Override // p212j8.C7063m0.b
            public final Object apply(Object obj) {
                return C7063m0.m29782B((Throwable) obj);
            }
        });
    }

    @Override // p212j8.InterfaceC7042c
    /* JADX INFO: renamed from: a */
    public void mo29749a() {
        m29827x0(new b() { // from class: j8.q
            @Override // p212j8.C7063m0.b
            public final Object apply(Object obj) {
                return C7063m0.m29789M(this.f27654a, (SQLiteDatabase) obj);
            }
        });
    }

    /* JADX INFO: renamed from: a0 */
    public final long m29818a0(SQLiteDatabase sQLiteDatabase, AbstractC1267o abstractC1267o) {
        Long lM29826t0 = m29826t0(sQLiteDatabase, abstractC1267o);
        if (lM29826t0 != null) {
            return lM29826t0.longValue();
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("backend_name", abstractC1267o.mo7007b());
        contentValues.put("priority", Integer.valueOf(C8469a.m34255a(abstractC1267o.mo7009d())));
        contentValues.put("next_request_ms", (Integer) 0);
        if (abstractC1267o.mo7008c() != null) {
            contentValues.put("extras", Base64.encodeToString(abstractC1267o.mo7008c(), 0));
        }
        return sQLiteDatabase.insert("transport_contexts", null, contentValues);
    }

    @Override // p241k8.InterfaceC7490b
    /* JADX INFO: renamed from: b */
    public <T> T mo29819b(InterfaceC7490b.a<T> aVar) {
        SQLiteDatabase sQLiteDatabaseM29821e0 = m29821e0();
        m29817Z(sQLiteDatabaseM29821e0);
        try {
            T tExecute = aVar.execute();
            sQLiteDatabaseM29821e0.setTransactionSuccessful();
            return tExecute;
        } finally {
            sQLiteDatabaseM29821e0.endTransaction();
        }
    }

    /* JADX INFO: renamed from: b0 */
    public long m29820b0() {
        return m29823i0() * m29824l0();
    }

    @Override // p212j8.InterfaceC7042c
    /* JADX INFO: renamed from: c */
    public C4881a mo29750c() {
        final C4881a.a aVarM23504e = C4881a.m23504e();
        final HashMap map = new HashMap();
        final String str = "SELECT log_source, reason, events_dropped_count FROM log_event_dropped";
        return (C4881a) m29827x0(new b() { // from class: j8.t
            @Override // p212j8.C7063m0.b
            public final Object apply(Object obj) {
                return C7063m0.m29792P(this.f27659a, str, map, aVarM23504e, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // p212j8.InterfaceC7044d
    public int cleanUp() {
        final long jMo33091a = this.f27639b.mo33091a() - this.f27641d.mo29736c();
        return ((Integer) m29827x0(new b() { // from class: j8.j0
            @Override // p212j8.C7063m0.b
            public final Object apply(Object obj) {
                return C7063m0.m29786I(this.f27629a, jMo33091a, (SQLiteDatabase) obj);
            }
        })).intValue();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f27638a.close();
    }

    @Override // p212j8.InterfaceC7042c
    /* JADX INFO: renamed from: d */
    public void mo29751d(final long j10, final C4883c.b bVar, final String str) {
        m29827x0(new b() { // from class: j8.r
            @Override // p212j8.C7063m0.b
            public final Object apply(Object obj) {
                return C7063m0.m29784F(str, bVar, j10, (SQLiteDatabase) obj);
            }
        });
    }

    /* JADX INFO: renamed from: e0 */
    public SQLiteDatabase m29821e0() {
        final C7077t0 c7077t0 = this.f27638a;
        Objects.requireNonNull(c7077t0);
        return (SQLiteDatabase) m29815J0(new d() { // from class: j8.e0
            @Override // p212j8.C7063m0.d
            /* JADX INFO: renamed from: a */
            public final Object mo29761a() {
                return c7077t0.getWritableDatabase();
            }
        }, new b() { // from class: j8.f0
            @Override // p212j8.C7063m0.b
            public final Object apply(Object obj) {
                return C7063m0.m29799j((Throwable) obj);
            }
        });
    }

    @Override // p212j8.InterfaceC7044d
    /* JADX INFO: renamed from: e1 */
    public Iterable<AbstractC7058k> mo29755e1(final AbstractC1267o abstractC1267o) {
        return (Iterable) m29827x0(new b() { // from class: j8.m
            @Override // p212j8.C7063m0.b
            public final Object apply(Object obj) {
                return C7063m0.m29796f(this.f27635a, abstractC1267o, (SQLiteDatabase) obj);
            }
        });
    }

    /* JADX INFO: renamed from: f0 */
    public final C4882b m29822f0() {
        return C4882b.m23515b().m23518b(C4885e.m23531c().m23535b(m29820b0()).m23536c(AbstractC7046e.f27620a.mo29739f()).m23534a()).m23517a();
    }

    @Override // p212j8.InterfaceC7044d
    /* JADX INFO: renamed from: g0 */
    public Iterable<AbstractC1267o> mo29756g0() {
        return (Iterable) m29827x0(new b() { // from class: j8.g0
            @Override // p212j8.C7063m0.b
            public final Object apply(Object obj) {
                return C7063m0.m29805r((SQLiteDatabase) obj);
            }
        });
    }

    /* JADX INFO: renamed from: i0 */
    public final long m29823i0() {
        return m29821e0().compileStatement("PRAGMA page_count").simpleQueryForLong();
    }

    /* JADX INFO: renamed from: l0 */
    public final long m29824l0() {
        return m29821e0().compileStatement("PRAGMA page_size").simpleQueryForLong();
    }

    @Override // p212j8.InterfaceC7044d
    /* JADX INFO: renamed from: o2 */
    public void mo29757o2(final AbstractC1267o abstractC1267o, final long j10) {
        m29827x0(new b() { // from class: j8.p
            @Override // p212j8.C7063m0.b
            public final Object apply(Object obj) {
                return C7063m0.m29803o(j10, abstractC1267o, (SQLiteDatabase) obj);
            }
        });
    }

    /* JADX INFO: renamed from: r0 */
    public final C4886f m29825r0() {
        final long jMo33091a = this.f27639b.mo33091a();
        return (C4886f) m29827x0(new b() { // from class: j8.c0
            @Override // p212j8.C7063m0.b
            public final Object apply(Object obj) {
                return C7063m0.m29794X(jMo33091a, (SQLiteDatabase) obj);
            }
        });
    }

    /* JADX INFO: renamed from: t0 */
    public final Long m29826t0(SQLiteDatabase sQLiteDatabase, AbstractC1267o abstractC1267o) {
        StringBuilder sb2 = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(abstractC1267o.mo7007b(), String.valueOf(C8469a.m34255a(abstractC1267o.mo7009d()))));
        if (abstractC1267o.mo7008c() != null) {
            sb2.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(abstractC1267o.mo7008c(), 0));
        } else {
            sb2.append(" and extras is null");
        }
        return (Long) m29791O0(sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb2.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null), new b() { // from class: j8.n
            @Override // p212j8.C7063m0.b
            public final Object apply(Object obj) {
                return C7063m0.m29810y((Cursor) obj);
            }
        });
    }

    @Override // p212j8.InterfaceC7044d
    /* JADX INFO: renamed from: t1 */
    public void mo29758t1(Iterable<AbstractC7058k> iterable) {
        if (iterable.iterator().hasNext()) {
            final String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + m29790N0(iterable);
            final String str2 = "SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name";
            m29827x0(new b() { // from class: j8.l0
                @Override // p212j8.C7063m0.b
                public final Object apply(Object obj) {
                    return C7063m0.m29801m(this.f27632a, str, str2, (SQLiteDatabase) obj);
                }
            });
        }
    }

    @Override // p212j8.InterfaceC7044d
    /* JADX INFO: renamed from: v0 */
    public long mo29759v0(AbstractC1267o abstractC1267o) {
        return ((Long) m29791O0(m29821e0().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{abstractC1267o.mo7007b(), String.valueOf(C8469a.m34255a(abstractC1267o.mo7009d()))}), new b() { // from class: j8.h0
            @Override // p212j8.C7063m0.b
            public final Object apply(Object obj) {
                return C7063m0.m29793U((Cursor) obj);
            }
        })).longValue();
    }

    /* JADX INFO: renamed from: x0 */
    public <T> T m29827x0(b<SQLiteDatabase, T> bVar) {
        SQLiteDatabase sQLiteDatabaseM29821e0 = m29821e0();
        sQLiteDatabaseM29821e0.beginTransaction();
        try {
            T tApply = bVar.apply(sQLiteDatabaseM29821e0);
            sQLiteDatabaseM29821e0.setTransactionSuccessful();
            return tApply;
        } finally {
            sQLiteDatabaseM29821e0.endTransaction();
        }
    }

    /* JADX INFO: renamed from: y0 */
    public final boolean m29828y0() {
        return m29823i0() * m29824l0() >= this.f27641d.mo29739f();
    }

    /* JADX INFO: renamed from: z0 */
    public final List<AbstractC7058k> m29829z0(List<AbstractC7058k> list, Map<Long, Set<c>> map) {
        ListIterator<AbstractC7058k> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            AbstractC7058k next = listIterator.next();
            if (map.containsKey(Long.valueOf(next.mo29747c()))) {
                AbstractC1261i.a aVarM7027l = next.mo29746b().m7027l();
                for (c cVar : map.get(Long.valueOf(next.mo29747c()))) {
                    aVarM7027l.m7030c(cVar.f27643a, cVar.f27644b);
                }
                listIterator.set(AbstractC7058k.m29781a(next.mo29747c(), next.mo29748d(), aVarM7027l.mo6988d()));
            }
        }
        return list;
    }
}
