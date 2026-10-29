/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa2f068..0xa2f144 (220 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a2f068_0 {
    char padding_0[24];
    struct st_a2f068_0 *field_18;
    struct st_a2f068_0 *field_20;
    struct st_a2f068_0 *field_28;
} st_a2f068_0;


st_a2f068_0 * sub_a2f068(st_a2f068_0 *a0, unsigned long long a1)
{
    long long v9;  // x1
    st_a2f068_0 *v10;  // x2
    st_a2f068_0 *v0;  // [bp-0x68]
    unsigned long long v1;  // [bp-0x60]
    st_a2f068_0 *v2;  // [bp-0x58]
    st_a2f068_0 *v3;  // [bp-0x48]
    st_a2f068_0 *v4;  // [bp-0x38]
    st_a2f068_0 *v5;  // [bp-0x28]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v5 = 0;
    v4 = (st_a2f068_0 *)0;
    v3 = (st_a2f068_0 *)0;
    v2 = (st_a2f068_0 *)0;
    v0 = a0;
    v1 = a1;
    if (a0 && a0->field_18 && !(v2 = (st_a2f068_0 *)(unsigned int)sub_ad69e4(a0->field_18), !v2))
    {
        if (a0->field_28 && a0->field_20)
            return (int)sub_a2f144(&v0) > 0;
        sub_a368c8();
        sub_a369bc("crypto/encode_decode/encoder_lib.c", 86, "OSSL_ENCODER_to_bio");
        v9 = 786693;
        v10 = 0;
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/encode_decode/encoder_lib.c", 78, "OSSL_ENCODER_to_bio");
        v10 = "No encoders were found. For standard encoders you need at least one of the default or base providers available. Did you forget to load them?";
        v9 = 101;
    }
    sub_a36abc(59, v9, v10);
    return 0;
}
