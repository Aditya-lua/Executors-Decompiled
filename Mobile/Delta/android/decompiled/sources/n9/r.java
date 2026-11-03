package n9;

import android.os.Bundle;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class r implements k9.a.d {

    @NonNull
    public static final r b = a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26117a;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f26118a;

        public /* synthetic */ a(u uVar) {
        }

        @NonNull
        public r a() {
            return new r(this.f26118a, null);
        }

        @NonNull
        public a b(String str) {
            this.f26118a = str;
            return this;
        }
    }

    public /* synthetic */ r(String str, v vVar) {
        this.f26117a = str;
    }

    @NonNull
    public static a a() {
        return new a(null);
    }

    @NonNull
    public final Bundle b() {
        Bundle bundle = new Bundle();
        String str = this.f26117a;
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
            return k.b(this.f26117a, ((r) obj).f26117a);
        }
        return false;
    }

    public final int hashCode() {
        return k.c(this.f26117a);
    }
}
