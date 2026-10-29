package p115f1;

import android.location.Location;

/* JADX INFO: renamed from: f1.u */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5297u {

    /* JADX INFO: renamed from: a */
    public final b f20611a;

    /* JADX INFO: renamed from: f1.u$a */
    public static abstract class a<T extends AbstractC5297u, B> {

        /* JADX INFO: renamed from: a */
        public final b.a<?> f20612a;

        public a(b.a<?> aVar) {
            this.f20612a = aVar;
            aVar.mo24295b(0L);
            aVar.mo24294a(0L);
        }
    }

    /* JADX INFO: renamed from: f1.u$b */
    public static abstract class b {

        /* JADX INFO: renamed from: f1.u$b$a */
        public static abstract class a<B> {
            /* JADX INFO: renamed from: a */
            public abstract B mo24294a(long j10);

            /* JADX INFO: renamed from: b */
            public abstract B mo24295b(long j10);
        }

        /* JADX INFO: renamed from: a */
        public abstract long mo24290a();

        /* JADX INFO: renamed from: b */
        public abstract long mo24291b();

        /* JADX INFO: renamed from: c */
        public abstract Location mo24292c();
    }

    public AbstractC5297u(b bVar) {
        this.f20611a = bVar;
    }

    /* JADX INFO: renamed from: a */
    public long m24576a() {
        return this.f20611a.mo24290a();
    }

    /* JADX INFO: renamed from: b */
    public long m24577b() {
        return this.f20611a.mo24291b();
    }

    /* JADX INFO: renamed from: c */
    public Location m24578c() {
        return this.f20611a.mo24292c();
    }
}
