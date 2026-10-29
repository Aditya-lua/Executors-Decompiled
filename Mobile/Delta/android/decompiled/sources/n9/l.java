package n9;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i0 f25285a = new f0();

    public interface a<R extends k9.n, T> {
        T a(@NonNull R r8);
    }

    @NonNull
    public static <R extends k9.n, T> Task<T> a(@NonNull k9.i<R> iVar, @NonNull a<R, T> aVar) {
        i0 i0Var = f25285a;
        sb.k kVar = new sb.k();
        iVar.c(new g0(iVar, kVar, aVar, i0Var));
        return kVar.a();
    }

    @NonNull
    public static <R extends k9.n> Task<Void> b(@NonNull k9.i<R> iVar) {
        return a(iVar, new h0());
    }
}
