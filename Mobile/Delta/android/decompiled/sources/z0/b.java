package z0;

import android.graphics.Rect;
import android.util.Size;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class b extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f37014a;
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f37015c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f37016d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Size f37017e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f37018f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f37019g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f37020h;

    public b(UUID uuid, int i10, int i11, Rect rect, Size size, int i12, boolean z10, boolean z11) {
        if (uuid == null) {
            throw new NullPointerException("Null getUuid");
        }
        this.f37014a = uuid;
        this.b = i10;
        this.f37015c = i11;
        if (rect == null) {
            throw new NullPointerException("Null getCropRect");
        }
        this.f37016d = rect;
        if (size == null) {
            throw new NullPointerException("Null getSize");
        }
        this.f37017e = size;
        this.f37018f = i12;
        this.f37019g = z10;
        this.f37020h = z11;
    }

    @Override // z0.f
    public Rect a() {
        return this.f37016d;
    }

    @Override // z0.f
    public int b() {
        return this.f37015c;
    }

    @Override // z0.f
    public int c() {
        return this.f37018f;
    }

    @Override // z0.f
    public Size d() {
        return this.f37017e;
    }

    @Override // z0.f
    public int e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (this.f37014a.equals(fVar.f()) && this.b == fVar.e() && this.f37015c == fVar.b() && this.f37016d.equals(fVar.a()) && this.f37017e.equals(fVar.d()) && this.f37018f == fVar.c() && this.f37019g == fVar.g() && this.f37020h == fVar.k()) {
                return true;
            }
        }
        return false;
    }

    @Override // z0.f
    public UUID f() {
        return this.f37014a;
    }

    @Override // z0.f
    public boolean g() {
        return this.f37019g;
    }

    public int hashCode() {
        return ((((((((((((((this.f37014a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.f37015c) * 1000003) ^ this.f37016d.hashCode()) * 1000003) ^ this.f37017e.hashCode()) * 1000003) ^ this.f37018f) * 1000003) ^ (this.f37019g ? 1231 : 1237)) * 1000003) ^ (this.f37020h ? 1231 : 1237);
    }

    @Override // z0.f
    public boolean k() {
        return this.f37020h;
    }

    public String toString() {
        return "OutConfig{getUuid=" + this.f37014a + ", getTargets=" + this.b + ", getFormat=" + this.f37015c + ", getCropRect=" + this.f37016d + ", getSize=" + this.f37017e + ", getRotationDegrees=" + this.f37018f + ", isMirroring=" + this.f37019g + ", shouldRespectInputCropRect=" + this.f37020h + "}";
    }
}
