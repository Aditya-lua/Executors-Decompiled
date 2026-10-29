package p009a8;

import androidx.annotation.NonNull;

/* JADX INFO: renamed from: a8.k */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0093k {

    /* JADX INFO: renamed from: a8.k$a */
    public static abstract class a {
        @NonNull
        /* JADX INFO: renamed from: a */
        public abstract AbstractC0093k mo242a();

        @NonNull
        /* JADX INFO: renamed from: b */
        public abstract a mo243b(AbstractC0083a abstractC0083a);

        @NonNull
        /* JADX INFO: renamed from: c */
        public abstract a mo244c(b bVar);
    }

    /* JADX INFO: renamed from: a8.k$b */
    public enum b {
        UNKNOWN(0),
        ANDROID_FIREBASE(23);


        /* JADX INFO: renamed from: a */
        public final int f267a;

        b(int i10) {
            this.f267a = i10;
        }
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static a m283a() {
        return new C0087e.b();
    }

    /* JADX INFO: renamed from: b */
    public abstract AbstractC0083a mo240b();

    /* JADX INFO: renamed from: c */
    public abstract b mo241c();
}
