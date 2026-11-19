package z8;

import android.os.Bundle;
import o9.q;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class g implements l9.a.d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final g f39176d = new g(new f());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39177a = null;
    public final boolean b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f39178c;

    public g(f fVar) {
        this.b = fVar.f39175a.booleanValue();
        this.f39178c = fVar.b;
    }

    public static /* bridge */ /* synthetic */ String b(g gVar) {
        String str = gVar.f39177a;
        return null;
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString("consumer_package", null);
        bundle.putBoolean("force_save_dialog", this.b);
        bundle.putString("log_session_id", this.f39178c);
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
        return q.b(null, null) && this.b == gVar.b && q.b(this.f39178c, gVar.f39178c);
    }

    public final int hashCode() {
        return q.c(null, Boolean.valueOf(this.b), this.f39178c);
    }
}
