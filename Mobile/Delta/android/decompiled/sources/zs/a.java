package zs;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: zs.a$a, reason: collision with other inner class name */
    public static class C0692a extends a {
        @Override // zs.a
        @NonNull
        public String b(@NonNull String str) {
            return str;
        }

        public C0692a() {
        }
    }

    @NonNull
    public static a a() {
        return new C0692a();
    }

    @NonNull
    public abstract String b(@NonNull String str);
}
