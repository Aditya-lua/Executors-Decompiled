package om;

import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: om.m */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ/\u0010\r\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m31665d2 = {"Lom/m;", "Lom/o;", "<init>", "()V", "", "requestId", "statusBefore", "", "shouldRequestAuthorization", "", "b", "(Ljava/lang/String;Ljava/lang/String;Z)V", "granted", "d", "(Ljava/lang/String;Ljava/lang/String;ZZ)V", NotificationCompat.CATEGORY_SERVICE, "c", "(Ljava/lang/String;Ljava/lang/String;)V", "error", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "universalapp_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C9812m implements InterfaceC9814o {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C9812m f35601a = new C9812m();

    @Override // om.InterfaceC9814o
    /* JADX INFO: renamed from: a */
    public void mo30055a(@NotNull String requestId, @NotNull String service, @NotNull String error) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(error, "error");
    }

    @Override // om.InterfaceC9814o
    /* JADX INFO: renamed from: b */
    public void mo30056b(@NotNull String requestId, @NotNull String statusBefore, boolean shouldRequestAuthorization) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(statusBefore, "statusBefore");
    }

    @Override // om.InterfaceC9814o
    /* JADX INFO: renamed from: c */
    public void mo30057c(@NotNull String requestId, @NotNull String service) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(service, "service");
    }

    @Override // om.InterfaceC9814o
    /* JADX INFO: renamed from: d */
    public void mo30058d(@NotNull String requestId, @NotNull String statusBefore, boolean shouldRequestAuthorization, boolean granted) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(statusBefore, "statusBefore");
    }
}
