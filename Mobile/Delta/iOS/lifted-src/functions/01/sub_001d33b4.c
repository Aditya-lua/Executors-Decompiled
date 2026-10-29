/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1d33b4..0x1d3498 (228 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1d33b4_1 {
    unsigned int field_0;
    char padding_4[4];
    unsigned long long field_8;
} st_1d33b4_1;

typedef struct st_1d33b4_2 {
    uint128_t field_0;
    uint128_t field_10;
    unsigned long long field_20;
} st_1d33b4_2;

typedef struct st_1d33b4_0 {
    char padding_0[392];
    uint128_t field_188;
    uint128_t field_198;
    unsigned long long field_1a8;
} st_1d33b4_0;

extern char g_e700e8;
extern char g_10002b0;

unsigned long long sub_1d33b4(st_1d33b4_0 *a0, st_1d33b4_1 *a1, unsigned long long a2, long long a3)
{
    st_1d33b4_2 *v13;  // x8
    unsigned long long v14;  // x0
    long long v15;  // x0
    uint128_t v0;  // [bp-0xc0]
    uint128_t v1;  // [bp-0xb0]
    unsigned long v2;  // [bp-0xa0]
    unsigned int v3;  // [bp-0x98]
    unsigned long v4;  // [bp-0x90]
    uint128_t v5;  // [bp-0x88]
    uint128_t v6;  // [bp-0x78]
    unsigned long v7;  // [bp-0x68]
    unsigned long long v8;  // [bp-0x60]
    char v9;  // [bp-0x58]
    unsigned long v10;  // [bp-0x38]
    char *v11;  // [bp-0x10]
    char v12;  // [bp+0x0]

    v11 = &v12;
    v10 = *(long long *)&g_10002b0;
    v13 = (a0->padding_0)[1];
    v0 = v13->field_10;
    v1 = v13->field_0;
    sub_1a4b00(&v9, a3);
    v2 = &g_e700e8;
    v3 = a1->field_0;
    v4 = a1->field_8;
    v6 = v0;
    v5 = v1;
    v7 = *(long long *)((char *)&a0->field_198 + 8);
    v8 = a2;
    sub_95f0c4(a1->field_8, 78, 4, 0);
    v14 = sub_6b0cc(&v9, &v2);
    sub_181a8(&v9);
    if (*(long long *)&g_10002b0 == v10)
        return v14;
    v15 = ___stack_chk_fail();
    sub_181a8(&v9);
    __Unwind_Resume(v15);
}
