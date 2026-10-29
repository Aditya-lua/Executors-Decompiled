/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa94558..0xa947f4 (668 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


void sub_a94558(char *a0, char *iter, unsigned int a2, unsigned long a3, unsigned long a4, char *a5, unsigned int *a6, unsigned long long *a7)
{
    unsigned int v2;  // w27
    unsigned long v3;  // cc_op
    unsigned long v6;  // cc_ndep
    unsigned long long v7;  // 4110
    unsigned long long v8;  // 4102
    unsigned long v9;  // cc_dep1
    unsigned long v10;  // cc_dep2
    unsigned int v11;  // x26
    unsigned long long v12;  // x2
    char *v13;  // x22
    unsigned int v14;  // w8
    unsigned long long v4;  // 4110
    unsigned long long v5;  // 4102
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = *a6;
    if (v2)
    {
        v4 = arm64g_calculate_condition(v3 | 16, v9, v10, v6);
        v5 = arm64g_calculate_condition(20, (v4 & 1 ? a2 : 0x40000000), 0, 0);
        if (v5 & 1)
            goto LABEL_a945a8;
LABEL_a945a0:
        v11 = a2;
    }
    else
    {
        v7 = arm64g_calculate_condition(v3 | 16, v9, v10, v6);
        v8 = arm64g_calculate_condition(16, (v7 & 1 ? a2 : 0x40000000), 0, 0);
        if (!(v8 & 1))
            goto LABEL_a945a0;
        do
        {
LABEL_a945a8:
            v12 = a2;
            v13 = a0 + 1;
            *iter = a5[v2] ^ *a0;
            iter += 1;
            v11 = v12 - 1;
            v14 = v2 + 1;
            v2 = v14 & 15;
        } while (v14 & 15 && (a0 = v13, a2 = v11, v12 != 1));
    }
    if (v11 >= 16)
    {
        a7();
    }
    else if (v11)
    {
        a7();
    }
    else
    {
        *a6 = v2;
        return;
    }
}
