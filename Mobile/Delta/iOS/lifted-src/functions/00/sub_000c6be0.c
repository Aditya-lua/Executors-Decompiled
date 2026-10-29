/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc6be0..0xc6cb4 (212 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


void sub_c6be0(unsigned long long idx, unsigned long a1, unsigned long a2, unsigned long a3, unsigned int a4, unsigned long a5, unsigned int a6)
{
    unsigned long long v2;  // x0
    unsigned long long v3;  // x8
    unsigned long long v12;  // 4105
    unsigned long long v13;  // 4105
    unsigned long long v4;  // x9
    unsigned int v5;  // w8
    unsigned long long v6;  // x9
    unsigned long long v7;  // x9
    unsigned long long v8;  // x10
    unsigned long long v9;  // x11
    unsigned long v10;  // cc_dep1
    unsigned long long v11;  // x10
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_c628c();
    if (!a4 && a2 > a3 + v2 + 64)
    {
        v3 = a1 + v2 + 32;
        *(unsigned long long *)(idx + 30352) = v3;
        v4 = v3 + a3;
        v5 = 1;
    }
    else if (0x10000 >= a3)
    {
        v5 = 0;
        v6 = idx + 30372;
        *(unsigned long long *)(idx + 30352) = v6;
        v4 = v6 + a3;
    }
    else
    {
        v4 = a1 + a5;
        v7 = v4 - a3;
        v8 = v7 + 0xffe0;
        v9 = v8 + a3 - 0x10000;
        v10 = a6;
        if (!a6)
        {
            v11 = v7;
            v12 = arm64g_calculate_condition(3, v10, 0, 0);
            if (!(v12 & 1))
                goto LABEL_c6c86;
LABEL_c6c85:
        }
        else
        {
            v11 = v8;
            v13 = arm64g_calculate_condition(3, v10, 0, 0);
            if (v13 & 1)
                goto LABEL_c6c85;
LABEL_c6c86:
            v4 = v9;
        }
        *(unsigned long long *)(idx + 30352) = v11;
        v5 = 2;
    }
    *(unsigned long long *)(idx + 30360) = v4;
    *(unsigned int *)(idx + 30368) = v5;
    return;
}
