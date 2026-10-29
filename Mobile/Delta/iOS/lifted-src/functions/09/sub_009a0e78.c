/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9a0e78..0x9a0ff4 (380 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9a0e78_1 {
    struct st_9a0e78_0 *field_0;
    unsigned long long field_8;
} st_9a0e78_1;

typedef struct st_9a0e78_2 {
    unsigned short field_0;
    char padding_2[2];
    unsigned int field_4;
    unsigned int field_8;
    unsigned int field_c;
    unsigned long long field_10;
    unsigned long long field_18;
    unsigned long long field_20;
    unsigned long long field_28;
} st_9a0e78_2;

typedef struct st_9a0e78_0 {
    unsigned short field_0;
    char padding_2[2];
    unsigned int field_4;
} st_9a0e78_0;


unsigned long long sub_9a0e78(unsigned long long a0, st_9a0e78_1 *a1, unsigned int a2, unsigned long long a3, unsigned long long a4, unsigned long long a5, unsigned long long a6, unsigned long a7, unsigned long a8, unsigned long long a9)
{
    st_9a0e78_1 *v1;  // x19
    unsigned long v7;  // cc_op
    unsigned long v8;  // cc_dep1
    unsigned long v9;  // cc_dep2
    unsigned long v10;  // cc_ndep
    unsigned long long v11;  // 4112
    unsigned long long v12;  // 4105
    unsigned int v3;  // w8
    unsigned long v13;  // x8
    unsigned int *iter;  // x9
    unsigned long v15;  // x10
    unsigned long v16;  // x10
    unsigned long v17;  // cc_dep1
    unsigned int v18;  // w11
    unsigned long long v19;  // 4112
    unsigned long long v20;  // 4102
    unsigned long long v21;  // 4112
    unsigned long long v22;  // 4102
    unsigned long long v23;  // x0
    st_9a0e78_2 *ptr;  // x10
    unsigned long long v4;  // 4112
    unsigned long long v5;  // 4105
    unsigned long v6;  // x8
    char *v0;  // [bp-0x10]

    v0 = &a8;
    v1 = a1;
    if (!a5 && a6)
        return 0;
    if (!v1)
    {
        v1 = *(long long *)(a0 + 344) + 128;
        if ((unsigned int)a3 == 18)
        {
LABEL_9a0ef4:
            if (a0 && a4 >> 7 & 1 && sub_9633a4(a0))
                return 0;
        }
    }
    else if ((unsigned int)a3 == 18)
    {
        goto LABEL_9a0ef4;
    }
    v3 = sub_9a0ff4(a3);
    if ((unsigned int)a3 != 18)
    {
        v4 = arm64g_calculate_condition(v7 | 16, v8, v9, v10);
        v5 = arm64g_calculate_condition(3, (v4 & 1 ? v3 : 0x40000000), 0, 0);
        v6 = !(v5 & 1);
        if ((unsigned int)a3 > 0xffff)
            return 0;
    }
    else
    {
        v11 = arm64g_calculate_condition(v7 | 16, v8, v9, v10);
        v12 = arm64g_calculate_condition(0, (v11 & 1 ? v3 : 0x40000000), 0, 0);
        v6 = !(v12 & 1);
        if ((unsigned int)a3 > 0xffff)
            return 0;
    }
    if (v6 & 1)
        return 0;
    v13 = v1->field_8;
    if (v13)
    {
        iter = &v1->field_0->field_4;
        v15 = v13;
        do
        {
            v16 = v15;
            if (*(short *)((char *)iter - 4) == (unsigned int)a3)
            {
                v17 = a2;
                if (a2 == 2)
                    return 0;
                v18 = *iter;
                if (v18 != a2)
                {
                    v19 = arm64g_calculate_condition(19, v17, 2, 0);
                    v20 = arm64g_calculate_condition(19, (v19 & 1 ? v18 : 0x40000000), (v19 & 1 ? 2 : 0), 0);
                    if (!(v20 & 1))
                        return 0;
                }
                else
                {
                    v21 = arm64g_calculate_condition(19, v17, 2, 0);
                    v22 = arm64g_calculate_condition(16, (v21 & 1 ? v18 : 0x40000000), (v21 & 1 ? 2 : 0), 0);
                    if (!(v22 & 1))
                        return 0;
                }
            }
        } while ((iter += 14, v15 = v16 - 1, v16 != 1));
    }
    v23 = sub_a6c1b4(v1->field_0, 56 + 56 * v13, "ssl/statem/extensions_cust.c", 447);
    if (v23)
    {
        v1->field_0 = v23;
        ptr = v23 + 56 * v1->field_8;
        memset(ptr, 0, 48);
        ptr->field_28 = a8;
        *(unsigned long long *)&ptr[1].field_0 = 0;
        ptr->field_4 = a2;
        ptr->field_8 = a4;
        ptr->field_10 = a5;
        ptr->field_18 = a6;
        ptr->field_0 = a3;
        ptr->field_c = (!a0) * 4;
        ptr->field_20 = a7;
        *(unsigned long long *)&ptr[1].field_0 = a9;
        v1->field_8 = v1->field_8 + 1;
        return 1;
    }
    return v23;
}
