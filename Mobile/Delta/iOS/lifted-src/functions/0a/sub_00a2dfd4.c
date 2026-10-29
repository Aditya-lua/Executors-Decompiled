/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa2dfd4..0xa2e114 (320 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a2dfd4_0 {
    long long field_0;
    long long field_8;
    long long field_10;
    unsigned int field_18;
    char padding_1c[4];
    long long field_20;
} st_a2dfd4_0;


unsigned long long sub_a2dfd4(st_a2dfd4_0 *a0, st_a2dfd4_0 *a1)
{
    unsigned long v2;  // cc_dep1
    unsigned long v3;  // cc_dep2
    long long v12;  // x8
    unsigned long long v13;  // x0
    long long v14;  // x9
    long long v15;  // x8
    unsigned long long v16;  // x0
    unsigned long long v17;  // x8
    unsigned long long v18;  // 4110
    long long v19;  // x8
    long long v4;  // x9
    long long v5;  // x8
    unsigned long long v6;  // 4110
    unsigned long long v7;  // 4102
    unsigned long long v8;  // 4110
    unsigned long long v9;  // 4102
    unsigned long long v10;  // x8
    long long v11;  // x9
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0->field_18;
    v3 = a1->field_18;
    if (a0->field_18 == a1->field_18)
    {
        v4 = a0->field_10;
        v5 = a1->field_10;
        if (v4)
        {
            v6 = arm64g_calculate_condition(19, v2, v3, 0);
            v7 = arm64g_calculate_condition(20, (v6 & 1 ? v5 : 0x40000000), 0, 0);
            if (v7 & 1)
                goto LABEL_a2e024;
LABEL_a2e004:
            if (v4)
            {
                return 0xffffffff;
            }
            else if (v5)
            {
                return v5 != 0;
            }
        }
        else
        {
            v8 = arm64g_calculate_condition(19, v2, v3, 0);
            v9 = arm64g_calculate_condition(16, (v8 & 1 ? v5 : 0x40000000), 0, 0);
            if (!(v9 & 1))
                goto LABEL_a2e004;
LABEL_a2e024:
            v10 = sub_a6e200(v4, v5);
            if ((unsigned int)v10)
                return v10;
        }
        v11 = a0->field_0;
        v12 = a1->field_0;
        if (v11 && v12)
        {
            v13 = sub_a6e200(v11, v12);
        }
        else
        {
            v13 = v12 != 0;
            if (v11)
                return 0xffffffff;
        }
        if ((unsigned int)v13)
            return v13;
        v14 = a0->field_8;
        v15 = a1->field_8;
        if (v14 && v15)
        {
            v16 = sub_a6e200(v14, v15);
        }
        else
        {
            v16 = v15 != 0;
            if (v14)
                return 0xffffffff;
        }
        if ((unsigned int)v16)
            return v16;
        if (!a0->field_20)
            v17 = a1->field_20 != 0;
        else
            v17 = 0xffffffff;
        return v17;
    }
    else
    {
        v18 = arm64g_calculate_condition(179, v2, v3, 0);
        if (v18 & 1)
            v19 = 0xffffffff;
        else
            v19 = 0;
        return v19;
    }
}
