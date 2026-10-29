package vd;

import android.app.Activity;
import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.review.ReviewInfo;

/* JADX INFO: loaded from: classes2.dex */
public interface b {
    @NonNull
    Task<ReviewInfo> a();

    @NonNull
    Task<Void> b(@NonNull Activity activity, @NonNull ReviewInfo reviewInfo);
}
