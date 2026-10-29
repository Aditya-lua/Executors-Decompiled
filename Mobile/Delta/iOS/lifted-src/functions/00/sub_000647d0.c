/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x647d0..0x64948 (376 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_647d0_1 {
    char padding_0[24];
    struct st_647d0_2 *field_18;
} st_647d0_1;

typedef struct st_647d0_3 {
    struct st_647d0_1 *field_0;
    char field_8;
    char padding_9[7];
    uint128_t field_10;
    uint128_t field_20;
    uint128_t field_30;
    unsigned long long field_40;
    unsigned long long field_48;
    unsigned long long field_50;
    char padding_58[8];
    uint128_t field_60;
    uint128_t field_70;
    unsigned long long field_80[2];
    uint128_t field_90;
    uint128_t field_a0;
    uint128_t field_b0;
    uint128_t field_c0;
    uint128_t field_d0;
    uint128_t field_e0;
    uint128_t field_f0;
    uint128_t field_100;
    uint128_t field_110;
    uint128_t field_120;
    uint128_t field_130;
    uint128_t field_140;
    uint128_t field_150;
    uint128_t field_160;
    char field_170[28];
    char field_17c;
    char padding_17d[15];
    unsigned int field_18c;
    unsigned short field_190;
    char field_192;
} st_647d0_3;

typedef struct st_647d0_2 {
    unsigned long long field_0;
} st_647d0_2;

typedef struct st_647d0_0 {
    char field_0;
} st_647d0_0;

extern st_647d0_1 g_e69ff0;
extern char g_1000160;
extern char g_10001c8;

void sub_647d0(st_647d0_3 *a0)
{
    unsigned long long v10;  // x22
    unsigned long long v11;  // x21
    unsigned long long v12;  // x20
    unsigned long long v13;  // x19
    unsigned long long v14;  // x30
    st_647d0_0 **v0;  // [bp-0x48], Other Possible Types: char
    st_647d0_0 *v1;  // [bp-0x40]
    char v2;  // [bp-0x38]
    unsigned long long v3;  // [bp-0x30]
    unsigned long long v4;  // [bp-0x28]
    unsigned long long v5;  // [bp-0x20]
    unsigned long long v6;  // [bp-0x18]
    char *v7;  // [bp-0x10]
    unsigned long long v8;  // [bp-0x8]
    char v9;  // [bp+0x0]

    v3 = v10;
    v4 = v11;
    v5 = v12;
    v6 = v13;
    v7 = &v9;
    v8 = v14;
    v1 = &v0;
    v0 = &v1;
    a0->field_0 = &g_10001c8;
    std::__1::locale::locale(&a0->field_8);
    a0->field_30 = 0;
    a0->field_10 = 0;
    a0->field_20 = 0;
    a0->field_0 = &g_e69ff0.padding_0[0];
    a0->field_48 = 0;
    a0->field_50 = 0;
    a0->field_40 = 0;
    a0->field_60 = 0;
    a0->field_70 = 0;
    *(uint128_t *)a0->field_80 = 0;
    a0->field_90 = 0;
    a0->field_a0 = 0;
    a0->field_b0 = 0;
    a0->field_c0 = 0;
    a0->field_d0 = 0;
    a0->field_e0 = 0;
    a0->field_f0 = 0;
    a0->field_100 = 0;
    a0->field_110 = 0;
    a0->field_120 = 0;
    a0->field_130 = 0;
    a0->field_140 = 0;
    a0->field_150 = 0;
    a0->field_160 = 0;
    *(uint128_t *)&a0->field_170[0] = 0;
    *(uint128_t *)&a0->field_170[12] = 0;
    *(unsigned int *)&a0->field_17c = 32;
    *(unsigned short *)&a0->padding_17d[3] = 0;
    a0->padding_17d[5] = 0;
    std::__1::locale::locale(&v2, &a0->field_8);
    if (!std::__1::locale::has_facet(&v2, &g_1000160))
        a0->field_0->field_18();
    std::__1::locale::locale(&v2, &a0->field_8);
    a0->field_80[0] = std::__1::locale::use_facet(&v2, &g_1000160);
    (*(long long *)(*(long long *)a0->field_80[0] + 56))();
}
