package wa;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
public final class d {
    public static w8.c a(@NonNull Status status, String str) {
        o9.s.l(status);
        String strD3 = status.D3();
        if (true != q.a(strD3)) {
            str = strD3;
        }
        int iC3 = status.C3();
        if (iC3 != 17510) {
            return iC3 != 17511 ? new w8.c(str) : new w8.e(str);
        }
        return new w8.d(str);
    }
}
