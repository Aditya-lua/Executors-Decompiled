package p009a8;

import androidx.annotation.NonNull;
import java.util.List;

/* JADX INFO: renamed from: a8.m */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0095m {

    /* JADX INFO: renamed from: a8.m$a */
    public static abstract class a {
        @NonNull
        /* JADX INFO: renamed from: a */
        public abstract AbstractC0095m mo267a();

        @NonNull
        /* JADX INFO: renamed from: b */
        public abstract a mo268b(AbstractC0093k abstractC0093k);

        @NonNull
        /* JADX INFO: renamed from: c */
        public abstract a mo269c(List<AbstractC0094l> list);

        @NonNull
        /* JADX INFO: renamed from: d */
        public abstract a mo270d(Integer num);

        @NonNull
        /* JADX INFO: renamed from: e */
        public abstract a mo271e(String str);

        @NonNull
        /* JADX INFO: renamed from: f */
        public abstract a mo272f(EnumC0098p enumC0098p);

        @NonNull
        /* JADX INFO: renamed from: g */
        public abstract a mo273g(long j10);

        @NonNull
        /* JADX INFO: renamed from: h */
        public abstract a mo274h(long j10);

        @NonNull
        /* JADX INFO: renamed from: i */
        public a m288i(int i10) {
            return mo270d(Integer.valueOf(i10));
        }

        @NonNull
        /* JADX INFO: renamed from: j */
        public a m289j(@NonNull String str) {
            return mo271e(str);
        }
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static a m287a() {
        return new C0089g.b();
    }

    /* JADX INFO: renamed from: b */
    public abstract AbstractC0093k mo260b();

    /* JADX INFO: renamed from: c */
    public abstract List<AbstractC0094l> mo261c();

    /* JADX INFO: renamed from: d */
    public abstract Integer mo262d();

    /* JADX INFO: renamed from: e */
    public abstract String mo263e();

    /* JADX INFO: renamed from: f */
    public abstract EnumC0098p mo264f();

    /* JADX INFO: renamed from: g */
    public abstract long mo265g();

    /* JADX INFO: renamed from: h */
    public abstract long mo266h();
}
