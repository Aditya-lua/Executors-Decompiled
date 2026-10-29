/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9763a8..0x9765e4 (572 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9763a8_1 {
    struct st_9763a8_0 *field_0;
    struct st_9763a8_0 *field_8;
    char field_10;
    char padding_11[7];
    char field_18;
} st_9763a8_1;

typedef struct st_9763a8_2 {
    struct st_9763a8_0 *field_0;
    struct st_9763a8_0 *field_8;
    char padding_10[40];
    unsigned int field_38;
    unsigned int field_3c;
    char field_40;
} st_9763a8_2;

typedef struct st_9763a8_0 {
    char padding_0[16];
    struct st_9763a8_0 *field_10;
    struct st_9763a8_0 *field_18;
    char padding_20[40];
    unsigned int field_48;
    unsigned int field_4c;
    char field_50;
} st_9763a8_0;


st_9763a8_1 * sub_9763a8(st_9763a8_1 *a0, st_9763a8_0 *a1, unsigned int a2)
{
    char v0;  // w8
    unsigned long v1;  // cc_dep1
    char index;  // x8
    st_9763a8_0 *v11;  // x11
    st_9763a8_0 *v12;  // x11
    unsigned long long v13;  // 4102
    char v14;  // x9
    char v15;  // x8
    unsigned long long v16;  // 4112
    char v17;  // x9
    st_9763a8_2 *v18;  // x8
    char v19;  // x10
    unsigned long long v2;  // 4112
    st_9763a8_0 *v20;  // x9
    char idx;  // x8
    st_9763a8_0 *v22;  // x11
    st_9763a8_0 *v23;  // x11
    unsigned long long v24;  // 4102
    char v25;  // x9
    char v26;  // x8
    unsigned long long v3;  // 4102
    unsigned long long v4;  // 4112
    unsigned long long v5;  // 4102
    char v6;  // x9
    st_9763a8_2 *v7;  // x8
    char v8;  // x10
    st_9763a8_0 *v9;  // x9

    if (!(a1->field_50 & 1))
    {
        v0 = *(int *)&a1[1].padding_0[3];
        v1 = v0;
        if (v0 != 1)
        {
            if (!v0)
            {
                v2 = arm64g_calculate_condition(3, v1, 1, 0);
                v3 = arm64g_calculate_condition(0x11, (v2 & 1 ? a2 : 0x40000000), v2 & 1, 0);
                if (!(v3 & 1))
                    return a0;
            }
            else
            {
                v4 = arm64g_calculate_condition(3, v1, 1, 0);
                v5 = arm64g_calculate_condition(16, (v4 & 1 ? a2 : 0x40000000), v4 & 1, 0);
                if (!(v5 & 1))
                    return a0;
            }
            if (a1->field_48 == a2)
                return a0;
            if (a0->field_0 == a1)
                a0->field_0 = a1->field_18;
            v6 = (char)a1->field_10;
            v7 = &a1->field_10;
            if (a0->field_8 == a1)
                a0->field_8 = v6;
            v8 = (char)a1->field_18;
            if (v6)
                *(unsigned long long *)(v6 + 24) = v8;
            if (v8)
                *(unsigned long long *)(v8 + 16) = v6;
            v7->field_0 = 0;
            v7->field_8 = 0;
            a1->field_48 = a2;
            v9 = a0->field_0;
            if (!v9)
            {
                a0->field_0 = a1;
                a0->field_8 = a1;
                v7->field_0 = 0;
                v7->field_8 = 0;
                return a0;
            }
            index = 0;
            v11 = v9;
            while (1)
            {
                v12 = v11;
                if (v12->field_4c >= a1->field_4c && !(v13 = arm64g_calculate_condition(131, v12->field_4c, a1->field_4c, 0), !(v13 & 1) && a2 < v12->field_48))
                    break;
                index = (char)v12;
                v11 = v12->field_18;
                if (!v12->field_18)
                {
                    v15 = (char)a0->field_8;
                    a1->field_10 = v15;
                    a1->field_18 = 0;
                    a0->field_8 = a1;
                    if (v15)
                    {
                        *(st_9763a8_0 **)(v15 + 24) = a1;
                        return a0;
                    }
                    return a0;
                }
            }
            if (index)
            {
                v14 = *(long long *)(index + 24);
                a1->field_10 = index;
                a1->field_18 = v14;
                if (v14)
                    *(st_9763a8_0 **)(v14 + 16) = a1;
            }
            else
            {
                a1->field_18 = v9;
                a0->field_0 = a1;
                v9->field_10 = a1;
                if (!a0->field_8)
                {
                    a0->field_8 = a1;
                    return a0;
                }
                return a0;
            }
            *(st_9763a8_0 **)(index + 24) = a1;
            if (a0->field_8 == index)
            {
                a0->field_8 = a1;
                return a0;
            }
            return a0;
        }
        else
        {
            v16 = arm64g_calculate_condition(1, a2, 1, 0);
            if (!(v16 & 1))
                a1->field_48 = a2;
            if (*(long long *)&a0->field_10 == a1)
                *(struct st_9763a8_0 **)&a0->field_10 = a1->field_18;
            v17 = (char)a1->field_10;
            v18 = &a1->field_10;
            if (*(long long *)&a0->field_18 == a1)
                *(unsigned long long *)&a0->field_18 = v17;
            v19 = (char)a1->field_18;
            if (v17)
                *(unsigned long long *)(v17 + 24) = v19;
            if (v19)
                *(unsigned long long *)(v19 + 16) = v17;
            v18->field_0 = 0;
            v18->field_8 = 0;
            v20 = a0->field_0;
            if (!v20)
            {
                a0->field_0 = a1;
                a0->field_8 = a1;
                v18->field_0 = 0;
                v18->field_8 = 0;
                *(unsigned int *)&a1[1].padding_0[3] = 0;
                return a0;
            }
            idx = 0;
            v22 = v20;
            while (1)
            {
                v23 = v22;
                if (v23->field_4c >= a1->field_4c && !(v24 = arm64g_calculate_condition(131, v23->field_4c, a1->field_4c, 0), !(v24 & 1) && a1->field_48 < v23->field_48))
                    break;
                idx = (char)v23;
                v22 = v23->field_18;
                if (!v23->field_18)
                {
                    v26 = (char)a0->field_8;
                    a1->field_10 = v26;
                    a1->field_18 = 0;
                    a0->field_8 = a1;
                    if (v26)
                    {
                        *(st_9763a8_0 **)(v26 + 24) = a1;
                        *(unsigned int *)&a1[1].padding_0[3] = 0;
                        return a0;
                    }
                    *(unsigned int *)&a1[1].padding_0[3] = 0;
                    return a0;
                }
            }
            if (idx)
            {
                v25 = *(long long *)(idx + 24);
                a1->field_10 = idx;
                a1->field_18 = v25;
                if (v25)
                    *(st_9763a8_0 **)(v25 + 16) = a1;
            }
            else
            {
                a1->field_18 = v20;
                a0->field_0 = a1;
                v20->field_10 = a1;
                if (!a0->field_8)
                {
                    a0->field_8 = a1;
                    *(unsigned int *)&a1[1].padding_0[3] = 0;
                    return a0;
                }
                *(unsigned int *)&a1[1].padding_0[3] = 0;
                return a0;
            }
            *(st_9763a8_0 **)(idx + 24) = a1;
            if (a0->field_8 == idx)
            {
                a0->field_8 = a1;
                *(unsigned int *)&a1[1].padding_0[3] = 0;
                return a0;
            }
            *(unsigned int *)&a1[1].padding_0[3] = 0;
            return a0;
        }
    }
}
