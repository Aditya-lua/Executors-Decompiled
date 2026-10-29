/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa4f498..0xa4f5b4 (284 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_f129e8;
extern char g_10002b0;

unsigned long long sub_a4f498(long long a0, long long a1, long long a2, char *a3, unsigned long long a4)
{
    unsigned long v4;  // cc_op
    unsigned long v5;  // cc_dep1
    unsigned long long v8;  // 4110
    unsigned long long v9;  // 4105
    unsigned long v10;  // cc_dep2
    unsigned long v11;  // cc_ndep
    unsigned long long v12;  // x0
    unsigned long long v13;  // x19
    long long v14;  // x24
    unsigned long long v15;  // x0
    unsigned long long v6;  // 4110
    unsigned long long v7;  // 4105
    char v0;  // [bp-0x458]
    unsigned long v1;  // [bp-0x58]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = *(long long *)&g_10002b0;
    if (g_f129e8)
    {
        v6 = arm64g_calculate_condition(v4 | 16, v5, v10, v11);
        v7 = arm64g_calculate_condition(4, (v6 & 1 ? a3 : 0), 0, 0);
        if (!(v7 & 1))
            goto LABEL_a4f4ea;
LABEL_a4f4e9:
        a3 = &g_f129e8;
    }
    else
    {
        v8 = arm64g_calculate_condition(v4 | 16, v5, v10, v11);
        v9 = arm64g_calculate_condition(0, (v8 & 1 ? a3 : 0), 0, 0);
        if (v9 & 1)
            goto LABEL_a4f4e9;
LABEL_a4f4ea:
    }
    v12 = sub_ad9a4c();
    if (v12)
    {
        v13 = v12;
        if (a2 < 0x3ff)
            v14 = a2;
        else
            v14 = 0x3ff;
        if (!(sub_ad9c70() >> 31 & 1) && (!a4 || !(sub_ad9d08(v13, a3, 0, &v0, a1, v14, a0) >> 31 & 1)))
        {
            v15 = sub_ada010(v13);
            sub_a66ec0(&v0, 0x400);
        }
        else
        {
            v15 = 0xffffffff;
        }
        sub_ad9b6c(v13);
    }
    else
    {
        v15 = 0xffffffff;
    }
    if (*(long long *)&g_10002b0 == v1)
        return v15;
    ___stack_chk_fail();
}
