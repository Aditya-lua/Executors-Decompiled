package af;

import com.google.crypto.tink.shaded.protobuf.C2900a0;

/* JADX INFO: renamed from: af.p0 */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC0238p0 implements C2900a0.c {
    UNKNOWN_PREFIX(0),
    TINK(1),
    LEGACY(2),
    RAW(3),
    CRUNCHY(4),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: h */
    public static final C2900a0.d<EnumC0238p0> f675h = new C2900a0.d<EnumC0238p0>() { // from class: af.p0.a
        /* JADX DEBUG: Method merged with bridge method: a(I)Lcom/google/crypto/tink/shaded/protobuf/a0$c; */
        @Override // com.google.crypto.tink.shaded.protobuf.C2900a0.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public EnumC0238p0 mo612a(int i10) {
            return EnumC0238p0.m940a(i10);
        }
    };

    /* JADX INFO: renamed from: a */
    public final int f677a;

    EnumC0238p0(int i10) {
        this.f677a = i10;
    }

    /* JADX INFO: renamed from: a */
    public static EnumC0238p0 m940a(int i10) {
        if (i10 == 0) {
            return UNKNOWN_PREFIX;
        }
        if (i10 == 1) {
            return TINK;
        }
        if (i10 == 2) {
            return LEGACY;
        }
        if (i10 == 3) {
            return RAW;
        }
        if (i10 != 4) {
            return null;
        }
        return CRUNCHY;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.C2900a0.c
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f677a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
