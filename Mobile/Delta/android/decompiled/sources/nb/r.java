package nb;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25917a;
    public long b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t f25918c;

    public r(t tVar, String str) {
        Objects.requireNonNull(tVar);
        this.f25918c = tVar;
        n9.m.f(str);
        this.f25917a = str;
        this.b = -1L;
    }

    public final List a() {
        List arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = this.f25918c.u0().query("raw_events", new String[]{"rowid", "name", "timestamp", "metadata_fingerprint", "data", "realtime"}, "app_id = ? and rowid > ?", new String[]{this.f25917a, String.valueOf(this.b)}, null, null, "rowid", "1000");
                if (cursorQuery.moveToFirst()) {
                    do {
                        long j10 = cursorQuery.getLong(0);
                        long j11 = cursorQuery.getLong(3);
                        boolean z10 = cursorQuery.getLong(5) == 1;
                        byte[] blob = cursorQuery.getBlob(4);
                        if (j10 > this.b) {
                            this.b = j10;
                        }
                        try {
                            com.google.android.gms.internal.measurement.n6 n6Var = (com.google.android.gms.internal.measurement.n6) re.W(com.google.android.gms.internal.measurement.o6.R(), blob);
                            String string = cursorQuery.getString(1);
                            if (string == null) {
                                string = "";
                            }
                            n6Var.P(string);
                            n6Var.S(cursorQuery.getLong(2));
                            arrayList.add(new q(j10, j11, z10, (com.google.android.gms.internal.measurement.o6) n6Var.t()));
                        } catch (IOException e10) {
                            this.f25918c.f25625a.a().o().c("Data loss. Failed to merge raw event. appId", w5.x(this.f25917a), e10);
                        }
                    } while (cursorQuery.moveToNext());
                } else {
                    arrayList = Collections.EMPTY_LIST;
                }
            } catch (SQLiteException e11) {
                this.f25918c.f25625a.a().o().c("Data loss. Error querying raw events batch. appId", w5.x(this.f25917a), e11);
            }
            return arrayList;
        } finally {
            if (0 != 0) {
                cursorQuery.close();
            }
        }
    }

    public r(t tVar, String str, long j10) {
        Objects.requireNonNull(tVar);
        this.f25918c = tVar;
        n9.m.f(str);
        this.f25917a = str;
        this.b = tVar.b0("select rowid from raw_events where app_id = ? and timestamp < ? order by rowid desc limit 1", new String[]{str, String.valueOf(j10)}, -1L);
    }
}
