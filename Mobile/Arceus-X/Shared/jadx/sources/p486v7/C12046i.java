package p486v7;

import androidx.annotation.NonNull;

/* JADX INFO: renamed from: v7.i */
/* JADX INFO: loaded from: classes.dex */
public final class C12046i {

    /* JADX INFO: renamed from: a */
    public final boolean f42612a;

    /* JADX INFO: renamed from: b */
    public final boolean f42613b;

    /* JADX INFO: renamed from: v7.i$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public boolean f42614a;

        /* JADX INFO: renamed from: b */
        public boolean f42615b;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public a() {
        }

        @NonNull
        /* JADX INFO: renamed from: a */
        public C12046i m44863a() {
            if (!this.f42614a) {
                throw new IllegalArgumentException("Pending purchases for one-time products must be supported.");
            }
            return new C12046i(true, this.f42615b);
        }

        @NonNull
        /* JADX INFO: renamed from: b */
        public a m44864b() {
            this.f42614a = true;
            return this;
        }

        @NonNull
        /* JADX INFO: renamed from: c */
        public a m44865c() {
            this.f42615b = true;
            return this;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C12046i(boolean z10, boolean z11) {
        this.f42612a = z10;
        this.f42613b = z11;
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static a m44860c() {
        return new a();
    }

    /* JADX INFO: renamed from: a */
    public boolean m44861a() {
        return this.f42612a;
    }

    /* JADX INFO: renamed from: b */
    public boolean m44862b() {
        return this.f42613b;
    }
}
