package p517wh;

import p103eh.AbstractRunnableC5113a;
import th.C11659h;

/* JADX INFO: renamed from: wh.y0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC12472y0 extends AbstractRunnableC5113a<Integer> {
    public AbstractC12472y0() {
        super("rbx.game.orientation");
    }

    /* JADX INFO: renamed from: j */
    public static boolean m46723j() {
        return true;
    }

    @Override // p103eh.AbstractRunnableC5113a
    /* JADX INFO: renamed from: f */
    public long mo23866f() {
        return C11659h.m43403a().mo43687o();
    }

    @Override // p103eh.AbstractRunnableC5113a
    /* JADX INFO: renamed from: g */
    public int mo23867g() {
        return 3;
    }

    /* JADX INFO: renamed from: h */
    public abstract void mo15215h(int i10);

    /* JADX DEBUG: Method merged with bridge method: a(Ljava/lang/Object;)V */
    @Override // p103eh.AbstractRunnableC5113a
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void mo23861a(Integer num) {
        mo15215h(num.intValue());
    }
}
