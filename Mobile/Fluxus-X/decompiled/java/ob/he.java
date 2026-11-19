package ob;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class he {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27421a;
    public final Map b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final eb f27422c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.google.android.gms.internal.measurement.t7 f27423d;

    public he(String str, Map map, eb ebVar, com.google.android.gms.internal.measurement.t7 t7Var) {
        this.f27421a = str;
        this.b = map;
        this.f27422c = ebVar;
        this.f27423d = t7Var;
    }

    public final String a() {
        return this.f27421a;
    }

    public final Map b() {
        Map map = this.b;
        return map == null ? Collections.EMPTY_MAP : map;
    }

    public final eb c() {
        return this.f27422c;
    }

    public final com.google.android.gms.internal.measurement.t7 d() {
        return this.f27423d;
    }
}
