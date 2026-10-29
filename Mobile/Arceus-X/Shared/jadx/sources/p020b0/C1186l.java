package p020b0;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import java.util.Objects;
import p533x2.C12637g;

/* JADX INFO: renamed from: b0.l */
/* JADX INFO: loaded from: classes.dex */
public class C1186l extends C1185k {

    /* JADX INFO: renamed from: b0.l$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final OutputConfiguration f4932a;

        /* JADX INFO: renamed from: b */
        public long f4933b = 1;

        public a(OutputConfiguration outputConfiguration) {
            this.f4932a = outputConfiguration;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Objects.equals(this.f4932a, aVar.f4932a) && this.f4933b == aVar.f4933b;
        }

        public int hashCode() {
            int iHashCode = this.f4932a.hashCode() ^ 31;
            return Long.hashCode(this.f4933b) ^ ((iHashCode << 5) - iHashCode);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1186l(int i10, Surface surface) {
        this(new a(new OutputConfiguration(i10, surface)));
    }

    /* JADX INFO: renamed from: j */
    public static C1186l m6575j(OutputConfiguration outputConfiguration) {
        return new C1186l(new a(outputConfiguration));
    }

    @Override // p020b0.C1185k, p020b0.C1183i.a
    /* JADX INFO: renamed from: c */
    public void mo6568c(long j10) {
        ((a) this.f4934a).f4933b = j10;
    }

    @Override // p020b0.C1185k, p020b0.C1183i.a
    /* JADX INFO: renamed from: d */
    public void mo6569d(String str) {
        ((OutputConfiguration) mo6573h()).setPhysicalCameraId(str);
    }

    @Override // p020b0.C1185k, p020b0.C1183i.a
    /* JADX INFO: renamed from: e */
    public String mo6570e() {
        return null;
    }

    @Override // p020b0.C1185k, p020b0.C1184j, p020b0.C1183i.a
    /* JADX INFO: renamed from: h */
    public Object mo6573h() {
        C12637g.m47069a(this.f4934a instanceof a);
        return ((a) this.f4934a).f4932a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C1186l(Object obj) {
        super(obj);
    }
}
