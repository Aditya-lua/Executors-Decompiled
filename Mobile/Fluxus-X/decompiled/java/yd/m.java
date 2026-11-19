package yd;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.tasks.Task;
import zd.t;
import zd.w;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"RestrictedApi"})
public final class m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final zd.i f37725c = new zd.i("ReviewService");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public t f37726a;
    public final String b;

    /* JADX WARN: Type inference failed for: r7v0, types: [yd.i] */
    public m(Context context) {
        this.b = context.getPackageName();
        if (w.a(context)) {
            this.f37726a = new t(context, f37725c, "com.google.android.finsky.inappreviewservice.InAppReviewService", new Intent("com.google.android.finsky.BIND_IN_APP_REVIEW_SERVICE").setPackage("com.android.vending"), new Object() { // from class: yd.i
            }, null);
        }
    }

    public final Task a() {
        String str = this.b;
        zd.i iVar = f37725c;
        iVar.c("requestInAppReview (%s)", str);
        if (this.f37726a == null) {
            iVar.a("Play Store app is either not installed or not the official version", new Object[0]);
            return tb.m.e(new a(-1));
        }
        tb.k kVar = new tb.k();
        this.f37726a.s(new j(this, kVar, kVar), kVar);
        return kVar.a();
    }
}
