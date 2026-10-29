package p482v2;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: v2.b */
/* JADX INFO: loaded from: classes.dex */
public class C11999b {
    /* JADX INFO: renamed from: a */
    public static Handler m44778a() {
        return Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
    }
}
