package yf;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public interface j {

    public enum a {
        NONE(0),
        SDK(1),
        GLOBAL(2),
        COMBINED(3);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f37852a;

        a(int i10) {
            this.f37852a = i10;
        }

        public int b() {
            return this.f37852a;
        }
    }

    @NonNull
    a b(@NonNull String str);
}
