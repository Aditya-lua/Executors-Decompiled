package v6;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import u6.NetworkRequest;
import u6.NetworkResponse;
import y6.Options;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u000b\u0010\fJ2\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lv6/a;", "Lu6/b;", "<init>", "()V", "Lu6/q;", "cacheResponse", "Lu6/o;", "networkRequest", "Ly6/p;", "options", "Lu6/b$b;", "a", "(Lu6/q;Lu6/o;Ly6/p;Leu/b;)Ljava/lang/Object;", "networkResponse", "Lu6/b$c;", "b", "(Lu6/q;Lu6/o;Lu6/q;Ly6/p;Leu/b;)Ljava/lang/Object;", "coil-network-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements u6.b {
    @Override // u6.b
    @Nullable
    public Object a(@NotNull NetworkResponse networkResponse, @NotNull NetworkRequest networkRequest, @NotNull Options options, @NotNull eu.b<? super u6.b.ReadResult> bVar) {
        return new u6.b.ReadResult(networkResponse);
    }

    @Override // u6.b
    @Nullable
    public Object b(@Nullable NetworkResponse networkResponse, @NotNull NetworkRequest networkRequest, @NotNull NetworkResponse networkResponse2, @NotNull Options options, @NotNull eu.b<? super u6.b.WriteResult> bVar) {
        return (networkResponse2.getCode() != 304 || networkResponse == null) ? new u6.b.WriteResult(networkResponse2) : new u6.b.WriteResult(NetworkResponse.b(networkResponse2, 0, 0L, 0L, e.d(networkResponse.getHeaders(), networkResponse2.getHeaders()), null, null, 39, null));
    }
}
