package ob;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import com.github.luben.zstd.BuildConfig;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27829a;
    public long b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w f27830c;

    public u(w wVar, String str) {
        Objects.requireNonNull(wVar);
        this.f27830c = wVar;
        o9.s.f(str);
        this.f27829a = str;
        this.b = -1L;
    }

    public final List a() {
        List arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = this.f27830c.u0().query("raw_events", new String[]{"rowid", "name", "timestamp", "metadata_fingerprint", "data", "realtime"}, "app_id = ? and rowid > ?", new String[]{this.f27829a, String.valueOf(this.b)}, null, null, "rowid", "1000");
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
                            com.google.android.gms.internal.measurement.r6 r6Var = (com.google.android.gms.internal.measurement.r6) af.W(com.google.android.gms.internal.measurement.s6.P(), blob);
                            String string = cursorQuery.getString(1);
                            if (string == null) {
                                string = BuildConfig.FLAVOR;
                            }
                            r6Var.R(string);
                            r6Var.V(cursorQuery.getLong(2));
                            arrayList.add(new t(j10, j11, z10, (com.google.android.gms.internal.measurement.s6) r6Var.v()));
                        } catch (IOException e10) {
                            this.f27830c.f27641a.a().o().c("Data loss. Failed to merge raw event. appId", b6.x(this.f27829a), e10);
                        }
                    } while (cursorQuery.moveToNext());
                } else {
                    arrayList = Collections.EMPTY_LIST;
                }
            } catch (SQLiteException e11) {
                this.f27830c.f27641a.a().o().c("Data loss. Error querying raw events batch. appId", b6.x(this.f27829a), e11);
            }
            return arrayList;
        } finally {
            if (0 != 0) {
                cursorQuery.close();
            }
        }
    }

    public u(w wVar, String str, long j10) {
        Objects.requireNonNull(wVar);
        this.f27830c = wVar;
        o9.s.f(str);
        this.f27829a = str;
        this.b = wVar.b0("select rowid from raw_events where app_id = ? and timestamp < ? order by rowid desc limit 1", new String[]{str, String.valueOf(j10)}, -1L);
    }
}
