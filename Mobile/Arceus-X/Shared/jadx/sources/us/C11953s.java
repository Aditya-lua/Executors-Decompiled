package us;

import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: us.s */
/* JADX INFO: loaded from: classes3.dex */
public class C11953s implements InterfaceC11952r {

    /* JADX INFO: renamed from: a */
    public final Map<C11950p, Object> f42383a = new HashMap(3);

    @Override // us.InterfaceC11952r
    /* JADX INFO: renamed from: a */
    public <T> T mo44611a(@NonNull C11950p<T> c11950p) {
        return (T) this.f42383a.get(c11950p);
    }

    @Override // us.InterfaceC11952r
    /* JADX INFO: renamed from: b */
    public <T> void mo44612b(@NonNull C11950p<T> c11950p, T t8) {
        if (t8 == null) {
            this.f42383a.remove(c11950p);
        } else {
            this.f42383a.put(c11950p, t8);
        }
    }
}
