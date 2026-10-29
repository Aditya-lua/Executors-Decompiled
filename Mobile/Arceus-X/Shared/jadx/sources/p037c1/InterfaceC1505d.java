package p037c1;

import android.hardware.camera2.params.SessionConfiguration;

/* JADX INFO: renamed from: c1.d */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1505d {

    /* JADX INFO: renamed from: c1.d$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final int f5781a;

        /* JADX INFO: renamed from: b */
        public final int f5782b;

        /* JADX INFO: renamed from: c */
        public final long f5783c;

        public a(int i10, int i11, long j10) {
            this.f5781a = i10;
            this.f5782b = i11;
            this.f5783c = j10;
        }

        /* JADX INFO: renamed from: a */
        public int m7659a() {
            return this.f5781a;
        }
    }

    /* JADX INFO: renamed from: a */
    a mo7656a(SessionConfiguration sessionConfiguration);
}
