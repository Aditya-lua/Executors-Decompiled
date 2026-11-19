package w8;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import java.lang.ref.WeakReference;
import o9.s;
import wa.o0;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static WeakReference f35691a;

    @NonNull
    public static synchronized b a(@NonNull Context context) {
        s.l(context);
        WeakReference weakReference = f35691a;
        b bVar = weakReference == null ? null : (b) weakReference.get();
        if (bVar != null) {
            return bVar;
        }
        o0 o0Var = new o0(context.getApplicationContext());
        f35691a = new WeakReference(o0Var);
        return o0Var;
    }

    @NonNull
    public abstract Task<Void> b();

    @NonNull
    public abstract Task<Void> c(@NonNull g... gVarArr);
}
