package p235k2;

import android.annotation.SuppressLint;
import android.app.ActivityOptions;
import android.os.Build;
import android.os.Bundle;

/* JADX INFO: renamed from: k2.c */
/* JADX INFO: loaded from: classes.dex */
public class C7411c {

    /* JADX INFO: renamed from: k2.c$a */
    public static class a extends C7411c {

        /* JADX INFO: renamed from: a */
        public final ActivityOptions f28513a;

        public a(ActivityOptions activityOptions) {
            this.f28513a = activityOptions;
        }

        @Override // p235k2.C7411c
        @SuppressLint({"WrongConstant"})
        /* JADX INFO: renamed from: b */
        public C7411c mo30706b(int i10) {
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 34) {
                this.f28513a.setPendingIntentBackgroundActivityStartMode(i10);
                return this;
            }
            if (i11 >= 33) {
                this.f28513a.setPendingIntentBackgroundActivityLaunchAllowed(i10 != 2);
            }
            return this;
        }

        @Override // p235k2.C7411c
        /* JADX INFO: renamed from: c */
        public Bundle mo30707c() {
            return this.f28513a.toBundle();
        }
    }

    /* JADX INFO: renamed from: a */
    public static C7411c m30705a() {
        return new a(ActivityOptions.makeBasic());
    }

    /* JADX INFO: renamed from: b */
    public C7411c mo30706b(int i10) {
        throw null;
    }

    /* JADX INFO: renamed from: c */
    public Bundle mo30707c() {
        throw null;
    }
}
