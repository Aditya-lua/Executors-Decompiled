package b0;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class l extends k {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final OutputConfiguration f3520a;
        public long b = 1;

        public a(OutputConfiguration outputConfiguration) {
            this.f3520a = outputConfiguration;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Objects.equals(this.f3520a, aVar.f3520a) && this.b == aVar.b;
        }

        public int hashCode() {
            int iHashCode = this.f3520a.hashCode() ^ 31;
            return Long.hashCode(this.b) ^ ((iHashCode << 5) - iHashCode);
        }
    }

    public l(int i10, Surface surface) {
        this(new a(new OutputConfiguration(i10, surface)));
    }

    public static l j(OutputConfiguration outputConfiguration) {
        return new l(new a(outputConfiguration));
    }

    @Override // b0.k, b0.i.a
    public void c(long j10) {
        ((a) this.f3521a).b = j10;
    }

    @Override // b0.k, b0.i.a
    public void d(String str) {
        ((OutputConfiguration) h()).setPhysicalCameraId(str);
    }

    @Override // b0.k, b0.i.a
    public String e() {
        return null;
    }

    @Override // b0.k, b0.j, b0.i.a
    public Object h() {
        x2.g.a(this.f3521a instanceof a);
        return ((a) this.f3521a).f3520a;
    }

    public l(Object obj) {
        super(obj);
    }
}
