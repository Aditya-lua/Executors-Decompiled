package p514wd;

import android.app.Activity;
import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.review.ReviewInfo;

/* JADX INFO: renamed from: wd.b */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC12350b {
    @NonNull
    /* JADX INFO: renamed from: a */
    Task<ReviewInfo> mo13350a();

    @NonNull
    /* JADX INFO: renamed from: b */
    Task<Void> mo13351b(@NonNull Activity activity, @NonNull ReviewInfo reviewInfo);
}
