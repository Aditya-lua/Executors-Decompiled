package com.google.android.play.core.review;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import p514wd.C12355g;
import p514wd.InterfaceC12350b;
import sb.C11264k;
import sb.C11268m;

/* JADX INFO: renamed from: com.google.android.play.core.review.b */
/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"RestrictedApi"})
public final class C2890b implements InterfaceC12350b {

    /* JADX INFO: renamed from: a */
    public final C12355g f10767a;

    /* JADX INFO: renamed from: b */
    public final Handler f10768b = new Handler(Looper.getMainLooper());

    public C2890b(C12355g c12355g) {
        this.f10767a = c12355g;
    }

    @Override // p514wd.InterfaceC12350b
    @NonNull
    /* JADX INFO: renamed from: a */
    public final Task<ReviewInfo> mo13350a() {
        return this.f10767a.m46221a();
    }

    @Override // p514wd.InterfaceC12350b
    @NonNull
    /* JADX INFO: renamed from: b */
    public final Task<Void> mo13351b(@NonNull Activity activity, @NonNull ReviewInfo reviewInfo) {
        if (reviewInfo.zzb()) {
            return C11268m.m42336f(null);
        }
        Intent intent = new Intent(activity, (Class<?>) PlayCoreDialogWrapperActivity.class);
        intent.putExtra("confirmation_intent", reviewInfo.mo13349a());
        intent.putExtra("window_flags", activity.getWindow().getDecorView().getWindowSystemUiVisibility());
        C11264k c11264k = new C11264k();
        intent.putExtra("result_receiver", new zzc(this, this.f10768b, c11264k));
        activity.startActivity(intent);
        return c11264k.m42326a();
    }
}
