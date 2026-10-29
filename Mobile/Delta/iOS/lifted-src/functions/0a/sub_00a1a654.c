/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa1a654..0xa1a70c (184 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


int sub_a1a654(void* a0, void* a1)
{
    void* v2;  // x8
    unsigned long v3;  // cc_dep1
    unsigned long long v12;  // 4112
    unsigned long long v13;  // 4102
    unsigned long long v14;  // 4112
    unsigned long long v15;  // 4102
    long long v16;  // x1
    unsigned int v4;  // w8
    unsigned int v5;  // w9
    unsigned long v6;  // 4112
    unsigned long v7;  // cc_op
    unsigned long v8;  // cc_dep1
    unsigned long long v9;  // 4112
    unsigned long v10;  // 4112
    unsigned long long v11;  // 4112
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = *(long long *)a0;
    if ((long long)v2[104])
    {
        v3 = v2;
        if (v2 == *(long long *)a1)
        {
            v4 = (int)a0[8];
            v5 = (int)a1[8];
            if (v5)
            {
                v6 = arm64g_calculate_condition(20, v3, *(long long *)a1, 0);
                v7 = 3;
                v8 = (v6 & 1 ? v4 : 0x40000000);
                v9 = arm64g_calculate_condition(19, v8, 0, 0);
                if (!(v9 & 1))
                    goto LABEL_a1a686;
LABEL_a1a685:
                v12 = arm64g_calculate_condition(v7 | 16, v8, 0, 0);
                v13 = arm64g_calculate_condition(19, (v12 & 1 ? v4 : 0x40000000), (v12 & 1 ? v5 : 0), 0);
                if (!(v13 & 1))
                {
                    if (a0 != a1)
                        goto *((void *)((long long)v2[104]));
                    else
                        return 1;
                }
            }
            else
            {
                v10 = arm64g_calculate_condition(20, v3, *(long long *)a1, 0);
                v7 = 0;
                v8 = (v10 & 1 ? v4 : 0x40000000);
                v11 = arm64g_calculate_condition(16, v8, 0, 0);
                if (v11 & 1)
                    goto LABEL_a1a685;
LABEL_a1a686:
                v14 = arm64g_calculate_condition(v7 | 16, v8, 0, 0);
                v15 = arm64g_calculate_condition(16, (v14 & 1 ? v4 : 0x40000000), (v14 & 1 ? v5 : 0), 0);
                if (!(v15 & 1))
                {
                    if (a0 != a1)
                        goto *((void *)((long long)v2[104]));
                    else
                        return 1;
                }
            }
        }
        sub_a368c8();
        sub_a369bc("crypto/ec/ec_lib.c", 780, "EC_POINT_copy");
        v16 = 101;
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/ec/ec_lib.c", 773, "EC_POINT_copy");
        v16 = 786689;
    }
    sub_a36abc(16, v16, 0);
    return 0;
}
