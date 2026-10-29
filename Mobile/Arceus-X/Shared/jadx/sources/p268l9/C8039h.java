package p268l9;

import android.app.Activity;
import androidx.annotation.NonNull;
import p093e4.ActivityC4831q;
import p305n9.C8953m;

/* JADX INFO: renamed from: l9.h */
/* JADX INFO: loaded from: classes.dex */
public class C8039h {

    /* JADX INFO: renamed from: a */
    public final Object f30021a;

    public C8039h(@NonNull Activity activity) {
        C8953m.m36048m(activity, "Activity must not be null");
        this.f30021a = activity;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m33171a() {
        return this.f30021a instanceof ActivityC4831q;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m33172b() {
        return this.f30021a instanceof Activity;
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public final Activity m33173c() {
        return (Activity) this.f30021a;
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public final ActivityC4831q m33174d() {
        return (ActivityC4831q) this.f30021a;
    }
}
