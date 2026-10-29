package af;

import com.google.crypto.tink.shaded.protobuf.C2900a0;

/* JADX INFO: renamed from: af.g0 */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC0220g0 implements C2900a0.c {
    UNKNOWN_STATUS(0),
    ENABLED(1),
    DISABLED(2),
    DESTROYED(3),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: g */
    public static final C2900a0.d<EnumC0220g0> f649g = new C2900a0.d<EnumC0220g0>() { // from class: af.g0.a
        /* JADX DEBUG: Method merged with bridge method: a(I)Lcom/google/crypto/tink/shaded/protobuf/a0$c; */
        @Override // com.google.crypto.tink.shaded.protobuf.C2900a0.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public EnumC0220g0 mo612a(int i10) {
            return EnumC0220g0.m743a(i10);
        }
    };

    /* JADX INFO: renamed from: a */
    public final int f651a;

    EnumC0220g0(int i10) {
        this.f651a = i10;
    }

    /* JADX INFO: renamed from: a */
    public static EnumC0220g0 m743a(int i10) {
        if (i10 == 0) {
            return UNKNOWN_STATUS;
        }
        if (i10 == 1) {
            return ENABLED;
        }
        if (i10 == 2) {
            return DISABLED;
        }
        if (i10 != 3) {
            return null;
        }
        return DESTROYED;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.C2900a0.c
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f651a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
