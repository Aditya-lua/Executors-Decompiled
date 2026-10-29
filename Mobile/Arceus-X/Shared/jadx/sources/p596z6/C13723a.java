package p596z6;

import com.appsflyer.sdk_base.referrer.Payload;
import kotlin.Metadata;
import okhttp3.internal.p336ws.RealWebSocket;
import org.jetbrains.annotations.NotNull;
import p287m6.C8434h;
import p560xu.C12930h;
import p560xu.InterfaceC12928g;

/* JADX INFO: renamed from: z6.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\"\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0007\"\u0014\u0010\n\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0007¨\u0006\u000b"}, m31665d2 = {"Lm6/h;", "Lxu/g;", Payload.SOURCE, "", "a", "(Lm6/h;Lxu/g;)Z", "Lxu/h;", "Lxu/h;", "SVG_TAG", "b", "LEFT_ANGLE_BRACKET", "coil-svg_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C13723a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C12930h f48272a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final C12930h f48273b;

    static {
        C12930h.Companion companion = C12930h.INSTANCE;
        f48272a = companion.m48117d("<svg");
        f48273b = companion.m48117d("<");
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m50123a(@NotNull C8434h c8434h, @NotNull InterfaceC12928g interfaceC12928g) {
        return interfaceC12928g.mo48044o0(0L, f48273b) && interfaceC12928g.mo48050s1(f48272a, 0L, RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE) != -1;
    }
}
