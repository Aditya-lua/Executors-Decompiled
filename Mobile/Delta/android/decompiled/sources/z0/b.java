package z0;

import android.graphics.Rect;
import android.util.Size;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class b extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f37709a;
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f37710c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f37711d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Size f37712e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f37713f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f37714g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f37715h;

    public b(UUID uuid, int i10, int i11, Rect rect, Size size, int i12, boolean z10, boolean z11) {
        if (uuid == null) {
            throw new NullPointerException("Null getUuid");
        }
        this.f37709a = uuid;
        this.b = i10;
        this.f37710c = i11;
        if (rect == null) {
            throw new NullPointerException("Null getCropRect");
        }
        this.f37711d = rect;
        if (size == null) {
            throw new NullPointerException("Null getSize");
        }
        this.f37712e = size;
        this.f37713f = i12;
        this.f37714g = z10;
        this.f37715h = z11;
    }

    @Override // z0.f
    public Rect a() {
        return this.f37711d;
    }

    @Override // z0.f
    public int b() {
        return this.f37710c;
    }

    @Override // z0.f
    public int c() {
        return this.f37713f;
    }

    @Override // z0.f
    public Size d() {
        return this.f37712e;
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
            if (this.f37709a.equals(fVar.f()) && this.b == fVar.e() && this.f37710c == fVar.b() && this.f37711d.equals(fVar.a()) && this.f37712e.equals(fVar.d()) && this.f37713f == fVar.c() && this.f37714g == fVar.g() && this.f37715h == fVar.k()) {
                return true;
            }
        }
        return false;
    }

    @Override // z0.f
    public UUID f() {
        return this.f37709a;
    }

    @Override // z0.f
    public boolean g() {
        return this.f37714g;
    }

    public int hashCode() {
        return ((((((((((((((this.f37709a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.f37710c) * 1000003) ^ this.f37711d.hashCode()) * 1000003) ^ this.f37712e.hashCode()) * 1000003) ^ this.f37713f) * 1000003) ^ (this.f37714g ? 1231 : 1237)) * 1000003) ^ (this.f37715h ? 1231 : 1237);
    }

    @Override // z0.f
    public boolean k() {
        return this.f37715h;
    }

    public String toString() {
        return "OutConfig{getUuid=" + this.f37709a + ", getTargets=" + this.b + ", getFormat=" + this.f37710c + ", getCropRect=" + this.f37711d + ", getSize=" + this.f37712e + ", getRotationDegrees=" + this.f37713f + ", isMirroring=" + this.f37714g + ", shouldRespectInputCropRect=" + this.f37715h + "}";
    }
}
