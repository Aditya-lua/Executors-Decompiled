package p268l9;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Status;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import p305n9.C8917a;
import sb.C11264k;

/* JADX INFO: renamed from: l9.v */
/* JADX INFO: loaded from: classes.dex */
public class C8081v {
    /* JADX INFO: renamed from: a */
    public static <ResultT> void m33290a(@NonNull Status status, ResultT resultt, @NonNull C11264k<ResultT> c11264k) {
        if (status.m9163A3()) {
            c11264k.m42328c(resultt);
        } else {
            c11264k.m42327b(C8917a.m35951a(status));
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m33291b(@NonNull Status status, @NonNull C11264k<Void> c11264k) {
        m33290a(status, null, c11264k);
    }

    @ResultIgnorabilityUnspecified
    /* JADX INFO: renamed from: c */
    public static <ResultT> boolean m33292c(@NonNull Status status, ResultT resultt, @NonNull C11264k<ResultT> c11264k) {
        return status.m9163A3() ? c11264k.m42330e(resultt) : c11264k.m42329d(C8917a.m35951a(status));
    }
}
