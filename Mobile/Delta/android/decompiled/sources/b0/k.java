package b0;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class k extends j {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final OutputConfiguration f3767a;
        public String b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f3768c = 1;

        public a(OutputConfiguration outputConfiguration) {
            this.f3767a = outputConfiguration;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Objects.equals(this.f3767a, aVar.f3767a) && this.f3768c == aVar.f3768c && Objects.equals(this.b, aVar.b);
        }

        public int hashCode() {
            int iHashCode = this.f3767a.hashCode() ^ 31;
            int i10 = (iHashCode << 5) - iHashCode;
            String str = this.b;
            int iHashCode2 = (str == null ? 0 : str.hashCode()) ^ i10;
            return Long.hashCode(this.f3768c) ^ ((iHashCode2 << 5) - iHashCode2);
        }
    }

    public k(int i10, Surface surface) {
        this(new a(new OutputConfiguration(i10, surface)));
    }

    public static k i(OutputConfiguration outputConfiguration) {
        return new k(new a(outputConfiguration));
    }

    @Override // b0.i.a
    public void b(Surface surface) {
        ((OutputConfiguration) h()).addSurface(surface);
    }

    @Override // b0.i.a
    public void c(long j10) {
        ((a) this.f3770a).f3768c = j10;
    }

    @Override // b0.i.a
    public void d(String str) {
        ((a) this.f3770a).b = str;
    }

    @Override // b0.i.a
    public String e() {
        return ((a) this.f3770a).b;
    }

    @Override // b0.i.a
    public void f() {
        ((OutputConfiguration) h()).enableSurfaceSharing();
    }

    @Override // b0.j, b0.i.a
    public Object h() {
        x2.g.a(this.f3770a instanceof a);
        return ((a) this.f3770a).f3767a;
    }

    public k(Object obj) {
        super(obj);
    }
}
