package yd;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"RestrictedApi"})
public final class h implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f37721a;
    public final Handler b = new Handler(Looper.getMainLooper());

    public h(m mVar) {
        this.f37721a = mVar;
    }

    @Override // yd.c
    @NonNull
    public final Task<b> a() {
        return this.f37721a.a();
    }

    @Override // yd.c
    @NonNull
    public final Task<Void> b(@NonNull Activity activity, @NonNull b bVar) {
        if (bVar.zzb()) {
            return tb.m.f(null);
        }
        Intent intent = new Intent(activity, (Class<?>) PlayCoreDialogWrapperActivity.class);
        intent.putExtra("confirmation_intent", bVar.a());
        intent.putExtra("window_flags", activity.getWindow().getDecorView().getWindowSystemUiVisibility());
        tb.k kVar = new tb.k();
        intent.putExtra("result_receiver", new g(this, this.b, kVar));
        activity.startActivity(intent);
        return kVar.a();
    }
}
