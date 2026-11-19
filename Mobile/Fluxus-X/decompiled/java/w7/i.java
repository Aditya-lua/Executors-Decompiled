package w7;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f35614a;
    public final boolean b;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f35615a;
        public boolean b;

        public a() {
        }

        @NonNull
        public i a() {
            if (!this.f35615a) {
                throw new IllegalArgumentException("Pending purchases for one-time products must be supported.");
            }
            return new i(true, this.b);
        }

        @NonNull
        public a b() {
            this.f35615a = true;
            return this;
        }

        @NonNull
        public a c() {
            this.b = true;
            return this;
        }
    }

    public i(boolean z10, boolean z11) {
        this.f35614a = z10;
        this.b = z11;
    }

    @NonNull
    public static a c() {
        return new a();
    }

    public boolean a() {
        return this.f35614a;
    }

    public boolean b() {
        return this.b;
    }
}
