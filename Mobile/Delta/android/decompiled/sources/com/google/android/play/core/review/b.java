package com.google.android.play.core.review;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import sb.k;
import sb.m;
import wd.g;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"RestrictedApi"})
public final class b implements wd.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f8452a;
    public final Handler b = new Handler(Looper.getMainLooper());

    public b(g gVar) {
        this.f8452a = gVar;
    }

    @Override // wd.b
    @NonNull
    public final Task<ReviewInfo> a() {
        return this.f8452a.a();
    }

    @Override // wd.b
    @NonNull
    public final Task<Void> b(@NonNull Activity activity, @NonNull ReviewInfo reviewInfo) {
        if (reviewInfo.zzb()) {
            return m.f(null);
        }
        Intent intent = new Intent(activity, (Class<?>) PlayCoreDialogWrapperActivity.class);
        intent.putExtra("confirmation_intent", reviewInfo.a());
        intent.putExtra("window_flags", activity.getWindow().getDecorView().getWindowSystemUiVisibility());
        k kVar = new k();
        intent.putExtra("result_receiver", new zzc(this, this.b, kVar));
        activity.startActivity(intent);
        return kVar.a();
    }
}
