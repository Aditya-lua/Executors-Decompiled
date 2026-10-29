package okhttp3.internal.connection;

import com.appsflyer.sdk_base.referrer.Payload;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p560xu.InterfaceC12926f;
import p560xu.InterfaceC12928g;
import p560xu.InterfaceC12947p0;
import p560xu.InterfaceC12949q0;
import p560xu.InterfaceC12951r0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\nÀ\u0006\u0003"}, m31665d2 = {"Lokhttp3/internal/connection/BufferedSocket;", "Lxu/q0;", "Lxu/g;", "getSource", "()Lxu/g;", Payload.SOURCE, "Lxu/f;", "getSink", "()Lxu/f;", "sink", "okhttp"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public interface BufferedSocket extends InterfaceC12949q0 {
    @Override // p560xu.InterfaceC12949q0
    /* synthetic */ void cancel();

    @Override // p560xu.InterfaceC12949q0
    @NotNull
    InterfaceC12926f getSink();

    @Override // p560xu.InterfaceC12949q0
    @NotNull
    /* synthetic */ InterfaceC12947p0 getSink();

    @Override // p560xu.InterfaceC12949q0
    @NotNull
    InterfaceC12928g getSource();

    @Override // p560xu.InterfaceC12949q0
    @NotNull
    /* synthetic */ InterfaceC12951r0 getSource();
}
