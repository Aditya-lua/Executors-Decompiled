package p235k2;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

/* JADX INFO: renamed from: k2.q */
/* JADX INFO: loaded from: classes.dex */
public final class C7425q {
    /* JADX INFO: renamed from: a */
    public static int m30909a(boolean z10, int i10) {
        int i11;
        if (!z10) {
            i11 = 67108864;
        } else {
            if (Build.VERSION.SDK_INT < 31) {
                return i10;
            }
            i11 = 33554432;
        }
        return i11 | i10;
    }

    /* JADX INFO: renamed from: b */
    public static PendingIntent m30910b(Context context, int i10, Intent intent, int i11, boolean z10) {
        return PendingIntent.getActivity(context, i10, intent, m30909a(z10, i11));
    }
}
