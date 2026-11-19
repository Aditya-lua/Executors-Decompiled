package d6;

import c6.NetworkState;
import com.github.luben.zstd.BuildConfig;
import g6.j0;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;
import y5.w;
import y5.x;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0013\u001a\u00020\u000f8\u0014X\u0094D¢\u0006\f\n\u0004\b\n\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Ld6/h;", "Ld6/b;", "Lc6/h;", "Le6/h;", "tracker", "<init>", "(Le6/h;)V", "Lg6/j0;", "workSpec", BuildConfig.FLAVOR, "b", "(Lg6/j0;)Z", "value", "f", "(Lc6/h;)Z", BuildConfig.FLAVOR, "I", "d", "()I", "reason", "c", "a", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h extends b<NetworkState> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final String f11955d;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final int reason;

    static {
        String strI = w.i("NetworkNotRoamingCtrlr");
        Intrinsics.checkNotNullExpressionValue(strI, "tagWithPrefix(...)");
        f11955d = strI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(@NotNull e6.h<NetworkState> tracker) {
        super(tracker);
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        this.reason = 7;
    }

    @Override // d6.e
    public boolean b(@NotNull j0 workSpec) {
        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        return workSpec.constraints.getRequiredNetworkType() == x.NOT_ROAMING;
    }

    @Override // d6.b
    /* JADX INFO: renamed from: d, reason: from getter */
    public int getReason() {
        return this.reason;
    }

    @Override // d6.b
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean e(@NotNull NetworkState value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return (value.getIsConnected() && value.getIsNotRoaming() && !value.getIsBlocked()) ? false : true;
    }
}
