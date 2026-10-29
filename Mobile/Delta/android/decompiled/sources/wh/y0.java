package wh;

/* JADX INFO: loaded from: classes2.dex */
public abstract class y0 extends eh.a<Integer> {
    public y0() {
        super("rbx.game.orientation");
    }

    public static boolean j() {
        return true;
    }

    @Override // eh.a
    public long f() {
        return th.h.a().m();
    }

    @Override // eh.a
    public int g() {
        return 3;
    }

    public abstract void h(int i10);

    @Override // eh.a
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void a(Integer num) {
        h(num.intValue());
    }
}
