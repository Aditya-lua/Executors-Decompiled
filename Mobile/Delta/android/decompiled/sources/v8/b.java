package v8;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import java.lang.ref.WeakReference;
import n9.m;
import va.n0;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static WeakReference f32874a;

    @NonNull
    public static synchronized b a(@NonNull Context context) {
        m.l(context);
        WeakReference weakReference = f32874a;
        b bVar = weakReference == null ? null : (b) weakReference.get();
        if (bVar != null) {
            return bVar;
        }
        n0 n0Var = new n0(context.getApplicationContext());
        f32874a = new WeakReference(n0Var);
        return n0Var;
    }

    @NonNull
    public abstract Task<Void> b();

    @NonNull
    public abstract Task<Void> c(@NonNull g... gVarArr);
}
