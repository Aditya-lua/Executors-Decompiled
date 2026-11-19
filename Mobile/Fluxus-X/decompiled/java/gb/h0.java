package gb;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17624a;
    public final Status b;

    public h0(Status status, String str) {
        this.b = status;
        this.f17624a = str;
    }

    public static h0 a(String str) {
        return new h0(Status.f6108k, str);
    }

    public static h0 b(Status status) {
        o9.s.a(!status.F3());
        return new h0(status, null);
    }

    public final boolean c() {
        return this.b.F3();
    }

    public final String d() {
        return this.f17624a;
    }

    public final PendingIntent e() {
        return this.b.B3();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return o9.q.b(this.b, h0Var.b) && o9.q.b(this.f17624a, h0Var.f17624a);
    }

    public final int hashCode() {
        return o9.q.c(this.b, this.f17624a);
    }

    public final String toString() {
        return o9.q.d(this).a("status", this.b).a("gameRunToken", this.f17624a).toString();
    }
}
