package p312nn;

import java.util.List;
import p388qn.C10604b0;
import p472un.InterfaceC11893b;

/* JADX INFO: renamed from: nn.g */
/* JADX INFO: loaded from: classes3.dex */
public class C9505g implements InterfaceC11893b {

    /* JADX INFO: renamed from: a */
    public final List<C10604b0> f34202a;

    /* JADX INFO: renamed from: b */
    public final char f34203b;

    /* JADX INFO: renamed from: c */
    public final int f34204c;

    /* JADX INFO: renamed from: d */
    public final boolean f34205d;

    /* JADX INFO: renamed from: e */
    public final boolean f34206e;

    /* JADX INFO: renamed from: f */
    public C9505g f34207f;

    /* JADX INFO: renamed from: g */
    public C9505g f34208g;

    public C9505g(List<C10604b0> list, char c10, boolean z10, boolean z11, C9505g c9505g) {
        this.f34202a = list;
        this.f34203b = c10;
        this.f34205d = z10;
        this.f34206e = z11;
        this.f34207f = c9505g;
        this.f34204c = list.size();
    }

    @Override // p472un.InterfaceC11893b
    /* JADX INFO: renamed from: a */
    public Iterable<C10604b0> mo37475a(int i10) {
        if (i10 >= 1 && i10 <= length()) {
            List<C10604b0> list = this.f34202a;
            return list.subList(list.size() - i10, this.f34202a.size());
        }
        throw new IllegalArgumentException("length must be between 1 and " + length() + ", was " + i10);
    }

    @Override // p472un.InterfaceC11893b
    /* JADX INFO: renamed from: b */
    public C10604b0 mo37476b() {
        return this.f34202a.get(0);
    }

    @Override // p472un.InterfaceC11893b
    /* JADX INFO: renamed from: c */
    public boolean mo37477c() {
        return this.f34206e;
    }

    @Override // p472un.InterfaceC11893b
    /* JADX INFO: renamed from: d */
    public C10604b0 mo37478d() {
        List<C10604b0> list = this.f34202a;
        return list.get(list.size() - 1);
    }

    @Override // p472un.InterfaceC11893b
    /* JADX INFO: renamed from: e */
    public Iterable<C10604b0> mo37479e(int i10) {
        if (i10 >= 1 && i10 <= length()) {
            return this.f34202a.subList(0, i10);
        }
        throw new IllegalArgumentException("length must be between 1 and " + length() + ", was " + i10);
    }

    @Override // p472un.InterfaceC11893b
    /* JADX INFO: renamed from: f */
    public int mo37480f() {
        return this.f34204c;
    }

    @Override // p472un.InterfaceC11893b
    /* JADX INFO: renamed from: g */
    public boolean mo37481g() {
        return this.f34205d;
    }

    @Override // p472un.InterfaceC11893b
    public int length() {
        return this.f34202a.size();
    }
}
