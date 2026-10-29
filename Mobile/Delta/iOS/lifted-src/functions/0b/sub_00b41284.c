/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb41284..0xb413dc (344 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b41284_1 {
    char padding_0[24];
    struct st_b41284_0 *field_18;
} st_b41284_1;

typedef struct st_b41284_0 {
    char padding_0[8];
    unsigned long long field_8;
    char padding_10[24];
    int field_28;
} st_b41284_0;

extern char g_10002b0;

long long sub_b41284(unsigned long a0, unsigned long a1, long long a2, st_b41284_1 *a3, int a4, unsigned long a5, int a6, int a7)
{
    int v17;  // w23
    unsigned long v18;  // x24
    unsigned long v19;  // x19
    int v20;  // w25
    unsigned long v21;  // x22
    unsigned long v22;  // x19
    uint128_t v0;  // [bp-0xf8]
    uint128_t v1;  // [bp-0xe8]
    unsigned long long v2;  // [bp-0xd8]
    uint128_t v3;  // [bp-0xd0]
    uint128_t v4;  // [bp-0xc0]
    uint128_t v5;  // [bp-0xb0]
    uint128_t v6;  // [bp-0xa8]
    uint128_t v7;  // [bp-0xa0]
    uint128_t v8;  // [bp-0x98]
    uint128_t v9;  // [bp-0x90]
    unsigned long long v10;  // [bp-0x88]
    uint128_t v11;  // [bp-0x80]
    uint128_t v12;  // [bp-0x70]
    unsigned long v13;  // [bp-0x60]
    unsigned long v14;  // [bp-0x58]
    char *v15;  // [bp-0x10]
    char v16;  // [bp+0x0]

    v15 = &v16;
    v17 = a6;
    v14 = *(long long *)&g_10002b0;
    v13 = 0;
    v11 = 0;
    v12 = 0;
    v7 = 0;
    v9 = 0;
    v4 = 0;
    v5 = 0;
    v3 = 0;
    if (a3->field_18->field_28 == a4)
    {
        v18 = 0;
        v19 = a3 + 1;
        v20 = a4 * a7;
        a7 = v17;
    }
    else
    {
        v18 = a3->field_18->field_8;
        v19 = &a3[1].padding_0[8];
        v20 = v17 - a3->field_18->field_28 * v17;
    }
    v21 = sub_a5d168();
    if (v21 && (int)sub_a5cf34(v21) >= 1)
    {
        sub_a71670(a2, a5 + v20, a7);
        if (v18)
        {
            sub_a71618("group", v18, 0);
            v6 = v0;
            v8 = v1;
            v10 = v2;
        }
        v22 = (int)sub_a5cfb0(v21, v19, 5, &v3) > 0;
    }
    else
    {
        v22 = 0;
    }
    sub_a5d6b0(v21);
    if (*(long long *)&g_10002b0 == v14)
        return v22;
    ___stack_chk_fail();
}
