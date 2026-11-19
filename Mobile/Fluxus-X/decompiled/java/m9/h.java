package m9;

import android.app.Activity;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f23014a;

    public h(@NonNull Activity activity) {
        o9.s.m(activity, "Activity must not be null");
        this.f23014a = activity;
    }

    public final boolean a() {
        return this.f23014a instanceof f4.v;
    }

    public final boolean b() {
        return this.f23014a instanceof Activity;
    }

    @NonNull
    public final Activity c() {
        return (Activity) this.f23014a;
    }

    @NonNull
    public final f4.v d() {
        return (f4.v) this.f23014a;
    }
}
