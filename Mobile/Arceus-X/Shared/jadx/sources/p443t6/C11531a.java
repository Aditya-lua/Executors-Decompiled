package p443t6;

import com.appsflyer.sdk_base.referrer.Payload;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p460u6.C11807e;
import p560xu.InterfaceC12926f;
import p560xu.InterfaceC12928g;

/* JADX INFO: renamed from: t6.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m31665d2 = {"Lt6/a;", "", "<init>", "()V", "Lxu/g;", Payload.SOURCE, "Lt6/q;", "a", "(Lxu/g;)Lt6/q;", Payload.RESPONSE, "Lxu/f;", "sink", "", "b", "(Lt6/q;Lxu/f;)V", "coil-network-core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C11531a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C11531a f40808a = new C11531a();

    @NotNull
    /* JADX INFO: renamed from: a */
    public final NetworkResponse m43104a(@NotNull InterfaceC12928g source) {
        int i10 = Integer.parseInt(source.mo48021b1());
        long j10 = Long.parseLong(source.mo48021b1());
        long j11 = Long.parseLong(source.mo48021b1());
        NetworkHeaders.a aVar = new NetworkHeaders.a();
        int i11 = Integer.parseInt(source.mo48021b1());
        for (int i12 = 0; i12 < i11; i12++) {
            C11807e.m44160b(aVar, source.mo48021b1());
        }
        return new NetworkResponse(i10, j10, j11, aVar.m43152b(), null, null, 48, null);
    }

    /* JADX INFO: renamed from: b */
    public final void m43105b(@NotNull NetworkResponse response, @NotNull InterfaceC12926f sink) {
        sink.mo48058z1(response.getCode()).writeByte(10);
        sink.mo48058z1(response.getRequestMillis()).writeByte(10);
        sink.mo48058z1(response.getResponseMillis()).writeByte(10);
        Set<Map.Entry<String, List<String>>> setEntrySet = response.getHeaders().m43148b().entrySet();
        Iterator<T> it = setEntrySet.iterator();
        int size = 0;
        while (it.hasNext()) {
            size += ((List) ((Map.Entry) it.next()).getValue()).size();
        }
        sink.mo48058z1(size).writeByte(10);
        for (Map.Entry<String, List<String>> entry : setEntrySet) {
            Iterator<String> it2 = entry.getValue().iterator();
            while (it2.hasNext()) {
                sink.mo47992C0(entry.getKey()).mo47992C0(":").mo47992C0(it2.next()).writeByte(10);
            }
        }
    }
}
