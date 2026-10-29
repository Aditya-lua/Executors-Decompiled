package y8;

import android.os.Bundle;
import n9.k;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class g implements k9.a.d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final g f35777d = new g(new f());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35778a = null;
    public final boolean b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f35779c;

    public g(f fVar) {
        this.b = fVar.f35776a.booleanValue();
        this.f35779c = fVar.b;
    }

    public static /* bridge */ /* synthetic */ String b(g gVar) {
        String str = gVar.f35778a;
        return null;
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString("consumer_package", null);
        bundle.putBoolean("force_save_dialog", this.b);
        bundle.putString("log_session_id", this.f35779c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return k.b(null, null) && this.b == gVar.b && k.b(this.f35779c, gVar.f35779c);
    }

    public final int hashCode() {
        return k.c(null, Boolean.valueOf(this.b), this.f35779c);
    }
}
