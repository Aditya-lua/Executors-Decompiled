package mp;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lmp/h0;", "Landroidx/activity/result/IntentSenderRequest;", "Landroidx/activity/result/ActivityResult;", "b", "()Lmp/h0;", "launchers_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class e0 {
    @NotNull
    public static final h0<IntentSenderRequest, ActivityResult> b() {
        return new h0<>(new h.j(), new g.a() { // from class: mp.d0
            @Override // g.a
            public final void a(Object obj) {
                e0.c((ActivityResult) obj);
            }
        });
    }

    public static final void c(ActivityResult success) {
        Intrinsics.checkNotNullParameter(success, "success");
        new g0().b(success);
    }
}
