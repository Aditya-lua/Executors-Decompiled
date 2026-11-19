package ba;

import android.content.Context;
import androidx.annotation.NonNull;
import fb.c;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public static final l9.a.g f3799a;

    @NonNull
    public static final l9.a b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final fb.b f3800c;

    static {
        l9.a.g gVar = new l9.a.g();
        f3799a = gVar;
        b = new l9.a("Fido.U2F_ZERO_PARTY_API", new c(), gVar);
        f3800c = new fb.b();
    }

    @NonNull
    public static ca.a a(@NonNull Context context) {
        return new ca.a(context);
    }
}
