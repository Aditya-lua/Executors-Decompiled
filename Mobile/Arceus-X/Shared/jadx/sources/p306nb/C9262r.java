package p306nb;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import com.google.android.gms.internal.measurement.C2208n6;
import com.google.android.gms.internal.measurement.C2226o6;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p305n9.C8953m;

/* JADX INFO: renamed from: nb.r */
/* JADX INFO: loaded from: classes.dex */
public final class C9262r {

    /* JADX INFO: renamed from: a */
    public final String f33420a;

    /* JADX INFO: renamed from: b */
    public long f33421b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C9294t f33422c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C9262r(C9294t c9294t, String str) {
        Objects.requireNonNull(c9294t);
        this.f33422c = c9294t;
        C8953m.m36041f(str);
        this.f33420a = str;
        this.f33421b = -1L;
    }

    /* JADX INFO: renamed from: a */
    public final List m36725a() {
        List arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = this.f33422c.m36848u0().query("raw_events", new String[]{"rowid", "name", "timestamp", "metadata_fingerprint", "data", "realtime"}, "app_id = ? and rowid > ?", new String[]{this.f33420a, String.valueOf(this.f33421b)}, null, null, "rowid", "1000");
                if (cursorQuery.moveToFirst()) {
                    do {
                        long j10 = cursorQuery.getLong(0);
                        long j11 = cursorQuery.getLong(3);
                        boolean z10 = cursorQuery.getLong(5) == 1;
                        byte[] blob = cursorQuery.getBlob(4);
                        if (j10 > this.f33421b) {
                            this.f33421b = j10;
                        }
                        try {
                            C2208n6 c2208n6 = (C2208n6) C9277re.m36737W(C2226o6.m10484R(), blob);
                            String string = cursorQuery.getString(1);
                            if (string == null) {
                                string = "";
                            }
                            c2208n6.m10419P(string);
                            c2208n6.m10422S(cursorQuery.getLong(2));
                            arrayList.add(new C9246q(j10, j11, z10, (C2226o6) c2208n6.m9882t()));
                        } catch (IOException e10) {
                            this.f33422c.f33067a.mo36321a().m37003o().m36913c("Data loss. Failed to merge raw event. appId", C9348w5.m36998x(this.f33420a), e10);
                        }
                    } while (cursorQuery.moveToNext());
                } else {
                    arrayList = Collections.EMPTY_LIST;
                }
            } catch (SQLiteException e11) {
                this.f33422c.f33067a.mo36321a().m37003o().m36913c("Data loss. Error querying raw events batch. appId", C9348w5.m36998x(this.f33420a), e11);
            }
            return arrayList;
        } finally {
            if (0 != 0) {
                cursorQuery.close();
            }
        }
    }

    public C9262r(C9294t c9294t, String str, long j10) {
        Objects.requireNonNull(c9294t);
        this.f33422c = c9294t;
        C8953m.m36041f(str);
        this.f33420a = str;
        this.f33421b = c9294t.m36831b0("select rowid from raw_events where app_id = ? and timestamp < ? order by rowid desc limit 1", new String[]{str, String.valueOf(j10)}, -1L);
    }
}
