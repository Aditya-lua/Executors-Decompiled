/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa2c970..0xa2ca70 (256 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a2c970_2 {
    struct st_a2c970_0 *field_0;
    char padding_8[8];
    uint128_t field_10;
    uint128_t field_20;
} st_a2c970_2;

typedef struct st_a2c970_0 {
    char padding_0[48];
    struct st_a2c970_1 *field_30;
} st_a2c970_0;

typedef struct st_a2c970_1 {
    unsigned long long field_0;
} st_a2c970_1;


int sub_a2c970(uint128_t *a0)
{
    st_a2c970_2 *v2;  // x0
    uint128_t v3;  // q1
    st_a2c970_0 *v4;  // x20
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6bffc(48, "crypto/encode_decode/decoder_lib.c", 319);
    if (v2)
    {
        v3 = a0[1];
        *(uint128_t *)&v2->field_0 = *a0;
        v2->field_10 = v3;
        v2->field_20 = a0[2];
        v4 = v2->field_0;
        if (sub_a2d050(v4))
        {
            sub_a77638(sub_a2d6cc(v4));
            v4->field_30();
        }
        sub_a368c8();
        sub_a369bc("crypto/encode_decode/decoder_lib.c", 324, "ossl_decoder_instance_dup");
        sub_a36abc(60, 0xc0103, 0);
        sub_a6c2e4(v2, "crypto/encode_decode/decoder_lib.c", 340);
        v2 = 0;
    }
    return (unsigned int)v2;
}
