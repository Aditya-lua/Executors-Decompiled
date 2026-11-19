package ob;

import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class x6 implements com.google.android.gms.internal.measurement.gd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f27965a;
    public final /* synthetic */ c7 b;

    public x6(c7 c7Var, String str) {
        this.f27965a = str;
        Objects.requireNonNull(c7Var);
        this.b = c7Var;
    }

    @Override // com.google.android.gms.internal.measurement.gd
    public final String a(String str) {
        Map map = (Map) this.b.p().get(this.f27965a);
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return (String) map.get(str);
    }
}
