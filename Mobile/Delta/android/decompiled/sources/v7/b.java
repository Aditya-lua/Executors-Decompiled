package v7;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f32769a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f32770a;

        public /* synthetic */ a(r rVar) {
        }

        @NonNull
        public b a() {
            String str = this.f32770a;
            if (str == null) {
                throw new IllegalArgumentException("Purchase token must be set");
            }
            b bVar = new b(null);
            bVar.f32769a = str;
            return bVar;
        }

        @NonNull
        public a b(@NonNull String str) {
            this.f32770a = str;
            return this;
        }
    }

    public /* synthetic */ b(r rVar) {
    }

    @NonNull
    public static a b() {
        return new a(null);
    }

    @NonNull
    public String a() {
        return this.f32769a;
    }
}
