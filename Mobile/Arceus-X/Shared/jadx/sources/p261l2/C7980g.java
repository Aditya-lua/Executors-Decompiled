package p261l2;

import android.content.Context;
import android.os.Process;
import p235k2.C7414f;
import p533x2.C12632b;

/* JADX INFO: renamed from: l2.g */
/* JADX INFO: loaded from: classes.dex */
public final class C7980g {
    /* JADX INFO: renamed from: a */
    public static int m33038a(Context context, String str, int i10, int i11, String str2) {
        if (context.checkPermission(str, i10, i11) == -1) {
            return -1;
        }
        String strM30721c = C7414f.m30721c(str);
        if (strM30721c == null) {
            return 0;
        }
        if (str2 == null) {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(i11);
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            str2 = packagesForUid[0];
        }
        return ((Process.myUid() != i11 || !C12632b.m47060a(context.getPackageName(), str2)) ? C7414f.m30720b(context, strM30721c, str2) : C7414f.m30719a(context, i11, strM30721c, str2)) == 0 ? 0 : -2;
    }

    /* JADX INFO: renamed from: b */
    public static int m33039b(Context context, String str) {
        return m33038a(context, str, Process.myPid(), Process.myUid(), context.getPackageName());
    }
}
