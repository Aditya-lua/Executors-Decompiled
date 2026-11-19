package mb;

import android.content.Context;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public static final l9.a<l9.a.d.c> f23109a;

    @NonNull
    @Deprecated
    public static final a b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    @Deprecated
    public static final c f23110c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    @Deprecated
    public static final h f23111d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final l9.a.g<ib.n> f23112e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final l9.a.AbstractC0421a<ib.n, l9.a.d.c> f23113f;

    static {
        l9.a.g<ib.n> gVar = new l9.a.g<>();
        f23112e = gVar;
        v vVar = new v();
        f23113f = vVar;
        f23109a = new l9.a<>("LocationServices.API", vVar, gVar);
        b = new ib.c0();
        f23110c = new ib.b();
        f23111d = new ib.u();
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
