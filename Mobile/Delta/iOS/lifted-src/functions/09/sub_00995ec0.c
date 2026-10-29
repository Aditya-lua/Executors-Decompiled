/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x995ec0..0x995f1c (92 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_995ec0(unsigned long a0, char *a1, unsigned long a2, unsigned long long *a3)
{
    unsigned int v3;  // w9
    unsigned long v4;  // cc_dep1
    unsigned long long v5;  // x9
    unsigned long long v6;  // 4105
    unsigned long long v7;  // 4105
    unsigned long long v8;  // x30
    char *v0;  // [bp-0x10]
    unsigned long long v1;  // [bp-0x8]
    char v2;  // [bp+0x0]

    if (*(int *)(a0 + 4120))
    {
        v3 = *a1;
        v4 = v3 & 0xff;
        v5 = v3 == 23;
        if (v3 != 23)
        {
            v6 = arm64g_calculate_condition(3, v4, 23, 0);
            if (!(v6 & 1))
                goto LABEL_995ee6;
LABEL_995ee5:
        }
        else
        {
            v7 = arm64g_calculate_condition(3, v4, 23, 0);
            if (v7 & 1)
                goto LABEL_995ee5;
LABEL_995ee6:
        }
    }
    else
    {
        v5 = 0;
    }
    v0 = &v2;
    v1 = v8;
    *a3 = v5;
    return sub_997034() != 0;
}
