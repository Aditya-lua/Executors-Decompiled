/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaa43e0..0xaa4460 (128 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned long long g_aa4460;
extern unsigned long long g_aa4520;
extern unsigned long long g_aa4640;
extern unsigned long long g_aa4ce0;
extern unsigned int g_f0d568;

unsigned long long * sub_aa43e0(unsigned long long *ptr, unsigned int a1, unsigned long long *a2)
{
    unsigned long long v0;  // 4102
    unsigned long long v1;  // 4102
    unsigned long v2;  // x8
    unsigned long v3;  // cc_dep1
    unsigned long long v4;  // x13
    unsigned long long v5;  // x12
    unsigned long long v6;  // 4105
    unsigned long long v7;  // 4105

    memset(ptr, 0, 32);
    if (!a1)
    {
        ptr = 0;
        v0 = arm64g_calculate_condition(4, a1, 0, 0);
        if (v0 & 1)
            return 0;
    }
    else
    {
        v1 = arm64g_calculate_condition(4, a1, 0, 0);
        if (v1 & 1)
            return ptr;
    }
    v2 = *(long long *)(a1 + 8);
    ptr[4] = *(long long *)a1 & 0xffffffc0fffffff;
    ptr[5] = v2 & 0xffffffc0ffffffc;
    v3 = g_f0d568 & 1;
    v4 = &g_aa4520;
    if (!(g_f0d568 & 1))
    {
        v5 = &g_aa4460;
        v6 = arm64g_calculate_condition(9, v3, 0, 0);
        if (!(v6 & 1))
            goto LABEL_aa4442;
LABEL_aa4441:
    }
    else
    {
        v5 = &g_aa4640;
        v7 = arm64g_calculate_condition(9, v3, 0, 0);
        if (v7 & 1)
            goto LABEL_aa4441;
LABEL_aa4442:
        v4 = &g_aa4ce0;
    }
    *a2 = v5;
    a2[1] = v4;
    return 1;
}
