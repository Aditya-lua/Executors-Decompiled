package nb;

import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class s6 implements com.google.android.gms.internal.measurement.cd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f25944a;
    public final /* synthetic */ x6 b;

    public s6(x6 x6Var, String str) {
        this.f25944a = str;
        Objects.requireNonNull(x6Var);
        this.b = x6Var;
    }

    @Override // com.google.android.gms.internal.measurement.cd
    public final String a(String str) {
        Map map = (Map) this.b.p().get(this.f25944a);
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return (String) map.get(str);
    }
}
