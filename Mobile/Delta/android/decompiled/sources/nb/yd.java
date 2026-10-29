package nb;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class yd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26139a;
    public final Map b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final za f26140c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.google.android.gms.internal.measurement.p7 f26141d;

    public yd(String str, Map map, za zaVar, com.google.android.gms.internal.measurement.p7 p7Var) {
        this.f26139a = str;
        this.b = map;
        this.f26140c = zaVar;
        this.f26141d = p7Var;
    }

    public final String a() {
        return this.f26139a;
    }

    public final Map b() {
        Map map = this.b;
        return map == null ? Collections.EMPTY_MAP : map;
    }

    public final za c() {
        return this.f26140c;
    }

    public final com.google.android.gms.internal.measurement.p7 d() {
        return this.f26141d;
    }
}
