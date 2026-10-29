package nb;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Pair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class ef {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.google.android.gms.internal.measurement.o6 f25498a;
    public Long b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f25499c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e f25500d;

    public /* synthetic */ ef(e eVar, byte[] bArr) {
        Objects.requireNonNull(eVar);
        this.f25500d = eVar;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:70:0x01d1  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v5 */
    public final com.google.android.gms.internal.measurement.o6 a(String str, com.google.android.gms.internal.measurement.o6 o6Var) {
        Cursor cursorRawQuery;
        Pair pairCreate;
        Object obj;
        String strJ = o6Var.J();
        List listF = o6Var.F();
        e eVar = this.f25500d;
        me meVar = eVar.b;
        meVar.K0();
        Long l10 = (Long) re.u(o6Var, "_eid");
        if (l10 != null) {
            if (strJ.equals("_ep")) {
                n9.m.l(l10);
                meVar.K0();
                String str2 = (String) re.u(o6Var, "_en");
                ?? r8 = 0;
                if (TextUtils.isEmpty(str2)) {
                    eVar.f25625a.a().p().b("Extra parameter without an event name. eventId", l10);
                    return null;
                }
                if (this.f25498a == null || this.b == null || l10.longValue() != this.b.longValue()) {
                    t tVarF0 = meVar.F0();
                    tVarF0.h();
                    tVarF0.j();
                    try {
                        try {
                            cursorRawQuery = tVarF0.u0().rawQuery("select main_event, children_to_process from main_event_params where app_id=? and event_id=?", new String[]{str, l10.toString()});
                            try {
                                if (cursorRawQuery.moveToFirst()) {
                                    try {
                                        pairCreate = Pair.create((com.google.android.gms.internal.measurement.o6) ((com.google.android.gms.internal.measurement.n6) re.W(com.google.android.gms.internal.measurement.o6.R(), cursorRawQuery.getBlob(0))).t(), Long.valueOf(cursorRawQuery.getLong(1)));
                                        cursorRawQuery.close();
                                    } catch (IOException e10) {
                                        tVarF0.f25625a.a().o().d("Failed to merge main event. appId, eventId", w5.x(str), l10, e10);
                                        cursorRawQuery.close();
                                        pairCreate = null;
                                    }
                                    if (pairCreate != null || (obj = pairCreate.first) == null) {
                                        this.f25500d.f25625a.a().p().c("Extra parameter without existing main event. eventName, eventId", str2, l10);
                                        return null;
                                    }
                                    this.f25498a = (com.google.android.gms.internal.measurement.o6) obj;
                                    this.f25499c = ((Long) pairCreate.second).longValue();
                                    this.f25500d.b.K0();
                                    this.b = (Long) re.u(this.f25498a, "_eid");
                                } else {
                                    tVarF0.f25625a.a().w().a("Main event not found");
                                }
                            } catch (SQLiteException e11) {
                                e = e11;
                                tVarF0.f25625a.a().o().b("Error selecting main event", e);
                                if (cursorRawQuery != null) {
                                }
                                pairCreate = null;
                                if (pairCreate != null) {
                                }
                                this.f25500d.f25625a.a().p().c("Extra parameter without existing main event. eventName, eventId", str2, l10);
                                return null;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            r8 = meVar;
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
                    this.f25500d.f25625a.a().p().c("Extra parameter without existing main event. eventName, eventId", str2, l10);
                    return null;
                }
                long j10 = this.f25499c - 1;
                this.f25499c = j10;
                if (j10 <= 0) {
                    t tVarF1 = this.f25500d.b.F0();
                    tVarF1.h();
                    tVarF1.f25625a.a().w().b("Clearing complex main event info. appId", str);
                    try {
                        tVarF1.u0().execSQL("delete from main_event_params where app_id=?", new String[]{str});
                    } catch (SQLiteException e13) {
                        tVarF1.f25625a.a().o().b("Error clearing complex main event", e13);
                    }
                } else {
                    this.f25500d.b.F0().F(str, l10, this.f25499c, this.f25498a);
                }
                ArrayList arrayList = new ArrayList();
                for (com.google.android.gms.internal.measurement.s6 s6Var : this.f25498a.F()) {
                    this.f25500d.b.K0();
                    if (re.r(o6Var, s6Var.G()) == null) {
                        arrayList.add(s6Var);
                    }
                }
                if (arrayList.isEmpty()) {
                    this.f25500d.f25625a.a().p().b("No unique parameters in main event. eventName", str2);
                } else {
                    arrayList.addAll(listF);
                    listF = arrayList;
                }
                strJ = str2;
            } else {
                this.b = l10;
                this.f25498a = o6Var;
                meVar.K0();
                long jLongValue = ((Long) re.v(o6Var, "_epc", 0L)).longValue();
                this.f25499c = jLongValue;
                if (jLongValue <= 0) {
                    eVar.f25625a.a().p().b("Complex event with zero extra param count. eventName", strJ);
                } else {
                    meVar.F0().F(str, (Long) n9.m.l(l10), this.f25499c, o6Var);
                }
            }
        }
        com.google.android.gms.internal.measurement.n6 n6Var = (com.google.android.gms.internal.measurement.n6) o6Var.r();
        n6Var.P(strJ);
        n6Var.K();
        n6Var.J(listF);
        return (com.google.android.gms.internal.measurement.o6) n6Var.t();
    }
}
