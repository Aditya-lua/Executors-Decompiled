package mp;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p139g.InterfaceC5852a;
import p154h.C6257j;

/* JADX INFO: renamed from: mp.e0 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m31665d2 = {"Lmp/h0;", "Landroidx/activity/result/IntentSenderRequest;", "Landroidx/activity/result/ActivityResult;", "b", "()Lmp/h0;", "launchers_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C8618e0 {
    @NotNull
    /* JADX INFO: renamed from: b */
    public static final C8624h0<IntentSenderRequest, ActivityResult> m34666b() {
        return new C8624h0<>(new C6257j(), new InterfaceC5852a() { // from class: mp.d0
            @Override // p139g.InterfaceC5852a
            /* JADX INFO: renamed from: a */
            public final void mo4481a(Object obj) {
                C8618e0.m34667c((ActivityResult) obj);
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public static final void m34667c(ActivityResult success) {
        Intrinsics.checkNotNullParameter(success, "success");
        new C8622g0().m34679b(success);
    }
}
