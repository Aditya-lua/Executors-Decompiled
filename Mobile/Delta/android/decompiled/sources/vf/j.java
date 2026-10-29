package vf;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public interface j {

    public enum a {
        NONE(0),
        SDK(1),
        GLOBAL(2),
        COMBINED(3);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f33041a;

        a(int i10) {
            this.f33041a = i10;
        }

        public int b() {
            return this.f33041a;
        }
    }

    @NonNull
    a b(@NonNull String str);
}
