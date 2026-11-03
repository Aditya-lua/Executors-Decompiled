package pi;

import android.content.Context;
import android.content.res.Resources;
import ek.q;
import java.util.IllegalFormatException;

/* JADX INFO: loaded from: classes2.dex */
public class a {
    public static String a() {
        q.e("rbx.strings", "context is null");
        return "";
    }

    public static String b(Context context, int i10, Object... objArr) {
        try {
            q.i("rbx.strings", "ResourceId: " + i10);
            return objArr.length > 0 ? context.getString(i10, objArr) : context.getString(i10);
        } catch (Resources.NotFoundException unused) {
            q.d("Resources.NotFoundException thrown in getStringFromResources()");
            return "";
        } catch (IllegalFormatException unused2) {
            q.d("IllegalFormatException thrown in getStringFromResources()");
            return "";
        }
    }

    public static String c(Context context, int i10, Object... objArr) {
        return context == null ? a() : b(context, i10, objArr);
    }
}
