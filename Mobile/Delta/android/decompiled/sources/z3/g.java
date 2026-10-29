package z3;

import androidx.annotation.NonNull;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes.dex */
public class g {

    public static class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        public final ByteBuffer f37139a;

        public a(@NonNull ByteBuffer byteBuffer) {
            this.f37139a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // z3.g.c
        public int a() {
            return this.f37139a.getInt();
        }

        @Override // z3.g.c
        public void b(int i10) {
            ByteBuffer byteBuffer = this.f37139a;
            byteBuffer.position(byteBuffer.position() + i10);
        }

        @Override // z3.g.c
        public long c() {
            return g.c(this.f37139a.getInt());
        }

        @Override // z3.g.c
        public long getPosition() {
            return this.f37139a.position();
        }

        @Override // z3.g.c
        public int readUnsignedShort() {
            return g.d(this.f37139a.getShort());
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f37140a;
        public final long b;

        public b(long j10, long j11) {
            this.f37140a = j10;
            this.b = j11;
        }

        public long a() {
            return this.f37140a;
        }
    }

    public interface c {
        int a();

        void b(int i10);

        long c();

        long getPosition();

        int readUnsignedShort();
    }

    public static b a(c cVar) throws IOException {
        long jC;
        cVar.b(4);
        int unsignedShort = cVar.readUnsignedShort();
        if (unsignedShort > 100) {
            throw new IOException("Cannot read metadata.");
        }
        cVar.b(6);
        int i10 = 0;
        while (true) {
            if (i10 >= unsignedShort) {
                jC = -1;
                break;
            }
            int iA = cVar.a();
            cVar.b(4);
            jC = cVar.c();
            cVar.b(4);
            if (1835365473 == iA) {
                break;
            }
            i10++;
        }
        if (jC != -1) {
            cVar.b((int) (jC - cVar.getPosition()));
            cVar.b(12);
            long jC2 = cVar.c();
            for (int i11 = 0; i11 < jC2; i11++) {
                int iA2 = cVar.a();
                long jC3 = cVar.c();
                long jC4 = cVar.c();
                if (1164798569 == iA2 || 1701669481 == iA2) {
                    return new b(jC3 + jC, jC4);
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    public static a4.b b(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.position((int) a(new a(byteBufferDuplicate)).a());
        return a4.b.h(byteBufferDuplicate);
    }

    public static long c(int i10) {
        return ((long) i10) & 4294967295L;
    }

    public static int d(short s8) {
        return s8 & 65535;
    }
}
