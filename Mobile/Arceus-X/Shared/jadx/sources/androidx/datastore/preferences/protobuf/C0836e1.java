package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.e1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0836e1 implements InterfaceC0868p0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0874r0 f2850a;

    /* JADX INFO: renamed from: b */
    public final String f2851b;

    /* JADX INFO: renamed from: c */
    public final Object[] f2852c;

    /* JADX INFO: renamed from: d */
    public final int f2853d;

    public C0836e1(InterfaceC0874r0 interfaceC0874r0, String str, Object[] objArr) {
        this.f2850a = interfaceC0874r0;
        this.f2851b = str;
        this.f2852c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f2853d = cCharAt;
            return;
        }
        int i10 = cCharAt & 8191;
        int i11 = 13;
        int i12 = 1;
        while (true) {
            int i13 = i12 + 1;
            char cCharAt2 = str.charAt(i12);
            if (cCharAt2 < 55296) {
                this.f2853d = i10 | (cCharAt2 << i11);
                return;
            } else {
                i10 |= (cCharAt2 & 8191) << i11;
                i11 += 13;
                i12 = i13;
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0868p0
    /* JADX INFO: renamed from: a */
    public boolean mo3387a() {
        return (this.f2853d & 2) == 2;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0868p0
    /* JADX INFO: renamed from: b */
    public InterfaceC0874r0 mo3388b() {
        return this.f2850a;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0868p0
    /* JADX INFO: renamed from: c */
    public EnumC0827b1 mo3389c() {
        int i10 = this.f2853d;
        if ((i10 & 1) != 0) {
            return EnumC0827b1.PROTO2;
        }
        return (i10 & 4) == 4 ? EnumC0827b1.EDITIONS : EnumC0827b1.PROTO3;
    }

    /* JADX INFO: renamed from: d */
    public Object[] m3390d() {
        return this.f2852c;
    }

    /* JADX INFO: renamed from: e */
    public String m3391e() {
        return this.f2851b;
    }
}
