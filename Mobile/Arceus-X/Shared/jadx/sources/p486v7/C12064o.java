package p486v7;

import androidx.annotation.NonNull;

/* JADX INFO: renamed from: v7.o */
/* JADX INFO: loaded from: classes.dex */
public final class C12064o {

    /* JADX INFO: renamed from: a */
    public final String f42640a;

    /* JADX INFO: renamed from: b */
    public final boolean f42641b;

    /* JADX INFO: renamed from: v7.o$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public String f42642a;

        /* JADX INFO: renamed from: b */
        public boolean f42643b = false;

        public /* synthetic */ a(C12099z1 c12099z1) {
        }

        @NonNull
        /* JADX INFO: renamed from: a */
        public C12064o m44905a() {
            String str = this.f42642a;
            if (str == null) {
                throw new IllegalArgumentException("Product type must be set");
            }
            if (!this.f42643b || str.equals("subs")) {
                return new C12064o(this, null);
            }
            throw new IllegalArgumentException("includeSuspendedSubscriptions is only supported for subscription purchases");
        }

        @NonNull
        /* JADX INFO: renamed from: b */
        public a m44906b(@NonNull String str) {
            this.f42642a = str;
            return this;
        }
    }

    public /* synthetic */ C12064o(a aVar, C12099z1 c12099z1) {
        this.f42640a = aVar.f42642a;
        this.f42641b = aVar.f42643b;
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public static a m44900b() {
        return new a(null);
    }

    /* JADX INFO: renamed from: a */
    public boolean m44901a() {
        return this.f42641b;
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public final String m44902c() {
        return this.f42640a;
    }
}
