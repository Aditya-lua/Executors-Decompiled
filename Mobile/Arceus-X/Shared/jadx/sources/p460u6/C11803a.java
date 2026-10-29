package p460u6;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p315nt.InterfaceC9557b;
import p443t6.InterfaceC11532b;
import p443t6.NetworkRequest;
import p443t6.NetworkResponse;
import p537x6.Options;

/* JADX INFO: renamed from: u6.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u000b\u0010\fJ2\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m31665d2 = {"Lu6/a;", "Lt6/b;", "<init>", "()V", "Lt6/q;", "cacheResponse", "Lt6/o;", "networkRequest", "Lx6/p;", "options", "Lt6/b$b;", "b", "(Lt6/q;Lt6/o;Lx6/p;Lnt/b;)Ljava/lang/Object;", "networkResponse", "Lt6/b$c;", "a", "(Lt6/q;Lt6/o;Lt6/q;Lx6/p;Lnt/b;)Ljava/lang/Object;", "coil-network-core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C11803a implements InterfaceC11532b {
    @Override // p443t6.InterfaceC11532b
    @Nullable
    /* JADX INFO: renamed from: a */
    public Object mo43106a(@Nullable NetworkResponse networkResponse, @NotNull NetworkRequest networkRequest, @NotNull NetworkResponse networkResponse2, @NotNull Options options, @NotNull InterfaceC9557b<? super InterfaceC11532b.WriteResult> interfaceC9557b) {
        return (networkResponse2.getCode() != 304 || networkResponse == null) ? new InterfaceC11532b.WriteResult(networkResponse2) : new InterfaceC11532b.WriteResult(NetworkResponse.m43160b(networkResponse2, 0, 0L, 0L, C11807e.m44162d(networkResponse.getHeaders(), networkResponse2.getHeaders()), null, null, 39, null));
    }

    @Override // p443t6.InterfaceC11532b
    @Nullable
    /* JADX INFO: renamed from: b */
    public Object mo43107b(@NotNull NetworkResponse networkResponse, @NotNull NetworkRequest networkRequest, @NotNull Options options, @NotNull InterfaceC9557b<? super InterfaceC11532b.ReadResult> interfaceC9557b) {
        return new InterfaceC11532b.ReadResult(networkResponse);
    }
}
