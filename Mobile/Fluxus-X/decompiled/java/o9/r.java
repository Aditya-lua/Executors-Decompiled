package o9;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes.dex */
public class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q0 f27024a = new n0();

    public interface a<R extends l9.p, T> {
        T a(@NonNull R r10);
    }

    @NonNull
    public static <R extends l9.p, T> Task<T> a(@NonNull l9.k<R> kVar, @NonNull a<R, T> aVar) {
        q0 q0Var = f27024a;
        tb.k kVar2 = new tb.k();
        kVar.c(new o0(kVar, kVar2, aVar, q0Var));
        return kVar2.a();
    }

    @NonNull
    public static <R extends l9.p> Task<Void> b(@NonNull l9.k<R> kVar) {
        return a(kVar, new p0());
    }
}
