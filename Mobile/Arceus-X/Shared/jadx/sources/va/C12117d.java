package va;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Status;
import p305n9.C8953m;
import p487v8.C12102c;
import p487v8.C12103d;
import p487v8.C12104e;

/* JADX INFO: renamed from: va.d */
/* JADX INFO: loaded from: classes.dex */
public final class C12117d {
    /* JADX INFO: renamed from: a */
    public static C12102c m44957a(@NonNull Status status, String str) {
        C8953m.m36047l(status);
        String strM9167y3 = status.m9167y3();
        if (true != C12143q.m44974a(strM9167y3)) {
            str = strM9167y3;
        }
        int iM9166x3 = status.m9166x3();
        if (iM9166x3 != 17510) {
            return iM9166x3 != 17511 ? new C12102c(str) : new C12104e(str);
        }
        return new C12103d(str);
    }
}
