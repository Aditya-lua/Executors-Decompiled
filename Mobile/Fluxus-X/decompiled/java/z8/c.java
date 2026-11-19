package z8;

import android.os.Bundle;
import androidx.annotation.NonNull;
import o9.q;

/* JADX INFO: loaded from: classes.dex */
public final class c implements l9.a.d {

    @NonNull
    public static final c b = new c(new Bundle(), null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bundle f39174a;

    public /* synthetic */ c(Bundle bundle, i iVar) {
        this.f39174a = bundle;
    }

    @NonNull
    public final Bundle a() {
        return new Bundle(this.f39174a);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            return q.a(this.f39174a, ((c) obj).f39174a);
        }
        return false;
    }

    public final int hashCode() {
        return q.c(this.f39174a);
    }
}
