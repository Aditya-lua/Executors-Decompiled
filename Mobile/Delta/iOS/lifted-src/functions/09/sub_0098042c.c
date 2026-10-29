/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x98042c..0x9804e4 (184 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_98042c_0 {
    char field_0;
    char field_1;
    char padding_2[30];
    long long field_20;
} st_98042c_0;

extern char g_10002b0;

long long sub_98042c(st_98042c_0 *a0)
{
    unsigned long v8;  // x0
    char v0;  // [bp-0x78]
    uint128_t v1;  // [bp-0x70]
    uint128_t v2;  // [bp-0x60]
    uint128_t v3;  // [bp-0x50]
    uint128_t v4;  // [bp-0x40]
    unsigned long v5;  // [bp-0x28]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v5 = *(long long *)&g_10002b0;
    v3 = 0;
    v4 = 0;
    v1 = 0;
    v2 = 0;
    if (sub_ac280c(&v1, 8) && sub_ac2860(&v1, a0->field_20, 0, 0))
    {
        sub_ac290c(&v1, &a0->field_1, a0->field_0);
        if (!sub_ac2a74(&v1, &v0, 8))
            v8 = 0;
        else
            v8 = v0;
    }
    else
    {
        v8 = 0;
    }
    if (*(long long *)&g_10002b0 == v5)
        return v8;
    ___stack_chk_fail();
}
