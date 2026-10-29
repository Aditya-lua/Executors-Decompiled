package n7;

/* JADX INFO: loaded from: classes3.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f25161a;
    public final m7.h b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m7.d f25162c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f25163d;

    public enum a {
        MASK_MODE_ADD,
        MASK_MODE_SUBTRACT,
        MASK_MODE_INTERSECT,
        MASK_MODE_NONE
    }

    public i(a aVar, m7.h hVar, m7.d dVar, boolean z10) {
        this.f25161a = aVar;
        this.b = hVar;
        this.f25162c = dVar;
        this.f25163d = z10;
    }

    public a a() {
        return this.f25161a;
    }

    public m7.h b() {
        return this.b;
    }

    public m7.d c() {
        return this.f25162c;
    }

    public boolean d() {
        return this.f25163d;
    }
}
