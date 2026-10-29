package n9;

import android.os.Bundle;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class r implements k9.a.d {

    @NonNull
    public static final r b = a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25296a;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f25297a;

        public /* synthetic */ a(u uVar) {
        }

        @NonNull
        public r a() {
            return new r(this.f25297a, null);
        }

        @NonNull
        public a b(String str) {
            this.f25297a = str;
            return this;
        }
    }

    public /* synthetic */ r(String str, v vVar) {
        this.f25296a = str;
    }

    @NonNull
    public static a a() {
        return new a(null);
    }

    @NonNull
    public final Bundle b() {
        Bundle bundle = new Bundle();
        String str = this.f25296a;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r) {
            return k.b(this.f25296a, ((r) obj).f25296a);
        }
        return false;
    }

    public final int hashCode() {
        return k.c(this.f25296a);
    }
}
