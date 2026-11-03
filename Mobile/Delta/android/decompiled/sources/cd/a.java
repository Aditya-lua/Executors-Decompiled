package cd;

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
    public final TimeInterpolator f4858a;

    @NonNull
    public final V b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f4859c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f4860d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f4861e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public BackEventCompat f4862f;

    public a(@NonNull V v5) {
        this.b = v5;
        Context context = v5.getContext();
        this.f4858a = h.g(context, ic.b.R, z2.a.a(0.0f, 0.0f, 0.0f, 1.0f));
        this.f4859c = h.f(context, ic.b.H, MlKitException.LOW_LIGHT_AUTO_EXPOSURE_COMPUTATION_FAILURE);
        this.f4860d = h.f(context, ic.b.L, 150);
        this.f4861e = h.f(context, ic.b.K, 100);
    }

    public float a(float f10) {
        return this.f4858a.getInterpolation(f10);
    }

    public BackEventCompat b() {
        if (this.f4862f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() and updateBackProgress() before cancelBackProgress()");
        }
        BackEventCompat backEventCompat = this.f4862f;
        this.f4862f = null;
        return backEventCompat;
    }

    public BackEventCompat c() {
        BackEventCompat backEventCompat = this.f4862f;
        this.f4862f = null;
        return backEventCompat;
    }

    public void d(@NonNull BackEventCompat backEventCompat) {
        this.f4862f = backEventCompat;
    }

    public BackEventCompat e(@NonNull BackEventCompat backEventCompat) {
        if (this.f4862f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() before updateBackProgress()");
        }
        BackEventCompat backEventCompat2 = this.f4862f;
        this.f4862f = backEventCompat;
        return backEventCompat2;
    }
}
