package v8;

import android.os.Bundle;
import androidx.annotation.NonNull;
import com.google.android.gms.internal.appindex.zzk;
import n9.m;

/* JADX INFO: loaded from: classes.dex */
public interface a {

    /* JADX INFO: renamed from: v8.a$a, reason: collision with other inner class name */
    public static class C0609a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Bundle f33437a = new Bundle();
        public final String b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f33438c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f33439d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f33440e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public String f33441f;

        public C0609a(@NonNull String str) {
            this.b = str;
        }

        @NonNull
        public a a() {
            m.m(this.f33438c, "setObject is required before calling build().");
            m.m(this.f33439d, "setObject is required before calling build().");
            return new zzk(this.b, this.f33438c, this.f33439d, this.f33440e, this.f33441f, this.f33437a);
        }

        @NonNull
        public C0609a b(@NonNull String str, @NonNull String str2) {
            m.l(str);
            m.l(str2);
            this.f33438c = str;
            this.f33439d = str2;
            return this;
        }
    }
}
