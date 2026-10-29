package p570y8;

import android.os.Bundle;
import p242k9.C7491a;
import p305n9.C8947k;

/* JADX INFO: renamed from: y8.g */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class C13130g implements C7491a.d {

    /* JADX INFO: renamed from: d */
    public static final C13130g f46386d = new C13130g(new C13129f());

    /* JADX INFO: renamed from: a */
    public final String f46387a = null;

    /* JADX INFO: renamed from: b */
    public final boolean f46388b;

    /* JADX INFO: renamed from: c */
    public final String f46389c;

    public C13130g(C13129f c13129f) {
        this.f46388b = c13129f.f46384a.booleanValue();
        this.f46389c = c13129f.f46385b;
    }

    /* JADX INFO: renamed from: b */
    public static /* bridge */ /* synthetic */ String m48737b(C13130g c13130g) {
        String str = c13130g.f46387a;
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final Bundle m48740a() {
        Bundle bundle = new Bundle();
        bundle.putString("consumer_package", null);
        bundle.putBoolean("force_save_dialog", this.f46388b);
        bundle.putString("log_session_id", this.f46389c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C13130g)) {
            return false;
        }
        C13130g c13130g = (C13130g) obj;
        return C8947k.m36026b(null, null) && this.f46388b == c13130g.f46388b && C8947k.m36026b(this.f46389c, c13130g.f46389c);
    }

    public final int hashCode() {
        return C8947k.m36027c(null, Boolean.valueOf(this.f46388b), this.f46389c);
    }
}
