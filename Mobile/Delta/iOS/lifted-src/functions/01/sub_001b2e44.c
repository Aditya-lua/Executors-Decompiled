/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1b2e44..0x1b2ef4 (176 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1b2e44_0 {
    char field_0;
} st_1b2e44_0;

extern char g_10002b0;

unsigned long long sub_1b2e44(long long a0, long long a1)
{
    unsigned long long v6;  // x0
    unsigned int v7;  // w0
    unsigned long long v8;  // 4112
    st_1b2e44_0 **v0;  // [bp-0x438], Other Possible Types: char
    st_1b2e44_0 *v1;  // [bp-0x430]
    char v2;  // [bp-0x428]
    unsigned long v3;  // [bp-0x28]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v3 = *(long long *)&g_10002b0;
    v1 = &v0;
    v0 = &v1;
    v6 = sub_ab1c50(a1);
    if (v6)
    {
        v7 = sub_af8ba0();
        v8 = arm64g_calculate_condition(1, v7, 1, 0);
        if (!(v8 & 1))
        {
            v6 = sub_1c06b8(a0, &v2, v7);
        }
        else
        {
            if (*(long long *)&g_10002b0 == v3)
                return 0;
            ___stack_chk_fail();
        }
    }
    if (*(long long *)&g_10002b0 == v3)
        return v6;
    ___stack_chk_fail();
}
