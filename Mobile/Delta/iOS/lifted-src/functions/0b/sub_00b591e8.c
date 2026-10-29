/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb591e8..0xb5926c (132 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b591e8_0 {
    char padding_0[11];
    unsigned short field_b;
} st_b591e8_0;

typedef struct st_b591e8_2 {
    uint128_t field_0;
    uint128_t field_10;
    uint128_t field_20;
    uint128_t field_30;
    char field_40[28];
    char field_4c;
    char padding_4d[107];
    uint128_t field_b8;
    uint128_t field_c8;
    uint128_t field_d8;
    uint128_t field_e8;
    char field_f8[28];
    char field_104;
    char padding_105[19];
    unsigned long long field_118;
} st_b591e8_2;

typedef struct st_b591e8_1 {
    char padding_0[108];
    char field_6c;
    char padding_6d[347];
    uint128_t field_1c8;
    uint128_t field_1d8;
    uint128_t field_1e8;
    uint128_t field_1f8;
    char field_208[28];
    char field_214;
    char padding_215[107];
    uint128_t field_280;
    uint128_t field_290;
    uint128_t field_2a0;
    uint128_t field_2b0;
    char field_2c0[28];
    char field_2cc;
    char padding_2cd[19];
    unsigned long long field_2e0;
} st_b591e8_1;

typedef struct st_b591e8_3 {
    uint128_t field_0;
    uint128_t field_10;
    uint128_t field_20;
    uint128_t field_30;
    char field_40[28];
    char field_4c;
    char padding_4d[19];
    unsigned long long field_60;
} st_b591e8_3;


char sub_b591e8(st_b591e8_1 *a0, st_b591e8_0 *a1, unsigned long a2)
{
    unsigned long v3;  // x8
    unsigned long long v4;  // x8
    unsigned long v5;  // x8
    unsigned long long v7;  // x30
    st_b591e8_3 *v8;  // x8
    st_b591e8_2 *v9;  // x9
    uint128_t v10;  // q1
    uint128_t v11;  // q1
    char *v0;  // [bp-0x10]
    unsigned long long v1;  // [bp-0x8]
    char v2;  // [bp+0x0]

    if (a2 != 13)
        return 0;
    v3 = *(short *)&(a1->padding_0)[1];
    v4 = (unsigned int)((v3 & 0xff00) >> 8) | (unsigned int)v3 * 0x100 & 0xff00ff00;
    if (!(a0->field_6c >> 1 & 1))
    {
        v5 = (unsigned int)v4 - 16;
        if (16 > (unsigned int)v4)
            return 0;
        *(unsigned short *)&(a1->padding_0)[1] = (((((v5 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v5 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v5 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v5 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 48;
        v4 = v5;
    }
    v0 = &v2;
    v1 = v7;
    *(unsigned long long *)&a0->field_2c0[0] = v4 & 0xffffffff;
    v8 = &a0->padding_215[83];
    v9 = (a0->padding_6d)[1];
    v10 = v9->field_30;
    a0->field_280 = v9->field_20;
    a0->field_290 = v10;
    a0->field_2a0 = *(int128_t *)&v9->field_40[0];
    *(int128_t *)&v8->field_40[12] = *(int128_t *)&v9->field_40[12];
    v11 = v9->field_10;
    *(uint128_t *)&a0->padding_215[83] = v9->field_0;
    *(uint128_t *)&a0->padding_215[99] = v11;
    sub_a7d544(v8);
    return 16;
}
