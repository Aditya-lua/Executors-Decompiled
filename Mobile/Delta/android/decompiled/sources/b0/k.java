package b0;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class k extends j {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final OutputConfiguration f3665a;
        public String b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f3666c = 1;

        public a(OutputConfiguration outputConfiguration) {
            this.f3665a = outputConfiguration;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Objects.equals(this.f3665a, aVar.f3665a) && this.f3666c == aVar.f3666c && Objects.equals(this.b, aVar.b);
        }

        public int hashCode() {
            int iHashCode = this.f3665a.hashCode() ^ 31;
            int i10 = (iHashCode << 5) - iHashCode;
            String str = this.b;
            int iHashCode2 = (str == null ? 0 : str.hashCode()) ^ i10;
            return Long.hashCode(this.f3666c) ^ ((iHashCode2 << 5) - iHashCode2);
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
        ((a) this.f3668a).f3666c = j10;
    }

    @Override // b0.i.a
    public void d(String str) {
        ((a) this.f3668a).b = str;
    }

    @Override // b0.i.a
    public String e() {
        return ((a) this.f3668a).b;
    }

    @Override // b0.i.a
    public void f() {
        ((OutputConfiguration) h()).enableSurfaceSharing();
    }

    @Override // b0.j, b0.i.a
    public Object h() {
        x2.g.a(this.f3668a instanceof a);
        return ((a) this.f3668a).f3665a;
    }

    public k(Object obj) {
        super(obj);
    }
}
