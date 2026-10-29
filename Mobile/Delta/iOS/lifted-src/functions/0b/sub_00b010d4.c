/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb010d4..0xb012e4 (528 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b010d4_0 {
    char padding_0[84];
    char field_54;
    char padding_55[163];
    char field_f8;
    char padding_f9[55];
    unsigned long long field_130;
    char field_138;
    char padding_139[295];
    unsigned long long field_260;
    char padding_268[8];
    unsigned int field_270;
    char padding_274[12];
    long long field_280;
    char padding_288[48];
    unsigned long long field_2b8;
} st_b010d4_0;

extern char g_9ba8c0;
extern char g_9bb300;
extern char g_a963b0;

char sub_b010d4(st_b010d4_0 *a0, unsigned long long a1, unsigned long a2, unsigned long long a3)
{
    unsigned long long v2;  // x4
    unsigned long v3;  // cc_dep1
    char v13;  // x9
    unsigned long v14;  // cc_dep1
    unsigned long long v15;  // 4110
    unsigned long long v16;  // 4102
    unsigned long long v17;  // 4110
    unsigned long long v18;  // 4102
    unsigned long v19;  // x20
    unsigned long long v4;  // 4110
    unsigned long long v22;  // x8
    char v24;  // x9
    unsigned long long v5;  // 4102
    unsigned long long v6;  // 4110
    unsigned long long v7;  // 4102
    unsigned long v8;  // x20
    unsigned long long v11;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0->field_2b8;
    if (!(a0->field_54 & 1))
    {
        if (v2)
        {
            v3 = a2;
            if (a2 >= 0x200)
            {
                if (v2 != &g_9ba8c0)
                {
                    v4 = arm64g_calculate_condition(20, v3, 0x200, 0);
                    v5 = arm64g_calculate_condition(20, (v4 & 1 ? v2 : 0x40000000), (v4 & 1 ? &g_9bb300 : 0), 0);
                    goto LABEL_b01134;
                }
                else
                {
                    v6 = arm64g_calculate_condition(20, v3, 0x200, 0);
                    v7 = arm64g_calculate_condition(16, (v6 & 1 ? &g_9ba8c0 : 0x40000000), (v6 & 1 ? &g_9bb300 : 0), 0);
                    if (v7 & 1 || a0->field_260 != &g_a963b0)
                        goto LABEL_b01134;
                    v8 = -a0->field_270 & 15;
                    if (!sub_a95348(&a0->field_f8))
                    {
                        v11 = sub_b00f38(a1 + v8, a3 + v8, a2 - v8, a0->field_280, &a0->field_f8, &a0->field_138);
                        a0->field_130 = a0->field_130 + v11;
                        v13 = v11 + v8;
LABEL_b01138:
                        if (!sub_a959d4(&a0->field_f8, a1 + v13, a3 + v13, a2 - v13))
                            return 1;
                    }
                }
            }
            else
            {
LABEL_b01134:
                v13 = 0;
                goto LABEL_b01138;
            }
        }
        else if (!sub_a95348(&a0->field_f8))
        {
            return 1;
        }
    }
    else
    {
        if (v2)
        {
            v14 = a2;
            if (a2 >= 0x200)
            {
                if (v2 != &g_9ba8c0)
                {
                    v15 = arm64g_calculate_condition(20, v14, 0x200, 0);
                    v16 = arm64g_calculate_condition(20, (v15 & 1 ? v2 : 0x40000000), (v15 & 1 ? &g_9bb300 : 0), 0);
                    goto LABEL_b01194;
                }
                else
                {
                    v17 = arm64g_calculate_condition(20, v14, 0x200, 0);
                    v18 = arm64g_calculate_condition(16, (v17 & 1 ? &g_9ba8c0 : 0x40000000), (v17 & 1 ? &g_9bb300 : 0), 0);
                    if (v18 & 1 || a0->field_260 != &g_a963b0)
                        goto LABEL_b01194;
                    v19 = -a0->field_270 & 15;
                    if (!sub_a94fe8(&a0->field_f8))
                    {
                        v22 = sub_b00e44(a1 + v19, a3 + v19, a2 - v19, a0->field_280, &a0->field_f8, &a0->field_138);
                        a0->field_130 = a0->field_130 + v22;
                        v24 = v22 + v19;
LABEL_b01198:
                        if (!sub_a956a0(&a0->field_f8, a1 + v24, a3 + v24, a2 - v24))
                            return 1;
                    }
                }
            }
            else
            {
LABEL_b01194:
                v24 = 0;
                goto LABEL_b01198;
            }
        }
        else if (!sub_a94fe8(&a0->field_f8))
        {
            return 1;
        }
    }
    return 0;
}
