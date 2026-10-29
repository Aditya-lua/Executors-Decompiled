package p288m7;

import android.graphics.PointF;
import java.util.List;
import p189i7.AbstractC6643a;
import p189i7.C6656n;
import p444t7.C11550a;

/* JADX INFO: renamed from: m7.i */
/* JADX INFO: loaded from: classes3.dex */
public class C8461i implements InterfaceC8467o<PointF, PointF> {

    /* JADX INFO: renamed from: a */
    public final C8454b f31156a;

    /* JADX INFO: renamed from: b */
    public final C8454b f31157b;

    public C8461i(C8454b c8454b, C8454b c8454b2) {
        this.f31156a = c8454b;
        this.f31157b = c8454b2;
    }

    @Override // p288m7.InterfaceC8467o
    /* JADX INFO: renamed from: a */
    public AbstractC6643a<PointF, PointF> mo34233a() {
        return new C6656n(this.f31156a.mo34233a(), this.f31157b.mo34233a());
    }

    @Override // p288m7.InterfaceC8467o
    /* JADX INFO: renamed from: b */
    public List<C11550a<PointF>> mo34234b() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    @Override // p288m7.InterfaceC8467o
    /* JADX INFO: renamed from: c */
    public boolean mo34235c() {
        return this.f31156a.mo34235c() && this.f31157b.mo34235c();
    }
}
