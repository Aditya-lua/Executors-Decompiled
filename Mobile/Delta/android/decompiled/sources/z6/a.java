package z6;

import com.appsflyer.sdk_base.referrer.Payload;
import kotlin.Metadata;
import okhttp3.internal.ws.RealWebSocket;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\"\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0007\"\u0014\u0010\n\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0007¨\u0006\u000b"}, d2 = {"Lm6/h;", "Lxu/g;", Payload.SOURCE, "", "a", "(Lm6/h;Lxu/g;)Z", "Lxu/h;", "Lxu/h;", "SVG_TAG", "b", "LEFT_ANGLE_BRACKET", "coil-svg_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final xu.h f37306a;

    @NotNull
    public static final xu.h b;

    static {
        xu.h.Companion companion = xu.h.INSTANCE;
        f37306a = companion.d("<svg");
        b = companion.d("<");
    }

    public static final boolean a(@NotNull m6.h hVar, @NotNull xu.g gVar) {
        return gVar.o0(0L, b) && gVar.r1(f37306a, 0L, RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE) != -1;
    }
}
