package p305n9;

import android.os.Bundle;
import androidx.annotation.NonNull;
import p242k9.C7491a;

/* JADX INFO: renamed from: n9.r */
/* JADX INFO: loaded from: classes.dex */
public class C8965r implements C7491a.d {

    /* JADX INFO: renamed from: b */
    @NonNull
    public static final C8965r f32633b = m36068a().m36070a();

    /* JADX INFO: renamed from: a */
    public final String f32634a;

    /* JADX INFO: renamed from: n9.r$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public String f32635a;

        public /* synthetic */ a(C8971u c8971u) {
        }

        @NonNull
        /* JADX INFO: renamed from: a */
        public C8965r m36070a() {
            return new C8965r(this.f32635a, null);
        }

        @NonNull
        /* JADX INFO: renamed from: b */
        public a m36071b(String str) {
            this.f32635a = str;
            return this;
        }
    }

    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [n9.r.a.a():n9.r] */
    public /* synthetic */ C8965r(String str, C8973v c8973v) {
        this.f32634a = str;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static a m36068a() {
        return new a(null);
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public final Bundle m36069b() {
        Bundle bundle = new Bundle();
        String str = this.f32634a;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C8965r) {
            return C8947k.m36026b(this.f32634a, ((C8965r) obj).f32634a);
        }
        return false;
    }

    public final int hashCode() {
        return C8947k.m36027c(this.f32634a);
    }
}
