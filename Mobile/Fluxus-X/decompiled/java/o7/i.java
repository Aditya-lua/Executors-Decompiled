package o7;

/* JADX INFO: loaded from: classes3.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f26857a;
    public final n7.h b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n7.d f26858c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f26859d;

    public enum a {
        MASK_MODE_ADD,
        MASK_MODE_SUBTRACT,
        MASK_MODE_INTERSECT,
        MASK_MODE_NONE
    }

    public i(a aVar, n7.h hVar, n7.d dVar, boolean z10) {
        this.f26857a = aVar;
        this.b = hVar;
        this.f26858c = dVar;
        this.f26859d = z10;
    }

    public a a() {
        return this.f26857a;
    }

    public n7.h b() {
        return this.b;
    }

    public n7.d c() {
        return this.f26858c;
    }

    public boolean d() {
        return this.f26859d;
    }
}
