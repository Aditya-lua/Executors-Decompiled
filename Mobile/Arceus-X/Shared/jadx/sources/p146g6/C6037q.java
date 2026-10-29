package p146g6;

import android.net.NetworkRequest;
import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import kotlin.collections.C7693m;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p536x5.AbstractC12732w;

/* JADX INFO: renamed from: g6.q */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0011\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u0011\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m31665d2 = {"Lg6/q;", "", "<init>", "()V", "", "capabilities", "transports", "Landroid/net/NetworkRequest;", "a", "([I[I)Landroid/net/NetworkRequest;", "request", "", "capability", "", "c", "(Landroid/net/NetworkRequest;I)Z", NotificationCompat.CATEGORY_TRANSPORT, "d", "Lg6/s;", "b", "([I[I)Lg6/s;", "work-runtime_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C6037q {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C6037q f23315a = new C6037q();

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final NetworkRequest m26844a(@NotNull int[] capabilities, @NotNull int[] transports) {
        Intrinsics.checkNotNullParameter(capabilities, "capabilities");
        Intrinsics.checkNotNullParameter(transports, "transports");
        NetworkRequest.Builder builder = new NetworkRequest.Builder();
        for (int i10 : capabilities) {
            try {
                builder.addCapability(i10);
            } catch (IllegalArgumentException e10) {
                AbstractC12732w.m47441e().mo47452l(NetworkRequestCompat.INSTANCE.m26852a(), "Ignoring adding capability '" + i10 + '\'', e10);
            }
        }
        for (int i11 : C6040t.f23320a) {
            if (!C7693m.m31836E(capabilities, i11)) {
                try {
                    builder.removeCapability(i11);
                } catch (IllegalArgumentException e11) {
                    AbstractC12732w.m47441e().mo47452l(NetworkRequestCompat.INSTANCE.m26852a(), "Ignoring removing default capability '" + i11 + '\'', e11);
                }
            }
        }
        for (int i12 : transports) {
            builder.addTransportType(i12);
        }
        NetworkRequest networkRequestBuild = builder.build();
        Intrinsics.checkNotNullExpressionValue(networkRequestBuild, "build(...)");
        return networkRequestBuild;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final NetworkRequestCompat m26845b(@NotNull int[] capabilities, @NotNull int[] transports) {
        Intrinsics.checkNotNullParameter(capabilities, "capabilities");
        Intrinsics.checkNotNullParameter(transports, "transports");
        return new NetworkRequestCompat(m26844a(capabilities, transports));
    }

    /* JADX INFO: renamed from: c */
    public final boolean m26846c(@NotNull NetworkRequest request, int capability) {
        Intrinsics.checkNotNullParameter(request, "request");
        return request.hasCapability(capability);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m26847d(@NotNull NetworkRequest request, int transport) {
        Intrinsics.checkNotNullParameter(request, "request");
        return request.hasTransport(transport);
    }
}
