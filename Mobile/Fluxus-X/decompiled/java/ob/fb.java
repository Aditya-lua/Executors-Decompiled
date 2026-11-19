package ob;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class fb {
    public static String a(Context context, String str, String str2) {
        o9.s.l(context);
        Resources resources = context.getResources();
        if (TextUtils.isEmpty(str2)) {
            str2 = d7.a(context);
        }
        return d7.b("google_app_id", resources, str2);
    }

    public static String b(String str, String[] strArr, String[] strArr2) {
        o9.s.l(strArr);
        o9.s.l(strArr2);
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
