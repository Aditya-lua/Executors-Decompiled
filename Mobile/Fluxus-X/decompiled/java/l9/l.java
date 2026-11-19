package l9;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
public final class l {
    @NonNull
    public static <R extends p> k<R> a(@NonNull R r10, @NonNull h hVar) {
        o9.s.m(r10, "Result must not be null");
        o9.s.b(!r10.n().F3(), "Status code must not be SUCCESS");
        u uVar = new u(hVar, r10);
        uVar.h(r10);
        return uVar;
    }

    @NonNull
    public static k<Status> b(@NonNull Status status, @NonNull h hVar) {
        o9.s.m(status, "Result must not be null");
        m9.t tVar = new m9.t(hVar);
        tVar.h(status);
        return tVar;
    }
}
