package ad;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;

/* JADX INFO: renamed from: ad.b */
/* JADX INFO: loaded from: classes2.dex */
public class C0130b {
    /* JADX INFO: renamed from: a */
    public static Activity m386a(Context context) {
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }
}
