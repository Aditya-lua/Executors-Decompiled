package l9;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Status;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

/* JADX INFO: loaded from: classes.dex */
public class v {
    public static <ResultT> void a(@NonNull Status status, ResultT resultt, @NonNull sb.k<ResultT> kVar) {
        if (status.A3()) {
            kVar.c(resultt);
        } else {
            kVar.b(n9.a.a(status));
        }
    }

    public static void b(@NonNull Status status, @NonNull sb.k<Void> kVar) {
        a(status, null, kVar);
    }

    @ResultIgnorabilityUnspecified
    public static <ResultT> boolean c(@NonNull Status status, ResultT resultt, @NonNull sb.k<ResultT> kVar) {
        return status.A3() ? kVar.e(resultt) : kVar.d(n9.a.a(status));
    }
}
