package m9;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Status;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

/* JADX INFO: loaded from: classes.dex */
public class v {
    public static <ResultT> void a(@NonNull Status status, ResultT resultt, @NonNull tb.k<ResultT> kVar) {
        if (status.F3()) {
            kVar.c(resultt);
        } else {
            kVar.b(o9.b.a(status));
        }
    }

    public static void b(@NonNull Status status, @NonNull tb.k<Void> kVar) {
        a(status, null, kVar);
    }

    @ResultIgnorabilityUnspecified
    public static <ResultT> boolean c(@NonNull Status status, ResultT resultt, @NonNull tb.k<ResultT> kVar) {
        return status.F3() ? kVar.e(resultt) : kVar.d(o9.b.a(status));
    }
}
