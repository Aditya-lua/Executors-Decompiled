package k2;

import android.annotation.SuppressLint;
import android.app.ActivityOptions;
import android.os.Build;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public class c {

    public static class a extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ActivityOptions f22019a;

        public a(ActivityOptions activityOptions) {
            this.f22019a = activityOptions;
        }

        @Override // k2.c
        @SuppressLint({"WrongConstant"})
        public c b(int i10) {
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 34) {
                this.f22019a.setPendingIntentBackgroundActivityStartMode(i10);
                return this;
            }
            if (i11 >= 33) {
                this.f22019a.setPendingIntentBackgroundActivityLaunchAllowed(i10 != 2);
            }
            return this;
        }

        @Override // k2.c
        public Bundle c() {
            return this.f22019a.toBundle();
        }
    }

    public static c a() {
        return new a(ActivityOptions.makeBasic());
    }

    public c b(int i10) {
        throw null;
    }

    public Bundle c() {
        throw null;
    }
}
