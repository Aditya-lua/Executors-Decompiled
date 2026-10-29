package va;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
public final class d {
    public static v8.c a(@NonNull Status status, String str) {
        n9.m.l(status);
        String strY3 = status.y3();
        if (true != q.a(strY3)) {
            str = strY3;
        }
        int iX3 = status.x3();
        if (iX3 != 17510) {
            return iX3 != 17511 ? new v8.c(str) : new v8.e(str);
        }
        return new v8.d(str);
    }
}
