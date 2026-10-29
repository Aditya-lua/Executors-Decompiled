package c1;

import android.hardware.camera2.params.SessionConfiguration;

/* JADX INFO: loaded from: classes.dex */
public interface d {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f4318a;
        public final int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f4319c;

        public a(int i10, int i11, long j10) {
            this.f4318a = i10;
            this.b = i11;
            this.f4319c = j10;
        }

        public int a() {
            return this.f4318a;
        }
    }

    a a(SessionConfiguration sessionConfiguration);
}
