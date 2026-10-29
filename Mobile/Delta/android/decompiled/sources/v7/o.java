package v7;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32815a;
    public final boolean b;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f32816a;
        public boolean b = false;

        public /* synthetic */ a(z1 z1Var) {
        }

        @NonNull
        public o a() {
            String str = this.f32816a;
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
            this.f32816a = str;
            return this;
        }
    }

    public /* synthetic */ o(a aVar, z1 z1Var) {
        this.f32815a = aVar.f32816a;
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
        return this.f32815a;
    }
}
