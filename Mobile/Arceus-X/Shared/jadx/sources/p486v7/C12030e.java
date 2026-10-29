package p486v7;

import androidx.annotation.NonNull;

/* JADX INFO: renamed from: v7.e */
/* JADX INFO: loaded from: classes.dex */
public final class C12030e {

    /* JADX INFO: renamed from: a */
    public String f42589a;

    /* JADX INFO: renamed from: v7.e$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public String f42590a;

        public /* synthetic */ a(C12054k1 c12054k1) {
        }

        @NonNull
        /* JADX INFO: renamed from: a */
        public C12030e m44850a() {
            String str = this.f42590a;
            if (str == null) {
                throw new IllegalArgumentException("Purchase token must be set");
            }
            C12030e c12030e = new C12030e(null);
            c12030e.f42589a = str;
            return c12030e;
        }

        @NonNull
        /* JADX INFO: renamed from: b */
        public a m44851b(@NonNull String str) {
            this.f42590a = str;
            return this;
        }
    }

    public /* synthetic */ C12030e(C12054k1 c12054k1) {
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public static a m44847b() {
        return new a(null);
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public String m44849a() {
        return this.f42589a;
    }
}
