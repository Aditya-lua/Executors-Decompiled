package uh;

/* JADX INFO: loaded from: classes2.dex */
public abstract class z0 extends dh.a<Integer> {
    public z0() {
        super("rbx.game.orientation");
    }

    public static boolean j() {
        return true;
    }

    @Override // dh.a
    public long f() {
        return rh.h.a().n();
    }

    @Override // dh.a
    public int g() {
        return 3;
    }

    public abstract void h(int i10);

    @Override // dh.a
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void a(Integer num) {
        h(num.intValue());
    }
}
