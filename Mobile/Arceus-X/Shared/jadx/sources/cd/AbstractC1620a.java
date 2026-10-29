package cd;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.Log;
import android.view.View;
import androidx.annotation.NonNull;
import com.google.mlkit.common.MlKitException;
import p088e.BackEventCompat;
import p194ic.C6738b;
import p592z2.C13689a;

/* JADX INFO: renamed from: cd.a */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1620a<V extends View> {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final TimeInterpolator f6304a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final V f6305b;

    /* JADX INFO: renamed from: c */
    public final int f6306c;

    /* JADX INFO: renamed from: d */
    public final int f6307d;

    /* JADX INFO: renamed from: e */
    public final int f6308e;

    /* JADX INFO: renamed from: f */
    public BackEventCompat f6309f;

    public AbstractC1620a(@NonNull V v5) {
        this.f6305b = v5;
        Context context = v5.getContext();
        this.f6304a = C1627h.m8224g(context, C6738b.f25876R, C13689a.m50007a(0.0f, 0.0f, 0.0f, 1.0f));
        this.f6306c = C1627h.m8223f(context, C6738b.f25866H, MlKitException.LOW_LIGHT_AUTO_EXPOSURE_COMPUTATION_FAILURE);
        this.f6307d = C1627h.m8223f(context, C6738b.f25870L, 150);
        this.f6308e = C1627h.m8223f(context, C6738b.f25869K, 100);
    }

    /* JADX INFO: renamed from: a */
    public float m8187a(float f10) {
        return this.f6304a.getInterpolation(f10);
    }

    /* JADX INFO: renamed from: b */
    public BackEventCompat m8188b() {
        if (this.f6309f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() and updateBackProgress() before cancelBackProgress()");
        }
        BackEventCompat backEventCompat = this.f6309f;
        this.f6309f = null;
        return backEventCompat;
    }

    /* JADX INFO: renamed from: c */
    public BackEventCompat m8189c() {
        BackEventCompat backEventCompat = this.f6309f;
        this.f6309f = null;
        return backEventCompat;
    }

    /* JADX INFO: renamed from: d */
    public void m8190d(@NonNull BackEventCompat backEventCompat) {
        this.f6309f = backEventCompat;
    }

    /* JADX INFO: renamed from: e */
    public BackEventCompat m8191e(@NonNull BackEventCompat backEventCompat) {
        if (this.f6309f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() before updateBackProgress()");
        }
        BackEventCompat backEventCompat2 = this.f6309f;
        this.f6309f = backEventCompat;
        return backEventCompat2;
    }
}
