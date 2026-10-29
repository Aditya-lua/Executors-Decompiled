package p570y8;

import android.os.Bundle;
import androidx.annotation.NonNull;
import p242k9.C7491a;
import p305n9.C8947k;

/* JADX INFO: renamed from: y8.c */
/* JADX INFO: loaded from: classes.dex */
public final class C13126c implements C7491a.d {

    /* JADX INFO: renamed from: b */
    @NonNull
    public static final C13126c f46382b = new C13126c(new Bundle(), null);

    /* JADX INFO: renamed from: a */
    public final Bundle f46383a;

    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [y8.c.<clinit>():void] */
    public /* synthetic */ C13126c(Bundle bundle, C13132i c13132i) {
        this.f46383a = bundle;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public final Bundle m48735a() {
        return new Bundle(this.f46383a);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C13126c) {
            return C8947k.m36025a(this.f46383a, ((C13126c) obj).f46383a);
        }
        return false;
    }

    public final int hashCode() {
        return C8947k.m36027c(this.f46383a);
    }
}
