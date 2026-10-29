package us;

import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class s implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<p, Object> f32618a = new HashMap(3);

    @Override // us.r
    public <T> T a(@NonNull p<T> pVar) {
        return (T) this.f32618a.get(pVar);
    }

    @Override // us.r
    public <T> void b(@NonNull p<T> pVar, T t8) {
        if (t8 == null) {
            this.f32618a.remove(pVar);
        } else {
            this.f32618a.put(pVar, t8);
        }
    }
}
