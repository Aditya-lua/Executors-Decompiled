package w8;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import java.lang.ref.WeakReference;
import o9.s;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static WeakReference f35694a;

    @NonNull
    public static synchronized h b(@NonNull Context context) {
        s.l(context);
        WeakReference weakReference = f35694a;
        h hVar = weakReference == null ? null : (h) weakReference.get();
        if (hVar != null) {
            return hVar;
        }
        wa.c cVar = new wa.c(context.getApplicationContext());
        f35694a = new WeakReference(cVar);
        return cVar;
    }

    @NonNull
    public abstract Task<Void> a(@NonNull a aVar);
}
