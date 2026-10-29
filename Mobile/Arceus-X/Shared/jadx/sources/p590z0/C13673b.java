package p590z0;

import android.graphics.Rect;
import android.util.Size;
import java.util.UUID;

/* JADX INFO: renamed from: z0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C13673b extends AbstractC13677f {

    /* JADX INFO: renamed from: a */
    public final UUID f47934a;

    /* JADX INFO: renamed from: b */
    public final int f47935b;

    /* JADX INFO: renamed from: c */
    public final int f47936c;

    /* JADX INFO: renamed from: d */
    public final Rect f47937d;

    /* JADX INFO: renamed from: e */
    public final Size f47938e;

    /* JADX INFO: renamed from: f */
    public final int f47939f;

    /* JADX INFO: renamed from: g */
    public final boolean f47940g;

    /* JADX INFO: renamed from: h */
    public final boolean f47941h;

    public C13673b(UUID uuid, int i10, int i11, Rect rect, Size size, int i12, boolean z10, boolean z11) {
        if (uuid == null) {
            throw new NullPointerException("Null getUuid");
        }
        this.f47934a = uuid;
        this.f47935b = i10;
        this.f47936c = i11;
        if (rect == null) {
            throw new NullPointerException("Null getCropRect");
        }
        this.f47937d = rect;
        if (size == null) {
            throw new NullPointerException("Null getSize");
        }
        this.f47938e = size;
        this.f47939f = i12;
        this.f47940g = z10;
        this.f47941h = z11;
    }

    @Override // p590z0.AbstractC13677f
    /* JADX INFO: renamed from: a */
    public Rect mo49855a() {
        return this.f47937d;
    }

    @Override // p590z0.AbstractC13677f
    /* JADX INFO: renamed from: b */
    public int mo49856b() {
        return this.f47936c;
    }

    @Override // p590z0.AbstractC13677f
    /* JADX INFO: renamed from: c */
    public int mo49857c() {
        return this.f47939f;
    }

    @Override // p590z0.AbstractC13677f
    /* JADX INFO: renamed from: d */
    public Size mo49858d() {
        return this.f47938e;
    }

    @Override // p590z0.AbstractC13677f
    /* JADX INFO: renamed from: e */
    public int mo49859e() {
        return this.f47935b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC13677f) {
            AbstractC13677f abstractC13677f = (AbstractC13677f) obj;
            if (this.f47934a.equals(abstractC13677f.mo49860f()) && this.f47935b == abstractC13677f.mo49859e() && this.f47936c == abstractC13677f.mo49856b() && this.f47937d.equals(abstractC13677f.mo49855a()) && this.f47938e.equals(abstractC13677f.mo49858d()) && this.f47939f == abstractC13677f.mo49857c() && this.f47940g == abstractC13677f.mo49861g() && this.f47941h == abstractC13677f.mo49862k()) {
                return true;
            }
        }
        return false;
    }

    @Override // p590z0.AbstractC13677f
    /* JADX INFO: renamed from: f */
    public UUID mo49860f() {
        return this.f47934a;
    }

    @Override // p590z0.AbstractC13677f
    /* JADX INFO: renamed from: g */
    public boolean mo49861g() {
        return this.f47940g;
    }

    public int hashCode() {
        return ((((((((((((((this.f47934a.hashCode() ^ 1000003) * 1000003) ^ this.f47935b) * 1000003) ^ this.f47936c) * 1000003) ^ this.f47937d.hashCode()) * 1000003) ^ this.f47938e.hashCode()) * 1000003) ^ this.f47939f) * 1000003) ^ (this.f47940g ? 1231 : 1237)) * 1000003) ^ (this.f47941h ? 1231 : 1237);
    }

    @Override // p590z0.AbstractC13677f
    /* JADX INFO: renamed from: k */
    public boolean mo49862k() {
        return this.f47941h;
    }

    public String toString() {
        return "OutConfig{getUuid=" + this.f47934a + ", getTargets=" + this.f47935b + ", getFormat=" + this.f47936c + ", getCropRect=" + this.f47937d + ", getSize=" + this.f47938e + ", getRotationDegrees=" + this.f47939f + ", isMirroring=" + this.f47940g + ", shouldRespectInputCropRect=" + this.f47941h + "}";
    }
}
