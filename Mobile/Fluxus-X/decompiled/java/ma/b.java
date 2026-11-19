package ma;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import com.google.android.gms.games.internal.v2.resolution.GamesResolutionActivity;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    public static b a() {
        return new b();
    }

    public static final Task b(Activity activity, PendingIntent pendingIntent) {
        a aVar = new a();
        Intent intent = new Intent(activity, (Class<?>) GamesResolutionActivity.class);
        intent.putExtra("pendingIntent", pendingIntent);
        intent.putExtra("resultReceiver", aVar);
        activity.startActivity(intent);
        return aVar.a();
    }
}
