/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x97afdc..0x97b054 (120 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_97afdc_0 {
    long long field_0;
    char padding_8[1040];
    long long field_418;
    char padding_420[344];
    unsigned long long field_578;
    char padding_580[112];
    unsigned long long field_5f0;
} st_97afdc_0;


uint128_t sub_97afdc(st_97afdc_0 *a0)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    uint128_t v8;  // x0
    uint128_t v9;  // x20
    unsigned long long v10;  // x8
    unsigned long long v11;  // x10
    unsigned long long v12;  // x8
    unsigned long long v13;  // 4110
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    v8 = sub_981238(a0->field_0);
    v9 = v8;
    if (a0->field_578)
    {
        v8 = sub_975f2c(a0->field_418);
        v10 = 1000000 * a0->field_578;
        v11 = v8 * 3;
        if (v8 * 3 > 0xffffffffffffffff)
            v11 = 0xffffffffffffffff;
        if (v11 < v10)
            v11 = v10;
    }
    else
    {
        v11 = 0xffffffffffffffff;
    }
    v12 = v9 + v11;
    v13 = arm64g_calculate_condition(50, v9, v11, 0);
    if (!(v13 & 1))
        v12 = 0xffffffffffffffff;
    a0->field_5f0 = v12;
    return v8;
}
