package a9;

import android.app.PendingIntent;
import android.content.Intent;
import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes.dex */
public interface i extends l9.i<y> {
    @NonNull
    @Deprecated
    j b(Intent intent);

    @NonNull
    Task<PendingIntent> d(@NonNull d dVar);

    @NonNull
    @Deprecated
    Task<b> e(@NonNull a aVar);

    @NonNull
    String p(Intent intent);

    @NonNull
    @Deprecated
    Task<Void> s();

    @NonNull
    @Deprecated
    Task<PendingIntent> u(@NonNull e eVar);
}
