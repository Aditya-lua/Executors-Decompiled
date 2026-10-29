/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1b15c4..0x1b16ac (232 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1b15c4_1 {
    unsigned int field_0;
    char padding_4[52];
    unsigned long long field_38;
    char padding_40[16];
    unsigned long long field_50;
} st_1b15c4_1;

typedef struct st_1b15c4_0 {
    char field_0;
} st_1b15c4_0;


void sub_1b15c4(void* a0, st_1b15c4_1 *a1)
{
    void* v4;  // x9
    unsigned long v5;  // cc_dep1
    unsigned long v14;  // cc_dep2
    unsigned long long v15;  // 4102
    unsigned long v16;  // 4110
    unsigned long long v17;  // 4102
    unsigned long v18;  // 4110
    unsigned long long v19;  // 4105
    unsigned long v20;  // 4110
    unsigned long long v21;  // 4105
    unsigned long long v22;  // 4110
    unsigned long long v23;  // 4102
    unsigned long long v6;  // 4160
    unsigned long long v24;  // 4110
    unsigned long long v25;  // 4102
    unsigned long v7;  // x8
    unsigned long v8;  // x10
    unsigned long v9;  // x12
    unsigned int v10;  // w11
    unsigned long v11;  // 4110
    unsigned long v12;  // cc_op
    unsigned long v13;  // cc_dep1
    st_1b15c4_0 **v0;  // [bp-0x20], Other Possible Types: char
    st_1b15c4_0 *v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = a1->field_38 + (int)a0[40] * 16;
    v5 = a1->field_0;
    v6 = arm64g_calculate_condition(0x11, a1->field_0, 991, 0);
    if (!(v6 & 1))
    {
        v7 = *(long long *)v4 + 1;
        *(unsigned long *)v4 = v7;
        v8 = (long long)a0[24];
        v9 = (long long)a0[32];
        v10 = v9 > v7;
        if (v7 < v9)
        {
            v11 = arm64g_calculate_condition(49, v5, 991, 0);
            v12 = 4;
            v13 = (v11 & 1 ? v7 : 0);
            v14 = (v11 & 1 ? v8 : 0);
            v15 = arm64g_calculate_condition(52, v13, v14, 0);
            if (!(v15 & 1))
                goto LABEL_1b1618;
        }
        else
        {
            v16 = arm64g_calculate_condition(49, v5, 991, 0);
            v12 = 0;
            v13 = (v16 & 1 ? v7 : 0);
            v14 = (v16 & 1 ? v8 : 0);
            v17 = arm64g_calculate_condition(48, v13, v14, 0);
            if (!(v17 & 1))
            {
LABEL_1b1618:
                if (v7 < v9)
                {
                    v18 = arm64g_calculate_condition(v12 | 48, v13, v14, 0);
                    v12 = 4;
                    v13 = (v18 & 1 ? (long long)v4[8] : 0x40000000);
                    v14 = (v18 & 1 ? *(long long *)&a1->padding_4[12] : 0);
                    v19 = arm64g_calculate_condition(4, v13, v14, 0);
                    v10 = !(v19 & 1);
                }
                else
                {
                    v20 = arm64g_calculate_condition(v12 | 48, v13, v14, 0);
                    v12 = 0;
                    v13 = (v20 & 1 ? (long long)v4[8] : 0x40000000);
                    v14 = (v20 & 1 ? *(long long *)&a1->padding_4[12] : 0);
                    v21 = arm64g_calculate_condition(0, v13, v14, 0);
                    v10 = !(v21 & 1);
                }
            }
        }
        if (v10)
        {
            v22 = arm64g_calculate_condition(v12 | 16, v13, v14, 0);
            v23 = arm64g_calculate_condition(36, (v22 & 1 ? v7 : 0), (v22 & 1 ? v8 : 0), 0);
            if (!(v23 & 1))
                goto LABEL_1b1638;
        }
        else
        {
            v24 = arm64g_calculate_condition(v12 | 16, v13, v14, 0);
            v25 = arm64g_calculate_condition(32, (v24 & 1 ? v7 : 0), (v24 & 1 ? v8 : 0), 0);
            if (!(v25 & 1))
            {
LABEL_1b1638:
                a1->field_0 = 0xfffffc1e;
                if (!v10)
                {
                    a1->field_50 = (long long)a0[16];
                    return;
                }
                a1->field_50 = (long long)a0[8];
                sub_1be72c();
                return;
            }
        }
    }
    else
    {
        *(unsigned long long *)v4 = 0;
        if (!(long long)a0[32])
        {
            a1->field_0 = 0xfffffc1e;
            a1->field_50 = (long long)a0[16];
            return;
        }
        else if ((long long)a0[24])
        {
            a1->field_0 = 0xfffffc1e;
            a1->field_50 = (long long)a0[8];
            sub_1be72c();
            return;
        }
    }
    a1->field_0 = 0xfffffc20;
    return;
}
