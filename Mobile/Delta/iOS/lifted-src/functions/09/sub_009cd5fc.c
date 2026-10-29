/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9cd5fc..0x9cd740 (324 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9cd5fc_0 {
    char padding_0[8];
    unsigned long long field_8;
} st_9cd5fc_0;


long long * sub_9cd5fc(long long a0, long long *a1, st_9cd5fc_0 *a2, unsigned int a3, long long a4)
{
    unsigned int v3;  // w0
    unsigned long long v4;  // 4112
    unsigned long v13;  // cc_ndep
    unsigned long long v14;  // 4122
    unsigned long v15;  // x23
    unsigned int v16;  // w8
    unsigned int v17;  // w8
    unsigned long long v18;  // 4112
    unsigned long long v19;  // 4102
    unsigned long long v20;  // 4112
    unsigned long long v21;  // 4102
    unsigned long long v22;  // 4112
    unsigned int v5;  // w25
    unsigned int v23;  // w8
    unsigned int v24;  // w8
    unsigned long long v25;  // 4112
    unsigned long long v26;  // 4102
    unsigned long long v27;  // 4112
    unsigned long long v28;  // 4102
    unsigned int v6;  // w27
    unsigned long long v7;  // 4125
    unsigned long long v8;  // 4136
    long long *v9;  // x19
    unsigned long v10;  // cc_op
    unsigned long v11;  // cc_dep1
    unsigned long v12;  // cc_dep2
    unsigned int v0;  // [bp-0x64]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v0 = a2->field_8;
    v3 = sub_9cd780();
    v4 = arm64g_calculate_condition(1, v3, 1, 0);
    if (v4 & 1)
        return 0;
    v5 = v3;
    v6 = v0;
    v7 = arm64g_calculate_condition(0x11, v3, 2, 0);
    v8 = arm64g_calculate_condition(1, v3, 2, 0);
    if (v8 & 1)
        v9 = 0;
    else
        v9 = v3;
    v10 = 1;
    v11 = a3;
    v12 = 1;
    v13 = 0;
    v14 = arm64g_calculate_condition(1, a3, 1, 0);
    if (v14 & 1)
        v15 = v6;
    else
        v15 = a3;
    if (a1)
    {
        v16 = v6 + 3;
        v17 = 1 << ((char)v16 & 31) & 0x1fffff & 0xfff80001;
        if (v16 <= 20)
        {
            v18 = arm64g_calculate_condition(145, v11, 1, 0);
            v19 = arm64g_calculate_condition(19, (v18 & 1 ? v17 : 0x40000000), 0, 0);
            if (!(v19 & 1))
                goto LABEL_9cd694;
        }
        else
        {
            v20 = arm64g_calculate_condition(145, v11, 1, 0);
            v21 = arm64g_calculate_condition(16, (v20 & 1 ? v17 : 0x40000000), 0, 0);
            if (!(v21 & 1))
            {
LABEL_9cd694:
                sub_9c755c(a1, (unsigned int)!(v7 & 1) * 2, v9, v15, a4);
            }
        }
        sub_9cd780(a0, *a1, &v0, a2);
        v10 = 1;
        v11 = v5;
        v12 = 2;
        v13 = 0;
        v22 = arm64g_calculate_condition(0x11, v5, 2, 0);
        if (!(v22 & 1))
            sub_9c766c(a1);
        else
            *a1 = *a1 + v5;
    }
    v23 = v6 + 3;
    v24 = 1 << ((char)v23 & 31) & 0x1fffff & 0xfff80001;
    if (v23 <= 20)
    {
        v25 = arm64g_calculate_condition(v10 | 144, v11, v12, v13);
        v26 = arm64g_calculate_condition(19, (v25 & 1 ? v24 : 0x40000000), 0, 0);
        if (v26 & 1)
            return v9;
    }
    else
    {
        v27 = arm64g_calculate_condition(v10 | 144, v11, v12, v13);
        v28 = arm64g_calculate_condition(16, (v27 & 1 ? v24 : 0x40000000), 0, 0);
        if (v28 & 1)
            return v9;
    }
    return sub_9c7680((unsigned int)!(v7 & 1) * 2, v9, v15);
}
