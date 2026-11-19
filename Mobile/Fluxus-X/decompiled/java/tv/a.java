package tv;

import com.appsflyer.sdk_base.referrer.Payload;
import com.github.luben.zstd.BuildConfig;
import ew.g;
import mv.y;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u0000 \u00122\u00020\u0001:\u0001\nB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0011\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0010¨\u0006\u0013"}, d2 = {"Ltv/a;", BuildConfig.FLAVOR, "Lew/g;", Payload.SOURCE, "<init>", "(Lew/g;)V", BuildConfig.FLAVOR, "b", "()Ljava/lang/String;", "Lmv/y;", "a", "()Lmv/y;", "Lew/g;", "getSource", "()Lew/g;", BuildConfig.FLAVOR, "J", "headerLimit", "c", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final g source;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public long headerLimit;

    public a(@NotNull g source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.source = source;
        this.headerLimit = 262144L;
    }

    @NotNull
    public final y a() {
        y.a aVar = new y.a();
        while (true) {
            String strB = b();
            if (strB.length() == 0) {
                return aVar.f();
            }
            aVar.c(strB);
        }
    }

    @NotNull
    public final String b() {
        String strP0 = this.source.p0(this.headerLimit);
        this.headerLimit -= (long) strP0.length();
        return strP0;
    }
}
