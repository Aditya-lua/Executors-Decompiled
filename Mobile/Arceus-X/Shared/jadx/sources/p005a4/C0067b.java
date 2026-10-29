package p005a4;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: a4.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0067b extends C0068c {
    /* JADX INFO: renamed from: h */
    public static C0067b m160h(ByteBuffer byteBuffer) {
        return m161i(byteBuffer, new C0067b());
    }

    /* JADX INFO: renamed from: i */
    public static C0067b m161i(ByteBuffer byteBuffer, C0067b c0067b) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return c0067b.m162f(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    /* JADX INFO: renamed from: f */
    public C0067b m162f(int i10, ByteBuffer byteBuffer) {
        m163g(i10, byteBuffer);
        return this;
    }

    /* JADX INFO: renamed from: g */
    public void m163g(int i10, ByteBuffer byteBuffer) {
        m169c(i10, byteBuffer);
    }

    /* JADX INFO: renamed from: j */
    public C0066a m164j(C0066a c0066a, int i10) {
        int iM168b = m168b(6);
        if (iM168b != 0) {
            return c0066a.m151f(m167a(m170d(iM168b) + (i10 * 4)), this.f141b);
        }
        return null;
    }

    /* JADX INFO: renamed from: k */
    public int m165k() {
        int iM168b = m168b(6);
        if (iM168b != 0) {
            return m171e(iM168b);
        }
        return 0;
    }

    /* JADX INFO: renamed from: l */
    public int m166l() {
        int iM168b = m168b(4);
        if (iM168b != 0) {
            return this.f141b.getInt(iM168b + this.f140a);
        }
        return 0;
    }
}
