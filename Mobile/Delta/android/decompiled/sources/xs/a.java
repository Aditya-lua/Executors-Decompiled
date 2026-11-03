package xs;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: xs.a$a, reason: collision with other inner class name */
    public static class C0661a extends a {
        @Override // xs.a
        @NonNull
        public String b(@NonNull String str) {
            return str;
        }

        public C0661a() {
        }
    }

    @NonNull
    public static a a() {
        return new C0661a();
    }

    @NonNull
    public abstract String b(@NonNull String str);
}
