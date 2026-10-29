package androidx.p616lifecycle;

import androidx.core.app.NotificationCompat;
import com.appsflyer.sdk_base.referrer.Payload;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.lifecycle.e */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m31665d2 = {"Landroidx/lifecycle/e;", "Landroidx/lifecycle/p;", "", "Landroidx/lifecycle/i;", "generatedAdapters", "<init>", "([Landroidx/lifecycle/i;)V", "Landroidx/lifecycle/s;", Payload.SOURCE, "Landroidx/lifecycle/l$a;", NotificationCompat.CATEGORY_EVENT, "", "g", "(Landroidx/lifecycle/s;Landroidx/lifecycle/l$a;)V", "a", "[Landroidx/lifecycle/i;", "lifecycle-common"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
public final class C0951e implements InterfaceC0974p {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC0960i[] generatedAdapters;

    public C0951e(@NotNull InterfaceC0960i[] generatedAdapters) {
        Intrinsics.checkNotNullParameter(generatedAdapters, "generatedAdapters");
        this.generatedAdapters = generatedAdapters;
    }

    @Override // androidx.p616lifecycle.InterfaceC0974p
    /* JADX INFO: renamed from: g */
    public void mo1334g(@NotNull InterfaceC0980s source, @NotNull AbstractC0966l.a event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        C0946c0 c0946c0 = new C0946c0();
        for (InterfaceC0960i interfaceC0960i : this.generatedAdapters) {
            interfaceC0960i.m4919a(source, event, false, c0946c0);
        }
        for (InterfaceC0960i interfaceC0960i2 : this.generatedAdapters) {
            interfaceC0960i2.m4919a(source, event, true, c0946c0);
        }
    }
}
