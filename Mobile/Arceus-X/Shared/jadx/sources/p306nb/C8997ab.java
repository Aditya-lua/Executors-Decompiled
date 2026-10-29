package p306nb;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import p305n9.C8953m;

/* JADX INFO: renamed from: nb.ab */
/* JADX INFO: loaded from: classes.dex */
public final class C8997ab {
    /* JADX INFO: renamed from: a */
    public static String m36111a(Context context, String str, String str2) {
        C8953m.m36047l(context);
        Resources resources = context.getResources();
        if (TextUtils.isEmpty(str2)) {
            str2 = C9381y6.m37080a(context);
        }
        return C9381y6.m37081b("google_app_id", resources, str2);
    }

    /* JADX INFO: renamed from: b */
    public static String m36112b(String str, String[] strArr, String[] strArr2) {
        C8953m.m36047l(strArr);
        C8953m.m36047l(strArr2);
        int iMin = Math.min(strArr.length, strArr2.length);
        for (int i10 = 0; i10 < iMin; i10++) {
            String str2 = strArr[i10];
            if ((str == null && str2 == null) || (str != null && str.equals(str2))) {
                return strArr2[i10];
            }
        }
        return null;
    }
}
