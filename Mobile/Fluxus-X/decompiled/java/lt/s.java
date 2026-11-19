package lt;

import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class s implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<p, Object> f22542a = new HashMap(3);

    @Override // lt.r
    public <T> T a(@NonNull p<T> pVar) {
        return (T) this.f22542a.get(pVar);
    }

    @Override // lt.r
    public <T> void b(@NonNull p<T> pVar, T t8) {
        if (t8 == null) {
            this.f22542a.remove(pVar);
        } else {
            this.f22542a.put(pVar, t8);
        }
    }
}
