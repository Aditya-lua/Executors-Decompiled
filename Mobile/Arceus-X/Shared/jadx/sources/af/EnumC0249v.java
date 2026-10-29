package af;

import com.google.crypto.tink.shaded.protobuf.C2900a0;

/* JADX INFO: renamed from: af.v */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC0249v implements C2900a0.c {
    UNKNOWN_ENCODING(0),
    IEEE_P1363(1),
    DER(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: f */
    public static final C2900a0.d<EnumC0249v> f699f = new C2900a0.d<EnumC0249v>() { // from class: af.v.a
        /* JADX DEBUG: Method merged with bridge method: a(I)Lcom/google/crypto/tink/shaded/protobuf/a0$c; */
        @Override // com.google.crypto.tink.shaded.protobuf.C2900a0.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public EnumC0249v mo612a(int i10) {
            return EnumC0249v.m1076a(i10);
        }
    };

    /* JADX INFO: renamed from: a */
    public final int f701a;

    EnumC0249v(int i10) {
        this.f701a = i10;
    }

    /* JADX INFO: renamed from: a */
    public static EnumC0249v m1076a(int i10) {
        if (i10 == 0) {
            return UNKNOWN_ENCODING;
        }
        if (i10 == 1) {
            return IEEE_P1363;
        }
        if (i10 != 2) {
            return null;
        }
        return DER;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.C2900a0.c
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f701a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
