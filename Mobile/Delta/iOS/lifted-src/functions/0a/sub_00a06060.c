/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa06060..0xa06334 (724 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a06060_1 {
    uint128_t field_0;
    uint128_t field_10;
    uint128_t field_20;
    uint128_t field_30;
    char field_40;
    char padding_41[63];
    uint128_t field_80;
} st_a06060_1;

typedef struct st_a06060_0 {
    uint128_t field_0;
    uint128_t field_10;
    char field_20[25];
    char field_29;
} st_a06060_0;

extern long long g_d37300;
extern long long g_d37380;
extern char g_10002b0;

unsigned int sub_a06060(st_a06060_1 *a0, st_a06060_0 *a1)
{
    unsigned long v14;  // x8
    long long v15;  // x24
    long long v16;  // w0
    unsigned int v17;  // w0
    unsigned long long v18;  // x0
    uint128_t v19;  // q0
    uint128_t v20;  // q1
    uint128_t v21;  // q4
    uint128_t v22;  // q1
    char v0;  // [bp-0x1a0]
    char v1;  // [bp-0x160]
    char v2;  // [bp-0x120]
    uint128_t v3;  // [bp-0xe0]
    uint128_t v4;  // [bp-0xd0]
    uint200_t v5;  // [bp-0xc0]
    long long v6;  // [bp-0xa8]
    uint128_t v7;  // [bp-0xa0]
    uint128_t v8;  // [bp-0x90]
    uint128_t v9;  // [bp-0x80]
    uint128_t v10;  // [bp-0x70]
    unsigned long v11;  // [bp-0x58]
    char *v12;  // [bp-0x10]
    char v13;  // [bp+0x0]

    v12 = &v13;
    v11 = *(long long *)&g_10002b0;
    *(int128_t *)((char *)&v5 + 9) = *(int128_t *)&a1->field_20[9];
    v3 = a1->field_0;
    v4 = a1->field_10;
    *(int128_t *)&v5 = *(int128_t *)&a1->field_20[0];
    v14 = *(char *)((void*)&v5 + 24);
    v15 = (v14 & 128) - 1;
    v6 = (char)v14 & 127;
    v16 = (unsigned int)sub_a08a54(&a0->field_40, &v3, 1, 0);
    sub_a04c64(a0, &a0->field_40);
    sub_a08d40(&a0->field_80, &g_d37380, a0);
    sub_a04b70(&a0[1].field_30, a0, 0x98a9);
    sub_a08d40(&a0[1].field_30, &g_d37300, &a0[1].field_30);
    sub_a08d40(&a0[1].field_30, &g_d37380, &a0[1].field_30);
    sub_a04850(a0, &a0->field_80, &a0[1].field_30);
    v17 = sub_a08f10(&a0[1].field_30, a0);
    if (v6)
        v16 = 0;
    sub_a04850();
    v18 = sub_a089ec(a0);
    sub_a08d40(&v7, &g_d37300, a0);
    v19 = CONCAT(v18 ^ ~(v15 >> 63), v18 ^ ~(v15 >> 63));
    v20 = CONCAT(v18 ^ v15 >> 63, v18 ^ v15 >> 63);
    v21 = a0->field_10 & v20;
    a0->field_0 = a0->field_0 & v20 | v7 & v19;
    a0->field_10 = v21 | v8 & v19;
    v22 = a0->field_30 & v20;
    a0->field_20 = a0->field_20 & v20 | v9 & v19;
    a0->field_30 = v22 | v10 & v19;
    a0->field_80 = 1;
    memset(a0 + 1, 0, 48);
    sub_a04c64(&v1, a0);
    sub_a04c64(&v7, &a0->field_40);
    sub_a088cc(&v0, &v1, &v7);
    sub_a088cc(&a0[1].field_30, &a0->field_40, a0);
    sub_a04c64(&v2, &a0[1].field_30);
    sub_a08d40(&v2, &v2, &v0);
    sub_a08d40(&a0[1].field_30, &v7, &v1);
    sub_a04c64(a0, &a0->field_80);
    sub_a088cc(&a0->field_80, a0, a0);
    sub_a08d40(&v7, &a0->field_80, &v0);
    sub_a04850(a0, &v7, &v2);
    sub_a04850(&a0->field_80, &a0[1].field_30, &v7);
    sub_a04850(&a0->field_40, &a0[1].field_30, &v0);
    sub_a04850(&a0[1].field_30, &v2, &v0);
    sub_a66ec0(&v7, 64);
    sub_a66ec0(&v2, 64);
    sub_a66ec0(&v1, 64);
    sub_a66ec0(&v0, 64);
    sub_a66ec0(&v3, 57);
    if (*(long long *)&g_10002b0 == v11)
        return v17 & v16;
    ___stack_chk_fail();
}
