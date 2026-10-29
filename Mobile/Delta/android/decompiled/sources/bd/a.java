package bd;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.Log;
import android.view.View;
import androidx.annotation.NonNull;
import com.google.mlkit.common.MlKitException;
import e.BackEventCompat;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a<V extends View> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final TimeInterpolator f4087a;

    @NonNull
    public final V b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f4088c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f4089d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f4090e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public BackEventCompat f4091f;

    public a(@NonNull V v5) {
        this.b = v5;
        Context context = v5.getContext();
        this.f4087a = h.g(context, hc.b.R, z2.a.a(0.0f, 0.0f, 0.0f, 1.0f));
        this.f4088c = h.f(context, hc.b.H, MlKitException.LOW_LIGHT_AUTO_EXPOSURE_COMPUTATION_FAILURE);
        this.f4089d = h.f(context, hc.b.L, 150);
        this.f4090e = h.f(context, hc.b.K, 100);
    }

    public float a(float f10) {
        return this.f4087a.getInterpolation(f10);
    }

    public BackEventCompat b() {
        if (this.f4091f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() and updateBackProgress() before cancelBackProgress()");
        }
        BackEventCompat backEventCompat = this.f4091f;
        this.f4091f = null;
        return backEventCompat;
    }

    public BackEventCompat c() {
        BackEventCompat backEventCompat = this.f4091f;
        this.f4091f = null;
        return backEventCompat;
    }

    public void d(@NonNull BackEventCompat backEventCompat) {
        this.f4091f = backEventCompat;
    }

    public BackEventCompat e(@NonNull BackEventCompat backEventCompat) {
        if (this.f4091f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() before updateBackProgress()");
        }
        BackEventCompat backEventCompat2 = this.f4091f;
        this.f4091f = backEventCompat;
        return backEventCompat2;
    }
}
