/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9b109c..0x9b11bc (288 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9b109c_0 {
    unsigned int field_0;
    char field_4;
    char padding_5[3];
    unsigned long long field_8;
} st_9b109c_0;

typedef struct st_9b109c_2 {
    char padding_0[216];
    struct st_9b109c_1 *field_d8;
} st_9b109c_2;

typedef struct st_9b109c_4 {
    char padding_0[24];
    struct st_9b109c_2 *field_18;
    char padding_20[2144];
    struct st_9b109c_3 *field_880;
    char padding_888[296];
    unsigned long long field_9b0;
} st_9b109c_4;

typedef struct st_9b109c_3 {
    char padding_0[30];
    char field_1e;
} st_9b109c_3;

typedef struct st_9b109c_1 {
    char padding_0[80];
    char field_50;
} st_9b109c_1;


unsigned long long sub_9b109c(st_9b109c_4 *a0, st_9b109c_0 *a1)
{
    unsigned long v2;  // x21
    unsigned long long v3;  // w8
    unsigned long v6;  // cc_dep2
    unsigned long v7;  // cc_ndep
    unsigned long long v8;  // 4112
    unsigned long long v9;  // 4102
    unsigned long v10;  // cc_op
    unsigned long v11;  // cc_dep1
    unsigned long long v12;  // w10
    unsigned long long v13;  // w8
    unsigned long long v14;  // w10
    unsigned long long v4;  // 4112
    unsigned long long v5;  // 4102
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a1->field_0;
    v3 = *(int *)&a0[1].padding_0[4];
    if (v3)
    {
        v4 = arm64g_calculate_condition(v10 | 16, v11, v6, v7);
        v5 = arm64g_calculate_condition(19, (v4 & 1 ? v2 & 0xffffffff : 0x40000000), (v4 & 1 ? v3 : 0), 0);
        if (v5 & 1)
            goto LABEL_9b1114;
    }
    else
    {
        v8 = arm64g_calculate_condition(v10 | 16, v11, v6, v7);
        v9 = arm64g_calculate_condition(16, (v8 & 1 ? v2 & 0xffffffff : 0x40000000), (v8 & 1 ? v3 : 0), 0);
        if (v9 & 1)
        {
LABEL_9b1114:
            if (a0->field_18->field_d8->field_50 >> 3 & 1)
            {
                if ((unsigned int)v2 == 0x100)
                    v12 = 0xff00;
                else
                    v12 = (unsigned int)v2;
                if (v3 == 0x100)
                    v3 = 0xff00;
                if (v12 > v3)
                    return 396;
            }
            else if (v3 > (int)v2)
            {
                return 396;
            }
        }
    }
    if (!sub_959e54(a0, 9, 0, v2, 0))
        return 396;
    v13 = *(int *)&a0[1].padding_0[8];
    if (v13 && (unsigned int)v2 != v13)
    {
        if (a0->field_18->field_d8->field_50 >> 3 & 1)
        {
            if ((unsigned int)v2 == 0x100)
                v14 = 0xff00;
            else
                v14 = (unsigned int)v2;
            if (v13 == 0x100)
                v13 = 0xff00;
            if (v14 <= v13)
                return 166;
        }
        else if ((int)v2 >= v13)
        {
            return 166;
        }
    }
    if (a1->field_8 & a0->field_9b0)
        return 258;
    if (!(a1->field_4 >> 1 & 1) || !(a0->field_880->field_1e & 3))
        return 0;
    return 158;
    return 0;
}
