package lb;

import android.content.Context;
import androidx.annotation.NonNull;
import p166hb.C6328b;
import p166hb.C6340n;
import p166hb.C6345s;
import p166hb.C6351y;
import p242k9.C7491a;

/* JADX INFO: renamed from: lb.f */
/* JADX INFO: loaded from: classes.dex */
public class C8103f {

    /* JADX INFO: renamed from: a */
    @NonNull
    public static final C7491a<C7491a.d.c> f30144a;

    /* JADX INFO: renamed from: b */
    @NonNull
    @Deprecated
    public static final InterfaceC8097a f30145b;

    /* JADX INFO: renamed from: c */
    @NonNull
    @Deprecated
    public static final InterfaceC8100c f30146c;

    /* JADX INFO: renamed from: d */
    @NonNull
    @Deprecated
    public static final InterfaceC8105h f30147d;

    /* JADX INFO: renamed from: e */
    public static final C7491a.g<C6340n> f30148e;

    /* JADX INFO: renamed from: f */
    public static final C7491a.a<C6340n, C7491a.d.c> f30149f;

    static {
        C7491a.g<C6340n> gVar = new C7491a.g<>();
        f30148e = gVar;
        C8119v c8119v = new C8119v();
        f30149f = c8119v;
        f30144a = new C7491a<>("LocationServices.API", c8119v, gVar);
        f30145b = new C6351y();
        f30146c = new C6328b();
        f30147d = new C6345s();
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C8099b m33322a(@NonNull Context context) {
        return new C8099b(context);
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public static C8106i m33323b(@NonNull Context context) {
        return new C8106i(context);
    }
}
