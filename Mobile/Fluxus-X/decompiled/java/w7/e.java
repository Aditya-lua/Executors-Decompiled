package w7;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f35596a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f35597a;

        public /* synthetic */ a(k1 k1Var) {
        }

        @NonNull
        public e a() {
            String str = this.f35597a;
            if (str == null) {
                throw new IllegalArgumentException("Purchase token must be set");
            }
            e eVar = new e(null);
            eVar.f35596a = str;
            return eVar;
        }

        @NonNull
        public a b(@NonNull String str) {
            this.f35597a = str;
            return this;
        }
    }

    public /* synthetic */ e(k1 k1Var) {
    }

    @NonNull
    public static a b() {
        return new a(null);
    }

    @NonNull
    public String a() {
        return this.f35596a;
    }
}
