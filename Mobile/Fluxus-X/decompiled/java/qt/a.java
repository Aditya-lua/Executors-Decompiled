package qt;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: qt.a$a, reason: collision with other inner class name */
    public static class C0594a extends a {
        @Override // qt.a
        @NonNull
        public String b(@NonNull String str) {
            return str;
        }

        public C0594a() {
        }
    }

    @NonNull
    public static a a() {
        return new C0594a();
    }

    @NonNull
    public abstract String b(@NonNull String str);
}
