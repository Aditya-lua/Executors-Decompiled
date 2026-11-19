package w7;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35632a;
    public final boolean b;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f35633a;
        public boolean b = false;

        public /* synthetic */ a(z1 z1Var) {
        }

        @NonNull
        public o a() {
            String str = this.f35633a;
            if (str == null) {
                throw new IllegalArgumentException("Product type must be set");
            }
            if (!this.b || str.equals("subs")) {
                return new o(this, null);
            }
            throw new IllegalArgumentException("includeSuspendedSubscriptions is only supported for subscription purchases");
        }

        @NonNull
        public a b(@NonNull String str) {
            this.f35633a = str;
            return this;
        }
    }

    public /* synthetic */ o(a aVar, z1 z1Var) {
        this.f35632a = aVar.f35633a;
        this.b = aVar.b;
    }

    @NonNull
    public static a b() {
        return new a(null);
    }

    public boolean a() {
        return this.b;
    }

    @NonNull
    public final String c() {
        return this.f35632a;
    }
}
