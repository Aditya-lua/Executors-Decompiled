package dd;

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
    public final TimeInterpolator f12165a;

    @NonNull
    public final V b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f12166c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f12167d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f12168e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public BackEventCompat f12169f;

    public a(@NonNull V v8) {
        this.b = v8;
        Context context = v8.getContext();
        this.f12165a = h.g(context, jc.b.R, z2.a.a(0.0f, 0.0f, 0.0f, 1.0f));
        this.f12166c = h.f(context, jc.b.H, MlKitException.LOW_LIGHT_AUTO_EXPOSURE_COMPUTATION_FAILURE);
        this.f12167d = h.f(context, jc.b.L, 150);
        this.f12168e = h.f(context, jc.b.K, 100);
    }

    public float a(float f10) {
        return this.f12165a.getInterpolation(f10);
    }

    public BackEventCompat b() {
        if (this.f12169f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() and updateBackProgress() before cancelBackProgress()");
        }
        BackEventCompat backEventCompat = this.f12169f;
        this.f12169f = null;
        return backEventCompat;
    }

    public BackEventCompat c() {
        BackEventCompat backEventCompat = this.f12169f;
        this.f12169f = null;
        return backEventCompat;
    }

    public void d(@NonNull BackEventCompat backEventCompat) {
        this.f12169f = backEventCompat;
    }

    public BackEventCompat e(@NonNull BackEventCompat backEventCompat) {
        if (this.f12169f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() before updateBackProgress()");
        }
        BackEventCompat backEventCompat2 = this.f12169f;
        this.f12169f = backEventCompat;
        return backEventCompat2;
    }
}
