package p242k9;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Status;
import p268l9.C8075t;
import p305n9.C8953m;

/* JADX INFO: renamed from: k9.j */
/* JADX INFO: loaded from: classes.dex */
public final class C7500j {
    @NonNull
    /* JADX INFO: renamed from: a */
    public static <R extends InterfaceC7504n> AbstractC7499i<R> m31160a(@NonNull R r8, @NonNull AbstractC7496f abstractC7496f) {
        C8953m.m36048m(r8, "Result must not be null");
        C8953m.m36037b(!r8.mo8183m().m9163A3(), "Status code must not be SUCCESS");
        C7509s c7509s = new C7509s(abstractC7496f, r8);
        c7509s.m9176h(r8);
        return c7509s;
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public static AbstractC7499i<Status> m31161b(@NonNull Status status, @NonNull AbstractC7496f abstractC7496f) {
        C8953m.m36048m(status, "Result must not be null");
        C8075t c8075t = new C8075t(abstractC7496f);
        c8075t.m9176h(status);
        return c8075t;
    }
}
