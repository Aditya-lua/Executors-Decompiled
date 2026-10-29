package p020b0;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import java.util.Objects;
import p533x2.C12637g;

/* JADX INFO: renamed from: b0.k */
/* JADX INFO: loaded from: classes.dex */
public class C1185k extends C1184j {

    /* JADX INFO: renamed from: b0.k$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final OutputConfiguration f4929a;

        /* JADX INFO: renamed from: b */
        public String f4930b;

        /* JADX INFO: renamed from: c */
        public long f4931c = 1;

        public a(OutputConfiguration outputConfiguration) {
            this.f4929a = outputConfiguration;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Objects.equals(this.f4929a, aVar.f4929a) && this.f4931c == aVar.f4931c && Objects.equals(this.f4930b, aVar.f4930b);
        }

        public int hashCode() {
            int iHashCode = this.f4929a.hashCode() ^ 31;
            int i10 = (iHashCode << 5) - iHashCode;
            String str = this.f4930b;
            int iHashCode2 = (str == null ? 0 : str.hashCode()) ^ i10;
            return Long.hashCode(this.f4931c) ^ ((iHashCode2 << 5) - iHashCode2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1185k(int i10, Surface surface) {
        this(new a(new OutputConfiguration(i10, surface)));
    }

    /* JADX INFO: renamed from: i */
    public static C1185k m6574i(OutputConfiguration outputConfiguration) {
        return new C1185k(new a(outputConfiguration));
    }

    @Override // p020b0.C1183i.a
    /* JADX INFO: renamed from: b */
    public void mo6567b(Surface surface) {
        ((OutputConfiguration) mo6573h()).addSurface(surface);
    }

    @Override // p020b0.C1183i.a
    /* JADX INFO: renamed from: c */
    public void mo6568c(long j10) {
        ((a) this.f4934a).f4931c = j10;
    }

    @Override // p020b0.C1183i.a
    /* JADX INFO: renamed from: d */
    public void mo6569d(String str) {
        ((a) this.f4934a).f4930b = str;
    }

    @Override // p020b0.C1183i.a
    /* JADX INFO: renamed from: e */
    public String mo6570e() {
        return ((a) this.f4934a).f4930b;
    }

    @Override // p020b0.C1183i.a
    /* JADX INFO: renamed from: f */
    public void mo6571f() {
        ((OutputConfiguration) mo6573h()).enableSurfaceSharing();
    }

    @Override // p020b0.C1184j, p020b0.C1183i.a
    /* JADX INFO: renamed from: h */
    public Object mo6573h() {
        C12637g.m47069a(this.f4934a instanceof a);
        return ((a) this.f4934a).f4929a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C1185k(Object obj) {
        super(obj);
    }
}
