package ob;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Pair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class qf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.google.android.gms.internal.measurement.s6 f27750a;
    public Long b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f27751c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e f27752d;

    public /* synthetic */ qf(e eVar, byte[] bArr) {
        Objects.requireNonNull(eVar);
        this.f27752d = eVar;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:70:0x01d1  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v5 */
    public final com.google.android.gms.internal.measurement.s6 a(String str, com.google.android.gms.internal.measurement.s6 s6Var) {
        Cursor cursorRawQuery;
        Pair pairCreate;
        Object obj;
        String strI = s6Var.I();
        List listF = s6Var.F();
        e eVar = this.f27752d;
        ve veVar = eVar.b;
        veVar.K0();
        Long l10 = (Long) af.u(s6Var, "_eid");
        if (l10 != null) {
            if (strI.equals("_ep")) {
                o9.s.l(l10);
                veVar.K0();
                String str2 = (String) af.u(s6Var, "_en");
                ?? r10 = 0;
                if (TextUtils.isEmpty(str2)) {
                    eVar.f27641a.a().p().b("Extra parameter without an event name. eventId", l10);
                    return null;
                }
                if (this.f27750a == null || this.b == null || l10.longValue() != this.b.longValue()) {
                    w wVarF0 = veVar.F0();
                    wVarF0.h();
                    wVarF0.j();
                    try {
                        try {
                            cursorRawQuery = wVarF0.u0().rawQuery("select main_event, children_to_process from main_event_params where app_id=? and event_id=?", new String[]{str, l10.toString()});
                            try {
                                if (cursorRawQuery.moveToFirst()) {
                                    try {
                                        pairCreate = Pair.create((com.google.android.gms.internal.measurement.s6) ((com.google.android.gms.internal.measurement.r6) af.W(com.google.android.gms.internal.measurement.s6.P(), cursorRawQuery.getBlob(0))).v(), Long.valueOf(cursorRawQuery.getLong(1)));
                                        cursorRawQuery.close();
                                    } catch (IOException e10) {
                                        wVarF0.f27641a.a().o().d("Failed to merge main event. appId, eventId", b6.x(str), l10, e10);
                                        cursorRawQuery.close();
                                        pairCreate = null;
                                    }
                                    if (pairCreate != null || (obj = pairCreate.first) == null) {
                                        this.f27752d.f27641a.a().p().c("Extra parameter without existing main event. eventName, eventId", str2, l10);
                                        return null;
                                    }
                                    this.f27750a = (com.google.android.gms.internal.measurement.s6) obj;
                                    this.f27751c = ((Long) pairCreate.second).longValue();
                                    this.f27752d.b.K0();
                                    this.b = (Long) af.u(this.f27750a, "_eid");
                                } else {
                                    wVarF0.f27641a.a().w().a("Main event not found");
                                }
                            } catch (SQLiteException e11) {
                                e = e11;
                                wVarF0.f27641a.a().o().b("Error selecting main event", e);
                                if (cursorRawQuery != null) {
                                }
                                pairCreate = null;
                                if (pairCreate != null) {
                                }
                                this.f27752d.f27641a.a().p().c("Extra parameter without existing main event. eventName, eventId", str2, l10);
                                return null;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            r10 = veVar;
                            if (r10 != 0) {
                                r10.close();
                            }
                            throw th;
                        }
                    } catch (SQLiteException e12) {
                        e = e12;
                        cursorRawQuery = null;
                    } catch (Throwable th3) {
                        th = th3;
                        if (r10 != 0) {
                            r10.close();
                        }
                        throw th;
                    }
                    cursorRawQuery.close();
                    pairCreate = null;
                    if (pairCreate != null) {
                    }
                    this.f27752d.f27641a.a().p().c("Extra parameter without existing main event. eventName, eventId", str2, l10);
                    return null;
                }
                long j10 = this.f27751c - 1;
                this.f27751c = j10;
                if (j10 <= 0) {
                    w wVarF1 = this.f27752d.b.F0();
                    wVarF1.h();
                    wVarF1.f27641a.a().w().b("Clearing complex main event info. appId", str);
                    try {
                        wVarF1.u0().execSQL("delete from main_event_params where app_id=?", new String[]{str});
                    } catch (SQLiteException e13) {
                        wVarF1.f27641a.a().o().b("Error clearing complex main event", e13);
                    }
                } else {
                    this.f27752d.b.F0().F(str, l10, this.f27751c, this.f27750a);
                }
                ArrayList arrayList = new ArrayList();
                for (com.google.android.gms.internal.measurement.w6 w6Var : this.f27750a.F()) {
                    this.f27752d.b.K0();
                    if (af.r(s6Var, w6Var.G()) == null) {
                        arrayList.add(w6Var);
                    }
                }
                if (arrayList.isEmpty()) {
                    this.f27752d.f27641a.a().p().b("No unique parameters in main event. eventName", str2);
                } else {
                    arrayList.addAll(listF);
                    listF = arrayList;
                }
                strI = str2;
            } else {
                this.b = l10;
                this.f27750a = s6Var;
                veVar.K0();
                long jLongValue = ((Long) af.v(s6Var, "_epc", 0L)).longValue();
                this.f27751c = jLongValue;
                if (jLongValue <= 0) {
                    eVar.f27641a.a().p().b("Complex event with zero extra param count. eventName", strI);
                } else {
                    veVar.F0().F(str, (Long) o9.s.l(l10), this.f27751c, s6Var);
                }
            }
        }
        com.google.android.gms.internal.measurement.r6 r6Var = (com.google.android.gms.internal.measurement.r6) s6Var.q();
        r6Var.R(strI);
        r6Var.M();
        r6Var.J(listF);
        return (com.google.android.gms.internal.measurement.s6) r6Var.v();
    }
}
