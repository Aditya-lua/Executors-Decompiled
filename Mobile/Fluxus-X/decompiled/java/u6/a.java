package u6;

import com.appsflyer.sdk_base.referrer.Payload;
import com.github.luben.zstd.BuildConfig;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lu6/a;", BuildConfig.FLAVOR, "<init>", "()V", "Lew/g;", Payload.SOURCE, "Lu6/q;", "a", "(Lew/g;)Lu6/q;", Payload.RESPONSE, "Lew/f;", "sink", BuildConfig.FLAVOR, "b", "(Lu6/q;Lew/f;)V", "coil-network-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f33170a = new a();

    @NotNull
    public final NetworkResponse a(@NotNull ew.g source) {
        int i10 = Integer.parseInt(source.b1());
        long j10 = Long.parseLong(source.b1());
        long j11 = Long.parseLong(source.b1());
        NetworkHeaders.a aVar = new NetworkHeaders.a();
        int i11 = Integer.parseInt(source.b1());
        for (int i12 = 0; i12 < i11; i12++) {
            v6.e.b(aVar, source.b1());
        }
        return new NetworkResponse(i10, j10, j11, aVar.b(), null, null, 48, null);
    }

    public final void b(@NotNull NetworkResponse response, @NotNull ew.f sink) {
        sink.A1(response.getCode()).writeByte(10);
        sink.A1(response.getRequestMillis()).writeByte(10);
        sink.A1(response.getResponseMillis()).writeByte(10);
        Set<Map.Entry<String, List<String>>> setEntrySet = response.getHeaders().b().entrySet();
        Iterator<T> it = setEntrySet.iterator();
        int size = 0;
        while (it.hasNext()) {
            size += ((List) ((Map.Entry) it.next()).getValue()).size();
        }
        sink.A1(size).writeByte(10);
        for (Map.Entry<String, List<String>> entry : setEntrySet) {
            Iterator<String> it2 = entry.getValue().iterator();
            while (it2.hasNext()) {
                sink.D0(entry.getKey()).D0(":").D0(it2.next()).writeByte(10);
            }
        }
    }
}
