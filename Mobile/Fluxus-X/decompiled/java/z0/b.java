package z0;

import android.graphics.Rect;
import android.util.Size;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class b extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f38814a;
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f38815c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f38816d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Size f38817e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f38818f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f38819g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f38820h;

    public b(UUID uuid, int i10, int i11, Rect rect, Size size, int i12, boolean z10, boolean z11) {
        if (uuid == null) {
            throw new NullPointerException("Null getUuid");
        }
        this.f38814a = uuid;
        this.b = i10;
        this.f38815c = i11;
        if (rect == null) {
            throw new NullPointerException("Null getCropRect");
        }
        this.f38816d = rect;
        if (size == null) {
            throw new NullPointerException("Null getSize");
        }
        this.f38817e = size;
        this.f38818f = i12;
        this.f38819g = z10;
        this.f38820h = z11;
    }

    @Override // z0.f
    public Rect a() {
        return this.f38816d;
    }

    @Override // z0.f
    public int b() {
        return this.f38815c;
    }

    @Override // z0.f
    public int c() {
        return this.f38818f;
    }

    @Override // z0.f
    public Size d() {
        return this.f38817e;
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
            if (this.f38814a.equals(fVar.f()) && this.b == fVar.e() && this.f38815c == fVar.b() && this.f38816d.equals(fVar.a()) && this.f38817e.equals(fVar.d()) && this.f38818f == fVar.c() && this.f38819g == fVar.g() && this.f38820h == fVar.k()) {
                return true;
            }
        }
        return false;
    }

    @Override // z0.f
    public UUID f() {
        return this.f38814a;
    }

    @Override // z0.f
    public boolean g() {
        return this.f38819g;
    }

    public int hashCode() {
        return ((((((((((((((this.f38814a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.f38815c) * 1000003) ^ this.f38816d.hashCode()) * 1000003) ^ this.f38817e.hashCode()) * 1000003) ^ this.f38818f) * 1000003) ^ (this.f38819g ? 1231 : 1237)) * 1000003) ^ (this.f38820h ? 1231 : 1237);
    }

    @Override // z0.f
    public boolean k() {
        return this.f38820h;
    }

    public String toString() {
        return "OutConfig{getUuid=" + this.f38814a + ", getTargets=" + this.b + ", getFormat=" + this.f38815c + ", getCropRect=" + this.f38816d + ", getSize=" + this.f38817e + ", getRotationDegrees=" + this.f38818f + ", isMirroring=" + this.f38819g + ", shouldRespectInputCropRect=" + this.f38820h + "}";
    }
}
