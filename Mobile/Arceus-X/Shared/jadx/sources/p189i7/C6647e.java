package p189i7;

import java.util.List;
import p303n7.C8898d;
import p444t7.C11550a;

/* JADX INFO: renamed from: i7.e */
/* JADX INFO: loaded from: classes3.dex */
public class C6647e extends AbstractC6649g<C8898d> {

    /* JADX INFO: renamed from: i */
    public final C8898d f25647i;

    public C6647e(List<C11550a<C8898d>> list) {
        super(list);
        int iMax = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            C8898d c8898d = list.get(i10).f40889b;
            if (c8898d != null) {
                iMax = Math.max(iMax, c8898d.m35848f());
            }
        }
        this.f25647i = new C8898d(new float[iMax], new int[iMax]);
    }

    /* JADX DEBUG: Method merged with bridge method: i(Lt7/a;F)Ljava/lang/Object; */
    @Override // p189i7.AbstractC6643a
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public C8898d mo28669i(C11550a<C8898d> c11550a, float f10) {
        this.f25647i.m35849g(c11550a.f40889b, c11550a.f40890c, f10);
        return this.f25647i;
    }
}
