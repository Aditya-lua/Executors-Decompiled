/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9562c4..0x95649c (472 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9562c4_1 {
    char padding_0[72];
    int field_48;
    char padding_4c[692];
    struct st_9562c4_0 *field_300;
    char padding_308[1400];
    unsigned long long field_880;
} st_9562c4_1;

typedef struct st_9562c4_0 {
    char padding_0[28];
    unsigned int field_1c;
} st_9562c4_0;


unsigned long long sub_9562c4(st_9562c4_1 *a0, long long a1)
{
    unsigned long v3;  // x21
    int v4;  // w8
    unsigned long v9;  // cc_dep2
    unsigned long v10;  // cc_ndep
    unsigned long long v11;  // 4102
    unsigned long v12;  // cc_op
    unsigned long v13;  // cc_dep1
    unsigned long v14;  // cc_dep2
    unsigned long v15;  // cc_ndep
    unsigned long v16;  // 4112
    unsigned long long v17;  // 4102
    unsigned int v5;  // w9
    unsigned long long v18;  // x0
    unsigned long long v19;  // x0
    unsigned long long v20;  // x0
    unsigned long long v21;  // x0
    unsigned long long v22;  // x0
    unsigned int v23;  // w9
    unsigned long long v24;  // 4112
    unsigned long long v25;  // 4102
    unsigned long long v26;  // 4112
    unsigned long long v27;  // 4102
    unsigned long long v28;  // x0
    unsigned long long v29;  // x0
    unsigned long long v30;  // x0
    unsigned long long v31;  // x0
    unsigned long v32;  // x8
    unsigned long long v33;  // x0
    unsigned long long v34;  // x0
    unsigned long long v35;  // x0
    unsigned long v6;  // 4112
    unsigned long v7;  // cc_op
    unsigned long v8;  // cc_dep1
    char v0;  // [bp-0x34]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v0 = 0;
    if (!*(long long *)(a0->field_880 + 48))
    {
        sub_96a0bc(&v0, a0, 0x5000e);
        v3 = a0->field_300->field_1c;
        v4 = a0->field_48;
        v5 = (unsigned int)v3 & 16;
        if (769 <= v4)
        {
            v6 = arm64g_calculate_condition(v12 | 160, v13, v14, v15);
            v7 = 3;
            v8 = (v6 & 1 ? v5 : 0x40000000);
            v9 = 0;
            v10 = 0;
            v11 = arm64g_calculate_condition(19, v8, 0, 0);
            if (v11 & 1)
                goto LABEL_95641c;
        }
        else
        {
            v16 = arm64g_calculate_condition(v12 | 160, v13, v14, v15);
            v7 = 0;
            v8 = (v16 & 1 ? v5 : 0x40000000);
            v9 = 0;
            v10 = 0;
            v17 = arm64g_calculate_condition(16, v8, 0, 0);
            if (v17 & 1)
            {
LABEL_95641c:
                v18 = sub_c68d5c(a1, 22, 1);
                if (!(unsigned int)v18)
                    return v18;
                v19 = sub_c68d5c(a1, 67, 1);
                if (!(unsigned int)v19)
                    return v19;
                v20 = sub_c68d5c(a1, 0x44, 1);
                if (!(unsigned int)v20)
                    return v20;
                v21 = sub_c68d5c(a1, 0xee, 1);
                if (!(unsigned int)v21)
                    return v21;
                v22 = sub_c68d5c(a1, 239, 1);
                if (!(unsigned int)v22)
                    return v22;
                v4 = a0->field_48;
            }
        }
        v23 = (unsigned int)v3 & 0x200;
        if (0x303 <= v4)
        {
            v24 = arm64g_calculate_condition(v7 | 160, v8, v9, v10);
            v25 = arm64g_calculate_condition(3, (v24 & 1 ? v23 : 0x40000000), 0, 0);
            if (!(v25 & 1))
                goto LABEL_95634c;
        }
        else
        {
            v26 = arm64g_calculate_condition(v7 | 160, v8, v9, v10);
            v27 = arm64g_calculate_condition(0, (v26 & 1 ? v23 : 0x40000000), 0, 0);
            if (!(v27 & 1))
            {
LABEL_95634c:
                v28 = sub_c68d5c(a1, 67, 1);
                if (!(unsigned int)v28)
                    return v28;
                v29 = sub_c68d5c(a1, 0x44, 1);
                if (!(unsigned int)v29)
                    return v29;
                v4 = a0->field_48;
            }
        }
        if (v4 == 0x300 && v3 >> 1 & 1)
        {
            v30 = sub_c68d5c(a1, 5, 1);
            if (!(unsigned int)v30)
            {
                return v30;
            }
            else if (!(*&v0 >> 1 & 1))
            {
                v31 = sub_c68d5c(a1, 6, 1);
                if (!(unsigned int)v31)
                    return v31;
            }
        }
        v32 = v0;
        if (!(v32 & 1))
        {
            v33 = sub_c68d5c(a1, 1, 1);
            if (!(unsigned int)v33)
                return v33;
            v32 = v0;
        }
        if (!(v32 >> 1 & 1))
        {
            v34 = sub_c68d5c(a1, 2, 1);
            if (!(unsigned int)v34)
                return v34;
        }
        if (a0->field_48 < 769 || *&v0 >> 3 & 1)
            return 1;
        v35 = sub_c68d5c(a1, 64, 1);
        if (!(unsigned int)v35)
            return v35;
        return 1;
    }
}
