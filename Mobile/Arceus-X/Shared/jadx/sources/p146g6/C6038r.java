package p146g6;

import android.net.NetworkRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: g6.r */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0004\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\b¨\u0006\n"}, m31665d2 = {"Lg6/r;", "", "<init>", "()V", "Landroid/net/NetworkRequest;", "request", "", "a", "(Landroid/net/NetworkRequest;)[I", "b", "work-runtime_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C6038r {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C6038r f23316a = new C6038r();

    @NotNull
    /* JADX INFO: renamed from: a */
    public final int[] m26848a(@NotNull NetworkRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        int[] capabilities = request.getCapabilities();
        Intrinsics.checkNotNullExpressionValue(capabilities, "getCapabilities(...)");
        return capabilities;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final int[] m26849b(@NotNull NetworkRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        int[] transportTypes = request.getTransportTypes();
        Intrinsics.checkNotNullExpressionValue(transportTypes, "getTransportTypes(...)");
        return transportTypes;
    }
}
