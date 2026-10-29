package androidx.p616lifecycle;

import androidx.core.app.NotificationCompat;
import com.appsflyer.sdk_base.referrer.Payload;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.lifecycle.m0 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m31665d2 = {"Landroidx/lifecycle/m0;", "Landroidx/lifecycle/p;", "Landroidx/lifecycle/r0;", "provider", "<init>", "(Landroidx/lifecycle/r0;)V", "Landroidx/lifecycle/s;", Payload.SOURCE, "Landroidx/lifecycle/l$a;", NotificationCompat.CATEGORY_EVENT, "", "g", "(Landroidx/lifecycle/s;Landroidx/lifecycle/l$a;)V", "a", "Landroidx/lifecycle/r0;", "lifecycle-viewmodel-savedstate"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
public final class C0969m0 implements InterfaceC0974p {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final C0979r0 provider;

    public C0969m0(@NotNull C0979r0 provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.provider = provider;
    }

    @Override // androidx.p616lifecycle.InterfaceC0974p
    /* JADX INFO: renamed from: g */
    public void mo1334g(@NotNull InterfaceC0980s source, @NotNull AbstractC0966l.a event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == AbstractC0966l.a.ON_CREATE) {
            source.mo4656a().mo4938d(this);
            this.provider.m4977e();
        } else {
            throw new IllegalStateException(("Next event must be ON_CREATE, it was " + event).toString());
        }
    }
}
