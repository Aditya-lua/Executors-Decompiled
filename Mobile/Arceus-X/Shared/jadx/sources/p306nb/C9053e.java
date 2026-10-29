package p306nb;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import com.google.android.gms.internal.measurement.C2005c6;
import com.google.android.gms.internal.measurement.C2044e7;
import com.google.android.gms.internal.measurement.C2063f7;
import com.google.android.gms.internal.measurement.C2079g4;
import com.google.android.gms.internal.measurement.C2098h4;
import com.google.android.gms.internal.measurement.C2101h7;
import com.google.android.gms.internal.measurement.C2190m6;
import com.google.android.gms.internal.measurement.C2226o6;
import com.google.android.gms.internal.measurement.C2281r7;
import com.google.android.gms.internal.measurement.C2403y3;
import com.google.android.gms.internal.measurement.C2414ye;
import com.google.android.gms.internal.measurement.C2421z3;
import java.io.IOException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p305n9.C8953m;
import p504w1.C12277a;

/* JADX INFO: renamed from: nb.e */
/* JADX INFO: loaded from: classes.dex */
public final class C9053e extends AbstractC9372xd {

    /* JADX INFO: renamed from: d */
    public String f32870d;

    /* JADX INFO: renamed from: e */
    public Set f32871e;

    /* JADX INFO: renamed from: f */
    public Map f32872f;

    /* JADX INFO: renamed from: g */
    public Long f32873g;

    /* JADX INFO: renamed from: h */
    public Long f32874h;

    public C9053e(C9197me c9197me) {
        super(c9197me);
    }

    @Override // p306nb.AbstractC9372xd
    /* JADX INFO: renamed from: l */
    public final boolean mo36126l() {
        return false;
    }

    /* JADX DEBUG: Type inference failed for r0v143. Raw type applied. Possible types: V */
    /* JADX DEBUG: Type inference failed for r16v21. Raw type applied. Possible types: V */
    /* JADX DEBUG: Type inference failed for r16v33. Raw type applied. Possible types: V */
    /* JADX DEBUG: Type inference failed for r17v24. Raw type applied. Possible types: V */
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
    /* JADX INFO: renamed from: m */
    public final List m36284m(String str, List list, List list2, Long l10, Long l11, boolean z10) throws Throwable {
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
        C2063f7 c2063f7;
        BitSet bitSet;
        BitSet bitSet2;
        C12277a c12277a;
        C2063f7 c2063f8;
        List list3;
        int i12;
        boolean z13;
        Iterator it;
        C2101h7 c2101h7;
        Long lValueOf;
        String str3;
        Map c12277a2;
        SQLiteDatabase sQLiteDatabaseM36848u0;
        ?? r8;
        Cursor cursorRawQuery;
        C12277a c12277a3;
        Iterator it2;
        Integer num;
        C2063f7 c2063f9;
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
        C9294t c9294tM36507F0;
        String str7;
        ContentValues contentValues;
        C12277a c12277a4;
        Iterator it4;
        String strM10609H;
        Map map5;
        Iterator it5;
        Iterator it6;
        boolean zM36276k;
        Map map6;
        C2098h4 c2098h4;
        C9094g7 c9094g7;
        Integer numValueOf2;
        C9036d c9036d;
        Integer numValueOf3;
        C9294t c9294tM36507F1;
        String str8;
        C12277a c12277a5;
        Cursor cursor2;
        String str9;
        Cursor cursorQuery2;
        Integer numValueOf4;
        List list5;
        List arrayList3;
        C9069ef c9069ef;
        C12277a c12277a6;
        Iterator it7;
        C2226o6 c2226o6;
        C2226o6 c2226o6M36293a;
        C9197me c9197me;
        C9003b0 c9003b0M36829Z;
        long j10;
        String strM10490J;
        Map map7;
        C9003b0 c9003b0;
        Iterator it8;
        Integer num2;
        int iIntValue;
        Iterator it9;
        boolean zM36116k;
        Map map8;
        Iterator it10;
        long j11;
        C9002b c9002b;
        C9294t c9294tM36507F2;
        String str10;
        C12277a c12277a7;
        String str11;
        Cursor cursor3;
        Cursor cursorQuery3;
        Cursor cursor4;
        Integer numValueOf5;
        List list6;
        List arrayList4;
        C12277a c12277a8;
        int i13;
        Cursor cursorQuery4;
        List arrayList5;
        C8953m.m36041f(str);
        C8953m.m36047l(list);
        C8953m.m36047l(list2);
        this.f32870d = str;
        this.f32871e = new HashSet();
        this.f32872f = new C12277a();
        this.f32873g = l10;
        this.f32874h = l11;
        Iterator it11 = list.iterator();
        while (true) {
            i10 = 0;
            i11 = 1;
            if (!it11.hasNext()) {
                z11 = false;
                break;
            }
            if ("_s".equals(((C2226o6) it11.next()).m10490J())) {
                z11 = true;
                break;
            }
        }
        C2414ye.m11027a();
        C9094g7 c9094g8 = this.f33067a;
        boolean zM36406H = c9094g8.m36338w().m36406H(this.f32870d, C9395z4.f33718G0);
        C2414ye.m11027a();
        boolean zM36406H2 = c9094g8.m36338w().m36406H(this.f32870d, C9395z4.f33716F0);
        if (z11) {
            C9294t c9294tM36507F3 = this.f33516b.m36507F0();
            String str12 = this.f32870d;
            c9294tM36507F3.m37067j();
            c9294tM36507F3.mo36088h();
            C8953m.m36041f(str12);
            ContentValues contentValues2 = new ContentValues();
            contentValues2.put("current_session_count", (Integer) 0);
            try {
                c9294tM36507F3.m36848u0().update("events", contentValues2, "app_id = ?", new String[]{str12});
            } catch (SQLiteException e10) {
                c9294tM36507F3.f33067a.mo36321a().m37003o().m36913c("Error resetting session-scoped event counts. appId", C9348w5.m36998x(str12), e10);
            }
        }
        Map map9 = Collections.EMPTY_MAP;
        String str13 = "data";
        String str14 = "audience_id";
        if (zM36406H2 && zM36406H) {
            C9294t c9294tM36507F4 = this.f33516b.m36507F0();
            String str15 = this.f32870d;
            C8953m.m36041f(str15);
            C12277a c12277a9 = new C12277a();
            try {
                cursorQuery4 = c9294tM36507F4.m36848u0().query("event_filters", new String[]{"audience_id", "data"}, "app_id=?", new String[]{str15}, null, null, null);
                try {
                    try {
                        if (cursorQuery4.moveToFirst()) {
                            while (true) {
                                try {
                                    C2421z3 c2421z3 = (C2421z3) ((C2403y3) C9277re.m36737W(C2421z3.m11037T(), cursorQuery4.getBlob(i11))).m9882t();
                                    if (c2421z3.m11045N()) {
                                        Integer numValueOf6 = Integer.valueOf(cursorQuery4.getInt(i10));
                                        List list7 = (List) c12277a9.get(numValueOf6);
                                        if (list7 == null) {
                                            arrayList5 = new ArrayList();
                                            c12277a9.put(numValueOf6, arrayList5);
                                        } else {
                                            arrayList5 = list7;
                                        }
                                        arrayList5.add(c2421z3);
                                    }
                                } catch (IOException e11) {
                                    c9294tM36507F4.f33067a.mo36321a().m37003o().m36913c("Failed to merge filter. appId", C9348w5.m36998x(str15), e11);
                                }
                                if (!cursorQuery4.moveToNext()) {
                                    break;
                                }
                                i10 = 0;
                                i11 = 1;
                            }
                            cursorQuery4.close();
                            map = c12277a9;
                        } else {
                            cursorQuery4.close();
                            map = map9;
                        }
                    } catch (SQLiteException e12) {
                        e = e12;
                        c9294tM36507F4.f33067a.mo36321a().m37003o().m36913c("Database error querying filters. appId", C9348w5.m36998x(str15), e);
                        map9 = Collections.EMPTY_MAP;
                        if (cursorQuery4 != null) {
                        }
                        map = map9;
                        C9294t c9294tM36507F5 = this.f33516b.m36507F0();
                        String str16 = this.f32870d;
                        c9294tM36507F5.m37067j();
                        c9294tM36507F5.mo36088h();
                        C8953m.m36041f(str16);
                        cursorQuery = c9294tM36507F5.m36848u0().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{str16}, null, null, null);
                        try {
                            try {
                                if (cursorQuery.moveToFirst()) {
                                    c12277a8 = new C12277a();
                                    while (true) {
                                        i13 = cursorQuery.getInt(0);
                                        try {
                                            c12277a8.put(Integer.valueOf(i13), (C2063f7) ((C2044e7) C9277re.m36737W(C2063f7.m9988P(), cursorQuery.getBlob(1))).m9882t());
                                            z12 = z11;
                                            str2 = str13;
                                        } catch (IOException e13) {
                                            z12 = z11;
                                            str2 = str13;
                                            try {
                                                c9294tM36507F5.f33067a.mo36321a().m37003o().m36914d("Failed to merge filter results. appId, audienceId, error", C9348w5.m36998x(str16), Integer.valueOf(i13), e13);
                                            } catch (SQLiteException e14) {
                                                e = e14;
                                                str14 = str14;
                                                c9294tM36507F5.f33067a.mo36321a().m37003o().m36913c("Database error querying filter results. appId", C9348w5.m36998x(str16), e);
                                                Map map10 = Collections.EMPTY_MAP;
                                                if (cursorQuery != null) {
                                                    cursorQuery.close();
                                                }
                                                map2 = map10;
                                                if (!map2.isEmpty()) {
                                                    hashSet = new HashSet(map2.keySet());
                                                    if (z12) {
                                                        String str17 = this.f32870d;
                                                        C9294t c9294tM36507F6 = this.f33516b.m36507F0();
                                                        str3 = this.f32870d;
                                                        c9294tM36507F6.m37067j();
                                                        c9294tM36507F6.mo36088h();
                                                        C8953m.m36041f(str3);
                                                        c12277a2 = new C12277a();
                                                        sQLiteDatabaseM36848u0 = c9294tM36507F6.m36848u0();
                                                        try {
                                                            try {
                                                                cursorRawQuery = sQLiteDatabaseM36848u0.rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str3, str3});
                                                                try {
                                                                    if (cursorRawQuery.moveToFirst()) {
                                                                        do {
                                                                            numValueOf = Integer.valueOf(cursorRawQuery.getInt(0));
                                                                            arrayList = (List) c12277a2.get(numValueOf);
                                                                            if (arrayList == null) {
                                                                                arrayList = new ArrayList();
                                                                                c12277a2.put(numValueOf, arrayList);
                                                                            }
                                                                            arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                                                                        } while (cursorRawQuery.moveToNext());
                                                                    } else {
                                                                        c12277a2 = Collections.EMPTY_MAP;
                                                                    }
                                                                } catch (SQLiteException e15) {
                                                                    e = e15;
                                                                    c9294tM36507F6.f33067a.mo36321a().m37003o().m36913c("Database error querying scoped filters. appId", C9348w5.m36998x(str3), e);
                                                                    c12277a2 = Collections.EMPTY_MAP;
                                                                    if (cursorRawQuery != null) {
                                                                    }
                                                                    C8953m.m36041f(str17);
                                                                    C8953m.m36047l(map2);
                                                                    c12277a3 = new C12277a();
                                                                    if (!map2.isEmpty()) {
                                                                        it2 = map2.keySet().iterator();
                                                                        while (it2.hasNext()) {
                                                                            num = (Integer) it2.next();
                                                                            num.intValue();
                                                                            c2063f9 = (C2063f7) map2.get(num);
                                                                            list4 = (List) c12277a2.get(num);
                                                                            if (list4 != null) {
                                                                            }
                                                                            map4 = c12277a2;
                                                                            hashSet3 = hashSet;
                                                                            it3 = it2;
                                                                            c12277a3.put(num, c2063f9);
                                                                            c12277a2 = map4;
                                                                            hashSet = hashSet3;
                                                                            it2 = it3;
                                                                        }
                                                                    }
                                                                    hashSet2 = hashSet;
                                                                    map3 = c12277a3;
                                                                    for (Integer num3 : hashSet2) {
                                                                        num3.intValue();
                                                                        c2063f7 = (C2063f7) map3.get(num3);
                                                                        bitSet = new BitSet();
                                                                        bitSet2 = new BitSet();
                                                                        c12277a = new C12277a();
                                                                        if (c2063f7 != null) {
                                                                            for (C2190m6 c2190m6 : c2063f7.m9995K()) {
                                                                                if (c2190m6.m10373F()) {
                                                                                    Map map11 = map3;
                                                                                    Integer numValueOf7 = Integer.valueOf(c2190m6.m10374G());
                                                                                    if (c2190m6.m10375H()) {
                                                                                        lValueOf = Long.valueOf(c2190m6.m10376J());
                                                                                    } else {
                                                                                        lValueOf = null;
                                                                                    }
                                                                                    c12277a.put(numValueOf7, lValueOf);
                                                                                    map3 = map11;
                                                                                }
                                                                            }
                                                                        }
                                                                        Map map12 = map3;
                                                                        C12277a c12277a10 = new C12277a();
                                                                        if (c2063f7 != null) {
                                                                            it = c2063f7.m9997N().iterator();
                                                                            while (it.hasNext()) {
                                                                                c2101h7 = (C2101h7) it.next();
                                                                                if (!c2101h7.m10178F()) {
                                                                                }
                                                                            }
                                                                        }
                                                                        c2063f8 = c2063f7;
                                                                        if (c2063f8 != null) {
                                                                            i12 = 0;
                                                                            while (i12 < c2063f8.m9992G() * 64) {
                                                                                if (C9277re.m36735P(c2063f8.m9991F(), i12)) {
                                                                                    z13 = zM36406H;
                                                                                    this.f33067a.mo36321a().m37011w().m36913c("Filter already evaluated. audience ID, filter ID", num3, Integer.valueOf(i12));
                                                                                    bitSet2.set(i12);
                                                                                    if (C9277re.m36735P(c2063f8.m9993H(), i12)) {
                                                                                        bitSet.set(i12);
                                                                                    }
                                                                                    i12++;
                                                                                    zM36406H = z13;
                                                                                } else {
                                                                                    z13 = zM36406H;
                                                                                }
                                                                                c12277a.remove(Integer.valueOf(i12));
                                                                                i12++;
                                                                                zM36406H = z13;
                                                                            }
                                                                        }
                                                                        boolean z14 = zM36406H;
                                                                        C2063f7 c2063f10 = (C2063f7) map2.get(num3);
                                                                        if (!zM36406H2) {
                                                                        }
                                                                        this.f32872f.put(num3, new C9052df(this, this.f32870d, c2063f10, bitSet, bitSet2, c12277a, c12277a10, null));
                                                                        str2 = str2;
                                                                        map = map;
                                                                        str14 = str14;
                                                                        map2 = map2;
                                                                        zM36406H = z14;
                                                                        map3 = map12;
                                                                    }
                                                                    str4 = str2;
                                                                    str5 = str14;
                                                                    str6 = "Skipping failed audience ID";
                                                                    if (!list.isEmpty()) {
                                                                        c9069ef = new C9069ef(this, null);
                                                                        c12277a6 = new C12277a();
                                                                        it7 = list.iterator();
                                                                        while (it7.hasNext()) {
                                                                            c2226o6 = (C2226o6) it7.next();
                                                                            c2226o6M36293a = c9069ef.m36293a(this.f32870d, c2226o6);
                                                                            if (c2226o6M36293a != null) {
                                                                                c9197me = this.f33516b;
                                                                                c9003b0M36829Z = c9197me.m36507F0().m36829Z(this.f32870d, c2226o6, c2226o6M36293a.m10490J());
                                                                                c9197me.m36507F0().m36852w0(c9003b0M36829Z);
                                                                                if (z10) {
                                                                                    continue;
                                                                                } else {
                                                                                    j10 = c9003b0M36829Z.f32702c;
                                                                                    strM10490J = c2226o6M36293a.m10490J();
                                                                                    map7 = (Map) c12277a6.get(strM10490J);
                                                                                    if (map7 == null) {
                                                                                        c9294tM36507F2 = c9197me.m36507F0();
                                                                                        str10 = this.f32870d;
                                                                                        c9294tM36507F2.m37067j();
                                                                                        c9294tM36507F2.mo36088h();
                                                                                        C8953m.m36041f(str10);
                                                                                        C8953m.m36041f(strM10490J);
                                                                                        c12277a7 = new C12277a();
                                                                                        try {
                                                                                            try {
                                                                                                str11 = str10;
                                                                                                try {
                                                                                                    cursorQuery3 = c9294tM36507F2.m36848u0().query("event_filters", new String[]{str5, str4}, "app_id=? AND event_name=?", new String[]{str10, strM10490J}, null, null, null);
                                                                                                    try {
                                                                                                        try {
                                                                                                            if (cursorQuery3.moveToFirst()) {
                                                                                                                c9003b0 = c9003b0M36829Z;
                                                                                                                while (true) {
                                                                                                                    try {
                                                                                                                        try {
                                                                                                                            C2421z3 c2421z4 = (C2421z3) ((C2403y3) C9277re.m36737W(C2421z3.m11037T(), cursorQuery3.getBlob(1))).m9882t();
                                                                                                                            numValueOf5 = Integer.valueOf(cursorQuery3.getInt(0));
                                                                                                                            list6 = (List) c12277a7.get(numValueOf5);
                                                                                                                            if (list6 == null) {
                                                                                                                                cursor4 = cursorQuery3;
                                                                                                                                try {
                                                                                                                                    arrayList4 = new ArrayList();
                                                                                                                                    c12277a7.put(numValueOf5, arrayList4);
                                                                                                                                } catch (SQLiteException e16) {
                                                                                                                                    e = e16;
                                                                                                                                    cursor3 = cursor4;
                                                                                                                                    try {
                                                                                                                                        c9294tM36507F2.f33067a.mo36321a().m37003o().m36913c("Database error querying filters. appId", C9348w5.m36998x(str11), e);
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
                                                                                                                            arrayList4.add(c2421z4);
                                                                                                                        } catch (IOException e17) {
                                                                                                                            cursor4 = cursorQuery3;
                                                                                                                            c9294tM36507F2.f33067a.mo36321a().m37003o().m36913c("Failed to merge filter. appId", C9348w5.m36998x(str11), e17);
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
                                                                                                                map7 = c12277a7;
                                                                                                            } else {
                                                                                                                c9003b0 = c9003b0M36829Z;
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
                                                                                                        c9003b0 = c9003b0M36829Z;
                                                                                                    }
                                                                                                } catch (SQLiteException e20) {
                                                                                                    e = e20;
                                                                                                    c9003b0 = c9003b0M36829Z;
                                                                                                    cursor3 = null;
                                                                                                    c9294tM36507F2.f33067a.mo36321a().m37003o().m36913c("Database error querying filters. appId", C9348w5.m36998x(str11), e);
                                                                                                    map7 = Collections.EMPTY_MAP;
                                                                                                    if (cursor3 != null) {
                                                                                                        cursor3.close();
                                                                                                    }
                                                                                                    c12277a6.put(strM10490J, map7);
                                                                                                    it8 = map7.keySet().iterator();
                                                                                                    while (it8.hasNext()) {
                                                                                                        num2 = (Integer) it8.next();
                                                                                                        iIntValue = num2.intValue();
                                                                                                        if (this.f32871e.contains(num2)) {
                                                                                                            this.f33067a.mo36321a().m37011w().m36912b("Skipping failed audience ID", num2);
                                                                                                        } else {
                                                                                                            it9 = ((List) map7.get(num2)).iterator();
                                                                                                            zM36116k = true;
                                                                                                            while (true) {
                                                                                                                if (!it9.hasNext()) {
                                                                                                                    map8 = map7;
                                                                                                                    it10 = it8;
                                                                                                                    j11 = j10;
                                                                                                                    break;
                                                                                                                }
                                                                                                                C2421z3 c2421z5 = (C2421z3) it9.next();
                                                                                                                map8 = map7;
                                                                                                                it10 = it8;
                                                                                                                c9002b = new C9002b(this, this.f32870d, iIntValue, c2421z5);
                                                                                                                j11 = j10;
                                                                                                                zM36116k = c9002b.m36116k(this.f32873g, this.f32874h, c2226o6M36293a, j11, c9003b0, m36286o(iIntValue, c2421z5.m11040G()));
                                                                                                                if (!zM36116k) {
                                                                                                                    this.f32871e.add(num2);
                                                                                                                    break;
                                                                                                                }
                                                                                                                m36285n(num2).m36281a(c9002b);
                                                                                                                j10 = j11;
                                                                                                                map7 = map8;
                                                                                                                it8 = it10;
                                                                                                            }
                                                                                                            if (!zM36116k) {
                                                                                                                this.f32871e.add(num2);
                                                                                                            }
                                                                                                            j10 = j11;
                                                                                                            map7 = map8;
                                                                                                            it8 = it10;
                                                                                                        }
                                                                                                    }
                                                                                                    it7 = it7;
                                                                                                    c9069ef = c9069ef;
                                                                                                }
                                                                                            } catch (Throwable th5) {
                                                                                                th = th5;
                                                                                                cursor3 = null;
                                                                                            }
                                                                                        } catch (SQLiteException e21) {
                                                                                            e = e21;
                                                                                            str11 = str10;
                                                                                        }
                                                                                        c12277a6.put(strM10490J, map7);
                                                                                    } else {
                                                                                        c9003b0 = c9003b0M36829Z;
                                                                                    }
                                                                                    it8 = map7.keySet().iterator();
                                                                                    while (it8.hasNext()) {
                                                                                        num2 = (Integer) it8.next();
                                                                                        iIntValue = num2.intValue();
                                                                                        if (this.f32871e.contains(num2)) {
                                                                                            this.f33067a.mo36321a().m37011w().m36912b("Skipping failed audience ID", num2);
                                                                                        } else {
                                                                                            it9 = ((List) map7.get(num2)).iterator();
                                                                                            zM36116k = true;
                                                                                            while (true) {
                                                                                                if (!it9.hasNext()) {
                                                                                                    map8 = map7;
                                                                                                    it10 = it8;
                                                                                                    j11 = j10;
                                                                                                    break;
                                                                                                }
                                                                                                C2421z3 c2421z6 = (C2421z3) it9.next();
                                                                                                map8 = map7;
                                                                                                it10 = it8;
                                                                                                c9002b = new C9002b(this, this.f32870d, iIntValue, c2421z6);
                                                                                                j11 = j10;
                                                                                                zM36116k = c9002b.m36116k(this.f32873g, this.f32874h, c2226o6M36293a, j11, c9003b0, m36286o(iIntValue, c2421z6.m11040G()));
                                                                                                if (!zM36116k) {
                                                                                                    this.f32871e.add(num2);
                                                                                                    break;
                                                                                                }
                                                                                                m36285n(num2).m36281a(c9002b);
                                                                                                j10 = j11;
                                                                                                map7 = map8;
                                                                                                it8 = it10;
                                                                                            }
                                                                                            if (!zM36116k) {
                                                                                                this.f32871e.add(num2);
                                                                                            }
                                                                                            j10 = j11;
                                                                                            map7 = map8;
                                                                                            it8 = it10;
                                                                                        }
                                                                                    }
                                                                                    it7 = it7;
                                                                                    c9069ef = c9069ef;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    if (!z10) {
                                                                        return new ArrayList();
                                                                    }
                                                                    if (!list2.isEmpty()) {
                                                                        c12277a4 = new C12277a();
                                                                        it4 = list2.iterator();
                                                                        while (it4.hasNext()) {
                                                                            C2281r7 c2281r7 = (C2281r7) it4.next();
                                                                            strM10609H = c2281r7.m10609H();
                                                                            map5 = (Map) c12277a4.get(strM10609H);
                                                                            if (map5 == null) {
                                                                                c9294tM36507F1 = this.f33516b.m36507F0();
                                                                                str8 = this.f32870d;
                                                                                c9294tM36507F1.m37067j();
                                                                                c9294tM36507F1.mo36088h();
                                                                                C8953m.m36041f(str8);
                                                                                C8953m.m36041f(strM10609H);
                                                                                c12277a5 = new C12277a();
                                                                                try {
                                                                                    cursorQuery2 = c9294tM36507F1.m36848u0().query("property_filters", new String[]{str5, str4}, "app_id=? AND property_name=?", new String[]{str8, strM10609H}, null, null, null);
                                                                                    try {
                                                                                        try {
                                                                                            if (cursorQuery2.moveToFirst()) {
                                                                                                while (true) {
                                                                                                    try {
                                                                                                        C2098h4 c2098h5 = (C2098h4) ((C2079g4) C9277re.m36737W(C2098h4.m10159P(), cursorQuery2.getBlob(1))).m9882t();
                                                                                                        numValueOf4 = Integer.valueOf(cursorQuery2.getInt(0));
                                                                                                        list5 = (List) c12277a5.get(numValueOf4);
                                                                                                        if (list5 == null) {
                                                                                                            it5 = it4;
                                                                                                            try {
                                                                                                                arrayList3 = new ArrayList();
                                                                                                                c12277a5.put(numValueOf4, arrayList3);
                                                                                                            } catch (SQLiteException e22) {
                                                                                                                e = e22;
                                                                                                                str9 = str8;
                                                                                                                c9294tM36507F1.f33067a.mo36321a().m37003o().m36913c("Database error querying filters. appId", C9348w5.m36998x(str9), e);
                                                                                                                map5 = Collections.EMPTY_MAP;
                                                                                                                if (cursorQuery2 != null) {
                                                                                                                    cursorQuery2.close();
                                                                                                                }
                                                                                                                c12277a4.put(strM10609H, map5);
                                                                                                                for (Integer num4 : map5.keySet()) {
                                                                                                                    int iIntValue2 = num4.intValue();
                                                                                                                    if (this.f32871e.contains(num4)) {
                                                                                                                        this.f33067a.mo36321a().m37011w().m36912b(str6, num4);
                                                                                                                        break;
                                                                                                                    }
                                                                                                                    it6 = ((List) map5.get(num4)).iterator();
                                                                                                                    zM36276k = true;
                                                                                                                    while (true) {
                                                                                                                        if (it6.hasNext()) {
                                                                                                                            c2098h4 = (C2098h4) it6.next();
                                                                                                                            c9094g7 = this.f33067a;
                                                                                                                            map6 = map5;
                                                                                                                            if (Log.isLoggable(c9094g7.mo36321a().m37013z(), 2)) {
                                                                                                                                C9316u5 c9316u5M37011w = c9094g7.mo36321a().m37011w();
                                                                                                                                if (c2098h4.m10161F()) {
                                                                                                                                    numValueOf3 = Integer.valueOf(c2098h4.m10162G());
                                                                                                                                } else {
                                                                                                                                    numValueOf3 = null;
                                                                                                                                }
                                                                                                                                c9316u5M37011w.m36914d("Evaluating filter. audience, filter, property", num4, numValueOf3, c9094g7.m36309D().m36622c(c2098h4.m10163H()));
                                                                                                                                c9094g7.mo36321a().m37011w().m36912b("Filter definition", this.f33516b.m36515K0().m36756M(c2098h4));
                                                                                                                            }
                                                                                                                            if (c2098h4.m10161F()) {
                                                                                                                            }
                                                                                                                            C9316u5 c9316u5M37006r = c9094g7.mo36321a().m37006r();
                                                                                                                            Object objM36998x = C9348w5.m36998x(this.f32870d);
                                                                                                                            if (c2098h4.m10161F()) {
                                                                                                                                numValueOf2 = Integer.valueOf(c2098h4.m10162G());
                                                                                                                            } else {
                                                                                                                                numValueOf2 = null;
                                                                                                                            }
                                                                                                                            c9316u5M37006r.m36913c("Invalid property filter ID. appId, id", objM36998x, String.valueOf(numValueOf2));
                                                                                                                            this.f32871e.add(num4);
                                                                                                                            map5 = map6;
                                                                                                                            c12277a4 = c12277a4;
                                                                                                                            str6 = str6;
                                                                                                                        } else {
                                                                                                                            map6 = map5;
                                                                                                                            str6 = str6;
                                                                                                                            c12277a4 = c12277a4;
                                                                                                                        }
                                                                                                                        if (!zM36276k) {
                                                                                                                            this.f32871e.add(num4);
                                                                                                                        }
                                                                                                                        map5 = map6;
                                                                                                                        c12277a4 = c12277a4;
                                                                                                                        str6 = str6;
                                                                                                                        m36285n(num4).m36281a(c9036d);
                                                                                                                        map5 = map6;
                                                                                                                        c12277a4 = c12277a4;
                                                                                                                        str6 = str6;
                                                                                                                    }
                                                                                                                }
                                                                                                                it4 = it5;
                                                                                                            }
                                                                                                        } else {
                                                                                                            it5 = it4;
                                                                                                            arrayList3 = list5;
                                                                                                        }
                                                                                                        arrayList3.add(c2098h5);
                                                                                                        str9 = str8;
                                                                                                    } catch (IOException e23) {
                                                                                                        it5 = it4;
                                                                                                        str9 = str8;
                                                                                                        c9294tM36507F1.f33067a.mo36321a().m37003o().m36913c("Failed to merge filter", C9348w5.m36998x(str9), e23);
                                                                                                    }
                                                                                                    try {
                                                                                                        if (!cursorQuery2.moveToNext()) {
                                                                                                            break;
                                                                                                        }
                                                                                                        it4 = it5;
                                                                                                        str8 = str9;
                                                                                                    } catch (SQLiteException e24) {
                                                                                                        e = e24;
                                                                                                        c9294tM36507F1.f33067a.mo36321a().m37003o().m36913c("Database error querying filters. appId", C9348w5.m36998x(str9), e);
                                                                                                        map5 = Collections.EMPTY_MAP;
                                                                                                        if (cursorQuery2 != null) {
                                                                                                            cursorQuery2.close();
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                cursorQuery2.close();
                                                                                                map5 = c12277a5;
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
                                                                                c12277a4.put(strM10609H, map5);
                                                                            } else {
                                                                                it5 = it4;
                                                                            }
                                                                            while (r4.hasNext()) {
                                                                                int iIntValue3 = num4.intValue();
                                                                                if (this.f32871e.contains(num4)) {
                                                                                    this.f33067a.mo36321a().m37011w().m36912b(str6, num4);
                                                                                    break;
                                                                                    break;
                                                                                }
                                                                                it6 = ((List) map5.get(num4)).iterator();
                                                                                zM36276k = true;
                                                                                while (true) {
                                                                                    if (it6.hasNext()) {
                                                                                        c2098h4 = (C2098h4) it6.next();
                                                                                        c9094g7 = this.f33067a;
                                                                                        map6 = map5;
                                                                                        if (Log.isLoggable(c9094g7.mo36321a().m37013z(), 2)) {
                                                                                            C9316u5 c9316u5M37011w2 = c9094g7.mo36321a().m37011w();
                                                                                            if (c2098h4.m10161F()) {
                                                                                                numValueOf3 = Integer.valueOf(c2098h4.m10162G());
                                                                                            } else {
                                                                                                numValueOf3 = null;
                                                                                            }
                                                                                            c9316u5M37011w2.m36914d("Evaluating filter. audience, filter, property", num4, numValueOf3, c9094g7.m36309D().m36622c(c2098h4.m10163H()));
                                                                                            c9094g7.mo36321a().m37011w().m36912b("Filter definition", this.f33516b.m36515K0().m36756M(c2098h4));
                                                                                        }
                                                                                        if (c2098h4.m10161F()) {
                                                                                        }
                                                                                        C9316u5 c9316u5M37006r2 = c9094g7.mo36321a().m37006r();
                                                                                        Object objM36998x2 = C9348w5.m36998x(this.f32870d);
                                                                                        if (c2098h4.m10161F()) {
                                                                                            numValueOf2 = Integer.valueOf(c2098h4.m10162G());
                                                                                        } else {
                                                                                            numValueOf2 = null;
                                                                                        }
                                                                                        c9316u5M37006r2.m36913c("Invalid property filter ID. appId, id", objM36998x2, String.valueOf(numValueOf2));
                                                                                        this.f32871e.add(num4);
                                                                                        map5 = map6;
                                                                                        c12277a4 = c12277a4;
                                                                                        str6 = str6;
                                                                                    } else {
                                                                                        map6 = map5;
                                                                                        str6 = str6;
                                                                                        c12277a4 = c12277a4;
                                                                                    }
                                                                                    if (!zM36276k) {
                                                                                        this.f32871e.add(num4);
                                                                                    }
                                                                                    map5 = map6;
                                                                                    c12277a4 = c12277a4;
                                                                                    str6 = str6;
                                                                                    m36285n(num4).m36281a(c9036d);
                                                                                    map5 = map6;
                                                                                    c12277a4 = c12277a4;
                                                                                    str6 = str6;
                                                                                }
                                                                            }
                                                                            it4 = it5;
                                                                        }
                                                                    }
                                                                    arrayList2 = new ArrayList();
                                                                    Set<Integer> setKeySet = this.f32872f.keySet();
                                                                    setKeySet.removeAll(this.f32871e);
                                                                    for (Integer num5 : setKeySet) {
                                                                        int iIntValue4 = num5.intValue();
                                                                        C9052df c9052df = (C9052df) this.f32872f.get(num5);
                                                                        C8953m.m36047l(c9052df);
                                                                        C2005c6 c2005c6M36282b = c9052df.m36282b(iIntValue4);
                                                                        arrayList2.add(c2005c6M36282b);
                                                                        c9294tM36507F0 = this.f33516b.m36507F0();
                                                                        str7 = this.f32870d;
                                                                        C2063f7 c2063f7M9850H = c2005c6M36282b.m9850H();
                                                                        c9294tM36507F0.m37067j();
                                                                        c9294tM36507F0.mo36088h();
                                                                        C8953m.m36041f(str7);
                                                                        C8953m.m36047l(c2063f7M9850H);
                                                                        byte[] bArrM10628d = c2063f7M9850H.m10628d();
                                                                        contentValues = new ContentValues();
                                                                        contentValues.put("app_id", str7);
                                                                        contentValues.put(str5, num5);
                                                                        contentValues.put("current_results", bArrM10628d);
                                                                        try {
                                                                            try {
                                                                                if (c9294tM36507F0.m36848u0().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                                                                                    c9294tM36507F0.f33067a.mo36321a().m37003o().m36912b("Failed to insert filter results (got -1). appId", C9348w5.m36998x(str7));
                                                                                }
                                                                            } catch (SQLiteException e27) {
                                                                                e = e27;
                                                                                c9294tM36507F0.f33067a.mo36321a().m37003o().m36913c("Error storing filter results. appId", C9348w5.m36998x(str7), e);
                                                                            }
                                                                        } catch (SQLiteException e28) {
                                                                            e = e28;
                                                                        }
                                                                    }
                                                                    return arrayList2;
                                                                }
                                                            } catch (Throwable th8) {
                                                                th = th8;
                                                                r8 = sQLiteDatabaseM36848u0;
                                                                if (r8 != 0) {
                                                                    r8.close();
                                                                }
                                                                throw th;
                                                            }
                                                        } catch (SQLiteException e29) {
                                                            e = e29;
                                                            cursorRawQuery = null;
                                                        } catch (Throwable th9) {
                                                            th = th9;
                                                            r8 = 0;
                                                            if (r8 != 0) {
                                                                r8.close();
                                                            }
                                                            throw th;
                                                        }
                                                        cursorRawQuery.close();
                                                        C8953m.m36041f(str17);
                                                        C8953m.m36047l(map2);
                                                        c12277a3 = new C12277a();
                                                        if (!map2.isEmpty()) {
                                                            it2 = map2.keySet().iterator();
                                                            while (it2.hasNext()) {
                                                                num = (Integer) it2.next();
                                                                num.intValue();
                                                                c2063f9 = (C2063f7) map2.get(num);
                                                                list4 = (List) c12277a2.get(num);
                                                                if (list4 != null) {
                                                                }
                                                                map4 = c12277a2;
                                                                hashSet3 = hashSet;
                                                                it3 = it2;
                                                                c12277a3.put(num, c2063f9);
                                                                c12277a2 = map4;
                                                                hashSet = hashSet3;
                                                                it2 = it3;
                                                            }
                                                        }
                                                        hashSet2 = hashSet;
                                                        map3 = c12277a3;
                                                    } else {
                                                        hashSet2 = hashSet;
                                                        map3 = map2;
                                                    }
                                                    while (r16.hasNext()) {
                                                        num3.intValue();
                                                        c2063f7 = (C2063f7) map3.get(num3);
                                                        bitSet = new BitSet();
                                                        bitSet2 = new BitSet();
                                                        c12277a = new C12277a();
                                                        if (c2063f7 != null) {
                                                            while (r7.hasNext()) {
                                                                if (c2190m6.m10373F()) {
                                                                    Map map13 = map3;
                                                                    Integer numValueOf8 = Integer.valueOf(c2190m6.m10374G());
                                                                    if (c2190m6.m10375H()) {
                                                                        lValueOf = Long.valueOf(c2190m6.m10376J());
                                                                    } else {
                                                                        lValueOf = null;
                                                                    }
                                                                    c12277a.put(numValueOf8, lValueOf);
                                                                    map3 = map13;
                                                                }
                                                            }
                                                        }
                                                        Map map14 = map3;
                                                        C12277a c12277a11 = new C12277a();
                                                        if (c2063f7 != null) {
                                                            it = c2063f7.m9997N().iterator();
                                                            while (it.hasNext()) {
                                                                c2101h7 = (C2101h7) it.next();
                                                                if (!c2101h7.m10178F()) {
                                                                }
                                                            }
                                                        }
                                                        c2063f8 = c2063f7;
                                                        if (c2063f8 != null) {
                                                            i12 = 0;
                                                            while (i12 < c2063f8.m9992G() * 64) {
                                                                if (C9277re.m36735P(c2063f8.m9991F(), i12)) {
                                                                    z13 = zM36406H;
                                                                    this.f33067a.mo36321a().m37011w().m36913c("Filter already evaluated. audience ID, filter ID", num3, Integer.valueOf(i12));
                                                                    bitSet2.set(i12);
                                                                    if (C9277re.m36735P(c2063f8.m9993H(), i12)) {
                                                                        bitSet.set(i12);
                                                                    }
                                                                    i12++;
                                                                    zM36406H = z13;
                                                                } else {
                                                                    z13 = zM36406H;
                                                                }
                                                                c12277a.remove(Integer.valueOf(i12));
                                                                i12++;
                                                                zM36406H = z13;
                                                            }
                                                        }
                                                        boolean z15 = zM36406H;
                                                        C2063f7 c2063f11 = (C2063f7) map2.get(num3);
                                                        if (!zM36406H2) {
                                                        }
                                                        this.f32872f.put(num3, new C9052df(this, this.f32870d, c2063f11, bitSet, bitSet2, c12277a, c12277a11, null));
                                                        str2 = str2;
                                                        map = map;
                                                        str14 = str14;
                                                        map2 = map2;
                                                        zM36406H = z15;
                                                        map3 = map14;
                                                    }
                                                }
                                                str4 = str2;
                                                str5 = str14;
                                                str6 = "Skipping failed audience ID";
                                                if (!list.isEmpty()) {
                                                    c9069ef = new C9069ef(this, null);
                                                    c12277a6 = new C12277a();
                                                    it7 = list.iterator();
                                                    while (it7.hasNext()) {
                                                        c2226o6 = (C2226o6) it7.next();
                                                        c2226o6M36293a = c9069ef.m36293a(this.f32870d, c2226o6);
                                                        if (c2226o6M36293a != null) {
                                                            c9197me = this.f33516b;
                                                            c9003b0M36829Z = c9197me.m36507F0().m36829Z(this.f32870d, c2226o6, c2226o6M36293a.m10490J());
                                                            c9197me.m36507F0().m36852w0(c9003b0M36829Z);
                                                            if (z10) {
                                                                j10 = c9003b0M36829Z.f32702c;
                                                                strM10490J = c2226o6M36293a.m10490J();
                                                                map7 = (Map) c12277a6.get(strM10490J);
                                                                if (map7 == null) {
                                                                    c9294tM36507F2 = c9197me.m36507F0();
                                                                    str10 = this.f32870d;
                                                                    c9294tM36507F2.m37067j();
                                                                    c9294tM36507F2.mo36088h();
                                                                    C8953m.m36041f(str10);
                                                                    C8953m.m36041f(strM10490J);
                                                                    c12277a7 = new C12277a();
                                                                    str11 = str10;
                                                                    cursorQuery3 = c9294tM36507F2.m36848u0().query("event_filters", new String[]{str5, str4}, "app_id=? AND event_name=?", new String[]{str10, strM10490J}, null, null, null);
                                                                    if (cursorQuery3.moveToFirst()) {
                                                                        c9003b0 = c9003b0M36829Z;
                                                                        while (true) {
                                                                            C2421z3 c2421z7 = (C2421z3) ((C2403y3) C9277re.m36737W(C2421z3.m11037T(), cursorQuery3.getBlob(1))).m9882t();
                                                                            numValueOf5 = Integer.valueOf(cursorQuery3.getInt(0));
                                                                            list6 = (List) c12277a7.get(numValueOf5);
                                                                            if (list6 == null) {
                                                                                cursor4 = cursorQuery3;
                                                                                arrayList4 = new ArrayList();
                                                                                c12277a7.put(numValueOf5, arrayList4);
                                                                            } else {
                                                                                cursor4 = cursorQuery3;
                                                                                arrayList4 = list6;
                                                                            }
                                                                            arrayList4.add(c2421z7);
                                                                            if (!cursor4.moveToNext()) {
                                                                                break;
                                                                                break;
                                                                            }
                                                                            cursorQuery3 = cursor4;
                                                                        }
                                                                        cursor4.close();
                                                                        map7 = c12277a7;
                                                                    } else {
                                                                        c9003b0 = c9003b0M36829Z;
                                                                        map7 = Collections.EMPTY_MAP;
                                                                        cursorQuery3.close();
                                                                    }
                                                                    c12277a6.put(strM10490J, map7);
                                                                } else {
                                                                    c9003b0 = c9003b0M36829Z;
                                                                }
                                                                it8 = map7.keySet().iterator();
                                                                while (it8.hasNext()) {
                                                                    num2 = (Integer) it8.next();
                                                                    iIntValue = num2.intValue();
                                                                    if (this.f32871e.contains(num2)) {
                                                                        this.f33067a.mo36321a().m37011w().m36912b("Skipping failed audience ID", num2);
                                                                    } else {
                                                                        it9 = ((List) map7.get(num2)).iterator();
                                                                        zM36116k = true;
                                                                        while (true) {
                                                                            if (!it9.hasNext()) {
                                                                                map8 = map7;
                                                                                it10 = it8;
                                                                                j11 = j10;
                                                                                break;
                                                                            }
                                                                            C2421z3 c2421z8 = (C2421z3) it9.next();
                                                                            map8 = map7;
                                                                            it10 = it8;
                                                                            c9002b = new C9002b(this, this.f32870d, iIntValue, c2421z8);
                                                                            j11 = j10;
                                                                            zM36116k = c9002b.m36116k(this.f32873g, this.f32874h, c2226o6M36293a, j11, c9003b0, m36286o(iIntValue, c2421z8.m11040G()));
                                                                            if (!zM36116k) {
                                                                                this.f32871e.add(num2);
                                                                                break;
                                                                            }
                                                                            m36285n(num2).m36281a(c9002b);
                                                                            j10 = j11;
                                                                            map7 = map8;
                                                                            it8 = it10;
                                                                        }
                                                                        if (!zM36116k) {
                                                                            this.f32871e.add(num2);
                                                                        }
                                                                        j10 = j11;
                                                                        map7 = map8;
                                                                        it8 = it10;
                                                                    }
                                                                }
                                                                it7 = it7;
                                                                c9069ef = c9069ef;
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
                                                    c12277a4 = new C12277a();
                                                    it4 = list2.iterator();
                                                    while (it4.hasNext()) {
                                                        C2281r7 c2281r8 = (C2281r7) it4.next();
                                                        strM10609H = c2281r8.m10609H();
                                                        map5 = (Map) c12277a4.get(strM10609H);
                                                        if (map5 == null) {
                                                            c9294tM36507F1 = this.f33516b.m36507F0();
                                                            str8 = this.f32870d;
                                                            c9294tM36507F1.m37067j();
                                                            c9294tM36507F1.mo36088h();
                                                            C8953m.m36041f(str8);
                                                            C8953m.m36041f(strM10609H);
                                                            c12277a5 = new C12277a();
                                                            cursorQuery2 = c9294tM36507F1.m36848u0().query("property_filters", new String[]{str5, str4}, "app_id=? AND property_name=?", new String[]{str8, strM10609H}, null, null, null);
                                                            if (cursorQuery2.moveToFirst()) {
                                                                while (true) {
                                                                    C2098h4 c2098h6 = (C2098h4) ((C2079g4) C9277re.m36737W(C2098h4.m10159P(), cursorQuery2.getBlob(1))).m9882t();
                                                                    numValueOf4 = Integer.valueOf(cursorQuery2.getInt(0));
                                                                    list5 = (List) c12277a5.get(numValueOf4);
                                                                    if (list5 == null) {
                                                                        it5 = it4;
                                                                        arrayList3 = new ArrayList();
                                                                        c12277a5.put(numValueOf4, arrayList3);
                                                                    } else {
                                                                        it5 = it4;
                                                                        arrayList3 = list5;
                                                                    }
                                                                    arrayList3.add(c2098h6);
                                                                    str9 = str8;
                                                                    if (!cursorQuery2.moveToNext()) {
                                                                        break;
                                                                        break;
                                                                    }
                                                                    it4 = it5;
                                                                    str8 = str9;
                                                                }
                                                                cursorQuery2.close();
                                                                map5 = c12277a5;
                                                            } else {
                                                                it5 = it4;
                                                                map5 = Collections.EMPTY_MAP;
                                                                cursorQuery2.close();
                                                            }
                                                            c12277a4.put(strM10609H, map5);
                                                        } else {
                                                            it5 = it4;
                                                        }
                                                        while (r4.hasNext()) {
                                                            int iIntValue5 = num4.intValue();
                                                            if (this.f32871e.contains(num4)) {
                                                                this.f33067a.mo36321a().m37011w().m36912b(str6, num4);
                                                                break;
                                                                break;
                                                            }
                                                            it6 = ((List) map5.get(num4)).iterator();
                                                            zM36276k = true;
                                                            while (true) {
                                                                if (it6.hasNext()) {
                                                                    c2098h4 = (C2098h4) it6.next();
                                                                    c9094g7 = this.f33067a;
                                                                    map6 = map5;
                                                                    if (Log.isLoggable(c9094g7.mo36321a().m37013z(), 2)) {
                                                                        C9316u5 c9316u5M37011w3 = c9094g7.mo36321a().m37011w();
                                                                        if (c2098h4.m10161F()) {
                                                                            numValueOf3 = Integer.valueOf(c2098h4.m10162G());
                                                                        } else {
                                                                            numValueOf3 = null;
                                                                        }
                                                                        c9316u5M37011w3.m36914d("Evaluating filter. audience, filter, property", num4, numValueOf3, c9094g7.m36309D().m36622c(c2098h4.m10163H()));
                                                                        c9094g7.mo36321a().m37011w().m36912b("Filter definition", this.f33516b.m36515K0().m36756M(c2098h4));
                                                                    }
                                                                    if (c2098h4.m10161F()) {
                                                                    }
                                                                    C9316u5 c9316u5M37006r3 = c9094g7.mo36321a().m37006r();
                                                                    Object objM36998x3 = C9348w5.m36998x(this.f32870d);
                                                                    if (c2098h4.m10161F()) {
                                                                        numValueOf2 = Integer.valueOf(c2098h4.m10162G());
                                                                    } else {
                                                                        numValueOf2 = null;
                                                                    }
                                                                    c9316u5M37006r3.m36913c("Invalid property filter ID. appId, id", objM36998x3, String.valueOf(numValueOf2));
                                                                    this.f32871e.add(num4);
                                                                    map5 = map6;
                                                                    c12277a4 = c12277a4;
                                                                    str6 = str6;
                                                                } else {
                                                                    map6 = map5;
                                                                    str6 = str6;
                                                                    c12277a4 = c12277a4;
                                                                }
                                                                if (!zM36276k) {
                                                                    this.f32871e.add(num4);
                                                                }
                                                                map5 = map6;
                                                                c12277a4 = c12277a4;
                                                                str6 = str6;
                                                                m36285n(num4).m36281a(c9036d);
                                                                map5 = map6;
                                                                c12277a4 = c12277a4;
                                                                str6 = str6;
                                                            }
                                                        }
                                                        it4 = it5;
                                                    }
                                                }
                                                arrayList2 = new ArrayList();
                                                Set<Integer> setKeySet2 = this.f32872f.keySet();
                                                setKeySet2.removeAll(this.f32871e);
                                                while (r3.hasNext()) {
                                                    int iIntValue6 = num5.intValue();
                                                    C9052df c9052df2 = (C9052df) this.f32872f.get(num5);
                                                    C8953m.m36047l(c9052df2);
                                                    C2005c6 c2005c6M36282b2 = c9052df2.m36282b(iIntValue6);
                                                    arrayList2.add(c2005c6M36282b2);
                                                    c9294tM36507F0 = this.f33516b.m36507F0();
                                                    str7 = this.f32870d;
                                                    C2063f7 c2063f7M9850H2 = c2005c6M36282b2.m9850H();
                                                    c9294tM36507F0.m37067j();
                                                    c9294tM36507F0.mo36088h();
                                                    C8953m.m36041f(str7);
                                                    C8953m.m36047l(c2063f7M9850H2);
                                                    byte[] bArrM10628d2 = c2063f7M9850H2.m10628d();
                                                    contentValues = new ContentValues();
                                                    contentValues.put("app_id", str7);
                                                    contentValues.put(str5, num5);
                                                    contentValues.put("current_results", bArrM10628d2);
                                                    if (c9294tM36507F0.m36848u0().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                                                        c9294tM36507F0.f33067a.mo36321a().m37003o().m36912b("Failed to insert filter results (got -1). appId", C9348w5.m36998x(str7));
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
                                            c9294tM36507F5.f33067a.mo36321a().m37003o().m36913c("Database error querying filter results. appId", C9348w5.m36998x(str16), e);
                                            Map map15 = Collections.EMPTY_MAP;
                                            if (cursorQuery != null) {
                                                cursorQuery.close();
                                            }
                                            map2 = map15;
                                        }
                                    }
                                    cursorQuery.close();
                                    map2 = c12277a8;
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
                                String str18 = this.f32870d;
                                C9294t c9294tM36507F7 = this.f33516b.m36507F0();
                                str3 = this.f32870d;
                                c9294tM36507F7.m37067j();
                                c9294tM36507F7.mo36088h();
                                C8953m.m36041f(str3);
                                c12277a2 = new C12277a();
                                sQLiteDatabaseM36848u0 = c9294tM36507F7.m36848u0();
                                cursorRawQuery = sQLiteDatabaseM36848u0.rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str3, str3});
                                if (cursorRawQuery.moveToFirst()) {
                                    do {
                                        numValueOf = Integer.valueOf(cursorRawQuery.getInt(0));
                                        arrayList = (List) c12277a2.get(numValueOf);
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                            c12277a2.put(numValueOf, arrayList);
                                        }
                                        arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                                    } while (cursorRawQuery.moveToNext());
                                } else {
                                    c12277a2 = Collections.EMPTY_MAP;
                                }
                                cursorRawQuery.close();
                                C8953m.m36041f(str18);
                                C8953m.m36047l(map2);
                                c12277a3 = new C12277a();
                                if (!map2.isEmpty()) {
                                    it2 = map2.keySet().iterator();
                                    while (it2.hasNext()) {
                                        num = (Integer) it2.next();
                                        num.intValue();
                                        c2063f9 = (C2063f7) map2.get(num);
                                        list4 = (List) c12277a2.get(num);
                                        if (list4 != null) {
                                        }
                                        map4 = c12277a2;
                                        hashSet3 = hashSet;
                                        it3 = it2;
                                        c12277a3.put(num, c2063f9);
                                        c12277a2 = map4;
                                        hashSet = hashSet3;
                                        it2 = it3;
                                    }
                                }
                                hashSet2 = hashSet;
                                map3 = c12277a3;
                            } else {
                                hashSet2 = hashSet;
                                map3 = map2;
                            }
                            while (r16.hasNext()) {
                                num3.intValue();
                                c2063f7 = (C2063f7) map3.get(num3);
                                bitSet = new BitSet();
                                bitSet2 = new BitSet();
                                c12277a = new C12277a();
                                if (c2063f7 != null) {
                                    while (r7.hasNext()) {
                                        if (c2190m6.m10373F()) {
                                            Map map17 = map3;
                                            Integer numValueOf9 = Integer.valueOf(c2190m6.m10374G());
                                            if (c2190m6.m10375H()) {
                                                lValueOf = Long.valueOf(c2190m6.m10376J());
                                            } else {
                                                lValueOf = null;
                                            }
                                            c12277a.put(numValueOf9, lValueOf);
                                            map3 = map17;
                                        }
                                    }
                                }
                                Map map18 = map3;
                                C12277a c12277a12 = new C12277a();
                                if (c2063f7 != null) {
                                    it = c2063f7.m9997N().iterator();
                                    while (it.hasNext()) {
                                        c2101h7 = (C2101h7) it.next();
                                        if (!c2101h7.m10178F()) {
                                        }
                                    }
                                }
                                c2063f8 = c2063f7;
                                if (c2063f8 != null) {
                                    i12 = 0;
                                    while (i12 < c2063f8.m9992G() * 64) {
                                        if (C9277re.m36735P(c2063f8.m9991F(), i12)) {
                                            z13 = zM36406H;
                                            this.f33067a.mo36321a().m37011w().m36913c("Filter already evaluated. audience ID, filter ID", num3, Integer.valueOf(i12));
                                            bitSet2.set(i12);
                                            if (C9277re.m36735P(c2063f8.m9993H(), i12)) {
                                                bitSet.set(i12);
                                            }
                                            i12++;
                                            zM36406H = z13;
                                        } else {
                                            z13 = zM36406H;
                                        }
                                        c12277a.remove(Integer.valueOf(i12));
                                        i12++;
                                        zM36406H = z13;
                                    }
                                }
                                boolean z16 = zM36406H;
                                C2063f7 c2063f12 = (C2063f7) map2.get(num3);
                                if (!zM36406H2) {
                                }
                                this.f32872f.put(num3, new C9052df(this, this.f32870d, c2063f12, bitSet, bitSet2, c12277a, c12277a12, null));
                                str2 = str2;
                                map = map;
                                str14 = str14;
                                map2 = map2;
                                zM36406H = z16;
                                map3 = map18;
                            }
                        }
                        str4 = str2;
                        str5 = str14;
                        str6 = "Skipping failed audience ID";
                        if (!list.isEmpty()) {
                            c9069ef = new C9069ef(this, null);
                            c12277a6 = new C12277a();
                            it7 = list.iterator();
                            while (it7.hasNext()) {
                                c2226o6 = (C2226o6) it7.next();
                                c2226o6M36293a = c9069ef.m36293a(this.f32870d, c2226o6);
                                if (c2226o6M36293a != null) {
                                    c9197me = this.f33516b;
                                    c9003b0M36829Z = c9197me.m36507F0().m36829Z(this.f32870d, c2226o6, c2226o6M36293a.m10490J());
                                    c9197me.m36507F0().m36852w0(c9003b0M36829Z);
                                    if (z10) {
                                        j10 = c9003b0M36829Z.f32702c;
                                        strM10490J = c2226o6M36293a.m10490J();
                                        map7 = (Map) c12277a6.get(strM10490J);
                                        if (map7 == null) {
                                            c9294tM36507F2 = c9197me.m36507F0();
                                            str10 = this.f32870d;
                                            c9294tM36507F2.m37067j();
                                            c9294tM36507F2.mo36088h();
                                            C8953m.m36041f(str10);
                                            C8953m.m36041f(strM10490J);
                                            c12277a7 = new C12277a();
                                            str11 = str10;
                                            cursorQuery3 = c9294tM36507F2.m36848u0().query("event_filters", new String[]{str5, str4}, "app_id=? AND event_name=?", new String[]{str10, strM10490J}, null, null, null);
                                            if (cursorQuery3.moveToFirst()) {
                                                c9003b0 = c9003b0M36829Z;
                                                while (true) {
                                                    C2421z3 c2421z9 = (C2421z3) ((C2403y3) C9277re.m36737W(C2421z3.m11037T(), cursorQuery3.getBlob(1))).m9882t();
                                                    numValueOf5 = Integer.valueOf(cursorQuery3.getInt(0));
                                                    list6 = (List) c12277a7.get(numValueOf5);
                                                    if (list6 == null) {
                                                        cursor4 = cursorQuery3;
                                                        arrayList4 = new ArrayList();
                                                        c12277a7.put(numValueOf5, arrayList4);
                                                    } else {
                                                        cursor4 = cursorQuery3;
                                                        arrayList4 = list6;
                                                    }
                                                    arrayList4.add(c2421z9);
                                                    if (!cursor4.moveToNext()) {
                                                        break;
                                                        break;
                                                    }
                                                    cursorQuery3 = cursor4;
                                                }
                                                cursor4.close();
                                                map7 = c12277a7;
                                            } else {
                                                c9003b0 = c9003b0M36829Z;
                                                map7 = Collections.EMPTY_MAP;
                                                cursorQuery3.close();
                                            }
                                            c12277a6.put(strM10490J, map7);
                                        } else {
                                            c9003b0 = c9003b0M36829Z;
                                        }
                                        it8 = map7.keySet().iterator();
                                        while (it8.hasNext()) {
                                            num2 = (Integer) it8.next();
                                            iIntValue = num2.intValue();
                                            if (this.f32871e.contains(num2)) {
                                                this.f33067a.mo36321a().m37011w().m36912b("Skipping failed audience ID", num2);
                                            } else {
                                                it9 = ((List) map7.get(num2)).iterator();
                                                zM36116k = true;
                                                while (true) {
                                                    if (!it9.hasNext()) {
                                                        map8 = map7;
                                                        it10 = it8;
                                                        j11 = j10;
                                                        break;
                                                    }
                                                    C2421z3 c2421z10 = (C2421z3) it9.next();
                                                    map8 = map7;
                                                    it10 = it8;
                                                    c9002b = new C9002b(this, this.f32870d, iIntValue, c2421z10);
                                                    j11 = j10;
                                                    zM36116k = c9002b.m36116k(this.f32873g, this.f32874h, c2226o6M36293a, j11, c9003b0, m36286o(iIntValue, c2421z10.m11040G()));
                                                    if (!zM36116k) {
                                                        this.f32871e.add(num2);
                                                        break;
                                                    }
                                                    m36285n(num2).m36281a(c9002b);
                                                    j10 = j11;
                                                    map7 = map8;
                                                    it8 = it10;
                                                }
                                                if (!zM36116k) {
                                                    this.f32871e.add(num2);
                                                }
                                                j10 = j11;
                                                map7 = map8;
                                                it8 = it10;
                                            }
                                        }
                                        it7 = it7;
                                        c9069ef = c9069ef;
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
                            c12277a4 = new C12277a();
                            it4 = list2.iterator();
                            while (it4.hasNext()) {
                                C2281r7 c2281r9 = (C2281r7) it4.next();
                                strM10609H = c2281r9.m10609H();
                                map5 = (Map) c12277a4.get(strM10609H);
                                if (map5 == null) {
                                    c9294tM36507F1 = this.f33516b.m36507F0();
                                    str8 = this.f32870d;
                                    c9294tM36507F1.m37067j();
                                    c9294tM36507F1.mo36088h();
                                    C8953m.m36041f(str8);
                                    C8953m.m36041f(strM10609H);
                                    c12277a5 = new C12277a();
                                    cursorQuery2 = c9294tM36507F1.m36848u0().query("property_filters", new String[]{str5, str4}, "app_id=? AND property_name=?", new String[]{str8, strM10609H}, null, null, null);
                                    if (cursorQuery2.moveToFirst()) {
                                        while (true) {
                                            C2098h4 c2098h7 = (C2098h4) ((C2079g4) C9277re.m36737W(C2098h4.m10159P(), cursorQuery2.getBlob(1))).m9882t();
                                            numValueOf4 = Integer.valueOf(cursorQuery2.getInt(0));
                                            list5 = (List) c12277a5.get(numValueOf4);
                                            if (list5 == null) {
                                                it5 = it4;
                                                arrayList3 = new ArrayList();
                                                c12277a5.put(numValueOf4, arrayList3);
                                            } else {
                                                it5 = it4;
                                                arrayList3 = list5;
                                            }
                                            arrayList3.add(c2098h7);
                                            str9 = str8;
                                            if (!cursorQuery2.moveToNext()) {
                                                break;
                                                break;
                                            }
                                            it4 = it5;
                                            str8 = str9;
                                        }
                                        cursorQuery2.close();
                                        map5 = c12277a5;
                                    } else {
                                        it5 = it4;
                                        map5 = Collections.EMPTY_MAP;
                                        cursorQuery2.close();
                                    }
                                    c12277a4.put(strM10609H, map5);
                                } else {
                                    it5 = it4;
                                }
                                while (r4.hasNext()) {
                                    int iIntValue7 = num4.intValue();
                                    if (this.f32871e.contains(num4)) {
                                        this.f33067a.mo36321a().m37011w().m36912b(str6, num4);
                                        break;
                                        break;
                                    }
                                    it6 = ((List) map5.get(num4)).iterator();
                                    zM36276k = true;
                                    while (true) {
                                        if (it6.hasNext()) {
                                            c2098h4 = (C2098h4) it6.next();
                                            c9094g7 = this.f33067a;
                                            map6 = map5;
                                            if (Log.isLoggable(c9094g7.mo36321a().m37013z(), 2)) {
                                                C9316u5 c9316u5M37011w4 = c9094g7.mo36321a().m37011w();
                                                if (c2098h4.m10161F()) {
                                                    numValueOf3 = Integer.valueOf(c2098h4.m10162G());
                                                } else {
                                                    numValueOf3 = null;
                                                }
                                                c9316u5M37011w4.m36914d("Evaluating filter. audience, filter, property", num4, numValueOf3, c9094g7.m36309D().m36622c(c2098h4.m10163H()));
                                                c9094g7.mo36321a().m37011w().m36912b("Filter definition", this.f33516b.m36515K0().m36756M(c2098h4));
                                            }
                                            if (c2098h4.m10161F()) {
                                            }
                                            C9316u5 c9316u5M37006r4 = c9094g7.mo36321a().m37006r();
                                            Object objM36998x4 = C9348w5.m36998x(this.f32870d);
                                            if (c2098h4.m10161F()) {
                                                numValueOf2 = Integer.valueOf(c2098h4.m10162G());
                                            } else {
                                                numValueOf2 = null;
                                            }
                                            c9316u5M37006r4.m36913c("Invalid property filter ID. appId, id", objM36998x4, String.valueOf(numValueOf2));
                                            this.f32871e.add(num4);
                                            map5 = map6;
                                            c12277a4 = c12277a4;
                                            str6 = str6;
                                        } else {
                                            map6 = map5;
                                            str6 = str6;
                                            c12277a4 = c12277a4;
                                        }
                                        if (!zM36276k) {
                                            this.f32871e.add(num4);
                                        }
                                        map5 = map6;
                                        c12277a4 = c12277a4;
                                        str6 = str6;
                                        m36285n(num4).m36281a(c9036d);
                                        map5 = map6;
                                        c12277a4 = c12277a4;
                                        str6 = str6;
                                    }
                                }
                                it4 = it5;
                            }
                        }
                        arrayList2 = new ArrayList();
                        Set<Integer> setKeySet3 = this.f32872f.keySet();
                        setKeySet3.removeAll(this.f32871e);
                        while (r3.hasNext()) {
                            int iIntValue8 = num5.intValue();
                            C9052df c9052df3 = (C9052df) this.f32872f.get(num5);
                            C8953m.m36047l(c9052df3);
                            C2005c6 c2005c6M36282b3 = c9052df3.m36282b(iIntValue8);
                            arrayList2.add(c2005c6M36282b3);
                            c9294tM36507F0 = this.f33516b.m36507F0();
                            str7 = this.f32870d;
                            C2063f7 c2063f7M9850H3 = c2005c6M36282b3.m9850H();
                            c9294tM36507F0.m37067j();
                            c9294tM36507F0.mo36088h();
                            C8953m.m36041f(str7);
                            C8953m.m36047l(c2063f7M9850H3);
                            byte[] bArrM10628d3 = c2063f7M9850H3.m10628d();
                            contentValues = new ContentValues();
                            contentValues.put("app_id", str7);
                            contentValues.put(str5, num5);
                            contentValues.put("current_results", bArrM10628d3);
                            if (c9294tM36507F0.m36848u0().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                                c9294tM36507F0.f33067a.mo36321a().m37003o().m36912b("Failed to insert filter results (got -1). appId", C9348w5.m36998x(str7));
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
        C9294t c9294tM36507F8 = this.f33516b.m36507F0();
        String str19 = this.f32870d;
        c9294tM36507F8.m37067j();
        c9294tM36507F8.mo36088h();
        C8953m.m36041f(str19);
        try {
            cursorQuery = c9294tM36507F8.m36848u0().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{str19}, null, null, null);
            if (cursorQuery.moveToFirst()) {
                Map map19 = Collections.EMPTY_MAP;
                cursorQuery.close();
                map2 = map19;
                z12 = z11;
                str2 = "data";
                str14 = "audience_id";
            } else {
                c12277a8 = new C12277a();
                while (true) {
                    i13 = cursorQuery.getInt(0);
                    c12277a8.put(Integer.valueOf(i13), (C2063f7) ((C2044e7) C9277re.m36737W(C2063f7.m9988P(), cursorQuery.getBlob(1))).m9882t());
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
                map2 = c12277a8;
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
                String str110 = this.f32870d;
                C9294t c9294tM36507F9 = this.f33516b.m36507F0();
                str3 = this.f32870d;
                c9294tM36507F9.m37067j();
                c9294tM36507F9.mo36088h();
                C8953m.m36041f(str3);
                c12277a2 = new C12277a();
                sQLiteDatabaseM36848u0 = c9294tM36507F9.m36848u0();
                cursorRawQuery = sQLiteDatabaseM36848u0.rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str3, str3});
                if (cursorRawQuery.moveToFirst()) {
                    do {
                        numValueOf = Integer.valueOf(cursorRawQuery.getInt(0));
                        arrayList = (List) c12277a2.get(numValueOf);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            c12277a2.put(numValueOf, arrayList);
                        }
                        arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                    } while (cursorRawQuery.moveToNext());
                } else {
                    c12277a2 = Collections.EMPTY_MAP;
                }
                cursorRawQuery.close();
                C8953m.m36041f(str110);
                C8953m.m36047l(map2);
                c12277a3 = new C12277a();
                if (!map2.isEmpty()) {
                    it2 = map2.keySet().iterator();
                    while (it2.hasNext()) {
                        num = (Integer) it2.next();
                        num.intValue();
                        c2063f9 = (C2063f7) map2.get(num);
                        list4 = (List) c12277a2.get(num);
                        if (list4 != null || list4.isEmpty()) {
                            map4 = c12277a2;
                            hashSet3 = hashSet;
                            it3 = it2;
                            c12277a3.put(num, c2063f9);
                            c12277a2 = map4;
                            hashSet = hashSet3;
                            it2 = it3;
                        } else {
                            C9197me c9197me2 = this.f33516b;
                            map4 = c12277a2;
                            hashSet3 = hashSet;
                            List listM36758R = c9197me2.m36515K0().m36758R(c2063f9.m9993H(), list4);
                            if (listM36758R.isEmpty()) {
                                c12277a2 = map4;
                                hashSet = hashSet3;
                            } else {
                                C2044e7 c2044e7 = (C2044e7) c2063f9.m10075q();
                                c2044e7.m9938C();
                                c2044e7.m9937A(listM36758R);
                                List listM36758R2 = c9197me2.m36515K0().m36758R(c2063f9.m9991F(), list4);
                                c2044e7.m9944z();
                                c2044e7.m9943x(listM36758R2);
                                ArrayList arrayList6 = new ArrayList();
                                Iterator it12 = c2063f9.m9995K().iterator();
                                while (it12.hasNext()) {
                                    Iterator it13 = it2;
                                    C2190m6 c2190m7 = (C2190m6) it12.next();
                                    Iterator it14 = it12;
                                    if (!list4.contains(Integer.valueOf(c2190m7.m10374G()))) {
                                        arrayList6.add(c2190m7);
                                    }
                                    it2 = it13;
                                    it12 = it14;
                                }
                                it3 = it2;
                                c2044e7.m9940E();
                                c2044e7.m9939D(arrayList6);
                                ArrayList arrayList7 = new ArrayList();
                                for (C2101h7 c2101h8 : c2063f9.m9997N()) {
                                    if (!list4.contains(Integer.valueOf(c2101h8.m10179G()))) {
                                        arrayList7.add(c2101h8);
                                    }
                                }
                                c2044e7.m9942J();
                                c2044e7.m9941G(arrayList7);
                                c12277a3.put(num, (C2063f7) c2044e7.m9882t());
                                c12277a2 = map4;
                                hashSet = hashSet3;
                                it2 = it3;
                            }
                        }
                    }
                }
                hashSet2 = hashSet;
                map3 = c12277a3;
            } else {
                hashSet2 = hashSet;
                map3 = map2;
            }
            while (r16.hasNext()) {
                num3.intValue();
                c2063f7 = (C2063f7) map3.get(num3);
                bitSet = new BitSet();
                bitSet2 = new BitSet();
                c12277a = new C12277a();
                if (c2063f7 != null && c2063f7.m9996M() != 0) {
                    while (r7.hasNext()) {
                        if (c2190m6.m10373F()) {
                            Map map110 = map3;
                            Integer numValueOf10 = Integer.valueOf(c2190m6.m10374G());
                            if (c2190m6.m10375H()) {
                                lValueOf = Long.valueOf(c2190m6.m10376J());
                            } else {
                                lValueOf = null;
                            }
                            c12277a.put(numValueOf10, lValueOf);
                            map3 = map110;
                        }
                    }
                }
                Map map111 = map3;
                C12277a c12277a13 = new C12277a();
                if (c2063f7 != null && c2063f7.m9998O() != 0) {
                    it = c2063f7.m9997N().iterator();
                    while (it.hasNext()) {
                        c2101h7 = (C2101h7) it.next();
                        if (!c2101h7.m10178F() && c2101h7.m10181J() > 0) {
                            c12277a13.put(Integer.valueOf(c2101h7.m10179G()), Long.valueOf(c2101h7.m10182K(c2101h7.m10181J() - 1)));
                            it = it;
                            c2063f7 = c2063f7;
                        }
                    }
                }
                c2063f8 = c2063f7;
                if (c2063f8 != null) {
                    i12 = 0;
                    while (i12 < c2063f8.m9992G() * 64) {
                        if (C9277re.m36735P(c2063f8.m9991F(), i12)) {
                            z13 = zM36406H;
                            this.f33067a.mo36321a().m37011w().m36913c("Filter already evaluated. audience ID, filter ID", num3, Integer.valueOf(i12));
                            bitSet2.set(i12);
                            if (C9277re.m36735P(c2063f8.m9993H(), i12)) {
                                bitSet.set(i12);
                            }
                            i12++;
                            zM36406H = z13;
                        } else {
                            z13 = zM36406H;
                        }
                        c12277a.remove(Integer.valueOf(i12));
                        i12++;
                        zM36406H = z13;
                    }
                }
                boolean z17 = zM36406H;
                C2063f7 c2063f13 = (C2063f7) map2.get(num3);
                if (!zM36406H2 && z17 && (list3 = (List) map.get(num3)) != null && this.f32874h != null && this.f32873g != null) {
                    Iterator it15 = list3.iterator();
                    while (it15.hasNext()) {
                        C2421z3 c2421z11 = (C2421z3) it15.next();
                        int iM11040G = c2421z11.m11040G();
                        Iterator it16 = it15;
                        long jLongValue = this.f32874h.longValue() / 1000;
                        if (c2421z11.m11048Q()) {
                            jLongValue = this.f32873g.longValue() / 1000;
                        }
                        Integer numValueOf11 = Integer.valueOf(iM11040G);
                        if (c12277a.containsKey(numValueOf11)) {
                            c12277a.put(numValueOf11, Long.valueOf(jLongValue));
                        }
                        if (c12277a13.containsKey(numValueOf11)) {
                            c12277a13.put(numValueOf11, Long.valueOf(jLongValue));
                        }
                        it15 = it16;
                    }
                }
                this.f32872f.put(num3, new C9052df(this, this.f32870d, c2063f13, bitSet, bitSet2, c12277a, c12277a13, null));
                str2 = str2;
                map = map;
                str14 = str14;
                map2 = map2;
                zM36406H = z17;
                map3 = map111;
            }
        }
        str4 = str2;
        str5 = str14;
        str6 = "Skipping failed audience ID";
        if (!list.isEmpty()) {
            c9069ef = new C9069ef(this, null);
            c12277a6 = new C12277a();
            it7 = list.iterator();
            while (it7.hasNext()) {
                c2226o6 = (C2226o6) it7.next();
                c2226o6M36293a = c9069ef.m36293a(this.f32870d, c2226o6);
                if (c2226o6M36293a != null) {
                    c9197me = this.f33516b;
                    c9003b0M36829Z = c9197me.m36507F0().m36829Z(this.f32870d, c2226o6, c2226o6M36293a.m10490J());
                    c9197me.m36507F0().m36852w0(c9003b0M36829Z);
                    if (z10) {
                        j10 = c9003b0M36829Z.f32702c;
                        strM10490J = c2226o6M36293a.m10490J();
                        map7 = (Map) c12277a6.get(strM10490J);
                        if (map7 == null) {
                            c9294tM36507F2 = c9197me.m36507F0();
                            str10 = this.f32870d;
                            c9294tM36507F2.m37067j();
                            c9294tM36507F2.mo36088h();
                            C8953m.m36041f(str10);
                            C8953m.m36041f(strM10490J);
                            c12277a7 = new C12277a();
                            str11 = str10;
                            cursorQuery3 = c9294tM36507F2.m36848u0().query("event_filters", new String[]{str5, str4}, "app_id=? AND event_name=?", new String[]{str10, strM10490J}, null, null, null);
                            if (cursorQuery3.moveToFirst()) {
                                c9003b0 = c9003b0M36829Z;
                                while (true) {
                                    C2421z3 c2421z12 = (C2421z3) ((C2403y3) C9277re.m36737W(C2421z3.m11037T(), cursorQuery3.getBlob(1))).m9882t();
                                    numValueOf5 = Integer.valueOf(cursorQuery3.getInt(0));
                                    list6 = (List) c12277a7.get(numValueOf5);
                                    if (list6 == null) {
                                        cursor4 = cursorQuery3;
                                        arrayList4 = new ArrayList();
                                        c12277a7.put(numValueOf5, arrayList4);
                                    } else {
                                        cursor4 = cursorQuery3;
                                        arrayList4 = list6;
                                    }
                                    arrayList4.add(c2421z12);
                                    if (!cursor4.moveToNext()) {
                                        break;
                                        break;
                                    }
                                    cursorQuery3 = cursor4;
                                }
                                cursor4.close();
                                map7 = c12277a7;
                            } else {
                                c9003b0 = c9003b0M36829Z;
                                map7 = Collections.EMPTY_MAP;
                                cursorQuery3.close();
                            }
                            c12277a6.put(strM10490J, map7);
                        } else {
                            c9003b0 = c9003b0M36829Z;
                        }
                        it8 = map7.keySet().iterator();
                        while (it8.hasNext()) {
                            num2 = (Integer) it8.next();
                            iIntValue = num2.intValue();
                            if (this.f32871e.contains(num2)) {
                                this.f33067a.mo36321a().m37011w().m36912b("Skipping failed audience ID", num2);
                            } else {
                                it9 = ((List) map7.get(num2)).iterator();
                                zM36116k = true;
                                while (true) {
                                    if (!it9.hasNext()) {
                                        map8 = map7;
                                        it10 = it8;
                                        j11 = j10;
                                        break;
                                    }
                                    C2421z3 c2421z13 = (C2421z3) it9.next();
                                    map8 = map7;
                                    it10 = it8;
                                    c9002b = new C9002b(this, this.f32870d, iIntValue, c2421z13);
                                    j11 = j10;
                                    zM36116k = c9002b.m36116k(this.f32873g, this.f32874h, c2226o6M36293a, j11, c9003b0, m36286o(iIntValue, c2421z13.m11040G()));
                                    if (!zM36116k) {
                                        this.f32871e.add(num2);
                                        break;
                                    }
                                    m36285n(num2).m36281a(c9002b);
                                    j10 = j11;
                                    map7 = map8;
                                    it8 = it10;
                                }
                                if (!zM36116k) {
                                    this.f32871e.add(num2);
                                }
                                j10 = j11;
                                map7 = map8;
                                it8 = it10;
                            }
                        }
                        it7 = it7;
                        c9069ef = c9069ef;
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
            c12277a4 = new C12277a();
            it4 = list2.iterator();
            while (it4.hasNext()) {
                C2281r7 c2281r10 = (C2281r7) it4.next();
                strM10609H = c2281r10.m10609H();
                map5 = (Map) c12277a4.get(strM10609H);
                if (map5 == null) {
                    c9294tM36507F1 = this.f33516b.m36507F0();
                    str8 = this.f32870d;
                    c9294tM36507F1.m37067j();
                    c9294tM36507F1.mo36088h();
                    C8953m.m36041f(str8);
                    C8953m.m36041f(strM10609H);
                    c12277a5 = new C12277a();
                    cursorQuery2 = c9294tM36507F1.m36848u0().query("property_filters", new String[]{str5, str4}, "app_id=? AND property_name=?", new String[]{str8, strM10609H}, null, null, null);
                    if (cursorQuery2.moveToFirst()) {
                        while (true) {
                            C2098h4 c2098h8 = (C2098h4) ((C2079g4) C9277re.m36737W(C2098h4.m10159P(), cursorQuery2.getBlob(1))).m9882t();
                            numValueOf4 = Integer.valueOf(cursorQuery2.getInt(0));
                            list5 = (List) c12277a5.get(numValueOf4);
                            if (list5 == null) {
                                it5 = it4;
                                arrayList3 = new ArrayList();
                                c12277a5.put(numValueOf4, arrayList3);
                            } else {
                                it5 = it4;
                                arrayList3 = list5;
                            }
                            arrayList3.add(c2098h8);
                            str9 = str8;
                            if (!cursorQuery2.moveToNext()) {
                                break;
                                break;
                            }
                            it4 = it5;
                            str8 = str9;
                        }
                        cursorQuery2.close();
                        map5 = c12277a5;
                    } else {
                        it5 = it4;
                        map5 = Collections.EMPTY_MAP;
                        cursorQuery2.close();
                    }
                    c12277a4.put(strM10609H, map5);
                } else {
                    it5 = it4;
                }
                while (r4.hasNext()) {
                    int iIntValue9 = num4.intValue();
                    if (this.f32871e.contains(num4)) {
                        this.f33067a.mo36321a().m37011w().m36912b(str6, num4);
                        break;
                        break;
                    }
                    it6 = ((List) map5.get(num4)).iterator();
                    zM36276k = true;
                    while (true) {
                        if (it6.hasNext()) {
                            c2098h4 = (C2098h4) it6.next();
                            c9094g7 = this.f33067a;
                            map6 = map5;
                            if (Log.isLoggable(c9094g7.mo36321a().m37013z(), 2)) {
                                C9316u5 c9316u5M37011w5 = c9094g7.mo36321a().m37011w();
                                if (c2098h4.m10161F()) {
                                    numValueOf3 = Integer.valueOf(c2098h4.m10162G());
                                } else {
                                    numValueOf3 = null;
                                }
                                c9316u5M37011w5.m36914d("Evaluating filter. audience, filter, property", num4, numValueOf3, c9094g7.m36309D().m36622c(c2098h4.m10163H()));
                                c9094g7.mo36321a().m37011w().m36912b("Filter definition", this.f33516b.m36515K0().m36756M(c2098h4));
                            }
                            if (c2098h4.m10161F() || c2098h4.m10162G() > 256) {
                                C9316u5 c9316u5M37006r5 = c9094g7.mo36321a().m37006r();
                                Object objM36998x5 = C9348w5.m36998x(this.f32870d);
                                if (c2098h4.m10161F()) {
                                    numValueOf2 = Integer.valueOf(c2098h4.m10162G());
                                } else {
                                    numValueOf2 = null;
                                }
                                c9316u5M37006r5.m36913c("Invalid property filter ID. appId, id", objM36998x5, String.valueOf(numValueOf2));
                                this.f32871e.add(num4);
                                map5 = map6;
                                c12277a4 = c12277a4;
                                str6 = str6;
                            } else {
                                c9036d = new C9036d(this, this.f32870d, iIntValue9, c2098h4);
                                zM36276k = c9036d.m36276k(this.f32873g, this.f32874h, c2281r10, m36286o(iIntValue9, c2098h4.m10162G()));
                                if (zM36276k) {
                                    m36285n(num4).m36281a(c9036d);
                                    map5 = map6;
                                    c12277a4 = c12277a4;
                                    str6 = str6;
                                } else {
                                    this.f32871e.add(num4);
                                }
                            }
                        } else {
                            map6 = map5;
                            str6 = str6;
                            c12277a4 = c12277a4;
                        }
                        if (!zM36276k) {
                            this.f32871e.add(num4);
                        }
                        map5 = map6;
                        c12277a4 = c12277a4;
                        str6 = str6;
                    }
                }
                it4 = it5;
            }
        }
        arrayList2 = new ArrayList();
        Set<Integer> setKeySet4 = this.f32872f.keySet();
        setKeySet4.removeAll(this.f32871e);
        while (r3.hasNext()) {
            int iIntValue10 = num5.intValue();
            C9052df c9052df4 = (C9052df) this.f32872f.get(num5);
            C8953m.m36047l(c9052df4);
            C2005c6 c2005c6M36282b4 = c9052df4.m36282b(iIntValue10);
            arrayList2.add(c2005c6M36282b4);
            c9294tM36507F0 = this.f33516b.m36507F0();
            str7 = this.f32870d;
            C2063f7 c2063f7M9850H4 = c2005c6M36282b4.m9850H();
            c9294tM36507F0.m37067j();
            c9294tM36507F0.mo36088h();
            C8953m.m36041f(str7);
            C8953m.m36047l(c2063f7M9850H4);
            byte[] bArrM10628d4 = c2063f7M9850H4.m10628d();
            contentValues = new ContentValues();
            contentValues.put("app_id", str7);
            contentValues.put(str5, num5);
            contentValues.put("current_results", bArrM10628d4);
            if (c9294tM36507F0.m36848u0().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                c9294tM36507F0.f33067a.mo36321a().m37003o().m36912b("Failed to insert filter results (got -1). appId", C9348w5.m36998x(str7));
            }
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: n */
    public final C9052df m36285n(Integer num) {
        if (this.f32872f.containsKey(num)) {
            return (C9052df) this.f32872f.get(num);
        }
        C9052df c9052df = new C9052df(this, this.f32870d, null);
        this.f32872f.put(num, c9052df);
        return c9052df;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m36286o(int i10, int i11) {
        C9052df c9052df = (C9052df) this.f32872f.get(Integer.valueOf(i10));
        if (c9052df == null) {
            return false;
        }
        return c9052df.m36283c().get(i11);
    }
}
