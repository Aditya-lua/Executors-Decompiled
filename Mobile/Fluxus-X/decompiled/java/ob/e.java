package ob;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class e extends ge {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f27205d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Set f27206e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Map f27207f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Long f27208g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Long f27209h;

    public e(ve veVar) {
        super(veVar);
    }

    @Override // ob.ge
    public final boolean l() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0247  */
    /* JADX WARN: Code duplicated, block: B:105:0x0257  */
    /* JADX WARN: Code duplicated, block: B:107:0x0262  */
    /* JADX WARN: Code duplicated, block: B:111:0x028e A[Catch: all -> 0x02a9, SQLiteException -> 0x02ab, LOOP:11: B:111:0x028e->B:523:?, LOOP_START, TryCatch #5 {all -> 0x02a9, blocks: (B:109:0x0288, B:111:0x028e, B:113:0x029f, B:119:0x02ad, B:122:0x02c2, B:131:0x02d0), top: B:441:0x027e }] */
    /* JADX WARN: Code duplicated, block: B:113:0x029f A[Catch: all -> 0x02a9, SQLiteException -> 0x02ab, TryCatch #5 {all -> 0x02a9, blocks: (B:109:0x0288, B:111:0x028e, B:113:0x029f, B:119:0x02ad, B:122:0x02c2, B:131:0x02d0), top: B:441:0x027e }] */
    /* JADX WARN: Code duplicated, block: B:122:0x02c2 A[Catch: all -> 0x02a9, SQLiteException -> 0x02ab, TRY_ENTER, TRY_LEAVE, TryCatch #5 {all -> 0x02a9, blocks: (B:109:0x0288, B:111:0x028e, B:113:0x029f, B:119:0x02ad, B:122:0x02c2, B:131:0x02d0), top: B:441:0x027e }] */
    /* JADX WARN: Code duplicated, block: B:137:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:140:0x030b  */
    /* JADX WARN: Code duplicated, block: B:142:0x0322  */
    /* JADX WARN: Code duplicated, block: B:166:0x03f3  */
    /* JADX WARN: Code duplicated, block: B:168:0x03f7  */
    /* JADX WARN: Code duplicated, block: B:172:0x0404  */
    /* JADX WARN: Code duplicated, block: B:174:0x0424  */
    /* JADX WARN: Code duplicated, block: B:180:0x043b  */
    /* JADX WARN: Code duplicated, block: B:184:0x0457  */
    /* JADX WARN: Code duplicated, block: B:185:0x0460  */
    /* JADX WARN: Code duplicated, block: B:189:0x046e  */
    /* JADX WARN: Code duplicated, block: B:195:0x0485  */
    /* JADX WARN: Code duplicated, block: B:201:0x04bb  */
    /* JADX WARN: Code duplicated, block: B:204:0x04c4  */
    /* JADX WARN: Code duplicated, block: B:206:0x04ce  */
    /* JADX WARN: Code duplicated, block: B:208:0x04f0  */
    /* JADX WARN: Code duplicated, block: B:209:0x04f4  */
    /* JADX WARN: Code duplicated, block: B:214:0x050d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:239:0x05a4  */
    /* JADX WARN: Code duplicated, block: B:242:0x05b9  */
    /* JADX WARN: Code duplicated, block: B:248:0x05ee  */
    /* JADX WARN: Code duplicated, block: B:254:0x062b  */
    /* JADX WARN: Code duplicated, block: B:261:0x0653  */
    /* JADX WARN: Code duplicated, block: B:267:0x0662  */
    /* JADX WARN: Code duplicated, block: B:278:0x0691 A[LOOP:3: B:255:0x062d->B:278:0x0691, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:279:0x0694  */
    /* JADX WARN: Code duplicated, block: B:296:0x06cb  */
    /* JADX WARN: Code duplicated, block: B:300:0x06d5  */
    /* JADX WARN: Code duplicated, block: B:302:0x06d9  */
    /* JADX WARN: Code duplicated, block: B:306:0x06ed  */
    /* JADX WARN: Code duplicated, block: B:312:0x071e  */
    /* JADX WARN: Code duplicated, block: B:314:0x074b A[LOOP:5: B:310:0x0718->B:314:0x074b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:318:0x0767  */
    /* JADX WARN: Code duplicated, block: B:322:0x077c  */
    /* JADX WARN: Code duplicated, block: B:325:0x0784  */
    /* JADX WARN: Code duplicated, block: B:328:0x0793  */
    /* JADX WARN: Code duplicated, block: B:330:0x07a6  */
    /* JADX WARN: Code duplicated, block: B:334:0x07df A[Catch: all -> 0x0810, SQLiteException -> 0x0820, LOOP:7: B:334:0x07df->B:356:0x0847, LOOP_START, PHI: r4 r8
      0x07df: PHI (r4v39 java.util.Iterator) = (r4v31 java.util.Iterator), (r4v43 java.util.Iterator) binds: [B:333:0x07dd, B:356:0x0847] A[DONT_GENERATE, DONT_INLINE]
      0x07df: PHI (r8v49 java.lang.String) = (r8v46 java.lang.String), (r8v51 java.lang.String) binds: [B:333:0x07dd, B:356:0x0847] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #3 {SQLiteException -> 0x0820, blocks: (B:332:0x07d9, B:334:0x07df, B:335:0x07e4, B:337:0x07f5), top: B:439:0x07d9 }] */
    /* JADX WARN: Code duplicated, block: B:339:0x0805  */
    /* JADX WARN: Code duplicated, block: B:345:0x0816  */
    /* JADX WARN: Code duplicated, block: B:356:0x0847 A[LOOP:7: B:334:0x07df->B:356:0x0847, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:359:0x084e  */
    /* JADX WARN: Code duplicated, block: B:361:0x0854 A[PHI: r0 r13 r36
      0x0854: PHI (r0v120 java.util.Map) = (r0v122 java.util.Map), (r0v128 java.util.Map) binds: [B:370:0x0878, B:360:0x0852] A[DONT_GENERATE, DONT_INLINE]
      0x0854: PHI (r13v4 android.database.Cursor) = (r13v5 android.database.Cursor), (r13v6 android.database.Cursor) binds: [B:370:0x0878, B:360:0x0852] A[DONT_GENERATE, DONT_INLINE]
      0x0854: PHI (r36v4 java.util.Iterator) = (r36v5 java.util.Iterator), (r36v9 java.util.Iterator) binds: [B:370:0x0878, B:360:0x0852] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:376:0x0885  */
    /* JADX WARN: Code duplicated, block: B:380:0x0895  */
    /* JADX WARN: Code duplicated, block: B:384:0x08b8  */
    /* JADX WARN: Code duplicated, block: B:387:0x08c9  */
    /* JADX WARN: Code duplicated, block: B:389:0x08e2  */
    /* JADX WARN: Code duplicated, block: B:391:0x08f0  */
    /* JADX WARN: Code duplicated, block: B:393:0x08fb  */
    /* JADX WARN: Code duplicated, block: B:395:0x0928  */
    /* JADX WARN: Code duplicated, block: B:398:0x0932  */
    /* JADX WARN: Code duplicated, block: B:407:0x097d  */
    /* JADX WARN: Code duplicated, block: B:408:0x0986  */
    /* JADX WARN: Code duplicated, block: B:412:0x0999 A[PHI: r16 r37 r40
      0x0999: PHI (r16v8 java.lang.String) = (r16v9 java.lang.String), (r2v25 java.lang.String) binds: [B:411:0x0997, B:409:0x0987] A[DONT_GENERATE, DONT_INLINE]
      0x0999: PHI (r37v3 java.util.Map) = (r37v4 java.util.Map), (r37v5 java.util.Map) binds: [B:411:0x0997, B:409:0x0987] A[DONT_GENERATE, DONT_INLINE]
      0x0999: PHI (r40v3 w1.a) = (r40v4 w1.a), (r3v31 w1.a) binds: [B:411:0x0997, B:409:0x0987] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:417:0x09c0  */
    /* JADX WARN: Code duplicated, block: B:430:0x0a48  */
    /* JADX WARN: Code duplicated, block: B:490:0x05c7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:491:0x05e0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:493:0x05b3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:494:0x05b3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:496:0x068c A[EDGE_INSN: B:496:0x068c->B:277:0x068c BREAK  A[LOOP:3: B:255:0x062d->B:278:0x0691], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:498:0x070d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:499:0x06ff A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:503:0x075f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:504:0x0759 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:508:0x0842 A[EDGE_INSN: B:508:0x0842->B:355:0x0842 BREAK  A[LOOP:7: B:334:0x07df->B:356:0x0847], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:509:0x08a7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:511:0x099e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:512:0x0991 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:513:0x0969 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:517:0x0a1a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:519:0x09ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:525:0x056f A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:532:0x0447 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:534:0x0435 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:537:0x0491 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:540:0x047f A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:551:0x0328 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x016d  */
    /* JADX WARN: Code duplicated, block: B:564:0x020d A[EDGE_INSN: B:564:0x020d->B:83:0x020d BREAK  A[LOOP:20: B:70:0x01c1->B:84:0x0212], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x01a2 A[Catch: all -> 0x01b0, SQLiteException -> 0x01b3, TRY_LEAVE, TryCatch #13 {all -> 0x01b0, blocks: (B:59:0x019c, B:61:0x01a2, B:69:0x01bc, B:70:0x01c1, B:71:0x01cb, B:72:0x01db, B:81:0x0207, B:74:0x01ea, B:78:0x01fa, B:80:0x0200, B:98:0x0230), top: B:453:0x019c }] */
    /* JADX WARN: Code duplicated, block: B:69:0x01bc A[Catch: all -> 0x01b0, SQLiteException -> 0x01b3, TRY_ENTER, TryCatch #13 {all -> 0x01b0, blocks: (B:59:0x019c, B:61:0x01a2, B:69:0x01bc, B:70:0x01c1, B:71:0x01cb, B:72:0x01db, B:81:0x0207, B:74:0x01ea, B:78:0x01fa, B:80:0x0200, B:98:0x0230), top: B:453:0x019c }] */
    /* JADX WARN: Code duplicated, block: B:84:0x0212 A[LOOP:20: B:70:0x01c1->B:84:0x0212, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public final List m(String str, List list, List list2, Long l10, Long l11, boolean z10) throws Throwable {
        int i10;
        int i11;
        boolean z11;
        Map map;
        Cursor cursor;
        boolean z12;
        String str2;
        Cursor cursorQuery;
        Map map2;
        HashSet hashSet;
        HashSet<Integer> hashSet2;
        Map map3;
        com.google.android.gms.internal.measurement.j7 j7Var;
        BitSet bitSet;
        BitSet bitSet2;
        w1.a aVar;
        com.google.android.gms.internal.measurement.j7 j7Var2;
        List list3;
        int i12;
        boolean z13;
        Iterator it;
        com.google.android.gms.internal.measurement.l7 l7Var;
        Long lValueOf;
        String str3;
        Map aVar2;
        SQLiteDatabase sQLiteDatabaseU0;
        ?? r10;
        Cursor cursorRawQuery;
        w1.a aVar3;
        Iterator it2;
        Integer num;
        com.google.android.gms.internal.measurement.j7 j7Var3;
        List list4;
        Map map4;
        HashSet hashSet3;
        Iterator it3;
        Integer numValueOf;
        List arrayList;
        String str4;
        String str5;
        String str6;
        ArrayList arrayList2;
        w wVarF0;
        String str7;
        ContentValues contentValues;
        w1.a aVar4;
        Iterator it4;
        String strH;
        Map map5;
        Iterator it5;
        Iterator it6;
        boolean zK;
        Map map6;
        com.google.android.gms.internal.measurement.l4 l4Var;
        l7 l7Var2;
        Integer numValueOf2;
        d dVar;
        Integer numValueOf3;
        w wVarF1;
        String str8;
        w1.a aVar5;
        Cursor cursor2;
        String str9;
        Cursor cursorQuery2;
        Integer numValueOf4;
        List list5;
        List arrayList3;
        qf qfVar;
        w1.a aVar6;
        Iterator it7;
        com.google.android.gms.internal.measurement.s6 s6Var;
        com.google.android.gms.internal.measurement.s6 s6VarA;
        ve veVar;
        e0 e0VarZ;
        long j10;
        String strI;
        Map map7;
        e0 e0Var;
        Iterator it8;
        Integer num2;
        int iIntValue;
        Iterator it9;
        boolean zK2;
        Map map8;
        Iterator it10;
        long j11;
        b bVar;
        w wVarF2;
        String str10;
        w1.a aVar7;
        String str11;
        Cursor cursor3;
        Cursor cursorQuery3;
        Cursor cursor4;
        Integer numValueOf5;
        List list6;
        List arrayList4;
        w1.a aVar8;
        int i13;
        Cursor cursorQuery4;
        List arrayList5;
        o9.s.f(str);
        o9.s.l(list);
        o9.s.l(list2);
        this.f27205d = str;
        this.f27206e = new HashSet();
        this.f27207f = new w1.a();
        this.f27208g = l10;
        this.f27209h = l11;
        Iterator it11 = list.iterator();
        while (true) {
            i10 = 0;
            i11 = 1;
            if (!it11.hasNext()) {
                z11 = false;
                break;
            }
            if ("_s".equals(((com.google.android.gms.internal.measurement.s6) it11.next()).I())) {
                z11 = true;
                break;
            }
        }
        com.google.android.gms.internal.measurement.cf.a();
        l7 l7Var3 = this.f27641a;
        boolean zH = l7Var3.w().H(this.f27205d, e5.G0);
        com.google.android.gms.internal.measurement.cf.a();
        boolean zH2 = l7Var3.w().H(this.f27205d, e5.F0);
        if (z11) {
            w wVarF3 = this.b.F0();
            String str12 = this.f27205d;
            wVarF3.j();
            wVarF3.h();
            o9.s.f(str12);
            ContentValues contentValues2 = new ContentValues();
            contentValues2.put("current_session_count", (Integer) 0);
            try {
                wVarF3.u0().update("events", contentValues2, "app_id = ?", new String[]{str12});
            } catch (SQLiteException e10) {
                wVarF3.f27641a.a().o().c("Error resetting session-scoped event counts. appId", b6.x(str12), e10);
            }
        }
        Map map9 = Collections.EMPTY_MAP;
        String str13 = "data";
        String str14 = "audience_id";
        if (zH2 && zH) {
            w wVarF4 = this.b.F0();
            String str15 = this.f27205d;
            o9.s.f(str15);
            w1.a aVar9 = new w1.a();
            try {
                cursorQuery4 = wVarF4.u0().query("event_filters", new String[]{"audience_id", "data"}, "app_id=?", new String[]{str15}, null, null, null);
                try {
                    try {
                        if (cursorQuery4.moveToFirst()) {
                            while (true) {
                                try {
                                    com.google.android.gms.internal.measurement.d4 d4Var = (com.google.android.gms.internal.measurement.d4) ((com.google.android.gms.internal.measurement.c4) af.W(com.google.android.gms.internal.measurement.d4.S(), cursorQuery4.getBlob(i11))).v();
                                    if (d4Var.L()) {
                                        Integer numValueOf6 = Integer.valueOf(cursorQuery4.getInt(i10));
                                        List list7 = (List) aVar9.get(numValueOf6);
                                        if (list7 == null) {
                                            arrayList5 = new ArrayList();
                                            aVar9.put(numValueOf6, arrayList5);
                                        } else {
                                            arrayList5 = list7;
                                        }
                                        arrayList5.add(d4Var);
                                    }
                                } catch (IOException e11) {
                                    wVarF4.f27641a.a().o().c("Failed to merge filter. appId", b6.x(str15), e11);
                                }
                                if (!cursorQuery4.moveToNext()) {
                                    break;
                                }
                                i10 = 0;
                                i11 = 1;
                            }
                            cursorQuery4.close();
                            map = aVar9;
                        } else {
                            cursorQuery4.close();
                            map = map9;
                        }
                    } catch (SQLiteException e12) {
                        e = e12;
                        wVarF4.f27641a.a().o().c("Database error querying filters. appId", b6.x(str15), e);
                        map9 = Collections.EMPTY_MAP;
                        if (cursorQuery4 != null) {
                        }
                        map = map9;
                        w wVarF5 = this.b.F0();
                        String str16 = this.f27205d;
                        wVarF5.j();
                        wVarF5.h();
                        o9.s.f(str16);
                        cursorQuery = wVarF5.u0().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{str16}, null, null, null);
                        try {
                            try {
                                if (cursorQuery.moveToFirst()) {
                                    aVar8 = new w1.a();
                                    while (true) {
                                        i13 = cursorQuery.getInt(0);
                                        try {
                                            aVar8.put(Integer.valueOf(i13), (com.google.android.gms.internal.measurement.j7) ((com.google.android.gms.internal.measurement.i7) af.W(com.google.android.gms.internal.measurement.j7.N(), cursorQuery.getBlob(1))).v());
                                            z12 = z11;
                                            str2 = str13;
                                        } catch (IOException e13) {
                                            z12 = z11;
                                            str2 = str13;
                                            try {
                                                wVarF5.f27641a.a().o().d("Failed to merge filter results. appId, audienceId, error", b6.x(str16), Integer.valueOf(i13), e13);
                                            } catch (SQLiteException e14) {
                                                e = e14;
                                                str14 = str14;
                                                wVarF5.f27641a.a().o().c("Database error querying filter results. appId", b6.x(str16), e);
                                                Map map10 = Collections.EMPTY_MAP;
                                                if (cursorQuery != null) {
                                                    cursorQuery.close();
                                                }
                                                map2 = map10;
                                                if (!map2.isEmpty()) {
                                                    hashSet = new HashSet(map2.keySet());
                                                    if (z12) {
                                                        String str17 = this.f27205d;
                                                        w wVarF6 = this.b.F0();
                                                        str3 = this.f27205d;
                                                        wVarF6.j();
                                                        wVarF6.h();
                                                        o9.s.f(str3);
                                                        aVar2 = new w1.a();
                                                        sQLiteDatabaseU0 = wVarF6.u0();
                                                        try {
                                                            try {
                                                                cursorRawQuery = sQLiteDatabaseU0.rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str3, str3});
                                                                try {
                                                                    if (cursorRawQuery.moveToFirst()) {
                                                                        do {
                                                                            numValueOf = Integer.valueOf(cursorRawQuery.getInt(0));
                                                                            arrayList = (List) aVar2.get(numValueOf);
                                                                            if (arrayList == null) {
                                                                                arrayList = new ArrayList();
                                                                                aVar2.put(numValueOf, arrayList);
                                                                            }
                                                                            arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                                                                        } while (cursorRawQuery.moveToNext());
                                                                    } else {
                                                                        aVar2 = Collections.EMPTY_MAP;
                                                                    }
                                                                } catch (SQLiteException e15) {
                                                                    e = e15;
                                                                    wVarF6.f27641a.a().o().c("Database error querying scoped filters. appId", b6.x(str3), e);
                                                                    aVar2 = Collections.EMPTY_MAP;
                                                                    if (cursorRawQuery != null) {
                                                                    }
                                                                    o9.s.f(str17);
                                                                    o9.s.l(map2);
                                                                    aVar3 = new w1.a();
                                                                    if (!map2.isEmpty()) {
                                                                        it2 = map2.keySet().iterator();
                                                                        while (it2.hasNext()) {
                                                                            num = (Integer) it2.next();
                                                                            num.intValue();
                                                                            j7Var3 = (com.google.android.gms.internal.measurement.j7) map2.get(num);
                                                                            list4 = (List) aVar2.get(num);
                                                                            if (list4 != null) {
                                                                            }
                                                                            map4 = aVar2;
                                                                            hashSet3 = hashSet;
                                                                            it3 = it2;
                                                                            aVar3.put(num, j7Var3);
                                                                            aVar2 = map4;
                                                                            hashSet = hashSet3;
                                                                            it2 = it3;
                                                                        }
                                                                    }
                                                                    hashSet2 = hashSet;
                                                                    map3 = aVar3;
                                                                    for (Integer num3 : hashSet2) {
                                                                        num3.intValue();
                                                                        j7Var = (com.google.android.gms.internal.measurement.j7) map3.get(num3);
                                                                        bitSet = new BitSet();
                                                                        bitSet2 = new BitSet();
                                                                        aVar = new w1.a();
                                                                        if (j7Var != null) {
                                                                            for (com.google.android.gms.internal.measurement.q6 q6Var : j7Var.J()) {
                                                                                if (q6Var.F()) {
                                                                                    Map map11 = map3;
                                                                                    Integer numValueOf7 = Integer.valueOf(q6Var.G());
                                                                                    if (q6Var.H()) {
                                                                                        lValueOf = Long.valueOf(q6Var.I());
                                                                                    } else {
                                                                                        lValueOf = null;
                                                                                    }
                                                                                    aVar.put(numValueOf7, lValueOf);
                                                                                    map3 = map11;
                                                                                }
                                                                            }
                                                                        }
                                                                        Map map12 = map3;
                                                                        w1.a aVar10 = new w1.a();
                                                                        if (j7Var != null) {
                                                                            it = j7Var.L().iterator();
                                                                            while (it.hasNext()) {
                                                                                l7Var = (com.google.android.gms.internal.measurement.l7) it.next();
                                                                                if (!l7Var.F()) {
                                                                                }
                                                                            }
                                                                        }
                                                                        j7Var2 = j7Var;
                                                                        if (j7Var2 != null) {
                                                                            i12 = 0;
                                                                            while (i12 < j7Var2.G() * 64) {
                                                                                if (af.P(j7Var2.F(), i12)) {
                                                                                    z13 = zH;
                                                                                    this.f27641a.a().w().c("Filter already evaluated. audience ID, filter ID", num3, Integer.valueOf(i12));
                                                                                    bitSet2.set(i12);
                                                                                    if (af.P(j7Var2.H(), i12)) {
                                                                                        bitSet.set(i12);
                                                                                    }
                                                                                    i12++;
                                                                                    zH = z13;
                                                                                } else {
                                                                                    z13 = zH;
                                                                                }
                                                                                aVar.remove(Integer.valueOf(i12));
                                                                                i12++;
                                                                                zH = z13;
                                                                            }
                                                                        }
                                                                        boolean z14 = zH;
                                                                        com.google.android.gms.internal.measurement.j7 j7Var4 = (com.google.android.gms.internal.measurement.j7) map2.get(num3);
                                                                        if (!zH2) {
                                                                        }
                                                                        this.f27207f.put(num3, new pf(this, this.f27205d, j7Var4, bitSet, bitSet2, aVar, aVar10, null));
                                                                        str2 = str2;
                                                                        map = map;
                                                                        str14 = str14;
                                                                        map2 = map2;
                                                                        zH = z14;
                                                                        map3 = map12;
                                                                    }
                                                                    str4 = str2;
                                                                    str5 = str14;
                                                                    str6 = "Skipping failed audience ID";
                                                                    if (!list.isEmpty()) {
                                                                        qfVar = new qf(this, null);
                                                                        aVar6 = new w1.a();
                                                                        it7 = list.iterator();
                                                                        while (it7.hasNext()) {
                                                                            s6Var = (com.google.android.gms.internal.measurement.s6) it7.next();
                                                                            s6VarA = qfVar.a(this.f27205d, s6Var);
                                                                            if (s6VarA != null) {
                                                                                veVar = this.b;
                                                                                e0VarZ = veVar.F0().Z(this.f27205d, s6Var, s6VarA.I());
                                                                                veVar.F0().w0(e0VarZ);
                                                                                if (z10) {
                                                                                    continue;
                                                                                } else {
                                                                                    j10 = e0VarZ.f27211c;
                                                                                    strI = s6VarA.I();
                                                                                    map7 = (Map) aVar6.get(strI);
                                                                                    if (map7 == null) {
                                                                                        wVarF2 = veVar.F0();
                                                                                        str10 = this.f27205d;
                                                                                        wVarF2.j();
                                                                                        wVarF2.h();
                                                                                        o9.s.f(str10);
                                                                                        o9.s.f(strI);
                                                                                        aVar7 = new w1.a();
                                                                                        try {
                                                                                            try {
                                                                                                str11 = str10;
                                                                                                try {
                                                                                                    cursorQuery3 = wVarF2.u0().query("event_filters", new String[]{str5, str4}, "app_id=? AND event_name=?", new String[]{str10, strI}, null, null, null);
                                                                                                    try {
                                                                                                        try {
                                                                                                            if (cursorQuery3.moveToFirst()) {
                                                                                                                e0Var = e0VarZ;
                                                                                                                while (true) {
                                                                                                                    try {
                                                                                                                        try {
                                                                                                                            com.google.android.gms.internal.measurement.d4 d4Var2 = (com.google.android.gms.internal.measurement.d4) ((com.google.android.gms.internal.measurement.c4) af.W(com.google.android.gms.internal.measurement.d4.S(), cursorQuery3.getBlob(1))).v();
                                                                                                                            numValueOf5 = Integer.valueOf(cursorQuery3.getInt(0));
                                                                                                                            list6 = (List) aVar7.get(numValueOf5);
                                                                                                                            if (list6 == null) {
                                                                                                                                cursor4 = cursorQuery3;
                                                                                                                                try {
                                                                                                                                    arrayList4 = new ArrayList();
                                                                                                                                    aVar7.put(numValueOf5, arrayList4);
                                                                                                                                } catch (SQLiteException e16) {
                                                                                                                                    e = e16;
                                                                                                                                    cursor3 = cursor4;
                                                                                                                                    try {
                                                                                                                                        wVarF2.f27641a.a().o().c("Database error querying filters. appId", b6.x(str11), e);
                                                                                                                                        map7 = Collections.EMPTY_MAP;
                                                                                                                                        if (cursor3 != null) {
                                                                                                                                            cursor3.close();
                                                                                                                                        }
                                                                                                                                    } catch (Throwable th2) {
                                                                                                                                        th = th2;
                                                                                                                                        if (cursor3 != null) {
                                                                                                                                            cursor3.close();
                                                                                                                                        }
                                                                                                                                        throw th;
                                                                                                                                    }
                                                                                                                                } catch (Throwable th3) {
                                                                                                                                    th = th3;
                                                                                                                                    cursor3 = cursor4;
                                                                                                                                    if (cursor3 != null) {
                                                                                                                                        cursor3.close();
                                                                                                                                    }
                                                                                                                                    throw th;
                                                                                                                                }
                                                                                                                            } else {
                                                                                                                                cursor4 = cursorQuery3;
                                                                                                                                arrayList4 = list6;
                                                                                                                            }
                                                                                                                            arrayList4.add(d4Var2);
                                                                                                                        } catch (IOException e17) {
                                                                                                                            cursor4 = cursorQuery3;
                                                                                                                            wVarF2.f27641a.a().o().c("Failed to merge filter. appId", b6.x(str11), e17);
                                                                                                                        }
                                                                                                                        if (!cursor4.moveToNext()) {
                                                                                                                            break;
                                                                                                                        }
                                                                                                                        cursorQuery3 = cursor4;
                                                                                                                    } catch (SQLiteException e18) {
                                                                                                                        e = e18;
                                                                                                                        cursor4 = cursorQuery3;
                                                                                                                    }
                                                                                                                }
                                                                                                                cursor4.close();
                                                                                                                map7 = aVar7;
                                                                                                            } else {
                                                                                                                e0Var = e0VarZ;
                                                                                                                map7 = Collections.EMPTY_MAP;
                                                                                                                cursorQuery3.close();
                                                                                                            }
                                                                                                        } catch (Throwable th4) {
                                                                                                            th = th4;
                                                                                                            cursor4 = cursorQuery3;
                                                                                                        }
                                                                                                    } catch (SQLiteException e19) {
                                                                                                        e = e19;
                                                                                                        cursor4 = cursorQuery3;
                                                                                                        e0Var = e0VarZ;
                                                                                                    }
                                                                                                } catch (SQLiteException e20) {
                                                                                                    e = e20;
                                                                                                    e0Var = e0VarZ;
                                                                                                    cursor3 = null;
                                                                                                    wVarF2.f27641a.a().o().c("Database error querying filters. appId", b6.x(str11), e);
                                                                                                    map7 = Collections.EMPTY_MAP;
                                                                                                    if (cursor3 != null) {
                                                                                                        cursor3.close();
                                                                                                    }
                                                                                                    aVar6.put(strI, map7);
                                                                                                    it8 = map7.keySet().iterator();
                                                                                                    while (it8.hasNext()) {
                                                                                                        num2 = (Integer) it8.next();
                                                                                                        iIntValue = num2.intValue();
                                                                                                        if (this.f27206e.contains(num2)) {
                                                                                                            this.f27641a.a().w().b("Skipping failed audience ID", num2);
                                                                                                        } else {
                                                                                                            it9 = ((List) map7.get(num2)).iterator();
                                                                                                            zK2 = true;
                                                                                                            while (true) {
                                                                                                                if (!it9.hasNext()) {
                                                                                                                    map8 = map7;
                                                                                                                    it10 = it8;
                                                                                                                    j11 = j10;
                                                                                                                    break;
                                                                                                                }
                                                                                                                com.google.android.gms.internal.measurement.d4 d4Var3 = (com.google.android.gms.internal.measurement.d4) it9.next();
                                                                                                                map8 = map7;
                                                                                                                it10 = it8;
                                                                                                                bVar = new b(this, this.f27205d, iIntValue, d4Var3);
                                                                                                                j11 = j10;
                                                                                                                zK2 = bVar.k(this.f27208g, this.f27209h, s6VarA, j11, e0Var, o(iIntValue, d4Var3.G()));
                                                                                                                if (!zK2) {
                                                                                                                    this.f27206e.add(num2);
                                                                                                                    break;
                                                                                                                }
                                                                                                                n(num2).a(bVar);
                                                                                                                j10 = j11;
                                                                                                                map7 = map8;
                                                                                                                it8 = it10;
                                                                                                            }
                                                                                                            if (!zK2) {
                                                                                                                this.f27206e.add(num2);
                                                                                                            }
                                                                                                            j10 = j11;
                                                                                                            map7 = map8;
                                                                                                            it8 = it10;
                                                                                                        }
                                                                                                    }
                                                                                                    it7 = it7;
                                                                                                    qfVar = qfVar;
                                                                                                }
                                                                                            } catch (Throwable th5) {
                                                                                                th = th5;
                                                                                                cursor3 = null;
                                                                                            }
                                                                                        } catch (SQLiteException e21) {
                                                                                            e = e21;
                                                                                            str11 = str10;
                                                                                        }
                                                                                        aVar6.put(strI, map7);
                                                                                    } else {
                                                                                        e0Var = e0VarZ;
                                                                                    }
                                                                                    it8 = map7.keySet().iterator();
                                                                                    while (it8.hasNext()) {
                                                                                        num2 = (Integer) it8.next();
                                                                                        iIntValue = num2.intValue();
                                                                                        if (this.f27206e.contains(num2)) {
                                                                                            this.f27641a.a().w().b("Skipping failed audience ID", num2);
                                                                                        } else {
                                                                                            it9 = ((List) map7.get(num2)).iterator();
                                                                                            zK2 = true;
                                                                                            while (true) {
                                                                                                if (!it9.hasNext()) {
                                                                                                    map8 = map7;
                                                                                                    it10 = it8;
                                                                                                    j11 = j10;
                                                                                                    break;
                                                                                                }
                                                                                                com.google.android.gms.internal.measurement.d4 d4Var4 = (com.google.android.gms.internal.measurement.d4) it9.next();
                                                                                                map8 = map7;
                                                                                                it10 = it8;
                                                                                                bVar = new b(this, this.f27205d, iIntValue, d4Var4);
                                                                                                j11 = j10;
                                                                                                zK2 = bVar.k(this.f27208g, this.f27209h, s6VarA, j11, e0Var, o(iIntValue, d4Var4.G()));
                                                                                                if (!zK2) {
                                                                                                    this.f27206e.add(num2);
                                                                                                    break;
                                                                                                }
                                                                                                n(num2).a(bVar);
                                                                                                j10 = j11;
                                                                                                map7 = map8;
                                                                                                it8 = it10;
                                                                                            }
                                                                                            if (!zK2) {
                                                                                                this.f27206e.add(num2);
                                                                                            }
                                                                                            j10 = j11;
                                                                                            map7 = map8;
                                                                                            it8 = it10;
                                                                                        }
                                                                                    }
                                                                                    it7 = it7;
                                                                                    qfVar = qfVar;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    if (!z10) {
                                                                        return new ArrayList();
                                                                    }
                                                                    if (!list2.isEmpty()) {
                                                                        aVar4 = new w1.a();
                                                                        it4 = list2.iterator();
                                                                        while (it4.hasNext()) {
                                                                            com.google.android.gms.internal.measurement.v7 v7Var = (com.google.android.gms.internal.measurement.v7) it4.next();
                                                                            strH = v7Var.H();
                                                                            map5 = (Map) aVar4.get(strH);
                                                                            if (map5 == null) {
                                                                                wVarF1 = this.b.F0();
                                                                                str8 = this.f27205d;
                                                                                wVarF1.j();
                                                                                wVarF1.h();
                                                                                o9.s.f(str8);
                                                                                o9.s.f(strH);
                                                                                aVar5 = new w1.a();
                                                                                try {
                                                                                    cursorQuery2 = wVarF1.u0().query("property_filters", new String[]{str5, str4}, "app_id=? AND property_name=?", new String[]{str8, strH}, null, null, null);
                                                                                    try {
                                                                                        try {
                                                                                            if (cursorQuery2.moveToFirst()) {
                                                                                                while (true) {
                                                                                                    try {
                                                                                                        com.google.android.gms.internal.measurement.l4 l4Var2 = (com.google.android.gms.internal.measurement.l4) ((com.google.android.gms.internal.measurement.k4) af.W(com.google.android.gms.internal.measurement.l4.N(), cursorQuery2.getBlob(1))).v();
                                                                                                        numValueOf4 = Integer.valueOf(cursorQuery2.getInt(0));
                                                                                                        list5 = (List) aVar5.get(numValueOf4);
                                                                                                        if (list5 == null) {
                                                                                                            it5 = it4;
                                                                                                            try {
                                                                                                                arrayList3 = new ArrayList();
                                                                                                                aVar5.put(numValueOf4, arrayList3);
                                                                                                            } catch (SQLiteException e22) {
                                                                                                                e = e22;
                                                                                                                str9 = str8;
                                                                                                                wVarF1.f27641a.a().o().c("Database error querying filters. appId", b6.x(str9), e);
                                                                                                                map5 = Collections.EMPTY_MAP;
                                                                                                                if (cursorQuery2 != null) {
                                                                                                                    cursorQuery2.close();
                                                                                                                }
                                                                                                                aVar4.put(strH, map5);
                                                                                                                for (Integer num4 : map5.keySet()) {
                                                                                                                    int iIntValue2 = num4.intValue();
                                                                                                                    if (this.f27206e.contains(num4)) {
                                                                                                                        this.f27641a.a().w().b(str6, num4);
                                                                                                                        break;
                                                                                                                    }
                                                                                                                    it6 = ((List) map5.get(num4)).iterator();
                                                                                                                    zK = true;
                                                                                                                    while (true) {
                                                                                                                        if (it6.hasNext()) {
                                                                                                                            l4Var = (com.google.android.gms.internal.measurement.l4) it6.next();
                                                                                                                            l7Var2 = this.f27641a;
                                                                                                                            map6 = map5;
                                                                                                                            if (Log.isLoggable(l7Var2.a().z(), 2)) {
                                                                                                                                z5 z5VarW = l7Var2.a().w();
                                                                                                                                if (l4Var.F()) {
                                                                                                                                    numValueOf3 = Integer.valueOf(l4Var.G());
                                                                                                                                } else {
                                                                                                                                    numValueOf3 = null;
                                                                                                                                }
                                                                                                                                z5VarW.d("Evaluating filter. audience, filter, property", num4, numValueOf3, l7Var2.D().c(l4Var.H()));
                                                                                                                                l7Var2.a().w().b("Filter definition", this.b.K0().M(l4Var));
                                                                                                                            }
                                                                                                                            if (l4Var.F()) {
                                                                                                                            }
                                                                                                                            z5 z5VarR = l7Var2.a().r();
                                                                                                                            Object objX = b6.x(this.f27205d);
                                                                                                                            if (l4Var.F()) {
                                                                                                                                numValueOf2 = Integer.valueOf(l4Var.G());
                                                                                                                            } else {
                                                                                                                                numValueOf2 = null;
                                                                                                                            }
                                                                                                                            z5VarR.c("Invalid property filter ID. appId, id", objX, String.valueOf(numValueOf2));
                                                                                                                            this.f27206e.add(num4);
                                                                                                                            map5 = map6;
                                                                                                                            aVar4 = aVar4;
                                                                                                                            str6 = str6;
                                                                                                                        } else {
                                                                                                                            map6 = map5;
                                                                                                                            str6 = str6;
                                                                                                                            aVar4 = aVar4;
                                                                                                                        }
                                                                                                                        if (!zK) {
                                                                                                                            this.f27206e.add(num4);
                                                                                                                        }
                                                                                                                        map5 = map6;
                                                                                                                        aVar4 = aVar4;
                                                                                                                        str6 = str6;
                                                                                                                        n(num4).a(dVar);
                                                                                                                        map5 = map6;
                                                                                                                        aVar4 = aVar4;
                                                                                                                        str6 = str6;
                                                                                                                    }
                                                                                                                }
                                                                                                                it4 = it5;
                                                                                                            }
                                                                                                        } else {
                                                                                                            it5 = it4;
                                                                                                            arrayList3 = list5;
                                                                                                        }
                                                                                                        arrayList3.add(l4Var2);
                                                                                                        str9 = str8;
                                                                                                    } catch (IOException e23) {
                                                                                                        it5 = it4;
                                                                                                        str9 = str8;
                                                                                                        wVarF1.f27641a.a().o().c("Failed to merge filter", b6.x(str9), e23);
                                                                                                    }
                                                                                                    try {
                                                                                                        if (!cursorQuery2.moveToNext()) {
                                                                                                            break;
                                                                                                        }
                                                                                                        it4 = it5;
                                                                                                        str8 = str9;
                                                                                                    } catch (SQLiteException e24) {
                                                                                                        e = e24;
                                                                                                        wVarF1.f27641a.a().o().c("Database error querying filters. appId", b6.x(str9), e);
                                                                                                        map5 = Collections.EMPTY_MAP;
                                                                                                        if (cursorQuery2 != null) {
                                                                                                            cursorQuery2.close();
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                cursorQuery2.close();
                                                                                                map5 = aVar5;
                                                                                            } else {
                                                                                                it5 = it4;
                                                                                                map5 = Collections.EMPTY_MAP;
                                                                                                cursorQuery2.close();
                                                                                            }
                                                                                        } catch (SQLiteException e25) {
                                                                                            e = e25;
                                                                                            it5 = it4;
                                                                                        }
                                                                                    } catch (Throwable th6) {
                                                                                        th = th6;
                                                                                        cursor2 = cursorQuery2;
                                                                                        if (cursor2 != null) {
                                                                                            cursor2.close();
                                                                                        }
                                                                                        throw th;
                                                                                    }
                                                                                } catch (SQLiteException e26) {
                                                                                    e = e26;
                                                                                    it5 = it4;
                                                                                    str9 = str8;
                                                                                    cursorQuery2 = null;
                                                                                } catch (Throwable th7) {
                                                                                    th = th7;
                                                                                    cursor2 = null;
                                                                                }
                                                                                aVar4.put(strH, map5);
                                                                            } else {
                                                                                it5 = it4;
                                                                            }
                                                                            while (r4.hasNext()) {
                                                                                int iIntValue3 = num4.intValue();
                                                                                if (this.f27206e.contains(num4)) {
                                                                                    this.f27641a.a().w().b(str6, num4);
                                                                                    break;
                                                                                    break;
                                                                                }
                                                                                it6 = ((List) map5.get(num4)).iterator();
                                                                                zK = true;
                                                                                while (true) {
                                                                                    if (it6.hasNext()) {
                                                                                        l4Var = (com.google.android.gms.internal.measurement.l4) it6.next();
                                                                                        l7Var2 = this.f27641a;
                                                                                        map6 = map5;
                                                                                        if (Log.isLoggable(l7Var2.a().z(), 2)) {
                                                                                            z5 z5VarW2 = l7Var2.a().w();
                                                                                            if (l4Var.F()) {
                                                                                                numValueOf3 = Integer.valueOf(l4Var.G());
                                                                                            } else {
                                                                                                numValueOf3 = null;
                                                                                            }
                                                                                            z5VarW2.d("Evaluating filter. audience, filter, property", num4, numValueOf3, l7Var2.D().c(l4Var.H()));
                                                                                            l7Var2.a().w().b("Filter definition", this.b.K0().M(l4Var));
                                                                                        }
                                                                                        if (l4Var.F()) {
                                                                                        }
                                                                                        z5 z5VarR2 = l7Var2.a().r();
                                                                                        Object objX2 = b6.x(this.f27205d);
                                                                                        if (l4Var.F()) {
                                                                                            numValueOf2 = Integer.valueOf(l4Var.G());
                                                                                        } else {
                                                                                            numValueOf2 = null;
                                                                                        }
                                                                                        z5VarR2.c("Invalid property filter ID. appId, id", objX2, String.valueOf(numValueOf2));
                                                                                        this.f27206e.add(num4);
                                                                                        map5 = map6;
                                                                                        aVar4 = aVar4;
                                                                                        str6 = str6;
                                                                                    } else {
                                                                                        map6 = map5;
                                                                                        str6 = str6;
                                                                                        aVar4 = aVar4;
                                                                                    }
                                                                                    if (!zK) {
                                                                                        this.f27206e.add(num4);
                                                                                    }
                                                                                    map5 = map6;
                                                                                    aVar4 = aVar4;
                                                                                    str6 = str6;
                                                                                    n(num4).a(dVar);
                                                                                    map5 = map6;
                                                                                    aVar4 = aVar4;
                                                                                    str6 = str6;
                                                                                }
                                                                            }
                                                                            it4 = it5;
                                                                        }
                                                                    }
                                                                    arrayList2 = new ArrayList();
                                                                    Set<Integer> setKeySet = this.f27207f.keySet();
                                                                    setKeySet.removeAll(this.f27206e);
                                                                    for (Integer num5 : setKeySet) {
                                                                        int iIntValue4 = num5.intValue();
                                                                        pf pfVar = (pf) this.f27207f.get(num5);
                                                                        o9.s.l(pfVar);
                                                                        com.google.android.gms.internal.measurement.g6 g6VarB = pfVar.b(iIntValue4);
                                                                        arrayList2.add(g6VarB);
                                                                        wVarF0 = this.b.F0();
                                                                        str7 = this.f27205d;
                                                                        com.google.android.gms.internal.measurement.j7 j7VarH = g6VarB.H();
                                                                        wVarF0.j();
                                                                        wVarF0.h();
                                                                        o9.s.f(str7);
                                                                        o9.s.l(j7VarH);
                                                                        byte[] bArrD = j7VarH.d();
                                                                        contentValues = new ContentValues();
                                                                        contentValues.put("app_id", str7);
                                                                        contentValues.put(str5, num5);
                                                                        contentValues.put("current_results", bArrD);
                                                                        try {
                                                                            try {
                                                                                if (wVarF0.u0().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                                                                                    wVarF0.f27641a.a().o().b("Failed to insert filter results (got -1). appId", b6.x(str7));
                                                                                }
                                                                            } catch (SQLiteException e27) {
                                                                                e = e27;
                                                                                wVarF0.f27641a.a().o().c("Error storing filter results. appId", b6.x(str7), e);
                                                                            }
                                                                        } catch (SQLiteException e28) {
                                                                            e = e28;
                                                                        }
                                                                    }
                                                                    return arrayList2;
                                                                }
                                                            } catch (Throwable th8) {
                                                                th = th8;
                                                                r10 = sQLiteDatabaseU0;
                                                                if (r10 != 0) {
                                                                    r10.close();
                                                                }
                                                                throw th;
                                                            }
                                                        } catch (SQLiteException e29) {
                                                            e = e29;
                                                            cursorRawQuery = null;
                                                        } catch (Throwable th9) {
                                                            th = th9;
                                                            r10 = 0;
                                                            if (r10 != 0) {
                                                                r10.close();
                                                            }
                                                            throw th;
                                                        }
                                                        cursorRawQuery.close();
                                                        o9.s.f(str17);
                                                        o9.s.l(map2);
                                                        aVar3 = new w1.a();
                                                        if (!map2.isEmpty()) {
                                                            it2 = map2.keySet().iterator();
                                                            while (it2.hasNext()) {
                                                                num = (Integer) it2.next();
                                                                num.intValue();
                                                                j7Var3 = (com.google.android.gms.internal.measurement.j7) map2.get(num);
                                                                list4 = (List) aVar2.get(num);
                                                                if (list4 != null) {
                                                                }
                                                                map4 = aVar2;
                                                                hashSet3 = hashSet;
                                                                it3 = it2;
                                                                aVar3.put(num, j7Var3);
                                                                aVar2 = map4;
                                                                hashSet = hashSet3;
                                                                it2 = it3;
                                                            }
                                                        }
                                                        hashSet2 = hashSet;
                                                        map3 = aVar3;
                                                    } else {
                                                        hashSet2 = hashSet;
                                                        map3 = map2;
                                                    }
                                                    while (r16.hasNext()) {
                                                        num3.intValue();
                                                        j7Var = (com.google.android.gms.internal.measurement.j7) map3.get(num3);
                                                        bitSet = new BitSet();
                                                        bitSet2 = new BitSet();
                                                        aVar = new w1.a();
                                                        if (j7Var != null) {
                                                            while (r7.hasNext()) {
                                                                if (q6Var.F()) {
                                                                    Map map13 = map3;
                                                                    Integer numValueOf8 = Integer.valueOf(q6Var.G());
                                                                    if (q6Var.H()) {
                                                                        lValueOf = Long.valueOf(q6Var.I());
                                                                    } else {
                                                                        lValueOf = null;
                                                                    }
                                                                    aVar.put(numValueOf8, lValueOf);
                                                                    map3 = map13;
                                                                }
                                                            }
                                                        }
                                                        Map map14 = map3;
                                                        w1.a aVar11 = new w1.a();
                                                        if (j7Var != null) {
                                                            it = j7Var.L().iterator();
                                                            while (it.hasNext()) {
                                                                l7Var = (com.google.android.gms.internal.measurement.l7) it.next();
                                                                if (!l7Var.F()) {
                                                                }
                                                            }
                                                        }
                                                        j7Var2 = j7Var;
                                                        if (j7Var2 != null) {
                                                            i12 = 0;
                                                            while (i12 < j7Var2.G() * 64) {
                                                                if (af.P(j7Var2.F(), i12)) {
                                                                    z13 = zH;
                                                                    this.f27641a.a().w().c("Filter already evaluated. audience ID, filter ID", num3, Integer.valueOf(i12));
                                                                    bitSet2.set(i12);
                                                                    if (af.P(j7Var2.H(), i12)) {
                                                                        bitSet.set(i12);
                                                                    }
                                                                    i12++;
                                                                    zH = z13;
                                                                } else {
                                                                    z13 = zH;
                                                                }
                                                                aVar.remove(Integer.valueOf(i12));
                                                                i12++;
                                                                zH = z13;
                                                            }
                                                        }
                                                        boolean z15 = zH;
                                                        com.google.android.gms.internal.measurement.j7 j7Var5 = (com.google.android.gms.internal.measurement.j7) map2.get(num3);
                                                        if (!zH2) {
                                                        }
                                                        this.f27207f.put(num3, new pf(this, this.f27205d, j7Var5, bitSet, bitSet2, aVar, aVar11, null));
                                                        str2 = str2;
                                                        map = map;
                                                        str14 = str14;
                                                        map2 = map2;
                                                        zH = z15;
                                                        map3 = map14;
                                                    }
                                                }
                                                str4 = str2;
                                                str5 = str14;
                                                str6 = "Skipping failed audience ID";
                                                if (!list.isEmpty()) {
                                                    qfVar = new qf(this, null);
                                                    aVar6 = new w1.a();
                                                    it7 = list.iterator();
                                                    while (it7.hasNext()) {
                                                        s6Var = (com.google.android.gms.internal.measurement.s6) it7.next();
                                                        s6VarA = qfVar.a(this.f27205d, s6Var);
                                                        if (s6VarA != null) {
                                                            veVar = this.b;
                                                            e0VarZ = veVar.F0().Z(this.f27205d, s6Var, s6VarA.I());
                                                            veVar.F0().w0(e0VarZ);
                                                            if (z10) {
                                                                j10 = e0VarZ.f27211c;
                                                                strI = s6VarA.I();
                                                                map7 = (Map) aVar6.get(strI);
                                                                if (map7 == null) {
                                                                    wVarF2 = veVar.F0();
                                                                    str10 = this.f27205d;
                                                                    wVarF2.j();
                                                                    wVarF2.h();
                                                                    o9.s.f(str10);
                                                                    o9.s.f(strI);
                                                                    aVar7 = new w1.a();
                                                                    str11 = str10;
                                                                    cursorQuery3 = wVarF2.u0().query("event_filters", new String[]{str5, str4}, "app_id=? AND event_name=?", new String[]{str10, strI}, null, null, null);
                                                                    if (cursorQuery3.moveToFirst()) {
                                                                        e0Var = e0VarZ;
                                                                        while (true) {
                                                                            com.google.android.gms.internal.measurement.d4 d4Var5 = (com.google.android.gms.internal.measurement.d4) ((com.google.android.gms.internal.measurement.c4) af.W(com.google.android.gms.internal.measurement.d4.S(), cursorQuery3.getBlob(1))).v();
                                                                            numValueOf5 = Integer.valueOf(cursorQuery3.getInt(0));
                                                                            list6 = (List) aVar7.get(numValueOf5);
                                                                            if (list6 == null) {
                                                                                cursor4 = cursorQuery3;
                                                                                arrayList4 = new ArrayList();
                                                                                aVar7.put(numValueOf5, arrayList4);
                                                                            } else {
                                                                                cursor4 = cursorQuery3;
                                                                                arrayList4 = list6;
                                                                            }
                                                                            arrayList4.add(d4Var5);
                                                                            if (!cursor4.moveToNext()) {
                                                                                break;
                                                                                break;
                                                                            }
                                                                            cursorQuery3 = cursor4;
                                                                        }
                                                                        cursor4.close();
                                                                        map7 = aVar7;
                                                                    } else {
                                                                        e0Var = e0VarZ;
                                                                        map7 = Collections.EMPTY_MAP;
                                                                        cursorQuery3.close();
                                                                    }
                                                                    aVar6.put(strI, map7);
                                                                } else {
                                                                    e0Var = e0VarZ;
                                                                }
                                                                it8 = map7.keySet().iterator();
                                                                while (it8.hasNext()) {
                                                                    num2 = (Integer) it8.next();
                                                                    iIntValue = num2.intValue();
                                                                    if (this.f27206e.contains(num2)) {
                                                                        this.f27641a.a().w().b("Skipping failed audience ID", num2);
                                                                    } else {
                                                                        it9 = ((List) map7.get(num2)).iterator();
                                                                        zK2 = true;
                                                                        while (true) {
                                                                            if (!it9.hasNext()) {
                                                                                map8 = map7;
                                                                                it10 = it8;
                                                                                j11 = j10;
                                                                                break;
                                                                            }
                                                                            com.google.android.gms.internal.measurement.d4 d4Var6 = (com.google.android.gms.internal.measurement.d4) it9.next();
                                                                            map8 = map7;
                                                                            it10 = it8;
                                                                            bVar = new b(this, this.f27205d, iIntValue, d4Var6);
                                                                            j11 = j10;
                                                                            zK2 = bVar.k(this.f27208g, this.f27209h, s6VarA, j11, e0Var, o(iIntValue, d4Var6.G()));
                                                                            if (!zK2) {
                                                                                this.f27206e.add(num2);
                                                                                break;
                                                                            }
                                                                            n(num2).a(bVar);
                                                                            j10 = j11;
                                                                            map7 = map8;
                                                                            it8 = it10;
                                                                        }
                                                                        if (!zK2) {
                                                                            this.f27206e.add(num2);
                                                                        }
                                                                        j10 = j11;
                                                                        map7 = map8;
                                                                        it8 = it10;
                                                                    }
                                                                }
                                                                it7 = it7;
                                                                qfVar = qfVar;
                                                            } else {
                                                                continue;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (!z10) {
                                                    return new ArrayList();
                                                }
                                                if (!list2.isEmpty()) {
                                                    aVar4 = new w1.a();
                                                    it4 = list2.iterator();
                                                    while (it4.hasNext()) {
                                                        com.google.android.gms.internal.measurement.v7 v7Var2 = (com.google.android.gms.internal.measurement.v7) it4.next();
                                                        strH = v7Var2.H();
                                                        map5 = (Map) aVar4.get(strH);
                                                        if (map5 == null) {
                                                            wVarF1 = this.b.F0();
                                                            str8 = this.f27205d;
                                                            wVarF1.j();
                                                            wVarF1.h();
                                                            o9.s.f(str8);
                                                            o9.s.f(strH);
                                                            aVar5 = new w1.a();
                                                            cursorQuery2 = wVarF1.u0().query("property_filters", new String[]{str5, str4}, "app_id=? AND property_name=?", new String[]{str8, strH}, null, null, null);
                                                            if (cursorQuery2.moveToFirst()) {
                                                                while (true) {
                                                                    com.google.android.gms.internal.measurement.l4 l4Var3 = (com.google.android.gms.internal.measurement.l4) ((com.google.android.gms.internal.measurement.k4) af.W(com.google.android.gms.internal.measurement.l4.N(), cursorQuery2.getBlob(1))).v();
                                                                    numValueOf4 = Integer.valueOf(cursorQuery2.getInt(0));
                                                                    list5 = (List) aVar5.get(numValueOf4);
                                                                    if (list5 == null) {
                                                                        it5 = it4;
                                                                        arrayList3 = new ArrayList();
                                                                        aVar5.put(numValueOf4, arrayList3);
                                                                    } else {
                                                                        it5 = it4;
                                                                        arrayList3 = list5;
                                                                    }
                                                                    arrayList3.add(l4Var3);
                                                                    str9 = str8;
                                                                    if (!cursorQuery2.moveToNext()) {
                                                                        break;
                                                                        break;
                                                                    }
                                                                    it4 = it5;
                                                                    str8 = str9;
                                                                }
                                                                cursorQuery2.close();
                                                                map5 = aVar5;
                                                            } else {
                                                                it5 = it4;
                                                                map5 = Collections.EMPTY_MAP;
                                                                cursorQuery2.close();
                                                            }
                                                            aVar4.put(strH, map5);
                                                        } else {
                                                            it5 = it4;
                                                        }
                                                        while (r4.hasNext()) {
                                                            int iIntValue5 = num4.intValue();
                                                            if (this.f27206e.contains(num4)) {
                                                                this.f27641a.a().w().b(str6, num4);
                                                                break;
                                                                break;
                                                            }
                                                            it6 = ((List) map5.get(num4)).iterator();
                                                            zK = true;
                                                            while (true) {
                                                                if (it6.hasNext()) {
                                                                    l4Var = (com.google.android.gms.internal.measurement.l4) it6.next();
                                                                    l7Var2 = this.f27641a;
                                                                    map6 = map5;
                                                                    if (Log.isLoggable(l7Var2.a().z(), 2)) {
                                                                        z5 z5VarW3 = l7Var2.a().w();
                                                                        if (l4Var.F()) {
                                                                            numValueOf3 = Integer.valueOf(l4Var.G());
                                                                        } else {
                                                                            numValueOf3 = null;
                                                                        }
                                                                        z5VarW3.d("Evaluating filter. audience, filter, property", num4, numValueOf3, l7Var2.D().c(l4Var.H()));
                                                                        l7Var2.a().w().b("Filter definition", this.b.K0().M(l4Var));
                                                                    }
                                                                    if (l4Var.F()) {
                                                                    }
                                                                    z5 z5VarR3 = l7Var2.a().r();
                                                                    Object objX3 = b6.x(this.f27205d);
                                                                    if (l4Var.F()) {
                                                                        numValueOf2 = Integer.valueOf(l4Var.G());
                                                                    } else {
                                                                        numValueOf2 = null;
                                                                    }
                                                                    z5VarR3.c("Invalid property filter ID. appId, id", objX3, String.valueOf(numValueOf2));
                                                                    this.f27206e.add(num4);
                                                                    map5 = map6;
                                                                    aVar4 = aVar4;
                                                                    str6 = str6;
                                                                } else {
                                                                    map6 = map5;
                                                                    str6 = str6;
                                                                    aVar4 = aVar4;
                                                                }
                                                                if (!zK) {
                                                                    this.f27206e.add(num4);
                                                                }
                                                                map5 = map6;
                                                                aVar4 = aVar4;
                                                                str6 = str6;
                                                                n(num4).a(dVar);
                                                                map5 = map6;
                                                                aVar4 = aVar4;
                                                                str6 = str6;
                                                            }
                                                        }
                                                        it4 = it5;
                                                    }
                                                }
                                                arrayList2 = new ArrayList();
                                                Set<Integer> setKeySet2 = this.f27207f.keySet();
                                                setKeySet2.removeAll(this.f27206e);
                                                while (r3.hasNext()) {
                                                    int iIntValue6 = num5.intValue();
                                                    pf pfVar2 = (pf) this.f27207f.get(num5);
                                                    o9.s.l(pfVar2);
                                                    com.google.android.gms.internal.measurement.g6 g6VarB2 = pfVar2.b(iIntValue6);
                                                    arrayList2.add(g6VarB2);
                                                    wVarF0 = this.b.F0();
                                                    str7 = this.f27205d;
                                                    com.google.android.gms.internal.measurement.j7 j7VarH2 = g6VarB2.H();
                                                    wVarF0.j();
                                                    wVarF0.h();
                                                    o9.s.f(str7);
                                                    o9.s.l(j7VarH2);
                                                    byte[] bArrD2 = j7VarH2.d();
                                                    contentValues = new ContentValues();
                                                    contentValues.put("app_id", str7);
                                                    contentValues.put(str5, num5);
                                                    contentValues.put("current_results", bArrD2);
                                                    if (wVarF0.u0().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                                                        wVarF0.f27641a.a().o().b("Failed to insert filter results (got -1). appId", b6.x(str7));
                                                    }
                                                }
                                                return arrayList2;
                                            }
                                        }
                                        try {
                                            if (!cursorQuery.moveToNext()) {
                                                break;
                                            }
                                            z11 = z12;
                                            str13 = str2;
                                            str14 = str14;
                                        } catch (SQLiteException e30) {
                                            e = e30;
                                            wVarF5.f27641a.a().o().c("Database error querying filter results. appId", b6.x(str16), e);
                                            Map map15 = Collections.EMPTY_MAP;
                                            if (cursorQuery != null) {
                                                cursorQuery.close();
                                            }
                                            map2 = map15;
                                        }
                                    }
                                    cursorQuery.close();
                                    map2 = aVar8;
                                } else {
                                    Map map16 = Collections.EMPTY_MAP;
                                    cursorQuery.close();
                                    map2 = map16;
                                    z12 = z11;
                                    str2 = "data";
                                    str14 = "audience_id";
                                }
                            } catch (Throwable th10) {
                                th = th10;
                                cursor = cursorQuery;
                                if (cursor != null) {
                                    cursor.close();
                                }
                                throw th;
                            }
                        } catch (SQLiteException e31) {
                            e = e31;
                            z12 = z11;
                            str2 = "data";
                        }
                        if (!map2.isEmpty()) {
                            hashSet = new HashSet(map2.keySet());
                            if (z12) {
                                String str18 = this.f27205d;
                                w wVarF7 = this.b.F0();
                                str3 = this.f27205d;
                                wVarF7.j();
                                wVarF7.h();
                                o9.s.f(str3);
                                aVar2 = new w1.a();
                                sQLiteDatabaseU0 = wVarF7.u0();
                                cursorRawQuery = sQLiteDatabaseU0.rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str3, str3});
                                if (cursorRawQuery.moveToFirst()) {
                                    do {
                                        numValueOf = Integer.valueOf(cursorRawQuery.getInt(0));
                                        arrayList = (List) aVar2.get(numValueOf);
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                            aVar2.put(numValueOf, arrayList);
                                        }
                                        arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                                    } while (cursorRawQuery.moveToNext());
                                } else {
                                    aVar2 = Collections.EMPTY_MAP;
                                }
                                cursorRawQuery.close();
                                o9.s.f(str18);
                                o9.s.l(map2);
                                aVar3 = new w1.a();
                                if (!map2.isEmpty()) {
                                    it2 = map2.keySet().iterator();
                                    while (it2.hasNext()) {
                                        num = (Integer) it2.next();
                                        num.intValue();
                                        j7Var3 = (com.google.android.gms.internal.measurement.j7) map2.get(num);
                                        list4 = (List) aVar2.get(num);
                                        if (list4 != null) {
                                        }
                                        map4 = aVar2;
                                        hashSet3 = hashSet;
                                        it3 = it2;
                                        aVar3.put(num, j7Var3);
                                        aVar2 = map4;
                                        hashSet = hashSet3;
                                        it2 = it3;
                                    }
                                }
                                hashSet2 = hashSet;
                                map3 = aVar3;
                            } else {
                                hashSet2 = hashSet;
                                map3 = map2;
                            }
                            while (r16.hasNext()) {
                                num3.intValue();
                                j7Var = (com.google.android.gms.internal.measurement.j7) map3.get(num3);
                                bitSet = new BitSet();
                                bitSet2 = new BitSet();
                                aVar = new w1.a();
                                if (j7Var != null) {
                                    while (r7.hasNext()) {
                                        if (q6Var.F()) {
                                            Map map17 = map3;
                                            Integer numValueOf9 = Integer.valueOf(q6Var.G());
                                            if (q6Var.H()) {
                                                lValueOf = Long.valueOf(q6Var.I());
                                            } else {
                                                lValueOf = null;
                                            }
                                            aVar.put(numValueOf9, lValueOf);
                                            map3 = map17;
                                        }
                                    }
                                }
                                Map map18 = map3;
                                w1.a aVar12 = new w1.a();
                                if (j7Var != null) {
                                    it = j7Var.L().iterator();
                                    while (it.hasNext()) {
                                        l7Var = (com.google.android.gms.internal.measurement.l7) it.next();
                                        if (!l7Var.F()) {
                                        }
                                    }
                                }
                                j7Var2 = j7Var;
                                if (j7Var2 != null) {
                                    i12 = 0;
                                    while (i12 < j7Var2.G() * 64) {
                                        if (af.P(j7Var2.F(), i12)) {
                                            z13 = zH;
                                            this.f27641a.a().w().c("Filter already evaluated. audience ID, filter ID", num3, Integer.valueOf(i12));
                                            bitSet2.set(i12);
                                            if (af.P(j7Var2.H(), i12)) {
                                                bitSet.set(i12);
                                            }
                                            i12++;
                                            zH = z13;
                                        } else {
                                            z13 = zH;
                                        }
                                        aVar.remove(Integer.valueOf(i12));
                                        i12++;
                                        zH = z13;
                                    }
                                }
                                boolean z16 = zH;
                                com.google.android.gms.internal.measurement.j7 j7Var6 = (com.google.android.gms.internal.measurement.j7) map2.get(num3);
                                if (!zH2) {
                                }
                                this.f27207f.put(num3, new pf(this, this.f27205d, j7Var6, bitSet, bitSet2, aVar, aVar12, null));
                                str2 = str2;
                                map = map;
                                str14 = str14;
                                map2 = map2;
                                zH = z16;
                                map3 = map18;
                            }
                        }
                        str4 = str2;
                        str5 = str14;
                        str6 = "Skipping failed audience ID";
                        if (!list.isEmpty()) {
                            qfVar = new qf(this, null);
                            aVar6 = new w1.a();
                            it7 = list.iterator();
                            while (it7.hasNext()) {
                                s6Var = (com.google.android.gms.internal.measurement.s6) it7.next();
                                s6VarA = qfVar.a(this.f27205d, s6Var);
                                if (s6VarA != null) {
                                    veVar = this.b;
                                    e0VarZ = veVar.F0().Z(this.f27205d, s6Var, s6VarA.I());
                                    veVar.F0().w0(e0VarZ);
                                    if (z10) {
                                        j10 = e0VarZ.f27211c;
                                        strI = s6VarA.I();
                                        map7 = (Map) aVar6.get(strI);
                                        if (map7 == null) {
                                            wVarF2 = veVar.F0();
                                            str10 = this.f27205d;
                                            wVarF2.j();
                                            wVarF2.h();
                                            o9.s.f(str10);
                                            o9.s.f(strI);
                                            aVar7 = new w1.a();
                                            str11 = str10;
                                            cursorQuery3 = wVarF2.u0().query("event_filters", new String[]{str5, str4}, "app_id=? AND event_name=?", new String[]{str10, strI}, null, null, null);
                                            if (cursorQuery3.moveToFirst()) {
                                                e0Var = e0VarZ;
                                                while (true) {
                                                    com.google.android.gms.internal.measurement.d4 d4Var7 = (com.google.android.gms.internal.measurement.d4) ((com.google.android.gms.internal.measurement.c4) af.W(com.google.android.gms.internal.measurement.d4.S(), cursorQuery3.getBlob(1))).v();
                                                    numValueOf5 = Integer.valueOf(cursorQuery3.getInt(0));
                                                    list6 = (List) aVar7.get(numValueOf5);
                                                    if (list6 == null) {
                                                        cursor4 = cursorQuery3;
                                                        arrayList4 = new ArrayList();
                                                        aVar7.put(numValueOf5, arrayList4);
                                                    } else {
                                                        cursor4 = cursorQuery3;
                                                        arrayList4 = list6;
                                                    }
                                                    arrayList4.add(d4Var7);
                                                    if (!cursor4.moveToNext()) {
                                                        break;
                                                        break;
                                                    }
                                                    cursorQuery3 = cursor4;
                                                }
                                                cursor4.close();
                                                map7 = aVar7;
                                            } else {
                                                e0Var = e0VarZ;
                                                map7 = Collections.EMPTY_MAP;
                                                cursorQuery3.close();
                                            }
                                            aVar6.put(strI, map7);
                                        } else {
                                            e0Var = e0VarZ;
                                        }
                                        it8 = map7.keySet().iterator();
                                        while (it8.hasNext()) {
                                            num2 = (Integer) it8.next();
                                            iIntValue = num2.intValue();
                                            if (this.f27206e.contains(num2)) {
                                                this.f27641a.a().w().b("Skipping failed audience ID", num2);
                                            } else {
                                                it9 = ((List) map7.get(num2)).iterator();
                                                zK2 = true;
                                                while (true) {
                                                    if (!it9.hasNext()) {
                                                        map8 = map7;
                                                        it10 = it8;
                                                        j11 = j10;
                                                        break;
                                                    }
                                                    com.google.android.gms.internal.measurement.d4 d4Var8 = (com.google.android.gms.internal.measurement.d4) it9.next();
                                                    map8 = map7;
                                                    it10 = it8;
                                                    bVar = new b(this, this.f27205d, iIntValue, d4Var8);
                                                    j11 = j10;
                                                    zK2 = bVar.k(this.f27208g, this.f27209h, s6VarA, j11, e0Var, o(iIntValue, d4Var8.G()));
                                                    if (!zK2) {
                                                        this.f27206e.add(num2);
                                                        break;
                                                    }
                                                    n(num2).a(bVar);
                                                    j10 = j11;
                                                    map7 = map8;
                                                    it8 = it10;
                                                }
                                                if (!zK2) {
                                                    this.f27206e.add(num2);
                                                }
                                                j10 = j11;
                                                map7 = map8;
                                                it8 = it10;
                                            }
                                        }
                                        it7 = it7;
                                        qfVar = qfVar;
                                    } else {
                                        continue;
                                    }
                                }
                            }
                        }
                        if (!z10) {
                            return new ArrayList();
                        }
                        if (!list2.isEmpty()) {
                            aVar4 = new w1.a();
                            it4 = list2.iterator();
                            while (it4.hasNext()) {
                                com.google.android.gms.internal.measurement.v7 v7Var3 = (com.google.android.gms.internal.measurement.v7) it4.next();
                                strH = v7Var3.H();
                                map5 = (Map) aVar4.get(strH);
                                if (map5 == null) {
                                    wVarF1 = this.b.F0();
                                    str8 = this.f27205d;
                                    wVarF1.j();
                                    wVarF1.h();
                                    o9.s.f(str8);
                                    o9.s.f(strH);
                                    aVar5 = new w1.a();
                                    cursorQuery2 = wVarF1.u0().query("property_filters", new String[]{str5, str4}, "app_id=? AND property_name=?", new String[]{str8, strH}, null, null, null);
                                    if (cursorQuery2.moveToFirst()) {
                                        while (true) {
                                            com.google.android.gms.internal.measurement.l4 l4Var4 = (com.google.android.gms.internal.measurement.l4) ((com.google.android.gms.internal.measurement.k4) af.W(com.google.android.gms.internal.measurement.l4.N(), cursorQuery2.getBlob(1))).v();
                                            numValueOf4 = Integer.valueOf(cursorQuery2.getInt(0));
                                            list5 = (List) aVar5.get(numValueOf4);
                                            if (list5 == null) {
                                                it5 = it4;
                                                arrayList3 = new ArrayList();
                                                aVar5.put(numValueOf4, arrayList3);
                                            } else {
                                                it5 = it4;
                                                arrayList3 = list5;
                                            }
                                            arrayList3.add(l4Var4);
                                            str9 = str8;
                                            if (!cursorQuery2.moveToNext()) {
                                                break;
                                                break;
                                            }
                                            it4 = it5;
                                            str8 = str9;
                                        }
                                        cursorQuery2.close();
                                        map5 = aVar5;
                                    } else {
                                        it5 = it4;
                                        map5 = Collections.EMPTY_MAP;
                                        cursorQuery2.close();
                                    }
                                    aVar4.put(strH, map5);
                                } else {
                                    it5 = it4;
                                }
                                while (r4.hasNext()) {
                                    int iIntValue7 = num4.intValue();
                                    if (this.f27206e.contains(num4)) {
                                        this.f27641a.a().w().b(str6, num4);
                                        break;
                                        break;
                                    }
                                    it6 = ((List) map5.get(num4)).iterator();
                                    zK = true;
                                    while (true) {
                                        if (it6.hasNext()) {
                                            l4Var = (com.google.android.gms.internal.measurement.l4) it6.next();
                                            l7Var2 = this.f27641a;
                                            map6 = map5;
                                            if (Log.isLoggable(l7Var2.a().z(), 2)) {
                                                z5 z5VarW4 = l7Var2.a().w();
                                                if (l4Var.F()) {
                                                    numValueOf3 = Integer.valueOf(l4Var.G());
                                                } else {
                                                    numValueOf3 = null;
                                                }
                                                z5VarW4.d("Evaluating filter. audience, filter, property", num4, numValueOf3, l7Var2.D().c(l4Var.H()));
                                                l7Var2.a().w().b("Filter definition", this.b.K0().M(l4Var));
                                            }
                                            if (l4Var.F()) {
                                            }
                                            z5 z5VarR4 = l7Var2.a().r();
                                            Object objX4 = b6.x(this.f27205d);
                                            if (l4Var.F()) {
                                                numValueOf2 = Integer.valueOf(l4Var.G());
                                            } else {
                                                numValueOf2 = null;
                                            }
                                            z5VarR4.c("Invalid property filter ID. appId, id", objX4, String.valueOf(numValueOf2));
                                            this.f27206e.add(num4);
                                            map5 = map6;
                                            aVar4 = aVar4;
                                            str6 = str6;
                                        } else {
                                            map6 = map5;
                                            str6 = str6;
                                            aVar4 = aVar4;
                                        }
                                        if (!zK) {
                                            this.f27206e.add(num4);
                                        }
                                        map5 = map6;
                                        aVar4 = aVar4;
                                        str6 = str6;
                                        n(num4).a(dVar);
                                        map5 = map6;
                                        aVar4 = aVar4;
                                        str6 = str6;
                                    }
                                }
                                it4 = it5;
                            }
                        }
                        arrayList2 = new ArrayList();
                        Set<Integer> setKeySet3 = this.f27207f.keySet();
                        setKeySet3.removeAll(this.f27206e);
                        while (r3.hasNext()) {
                            int iIntValue8 = num5.intValue();
                            pf pfVar3 = (pf) this.f27207f.get(num5);
                            o9.s.l(pfVar3);
                            com.google.android.gms.internal.measurement.g6 g6VarB3 = pfVar3.b(iIntValue8);
                            arrayList2.add(g6VarB3);
                            wVarF0 = this.b.F0();
                            str7 = this.f27205d;
                            com.google.android.gms.internal.measurement.j7 j7VarH3 = g6VarB3.H();
                            wVarF0.j();
                            wVarF0.h();
                            o9.s.f(str7);
                            o9.s.l(j7VarH3);
                            byte[] bArrD3 = j7VarH3.d();
                            contentValues = new ContentValues();
                            contentValues.put("app_id", str7);
                            contentValues.put(str5, num5);
                            contentValues.put("current_results", bArrD3);
                            if (wVarF0.u0().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                                wVarF0.f27641a.a().o().b("Failed to insert filter results (got -1). appId", b6.x(str7));
                            }
                        }
                        return arrayList2;
                    }
                } catch (Throwable th11) {
                    th = th11;
                    if (cursorQuery4 != null) {
                        cursorQuery4.close();
                    }
                    throw th;
                }
            } catch (SQLiteException e32) {
                e = e32;
                cursorQuery4 = null;
            } catch (Throwable th12) {
                th = th12;
                cursorQuery4 = null;
                if (cursorQuery4 != null) {
                    cursorQuery4.close();
                }
                throw th;
            }
        } else {
            map = map9;
        }
        w wVarF8 = this.b.F0();
        String str19 = this.f27205d;
        wVarF8.j();
        wVarF8.h();
        o9.s.f(str19);
        try {
            cursorQuery = wVarF8.u0().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{str19}, null, null, null);
            if (cursorQuery.moveToFirst()) {
                Map map19 = Collections.EMPTY_MAP;
                cursorQuery.close();
                map2 = map19;
                z12 = z11;
                str2 = "data";
                str14 = "audience_id";
            } else {
                aVar8 = new w1.a();
                while (true) {
                    i13 = cursorQuery.getInt(0);
                    aVar8.put(Integer.valueOf(i13), (com.google.android.gms.internal.measurement.j7) ((com.google.android.gms.internal.measurement.i7) af.W(com.google.android.gms.internal.measurement.j7.N(), cursorQuery.getBlob(1))).v());
                    z12 = z11;
                    str2 = str13;
                    if (!cursorQuery.moveToNext()) {
                        break;
                        break;
                    }
                    z11 = z12;
                    str13 = str2;
                    str14 = str14;
                }
                cursorQuery.close();
                map2 = aVar8;
            }
        } catch (SQLiteException e33) {
            e = e33;
            z12 = z11;
            str2 = "data";
            str14 = "audience_id";
            cursorQuery = null;
        } catch (Throwable th13) {
            th = th13;
            cursor = null;
        }
        if (!map2.isEmpty()) {
            hashSet = new HashSet(map2.keySet());
            if (z12) {
                String str110 = this.f27205d;
                w wVarF9 = this.b.F0();
                str3 = this.f27205d;
                wVarF9.j();
                wVarF9.h();
                o9.s.f(str3);
                aVar2 = new w1.a();
                sQLiteDatabaseU0 = wVarF9.u0();
                cursorRawQuery = sQLiteDatabaseU0.rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str3, str3});
                if (cursorRawQuery.moveToFirst()) {
                    do {
                        numValueOf = Integer.valueOf(cursorRawQuery.getInt(0));
                        arrayList = (List) aVar2.get(numValueOf);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            aVar2.put(numValueOf, arrayList);
                        }
                        arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                    } while (cursorRawQuery.moveToNext());
                } else {
                    aVar2 = Collections.EMPTY_MAP;
                }
                cursorRawQuery.close();
                o9.s.f(str110);
                o9.s.l(map2);
                aVar3 = new w1.a();
                if (!map2.isEmpty()) {
                    it2 = map2.keySet().iterator();
                    while (it2.hasNext()) {
                        num = (Integer) it2.next();
                        num.intValue();
                        j7Var3 = (com.google.android.gms.internal.measurement.j7) map2.get(num);
                        list4 = (List) aVar2.get(num);
                        if (list4 != null || list4.isEmpty()) {
                            map4 = aVar2;
                            hashSet3 = hashSet;
                            it3 = it2;
                            aVar3.put(num, j7Var3);
                            aVar2 = map4;
                            hashSet = hashSet3;
                            it2 = it3;
                        } else {
                            ve veVar2 = this.b;
                            map4 = aVar2;
                            hashSet3 = hashSet;
                            List listR = veVar2.K0().R(j7Var3.H(), list4);
                            if (listR.isEmpty()) {
                                aVar2 = map4;
                                hashSet = hashSet3;
                            } else {
                                com.google.android.gms.internal.measurement.i7 i7Var = (com.google.android.gms.internal.measurement.i7) j7Var3.q();
                                i7Var.D();
                                i7Var.C(listR);
                                List listR2 = veVar2.K0().R(j7Var3.F(), list4);
                                i7Var.B();
                                i7Var.z(listR2);
                                ArrayList arrayList6 = new ArrayList();
                                Iterator it12 = j7Var3.J().iterator();
                                while (it12.hasNext()) {
                                    Iterator it13 = it2;
                                    com.google.android.gms.internal.measurement.q6 q6Var2 = (com.google.android.gms.internal.measurement.q6) it12.next();
                                    Iterator it14 = it12;
                                    if (!list4.contains(Integer.valueOf(q6Var2.G()))) {
                                        arrayList6.add(q6Var2);
                                    }
                                    it2 = it13;
                                    it12 = it14;
                                }
                                it3 = it2;
                                i7Var.G();
                                i7Var.F(arrayList6);
                                ArrayList arrayList7 = new ArrayList();
                                for (com.google.android.gms.internal.measurement.l7 l7Var4 : j7Var3.L()) {
                                    if (!list4.contains(Integer.valueOf(l7Var4.G()))) {
                                        arrayList7.add(l7Var4);
                                    }
                                }
                                i7Var.J();
                                i7Var.H(arrayList7);
                                aVar3.put(num, (com.google.android.gms.internal.measurement.j7) i7Var.v());
                                aVar2 = map4;
                                hashSet = hashSet3;
                                it2 = it3;
                            }
                        }
                    }
                }
                hashSet2 = hashSet;
                map3 = aVar3;
            } else {
                hashSet2 = hashSet;
                map3 = map2;
            }
            while (r16.hasNext()) {
                num3.intValue();
                j7Var = (com.google.android.gms.internal.measurement.j7) map3.get(num3);
                bitSet = new BitSet();
                bitSet2 = new BitSet();
                aVar = new w1.a();
                if (j7Var != null && j7Var.K() != 0) {
                    while (r7.hasNext()) {
                        if (q6Var.F()) {
                            Map map110 = map3;
                            Integer numValueOf10 = Integer.valueOf(q6Var.G());
                            if (q6Var.H()) {
                                lValueOf = Long.valueOf(q6Var.I());
                            } else {
                                lValueOf = null;
                            }
                            aVar.put(numValueOf10, lValueOf);
                            map3 = map110;
                        }
                    }
                }
                Map map111 = map3;
                w1.a aVar13 = new w1.a();
                if (j7Var != null && j7Var.M() != 0) {
                    it = j7Var.L().iterator();
                    while (it.hasNext()) {
                        l7Var = (com.google.android.gms.internal.measurement.l7) it.next();
                        if (!l7Var.F() && l7Var.I() > 0) {
                            aVar13.put(Integer.valueOf(l7Var.G()), Long.valueOf(l7Var.J(l7Var.I() - 1)));
                            it = it;
                            j7Var = j7Var;
                        }
                    }
                }
                j7Var2 = j7Var;
                if (j7Var2 != null) {
                    i12 = 0;
                    while (i12 < j7Var2.G() * 64) {
                        if (af.P(j7Var2.F(), i12)) {
                            z13 = zH;
                            this.f27641a.a().w().c("Filter already evaluated. audience ID, filter ID", num3, Integer.valueOf(i12));
                            bitSet2.set(i12);
                            if (af.P(j7Var2.H(), i12)) {
                                bitSet.set(i12);
                            }
                            i12++;
                            zH = z13;
                        } else {
                            z13 = zH;
                        }
                        aVar.remove(Integer.valueOf(i12));
                        i12++;
                        zH = z13;
                    }
                }
                boolean z17 = zH;
                com.google.android.gms.internal.measurement.j7 j7Var7 = (com.google.android.gms.internal.measurement.j7) map2.get(num3);
                if (!zH2 && z17 && (list3 = (List) map.get(num3)) != null && this.f27209h != null && this.f27208g != null) {
                    Iterator it15 = list3.iterator();
                    while (it15.hasNext()) {
                        com.google.android.gms.internal.measurement.d4 d4Var9 = (com.google.android.gms.internal.measurement.d4) it15.next();
                        int iG = d4Var9.G();
                        Iterator it16 = it15;
                        long jLongValue = this.f27209h.longValue() / 1000;
                        if (d4Var9.O()) {
                            jLongValue = this.f27208g.longValue() / 1000;
                        }
                        Integer numValueOf11 = Integer.valueOf(iG);
                        if (aVar.containsKey(numValueOf11)) {
                            aVar.put(numValueOf11, Long.valueOf(jLongValue));
                        }
                        if (aVar13.containsKey(numValueOf11)) {
                            aVar13.put(numValueOf11, Long.valueOf(jLongValue));
                        }
                        it15 = it16;
                    }
                }
                this.f27207f.put(num3, new pf(this, this.f27205d, j7Var7, bitSet, bitSet2, aVar, aVar13, null));
                str2 = str2;
                map = map;
                str14 = str14;
                map2 = map2;
                zH = z17;
                map3 = map111;
            }
        }
        str4 = str2;
        str5 = str14;
        str6 = "Skipping failed audience ID";
        if (!list.isEmpty()) {
            qfVar = new qf(this, null);
            aVar6 = new w1.a();
            it7 = list.iterator();
            while (it7.hasNext()) {
                s6Var = (com.google.android.gms.internal.measurement.s6) it7.next();
                s6VarA = qfVar.a(this.f27205d, s6Var);
                if (s6VarA != null) {
                    veVar = this.b;
                    e0VarZ = veVar.F0().Z(this.f27205d, s6Var, s6VarA.I());
                    veVar.F0().w0(e0VarZ);
                    if (z10) {
                        j10 = e0VarZ.f27211c;
                        strI = s6VarA.I();
                        map7 = (Map) aVar6.get(strI);
                        if (map7 == null) {
                            wVarF2 = veVar.F0();
                            str10 = this.f27205d;
                            wVarF2.j();
                            wVarF2.h();
                            o9.s.f(str10);
                            o9.s.f(strI);
                            aVar7 = new w1.a();
                            str11 = str10;
                            cursorQuery3 = wVarF2.u0().query("event_filters", new String[]{str5, str4}, "app_id=? AND event_name=?", new String[]{str10, strI}, null, null, null);
                            if (cursorQuery3.moveToFirst()) {
                                e0Var = e0VarZ;
                                while (true) {
                                    com.google.android.gms.internal.measurement.d4 d4Var10 = (com.google.android.gms.internal.measurement.d4) ((com.google.android.gms.internal.measurement.c4) af.W(com.google.android.gms.internal.measurement.d4.S(), cursorQuery3.getBlob(1))).v();
                                    numValueOf5 = Integer.valueOf(cursorQuery3.getInt(0));
                                    list6 = (List) aVar7.get(numValueOf5);
                                    if (list6 == null) {
                                        cursor4 = cursorQuery3;
                                        arrayList4 = new ArrayList();
                                        aVar7.put(numValueOf5, arrayList4);
                                    } else {
                                        cursor4 = cursorQuery3;
                                        arrayList4 = list6;
                                    }
                                    arrayList4.add(d4Var10);
                                    if (!cursor4.moveToNext()) {
                                        break;
                                        break;
                                    }
                                    cursorQuery3 = cursor4;
                                }
                                cursor4.close();
                                map7 = aVar7;
                            } else {
                                e0Var = e0VarZ;
                                map7 = Collections.EMPTY_MAP;
                                cursorQuery3.close();
                            }
                            aVar6.put(strI, map7);
                        } else {
                            e0Var = e0VarZ;
                        }
                        it8 = map7.keySet().iterator();
                        while (it8.hasNext()) {
                            num2 = (Integer) it8.next();
                            iIntValue = num2.intValue();
                            if (this.f27206e.contains(num2)) {
                                this.f27641a.a().w().b("Skipping failed audience ID", num2);
                            } else {
                                it9 = ((List) map7.get(num2)).iterator();
                                zK2 = true;
                                while (true) {
                                    if (!it9.hasNext()) {
                                        map8 = map7;
                                        it10 = it8;
                                        j11 = j10;
                                        break;
                                    }
                                    com.google.android.gms.internal.measurement.d4 d4Var11 = (com.google.android.gms.internal.measurement.d4) it9.next();
                                    map8 = map7;
                                    it10 = it8;
                                    bVar = new b(this, this.f27205d, iIntValue, d4Var11);
                                    j11 = j10;
                                    zK2 = bVar.k(this.f27208g, this.f27209h, s6VarA, j11, e0Var, o(iIntValue, d4Var11.G()));
                                    if (!zK2) {
                                        this.f27206e.add(num2);
                                        break;
                                    }
                                    n(num2).a(bVar);
                                    j10 = j11;
                                    map7 = map8;
                                    it8 = it10;
                                }
                                if (!zK2) {
                                    this.f27206e.add(num2);
                                }
                                j10 = j11;
                                map7 = map8;
                                it8 = it10;
                            }
                        }
                        it7 = it7;
                        qfVar = qfVar;
                    } else {
                        continue;
                    }
                }
            }
        }
        if (!z10) {
            return new ArrayList();
        }
        if (!list2.isEmpty()) {
            aVar4 = new w1.a();
            it4 = list2.iterator();
            while (it4.hasNext()) {
                com.google.android.gms.internal.measurement.v7 v7Var4 = (com.google.android.gms.internal.measurement.v7) it4.next();
                strH = v7Var4.H();
                map5 = (Map) aVar4.get(strH);
                if (map5 == null) {
                    wVarF1 = this.b.F0();
                    str8 = this.f27205d;
                    wVarF1.j();
                    wVarF1.h();
                    o9.s.f(str8);
                    o9.s.f(strH);
                    aVar5 = new w1.a();
                    cursorQuery2 = wVarF1.u0().query("property_filters", new String[]{str5, str4}, "app_id=? AND property_name=?", new String[]{str8, strH}, null, null, null);
                    if (cursorQuery2.moveToFirst()) {
                        while (true) {
                            com.google.android.gms.internal.measurement.l4 l4Var5 = (com.google.android.gms.internal.measurement.l4) ((com.google.android.gms.internal.measurement.k4) af.W(com.google.android.gms.internal.measurement.l4.N(), cursorQuery2.getBlob(1))).v();
                            numValueOf4 = Integer.valueOf(cursorQuery2.getInt(0));
                            list5 = (List) aVar5.get(numValueOf4);
                            if (list5 == null) {
                                it5 = it4;
                                arrayList3 = new ArrayList();
                                aVar5.put(numValueOf4, arrayList3);
                            } else {
                                it5 = it4;
                                arrayList3 = list5;
                            }
                            arrayList3.add(l4Var5);
                            str9 = str8;
                            if (!cursorQuery2.moveToNext()) {
                                break;
                                break;
                            }
                            it4 = it5;
                            str8 = str9;
                        }
                        cursorQuery2.close();
                        map5 = aVar5;
                    } else {
                        it5 = it4;
                        map5 = Collections.EMPTY_MAP;
                        cursorQuery2.close();
                    }
                    aVar4.put(strH, map5);
                } else {
                    it5 = it4;
                }
                while (r4.hasNext()) {
                    int iIntValue9 = num4.intValue();
                    if (this.f27206e.contains(num4)) {
                        this.f27641a.a().w().b(str6, num4);
                        break;
                        break;
                    }
                    it6 = ((List) map5.get(num4)).iterator();
                    zK = true;
                    while (true) {
                        if (it6.hasNext()) {
                            l4Var = (com.google.android.gms.internal.measurement.l4) it6.next();
                            l7Var2 = this.f27641a;
                            map6 = map5;
                            if (Log.isLoggable(l7Var2.a().z(), 2)) {
                                z5 z5VarW5 = l7Var2.a().w();
                                if (l4Var.F()) {
                                    numValueOf3 = Integer.valueOf(l4Var.G());
                                } else {
                                    numValueOf3 = null;
                                }
                                z5VarW5.d("Evaluating filter. audience, filter, property", num4, numValueOf3, l7Var2.D().c(l4Var.H()));
                                l7Var2.a().w().b("Filter definition", this.b.K0().M(l4Var));
                            }
                            if (l4Var.F() || l4Var.G() > 256) {
                                z5 z5VarR5 = l7Var2.a().r();
                                Object objX5 = b6.x(this.f27205d);
                                if (l4Var.F()) {
                                    numValueOf2 = Integer.valueOf(l4Var.G());
                                } else {
                                    numValueOf2 = null;
                                }
                                z5VarR5.c("Invalid property filter ID. appId, id", objX5, String.valueOf(numValueOf2));
                                this.f27206e.add(num4);
                                map5 = map6;
                                aVar4 = aVar4;
                                str6 = str6;
                            } else {
                                dVar = new d(this, this.f27205d, iIntValue9, l4Var);
                                zK = dVar.k(this.f27208g, this.f27209h, v7Var4, o(iIntValue9, l4Var.G()));
                                if (zK) {
                                    n(num4).a(dVar);
                                    map5 = map6;
                                    aVar4 = aVar4;
                                    str6 = str6;
                                } else {
                                    this.f27206e.add(num4);
                                }
                            }
                        } else {
                            map6 = map5;
                            str6 = str6;
                            aVar4 = aVar4;
                        }
                        if (!zK) {
                            this.f27206e.add(num4);
                        }
                        map5 = map6;
                        aVar4 = aVar4;
                        str6 = str6;
                    }
                }
                it4 = it5;
            }
        }
        arrayList2 = new ArrayList();
        Set<Integer> setKeySet4 = this.f27207f.keySet();
        setKeySet4.removeAll(this.f27206e);
        while (r3.hasNext()) {
            int iIntValue10 = num5.intValue();
            pf pfVar4 = (pf) this.f27207f.get(num5);
            o9.s.l(pfVar4);
            com.google.android.gms.internal.measurement.g6 g6VarB4 = pfVar4.b(iIntValue10);
            arrayList2.add(g6VarB4);
            wVarF0 = this.b.F0();
            str7 = this.f27205d;
            com.google.android.gms.internal.measurement.j7 j7VarH4 = g6VarB4.H();
            wVarF0.j();
            wVarF0.h();
            o9.s.f(str7);
            o9.s.l(j7VarH4);
            byte[] bArrD4 = j7VarH4.d();
            contentValues = new ContentValues();
            contentValues.put("app_id", str7);
            contentValues.put(str5, num5);
            contentValues.put("current_results", bArrD4);
            if (wVarF0.u0().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                wVarF0.f27641a.a().o().b("Failed to insert filter results (got -1). appId", b6.x(str7));
            }
        }
        return arrayList2;
    }

    public final pf n(Integer num) {
        if (this.f27207f.containsKey(num)) {
            return (pf) this.f27207f.get(num);
        }
        pf pfVar = new pf(this, this.f27205d, null);
        this.f27207f.put(num, pfVar);
        return pfVar;
    }

    public final boolean o(int i10, int i11) {
        pf pfVar = (pf) this.f27207f.get(Integer.valueOf(i10));
        if (pfVar == null) {
            return false;
        }
        return pfVar.c().get(i11);
    }
}
