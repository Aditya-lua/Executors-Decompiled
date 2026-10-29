/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb43c84..0xb43d50 (204 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b43c84_0 {
    char padding_0[8];
    long long field_8;
} st_b43c84_0;

extern char g_10002b0;

unsigned long long sub_b43c84(st_b43c84_0 *a0, long long a1, unsigned long long *a2)
{
    unsigned long long v9;  // x0
    long long v0;  // [bp-0x94], Other Possible Types: unsigned int
    uint128_t v1;  // [bp-0x90]
    uint128_t v2;  // [bp-0x80]
    uint128_t v3;  // [bp-0x70]
    uint128_t v4;  // [bp-0x60]
    uint128_t v5;  // [bp-0x50]
    unsigned long v6;  // [bp-0x38]
    char *v7;  // [bp-0x10]
    char v8;  // [bp+0x0]

    v7 = &v8;
    v6 = *(long long *)&g_10002b0;
    v4 = 0;
    v5 = 0;
    v2 = 0;
    v3 = 0;
    v1 = 0;
    v0 = 0;
    v9 = sub_a2f9e0();
    if ((unsigned int)v9)
    {
        v9 = sub_a4ca24(a0->field_8, a1, &v0);
        if ((unsigned int)v9)
        {
            v0 = 16;
            sub_a71670("tag", a1, 16);
            v9 = sub_a4dd70(a0->field_8, &v1);
            if ((unsigned int)v9)
            {
                *a2 = v0;
                v9 = 1;
            }
        }
    }
    if (*(long long *)&g_10002b0 == v6)
        return v9;
    ___stack_chk_fail();
}
