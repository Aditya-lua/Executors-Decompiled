/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xac5150..0xac5298 (328 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ac5150_2 {
    struct st_ac5150_1 *field_0;
    long long field_8;
} st_ac5150_2;

typedef struct st_ac5150_1 {
    char padding_0[160];
    struct st_ac5150_0 *field_a0;
} st_ac5150_1;

typedef struct st_ac5150_0 {
    char padding_0[16];
    unsigned int field_10;
} st_ac5150_0;

extern char g_10002b0;

long long sub_ac5150(st_ac5150_2 *a0, long long a1, long long a2, long long a3, long long a4)
{
    long long v11;  // x22
    unsigned long n;  // x21
    unsigned long v13;  // x22
    uint128_t v0;  // [bp-0xe0]
    uint128_t v1;  // [bp-0xd0]
    uint128_t v2;  // [bp-0xc0]
    uint128_t v3;  // [bp-0xb0]
    uint128_t v4;  // [bp-0xa0]
    uint128_t v5;  // [bp-0x90]
    uint128_t v6;  // [bp-0x80]
    uint128_t v7;  // [bp-0x70]
    unsigned long v8;  // [bp-0x58]
    char *v9;  // [bp-0x10]
    char v10;  // [bp+0x0]

    v9 = &v10;
    v8 = *(long long *)&g_10002b0;
    v11 = a0->field_8;
    n = a0->field_0->field_a0->field_10;
    v6 = 0;
    v7 = 0;
    v4 = 0;
    v5 = 0;
    v2 = 0;
    v3 = 0;
    v0 = 0;
    v1 = 0;
    if (sub_a3f7f0(v11, 0, 0) == 1 && sub_a3fe10(v11, a1, n) == 1 && sub_a3fe10(v11, &v0, 64 - n) == 1 && sub_a3fe10(v11, a3, 22) == 1 && sub_a3fe10(v11, a2, n) == 1)
        v13 = sub_a3ff7c(v11, (char *)&a0[2].field_0 + 4, 0) == 1;
    else
        v13 = 0;
    _memcpy(a4, (char *)&a0[2].field_0 + 4, n);
    if (*(long long *)&g_10002b0 == v8)
        return v13;
    ___stack_chk_fail();
}
