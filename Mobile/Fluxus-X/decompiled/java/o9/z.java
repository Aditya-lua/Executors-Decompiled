package o9;

import android.os.Bundle;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class z implements l9.a.d {

    @NonNull
    public static final z b = a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27059a;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f27060a;

        public /* synthetic */ a(c0 c0Var) {
        }

        @NonNull
        public z a() {
            return new z(this.f27060a, null);
        }

        @NonNull
        public a b(String str) {
            this.f27060a = str;
            return this;
        }
    }

    public /* synthetic */ z(String str, d0 d0Var) {
        this.f27059a = str;
    }

    @NonNull
    public static a a() {
        return new a(null);
    }

    @NonNull
    public final Bundle b() {
        Bundle bundle = new Bundle();
        String str = this.f27059a;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof z) {
            return q.b(this.f27059a, ((z) obj).f27059a);
        }
        return false;
    }

    public final int hashCode() {
        return q.c(this.f27059a);
    }
}
