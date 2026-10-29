/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb28164..0xb2826c (264 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b28164_0 {
    unsigned long long field_0;
    char padding_8[16];
    long long field_18;
} st_b28164_0;

typedef struct st_b28164_1 {
    struct st_b28164_0 *field_0;
    char padding_8[56];
    long long field_40;
} st_b28164_1;


long long sub_b28164(st_b28164_1 *a0, long long *a1)
{
    long long v3;  // x21
    long long v4;  // x0
    unsigned long v0;  // [bp-0x40]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    if (a0->field_40)
    {
        v3 = a0->field_0->field_18;
        v4 = sub_a6bf4c(v3, "providers/implementations/encode_decode/ml_kem_codecs.c", 421);
        *a1 = v4;
        if (v4)
        {
            if (!sub_a82fdc())
            {
                sub_a368c8();
                sub_a369bc("providers/implementations/encode_decode/ml_kem_codecs.c", 424, "ossl_ml_kem_i2d_pubkey");
                v0 = a0->field_0->field_0;
                sub_a36abc(59, 0xc0103, "error encoding %s public key");
                sub_a6c2e4(*a1, "providers/implementations/encode_decode/ml_kem_codecs.c", 427);
            }
            else
            {
                return v3;
            }
        }
    }
    else
    {
        sub_a368c8();
        sub_a369bc("providers/implementations/encode_decode/ml_kem_codecs.c", 413, "ossl_ml_kem_i2d_pubkey");
        v0 = a0->field_0->field_0;
        sub_a36abc(57, 220, "no %s public key data available");
    }
    return 0;
}
