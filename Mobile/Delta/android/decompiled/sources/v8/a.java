package v8;

import android.os.Bundle;
import androidx.annotation.NonNull;
import com.google.android.gms.internal.appindex.zzk;
import n9.m;

/* JADX INFO: loaded from: classes.dex */
public interface a {

    /* JADX INFO: renamed from: v8.a$a, reason: collision with other inner class name */
    public static class C0596a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Bundle f32869a = new Bundle();
        public final String b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f32870c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f32871d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f32872e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public String f32873f;

        public C0596a(@NonNull String str) {
            this.b = str;
        }

        @NonNull
        public a a() {
            m.m(this.f32870c, "setObject is required before calling build().");
            m.m(this.f32871d, "setObject is required before calling build().");
            return new zzk(this.b, this.f32870c, this.f32871d, this.f32872e, this.f32873f, this.f32869a);
        }

        @NonNull
        public C0596a b(@NonNull String str, @NonNull String str2) {
            m.l(str);
            m.l(str2);
            this.f32870c = str;
            this.f32871d = str2;
            return this;
        }
    }
}
