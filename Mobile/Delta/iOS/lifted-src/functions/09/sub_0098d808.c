/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x98d808..0x98d8a8 (160 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_98d808_0 {
    uint128_t field_0;
    unsigned long long field_10;
    long long field_18;
    unsigned long long field_20;
} st_98d808_0;

typedef struct st_98d808_1 {
    char padding_0[160];
    long long field_a0;
    char padding_a8[320];
    unsigned short field_1e8;
    char padding_1ea[6];
    uint128_t field_1f0;
    unsigned long long field_200;
    unsigned long long field_208;
    long long field_210;
} st_98d808_1;


double sub_98d808(st_98d808_1 *a0, st_98d808_0 *a1)
{
    unsigned long long v2;  // x21
    unsigned long long v3;  // x0
    unsigned long v4;  // x8
    unsigned long long v5;  // x9
    unsigned long long v6;  // x0
    uint128_t v7;  // q0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a1->field_20;
    v3 = sub_9857e0(a0->field_a0);
    v4 = a0->field_1e8;
    if (v4 >> 10 & 1)
        return (unsigned long long)v7;
    v5 = v3 >> 1;
    if (a1->field_20 >= v5)
        v2 = v5;
    if (v2)
    {
        v6 = sub_a6dac4(a1->field_18, v2, "ssl/quic/quic_txp.c", 3200);
        if (!v6)
            return (unsigned long long)v7;
        v4 = a0->field_1e8;
    }
    else
    {
        v6 = 0;
    }
    v7 = a1->field_0;
    a0->field_200 = a1->field_10;
    a0->field_1f0 = v7;
    a0->field_208 = v6;
    a0->field_210 = v2;
    a0->field_1e8 = (unsigned short)v4 | 0x400;
    return (unsigned long long)v7;
}
