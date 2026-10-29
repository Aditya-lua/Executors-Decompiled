package p306nb;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.measurement.C2208n6;
import com.google.android.gms.internal.measurement.C2226o6;
import com.google.android.gms.internal.measurement.C2298s6;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p305n9.C8953m;

/* JADX INFO: renamed from: nb.ef */
/* JADX INFO: loaded from: classes.dex */
public final class C9069ef {

    /* JADX INFO: renamed from: a */
    public C2226o6 f32902a;

    /* JADX INFO: renamed from: b */
    public Long f32903b;

    /* JADX INFO: renamed from: c */
    public long f32904c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C9053e f32905d;

    public /* synthetic */ C9069ef(C9053e c9053e, byte[] bArr) {
        Objects.requireNonNull(c9053e);
        this.f32905d = c9053e;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:36:0x00dd */
    /* JADX WARN: Code duplicated, block: B:44:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:70:0x01d1  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX INFO: renamed from: a */
    public final C2226o6 m36293a(String str, C2226o6 c2226o6) {
        Cursor cursorRawQuery;
        Pair pairCreate;
        Object obj;
        String strM10490J = c2226o6.m10490J();
        List listM10487F = c2226o6.m10487F();
        C9053e c9053e = this.f32905d;
        C9197me c9197me = c9053e.f33516b;
        c9197me.m36515K0();
        Long l10 = (Long) C9277re.m36746u(c2226o6, "_eid");
        if (l10 != null) {
            if (strM10490J.equals("_ep")) {
                C8953m.m36047l(l10);
                c9197me.m36515K0();
                String str2 = (String) C9277re.m36746u(c2226o6, "_en");
                ?? r8 = 0;
                if (TextUtils.isEmpty(str2)) {
                    c9053e.f33067a.mo36321a().m37004p().m36912b("Extra parameter without an event name. eventId", l10);
                    return null;
                }
                if (this.f32902a == null || this.f32903b == null || l10.longValue() != this.f32903b.longValue()) {
                    C9294t c9294tM36507F0 = c9197me.m36507F0();
                    c9294tM36507F0.mo36088h();
                    c9294tM36507F0.m37067j();
                    try {
                        try {
                            cursorRawQuery = c9294tM36507F0.m36848u0().rawQuery("select main_event, children_to_process from main_event_params where app_id=? and event_id=?", new String[]{str, l10.toString()});
                            try {
                                if (cursorRawQuery.moveToFirst()) {
                                    try {
                                        pairCreate = Pair.create((C2226o6) ((C2208n6) C9277re.m36737W(C2226o6.m10484R(), cursorRawQuery.getBlob(0))).m9882t(), Long.valueOf(cursorRawQuery.getLong(1)));
                                        cursorRawQuery.close();
                                    } catch (IOException e10) {
                                        c9294tM36507F0.f33067a.mo36321a().m37003o().m36914d("Failed to merge main event. appId, eventId", C9348w5.m36998x(str), l10, e10);
                                        cursorRawQuery.close();
                                        pairCreate = null;
                                    }
                                    if (pairCreate != null || (obj = pairCreate.first) == null) {
                                        this.f32905d.f33067a.mo36321a().m37004p().m36913c("Extra parameter without existing main event. eventName, eventId", str2, l10);
                                        return null;
                                    }
                                    this.f32902a = (C2226o6) obj;
                                    this.f32904c = ((Long) pairCreate.second).longValue();
                                    this.f32905d.f33516b.m36515K0();
                                    this.f32903b = (Long) C9277re.m36746u(this.f32902a, "_eid");
                                } else {
                                    c9294tM36507F0.f33067a.mo36321a().m37011w().m36911a("Main event not found");
                                }
                            } catch (SQLiteException e11) {
                                e = e11;
                                c9294tM36507F0.f33067a.mo36321a().m37003o().m36912b("Error selecting main event", e);
                                if (cursorRawQuery != null) {
                                }
                                pairCreate = null;
                                if (pairCreate != null) {
                                }
                                this.f32905d.f33067a.mo36321a().m37004p().m36913c("Extra parameter without existing main event. eventName, eventId", str2, l10);
                                return null;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            r8 = c9197me;
                            if (r8 != 0) {
                                r8.close();
                            }
                            throw th;
                        }
                    } catch (SQLiteException e12) {
                        e = e12;
                        cursorRawQuery = null;
                    } catch (Throwable th3) {
                        th = th3;
                        if (r8 != 0) {
                            r8.close();
                        }
                        throw th;
                    }
                    cursorRawQuery.close();
                    pairCreate = null;
                    if (pairCreate != null) {
                    }
                    this.f32905d.f33067a.mo36321a().m37004p().m36913c("Extra parameter without existing main event. eventName, eventId", str2, l10);
                    return null;
                }
                long j10 = this.f32904c - 1;
                this.f32904c = j10;
                if (j10 <= 0) {
                    C9294t c9294tM36507F1 = this.f32905d.f33516b.m36507F0();
                    c9294tM36507F1.mo36088h();
                    c9294tM36507F1.f33067a.mo36321a().m37011w().m36912b("Clearing complex main event info. appId", str);
                    try {
                        c9294tM36507F1.m36848u0().execSQL("delete from main_event_params where app_id=?", new String[]{str});
                    } catch (SQLiteException e13) {
                        c9294tM36507F1.f33067a.mo36321a().m37003o().m36912b("Error clearing complex main event", e13);
                    }
                } else {
                    this.f32905d.f33516b.m36507F0().m36800F(str, l10, this.f32904c, this.f32902a);
                }
                ArrayList arrayList = new ArrayList();
                for (C2298s6 c2298s6 : this.f32902a.m10487F()) {
                    this.f32905d.f33516b.m36515K0();
                    if (C9277re.m36743r(c2226o6, c2298s6.m10697G()) == null) {
                        arrayList.add(c2298s6);
                    }
                }
                if (arrayList.isEmpty()) {
                    this.f32905d.f33067a.mo36321a().m37004p().m36912b("No unique parameters in main event. eventName", str2);
                } else {
                    arrayList.addAll(listM10487F);
                    listM10487F = arrayList;
                }
                strM10490J = str2;
            } else {
                this.f32903b = l10;
                this.f32902a = c2226o6;
                c9197me.m36515K0();
                long jLongValue = ((Long) C9277re.m36747v(c2226o6, "_epc", 0L)).longValue();
                this.f32904c = jLongValue;
                if (jLongValue <= 0) {
                    c9053e.f33067a.mo36321a().m37004p().m36912b("Complex event with zero extra param count. eventName", strM10490J);
                } else {
                    c9197me.m36507F0().m36800F(str, (Long) C8953m.m36047l(l10), this.f32904c, c2226o6);
                }
            }
        }
        C2208n6 c2208n6 = (C2208n6) c2226o6.m10075q();
        c2208n6.m10419P(strM10490J);
        c2208n6.m10416K();
        c2208n6.m10415J(listM10487F);
        return (C2226o6) c2208n6.m9882t();
    }
}
