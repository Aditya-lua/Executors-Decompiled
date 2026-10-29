package p486v7;

import androidx.annotation.NonNull;

/* JADX INFO: renamed from: v7.b */
/* JADX INFO: loaded from: classes.dex */
public final class C12018b {

    /* JADX INFO: renamed from: a */
    public String f42575a;

    /* JADX INFO: renamed from: v7.b$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public String f42576a;

        public /* synthetic */ a(C12073r c12073r) {
        }

        @NonNull
        /* JADX INFO: renamed from: a */
        public C12018b m44845a() {
            String str = this.f42576a;
            if (str == null) {
                throw new IllegalArgumentException("Purchase token must be set");
            }
            C12018b c12018b = new C12018b(null);
            c12018b.f42575a = str;
            return c12018b;
        }

        @NonNull
        /* JADX INFO: renamed from: b */
        public a m44846b(@NonNull String str) {
            this.f42576a = str;
            return this;
        }
    }

    public /* synthetic */ C12018b(C12073r c12073r) {
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public static a m44842b() {
        return new a(null);
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public String m44844a() {
        return this.f42575a;
    }
}
