package v8;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import java.lang.ref.WeakReference;
import n9.m;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static WeakReference f33445a;

    @NonNull
    public static synchronized h b(@NonNull Context context) {
        m.l(context);
        WeakReference weakReference = f33445a;
        h hVar = weakReference == null ? null : (h) weakReference.get();
        if (hVar != null) {
            return hVar;
        }
        va.c cVar = new va.c(context.getApplicationContext());
        f33445a = new WeakReference(cVar);
        return cVar;
    }

    @NonNull
    public abstract Task<Void> a(@NonNull a aVar);
}
