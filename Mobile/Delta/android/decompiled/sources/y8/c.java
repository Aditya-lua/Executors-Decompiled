package y8;

import android.os.Bundle;
import androidx.annotation.NonNull;
import n9.k;

/* JADX INFO: loaded from: classes.dex */
public final class c implements k9.a.d {

    @NonNull
    public static final c b = new c(new Bundle(), null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bundle f36632a;

    public /* synthetic */ c(Bundle bundle, i iVar) {
        this.f36632a = bundle;
    }

    @NonNull
    public final Bundle a() {
        return new Bundle(this.f36632a);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            return k.a(this.f36632a, ((c) obj).f36632a);
        }
        return false;
    }

    public final int hashCode() {
        return k.c(this.f36632a);
    }
}
