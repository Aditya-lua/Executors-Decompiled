package p514wd;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.tasks.Task;
import com.roblox.client.personasdk.BuildConfig;
import p543xd.C12788i;
import p543xd.C12799t;
import p543xd.C12802w;
import sb.C11264k;
import sb.C11268m;

/* JADX INFO: renamed from: wd.g */
/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"RestrictedApi"})
public final class C12355g {

    /* JADX INFO: renamed from: c */
    public static final C12788i f44211c = new C12788i("ReviewService");

    /* JADX INFO: renamed from: a */
    public C12799t f44212a;

    /* JADX INFO: renamed from: b */
    public final String f44213b;

    /* JADX WARN: Type inference failed for: r7v0, types: [wd.d] */
    public C12355g(Context context) {
        this.f44213b = context.getPackageName();
        if (C12802w.m47680a(context)) {
            this.f44212a = new C12799t(context, f44211c, "com.google.android.finsky.inappreviewservice.InAppReviewService", new Intent("com.google.android.finsky.BIND_IN_APP_REVIEW_SERVICE").setPackage(BuildConfig.STORE_PACKAGE), new Object() { // from class: wd.d
            }, null);
        }
    }

    /* JADX INFO: renamed from: a */
    public final Task m46221a() {
        String str = this.f44213b;
        C12788i c12788i = f44211c;
        c12788i.m47652c("requestInAppReview (%s)", str);
        if (this.f44212a == null) {
            c12788i.m47650a("Play Store app is either not installed or not the official version", new Object[0]);
            return C11268m.m42335e(new C12349a(-1));
        }
        C11264k c11264k = new C11264k();
        this.f44212a.m47674s(new C12353e(this, c11264k, c11264k), c11264k);
        return c11264k.m42326a();
    }
}
