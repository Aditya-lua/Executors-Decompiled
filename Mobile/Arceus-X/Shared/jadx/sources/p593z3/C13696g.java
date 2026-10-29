package p593z3;

import androidx.annotation.NonNull;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p005a4.C0067b;

/* JADX INFO: renamed from: z3.g */
/* JADX INFO: loaded from: classes.dex */
public class C13696g {

    /* JADX INFO: renamed from: z3.g$a */
    public static class a implements c {

        /* JADX INFO: renamed from: a */
        @NonNull
        public final ByteBuffer f48075a;

        public a(@NonNull ByteBuffer byteBuffer) {
            this.f48075a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // p593z3.C13696g.c
        /* JADX INFO: renamed from: a */
        public int mo50024a() {
            return this.f48075a.getInt();
        }

        @Override // p593z3.C13696g.c
        /* JADX INFO: renamed from: b */
        public void mo50025b(int i10) {
            ByteBuffer byteBuffer = this.f48075a;
            byteBuffer.position(byteBuffer.position() + i10);
        }

        @Override // p593z3.C13696g.c
        /* JADX INFO: renamed from: c */
        public long mo50026c() {
            return C13696g.m50022c(this.f48075a.getInt());
        }

        @Override // p593z3.C13696g.c
        public long getPosition() {
            return this.f48075a.position();
        }

        @Override // p593z3.C13696g.c
        public int readUnsignedShort() {
            return C13696g.m50023d(this.f48075a.getShort());
        }
    }

    /* JADX INFO: renamed from: z3.g$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        public final long f48076a;

        /* JADX INFO: renamed from: b */
        public final long f48077b;

        public b(long j10, long j11) {
            this.f48076a = j10;
            this.f48077b = j11;
        }

        /* JADX INFO: renamed from: a */
        public long m50027a() {
            return this.f48076a;
        }
    }

    /* JADX INFO: renamed from: z3.g$c */
    public interface c {
        /* JADX INFO: renamed from: a */
        int mo50024a();

        /* JADX INFO: renamed from: b */
        void mo50025b(int i10);

        /* JADX INFO: renamed from: c */
        long mo50026c();

        long getPosition();

        int readUnsignedShort();
    }

    /* JADX INFO: renamed from: a */
    public static b m50020a(c cVar) throws IOException {
        long jMo50026c;
        cVar.mo50025b(4);
        int unsignedShort = cVar.readUnsignedShort();
        if (unsignedShort > 100) {
            throw new IOException("Cannot read metadata.");
        }
        cVar.mo50025b(6);
        int i10 = 0;
        while (true) {
            if (i10 >= unsignedShort) {
                jMo50026c = -1;
                break;
            }
            int iMo50024a = cVar.mo50024a();
            cVar.mo50025b(4);
            jMo50026c = cVar.mo50026c();
            cVar.mo50025b(4);
            if (1835365473 == iMo50024a) {
                break;
            }
            i10++;
        }
        if (jMo50026c != -1) {
            cVar.mo50025b((int) (jMo50026c - cVar.getPosition()));
            cVar.mo50025b(12);
            long jMo50026c2 = cVar.mo50026c();
            for (int i11 = 0; i11 < jMo50026c2; i11++) {
                int iMo50024a2 = cVar.mo50024a();
                long jMo50026c3 = cVar.mo50026c();
                long jMo50026c4 = cVar.mo50026c();
                if (1164798569 == iMo50024a2 || 1701669481 == iMo50024a2) {
                    return new b(jMo50026c3 + jMo50026c, jMo50026c4);
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    /* JADX INFO: renamed from: b */
    public static C0067b m50021b(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.position((int) m50020a(new a(byteBufferDuplicate)).m50027a());
        return C0067b.m160h(byteBufferDuplicate);
    }

    /* JADX INFO: renamed from: c */
    public static long m50022c(int i10) {
        return ((long) i10) & 4294967295L;
    }

    /* JADX INFO: renamed from: d */
    public static int m50023d(short s8) {
        return s8 & 65535;
    }
}
