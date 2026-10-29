/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb275c8..0xb27670 (168 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b275c8_0 {
    unsigned long long field_0;
    char padding_8[64];
    unsigned int field_48;
} st_b275c8_0;

typedef struct st_b275c8_1 {
    struct st_b275c8_1 *field_0;
} st_b275c8_1;


int sub_b275c8(long long a0, st_b275c8_1 **a1)
{
    st_b275c8_0 *v3;  // x19
    st_b275c8_1 **v4;  // x0
    unsigned long v0;  // [bp-0x40]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = sub_c4c40();
    if (!sub_a01e1c(a0))
    {
        sub_a368c8();
        sub_a369bc("providers/implementations/encode_decode/ml_dsa_codecs.c", 277, "ossl_ml_dsa_i2d_pubkey");
        v0 = v3->field_0;
        sub_a36abc(57, 220, "no %s public key data available");
        v4 = 0;
    }
    else if (!a1 || (v4 = sub_a6dac4(), *a1 = v4, v4))
    {
        v4 = v3->field_48;
    }
    return (unsigned int)v4;
}
