package p028b8;

import java.util.Arrays;
import p569y7.EnumC13118e;

/* JADX INFO: renamed from: b8.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1256d extends AbstractC1267o {

    /* JADX INFO: renamed from: a */
    public final String f5257a;

    /* JADX INFO: renamed from: b */
    public final byte[] f5258b;

    /* JADX INFO: renamed from: c */
    public final EnumC13118e f5259c;

    /* JADX INFO: renamed from: b8.d$b */
    public static final class b extends AbstractC1267o.a {

        /* JADX INFO: renamed from: a */
        public String f5260a;

        /* JADX INFO: renamed from: b */
        public byte[] f5261b;

        /* JADX INFO: renamed from: c */
        public EnumC13118e f5262c;

        @Override // p028b8.AbstractC1267o.a
        /* JADX INFO: renamed from: a */
        public AbstractC1267o mo7010a() {
            String str = "";
            if (this.f5260a == null) {
                str = " backendName";
            }
            if (this.f5262c == null) {
                str = str + " priority";
            }
            if (str.isEmpty()) {
                return new C1256d(this.f5260a, this.f5261b, this.f5262c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p028b8.AbstractC1267o.a
        /* JADX INFO: renamed from: b */
        public AbstractC1267o.a mo7011b(String str) {
            if (str == null) {
                throw new NullPointerException("Null backendName");
            }
            this.f5260a = str;
            return this;
        }

        @Override // p028b8.AbstractC1267o.a
        /* JADX INFO: renamed from: c */
        public AbstractC1267o.a mo7012c(byte[] bArr) {
            this.f5261b = bArr;
            return this;
        }

        @Override // p028b8.AbstractC1267o.a
        /* JADX INFO: renamed from: d */
        public AbstractC1267o.a mo7013d(EnumC13118e enumC13118e) {
            if (enumC13118e == null) {
                throw new NullPointerException("Null priority");
            }
            this.f5262c = enumC13118e;
            return this;
        }
    }

    @Override // p028b8.AbstractC1267o
    /* JADX INFO: renamed from: b */
    public String mo7007b() {
        return this.f5257a;
    }

    @Override // p028b8.AbstractC1267o
    /* JADX INFO: renamed from: c */
    public byte[] mo7008c() {
        return this.f5258b;
    }

    @Override // p028b8.AbstractC1267o
    /* JADX INFO: renamed from: d */
    public EnumC13118e mo7009d() {
        return this.f5259c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC1267o) {
            AbstractC1267o abstractC1267o = (AbstractC1267o) obj;
            if (this.f5257a.equals(abstractC1267o.mo7007b())) {
                if (Arrays.equals(this.f5258b, abstractC1267o instanceof C1256d ? ((C1256d) abstractC1267o).f5258b : abstractC1267o.mo7008c()) && this.f5259c.equals(abstractC1267o.mo7009d())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f5257a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f5258b)) * 1000003) ^ this.f5259c.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C1256d(String str, byte[] bArr, EnumC13118e enumC13118e) {
        this.f5257a = str;
        this.f5258b = bArr;
        this.f5259c = enumC13118e;
    }
}
