package p312nn;

import java.util.List;
import java.util.Set;
import p418rn.InterfaceC10928c;
import p472un.InterfaceC11892a;
import sn.InterfaceC11418b;
import sn.InterfaceC11421e;

/* JADX INFO: renamed from: nn.q */
/* JADX INFO: loaded from: classes3.dex */
public class C9515q implements InterfaceC10928c {

    /* JADX INFO: renamed from: a */
    public final List<InterfaceC11418b> f34250a;

    /* JADX INFO: renamed from: b */
    public final List<InterfaceC11892a> f34251b;

    /* JADX INFO: renamed from: c */
    public final List<InterfaceC11421e> f34252c;

    /* JADX INFO: renamed from: d */
    public final Set<Character> f34253d;

    /* JADX INFO: renamed from: e */
    public final C9504f f34254e;

    public C9515q(List<InterfaceC11418b> list, List<InterfaceC11892a> list2, List<InterfaceC11421e> list3, Set<Character> set, C9504f c9504f) {
        this.f34250a = list;
        this.f34251b = list2;
        this.f34252c = list3;
        this.f34253d = set;
        this.f34254e = c9504f;
    }

    @Override // p418rn.InterfaceC10928c
    /* JADX INFO: renamed from: a */
    public <D> D mo37532a(Class<D> cls, String str) {
        return (D) this.f34254e.m37473b(cls, str);
    }

    @Override // p418rn.InterfaceC10928c
    /* JADX INFO: renamed from: b */
    public List<InterfaceC11421e> mo37533b() {
        return this.f34252c;
    }

    @Override // p418rn.InterfaceC10928c
    /* JADX INFO: renamed from: c */
    public List<InterfaceC11892a> mo37534c() {
        return this.f34251b;
    }

    @Override // p418rn.InterfaceC10928c
    /* JADX INFO: renamed from: d */
    public Set<Character> mo37535d() {
        return this.f34253d;
    }

    @Override // p418rn.InterfaceC10928c
    /* JADX INFO: renamed from: e */
    public List<InterfaceC11418b> mo37536e() {
        return this.f34250a;
    }
}
