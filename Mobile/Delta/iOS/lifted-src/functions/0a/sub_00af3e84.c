/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaf3e84..0xaf3fbc (312 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_af3e84_0 {
    char padding_0[233];
    char field_e9;
    char padding_ea[102];
    unsigned long long field_150;
} st_af3e84_0;


int sub_af3e84(unsigned int a0, st_af3e84_0 *a1, unsigned long long a2)
{
    unsigned long long v2;  // x23
    unsigned int v3;  // x22
    unsigned long v8;  // cc_dep2
    unsigned long v9;  // cc_op
    unsigned long v10;  // cc_dep1
    unsigned long v11;  // cc_dep2
    unsigned long v12;  // cc_ndep
    unsigned long v13;  // 4112
    unsigned int v4;  // w0
    unsigned long long v14;  // 4127
    unsigned int v15;  // x21
    unsigned int v16;  // w0
    unsigned long v17;  // 4112
    unsigned long v18;  // cc_op
    unsigned long v19;  // cc_dep1
    unsigned long v20;  // cc_dep2
    unsigned long v21;  // 4112
    unsigned long long v22;  // 4127
    unsigned long v5;  // 4112
    unsigned long v6;  // cc_op
    unsigned long v7;  // cc_dep1
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a1->field_150;
    if (v2)
    {
        if (*(long long *)(v2 + 8) && (int)sub_ad69e4(*(long long *)(v2 + 8)) >= 1)
        {
            v3 = 0;
            do
            {
                v4 = sub_a99eac(sub_ad69f8(*(long long *)(v2 + 8), v3), v3);
                if ((unsigned int)a2 & 16)
                {
                    v5 = arm64g_calculate_condition(v9 | 16, v10, v11, v12);
                    v6 = 3;
                    v7 = (v5 & 1 ? v4 : 0);
                    v8 = (v5 & 1 ? 910 : 0);
                }
                else
                {
                    v13 = arm64g_calculate_condition(v9 | 16, v10, v11, v12);
                    v6 = 0;
                    v7 = (v13 & 1 ? v4 : 0);
                    v8 = (v13 & 1 ? 910 : 0);
                }
                v14 = arm64g_calculate_condition(v6, v7, v8, 0);
                if (v4 == a0 || v14 & 1)
                    return 2;
                v3 += 1;
            } while ((int)v3 < (int)sub_ad69e4(*(long long *)(v2 + 8)));
        }
        if (*(long long *)v2)
        {
            if ((int)sub_ad69e4(*(long long *)v2) < 1)
                return 2;
            v15 = 0;
            do
            {
                v16 = sub_a99eac(sub_ad69f8(*(long long *)v2, v15), v15);
                if ((unsigned int)a2 & 16)
                {
                    v17 = arm64g_calculate_condition(v9 | 16, v10, v11, v12);
                    v18 = 3;
                    v19 = (v17 & 1 ? v16 : 0);
                    v20 = (v17 & 1 ? 910 : 0);
                }
                else
                {
                    v21 = arm64g_calculate_condition(v9 | 16, v10, v11, v12);
                    v18 = 0;
                    v19 = (v21 & 1 ? v16 : 0);
                    v20 = (v21 & 1 ? 910 : 0);
                }
                v22 = arm64g_calculate_condition(v18, v19, v20, 0);
                if (v16 == a0 || v22 & 1)
                    return 1;
                v15 += 1;
            } while ((int)v15 < (int)sub_ad69e4(*(long long *)v2));
            return 2;
        }
    }
    if (a2 >> 3 & 1 && sub_aea738(a1, 0xffffffff, 0) == 1 && !(a2 >> 2 & 1) && a1->field_e9 >> 5 & 1)
        return 1;
    return 3;
}
