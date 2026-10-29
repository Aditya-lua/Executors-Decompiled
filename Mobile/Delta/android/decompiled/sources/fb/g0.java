package fb;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16530a;
    public final Status b;

    public g0(Status status, String str) {
        this.b = status;
        this.f16530a = str;
    }

    public static g0 a(String str) {
        return new g0(Status.f5718k, str);
    }

    public static g0 b(Status status) {
        n9.m.a(!status.A3());
        return new g0(status, null);
    }

    public final boolean c() {
        return this.b.A3();
    }

    public final String d() {
        return this.f16530a;
    }

    public final PendingIntent e() {
        return this.b.w3();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return n9.k.b(this.b, g0Var.b) && n9.k.b(this.f16530a, g0Var.f16530a);
    }

    public final int hashCode() {
        return n9.k.c(this.b, this.f16530a);
    }

    public final String toString() {
        return n9.k.d(this).a("status", this.b).a("gameRunToken", this.f16530a).toString();
    }
}
