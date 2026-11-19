package w8;

import android.os.Bundle;
import androidx.annotation.NonNull;
import o9.s;
import wa.f0;

/* JADX INFO: loaded from: classes.dex */
public interface a {

    /* JADX INFO: renamed from: w8.a$a, reason: collision with other inner class name */
    public static class C0735a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Bundle f35686a = new Bundle();
        public final String b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f35687c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f35688d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f35689e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public String f35690f;

        public C0735a(@NonNull String str) {
            this.b = str;
        }

        @NonNull
        public a a() {
            s.m(this.f35687c, "setObject is required before calling build().");
            s.m(this.f35688d, "setObject is required before calling build().");
            return new f0(this.b, this.f35687c, this.f35688d, this.f35689e, this.f35690f, this.f35686a);
        }

        @NonNull
        public C0735a b(@NonNull String str, @NonNull String str2) {
            s.l(str);
            s.l(str2);
            this.f35687c = str;
            this.f35688d = str2;
            return this;
        }
    }
}
