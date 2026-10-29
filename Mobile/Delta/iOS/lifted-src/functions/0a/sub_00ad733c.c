/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xad733c..0xad74bc (384 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ad733c_0 {
    char padding_0[64];
    struct st_ad733c_1 *field_40;
    char padding_48[104];
    struct st_ad733c_1 *field_b0;
} st_ad733c_0;

typedef struct st_ad733c_2 {
    struct st_ad733c_0 *field_0;
    void* field_8;
    char padding_10[8];
    void* field_18;
    char padding_20[8];
    void* field_28;
    char padding_30[8];
    unsigned int field_38;
    char padding_3c[4];
    void* field_40;
} st_ad733c_2;

typedef struct st_ad733c_1 {
    unsigned long long field_0;
} st_ad733c_1;


void* sub_ad733c(st_ad733c_2 *a0)
{
    void* v2;  // x0
    void* v3;  // x22
    unsigned long v8;  // cc_op
    unsigned long v9;  // cc_dep1
    unsigned long v10;  // cc_dep2
    unsigned long v11;  // cc_ndep
    unsigned long long v12;  // 4112
    unsigned long long v13;  // 4102
    void* v4;  // w8
    unsigned int v5;  // w9
    unsigned long long v6;  // 4112
    unsigned long long v7;  // 4102
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    a0->field_38 = 1;
    while (1)
    {
        if (a0->field_40)
        {
            if (!sub_ad69e4(a0->field_40))
            {
                sub_ad6020(a0->field_40);
                a0->field_40 = 0;
                if (!a0->field_8)
                    a0->field_0->field_40();
                a0->field_0->field_b0();
            }
            else if (a0->field_40)
            {
                v2 = sub_ad68b8();
                if (a0->field_18 && v2)
                    a0->field_18();
                v3 = v2;
                sub_a76d80(a0 + 1);
                if (!v3)
                    return v3;
                v4 = (void*)(int)a0->field_28;
                if (!v4)
                    return v3;
                v5 = *(int *)v3;
                if (2 <= v5)
                {
                    v6 = arm64g_calculate_condition(v8 | 32, v9, v10, v11);
                    v7 = arm64g_calculate_condition(3, (v6 & 1 ? (unsigned long long)v4 : 0x40000000), (v6 & 1 ? v5 : 0), 0);
                    if (v7 & 1)
                        return v3;
                }
                else
                {
                    v12 = arm64g_calculate_condition(v8 | 32, v9, v10, v11);
                    v13 = arm64g_calculate_condition(0, (v12 & 1 ? (unsigned long long)v4 : 0x40000000), (v12 & 1 ? v5 : 0), 0);
                    if (v13 & 1)
                        return v3;
                }
                sub_ad753c();
            }
            else if (a0->field_8)
            {
                a0->field_0->field_b0();
            }
            else
            {
                a0->field_0->field_40();
            }
        }
        else
        {
            if (a0->field_8)
                a0->field_0->field_b0();
            a0->field_0->field_40();
        }
    }
}
