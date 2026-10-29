/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xac5720..0xac5878 (344 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ac5720_1 {
    char padding_0[160];
    struct st_ac5720_0 *field_a0;
} st_ac5720_1;

typedef struct st_ac5720_2 {
    struct st_ac5720_1 *field_0;
    char padding_8[8];
    long long field_10;
} st_ac5720_2;

typedef struct st_ac5720_0 {
    char padding_0[16];
    unsigned int field_10;
    char padding_14[36];
    unsigned long long field_38;
} st_ac5720_0;

extern char g_10002b0;

long long sub_ac5720(st_ac5720_2 *a0, long long a1, long long a2, long long a3, long long a4, long long a5)
{
    long long v11;  // x22
    unsigned long n;  // x21
    unsigned long v13;  // x22
    uint128_t v0;  // [bp-0xf0]
    uint128_t v1;  // [bp-0xe0]
    uint128_t v2;  // [bp-0xd0]
    uint128_t v3;  // [bp-0xc0]
    uint128_t v4;  // [bp-0xb0]
    uint128_t v5;  // [bp-0xa0]
    uint128_t v6;  // [bp-0x90]
    uint128_t v7;  // [bp-0x80]
    unsigned long v8;  // [bp-0x68]
    char *v9;  // [bp-0x10]
    char v10;  // [bp+0x0]

    v9 = &v10;
    v8 = *(long long *)&g_10002b0;
    v11 = a0->field_10;
    n = a0->field_0->field_a0->field_10;
    v6 = 0;
    v7 = 0;
    v4 = 0;
    v5 = 0;
    v2 = 0;
    v3 = 0;
    v0 = 0;
    v1 = 0;
    if (sub_a3f7f0(v11, 0, 0) == 1 && sub_a3fe10(v11, a1, n) == 1 && sub_a3fe10(v11, &v0, a0->field_0->field_a0->field_38 - n) == 1 && sub_a3fe10(v11, a2, 22) == 1 && sub_a3fe10(v11, a3, a4) == 1)
        v13 = sub_a3ff7c(v11, &a0[1].padding_8[4], 0) == 1;
    else
        v13 = 0;
    _memcpy(a5, &a0[1].padding_8[4], n);
    if (*(long long *)&g_10002b0 == v8)
        return v13;
    ___stack_chk_fail();
}
