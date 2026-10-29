package p011aa;

import android.content.Context;
import androidx.annotation.NonNull;
import ba.C1276a;
import p100eb.C4900b;
import p100eb.C4906c;
import p242k9.C7491a;

/* JADX INFO: renamed from: aa.a */
/* JADX INFO: loaded from: classes.dex */
public class C0102a {

    /* JADX INFO: renamed from: a */
    @NonNull
    public static final C7491a.g f326a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public static final C7491a f327b;

    /* JADX INFO: renamed from: c */
    public static final C4900b f328c;

    static {
        C7491a.g gVar = new C7491a.g();
        f326a = gVar;
        f327b = new C7491a("Fido.U2F_ZERO_PARTY_API", new C4906c(), gVar);
        f328c = new C4900b();
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C1276a m300a(@NonNull Context context) {
        return new C1276a(context);
    }
}
