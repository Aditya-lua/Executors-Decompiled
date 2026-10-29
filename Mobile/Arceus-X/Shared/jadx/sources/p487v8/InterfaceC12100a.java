package p487v8;

import android.os.Bundle;
import androidx.annotation.NonNull;
import com.google.android.gms.internal.appindex.zzk;
import p305n9.C8953m;

/* JADX INFO: renamed from: v8.a */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC12100a {

    /* JADX INFO: renamed from: v8.a$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public final Bundle f42714a = new Bundle();

        /* JADX INFO: renamed from: b */
        public final String f42715b;

        /* JADX INFO: renamed from: c */
        public String f42716c;

        /* JADX INFO: renamed from: d */
        public String f42717d;

        /* JADX INFO: renamed from: e */
        public String f42718e;

        /* JADX INFO: renamed from: f */
        public String f42719f;

        public a(@NonNull String str) {
            this.f42715b = str;
        }

        @NonNull
        /* JADX INFO: renamed from: a */
        public InterfaceC12100a m44940a() {
            C8953m.m36048m(this.f42716c, "setObject is required before calling build().");
            C8953m.m36048m(this.f42717d, "setObject is required before calling build().");
            return new zzk(this.f42715b, this.f42716c, this.f42717d, this.f42718e, this.f42719f, this.f42714a);
        }

        @NonNull
        /* JADX INFO: renamed from: b */
        public a m44941b(@NonNull String str, @NonNull String str2) {
            C8953m.m36047l(str);
            C8953m.m36047l(str2);
            this.f42716c = str;
            this.f42717d = str2;
            return this;
        }
    }
}
