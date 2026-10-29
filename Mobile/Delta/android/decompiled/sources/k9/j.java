package k9;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
public final class j {
    @NonNull
    public static <R extends n> i<R> a(@NonNull R r8, @NonNull f fVar) {
        n9.m.m(r8, "Result must not be null");
        n9.m.b(!r8.m().A3(), "Status code must not be SUCCESS");
        s sVar = new s(fVar, r8);
        sVar.h(r8);
        return sVar;
    }

    @NonNull
    public static i<Status> b(@NonNull Status status, @NonNull f fVar) {
        n9.m.m(status, "Result must not be null");
        l9.t tVar = new l9.t(fVar);
        tVar.h(status);
        return tVar;
    }
}
