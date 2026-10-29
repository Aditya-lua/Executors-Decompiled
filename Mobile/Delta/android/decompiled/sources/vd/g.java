package vd;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.tasks.Task;
import com.roblox.client.personasdk.BuildConfig;
import sb.k;
import sb.m;
import wd.i;
import wd.t;
import wd.w;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"RestrictedApi"})
public final class g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i f32914c = new i("ReviewService");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public t f32915a;
    public final String b;

    /* JADX WARN: Type inference failed for: r7v0, types: [vd.d] */
    public g(Context context) {
        this.b = context.getPackageName();
        if (w.a(context)) {
            this.f32915a = new t(context, f32914c, "com.google.android.finsky.inappreviewservice.InAppReviewService", new Intent("com.google.android.finsky.BIND_IN_APP_REVIEW_SERVICE").setPackage(BuildConfig.STORE_PACKAGE), new Object() { // from class: vd.d
            }, null);
        }
    }

    public final Task a() {
        String str = this.b;
        i iVar = f32914c;
        iVar.c("requestInAppReview (%s)", str);
        if (this.f32915a == null) {
            iVar.a("Play Store app is either not installed or not the official version", new Object[0]);
            return m.e(new a(-1));
        }
        k kVar = new k();
        this.f32915a.s(new e(this, kVar, kVar), kVar);
        return kVar.a();
    }
}
