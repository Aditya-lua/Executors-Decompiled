package lb;

import android.content.Context;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public static final k9.a<k9.a.d.c> f23512a;

    @NonNull
    @Deprecated
    public static final a b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    @Deprecated
    public static final c f23513c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    @Deprecated
    public static final h f23514d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final k9.a.g<hb.n> f23515e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final k9.a.AbstractC0391a<hb.n, k9.a.d.c> f23516f;

    static {
        k9.a.g<hb.n> gVar = new k9.a.g<>();
        f23515e = gVar;
        v vVar = new v();
        f23516f = vVar;
        f23512a = new k9.a<>("LocationServices.API", vVar, gVar);
        b = new hb.y();
        f23513c = new hb.b();
        f23514d = new hb.s();
    }

    @NonNull
    public static b a(@NonNull Context context) {
        return new b(context);
    }

    @NonNull
    public static i b(@NonNull Context context) {
        return new i(context);
    }
}
