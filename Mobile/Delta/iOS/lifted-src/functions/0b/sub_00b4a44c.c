/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb4a44c..0xb4a4a4 (88 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b4a44c_0 {
    char padding_0[128];
    unsigned long long field_80;
    char padding_88[8];
    unsigned long long field_90;
    char padding_98[8];
    uint128_t field_a0;
    unsigned long long field_b0;
    char padding_b8[56];
    unsigned long long field_f0;
} st_b4a44c_0;


double sub_b4a44c(st_b4a44c_0 *a0)
{
    unsigned long long v2;  // x0
    uint128_t v3;  // q0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6ce80(168, "providers/implementations/rands/drbg_hmac.c", 317);
    if (v2)
    {
        a0->field_f0 = v2;
        v3 = CONCAT(0x7fffffff, 0x7fffffff);
        a0->field_90 = 0x7fffffff;
        a0->field_a0 = v3;
        a0->field_b0 = 0x7fffffff;
        a0->field_80 = 0x10000;
    }
    return (unsigned long long)v3;
}
