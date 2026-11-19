package j7;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class e extends g<o7.d> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final o7.d f20107i;

    public e(List<u7.a<o7.d>> list) {
        super(list);
        int iMax = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            o7.d dVar = list.get(i10).b;
            if (dVar != null) {
                iMax = Math.max(iMax, dVar.f());
            }
        }
        this.f20107i = new o7.d(new float[iMax], new int[iMax]);
    }

    @Override // j7.a
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public o7.d i(u7.a<o7.d> aVar, float f10) {
        this.f20107i.g(aVar.b, aVar.f33237c, f10);
        return this.f20107i;
    }
}
