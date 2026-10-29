package p356pb;

import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.api.Scope;
import p242k9.C7491a;

/* JADX INFO: renamed from: pb.e */
/* JADX INFO: loaded from: classes.dex */
public final class C10191e {

    /* JADX INFO: renamed from: a */
    public static final C7491a.g f36763a;

    /* JADX INFO: renamed from: b */
    public static final C7491a.g f36764b;

    /* JADX INFO: renamed from: c */
    public static final C7491a.a f36765c;

    /* JADX INFO: renamed from: d */
    public static final C7491a.a f36766d;

    /* JADX INFO: renamed from: e */
    public static final Scope f36767e;

    /* JADX INFO: renamed from: f */
    public static final Scope f36768f;

    /* JADX INFO: renamed from: g */
    public static final C7491a f36769g;

    /* JADX INFO: renamed from: h */
    public static final C7491a f36770h;

    static {
        C7491a.g gVar = new C7491a.g();
        f36763a = gVar;
        C7491a.g gVar2 = new C7491a.g();
        f36764b = gVar2;
        C10188b c10188b = new C10188b();
        f36765c = c10188b;
        C10189c c10189c = new C10189c();
        f36766d = c10189c;
        f36767e = new Scope("profile");
        f36768f = new Scope(NotificationCompat.CATEGORY_EMAIL);
        f36769g = new C7491a("SignIn.API", c10188b, gVar);
        f36770h = new C7491a("SignIn.INTERNAL_API", c10189c, gVar2);
    }
}
