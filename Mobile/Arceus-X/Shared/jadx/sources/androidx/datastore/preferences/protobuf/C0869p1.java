package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.p1 */
/* JADX INFO: loaded from: classes.dex */
public class C0869p1 extends AbstractC0863n1<C0866o1, C0866o1> {
    /* JADX DEBUG: Method merged with bridge method: g(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // androidx.datastore.preferences.protobuf.AbstractC0863n1
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public C0866o1 mo3897g(Object obj) {
        return ((AbstractC0888x) obj).unknownFields;
    }

    /* JADX DEBUG: Method merged with bridge method: h(Ljava/lang/Object;)I */
    @Override // androidx.datastore.preferences.protobuf.AbstractC0863n1
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public int mo3898h(C0866o1 c0866o1) {
        return c0866o1.m3926d();
    }

    /* JADX DEBUG: Method merged with bridge method: i(Ljava/lang/Object;)I */
    @Override // androidx.datastore.preferences.protobuf.AbstractC0863n1
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public int mo3899i(C0866o1 c0866o1) {
        return c0866o1.m3927e();
    }

    /* JADX DEBUG: Method merged with bridge method: k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // androidx.datastore.preferences.protobuf.AbstractC0863n1
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public C0866o1 mo3901k(C0866o1 c0866o1, C0866o1 c0866o2) {
        if (C0866o1.m3916c().equals(c0866o2)) {
            return c0866o1;
        }
        return C0866o1.m3916c().equals(c0866o1) ? C0866o1.m3919j(c0866o1, c0866o2) : c0866o1.m3929i(c0866o2);
    }

    /* JADX DEBUG: Method merged with bridge method: n()Ljava/lang/Object; */
    @Override // androidx.datastore.preferences.protobuf.AbstractC0863n1
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public C0866o1 mo3904n() {
        return C0866o1.m3920k();
    }

    /* JADX DEBUG: Method merged with bridge method: o(Ljava/lang/Object;Ljava/lang/Object;)V */
    @Override // androidx.datastore.preferences.protobuf.AbstractC0863n1
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void mo3905o(Object obj, C0866o1 c0866o1) {
        mo3906p(obj, c0866o1);
    }

    /* JADX DEBUG: Method merged with bridge method: p(Ljava/lang/Object;Ljava/lang/Object;)V */
    @Override // androidx.datastore.preferences.protobuf.AbstractC0863n1
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void mo3906p(Object obj, C0866o1 c0866o1) {
        ((AbstractC0888x) obj).unknownFields = c0866o1;
    }

    /* JADX DEBUG: Method merged with bridge method: r(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // androidx.datastore.preferences.protobuf.AbstractC0863n1
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public C0866o1 mo3908r(C0866o1 c0866o1) {
        c0866o1.m3928h();
        return c0866o1;
    }

    /* JADX DEBUG: Method merged with bridge method: s(Ljava/lang/Object;Landroidx/datastore/preferences/protobuf/t1;)V */
    @Override // androidx.datastore.preferences.protobuf.AbstractC0863n1
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void mo3909s(C0866o1 c0866o1, InterfaceC0881t1 interfaceC0881t1) {
        c0866o1.m3932p(interfaceC0881t1);
    }

    /* JADX DEBUG: Method merged with bridge method: t(Ljava/lang/Object;Landroidx/datastore/preferences/protobuf/t1;)V */
    @Override // androidx.datastore.preferences.protobuf.AbstractC0863n1
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void mo3910t(C0866o1 c0866o1, InterfaceC0881t1 interfaceC0881t1) {
        c0866o1.m3933r(interfaceC0881t1);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0863n1
    /* JADX INFO: renamed from: j */
    public void mo3900j(Object obj) {
        mo3897g(obj).m3928h();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0863n1
    /* JADX INFO: renamed from: q */
    public boolean mo3907q(InterfaceC0839f1 interfaceC0839f1) {
        return false;
    }

    /* JADX DEBUG: Method merged with bridge method: a(Ljava/lang/Object;II)V */
    @Override // androidx.datastore.preferences.protobuf.AbstractC0863n1
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public void mo3891a(C0866o1 c0866o1, int i10, int i11) {
        c0866o1.m3931n(C0878s1.m4060c(i10, 5), Integer.valueOf(i11));
    }

    /* JADX DEBUG: Method merged with bridge method: b(Ljava/lang/Object;IJ)V */
    @Override // androidx.datastore.preferences.protobuf.AbstractC0863n1
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public void mo3892b(C0866o1 c0866o1, int i10, long j10) {
        c0866o1.m3931n(C0878s1.m4060c(i10, 1), Long.valueOf(j10));
    }

    /* JADX DEBUG: Method merged with bridge method: c(Ljava/lang/Object;ILjava/lang/Object;)V */
    @Override // androidx.datastore.preferences.protobuf.AbstractC0863n1
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public void mo3893c(C0866o1 c0866o1, int i10, C0866o1 c0866o2) {
        c0866o1.m3931n(C0878s1.m4060c(i10, 3), c0866o2);
    }

    /* JADX DEBUG: Method merged with bridge method: d(Ljava/lang/Object;ILandroidx/datastore/preferences/protobuf/g;)V */
    @Override // androidx.datastore.preferences.protobuf.AbstractC0863n1
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void mo3894d(C0866o1 c0866o1, int i10, AbstractC0840g abstractC0840g) {
        c0866o1.m3931n(C0878s1.m4060c(i10, 2), abstractC0840g);
    }

    /* JADX DEBUG: Method merged with bridge method: e(Ljava/lang/Object;IJ)V */
    @Override // androidx.datastore.preferences.protobuf.AbstractC0863n1
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public void mo3895e(C0866o1 c0866o1, int i10, long j10) {
        c0866o1.m3931n(C0878s1.m4060c(i10, 0), Long.valueOf(j10));
    }

    /* JADX DEBUG: Method merged with bridge method: f(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // androidx.datastore.preferences.protobuf.AbstractC0863n1
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public C0866o1 mo3896f(Object obj) {
        C0866o1 c0866o1Mo3897g = mo3897g(obj);
        if (c0866o1Mo3897g != C0866o1.m3916c()) {
            return c0866o1Mo3897g;
        }
        C0866o1 c0866o1M3920k = C0866o1.m3920k();
        mo3906p(obj, c0866o1M3920k);
        return c0866o1M3920k;
    }
}
