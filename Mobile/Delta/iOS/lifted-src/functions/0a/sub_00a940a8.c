/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa940a8..0xa94388 (736 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


void sub_a940a8(char *a0, char *a1, unsigned int a2, unsigned long a3, char *a4, unsigned int *a5, unsigned int a6, unsigned long long *a7)
{
    unsigned long v2;  // x25
    char *iter;  // x21
    unsigned long v8;  // cc_op
    unsigned long v9;  // cc_dep1
    unsigned long v10;  // cc_dep2
    unsigned long v11;  // cc_ndep
    unsigned long long v12;  // 4110
    unsigned long long v13;  // 4105
    char *node;  // x22
    unsigned int v14;  // x2
    char v16;  // x8
    unsigned int v17;  // x8
    unsigned int v18;  // w9
    unsigned int v19;  // x2
    char v20;  // x9
    unsigned int v21;  // x8
    unsigned int v22;  // w9
    unsigned long long v5;  // 4110
    unsigned long long v6;  // 4105
    unsigned int v7;  // w8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = *a5;
    if (!(v2 >> 31 & 1))
    {
        iter = a1;
        node = a0;
        if ((unsigned int)v2)
        {
            v5 = arm64g_calculate_condition(v8 | 16, v9, v10, v11);
            v6 = arm64g_calculate_condition(4, (v5 & 1 ? a2 : 0x40000000), 0, 0);
            v7 = !(v6 & 1);
            if (!a6)
                goto LABEL_a941ec;
LABEL_a940f0:
            if (v7)
            {
                do
                {
                    v14 = a2;
                    v16 = a4[v2 & 0xffffffff] ^ *node;
                    a4[v2 & 0xffffffff] = v16;
                    *iter = v16;
                    iter += 1;
                    v17 = v14 - 1;
                    v18 = (unsigned int)v2 + 1;
                    v2 = v18 & 15;
                } while (v18 & 15 && (node += 1, a2 = v17, v14 != 1));
                if (v17 >= 16)
                    a7();
            }
            else
            {
                v17 = a2;
                if (16 <= v17)
                    a7();
            }
            if (v17)
                a7();
        }
        else
        {
            v12 = arm64g_calculate_condition(v8 | 16, v9, v10, v11);
            v13 = arm64g_calculate_condition(0, (v12 & 1 ? a2 : 0x40000000), 0, 0);
            v7 = !(v13 & 1);
            if (a6)
                goto LABEL_a940f0;
LABEL_a941ec:
            if (v7)
            {
                do
                {
                    v19 = a2;
                    v20 = *node;
                    node += 1;
                    *iter = v20 ^ a4[v2 & 0xffffffff];
                    iter += 1;
                    a4[v2 & 0xffffffff] = v20;
                    v21 = v19 - 1;
                    v22 = (unsigned int)v2 + 1;
                    v2 = v22 & 15;
                } while (v22 & 15 && (a2 = v21, v19 != 1));
                if (v21 >= 16)
                    a7();
            }
            else
            {
                v21 = a2;
                if (16 <= v21)
                    a7();
            }
            if (v21)
                a7();
        }
    }
    else
    {
        v2 = 0xffffffff;
    }
    *a5 = v2;
    return;
}
