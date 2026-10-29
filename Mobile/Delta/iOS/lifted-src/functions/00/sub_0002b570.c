/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2b570..0x2b8bc (844 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2b570_0 {
    char field_0;
} st_2b570_0;

extern char g_e63268;

void* sub_2b570(void* a0, unsigned long a1)
{
    st_2b570_0 **v0;  // [bp-0x180], Other Possible Types: char
    st_2b570_0 *v1;  // [bp-0x178]
    uint128_t v2;  // [bp-0x170], Other Possible Types: unsigned long, unsigned int
    unsigned long v3;  // [bp-0x168], Other Possible Types: unsigned long long
    uint128_t v4;  // [bp-0x160], Other Possible Types: unsigned long
    unsigned long v5;  // [bp-0x158]
    uint128_t v6;  // [bp-0x150], Other Possible Types: unsigned long
    uint128_t v7;  // [bp-0x140]
    uint128_t v8;  // [bp-0x130]
    uint128_t v9;  // [bp-0x120]
    uint128_t v10;  // [bp-0x110]
    uint128_t v11;  // [bp-0x100]
    uint128_t v12;  // [bp-0xf0]
    uint128_t v13;  // [bp-0xe0]
    uint128_t v14;  // [bp-0xd0]
    uint128_t v15;  // [bp-0xc0]
    uint128_t v16;  // [bp-0xb0]
    uint128_t v17;  // [bp-0xa0]
    uint128_t v18;  // [bp-0x90]
    uint128_t v19;  // [bp-0x80]
    unsigned long v20;  // [bp-0x70]
    char *v21;  // [bp-0x10]
    char v22;  // [bp+0x0]

    v21 = &v22;
    v1 = &v0;
    v0 = &v1;
    *(unsigned long long *)&a0[8] = 0;
    *(char **)a0 = &g_e63268;
    *(uint128_t *)&a0[16] = __double_as_longlong(0) * 0x10000000000000000;
    *(unsigned long long *)&a0[32] = 0xffffffffffffffff;
    *(uint128_t *)&a0[72] = 0;
    *(uint128_t *)&a0[120] = 0;
    *(uint128_t *)&a0[40] = 0;
    *(uint128_t *)&a0[56] = 0;
    *(uint128_t *)&a0[88] = 0;
    *(uint128_t *)&a0[104] = 0;
    *(uint128_t *)&a0[0x88] = 0;
    *(uint128_t *)&a0[152] = 0;
    *(uint128_t *)&a0[168] = 0;
    *(uint128_t *)&a0[184] = 0;
    *(uint128_t *)&a0[200] = 0;
    *(uint128_t *)&a0[216] = 0;
    *(uint128_t *)&a0[225] = 0;
    v2 = 0;
    v3 = 0xffffffffffffffff;
    v4 = 0;
    v5 = 0;
    v6 = 0;
    sub_31490(a0 + 248, &v2, 0);
    v20 = 0;
    v18 = 0;
    v19 = 0;
    v16 = 0;
    v17 = 0;
    v14 = 0;
    v15 = 0;
    v12 = 0;
    v13 = 0;
    v10 = 0;
    v11 = 0;
    v8 = 0;
    v9 = 0;
    v6 = 0;
    v7 = 0;
    v2 = 0;
    v4 = 0;
    sub_2d6c4(a0 + 320, &v2, 0);
    v2 = 0xffffffff;
    sub_30acc(a0 + 616, &v2, 0);
    *(unsigned int *)&a0[648] = 0;
    memset(a0 + 656, 0, 120);
    v2 = 0;
    v3 = 0;
    sub_29fc0(a0 + 776, &v2, 0);
    *(unsigned long long *)&a0[888] = 0;
    memset(a0 + 824, 0, 64);
    *(unsigned long *)&a0[896] = a1;
    *(unsigned long long *)&a0[904] = 0;
    *(unsigned long long *)&a0[920] = 0;
    *(unsigned long long *)&a0[912] = 0;
    *(unsigned int *)&a0[928] = 0;
    *(unsigned long long *)&a0[1016] = 0;
    memset(a0 + 936, 0, 80);
    sub_2dfb0(a0 + 48, 32);
    sub_2dfb0(a0 + 72, 32);
    sub_2de18(a0 + 96, 16);
    sub_2dfb0(a0 + 120, 16);
    sub_2ae24(a0 + 8, 8);
    return a0;
}
