package p092e3;

import android.os.Bundle;
import com.appsflyer.sdk_base.referrer.Payload;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: e3.w0 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u0000 \u000e2\u00020\u0001:\u0001\u0003R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0004\u001a\u0004\b\u0003\u0010\u0006¨\u0006\u000f"}, m31665d2 = {"Le3/w0;", "", "", "a", "Ljava/lang/String;", "c", "()Ljava/lang/String;", Payload.TYPE, "Landroid/os/Bundle;", "b", "Landroid/os/Bundle;", "()Landroid/os/Bundle;", "requestData", "origin", "d", "credentials_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public abstract class AbstractC4794w0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String type;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Bundle requestData;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public final String origin;

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getOrigin() {
        return this.origin;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final Bundle getRequestData() {
        return this.requestData;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getType() {
        return this.type;
    }
}
