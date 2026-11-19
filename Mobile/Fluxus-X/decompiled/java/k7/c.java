package k7;

import android.content.Context;
import t7.m;

/* JADX INFO: loaded from: classes3.dex */
public class c implements b {
    @Override // k7.b
    public a a(Context context) {
        return (context == null || m.f(context) != 0.0f) ? a.STANDARD_MOTION : a.REDUCED_MOTION;
    }
}
