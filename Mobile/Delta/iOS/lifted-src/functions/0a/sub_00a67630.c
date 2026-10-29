/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa67630..0xa67718 (232 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a67630_0 {
    void* field_0;
    unsigned long long field_8;
} st_a67630_0;


unsigned long long sub_a67630(st_a67630_0 *a0, unsigned long a1)
{
    unsigned long long v3;  // x10
    void* v4;  // x9
    unsigned long long v9;  // 4102
    unsigned long v10;  // cc_op
    unsigned long v11;  // cc_dep1
    unsigned long v12;  // cc_dep2
    unsigned long v13;  // cc_ndep
    unsigned long long v14;  // 4110
    unsigned long long v15;  // 4102
    void* v5;  // x8
    unsigned long v16;  // x1
    void* v17;  // x8
    unsigned long long v18;  // x11
    unsigned long long v19;  // x10
    unsigned long v20;  // cc_dep1
    unsigned long v21;  // cc_dep2
    unsigned long long v22;  // 4112
    unsigned long long v23;  // x8
    unsigned long long v24;  // x8
    unsigned int v6;  // w11
    unsigned long v25;  // x10
    unsigned long v26;  // x9
    unsigned long long v27;  // 4112
    unsigned long long v28;  // 4102
    unsigned long long v29;  // 4112
    unsigned long long v30;  // 4102
    unsigned long long v31;  // x30
    unsigned long long v7;  // x12
    unsigned long long v8;  // 4110
    char *v0;  // [bp-0x10]
    unsigned long long v1;  // [bp-0x8]
    char v2;  // [bp+0x0]

    v3 = a0->field_8;
    if (!v3)
        return 0;
    v4 = a0->field_0;
    v5 = v4;
    v6 = *(char *)v5;
    v7 = v3 - 1;
    a0->field_0 = v5 + 1;
    a0->field_8 = v7;
    if (v6 == 2)
    {
        v8 = arm64g_calculate_condition(v10, v11, v12, v13);
        v9 = arm64g_calculate_condition(4, (v8 & 1 ? v7 : 0x40000000), 0, 0);
        if (v9 & 1)
            return 0;
    }
    else
    {
        v14 = arm64g_calculate_condition(v10, v11, v12, v13);
        v15 = arm64g_calculate_condition(0, (v14 & 1 ? v7 : 0x40000000), 0, 0);
        if (v15 & 1)
            return 0;
    }
    v16 = (char)v4[1];
    v17 = v4 + 2;
    v18 = v3 - 2;
    a0->field_0 = v17;
    a0->field_8 = v18;
    if ((long long)v16 >= 0)
    {
        v19 = v18 - v16;
        v20 = v18;
        v21 = v16;
        if (v18 < v16)
            return 0;
    }
    else
    {
        v22 = arm64g_calculate_condition(1, v16 & 0xff, 126, 0);
        if (v22 & 1)
        {
            v24 = v3 - 4;
            if (v3 < 4)
                return 0;
            v25 = (short)v4[2];
            v16 = (unsigned int)((v25 & 0xff00) >> 8) | (unsigned int)v25 * 0x100 & 0xff00ff00;
            v19 = v24 - v16;
            v20 = v24;
            v21 = v16;
            if (v16 > v24)
                return 0;
            v17 = v4 + 4;
        }
        else if ((char)v16 != 129)
        {
            return 0;
        }
        else if (v18)
        {
            v16 = *(char *)v17;
            v23 = v3 - 3;
            v19 = v23 - v16;
            v20 = v23;
            v21 = v16;
            if (v23 < v16)
                return 0;
            v17 = v4 + 3;
        }
        else
        {
            return 0;
        }
    }
    a0->field_0 = v17 + v16;
    a0->field_8 = v19;
    if (!v16)
        return 0;
    v26 = *(char *)v17;
    if (v26 >> 31 & 1)
        return 0;
    if (v16 != 1)
    {
        v27 = arm64g_calculate_condition(20, v20, v21, 0);
        v28 = arm64g_calculate_condition(19, (v27 & 1 ? v26 & 0xffffffff : 0), 0, 0);
        if (!(v28 & 1))
            goto LABEL_a67698;
    }
    else
    {
        v29 = arm64g_calculate_condition(20, v20, v21, 0);
        v30 = arm64g_calculate_condition(16, (v29 & 1 ? v26 & 0xffffffff : 0), 0, 0);
        if (!(v30 & 1))
        {
LABEL_a67698:
            if ((char)v17[1] >= 0)
                return 0;
        }
    }
    v0 = &v2;
    v1 = v31;
    return sub_9e4db0(v17) != 0;
}
