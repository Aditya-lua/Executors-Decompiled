package p312nn;

import tn.AbstractC11712f;
import tn.InterfaceC11710d;

/* JADX INFO: renamed from: nn.d */
/* JADX INFO: loaded from: classes3.dex */
public class C9502d extends AbstractC11712f {

    /* JADX INFO: renamed from: a */
    public final InterfaceC11710d[] f34187a;

    /* JADX INFO: renamed from: b */
    public int f34188b = -1;

    /* JADX INFO: renamed from: c */
    public int f34189c = -1;

    /* JADX INFO: renamed from: d */
    public boolean f34190d = false;

    /* JADX INFO: renamed from: e */
    public int f34191e = 0;

    public C9502d(InterfaceC11710d... interfaceC11710dArr) {
        this.f34187a = interfaceC11710dArr;
    }

    @Override // tn.AbstractC11712f
    /* JADX INFO: renamed from: a */
    public AbstractC11712f mo37462a(int i10) {
        this.f34189c = i10;
        return this;
    }

    @Override // tn.AbstractC11712f
    /* JADX INFO: renamed from: b */
    public AbstractC11712f mo37463b(int i10) {
        this.f34188b = i10;
        return this;
    }

    @Override // tn.AbstractC11712f
    /* JADX INFO: renamed from: e */
    public AbstractC11712f mo37464e(int i10) {
        if (i10 < 1) {
            throw new IllegalArgumentException("Lines must be >= 1");
        }
        this.f34191e = i10;
        return this;
    }

    /* JADX INFO: renamed from: f */
    public InterfaceC11710d[] m37465f() {
        return this.f34187a;
    }

    /* JADX INFO: renamed from: g */
    public int m37466g() {
        return this.f34189c;
    }

    /* JADX INFO: renamed from: h */
    public int m37467h() {
        return this.f34188b;
    }

    /* JADX INFO: renamed from: i */
    public int m37468i() {
        return this.f34191e;
    }

    /* JADX INFO: renamed from: j */
    public boolean m37469j() {
        return this.f34190d;
    }
}
