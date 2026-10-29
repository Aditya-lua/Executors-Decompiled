package v9;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import db.p;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class a implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f32878a;

    public a(@NonNull Looper looper) {
        this.f32878a = new p(looper);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(@NonNull Runnable runnable) {
        this.f32878a.post(runnable);
    }
}
