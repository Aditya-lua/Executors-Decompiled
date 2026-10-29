package i7;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class e extends g<n7.d> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final n7.d f20305i;

    public e(List<t7.a<n7.d>> list) {
        super(list);
        int iMax = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            n7.d dVar = list.get(i10).b;
            if (dVar != null) {
                iMax = Math.max(iMax, dVar.f());
            }
        }
        this.f20305i = new n7.d(new float[iMax], new int[iMax]);
    }

    @Override // i7.a
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public n7.d i(t7.a<n7.d> aVar, float f10) {
        this.f20305i.g(aVar.b, aVar.f31671c, f10);
        return this.f20305i;
    }
}
