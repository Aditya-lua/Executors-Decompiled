package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class e1 implements p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r0 f2161a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f2162c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f2163d;

    public e1(r0 r0Var, String str, Object[] objArr) {
        this.f2161a = r0Var;
        this.b = str;
        this.f2162c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f2163d = cCharAt;
            return;
        }
        int i10 = cCharAt & 8191;
        int i11 = 13;
        int i12 = 1;
        while (true) {
            int i13 = i12 + 1;
            char cCharAt2 = str.charAt(i12);
            if (cCharAt2 < 55296) {
                this.f2163d = i10 | (cCharAt2 << i11);
                return;
            } else {
                i10 |= (cCharAt2 & 8191) << i11;
                i11 += 13;
                i12 = i13;
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.p0
    public boolean a() {
        return (this.f2163d & 2) == 2;
    }

    @Override // androidx.datastore.preferences.protobuf.p0
    public r0 b() {
        return this.f2161a;
    }

    @Override // androidx.datastore.preferences.protobuf.p0
    public b1 c() {
        int i10 = this.f2163d;
        if ((i10 & 1) != 0) {
            return b1.PROTO2;
        }
        return (i10 & 4) == 4 ? b1.EDITIONS : b1.PROTO3;
    }

    public Object[] d() {
        return this.f2162c;
    }

    public String e() {
        return this.b;
    }
}
