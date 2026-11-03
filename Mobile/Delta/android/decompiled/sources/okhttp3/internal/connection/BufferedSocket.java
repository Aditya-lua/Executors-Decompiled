package okhttp3.internal.connection;

import com.appsflyer.sdk_base.referrer.Payload;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import vu.f;
import vu.g;
import vu.p0;
import vu.q0;
import vu.r0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lokhttp3/internal/connection/BufferedSocket;", "Lvu/q0;", "Lvu/g;", "getSource", "()Lvu/g;", Payload.SOURCE, "Lvu/f;", "getSink", "()Lvu/f;", "sink", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface BufferedSocket extends q0 {
    @Override // vu.q0
    /* synthetic */ void cancel();

    @Override // vu.q0
    @NotNull
    f getSink();

    @Override // vu.q0
    @NotNull
    /* synthetic */ p0 getSink();

    @Override // vu.q0
    @NotNull
    g getSource();

    @Override // vu.q0
    @NotNull
    /* synthetic */ r0 getSource();
}
