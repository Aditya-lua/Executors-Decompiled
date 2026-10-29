package l9;

import android.app.Activity;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f23029a;

    public h(@NonNull Activity activity) {
        n9.m.m(activity, "Activity must not be null");
        this.f23029a = activity;
    }

    public final boolean a() {
        return this.f23029a instanceof e4.q;
    }

    public final boolean b() {
        return this.f23029a instanceof Activity;
    }

    @NonNull
    public final Activity c() {
        return (Activity) this.f23029a;
    }

    @NonNull
    public final e4.q d() {
        return (e4.q) this.f23029a;
    }
}
