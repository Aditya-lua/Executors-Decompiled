/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb4771c..0xb47798 (124 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b4771c_1 {
    char padding_0[128];
    unsigned long long field_80[2];
    struct st_b4771c_0 *field_88;
    uint128_t field_90;
    unsigned long long field_98;
    uint128_t field_a0;
    unsigned long long field_b0;
    char padding_b8[56];
    struct st_b4771c_0 *field_f0;
} st_b4771c_1;

typedef struct st_b4771c_0 {
    char padding_0[40];
    struct st_b4771c_0 *field_28;
    unsigned int field_30;
} st_b4771c_0;


double sub_b4771c(st_b4771c_1 *a0)
{
    st_b4771c_0 *v2;  // x0
    st_b4771c_0 *v3;  // x8
    uint128_t v4;  // q0
    st_b4771c_0 *v5;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6ce80(176, "providers/implementations/rands/drbg_ctr.c", 638);
    if (v2)
    {
        v3 = v2;
        v3->field_30 = 1;
        *(st_b4771c_0 **)&a0->padding_b8[24] = v3;
        *(uint128_t *)a0->field_80 = 0x10000;
        *(uint128_t *)&a0->field_88 = 0x7fffffff;
        v4 = CONCAT(0x7fffffff, 0x7fffffff);
        a0->field_90 = v4;
        a0->field_98 = 0x7fffffff;
        v5 = v3->field_28;
        if (v5)
        {
            a0->field_80[1] = v5;
            (&a0->field_88)[1] = v5 >> 1;
        }
    }
    return (unsigned long long)v4;
}
