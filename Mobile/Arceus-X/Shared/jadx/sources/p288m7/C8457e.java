package p288m7;

import android.graphics.PointF;
import java.util.List;
import p189i7.AbstractC6643a;
import p189i7.C6652j;
import p189i7.C6653k;
import p444t7.C11550a;

/* JADX INFO: renamed from: m7.e */
/* JADX INFO: loaded from: classes3.dex */
public class C8457e implements InterfaceC8467o<PointF, PointF> {

    /* JADX INFO: renamed from: a */
    public final List<C11550a<PointF>> f31155a;

    public C8457e(List<C11550a<PointF>> list) {
        this.f31155a = list;
    }

    @Override // p288m7.InterfaceC8467o
    /* JADX INFO: renamed from: a */
    public AbstractC6643a<PointF, PointF> mo34233a() {
        return this.f31155a.get(0).m43186i() ? new C6653k(this.f31155a) : new C6652j(this.f31155a);
    }

    @Override // p288m7.InterfaceC8467o
    /* JADX INFO: renamed from: b */
    public List<C11550a<PointF>> mo34234b() {
        return this.f31155a;
    }

    @Override // p288m7.InterfaceC8467o
    /* JADX INFO: renamed from: c */
    public boolean mo34235c() {
        return this.f31155a.size() == 1 && this.f31155a.get(0).m43186i();
    }
}
