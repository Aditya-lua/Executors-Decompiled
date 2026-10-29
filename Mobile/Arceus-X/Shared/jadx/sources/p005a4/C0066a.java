package p005a4;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: a4.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0066a extends C0068c {
    /* JADX INFO: renamed from: f */
    public C0066a m151f(int i10, ByteBuffer byteBuffer) {
        m152g(i10, byteBuffer);
        return this;
    }

    /* JADX INFO: renamed from: g */
    public void m152g(int i10, ByteBuffer byteBuffer) {
        m169c(i10, byteBuffer);
    }

    /* JADX INFO: renamed from: h */
    public int m153h(int i10) {
        int iM168b = m168b(16);
        if (iM168b != 0) {
            return this.f141b.getInt(m170d(iM168b) + (i10 * 4));
        }
        return 0;
    }

    /* JADX INFO: renamed from: i */
    public int m154i() {
        int iM168b = m168b(16);
        if (iM168b != 0) {
            return m171e(iM168b);
        }
        return 0;
    }

    /* JADX INFO: renamed from: j */
    public boolean m155j() {
        int iM168b = m168b(6);
        return (iM168b == 0 || this.f141b.get(iM168b + this.f140a) == 0) ? false : true;
    }

    /* JADX INFO: renamed from: k */
    public short m156k() {
        int iM168b = m168b(14);
        if (iM168b != 0) {
            return this.f141b.getShort(iM168b + this.f140a);
        }
        return (short) 0;
    }

    /* JADX INFO: renamed from: l */
    public int m157l() {
        int iM168b = m168b(4);
        if (iM168b != 0) {
            return this.f141b.getInt(iM168b + this.f140a);
        }
        return 0;
    }

    /* JADX INFO: renamed from: m */
    public short m158m() {
        int iM168b = m168b(8);
        if (iM168b != 0) {
            return this.f141b.getShort(iM168b + this.f140a);
        }
        return (short) 0;
    }

    /* JADX INFO: renamed from: n */
    public short m159n() {
        int iM168b = m168b(12);
        if (iM168b != 0) {
            return this.f141b.getShort(iM168b + this.f140a);
        }
        return (short) 0;
    }
}
